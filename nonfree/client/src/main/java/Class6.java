import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EPJTEXKD")
public final class Class6 {

	@OriginalMember(owner = "client!EPJTEXKD", name = "b", descriptor = "I")
	private static int anInt70;

	@OriginalMember(owner = "client!EPJTEXKD", name = "c", descriptor = "[Lclient!EPJTEXKD;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "Z")
	private static boolean aBoolean17 = true;

	@OriginalMember(owner = "client!EPJTEXKD", name = "d", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!EPJTEXKD", name = "e", descriptor = "I")
	public int anInt71;

	@OriginalMember(owner = "client!EPJTEXKD", name = "i", descriptor = "I")
	public int anInt73;

	@OriginalMember(owner = "client!EPJTEXKD", name = "j", descriptor = "I")
	public int anInt74;

	@OriginalMember(owner = "client!EPJTEXKD", name = "k", descriptor = "I")
	public int anInt75;

	@OriginalMember(owner = "client!EPJTEXKD", name = "l", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!EPJTEXKD", name = "m", descriptor = "I")
	public int anInt77;

	@OriginalMember(owner = "client!EPJTEXKD", name = "n", descriptor = "I")
	public int anInt78;

	@OriginalMember(owner = "client!EPJTEXKD", name = "f", descriptor = "I")
	public int anInt72 = -1;

	@OriginalMember(owner = "client!EPJTEXKD", name = "g", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!EPJTEXKD", name = "h", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(Lclient!WEMOPWVJ;I)V")
	public static void method36(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(arg0.method515("flo.dat", null), true);
			anInt70 = local8.method407();
			if (aClass6Array1 == null) {
				aClass6Array1 = new Class6[anInt70];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt70; local27++) {
				if (aClass6Array1[local27] == null) {
					aClass6Array1[local27] = new Class6();
				}
				aClass6Array1[local27].method37(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("2100, " + arg0 + ", " + 24414 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPJTEXKD", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	private void method37(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method405();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt71 = arg0.method409();
					this.method38(this.anInt71);
				} else if (local11 == 2) {
					this.anInt72 = arg0.method405();
				} else if (local11 == 3) {
					this.aBoolean18 = true;
				} else if (local11 == 5) {
					this.aBoolean19 = false;
				} else if (local11 == 6) {
					this.aString1 = arg0.method412();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt73;
					@Pc(71) int local71 = this.anInt74;
					@Pc(74) int local74 = this.anInt75;
					@Pc(77) int local77 = this.anInt76;
					@Pc(80) int local80 = arg0.method409();
					this.method38(local80);
					this.anInt73 = local68;
					this.anInt74 = local71;
					this.anInt75 = local74;
					this.anInt76 = local77;
					this.anInt77 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("84356, " + -13096 + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(II)V")
	private void method38(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(31) double local31 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(33) double local33 = local15;
			if (local24 < local15) {
				local33 = local24;
			}
			if (local31 < local33) {
				local33 = local31;
			}
			@Pc(47) double local47 = local15;
			if (local24 > local15) {
				local47 = local24;
			}
			if (local31 > local47) {
				local47 = local31;
			}
			@Pc(70) double local70 = 0.0D;
			@Pc(72) double local72 = 0.0D;
			@Pc(78) double local78 = (local33 + local47) / 2.0D;
			if (local33 != local47) {
				if (local78 < 0.5D) {
					local72 = (local47 - local33) / (local47 + local33);
				}
				if (local78 >= 0.5D) {
					local72 = (local47 - local33) / (2.0D - local47 - local33);
				}
				if (local15 == local47) {
					local70 = (local24 - local31) / (local47 - local33);
				} else if (local24 == local47) {
					local70 = (local31 - local15) / (local47 - local33) + 2.0D;
				} else if (local31 == local47) {
					local70 = (local15 - local24) / (local47 - local33) + 4.0D;
				}
			}
			local70 /= 6.0D;
			this.anInt73 = (int) (local70 * 256.0D);
			this.anInt74 = (int) (local72 * 256.0D);
			this.anInt75 = (int) (local78 * 256.0D);
			if (this.anInt74 < 0) {
				this.anInt74 = 0;
			} else if (this.anInt74 > 255) {
				this.anInt74 = 255;
			}
			if (this.anInt75 < 0) {
				this.anInt75 = 0;
			} else if (this.anInt75 > 255) {
				this.anInt75 = 255;
			}
			if (local78 > 0.5D) {
				this.anInt77 = (int) ((1.0D - local78) * local72 * 512.0D);
			} else {
				this.anInt77 = (int) (local78 * local72 * 512.0D);
			}
			if (this.anInt77 < 1) {
				this.anInt77 = 1;
			}
			this.anInt76 = (int) (local70 * (double) this.anInt77);
			@Pc(253) int local253 = this.anInt73 + (int) (Math.random() * 16.0D) - 8;
			if (local253 < 0) {
				local253 = 0;
			} else if (local253 > 255) {
				local253 = 255;
			}
			@Pc(274) int local274 = this.anInt74 + (int) (Math.random() * 48.0D) - 24;
			if (local274 < 0) {
				local274 = 0;
			} else if (local274 > 255) {
				local274 = 255;
			}
			@Pc(295) int local295 = this.anInt75 + (int) (Math.random() * 48.0D) - 24;
			if (local295 < 0) {
				local295 = 0;
			} else if (local295 > 255) {
				local295 = 255;
			}
			this.anInt78 = this.method39(local253, local274, local295);
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("18687, " + arg0 + ", " + -2629 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPJTEXKD", name = "a", descriptor = "(III)I")
	private int method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
