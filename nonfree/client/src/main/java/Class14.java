import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HNBDHXHI")
public final class Class14 {

	@OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "I")
	private static int anInt399;

	@OriginalMember(owner = "client!HNBDHXHI", name = "b", descriptor = "[Lclient!HNBDHXHI;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!HNBDHXHI", name = "c", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!HNBDHXHI", name = "d", descriptor = "I")
	public int anInt400;

	@OriginalMember(owner = "client!HNBDHXHI", name = "h", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!HNBDHXHI", name = "i", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!HNBDHXHI", name = "j", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!HNBDHXHI", name = "k", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!HNBDHXHI", name = "l", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!HNBDHXHI", name = "m", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!HNBDHXHI", name = "e", descriptor = "I")
	public int anInt401 = -1;

	@OriginalMember(owner = "client!HNBDHXHI", name = "f", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!HNBDHXHI", name = "g", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(Lclient!HBJEXSJX;Z)V")
	public static void method279(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0.method278("flo.dat", null), 0);
			anInt399 = local11.method157();
			if (aClass14Array1 == null) {
				aClass14Array1 = new Class14[anInt399];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt399; local21++) {
				if (aClass14Array1[local21] == null) {
					aClass14Array1[local21] = new Class14();
				}
				aClass14Array1[local21].method280(local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("42299, " + arg0 + ", " + true + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNBDHXHI", name = "<init>", descriptor = "()V")
	private Class14() {
	}

	@OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	private void method280(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method155();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt400 = arg0.method159();
					this.method281(this.anInt400);
				} else if (local11 == 2) {
					this.anInt401 = arg0.method155();
				} else if (local11 == 3) {
					this.aBoolean72 = true;
				} else if (local11 == 5) {
					this.aBoolean73 = false;
				} else if (local11 == 6) {
					this.aString5 = arg0.method162();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt402;
					@Pc(71) int local71 = this.anInt403;
					@Pc(74) int local74 = this.anInt404;
					@Pc(77) int local77 = this.anInt405;
					@Pc(80) int local80 = arg0.method159();
					this.method281(local80);
					this.anInt402 = local68;
					this.anInt403 = local71;
					this.anInt404 = local74;
					this.anInt405 = local77;
					this.anInt406 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("81859, " + 5 + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(ZI)V")
	private void method281(@OriginalArg(1) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(34) double local34 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(36) double local36 = local15;
			if (local27 < local15) {
				local36 = local27;
			}
			if (local34 < local36) {
				local36 = local34;
			}
			@Pc(50) double local50 = local15;
			if (local27 > local15) {
				local50 = local27;
			}
			if (local34 > local50) {
				local50 = local34;
			}
			@Pc(64) double local64 = 0.0D;
			@Pc(66) double local66 = 0.0D;
			@Pc(72) double local72 = (local36 + local50) / 2.0D;
			if (local36 != local50) {
				if (local72 < 0.5D) {
					local66 = (local50 - local36) / (local50 + local36);
				}
				if (local72 >= 0.5D) {
					local66 = (local50 - local36) / (2.0D - local50 - local36);
				}
				if (local15 == local50) {
					local64 = (local27 - local34) / (local50 - local36);
				} else if (local27 == local50) {
					local64 = (local34 - local15) / (local50 - local36) + 2.0D;
				} else if (local34 == local50) {
					local64 = (local15 - local27) / (local50 - local36) + 4.0D;
				}
			}
			local64 /= 6.0D;
			this.anInt402 = (int) (local64 * 256.0D);
			this.anInt403 = (int) (local66 * 256.0D);
			this.anInt404 = (int) (local72 * 256.0D);
			if (this.anInt403 < 0) {
				this.anInt403 = 0;
			} else if (this.anInt403 > 255) {
				this.anInt403 = 255;
			}
			if (this.anInt404 < 0) {
				this.anInt404 = 0;
			} else if (this.anInt404 > 255) {
				this.anInt404 = 255;
			}
			if (local72 > 0.5D) {
				this.anInt406 = (int) ((1.0D - local72) * local66 * 512.0D);
			} else {
				this.anInt406 = (int) (local72 * local66 * 512.0D);
			}
			if (this.anInt406 < 1) {
				this.anInt406 = 1;
			}
			this.anInt405 = (int) (local64 * (double) this.anInt406);
			@Pc(247) int local247 = this.anInt402 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt403 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt404 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt407 = this.method282(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("18488, " + true + ", " + arg0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNBDHXHI", name = "a", descriptor = "(III)I")
	private int method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
