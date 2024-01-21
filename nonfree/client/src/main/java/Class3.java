import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AKWMUTZI")
public final class Class3 {

	@OriginalMember(owner = "client!AKWMUTZI", name = "b", descriptor = "I")
	private static int anInt31;

	@OriginalMember(owner = "client!AKWMUTZI", name = "c", descriptor = "[Lclient!AKWMUTZI;")
	public static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "I")
	private static int anInt30 = 558;

	@OriginalMember(owner = "client!AKWMUTZI", name = "d", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!AKWMUTZI", name = "e", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!AKWMUTZI", name = "i", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!AKWMUTZI", name = "j", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!AKWMUTZI", name = "k", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!AKWMUTZI", name = "l", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!AKWMUTZI", name = "m", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!AKWMUTZI", name = "n", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!AKWMUTZI", name = "f", descriptor = "I")
	public int anInt33 = -1;

	@OriginalMember(owner = "client!AKWMUTZI", name = "g", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!AKWMUTZI", name = "h", descriptor = "Z")
	public boolean aBoolean9 = true;

	@OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(Lclient!FUZJMGZB;I)V")
	public static void method13(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("flo.dat", null));
			anInt31 = local8.method269();
			if (aClass3Array1 == null) {
				aClass3Array1 = new Class3[anInt31];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt31; local26++) {
				if (aClass3Array1[local26] == null) {
					aClass3Array1[local26] = new Class3();
				}
				aClass3Array1[local26].method14(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("47487, " + arg0 + ", " + 5 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKWMUTZI", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	private void method14(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method267();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt32 = arg0.method271();
					this.method15(this.anInt32);
				} else if (local11 == 2) {
					this.anInt33 = arg0.method267();
				} else if (local11 == 3) {
					this.aBoolean8 = true;
				} else if (local11 == 5) {
					this.aBoolean9 = false;
				} else if (local11 == 6) {
					this.aString1 = arg0.method274();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt34;
					@Pc(71) int local71 = this.anInt35;
					@Pc(74) int local74 = this.anInt36;
					@Pc(77) int local77 = this.anInt37;
					@Pc(80) int local80 = arg0.method271();
					this.method15(local80);
					this.anInt34 = local68;
					this.anInt35 = local71;
					this.anInt36 = local74;
					this.anInt37 = local77;
					this.anInt38 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("80414, " + arg0 + ", " + 59 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(II)V")
	private void method15(@OriginalArg(1) int arg0) {
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
			@Pc(71) double local71 = 0.0D;
			@Pc(73) double local73 = 0.0D;
			@Pc(79) double local79 = (local33 + local47) / 2.0D;
			if (local33 != local47) {
				if (local79 < 0.5D) {
					local73 = (local47 - local33) / (local47 + local33);
				}
				if (local79 >= 0.5D) {
					local73 = (local47 - local33) / (2.0D - local47 - local33);
				}
				if (local15 == local47) {
					local71 = (local24 - local31) / (local47 - local33);
				} else if (local24 == local47) {
					local71 = (local31 - local15) / (local47 - local33) + 2.0D;
				} else if (local31 == local47) {
					local71 = (local15 - local24) / (local47 - local33) + 4.0D;
				}
			}
			local71 /= 6.0D;
			this.anInt34 = (int) (local71 * 256.0D);
			this.anInt35 = (int) (local73 * 256.0D);
			this.anInt36 = (int) (local79 * 256.0D);
			if (this.anInt35 < 0) {
				this.anInt35 = 0;
			} else if (this.anInt35 > 255) {
				this.anInt35 = 255;
			}
			if (this.anInt36 < 0) {
				this.anInt36 = 0;
			} else if (this.anInt36 > 255) {
				this.anInt36 = 255;
			}
			if (local79 > 0.5D) {
				this.anInt38 = (int) ((1.0D - local79) * local73 * 512.0D);
			} else {
				this.anInt38 = (int) (local79 * local73 * 512.0D);
			}
			if (this.anInt38 < 1) {
				this.anInt38 = 1;
			}
			this.anInt37 = (int) (local71 * (double) this.anInt38);
			@Pc(254) int local254 = this.anInt34 + (int) (Math.random() * 16.0D) - 8;
			if (local254 < 0) {
				local254 = 0;
			} else if (local254 > 255) {
				local254 = 255;
			}
			@Pc(275) int local275 = this.anInt35 + (int) (Math.random() * 48.0D) - 24;
			if (local275 < 0) {
				local275 = 0;
			} else if (local275 > 255) {
				local275 = 255;
			}
			@Pc(296) int local296 = this.anInt36 + (int) (Math.random() * 48.0D) - 24;
			if (local296 < 0) {
				local296 = 0;
			} else if (local296 > 255) {
				local296 = 255;
			}
			this.anInt39 = this.method16(local254, local275, local296);
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("94115, " + 27771 + ", " + arg0 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKWMUTZI", name = "a", descriptor = "(III)I")
	private int method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
