import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ud", name = "dc", descriptor = "I")
	private int anInt3301;

	@OriginalMember(owner = "client!ud", name = "hc", descriptor = "Z")
	private boolean aBoolean121;

	@OriginalMember(owner = "client!ud", name = "ic", descriptor = "I")
	private int anInt3304;

	@OriginalMember(owner = "client!ud", name = "jc", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!ud", name = "kc", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "[I")
	private final int[] anIntArray350 = new int[16];

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "[I")
	private final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "[I")
	public final int[] anIntArray351 = new int[16];

	@OriginalMember(owner = "client!ud", name = "mb", descriptor = "[I")
	public final int[] anIntArray352 = new int[16];

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "[I")
	private final int[] anIntArray349 = new int[16];

	@OriginalMember(owner = "client!ud", name = "Ib", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
	private final int[] anIntArray346 = new int[16];

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
	private final int[] anIntArray348 = new int[16];

	@OriginalMember(owner = "client!ud", name = "ob", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!ud", name = "jb", descriptor = "[[Lclient!f;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray1 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!ud", name = "Db", descriptor = "[[Lclient!f;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray2 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!ud", name = "Vb", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!ud", name = "Sb", descriptor = "[I")
	private final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!ud", name = "ac", descriptor = "[I")
	public final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!ud", name = "Fb", descriptor = "I")
	private int anInt3290 = 256;

	@OriginalMember(owner = "client!ud", name = "Ob", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!ud", name = "Pb", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!ud", name = "qb", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!ud", name = "Tb", descriptor = "Lclient!bf;")
	private final Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!ud", name = "gc", descriptor = "Lclient!ge;")
	private final Class3_Sub2_Sub3 aClass3_Sub2_Sub3_1 = new Class3_Sub2_Sub3(this);

	@OriginalMember(owner = "client!ud", name = "xb", descriptor = "Lclient!wd;")
	private final Class82 aClass82_11 = new Class82(128);

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		this.method2178();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!hf;Lclient!me;ILclient!jb;)Z")
	public synchronized boolean method2171(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class3_Sub14 arg1, @OriginalArg(4) Class25 arg2) {
		arg1.method1474();
		@Pc(17) boolean local17 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class3_Sub18 local34 = (Class3_Sub18) arg1.aClass82_8.method2306(); local34 != null; local34 = (Class3_Sub18) arg1.aClass82_8.method2300()) {
			@Pc(40) int local40 = (int) local34.aLong107;
			@Pc(48) Class3_Sub11 local48 = (Class3_Sub11) this.aClass82_11.method2305((long) local40);
			if (local48 == null) {
				local48 = Static103.method2014(local40, arg2);
				if (local48 == null) {
					local17 = false;
					continue;
				}
				this.aClass82_11.method2303(local48, (long) local40);
			}
			if (!local48.method1158(local34.aByteArray71, arg0, local28)) {
				local17 = false;
			}
		}
		if (local17) {
			arg1.method1475();
		}
		return local17;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
	private void method2173(@OriginalArg(1) int arg0) {
		if ((this.anIntArray360[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method92(); local15 != null; local15 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method90()) {
			if (arg0 == local15.anInt1038) {
				local15.anInt1046 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
	private void method2174(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2199(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method2189(local24, local30, local18);
			} else {
				this.method2199(local18, local24, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2181(local30, local18, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			if (local24 == 0) {
				this.anIntArray359[local18] = (this.anIntArray359[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray359[local18] = (local30 << 7) + (this.anIntArray359[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray357[local18] = (local30 << 7) + (this.anIntArray357[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray357[local18] = local30 + (this.anIntArray357[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray348[local18] = (this.anIntArray348[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray348[local18] = (this.anIntArray348[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray355[local18] = (local30 << 7) + (this.anIntArray355[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray355[local18] = local30 + (this.anIntArray355[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray347[local18] = (local30 << 7) + (this.anIntArray347[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray347[local18] = local30 + (this.anIntArray347[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray346[local18] = (local30 << 7) + (this.anIntArray346[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray346[local18] = (this.anIntArray346[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray360[local18] |= 0x1;
				} else {
					this.anIntArray360[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method2183(local18);
					this.anIntArray360[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray360[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray350[local18] = (local30 << 7) + (this.anIntArray350[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray350[local18] = local30 + (this.anIntArray350[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray350[local18] = (local30 << 7) + (this.anIntArray350[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray350[local18] = local30 + (this.anIntArray350[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method2201(local18);
			}
			if (local24 == 121) {
				this.method2190(local18);
			}
			if (local24 == 123) {
				this.method2196(local18);
			}
			@Pc(504) int local504;
			if (local24 == 6) {
				local504 = this.anIntArray350[local18];
				if (local504 == 16384) {
					this.anIntArray353[local18] = (local30 << 7) + (this.anIntArray353[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local504 = this.anIntArray350[local18];
				if (local504 == 16384) {
					this.anIntArray353[local18] = (this.anIntArray353[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray352[local18] = (local30 << 7) + (this.anIntArray352[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray352[local18] = local30 + (this.anIntArray352[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray360[local18] |= 0x4;
				} else {
					this.method2173(local18);
					this.anIntArray360[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method2203(local18, (local30 << 7) + (this.anIntArray349[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method2203(local18, (this.anIntArray349[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2202(local24 + this.anIntArray359[local18], local18);
		} else if (local9 == 208) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method2182(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2187(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2178();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[ILclient!f;BI)Z")
	public boolean method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class3_Sub8 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt1039 = Static68.anInt2134 / 100;
		if (arg2.anInt1029 >= 0 && (arg2.aClass3_Sub2_Sub1_3 == null || arg2.aClass3_Sub2_Sub1_3.method168())) {
			arg2.method679();
			arg2.method2264();
			if (arg2.anInt1045 > 0 && arg2 == this.aClass3_Sub8ArrayArray2[arg2.anInt1038][arg2.anInt1045]) {
				this.aClass3_Sub8ArrayArray2[arg2.anInt1038][arg2.anInt1045] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg2.anInt1033;
		@Pc(67) boolean local67 = false;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray348[arg2.anInt1038] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg2.anInt1033 = local59;
		}
		arg2.aClass3_Sub2_Sub1_3.method182(this.method2186(arg2));
		arg2.anInt1028++;
		@Pc(128) double local128 = (double) ((arg2.anInt1033 * arg2.anInt1031 >> 12) + (arg2.anInt1036 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(131) Class70 local131 = arg2.aClass70_1;
		arg2.anInt1043 += local131.anInt3107;
		if (local131.anInt3102 > 0) {
			if (local131.anInt3103 <= 0) {
				arg2.anInt1042 += 128;
			} else {
				arg2.anInt1042 += (int) (Math.pow(2.0D, (double) local131.anInt3103 * local128) * 128.0D + 0.5D);
			}
		}
		if (local131.aByteArray82 != null) {
			if (local131.anInt3097 <= 0) {
				arg2.anInt1047 += 128;
			} else {
				arg2.anInt1047 += (int) (Math.pow(2.0D, local128 * (double) local131.anInt3097) * 128.0D + 0.5D);
			}
			while (arg2.anInt1034 < local131.aByteArray82.length - 2 && arg2.anInt1047 > (local131.aByteArray82[arg2.anInt1034 + 2] & 0xFF) << 8) {
				arg2.anInt1034 += 2;
			}
			if (arg2.anInt1034 == local131.aByteArray82.length - 2 && local131.aByteArray82[arg2.anInt1034 + 1] == 0) {
				local67 = true;
			}
		}
		if (arg2.anInt1029 >= 0 && local131.aByteArray81 != null && (this.anIntArray360[arg2.anInt1038] & 0x1) == 0 && (arg2.anInt1045 < 0 || this.aClass3_Sub8ArrayArray2[arg2.anInt1038][arg2.anInt1045] != arg2)) {
			if (local131.anInt3109 > 0) {
				arg2.anInt1029 += (int) (Math.pow(2.0D, (double) local131.anInt3109 * local128) * 128.0D + 0.5D);
			} else {
				arg2.anInt1029 += 128;
			}
			while (arg2.anInt1027 < local131.aByteArray81.length - 2 && arg2.anInt1029 > (local131.aByteArray81[arg2.anInt1027 + 2] & 0xFF) << 8) {
				arg2.anInt1027 += 2;
			}
			if (local131.aByteArray81.length - 2 == arg2.anInt1027) {
				local67 = true;
			}
		}
		if (!local67) {
			arg2.aClass3_Sub2_Sub1_3.method201(arg2.anInt1039, this.method2191(arg2), this.method2197(arg2));
			return false;
		}
		arg2.aClass3_Sub2_Sub1_3.method176(arg2.anInt1039);
		if (arg1 == null) {
			arg2.aClass3_Sub2_Sub1_3.method2169(arg0);
		} else {
			arg2.aClass3_Sub2_Sub1_3.method2164(arg1, arg3, arg0);
		}
		if (arg2.aClass3_Sub2_Sub1_3.method181()) {
			this.aClass3_Sub2_Sub3_1.aClass3_Sub2_Sub2_1.method716(arg2.aClass3_Sub2_Sub1_3);
		}
		arg2.method679();
		if (arg2.anInt1029 >= 0) {
			arg2.method2264();
			if (arg2.anInt1045 > 0 && this.aClass3_Sub8ArrayArray2[arg2.anInt1038][arg2.anInt1045] == arg2) {
				this.aClass3_Sub8ArrayArray2[arg2.anInt1038][arg2.anInt1045] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!me;IZ)V")
	public synchronized void method2177(@OriginalArg(0) Class3_Sub14 arg0, @OriginalArg(2) boolean arg1) {
		this.method2204();
		this.aClass11_1.method300(arg0.aByteArray60);
		this.aLong104 = 0L;
		this.aBoolean121 = arg1;
		@Pc(29) int local29 = this.aClass11_1.method299();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass11_1.method302(local31);
			this.aClass11_1.method295(local31);
			this.aClass11_1.method298(local31);
		}
		this.anInt3301 = this.aClass11_1.method294();
		this.anInt3304 = this.aClass11_1.anIntArray43[this.anInt3301];
		this.aLong103 = this.aClass11_1.method301(this.anInt3304);
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	private void method2178() {
		this.method2201(-1);
		this.method2190(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray358[local23] = this.anIntArray354[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray359[local41] = this.anIntArray354[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBII)V")
	private void method2181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	private void method2182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V")
	private void method2183(@OriginalArg(0) int arg0) {
		if ((this.anIntArray360[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(20) Class3_Sub8 local20 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method92(); local20 != null; local20 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method90()) {
			if (arg0 == local20.anInt1038 && this.aClass3_Sub8ArrayArray1[arg0][local20.anInt1036] == null && local20.anInt1029 < 0) {
				local20.anInt1029 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "()Lclient!mc;")
	@Override
	public synchronized Class3_Sub2 method2167() {
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
	public synchronized void method2184() {
		for (@Pc(11) Class3_Sub11 local11 = (Class3_Sub11) this.aClass82_11.method2306(); local11 != null; local11 = (Class3_Sub11) this.aClass82_11.method2300()) {
			local11.method2264();
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V")
	public synchronized void method2185() {
		this.method2192();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!f;B)I")
	private int method2186(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(14) int local14 = (arg0.anInt1033 * arg0.anInt1031 >> 12) + arg0.anInt1032;
		local14 += this.anIntArray353[arg0.anInt1038] * (this.anIntArray356[arg0.anInt1038] - 8192) >> 12;
		@Pc(42) Class70 local42 = arg0.aClass70_1;
		@Pc(67) int local67;
		if (local42.anInt3107 > 0 && (local42.anInt3101 > 0 || this.anIntArray357[arg0.anInt1038] > 0)) {
			@Pc(62) int local62 = local42.anInt3106 << 1;
			local67 = local42.anInt3101 << 2;
			if (local62 > arg0.anInt1028) {
				local67 = local67 * arg0.anInt1028 / local62;
			}
			local67 += this.anIntArray357[arg0.anInt1038] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt1043 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local101 * (double) local67);
		}
		local67 = (int) ((double) (arg0.aClass3_Sub9_Sub1_1.anInt1103 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static68.anInt2134 + 0.5D);
		return local67 < 1 ? 1 : local67;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)V")
	private void method2187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray356[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(II)V")
	public synchronized void method2188(@OriginalArg(1) int arg0) {
		this.anInt3290 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
	private void method2189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2199(arg2, arg0, 64);
		if ((this.anIntArray360[arg2] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub8 local28 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method94(); local28 != null; local28 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method79()) {
				if (arg2 == local28.anInt1038 && local28.anInt1029 < 0) {
					this.aClass3_Sub8ArrayArray1[arg2][local28.anInt1036] = null;
					this.aClass3_Sub8ArrayArray1[arg2][arg0] = local28;
					@Pc(70) int local70 = (local28.anInt1033 * local28.anInt1031 >> 12) + local28.anInt1032;
					local28.anInt1032 += arg0 - local28.anInt1036 << 8;
					local28.anInt1033 = 4096;
					local28.anInt1036 = arg0;
					local28.anInt1031 = local70 - local28.anInt1032;
					return;
				}
			}
		}
		@Pc(116) Class3_Sub11 local116 = (Class3_Sub11) this.aClass82_11.method2305((long) this.anIntArray358[arg2]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class3_Sub9_Sub1 local124 = local116.aClass3_Sub9_Sub1Array1[arg0];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class3_Sub8 local131 = new Class3_Sub8();
		local131.aClass3_Sub9_Sub1_1 = local124;
		local131.aClass3_Sub11_1 = local116;
		local131.anInt1038 = arg2;
		local131.aClass70_1 = local116.aClass70Array1[arg0];
		local131.anInt1045 = local116.aByteArray45[arg0];
		local131.anInt1036 = arg0;
		local131.anInt1044 = arg1 * arg1 * local116.anInt1787 * local116.aByteArray46[arg0] + 1024 >> 11;
		local131.anInt1037 = local116.aByteArray47[arg0] & 0xFF;
		local131.anInt1032 = (arg0 << 8) - (local116.aShortArray7[arg0] & 0x7FFF);
		local131.anInt1047 = 0;
		local131.anInt1034 = 0;
		local131.anInt1029 = -1;
		local131.anInt1027 = 0;
		local131.anInt1042 = 0;
		if (this.anIntArray352[arg2] == 0) {
			local131.aClass3_Sub2_Sub1_3 = Static131.method185(local124, this.method2186(local131), this.method2191(local131), this.method2197(local131));
		} else {
			local131.aClass3_Sub2_Sub1_3 = Static131.method185(local124, this.method2186(local131), 0, this.method2197(local131));
			this.method2198(local131, local116.aShortArray7[arg0] < 0);
		}
		if (local116.aShortArray7[arg0] < 0) {
			local131.aClass3_Sub2_Sub1_3.method163(-1);
		}
		if (local131.anInt1045 >= 0) {
			@Pc(288) Class3_Sub8 local288 = this.aClass3_Sub8ArrayArray2[arg2][local131.anInt1045];
			if (local288 != null && local288.anInt1029 < 0) {
				this.aClass3_Sub8ArrayArray1[arg2][local288.anInt1036] = null;
				local288.anInt1029 = 0;
			}
			this.aClass3_Sub8ArrayArray2[arg2][local131.anInt1045] = local131;
		}
		this.aClass3_Sub2_Sub3_1.aClass5_10.method87(local131);
		this.aClass3_Sub8ArrayArray1[arg2][arg0] = local131;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(II)V")
	private void method2190(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2190(local12);
			}
			return;
		}
		this.anIntArray355[arg0] = 12800;
		this.anIntArray347[arg0] = 8192;
		this.anIntArray346[arg0] = 16383;
		this.anIntArray356[arg0] = 8192;
		this.anIntArray357[arg0] = 0;
		this.anIntArray348[arg0] = 8192;
		this.method2183(arg0);
		this.method2173(arg0);
		this.anIntArray360[arg0] = 0;
		this.anIntArray350[arg0] = 32767;
		this.anIntArray353[arg0] = 256;
		this.anIntArray352[arg0] = 0;
		this.method2203(arg0, 8192);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "()Lclient!mc;")
	@Override
	public synchronized Class3_Sub2 method2166() {
		return this.aClass3_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2170() {
		return 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!f;I)I")
	private int method2191(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(2) Class70 local2 = arg0.aClass70_1;
		@Pc(22) int local22 = this.anIntArray355[arg0.anInt1038] * this.anIntArray346[arg0.anInt1038] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(45) int local45 = local30 * arg0.anInt1044 + 16384 >> 15;
		local22 = this.anInt3290 * local45 + 128 >> 8;
		if (local2.anInt3102 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) local2.anInt3102 * 1.953125E-5D * (double) arg0.anInt1042) + 0.5D);
		}
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(107) int local107;
		@Pc(119) int local119;
		if (local2.aByteArray82 != null) {
			local81 = arg0.anInt1047;
			local89 = local2.aByteArray82[arg0.anInt1034 + 1];
			if (local2.aByteArray82.length - 2 > arg0.anInt1034) {
				local107 = (local2.aByteArray82[arg0.anInt1034] & 0xFF) << 8;
				local119 = (local2.aByteArray82[arg0.anInt1034 + 2] & 0xFF) << 8;
				local89 += (local2.aByteArray82[arg0.anInt1034 + 3] - local89) * (local81 - local107) / (local119 - local107);
			}
			local22 = local22 * local89 + 32 >> 6;
		}
		if (arg0.anInt1029 > 0 && local2.aByteArray81 != null) {
			local81 = arg0.anInt1029;
			local89 = local2.aByteArray81[arg0.anInt1027 + 1];
			if (local2.aByteArray81.length - 2 > arg0.anInt1027) {
				local107 = (local2.aByteArray81[arg0.anInt1027] & 0xFF) << 8;
				local119 = (local2.aByteArray81[arg0.anInt1027 + 2] & 0xFF) << 8;
				local89 += (local81 - local107) * (local2.aByteArray81[arg0.anInt1027 + 3] - local89) / (local119 - local107);
			}
			local22 = local22 * local89 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)V")
	private void method2192() {
		this.anIntArray354[9] = 128;
		this.anIntArray359[9] = 128;
		this.method2202(128, 9);
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)I")
	public int method2193() {
		return this.anInt3290;
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)Z")
	public synchronized boolean method2194() {
		return this.aClass11_1.method303();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!f;)Z")
	public boolean method2195(@OriginalArg(1) Class3_Sub8 arg0) {
		if (arg0.aClass3_Sub2_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt1029 >= 0) {
			arg0.method2264();
			if (arg0.anInt1045 > 0 && this.aClass3_Sub8ArrayArray2[arg0.anInt1038][arg0.anInt1045] == arg0) {
				this.aClass3_Sub8ArrayArray2[arg0.anInt1038][arg0.anInt1045] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(II)V")
	private void method2196(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class3_Sub8 local16 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method92(); local16 != null; local16 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method90()) {
			if ((arg0 < 0 || local16.anInt1038 == arg0) && local16.anInt1029 < 0) {
				this.aClass3_Sub8ArrayArray1[local16.anInt1038][local16.anInt1036] = null;
				local16.anInt1029 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lclient!f;I)I")
	private int method2197(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(5) int local5 = this.anIntArray347[arg0.anInt1038];
		return local5 < 8192 ? arg0.anInt1037 * local5 + 32 >> 6 : 16384 - ((128 - arg0.anInt1037) * (-local5 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!f;ZZ)V")
	public void method2198(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) int local4 = arg0.aClass3_Sub9_Sub1_1.aByteArray32.length;
		@Pc(23) int local23;
		if (arg1 && arg0.aClass3_Sub9_Sub1_1.aBoolean33) {
			@Pc(34) int local34 = local4 + local4 - arg0.aClass3_Sub9_Sub1_1.anInt1104;
			local4 <<= 0x8;
			local23 = (int) ((long) local34 * (long) this.anIntArray352[arg0.anInt1038] >> 6);
			if (local23 >= local4) {
				local23 = local4 + local4 - local23 - 1;
				arg0.aClass3_Sub2_Sub1_3.method165();
			}
		} else {
			local23 = (int) ((long) local4 * (long) this.anIntArray352[arg0.anInt1038] >> 6);
		}
		arg0.aClass3_Sub2_Sub1_3.method199(local23);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIII)V")
	private void method2199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub8 local12 = this.aClass3_Sub8ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub8ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray360[arg0] & 0x2) == 0) {
			local12.anInt1029 = 0;
			return;
		}
		for (@Pc(45) Class3_Sub8 local45 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method92(); local45 != null; local45 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method90()) {
			if (local12.anInt1038 == local45.anInt1038 && local45.anInt1029 < 0 && local12 != local45) {
				local12.anInt1029 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
	public synchronized void method2200() {
		for (@Pc(11) Class3_Sub11 local11 = (Class3_Sub11) this.aClass82_11.method2306(); local11 != null; local11 = (Class3_Sub11) this.aClass82_11.method2300()) {
			local11.method1161();
		}
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method2169(@OriginalArg(0) int arg0) {
		if (this.aClass11_1.method303()) {
			@Pc(17) int local17 = this.aClass11_1.anInt322 * 1000000 / Static68.anInt2134;
			do {
				@Pc(26) long local26 = (long) local17 * (long) arg0 + this.aLong104;
				if (this.aLong103 - local26 >= 0L) {
					this.aLong104 = local26;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong103 + (long) local17 - this.aLong104 - 1L) / (long) local17);
				arg0 -= local58;
				this.aLong104 += (long) local17 * (long) local58;
				this.aClass3_Sub2_Sub3_1.method2169(local58);
				this.method2205();
			} while (this.aClass11_1.method303());
		}
		this.aClass3_Sub2_Sub3_1.method2169(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(II)V")
	private void method2201(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub8 local12 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method92(); local12 != null; local12 = (Class3_Sub8) this.aClass3_Sub2_Sub3_1.aClass5_10.method90()) {
			if (arg0 < 0 || arg0 == local12.anInt1038) {
				if (local12.aClass3_Sub2_Sub1_3 != null) {
					local12.aClass3_Sub2_Sub1_3.method176(Static68.anInt2134 / 100);
					if (local12.aClass3_Sub2_Sub1_3.method181()) {
						this.aClass3_Sub2_Sub3_1.aClass3_Sub2_Sub2_1.method716(local12.aClass3_Sub2_Sub1_3);
					}
					local12.method679();
				}
				if (local12.anInt1029 < 0) {
					this.aClass3_Sub8ArrayArray1[local12.anInt1038][local12.anInt1036] = null;
				}
				local12.method2264();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2164(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass11_1.method303()) {
			@Pc(17) int local17 = this.aClass11_1.anInt322 * 1000000 / Static68.anInt2134;
			do {
				@Pc(26) long local26 = (long) arg2 * (long) local17 + this.aLong104;
				if (this.aLong103 - local26 >= 0L) {
					this.aLong104 = local26;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local17 + this.aLong103 - this.aLong104 - 1L) / (long) local17);
				this.aLong104 += (long) local17 * (long) local55;
				arg2 -= local55;
				this.aClass3_Sub2_Sub3_1.method2164(arg0, arg1, local55);
				this.method2205();
				arg1 += local55;
			} while (this.aClass11_1.method303());
		}
		this.aClass3_Sub2_Sub3_1.method2164(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)V")
	private void method2202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray358[arg1] != arg0) {
			this.anIntArray358[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass3_Sub8ArrayArray2[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(ZII)V")
	private void method2203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray349[arg0] = arg1;
		this.anIntArray351[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)V")
	public synchronized void method2204() {
		this.aClass11_1.method297();
		this.method2178();
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)V")
	private void method2205() {
		@Pc(4) int local4 = this.anInt3301;
		@Pc(17) int local17 = this.anInt3304;
		@Pc(20) long local20 = this.aLong103;
		while (local17 == this.anInt3304) {
			while (this.aClass11_1.anIntArray43[local4] == local17) {
				this.aClass11_1.method302(local4);
				@Pc(31) int local31 = this.aClass11_1.method293(local4);
				if (local31 == 1) {
					this.aClass11_1.method291();
					this.aClass11_1.method298(local4);
					if (this.aClass11_1.method296()) {
						if (!this.aBoolean121 || local17 == 0) {
							this.method2178();
							this.aClass11_1.method297();
							return;
						}
						this.aClass11_1.method304(local20);
					}
					break;
				}
				if ((local31 & 0x80) != 0) {
					this.method2174(local31);
				}
				this.aClass11_1.method295(local4);
				this.aClass11_1.method298(local4);
			}
			local4 = this.aClass11_1.method294();
			local17 = this.aClass11_1.anIntArray43[local4];
			local20 = this.aClass11_1.method301(local17);
		}
		this.aLong103 = local20;
		this.anInt3301 = local4;
		this.anInt3304 = local17;
	}
}
