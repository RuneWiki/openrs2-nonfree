import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HCUFYAUI")
public final class Class13 {

	@OriginalMember(owner = "client!HCUFYAUI", name = "b", descriptor = "I")
	private static int anInt209;

	@OriginalMember(owner = "client!HCUFYAUI", name = "c", descriptor = "[Lclient!HCUFYAUI;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!HCUFYAUI", name = "a", descriptor = "Z")
	private static boolean aBoolean54 = true;

	@OriginalMember(owner = "client!HCUFYAUI", name = "d", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!HCUFYAUI", name = "e", descriptor = "I")
	public int anInt210;

	@OriginalMember(owner = "client!HCUFYAUI", name = "i", descriptor = "I")
	public int anInt212;

	@OriginalMember(owner = "client!HCUFYAUI", name = "j", descriptor = "I")
	public int anInt213;

	@OriginalMember(owner = "client!HCUFYAUI", name = "k", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!HCUFYAUI", name = "l", descriptor = "I")
	public int anInt215;

	@OriginalMember(owner = "client!HCUFYAUI", name = "m", descriptor = "I")
	public int anInt216;

	@OriginalMember(owner = "client!HCUFYAUI", name = "n", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!HCUFYAUI", name = "f", descriptor = "I")
	public int anInt211 = -1;

	@OriginalMember(owner = "client!HCUFYAUI", name = "g", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!HCUFYAUI", name = "h", descriptor = "Z")
	public boolean aBoolean56 = true;

	@OriginalMember(owner = "client!HCUFYAUI", name = "a", descriptor = "(Lclient!FNOQZAYQ;I)V")
	public static void method182(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method165("flo.dat", null), aBoolean54);
			anInt209 = local8.method96();
			@Pc(15) int local15 = 40 / arg1;
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt209];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt209; local22++) {
				if (aClass13Array1[local22] == null) {
					aClass13Array1[local22] = new Class13();
				}
				aClass13Array1[local22].method183(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("27738, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCUFYAUI", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!HCUFYAUI", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	private void method183(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method94();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt210 = arg0.method98();
					this.method184(this.anInt210);
				} else if (local10 == 2) {
					this.anInt211 = arg0.method94();
				} else if (local10 == 3) {
					this.aBoolean55 = true;
				} else if (local10 == 5) {
					this.aBoolean56 = false;
				} else if (local10 == 6) {
					this.aString3 = arg0.method101();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt212;
					@Pc(70) int local70 = this.anInt213;
					@Pc(73) int local73 = this.anInt214;
					@Pc(76) int local76 = this.anInt215;
					@Pc(79) int local79 = arg0.method98();
					this.method184(local79);
					this.anInt212 = local67;
					this.anInt213 = local70;
					this.anInt214 = local73;
					this.anInt215 = local76;
					this.anInt216 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("58471, " + arg0 + ", " + -25 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCUFYAUI", name = "a", descriptor = "(II)V")
	private void method184(@OriginalArg(1) int arg0) {
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
			this.anInt212 = (int) (local56 * 256.0D);
			this.anInt213 = (int) (local58 * 256.0D);
			this.anInt214 = (int) (local64 * 256.0D);
			if (this.anInt213 < 0) {
				this.anInt213 = 0;
			} else if (this.anInt213 > 255) {
				this.anInt213 = 255;
			}
			if (this.anInt214 < 0) {
				this.anInt214 = 0;
			} else if (this.anInt214 > 255) {
				this.anInt214 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt216 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt216 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt216 < 1) {
				this.anInt216 = 1;
			}
			this.anInt215 = (int) (local56 * (double) this.anInt216);
			@Pc(248) int local248 = this.anInt212 + (int) (Math.random() * 16.0D) - 8;
			if (local248 < 0) {
				local248 = 0;
			} else if (local248 > 255) {
				local248 = 255;
			}
			@Pc(269) int local269 = this.anInt213 + (int) (Math.random() * 48.0D) - 24;
			if (local269 < 0) {
				local269 = 0;
			} else if (local269 > 255) {
				local269 = 255;
			}
			@Pc(290) int local290 = this.anInt214 + (int) (Math.random() * 48.0D) - 24;
			if (local290 < 0) {
				local290 = 0;
			} else if (local290 > 255) {
				local290 = 255;
			}
			this.anInt217 = this.method185(local248, local269, local290);
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("70058, " + 0 + ", " + arg0 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCUFYAUI", name = "a", descriptor = "(III)I")
	private int method185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
