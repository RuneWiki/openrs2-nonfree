import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GJDLZXKK")
public final class Class14 {

	@OriginalMember(owner = "client!GJDLZXKK", name = "b", descriptor = "I")
	private static int anInt292;

	@OriginalMember(owner = "client!GJDLZXKK", name = "c", descriptor = "[Lclient!GJDLZXKK;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!GJDLZXKK", name = "d", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!GJDLZXKK", name = "e", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!GJDLZXKK", name = "i", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!GJDLZXKK", name = "j", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!GJDLZXKK", name = "k", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!GJDLZXKK", name = "l", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!GJDLZXKK", name = "m", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!GJDLZXKK", name = "n", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!GJDLZXKK", name = "f", descriptor = "I")
	public int anInt294 = -1;

	@OriginalMember(owner = "client!GJDLZXKK", name = "g", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!GJDLZXKK", name = "h", descriptor = "Z")
	public boolean aBoolean76 = true;

	@OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(ZLclient!VSQMPWOM;)V")
	public static void method209(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method489("flo.dat", null), -990);
			anInt292 = local8.method81();
			if (aClass14Array1 == null) {
				aClass14Array1 = new Class14[anInt292];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt292; local18++) {
				if (aClass14Array1[local18] == null) {
					aClass14Array1[local18] = new Class14();
				}
				aClass14Array1[local18].method210(local8);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("77064, " + true + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJDLZXKK", name = "<init>", descriptor = "()V")
	private Class14() {
	}

	@OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	private void method210(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method79();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt293 = arg0.method83();
					this.method211(this.anInt293);
				} else if (local15 == 2) {
					this.anInt294 = arg0.method79();
				} else if (local15 == 3) {
					this.aBoolean75 = true;
				} else if (local15 == 5) {
					this.aBoolean76 = false;
				} else if (local15 == 6) {
					this.aString9 = arg0.method86();
				} else if (local15 == 7) {
					@Pc(72) int local72 = this.anInt295;
					@Pc(75) int local75 = this.anInt296;
					@Pc(78) int local78 = this.anInt297;
					@Pc(81) int local81 = this.anInt298;
					@Pc(84) int local84 = arg0.method83();
					this.method211(local84);
					this.anInt295 = local72;
					this.anInt296 = local75;
					this.anInt297 = local78;
					this.anInt298 = local81;
					this.anInt299 = local81;
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("28442, " + -11 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(ZI)V")
	private void method211(@OriginalArg(1) int arg0) {
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
			@Pc(61) double local61 = 0.0D;
			@Pc(63) double local63 = 0.0D;
			@Pc(69) double local69 = (local33 + local47) / 2.0D;
			if (local33 != local47) {
				if (local69 < 0.5D) {
					local63 = (local47 - local33) / (local47 + local33);
				}
				if (local69 >= 0.5D) {
					local63 = (local47 - local33) / (2.0D - local47 - local33);
				}
				if (local15 == local47) {
					local61 = (local24 - local31) / (local47 - local33);
				} else if (local24 == local47) {
					local61 = (local31 - local15) / (local47 - local33) + 2.0D;
				} else if (local31 == local47) {
					local61 = (local15 - local24) / (local47 - local33) + 4.0D;
				}
			}
			local61 /= 6.0D;
			this.anInt295 = (int) (local61 * 256.0D);
			this.anInt296 = (int) (local63 * 256.0D);
			this.anInt297 = (int) (local69 * 256.0D);
			if (this.anInt296 < 0) {
				this.anInt296 = 0;
			} else if (this.anInt296 > 255) {
				this.anInt296 = 255;
			}
			if (this.anInt297 < 0) {
				this.anInt297 = 0;
			} else if (this.anInt297 > 255) {
				this.anInt297 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt299 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt299 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt299 < 1) {
				this.anInt299 = 1;
			}
			this.anInt298 = (int) (local61 * (double) this.anInt299);
			@Pc(247) int local247 = this.anInt295 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt296 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt297 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt300 = this.method212(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("29874, " + false + ", " + arg0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJDLZXKK", name = "a", descriptor = "(III)I")
	private int method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
