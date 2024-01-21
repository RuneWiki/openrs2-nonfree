import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GOLZJDMQ")
public final class Class14 {

	@OriginalMember(owner = "client!GOLZJDMQ", name = "c", descriptor = "I")
	private static int anInt166;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "d", descriptor = "[Lclient!GOLZJDMQ;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "I")
	private static int anInt164 = 536;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "b", descriptor = "I")
	private static int anInt165 = 3;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "e", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "f", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "j", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "k", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "l", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "m", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "n", descriptor = "I")
	public int anInt173;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "o", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "g", descriptor = "I")
	public int anInt168 = -1;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "h", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "i", descriptor = "Z")
	public boolean aBoolean51 = true;

	@OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(ILclient!UUIGNTAD;)V")
	public static void method178(@OriginalArg(1) Class38 arg0) {
		try {
			if (anInt165 <= 3 && anInt165 >= 3) {
				@Pc(15) Class1_Sub1_Sub3 local15 = new Class1_Sub1_Sub3(arg0.method512("flo.dat", null), anInt164);
				anInt166 = local15.method57();
				if (aClass14Array1 == null) {
					aClass14Array1 = new Class14[anInt166];
				}
				for (@Pc(25) int local25 = 0; local25 < anInt166; local25++) {
					if (aClass14Array1[local25] == null) {
						aClass14Array1[local25] = new Class14();
					}
					aClass14Array1[local25].method179(local15);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("66492, " + 3 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GOLZJDMQ", name = "<init>", descriptor = "()V")
	private Class14() {
	}

	@OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	private void method179(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method55();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt167 = arg0.method59();
					this.method180(476, this.anInt167);
				} else if (local13 == 2) {
					this.anInt168 = arg0.method55();
				} else if (local13 == 3) {
					this.aBoolean50 = true;
				} else if (local13 == 5) {
					this.aBoolean51 = false;
				} else if (local13 == 6) {
					this.aString2 = arg0.method62();
				} else if (local13 == 7) {
					@Pc(70) int local70 = this.anInt169;
					@Pc(73) int local73 = this.anInt170;
					@Pc(76) int local76 = this.anInt171;
					@Pc(79) int local79 = this.anInt172;
					@Pc(82) int local82 = arg0.method59();
					this.method180(476, local82);
					this.anInt169 = local70;
					this.anInt170 = local73;
					this.anInt171 = local76;
					this.anInt172 = local79;
					this.anInt173 = local79;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("74382, " + arg0 + ", " + -593 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(II)V")
	private void method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 == 16711935) {
				arg1 = 0;
			}
			@Pc(15) double local15 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
			@Pc(28) boolean local28 = false;
			@Pc(35) double local35 = (double) (arg1 & 0xFF) / 256.0D;
			@Pc(37) double local37 = local15;
			if (local24 < local15) {
				local37 = local24;
			}
			if (local35 < local37) {
				local37 = local35;
			}
			@Pc(51) double local51 = local15;
			if (local24 > local15) {
				local51 = local24;
			}
			if (local35 > local51) {
				local51 = local35;
			}
			@Pc(65) double local65 = 0.0D;
			@Pc(67) double local67 = 0.0D;
			@Pc(73) double local73 = (local37 + local51) / 2.0D;
			if (local37 != local51) {
				if (local73 < 0.5D) {
					local67 = (local51 - local37) / (local51 + local37);
				}
				if (local73 >= 0.5D) {
					local67 = (local51 - local37) / (2.0D - local51 - local37);
				}
				if (local15 == local51) {
					local65 = (local24 - local35) / (local51 - local37);
				} else if (local24 == local51) {
					local65 = (local35 - local15) / (local51 - local37) + 2.0D;
				} else if (local35 == local51) {
					local65 = (local15 - local24) / (local51 - local37) + 4.0D;
				}
			}
			local65 /= 6.0D;
			this.anInt169 = (int) (local65 * 256.0D);
			this.anInt170 = (int) (local67 * 256.0D);
			this.anInt171 = (int) (local73 * 256.0D);
			if (this.anInt170 < 0) {
				this.anInt170 = 0;
			} else if (this.anInt170 > 255) {
				this.anInt170 = 255;
			}
			if (this.anInt171 < 0) {
				this.anInt171 = 0;
			} else if (this.anInt171 > 255) {
				this.anInt171 = 255;
			}
			if (local73 > 0.5D) {
				this.anInt173 = (int) ((1.0D - local73) * local67 * 512.0D);
			} else {
				this.anInt173 = (int) (local73 * local67 * 512.0D);
			}
			if (this.anInt173 < 1) {
				this.anInt173 = 1;
			}
			this.anInt172 = (int) (local65 * (double) this.anInt173);
			@Pc(248) int local248 = this.anInt169 + (int) (Math.random() * 16.0D) - 8;
			if (local248 < 0) {
				local248 = 0;
			} else if (local248 > 255) {
				local248 = 255;
			}
			@Pc(269) int local269 = this.anInt170 + (int) (Math.random() * 48.0D) - 24;
			if (local269 < 0) {
				local269 = 0;
			} else if (local269 > 255) {
				local269 = 255;
			}
			@Pc(290) int local290 = this.anInt171 + (int) (Math.random() * 48.0D) - 24;
			if (local290 < 0) {
				local290 = 0;
			} else if (local290 > 255) {
				local290 = 255;
			}
			this.anInt174 = this.method181(local248, local269, local290);
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("52918, " + arg0 + ", " + arg1 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GOLZJDMQ", name = "a", descriptor = "(III)I")
	private int method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
