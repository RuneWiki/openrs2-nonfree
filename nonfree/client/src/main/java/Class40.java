import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TDNGNEZO")
public final class Class40 {

	@OriginalMember(owner = "client!TDNGNEZO", name = "r", descriptor = "[I")
	private static int[] anIntArray184;

	@OriginalMember(owner = "client!TDNGNEZO", name = "s", descriptor = "[I")
	private static int[] anIntArray185;

	@OriginalMember(owner = "client!TDNGNEZO", name = "t", descriptor = "[I")
	private static int[] anIntArray186;

	@OriginalMember(owner = "client!TDNGNEZO", name = "u", descriptor = "[I")
	private static int[] anIntArray187 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "v", descriptor = "[I")
	private static int[] anIntArray188 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "w", descriptor = "[I")
	private static int[] anIntArray189 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "x", descriptor = "[I")
	private static int[] anIntArray190 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "y", descriptor = "[I")
	private static int[] anIntArray191 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!TDNGNEZO", name = "b", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!TDNGNEZO", name = "c", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!TDNGNEZO", name = "d", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!TDNGNEZO", name = "e", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!TDNGNEZO", name = "f", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!TDNGNEZO", name = "g", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!TDNGNEZO", name = "h", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!TDNGNEZO", name = "l", descriptor = "I")
	private int anInt721;

	@OriginalMember(owner = "client!TDNGNEZO", name = "n", descriptor = "Lclient!BVWZSTJJ;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!TDNGNEZO", name = "o", descriptor = "Lclient!TPZZASFL;")
	private Class42 aClass42_9;

	@OriginalMember(owner = "client!TDNGNEZO", name = "q", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!TDNGNEZO", name = "i", descriptor = "[I")
	private int[] anIntArray181 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "j", descriptor = "[I")
	private int[] anIntArray182 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "k", descriptor = "[I")
	private int[] anIntArray183 = new int[5];

	@OriginalMember(owner = "client!TDNGNEZO", name = "m", descriptor = "I")
	private int anInt722 = 100;

	@OriginalMember(owner = "client!TDNGNEZO", name = "p", descriptor = "I")
	public int anInt723 = 500;

	@OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "()V")
	public static void method500() {
		anIntArray185 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray185[local6] = 1;
			} else {
				anIntArray185[local6] = -1;
			}
		}
		anIntArray186 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray186[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray184 = new int[220500];
	}

	@OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "(II)[I")
	public int[] method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray184[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray184;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass42_1.method543();
		this.aClass42_2.method543();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass42_3 != null) {
			this.aClass42_3.method543();
			this.aClass42_4.method543();
			local36 = (int) ((double) (this.aClass42_3.anInt749 - this.aClass42_3.anInt748) * 32.768D / local26);
			local38 = (int) ((double) this.aClass42_3.anInt748 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass42_5 != null) {
			this.aClass42_5.method543();
			this.aClass42_6.method543();
			local77 = (int) ((double) (this.aClass42_5.anInt749 - this.aClass42_5.anInt748) * 32.768D / local26);
			local79 = (int) ((double) this.aClass42_5.anInt748 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray181[local118] != 0) {
				anIntArray187[local118] = 0;
				anIntArray188[local118] = (int) ((double) this.anIntArray183[local118] * local26);
				anIntArray189[local118] = (this.anIntArray181[local118] << 14) / 100;
				anIntArray190[local118] = (int) ((double) (this.aClass42_1.anInt749 - this.aClass42_1.anInt748) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray182[local118]) / local26);
				anIntArray191[local118] = (int) ((double) this.aClass42_1.anInt748 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass42_1.method544(arg0);
			local207 = this.aClass42_2.method544(arg0);
			if (this.aClass42_3 != null) {
				local216 = this.aClass42_3.method544(arg0);
				local222 = this.aClass42_4.method544(arg0);
				local201 += this.method502(local222, this.aClass42_3.anInt750, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass42_5 != null) {
				local216 = this.aClass42_5.method544(arg0);
				local222 = this.aClass42_6.method544(arg0);
				local207 = local207 * ((this.method502(local222, this.aClass42_5.anInt750, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray181[local216] != 0) {
					local222 = local193 + anIntArray188[local216];
					if (local222 < arg0) {
						anIntArray184[local222] += this.method502(local207 * anIntArray189[local216] >> 15, this.aClass42_1.anInt750, anIntArray187[local216]);
						anIntArray187[local216] += (local201 * anIntArray190[local216] >> 16) + anIntArray191[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass42_7 != null) {
			this.aClass42_7.method543();
			this.aClass42_8.method543();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass42_7.method544(arg0);
				local385 = this.aClass42_8.method544(arg0);
				if (local369) {
					local207 = this.aClass42_7.anInt748 + ((this.aClass42_7.anInt749 - this.aClass42_7.anInt748) * local379 >> 8);
				} else {
					local207 = this.aClass42_7.anInt748 + ((this.aClass42_7.anInt749 - this.aClass42_7.anInt748) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray184[local222] = 0;
				}
			}
		}
		if (this.anInt721 > 0 && this.anInt722 > 0) {
			local201 = (int) ((double) this.anInt721 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray184[local207] += anIntArray184[local207 - local201] * this.anInt722 / 100;
			}
		}
		if (this.aClass4_1.anIntArray32[0] > 0 || this.aClass4_1.anIntArray32[1] > 0) {
			this.aClass42_9.method543();
			local201 = this.aClass42_9.method544(arg0 + 1);
			local207 = this.aClass4_1.method120((byte) 7, (float) local201 / 65536.0F, 0);
			local216 = this.aClass4_1.method120((byte) 7, (float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray184[local222 + local207] * (long) Class4.anInt260 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray184[local222 + local207 - local559 - 1] * (long) Class4.anIntArrayArray1[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray184[local222 - local590 - 1] * (long) Class4.anIntArrayArray1[1][local590] >> 16);
					}
					anIntArray184[local222] = local385;
					local201 = this.aClass42_9.method544(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray184[local222 + local207] * (long) Class4.anInt260 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray184[local222 + local207 - local590 - 1] * (long) Class4.anIntArrayArray1[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray184[local222 - local694 - 1] * (long) Class4.anIntArrayArray1[1][local694] >> 16);
						}
						anIntArray184[local222] = local559;
						local201 = this.aClass42_9.method544(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray184[local222 + local207 - local590 - 1] * (long) Class4.anIntArrayArray1[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray184[local222 - local694 - 1] * (long) Class4.anIntArrayArray1[1][local694] >> 16);
							}
							anIntArray184[local222] = local559;
							this.aClass42_9.method544(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass4_1.method120((byte) 7, (float) local201 / 65536.0F, 0);
					local216 = this.aClass4_1.method120((byte) 7, (float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray184[local201] < -32768) {
				anIntArray184[local201] = -32768;
			}
			if (anIntArray184[local201] > 32767) {
				anIntArray184[local201] = 32767;
			}
		}
		return anIntArray184;
	}

	@OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "(IZII)I")
	private int method502(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray186[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray185[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("59888, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	public void method503(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			this.aClass42_1 = new Class42();
			this.aClass42_1.method541(arg0);
			this.aClass42_2 = new Class42();
			this.aClass42_2.method541(arg0);
			@Pc(24) int local24 = arg0.method294();
			if (local24 != 0) {
				arg0.anInt529--;
				this.aClass42_3 = new Class42();
				this.aClass42_3.method541(arg0);
				this.aClass42_4 = new Class42();
				this.aClass42_4.method541(arg0);
			}
			local24 = arg0.method294();
			if (local24 != 0) {
				arg0.anInt529--;
				this.aClass42_5 = new Class42();
				this.aClass42_5.method541(arg0);
				this.aClass42_6 = new Class42();
				this.aClass42_6.method541(arg0);
			}
			local24 = arg0.method294();
			if (local24 != 0) {
				arg0.anInt529--;
				this.aClass42_7 = new Class42();
				this.aClass42_7.method541(arg0);
				this.aClass42_8 = new Class42();
				this.aClass42_8.method541(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method308();
				if (local127 == 0) {
					break;
				}
				this.anIntArray181[local116] = local127;
				this.anIntArray182[local116] = arg0.method307();
				this.anIntArray183[local116] = arg0.method308();
			}
			this.anInt721 = arg0.method308();
			this.anInt722 = arg0.method308();
			this.anInt723 = arg0.method296();
			this.anInt724 = arg0.method296();
			this.aClass4_1 = new Class4();
			this.aClass42_9 = new Class42();
			this.aClass4_1.method121(this.aClass42_9, arg0);
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("57122, " + 403 + ", " + arg0 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
