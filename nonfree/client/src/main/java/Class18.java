import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KJOXMCRE")
public final class Class18 {

	@OriginalMember(owner = "client!KJOXMCRE", name = "b", descriptor = "I")
	private static int anInt382;

	@OriginalMember(owner = "client!KJOXMCRE", name = "c", descriptor = "[Lclient!KJOXMCRE;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!KJOXMCRE", name = "d", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!KJOXMCRE", name = "e", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!KJOXMCRE", name = "i", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!KJOXMCRE", name = "j", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!KJOXMCRE", name = "k", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!KJOXMCRE", name = "l", descriptor = "I")
	public int anInt388;

	@OriginalMember(owner = "client!KJOXMCRE", name = "m", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!KJOXMCRE", name = "n", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!KJOXMCRE", name = "a", descriptor = "I")
	private int anInt381 = -293;

	@OriginalMember(owner = "client!KJOXMCRE", name = "f", descriptor = "I")
	public int anInt384 = -1;

	@OriginalMember(owner = "client!KJOXMCRE", name = "g", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!KJOXMCRE", name = "h", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!KJOXMCRE", name = "a", descriptor = "(Lclient!MNPBQFWE;B)V")
	public static void method266(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub2 local8 = new Class1_Sub1_Sub2(false, arg0.method340("flo.dat", null));
			anInt382 = local8.method24();
			if (aClass18Array1 == null) {
				aClass18Array1 = new Class18[anInt382];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt382; local18++) {
				if (aClass18Array1[local18] == null) {
					aClass18Array1[local18] = new Class18();
				}
				aClass18Array1[local18].method267(local8);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("17547, " + arg0 + ", " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJOXMCRE", name = "<init>", descriptor = "()V")
	private Class18() {
	}

	@OriginalMember(owner = "client!KJOXMCRE", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	private void method267(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method22();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt383 = arg0.method26();
					this.method268(this.anInt383);
				} else if (local9 == 2) {
					this.anInt384 = arg0.method22();
				} else if (local9 == 3) {
					this.aBoolean93 = true;
				} else if (local9 == 5) {
					this.aBoolean94 = false;
				} else if (local9 == 6) {
					this.aString11 = arg0.method29();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("51955, " + 674 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJOXMCRE", name = "a", descriptor = "(IZ)V")
	private void method268(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(28) double local28 = local10;
			if (local19 < local10) {
				local28 = local19;
			}
			if (local26 < local28) {
				local28 = local26;
			}
			@Pc(42) double local42 = local10;
			if (local19 > local10) {
				local42 = local19;
			}
			if (local26 > local42) {
				local42 = local26;
			}
			@Pc(56) double local56 = 0.0D;
			@Pc(58) double local58 = 0.0D;
			@Pc(64) double local64 = (local28 + local42) / 2.0D;
			if (local28 != local42) {
				if (local64 < 0.5D) {
					local58 = (local42 - local28) / (local42 + local28);
				}
				if (local64 >= 0.5D) {
					local58 = (local42 - local28) / (2.0D - local42 - local28);
				}
				if (local10 == local42) {
					local56 = (local19 - local26) / (local42 - local28);
				} else if (local19 == local42) {
					local56 = (local26 - local10) / (local42 - local28) + 2.0D;
				} else if (local26 == local42) {
					local56 = (local10 - local19) / (local42 - local28) + 4.0D;
				}
			}
			local56 /= 6.0D;
			this.anInt385 = (int) (local56 * 256.0D);
			this.anInt386 = (int) (local58 * 256.0D);
			this.anInt387 = (int) (local64 * 256.0D);
			if (this.anInt386 < 0) {
				this.anInt386 = 0;
			} else if (this.anInt386 > 255) {
				this.anInt386 = 255;
			}
			if (this.anInt387 < 0) {
				this.anInt387 = 0;
			} else if (this.anInt387 > 255) {
				this.anInt387 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt389 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt389 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt389 < 1) {
				this.anInt389 = 1;
			}
			this.anInt388 = (int) (local56 * (double) this.anInt389);
			@Pc(248) int local248 = this.anInt385 + (int) (Math.random() * 16.0D) - 8;
			if (local248 < 0) {
				local248 = 0;
			} else if (local248 > 255) {
				local248 = 255;
			}
			@Pc(269) int local269 = this.anInt386 + (int) (Math.random() * 48.0D) - 24;
			if (local269 < 0) {
				local269 = 0;
			} else if (local269 > 255) {
				local269 = 255;
			}
			@Pc(290) int local290 = this.anInt387 + (int) (Math.random() * 48.0D) - 24;
			if (local290 < 0) {
				local290 = 0;
			} else if (local290 > 255) {
				local290 = 255;
			}
			this.anInt390 = this.method269(local248, local269, local290);
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("1160, " + arg0 + ", " + true + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJOXMCRE", name = "a", descriptor = "(III)I")
	private int method269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
