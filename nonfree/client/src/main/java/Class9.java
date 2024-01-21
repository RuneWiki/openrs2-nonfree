import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EIBTXPJE")
public final class Class9 {

	@OriginalMember(owner = "client!EIBTXPJE", name = "c", descriptor = "I")
	private static int anInt204;

	@OriginalMember(owner = "client!EIBTXPJE", name = "d", descriptor = "[Lclient!EIBTXPJE;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!EIBTXPJE", name = "b", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!EIBTXPJE", name = "e", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!EIBTXPJE", name = "f", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!EIBTXPJE", name = "j", descriptor = "I")
	public int anInt207;

	@OriginalMember(owner = "client!EIBTXPJE", name = "k", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!EIBTXPJE", name = "l", descriptor = "I")
	public int anInt209;

	@OriginalMember(owner = "client!EIBTXPJE", name = "m", descriptor = "I")
	public int anInt210;

	@OriginalMember(owner = "client!EIBTXPJE", name = "n", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!EIBTXPJE", name = "o", descriptor = "I")
	public int anInt212;

	@OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "I")
	private int anInt202 = -494;

	@OriginalMember(owner = "client!EIBTXPJE", name = "g", descriptor = "I")
	public int anInt206 = -1;

	@OriginalMember(owner = "client!EIBTXPJE", name = "h", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!EIBTXPJE", name = "i", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(Lclient!NXFIIFAD;I)V")
	public static void method99(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(8) Class1_Sub2_Sub3 local8 = new Class1_Sub2_Sub3(arg0.method352("flo.dat", null), -670);
			anInt204 = local8.method309();
			if (aClass9Array1 == null) {
				aClass9Array1 = new Class9[anInt204];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt204; local18++) {
				if (aClass9Array1[local18] == null) {
					aClass9Array1[local18] = new Class9();
				}
				aClass9Array1[local18].method100(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("71023, " + arg0 + ", " + 24570 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EIBTXPJE", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	private void method100(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method307();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt205 = arg0.method311();
					this.method101((byte) 5, this.anInt205);
				} else if (local9 == 2) {
					this.anInt206 = arg0.method307();
				} else if (local9 == 3) {
					this.aBoolean31 = true;
				} else if (local9 == 5) {
					this.aBoolean32 = false;
				} else if (local9 == 6) {
					this.aString4 = arg0.method314();
				} else if (local9 == 7) {
					@Pc(66) int local66 = this.anInt207;
					@Pc(69) int local69 = this.anInt208;
					@Pc(72) int local72 = this.anInt209;
					@Pc(75) int local75 = this.anInt210;
					@Pc(78) int local78 = arg0.method311();
					this.method101((byte) 5, local78);
					this.anInt207 = local66;
					this.anInt208 = local69;
					this.anInt209 = local72;
					this.anInt210 = local75;
					this.anInt211 = local75;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("90752, " + arg0 + ", " + 0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(BI)V")
	private void method101(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 == 16711935) {
				arg1 = 0;
			}
			@Pc(15) double local15 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
			@Pc(31) double local31 = (double) (arg1 & 0xFF) / 256.0D;
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
			this.anInt207 = (int) (local61 * 256.0D);
			@Pc(158) boolean local158 = false;
			this.anInt208 = (int) (local63 * 256.0D);
			this.anInt209 = (int) (local69 * 256.0D);
			if (this.anInt208 < 0) {
				this.anInt208 = 0;
			} else if (this.anInt208 > 255) {
				this.anInt208 = 255;
			}
			if (this.anInt209 < 0) {
				this.anInt209 = 0;
			} else if (this.anInt209 > 255) {
				this.anInt209 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt211 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt211 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt211 < 1) {
				this.anInt211 = 1;
			}
			this.anInt210 = (int) (local61 * (double) this.anInt211);
			@Pc(254) int local254 = this.anInt207 + (int) (Math.random() * 16.0D) - 8;
			if (local254 < 0) {
				local254 = 0;
			} else if (local254 > 255) {
				local254 = 255;
			}
			@Pc(275) int local275 = this.anInt208 + (int) (Math.random() * 48.0D) - 24;
			if (local275 < 0) {
				local275 = 0;
			} else if (local275 > 255) {
				local275 = 255;
			}
			@Pc(296) int local296 = this.anInt209 + (int) (Math.random() * 48.0D) - 24;
			if (local296 < 0) {
				local296 = 0;
			} else if (local296 > 255) {
				local296 = 255;
			}
			this.anInt212 = this.method102(local254, local275, local296);
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("2833, " + arg0 + ", " + arg1 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(III)I")
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
