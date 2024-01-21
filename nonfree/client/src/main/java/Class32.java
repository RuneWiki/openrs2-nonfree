import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RSGRNXCC")
public final class Class32 {

	@OriginalMember(owner = "client!RSGRNXCC", name = "b", descriptor = "I")
	private static int anInt463;

	@OriginalMember(owner = "client!RSGRNXCC", name = "c", descriptor = "[Lclient!RSGRNXCC;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!RSGRNXCC", name = "d", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!RSGRNXCC", name = "e", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!RSGRNXCC", name = "i", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!RSGRNXCC", name = "j", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!RSGRNXCC", name = "k", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!RSGRNXCC", name = "l", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!RSGRNXCC", name = "m", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!RSGRNXCC", name = "n", descriptor = "I")
	public int anInt471;

	@OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!RSGRNXCC", name = "f", descriptor = "I")
	public int anInt465 = -1;

	@OriginalMember(owner = "client!RSGRNXCC", name = "g", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!RSGRNXCC", name = "h", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(ILclient!MAARFNGV;)V")
	public static void method312(@OriginalArg(1) Class22 arg0) {
		try {
			@Pc(10) Class2_Sub1_Sub3 local10 = new Class2_Sub1_Sub3(arg0.method218("flo.dat", null), true);
			anInt463 = local10.method99();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt463];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt463; local29++) {
				if (aClass32Array1[local29] == null) {
					aClass32Array1[local29] = new Class32();
				}
				aClass32Array1[local29].method313(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("56892, " + 0 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSGRNXCC", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(ILclient!EMWAMCXW;)V")
	private void method313(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method97();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt464 = arg0.method101();
					this.method314(this.anInt464, (byte) 7);
				} else if (local15 == 2) {
					this.anInt465 = arg0.method97();
				} else if (local15 == 3) {
					this.aBoolean162 = true;
				} else if (local15 == 5) {
					this.aBoolean163 = false;
				} else if (local15 == 6) {
					this.aString12 = arg0.method104();
				} else if (local15 == 7) {
					@Pc(72) int local72 = this.anInt466;
					@Pc(75) int local75 = this.anInt467;
					@Pc(78) int local78 = this.anInt468;
					@Pc(81) int local81 = this.anInt469;
					@Pc(84) int local84 = arg0.method101();
					this.method314(local84, (byte) 7);
					this.anInt466 = local72;
					this.anInt467 = local75;
					this.anInt468 = local78;
					this.anInt469 = local81;
					this.anInt470 = local81;
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("61260, " + 1016 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(IB)V")
	private void method314(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(29) boolean local29 = false;
			@Pc(39) double local39 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(41) double local41 = local15;
			if (local24 < local15) {
				local41 = local24;
			}
			if (local39 < local41) {
				local41 = local39;
			}
			@Pc(55) double local55 = local15;
			if (local24 > local15) {
				local55 = local24;
			}
			if (local39 > local55) {
				local55 = local39;
			}
			@Pc(69) double local69 = 0.0D;
			@Pc(71) double local71 = 0.0D;
			@Pc(77) double local77 = (local41 + local55) / 2.0D;
			if (local41 != local55) {
				if (local77 < 0.5D) {
					local71 = (local55 - local41) / (local55 + local41);
				}
				if (local77 >= 0.5D) {
					local71 = (local55 - local41) / (2.0D - local55 - local41);
				}
				if (local15 == local55) {
					local69 = (local24 - local39) / (local55 - local41);
				} else if (local24 == local55) {
					local69 = (local39 - local15) / (local55 - local41) + 2.0D;
				} else if (local39 == local55) {
					local69 = (local15 - local24) / (local55 - local41) + 4.0D;
				}
			}
			local69 /= 6.0D;
			this.anInt466 = (int) (local69 * 256.0D);
			this.anInt467 = (int) (local71 * 256.0D);
			this.anInt468 = (int) (local77 * 256.0D);
			if (this.anInt467 < 0) {
				this.anInt467 = 0;
			} else if (this.anInt467 > 255) {
				this.anInt467 = 255;
			}
			if (this.anInt468 < 0) {
				this.anInt468 = 0;
			} else if (this.anInt468 > 255) {
				this.anInt468 = 255;
			}
			if (local77 > 0.5D) {
				this.anInt470 = (int) ((1.0D - local77) * local71 * 512.0D);
			} else {
				this.anInt470 = (int) (local77 * local71 * 512.0D);
			}
			if (this.anInt470 < 1) {
				this.anInt470 = 1;
			}
			this.anInt469 = (int) (local69 * (double) this.anInt470);
			@Pc(252) int local252 = this.anInt466 + (int) (Math.random() * 16.0D) - 8;
			if (local252 < 0) {
				local252 = 0;
			} else if (local252 > 255) {
				local252 = 255;
			}
			@Pc(273) int local273 = this.anInt467 + (int) (Math.random() * 48.0D) - 24;
			if (local273 < 0) {
				local273 = 0;
			} else if (local273 > 255) {
				local273 = 255;
			}
			@Pc(294) int local294 = this.anInt468 + (int) (Math.random() * 48.0D) - 24;
			if (local294 < 0) {
				local294 = 0;
			} else if (local294 > 255) {
				local294 = 255;
			}
			this.anInt471 = this.method315(local252, local273, local294);
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("90380, " + arg0 + ", " + arg1 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(III)I")
	private int method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
