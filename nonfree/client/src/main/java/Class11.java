import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FMKSNCAT")
public final class Class11 {

	@OriginalMember(owner = "client!FMKSNCAT", name = "r", descriptor = "[I")
	private static int[] anIntArray47;

	@OriginalMember(owner = "client!FMKSNCAT", name = "s", descriptor = "[I")
	private static int[] anIntArray48;

	@OriginalMember(owner = "client!FMKSNCAT", name = "t", descriptor = "[I")
	private static int[] anIntArray49;

	@OriginalMember(owner = "client!FMKSNCAT", name = "u", descriptor = "[I")
	private static int[] anIntArray50 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "v", descriptor = "[I")
	private static int[] anIntArray51 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "w", descriptor = "[I")
	private static int[] anIntArray52 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "x", descriptor = "[I")
	private static int[] anIntArray53 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "y", descriptor = "[I")
	private static int[] anIntArray54 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!FMKSNCAT", name = "b", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_2;

	@OriginalMember(owner = "client!FMKSNCAT", name = "c", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_3;

	@OriginalMember(owner = "client!FMKSNCAT", name = "d", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_4;

	@OriginalMember(owner = "client!FMKSNCAT", name = "e", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_5;

	@OriginalMember(owner = "client!FMKSNCAT", name = "f", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_6;

	@OriginalMember(owner = "client!FMKSNCAT", name = "g", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_7;

	@OriginalMember(owner = "client!FMKSNCAT", name = "h", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_8;

	@OriginalMember(owner = "client!FMKSNCAT", name = "l", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!FMKSNCAT", name = "n", descriptor = "Lclient!ZOMUFNUM;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!FMKSNCAT", name = "o", descriptor = "Lclient!FGSQUADF;")
	private Class10 aClass10_9;

	@OriginalMember(owner = "client!FMKSNCAT", name = "q", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!FMKSNCAT", name = "i", descriptor = "[I")
	private int[] anIntArray44 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "j", descriptor = "[I")
	private int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "k", descriptor = "[I")
	private int[] anIntArray46 = new int[5];

	@OriginalMember(owner = "client!FMKSNCAT", name = "m", descriptor = "I")
	private int anInt233 = 100;

	@OriginalMember(owner = "client!FMKSNCAT", name = "p", descriptor = "I")
	public int anInt234 = 500;

	@OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "()V")
	public static void method106() {
		anIntArray48 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray48[local6] = 1;
			} else {
				anIntArray48[local6] = -1;
			}
		}
		anIntArray49 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray49[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray47 = new int[220500];
	}

	@OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "(II)[I")
	public int[] method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray47[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray47;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass10_1.method63();
		this.aClass10_2.method63();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass10_3 != null) {
			this.aClass10_3.method63();
			this.aClass10_4.method63();
			local36 = (int) ((double) (this.aClass10_3.anInt189 - this.aClass10_3.anInt188) * 32.768D / local26);
			local38 = (int) ((double) this.aClass10_3.anInt188 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass10_5 != null) {
			this.aClass10_5.method63();
			this.aClass10_6.method63();
			local77 = (int) ((double) (this.aClass10_5.anInt189 - this.aClass10_5.anInt188) * 32.768D / local26);
			local79 = (int) ((double) this.aClass10_5.anInt188 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray44[local118] != 0) {
				anIntArray50[local118] = 0;
				anIntArray51[local118] = (int) ((double) this.anIntArray46[local118] * local26);
				anIntArray52[local118] = (this.anIntArray44[local118] << 14) / 100;
				anIntArray53[local118] = (int) ((double) (this.aClass10_1.anInt189 - this.aClass10_1.anInt188) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray45[local118]) / local26);
				anIntArray54[local118] = (int) ((double) this.aClass10_1.anInt188 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass10_1.method64(arg0);
			local207 = this.aClass10_2.method64(arg0);
			if (this.aClass10_3 != null) {
				local216 = this.aClass10_3.method64(arg0);
				local222 = this.aClass10_4.method64(arg0);
				local201 += this.method108(this.aClass10_3.anInt190, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass10_5 != null) {
				local216 = this.aClass10_5.method64(arg0);
				local222 = this.aClass10_6.method64(arg0);
				local207 = local207 * ((this.method108(this.aClass10_5.anInt190, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray44[local216] != 0) {
					local222 = local193 + anIntArray51[local216];
					if (local222 < arg0) {
						anIntArray47[local222] += this.method108(this.aClass10_1.anInt190, local207 * anIntArray52[local216] >> 15, anIntArray50[local216]);
						anIntArray50[local216] += (local201 * anIntArray53[local216] >> 16) + anIntArray54[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass10_7 != null) {
			this.aClass10_7.method63();
			this.aClass10_8.method63();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass10_7.method64(arg0);
				local385 = this.aClass10_8.method64(arg0);
				if (local369) {
					local207 = this.aClass10_7.anInt188 + ((this.aClass10_7.anInt189 - this.aClass10_7.anInt188) * local379 >> 8);
				} else {
					local207 = this.aClass10_7.anInt188 + ((this.aClass10_7.anInt189 - this.aClass10_7.anInt188) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray47[local222] = 0;
				}
			}
		}
		if (this.anInt232 > 0 && this.anInt233 > 0) {
			local201 = (int) ((double) this.anInt232 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray47[local207] += anIntArray47[local207 - local201] * this.anInt233 / 100;
			}
		}
		if (this.aClass50_1.anIntArray199[0] > 0 || this.aClass50_1.anIntArray199[1] > 0) {
			this.aClass10_9.method63();
			local201 = this.aClass10_9.method64(arg0 + 1);
			local207 = this.aClass50_1.method543(0, (float) local201 / 65536.0F);
			local216 = this.aClass50_1.method543(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray47[local222 + local207] * (long) Class50.anInt797 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray47[local222 + local207 - local559 - 1] * (long) Class50.anIntArrayArray18[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray47[local222 - local590 - 1] * (long) Class50.anIntArrayArray18[1][local590] >> 16);
					}
					anIntArray47[local222] = local385;
					local201 = this.aClass10_9.method64(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray47[local222 + local207] * (long) Class50.anInt797 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray47[local222 + local207 - local590 - 1] * (long) Class50.anIntArrayArray18[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray47[local222 - local694 - 1] * (long) Class50.anIntArrayArray18[1][local694] >> 16);
						}
						anIntArray47[local222] = local559;
						local201 = this.aClass10_9.method64(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray47[local222 + local207 - local590 - 1] * (long) Class50.anIntArrayArray18[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray47[local222 - local694 - 1] * (long) Class50.anIntArrayArray18[1][local694] >> 16);
							}
							anIntArray47[local222] = local559;
							this.aClass10_9.method64(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass50_1.method543(0, (float) local201 / 65536.0F);
					local216 = this.aClass50_1.method543(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray47[local201] < -32768) {
				anIntArray47[local201] = -32768;
			}
			if (anIntArray47[local201] > 32767) {
				anIntArray47[local201] = 32767;
			}
		}
		return anIntArray47;
	}

	@OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "(IIII)I")
	private int method108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg0 == 2) {
				return anIntArray49[arg2 & 0x7FFF] * arg1 >> 14;
			} else if (arg0 == 3) {
				return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg0 == 4) {
				return anIntArray48[arg2 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("50949, " + 866 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	public void method109(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			this.aClass10_1 = new Class10();
			this.aClass10_1.method61((byte) 6, arg0);
			this.aClass10_2 = new Class10();
			this.aClass10_2.method61((byte) 6, arg0);
			@Pc(24) int local24 = arg0.method262();
			if (local24 != 0) {
				arg0.anInt404--;
				this.aClass10_3 = new Class10();
				this.aClass10_3.method61((byte) 6, arg0);
				this.aClass10_4 = new Class10();
				this.aClass10_4.method61((byte) 6, arg0);
			}
			local24 = arg0.method262();
			if (local24 != 0) {
				arg0.anInt404--;
				this.aClass10_5 = new Class10();
				this.aClass10_5.method61((byte) 6, arg0);
				this.aClass10_6 = new Class10();
				this.aClass10_6.method61((byte) 6, arg0);
			}
			local24 = arg0.method262();
			if (local24 != 0) {
				arg0.anInt404--;
				this.aClass10_7 = new Class10();
				this.aClass10_7.method61((byte) 6, arg0);
				this.aClass10_8 = new Class10();
				this.aClass10_8.method61((byte) 6, arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method276();
				if (local127 == 0) {
					break;
				}
				this.anIntArray44[local116] = local127;
				this.anIntArray45[local116] = arg0.method275();
				this.anIntArray46[local116] = arg0.method276();
			}
			this.anInt232 = arg0.method276();
			this.anInt233 = arg0.method276();
			this.anInt234 = arg0.method264();
			this.anInt235 = arg0.method264();
			this.aClass50_1 = new Class50();
			this.aClass10_9 = new Class10();
			this.aClass50_1.method544(arg0, this.aClass10_9);
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("9012, " + 6 + ", " + arg0 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}
}
