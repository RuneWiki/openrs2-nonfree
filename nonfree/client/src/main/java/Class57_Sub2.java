import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "[Lclient!cf;")
	private Class32[] aClass32Array1;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "Lclient!ql;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!qo", name = "F", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!qo", name = "I", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!qo", name = "J", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!qo", name = "K", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!qo", name = "N", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!qo", name = "O", descriptor = "[Lclient!u;")
	private Class236[] aClass236Array3;

	@OriginalMember(owner = "client!qo", name = "P", descriptor = "[F")
	private float[] aFloatArray14;

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
	private int anInt5541;

	@OriginalMember(owner = "client!qo", name = "T", descriptor = "[Lclient!bb;")
	private Class17[] aClass17Array1;

	@OriginalMember(owner = "client!qo", name = "X", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!qo", name = "Z", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!qo", name = "ab", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!qo", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!qo", name = "eb", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!qo", name = "fb", descriptor = "B")
	private byte aByte79;

	@OriginalMember(owner = "client!qo", name = "mb", descriptor = "[F")
	private float[] aFloatArray15;

	@OriginalMember(owner = "client!qo", name = "ob", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!qo", name = "qb", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!qo", name = "rb", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!qo", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!qo", name = "wb", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!qo", name = "yb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!qo", name = "zb", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!qo", name = "Ab", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!qo", name = "Fb", descriptor = "[I")
	private int[] anIntArray398;

	@OriginalMember(owner = "client!qo", name = "Jb", descriptor = "I")
	private int anInt5564;

	@OriginalMember(owner = "client!qo", name = "Kb", descriptor = "I")
	private int anInt5565;

	@OriginalMember(owner = "client!qo", name = "Qb", descriptor = "Lclient!oq;")
	private Class184 aClass184_1;

	@OriginalMember(owner = "client!qo", name = "Xb", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!qo", name = "Zb", descriptor = "[I")
	private int[] anIntArray400;

	@OriginalMember(owner = "client!qo", name = "dc", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!qo", name = "ic", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!qo", name = "mc", descriptor = "[Lclient!od;")
	private Class179[] aClass179Array3;

	@OriginalMember(owner = "client!qo", name = "rc", descriptor = "Lclient!fp;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
	private int anInt5539 = 0;

	@OriginalMember(owner = "client!qo", name = "vb", descriptor = "I")
	private int anInt5557 = 0;

	@OriginalMember(owner = "client!qo", name = "Nb", descriptor = "Z")
	private boolean aBoolean381 = true;

	@OriginalMember(owner = "client!qo", name = "ec", descriptor = "Z")
	private boolean aBoolean382 = false;

	@OriginalMember(owner = "client!qo", name = "kc", descriptor = "I")
	private int anInt5582 = 0;

	@OriginalMember(owner = "client!qo", name = "bc", descriptor = "I")
	private int anInt5576 = 0;

	@OriginalMember(owner = "client!qo", name = "fc", descriptor = "I")
	private int anInt5578 = 0;

	@OriginalMember(owner = "client!qo", name = "Wb", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_33;

	@OriginalMember(owner = "client!qo", name = "xb", descriptor = "Lclient!pp;")
	private Class195 aClass195_9;

	@OriginalMember(owner = "client!qo", name = "hb", descriptor = "Lclient!pp;")
	private Class195 aClass195_8;

	@OriginalMember(owner = "client!qo", name = "pc", descriptor = "Lclient!pp;")
	private Class195 aClass195_10;

	@OriginalMember(owner = "client!qo", name = "qc", descriptor = "Lclient!pp;")
	private Class195 aClass195_11;

	@OriginalMember(owner = "client!qo", name = "Mb", descriptor = "Lclient!ln;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class57_Sub2(@OriginalArg(0) Class200_Sub2 arg0) {
		this.aClass200_Sub2_33 = arg0;
		this.aClass195_9 = new Class195(null, 5126, 3, 0);
		this.aClass195_8 = new Class195(null, 5126, 2, 0);
		this.aClass195_10 = new Class195(null, 5126, 3, 0);
		this.aClass195_11 = new Class195(null, 5121, 4, 0);
		this.aClass150_1 = new Class150();
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!tt;Lclient!fe;IIII)V")
	public Class57_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5564 = arg5;
		this.anInt5541 = arg2;
		this.aClass200_Sub2_33 = arg0;
		if (Static53.method829(arg2, arg5)) {
			this.aClass195_9 = new Class195(null, 5126, 3, 0);
		}
		if (Static255.method3310(arg5, arg2)) {
			this.aClass195_8 = new Class195(null, 5126, 2, 0);
		}
		if (Static75.method1131(arg5, arg2)) {
			this.aClass195_10 = new Class195(null, 5126, 3, 0);
		}
		if (Static134.method1929(arg2, arg5)) {
			this.aClass195_11 = new Class195(null, 5121, 4, 0);
		}
		if (Static95.method1331(arg5, arg2)) {
			this.aClass150_1 = new Class150();
		}
		@Pc(102) Interface8 local102 = arg0.anInterface8_134;
		this.anIntArray397 = new int[arg1.anInt1955 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt1949];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt1949; local115++) {
			if ((arg1.aByteArray25 == null || arg1.aByteArray25[local115] != 2) && (arg1.aShortArray22 == null || arg1.aShortArray22[local115] == -1 || !local102.method4125(arg1.aShortArray22[local115] & 0xFFFF).aBoolean318)) {
				local113[this.anInt5557++] = local115;
				this.anIntArray397[arg1.aShortArray18[local115]]++;
				this.anIntArray397[arg1.aShortArray17[local115]]++;
				this.anIntArray397[arg1.aShortArray26[local115]]++;
			}
		}
		this.anInt5576 = this.anInt5557;
		@Pc(205) long[] local205 = new long[this.anInt5557];
		@Pc(214) boolean local214 = (this.anInt5541 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(370) int local370;
		label495: for (@Pc(216) int local216 = 0; local216 < this.anInt5557; local216++) {
			@Pc(222) int local222 = local113[local216];
			@Pc(224) Class178 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass264Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass264Array1.length; local237++) {
					@Pc(244) Class264 local244 = arg1.aClass264Array1[local237];
					if (local244.anInt7369 == local222) {
						@Pc(253) Class157 local253 = Static434.method5732(local244.anInt7367);
						if (local253.aBoolean266) {
							local205[local216] = Long.MAX_VALUE;
							this.anInt5576--;
							continue label495;
						}
					}
				}
			}
			@Pc(280) short local280 = -1;
			if (arg1.aShortArray22 != null) {
				local280 = arg1.aShortArray22[local222];
				if (local280 != -1) {
					local224 = local102.method4125(local280 & 0xFFFF);
					local230 = local224.aByte55;
					local232 = local224.aByte56;
				}
			}
			@Pc(332) boolean local332 = arg1.aByteArray20 != null && arg1.aByteArray20[local222] != 0 || local224 != null && local224.aBoolean323 | !local224.aBoolean326;
			if ((local214 || local332) && arg1.aByteArray23 != null) {
				local226 += arg1.aByteArray23[local222] << 17;
			}
			if (local332) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local370 = local228 + ((local280 & 0xFFFF) << 16);
			local226 += local232 & 0xFF;
			@Pc(382) int local382 = local370 + (local216 & 0xFFFF);
			local205[local216] = ((long) local226 << 32) + (long) local382;
		}
		Static311.method3822(local205, local113);
		this.anInt5539 = arg1.anInt1943;
		this.anIntArray396 = arg1.anIntArray94;
		this.anInt5578 = arg1.anInt1955;
		this.anIntArray400 = arg1.anIntArray99;
		this.anIntArray399 = arg1.anIntArray96;
		this.aShortArray94 = arg1.aShortArray21;
		this.aClass236Array3 = arg1.aClass236Array1;
		this.aClass179Array3 = arg1.aClass179Array1;
		@Pc(437) Class45[] local437 = new Class45[this.anInt5578];
		@Pc(457) int local457;
		@Pc(471) int local471;
		if (arg1.aClass264Array1 != null) {
			this.anInt5565 = arg1.aClass264Array1.length;
			this.aClass17Array1 = new Class17[this.anInt5565];
			this.aClass32Array1 = new Class32[this.anInt5565];
			for (local457 = 0; local457 < this.anInt5565; local457++) {
				@Pc(464) Class264 local464 = arg1.aClass264Array1[local457];
				@Pc(469) Class157 local469 = Static434.method5732(local464.anInt7367);
				local471 = -1;
				for (@Pc(473) int local473 = 0; local473 < this.anInt5557; local473++) {
					if (local464.anInt7369 == local113[local473]) {
						local471 = local473;
						break;
					}
				}
				if (local471 == -1) {
					throw new RuntimeException();
				}
				local237 = Static219.anIntArray223[arg1.aShortArray24[local464.anInt7369] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray20 == null ? 0 : arg1.aByteArray20[local464.anInt7369]) << 24;
				this.aClass17Array1[local457] = new Class17(local471, arg1.aShortArray18[local464.anInt7369], arg1.aShortArray17[local464.anInt7369], arg1.aShortArray26[local464.anInt7369], local469.anInt4074, local469.anInt4073, local469.anInt4080, local469.anInt4083, local469.anInt4079, local469.aBoolean266, local469.aBoolean265, local464.anInt7363);
				this.aClass32Array1[local457] = new Class32(local237);
			}
		}
		local457 = this.anInt5557 * 3;
		this.aShortArray95 = new short[local457];
		this.aShortArray97 = new short[local457];
		this.aShortArray91 = new short[local457];
		this.aShortArray93 = new short[this.anInt5557];
		this.aShortArray99 = new short[local457];
		this.aShortArray90 = new short[this.anInt5557];
		if (arg1.aShortArray19 != null) {
			this.aShortArray89 = new short[this.anInt5557];
		}
		this.aShortArray92 = new short[this.anInt5557];
		this.aFloatArray15 = new float[local457];
		this.aByteArray70 = new byte[local457];
		this.aFloatArray14 = new float[local457];
		this.aShort79 = (short) arg3;
		this.aShortArray98 = new short[this.anInt5557];
		this.aByteArray71 = new byte[this.anInt5557];
		Static190.aLongArray17 = new long[local457];
		this.aShort78 = (short) arg4;
		this.aShortArray96 = new short[this.anInt5557];
		local226 = 0;
		for (local370 = 0; local370 < arg1.anInt1955; local370++) {
			local471 = this.anIntArray397[local370];
			this.anIntArray397[local370] = local226;
			local437[local370] = new Class45();
			local226 += local471;
		}
		this.anIntArray397[arg1.anInt1955] = local226;
		@Pc(709) int[] local709 = null;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) float[][] local715 = null;
		@Pc(741) int local741;
		@Pc(782) int local782;
		@Pc(788) int local788;
		@Pc(801) int local801;
		@Pc(803) int local803;
		@Pc(836) int local836;
		@Pc(841) int local841;
		@Pc(1010) float local1010;
		@Pc(1033) float local1033;
		@Pc(1004) float local1004;
		if (arg1.aByteArray21 != null) {
			@Pc(721) int local721 = arg1.anInt1947;
			@Pc(724) int[] local724 = new int[local721];
			@Pc(727) int[] local727 = new int[local721];
			@Pc(730) int[] local730 = new int[local721];
			@Pc(733) int[] local733 = new int[local721];
			@Pc(736) int[] local736 = new int[local721];
			@Pc(739) int[] local739 = new int[local721];
			for (local741 = 0; local741 < local721; local741++) {
				local724[local741] = Integer.MAX_VALUE;
				local727[local741] = -2147483647;
				local730[local741] = Integer.MAX_VALUE;
				local733[local741] = -2147483647;
				local736[local741] = Integer.MAX_VALUE;
				local739[local741] = -2147483647;
			}
			local709 = new int[local721];
			local715 = new float[local721][];
			local711 = new int[local721];
			for (local782 = 0; local782 < this.anInt5557; local782++) {
				local788 = local113[local782];
				if (arg1.aByteArray21[local788] != -1) {
					local801 = arg1.aByteArray21[local788] & 0xFF;
					for (local803 = 0; local803 < 3; local803++) {
						@Pc(817) short local817;
						if (local803 == 0) {
							local817 = arg1.aShortArray18[local788];
						} else if (local803 == 1) {
							local817 = arg1.aShortArray17[local788];
						} else {
							local817 = arg1.aShortArray26[local788];
						}
						local836 = arg1.anIntArray96[local817];
						local841 = arg1.anIntArray94[local817];
						@Pc(846) int local846 = arg1.anIntArray99[local817];
						if (local724[local801] > local836) {
							local724[local801] = local836;
						}
						if (local727[local801] < local836) {
							local727[local801] = local836;
						}
						if (local841 < local730[local801]) {
							local730[local801] = local841;
						}
						if (local841 > local733[local801]) {
							local733[local801] = local841;
						}
						if (local736[local801] > local846) {
							local736[local801] = local846;
						}
						if (local739[local801] < local846) {
							local739[local801] = local846;
						}
					}
				}
			}
			local713 = new int[local721];
			for (local788 = 0; local788 < local721; local788++) {
				@Pc(947) byte local947 = arg1.aByteArray24[local788];
				if (local947 > 0) {
					local709[local788] = (local724[local788] + local727[local788]) / 2;
					local711[local788] = (local730[local788] + local733[local788]) / 2;
					local713[local788] = (local739[local788] + local736[local788]) / 2;
					if (local947 == 1) {
						local841 = arg1.anIntArray101[local788];
						if (local841 == 0) {
							local1010 = 1.0F;
							local1004 = 1.0F;
						} else if (local841 <= 0) {
							local1004 = 1.0F;
							local1010 = (float) -local841 / 1024.0F;
						} else {
							local1010 = 1.0F;
							local1004 = (float) local841 / 1024.0F;
						}
						local1033 = 64.0F / (float) arg1.anIntArray102[local788];
					} else if (local947 == 2) {
						local1033 = 64.0F / (float) arg1.anIntArray102[local788];
						local1010 = 64.0F / (float) arg1.anIntArray101[local788];
						local1004 = 64.0F / (float) arg1.anIntArray93[local788];
					} else {
						local1033 = (float) arg1.anIntArray102[local788] / 1024.0F;
						local1004 = (float) arg1.anIntArray93[local788] / 1024.0F;
						local1010 = (float) arg1.anIntArray101[local788] / 1024.0F;
					}
					local715[local788] = Static301.method3742(local1004, arg1.aByteArray26[local788] & 0xFF, arg1.aShortArray20[local788], local1033, arg1.aShortArray25[local788], local1010, arg1.aShortArray23[local788]);
				}
			}
		}
		@Pc(1126) Class91[] local1126 = new Class91[arg1.anInt1949];
		@Pc(1145) short local1145;
		@Pc(1156) int local1156;
		@Pc(1166) int local1166;
		@Pc(1226) int local1226;
		for (@Pc(1128) int local1128 = 0; local1128 < arg1.anInt1949; local1128++) {
			@Pc(1135) short local1135 = arg1.aShortArray18[local1128];
			@Pc(1140) short local1140 = arg1.aShortArray17[local1128];
			local1145 = arg1.aShortArray26[local1128];
			local1156 = this.anIntArray399[local1140] - this.anIntArray399[local1135];
			local1166 = this.anIntArray396[local1140] - this.anIntArray396[local1135];
			local741 = this.anIntArray400[local1140] - this.anIntArray400[local1135];
			local782 = this.anIntArray399[local1145] - this.anIntArray399[local1135];
			local788 = this.anIntArray396[local1145] - this.anIntArray396[local1135];
			local801 = this.anIntArray400[local1145] - this.anIntArray400[local1135];
			local803 = local801 * local1166 - local741 * local788;
			local1226 = local782 * local741 - local801 * local1156;
			local836 = local788 * local1156 - local782 * local1166;
			while (local803 > 8192 || local1226 > 8192 || local836 > 8192 || local803 < -8192 || local1226 < -8192 || local836 < -8192) {
				local836 >>= 0x1;
				local1226 >>= 0x1;
				local803 >>= 0x1;
			}
			local841 = (int) Math.sqrt((double) (local836 * local836 + local803 * local803 + local1226 * local1226));
			if (local841 <= 0) {
				local841 = 1;
			}
			local836 = local836 * 256 / local841;
			local1226 = local1226 * 256 / local841;
			local803 = local803 * 256 / local841;
			@Pc(1321) byte local1321 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local1128];
			if (local1321 == 0) {
				@Pc(1330) Class45 local1330 = local437[local1135];
				local1330.anInt1240++;
				local1330.anInt1239 += local836;
				local1330.anInt1238 += local1226;
				local1330.anInt1235 += local803;
				@Pc(1358) Class45 local1358 = local437[local1140];
				local1358.anInt1238 += local1226;
				local1358.anInt1239 += local836;
				local1358.anInt1235 += local803;
				local1358.anInt1240++;
				@Pc(1386) Class45 local1386 = local437[local1145];
				local1386.anInt1235 += local803;
				local1386.anInt1238 += local1226;
				local1386.anInt1240++;
				local1386.anInt1239 += local836;
			} else if (local1321 == 1) {
				@Pc(1425) Class91 local1425 = local1126[local1128] = new Class91();
				local1425.anInt2486 = local1226;
				local1425.anInt2487 = local803;
				local1425.anInt2490 = local836;
			}
		}
		@Pc(1451) int local1451;
		for (@Pc(1445) int local1445 = 0; local1445 < this.anInt5557; local1445++) {
			local1451 = local113[local1445];
			@Pc(1458) int local1458 = arg1.aShortArray24[local1451] & 0xFFFF;
			@Pc(1466) short local1466;
			if (arg1.aShortArray22 == null) {
				local1466 = -1;
			} else {
				local1466 = arg1.aShortArray22[local1451];
			}
			if (arg1.aByteArray21 == null) {
				local1166 = -1;
			} else {
				local1166 = arg1.aByteArray21[local1451];
			}
			if (arg1.aByteArray20 == null) {
				local741 = 0;
			} else {
				local741 = arg1.aByteArray20[local1451] & 0xFF;
			}
			@Pc(1498) float local1498 = 0.0F;
			@Pc(1500) float local1500 = 0.0F;
			@Pc(1502) float local1502 = 0.0F;
			local1010 = 0.0F;
			local1033 = 0.0F;
			local1004 = 0.0F;
			@Pc(1510) byte local1510 = 0;
			@Pc(1512) byte local1512 = 0;
			@Pc(1514) int local1514 = 0;
			@Pc(1530) byte local1530;
			@Pc(1547) short local1547;
			@Pc(1552) short local1552;
			@Pc(1557) short local1557;
			if (local1466 != -1) {
				if (local1166 == -1) {
					local1510 = 1;
					local1033 = 0.0F;
					local1498 = 0.0F;
					local1512 = 2;
					local1010 = 1.0F;
					local1004 = 0.0F;
					local1500 = 1.0F;
					local1502 = 1.0F;
				} else {
					local1166 &= 0xFF;
					local1530 = arg1.aByteArray24[local1166];
					@Pc(1537) short local1537;
					@Pc(1542) short local1542;
					@Pc(1580) float local1580;
					@Pc(1589) float local1589;
					@Pc(1597) float local1597;
					@Pc(1682) float local1682;
					@Pc(1690) float local1690;
					@Pc(1699) float local1699;
					@Pc(1708) float local1708;
					@Pc(1716) float local1716;
					@Pc(1724) float local1724;
					if (local1530 == 0) {
						local1537 = arg1.aShortArray18[local1451];
						local1542 = arg1.aShortArray17[local1451];
						local1547 = arg1.aShortArray26[local1451];
						local1552 = arg1.aShortArray25[local1166];
						local1557 = arg1.aShortArray23[local1166];
						@Pc(1562) short local1562 = arg1.aShortArray20[local1166];
						@Pc(1568) float local1568 = (float) arg1.anIntArray96[local1552];
						@Pc(1574) float local1574 = (float) arg1.anIntArray94[local1552];
						local1580 = arg1.anIntArray99[local1552];
						local1589 = (float) arg1.anIntArray96[local1557] - local1568;
						local1597 = (float) arg1.anIntArray94[local1557] - local1574;
						@Pc(1606) float local1606 = (float) arg1.anIntArray99[local1557] - local1580;
						@Pc(1615) float local1615 = (float) arg1.anIntArray96[local1562] - local1568;
						@Pc(1623) float local1623 = (float) arg1.anIntArray94[local1562] - local1574;
						@Pc(1631) float local1631 = (float) arg1.anIntArray99[local1562] - local1580;
						@Pc(1640) float local1640 = (float) arg1.anIntArray96[local1537] - local1568;
						@Pc(1648) float local1648 = (float) arg1.anIntArray94[local1537] - local1574;
						@Pc(1656) float local1656 = (float) arg1.anIntArray99[local1537] - local1580;
						@Pc(1665) float local1665 = (float) arg1.anIntArray96[local1542] - local1568;
						@Pc(1673) float local1673 = (float) arg1.anIntArray94[local1542] - local1574;
						local1682 = (float) arg1.anIntArray99[local1542] - local1580;
						local1690 = (float) arg1.anIntArray96[local1547] - local1568;
						local1699 = (float) arg1.anIntArray94[local1547] - local1574;
						local1708 = (float) arg1.anIntArray99[local1547] - local1580;
						local1716 = local1631 * local1597 - local1606 * local1623;
						local1724 = local1606 * local1615 - local1589 * local1631;
						@Pc(1732) float local1732 = local1589 * local1623 - local1597 * local1615;
						@Pc(1741) float local1741 = local1623 * local1732 - local1724 * local1631;
						@Pc(1749) float local1749 = local1631 * local1716 - local1615 * local1732;
						@Pc(1758) float local1758 = local1724 * local1615 - local1716 * local1623;
						@Pc(1772) float local1772 = 1.0F / (local1606 * local1758 + local1741 * local1589 + local1597 * local1749);
						local1502 = (local1758 * local1682 + local1673 * local1749 + local1741 * local1665) * local1772;
						local1033 = (local1758 * local1708 + local1699 * local1749 + local1741 * local1690) * local1772;
						local1498 = local1772 * (local1648 * local1749 + local1741 * local1640 + local1758 * local1656);
						@Pc(1823) float local1823 = local1716 * local1606 - local1589 * local1732;
						@Pc(1831) float local1831 = local1732 * local1597 - local1724 * local1606;
						@Pc(1839) float local1839 = local1724 * local1589 - local1597 * local1716;
						@Pc(1853) float local1853 = 1.0F / (local1623 * local1823 + local1615 * local1831 + local1631 * local1839);
						local1010 = (local1673 * local1823 + local1831 * local1665 + local1839 * local1682) * local1853;
						local1004 = local1853 * (local1708 * local1839 + local1690 * local1831 + local1699 * local1823);
						local1500 = (local1823 * local1648 + local1640 * local1831 + local1839 * local1656) * local1853;
					} else {
						local1537 = arg1.aShortArray18[local1451];
						local1542 = arg1.aShortArray17[local1451];
						local1547 = arg1.aShortArray26[local1451];
						@Pc(1916) int local1916 = local709[local1166];
						@Pc(1920) int local1920 = local711[local1166];
						@Pc(1924) int local1924 = local713[local1166];
						@Pc(1928) float[] local1928 = local715[local1166];
						@Pc(1933) byte local1933 = arg1.aByteArray22[local1166];
						local1580 = (float) arg1.anIntArray100[local1166] / 256.0F;
						if (local1530 == 1) {
							local1589 = (float) arg1.anIntArray93[local1166] / 1024.0F;
							Static64.method997(local1920, local1933, local1916, local1928, arg1.anIntArray99[local1537], local1589, arg1.anIntArray94[local1537], local1924, local1580, arg1.anIntArray96[local1537]);
							local1500 = Static244.aFloat94;
							local1498 = Static139.aFloat63;
							Static64.method997(local1920, local1933, local1916, local1928, arg1.anIntArray99[local1542], local1589, arg1.anIntArray94[local1542], local1924, local1580, arg1.anIntArray96[local1542]);
							local1502 = Static139.aFloat63;
							local1010 = Static244.aFloat94;
							Static64.method997(local1920, local1933, local1916, local1928, arg1.anIntArray99[local1547], local1589, arg1.anIntArray94[local1547], local1924, local1580, arg1.anIntArray96[local1547]);
							local1033 = Static139.aFloat63;
							local1004 = Static244.aFloat94;
							local1597 = local1589 / 2.0F;
							if ((local1933 & 0x1) == 0) {
								if (local1597 < local1502 - local1498) {
									local1510 = 1;
									local1502 -= local1589;
								} else if (local1597 < local1498 - local1502) {
									local1510 = 2;
									local1502 += local1589;
								}
								if (local1033 - local1498 > local1597) {
									local1033 -= local1589;
									local1512 = 1;
								} else if (local1597 < local1498 - local1033) {
									local1512 = 2;
									local1033 += local1589;
								}
							} else {
								if (local1004 - local1500 > local1597) {
									local1512 = 1;
									local1004 -= local1589;
								} else if (local1500 - local1004 > local1597) {
									local1512 = 2;
									local1004 += local1589;
								}
								if (local1597 < local1010 - local1500) {
									local1010 -= local1589;
									local1510 = 1;
								} else if (local1597 < local1500 - local1010) {
									local1510 = 2;
									local1010 += local1589;
								}
							}
						} else if (local1530 == 2) {
							local1589 = (float) arg1.anIntArray98[local1166] / 256.0F;
							local1597 = (float) arg1.anIntArray95[local1166] / 256.0F;
							@Pc(1976) int local1976 = arg1.anIntArray96[local1542] - arg1.anIntArray96[local1537];
							@Pc(1987) int local1987 = arg1.anIntArray94[local1542] - arg1.anIntArray94[local1537];
							@Pc(1997) int local1997 = arg1.anIntArray99[local1542] - arg1.anIntArray99[local1537];
							@Pc(2008) int local2008 = arg1.anIntArray96[local1547] - arg1.anIntArray96[local1537];
							@Pc(2019) int local2019 = arg1.anIntArray94[local1547] - arg1.anIntArray94[local1537];
							@Pc(2030) int local2030 = arg1.anIntArray99[local1547] - arg1.anIntArray99[local1537];
							@Pc(2039) int local2039 = local1987 * local2030 - local1997 * local2019;
							@Pc(2047) int local2047 = local1997 * local2008 - local2030 * local1976;
							@Pc(2056) int local2056 = local1976 * local2019 - local2008 * local1987;
							local1682 = 64.0F / (float) arg1.anIntArray101[local1166];
							local1690 = 64.0F / (float) arg1.anIntArray102[local1166];
							local1699 = 64.0F / (float) arg1.anIntArray93[local1166];
							local1708 = ((float) local2039 * local1928[0] + local1928[1] * (float) local2047 + (float) local2056 * local1928[2]) / local1682;
							local1716 = ((float) local2039 * local1928[3] + (float) local2047 * local1928[4] + (float) local2056 * local1928[5]) / local1690;
							local1724 = ((float) local2039 * local1928[6] + local1928[7] * (float) local2047 + (float) local2056 * local1928[8]) / local1699;
							local1514 = Static304.method3791(local1724, local1716, local1708);
							Static123.method1751(arg1.anIntArray94[local1537], local1580, local1514, arg1.anIntArray96[local1537], local1933, local1597, local1924, local1928, local1589, arg1.anIntArray99[local1537], local1920, local1916);
							local1498 = Static373.aFloat147;
							local1500 = Static215.aFloat89;
							Static123.method1751(arg1.anIntArray94[local1542], local1580, local1514, arg1.anIntArray96[local1542], local1933, local1597, local1924, local1928, local1589, arg1.anIntArray99[local1542], local1920, local1916);
							local1502 = Static373.aFloat147;
							local1010 = Static215.aFloat89;
							Static123.method1751(arg1.anIntArray94[local1547], local1580, local1514, arg1.anIntArray96[local1547], local1933, local1597, local1924, local1928, local1589, arg1.anIntArray99[local1547], local1920, local1916);
							local1033 = Static373.aFloat147;
							local1004 = Static215.aFloat89;
						} else if (local1530 == 3) {
							Static351.method4562(local1580, local1933, local1924, local1920, local1916, arg1.anIntArray99[local1537], arg1.anIntArray94[local1537], arg1.anIntArray96[local1537], local1928);
							local1500 = Static405.aFloat178;
							local1498 = Static244.aFloat95;
							Static351.method4562(local1580, local1933, local1924, local1920, local1916, arg1.anIntArray99[local1542], arg1.anIntArray94[local1542], arg1.anIntArray96[local1542], local1928);
							local1010 = Static405.aFloat178;
							local1502 = Static244.aFloat95;
							Static351.method4562(local1580, local1933, local1924, local1920, local1916, arg1.anIntArray99[local1547], arg1.anIntArray94[local1547], arg1.anIntArray96[local1547], local1928);
							local1033 = Static244.aFloat95;
							local1004 = Static405.aFloat178;
							if ((local1933 & 0x1) == 0) {
								if (local1502 - local1498 > 0.5F) {
									local1502--;
									local1510 = 1;
								} else if (local1498 - local1502 > 0.5F) {
									local1502++;
									local1510 = 2;
								}
								if (local1033 - local1498 > 0.5F) {
									local1033--;
									local1512 = 1;
								} else if (local1498 - local1033 > 0.5F) {
									local1512 = 2;
									local1033++;
								}
							} else {
								if (local1010 - local1500 > 0.5F) {
									local1510 = 1;
									local1010--;
								} else if (local1500 - local1010 > 0.5F) {
									local1010++;
									local1510 = 2;
								}
								if (local1004 - local1500 > 0.5F) {
									local1004--;
									local1512 = 1;
								} else if (local1500 - local1004 > 0.5F) {
									local1004++;
									local1512 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1530 = 0;
			} else {
				local1530 = arg1.aByteArray25[local1451];
			}
			if (local1530 == 0) {
				@Pc(2689) long local2689 = (long) (local1166 << 2) + ((long) local741 + (long) (local1458 << 8) + (long) (local1514 << 24) << 32);
				local1547 = arg1.aShortArray18[local1451];
				local1552 = arg1.aShortArray17[local1451];
				local1557 = arg1.aShortArray26[local1451];
				@Pc(2708) Class45 local2708 = local437[local1547];
				this.aShortArray96[local1445] = this.method4434(local2708.anInt1235, local2708.anInt1240, local1500, local1498, local1547, arg1, local2708.anInt1238, local2708.anInt1239, local2689);
				@Pc(2732) Class45 local2732 = local437[local1552];
				this.aShortArray90[local1445] = this.method4434(local2732.anInt1235, local2732.anInt1240, local1010, local1502, local1552, arg1, local2732.anInt1238, local2732.anInt1239, local2689 + (long) local1510);
				@Pc(2759) Class45 local2759 = local437[local1557];
				this.aShortArray98[local1445] = this.method4434(local2759.anInt1235, local2759.anInt1240, local1004, local1033, local1557, arg1, local2759.anInt1238, local2759.anInt1239, local2689 + (long) local1512);
			} else if (local1530 == 1) {
				@Pc(2791) Class91 local2791 = local1126[local1451];
				@Pc(2835) long local2835 = ((long) (local1458 << 8) + (long) (local1514 << 24) + (long) local741 << 32) + (long) ((local2791.anInt2490 + 256 << 22) + (local2791.anInt2486 + 256 << 12) + (local1166 << 2) + (local2791.anInt2487 <= 0 ? 2048 : 1024));
				this.aShortArray96[local1445] = this.method4434(local2791.anInt2487, 0, local1500, local1498, arg1.aShortArray18[local1451], arg1, local2791.anInt2486, local2791.anInt2490, local2835);
				this.aShortArray90[local1445] = this.method4434(local2791.anInt2487, 0, local1010, local1502, arg1.aShortArray17[local1451], arg1, local2791.anInt2486, local2791.anInt2490, local2835 + (long) local1510);
				this.aShortArray98[local1445] = this.method4434(local2791.anInt2487, 0, local1004, local1033, arg1.aShortArray26[local1451], arg1, local2791.anInt2486, local2791.anInt2490, (long) local1512 + local2835);
			}
			if (arg1.aShortArray22 == null) {
				this.aShortArray92[local1445] = -1;
			} else {
				this.aShortArray92[local1445] = arg1.aShortArray22[local1451];
			}
			if (arg1.aByteArray20 != null) {
				this.aByteArray71[local1445] = arg1.aByteArray20[local1451];
			}
			if (arg1.aShortArray19 != null) {
				this.aShortArray89[local1445] = arg1.aShortArray19[local1451];
			}
			this.aShortArray93[local1445] = arg1.aShortArray24[local1451];
		}
		local1451 = 0;
		local1145 = -10000;
		for (local1156 = 0; local1156 < this.anInt5576; local1156++) {
			@Pc(2977) short local2977 = this.aShortArray92[local1156];
			if (local2977 != local1145) {
				local1451++;
				local1145 = local2977;
			}
		}
		this.anIntArray398 = new int[local1451 + 1];
		local1451 = 0;
		local1145 = -10000;
		for (local1166 = 0; local1166 < this.anInt5576; local1166++) {
			@Pc(3015) short local3015 = this.aShortArray92[local1166];
			if (local1145 != local3015) {
				this.anIntArray398[local1451++] = local1166;
				local1145 = local3015;
			}
		}
		this.anIntArray398[local1451] = this.anInt5576;
		Static190.aLongArray17 = null;
		this.aShortArray91 = Static153.method4958(this.aShortArray91, this.anInt5582);
		this.aShortArray99 = Static153.method4958(this.aShortArray99, this.anInt5582);
		this.aShortArray95 = Static153.method4958(this.aShortArray95, this.anInt5582);
		this.aByteArray70 = Static81.method1208(this.anInt5582, this.aByteArray70);
		this.aFloatArray15 = Static115.method1582(this.aFloatArray15, this.anInt5582);
		this.aFloatArray14 = Static115.method1582(this.aFloatArray14, this.anInt5582);
		if (arg1.anIntArray97 != null && Static440.method5804(arg2, this.anInt5564)) {
			this.anIntArrayArray51 = arg1.method1583();
		}
		if (arg1.aClass264Array1 != null && Static108.method1493(this.anInt5564, arg2)) {
			this.anIntArrayArray50 = arg1.method1591();
		}
		if (arg1.anIntArray103 != null && Static331.method4090(this.anInt5564, arg2)) {
			local741 = 0;
			@Pc(3137) int[] local3137 = new int[256];
			for (local788 = 0; local788 < this.anInt5557; local788++) {
				local801 = arg1.anIntArray103[local113[local788]];
				if (local801 >= 0) {
					@Pc(3154) int local3154 = local3137[local801]++;
					if (local801 > local741) {
						local741 = local801;
					}
				}
			}
			this.anIntArrayArray49 = new int[local741 + 1][];
			for (local801 = 0; local801 <= local741; local801++) {
				this.anIntArrayArray49[local801] = new int[local3137[local801]];
				local3137[local801] = 0;
			}
			for (local803 = 0; local803 < this.anInt5557; local803++) {
				local1226 = arg1.anIntArray103[local113[local803]];
				if (local1226 >= 0) {
					this.anIntArrayArray49[local1226][local3137[local1226]++] = local803;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIIB)Z")
	private boolean method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 > arg1 && arg3 > arg1 && arg1 < arg0) {
			return false;
		} else if (arg1 > arg5 && arg1 > arg3 && arg1 > arg0) {
			return false;
		} else if (arg4 < arg7 && arg2 > arg4 && arg4 < arg6) {
			return false;
		} else {
			return arg4 <= arg7 || arg4 <= arg2 || arg4 <= arg6;
		}
	}

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aShort78 = (short) arg0;
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface12_3 = null;
		}
		if (this.aClass195_10 != null) {
			this.aClass195_10.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "S", descriptor = "()I")
	@Override
	public int S() {
		if (!this.aBoolean382) {
			this.method4435();
		}
		return this.aShort75;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!c;Lclient!wg;II)V")
	@Override
	public void method6072(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class88_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5582 == 0) {
			return;
		}
		@Pc(13) Class29_Sub1 local13 = this.aClass200_Sub2_33.aClass29_Sub1_3;
		if (!this.aBoolean382) {
			this.method4435();
		}
		@Pc(22) Class29_Sub1 local22 = (Class29_Sub1) arg0;
		Static399.aFloat152 = local13.aFloat60 * local22.aFloat54 + local22.aFloat50 * local13.aFloat53 + local13.aFloat51 * local22.aFloat52 + local13.aFloat54;
		Static183.aFloat71 = local13.aFloat60 * local22.aFloat53 + local13.aFloat53 * local22.aFloat59 + local22.aFloat58 * local13.aFloat51;
		@Pc(69) float local69 = (float) this.aShort72 * Static183.aFloat71 + Static399.aFloat152;
		@Pc(77) float local77 = Static183.aFloat71 * (float) this.aShort76 + Static399.aFloat152;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.aShort80 + local77;
			local94 = (float) this.aShort80 + local69;
		} else {
			local94 = (float) this.aShort80 + local77;
			local88 = (float) -this.aShort80 + local69;
		}
		if (local88 >= this.aClass200_Sub2_33.aFloat153 || local94 <= (float) this.aClass200_Sub2_33.anInt6751) {
			return;
		}
		Static9.aFloat6 = local13.aFloat52 + local22.aFloat50 * local13.aFloat58 + local13.aFloat57 * local22.aFloat52 + local13.aFloat55 * local22.aFloat54;
		Static103.aFloat34 = local22.aFloat53 * local13.aFloat55 + local22.aFloat59 * local13.aFloat58 + local13.aFloat57 * local22.aFloat58;
		@Pc(171) float local171 = Static103.aFloat34 * (float) this.aShort72 + Static9.aFloat6;
		@Pc(179) float local179 = Static103.aFloat34 * (float) this.aShort76 + Static9.aFloat6;
		@Pc(205) float local205;
		@Pc(194) float local194;
		if (local171 > local179) {
			local194 = (float) this.aClass200_Sub2_33.anInt6750 * (local171 + (float) this.aShort80);
			local205 = (local179 - (float) this.aShort80) * (float) this.aClass200_Sub2_33.anInt6750;
		} else {
			local205 = (float) this.aClass200_Sub2_33.anInt6750 * (local171 - (float) this.aShort80);
			local194 = ((float) this.aShort80 + local179) * (float) this.aClass200_Sub2_33.anInt6750;
		}
		if (local205 / (float) arg2 >= this.aClass200_Sub2_33.aFloat168 || local194 / (float) arg2 <= this.aClass200_Sub2_33.aFloat161) {
			return;
		}
		Static419.aFloat174 = local13.aFloat49 * local22.aFloat53 + local22.aFloat58 * local13.aFloat56 + local22.aFloat59 * local13.aFloat59;
		Static303.aFloat114 = local13.aFloat59 * local22.aFloat50 + local13.aFloat56 * local22.aFloat52 + local13.aFloat49 * local22.aFloat54 + local13.aFloat50;
		@Pc(296) float local296 = Static303.aFloat114 + Static419.aFloat174 * (float) this.aShort72;
		@Pc(304) float local304 = Static303.aFloat114 + Static419.aFloat174 * (float) this.aShort76;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local304 < local296) {
			local320 = (float) this.aClass200_Sub2_33.anInt6761 * ((float) -this.aShort80 + local304);
			local331 = (local296 + (float) this.aShort80) * (float) this.aClass200_Sub2_33.anInt6761;
		} else {
			local320 = (float) this.aClass200_Sub2_33.anInt6761 * ((float) -this.aShort80 + local296);
			local331 = ((float) this.aShort80 + local304) * (float) this.aClass200_Sub2_33.anInt6761;
		}
		if (this.aClass200_Sub2_33.aFloat164 <= local320 / (float) arg2 || this.aClass200_Sub2_33.aFloat165 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass17Array1 != null) {
			Static285.aFloat111 = local13.aFloat51 * local22.aFloat57 + local13.aFloat53 * local22.aFloat56 + local22.aFloat51 * local13.aFloat60;
			Static307.aFloat115 = local22.aFloat51 * local13.aFloat49 + local22.aFloat56 * local13.aFloat59 + local22.aFloat57 * local13.aFloat56;
			Static354.aFloat142 = local22.aFloat55 * local13.aFloat57 + local13.aFloat58 * local22.aFloat49 + local13.aFloat55 * local22.aFloat60;
			Static390.aFloat150 = local13.aFloat57 * local22.aFloat57 + local22.aFloat56 * local13.aFloat58 + local13.aFloat55 * local22.aFloat51;
			Static8.aFloat5 = local22.aFloat55 * local13.aFloat51 + local13.aFloat53 * local22.aFloat49 + local22.aFloat60 * local13.aFloat60;
			Static253.aFloat102 = local13.aFloat49 * local22.aFloat60 + local22.aFloat55 * local13.aFloat56 + local22.aFloat49 * local13.aFloat59;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort77 + this.aShort73 >> 1;
			@Pc(508) int local508 = this.aShort74 + this.aShort75 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static354.aFloat142 + Static9.aFloat6 + Static390.aFloat150 * (float) local500 + (float) this.aShort72 * Static103.aFloat34);
			@Pc(546) int local546 = (int) ((float) local508 * Static253.aFloat102 + Static303.aFloat114 + (float) local500 * Static307.aFloat115 + Static419.aFloat174 * (float) this.aShort72);
			@Pc(565) int local565 = (int) ((float) local508 * Static8.aFloat5 + Static183.aFloat71 * (float) this.aShort72 + Static399.aFloat152 + (float) local500 * Static285.aFloat111);
			@Pc(584) int local584 = (int) ((float) this.aShort76 * Static103.aFloat34 + Static390.aFloat150 * (float) local500 + Static9.aFloat6 + (float) local508 * Static354.aFloat142);
			@Pc(603) int local603 = (int) ((float) local508 * Static253.aFloat102 + (float) this.aShort76 * Static419.aFloat174 + (float) local500 * Static307.aFloat115 + Static303.aFloat114);
			arg1.anInt7388 = this.aClass200_Sub2_33.anInt6729 + local603 * this.aClass200_Sub2_33.anInt6761 / arg2;
			arg1.anInt7384 = this.aClass200_Sub2_33.anInt6750 * local527 / arg2 + this.aClass200_Sub2_33.anInt6745;
			arg1.anInt7387 = this.aClass200_Sub2_33.anInt6761 * local546 / arg2 + this.aClass200_Sub2_33.anInt6729;
			arg1.anInt7385 = this.aClass200_Sub2_33.anInt6745 + local584 * this.aClass200_Sub2_33.anInt6750 / arg2;
			@Pc(675) int local675 = (int) ((float) local508 * Static8.aFloat5 + Static183.aFloat71 * (float) this.aShort76 + Static399.aFloat152 + (float) local500 * Static285.aFloat111);
			if (local565 < this.aClass200_Sub2_33.anInt6751 && local675 < this.aClass200_Sub2_33.anInt6751) {
				arg1.aBoolean496 = true;
				arg1.anInt7386 = this.aClass200_Sub2_33.anInt6745 + (local527 - -this.aShort80) * this.aClass200_Sub2_33.anInt6750 / arg2 - arg1.anInt7384;
			}
		}
		this.aClass200_Sub2_33.method5286((float) arg2);
		this.aClass200_Sub2_33.method5293();
		this.aClass200_Sub2_33.method5310(local22);
		this.method4430();
		this.aClass200_Sub2_33.method5320();
		this.method4438();
	}

	@OriginalMember(owner = "client!qo", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean382) {
			this.method4435();
		}
		@Pc(17) int local17 = arg4 + this.aShort77;
		@Pc(22) int local22 = this.aShort73 + arg4;
		@Pc(27) int local27 = this.aShort74 + arg6;
		@Pc(32) int local32 = this.aShort75 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt6301 <= local22 + arg2.anInt6303 >> arg2.anInt6300 || local27 < 0 || local32 + arg2.anInt6303 >> arg2.anInt6300 >= arg2.anInt6299)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || local22 + arg3.anInt6303 >> arg3.anInt6300 >= arg3.anInt6301 || local27 < 0 || local32 + arg3.anInt6303 >> arg3.anInt6300 >= arg3.anInt6299) {
				return;
			}
		} else {
			local17 >>= arg2.anInt6300;
			local22 = arg2.anInt6303 + local22 - 1 >> arg2.anInt6300;
			local27 >>= arg2.anInt6300;
			local32 = arg2.anInt6303 + local32 - 1 >> arg2.anInt6300;
			if (arg2.ua(local17, local27) == arg5 && arg5 == arg2.ua(local22, local27) && arg2.ua(local17, local32) == arg5 && arg2.ua(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(191) int local191;
		if (arg0 == 1) {
			for (local191 = 0; local191 < this.anInt5578; local191++) {
				this.anIntArray396[local191] = this.anIntArray396[local191] + arg2.ca(arg4 + this.anIntArray399[local191], arg6 + this.anIntArray400[local191]) - arg5;
			}
		} else {
			@Pc(199) int local199;
			@Pc(207) int local207;
			if (arg0 == 2) {
				@Pc(404) short local404 = this.aShort72;
				if (local404 == 0) {
					return;
				}
				for (local199 = 0; local199 < this.anInt5578; local199++) {
					local207 = (this.anIntArray396[local199] << 16) / local404;
					if (arg1 > local207) {
						this.anIntArray396[local199] += (arg2.ca(this.anIntArray399[local199] + arg4, arg6 + this.anIntArray400[local199]) - arg5) * (-local207 + arg1) / arg1;
					}
				}
			} else {
				@Pc(215) int local215;
				if (arg0 == 3) {
					local191 = (arg1 & 0xFF) * 4;
					local199 = (arg1 >> 8 & 0xFF) * 4;
					local207 = (arg1 >> 16 & 0xFF) << 6;
					local215 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local191 >> 1) < 0 || arg2.anInt6301 << arg2.anInt6300 <= arg4 + (local191 >> 1) + arg2.anInt6303 || arg6 - (local199 >> 1) < 0 || arg2.anInt6299 << arg2.anInt6300 <= (local199 >> 1) + arg6 + arg2.anInt6303) {
						return;
					}
					this.method6062(local199, arg4, local215, local207, arg5, local191, arg2, arg6);
				} else if (arg0 == 4) {
					local191 = this.aShort76 - this.aShort72;
					for (local199 = 0; local199 < this.anInt5578; local199++) {
						this.anIntArray396[local199] = this.anIntArray396[local199] + arg3.ca(this.anIntArray399[local199] + arg4, arg6 + this.anIntArray400[local199]) + local191 - arg5;
					}
				} else if (arg0 == 5) {
					local191 = this.aShort76 - this.aShort72;
					for (local199 = 0; local199 < this.anInt5578; local199++) {
						local207 = arg4 + this.anIntArray399[local199];
						local215 = arg6 + this.anIntArray400[local199];
						@Pc(310) int local310 = arg2.ca(local207, local215);
						@Pc(315) int local315 = arg3.ca(local207, local215);
						@Pc(319) int local319 = local310 - local315;
						this.anIntArray396[local199] = local310 + (local319 * ((this.anIntArray396[local199] << 8) / local191) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
		this.aBoolean382 = false;
	}

	@OriginalMember(owner = "client!qo", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean382) {
			this.method4435();
		}
		return this.aShort73;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5578; local3++) {
			if (arg0 != 0) {
				this.anIntArray399[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray396[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray400[local3] += arg2;
			}
		}
		this.aBoolean382 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "za", descriptor = "(IIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static308.anInt4795 = 0;
			local14 = 0;
			Static6.anInt113 = 0;
			Static351.anInt5753 = 0;
			for (local20 = 0; local20 < this.anInt5578; local20++) {
				Static351.anInt5753 += this.anIntArray399[local20];
				Static308.anInt4795 += this.anIntArray396[local20];
				Static6.anInt113 += this.anIntArray400[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static351.anInt5753 = arg1;
				Static308.anInt4795 = arg2;
				Static6.anInt113 = arg3;
			} else {
				Static308.anInt4795 = arg2 + Static308.anInt4795 / local14;
				Static6.anInt113 = arg3 + Static6.anInt113 / local14;
				Static351.anInt5753 = arg1 + Static351.anInt5753 / local14;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt5578; local14++) {
				this.anIntArray399[local14] += arg1;
				this.anIntArray396[local14] += arg2;
				this.anIntArray400[local14] += arg3;
			}
		} else {
			@Pc(158) int local158;
			@Pc(176) int local176;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt5578; local14++) {
					this.anIntArray399[local14] -= Static351.anInt5753;
					this.anIntArray396[local14] -= Static308.anInt4795;
					this.anIntArray400[local14] -= Static6.anInt113;
					if (arg3 != 0) {
						local20 = Class30.anIntArray38[arg3];
						local158 = Class30.anIntArray37[arg3];
						local176 = this.anIntArray399[local14] * local158 + this.anIntArray396[local14] * local20 + 32767 >> 15;
						this.anIntArray396[local14] = local158 * this.anIntArray396[local14] + 32767 - this.anIntArray399[local14] * local20 >> 15;
						this.anIntArray399[local14] = local176;
					}
					if (arg1 != 0) {
						local20 = Class30.anIntArray38[arg1];
						local158 = Class30.anIntArray37[arg1];
						local176 = local158 * this.anIntArray396[local14] + 32767 - local20 * this.anIntArray400[local14] >> 15;
						this.anIntArray400[local14] = this.anIntArray400[local14] * local158 + local20 * this.anIntArray396[local14] + 32767 >> 15;
						this.anIntArray396[local14] = local176;
					}
					if (arg2 != 0) {
						local20 = Class30.anIntArray38[arg2];
						local158 = Class30.anIntArray37[arg2];
						local176 = local20 * this.anIntArray400[local14] + local158 * this.anIntArray399[local14] + 32767 >> 15;
						this.anIntArray400[local14] = this.anIntArray400[local14] * local158 + 32767 - this.anIntArray399[local14] * local20 >> 15;
						this.anIntArray399[local14] = local176;
					}
					this.anIntArray399[local14] += Static351.anInt5753;
					this.anIntArray396[local14] += Static308.anInt4795;
					this.anIntArray400[local14] += Static6.anInt113;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt5578; local14++) {
					this.anIntArray399[local14] -= Static351.anInt5753;
					this.anIntArray396[local14] -= Static308.anInt4795;
					this.anIntArray400[local14] -= Static6.anInt113;
					this.anIntArray399[local14] = this.anIntArray399[local14] * arg1 / 128;
					this.anIntArray396[local14] = this.anIntArray396[local14] * arg2 / 128;
					this.anIntArray400[local14] = arg3 * this.anIntArray400[local14] / 128;
					this.anIntArray399[local14] += Static351.anInt5753;
					this.anIntArray396[local14] += Static308.anInt4795;
					this.anIntArray400[local14] += Static6.anInt113;
				}
			} else {
				@Pc(512) Class17 local512;
				@Pc(517) Class32 local517;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt5557; local14++) {
						local20 = arg1 * 8 + (this.aByteArray71[local14] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray71[local14] = (byte) local20;
					}
					if (this.aClass195_11 != null) {
						this.aClass195_11.anInterface12_3 = null;
					}
					if (this.aClass17Array1 != null) {
						for (local20 = 0; local20 < this.anInt5565; local20++) {
							local512 = this.aClass17Array1[local20];
							local517 = this.aClass32Array1[local20];
							local517.anInt885 = local517.anInt885 & 0xFFFFFF | 255 - (this.aByteArray71[local512.anInt550] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt5557; local14++) {
						local20 = this.aShortArray93[local14] & 0xFFFF;
						local158 = local20 >> 10 & 0x3F;
						local176 = local20 >> 7 & 0x7;
						@Pc(578) int local578 = arg1 + local158 & 0x3F;
						local176 += arg2 / 4;
						@Pc(588) int local588 = local20 & 0x7F;
						if (local176 < 0) {
							local176 = 0;
						} else if (local176 > 7) {
							local176 = 7;
						}
						local588 += arg3;
						if (local588 < 0) {
							local588 = 0;
						} else if (local588 > 127) {
							local588 = 127;
						}
						this.aShortArray93[local14] = (short) (local176 << 7 | local578 << 10 | local588);
					}
					if (this.aClass195_11 != null) {
						this.aClass195_11.anInterface12_3 = null;
					}
					if (this.aClass17Array1 != null) {
						for (local20 = 0; local20 < this.anInt5565; local20++) {
							local512 = this.aClass17Array1[local20];
							local517 = this.aClass32Array1[local20];
							local517.anInt885 = local517.anInt885 & 0xFF000000 | Static219.anIntArray223[this.aShortArray93[local512.anInt550] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(702) Class32 local702;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt5565; local14++) {
							local702 = this.aClass32Array1[local14];
							local702.anInt887 += arg1;
							local702.anInt879 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt5565; local14++) {
							local702 = this.aClass32Array1[local14];
							local702.anInt886 = arg2 * local702.anInt886 >> 7;
							local702.anInt878 = local702.anInt878 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt5565; local14++) {
							local702 = this.aClass32Array1[local14];
							local702.anInt880 = arg1 + local702.anInt880 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anInt5541 = arg0;
		this.aBoolean381 = true;
		if (this.aClass184_1 != null && (this.anInt5541 & 0x10000) == 0) {
			this.aByteArray70 = this.aClass184_1.aByteArray67;
			this.aShortArray91 = this.aClass184_1.aShortArray77;
			this.aShortArray95 = this.aClass184_1.aShortArray78;
			this.aShortArray99 = this.aClass184_1.aShortArray79;
			this.aClass184_1 = null;
		}
		this.method4428();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	private void method4428() {
		if (!this.aBoolean381) {
			return;
		}
		this.aBoolean381 = false;
		if (this.aClass179Array3 == null && this.aClass236Array3 == null && this.aClass17Array1 == null) {
			if (this.anIntArray399 != null && !Static246.method3172(this.anInt5541, this.anInt5564)) {
				if (this.aClass195_9 != null && this.aClass195_9.anInterface12_3 == null) {
					this.aBoolean381 = true;
				} else {
					if (!this.aBoolean382) {
						this.method4435();
					}
					this.anIntArray399 = null;
				}
			}
			if (this.anIntArray396 != null && !Static371.method4860(this.anInt5541, this.anInt5564)) {
				if (this.aClass195_9 != null && this.aClass195_9.anInterface12_3 == null) {
					this.aBoolean381 = true;
				} else {
					if (!this.aBoolean382) {
						this.method4435();
					}
					this.anIntArray396 = null;
				}
			}
			if (this.anIntArray400 != null && !Static146.method2131(this.anInt5564, this.anInt5541)) {
				if (this.aClass195_9 != null && this.aClass195_9.anInterface12_3 == null) {
					this.aBoolean381 = true;
				} else {
					if (!this.aBoolean382) {
						this.method4435();
					}
					this.anIntArray400 = null;
				}
			}
		}
		if (this.aShortArray97 != null && this.anIntArray399 == null && this.anIntArray396 == null && this.anIntArray400 == null) {
			this.aShortArray97 = null;
			this.anIntArray397 = null;
		}
		if (this.aByteArray70 != null && !Static218.method3703(this.anInt5564, this.anInt5541)) {
			if (this.aClass195_10 == null) {
				if (this.aClass195_11 != null && this.aClass195_11.anInterface12_3 == null) {
					this.aBoolean381 = true;
				} else {
					this.aShortArray91 = this.aShortArray99 = this.aShortArray95 = null;
					this.aByteArray70 = null;
				}
			} else if (this.aClass195_10.anInterface12_3 == null) {
				this.aBoolean381 = true;
			} else {
				this.aShortArray91 = this.aShortArray99 = this.aShortArray95 = null;
				this.aByteArray70 = null;
			}
		}
		if (this.aShortArray93 != null && !Static167.method2334(this.anInt5564, this.anInt5541)) {
			if (this.aClass195_11 != null && this.aClass195_11.anInterface12_3 == null) {
				this.aBoolean381 = true;
			} else {
				this.aShortArray93 = null;
			}
		}
		if (this.aByteArray71 != null && !Static190.method2561(this.anInt5564, this.anInt5541)) {
			if (this.aClass195_11 != null && this.aClass195_11.anInterface12_3 == null) {
				this.aBoolean381 = true;
			} else {
				this.aByteArray71 = null;
			}
		}
		if (this.aFloatArray15 != null && !Static392.method5129(this.anInt5541, this.anInt5564)) {
			if (this.aClass195_8 != null && this.aClass195_8.anInterface12_3 == null) {
				this.aBoolean381 = true;
			} else {
				this.aFloatArray15 = this.aFloatArray14 = null;
			}
		}
		if (this.aShortArray92 != null && !Static96.method1356(this.anInt5541, this.anInt5564)) {
			if (this.aClass195_11 != null && this.aClass195_11.anInterface12_3 == null) {
				this.aBoolean381 = true;
			} else {
				this.aShortArray92 = null;
			}
		}
		if (this.aShortArray96 != null && !Static243.method3144(this.anInt5541, this.anInt5564)) {
			if ((this.aClass150_1 == null || this.aClass150_1.anInterface5_2 != null) && (this.aClass195_11 == null || this.aClass195_11.anInterface12_3 != null)) {
				this.aShortArray96 = this.aShortArray90 = this.aShortArray98 = null;
			} else {
				this.aBoolean381 = true;
			}
		}
		if (this.anIntArrayArray49 != null && !Static331.method4090(this.anInt5564, this.anInt5541)) {
			this.aShortArray89 = null;
			this.anIntArrayArray49 = null;
		}
		if (this.anIntArrayArray51 != null && !Static440.method5804(this.anInt5541, this.anInt5564)) {
			this.aShortArray94 = null;
			this.anIntArrayArray51 = null;
		}
		if (this.anIntArrayArray50 != null && !Static108.method1493(this.anInt5564, this.anInt5541)) {
			this.anIntArrayArray50 = null;
		}
		if (this.anIntArray398 != null && (this.anInt5541 & 0x800) == 0 && (this.anInt5541 & 0x40000) == 0) {
			this.anIntArray398 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5557; local3++) {
			local12 = this.aShortArray93[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 -= -(arg3 * (arg1 - local24) >> 7);
			}
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg2 != -1) {
				local28 += arg3 * (arg2 - local28) >> 7;
			}
			this.aShortArray93[local3] = (short) (local28 | local18 << 10 | local24 << 7);
		}
		if (this.aClass17Array1 != null) {
			for (local12 = 0; local12 < this.anInt5565; local12++) {
				@Pc(107) Class17 local107 = this.aClass17Array1[local12];
				@Pc(112) Class32 local112 = this.aClass32Array1[local12];
				local112.anInt885 = Static219.anIntArray223[this.aShortArray93[local107.anInt550] & 0xFFFF] & 0xFFFFFF | local112.anInt885 & 0xFF000000;
			}
		}
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "()I")
	@Override
	public int B() {
		if (!this.aBoolean382) {
			this.method4435();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "()I")
	@Override
	public int k() {
		if (!this.aBoolean382) {
			this.method4435();
		}
		return this.aShort80;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZLclient!qo;Lclient!qo;ZZ)Lclient!e;")
	private Class57 method4429(@OriginalArg(0) int arg0, @OriginalArg(2) Class57_Sub2 arg1, @OriginalArg(3) Class57_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg2.anInt5557 = this.anInt5557;
		arg2.aShort79 = this.aShort79;
		arg2.anInt5576 = this.anInt5576;
		arg2.anInt5565 = this.anInt5565;
		arg2.anInt5541 = arg0;
		arg2.anInt5539 = this.anInt5539;
		arg2.anInt5564 = this.anInt5564;
		arg2.anInt5582 = this.anInt5582;
		arg2.aShort78 = this.aShort78;
		arg2.anInt5578 = this.anInt5578;
		arg2.aByte79 = 0;
		@Pc(53) boolean local53 = Static210.method2798(this.anInt5564, arg0);
		@Pc(59) boolean local59 = Static320.method3942(arg0, this.anInt5564);
		@Pc(65) boolean local65 = Static162.method2296(this.anInt5564, arg0);
		@Pc(71) boolean local71 = local59 | local53 | local65;
		@Pc(190) int local190;
		if (local71) {
			if (!local53) {
				arg2.anIntArray399 = this.anIntArray399;
			} else if (arg1.anIntArray399 == null || this.anInt5539 > arg1.anIntArray399.length) {
				arg2.anIntArray399 = arg1.anIntArray399 = new int[this.anInt5539];
			} else {
				arg2.anIntArray399 = arg1.anIntArray399;
			}
			if (!local59) {
				arg2.anIntArray396 = this.anIntArray396;
			} else if (arg1.anIntArray396 == null || this.anInt5539 > arg1.anIntArray396.length) {
				arg2.anIntArray396 = arg1.anIntArray396 = new int[this.anInt5539];
			} else {
				arg2.anIntArray396 = arg1.anIntArray396;
			}
			if (!local65) {
				arg2.anIntArray400 = this.anIntArray400;
			} else if (arg1.anIntArray400 == null || this.anInt5539 > arg1.anIntArray400.length) {
				arg2.anIntArray400 = arg1.anIntArray400 = new int[this.anInt5539];
			} else {
				arg2.anIntArray400 = arg1.anIntArray400;
			}
			for (local190 = 0; local190 < this.anInt5539; local190++) {
				if (local53) {
					arg2.anIntArray399[local190] = this.anIntArray399[local190];
				}
				if (local59) {
					arg2.anIntArray396[local190] = this.anIntArray396[local190];
				}
				if (local65) {
					arg2.anIntArray400[local190] = this.anIntArray400[local190];
				}
			}
		} else {
			arg2.anIntArray396 = this.anIntArray396;
			arg2.anIntArray400 = this.anIntArray400;
			arg2.anIntArray399 = this.anIntArray399;
		}
		if (Static16.method268(arg0, this.anInt5564)) {
			arg2.aClass195_9 = arg1.aClass195_9;
			if (arg3) {
				arg2.aByte79 = (byte) (arg2.aByte79 | 0x1);
			}
			arg2.aClass195_9.anInterface12_3 = this.aClass195_9.anInterface12_3;
			arg2.aClass195_9.aByte60 = this.aClass195_9.aByte60;
		} else if (Static53.method829(arg0, this.anInt5564)) {
			arg2.aClass195_9 = this.aClass195_9;
		} else {
			arg2.aClass195_9 = null;
		}
		if (Static303.method3770(this.anInt5564, arg0)) {
			if (arg1.aShortArray93 == null || arg1.aShortArray93.length < this.anInt5557) {
				arg2.aShortArray93 = arg1.aShortArray93 = new short[this.anInt5557];
			} else {
				arg2.aShortArray93 = arg1.aShortArray93;
			}
			for (local190 = 0; local190 < this.anInt5557; local190++) {
				arg2.aShortArray93[local190] = this.aShortArray93[local190];
			}
		} else {
			arg2.aShortArray93 = this.aShortArray93;
		}
		if (Static163.method2300(arg0, this.anInt5564)) {
			if (arg1.aByteArray71 == null || this.anInt5557 > arg1.aByteArray71.length) {
				arg2.aByteArray71 = arg1.aByteArray71 = new byte[this.anInt5557];
			} else {
				arg2.aByteArray71 = arg1.aByteArray71;
			}
			for (local190 = 0; local190 < this.anInt5557; local190++) {
				arg2.aByteArray71[local190] = this.aByteArray71[local190];
			}
		} else {
			arg2.aByteArray71 = this.aByteArray71;
		}
		if (Static452.method5943(arg0, this.anInt5564)) {
			arg2.aClass195_11 = arg1.aClass195_11;
			if (arg3) {
				arg2.aByte79 = (byte) (arg2.aByte79 | 0x2);
			}
			arg2.aClass195_11.anInterface12_3 = this.aClass195_11.anInterface12_3;
			arg2.aClass195_11.aByte60 = this.aClass195_11.aByte60;
		} else if (Static134.method1929(arg0, this.anInt5564)) {
			arg2.aClass195_11 = this.aClass195_11;
		} else {
			arg2.aClass195_11 = null;
		}
		@Pc(583) int local583;
		if (Static171.method2361(this.anInt5564, arg0)) {
			if (arg1.aShortArray91 == null || arg1.aShortArray91.length < this.anInt5582) {
				local190 = this.anInt5582;
				arg2.aShortArray95 = arg1.aShortArray95 = new short[local190];
				arg2.aShortArray99 = arg1.aShortArray99 = new short[local190];
				arg2.aShortArray91 = arg1.aShortArray91 = new short[local190];
			} else {
				arg2.aShortArray91 = arg1.aShortArray91;
				arg2.aShortArray99 = arg1.aShortArray99;
				arg2.aShortArray95 = arg1.aShortArray95;
			}
			if (this.aClass184_1 == null) {
				for (local190 = 0; local190 < this.anInt5582; local190++) {
					arg2.aShortArray91[local190] = this.aShortArray91[local190];
					arg2.aShortArray99[local190] = this.aShortArray99[local190];
					arg2.aShortArray95[local190] = this.aShortArray95[local190];
				}
			} else {
				if (arg1.aClass184_1 == null) {
					arg1.aClass184_1 = new Class184();
				}
				@Pc(567) Class184 local567 = arg2.aClass184_1 = arg1.aClass184_1;
				if (local567.aShortArray77 == null || this.anInt5582 > local567.aShortArray77.length) {
					local583 = this.anInt5582;
					local567.aByteArray67 = new byte[local583];
					local567.aShortArray78 = new short[local583];
					local567.aShortArray77 = new short[local583];
					local567.aShortArray79 = new short[local583];
				}
				for (local583 = 0; local583 < this.anInt5582; local583++) {
					arg2.aShortArray91[local583] = this.aShortArray91[local583];
					arg2.aShortArray99[local583] = this.aShortArray99[local583];
					arg2.aShortArray95[local583] = this.aShortArray95[local583];
					local567.aShortArray77[local583] = this.aClass184_1.aShortArray77[local583];
					local567.aShortArray79[local583] = this.aClass184_1.aShortArray79[local583];
					local567.aShortArray78[local583] = this.aClass184_1.aShortArray78[local583];
					local567.aByteArray67[local583] = this.aClass184_1.aByteArray67[local583];
				}
			}
			arg2.aByteArray70 = this.aByteArray70;
		} else {
			arg2.aShortArray99 = this.aShortArray99;
			arg2.aByteArray70 = this.aByteArray70;
			arg2.aShortArray95 = this.aShortArray95;
			arg2.aShortArray91 = this.aShortArray91;
			arg2.aClass184_1 = this.aClass184_1;
		}
		if (Static291.method3608(this.anInt5564, arg0)) {
			if (arg3) {
				arg2.aByte79 = (byte) (arg2.aByte79 | 0x4);
			}
			arg2.aClass195_10 = arg1.aClass195_10;
			arg2.aClass195_10.aByte60 = this.aClass195_10.aByte60;
			arg2.aClass195_10.anInterface12_3 = this.aClass195_10.anInterface12_3;
		} else if (Static75.method1131(this.anInt5564, arg0)) {
			arg2.aClass195_10 = this.aClass195_10;
		} else {
			arg2.aClass195_10 = null;
		}
		if (Static43.method4103(arg0, this.anInt5564)) {
			if (arg1.aFloatArray15 == null || this.anInt5557 > arg1.aFloatArray15.length) {
				local190 = this.anInt5582;
				arg2.aFloatArray15 = arg1.aFloatArray15 = new float[local190];
				arg2.aFloatArray14 = arg1.aFloatArray14 = new float[local190];
			} else {
				arg2.aFloatArray14 = arg1.aFloatArray14;
				arg2.aFloatArray15 = arg1.aFloatArray15;
			}
			for (local190 = 0; local190 < this.anInt5582; local190++) {
				arg2.aFloatArray15[local190] = this.aFloatArray15[local190];
				arg2.aFloatArray14[local190] = this.aFloatArray14[local190];
			}
		} else {
			arg2.aFloatArray15 = this.aFloatArray15;
			arg2.aFloatArray14 = this.aFloatArray14;
		}
		if (Static243.method3146(this.anInt5564, arg0)) {
			if (arg3) {
				arg2.aByte79 = (byte) (arg2.aByte79 | 0x8);
			}
			arg2.aClass195_8 = arg1.aClass195_8;
			arg2.aClass195_8.aByte60 = this.aClass195_8.aByte60;
			arg2.aClass195_8.anInterface12_3 = this.aClass195_8.anInterface12_3;
		} else if (Static255.method3310(this.anInt5564, arg0)) {
			arg2.aClass195_8 = this.aClass195_8;
		} else {
			arg2.aClass195_8 = null;
		}
		if (Static14.method262(arg0, this.anInt5564)) {
			if (arg1.aShortArray96 == null || arg1.aShortArray96.length < this.anInt5557) {
				local190 = this.anInt5557;
				arg2.aShortArray90 = arg1.aShortArray90 = new short[local190];
				arg2.aShortArray98 = arg1.aShortArray98 = new short[local190];
				arg2.aShortArray96 = arg1.aShortArray96 = new short[local190];
			} else {
				arg2.aShortArray98 = arg1.aShortArray98;
				arg2.aShortArray90 = arg1.aShortArray90;
				arg2.aShortArray96 = arg1.aShortArray96;
			}
			for (local190 = 0; local190 < this.anInt5557; local190++) {
				arg2.aShortArray96[local190] = this.aShortArray96[local190];
				arg2.aShortArray90[local190] = this.aShortArray90[local190];
				arg2.aShortArray98[local190] = this.aShortArray98[local190];
			}
		} else {
			arg2.aShortArray96 = this.aShortArray96;
			arg2.aShortArray98 = this.aShortArray98;
			arg2.aShortArray90 = this.aShortArray90;
		}
		if (Static322.method3973(this.anInt5564, arg0)) {
			if (arg3) {
				arg2.aByte79 = (byte) (arg2.aByte79 | 0x10);
			}
			arg2.aClass150_1 = arg1.aClass150_1;
			arg2.aClass150_1.anInterface5_2 = this.aClass150_1.anInterface5_2;
		} else if (Static95.method1331(this.anInt5564, arg0)) {
			arg2.aClass150_1 = this.aClass150_1;
		} else {
			arg2.aClass150_1 = null;
		}
		if (Static423.method5624(arg0, this.anInt5564)) {
			if (arg1.aShortArray92 == null || arg1.aShortArray92.length < this.anInt5557) {
				local190 = this.anInt5557;
				arg2.aShortArray92 = arg1.aShortArray92 = new short[local190];
			} else {
				arg2.aShortArray92 = arg1.aShortArray92;
			}
			for (local190 = 0; local190 < this.anInt5557; local190++) {
				arg2.aShortArray92[local190] = this.aShortArray92[local190];
			}
		} else {
			arg2.aShortArray92 = this.aShortArray92;
		}
		if (!Static47.method776(arg0, this.anInt5564)) {
			arg2.aClass32Array1 = this.aClass32Array1;
		} else if (arg1.aClass32Array1 == null || arg1.aClass32Array1.length < this.anInt5565) {
			local190 = this.anInt5565;
			arg2.aClass32Array1 = arg1.aClass32Array1 = new Class32[local190];
			for (local583 = 0; local583 < this.anInt5565; local583++) {
				arg2.aClass32Array1[local583] = this.aClass32Array1[local583].method786();
			}
		} else {
			arg2.aClass32Array1 = arg1.aClass32Array1;
			for (local190 = 0; local190 < this.anInt5565; local190++) {
				arg2.aClass32Array1[local190].method785(this.aClass32Array1[local190]);
			}
		}
		arg2.aShortArray97 = this.aShortArray97;
		arg2.aClass17Array1 = this.aClass17Array1;
		arg2.anIntArrayArray50 = this.anIntArrayArray50;
		arg2.aClass179Array3 = this.aClass179Array3;
		arg2.anIntArray397 = this.anIntArray397;
		if (this.aBoolean382) {
			arg2.aShort80 = this.aShort80;
			arg2.aShort75 = this.aShort75;
			arg2.aShort77 = this.aShort77;
			arg2.aShort73 = this.aShort73;
			arg2.aShort72 = this.aShort72;
			arg2.aShort74 = this.aShort74;
			arg2.aBoolean382 = true;
			arg2.aShort76 = this.aShort76;
		} else {
			arg2.aBoolean382 = false;
		}
		arg2.aShortArray89 = this.aShortArray89;
		arg2.anIntArrayArray51 = this.anIntArrayArray51;
		arg2.anIntArrayArray49 = this.anIntArrayArray49;
		arg2.aShortArray94 = this.aShortArray94;
		arg2.aClass236Array3 = this.aClass236Array3;
		arg2.anIntArray398 = this.anIntArray398;
		return arg2;
	}

	@OriginalMember(owner = "client!qo", name = "ta", descriptor = "()I")
	@Override
	public int ta() {
		if (!this.aBoolean382) {
			this.method4435();
		}
		return this.aShort77;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
	private void method4430() {
		if (this.anInt5576 == 0) {
			return;
		}
		if (this.aByte79 != 0) {
			this.method4432(true);
		}
		this.method4432(false);
		if (this.aClass150_1 != null) {
			if (this.aClass150_1.anInterface5_2 == null) {
				this.method4436((this.aByte79 & 0x10) != 0);
			}
			if (this.aClass150_1.anInterface5_2 != null) {
				this.aClass200_Sub2_33.method5271(this.aClass195_10 != null);
				this.aClass200_Sub2_33.method5311(this.aClass195_11, this.aClass195_8, this.aClass195_10, this.aClass195_9);
				@Pc(73) int local73 = this.anIntArray398.length - 1;
				for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
					@Pc(82) int local82 = this.anIntArray398[local75];
					@Pc(89) int local89 = this.anIntArray398[local75 + 1];
					@Pc(96) int local96 = this.aShortArray92[local82] & 0xFFFF;
					if (local96 == 65535) {
						local96 = -1;
					}
					this.aClass200_Sub2_33.method5281(local96, this.aClass195_10 != null);
					this.aClass200_Sub2_33.method5325(local82 * 3, this.aClass150_1.anInterface5_2, (local89 - local82) * 3);
				}
			}
		}
		this.method4428();
	}

	@OriginalMember(owner = "client!qo", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.aShort78;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()[Lclient!u;")
	@Override
	public Class236[] method6064() {
		return this.aClass236Array3;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!gl;)V")
	private void method4431(@OriginalArg(1) Class29_Sub1 arg0) {
		@Pc(6) int local6;
		if (this.aClass179Array3 != null) {
			for (local6 = 0; local6 < this.aClass179Array3.length; local6++) {
				@Pc(13) Class179 local13 = this.aClass179Array3[local6];
				@Pc(15) Class179 local15 = local13;
				if (local13.aClass179_1 != null) {
					local15 = local13.aClass179_1;
				}
				local15.anInt4621 = (int) (arg0.aFloat58 * (float) this.anIntArray396[local13.anInt4628] + (float) this.anIntArray399[local13.anInt4628] * arg0.aFloat57 + (float) this.anIntArray400[local13.anInt4628] * arg0.aFloat55 + arg0.aFloat52);
				local15.anInt4634 = (int) (arg0.aFloat50 + arg0.aFloat56 * (float) this.anIntArray399[local13.anInt4628] + arg0.aFloat59 * (float) this.anIntArray396[local13.anInt4628] + (float) this.anIntArray400[local13.anInt4628] * arg0.aFloat49);
				local15.anInt4622 = (int) (arg0.aFloat60 * (float) this.anIntArray400[local13.anInt4628] + (float) this.anIntArray396[local13.anInt4628] * arg0.aFloat53 + arg0.aFloat51 * (float) this.anIntArray399[local13.anInt4628] + arg0.aFloat54);
				local15.anInt4632 = (int) (arg0.aFloat52 + arg0.aFloat57 * (float) this.anIntArray399[local13.anInt4624] + arg0.aFloat58 * (float) this.anIntArray396[local13.anInt4624] + (float) this.anIntArray400[local13.anInt4624] * arg0.aFloat55);
				local15.anInt4637 = (int) (arg0.aFloat50 + (float) this.anIntArray400[local13.anInt4624] * arg0.aFloat49 + (float) this.anIntArray396[local13.anInt4624] * arg0.aFloat59 + (float) this.anIntArray399[local13.anInt4624] * arg0.aFloat56);
				local15.anInt4626 = (int) (arg0.aFloat53 * (float) this.anIntArray396[local13.anInt4624] + arg0.aFloat51 * (float) this.anIntArray399[local13.anInt4624] + (float) this.anIntArray400[local13.anInt4624] * arg0.aFloat60 + arg0.aFloat54);
				local15.anInt4627 = (int) (arg0.aFloat58 * (float) this.anIntArray396[local13.anInt4638] + (float) this.anIntArray399[local13.anInt4638] * arg0.aFloat57 + (float) this.anIntArray400[local13.anInt4638] * arg0.aFloat55 + arg0.aFloat52);
				local15.anInt4633 = (int) (arg0.aFloat50 + (float) this.anIntArray396[local13.anInt4638] * arg0.aFloat59 + arg0.aFloat56 * (float) this.anIntArray399[local13.anInt4638] + arg0.aFloat49 * (float) this.anIntArray400[local13.anInt4638]);
				local15.anInt4636 = (int) (arg0.aFloat54 + (float) this.anIntArray400[local13.anInt4638] * arg0.aFloat60 + (float) this.anIntArray399[local13.anInt4638] * arg0.aFloat51 + arg0.aFloat53 * (float) this.anIntArray396[local13.anInt4638]);
			}
		}
		if (this.aClass236Array3 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass236Array3.length; local6++) {
			@Pc(362) Class236 local362 = this.aClass236Array3[local6];
			@Pc(364) Class236 local364 = local362;
			if (local362.aClass236_2 != null) {
				local364 = local362.aClass236_2;
			}
			if (local362.aClass29_7 == null) {
				local362.aClass29_7 = arg0.method4107();
			} else {
				local362.aClass29_7.ha(arg0);
			}
			local364.anInt6775 = (int) ((float) this.anIntArray396[local362.anInt6780] * arg0.aFloat58 + arg0.aFloat57 * (float) this.anIntArray399[local362.anInt6780] + arg0.aFloat55 * (float) this.anIntArray400[local362.anInt6780] + arg0.aFloat52);
			local364.anInt6781 = (int) (arg0.aFloat50 + arg0.aFloat49 * (float) this.anIntArray400[local362.anInt6780] + (float) this.anIntArray399[local362.anInt6780] * arg0.aFloat56 + (float) this.anIntArray396[local362.anInt6780] * arg0.aFloat59);
			local364.anInt6774 = (int) (arg0.aFloat54 + (float) this.anIntArray400[local362.anInt6780] * arg0.aFloat60 + arg0.aFloat53 * (float) this.anIntArray396[local362.anInt6780] + arg0.aFloat51 * (float) this.anIntArray399[local362.anInt6780]);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class57 method6066(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class57_Sub2 local18;
		@Pc(14) Class57_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass200_Sub2_33.aClass57_Sub2_9;
			local18 = this.aClass200_Sub2_33.aClass57_Sub2_7;
		} else if (arg0 == 2) {
			local18 = this.aClass200_Sub2_33.aClass57_Sub2_10;
			local14 = this.aClass200_Sub2_33.aClass57_Sub2_6;
		} else if (arg0 == 3) {
			local14 = this.aClass200_Sub2_33.aClass57_Sub2_1;
			local18 = this.aClass200_Sub2_33.aClass57_Sub2_3;
		} else if (arg0 == 4) {
			local18 = this.aClass200_Sub2_33.aClass57_Sub2_5;
			local14 = this.aClass200_Sub2_33.aClass57_Sub2_8;
		} else if (arg0 == 5) {
			local14 = this.aClass200_Sub2_33.aClass57_Sub2_4;
			local18 = this.aClass200_Sub2_33.aClass57_Sub2_2;
		} else {
			local18 = local14 = new Class57_Sub2(this.aClass200_Sub2_33);
		}
		return this.method4429(arg1, local14, local18, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!qo", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class30.anIntArray38[arg0];
		@Pc(13) int local13 = Class30.anIntArray37[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5578; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray400[local15] + local13 * this.anIntArray399[local15] >> 15;
			this.anIntArray400[local15] = local13 * this.anIntArray400[local15] - this.anIntArray399[local15] * local9 >> 15;
			this.anIntArray399[local15] = local33;
		}
		this.aBoolean382 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5578; local3++) {
			this.anIntArray400[local3] = -this.anIntArray400[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5582; local25++) {
			this.aShortArray95[local25] = (short) -this.aShortArray95[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5557; local44++) {
			@Pc(51) short local51 = this.aShortArray96[local44];
			this.aShortArray96[local44] = this.aShortArray98[local44];
			this.aShortArray98[local44] = local51;
		}
		if (this.aClass195_10 == null && this.aClass195_11 != null) {
			this.aClass195_11.anInterface12_3 = null;
		}
		if (this.aClass195_10 != null) {
			this.aClass195_10.anInterface12_3 = null;
		}
		if (this.aClass150_1 != null) {
			this.aClass150_1.anInterface5_2 = null;
		}
		this.aBoolean382 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZZ)V")
	private void method4432(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass195_11 != null && this.aClass195_11.anInterface12_3 == null;
		@Pc(27) boolean local27 = this.aClass195_10 != null && this.aClass195_10.anInterface12_3 == null;
		@Pc(38) boolean local38 = this.aClass195_9 != null && this.aClass195_9.anInterface12_3 == null;
		@Pc(49) boolean local49 = this.aClass195_8 != null && this.aClass195_8.anInterface12_3 == null;
		if (arg0) {
			local49 &= (this.aByte79 & 0x8) != 0;
			local38 &= (this.aByte79 & 0x1) != 0;
			local27 &= (this.aByte79 & 0x4) != 0;
			local16 &= (this.aByte79 & 0x2) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (local38) {
			local100 = 12;
		}
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local106 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local108 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (local100 * this.anInt5582 > this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2.aByteArray93.length) {
			this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2 = new Class5_Sub15_Sub1(local100 * (this.anInt5582 + 100));
		} else {
			this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2.anInt7013 = 0;
		}
		@Pc(180) Class5_Sub15_Sub1 local180 = this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2;
		@Pc(188) int local188;
		@Pc(197) int local197;
		@Pc(225) int local225;
		@Pc(234) int local234;
		if (local38) {
			@Pc(204) int local204;
			@Pc(211) int local211;
			@Pc(216) int local216;
			@Pc(223) int local223;
			if (this.aClass200_Sub2_33.aBoolean433) {
				for (local188 = 0; local188 < this.anInt5578; local188++) {
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray399[local188]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray396[local188]);
					local211 = NativeStream.floatToRawIntBits((float) this.anIntArray400[local188]);
					local216 = this.anIntArray397[local188];
					local223 = this.anIntArray397[local188 + 1];
					for (local225 = local216; local225 < local223; local225++) {
						local234 = this.aShortArray97[local225] - 1;
						if (local234 == -1) {
							break;
						}
						local180.anInt7013 = local100 * local234;
						local180.method5550(local197);
						local180.method5550(local204);
						local180.method5550(local211);
					}
				}
			} else {
				for (local188 = 0; local188 < this.anInt5578; local188++) {
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray399[local188]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray396[local188]);
					local211 = NativeStream.floatToRawIntBits((float) this.anIntArray400[local188]);
					local216 = this.anIntArray397[local188];
					local223 = this.anIntArray397[local188 + 1];
					for (local225 = local216; local225 < local223; local225++) {
						local234 = this.aShortArray97[local225] - 1;
						if (local234 == -1) {
							break;
						}
						local180.anInt7013 = local100 * local234;
						local180.method5567(local197);
						local180.method5567(local204);
						local180.method5567(local211);
					}
				}
			}
		}
		@Pc(476) float local476;
		@Pc(367) short[] local367;
		@Pc(364) short[] local364;
		@Pc(358) short[] local358;
		@Pc(361) byte[] local361;
		@Pc(515) float local515;
		if (local16) {
			if (this.aClass195_10 == null) {
				if (this.aClass184_1 == null) {
					local358 = this.aShortArray95;
					local361 = this.aByteArray70;
					local364 = this.aShortArray99;
					local367 = this.aShortArray91;
				} else {
					local361 = this.aClass184_1.aByteArray67;
					local358 = this.aClass184_1.aShortArray78;
					local364 = this.aClass184_1.aShortArray79;
					local367 = this.aClass184_1.aShortArray77;
				}
				@Pc(391) float local391 = this.aClass200_Sub2_33.aFloatArray19[0];
				@Pc(397) float local397 = this.aClass200_Sub2_33.aFloatArray19[1];
				@Pc(403) float local403 = this.aClass200_Sub2_33.aFloatArray19[2];
				@Pc(407) float local407 = this.aClass200_Sub2_33.aFloat154;
				@Pc(417) float local417 = this.aClass200_Sub2_33.aFloat157 * 768.0F / (float) this.aShort78;
				@Pc(427) float local427 = this.aClass200_Sub2_33.aFloat162 * 768.0F / (float) this.aShort78;
				for (@Pc(429) int local429 = 0; local429 < this.anInt5557; local429++) {
					@Pc(449) int local449 = this.method4433(this.aShortArray92[local429], this.aShortArray93[local429], this.aShort79, this.aByteArray71[local429]);
					@Pc(454) short local454 = this.aShortArray96[local429];
					@Pc(465) float local465 = (float) (local449 >> 8 & 0xFF) * this.aClass200_Sub2_33.aFloat156;
					local476 = (float) (local449 >> 16 & 0xFF) * this.aClass200_Sub2_33.aFloat159;
					@Pc(485) float local485 = this.aClass200_Sub2_33.aFloat163 * (float) (local449 >>> 24);
					@Pc(490) short local490 = (short) local361[local454];
					if (local490 == 0) {
						local515 = (local391 * (float) local367[local454] + (float) local364[local454] * local397 + (float) local358[local454] * local403) * 0.0026041667F;
					} else {
						local515 = (local391 * (float) local367[local454] + local397 * (float) local364[local454] + local403 * (float) local358[local454]) / (float) (local490 * 256);
					}
					@Pc(555) float local555 = local407 + local515 * (local515 < 0.0F ? local427 : local417);
					@Pc(560) int local560 = (int) (local555 * local485);
					@Pc(565) int local565 = (int) (local476 * local555);
					if (local560 < 0) {
						local560 = 0;
					} else if (local560 > 255) {
						local560 = 255;
					}
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					@Pc(597) int local597 = (int) (local465 * local555);
					local180.anInt7013 = local454 * local100 + local104;
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					local180.method5583(local560);
					local180.method5583(local565);
					local180.method5583(local597);
					local180.method5583(255 - (this.aByteArray71[local429] & 0xFF));
					local454 = this.aShortArray90[local429];
					local490 = local361[local454];
					if (local490 == 0) {
						local515 = ((float) local358[local454] * local403 + (float) local367[local454] * local391 + (float) local364[local454] * local397) * 0.0026041667F;
					} else {
						local515 = (local403 * (float) local358[local454] + (float) local364[local454] * local397 + local391 * (float) local367[local454]) / (float) (local490 * 256);
					}
					local555 = local407 + (local515 < 0.0F ? local427 : local417) * local515;
					local560 = (int) (local485 * local555);
					local565 = (int) (local555 * local476);
					if (local560 < 0) {
						local560 = 0;
					} else if (local560 > 255) {
						local560 = 255;
					}
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					local597 = (int) (local465 * local555);
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					local180.anInt7013 = local104 + local454 * local100;
					local180.method5583(local560);
					local180.method5583(local565);
					local180.method5583(local597);
					local180.method5583(255 - (this.aByteArray71[local429] & 0xFF));
					local454 = this.aShortArray98[local429];
					local490 = local361[local454];
					if (local490 == 0) {
						local515 = ((float) local364[local454] * local397 + local391 * (float) local367[local454] + (float) local358[local454] * local403) * 0.0026041667F;
					} else {
						local515 = ((float) local367[local454] * local391 + local397 * (float) local364[local454] + (float) local358[local454] * local403) / (float) (local490 * 256);
					}
					local555 = local515 * (local515 < 0.0F ? local427 : local417) + local407;
					local560 = (int) (local485 * local555);
					local565 = (int) (local555 * local476);
					if (local560 < 0) {
						local560 = 0;
					} else if (local560 > 255) {
						local560 = 255;
					}
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					local597 = (int) (local555 * local465);
					local180.anInt7013 = local454 * local100 + local104;
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					local180.method5583(local560);
					local180.method5583(local565);
					local180.method5583(local597);
					local180.method5583(255 - (this.aByteArray71[local429] & 0xFF));
				}
			} else {
				for (local188 = 0; local188 < this.anInt5557; local188++) {
					local197 = this.method4433(this.aShortArray92[local188], this.aShortArray93[local188], this.aShort79, this.aByteArray71[local188]);
					local180.anInt7013 = local104 + this.aShortArray96[local188] * local100;
					local180.method5550(local197);
					local180.anInt7013 = this.aShortArray90[local188] * local100 + local104;
					local180.method5550(local197);
					local180.anInt7013 = this.aShortArray98[local188] * local100 + local104;
					local180.method5550(local197);
				}
			}
		}
		if (local27) {
			if (this.aClass184_1 == null) {
				local358 = this.aShortArray95;
				local361 = this.aByteArray70;
				local364 = this.aShortArray99;
				local367 = this.aShortArray91;
			} else {
				local358 = this.aClass184_1.aShortArray78;
				local367 = this.aClass184_1.aShortArray77;
				local364 = this.aClass184_1.aShortArray79;
				local361 = this.aClass184_1.aByteArray67;
			}
			@Pc(1101) float local1101 = 3.0F / (float) this.aShort78;
			local515 = 3.0F / (float) (this.aShort78 / 2 + this.aShort78);
			local180.anInt7013 = local106;
			if (this.aClass200_Sub2_33.aBoolean433) {
				for (local225 = 0; local225 < this.anInt5582; local225++) {
					local234 = local361[local225] & 0xFF;
					if (local234 == 0) {
						local180.method4831((float) local367[local225] * local515);
						local180.method4831(local515 * (float) local364[local225]);
						local180.method4831(local515 * (float) local358[local225]);
					} else {
						local476 = local1101 / (float) local234;
						local180.method4831(local476 * (float) local367[local225]);
						local180.method4831(local476 * (float) local364[local225]);
						local180.method4831(local476 * (float) local358[local225]);
					}
					local180.anInt7013 += local100 - 12;
				}
			} else {
				for (local225 = 0; local225 < this.anInt5582; local225++) {
					local234 = local361[local225] & 0xFF;
					if (local234 == 0) {
						local180.method4833((float) local367[local225] * local515);
						local180.method4833(local515 * (float) local364[local225]);
						local180.method4833(local515 * (float) local358[local225]);
					} else {
						local476 = local1101 / (float) local234;
						local180.method4833((float) local367[local225] * local476);
						local180.method4833((float) local364[local225] * local476);
						local180.method4833((float) local358[local225] * local476);
					}
					local180.anInt7013 += local100 - 12;
				}
			}
		}
		if (local49) {
			local180.anInt7013 = local108;
			if (this.aClass200_Sub2_33.aBoolean433) {
				for (local188 = 0; local188 < this.anInt5582; local188++) {
					local180.method4831(this.aFloatArray15[local188]);
					local180.method4831(this.aFloatArray14[local188]);
					local180.anInt7013 += local100 - 8;
				}
			} else {
				for (local188 = 0; local188 < this.anInt5582; local188++) {
					local180.method4833(this.aFloatArray15[local188]);
					local180.method4833(this.aFloatArray14[local188]);
					local180.anInt7013 += local100 - 8;
				}
			}
		}
		local180.anInt7013 = this.anInt5582 * local100;
		@Pc(1424) Interface12 local1424;
		if (arg0) {
			if (this.anInterface12_4 == null) {
				this.anInterface12_4 = this.aClass200_Sub2_33.method5298(local180.aByteArray93, true, local100, local180.anInt7013);
			} else {
				this.anInterface12_4.method5507(local180.anInt7013, local100, local180.aByteArray93);
			}
			local1424 = this.anInterface12_4;
			this.aByte79 = 0;
		} else {
			local1424 = this.aClass200_Sub2_33.method5298(local180.aByteArray93, false, local100, local180.anInt7013);
			this.aBoolean381 = true;
		}
		if (local38) {
			this.aClass195_9.anInterface12_3 = local1424;
			this.aClass195_9.aByte60 = 0;
		}
		if (local49) {
			this.aClass195_8.anInterface12_3 = local1424;
			this.aClass195_8.aByte60 = local108;
		}
		if (local16) {
			this.aClass195_11.aByte60 = local104;
			this.aClass195_11.anInterface12_3 = local1424;
		}
		if (local27) {
			this.aClass195_10.anInterface12_3 = local1424;
			this.aClass195_10.aByte60 = local106;
		}
	}

	@OriginalMember(owner = "client!qo", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		if (!this.aBoolean382) {
			this.method4435();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(SIIIB)I")
	private int method4433(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static219.anIntArray223[Static111.method1530(arg2, arg1)];
		if (arg0 != -1) {
			@Pc(29) Class178 local29 = this.aClass200_Sub2_33.anInterface8_134.method4125(arg0 & 0xFFFF);
			@Pc(34) int local34 = local29.aByte53 & 0xFF;
			@Pc(50) int local50;
			@Pc(72) int local72;
			if (local34 != 0) {
				if (arg2 < 0) {
					local50 = 0;
				} else if (arg2 <= 127) {
					local50 = arg2 * 131586;
				} else {
					local50 = 16777215;
				}
				if (local34 == 256) {
					local12 = local50;
				} else {
					local72 = 256 - local34;
					local12 = ((local50 & 0xFF00) * local34 + (local12 & 0xFF00) * local72 & 0xFF0000) + ((local12 & 0xFF00FF) * local72 + local34 * (local50 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local50 = local29.aByte52 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(118) int local118 = local50 * (local12 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				local72 = (local12 >> 8 & 0xFF) * local50;
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(144) int local144 = (local12 & 0xFF) * local50;
				if (local144 > 65535) {
					local144 = 65535;
				}
				local12 = (local72 & 0xFF00) + (local118 << 8 & 0xFF00E3) + (local144 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!c;Lclient!wg;I)V")
	@Override
	public void method6060(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class88_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5582 == 0) {
			return;
		}
		@Pc(16) Class29_Sub1 local16 = this.aClass200_Sub2_33.aClass29_Sub1_3;
		@Pc(19) Class29_Sub1 local19 = (Class29_Sub1) arg0;
		if (!this.aBoolean382) {
			this.method4435();
		}
		this.method4431(local19);
		Static399.aFloat152 = local16.aFloat54 + local19.aFloat54 * local16.aFloat60 + local19.aFloat50 * local16.aFloat53 + local16.aFloat51 * local19.aFloat52;
		Static183.aFloat71 = local19.aFloat59 * local16.aFloat53 + local19.aFloat58 * local16.aFloat51 + local19.aFloat53 * local16.aFloat60;
		@Pc(76) float local76 = Static399.aFloat152 + (float) this.aShort72 * Static183.aFloat71;
		@Pc(84) float local84 = Static183.aFloat71 * (float) this.aShort76 + Static399.aFloat152;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (local84 < local76) {
			local100 = local76 + (float) this.aShort80;
			local94 = local84 - (float) this.aShort80;
		} else {
			local94 = local76 - (float) this.aShort80;
			local100 = (float) this.aShort80 + local84;
		}
		if (local94 >= this.aClass200_Sub2_33.aFloat169 || (float) this.aClass200_Sub2_33.anInt6751 >= local100) {
			return;
		}
		Static103.aFloat34 = local19.aFloat53 * local16.aFloat55 + local16.aFloat58 * local19.aFloat59 + local19.aFloat58 * local16.aFloat57;
		Static9.aFloat6 = local16.aFloat52 + local19.aFloat54 * local16.aFloat55 + local19.aFloat50 * local16.aFloat58 + local16.aFloat57 * local19.aFloat52;
		@Pc(176) float local176 = Static103.aFloat34 * (float) this.aShort72 + Static9.aFloat6;
		@Pc(184) float local184 = Static103.aFloat34 * (float) this.aShort76 + Static9.aFloat6;
		@Pc(200) float local200;
		@Pc(211) float local211;
		if (local184 < local176) {
			local200 = (float) this.aClass200_Sub2_33.anInt6750 * ((float) -this.aShort80 + local184);
			local211 = (float) this.aClass200_Sub2_33.anInt6750 * ((float) this.aShort80 + local176);
		} else {
			local211 = (local184 + (float) this.aShort80) * (float) this.aClass200_Sub2_33.anInt6750;
			local200 = (float) this.aClass200_Sub2_33.anInt6750 * ((float) -this.aShort80 + local176);
		}
		if (local200 / local100 >= this.aClass200_Sub2_33.aFloat168 || local211 / local100 <= this.aClass200_Sub2_33.aFloat161) {
			return;
		}
		Static419.aFloat174 = local19.aFloat58 * local16.aFloat56 + local19.aFloat59 * local16.aFloat59 + local16.aFloat49 * local19.aFloat53;
		Static303.aFloat114 = local16.aFloat50 + local19.aFloat50 * local16.aFloat59 + local16.aFloat56 * local19.aFloat52 + local19.aFloat54 * local16.aFloat49;
		@Pc(301) float local301 = Static419.aFloat174 * (float) this.aShort72 + Static303.aFloat114;
		@Pc(309) float local309 = Static303.aFloat114 + Static419.aFloat174 * (float) this.aShort76;
		@Pc(335) float local335;
		@Pc(324) float local324;
		if (local301 > local309) {
			local324 = (local301 + (float) this.aShort80) * (float) this.aClass200_Sub2_33.anInt6761;
			local335 = ((float) -this.aShort80 + local309) * (float) this.aClass200_Sub2_33.anInt6761;
		} else {
			local324 = (float) this.aClass200_Sub2_33.anInt6761 * ((float) this.aShort80 + local309);
			local335 = (local301 - (float) this.aShort80) * (float) this.aClass200_Sub2_33.anInt6761;
		}
		if (local335 / local100 >= this.aClass200_Sub2_33.aFloat164 || local324 / local100 <= this.aClass200_Sub2_33.aFloat165) {
			return;
		}
		if (arg1 != null || this.aClass17Array1 != null) {
			Static354.aFloat142 = local19.aFloat60 * local16.aFloat55 + local16.aFloat58 * local19.aFloat49 + local19.aFloat55 * local16.aFloat57;
			Static285.aFloat111 = local19.aFloat51 * local16.aFloat60 + local19.aFloat57 * local16.aFloat51 + local19.aFloat56 * local16.aFloat53;
			Static307.aFloat115 = local19.aFloat56 * local16.aFloat59 + local16.aFloat56 * local19.aFloat57 + local19.aFloat51 * local16.aFloat49;
			Static253.aFloat102 = local19.aFloat49 * local16.aFloat59 + local19.aFloat55 * local16.aFloat56 + local16.aFloat49 * local19.aFloat60;
			Static8.aFloat5 = local19.aFloat60 * local16.aFloat60 + local19.aFloat49 * local16.aFloat53 + local16.aFloat51 * local19.aFloat55;
			Static390.aFloat150 = local19.aFloat56 * local16.aFloat58 + local19.aFloat57 * local16.aFloat57 + local16.aFloat55 * local19.aFloat51;
		}
		if (arg1 != null) {
			@Pc(495) boolean local495 = false;
			@Pc(497) boolean local497 = true;
			@Pc(505) int local505 = this.aShort77 + this.aShort73 >> 1;
			@Pc(513) int local513 = this.aShort75 + this.aShort74 >> 1;
			@Pc(532) int local532 = (int) (Static9.aFloat6 + (float) local505 * Static390.aFloat150 + (float) this.aShort72 * Static103.aFloat34 + (float) local513 * Static354.aFloat142);
			@Pc(551) int local551 = (int) ((float) local505 * Static307.aFloat115 + Static303.aFloat114 + Static419.aFloat174 * (float) this.aShort72 + Static253.aFloat102 * (float) local513);
			@Pc(570) int local570 = (int) (Static183.aFloat71 * (float) this.aShort72 + Static399.aFloat152 + Static285.aFloat111 * (float) local505 + (float) local513 * Static8.aFloat5);
			if (local570 >= this.aClass200_Sub2_33.anInt6751) {
				arg1.anInt7384 = this.aClass200_Sub2_33.anInt6750 * local532 / local570 + this.aClass200_Sub2_33.anInt6745;
				arg1.anInt7387 = this.aClass200_Sub2_33.anInt6729 + this.aClass200_Sub2_33.anInt6761 * local551 / local570;
			} else {
				local495 = true;
			}
			@Pc(624) int local624 = (int) ((float) local513 * Static354.aFloat142 + Static9.aFloat6 + (float) local505 * Static390.aFloat150 + (float) this.aShort76 * Static103.aFloat34);
			@Pc(643) int local643 = (int) ((float) local513 * Static253.aFloat102 + (float) local505 * Static307.aFloat115 + Static303.aFloat114 + Static419.aFloat174 * (float) this.aShort76);
			@Pc(662) int local662 = (int) (Static399.aFloat152 + (float) local505 * Static285.aFloat111 + Static183.aFloat71 * (float) this.aShort76 + Static8.aFloat5 * (float) local513);
			if (this.aClass200_Sub2_33.anInt6751 <= local662) {
				arg1.anInt7388 = local643 * this.aClass200_Sub2_33.anInt6761 / local662 + this.aClass200_Sub2_33.anInt6729;
				arg1.anInt7385 = this.aClass200_Sub2_33.anInt6750 * local624 / local662 + this.aClass200_Sub2_33.anInt6745;
			} else {
				local495 = true;
			}
			if (local495) {
				if (local570 < this.aClass200_Sub2_33.anInt6751 && local662 < this.aClass200_Sub2_33.anInt6751) {
					local497 = false;
				} else {
					@Pc(740) int local740;
					@Pc(751) int local751;
					@Pc(761) int local761;
					if (local570 < this.aClass200_Sub2_33.anInt6751) {
						local740 = (local662 - this.aClass200_Sub2_33.anInt6751 << 16) / (local662 - local570);
						local751 = local624 + (local740 * (local624 - local532) >> 16);
						local761 = (local740 * (local643 - local551) >> 16) + local643;
						arg1.anInt7384 = this.aClass200_Sub2_33.anInt6745 + local751 * this.aClass200_Sub2_33.anInt6750 / this.aClass200_Sub2_33.anInt6751;
						arg1.anInt7387 = local761 * this.aClass200_Sub2_33.anInt6761 / this.aClass200_Sub2_33.anInt6751 + this.aClass200_Sub2_33.anInt6729;
					} else if (this.aClass200_Sub2_33.anInt6751 > local662) {
						local740 = (local570 - this.aClass200_Sub2_33.anInt6751 << 16) / (local570 - local662);
						local751 = local532 + ((local532 - local624) * local740 >> 16);
						arg1.anInt7384 = local751 * this.aClass200_Sub2_33.anInt6750 / this.aClass200_Sub2_33.anInt6751 + this.aClass200_Sub2_33.anInt6745;
						local761 = local551 + ((local551 - local643) * local740 >> 16);
						arg1.anInt7387 = this.aClass200_Sub2_33.anInt6729 + local761 * this.aClass200_Sub2_33.anInt6761 / this.aClass200_Sub2_33.anInt6751;
					}
				}
			}
			if (local497) {
				if (local570 <= local662) {
					arg1.anInt7386 = (this.aShort80 + local624) * this.aClass200_Sub2_33.anInt6750 / local662 + this.aClass200_Sub2_33.anInt6745 - arg1.anInt7385;
				} else {
					arg1.anInt7386 = (local532 + this.aShort80) * this.aClass200_Sub2_33.anInt6750 / local570 + this.aClass200_Sub2_33.anInt6745 - arg1.anInt7384;
				}
				arg1.aBoolean496 = true;
			}
		}
		this.aClass200_Sub2_33.method5287();
		this.aClass200_Sub2_33.method5310(local19);
		this.method4430();
		this.aClass200_Sub2_33.method5320();
		this.method4438();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIFFILclient!fe;IIJ)S")
	private short method4434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray397[arg4];
		@Pc(17) int local17 = this.anIntArray397[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray97[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static190.aLongArray17[local21] == arg8) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray97[local19] = (short) (this.anInt5582 + 1);
		Static190.aLongArray17[local19] = arg8;
		this.aShortArray91[this.anInt5582] = (short) arg0;
		this.aShortArray99[this.anInt5582] = (short) arg6;
		this.aShortArray95[this.anInt5582] = (short) arg7;
		this.aByteArray70[this.anInt5582] = (byte) arg1;
		this.aFloatArray15[this.anInt5582] = arg3;
		this.aFloatArray14[this.anInt5582] = arg2;
		return (short) this.anInt5582++;
	}

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "(III)V")
	@Override
	public void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5578; local7++) {
			if (arg0 != 128) {
				this.anIntArray399[local7] = arg0 * this.anIntArray399[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray396[local7] = this.anIntArray396[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray400[local7] = this.anIntArray400[local7] * arg2 >> 7;
			}
		}
		this.aBoolean382 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	private void method4435() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt5578; local27++) {
			@Pc(34) int local34 = this.anIntArray399[local27];
			@Pc(39) int local39 = this.anIntArray396[local27];
			if (local34 > local13) {
				local13 = local34;
			}
			if (local7 > local34) {
				local7 = local34;
			}
			if (local9 > local39) {
				local9 = local39;
			}
			if (local39 > local15) {
				local15 = local39;
			}
			@Pc(76) int local76 = this.anIntArray400[local27];
			if (local76 < local11) {
				local11 = local76;
			}
			if (local17 < local76) {
				local17 = local76;
			}
			@Pc(98) int local98 = local34 * local34 + local76 * local76;
			if (local98 > local23) {
				local23 = local98;
			}
			local98 = local39 * local39 + local34 * local34 + local76 * local76;
			if (local25 < local98) {
				local25 = local98;
			}
		}
		this.aShort72 = (short) local9;
		this.aShort75 = (short) local17;
		this.aShort77 = (short) local7;
		this.aShort74 = (short) local11;
		this.aShort73 = (short) local13;
		this.aShort76 = (short) local15;
		this.aShort80 = (short) (Math.sqrt((double) local23) + 0.99D);
		Math.sqrt((double) local25);
		this.aBoolean382 = true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BZ)V")
	private void method4436(@OriginalArg(1) boolean arg0) {
		if (this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2.aByteArray93.length < this.anInt5576 * 6) {
			this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2 = new Class5_Sub15_Sub1((this.anInt5576 + 100) * 6);
		} else {
			this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2.anInt7013 = 0;
		}
		@Pc(46) Class5_Sub15_Sub1 local46 = this.aClass200_Sub2_33.aClass5_Sub15_Sub1_2;
		@Pc(52) int local52;
		if (this.aClass200_Sub2_33.aBoolean433) {
			for (local52 = 0; local52 < this.anInt5576; local52++) {
				local46.method5566(this.aShortArray96[local52]);
				local46.method5566(this.aShortArray90[local52]);
				local46.method5566(this.aShortArray98[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt5576; local52++) {
				local46.method5568(this.aShortArray96[local52]);
				local46.method5568(this.aShortArray90[local52]);
				local46.method5568(this.aShortArray98[local52]);
			}
		}
		if (local46.anInt7013 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface5_3 == null) {
				this.anInterface5_3 = this.aClass200_Sub2_33.method5324(local46.anInt7013, true, local46.aByteArray93);
			} else {
				this.anInterface5_3.method1489(local46.aByteArray93, local46.anInt7013);
			}
			this.aClass150_1.anInterface5_2 = this.anInterface5_3;
		} else {
			this.aClass150_1.anInterface5_2 = this.aClass200_Sub2_33.method5324(local46.anInt7013, false, local46.aByteArray93);
		}
		if (!arg0) {
			this.aBoolean381 = true;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ag;B)V")
	private void method4437(@OriginalArg(0) Class5_Sub2_Sub1_Sub1 arg0) {
		if (this.aClass200_Sub2_33.anIntArray462.length < this.anInt5582) {
			this.aClass200_Sub2_33.anIntArray464 = new int[this.anInt5582];
			this.aClass200_Sub2_33.anIntArray462 = new int[this.anInt5582];
		}
		@Pc(32) int[] local32 = this.aClass200_Sub2_33.anIntArray462;
		@Pc(36) int[] local36 = this.aClass200_Sub2_33.anIntArray464;
		@Pc(72) int local72;
		@Pc(110) int local110;
		@Pc(119) int local119;
		for (@Pc(46) int local46 = 0; local46 < this.anInt5578; local46++) {
			local72 = (this.anIntArray399[local46] - (this.aClass200_Sub2_33.anInt6731 * this.anIntArray396[local46] >> 8) >> this.aClass200_Sub2_33.anInt6721) - arg0.anInt183;
			@Pc(96) int local96 = (this.anIntArray400[local46] - (this.anIntArray396[local46] * this.aClass200_Sub2_33.anInt6737 >> 8) >> this.aClass200_Sub2_33.anInt6721) - arg0.anInt186;
			@Pc(101) int local101 = this.anIntArray397[local46];
			@Pc(108) int local108 = this.anIntArray397[local46 + 1];
			for (local110 = local101; local110 < local108; local110++) {
				local119 = this.aShortArray97[local110] - 1;
				if (local119 == -1) {
					break;
				}
				local32[local119] = local72;
				local36[local119] = local96;
			}
		}
		for (local72 = 0; local72 < this.anInt5576; local72++) {
			if (this.aByteArray71 == null || this.aByteArray71[local72] <= 128) {
				@Pc(159) short local159 = this.aShortArray96[local72];
				@Pc(164) short local164 = this.aShortArray90[local72];
				@Pc(169) short local169 = this.aShortArray98[local72];
				local110 = local32[local159];
				local119 = local32[local164];
				@Pc(181) int local181 = local32[local169];
				@Pc(185) int local185 = local36[local159];
				@Pc(189) int local189 = local36[local164];
				@Pc(193) int local193 = local36[local169];
				if (-((local181 - local119) * (local189 - local185)) + (local189 - local193) * (local110 - local119) > 0) {
					arg0.method143(local185, local193, local181, local110, local189, local119);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()[Lclient!od;")
	@Override
	public Class179[] method6073() {
		return this.aClass179Array3;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method6071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class29_Sub1 local8 = (Class29_Sub1) arg2;
		@Pc(12) Class29_Sub1 local12 = this.aClass200_Sub2_33.aClass29_Sub1_3;
		@Pc(33) float local33 = local12.aFloat52 + local12.aFloat55 * local8.aFloat54 + local12.aFloat58 * local8.aFloat50 + local8.aFloat52 * local12.aFloat57;
		@Pc(54) float local54 = local8.aFloat52 * local12.aFloat56 + local12.aFloat59 * local8.aFloat50 + local12.aFloat49 * local8.aFloat54 + local12.aFloat50;
		@Pc(75) float local75 = local12.aFloat54 + local12.aFloat60 * local8.aFloat54 + local8.aFloat50 * local12.aFloat53 + local12.aFloat51 * local8.aFloat52;
		Static419.aFloat174 = local12.aFloat59 * local8.aFloat59 + local12.aFloat56 * local8.aFloat58 + local8.aFloat53 * local12.aFloat49;
		Static103.aFloat34 = local8.aFloat53 * local12.aFloat55 + local12.aFloat58 * local8.aFloat59 + local12.aFloat57 * local8.aFloat58;
		Static390.aFloat150 = local12.aFloat57 * local8.aFloat57 + local12.aFloat58 * local8.aFloat56 + local12.aFloat55 * local8.aFloat51;
		Static307.aFloat115 = local8.aFloat51 * local12.aFloat49 + local12.aFloat56 * local8.aFloat57 + local8.aFloat56 * local12.aFloat59;
		Static285.aFloat111 = local12.aFloat53 * local8.aFloat56 + local8.aFloat57 * local12.aFloat51 + local8.aFloat51 * local12.aFloat60;
		Static8.aFloat5 = local8.aFloat55 * local12.aFloat51 + local12.aFloat53 * local8.aFloat49 + local12.aFloat60 * local8.aFloat60;
		Static253.aFloat102 = local12.aFloat49 * local8.aFloat60 + local8.aFloat49 * local12.aFloat59 + local12.aFloat56 * local8.aFloat55;
		Static354.aFloat142 = local8.aFloat55 * local12.aFloat57 + local12.aFloat58 * local8.aFloat49 + local12.aFloat55 * local8.aFloat60;
		Static183.aFloat71 = local12.aFloat60 * local8.aFloat53 + local8.aFloat58 * local12.aFloat51 + local12.aFloat53 * local8.aFloat59;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass200_Sub2_33.anInt6750;
		@Pc(255) int local255 = this.aClass200_Sub2_33.anInt6761;
		if (!this.aBoolean382) {
			this.method4435();
		}
		Static70.anIntArray64[0] = this.aShort77;
		Static6.anIntArray7[0] = this.aShort72;
		Static65.anIntArray373[0] = this.aShort74;
		Static70.anIntArray64[1] = this.aShort73;
		Static6.anIntArray7[1] = this.aShort72;
		Static65.anIntArray373[1] = this.aShort74;
		Static70.anIntArray64[2] = this.aShort77;
		Static6.anIntArray7[2] = this.aShort76;
		Static70.anIntArray64[3] = this.aShort73;
		Static65.anIntArray373[2] = this.aShort74;
		Static6.anIntArray7[3] = this.aShort76;
		Static70.anIntArray64[4] = this.aShort77;
		Static65.anIntArray373[3] = this.aShort74;
		Static6.anIntArray7[4] = this.aShort72;
		Static65.anIntArray373[4] = this.aShort75;
		Static70.anIntArray64[5] = this.aShort73;
		Static6.anIntArray7[5] = this.aShort72;
		Static65.anIntArray373[5] = this.aShort75;
		Static70.anIntArray64[6] = this.aShort77;
		Static6.anIntArray7[6] = this.aShort76;
		Static65.anIntArray373[6] = this.aShort75;
		Static70.anIntArray64[7] = this.aShort73;
		Static6.anIntArray7[7] = this.aShort76;
		Static65.anIntArray373[7] = this.aShort75;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static70.anIntArray64[local383];
			local395 = Static65.anIntArray373[local383];
			local400 = Static6.anIntArray7[local383];
			local414 = local54 + Static307.aFloat115 * local390 + local400 * Static419.aFloat174 + local395 * Static253.aFloat102;
			local428 = local395 * Static8.aFloat5 + local390 * Static285.aFloat111 + local400 * Static183.aFloat71 + local75;
			local442 = Static103.aFloat34 * local400 + local390 * Static390.aFloat150 + Static354.aFloat142 * local395 + local33;
			if ((float) this.aClass200_Sub2_33.anInt6751 <= local428) {
				@Pc(461) float local461 = (float) this.aClass200_Sub2_33.anInt6745 + local442 * (float) local251 / local428;
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) local255 * local414 / local428 + (float) this.aClass200_Sub2_33.anInt6729;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local479 > local247) {
					local247 = local479;
				}
				local239 = true;
				if (local245 > local479) {
					local245 = local479;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt5582 > this.aClass200_Sub2_33.anIntArray462.length) {
				this.aClass200_Sub2_33.anIntArray462 = new int[this.anInt5582];
				this.aClass200_Sub2_33.anIntArray464 = new int[this.anInt5582];
			}
			@Pc(554) int[] local554 = this.aClass200_Sub2_33.anIntArray462;
			@Pc(558) int[] local558 = this.aClass200_Sub2_33.anIntArray464;
			@Pc(642) int local642;
			for (@Pc(560) int local560 = 0; local560 < this.anInt5578; local560++) {
				local390 = this.anIntArray399[local560];
				local395 = this.anIntArray400[local560];
				local400 = this.anIntArray396[local560];
				local442 = local33 + Static354.aFloat142 * local395 + Static103.aFloat34 * local400 + Static390.aFloat150 * local390;
				local414 = local54 + Static419.aFloat174 * local400 + Static307.aFloat115 * local390 + local395 * Static253.aFloat102;
				local428 = Static8.aFloat5 * local395 + Static285.aFloat111 * local390 + local400 * Static183.aFloat71 + local75;
				@Pc(655) int local655;
				@Pc(660) int local660;
				@Pc(667) int local667;
				if (local428 >= (float) this.aClass200_Sub2_33.anInt6751) {
					local642 = (int) ((float) this.aClass200_Sub2_33.anInt6745 + local442 * (float) local251 / local428);
					local655 = (int) ((float) local255 * local414 / local428 + (float) this.aClass200_Sub2_33.anInt6729);
					local660 = this.anIntArray397[local560];
					local667 = this.anIntArray397[local560 + 1];
					for (@Pc(669) int local669 = local660; local669 < local667; local669++) {
						@Pc(678) int local678 = this.aShortArray97[local669] - 1;
						if (local678 == -1) {
							break;
						}
						local554[local678] = local642;
						local558[local678] = local655;
					}
				} else {
					local642 = this.anIntArray397[local560];
					local655 = this.anIntArray397[local560 + 1];
					for (local660 = local642; local660 < local655; local660++) {
						local667 = this.aShortArray97[local660] - 1;
						if (local667 == -1) {
							break;
						}
						local554[this.aShortArray97[local660] - 1] = -999999;
					}
				}
			}
			for (local642 = 0; local642 < this.anInt5557; local642++) {
				if (local554[this.aShortArray96[local642]] != -999999 && local554[this.aShortArray90[local642]] != -999999 && local554[this.aShortArray98[local642]] != -999999 && this.method4426(local558[this.aShortArray98[local642]], arg1, local554[this.aShortArray90[local642]], local558[this.aShortArray90[local642]], arg0, local558[this.aShortArray96[local642]], local554[this.aShortArray98[local642]], local554[this.aShortArray96[local642]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class30.anIntArray38[arg0];
		@Pc(13) int local13 = Class30.anIntArray37[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5578; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray399[local15] + local9 * this.anIntArray396[local15] >> 15;
			this.anIntArray396[local15] = this.anIntArray396[local15] * local13 - local9 * this.anIntArray399[local15] >> 15;
			this.anIntArray399[local15] = local33;
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
		this.aBoolean382 = false;
	}

	@OriginalMember(owner = "client!qo", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class30.anIntArray38[arg0];
		@Pc(13) int local13 = Class30.anIntArray37[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5578; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray396[local15] - this.anIntArray400[local15] * local9 >> 15;
			this.anIntArray400[local15] = this.anIntArray400[local15] * local13 + this.anIntArray396[local15] * local9 >> 15;
			this.anIntArray396[local15] = local34;
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
		this.aBoolean382 = false;
	}

	@OriginalMember(owner = "client!qo", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	@Override
	public Class5_Sub2_Sub1 EA(@OriginalArg(0) Class5_Sub2_Sub1 arg0) {
		if (this.anInt5582 == 0) {
			return null;
		}
		if (!this.aBoolean382) {
			this.method4435();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass200_Sub2_33.anInt6731 > 0) {
			local40 = this.aShort77 - (this.aShort76 * this.aClass200_Sub2_33.anInt6731 >> 8) >> this.aClass200_Sub2_33.anInt6721;
			local57 = this.aShort73 - (this.aShort72 * this.aClass200_Sub2_33.anInt6731 >> 8) >> this.aClass200_Sub2_33.anInt6721;
		} else {
			local40 = this.aShort77 - (this.aClass200_Sub2_33.anInt6731 * this.aShort72 >> 8) >> this.aClass200_Sub2_33.anInt6721;
			local57 = this.aShort73 - (this.aClass200_Sub2_33.anInt6731 * this.aShort76 >> 8) >> this.aClass200_Sub2_33.anInt6721;
		}
		@Pc(116) int local116;
		@Pc(132) int local132;
		if (this.aClass200_Sub2_33.anInt6737 <= 0) {
			local116 = this.aShort74 - (this.aShort72 * this.aClass200_Sub2_33.anInt6737 >> 8) >> this.aClass200_Sub2_33.anInt6721;
			local132 = this.aShort75 - (this.aClass200_Sub2_33.anInt6737 * this.aShort76 >> 8) >> this.aClass200_Sub2_33.anInt6721;
		} else {
			local116 = this.aShort74 - (this.aShort76 * this.aClass200_Sub2_33.anInt6737 >> 8) >> this.aClass200_Sub2_33.anInt6721;
			local132 = this.aShort75 - (this.aClass200_Sub2_33.anInt6737 * this.aShort72 >> 8) >> this.aClass200_Sub2_33.anInt6721;
		}
		@Pc(174) int local174 = local57 + 1 - local40;
		@Pc(181) int local181 = local132 + 1 - local116;
		@Pc(184) Class5_Sub2_Sub1_Sub1 local184 = (Class5_Sub2_Sub1_Sub1) arg0;
		@Pc(200) Class5_Sub2_Sub1_Sub1 local200;
		if (local184 != null && local184.method144(local174, local181)) {
			local200 = local184;
			local184.method150();
		} else {
			local200 = new Class5_Sub2_Sub1_Sub1(this.aClass200_Sub2_33, local174, local181);
		}
		local200.method147(local132, local57, local40, local116);
		this.method4437(local200);
		return local200;
	}

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class30.anIntArray38[arg0];
		@Pc(13) int local13 = Class30.anIntArray37[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5578; local15++) {
			local33 = this.anIntArray399[local15] * local13 + local9 * this.anIntArray400[local15] >> 15;
			this.anIntArray400[local15] = local13 * this.anIntArray400[local15] - this.anIntArray399[local15] * local9 >> 15;
			this.anIntArray399[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5582; local33++) {
			@Pc(87) int local87 = this.aShortArray91[local33] * local13 + local9 * this.aShortArray95[local33] >> 15;
			this.aShortArray95[local33] = (short) (local13 * this.aShortArray95[local33] - this.aShortArray91[local33] * local9 >> 15);
			this.aShortArray91[local33] = (short) local87;
		}
		if (this.aClass195_10 == null && this.aClass195_11 != null) {
			this.aClass195_11.anInterface12_3 = null;
		}
		if (this.aClass195_10 != null) {
			this.aClass195_10.anInterface12_3 = null;
		}
		this.aBoolean382 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "()V")
	@Override
	public void method6069() {
		if (this.anInt5582 <= 0 || this.anInt5576 <= 0) {
			return;
		}
		this.method4432(false);
		if ((this.aByte79 & 0x10) == 0 && this.aClass150_1.anInterface5_2 == null) {
			this.method4436(false);
		}
		this.method4428();
	}

	@OriginalMember(owner = "client!qo", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface12_3 = null;
		}
		this.aShort79 = (short) arg0;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
	private void method4438() {
		if (this.aClass17Array1 == null) {
			return;
		}
		@Pc(18) Class29_Sub1 local18 = this.aClass200_Sub2_33.aClass29_Sub1_2;
		@Pc(22) float local22 = this.aClass200_Sub2_33.aa();
		@Pc(26) float local26 = this.aClass200_Sub2_33.T();
		this.aClass200_Sub2_33.method5275();
		this.aClass200_Sub2_33.method5859(false);
		this.aClass200_Sub2_33.method5271(false);
		this.aClass200_Sub2_33.method5311(null, this.aClass200_Sub2_33.aClass195_13, null, this.aClass200_Sub2_33.aClass195_12);
		for (@Pc(53) int local53 = 0; local53 < this.anInt5565; local53++) {
			@Pc(60) Class17 local60 = this.aClass17Array1[local53];
			@Pc(65) Class32 local65 = this.aClass32Array1[local53];
			if (!local60.aBoolean45 || !this.aClass200_Sub2_33.method5839()) {
				@Pc(93) float local93 = (float) (this.anIntArray399[local60.anInt545] + this.anIntArray399[local60.anInt546] + this.anIntArray399[local60.anInt551]) * 0.3333333F;
				@Pc(115) float local115 = (float) (this.anIntArray396[local60.anInt545] + this.anIntArray396[local60.anInt546] + this.anIntArray396[local60.anInt551]) * 0.3333333F;
				@Pc(137) float local137 = (float) (this.anIntArray400[local60.anInt551] + this.anIntArray400[local60.anInt546] + this.anIntArray400[local60.anInt545]) * 0.3333333F;
				@Pc(151) float local151 = Static9.aFloat6 + local93 * Static390.aFloat150 + Static103.aFloat34 * local115 + Static354.aFloat142 * local137;
				@Pc(165) float local165 = Static303.aFloat114 + local93 * Static307.aFloat115 + local115 * Static419.aFloat174 + local137 * Static253.aFloat102;
				@Pc(179) float local179 = Static399.aFloat152 + Static8.aFloat5 * local137 + Static285.aFloat111 * local93 + local115 * Static183.aFloat71;
				local18.method1960(local151 + (float) local65.anInt887, local60.aShort9 * local65.anInt886 >> 7, (float) local65.anInt879 - local165, local60.aShort7 * local65.anInt878 >> 7, local65.anInt880, -local179);
				this.aClass200_Sub2_33.method5285(local18);
				this.aClass200_Sub2_33.da(local26, local22 - (float) local60.anInt553 * 1.5F);
				@Pc(230) int local230 = local65.anInt885;
				OpenGL.glColor4ub((byte) (local230 >> 16), (byte) (local230 >> 8), (byte) local230, (byte) (local230 >> 24));
				this.aClass200_Sub2_33.method5288(local60.aShort8);
				this.aClass200_Sub2_33.method5295(local60.aByte6);
				this.aClass200_Sub2_33.method5297(local60.aByte5);
				this.aClass200_Sub2_33.method5270(4);
			}
		}
		this.aClass200_Sub2_33.da(local26, local22);
		this.aClass200_Sub2_33.method5859(true);
		this.aClass200_Sub2_33.method5320();
	}

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "(SS)V")
	@Override
	public void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5557; local3++) {
			if (arg0 == this.aShortArray93[local3]) {
				this.aShortArray93[local3] = arg1;
			}
		}
		if (this.aClass17Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5565; local34++) {
				@Pc(41) Class17 local41 = this.aClass17Array1[local34];
				@Pc(46) Class32 local46 = this.aClass32Array1[local34];
				local46.anInt885 = Static219.anIntArray223[this.aShortArray93[local41.anInt550] & 0xFFFF] & 0xFFFFFF | local46.anInt885 & 0xFF000000;
			}
		}
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface12_3 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "KA", descriptor = "()V")
	@Override
	protected void KA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5539; local7++) {
			this.anIntArray399[local7] = this.anIntArray399[local7] + 7 >> 4;
			this.anIntArray396[local7] = this.anIntArray396[local7] + 7 >> 4;
			this.anIntArray400[local7] = this.anIntArray400[local7] + 7 >> 4;
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface12_3 = null;
		}
		this.aBoolean382 = false;
	}

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "(SS)V")
	@Override
	public void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass200_Sub2_33.anInterface8_134;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5557; local11++) {
			if (this.aShortArray92[local11] == arg0) {
				this.aShortArray92[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class178 local52 = local9.method4125(arg0 & 0xFFFF);
			local41 = local52.aByte52;
			local39 = local52.aByte53;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(73) Class178 local73 = local9.method4125(arg1 & 0xFFFF);
			local62 = local73.aByte52;
			local60 = local73.aByte53;
		}
		if (!(local39 != local60 | local62 != local41)) {
			return;
		}
		if (this.aClass17Array1 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.anInt5565; local106++) {
				@Pc(113) Class17 local113 = this.aClass17Array1[local106];
				@Pc(118) Class32 local118 = this.aClass32Array1[local106];
				local118.anInt885 = local118.anInt885 & 0xFF000000 | Static219.anIntArray223[this.aShortArray93[local113.anInt550] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface12_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method6063(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class57_Sub2 local8 = (Class57_Sub2) arg0;
		if (this.anInt5557 == 0 || local8.anInt5557 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5578;
		@Pc(27) int[] local27 = local8.anIntArray399;
		@Pc(30) int[] local30 = local8.anIntArray396;
		@Pc(33) int[] local33 = local8.anIntArray400;
		@Pc(36) short[] local36 = local8.aShortArray91;
		@Pc(39) short[] local39 = local8.aShortArray99;
		@Pc(42) short[] local42 = local8.aShortArray95;
		@Pc(45) byte[] local45 = local8.aByteArray70;
		@Pc(60) short[] local60;
		@Pc(52) short[] local52;
		@Pc(64) short[] local64;
		@Pc(56) byte[] local56;
		if (this.aClass184_1 == null) {
			local60 = null;
			local64 = null;
			local52 = null;
			local56 = null;
		} else {
			local52 = this.aClass184_1.aShortArray79;
			local56 = this.aClass184_1.aByteArray67;
			local60 = this.aClass184_1.aShortArray77;
			local64 = this.aClass184_1.aShortArray78;
		}
		@Pc(93) short[] local93;
		@Pc(89) short[] local89;
		@Pc(81) short[] local81;
		@Pc(85) byte[] local85;
		if (local8.aClass184_1 == null) {
			local81 = null;
			local89 = null;
			local93 = null;
			local85 = null;
		} else {
			local81 = local8.aClass184_1.aShortArray78;
			local85 = local8.aClass184_1.aByteArray67;
			local89 = local8.aClass184_1.aShortArray79;
			local93 = local8.aClass184_1.aShortArray77;
		}
		@Pc(106) int[] local106 = local8.anIntArray397;
		@Pc(109) short[] local109 = local8.aShortArray97;
		if (!local8.aBoolean382) {
			local8.method4435();
		}
		@Pc(118) short local118 = local8.aShort72;
		@Pc(121) short local121 = local8.aShort76;
		@Pc(124) short local124 = local8.aShort77;
		@Pc(127) short local127 = local8.aShort73;
		@Pc(130) short local130 = local8.aShort74;
		@Pc(133) short local133 = local8.aShort75;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5578; local135++) {
			@Pc(145) int local145 = this.anIntArray396[local135] - arg2;
			if (local145 >= local118 && local121 >= local145) {
				@Pc(161) int local161 = this.anIntArray399[local135] - arg1;
				if (local161 >= local124 && local127 >= local161) {
					@Pc(177) int local177 = this.anIntArray400[local135] - arg3;
					if (local177 >= local130 && local133 >= local177) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray397[local135];
						@Pc(203) int local203 = this.anIntArray397[local135 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray97[local205] - 1;
							if (local191 == -1 || this.aByteArray70[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(239) int local239 = 0; local239 < local24; local239++) {
								if (local27[local239] == local161 && local33[local239] == local177 && local145 == local30[local239]) {
									local196 = local106[local239];
									local203 = local106[local239 + 1];
									@Pc(272) int local272 = -1;
									for (@Pc(274) int local274 = local196; local274 < local203; local274++) {
										local272 = local109[local274] - 1;
										if (local272 == -1 || local45[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local60 == null) {
											this.aClass184_1 = new Class184();
											local60 = this.aClass184_1.aShortArray77 = Static2.method6027(this.aShortArray91);
											local52 = this.aClass184_1.aShortArray79 = Static2.method6027(this.aShortArray99);
											local64 = this.aClass184_1.aShortArray78 = Static2.method6027(this.aShortArray95);
											local56 = this.aClass184_1.aByteArray67 = Static216.method2866(this.aByteArray70);
										}
										if (local93 == null) {
											@Pc(354) Class184 local354 = local8.aClass184_1 = new Class184();
											local93 = local354.aShortArray77 = Static2.method6027(local36);
											local89 = local354.aShortArray79 = Static2.method6027(local39);
											local81 = local354.aShortArray78 = Static2.method6027(local42);
											local85 = local354.aByteArray67 = Static216.method2866(local45);
										}
										@Pc(387) short local387 = this.aShortArray91[local191];
										@Pc(392) short local392 = this.aShortArray99[local191];
										@Pc(397) short local397 = this.aShortArray95[local191];
										local203 = local106[local239 + 1];
										@Pc(408) byte local408 = this.aByteArray70[local191];
										local196 = local106[local239];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local196; local414 < local203; local414++) {
											local422 = local109[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local85[local422] != 0) {
												local93[local422] += local387;
												local89[local422] += local392;
												local81[local422] += local397;
												local85[local422] += local408;
											}
										}
										local397 = local42[local272];
										local387 = local36[local272];
										local196 = this.anIntArray397[local135];
										local408 = local45[local272];
										local203 = this.anIntArray397[local135 + 1];
										local392 = local39[local272];
										for (local422 = local196; local422 < local203; local422++) {
											@Pc(507) int local507 = this.aShortArray97[local422] - 1;
											if (local507 == -1) {
												break;
											}
											if (local56[local507] != 0) {
												local60[local507] += local387;
												local52[local507] += local392;
												local64[local507] += local397;
												local56[local507] += local408;
											}
										}
										if (this.aClass195_10 == null && this.aClass195_11 != null) {
											this.aClass195_11.anInterface12_3 = null;
										}
										if (this.aClass195_10 != null) {
											this.aClass195_10.anInterface12_3 = null;
										}
										if (local8.aClass195_10 == null && local8.aClass195_11 != null) {
											local8.aClass195_11.anInterface12_3 = null;
										}
										if (local8.aClass195_10 != null) {
											local8.aClass195_10.anInterface12_3 = null;
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

	@OriginalMember(owner = "client!qo", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt5541;
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "()Z")
	@Override
	protected boolean h() {
		if (this.anIntArrayArray51 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5539; local12++) {
			this.anIntArray399[local12] <<= 0x4;
			this.anIntArray396[local12] <<= 0x4;
			this.anIntArray400[local12] <<= 0x4;
		}
		Static351.anInt5753 = 0;
		Static308.anInt4795 = 0;
		Static6.anInt113 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()Z")
	@Override
	public boolean method6068() {
		if (this.aShortArray92 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray92.length; local12++) {
			if (this.aShortArray92[local12] != -1 && !this.aClass200_Sub2_33.anInterface8_134.method4123(this.aShortArray92[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "va", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local24 = 0;
			Static308.anInt4795 = 0;
			Static6.anInt113 = 0;
			Static351.anInt5753 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray51.length > local38) {
					local52 = this.anIntArrayArray51[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static351.anInt5753 += this.anIntArray399[local60];
						Static308.anInt4795 += this.anIntArray396[local60];
						Static6.anInt113 += this.anIntArray400[local60];
						local24++;
					}
				}
			}
			if (local24 > 0) {
				Static6.anInt113 = local18 + Static6.anInt113 / local24;
				Static351.anInt5753 = Static351.anInt5753 / local24 + local22;
				Static308.anInt4795 = Static308.anInt4795 / local24 + local14;
			} else {
				Static351.anInt5753 = local22;
				Static6.anInt113 = local18;
				Static308.anInt4795 = local14;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray51.length) {
					local166 = this.anIntArrayArray51[local32];
					for (local168 = 0; local168 < local166.length; local168++) {
						local54 = local166[local168];
						this.anIntArray399[local54] += local22;
						this.anIntArray396[local54] += local14;
						this.anIntArray400[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(307) int local307;
		@Pc(754) int local754;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray51.length) {
					local166 = this.anIntArrayArray51[local32];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local54 = local166[local168];
							this.anIntArray399[local54] -= Static351.anInt5753;
							this.anIntArray396[local54] -= Static308.anInt4795;
							this.anIntArray400[local54] -= Static6.anInt113;
							if (arg4 != 0) {
								local60 = Class30.anIntArray38[arg4];
								local288 = Class30.anIntArray37[arg4];
								local307 = this.anIntArray399[local54] * local288 + this.anIntArray396[local54] * local60 + 32767 >> 15;
								this.anIntArray396[local54] = this.anIntArray396[local54] * local288 + 32767 - this.anIntArray399[local54] * local60 >> 15;
								this.anIntArray399[local54] = local307;
							}
							if (arg2 != 0) {
								local60 = Class30.anIntArray38[arg2];
								local288 = Class30.anIntArray37[arg2];
								local307 = this.anIntArray396[local54] * local288 + 32767 - local60 * this.anIntArray400[local54] >> 15;
								this.anIntArray400[local54] = local60 * this.anIntArray396[local54] + this.anIntArray400[local54] * local288 + 32767 >> 15;
								this.anIntArray396[local54] = local307;
							}
							if (arg3 != 0) {
								local60 = Class30.anIntArray38[arg3];
								local288 = Class30.anIntArray37[arg3];
								local307 = this.anIntArray399[local54] * local288 + this.anIntArray400[local54] * local60 + 32767 >> 15;
								this.anIntArray400[local54] = local288 * this.anIntArray400[local54] + 32767 - this.anIntArray399[local54] * local60 >> 15;
								this.anIntArray399[local54] = local307;
							}
							this.anIntArray399[local54] += Static351.anInt5753;
							this.anIntArray396[local54] += Static308.anInt4795;
							this.anIntArray400[local54] += Static6.anInt113;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local54 = local166[local168];
							this.anIntArray399[local54] -= Static351.anInt5753;
							this.anIntArray396[local54] -= Static308.anInt4795;
							this.anIntArray400[local54] -= Static6.anInt113;
							if (arg2 != 0) {
								local60 = Class30.anIntArray38[arg2];
								local288 = Class30.anIntArray37[arg2];
								local307 = this.anIntArray396[local54] * local288 + 32767 - this.anIntArray400[local54] * local60 >> 15;
								this.anIntArray400[local54] = this.anIntArray396[local54] * local60 + this.anIntArray400[local54] * local288 + 32767 >> 15;
								this.anIntArray396[local54] = local307;
							}
							if (arg4 != 0) {
								local60 = Class30.anIntArray38[arg4];
								local288 = Class30.anIntArray37[arg4];
								local307 = this.anIntArray399[local54] * local288 + this.anIntArray396[local54] * local60 + 32767 >> 15;
								this.anIntArray396[local54] = this.anIntArray396[local54] * local288 + 32767 - this.anIntArray399[local54] * local60 >> 15;
								this.anIntArray399[local54] = local307;
							}
							if (arg3 != 0) {
								local60 = Class30.anIntArray38[arg3];
								local288 = Class30.anIntArray37[arg3];
								local307 = this.anIntArray399[local54] * local288 + local60 * this.anIntArray400[local54] + 32767 >> 15;
								this.anIntArray400[local54] = local288 * this.anIntArray400[local54] + 32767 - this.anIntArray399[local54] * local60 >> 15;
								this.anIntArray399[local54] = local307;
							}
							this.anIntArray399[local54] += Static351.anInt5753;
							this.anIntArray396[local54] += Static308.anInt4795;
							this.anIntArray400[local54] += Static6.anInt113;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray51.length) {
						local52 = this.anIntArrayArray51[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local288 = this.anIntArray397[local60];
							local307 = this.anIntArray397[local60 + 1];
							for (local754 = local288; local754 < local307; local754++) {
								@Pc(763) int local763 = this.aShortArray97[local754] - 1;
								if (local763 == -1) {
									break;
								}
								@Pc(775) int local775;
								@Pc(779) int local779;
								@Pc(797) int local797;
								if (arg4 != 0) {
									local775 = Class30.anIntArray38[arg4];
									local779 = Class30.anIntArray37[arg4];
									local797 = local775 * this.aShortArray99[local763] + this.aShortArray91[local763] * local779 + 32767 >> 15;
									this.aShortArray99[local763] = (short) (local779 * this.aShortArray99[local763] + 32767 - local775 * this.aShortArray91[local763] >> 15);
									this.aShortArray91[local763] = (short) local797;
								}
								if (arg2 != 0) {
									local775 = Class30.anIntArray38[arg2];
									local779 = Class30.anIntArray37[arg2];
									local797 = local779 * this.aShortArray99[local763] + 32767 - local775 * this.aShortArray95[local763] >> 15;
									this.aShortArray95[local763] = (short) (local779 * this.aShortArray95[local763] + this.aShortArray99[local763] * local775 + 32767 >> 15);
									this.aShortArray99[local763] = (short) local797;
								}
								if (arg3 != 0) {
									local775 = Class30.anIntArray38[arg3];
									local779 = Class30.anIntArray37[arg3];
									local797 = this.aShortArray91[local763] * local779 + local775 * this.aShortArray95[local763] + 32767 >> 15;
									this.aShortArray95[local763] = (short) (this.aShortArray95[local763] * local779 + 32767 - local775 * this.aShortArray91[local763] >> 15);
									this.aShortArray91[local763] = (short) local797;
								}
							}
						}
					}
				}
				if (this.aClass195_10 == null && this.aClass195_11 != null) {
					this.aClass195_11.anInterface12_3 = null;
				}
				if (this.aClass195_10 != null) {
					this.aClass195_10.anInterface12_3 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray51.length) {
					local166 = this.anIntArrayArray51[local32];
					for (local168 = 0; local168 < local166.length; local168++) {
						local54 = local166[local168];
						this.anIntArray399[local54] -= Static351.anInt5753;
						this.anIntArray396[local54] -= Static308.anInt4795;
						this.anIntArray400[local54] -= Static6.anInt113;
						this.anIntArray399[local54] = this.anIntArray399[local54] * arg2 >> 7;
						this.anIntArray396[local54] = this.anIntArray396[local54] * arg3 >> 7;
						this.anIntArray400[local54] = arg4 * this.anIntArray400[local54] >> 7;
						this.anIntArray399[local54] += Static351.anInt5753;
						this.anIntArray396[local54] += Static308.anInt4795;
						this.anIntArray400[local54] += Static6.anInt113;
					}
				}
			}
		} else {
			@Pc(1220) Class17 local1220;
			@Pc(1225) Class32 local1225;
			if (arg0 == 5) {
				if (this.anIntArrayArray49 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray49.length > local32) {
							local166 = this.anIntArrayArray49[local32];
							for (local168 = 0; local168 < local166.length; local168++) {
								local54 = local166[local168];
								local60 = arg2 * 8 + (this.aByteArray71[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray71[local54] = (byte) local60;
							}
							if (local166.length > 0 && this.aClass195_11 != null) {
								this.aClass195_11.anInterface12_3 = null;
							}
						}
					}
					if (this.aClass17Array1 != null) {
						for (local32 = 0; local32 < this.anInt5565; local32++) {
							local1220 = this.aClass17Array1[local32];
							local1225 = this.aClass32Array1[local32];
							local1225.anInt885 = local1225.anInt885 & 0xFFFFFF | 255 - (this.aByteArray71[local1220.anInt550] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1476) Class32 local1476;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray50.length > local32) {
								local166 = this.anIntArrayArray50[local32];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1476 = this.aClass32Array1[local166[local168]];
									local1476.anInt879 += arg3;
									local1476.anInt887 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray50.length > local32) {
								local166 = this.anIntArrayArray50[local32];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1476 = this.aClass32Array1[local166[local168]];
									local1476.anInt878 = arg2 * local1476.anInt878 >> 7;
									local1476.anInt886 = local1476.anInt886 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray50.length > local32) {
							local166 = this.anIntArrayArray50[local32];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1476 = this.aClass32Array1[local166[local168]];
								local1476.anInt880 = local1476.anInt880 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray49 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray49.length) {
						local166 = this.anIntArrayArray49[local32];
						for (local168 = 0; local168 < local166.length; local168++) {
							local54 = local166[local168];
							local60 = this.aShortArray93[local54] & 0xFFFF;
							local288 = local60 >> 10 & 0x3F;
							local307 = local60 >> 7 & 0x7;
							local307 += arg3 / 4;
							@Pc(1321) int local1321 = arg2 + local288 & 0x3F;
							local754 = local60 & 0x7F;
							local754 += arg4;
							if (local307 < 0) {
								local307 = 0;
							} else if (local307 > 7) {
								local307 = 7;
							}
							if (local754 < 0) {
								local754 = 0;
							} else if (local754 > 127) {
								local754 = 127;
							}
							this.aShortArray93[local54] = (short) (local754 | local307 << 7 | local1321 << 10);
						}
						if (local166.length > 0 && this.aClass195_11 != null) {
							this.aClass195_11.anInterface12_3 = null;
						}
					}
				}
				if (this.aClass17Array1 != null) {
					for (local32 = 0; local32 < this.anInt5565; local32++) {
						local1220 = this.aClass17Array1[local32];
						local1225 = this.aClass32Array1[local32];
						local1225.anInt885 = local1225.anInt885 & 0xFF000000 | Static219.anIntArray223[this.aShortArray93[local1220.anInt550] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean382) {
			this.method4435();
		}
		return this.aShort76;
	}

	@OriginalMember(owner = "client!qo", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		return this.aShort79;
	}

	@OriginalMember(owner = "client!qo", name = "aa", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static351.anInt5753 = 0;
			Static6.anInt113 = 0;
			local31 = 0;
			Static308.anInt4795 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray51.length > local41) {
					local55 = this.anIntArrayArray51[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray94 == null || (this.aShortArray94[local63] & arg6) != 0) {
							Static351.anInt5753 += this.anIntArray399[local63];
							Static308.anInt4795 += this.anIntArray396[local63];
							local31++;
							Static6.anInt113 += this.anIntArray400[local63];
						}
					}
				}
			}
			if (local31 <= 0) {
				Static351.anInt5753 = arg2;
				Static308.anInt4795 = arg3;
				Static6.anInt113 = arg4;
			} else {
				Static348.aBoolean388 = true;
				Static308.anInt4795 = arg3 + Static308.anInt4795 / local31;
				Static6.anInt113 = arg4 + Static6.anInt113 / local31;
				Static351.anInt5753 = Static351.anInt5753 / local31 + arg2;
			}
			return;
		}
		@Pc(259) int[] local259;
		@Pc(261) int local261;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg4 * arg7[2] + arg7[1] * arg3 + arg7[0] * arg2 + 16384 >> 15;
				local35 = arg7[5] * arg4 + arg3 * arg7[4] + arg2 * arg7[3] + 16384 >> 15;
				local41 = arg3 * arg7[7] + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local31;
				arg3 = local35;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray51.length > local35) {
					local259 = this.anIntArrayArray51[local35];
					for (local261 = 0; local261 < local259.length; local261++) {
						local57 = local259[local261];
						if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local57]) != 0) {
							this.anIntArray399[local57] += arg2;
							this.anIntArray396[local57] += arg3;
							this.anIntArray400[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(389) int local389;
		@Pc(407) int local407;
		@Pc(648) int local648;
		@Pc(657) int local657;
		@Pc(670) int local670;
		@Pc(674) int local674;
		@Pc(692) int local692;
		@Pc(1032) int local1032;
		@Pc(1040) int local1040;
		@Pc(1195) int local1195;
		@Pc(1220) int local1220;
		@Pc(1225) int local1225;
		@Pc(1235) int local1235;
		@Pc(1240) int local1240;
		@Pc(1244) int local1244;
		@Pc(1248) int local1248;
		@Pc(1250) int local1250;
		@Pc(1379) int[] local1379;
		@Pc(1381) int local1381;
		@Pc(1385) int local1385;
		@Pc(1389) int local1389;
		@Pc(1391) int local1391;
		@Pc(1517) int local1517;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray51.length) {
						local259 = this.anIntArrayArray51[local35];
						for (local261 = 0; local261 < local259.length; local261++) {
							local57 = local259[local261];
							if (this.aShortArray94 == null || (this.aShortArray94[local57] & arg6) != 0) {
								this.anIntArray399[local57] -= Static351.anInt5753;
								this.anIntArray396[local57] -= Static308.anInt4795;
								this.anIntArray400[local57] -= Static6.anInt113;
								if (arg4 != 0) {
									local63 = Class30.anIntArray38[arg4];
									local389 = Class30.anIntArray37[arg4];
									local407 = this.anIntArray399[local57] * local389 + local63 * this.anIntArray396[local57] + 32767 >> 15;
									this.anIntArray396[local57] = local389 * this.anIntArray396[local57] + 32767 - local63 * this.anIntArray399[local57] >> 15;
									this.anIntArray399[local57] = local407;
								}
								if (arg2 != 0) {
									local63 = Class30.anIntArray38[arg2];
									local389 = Class30.anIntArray37[arg2];
									local407 = local389 * this.anIntArray396[local57] + 32767 - local63 * this.anIntArray400[local57] >> 15;
									this.anIntArray400[local57] = this.anIntArray396[local57] * local63 + this.anIntArray400[local57] * local389 + 32767 >> 15;
									this.anIntArray396[local57] = local407;
								}
								if (arg3 != 0) {
									local63 = Class30.anIntArray38[arg3];
									local389 = Class30.anIntArray37[arg3];
									local407 = this.anIntArray399[local57] * local389 + local63 * this.anIntArray400[local57] + 32767 >> 15;
									this.anIntArray400[local57] = this.anIntArray400[local57] * local389 + 32767 - this.anIntArray399[local57] * local63 >> 15;
									this.anIntArray399[local57] = local407;
								}
								this.anIntArray399[local57] += Static351.anInt5753;
								this.anIntArray396[local57] += Static308.anInt4795;
								this.anIntArray400[local57] += Static6.anInt113;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray51.length > local41) {
							local55 = this.anIntArrayArray51[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray94 == null || (this.aShortArray94[local63] & arg6) != 0) {
									local389 = this.anIntArray397[local63];
									local407 = this.anIntArray397[local63 + 1];
									for (local648 = local389; local648 < local407; local648++) {
										local657 = this.aShortArray97[local648] - 1;
										if (local657 == -1) {
											break;
										}
										if (arg4 != 0) {
											local670 = Class30.anIntArray38[arg4];
											local674 = Class30.anIntArray37[arg4];
											local692 = local674 * this.aShortArray91[local657] + local670 * this.aShortArray99[local657] + 32767 >> 15;
											this.aShortArray99[local657] = (short) (local674 * this.aShortArray99[local657] + 32767 - this.aShortArray91[local657] * local670 >> 15);
											this.aShortArray91[local657] = (short) local692;
										}
										if (arg2 != 0) {
											local670 = Class30.anIntArray38[arg2];
											local674 = Class30.anIntArray37[arg2];
											local692 = local674 * this.aShortArray99[local657] + 32767 - this.aShortArray95[local657] * local670 >> 15;
											this.aShortArray95[local657] = (short) (local670 * this.aShortArray99[local657] + local674 * this.aShortArray95[local657] + 32767 >> 15);
											this.aShortArray99[local657] = (short) local692;
										}
										if (arg3 != 0) {
											local670 = Class30.anIntArray38[arg3];
											local674 = Class30.anIntArray37[arg3];
											local692 = this.aShortArray91[local657] * local674 + this.aShortArray95[local657] * local670 + 32767 >> 15;
											this.aShortArray95[local657] = (short) (this.aShortArray95[local657] * local674 + 32767 - this.aShortArray91[local657] * local670 >> 15);
											this.aShortArray91[local657] = (short) local692;
										}
									}
								}
							}
						}
					}
					if (this.aClass195_10 == null && this.aClass195_11 != null) {
						this.aClass195_11.anInterface12_3 = null;
					}
					if (this.aClass195_10 != null) {
						this.aClass195_10.anInterface12_3 = null;
						return;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local261 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static348.aBoolean388) {
					local389 = Static6.anInt113 * arg7[6] + Static308.anInt4795 * arg7[3] + Static351.anInt5753 * arg7[0] + 16384 >> 15;
					local407 = arg7[7] * Static6.anInt113 + arg7[4] * Static308.anInt4795 + Static351.anInt5753 * arg7[1] + 16384 >> 15;
					local389 += local261;
					local407 += local57;
					local648 = arg7[8] * Static6.anInt113 + Static351.anInt5753 * arg7[2] + arg7[5] * Static308.anInt4795 + 16384 >> 15;
					Static351.anInt5753 = local389;
					Static308.anInt4795 = local407;
					local648 += local63;
					Static348.aBoolean388 = false;
					Static6.anInt113 = local648;
				}
				@Pc(1000) int[] local1000 = new int[9];
				local407 = Class30.anIntArray37[arg2];
				local648 = Class30.anIntArray38[arg2];
				local657 = Class30.anIntArray37[arg3];
				local670 = Class30.anIntArray38[arg3];
				local674 = Class30.anIntArray37[arg4];
				local692 = Class30.anIntArray38[arg4];
				local1032 = local648 * local674 + 16384 >> 15;
				local1040 = local648 * local692 + 16384 >> 15;
				local1000[2] = local407 * local670 + 16384 >> 15;
				local1000[4] = local674 * local407 + 16384 >> 15;
				local1000[1] = -local657 * local692 + local670 * local1032 + 16384 >> 15;
				local1000[8] = local657 * local407 + 16384 >> 15;
				local1000[3] = local407 * local692 + 16384 >> 15;
				local1000[6] = local657 * local1040 + -local670 * local674 + 16384 >> 15;
				local1000[7] = local657 * local1032 + local670 * local692 + 16384 >> 15;
				local1000[5] = -local648;
				local1000[0] = local1040 * local670 + local674 * local657 + 16384 >> 15;
				@Pc(1170) int local1170 = local1000[2] * -Static6.anInt113 + -Static351.anInt5753 * local1000[0] + -Static308.anInt4795 * local1000[1] + 16384 >> 15;
				local1195 = local1000[5] * -Static6.anInt113 + local1000[4] * -Static308.anInt4795 + local1000[3] * -Static351.anInt5753 + 16384 >> 15;
				local1220 = local1000[7] * -Static308.anInt4795 + local1000[6] * -Static351.anInt5753 + -Static6.anInt113 * local1000[8] + 16384 >> 15;
				local1225 = local1170 + Static351.anInt5753;
				@Pc(1230) int local1230 = local1195 + Static308.anInt4795;
				local1235 = local1220 + Static6.anInt113;
				@Pc(1238) int[] local1238 = new int[9];
				for (local1240 = 0; local1240 < 3; local1240++) {
					for (local1244 = 0; local1244 < 3; local1244++) {
						local1248 = 0;
						for (local1250 = 0; local1250 < 3; local1250++) {
							local1248 += local1000[local1240 * 3 + local1250] * arg7[local1244 * 3 + local1250];
						}
						local1238[local1240 * 3 + local1244] = local1248 + 16384 >> 15;
					}
				}
				local1244 = local57 * local1000[1] + local261 * local1000[0] + local1000[2] * local63 + 16384 >> 15;
				local1248 = local57 * local1000[4] + local261 * local1000[3] + local1000[5] * local63 + 16384 >> 15;
				local1244 += local1225;
				local1250 = local1000[8] * local63 + local57 * local1000[7] + local1000[6] * local261 + 16384 >> 15;
				local1248 += local1230;
				local1250 += local1235;
				local1379 = new int[9];
				for (local1381 = 0; local1381 < 3; local1381++) {
					for (local1385 = 0; local1385 < 3; local1385++) {
						local1389 = 0;
						for (local1391 = 0; local1391 < 3; local1391++) {
							local1389 += local1238[local1391 * 3 + local1385] * arg7[local1381 * 3 + local1391];
						}
						local1379[local1385 + local1381 * 3] = local1389 + 16384 >> 15;
					}
				}
				local1385 = local1248 * arg7[1] + local1244 * arg7[0] + arg7[2] * local1250 + 16384 >> 15;
				local1389 = arg7[5] * local1250 + arg7[3] * local1244 + local1248 * arg7[4] + 16384 >> 15;
				local1391 = local1250 * arg7[8] + local1244 * arg7[6] + local1248 * arg7[7] + 16384 >> 15;
				local1385 += local31;
				local1389 += local35;
				local1391 += local41;
				for (local1517 = 0; local1517 < local8; local1517++) {
					@Pc(1523) int local1523 = arg1[local1517];
					if (this.anIntArrayArray51.length > local1523) {
						@Pc(1533) int[] local1533 = this.anIntArrayArray51[local1523];
						for (@Pc(1535) int local1535 = 0; local1535 < local1533.length; local1535++) {
							@Pc(1541) int local1541 = local1533[local1535];
							if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local1541]) != 0) {
								@Pc(1583) int local1583 = local1379[2] * this.anIntArray400[local1541] + local1379[0] * this.anIntArray399[local1541] + this.anIntArray396[local1541] * local1379[1] + 16384 >> 15;
								@Pc(1615) int local1615 = this.anIntArray399[local1541] * local1379[3] + local1379[4] * this.anIntArray396[local1541] + local1379[5] * this.anIntArray400[local1541] + 16384 >> 15;
								@Pc(1619) int local1619 = local1615 + local1389;
								@Pc(1651) int local1651 = local1379[7] * this.anIntArray396[local1541] + local1379[6] * this.anIntArray399[local1541] + this.anIntArray400[local1541] * local1379[8] + 16384 >> 15;
								@Pc(1655) int local1655 = local1583 + local1385;
								@Pc(1659) int local1659 = local1651 + local1391;
								this.anIntArray399[local1541] = local1655;
								this.anIntArray396[local1541] = local1619;
								this.anIntArray400[local1541] = local1659;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2590) Class17 local2590;
			@Pc(2595) Class32 local2595;
			if (arg0 == 5) {
				if (this.anIntArrayArray49 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray49.length > local35) {
							local259 = this.anIntArrayArray49[local35];
							for (local261 = 0; local261 < local259.length; local261++) {
								local57 = local259[local261];
								if (this.aShortArray89 == null || (this.aShortArray89[local57] & arg6) != 0) {
									local63 = (this.aByteArray71[local57] & 0xFF) + (arg2 * 8);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray71[local57] = (byte) local63;
									if (this.aClass195_11 != null) {
										this.aClass195_11.anInterface12_3 = null;
									}
								}
							}
						}
					}
					if (this.aClass17Array1 != null) {
						for (local35 = 0; local35 < this.anInt5565; local35++) {
							local2590 = this.aClass17Array1[local35];
							local2595 = this.aClass32Array1[local35];
							local2595.anInt885 = local2595.anInt885 & 0xFFFFFF | 255 - (this.aByteArray71[local2590.anInt550] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2847) Class32 local2847;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray50.length) {
								local259 = this.anIntArrayArray50[local35];
								for (local261 = 0; local261 < local259.length; local261++) {
									local2847 = this.aClass32Array1[local259[local261]];
									local2847.anInt887 += arg2;
									local2847.anInt879 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray50.length) {
								local259 = this.anIntArrayArray50[local35];
								for (local261 = 0; local261 < local259.length; local261++) {
									local2847 = this.aClass32Array1[local259[local261]];
									local2847.anInt886 = arg3 * local2847.anInt886 >> 7;
									local2847.anInt878 = arg2 * local2847.anInt878 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray50.length > local35) {
							local259 = this.anIntArrayArray50[local35];
							for (local261 = 0; local261 < local259.length; local261++) {
								local2847 = this.aClass32Array1[local259[local261]];
								local2847.anInt880 = arg2 + local2847.anInt880 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray49 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray49.length > local35) {
						local259 = this.anIntArrayArray49[local35];
						for (local261 = 0; local261 < local259.length; local261++) {
							local57 = local259[local261];
							if (this.aShortArray89 == null || (this.aShortArray89[local57] & arg6) != 0) {
								local63 = this.aShortArray93[local57] & 0xFFFF;
								local389 = local63 >> 10 & 0x3F;
								local407 = local63 >> 7 & 0x7;
								@Pc(2694) int local2694 = arg2 + local389 & 0x3F;
								local407 += arg3 / 4;
								local648 = local63 & 0x7F;
								local648 += arg4;
								if (local407 < 0) {
									local407 = 0;
								} else if (local407 > 7) {
									local407 = 7;
								}
								if (local648 < 0) {
									local648 = 0;
								} else if (local648 > 127) {
									local648 = 127;
								}
								this.aShortArray93[local57] = (short) (local648 | local2694 << 10 | local407 << 7);
								if (this.aClass195_11 != null) {
									this.aClass195_11.anInterface12_3 = null;
								}
							}
						}
					}
				}
				if (this.aClass17Array1 != null) {
					for (local35 = 0; local35 < this.anInt5565; local35++) {
						local2590 = this.aClass17Array1[local35];
						local2595 = this.aClass32Array1[local35];
						local2595.anInt885 = Static219.anIntArray223[this.aShortArray93[local2590.anInt550] & 0xFFFF] & 0xFFFFFF | local2595.anInt885 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray51.length) {
					local259 = this.anIntArrayArray51[local35];
					for (local261 = 0; local261 < local259.length; local261++) {
						local57 = local259[local261];
						if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local57]) != 0) {
							this.anIntArray399[local57] -= Static351.anInt5753;
							this.anIntArray396[local57] -= Static308.anInt4795;
							this.anIntArray400[local57] -= Static6.anInt113;
							this.anIntArray399[local57] = arg2 * this.anIntArray399[local57] >> 7;
							this.anIntArray396[local57] = arg3 * this.anIntArray396[local57] >> 7;
							this.anIntArray400[local57] = this.anIntArray400[local57] * arg4 >> 7;
							this.anIntArray399[local57] += Static351.anInt5753;
							this.anIntArray396[local57] += Static308.anInt4795;
							this.anIntArray400[local57] += Static6.anInt113;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local261 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static348.aBoolean388) {
				local389 = arg7[6] * Static6.anInt113 + arg7[0] * Static351.anInt5753 + Static308.anInt4795 * arg7[3] + 16384 >> 15;
				local407 = arg7[1] * Static351.anInt5753 + Static308.anInt4795 * arg7[4] + arg7[7] * Static6.anInt113 + 16384 >> 15;
				local389 += local261;
				local407 += local57;
				local648 = arg7[2] * Static351.anInt5753 + arg7[5] * Static308.anInt4795 + arg7[8] * Static6.anInt113 + 16384 >> 15;
				Static308.anInt4795 = local407;
				local648 += local63;
				Static351.anInt5753 = local389;
				Static6.anInt113 = local648;
				Static348.aBoolean388 = false;
			}
			local389 = arg2 << 15 >> 7;
			local407 = arg3 << 15 >> 7;
			local648 = arg4 << 15 >> 7;
			local657 = -Static351.anInt5753 * local389 + 16384 >> 15;
			local670 = -Static308.anInt4795 * local407 + 16384 >> 15;
			local674 = local648 * -Static6.anInt113 + 16384 >> 15;
			local692 = Static351.anInt5753 + local657;
			local1032 = local670 + Static308.anInt4795;
			local1040 = Static6.anInt113 + local674;
			@Pc(2025) int[] local2025 = new int[] { local389 * arg7[0] + 16384 >> 15, arg7[3] * local389 + 16384 >> 15, arg7[6] * local389 + 16384 >> 15, arg7[1] * local407 + 16384 >> 15, local407 * arg7[4] + 16384 >> 15, arg7[7] * local407 + 16384 >> 15, arg7[2] * local648 + 16384 >> 15, arg7[5] * local648 + 16384 >> 15, local648 * arg7[8] + 16384 >> 15 };
			local1195 = local261 * local389 + 16384 >> 15;
			local1220 = local407 * local57 + 16384 >> 15;
			local1225 = local648 * local63 + 16384 >> 15;
			@Pc(2161) int local2161 = local1195 + local692;
			@Pc(2165) int local2165 = local1220 + local1032;
			@Pc(2169) int local2169 = local1225 + local1040;
			@Pc(2172) int[] local2172 = new int[9];
			@Pc(2178) int local2178;
			for (local1235 = 0; local1235 < 3; local1235++) {
				for (local2178 = 0; local2178 < 3; local2178++) {
					local1240 = 0;
					for (local1244 = 0; local1244 < 3; local1244++) {
						local1240 += local2025[local2178 + local1244 * 3] * arg7[local1235 * 3 + local1244];
					}
					local2172[local1235 * 3 + local2178] = local1240 + 16384 >> 15;
				}
			}
			local2178 = arg7[1] * local2165 + arg7[0] * local2161 + arg7[2] * local2169 + 16384 >> 15;
			local1240 = arg7[5] * local2169 + arg7[4] * local2165 + arg7[3] * local2161 + 16384 >> 15;
			local2178 += local31;
			local1240 += local35;
			local1244 = local2169 * arg7[8] + arg7[6] * local2161 + local2165 * arg7[7] + 16384 >> 15;
			local1244 += local41;
			for (local1248 = 0; local1248 < local8; local1248++) {
				local1250 = arg1[local1248];
				if (local1250 < this.anIntArrayArray51.length) {
					local1379 = this.anIntArrayArray51[local1250];
					for (local1381 = 0; local1381 < local1379.length; local1381++) {
						local1385 = local1379[local1381];
						if (this.aShortArray94 == null || (this.aShortArray94[local1385] & arg6) != 0) {
							local1389 = this.anIntArray396[local1385] * local2172[1] + this.anIntArray399[local1385] * local2172[0] + local2172[2] * this.anIntArray400[local1385] + 16384 >> 15;
							local1391 = local2172[5] * this.anIntArray400[local1385] + this.anIntArray399[local1385] * local2172[3] + local2172[4] * this.anIntArray396[local1385] + 16384 >> 15;
							@Pc(2418) int local2418 = local1389 + local2178;
							@Pc(2422) int local2422 = local1391 + local1240;
							local1517 = local2172[8] * this.anIntArray400[local1385] + local2172[7] * this.anIntArray396[local1385] + this.anIntArray399[local1385] * local2172[6] + 16384 >> 15;
							this.anIntArray399[local1385] = local2418;
							@Pc(2462) int local2462 = local1517 + local1244;
							this.anIntArray396[local1385] = local2422;
							this.anIntArray400[local1385] = local2462;
						}
					}
				}
			}
		}
	}
}
