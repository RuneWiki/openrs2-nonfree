import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VDWALSCV")
public final class Class40 {

	@OriginalMember(owner = "client!VDWALSCV", name = "c", descriptor = "I")
	private static int anInt730;

	@OriginalMember(owner = "client!VDWALSCV", name = "d", descriptor = "[Lclient!VDWALSCV;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!VDWALSCV", name = "e", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!VDWALSCV", name = "f", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!VDWALSCV", name = "j", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!VDWALSCV", name = "k", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!VDWALSCV", name = "l", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!VDWALSCV", name = "m", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!VDWALSCV", name = "n", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!VDWALSCV", name = "o", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!VDWALSCV", name = "b", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!VDWALSCV", name = "g", descriptor = "I")
	public int anInt732 = -1;

	@OriginalMember(owner = "client!VDWALSCV", name = "h", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!VDWALSCV", name = "i", descriptor = "Z")
	public boolean aBoolean205 = true;

	@OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(Lclient!SMIVAFST;I)V")
	public static void method504(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method485("flo.dat", null), (byte) 3);
			anInt730 = local8.method96();
			if (aClass40Array1 == null) {
				aClass40Array1 = new Class40[anInt730];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt730; local22++) {
				if (aClass40Array1[local22] == null) {
					aClass40Array1[local22] = new Class40();
				}
				aClass40Array1[local22].method505(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("44899, " + arg0 + ", " + -29636 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDWALSCV", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	private void method505(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(18) int local18 = arg0.method94();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					this.anInt731 = arg0.method98();
					this.method506(this.anInt731, this.anInt729);
				} else if (local18 == 2) {
					this.anInt732 = arg0.method94();
				} else if (local18 == 3) {
					this.aBoolean204 = true;
				} else if (local18 == 5) {
					this.aBoolean205 = false;
				} else if (local18 == 6) {
					this.aString14 = arg0.method101();
				} else if (local18 == 7) {
					@Pc(76) int local76 = this.anInt733;
					@Pc(79) int local79 = this.anInt734;
					@Pc(82) int local82 = this.anInt735;
					@Pc(85) int local85 = this.anInt736;
					@Pc(88) int local88 = arg0.method98();
					this.method506(local88, this.anInt729);
					this.anInt733 = local76;
					this.anInt734 = local79;
					this.anInt735 = local82;
					this.anInt736 = local85;
					this.anInt737 = local85;
				} else {
					System.out.println("Error unrecognised config code: " + local18);
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("54092, " + 7 + ", " + arg0 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(II)V")
	private void method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			if (arg1 != 0) {
				this.anInt729 = 221;
			}
			@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(38) double local38 = local15;
			if (local24 < local15) {
				local38 = local24;
			}
			if (local36 < local38) {
				local38 = local36;
			}
			@Pc(52) double local52 = local15;
			if (local24 > local15) {
				local52 = local24;
			}
			if (local36 > local52) {
				local52 = local36;
			}
			@Pc(66) double local66 = 0.0D;
			@Pc(68) double local68 = 0.0D;
			@Pc(74) double local74 = (local38 + local52) / 2.0D;
			if (local38 != local52) {
				if (local74 < 0.5D) {
					local68 = (local52 - local38) / (local52 + local38);
				}
				if (local74 >= 0.5D) {
					local68 = (local52 - local38) / (2.0D - local52 - local38);
				}
				if (local15 == local52) {
					local66 = (local24 - local36) / (local52 - local38);
				} else if (local24 == local52) {
					local66 = (local36 - local15) / (local52 - local38) + 2.0D;
				} else if (local36 == local52) {
					local66 = (local15 - local24) / (local52 - local38) + 4.0D;
				}
			}
			local66 /= 6.0D;
			this.anInt733 = (int) (local66 * 256.0D);
			this.anInt734 = (int) (local68 * 256.0D);
			this.anInt735 = (int) (local74 * 256.0D);
			if (this.anInt734 < 0) {
				this.anInt734 = 0;
			} else if (this.anInt734 > 255) {
				this.anInt734 = 255;
			}
			if (this.anInt735 < 0) {
				this.anInt735 = 0;
			} else if (this.anInt735 > 255) {
				this.anInt735 = 255;
			}
			if (local74 > 0.5D) {
				this.anInt737 = (int) ((1.0D - local74) * local68 * 512.0D);
			} else {
				this.anInt737 = (int) (local74 * local68 * 512.0D);
			}
			if (this.anInt737 < 1) {
				this.anInt737 = 1;
			}
			this.anInt736 = (int) (local66 * (double) this.anInt737);
			@Pc(249) int local249 = this.anInt733 + (int) (Math.random() * 16.0D) - 8;
			if (local249 < 0) {
				local249 = 0;
			} else if (local249 > 255) {
				local249 = 255;
			}
			@Pc(270) int local270 = this.anInt734 + (int) (Math.random() * 48.0D) - 24;
			if (local270 < 0) {
				local270 = 0;
			} else if (local270 > 255) {
				local270 = 255;
			}
			@Pc(291) int local291 = this.anInt735 + (int) (Math.random() * 48.0D) - 24;
			if (local291 < 0) {
				local291 = 0;
			} else if (local291 > 255) {
				local291 = 255;
			}
			this.anInt738 = this.method507(local249, local270, local291);
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("31924, " + arg0 + ", " + arg1 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDWALSCV", name = "a", descriptor = "(III)I")
	private int method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
