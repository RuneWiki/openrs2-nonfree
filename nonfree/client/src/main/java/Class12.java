import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FFMSWDBM")
public final class Class12 {

	@OriginalMember(owner = "client!FFMSWDBM", name = "r", descriptor = "[I")
	private static int[] anIntArray48;

	@OriginalMember(owner = "client!FFMSWDBM", name = "s", descriptor = "[I")
	private static int[] anIntArray49;

	@OriginalMember(owner = "client!FFMSWDBM", name = "t", descriptor = "[I")
	private static int[] anIntArray50;

	@OriginalMember(owner = "client!FFMSWDBM", name = "u", descriptor = "[I")
	private static int[] anIntArray51 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "v", descriptor = "[I")
	private static int[] anIntArray52 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "w", descriptor = "[I")
	private static int[] anIntArray53 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "x", descriptor = "[I")
	private static int[] anIntArray54 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "y", descriptor = "[I")
	private static int[] anIntArray55 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!FFMSWDBM", name = "b", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_2;

	@OriginalMember(owner = "client!FFMSWDBM", name = "c", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_3;

	@OriginalMember(owner = "client!FFMSWDBM", name = "d", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_4;

	@OriginalMember(owner = "client!FFMSWDBM", name = "e", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_5;

	@OriginalMember(owner = "client!FFMSWDBM", name = "f", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_6;

	@OriginalMember(owner = "client!FFMSWDBM", name = "g", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_7;

	@OriginalMember(owner = "client!FFMSWDBM", name = "h", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_8;

	@OriginalMember(owner = "client!FFMSWDBM", name = "l", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!FFMSWDBM", name = "n", descriptor = "Lclient!ZENSICXR;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!FFMSWDBM", name = "o", descriptor = "Lclient!HXORSAZH;")
	private Class14 aClass14_9;

	@OriginalMember(owner = "client!FFMSWDBM", name = "q", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!FFMSWDBM", name = "i", descriptor = "[I")
	private int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "j", descriptor = "[I")
	private int[] anIntArray46 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "k", descriptor = "[I")
	private int[] anIntArray47 = new int[5];

	@OriginalMember(owner = "client!FFMSWDBM", name = "m", descriptor = "I")
	private int anInt177 = 100;

	@OriginalMember(owner = "client!FFMSWDBM", name = "p", descriptor = "I")
	public int anInt178 = 500;

	@OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "()V")
	public static void method72() {
		anIntArray49 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray49[local6] = 1;
			} else {
				anIntArray49[local6] = -1;
			}
		}
		anIntArray50 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray50[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray48 = new int[220500];
	}

	@OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "(II)[I")
	public int[] method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray48[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray48;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass14_1.method114();
		this.aClass14_2.method114();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass14_3 != null) {
			this.aClass14_3.method114();
			this.aClass14_4.method114();
			local36 = (int) ((double) (this.aClass14_3.anInt257 - this.aClass14_3.anInt256) * 32.768D / local26);
			local38 = (int) ((double) this.aClass14_3.anInt256 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass14_5 != null) {
			this.aClass14_5.method114();
			this.aClass14_6.method114();
			local77 = (int) ((double) (this.aClass14_5.anInt257 - this.aClass14_5.anInt256) * 32.768D / local26);
			local79 = (int) ((double) this.aClass14_5.anInt256 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray45[local118] != 0) {
				anIntArray51[local118] = 0;
				anIntArray52[local118] = (int) ((double) this.anIntArray47[local118] * local26);
				anIntArray53[local118] = (this.anIntArray45[local118] << 14) / 100;
				anIntArray54[local118] = (int) ((double) (this.aClass14_1.anInt257 - this.aClass14_1.anInt256) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray46[local118]) / local26);
				anIntArray55[local118] = (int) ((double) this.aClass14_1.anInt256 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass14_1.method115(arg0);
			local207 = this.aClass14_2.method115(arg0);
			if (this.aClass14_3 != null) {
				local216 = this.aClass14_3.method115(arg0);
				local222 = this.aClass14_4.method115(arg0);
				local201 += this.method74(this.aClass14_3.anInt258, local40, 790, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass14_5 != null) {
				local216 = this.aClass14_5.method115(arg0);
				local222 = this.aClass14_6.method115(arg0);
				local207 = local207 * ((this.method74(this.aClass14_5.anInt258, local81, 790, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray45[local216] != 0) {
					local222 = local193 + anIntArray52[local216];
					if (local222 < arg0) {
						anIntArray48[local222] += this.method74(this.aClass14_1.anInt258, anIntArray51[local216], 790, local207 * anIntArray53[local216] >> 15);
						anIntArray51[local216] += (local201 * anIntArray54[local216] >> 16) + anIntArray55[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass14_7 != null) {
			this.aClass14_7.method114();
			this.aClass14_8.method114();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass14_7.method115(arg0);
				local385 = this.aClass14_8.method115(arg0);
				if (local369) {
					local207 = this.aClass14_7.anInt256 + ((this.aClass14_7.anInt257 - this.aClass14_7.anInt256) * local379 >> 8);
				} else {
					local207 = this.aClass14_7.anInt256 + ((this.aClass14_7.anInt257 - this.aClass14_7.anInt256) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray48[local222] = 0;
				}
			}
		}
		if (this.anInt176 > 0 && this.anInt177 > 0) {
			local201 = (int) ((double) this.anInt176 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray48[local207] += anIntArray48[local207 - local201] * this.anInt177 / 100;
			}
		}
		if (this.aClass49_1.anIntArray202[0] > 0 || this.aClass49_1.anIntArray202[1] > 0) {
			this.aClass14_9.method114();
			local201 = this.aClass14_9.method115(arg0 + 1);
			local207 = this.aClass49_1.method544(0, (float) local201 / 65536.0F, (byte) 8);
			local216 = this.aClass49_1.method544(1, (float) local201 / 65536.0F, (byte) 8);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray48[local222 + local207] * (long) Class49.anInt781 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray48[local222 + local207 - local559 - 1] * (long) Class49.anIntArrayArray21[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray48[local222 - local590 - 1] * (long) Class49.anIntArrayArray21[1][local590] >> 16);
					}
					anIntArray48[local222] = local385;
					local201 = this.aClass14_9.method115(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray48[local222 + local207] * (long) Class49.anInt781 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray48[local222 + local207 - local590 - 1] * (long) Class49.anIntArrayArray21[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray48[local222 - local694 - 1] * (long) Class49.anIntArrayArray21[1][local694] >> 16);
						}
						anIntArray48[local222] = local559;
						local201 = this.aClass14_9.method115(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray48[local222 + local207 - local590 - 1] * (long) Class49.anIntArrayArray21[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray48[local222 - local694 - 1] * (long) Class49.anIntArrayArray21[1][local694] >> 16);
							}
							anIntArray48[local222] = local559;
							this.aClass14_9.method115(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass49_1.method544(0, (float) local201 / 65536.0F, (byte) 8);
					local216 = this.aClass49_1.method544(1, (float) local201 / 65536.0F, (byte) 8);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray48[local201] < -32768) {
				anIntArray48[local201] = -32768;
			}
			if (anIntArray48[local201] > 32767) {
				anIntArray48[local201] = 32767;
			}
		}
		return anIntArray48;
	}

	@OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "(IIII)I")
	private int method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg3 : -arg3;
			} else if (arg0 == 2) {
				return anIntArray50[arg1 & 0x7FFF] * arg3 >> 14;
			} else if (arg0 == 3) {
				return ((arg1 & 0x7FFF) * arg3 >> 14) - arg3;
			} else if (arg0 == 4) {
				return anIntArray49[arg1 / 2607 & 0x7FFF] * arg3;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("29430, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	public void method75(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			this.aClass14_1 = new Class14();
			this.aClass14_1.method112(arg0);
			this.aClass14_2 = new Class14();
			this.aClass14_2.method112(arg0);
			@Pc(24) int local24 = arg0.method406();
			if (local24 != 0) {
				arg0.anInt620--;
				this.aClass14_3 = new Class14();
				this.aClass14_3.method112(arg0);
				this.aClass14_4 = new Class14();
				this.aClass14_4.method112(arg0);
			}
			local24 = arg0.method406();
			if (local24 != 0) {
				arg0.anInt620--;
				this.aClass14_5 = new Class14();
				this.aClass14_5.method112(arg0);
				this.aClass14_6 = new Class14();
				this.aClass14_6.method112(arg0);
			}
			local24 = arg0.method406();
			if (local24 != 0) {
				arg0.anInt620--;
				this.aClass14_7 = new Class14();
				this.aClass14_7.method112(arg0);
				this.aClass14_8 = new Class14();
				this.aClass14_8.method112(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method420();
				if (local127 == 0) {
					break;
				}
				this.anIntArray45[local116] = local127;
				this.anIntArray46[local116] = arg0.method419();
				this.anIntArray47[local116] = arg0.method420();
			}
			this.anInt176 = arg0.method420();
			this.anInt177 = arg0.method420();
			this.anInt178 = arg0.method408();
			this.anInt179 = arg0.method408();
			this.aClass49_1 = new Class49();
			this.aClass14_9 = new Class14();
			this.aClass49_1.method545(this.aClass14_9, arg0);
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("27288, " + 3 + ", " + arg0 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
