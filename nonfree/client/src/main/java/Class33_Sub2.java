import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "[Lclient!at;")
	private Class15[] aClass15Array4;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "[Lclient!eo;")
	private Class68[] aClass68Array1;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "Lclient!bj;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "[I")
	private int[] anIntArray476;

	@OriginalMember(owner = "client!vj", name = "D", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!vj", name = "J", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!vj", name = "N", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!vj", name = "T", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
	private int anInt7133;

	@OriginalMember(owner = "client!vj", name = "W", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
	private int anInt7135;

	@OriginalMember(owner = "client!vj", name = "Z", descriptor = "[B")
	private byte[] aByteArray92;

	@OriginalMember(owner = "client!vj", name = "ab", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!vj", name = "bb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!vj", name = "cb", descriptor = "[Lclient!sk;")
	private Class221[] aClass221Array1;

	@OriginalMember(owner = "client!vj", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray182;

	@OriginalMember(owner = "client!vj", name = "kb", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!vj", name = "mb", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!vj", name = "ob", descriptor = "Lclient!ap;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!vj", name = "rb", descriptor = "B")
	private byte aByte102;

	@OriginalMember(owner = "client!vj", name = "vb", descriptor = "Lclient!nc;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!vj", name = "wb", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!vj", name = "yb", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!vj", name = "Cb", descriptor = "[[I")
	private int[][] anIntArrayArray183;

	@OriginalMember(owner = "client!vj", name = "Db", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!vj", name = "Eb", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!vj", name = "Gb", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!vj", name = "Ob", descriptor = "[Lclient!u;")
	private Class239[] aClass239Array4;

	@OriginalMember(owner = "client!vj", name = "Qb", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!vj", name = "Tb", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!vj", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray184;

	@OriginalMember(owner = "client!vj", name = "Xb", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!vj", name = "Yb", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!vj", name = "ac", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!vj", name = "cc", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!vj", name = "gc", descriptor = "I")
	private int anInt7167;

	@OriginalMember(owner = "client!vj", name = "ic", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!vj", name = "jc", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!vj", name = "S", descriptor = "Z")
	private boolean aBoolean589 = false;

	@OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
	private int anInt7131 = 0;

	@OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
	private int anInt7123 = 0;

	@OriginalMember(owner = "client!vj", name = "ub", descriptor = "I")
	private int anInt7146 = 0;

	@OriginalMember(owner = "client!vj", name = "Mb", descriptor = "I")
	private int anInt7156 = 0;

	@OriginalMember(owner = "client!vj", name = "mc", descriptor = "Z")
	private boolean aBoolean590 = true;

	@OriginalMember(owner = "client!vj", name = "qb", descriptor = "I")
	private int anInt7143 = 0;

	@OriginalMember(owner = "client!vj", name = "xb", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_42;

	@OriginalMember(owner = "client!vj", name = "oc", descriptor = "Lclient!bg;")
	private Class21 aClass21_16;

	@OriginalMember(owner = "client!vj", name = "Sb", descriptor = "Lclient!bg;")
	private Class21 aClass21_15;

	@OriginalMember(owner = "client!vj", name = "ib", descriptor = "Lclient!bg;")
	private Class21 aClass21_14;

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "Lclient!bg;")
	private Class21 aClass21_13;

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "Lclient!gb;")
	private Class89 aClass89_1;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class33_Sub2(@OriginalArg(0) Class128_Sub2 arg0) {
		this.aClass128_Sub2_42 = arg0;
		this.aClass21_16 = new Class21(null, 5126, 3, 0);
		this.aClass21_15 = new Class21(null, 5126, 2, 0);
		this.aClass21_14 = new Class21(null, 5126, 3, 0);
		this.aClass21_13 = new Class21(null, 5121, 4, 0);
		this.aClass89_1 = new Class89();
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!od;Lclient!qc;IIII)V")
	public Class33_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7135 = arg5;
		this.anInt7133 = arg2;
		this.aClass128_Sub2_42 = arg0;
		if (Static133.method1795(arg2, arg5)) {
			this.aClass21_16 = new Class21(null, 5126, 3, 0);
		}
		if (Static328.method4203(arg2, arg5)) {
			this.aClass21_15 = new Class21(null, 5126, 2, 0);
		}
		if (Static289.method3776(arg2, arg5)) {
			this.aClass21_14 = new Class21(null, 5126, 3, 0);
		}
		if (Static280.method3526(arg5, arg2)) {
			this.aClass21_13 = new Class21(null, 5121, 4, 0);
		}
		if (Static447.method5582(arg2, arg5)) {
			this.aClass89_1 = new Class89();
		}
		@Pc(102) Interface8 local102 = arg0.anInterface8_8;
		this.anIntArray477 = new int[arg1.anInt5309 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt5299];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt5299; local115++) {
			if ((arg1.aByteArray57 == null || arg1.aByteArray57[local115] != 2) && (arg1.aShortArray63 == null || arg1.aShortArray63[local115] == -1 || !local102.method1375(arg1.aShortArray63[local115] & 0xFFFF).aBoolean435)) {
				local113[this.anInt7131++] = local115;
				this.anIntArray477[arg1.aShortArray65[local115]]++;
				this.anIntArray477[arg1.aShortArray64[local115]]++;
				this.anIntArray477[arg1.aShortArray56[local115]]++;
			}
		}
		this.anInt7146 = this.anInt7131;
		@Pc(205) long[] local205 = new long[this.anInt7131];
		@Pc(214) boolean local214 = (this.anInt7133 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(369) int local369;
		label490: for (@Pc(216) int local216 = 0; local216 < this.anInt7131; local216++) {
			@Pc(222) int local222 = local113[local216];
			@Pc(224) Class201 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass156Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass156Array1.length; local237++) {
					@Pc(244) Class156 local244 = arg1.aClass156Array1[local237];
					if (local222 == local244.anInt3988) {
						@Pc(253) Class139 local253 = Static135.method1817(local244.anInt3993);
						if (local253.aBoolean256) {
							local205[local216] = Long.MAX_VALUE;
							this.anInt7146--;
							continue label490;
						}
					}
				}
			}
			@Pc(280) short local280 = -1;
			if (arg1.aShortArray63 != null) {
				local280 = arg1.aShortArray63[local222];
				if (local280 != -1) {
					local224 = local102.method1375(local280 & 0xFFFF);
					local232 = local224.aByte64;
					local230 = local224.aByte61;
				}
			}
			@Pc(325) boolean local325 = arg1.aByteArray55 != null && arg1.aByteArray55[local222] != 0 || local224 != null && !local224.aBoolean433;
			if ((local214 || local325) && arg1.aByteArray56 != null) {
				local226 += arg1.aByteArray56[local222] << 17;
			}
			if (local325) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local226 += local232 & 0xFF;
			local369 = local228 + ((local280 & 0xFFFF) << 16);
			@Pc(375) int local375 = local369 + (local216 & 0xFFFF);
			local205[local216] = ((long) local226 << 32) + (long) local375;
		}
		Static155.method2182(local113, local205);
		this.anInt7156 = arg1.anInt5309;
		this.anIntArray479 = arg1.anIntArray313;
		this.aShortArray106 = arg1.aShortArray61;
		this.anInt7123 = arg1.anInt5308;
		this.anIntArray480 = arg1.anIntArray318;
		this.anIntArray478 = arg1.anIntArray319;
		this.aClass15Array4 = arg1.aClass15Array2;
		this.aClass239Array4 = arg1.aClass239Array2;
		@Pc(430) Class232[] local430 = new Class232[this.anInt7156];
		@Pc(450) int local450;
		@Pc(464) int local464;
		if (arg1.aClass156Array1 != null) {
			this.anInt7167 = arg1.aClass156Array1.length;
			this.aClass221Array1 = new Class221[this.anInt7167];
			this.aClass68Array1 = new Class68[this.anInt7167];
			for (local450 = 0; local450 < this.anInt7167; local450++) {
				@Pc(457) Class156 local457 = arg1.aClass156Array1[local450];
				@Pc(462) Class139 local462 = Static135.method1817(local457.anInt3993);
				local464 = -1;
				for (@Pc(466) int local466 = 0; local466 < this.anInt7131; local466++) {
					if (local457.anInt3988 == local113[local466]) {
						local464 = local466;
						break;
					}
				}
				if (local464 == -1) {
					throw new RuntimeException();
				}
				local237 = Static55.anIntArray48[arg1.aShortArray57[local457.anInt3988] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray55 == null ? 0 : arg1.aByteArray55[local457.anInt3988]) << 24;
				this.aClass221Array1[local450] = new Class221(local464, arg1.aShortArray65[local457.anInt3988], arg1.aShortArray64[local457.anInt3988], arg1.aShortArray56[local457.anInt3988], local462.anInt3370, local462.anInt3375, local462.anInt3374, local462.anInt3376, local462.anInt3373, local462.aBoolean256, local462.aBoolean257, local457.anInt3987);
				this.aClass68Array1[local450] = new Class68(local237);
			}
		}
		local450 = this.anInt7131 * 3;
		this.aByteArray93 = new byte[local450];
		this.aShortArray111 = new short[local450];
		this.aShortArray115 = new short[local450];
		this.aShortArray112 = new short[this.anInt7131];
		this.aByteArray92 = new byte[this.anInt7131];
		this.aShortArray110 = new short[this.anInt7131];
		if (arg1.aShortArray62 != null) {
			this.aShortArray113 = new short[this.anInt7131];
		}
		this.aShortArray105 = new short[local450];
		this.aShortArray107 = new short[this.anInt7131];
		this.aFloatArray32 = new float[local450];
		this.aShort94 = (short) arg3;
		this.aFloatArray31 = new float[local450];
		this.aShort96 = (short) arg4;
		this.aShortArray108 = new short[this.anInt7131];
		this.aShortArray114 = new short[local450];
		this.aShortArray109 = new short[this.anInt7131];
		Static261.aLongArray4 = new long[local450];
		local226 = 0;
		for (local369 = 0; local369 < arg1.anInt5309; local369++) {
			local464 = this.anIntArray477[local369];
			this.anIntArray477[local369] = local226;
			local226 += local464;
			local430[local369] = new Class232();
		}
		this.anIntArray477[arg1.anInt5309] = local226;
		@Pc(702) int[] local702 = null;
		@Pc(704) int[] local704 = null;
		@Pc(706) int[] local706 = null;
		@Pc(708) float[][] local708 = null;
		@Pc(734) int local734;
		@Pc(773) int local773;
		@Pc(779) int local779;
		@Pc(793) int local793;
		@Pc(795) int local795;
		@Pc(826) int local826;
		@Pc(831) int local831;
		@Pc(1000) float local1000;
		@Pc(984) float local984;
		@Pc(992) float local992;
		if (arg1.aByteArray54 != null) {
			@Pc(714) int local714 = arg1.anInt5304;
			@Pc(717) int[] local717 = new int[local714];
			@Pc(720) int[] local720 = new int[local714];
			@Pc(723) int[] local723 = new int[local714];
			@Pc(726) int[] local726 = new int[local714];
			@Pc(729) int[] local729 = new int[local714];
			@Pc(732) int[] local732 = new int[local714];
			for (local734 = 0; local734 < local714; local734++) {
				local717[local734] = Integer.MAX_VALUE;
				local720[local734] = -2147483647;
				local723[local734] = Integer.MAX_VALUE;
				local726[local734] = -2147483647;
				local729[local734] = Integer.MAX_VALUE;
				local732[local734] = -2147483647;
			}
			local708 = new float[local714][];
			for (local773 = 0; local773 < this.anInt7131; local773++) {
				local779 = local113[local773];
				if (arg1.aByteArray54[local779] != -1) {
					local793 = arg1.aByteArray54[local779] & 0xFF;
					for (local795 = 0; local795 < 3; local795++) {
						@Pc(804) short local804;
						if (local795 == 0) {
							local804 = arg1.aShortArray65[local779];
						} else if (local795 == 1) {
							local804 = arg1.aShortArray64[local779];
						} else {
							local804 = arg1.aShortArray56[local779];
						}
						local826 = arg1.anIntArray319[local804];
						local831 = arg1.anIntArray318[local804];
						@Pc(836) int local836 = arg1.anIntArray313[local804];
						if (local826 < local717[local793]) {
							local717[local793] = local826;
						}
						if (local720[local793] < local826) {
							local720[local793] = local826;
						}
						if (local723[local793] > local831) {
							local723[local793] = local831;
						}
						if (local726[local793] < local831) {
							local726[local793] = local831;
						}
						if (local836 < local729[local793]) {
							local729[local793] = local836;
						}
						if (local836 > local732[local793]) {
							local732[local793] = local836;
						}
					}
				}
			}
			local702 = new int[local714];
			local706 = new int[local714];
			local704 = new int[local714];
			for (local779 = 0; local779 < local714; local779++) {
				@Pc(927) byte local927 = arg1.aByteArray59[local779];
				if (local927 > 0) {
					local702[local779] = (local720[local779] + local717[local779]) / 2;
					local704[local779] = (local726[local779] + local723[local779]) / 2;
					local706[local779] = (local732[local779] + local729[local779]) / 2;
					if (local927 == 1) {
						local831 = arg1.anIntArray322[local779];
						if (local831 == 0) {
							local984 = 1.0F;
							local1000 = 1.0F;
						} else if (local831 > 0) {
							local1000 = 1.0F;
							local984 = (float) local831 / 1024.0F;
						} else {
							local984 = 1.0F;
							local1000 = (float) -local831 / 1024.0F;
						}
						local992 = 64.0F / (float) arg1.anIntArray320[local779];
					} else if (local927 == 2) {
						local984 = 64.0F / (float) arg1.anIntArray317[local779];
						local992 = 64.0F / (float) arg1.anIntArray320[local779];
						local1000 = 64.0F / (float) arg1.anIntArray322[local779];
					} else {
						local984 = (float) arg1.anIntArray317[local779] / 1024.0F;
						local992 = (float) arg1.anIntArray320[local779] / 1024.0F;
						local1000 = (float) arg1.anIntArray322[local779] / 1024.0F;
					}
					local708[local779] = Static418.method5195(local984, arg1.aShortArray58[local779], arg1.aShortArray59[local779], arg1.aByteArray53[local779] & 0xFF, arg1.aShortArray60[local779], local1000, local992);
				}
			}
		}
		@Pc(1108) Class85[] local1108 = new Class85[arg1.anInt5299];
		@Pc(1127) short local1127;
		@Pc(1137) int local1137;
		@Pc(1148) int local1148;
		@Pc(1207) int local1207;
		for (@Pc(1110) int local1110 = 0; local1110 < arg1.anInt5299; local1110++) {
			@Pc(1117) short local1117 = arg1.aShortArray65[local1110];
			@Pc(1122) short local1122 = arg1.aShortArray64[local1110];
			local1127 = arg1.aShortArray56[local1110];
			local1137 = this.anIntArray478[local1122] - this.anIntArray478[local1117];
			local1148 = this.anIntArray480[local1122] - this.anIntArray480[local1117];
			local734 = this.anIntArray479[local1122] - this.anIntArray479[local1117];
			local773 = this.anIntArray478[local1127] - this.anIntArray478[local1117];
			local779 = this.anIntArray480[local1127] - this.anIntArray480[local1117];
			local793 = this.anIntArray479[local1127] - this.anIntArray479[local1117];
			local795 = local1148 * local793 - local734 * local779;
			local1207 = local734 * local773 - local1137 * local793;
			for (local826 = local1137 * local779 - local773 * local1148; local795 > 8192 || local1207 > 8192 || local826 > 8192 || local795 < -8192 || local1207 < -8192 || local826 < -8192; local826 >>= 0x1) {
				local795 >>= 0x1;
				local1207 >>= 0x1;
			}
			local831 = (int) Math.sqrt((double) (local826 * local826 + local1207 * local1207 + local795 * local795));
			if (local831 <= 0) {
				local831 = 1;
			}
			local795 = local795 * 256 / local831;
			local1207 = local1207 * 256 / local831;
			local826 = local826 * 256 / local831;
			@Pc(1302) byte local1302 = arg1.aByteArray57 == null ? 0 : arg1.aByteArray57[local1110];
			if (local1302 == 0) {
				@Pc(1333) Class232 local1333 = local430[local1117];
				local1333.anInt6398 += local1207;
				local1333.anInt6391 += local826;
				local1333.anInt6396 += local795;
				local1333.anInt6393++;
				@Pc(1361) Class232 local1361 = local430[local1122];
				local1361.anInt6391 += local826;
				local1361.anInt6398 += local1207;
				local1361.anInt6393++;
				local1361.anInt6396 += local795;
				@Pc(1389) Class232 local1389 = local430[local1127];
				local1389.anInt6398 += local1207;
				local1389.anInt6391 += local826;
				local1389.anInt6396 += local795;
				local1389.anInt6393++;
			} else if (local1302 == 1) {
				@Pc(1318) Class85 local1318 = local1108[local1110] = new Class85();
				local1318.anInt2137 = local826;
				local1318.anInt2136 = local1207;
				local1318.anInt2135 = local795;
			}
		}
		@Pc(1426) int local1426;
		for (@Pc(1420) int local1420 = 0; local1420 < this.anInt7131; local1420++) {
			local1426 = local113[local1420];
			@Pc(1433) int local1433 = arg1.aShortArray57[local1426] & 0xFFFF;
			@Pc(1441) short local1441;
			if (arg1.aShortArray63 == null) {
				local1441 = -1;
			} else {
				local1441 = arg1.aShortArray63[local1426];
			}
			if (arg1.aByteArray54 == null) {
				local1148 = -1;
			} else {
				local1148 = arg1.aByteArray54[local1426];
			}
			if (arg1.aByteArray55 == null) {
				local734 = 0;
			} else {
				local734 = arg1.aByteArray55[local1426] & 0xFF;
			}
			@Pc(1473) float local1473 = 0.0F;
			@Pc(1475) float local1475 = 0.0F;
			@Pc(1477) float local1477 = 0.0F;
			local1000 = 0.0F;
			local992 = 0.0F;
			local984 = 0.0F;
			@Pc(1485) byte local1485 = 0;
			@Pc(1487) byte local1487 = 0;
			@Pc(1489) int local1489 = 0;
			@Pc(1505) byte local1505;
			@Pc(1522) short local1522;
			@Pc(2260) short local2260;
			@Pc(2265) short local2265;
			if (local1441 != -1) {
				if (local1148 == -1) {
					local992 = 0.0F;
					local1487 = 2;
					local1477 = 1.0F;
					local984 = 0.0F;
					local1473 = 0.0F;
					local1000 = 1.0F;
					local1485 = 1;
					local1475 = 1.0F;
				} else {
					local1148 &= 0xFF;
					local1505 = arg1.aByteArray59[local1148];
					@Pc(1512) short local1512;
					@Pc(1517) short local1517;
					@Pc(1551) float local1551;
					@Pc(1564) float local1564;
					@Pc(1643) float local1643;
					@Pc(2066) float local2066;
					@Pc(2074) float local2074;
					@Pc(2082) float local2082;
					@Pc(2105) float local2105;
					@Pc(2128) float local2128;
					@Pc(2151) float local2151;
					if (local1505 == 0) {
						local1512 = arg1.aShortArray65[local1426];
						local1517 = arg1.aShortArray64[local1426];
						local1522 = arg1.aShortArray56[local1426];
						local2260 = arg1.aShortArray60[local1148];
						local2265 = arg1.aShortArray58[local1148];
						@Pc(2270) short local2270 = arg1.aShortArray59[local1148];
						@Pc(2276) float local2276 = (float) arg1.anIntArray319[local2260];
						@Pc(2282) float local2282 = (float) arg1.anIntArray318[local2260];
						local1551 = arg1.anIntArray313[local2260];
						local1564 = (float) arg1.anIntArray319[local2265] - local2276;
						local1643 = (float) arg1.anIntArray318[local2265] - local2282;
						@Pc(2312) float local2312 = (float) arg1.anIntArray313[local2265] - local1551;
						@Pc(2321) float local2321 = (float) arg1.anIntArray319[local2270] - local2276;
						@Pc(2329) float local2329 = (float) arg1.anIntArray318[local2270] - local2282;
						@Pc(2337) float local2337 = (float) arg1.anIntArray313[local2270] - local1551;
						@Pc(2345) float local2345 = (float) arg1.anIntArray319[local1512] - local2276;
						@Pc(2353) float local2353 = (float) arg1.anIntArray318[local1512] - local2282;
						@Pc(2361) float local2361 = (float) arg1.anIntArray313[local1512] - local1551;
						@Pc(2370) float local2370 = (float) arg1.anIntArray319[local1517] - local2276;
						@Pc(2378) float local2378 = (float) arg1.anIntArray318[local1517] - local2282;
						local2066 = (float) arg1.anIntArray313[local1517] - local1551;
						local2074 = (float) arg1.anIntArray319[local1522] - local2276;
						local2082 = (float) arg1.anIntArray318[local1522] - local2282;
						local2105 = (float) arg1.anIntArray313[local1522] - local1551;
						local2128 = local2337 * local1643 - local2329 * local2312;
						local2151 = local2312 * local2321 - local1564 * local2337;
						@Pc(2434) float local2434 = local1564 * local2329 - local2321 * local1643;
						@Pc(2442) float local2442 = local2434 * local2329 - local2151 * local2337;
						@Pc(2451) float local2451 = local2128 * local2337 - local2434 * local2321;
						@Pc(2459) float local2459 = local2321 * local2151 - local2329 * local2128;
						@Pc(2473) float local2473 = 1.0F / (local2459 * local2312 + local2451 * local1643 + local2442 * local1564);
						local1473 = (local2353 * local2451 + local2442 * local2345 + local2361 * local2459) * local2473;
						local1477 = (local2370 * local2442 + local2451 * local2378 + local2459 * local2066) * local2473;
						local992 = (local2451 * local2082 + local2074 * local2442 + local2105 * local2459) * local2473;
						@Pc(2523) float local2523 = local2128 * local2312 - local2434 * local1564;
						@Pc(2531) float local2531 = local2434 * local1643 - local2151 * local2312;
						@Pc(2540) float local2540 = local2151 * local1564 - local1643 * local2128;
						@Pc(2554) float local2554 = 1.0F / (local2337 * local2540 + local2523 * local2329 + local2321 * local2531);
						local1475 = (local2523 * local2353 + local2531 * local2345 + local2361 * local2540) * local2554;
						local984 = (local2540 * local2105 + local2074 * local2531 + local2523 * local2082) * local2554;
						local1000 = (local2540 * local2066 + local2523 * local2378 + local2370 * local2531) * local2554;
					} else {
						local1512 = arg1.aShortArray65[local1426];
						local1517 = arg1.aShortArray64[local1426];
						local1522 = arg1.aShortArray56[local1426];
						@Pc(1526) int local1526 = local702[local1148];
						@Pc(1530) int local1530 = local704[local1148];
						@Pc(1534) int local1534 = local706[local1148];
						@Pc(1538) float[] local1538 = local708[local1148];
						@Pc(1543) byte local1543 = arg1.aByteArray58[local1148];
						local1551 = (float) arg1.anIntArray314[local1148] / 256.0F;
						if (local1505 == 1) {
							local1564 = (float) arg1.anIntArray317[local1148] / 1024.0F;
							Static158.method2208(local1526, arg1.anIntArray319[local1512], local1530, local1564, local1538, arg1.anIntArray318[local1512], local1534, local1551, arg1.anIntArray313[local1512], local1543);
							local1473 = Static368.aFloat89;
							local1475 = Static139.aFloat34;
							Static158.method2208(local1526, arg1.anIntArray319[local1517], local1530, local1564, local1538, arg1.anIntArray318[local1517], local1534, local1551, arg1.anIntArray313[local1517], local1543);
							local1000 = Static139.aFloat34;
							local1477 = Static368.aFloat89;
							Static158.method2208(local1526, arg1.anIntArray319[local1522], local1530, local1564, local1538, arg1.anIntArray318[local1522], local1534, local1551, arg1.anIntArray313[local1522], local1543);
							local984 = Static139.aFloat34;
							local992 = Static368.aFloat89;
							local1643 = local1564 / 2.0F;
							if ((local1543 & 0x1) == 0) {
								if (local1643 < local1477 - local1473) {
									local1485 = 1;
									local1477 -= local1564;
								} else if (local1473 - local1477 > local1643) {
									local1485 = 2;
									local1477 += local1564;
								}
								if (local1643 < local992 - local1473) {
									local1487 = 1;
									local992 -= local1564;
								} else if (local1473 - local992 > local1643) {
									local992 += local1564;
									local1487 = 2;
								}
							} else {
								if (local1000 - local1475 > local1643) {
									local1485 = 1;
									local1000 -= local1564;
								} else if (local1643 < local1475 - local1000) {
									local1000 += local1564;
									local1485 = 2;
								}
								if (local984 - local1475 > local1643) {
									local1487 = 1;
									local984 -= local1564;
								} else if (local1475 - local984 > local1643) {
									local984 += local1564;
									local1487 = 2;
								}
							}
						} else if (local1505 == 2) {
							local1564 = (float) arg1.anIntArray321[local1148] / 256.0F;
							local1643 = (float) arg1.anIntArray315[local1148] / 256.0F;
							@Pc(1980) int local1980 = arg1.anIntArray319[local1517] - arg1.anIntArray319[local1512];
							@Pc(1991) int local1991 = arg1.anIntArray318[local1517] - arg1.anIntArray318[local1512];
							@Pc(2001) int local2001 = arg1.anIntArray313[local1517] - arg1.anIntArray313[local1512];
							@Pc(2012) int local2012 = arg1.anIntArray319[local1522] - arg1.anIntArray319[local1512];
							@Pc(2023) int local2023 = arg1.anIntArray318[local1522] - arg1.anIntArray318[local1512];
							@Pc(2034) int local2034 = arg1.anIntArray313[local1522] - arg1.anIntArray313[local1512];
							@Pc(2042) int local2042 = local1991 * local2034 - local2001 * local2023;
							@Pc(2050) int local2050 = local2012 * local2001 - local1980 * local2034;
							@Pc(2058) int local2058 = local2023 * local1980 - local2012 * local1991;
							local2066 = 64.0F / (float) arg1.anIntArray322[local1148];
							local2074 = 64.0F / (float) arg1.anIntArray320[local1148];
							local2082 = 64.0F / (float) arg1.anIntArray317[local1148];
							local2105 = (local1538[2] * (float) local2058 + local1538[0] * (float) local2042 + local1538[1] * (float) local2050) / local2066;
							local2128 = (local1538[5] * (float) local2058 + local1538[3] * (float) local2042 + local1538[4] * (float) local2050) / local2074;
							local2151 = ((float) local2058 * local1538[8] + (float) local2050 * local1538[7] + (float) local2042 * local1538[6]) / local2082;
							local1489 = Static436.method5467(local2105, local2128, local2151);
							Static55.method852(local1530, arg1.anIntArray313[local1512], local1551, arg1.anIntArray318[local1512], local1564, local1538, local1534, local1489, local1643, local1543, local1526, arg1.anIntArray319[local1512]);
							local1473 = Static352.aFloat87;
							local1475 = Static71.aFloat21;
							Static55.method852(local1530, arg1.anIntArray313[local1517], local1551, arg1.anIntArray318[local1517], local1564, local1538, local1534, local1489, local1643, local1543, local1526, arg1.anIntArray319[local1517]);
							local1000 = Static71.aFloat21;
							local1477 = Static352.aFloat87;
							Static55.method852(local1530, arg1.anIntArray313[local1522], local1551, arg1.anIntArray318[local1522], local1564, local1538, local1534, local1489, local1643, local1543, local1526, arg1.anIntArray319[local1522]);
							local984 = Static71.aFloat21;
							local992 = Static352.aFloat87;
						} else if (local1505 == 3) {
							Static149.method5578(local1543, local1530, arg1.anIntArray318[local1512], local1534, arg1.anIntArray319[local1512], local1551, arg1.anIntArray313[local1512], local1538, local1526);
							local1475 = Static344.aFloat86;
							local1473 = Static433.aFloat96;
							Static149.method5578(local1543, local1530, arg1.anIntArray318[local1517], local1534, arg1.anIntArray319[local1517], local1551, arg1.anIntArray313[local1517], local1538, local1526);
							local1000 = Static344.aFloat86;
							local1477 = Static433.aFloat96;
							Static149.method5578(local1543, local1530, arg1.anIntArray318[local1522], local1534, arg1.anIntArray319[local1522], local1551, arg1.anIntArray313[local1522], local1538, local1526);
							local992 = Static433.aFloat96;
							local984 = Static344.aFloat86;
							if ((local1543 & 0x1) == 0) {
								if (local1477 - local1473 > 0.5F) {
									local1477--;
									local1485 = 1;
								} else if (local1473 - local1477 > 0.5F) {
									local1485 = 2;
									local1477++;
								}
								if (local992 - local1473 > 0.5F) {
									local992--;
									local1487 = 1;
								} else if (local1473 - local992 > 0.5F) {
									local992++;
									local1487 = 2;
								}
							} else {
								if (local1000 - local1475 > 0.5F) {
									local1485 = 1;
									local1000--;
								} else if (local1475 - local1000 > 0.5F) {
									local1485 = 2;
									local1000++;
								}
								if (local984 - local1475 > 0.5F) {
									local984--;
									local1487 = 1;
								} else if (local1475 - local984 > 0.5F) {
									local1487 = 2;
									local984++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray57 == null) {
				local1505 = 0;
			} else {
				local1505 = arg1.aByteArray57[local1426];
			}
			if (local1505 == 0) {
				@Pc(2648) long local2648 = ((long) (local1433 << 8) + (long) (local1489 << 24) + (long) local734 << 32) + (long) (local1148 << 2);
				local1522 = arg1.aShortArray65[local1426];
				local2260 = arg1.aShortArray64[local1426];
				local2265 = arg1.aShortArray56[local1426];
				@Pc(2667) Class232 local2667 = local430[local1522];
				this.aShortArray110[local1420] = this.method5405(local1475, local2667.anInt6391, arg1, local1473, local2667.anInt6398, local2648, local2667.anInt6393, local2667.anInt6396, local1522);
				@Pc(2691) Class232 local2691 = local430[local2260];
				this.aShortArray112[local1420] = this.method5405(local1000, local2691.anInt6391, arg1, local1477, local2691.anInt6398, local2648 + (long) local1485, local2691.anInt6393, local2691.anInt6396, local2260);
				@Pc(2718) Class232 local2718 = local430[local2265];
				this.aShortArray109[local1420] = this.method5405(local984, local2718.anInt6391, arg1, local992, local2718.anInt6398, local2648 + (long) local1487, local2718.anInt6393, local2718.anInt6396, local2265);
			} else if (local1505 == 1) {
				@Pc(2750) Class85 local2750 = local1108[local1426];
				@Pc(2793) long local2793 = ((long) (local1489 << 24) + (long) (local1433 << 8) + (long) local734 << 32) + (long) ((local1148 << 2) + (local2750.anInt2135 <= 0 ? 2048 : 1024) + (local2750.anInt2136 + 256 << 12) + (local2750.anInt2137 + 256 << 22));
				this.aShortArray110[local1420] = this.method5405(local1475, local2750.anInt2137, arg1, local1473, local2750.anInt2136, local2793, 0, local2750.anInt2135, arg1.aShortArray65[local1426]);
				this.aShortArray112[local1420] = this.method5405(local1000, local2750.anInt2137, arg1, local1477, local2750.anInt2136, (long) local1485 + local2793, 0, local2750.anInt2135, arg1.aShortArray64[local1426]);
				this.aShortArray109[local1420] = this.method5405(local984, local2750.anInt2137, arg1, local992, local2750.anInt2136, local2793 + (long) local1487, 0, local2750.anInt2135, arg1.aShortArray56[local1426]);
			}
			if (arg1.aShortArray63 == null) {
				this.aShortArray108[local1420] = -1;
			} else {
				this.aShortArray108[local1420] = arg1.aShortArray63[local1426];
			}
			if (arg1.aByteArray55 != null) {
				this.aByteArray92[local1420] = arg1.aByteArray55[local1426];
			}
			if (arg1.aShortArray62 != null) {
				this.aShortArray113[local1420] = arg1.aShortArray62[local1426];
			}
			this.aShortArray107[local1420] = arg1.aShortArray57[local1426];
		}
		local1426 = 0;
		local1127 = -10000;
		for (local1137 = 0; local1137 < this.anInt7146; local1137++) {
			@Pc(2931) short local2931 = this.aShortArray108[local1137];
			if (local1127 != local2931) {
				local1426++;
				local1127 = local2931;
			}
		}
		this.anIntArray476 = new int[local1426 + 1];
		local1426 = 0;
		local1127 = -10000;
		for (local1148 = 0; local1148 < this.anInt7146; local1148++) {
			@Pc(2965) short local2965 = this.aShortArray108[local1148];
			if (local1127 != local2965) {
				this.anIntArray476[local1426++] = local1148;
				local1127 = local2965;
			}
		}
		this.anIntArray476[local1426] = this.anInt7146;
		Static261.aLongArray4 = null;
		this.aShortArray115 = Static288.method3759(this.anInt7143, this.aShortArray115);
		this.aShortArray111 = Static288.method3759(this.anInt7143, this.aShortArray111);
		this.aShortArray114 = Static288.method3759(this.anInt7143, this.aShortArray114);
		this.aByteArray93 = Static49.method725(this.aByteArray93, this.anInt7143);
		this.aFloatArray31 = Static70.method1119(this.aFloatArray31, this.anInt7143);
		this.aFloatArray32 = Static70.method1119(this.aFloatArray32, this.anInt7143);
		if (arg1.anIntArray312 != null && Static330.method4214(arg2, this.anInt7135)) {
			this.anIntArrayArray182 = arg1.method4125();
		}
		if (arg1.aClass156Array1 != null && Static87.method1273(arg2, this.anInt7135)) {
			this.anIntArrayArray183 = arg1.method4138();
		}
		if (arg1.anIntArray316 != null && Static148.method2091(arg2, this.anInt7135)) {
			local734 = 0;
			@Pc(3083) int[] local3083 = new int[256];
			for (local779 = 0; local779 < this.anInt7131; local779++) {
				local793 = arg1.anIntArray316[local113[local779]];
				if (local793 >= 0) {
					@Pc(3100) int local3100 = local3083[local793]++;
					if (local734 < local793) {
						local734 = local793;
					}
				}
			}
			this.anIntArrayArray184 = new int[local734 + 1][];
			for (local793 = 0; local793 <= local734; local793++) {
				this.anIntArrayArray184[local793] = new int[local3083[local793]];
				local3083[local793] = 0;
			}
			for (local795 = 0; local795 < this.anInt7131; local795++) {
				local1207 = arg1.anIntArray316[local113[local795]];
				if (local1207 >= 0) {
					this.anIntArrayArray184[local1207][local3083[local1207]++] = local795;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "()V")
	@Override
	public void method5397() {
		if (this.anInt7143 <= 0 || this.anInt7146 <= 0) {
			return;
		}
		this.method5406(false);
		if ((this.aByte102 & 0x10) == 0 && this.aClass89_1.anInterface2_1 == null) {
			this.method5403(false);
		}
		this.method5408();
	}

	@OriginalMember(owner = "client!vj", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub1_Sub25.anIntArray249[arg0];
		@Pc(13) int local13 = Class1_Sub1_Sub25.anIntArray248[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7156; local15++) {
			local33 = local13 * this.anIntArray478[local15] + this.anIntArray479[local15] * local9 >> 15;
			this.anIntArray479[local15] = local13 * this.anIntArray479[local15] - local9 * this.anIntArray478[local15] >> 15;
			this.anIntArray478[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7143; local33++) {
			@Pc(83) int local83 = this.aShortArray114[local33] * local9 + local13 * this.aShortArray115[local33] >> 15;
			this.aShortArray114[local33] = (short) (local13 * this.aShortArray114[local33] - local9 * this.aShortArray115[local33] >> 15);
			this.aShortArray115[local33] = (short) local83;
		}
		if (this.aClass21_14 == null && this.aClass21_13 != null) {
			this.aClass21_13.anInterface10_2 = null;
		}
		if (this.aClass21_14 != null) {
			this.aClass21_14.anInterface10_2 = null;
		}
		this.aBoolean589 = false;
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "YA", descriptor = "(SS)V")
	@Override
	public void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass128_Sub2_42.anInterface8_8;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7131; local11++) {
			if (this.aShortArray108[local11] == arg0) {
				this.aShortArray108[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class201 local48 = local9.method1375(arg0 & 0xFFFF);
			local37 = local48.aByte63;
			local35 = local48.aByte65;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class201 local69 = local9.method1375(arg1 & 0xFFFF);
			local58 = local69.aByte63;
			local56 = local69.aByte65;
		}
		if (!(local56 != local35 | local58 != local37)) {
			return;
		}
		if (this.aClass221Array1 != null) {
			for (@Pc(98) int local98 = 0; local98 < this.anInt7167; local98++) {
				@Pc(105) Class221 local105 = this.aClass221Array1[local98];
				@Pc(110) Class68 local110 = this.aClass68Array1[local98];
				local110.anInt1717 = Static55.anIntArray48[this.aShortArray107[local105.anInt6215] & 0xFFFF] & 0xFFFFFF | local110.anInt1717 & 0xFF000000;
			}
		}
		if (this.aClass21_13 != null) {
			this.aClass21_13.anInterface10_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ia;Lclient!vk;I)V")
	@Override
	public void method5391(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class13_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7143 == 0) {
			return;
		}
		@Pc(16) Class40_Sub2 local16 = this.aClass128_Sub2_42.aClass40_Sub2_3;
		if (!this.aBoolean589) {
			this.method5407();
		}
		@Pc(25) Class40_Sub2 local25 = (Class40_Sub2) arg0;
		this.method5400(local25);
		Static188.aFloat40 = local16.aFloat9 * local25.aFloat13 + local25.aFloat17 * local16.aFloat19 + local16.aFloat12 * local25.aFloat14 + local16.aFloat14;
		Static301.aFloat76 = local25.aFloat19 * local16.aFloat12 + local25.aFloat10 * local16.aFloat9 + local25.aFloat20 * local16.aFloat19;
		@Pc(76) float local76 = Static188.aFloat40 + (float) this.aShort93 * Static301.aFloat76;
		@Pc(84) float local84 = Static188.aFloat40 + Static301.aFloat76 * (float) this.aShort99;
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (local84 < local76) {
			local94 = (float) this.aShort97 + local76;
			local100 = local84 - (float) this.aShort97;
		} else {
			local100 = (float) -this.aShort97 + local76;
			local94 = (float) this.aShort97 + local84;
		}
		if (local100 >= this.aClass128_Sub2_42.aFloat61 || (float) this.aClass128_Sub2_42.anInt4620 >= local94) {
			return;
		}
		Static16.aFloat46 = local16.aFloat16 * local25.aFloat10 + local25.aFloat20 * local16.aFloat10 + local16.aFloat18 * local25.aFloat19;
		Static177.aFloat38 = local16.aFloat13 + local25.aFloat17 * local16.aFloat10 + local25.aFloat13 * local16.aFloat16 + local16.aFloat18 * local25.aFloat14;
		@Pc(177) float local177 = Static177.aFloat38 + (float) this.aShort93 * Static16.aFloat46;
		@Pc(185) float local185 = Static177.aFloat38 + Static16.aFloat46 * (float) this.aShort99;
		@Pc(211) float local211;
		@Pc(200) float local200;
		if (local177 > local185) {
			local200 = ((float) this.aShort97 + local177) * (float) this.aClass128_Sub2_42.anInt4616;
			local211 = (float) this.aClass128_Sub2_42.anInt4616 * (local185 - (float) this.aShort97);
		} else {
			local200 = (float) this.aClass128_Sub2_42.anInt4616 * ((float) this.aShort97 + local185);
			local211 = (float) this.aClass128_Sub2_42.anInt4616 * (local177 - (float) this.aShort97);
		}
		if (local211 / local94 >= this.aClass128_Sub2_42.aFloat67 || this.aClass128_Sub2_42.aFloat68 >= local200 / local94) {
			return;
		}
		Static75.aFloat22 = local16.aFloat17 + local25.aFloat13 * local16.aFloat15 + local25.aFloat17 * local16.aFloat20 + local16.aFloat11 * local25.aFloat14;
		Static441.aFloat99 = local16.aFloat20 * local25.aFloat20 + local25.aFloat10 * local16.aFloat15 + local25.aFloat19 * local16.aFloat11;
		@Pc(300) float local300 = Static441.aFloat99 * (float) this.aShort93 + Static75.aFloat22;
		@Pc(308) float local308 = (float) this.aShort99 * Static441.aFloat99 + Static75.aFloat22;
		@Pc(335) float local335;
		@Pc(323) float local323;
		if (local300 > local308) {
			local323 = (float) this.aClass128_Sub2_42.anInt4629 * ((float) this.aShort97 + local300);
			local335 = ((float) -this.aShort97 + local308) * (float) this.aClass128_Sub2_42.anInt4629;
		} else {
			local335 = ((float) -this.aShort97 + local300) * (float) this.aClass128_Sub2_42.anInt4629;
			local323 = (local308 + (float) this.aShort97) * (float) this.aClass128_Sub2_42.anInt4629;
		}
		if (this.aClass128_Sub2_42.aFloat66 <= local335 / local94 || local323 / local94 <= this.aClass128_Sub2_42.aFloat60) {
			return;
		}
		if (arg1 != null || this.aClass221Array1 != null) {
			Static137.aFloat33 = local16.aFloat18 * local25.aFloat9 + local16.aFloat10 * local25.aFloat15 + local25.aFloat16 * local16.aFloat16;
			Static188.aFloat41 = local25.aFloat12 * local16.aFloat11 + local16.aFloat20 * local25.aFloat11 + local16.aFloat15 * local25.aFloat18;
			Static195.aFloat43 = local25.aFloat11 * local16.aFloat19 + local25.aFloat18 * local16.aFloat9 + local25.aFloat12 * local16.aFloat12;
			Static437.aFloat97 = local16.aFloat19 * local25.aFloat15 + local25.aFloat16 * local16.aFloat9 + local25.aFloat9 * local16.aFloat12;
			Static90.aFloat26 = local25.aFloat12 * local16.aFloat18 + local25.aFloat11 * local16.aFloat10 + local25.aFloat18 * local16.aFloat16;
			Static448.aFloat92 = local25.aFloat9 * local16.aFloat11 + local25.aFloat16 * local16.aFloat15 + local16.aFloat20 * local25.aFloat15;
		}
		if (arg1 != null) {
			@Pc(495) boolean local495 = false;
			@Pc(497) boolean local497 = true;
			@Pc(505) int local505 = this.aShort100 + this.aShort98 >> 1;
			@Pc(513) int local513 = this.aShort95 + this.aShort92 >> 1;
			@Pc(532) int local532 = (int) (Static177.aFloat38 + (float) local505 * Static137.aFloat33 + Static16.aFloat46 * (float) this.aShort93 + (float) local513 * Static90.aFloat26);
			@Pc(551) int local551 = (int) ((float) this.aShort93 * Static441.aFloat99 + (float) local505 * Static448.aFloat92 + Static75.aFloat22 + Static188.aFloat41 * (float) local513);
			@Pc(570) int local570 = (int) (Static301.aFloat76 * (float) this.aShort93 + Static188.aFloat40 + Static437.aFloat97 * (float) local505 + Static195.aFloat43 * (float) local513);
			if (this.aClass128_Sub2_42.anInt4620 > local570) {
				local495 = true;
			} else {
				arg1.anInt7180 = this.aClass128_Sub2_42.anInt4644 + this.aClass128_Sub2_42.anInt4616 * local532 / local570;
				arg1.anInt7181 = this.aClass128_Sub2_42.anInt4638 + this.aClass128_Sub2_42.anInt4629 * local551 / local570;
			}
			@Pc(626) int local626 = (int) (Static177.aFloat38 + Static137.aFloat33 * (float) local505 + (float) this.aShort99 * Static16.aFloat46 + (float) local513 * Static90.aFloat26);
			@Pc(645) int local645 = (int) (Static441.aFloat99 * (float) this.aShort99 + Static75.aFloat22 + (float) local505 * Static448.aFloat92 + (float) local513 * Static188.aFloat41);
			@Pc(664) int local664 = (int) ((float) local513 * Static195.aFloat43 + (float) this.aShort99 * Static301.aFloat76 + Static437.aFloat97 * (float) local505 + Static188.aFloat40);
			if (this.aClass128_Sub2_42.anInt4620 > local664) {
				local495 = true;
			} else {
				arg1.anInt7177 = local645 * this.aClass128_Sub2_42.anInt4629 / local664 + this.aClass128_Sub2_42.anInt4638;
				arg1.anInt7179 = local626 * this.aClass128_Sub2_42.anInt4616 / local664 + this.aClass128_Sub2_42.anInt4644;
			}
			if (local495) {
				if (local570 < this.aClass128_Sub2_42.anInt4620 && this.aClass128_Sub2_42.anInt4620 > local664) {
					local497 = false;
				} else {
					@Pc(738) int local738;
					@Pc(748) int local748;
					@Pc(774) int local774;
					if (local570 < this.aClass128_Sub2_42.anInt4620) {
						local738 = (local664 - this.aClass128_Sub2_42.anInt4620 << 16) / (local664 - local570);
						local748 = (local738 * (local626 - local532) >> 16) + local626;
						arg1.anInt7180 = local748 * this.aClass128_Sub2_42.anInt4616 / this.aClass128_Sub2_42.anInt4620 + this.aClass128_Sub2_42.anInt4644;
						local774 = (local738 * (local645 - local551) >> 16) + local645;
						arg1.anInt7181 = this.aClass128_Sub2_42.anInt4638 + this.aClass128_Sub2_42.anInt4629 * local774 / this.aClass128_Sub2_42.anInt4620;
					} else if (local664 < this.aClass128_Sub2_42.anInt4620) {
						local738 = (local570 - this.aClass128_Sub2_42.anInt4620 << 16) / (local570 - local664);
						local748 = local532 + ((local532 - local626) * local738 >> 16);
						local774 = local551 + ((local551 - local645) * local738 >> 16);
						arg1.anInt7180 = this.aClass128_Sub2_42.anInt4644 + local748 * this.aClass128_Sub2_42.anInt4616 / this.aClass128_Sub2_42.anInt4620;
						arg1.anInt7181 = this.aClass128_Sub2_42.anInt4629 * local774 / this.aClass128_Sub2_42.anInt4620 + this.aClass128_Sub2_42.anInt4638;
					}
				}
			}
			if (local497) {
				if (local664 < local570) {
					arg1.anInt7178 = this.aClass128_Sub2_42.anInt4644 + this.aClass128_Sub2_42.anInt4616 * (local532 + this.aShort97) / local570 - arg1.anInt7180;
				} else {
					arg1.anInt7178 = this.aClass128_Sub2_42.anInt4616 * (local626 + this.aShort97) / local664 + this.aClass128_Sub2_42.anInt4644 - arg1.anInt7179;
				}
				arg1.aBoolean591 = true;
			}
		}
		this.aClass128_Sub2_42.method3633();
		this.aClass128_Sub2_42.method3640(local25);
		this.method5410();
		this.aClass128_Sub2_42.method3680();
		this.method5409();
	}

	@OriginalMember(owner = "client!vj", name = "va", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			local24 = 0;
			Static218.anInt5618 = 0;
			Static313.anInt5203 = 0;
			Static271.anInt4268 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray182.length) {
					local48 = this.anIntArrayArray182[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray106 == null || (this.aShortArray106[local56] & arg6) != 0) {
							Static271.anInt4268 += this.anIntArray478[local56];
							Static218.anInt5618 += this.anIntArray480[local56];
							local24++;
							Static313.anInt5203 += this.anIntArray479[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static218.anInt5618 = arg3 + Static218.anInt5618 / local24;
				Static313.anInt5203 = arg4 + Static313.anInt5203 / local24;
				Static271.anInt4268 = Static271.anInt4268 / local24 + arg2;
				Static216.aBoolean276 = true;
			} else {
				Static271.anInt4268 = arg2;
				Static218.anInt5618 = arg3;
				Static313.anInt5203 = arg4;
			}
			return;
		}
		@Pc(245) int[] local245;
		@Pc(247) int local247;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[1] * arg3 + arg2 * arg7[0] + arg7[2] * arg4 + 16384 >> 15;
				local32 = arg7[4] * arg3 + arg2 * arg7[3] + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg4 * arg7[8] + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
				arg3 = local32;
				arg2 = local24;
				arg4 = local38;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray182.length > local32) {
					local245 = this.anIntArrayArray182[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local50 = local245[local247];
						if (this.aShortArray106 == null || (this.aShortArray106[local50] & arg6) != 0) {
							this.anIntArray478[local50] += arg2;
							this.anIntArray480[local50] += arg3;
							this.anIntArray479[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(370) int local370;
		@Pc(393) int local393;
		@Pc(425) int local425;
		@Pc(452) int local452;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(472) int local472;
		@Pc(480) int local480;
		@Pc(634) int local634;
		@Pc(660) int local660;
		@Pc(664) int local664;
		@Pc(672) int local672;
		@Pc(677) int local677;
		@Pc(681) int local681;
		@Pc(685) int local685;
		@Pc(687) int local687;
		@Pc(819) int[] local819;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(831) int local831;
		@Pc(960) int local960;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray182.length) {
						local245 = this.anIntArrayArray182[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local50 = local245[local247];
							if (this.aShortArray106 == null || (this.aShortArray106[local50] & arg6) != 0) {
								this.anIntArray478[local50] -= Static271.anInt4268;
								this.anIntArray480[local50] -= Static218.anInt5618;
								this.anIntArray479[local50] -= Static313.anInt5203;
								if (arg4 != 0) {
									local56 = Class1_Sub1_Sub25.anIntArray249[arg4];
									local370 = Class1_Sub1_Sub25.anIntArray248[arg4];
									local393 = local56 * this.anIntArray480[local50] + this.anIntArray478[local50] * local370 + 32767 >> 15;
									this.anIntArray480[local50] = this.anIntArray480[local50] * local370 + 32767 - this.anIntArray478[local50] * local56 >> 15;
									this.anIntArray478[local50] = local393;
								}
								if (arg2 != 0) {
									local56 = Class1_Sub1_Sub25.anIntArray249[arg2];
									local370 = Class1_Sub1_Sub25.anIntArray248[arg2];
									local393 = this.anIntArray480[local50] * local370 + 32767 - this.anIntArray479[local50] * local56 >> 15;
									this.anIntArray479[local50] = local370 * this.anIntArray479[local50] + this.anIntArray480[local50] * local56 + 32767 >> 15;
									this.anIntArray480[local50] = local393;
								}
								if (arg3 != 0) {
									local56 = Class1_Sub1_Sub25.anIntArray249[arg3];
									local370 = Class1_Sub1_Sub25.anIntArray248[arg3];
									local393 = local370 * this.anIntArray478[local50] + this.anIntArray479[local50] * local56 + 32767 >> 15;
									this.anIntArray479[local50] = this.anIntArray479[local50] * local370 + 32767 - this.anIntArray478[local50] * local56 >> 15;
									this.anIntArray478[local50] = local393;
								}
								this.anIntArray478[local50] += Static271.anInt4268;
								this.anIntArray480[local50] += Static218.anInt5618;
								this.anIntArray479[local50] += Static313.anInt5203;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray182.length > local38) {
							local48 = this.anIntArrayArray182[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray106 == null || (this.aShortArray106[local56] & arg6) != 0) {
									local370 = this.anIntArray477[local56];
									local393 = this.anIntArray477[local56 + 1];
									for (local425 = local370; local425 < local393; local425++) {
										local452 = this.aShortArray105[local425] - 1;
										if (local452 == -1) {
											break;
										}
										if (arg4 != 0) {
											local456 = Class1_Sub1_Sub25.anIntArray249[arg4];
											local460 = Class1_Sub1_Sub25.anIntArray248[arg4];
											local464 = local460 * this.aShortArray115[local452] + this.aShortArray111[local452] * local456 + 32767 >> 15;
											this.aShortArray111[local452] = (short) (local460 * this.aShortArray111[local452] + 32767 - local456 * this.aShortArray115[local452] >> 15);
											this.aShortArray115[local452] = (short) local464;
										}
										if (arg2 != 0) {
											local456 = Class1_Sub1_Sub25.anIntArray249[arg2];
											local460 = Class1_Sub1_Sub25.anIntArray248[arg2];
											local464 = local460 * this.aShortArray111[local452] + 32767 - this.aShortArray114[local452] * local456 >> 15;
											this.aShortArray114[local452] = (short) (this.aShortArray111[local452] * local456 + this.aShortArray114[local452] * local460 + 32767 >> 15);
											this.aShortArray111[local452] = (short) local464;
										}
										if (arg3 != 0) {
											local456 = Class1_Sub1_Sub25.anIntArray249[arg3];
											local460 = Class1_Sub1_Sub25.anIntArray248[arg3];
											local464 = local460 * this.aShortArray115[local452] + this.aShortArray114[local452] * local456 + 32767 >> 15;
											this.aShortArray114[local452] = (short) (local460 * this.aShortArray114[local452] + 32767 - local456 * this.aShortArray115[local452] >> 15);
											this.aShortArray115[local452] = (short) local464;
										}
									}
								}
							}
						}
					}
					if (this.aClass21_14 == null && this.aClass21_13 != null) {
						this.aClass21_13.anInterface10_2 = null;
					}
					if (this.aClass21_14 != null) {
						this.aClass21_14.anInterface10_2 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local247 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static216.aBoolean276) {
					local370 = Static271.anInt4268 * arg7[0] + arg7[3] * Static218.anInt5618 + Static313.anInt5203 * arg7[6] + 16384 >> 15;
					local393 = arg7[7] * Static313.anInt5203 + arg7[1] * Static271.anInt4268 + arg7[4] * Static218.anInt5618 + 16384 >> 15;
					local393 += local50;
					local370 += local247;
					local425 = arg7[2] * Static271.anInt4268 + Static218.anInt5618 * arg7[5] + arg7[8] * Static313.anInt5203 + 16384 >> 15;
					local425 += local56;
					Static218.anInt5618 = local393;
					Static271.anInt4268 = local370;
					Static216.aBoolean276 = false;
					Static313.anInt5203 = local425;
				}
				@Pc(440) int[] local440 = new int[9];
				local393 = Class1_Sub1_Sub25.anIntArray248[arg2];
				local425 = Class1_Sub1_Sub25.anIntArray249[arg2];
				local452 = Class1_Sub1_Sub25.anIntArray248[arg3];
				local456 = Class1_Sub1_Sub25.anIntArray249[arg3];
				local460 = Class1_Sub1_Sub25.anIntArray248[arg4];
				local464 = Class1_Sub1_Sub25.anIntArray249[arg4];
				local472 = local460 * local425 + 16384 >> 15;
				local480 = local425 * local464 + 16384 >> 15;
				local440[7] = local452 * local472 + local464 * local456 + 16384 >> 15;
				local440[5] = -local425;
				local440[8] = local393 * local452 + 16384 >> 15;
				local440[0] = local480 * local456 + local452 * local460 + 16384 >> 15;
				local440[1] = local464 * -local452 + local472 * local456 + 16384 >> 15;
				local440[6] = local460 * -local456 + local480 * local452 + 16384 >> 15;
				local440[2] = local393 * local456 + 16384 >> 15;
				local440[4] = local460 * local393 + 16384 >> 15;
				local440[3] = local393 * local464 + 16384 >> 15;
				@Pc(609) int local609 = -Static218.anInt5618 * local440[1] + local440[0] * -Static271.anInt4268 + -Static313.anInt5203 * local440[2] + 16384 >> 15;
				local634 = local440[5] * -Static313.anInt5203 + local440[3] * -Static271.anInt4268 + -Static218.anInt5618 * local440[4] + 16384 >> 15;
				local660 = -Static218.anInt5618 * local440[7] + local440[6] * -Static271.anInt4268 + local440[8] * -Static313.anInt5203 + 16384 >> 15;
				local664 = Static271.anInt4268 + local609;
				@Pc(668) int local668 = Static218.anInt5618 + local634;
				local672 = Static313.anInt5203 + local660;
				@Pc(675) int[] local675 = new int[9];
				for (local677 = 0; local677 < 3; local677++) {
					for (local681 = 0; local681 < 3; local681++) {
						local685 = 0;
						for (local687 = 0; local687 < 3; local687++) {
							local685 += arg7[local681 * 3 + local687] * local440[local687 + local677 * 3];
						}
						local675[local677 * 3 + local681] = local685 + 16384 >> 15;
					}
				}
				local681 = local50 * local440[1] + local440[0] * local247 + local56 * local440[2] + 16384 >> 15;
				local685 = local50 * local440[4] + local440[3] * local247 + local56 * local440[5] + 16384 >> 15;
				local685 += local668;
				local681 += local664;
				local687 = local440[8] * local56 + local440[7] * local50 + local247 * local440[6] + 16384 >> 15;
				local687 += local672;
				local819 = new int[9];
				for (local821 = 0; local821 < 3; local821++) {
					for (local825 = 0; local825 < 3; local825++) {
						local829 = 0;
						for (local831 = 0; local831 < 3; local831++) {
							local829 += arg7[local831 + local821 * 3] * local675[local831 * 3 + local825];
						}
						local819[local825 + local821 * 3] = local829 + 16384 >> 15;
					}
				}
				local825 = arg7[1] * local685 + local681 * arg7[0] + local687 * arg7[2] + 16384 >> 15;
				local829 = arg7[4] * local685 + local681 * arg7[3] + arg7[5] * local687 + 16384 >> 15;
				local829 += local32;
				local825 += local24;
				local831 = arg7[7] * local685 + local681 * arg7[6] + arg7[8] * local687 + 16384 >> 15;
				local831 += local38;
				for (local960 = 0; local960 < local8; local960++) {
					@Pc(966) int local966 = arg1[local960];
					if (this.anIntArrayArray182.length > local966) {
						@Pc(980) int[] local980 = this.anIntArrayArray182[local966];
						for (@Pc(982) int local982 = 0; local982 < local980.length; local982++) {
							@Pc(988) int local988 = local980[local982];
							if (this.aShortArray106 == null || (this.aShortArray106[local988] & arg6) != 0) {
								@Pc(1029) int local1029 = local819[2] * this.anIntArray479[local988] + local819[0] * this.anIntArray478[local988] + this.anIntArray480[local988] * local819[1] + 16384 >> 15;
								@Pc(1060) int local1060 = this.anIntArray479[local988] * local819[5] + local819[4] * this.anIntArray480[local988] + this.anIntArray478[local988] * local819[3] + 16384 >> 15;
								@Pc(1064) int local1064 = local1060 + local829;
								@Pc(1095) int local1095 = this.anIntArray479[local988] * local819[8] + this.anIntArray478[local988] * local819[6] + local819[7] * this.anIntArray480[local988] + 16384 >> 15;
								@Pc(1099) int local1099 = local1029 + local825;
								this.anIntArray478[local988] = local1099;
								@Pc(1108) int local1108 = local1095 + local831;
								this.anIntArray480[local988] = local1064;
								this.anIntArray479[local988] = local1108;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2589) Class221 local2589;
			@Pc(2594) Class68 local2594;
			if (arg0 == 5) {
				if (this.anIntArrayArray184 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray184.length) {
							local245 = this.anIntArrayArray184[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local50 = local245[local247];
								if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local50]) != 0) {
									local56 = (this.aByteArray92[local50] & 0xFF) + (arg2 * 8);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray92[local50] = (byte) local56;
									if (this.aClass21_13 != null) {
										this.aClass21_13.anInterface10_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass221Array1 != null) {
						for (local32 = 0; local32 < this.anInt7167; local32++) {
							local2589 = this.aClass221Array1[local32];
							local2594 = this.aClass68Array1[local32];
							local2594.anInt1717 = local2594.anInt1717 & 0xFFFFFF | 255 - (this.aByteArray92[local2589.anInt6215] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2857) Class68 local2857;
				if (arg0 == 8) {
					if (this.anIntArrayArray183 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray183.length) {
								local245 = this.anIntArrayArray183[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2857 = this.aClass68Array1[local245[local247]];
									local2857.anInt1719 += arg3;
									local2857.anInt1713 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray183 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray183.length) {
								local245 = this.anIntArrayArray183[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2857 = this.aClass68Array1[local245[local247]];
									local2857.anInt1715 = local2857.anInt1715 * arg3 >> 7;
									local2857.anInt1720 = arg2 * local2857.anInt1720 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray183 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray183.length) {
							local245 = this.anIntArrayArray183[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local2857 = this.aClass68Array1[local245[local247]];
								local2857.anInt1722 = arg2 + local2857.anInt1722 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray184 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray184.length) {
						local245 = this.anIntArrayArray184[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local50 = local245[local247];
							if (this.aShortArray113 == null || (this.aShortArray113[local50] & arg6) != 0) {
								local56 = this.aShortArray107[local50] & 0xFFFF;
								local370 = local56 >> 10 & 0x3F;
								local393 = local56 >> 7 & 0x7;
								local393 += arg3 / 4;
								local425 = local56 & 0x7F;
								@Pc(2702) int local2702 = arg2 + local370 & 0x3F;
								if (local393 < 0) {
									local393 = 0;
								} else if (local393 > 7) {
									local393 = 7;
								}
								local425 += arg4;
								if (local425 < 0) {
									local425 = 0;
								} else if (local425 > 127) {
									local425 = 127;
								}
								this.aShortArray107[local50] = (short) (local2702 << 10 | local393 << 7 | local425);
								if (this.aClass21_13 != null) {
									this.aClass21_13.anInterface10_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass221Array1 != null) {
					for (local32 = 0; local32 < this.anInt7167; local32++) {
						local2589 = this.aClass221Array1[local32];
						local2594 = this.aClass68Array1[local32];
						local2594.anInt1717 = local2594.anInt1717 & 0xFF000000 | Static55.anIntArray48[this.aShortArray107[local2589.anInt6215] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray182.length > local32) {
					local245 = this.anIntArrayArray182[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local50 = local245[local247];
						if (this.aShortArray106 == null || (arg6 & this.aShortArray106[local50]) != 0) {
							this.anIntArray478[local50] -= Static271.anInt4268;
							this.anIntArray480[local50] -= Static218.anInt5618;
							this.anIntArray479[local50] -= Static313.anInt5203;
							this.anIntArray478[local50] = this.anIntArray478[local50] * arg2 >> 7;
							this.anIntArray480[local50] = arg3 * this.anIntArray480[local50] >> 7;
							this.anIntArray479[local50] = this.anIntArray479[local50] * arg4 >> 7;
							this.anIntArray478[local50] += Static271.anInt4268;
							this.anIntArray480[local50] += Static218.anInt5618;
							this.anIntArray479[local50] += Static313.anInt5203;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local247 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static216.aBoolean276) {
				local370 = Static313.anInt5203 * arg7[6] + Static218.anInt5618 * arg7[3] + arg7[0] * Static271.anInt4268 + 16384 >> 15;
				local393 = Static271.anInt4268 * arg7[1] + Static218.anInt5618 * arg7[4] + Static313.anInt5203 * arg7[7] + 16384 >> 15;
				local370 += local247;
				local393 += local50;
				local425 = arg7[8] * Static313.anInt5203 + Static271.anInt4268 * arg7[2] + arg7[5] * Static218.anInt5618 + 16384 >> 15;
				Static218.anInt5618 = local393;
				local425 += local56;
				Static271.anInt4268 = local370;
				Static313.anInt5203 = local425;
				Static216.aBoolean276 = false;
			}
			local370 = arg2 << 15 >> 7;
			local393 = arg3 << 15 >> 7;
			local425 = arg4 << 15 >> 7;
			local452 = local370 * -Static271.anInt4268 + 16384 >> 15;
			local456 = local393 * -Static218.anInt5618 + 16384 >> 15;
			local460 = -Static313.anInt5203 * local425 + 16384 >> 15;
			local464 = local452 + Static271.anInt4268;
			local472 = Static218.anInt5618 + local456;
			local480 = Static313.anInt5203 + local460;
			@Pc(2013) int[] local2013 = new int[] { local370 * arg7[0] + 16384 >> 15, local370 * arg7[3] + 16384 >> 15, local370 * arg7[6] + 16384 >> 15, arg7[1] * local393 + 16384 >> 15, arg7[4] * local393 + 16384 >> 15, arg7[7] * local393 + 16384 >> 15, arg7[2] * local425 + 16384 >> 15, local425 * arg7[5] + 16384 >> 15, arg7[8] * local425 + 16384 >> 15 };
			local634 = local370 * local247 + 16384 >> 15;
			local660 = local50 * local393 + 16384 >> 15;
			local664 = local56 * local425 + 16384 >> 15;
			@Pc(2149) int local2149 = local660 + local472;
			@Pc(2153) int local2153 = local634 + local464;
			@Pc(2157) int local2157 = local664 + local480;
			@Pc(2160) int[] local2160 = new int[9];
			@Pc(2166) int local2166;
			for (local672 = 0; local672 < 3; local672++) {
				for (local2166 = 0; local2166 < 3; local2166++) {
					local677 = 0;
					for (local681 = 0; local681 < 3; local681++) {
						local677 += arg7[local672 * 3 + local681] * local2013[local681 * 3 + local2166];
					}
					local2160[local2166 + local672 * 3] = local677 + 16384 >> 15;
				}
			}
			local2166 = arg7[2] * local2157 + local2149 * arg7[1] + arg7[0] * local2153 + 16384 >> 15;
			local677 = arg7[3] * local2153 + local2149 * arg7[4] + local2157 * arg7[5] + 16384 >> 15;
			local2166 += local24;
			local677 += local32;
			local681 = arg7[8] * local2157 + local2153 * arg7[6] + arg7[7] * local2149 + 16384 >> 15;
			local681 += local38;
			for (local685 = 0; local685 < local8; local685++) {
				local687 = arg1[local685];
				if (this.anIntArrayArray182.length > local687) {
					local819 = this.anIntArrayArray182[local687];
					for (local821 = 0; local821 < local819.length; local821++) {
						local825 = local819[local821];
						if (this.aShortArray106 == null || (this.aShortArray106[local825] & arg6) != 0) {
							local829 = local2160[2] * this.anIntArray479[local825] + local2160[1] * this.anIntArray480[local825] + local2160[0] * this.anIntArray478[local825] + 16384 >> 15;
							local831 = this.anIntArray478[local825] * local2160[3] + this.anIntArray480[local825] * local2160[4] + this.anIntArray479[local825] * local2160[5] + 16384 >> 15;
							@Pc(2409) int local2409 = local829 + local2166;
							local960 = this.anIntArray479[local825] * local2160[8] + this.anIntArray478[local825] * local2160[6] + local2160[7] * this.anIntArray480[local825] + 16384 >> 15;
							@Pc(2445) int local2445 = local831 + local677;
							this.anIntArray478[local825] = local2409;
							@Pc(2454) int local2454 = local960 + local681;
							this.anIntArray480[local825] = local2445;
							this.anIntArray479[local825] = local2454;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aShort96;
	}

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "(IIII)V")
	@Override
	protected void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static271.anInt4268 = 0;
			Static313.anInt5203 = 0;
			Static218.anInt5618 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt7156; local20++) {
				Static271.anInt4268 += this.anIntArray478[local20];
				Static218.anInt5618 += this.anIntArray480[local20];
				Static313.anInt5203 += this.anIntArray479[local20];
				local18++;
			}
			if (local18 > 0) {
				Static218.anInt5618 = Static218.anInt5618 / local18 + arg2;
				Static313.anInt5203 = Static313.anInt5203 / local18 + arg3;
				Static271.anInt4268 = arg1 + Static271.anInt4268 / local18;
			} else {
				Static313.anInt5203 = arg3;
				Static218.anInt5618 = arg2;
				Static271.anInt4268 = arg1;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt7156; local18++) {
				this.anIntArray478[local18] += arg1;
				this.anIntArray480[local18] += arg2;
				this.anIntArray479[local18] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt7156; local18++) {
					this.anIntArray478[local18] -= Static271.anInt4268;
					this.anIntArray480[local18] -= Static218.anInt5618;
					this.anIntArray479[local18] -= Static313.anInt5203;
					if (arg3 != 0) {
						local20 = Class1_Sub1_Sub25.anIntArray249[arg3];
						local162 = Class1_Sub1_Sub25.anIntArray248[arg3];
						local181 = this.anIntArray480[local18] * local20 + local162 * this.anIntArray478[local18] + 32767 >> 15;
						this.anIntArray480[local18] = this.anIntArray480[local18] * local162 + 32767 - local20 * this.anIntArray478[local18] >> 15;
						this.anIntArray478[local18] = local181;
					}
					if (arg1 != 0) {
						local20 = Class1_Sub1_Sub25.anIntArray249[arg1];
						local162 = Class1_Sub1_Sub25.anIntArray248[arg1];
						local181 = this.anIntArray480[local18] * local162 + 32767 - local20 * this.anIntArray479[local18] >> 15;
						this.anIntArray479[local18] = this.anIntArray480[local18] * local20 + this.anIntArray479[local18] * local162 + 32767 >> 15;
						this.anIntArray480[local18] = local181;
					}
					if (arg2 != 0) {
						local20 = Class1_Sub1_Sub25.anIntArray249[arg2];
						local162 = Class1_Sub1_Sub25.anIntArray248[arg2];
						local181 = this.anIntArray479[local18] * local20 + local162 * this.anIntArray478[local18] + 32767 >> 15;
						this.anIntArray479[local18] = this.anIntArray479[local18] * local162 + 32767 - local20 * this.anIntArray478[local18] >> 15;
						this.anIntArray478[local18] = local181;
					}
					this.anIntArray478[local18] += Static271.anInt4268;
					this.anIntArray480[local18] += Static218.anInt5618;
					this.anIntArray479[local18] += Static313.anInt5203;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt7156; local18++) {
					this.anIntArray478[local18] -= Static271.anInt4268;
					this.anIntArray480[local18] -= Static218.anInt5618;
					this.anIntArray479[local18] -= Static313.anInt5203;
					this.anIntArray478[local18] = this.anIntArray478[local18] * arg1 / 128;
					this.anIntArray480[local18] = arg2 * this.anIntArray480[local18] / 128;
					this.anIntArray479[local18] = arg3 * this.anIntArray479[local18] / 128;
					this.anIntArray478[local18] += Static271.anInt4268;
					this.anIntArray480[local18] += Static218.anInt5618;
					this.anIntArray479[local18] += Static313.anInt5203;
				}
			} else {
				@Pc(509) Class221 local509;
				@Pc(514) Class68 local514;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt7131; local18++) {
						local20 = (this.aByteArray92[local18] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray92[local18] = (byte) local20;
					}
					if (this.aClass21_13 != null) {
						this.aClass21_13.anInterface10_2 = null;
					}
					if (this.aClass221Array1 != null) {
						for (local20 = 0; local20 < this.anInt7167; local20++) {
							local509 = this.aClass221Array1[local20];
							local514 = this.aClass68Array1[local20];
							local514.anInt1717 = 255 - (this.aByteArray92[local509.anInt6215] & 0xFF) << 24 | local514.anInt1717 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt7131; local18++) {
						local20 = this.aShortArray107[local18] & 0xFFFF;
						local162 = local20 >> 10 & 0x3F;
						local181 = local20 >> 7 & 0x7;
						@Pc(571) int local571 = local20 & 0x7F;
						local181 += arg2 / 4;
						@Pc(583) int local583 = arg1 + local162 & 0x3F;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local571 += arg3;
						if (local571 < 0) {
							local571 = 0;
						} else if (local571 > 127) {
							local571 = 127;
						}
						this.aShortArray107[local18] = (short) (local583 << 10 | local181 << 7 | local571);
					}
					if (this.aClass21_13 != null) {
						this.aClass21_13.anInterface10_2 = null;
					}
					if (this.aClass221Array1 != null) {
						for (local20 = 0; local20 < this.anInt7167; local20++) {
							local509 = this.aClass221Array1[local20];
							local514 = this.aClass68Array1[local20];
							local514.anInt1717 = Static55.anIntArray48[this.aShortArray107[local509.anInt6215] & 0xFFFF] & 0xFFFFFF | local514.anInt1717 & 0xFF000000;
						}
					}
				} else {
					@Pc(701) Class68 local701;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt7167; local18++) {
							local701 = this.aClass68Array1[local18];
							local701.anInt1713 += arg1;
							local701.anInt1719 += arg2;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt7167; local18++) {
							local701 = this.aClass68Array1[local18];
							local701.anInt1720 = arg1 * local701.anInt1720 >> 7;
							local701.anInt1715 = local701.anInt1715 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt7167; local18++) {
							local701 = this.aClass68Array1[local18];
							local701.anInt1722 = arg1 + local701.anInt1722 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "FA", descriptor = "()Z")
	@Override
	protected boolean FA() {
		if (this.anIntArrayArray182 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7123; local12++) {
			this.anIntArray478[local12] <<= 0x4;
			this.anIntArray480[local12] <<= 0x4;
			this.anIntArray479[local12] <<= 0x4;
		}
		Static271.anInt4268 = 0;
		Static218.anInt5618 = 0;
		Static313.anInt5203 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "ra", descriptor = "()I")
	@Override
	public int ra() {
		if (!this.aBoolean589) {
			this.method5407();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!vj", name = "E", descriptor = "()I")
	@Override
	public int E() {
		if (!this.aBoolean589) {
			this.method5407();
		}
		return this.aShort99;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt7131; local3++) {
			local12 = this.aShortArray107[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg2 != -1) {
				local28 -= -(arg3 * (arg2 - local28) >> 7);
			}
			this.aShortArray107[local3] = (short) (local24 << 7 | local18 << 10 | local28);
		}
		if (this.aClass221Array1 != null) {
			for (local12 = 0; local12 < this.anInt7167; local12++) {
				@Pc(111) Class221 local111 = this.aClass221Array1[local12];
				@Pc(116) Class68 local116 = this.aClass68Array1[local12];
				local116.anInt1717 = local116.anInt1717 & 0xFF000000 | Static55.anIntArray48[this.aShortArray107[local111.anInt6215] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass21_13 != null) {
			this.aClass21_13.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	@Override
	public Class1_Sub3_Sub10 ua(@OriginalArg(0) Class1_Sub3_Sub10 arg0) {
		if (this.anInt7143 == 0) {
			return null;
		}
		if (!this.aBoolean589) {
			this.method5407();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass128_Sub2_42.anInt4628 <= 0) {
			local40 = this.aShort98 - (this.aShort93 * this.aClass128_Sub2_42.anInt4628 >> 8) >> this.aClass128_Sub2_42.anInt4606;
			local57 = this.aShort100 - (this.aShort99 * this.aClass128_Sub2_42.anInt4628 >> 8) >> this.aClass128_Sub2_42.anInt4606;
		} else {
			local40 = this.aShort98 - (this.aClass128_Sub2_42.anInt4628 * this.aShort99 >> 8) >> this.aClass128_Sub2_42.anInt4606;
			local57 = this.aShort100 - (this.aClass128_Sub2_42.anInt4628 * this.aShort93 >> 8) >> this.aClass128_Sub2_42.anInt4606;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass128_Sub2_42.anInt4635 <= 0) {
			local116 = this.aShort92 - (this.aClass128_Sub2_42.anInt4635 * this.aShort93 >> 8) >> this.aClass128_Sub2_42.anInt4606;
			local133 = this.aShort95 - (this.aClass128_Sub2_42.anInt4635 * this.aShort99 >> 8) >> this.aClass128_Sub2_42.anInt4606;
		} else {
			local116 = this.aShort92 - (this.aShort99 * this.aClass128_Sub2_42.anInt4635 >> 8) >> this.aClass128_Sub2_42.anInt4606;
			local133 = this.aShort95 - (this.aShort93 * this.aClass128_Sub2_42.anInt4635 >> 8) >> this.aClass128_Sub2_42.anInt4606;
		}
		@Pc(176) int local176 = local57 + 1 - local40;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class1_Sub3_Sub10_Sub1 local186 = (Class1_Sub3_Sub10_Sub1) arg0;
		@Pc(202) Class1_Sub3_Sub10_Sub1 local202;
		if (local186 != null && local186.method4181(local183, local176)) {
			local202 = local186;
			local186.method4177();
		} else {
			local202 = new Class1_Sub3_Sub10_Sub1(this.aClass128_Sub2_42, local176, local183);
		}
		local202.method4182(local116, local40, local133, local57);
		this.method5402(local202);
		return local202;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIIS)I")
	private int method5399(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3) {
		@Pc(17) int local17 = Static55.anIntArray48[Static154.method4422(arg2, arg1)];
		if (arg3 != -1) {
			@Pc(30) Class201 local30 = this.aClass128_Sub2_42.anInterface8_8.method1375(arg3 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte65 & 0xFF;
			@Pc(41) int local41;
			@Pc(68) int local68;
			if (local35 != 0) {
				if (arg2 < 0) {
					local41 = 0;
				} else if (arg2 > 127) {
					local41 = 16777215;
				} else {
					local41 = arg2 * 131586;
				}
				if (local35 == 256) {
					local17 = local41;
				} else {
					local68 = 256 - local35;
					local17 = ((local41 & 0xFF00FF) * local35 + (local17 & 0xFF00FF) * local68 & 0xFF00FF00) + ((local41 & 0xFF00) * local35 + (local17 & 0xFF00) * local68 & 0xFF0000) >> 8;
				}
			}
			local41 = local30.aByte63 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(115) int local115 = local41 * (local17 >> 16 & 0xFF);
				if (local115 > 65535) {
					local115 = 65535;
				}
				local68 = (local17 >> 8 & 0xFF) * local41;
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(139) int local139 = local41 * (local17 & 0xFF);
				if (local139 > 65535) {
					local139 = 65535;
				}
				local17 = (local68 & 0xFF00) + ((local115 & 0xFF00FF00) << 8) + (local139 >> 8);
			}
		}
		return (local17 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!vj", name = "ja", descriptor = "(III)V")
	@Override
	public void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7156; local7++) {
			if (arg0 != 0) {
				this.anIntArray478[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray480[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray479[local7] += arg2;
			}
		}
		this.aBoolean589 = false;
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()[Lclient!u;")
	@Override
	public Class239[] method5380() {
		return this.aClass239Array4;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "()[Lclient!at;")
	@Override
	public Class15[] method5385() {
		return this.aClass15Array4;
	}

	@OriginalMember(owner = "client!vj", name = "N", descriptor = "(SS)V")
	@Override
	public void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7131; local3++) {
			if (arg0 == this.aShortArray107[local3]) {
				this.aShortArray107[local3] = arg1;
			}
		}
		if (this.aClass221Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7167; local34++) {
				@Pc(41) Class221 local41 = this.aClass221Array1[local34];
				@Pc(46) Class68 local46 = this.aClass68Array1[local34];
				local46.anInt1717 = Static55.anIntArray48[this.aShortArray107[local41.anInt6215] & 0xFFFF] & 0xFFFFFF | local46.anInt1717 & 0xFF000000;
			}
		}
		if (this.aClass21_13 != null) {
			this.aClass21_13.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!dj;)V")
	private void method5400(@OriginalArg(1) Class40_Sub2 arg0) {
		@Pc(6) int local6;
		if (this.aClass239Array4 != null) {
			for (local6 = 0; local6 < this.aClass239Array4.length; local6++) {
				@Pc(13) Class239 local13 = this.aClass239Array4[local6];
				@Pc(15) Class239 local15 = local13;
				if (local13.aClass239_1 != null) {
					local15 = local13.aClass239_1;
				}
				local15.anInt6507 = (int) ((float) this.anIntArray479[local13.anInt6502] * arg0.aFloat18 + arg0.aFloat10 * (float) this.anIntArray480[local13.anInt6502] + (float) this.anIntArray478[local13.anInt6502] * arg0.aFloat16 + arg0.aFloat13);
				local15.anInt6503 = (int) (arg0.aFloat17 + (float) this.anIntArray479[local13.anInt6502] * arg0.aFloat11 + (float) this.anIntArray478[local13.anInt6502] * arg0.aFloat15 + arg0.aFloat20 * (float) this.anIntArray480[local13.anInt6502]);
				local15.anInt6511 = (int) (arg0.aFloat14 + arg0.aFloat12 * (float) this.anIntArray479[local13.anInt6502] + arg0.aFloat19 * (float) this.anIntArray480[local13.anInt6502] + arg0.aFloat9 * (float) this.anIntArray478[local13.anInt6502]);
				local15.anInt6506 = (int) ((float) this.anIntArray479[local13.anInt6508] * arg0.aFloat18 + (float) this.anIntArray480[local13.anInt6508] * arg0.aFloat10 + arg0.aFloat16 * (float) this.anIntArray478[local13.anInt6508] + arg0.aFloat13);
				local15.anInt6518 = (int) ((float) this.anIntArray478[local13.anInt6508] * arg0.aFloat15 + (float) this.anIntArray480[local13.anInt6508] * arg0.aFloat20 + (float) this.anIntArray479[local13.anInt6508] * arg0.aFloat11 + arg0.aFloat17);
				local15.anInt6519 = (int) (arg0.aFloat14 + (float) this.anIntArray479[local13.anInt6508] * arg0.aFloat12 + (float) this.anIntArray480[local13.anInt6508] * arg0.aFloat19 + (float) this.anIntArray478[local13.anInt6508] * arg0.aFloat9);
				local15.anInt6517 = (int) (arg0.aFloat10 * (float) this.anIntArray480[local13.anInt6505] + (float) this.anIntArray478[local13.anInt6505] * arg0.aFloat16 + arg0.aFloat18 * (float) this.anIntArray479[local13.anInt6505] + arg0.aFloat13);
				local15.anInt6520 = (int) ((float) this.anIntArray478[local13.anInt6505] * arg0.aFloat15 + (float) this.anIntArray480[local13.anInt6505] * arg0.aFloat20 + (float) this.anIntArray479[local13.anInt6505] * arg0.aFloat11 + arg0.aFloat17);
				local15.anInt6509 = (int) (arg0.aFloat14 + arg0.aFloat19 * (float) this.anIntArray480[local13.anInt6505] + (float) this.anIntArray478[local13.anInt6505] * arg0.aFloat9 + (float) this.anIntArray479[local13.anInt6505] * arg0.aFloat12);
			}
		}
		if (this.aClass15Array4 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass15Array4.length; local6++) {
			@Pc(364) Class15 local364 = this.aClass15Array4[local6];
			@Pc(366) Class15 local366 = local364;
			if (local364.aClass15_1 != null) {
				local366 = local364.aClass15_1;
			}
			if (local364.aClass40_1 == null) {
				local364.aClass40_1 = arg0.method4635();
			} else {
				local364.aClass40_1.ba(arg0);
			}
			local366.anInt336 = (int) (arg0.aFloat16 * (float) this.anIntArray478[local364.anInt337] + (float) this.anIntArray480[local364.anInt337] * arg0.aFloat10 + (float) this.anIntArray479[local364.anInt337] * arg0.aFloat18 + arg0.aFloat13);
			local366.anInt340 = (int) (arg0.aFloat11 * (float) this.anIntArray479[local364.anInt337] + (float) this.anIntArray480[local364.anInt337] * arg0.aFloat20 + (float) this.anIntArray478[local364.anInt337] * arg0.aFloat15 + arg0.aFloat17);
			local366.anInt334 = (int) (arg0.aFloat14 + (float) this.anIntArray479[local364.anInt337] * arg0.aFloat12 + (float) this.anIntArray478[local364.anInt337] * arg0.aFloat9 + (float) this.anIntArray480[local364.anInt337] * arg0.aFloat19);
		}
	}

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "()I")
	@Override
	public int n() {
		return this.anInt7133;
	}

	@OriginalMember(owner = "client!vj", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aShort96 = (short) arg0;
		if (this.aClass21_13 != null) {
			this.aClass21_13.anInterface10_2 = null;
		}
		if (this.aClass21_14 != null) {
			this.aClass21_14.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "X", descriptor = "()I")
	@Override
	public int X() {
		if (!this.aBoolean589) {
			this.method5407();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
	@Override
	public int b() {
		if (!this.aBoolean589) {
			this.method5407();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!qf;I)V")
	private void method5402(@OriginalArg(0) Class1_Sub3_Sub10_Sub1 arg0) {
		if (this.anInt7143 > Static399.anIntArray402.length) {
			Static19.anIntArray15 = new int[this.anInt7143];
			Static399.anIntArray402 = new int[this.anInt7143];
		}
		@Pc(46) int local46;
		@Pc(84) int local84;
		@Pc(93) int local93;
		for (@Pc(20) int local20 = 0; local20 < this.anInt7156; local20++) {
			local46 = (this.anIntArray478[local20] - (this.anIntArray480[local20] * this.aClass128_Sub2_42.anInt4628 >> 8) >> this.aClass128_Sub2_42.anInt4606) - arg0.anInt5355;
			@Pc(70) int local70 = (this.anIntArray479[local20] - (this.anIntArray480[local20] * this.aClass128_Sub2_42.anInt4635 >> 8) >> this.aClass128_Sub2_42.anInt4606) - arg0.anInt5364;
			@Pc(75) int local75 = this.anIntArray477[local20];
			@Pc(82) int local82 = this.anIntArray477[local20 + 1];
			for (local84 = local75; local84 < local82; local84++) {
				local93 = this.aShortArray105[local84] - 1;
				if (local93 == -1) {
					break;
				}
				Static399.anIntArray402[local93] = local46;
				Static19.anIntArray15[local93] = local70;
			}
		}
		for (local46 = 0; local46 < this.anInt7146; local46++) {
			if (this.aByteArray92 == null || this.aByteArray92[local46] <= 128) {
				@Pc(148) short local148 = this.aShortArray110[local46];
				@Pc(153) short local153 = this.aShortArray112[local46];
				@Pc(158) short local158 = this.aShortArray109[local46];
				local84 = Static399.anIntArray402[local148];
				local93 = Static399.anIntArray402[local153];
				@Pc(170) int local170 = Static399.anIntArray402[local158];
				@Pc(174) int local174 = Static19.anIntArray15[local148];
				@Pc(178) int local178 = Static19.anIntArray15[local153];
				@Pc(182) int local182 = Static19.anIntArray15[local158];
				if ((local84 - local93) * (local178 - local182) - (local178 - local174) * (local170 - local93) > 0) {
					arg0.method4176(local170, local178, local84, local174, local182, local93);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	@Override
	public void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean589) {
			this.method5407();
		}
		@Pc(16) int local16 = arg4 + this.aShort98;
		@Pc(22) int local22 = arg4 + this.aShort100;
		@Pc(27) int local27 = this.aShort92 + arg6;
		@Pc(32) int local32 = arg6 + this.aShort95;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt5796 <= arg2.anInt5792 + local22 >> arg2.anInt5797 || local27 < 0 || local32 + arg2.anInt5792 >> arg2.anInt5797 >= arg2.anInt5795)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt5792 >> arg3.anInt5797 >= arg3.anInt5796 || local27 < 0 || arg3.anInt5795 <= arg3.anInt5792 + local32 >> arg3.anInt5797) {
				return;
			}
		} else {
			local16 >>= arg2.anInt5797;
			local22 = arg2.anInt5792 + local22 - 1 >> arg2.anInt5797;
			local27 >>= arg2.anInt5797;
			local32 = arg2.anInt5792 + local32 - 1 >> arg2.anInt5797;
			if (arg2.I(local16, local27) == arg5 && arg2.I(local22, local27) == arg5 && arg2.I(local16, local32) == arg5 && arg2.I(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(258) int local258;
		if (arg0 == 1) {
			for (local258 = 0; local258 < this.anInt7156; local258++) {
				this.anIntArray480[local258] += arg2.va(arg4 + this.anIntArray478[local258], arg6 + this.anIntArray479[local258]) - arg5;
			}
		} else {
			@Pc(183) int local183;
			@Pc(194) int local194;
			if (arg0 == 2) {
				@Pc(178) short local178 = this.aShort93;
				if (local178 == 0) {
					return;
				}
				for (local183 = 0; local183 < this.anInt7156; local183++) {
					local194 = (this.anIntArray480[local183] << 16) / local178;
					if (local194 < arg1) {
						this.anIntArray480[local183] -= -((arg1 - local194) * (arg2.va(this.anIntArray478[local183] - -arg4, this.anIntArray479[local183] - -arg6) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(326) int local326;
				if (arg0 == 3) {
					local258 = (arg1 & 0xFF) * 4;
					local183 = (arg1 >> 8 & 0xFF) * 4;
					local194 = (arg1 >> 16 & 0xFF) << 6;
					local326 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local258 >> 1) < 0 || arg2.anInt5796 << arg2.anInt5797 <= arg4 + (local258 >> 1) + arg2.anInt5792 || arg6 - (local183 >> 1) < 0 || arg2.anInt5792 + arg6 + (local183 >> 1) >= arg2.anInt5795 << arg2.anInt5797) {
						return;
					}
					this.method5388(local258, arg4, arg5, local183, arg2, local194, local326, arg6);
				} else if (arg0 == 4) {
					local258 = this.aShort99 - this.aShort93;
					for (local183 = 0; local183 < this.anInt7156; local183++) {
						this.anIntArray480[local183] = local258 + this.anIntArray480[local183] + arg3.va(arg4 + this.anIntArray478[local183], arg6 + this.anIntArray479[local183]) - arg5;
					}
				} else if (arg0 == 5) {
					local258 = this.aShort99 - this.aShort93;
					for (local183 = 0; local183 < this.anInt7156; local183++) {
						local194 = arg4 + this.anIntArray478[local183];
						local326 = arg6 + this.anIntArray479[local183];
						@Pc(331) int local331 = arg2.va(local194, local326);
						@Pc(336) int local336 = arg3.va(local194, local326);
						@Pc(341) int local341 = local331 - local336;
						this.anIntArray480[local183] = ((this.anIntArray480[local183] << 8) / local258 * local341 >> 8) + local331 - arg5;
					}
				}
			}
		}
		this.aBoolean589 = false;
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V")
	private void method5403(@OriginalArg(1) boolean arg0) {
		if (this.anInt7146 * 6 > Static123.aClass1_Sub11_Sub2_2.aByteArray64.length) {
			Static123.aClass1_Sub11_Sub2_2 = new Class1_Sub11_Sub2((this.anInt7146 + 100) * 6);
		} else {
			Static123.aClass1_Sub11_Sub2_2.anInt5766 = 0;
		}
		@Pc(42) int local42;
		if (this.aClass128_Sub2_42.aBoolean360) {
			for (local42 = 0; local42 < this.anInt7146; local42++) {
				Static123.aClass1_Sub11_Sub2_2.method4448(this.aShortArray110[local42]);
				Static123.aClass1_Sub11_Sub2_2.method4448(this.aShortArray112[local42]);
				Static123.aClass1_Sub11_Sub2_2.method4448(this.aShortArray109[local42]);
			}
		} else {
			for (local42 = 0; local42 < this.anInt7146; local42++) {
				Static123.aClass1_Sub11_Sub2_2.method4488(this.aShortArray110[local42]);
				Static123.aClass1_Sub11_Sub2_2.method4488(this.aShortArray112[local42]);
				Static123.aClass1_Sub11_Sub2_2.method4488(this.aShortArray109[local42]);
			}
		}
		if (Static123.aClass1_Sub11_Sub2_2.anInt5766 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface2_5 == null) {
				this.anInterface2_5 = this.aClass128_Sub2_42.method3618(Static123.aClass1_Sub11_Sub2_2.anInt5766, true, Static123.aClass1_Sub11_Sub2_2.aByteArray64);
			} else {
				this.anInterface2_5.method4932(Static123.aClass1_Sub11_Sub2_2.anInt5766, Static123.aClass1_Sub11_Sub2_2.aByteArray64);
			}
			this.aClass89_1.anInterface2_1 = this.anInterface2_5;
		} else {
			this.aClass89_1.anInterface2_1 = this.aClass128_Sub2_42.method3618(Static123.aClass1_Sub11_Sub2_2.anInt5766, false, Static123.aClass1_Sub11_Sub2_2.aByteArray64);
		}
		if (!arg0) {
			this.aBoolean590 = true;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ia;Lclient!vk;II)V")
	@Override
	public void method5386(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class13_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7143 == 0) {
			return;
		}
		@Pc(16) Class40_Sub2 local16 = this.aClass128_Sub2_42.aClass40_Sub2_3;
		@Pc(19) Class40_Sub2 local19 = (Class40_Sub2) arg0;
		if (!this.aBoolean589) {
			this.method5407();
		}
		Static301.aFloat76 = local16.aFloat12 * local19.aFloat19 + local16.aFloat19 * local19.aFloat20 + local16.aFloat9 * local19.aFloat10;
		Static188.aFloat40 = local16.aFloat12 * local19.aFloat14 + local19.aFloat17 * local16.aFloat19 + local16.aFloat9 * local19.aFloat13 + local16.aFloat14;
		@Pc(72) float local72 = Static188.aFloat40 + (float) this.aShort93 * Static301.aFloat76;
		@Pc(80) float local80 = Static188.aFloat40 + (float) this.aShort99 * Static301.aFloat76;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort97 + local72;
			local97 = (float) -this.aShort97 + local80;
		} else {
			local97 = (float) -this.aShort97 + local72;
			local90 = (float) this.aShort97 + local80;
		}
		if (this.aClass128_Sub2_42.aFloat70 <= local97 || (float) this.aClass128_Sub2_42.anInt4620 >= local90) {
			return;
		}
		Static177.aFloat38 = local16.aFloat13 + local19.aFloat17 * local16.aFloat10 + local19.aFloat13 * local16.aFloat16 + local16.aFloat18 * local19.aFloat14;
		Static16.aFloat46 = local19.aFloat19 * local16.aFloat18 + local16.aFloat16 * local19.aFloat10 + local19.aFloat20 * local16.aFloat10;
		@Pc(174) float local174 = Static16.aFloat46 * (float) this.aShort93 + Static177.aFloat38;
		@Pc(182) float local182 = Static177.aFloat38 + (float) this.aShort99 * Static16.aFloat46;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local182 < local174) {
			local208 = ((float) this.aShort97 + local174) * (float) this.aClass128_Sub2_42.anInt4616;
			local197 = (local182 - (float) this.aShort97) * (float) this.aClass128_Sub2_42.anInt4616;
		} else {
			local197 = (local174 - (float) this.aShort97) * (float) this.aClass128_Sub2_42.anInt4616;
			local208 = (float) this.aClass128_Sub2_42.anInt4616 * (local182 + (float) this.aShort97);
		}
		if (local197 / (float) arg2 >= this.aClass128_Sub2_42.aFloat67 || this.aClass128_Sub2_42.aFloat68 >= local208 / (float) arg2) {
			return;
		}
		Static75.aFloat22 = local19.aFloat14 * local16.aFloat11 + local16.aFloat20 * local19.aFloat17 + local19.aFloat13 * local16.aFloat15 + local16.aFloat17;
		Static441.aFloat99 = local19.aFloat19 * local16.aFloat11 + local16.aFloat20 * local19.aFloat20 + local16.aFloat15 * local19.aFloat10;
		@Pc(299) float local299 = Static75.aFloat22 + Static441.aFloat99 * (float) this.aShort93;
		@Pc(307) float local307 = Static75.aFloat22 + (float) this.aShort99 * Static441.aFloat99;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local299 > local307) {
			local323 = ((float) -this.aShort97 + local307) * (float) this.aClass128_Sub2_42.anInt4629;
			local334 = (local299 + (float) this.aShort97) * (float) this.aClass128_Sub2_42.anInt4629;
		} else {
			local334 = (local307 + (float) this.aShort97) * (float) this.aClass128_Sub2_42.anInt4629;
			local323 = ((float) -this.aShort97 + local299) * (float) this.aClass128_Sub2_42.anInt4629;
		}
		if (local323 / (float) arg2 >= this.aClass128_Sub2_42.aFloat66 || this.aClass128_Sub2_42.aFloat60 >= local334 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass221Array1 != null) {
			Static137.aFloat33 = local16.aFloat10 * local19.aFloat15 + local16.aFloat16 * local19.aFloat16 + local16.aFloat18 * local19.aFloat9;
			Static195.aFloat43 = local16.aFloat19 * local19.aFloat11 + local19.aFloat18 * local16.aFloat9 + local19.aFloat12 * local16.aFloat12;
			Static437.aFloat97 = local19.aFloat9 * local16.aFloat12 + local16.aFloat19 * local19.aFloat15 + local16.aFloat9 * local19.aFloat16;
			Static188.aFloat41 = local16.aFloat20 * local19.aFloat11 + local16.aFloat15 * local19.aFloat18 + local19.aFloat12 * local16.aFloat11;
			Static90.aFloat26 = local19.aFloat18 * local16.aFloat16 + local16.aFloat10 * local19.aFloat11 + local19.aFloat12 * local16.aFloat18;
			Static448.aFloat92 = local19.aFloat9 * local16.aFloat11 + local19.aFloat16 * local16.aFloat15 + local19.aFloat15 * local16.aFloat20;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort100 + this.aShort98 >> 1;
			@Pc(510) int local510 = this.aShort95 + this.aShort92 >> 1;
			@Pc(529) int local529 = (int) (Static177.aFloat38 + (float) local502 * Static137.aFloat33 + Static16.aFloat46 * (float) this.aShort93 + (float) local510 * Static90.aFloat26);
			@Pc(548) int local548 = (int) ((float) local510 * Static188.aFloat41 + (float) local502 * Static448.aFloat92 + Static75.aFloat22 + Static441.aFloat99 * (float) this.aShort93);
			@Pc(567) int local567 = (int) (Static188.aFloat40 + Static437.aFloat97 * (float) local502 + (float) this.aShort93 * Static301.aFloat76 + Static195.aFloat43 * (float) local510);
			@Pc(586) int local586 = (int) (Static16.aFloat46 * (float) this.aShort99 + Static137.aFloat33 * (float) local502 + Static177.aFloat38 + Static90.aFloat26 * (float) local510);
			@Pc(605) int local605 = (int) ((float) this.aShort99 * Static441.aFloat99 + Static75.aFloat22 + (float) local502 * Static448.aFloat92 + Static188.aFloat41 * (float) local510);
			arg1.anInt7181 = this.aClass128_Sub2_42.anInt4629 * local548 / arg2 + this.aClass128_Sub2_42.anInt4638;
			arg1.anInt7179 = local586 * this.aClass128_Sub2_42.anInt4616 / arg2 + this.aClass128_Sub2_42.anInt4644;
			@Pc(650) int local650 = (int) (Static195.aFloat43 * (float) local510 + (float) this.aShort99 * Static301.aFloat76 + Static188.aFloat40 + (float) local502 * Static437.aFloat97);
			arg1.anInt7177 = this.aClass128_Sub2_42.anInt4638 + local605 * this.aClass128_Sub2_42.anInt4629 / arg2;
			arg1.anInt7180 = this.aClass128_Sub2_42.anInt4644 + local529 * this.aClass128_Sub2_42.anInt4616 / arg2;
			if (local567 < this.aClass128_Sub2_42.anInt4620 && this.aClass128_Sub2_42.anInt4620 > local650) {
				arg1.anInt7178 = (local529 + this.aShort97) * this.aClass128_Sub2_42.anInt4616 / arg2 + this.aClass128_Sub2_42.anInt4644 - arg1.anInt7180;
				arg1.aBoolean591 = true;
			}
		}
		this.aClass128_Sub2_42.method3666((float) arg2);
		this.aClass128_Sub2_42.method3669();
		this.aClass128_Sub2_42.method3640(local19);
		this.method5410();
		this.aClass128_Sub2_42.method3680();
		this.method5409();
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "(I)V")
	@Override
	public void u(@OriginalArg(0) int arg0) {
		this.anInt7133 = arg0;
		this.aBoolean590 = true;
		if (this.aClass23_1 != null && (this.anInt7133 & 0x10000) == 0) {
			this.aShortArray114 = this.aClass23_1.aShortArray12;
			this.aShortArray111 = this.aClass23_1.aShortArray11;
			this.aByteArray93 = this.aClass23_1.aByteArray3;
			this.aShortArray115 = this.aClass23_1.aShortArray13;
			this.aClass23_1 = null;
		}
		this.method5408();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method5384(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class33_Sub2 local8 = (Class33_Sub2) arg0;
		if (this.anInt7131 == 0 || local8.anInt7131 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt7156;
		@Pc(21) int[] local21 = local8.anIntArray478;
		@Pc(24) int[] local24 = local8.anIntArray480;
		@Pc(27) int[] local27 = local8.anIntArray479;
		@Pc(30) short[] local30 = local8.aShortArray115;
		@Pc(33) short[] local33 = local8.aShortArray111;
		@Pc(36) short[] local36 = local8.aShortArray114;
		@Pc(39) byte[] local39 = local8.aByteArray93;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(46) short[] local46;
		@Pc(58) byte[] local58;
		if (this.aClass23_1 == null) {
			local58 = null;
			local46 = null;
			local54 = null;
			local50 = null;
		} else {
			local46 = this.aClass23_1.aShortArray12;
			local50 = this.aClass23_1.aShortArray11;
			local54 = this.aClass23_1.aShortArray13;
			local58 = this.aClass23_1.aByteArray3;
		}
		@Pc(75) short[] local75;
		@Pc(83) short[] local83;
		@Pc(87) short[] local87;
		@Pc(79) byte[] local79;
		if (local8.aClass23_1 == null) {
			local87 = null;
			local75 = null;
			local83 = null;
			local79 = null;
		} else {
			local75 = local8.aClass23_1.aShortArray13;
			local79 = local8.aClass23_1.aByteArray3;
			local83 = local8.aClass23_1.aShortArray11;
			local87 = local8.aClass23_1.aShortArray12;
		}
		@Pc(100) int[] local100 = local8.anIntArray477;
		@Pc(103) short[] local103 = local8.aShortArray105;
		if (!local8.aBoolean589) {
			local8.method5407();
		}
		@Pc(112) short local112 = local8.aShort93;
		@Pc(115) short local115 = local8.aShort99;
		@Pc(118) short local118 = local8.aShort98;
		@Pc(121) short local121 = local8.aShort100;
		@Pc(124) short local124 = local8.aShort92;
		@Pc(127) short local127 = local8.aShort95;
		for (@Pc(129) int local129 = 0; local129 < this.anInt7156; local129++) {
			@Pc(139) int local139 = this.anIntArray480[local129] - arg2;
			if (local112 <= local139 && local115 >= local139) {
				@Pc(159) int local159 = this.anIntArray478[local129] - arg1;
				if (local159 >= local118 && local121 >= local159) {
					@Pc(179) int local179 = this.anIntArray479[local129] - arg3;
					if (local179 >= local124 && local127 >= local179) {
						@Pc(193) int local193 = -1;
						@Pc(198) int local198 = this.anIntArray477[local129];
						@Pc(205) int local205 = this.anIntArray477[local129 + 1];
						for (@Pc(207) int local207 = local198; local207 < local205; local207++) {
							local193 = this.aShortArray105[local207] - 1;
							if (local193 == -1 || this.aByteArray93[local193] != 0) {
								break;
							}
						}
						if (local193 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local18; local238++) {
								if (local159 == local21[local238] && local27[local238] == local179 && local24[local238] == local139) {
									local198 = local100[local238];
									@Pc(261) int local261 = -1;
									local205 = local100[local238 + 1];
									for (@Pc(269) int local269 = local198; local269 < local205; local269++) {
										local261 = local103[local269] - 1;
										if (local261 == -1 || local39[local261] != 0) {
											break;
										}
									}
									if (local261 != -1) {
										if (local54 == null) {
											this.aClass23_1 = new Class23();
											local54 = this.aClass23_1.aShortArray13 = Static98.method1403(this.aShortArray115);
											local50 = this.aClass23_1.aShortArray11 = Static98.method1403(this.aShortArray111);
											local46 = this.aClass23_1.aShortArray12 = Static98.method1403(this.aShortArray114);
											local58 = this.aClass23_1.aByteArray3 = Static183.method4173(this.aByteArray93);
										}
										if (local75 == null) {
											@Pc(350) Class23 local350 = local8.aClass23_1 = new Class23();
											local75 = local350.aShortArray13 = Static98.method1403(local30);
											local83 = local350.aShortArray11 = Static98.method1403(local33);
											local87 = local350.aShortArray12 = Static98.method1403(local36);
											local79 = local350.aByteArray3 = Static183.method4173(local39);
										}
										@Pc(383) short local383 = this.aShortArray115[local193];
										@Pc(388) short local388 = this.aShortArray111[local193];
										@Pc(393) short local393 = this.aShortArray114[local193];
										@Pc(398) byte local398 = this.aByteArray93[local193];
										local205 = local100[local238 + 1];
										local198 = local100[local238];
										@Pc(418) int local418;
										for (@Pc(410) int local410 = local198; local410 < local205; local410++) {
											local418 = local103[local410] - 1;
											if (local418 == -1) {
												break;
											}
											if (local79[local418] != 0) {
												local75[local418] += local383;
												local83[local418] += local388;
												local87[local418] += local393;
												local79[local418] += local398;
											}
										}
										local205 = this.anIntArray477[local129 + 1];
										local198 = this.anIntArray477[local129];
										local393 = local36[local261];
										local383 = local30[local261];
										local388 = local33[local261];
										local398 = local39[local261];
										for (local418 = local198; local418 < local205; local418++) {
											@Pc(507) int local507 = this.aShortArray105[local418] - 1;
											if (local507 == -1) {
												break;
											}
											if (local58[local507] != 0) {
												local54[local507] += local383;
												local50[local507] += local388;
												local46[local507] += local393;
												local58[local507] += local398;
											}
										}
										if (this.aClass21_14 == null && this.aClass21_13 != null) {
											this.aClass21_13.anInterface10_2 = null;
										}
										if (this.aClass21_14 != null) {
											this.aClass21_14.anInterface10_2 = null;
										}
										if (local8.aClass21_14 == null && local8.aClass21_13 != null) {
											local8.aClass21_13.anInterface10_2 = null;
										}
										if (local8.aClass21_14 != null) {
											local8.aClass21_14.anInterface10_2 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "VA", descriptor = "()I")
	@Override
	public int VA() {
		if (!this.aBoolean589) {
			this.method5407();
		}
		return this.aShort100;
	}

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub1_Sub25.anIntArray249[arg0];
		@Pc(13) int local13 = Class1_Sub1_Sub25.anIntArray248[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7156; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray480[local15] + this.anIntArray478[local15] * local13 >> 15;
			this.anIntArray480[local15] = local13 * this.anIntArray480[local15] - local9 * this.anIntArray478[local15] >> 15;
			this.anIntArray478[local15] = local34;
		}
		this.aBoolean589 = false;
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIBLclient!vj;Lclient!vj;Z)Lclient!c;")
	private Class33 method5404(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33_Sub2 arg2, @OriginalArg(4) Class33_Sub2 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt7143 = this.anInt7143;
		arg3.anInt7135 = this.anInt7135;
		arg3.aShort94 = this.aShort94;
		arg3.anInt7146 = this.anInt7146;
		arg3.aShort96 = this.aShort96;
		arg3.anInt7167 = this.anInt7167;
		arg3.anInt7131 = this.anInt7131;
		arg3.aByte102 = 0;
		arg3.anInt7123 = this.anInt7123;
		arg3.anInt7133 = arg1;
		arg3.anInt7156 = this.anInt7156;
		@Pc(53) boolean local53 = Static62.method968(this.anInt7135, arg1);
		@Pc(64) boolean local64 = Static455.method5635(this.anInt7135, arg1);
		@Pc(70) boolean local70 = Static156.method2193(this.anInt7135, arg1);
		@Pc(76) boolean local76 = local70 | local53 | local64;
		@Pc(173) int local173;
		if (local76) {
			if (!local53) {
				arg3.anIntArray478 = this.anIntArray478;
			} else if (arg2.anIntArray478 == null || arg2.anIntArray478.length < this.anInt7123) {
				arg3.anIntArray478 = arg2.anIntArray478 = new int[this.anInt7123];
			} else {
				arg3.anIntArray478 = arg2.anIntArray478;
			}
			if (!local64) {
				arg3.anIntArray480 = this.anIntArray480;
			} else if (arg2.anIntArray480 == null || this.anInt7123 > arg2.anIntArray480.length) {
				arg3.anIntArray480 = arg2.anIntArray480 = new int[this.anInt7123];
			} else {
				arg3.anIntArray480 = arg2.anIntArray480;
			}
			if (!local70) {
				arg3.anIntArray479 = this.anIntArray479;
			} else if (arg2.anIntArray479 == null || this.anInt7123 > arg2.anIntArray479.length) {
				arg3.anIntArray479 = arg2.anIntArray479 = new int[this.anInt7123];
			} else {
				arg3.anIntArray479 = arg2.anIntArray479;
			}
			for (local173 = 0; local173 < this.anInt7123; local173++) {
				if (local53) {
					arg3.anIntArray478[local173] = this.anIntArray478[local173];
				}
				if (local64) {
					arg3.anIntArray480[local173] = this.anIntArray480[local173];
				}
				if (local70) {
					arg3.anIntArray479[local173] = this.anIntArray479[local173];
				}
			}
		} else {
			arg3.anIntArray479 = this.anIntArray479;
			arg3.anIntArray478 = this.anIntArray478;
			arg3.anIntArray480 = this.anIntArray480;
		}
		if (Static6.method105(arg1, this.anInt7135)) {
			if (arg0) {
				arg3.aByte102 = (byte) (arg3.aByte102 | 0x1);
			}
			arg3.aClass21_16 = arg2.aClass21_16;
			arg3.aClass21_16.anInterface10_2 = this.aClass21_16.anInterface10_2;
			arg3.aClass21_16.aByte4 = this.aClass21_16.aByte4;
		} else if (Static133.method1795(arg1, this.anInt7135)) {
			arg3.aClass21_16 = this.aClass21_16;
		} else {
			arg3.aClass21_16 = null;
		}
		if (Static443.method4778(arg1, this.anInt7135)) {
			if (arg2.aShortArray107 == null || this.anInt7131 > arg2.aShortArray107.length) {
				arg3.aShortArray107 = arg2.aShortArray107 = new short[this.anInt7131];
			} else {
				arg3.aShortArray107 = arg2.aShortArray107;
			}
			for (local173 = 0; local173 < this.anInt7131; local173++) {
				arg3.aShortArray107[local173] = this.aShortArray107[local173];
			}
		} else {
			arg3.aShortArray107 = this.aShortArray107;
		}
		if (Static316.method4088(this.anInt7135, arg1)) {
			if (arg2.aByteArray92 == null || arg2.aByteArray92.length < this.anInt7131) {
				arg3.aByteArray92 = arg2.aByteArray92 = new byte[this.anInt7131];
			} else {
				arg3.aByteArray92 = arg2.aByteArray92;
			}
			for (local173 = 0; local173 < this.anInt7131; local173++) {
				arg3.aByteArray92[local173] = this.aByteArray92[local173];
			}
		} else {
			arg3.aByteArray92 = this.aByteArray92;
		}
		if (Static399.method5010(arg1, this.anInt7135)) {
			arg3.aClass21_13 = arg2.aClass21_13;
			if (arg0) {
				arg3.aByte102 = (byte) (arg3.aByte102 | 0x2);
			}
			arg3.aClass21_13.aByte4 = this.aClass21_13.aByte4;
			arg3.aClass21_13.anInterface10_2 = this.aClass21_13.anInterface10_2;
		} else if (Static280.method3526(this.anInt7135, arg1)) {
			arg3.aClass21_13 = this.aClass21_13;
		} else {
			arg3.aClass21_13 = null;
		}
		@Pc(587) int local587;
		if (Static186.method3972(this.anInt7135, arg1)) {
			if (arg2.aShortArray115 == null || arg2.aShortArray115.length < this.anInt7143) {
				local173 = this.anInt7143;
				arg3.aShortArray111 = arg2.aShortArray111 = new short[local173];
				arg3.aShortArray114 = arg2.aShortArray114 = new short[local173];
				arg3.aShortArray115 = arg2.aShortArray115 = new short[local173];
			} else {
				arg3.aShortArray115 = arg2.aShortArray115;
				arg3.aShortArray111 = arg2.aShortArray111;
				arg3.aShortArray114 = arg2.aShortArray114;
			}
			if (this.aClass23_1 == null) {
				for (local173 = 0; local173 < this.anInt7143; local173++) {
					arg3.aShortArray115[local173] = this.aShortArray115[local173];
					arg3.aShortArray111[local173] = this.aShortArray111[local173];
					arg3.aShortArray114[local173] = this.aShortArray114[local173];
				}
			} else {
				if (arg2.aClass23_1 == null) {
					arg2.aClass23_1 = new Class23();
				}
				@Pc(571) Class23 local571 = arg3.aClass23_1 = arg2.aClass23_1;
				if (local571.aShortArray13 == null || this.anInt7143 > local571.aShortArray13.length) {
					local587 = this.anInt7143;
					local571.aShortArray13 = new short[local587];
					local571.aByteArray3 = new byte[local587];
					local571.aShortArray11 = new short[local587];
					local571.aShortArray12 = new short[local587];
				}
				for (local587 = 0; local587 < this.anInt7143; local587++) {
					arg3.aShortArray115[local587] = this.aShortArray115[local587];
					arg3.aShortArray111[local587] = this.aShortArray111[local587];
					arg3.aShortArray114[local587] = this.aShortArray114[local587];
					local571.aShortArray13[local587] = this.aClass23_1.aShortArray13[local587];
					local571.aShortArray11[local587] = this.aClass23_1.aShortArray11[local587];
					local571.aShortArray12[local587] = this.aClass23_1.aShortArray12[local587];
					local571.aByteArray3[local587] = this.aClass23_1.aByteArray3[local587];
				}
			}
			arg3.aByteArray93 = this.aByteArray93;
		} else {
			arg3.aShortArray114 = this.aShortArray114;
			arg3.aShortArray111 = this.aShortArray111;
			arg3.aShortArray115 = this.aShortArray115;
			arg3.aClass23_1 = this.aClass23_1;
			arg3.aByteArray93 = this.aByteArray93;
		}
		if (Static359.method4652(this.anInt7135, arg1)) {
			arg3.aClass21_14 = arg2.aClass21_14;
			if (arg0) {
				arg3.aByte102 = (byte) (arg3.aByte102 | 0x4);
			}
			arg3.aClass21_14.anInterface10_2 = this.aClass21_14.anInterface10_2;
			arg3.aClass21_14.aByte4 = this.aClass21_14.aByte4;
		} else if (Static289.method3776(arg1, this.anInt7135)) {
			arg3.aClass21_14 = this.aClass21_14;
		} else {
			arg3.aClass21_14 = null;
		}
		if (Static6.method102(arg1, this.anInt7135)) {
			if (arg2.aFloatArray31 == null || arg2.aFloatArray31.length < this.anInt7131) {
				local173 = this.anInt7143;
				arg3.aFloatArray31 = arg2.aFloatArray31 = new float[local173];
				arg3.aFloatArray32 = arg2.aFloatArray32 = new float[local173];
			} else {
				arg3.aFloatArray31 = arg2.aFloatArray31;
				arg3.aFloatArray32 = arg2.aFloatArray32;
			}
			for (local173 = 0; local173 < this.anInt7143; local173++) {
				arg3.aFloatArray31[local173] = this.aFloatArray31[local173];
				arg3.aFloatArray32[local173] = this.aFloatArray32[local173];
			}
		} else {
			arg3.aFloatArray32 = this.aFloatArray32;
			arg3.aFloatArray31 = this.aFloatArray31;
		}
		if (Static55.method855(arg1, this.anInt7135)) {
			if (arg0) {
				arg3.aByte102 = (byte) (arg3.aByte102 | 0x8);
			}
			arg3.aClass21_15 = arg2.aClass21_15;
			arg3.aClass21_15.anInterface10_2 = this.aClass21_15.anInterface10_2;
			arg3.aClass21_15.aByte4 = this.aClass21_15.aByte4;
		} else if (Static328.method4203(arg1, this.anInt7135)) {
			arg3.aClass21_15 = this.aClass21_15;
		} else {
			arg3.aClass21_15 = null;
		}
		if (Static235.method3090(this.anInt7135, arg1)) {
			if (arg2.aShortArray110 == null || arg2.aShortArray110.length < this.anInt7131) {
				local173 = this.anInt7131;
				arg3.aShortArray109 = arg2.aShortArray109 = new short[local173];
				arg3.aShortArray110 = arg2.aShortArray110 = new short[local173];
				arg3.aShortArray112 = arg2.aShortArray112 = new short[local173];
			} else {
				arg3.aShortArray112 = arg2.aShortArray112;
				arg3.aShortArray109 = arg2.aShortArray109;
				arg3.aShortArray110 = arg2.aShortArray110;
			}
			for (local173 = 0; local173 < this.anInt7131; local173++) {
				arg3.aShortArray110[local173] = this.aShortArray110[local173];
				arg3.aShortArray112[local173] = this.aShortArray112[local173];
				arg3.aShortArray109[local173] = this.aShortArray109[local173];
			}
		} else {
			arg3.aShortArray110 = this.aShortArray110;
			arg3.aShortArray112 = this.aShortArray112;
			arg3.aShortArray109 = this.aShortArray109;
		}
		if (Static229.method3029(arg1, this.anInt7135)) {
			if (arg0) {
				arg3.aByte102 = (byte) (arg3.aByte102 | 0x10);
			}
			arg3.aClass89_1 = arg2.aClass89_1;
			arg3.aClass89_1.anInterface2_1 = this.aClass89_1.anInterface2_1;
		} else if (Static447.method5582(arg1, this.anInt7135)) {
			arg3.aClass89_1 = this.aClass89_1;
		} else {
			arg3.aClass89_1 = null;
		}
		if (Static229.method3032(this.anInt7135, arg1)) {
			if (arg2.aShortArray108 == null || this.anInt7131 > arg2.aShortArray108.length) {
				local173 = this.anInt7131;
				arg3.aShortArray108 = arg2.aShortArray108 = new short[local173];
			} else {
				arg3.aShortArray108 = arg2.aShortArray108;
			}
			for (local173 = 0; local173 < this.anInt7131; local173++) {
				arg3.aShortArray108[local173] = this.aShortArray108[local173];
			}
		} else {
			arg3.aShortArray108 = this.aShortArray108;
		}
		if (!Static330.method4212(this.anInt7135, arg1)) {
			arg3.aClass68Array1 = this.aClass68Array1;
		} else if (arg2.aClass68Array1 == null || this.anInt7167 > arg2.aClass68Array1.length) {
			local173 = this.anInt7167;
			arg3.aClass68Array1 = arg2.aClass68Array1 = new Class68[local173];
			for (local587 = 0; local587 < this.anInt7167; local587++) {
				arg3.aClass68Array1[local587] = this.aClass68Array1[local587].method1401();
			}
		} else {
			arg3.aClass68Array1 = arg2.aClass68Array1;
			for (local173 = 0; local173 < this.anInt7167; local173++) {
				arg3.aClass68Array1[local173].method1404(this.aClass68Array1[local173]);
			}
		}
		arg3.aShortArray105 = this.aShortArray105;
		arg3.aShortArray113 = this.aShortArray113;
		arg3.anIntArray476 = this.anIntArray476;
		arg3.aClass239Array4 = this.aClass239Array4;
		arg3.anIntArrayArray183 = this.anIntArrayArray183;
		arg3.aClass15Array4 = this.aClass15Array4;
		arg3.aClass221Array1 = this.aClass221Array1;
		arg3.anIntArrayArray182 = this.anIntArrayArray182;
		arg3.anIntArray477 = this.anIntArray477;
		arg3.anIntArrayArray184 = this.anIntArrayArray184;
		if (this.aBoolean589) {
			arg3.aShort93 = this.aShort93;
			arg3.aShort92 = this.aShort92;
			arg3.aBoolean589 = true;
			arg3.aShort99 = this.aShort99;
			arg3.aShort97 = this.aShort97;
			arg3.aShort98 = this.aShort98;
			arg3.aShort95 = this.aShort95;
			arg3.aShort100 = this.aShort100;
		} else {
			arg3.aBoolean589 = false;
		}
		arg3.aShortArray106 = this.aShortArray106;
		return arg3;
	}

	@OriginalMember(owner = "client!vj", name = "W", descriptor = "()V")
	@Override
	protected void W() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7123; local3++) {
			this.anIntArray478[local3] = this.anIntArray478[local3] + 7 >> 4;
			this.anIntArray480[local3] = this.anIntArray480[local3] + 7 >> 4;
			this.anIntArray479[local3] = this.anIntArray479[local3] + 7 >> 4;
		}
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
		this.aBoolean589 = false;
	}

	@OriginalMember(owner = "client!vj", name = "la", descriptor = "()I")
	@Override
	public int la() {
		if (!this.aBoolean589) {
			this.method5407();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIILclient!qc;FIJIII)S")
	private short method5405(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray477[arg8];
		@Pc(17) int local17 = this.anIntArray477[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray105[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static261.aLongArray4[local21] == arg5) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray105[local19] = (short) (this.anInt7143 + 1);
		Static261.aLongArray4[local19] = arg5;
		this.aShortArray115[this.anInt7143] = (short) arg7;
		this.aShortArray111[this.anInt7143] = (short) arg4;
		this.aShortArray114[this.anInt7143] = (short) arg1;
		this.aByteArray93[this.anInt7143] = (byte) arg6;
		this.aFloatArray31[this.anInt7143] = arg3;
		this.aFloatArray32[this.anInt7143] = arg0;
		return (short) this.anInt7143++;
	}

	@OriginalMember(owner = "client!vj", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub1_Sub25.anIntArray249[arg0];
		@Pc(13) int local13 = Class1_Sub1_Sub25.anIntArray248[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7156; local15++) {
			@Pc(34) int local34 = this.anIntArray480[local15] * local13 - this.anIntArray479[local15] * local9 >> 15;
			this.anIntArray479[local15] = this.anIntArray480[local15] * local9 + this.anIntArray479[local15] * local13 >> 15;
			this.anIntArray480[local15] = local34;
		}
		this.aBoolean589 = false;
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V")
	private void method5406(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass21_13 != null && this.aClass21_13.anInterface10_2 == null;
		@Pc(27) boolean local27 = this.aClass21_14 != null && this.aClass21_14.anInterface10_2 == null;
		@Pc(38) boolean local38 = this.aClass21_16 != null && this.aClass21_16.anInterface10_2 == null;
		@Pc(49) boolean local49 = this.aClass21_15 != null && this.aClass21_15.anInterface10_2 == null;
		if (arg0) {
			local38 &= (this.aByte102 & 0x1) != 0;
			local27 &= (this.aByte102 & 0x4) != 0;
			local49 &= (this.aByte102 & 0x8) != 0;
			local16 &= (this.aByte102 & 0x2) != 0;
		}
		@Pc(97) byte local97 = 0;
		@Pc(101) byte local101 = 0;
		@Pc(103) byte local103 = 0;
		@Pc(105) byte local105 = 0;
		if (local38) {
			local97 = 12;
		}
		if (local16) {
			local101 = local97;
			local97 = (byte) (local97 + 4);
		}
		if (local27) {
			local103 = local97;
			local97 = (byte) (local97 + 12);
		}
		if (local49) {
			local105 = local97;
			local97 = (byte) (local97 + 8);
		}
		if (local97 == 0) {
			return;
		}
		if (local97 * this.anInt7143 > Static123.aClass1_Sub11_Sub2_2.aByteArray64.length) {
			Static123.aClass1_Sub11_Sub2_2 = new Class1_Sub11_Sub2(local97 * (this.anInt7143 + 100));
		} else {
			Static123.aClass1_Sub11_Sub2_2.anInt5766 = 0;
		}
		@Pc(175) int local175;
		@Pc(184) int local184;
		@Pc(212) int local212;
		@Pc(221) int local221;
		if (local38) {
			@Pc(191) int local191;
			@Pc(198) int local198;
			@Pc(203) int local203;
			@Pc(210) int local210;
			if (this.aClass128_Sub2_42.aBoolean360) {
				for (local175 = 0; local175 < this.anInt7156; local175++) {
					local184 = NativeStream.floatToRawIntBits((float) this.anIntArray478[local175]);
					local191 = NativeStream.floatToRawIntBits((float) this.anIntArray480[local175]);
					local198 = NativeStream.floatToRawIntBits((float) this.anIntArray479[local175]);
					local203 = this.anIntArray477[local175];
					local210 = this.anIntArray477[local175 + 1];
					for (local212 = local203; local212 < local210; local212++) {
						local221 = this.aShortArray105[local212] - 1;
						if (local221 == -1) {
							break;
						}
						Static123.aClass1_Sub11_Sub2_2.anInt5766 = local97 * local221;
						Static123.aClass1_Sub11_Sub2_2.method4450(local184);
						Static123.aClass1_Sub11_Sub2_2.method4450(local191);
						Static123.aClass1_Sub11_Sub2_2.method4450(local198);
					}
				}
			} else {
				for (local175 = 0; local175 < this.anInt7156; local175++) {
					local184 = NativeStream.floatToRawIntBits((float) this.anIntArray478[local175]);
					local191 = NativeStream.floatToRawIntBits((float) this.anIntArray480[local175]);
					local198 = NativeStream.floatToRawIntBits((float) this.anIntArray479[local175]);
					local203 = this.anIntArray477[local175];
					local210 = this.anIntArray477[local175 + 1];
					for (local212 = local203; local212 < local210; local212++) {
						local221 = this.aShortArray105[local212] - 1;
						if (local221 == -1) {
							break;
						}
						Static123.aClass1_Sub11_Sub2_2.anInt5766 = local221 * local97;
						Static123.aClass1_Sub11_Sub2_2.method4462(local184);
						Static123.aClass1_Sub11_Sub2_2.method4462(local191);
						Static123.aClass1_Sub11_Sub2_2.method4462(local198);
					}
				}
			}
		}
		@Pc(452) float local452;
		@Pc(354) short[] local354;
		@Pc(350) short[] local350;
		@Pc(346) short[] local346;
		@Pc(358) byte[] local358;
		@Pc(502) float local502;
		if (local16) {
			if (this.aClass21_14 == null) {
				if (this.aClass23_1 == null) {
					local354 = this.aShortArray115;
					local346 = this.aShortArray114;
					local358 = this.aByteArray93;
					local350 = this.aShortArray111;
				} else {
					local346 = this.aClass23_1.aShortArray12;
					local350 = this.aClass23_1.aShortArray11;
					local354 = this.aClass23_1.aShortArray13;
					local358 = this.aClass23_1.aByteArray3;
				}
				@Pc(378) float local378 = this.aClass128_Sub2_42.aFloatArray23[0];
				@Pc(384) float local384 = this.aClass128_Sub2_42.aFloatArray23[1];
				@Pc(390) float local390 = this.aClass128_Sub2_42.aFloatArray23[2];
				@Pc(394) float local394 = this.aClass128_Sub2_42.aFloat59;
				@Pc(404) float local404 = this.aClass128_Sub2_42.aFloat54 * 768.0F / (float) this.aShort96;
				@Pc(414) float local414 = this.aClass128_Sub2_42.aFloat57 * 768.0F / (float) this.aShort96;
				for (@Pc(416) int local416 = 0; local416 < this.anInt7131; local416++) {
					@Pc(436) int local436 = this.method5399(this.aByteArray92[local416], this.aShortArray107[local416], this.aShort94, this.aShortArray108[local416]);
					@Pc(441) short local441 = this.aShortArray110[local416];
					local452 = this.aClass128_Sub2_42.aFloat63 * (float) (local436 >> 16 & 0xFF);
					@Pc(463) float local463 = this.aClass128_Sub2_42.aFloat58 * (float) (local436 >> 8 & 0xFF);
					@Pc(472) float local472 = (float) (local436 >>> 24) * this.aClass128_Sub2_42.aFloat69;
					@Pc(477) short local477 = (short) local358[local441];
					if (local477 == 0) {
						local502 = (local384 * (float) local350[local441] + local378 * (float) local354[local441] + (float) local346[local441] * local390) * 0.0026041667F;
					} else {
						local502 = ((float) local350[local441] * local384 + (float) local354[local441] * local378 + (float) local346[local441] * local390) / (float) (local477 * 256);
					}
					@Pc(542) float local542 = local502 * (local502 < 0.0F ? local414 : local404) + local394;
					@Pc(547) int local547 = (int) (local472 * local542);
					if (local547 < 0) {
						local547 = 0;
					} else if (local547 > 255) {
						local547 = 255;
					}
					@Pc(565) int local565 = (int) (local542 * local452);
					@Pc(570) int local570 = (int) (local542 * local463);
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					Static123.aClass1_Sub11_Sub2_2.anInt5766 = local101 + local441 * local97;
					Static123.aClass1_Sub11_Sub2_2.method4445(local547);
					Static123.aClass1_Sub11_Sub2_2.method4445(local565);
					Static123.aClass1_Sub11_Sub2_2.method4445(local570);
					Static123.aClass1_Sub11_Sub2_2.method4445(255 - (this.aByteArray92[local416] & 0xFF));
					local441 = this.aShortArray112[local416];
					local477 = local358[local441];
					if (local477 == 0) {
						local502 = (local378 * (float) local354[local441] + (float) local350[local441] * local384 + (float) local346[local441] * local390) * 0.0026041667F;
					} else {
						local502 = (local390 * (float) local346[local441] + (float) local350[local441] * local384 + (float) local354[local441] * local378) / (float) (local477 * 256);
					}
					local542 = local502 * (local502 < 0.0F ? local414 : local404) + local394;
					local547 = (int) (local542 * local472);
					if (local547 < 0) {
						local547 = 0;
					} else if (local547 > 255) {
						local547 = 255;
					}
					local565 = (int) (local542 * local452);
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					local570 = (int) (local542 * local463);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					Static123.aClass1_Sub11_Sub2_2.anInt5766 = local441 * local97 + local101;
					Static123.aClass1_Sub11_Sub2_2.method4445(local547);
					Static123.aClass1_Sub11_Sub2_2.method4445(local565);
					Static123.aClass1_Sub11_Sub2_2.method4445(local570);
					Static123.aClass1_Sub11_Sub2_2.method4445(255 - (this.aByteArray92[local416] & 0xFF));
					local441 = this.aShortArray109[local416];
					local477 = local358[local441];
					if (local477 == 0) {
						local502 = (local378 * (float) local354[local441] + (float) local350[local441] * local384 + (float) local346[local441] * local390) * 0.0026041667F;
					} else {
						local502 = (local384 * (float) local350[local441] + (float) local354[local441] * local378 + local390 * (float) local346[local441]) / (float) (local477 * 256);
					}
					local542 = local394 + (local502 < 0.0F ? local414 : local404) * local502;
					local547 = (int) (local542 * local472);
					local565 = (int) (local452 * local542);
					if (local547 < 0) {
						local547 = 0;
					} else if (local547 > 255) {
						local547 = 255;
					}
					local570 = (int) (local542 * local463);
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					Static123.aClass1_Sub11_Sub2_2.anInt5766 = local97 * local441 + local101;
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					Static123.aClass1_Sub11_Sub2_2.method4445(local547);
					Static123.aClass1_Sub11_Sub2_2.method4445(local565);
					Static123.aClass1_Sub11_Sub2_2.method4445(local570);
					Static123.aClass1_Sub11_Sub2_2.method4445(255 - (this.aByteArray92[local416] & 0xFF));
				}
			} else {
				for (local175 = 0; local175 < this.anInt7131; local175++) {
					local184 = this.method5399(this.aByteArray92[local175], this.aShortArray107[local175], this.aShort94, this.aShortArray108[local175]);
					Static123.aClass1_Sub11_Sub2_2.anInt5766 = local97 * this.aShortArray110[local175] + local101;
					Static123.aClass1_Sub11_Sub2_2.method4450(local184);
					Static123.aClass1_Sub11_Sub2_2.anInt5766 = local101 + local97 * this.aShortArray112[local175];
					Static123.aClass1_Sub11_Sub2_2.method4450(local184);
					Static123.aClass1_Sub11_Sub2_2.anInt5766 = local97 * this.aShortArray109[local175] + local101;
					Static123.aClass1_Sub11_Sub2_2.method4450(local184);
				}
			}
		}
		if (local27) {
			if (this.aClass23_1 == null) {
				local350 = this.aShortArray111;
				local354 = this.aShortArray115;
				local346 = this.aShortArray114;
				local358 = this.aByteArray93;
			} else {
				local350 = this.aClass23_1.aShortArray11;
				local346 = this.aClass23_1.aShortArray12;
				local358 = this.aClass23_1.aByteArray3;
				local354 = this.aClass23_1.aShortArray13;
			}
			@Pc(1071) float local1071 = 3.0F / (float) this.aShort96;
			Static123.aClass1_Sub11_Sub2_2.anInt5766 = local103;
			local502 = 3.0F / (float) (this.aShort96 + this.aShort96 / 2);
			if (this.aClass128_Sub2_42.aBoolean360) {
				for (local212 = 0; local212 < this.anInt7143; local212++) {
					local221 = local358[local212] & 0xFF;
					if (local221 == 0) {
						Static123.aClass1_Sub11_Sub2_2.method4507((float) local354[local212] * local502);
						Static123.aClass1_Sub11_Sub2_2.method4507((float) local350[local212] * local502);
						Static123.aClass1_Sub11_Sub2_2.method4507(local502 * (float) local346[local212]);
					} else {
						local452 = local1071 / (float) local221;
						Static123.aClass1_Sub11_Sub2_2.method4507((float) local354[local212] * local452);
						Static123.aClass1_Sub11_Sub2_2.method4507(local452 * (float) local350[local212]);
						Static123.aClass1_Sub11_Sub2_2.method4507((float) local346[local212] * local452);
					}
					Static123.aClass1_Sub11_Sub2_2.anInt5766 += local97 - 12;
				}
			} else {
				for (local212 = 0; local212 < this.anInt7143; local212++) {
					local221 = local358[local212] & 0xFF;
					if (local221 == 0) {
						Static123.aClass1_Sub11_Sub2_2.method4509(local502 * (float) local354[local212]);
						Static123.aClass1_Sub11_Sub2_2.method4509((float) local350[local212] * local502);
						Static123.aClass1_Sub11_Sub2_2.method4509(local502 * (float) local346[local212]);
					} else {
						local452 = local1071 / (float) local221;
						Static123.aClass1_Sub11_Sub2_2.method4509(local452 * (float) local354[local212]);
						Static123.aClass1_Sub11_Sub2_2.method4509((float) local350[local212] * local452);
						Static123.aClass1_Sub11_Sub2_2.method4509(local452 * (float) local346[local212]);
					}
					Static123.aClass1_Sub11_Sub2_2.anInt5766 += local97 - 12;
				}
			}
		}
		if (local49) {
			Static123.aClass1_Sub11_Sub2_2.anInt5766 = local105;
			if (this.aClass128_Sub2_42.aBoolean360) {
				for (local175 = 0; local175 < this.anInt7143; local175++) {
					Static123.aClass1_Sub11_Sub2_2.method4507(this.aFloatArray31[local175]);
					Static123.aClass1_Sub11_Sub2_2.method4507(this.aFloatArray32[local175]);
					Static123.aClass1_Sub11_Sub2_2.anInt5766 += local97 - 8;
				}
			} else {
				for (local175 = 0; local175 < this.anInt7143; local175++) {
					Static123.aClass1_Sub11_Sub2_2.method4509(this.aFloatArray31[local175]);
					Static123.aClass1_Sub11_Sub2_2.method4509(this.aFloatArray32[local175]);
					Static123.aClass1_Sub11_Sub2_2.anInt5766 += local97 - 8;
				}
			}
		}
		Static123.aClass1_Sub11_Sub2_2.anInt5766 = local97 * this.anInt7143;
		@Pc(1388) Interface10 local1388;
		if (arg0) {
			if (this.anInterface10_7 == null) {
				this.anInterface10_7 = this.aClass128_Sub2_42.method3657(local97, Static123.aClass1_Sub11_Sub2_2.anInt5766, true, Static123.aClass1_Sub11_Sub2_2.aByteArray64);
			} else {
				this.anInterface10_7.method4283(Static123.aClass1_Sub11_Sub2_2.aByteArray64, Static123.aClass1_Sub11_Sub2_2.anInt5766, local97);
			}
			this.aByte102 = 0;
			local1388 = this.anInterface10_7;
		} else {
			local1388 = this.aClass128_Sub2_42.method3657(local97, Static123.aClass1_Sub11_Sub2_2.anInt5766, false, Static123.aClass1_Sub11_Sub2_2.aByteArray64);
			this.aBoolean590 = true;
		}
		if (local38) {
			this.aClass21_16.anInterface10_2 = local1388;
			this.aClass21_16.aByte4 = 0;
		}
		if (local49) {
			this.aClass21_15.aByte4 = local105;
			this.aClass21_15.anInterface10_2 = local1388;
		}
		if (local16) {
			this.aClass21_13.aByte4 = local101;
			this.aClass21_13.anInterface10_2 = local1388;
		}
		if (local27) {
			this.aClass21_14.aByte4 = local103;
			this.aClass21_14.anInterface10_2 = local1388;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	private void method5407() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt7156; local27++) {
			@Pc(34) int local34 = this.anIntArray478[local27];
			@Pc(39) int local39 = this.anIntArray480[local27];
			if (local9 > local39) {
				local9 = local39;
			}
			if (local15 < local39) {
				local15 = local39;
			}
			if (local34 < local7) {
				local7 = local34;
			}
			@Pc(67) int local67 = this.anIntArray479[local27];
			if (local34 > local13) {
				local13 = local34;
			}
			if (local17 < local67) {
				local17 = local67;
			}
			if (local67 < local11) {
				local11 = local67;
			}
			@Pc(99) int local99 = local34 * local34 + local67 * local67;
			if (local99 > local23) {
				local23 = local99;
			}
			local99 = local39 * local39 + local67 * local67 + local34 * local34;
			if (local25 < local99) {
				local25 = local99;
			}
		}
		this.aShort100 = (short) local13;
		this.aShort92 = (short) local11;
		this.aShort95 = (short) local17;
		this.aShort98 = (short) local7;
		this.aShort99 = (short) local15;
		this.aShort93 = (short) local9;
		this.aShort97 = (short) (Math.sqrt((double) local23) + 0.99D);
		Math.sqrt((double) local25);
		this.aBoolean589 = true;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	private void method5408() {
		if (!this.aBoolean590) {
			return;
		}
		this.aBoolean590 = false;
		if (this.aClass239Array4 == null && this.aClass15Array4 == null && this.aClass221Array1 == null) {
			if (this.anIntArray478 != null && !Static426.method5317(this.anInt7133, this.anInt7135)) {
				if (this.aClass21_16 != null && this.aClass21_16.anInterface10_2 == null) {
					this.aBoolean590 = true;
				} else {
					if (!this.aBoolean589) {
						this.method5407();
					}
					this.anIntArray478 = null;
				}
			}
			if (this.anIntArray480 != null && !Static131.method1782(this.anInt7135, this.anInt7133)) {
				if (this.aClass21_16 != null && this.aClass21_16.anInterface10_2 == null) {
					this.aBoolean590 = true;
				} else {
					if (!this.aBoolean589) {
						this.method5407();
					}
					this.anIntArray480 = null;
				}
			}
			if (this.anIntArray479 != null && !Static389.method1531(this.anInt7135, this.anInt7133)) {
				if (this.aClass21_16 != null && this.aClass21_16.anInterface10_2 == null) {
					this.aBoolean590 = true;
				} else {
					if (!this.aBoolean589) {
						this.method5407();
					}
					this.anIntArray479 = null;
				}
			}
		}
		if (this.aShortArray105 != null && this.anIntArray478 == null && this.anIntArray480 == null && this.anIntArray479 == null) {
			this.aShortArray105 = null;
			this.anIntArray477 = null;
		}
		if (this.aByteArray93 != null && !Static208.method2802(this.anInt7133, this.anInt7135)) {
			if (this.aClass21_14 == null) {
				if (this.aClass21_13 != null && this.aClass21_13.anInterface10_2 == null) {
					this.aBoolean590 = true;
				} else {
					this.aByteArray93 = null;
					this.aShortArray115 = this.aShortArray111 = this.aShortArray114 = null;
				}
			} else if (this.aClass21_14.anInterface10_2 == null) {
				this.aBoolean590 = true;
			} else {
				this.aByteArray93 = null;
				this.aShortArray115 = this.aShortArray111 = this.aShortArray114 = null;
			}
		}
		if (this.aShortArray107 != null && !Static1.method36(this.anInt7133, this.anInt7135)) {
			if (this.aClass21_13 != null && this.aClass21_13.anInterface10_2 == null) {
				this.aBoolean590 = true;
			} else {
				this.aShortArray107 = null;
			}
		}
		if (this.aByteArray92 != null && !Static13.method206(this.anInt7133, this.anInt7135)) {
			if (this.aClass21_13 != null && this.aClass21_13.anInterface10_2 == null) {
				this.aBoolean590 = true;
			} else {
				this.aByteArray92 = null;
			}
		}
		if (this.aFloatArray31 != null && !Static278.method3523(this.anInt7135, this.anInt7133)) {
			if (this.aClass21_15 != null && this.aClass21_15.anInterface10_2 == null) {
				this.aBoolean590 = true;
			} else {
				this.aFloatArray31 = this.aFloatArray32 = null;
			}
		}
		if (this.aShortArray108 != null && !Static177.method2369(this.anInt7133, this.anInt7135)) {
			if (this.aClass21_13 != null && this.aClass21_13.anInterface10_2 == null) {
				this.aBoolean590 = true;
			} else {
				this.aShortArray108 = null;
			}
		}
		if (this.aShortArray110 != null && !Static174.method2343(this.anInt7133, this.anInt7135)) {
			if (this.aClass89_1 != null && this.aClass89_1.anInterface2_1 == null || this.aClass21_13 != null && this.aClass21_13.anInterface10_2 == null) {
				this.aBoolean590 = true;
			} else {
				this.aShortArray110 = this.aShortArray112 = this.aShortArray109 = null;
			}
		}
		if (this.anIntArrayArray184 != null && !Static148.method2091(this.anInt7133, this.anInt7135)) {
			this.anIntArrayArray184 = null;
			this.aShortArray113 = null;
		}
		if (this.anIntArrayArray182 != null && !Static330.method4214(this.anInt7133, this.anInt7135)) {
			this.anIntArrayArray182 = null;
			this.aShortArray106 = null;
		}
		if (this.anIntArrayArray183 != null && !Static87.method1273(this.anInt7133, this.anInt7135)) {
			this.anIntArrayArray183 = null;
		}
		if (this.anIntArray476 != null && (this.anInt7133 & 0x800) == 0 && (this.anInt7133 & 0x40000) == 0) {
			this.anIntArray476 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class33 method5383(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class33_Sub2 local21;
		@Pc(17) Class33_Sub2 local17;
		if (arg0 == 1) {
			local21 = this.aClass128_Sub2_42.aClass33_Sub2_9;
			local17 = this.aClass128_Sub2_42.aClass33_Sub2_4;
		} else if (arg0 == 2) {
			local17 = this.aClass128_Sub2_42.aClass33_Sub2_5;
			local21 = this.aClass128_Sub2_42.aClass33_Sub2_8;
		} else if (arg0 == 3) {
			local17 = this.aClass128_Sub2_42.aClass33_Sub2_6;
			local21 = this.aClass128_Sub2_42.aClass33_Sub2_10;
		} else if (arg0 == 4) {
			local21 = this.aClass128_Sub2_42.aClass33_Sub2_1;
			local17 = this.aClass128_Sub2_42.aClass33_Sub2_2;
		} else if (arg0 == 5) {
			local17 = this.aClass128_Sub2_42.aClass33_Sub2_7;
			local21 = this.aClass128_Sub2_42.aClass33_Sub2_3;
		} else {
			local21 = local17 = new Class33_Sub2(this.aClass128_Sub2_42);
		}
		return this.method5404(arg0 != 0, arg1, local17, local21, arg2);
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub1_Sub25.anIntArray249[arg0];
		@Pc(13) int local13 = Class1_Sub1_Sub25.anIntArray248[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7156; local15++) {
			@Pc(34) int local34 = this.anIntArray479[local15] * local9 + local13 * this.anIntArray478[local15] >> 15;
			this.anIntArray479[local15] = local13 * this.anIntArray479[local15] - this.anIntArray478[local15] * local9 >> 15;
			this.anIntArray478[local15] = local34;
		}
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
		this.aBoolean589 = false;
	}

	@OriginalMember(owner = "client!vj", name = "XA", descriptor = "(III)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7156; local3++) {
			if (arg0 != 128) {
				this.anIntArray478[local3] = arg0 * this.anIntArray478[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray480[local3] = arg1 * this.anIntArray480[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray479[local3] = arg2 * this.anIntArray479[local3] >> 7;
			}
		}
		this.aBoolean589 = false;
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	private void method5409() {
		if (this.aClass221Array1 == null) {
			return;
		}
		@Pc(8) Class40_Sub2 local8 = this.aClass128_Sub2_42.aClass40_Sub2_2;
		@Pc(12) float local12 = this.aClass128_Sub2_42.w();
		@Pc(16) float local16 = this.aClass128_Sub2_42.la();
		this.aClass128_Sub2_42.method3687();
		this.aClass128_Sub2_42.method3598(false);
		this.aClass128_Sub2_42.method3621(false);
		this.aClass128_Sub2_42.method3664(this.aClass128_Sub2_42.aClass21_8, null, null, this.aClass128_Sub2_42.aClass21_7);
		for (@Pc(45) int local45 = 0; local45 < this.anInt7167; local45++) {
			@Pc(52) Class221 local52 = this.aClass221Array1[local45];
			@Pc(57) Class68 local57 = this.aClass68Array1[local45];
			if (!local52.aBoolean513 || !this.aClass128_Sub2_42.method3536()) {
				@Pc(86) float local86 = (float) (this.anIntArray478[local52.anInt6211] + this.anIntArray478[local52.anInt6216] + this.anIntArray478[local52.anInt6217]) * 0.3333333F;
				@Pc(107) float local107 = (float) (this.anIntArray480[local52.anInt6211] + this.anIntArray480[local52.anInt6217] + this.anIntArray480[local52.anInt6216]) * 0.3333333F;
				@Pc(129) float local129 = (float) (this.anIntArray479[local52.anInt6217] + this.anIntArray479[local52.anInt6216] + this.anIntArray479[local52.anInt6211]) * 0.3333333F;
				@Pc(143) float local143 = Static90.aFloat26 * local129 + Static137.aFloat33 * local86 + Static16.aFloat46 * local107 + Static177.aFloat38;
				@Pc(157) float local157 = Static75.aFloat22 + Static188.aFloat41 * local129 + local86 * Static448.aFloat92 + Static441.aFloat99 * local107;
				@Pc(171) float local171 = local129 * Static195.aFloat43 + Static301.aFloat76 * local107 + Static437.aFloat97 * local86 + Static188.aFloat40;
				local8.method1133(local52.aShort74 * local57.anInt1715 >> 7, -local171, (float) local57.anInt1713 + local143, local57.anInt1720 * local52.aShort72 >> 7, local57.anInt1722, (float) local57.anInt1719 - local157);
				this.aClass128_Sub2_42.method3685(local8);
				this.aClass128_Sub2_42.o(local16, local12 - (float) local52.anInt6213 * 1.5F);
				@Pc(223) int local223 = local57.anInt1717;
				OpenGL.glColor4ub((byte) (local223 >> 16), (byte) (local223 >> 8), (byte) local223, (byte) (local223 >> 24));
				this.aClass128_Sub2_42.method3652(local52.aShort73);
				this.aClass128_Sub2_42.method3653(local52.aByte81);
				this.aClass128_Sub2_42.method3677(local52.aByte82);
				this.aClass128_Sub2_42.method3645(4);
			}
		}
		this.aClass128_Sub2_42.o(local16, local12);
		this.aClass128_Sub2_42.method3598(true);
		this.aClass128_Sub2_42.method3680();
	}

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "()I")
	@Override
	public int C() {
		if (!this.aBoolean589) {
			this.method5407();
		}
		return this.aShort95;
	}

	@OriginalMember(owner = "client!vj", name = "sa", descriptor = "()V")
	@Override
	public void sa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7156; local7++) {
			this.anIntArray479[local7] = -this.anIntArray479[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7143; local29++) {
			this.aShortArray114[local29] = (short) -this.aShortArray114[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt7131; local48++) {
			@Pc(55) short local55 = this.aShortArray110[local48];
			this.aShortArray110[local48] = this.aShortArray109[local48];
			this.aShortArray109[local48] = local55;
		}
		if (this.aClass21_14 == null && this.aClass21_13 != null) {
			this.aClass21_13.anInterface10_2 = null;
		}
		if (this.aClass21_14 != null) {
			this.aClass21_14.anInterface10_2 = null;
		}
		if (this.aClass21_16 != null) {
			this.aClass21_16.anInterface10_2 = null;
		}
		this.aBoolean589 = false;
		if (this.aClass89_1 != null) {
			this.aClass89_1.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "()Z")
	@Override
	public boolean method5387() {
		if (this.aShortArray108 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray108.length; local12++) {
			if (this.aShortArray108[local12] != -1 && !this.aClass128_Sub2_42.anInterface8_8.method1376(this.aShortArray108[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	private void method5410() {
		if (this.anInt7146 == 0) {
			return;
		}
		if (this.aByte102 != 0) {
			this.method5406(true);
		}
		this.method5406(false);
		if (this.aClass89_1 != null) {
			if (this.aClass89_1.anInterface2_1 == null) {
				this.method5403((this.aByte102 & 0x10) != 0);
			}
			if (this.aClass89_1.anInterface2_1 != null) {
				this.aClass128_Sub2_42.method3621(this.aClass21_14 != null);
				this.aClass128_Sub2_42.method3664(this.aClass21_15, this.aClass21_13, this.aClass21_14, this.aClass21_16);
				@Pc(82) int local82 = this.anIntArray476.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray476[local84];
					@Pc(98) int local98 = this.anIntArray476[local84 + 1];
					@Pc(105) int local105 = this.aShortArray108[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass128_Sub2_42.method3663(local105, this.aClass21_14 != null);
					this.aClass128_Sub2_42.method3627((local98 - local91) * 3, local91 * 3, this.aClass89_1.anInterface2_1);
				}
			}
		}
		this.method5408();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg0 && arg1 > arg0 && arg6 > arg0) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg1 && arg0 > arg6) {
			return false;
		} else if (arg4 > arg3 && arg7 > arg3 && arg3 < arg2) {
			return false;
		} else {
			return arg3 <= arg4 || arg3 <= arg7 || arg2 >= arg3;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method5395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class40_Sub2 local8 = (Class40_Sub2) arg2;
		@Pc(12) Class40_Sub2 local12 = this.aClass128_Sub2_42.aClass40_Sub2_3;
		@Pc(33) float local33 = local12.aFloat10 * local8.aFloat17 + local12.aFloat16 * local8.aFloat13 + local8.aFloat14 * local12.aFloat18 + local12.aFloat13;
		@Pc(54) float local54 = local8.aFloat14 * local12.aFloat11 + local8.aFloat13 * local12.aFloat15 + local12.aFloat20 * local8.aFloat17 + local12.aFloat17;
		Static195.aFloat43 = local8.aFloat18 * local12.aFloat9 + local12.aFloat19 * local8.aFloat11 + local12.aFloat12 * local8.aFloat12;
		Static188.aFloat41 = local12.aFloat20 * local8.aFloat11 + local8.aFloat18 * local12.aFloat15 + local12.aFloat11 * local8.aFloat12;
		Static137.aFloat33 = local12.aFloat10 * local8.aFloat15 + local8.aFloat16 * local12.aFloat16 + local12.aFloat18 * local8.aFloat9;
		Static448.aFloat92 = local12.aFloat11 * local8.aFloat9 + local8.aFloat16 * local12.aFloat15 + local8.aFloat15 * local12.aFloat20;
		Static16.aFloat46 = local8.aFloat19 * local12.aFloat18 + local8.aFloat10 * local12.aFloat16 + local8.aFloat20 * local12.aFloat10;
		Static301.aFloat76 = local12.aFloat19 * local8.aFloat20 + local8.aFloat10 * local12.aFloat9 + local12.aFloat12 * local8.aFloat19;
		Static90.aFloat26 = local8.aFloat18 * local12.aFloat16 + local8.aFloat11 * local12.aFloat10 + local8.aFloat12 * local12.aFloat18;
		@Pc(201) float local201 = local12.aFloat9 * local8.aFloat13 + local8.aFloat17 * local12.aFloat19 + local12.aFloat12 * local8.aFloat14 + local12.aFloat14;
		Static437.aFloat97 = local12.aFloat12 * local8.aFloat9 + local12.aFloat9 * local8.aFloat16 + local12.aFloat19 * local8.aFloat15;
		Static441.aFloat99 = local8.aFloat20 * local12.aFloat20 + local8.aFloat10 * local12.aFloat15 + local8.aFloat19 * local12.aFloat11;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass128_Sub2_42.anInt4616;
		@Pc(255) int local255 = this.aClass128_Sub2_42.anInt4629;
		if (!this.aBoolean589) {
			this.method5407();
		}
		Static296.anIntArray263[0] = this.aShort98;
		Static305.anIntArray299[0] = this.aShort93;
		Static172.anIntArray148[0] = this.aShort92;
		Static296.anIntArray263[1] = this.aShort100;
		Static305.anIntArray299[1] = this.aShort93;
		Static296.anIntArray263[2] = this.aShort98;
		Static172.anIntArray148[1] = this.aShort92;
		Static305.anIntArray299[2] = this.aShort99;
		Static172.anIntArray148[2] = this.aShort92;
		Static296.anIntArray263[3] = this.aShort100;
		Static305.anIntArray299[3] = this.aShort99;
		Static296.anIntArray263[4] = this.aShort98;
		Static172.anIntArray148[3] = this.aShort92;
		Static305.anIntArray299[4] = this.aShort93;
		Static172.anIntArray148[4] = this.aShort95;
		Static296.anIntArray263[5] = this.aShort100;
		Static305.anIntArray299[5] = this.aShort93;
		Static296.anIntArray263[6] = this.aShort98;
		Static172.anIntArray148[5] = this.aShort95;
		Static305.anIntArray299[6] = this.aShort99;
		Static296.anIntArray263[7] = this.aShort100;
		Static172.anIntArray148[6] = this.aShort95;
		Static305.anIntArray299[7] = this.aShort99;
		Static172.anIntArray148[7] = this.aShort95;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static296.anIntArray263[local383];
			local395 = Static305.anIntArray299[local383];
			local400 = Static172.anIntArray148[local383];
			local414 = local201 + local390 * Static437.aFloat97 + local395 * Static301.aFloat76 + local400 * Static195.aFloat43;
			local428 = local33 + local400 * Static90.aFloat26 + local395 * Static16.aFloat46 + Static137.aFloat33 * local390;
			local442 = Static448.aFloat92 * local390 + Static441.aFloat99 * local395 + local400 * Static188.aFloat41 + local54;
			if (local414 >= (float) this.aClass128_Sub2_42.anInt4620) {
				@Pc(461) float local461 = (float) this.aClass128_Sub2_42.anInt4644 + (float) local251 * local428 / local414;
				@Pc(473) float local473 = (float) this.aClass128_Sub2_42.anInt4638 + (float) local255 * local442 / local414;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				local239 = true;
				if (local473 > local247) {
					local247 = local473;
				}
				if (local245 > local473) {
					local245 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt7143 > Static399.anIntArray402.length) {
				Static399.anIntArray402 = new int[this.anInt7143];
				Static19.anIntArray15 = new int[this.anInt7143];
			}
			@Pc(632) int local632;
			for (@Pc(550) int local550 = 0; local550 < this.anInt7156; local550++) {
				local400 = this.anIntArray479[local550];
				local390 = this.anIntArray478[local550];
				local395 = this.anIntArray480[local550];
				local414 = local395 * Static301.aFloat76 + Static437.aFloat97 * local390 + local400 * Static195.aFloat43 + local201;
				local428 = local33 + local395 * Static16.aFloat46 + local390 * Static137.aFloat33 + local400 * Static90.aFloat26;
				local442 = local54 + local390 * Static448.aFloat92 + Static441.aFloat99 * local395 + Static188.aFloat41 * local400;
				@Pc(645) int local645;
				@Pc(650) int local650;
				@Pc(657) int local657;
				if ((float) this.aClass128_Sub2_42.anInt4620 <= local414) {
					local632 = (int) (local428 * (float) local251 / local414 + (float) this.aClass128_Sub2_42.anInt4644);
					local645 = (int) ((float) this.aClass128_Sub2_42.anInt4638 + (float) local255 * local442 / local414);
					local650 = this.anIntArray477[local550];
					local657 = this.anIntArray477[local550 + 1];
					for (@Pc(659) int local659 = local650; local659 < local657; local659++) {
						@Pc(668) int local668 = this.aShortArray105[local659] - 1;
						if (local668 == -1) {
							break;
						}
						Static399.anIntArray402[local668] = local632;
						Static19.anIntArray15[local668] = local645;
					}
				} else {
					local632 = this.anIntArray477[local550];
					local645 = this.anIntArray477[local550 + 1];
					for (local650 = local632; local650 < local645; local650++) {
						local657 = this.aShortArray105[local650] - 1;
						if (local657 == -1) {
							break;
						}
						Static399.anIntArray402[this.aShortArray105[local650] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt7131; local632++) {
				if (Static399.anIntArray402[this.aShortArray110[local632]] != -999999 && Static399.anIntArray402[this.aShortArray112[local632]] != -999999 && Static399.anIntArray402[this.aShortArray109[local632]] != -999999 && this.method5411(arg1, Static19.anIntArray15[this.aShortArray112[local632]], Static399.anIntArray402[this.aShortArray109[local632]], arg0, Static399.anIntArray402[this.aShortArray110[local632]], Static19.anIntArray15[this.aShortArray110[local632]], Static19.anIntArray15[this.aShortArray109[local632]], Static399.anIntArray402[this.aShortArray112[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "xa", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			Static271.anInt4268 = 0;
			Static313.anInt5203 = 0;
			Static218.anInt5618 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray182.length) {
					local48 = this.anIntArrayArray182[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static271.anInt4268 += this.anIntArray478[local56];
						Static218.anInt5618 += this.anIntArray480[local56];
						Static313.anInt5203 += this.anIntArray479[local56];
						local30++;
					}
				}
			}
			if (local30 <= 0) {
				Static313.anInt5203 = local14;
				Static271.anInt4268 = local22;
				Static218.anInt5618 = local18;
			} else {
				Static313.anInt5203 = Static313.anInt5203 / local30 + local14;
				Static218.anInt5618 = Static218.anInt5618 / local30 + local18;
				Static271.anInt4268 = Static271.anInt4268 / local30 + local22;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local14 = arg4 << 4;
			local22 = arg2 << 4;
			local18 = arg3 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray182.length) {
					local156 = this.anIntArrayArray182[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray478[local50] += local22;
						this.anIntArray480[local50] += local18;
						this.anIntArray479[local50] += local14;
					}
				}
			}
			return;
		}
		@Pc(276) int local276;
		@Pc(294) int local294;
		@Pc(746) int local746;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray182.length > local32) {
					local156 = this.anIntArrayArray182[local32];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray478[local50] -= Static271.anInt4268;
							this.anIntArray480[local50] -= Static218.anInt5618;
							this.anIntArray479[local50] -= Static313.anInt5203;
							if (arg4 != 0) {
								local56 = Class1_Sub1_Sub25.anIntArray249[arg4];
								local276 = Class1_Sub1_Sub25.anIntArray248[arg4];
								local294 = local276 * this.anIntArray478[local50] + this.anIntArray480[local50] * local56 + 32767 >> 15;
								this.anIntArray480[local50] = local276 * this.anIntArray480[local50] + 32767 - this.anIntArray478[local50] * local56 >> 15;
								this.anIntArray478[local50] = local294;
							}
							if (arg2 != 0) {
								local56 = Class1_Sub1_Sub25.anIntArray249[arg2];
								local276 = Class1_Sub1_Sub25.anIntArray248[arg2];
								local294 = local276 * this.anIntArray480[local50] + 32767 - local56 * this.anIntArray479[local50] >> 15;
								this.anIntArray479[local50] = local56 * this.anIntArray480[local50] + local276 * this.anIntArray479[local50] + 32767 >> 15;
								this.anIntArray480[local50] = local294;
							}
							if (arg3 != 0) {
								local56 = Class1_Sub1_Sub25.anIntArray249[arg3];
								local276 = Class1_Sub1_Sub25.anIntArray248[arg3];
								local294 = this.anIntArray479[local50] * local56 + local276 * this.anIntArray478[local50] + 32767 >> 15;
								this.anIntArray479[local50] = this.anIntArray479[local50] * local276 + 32767 - local56 * this.anIntArray478[local50] >> 15;
								this.anIntArray478[local50] = local294;
							}
							this.anIntArray478[local50] += Static271.anInt4268;
							this.anIntArray480[local50] += Static218.anInt5618;
							this.anIntArray479[local50] += Static313.anInt5203;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray478[local50] -= Static271.anInt4268;
							this.anIntArray480[local50] -= Static218.anInt5618;
							this.anIntArray479[local50] -= Static313.anInt5203;
							if (arg2 != 0) {
								local56 = Class1_Sub1_Sub25.anIntArray249[arg2];
								local276 = Class1_Sub1_Sub25.anIntArray248[arg2];
								local294 = local276 * this.anIntArray480[local50] + 32767 - this.anIntArray479[local50] * local56 >> 15;
								this.anIntArray479[local50] = this.anIntArray480[local50] * local56 + this.anIntArray479[local50] * local276 + 32767 >> 15;
								this.anIntArray480[local50] = local294;
							}
							if (arg4 != 0) {
								local56 = Class1_Sub1_Sub25.anIntArray249[arg4];
								local276 = Class1_Sub1_Sub25.anIntArray248[arg4];
								local294 = this.anIntArray478[local50] * local276 + this.anIntArray480[local50] * local56 + 32767 >> 15;
								this.anIntArray480[local50] = this.anIntArray480[local50] * local276 + 32767 - local56 * this.anIntArray478[local50] >> 15;
								this.anIntArray478[local50] = local294;
							}
							if (arg3 != 0) {
								local56 = Class1_Sub1_Sub25.anIntArray249[arg3];
								local276 = Class1_Sub1_Sub25.anIntArray248[arg3];
								local294 = this.anIntArray479[local50] * local56 + this.anIntArray478[local50] * local276 + 32767 >> 15;
								this.anIntArray479[local50] = this.anIntArray479[local50] * local276 + 32767 - local56 * this.anIntArray478[local50] >> 15;
								this.anIntArray478[local50] = local294;
							}
							this.anIntArray478[local50] += Static271.anInt4268;
							this.anIntArray480[local50] += Static218.anInt5618;
							this.anIntArray479[local50] += Static313.anInt5203;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray182.length) {
						local48 = this.anIntArrayArray182[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local276 = this.anIntArray477[local56];
							local294 = this.anIntArray477[local56 + 1];
							for (local746 = local276; local746 < local294; local746++) {
								@Pc(755) int local755 = this.aShortArray105[local746] - 1;
								if (local755 == -1) {
									break;
								}
								@Pc(765) int local765;
								@Pc(769) int local769;
								@Pc(788) int local788;
								if (arg4 != 0) {
									local765 = Class1_Sub1_Sub25.anIntArray249[arg4];
									local769 = Class1_Sub1_Sub25.anIntArray248[arg4];
									local788 = this.aShortArray111[local755] * local765 + local769 * this.aShortArray115[local755] + 32767 >> 15;
									this.aShortArray111[local755] = (short) (local769 * this.aShortArray111[local755] + 32767 - this.aShortArray115[local755] * local765 >> 15);
									this.aShortArray115[local755] = (short) local788;
								}
								if (arg2 != 0) {
									local765 = Class1_Sub1_Sub25.anIntArray249[arg2];
									local769 = Class1_Sub1_Sub25.anIntArray248[arg2];
									local788 = local769 * this.aShortArray111[local755] + 32767 - this.aShortArray114[local755] * local765 >> 15;
									this.aShortArray114[local755] = (short) (local765 * this.aShortArray111[local755] + this.aShortArray114[local755] * local769 + 32767 >> 15);
									this.aShortArray111[local755] = (short) local788;
								}
								if (arg3 != 0) {
									local765 = Class1_Sub1_Sub25.anIntArray249[arg3];
									local769 = Class1_Sub1_Sub25.anIntArray248[arg3];
									local788 = local769 * this.aShortArray115[local755] + this.aShortArray114[local755] * local765 + 32767 >> 15;
									this.aShortArray114[local755] = (short) (this.aShortArray114[local755] * local769 + 32767 - local765 * this.aShortArray115[local755] >> 15);
									this.aShortArray115[local755] = (short) local788;
								}
							}
						}
					}
				}
				if (this.aClass21_14 == null && this.aClass21_13 != null) {
					this.aClass21_13.anInterface10_2 = null;
				}
				if (this.aClass21_14 != null) {
					this.aClass21_14.anInterface10_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray182.length) {
					local156 = this.anIntArrayArray182[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray478[local50] -= Static271.anInt4268;
						this.anIntArray480[local50] -= Static218.anInt5618;
						this.anIntArray479[local50] -= Static313.anInt5203;
						this.anIntArray478[local50] = this.anIntArray478[local50] * arg2 >> 7;
						this.anIntArray480[local50] = arg3 * this.anIntArray480[local50] >> 7;
						this.anIntArray479[local50] = this.anIntArray479[local50] * arg4 >> 7;
						this.anIntArray478[local50] += Static271.anInt4268;
						this.anIntArray480[local50] += Static218.anInt5618;
						this.anIntArray479[local50] += Static313.anInt5203;
					}
				}
			}
		} else {
			@Pc(1199) Class221 local1199;
			@Pc(1204) Class68 local1204;
			if (arg0 == 5) {
				if (this.anIntArrayArray184 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray184.length > local32) {
							local156 = this.anIntArrayArray184[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local50 = local156[local158];
								local56 = arg2 * 8 + (this.aByteArray92[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray92[local50] = (byte) local56;
							}
							if (local156.length > 0 && this.aClass21_13 != null) {
								this.aClass21_13.anInterface10_2 = null;
							}
						}
					}
					if (this.aClass221Array1 != null) {
						for (local32 = 0; local32 < this.anInt7167; local32++) {
							local1199 = this.aClass221Array1[local32];
							local1204 = this.aClass68Array1[local32];
							local1204.anInt1717 = local1204.anInt1717 & 0xFFFFFF | 255 - (this.aByteArray92[local1199.anInt6215] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1454) Class68 local1454;
				if (arg0 == 8) {
					if (this.anIntArrayArray183 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray183.length) {
								local156 = this.anIntArrayArray183[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1454 = this.aClass68Array1[local156[local158]];
									local1454.anInt1719 += arg3;
									local1454.anInt1713 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray183 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray183.length) {
								local156 = this.anIntArrayArray183[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1454 = this.aClass68Array1[local156[local158]];
									local1454.anInt1720 = arg2 * local1454.anInt1720 >> 7;
									local1454.anInt1715 = arg3 * local1454.anInt1715 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray183 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray183.length > local32) {
							local156 = this.anIntArrayArray183[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1454 = this.aClass68Array1[local156[local158]];
								local1454.anInt1722 = arg2 + local1454.anInt1722 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray184 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray184.length) {
						local156 = this.anIntArrayArray184[local32];
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							local56 = this.aShortArray107[local50] & 0xFFFF;
							local276 = local56 >> 10 & 0x3F;
							local294 = local56 >> 7 & 0x7;
							@Pc(1296) int local1296 = local276 + arg2 & 0x3F;
							local746 = local56 & 0x7F;
							local294 += arg3 / 4;
							local746 += arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 7) {
								local294 = 7;
							}
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 127) {
								local746 = 127;
							}
							this.aShortArray107[local50] = (short) (local746 | local294 << 7 | local1296 << 10);
						}
						if (local156.length > 0 && this.aClass21_13 != null) {
							this.aClass21_13.anInterface10_2 = null;
						}
					}
				}
				if (this.aClass221Array1 != null) {
					for (local32 = 0; local32 < this.anInt7167; local32++) {
						local1199 = this.aClass221Array1[local32];
						local1204 = this.aClass68Array1[local32];
						local1204.anInt1717 = Static55.anIntArray48[this.aShortArray107[local1199.anInt6215] & 0xFFFF] & 0xFFFFFF | local1204.anInt1717 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		this.aShort94 = (short) arg0;
		if (this.aClass21_13 != null) {
			this.aClass21_13.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		return this.aShort94;
	}
}
