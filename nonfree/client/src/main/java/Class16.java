import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FZFOSJCE")
public final class Class16 {

	@OriginalMember(owner = "client!FZFOSJCE", name = "d", descriptor = "I")
	private static int anInt164;

	@OriginalMember(owner = "client!FZFOSJCE", name = "e", descriptor = "[Lclient!FZFOSJCE;")
	public static Class16[] aClass16Array1;

	@OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "B")
	private static byte aByte11 = 6;

	@OriginalMember(owner = "client!FZFOSJCE", name = "b", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!FZFOSJCE", name = "f", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!FZFOSJCE", name = "g", descriptor = "I")
	public int anInt165;

	@OriginalMember(owner = "client!FZFOSJCE", name = "k", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!FZFOSJCE", name = "l", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!FZFOSJCE", name = "m", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!FZFOSJCE", name = "n", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!FZFOSJCE", name = "o", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!FZFOSJCE", name = "p", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!FZFOSJCE", name = "c", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!FZFOSJCE", name = "h", descriptor = "I")
	public int anInt166 = -1;

	@OriginalMember(owner = "client!FZFOSJCE", name = "i", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!FZFOSJCE", name = "j", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(Lclient!ATJMVOZR;I)V")
	public static void method99(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(12) Class10_Sub1_Sub3 local12 = new Class10_Sub1_Sub3(true, arg0.method2("flo.dat", null));
			anInt164 = local12.method313();
			if (aClass16Array1 == null) {
				aClass16Array1 = new Class16[anInt164];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt164; local22++) {
				if (aClass16Array1[local22] == null) {
					aClass16Array1[local22] = new Class16();
				}
				aClass16Array1[local22].method100(aByte11, local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("59130, " + arg0 + ", " + 36135 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FZFOSJCE", name = "<init>", descriptor = "()V")
	private Class16() {
	}

	@OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(BLclient!MFMVIYHT;)V")
	private void method100(@OriginalArg(0) byte arg0, @OriginalArg(1) Class10_Sub1_Sub3 arg1) {
		try {
			@Pc(10) int local10;
			if (arg0 == 6) {
				@Pc(6) boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			while (true) {
				local10 = arg1.method311();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt165 = arg1.method315();
					this.method101(this.anInt165);
				} else if (local10 == 2) {
					this.anInt166 = arg1.method311();
				} else if (local10 == 3) {
					this.aBoolean47 = true;
				} else if (local10 == 5) {
					this.aBoolean48 = false;
				} else if (local10 == 6) {
					this.aString6 = arg1.method318();
				} else if (local10 == 7) {
					@Pc(75) int local75 = this.anInt167;
					@Pc(78) int local78 = this.anInt168;
					@Pc(81) int local81 = this.anInt169;
					@Pc(84) int local84 = this.anInt170;
					@Pc(87) int local87 = arg1.method315();
					this.method101(local87);
					this.anInt167 = local75;
					this.anInt168 = local78;
					this.anInt169 = local81;
					this.anInt170 = local84;
					this.anInt171 = local84;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("32485, " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(ZI)V")
	private void method101(@OriginalArg(1) int arg0) {
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
			this.anInt167 = (int) (local61 * 256.0D);
			this.anInt168 = (int) (local63 * 256.0D);
			this.anInt169 = (int) (local69 * 256.0D);
			if (this.anInt168 < 0) {
				this.anInt168 = 0;
			} else if (this.anInt168 > 255) {
				this.anInt168 = 255;
			}
			if (this.anInt169 < 0) {
				this.anInt169 = 0;
			} else if (this.anInt169 > 255) {
				this.anInt169 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt171 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt171 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt171 < 1) {
				this.anInt171 = 1;
			}
			this.anInt170 = (int) (local61 * (double) this.anInt171);
			@Pc(249) int local249 = this.anInt167 + (int) (Math.random() * 16.0D) - 8;
			if (local249 < 0) {
				local249 = 0;
			} else if (local249 > 255) {
				local249 = 255;
			}
			@Pc(270) int local270 = this.anInt168 + (int) (Math.random() * 48.0D) - 24;
			if (local270 < 0) {
				local270 = 0;
			} else if (local270 > 255) {
				local270 = 255;
			}
			@Pc(291) int local291 = this.anInt169 + (int) (Math.random() * 48.0D) - 24;
			if (local291 < 0) {
				local291 = 0;
			} else if (local291 > 255) {
				local291 = 255;
			}
			this.anInt172 = this.method102(local249, local270, local291);
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("17646, " + true + ", " + arg0 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FZFOSJCE", name = "a", descriptor = "(III)I")
	private int method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
