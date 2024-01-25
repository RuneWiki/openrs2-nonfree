import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "[Lclient!haa;")
	private Class128[] aClass128Array4;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "Lclient!bk;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
	private int[] anIntArray575;

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "[F")
	private float[] aFloatArray59;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "[Lclient!ds;")
	private Class76[] aClass76Array1;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!rh", name = "hb", descriptor = "[I")
	private int[] anIntArray576;

	@OriginalMember(owner = "client!rh", name = "pb", descriptor = "I")
	private int anInt8093;

	@OriginalMember(owner = "client!rh", name = "rb", descriptor = "[I")
	private int[] anIntArray577;

	@OriginalMember(owner = "client!rh", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!rh", name = "yb", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!rh", name = "Gb", descriptor = "[Lclient!vc;")
	private Class326[] aClass326Array1;

	@OriginalMember(owner = "client!rh", name = "Hb", descriptor = "Lclient!fm;")
	private Interface3 anInterface3_3;

	@OriginalMember(owner = "client!rh", name = "Ib", descriptor = "[F")
	private float[] aFloatArray60;

	@OriginalMember(owner = "client!rh", name = "Jb", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!rh", name = "Kb", descriptor = "Lclient!rl;")
	private Interface18 anInterface18_6;

	@OriginalMember(owner = "client!rh", name = "Lb", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!rh", name = "Mb", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!rh", name = "Qb", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!rh", name = "Sb", descriptor = "I")
	private int anInt8109;

	@OriginalMember(owner = "client!rh", name = "Ub", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!rh", name = "Vb", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!rh", name = "Xb", descriptor = "[Lclient!dg;")
	private Class69[] aClass69Array4;

	@OriginalMember(owner = "client!rh", name = "Zb", descriptor = "[I")
	private int[] anIntArray579;

	@OriginalMember(owner = "client!rh", name = "ac", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!rh", name = "bc", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!rh", name = "ec", descriptor = "I")
	private int anInt8115;

	@OriginalMember(owner = "client!rh", name = "fc", descriptor = "B")
	private byte aByte96;

	@OriginalMember(owner = "client!rh", name = "hc", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "Z")
	private boolean aBoolean596 = false;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
	private int anInt8074 = 0;

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "Z")
	private boolean aBoolean597 = true;

	@OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
	private int anInt8091 = 0;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	private int anInt8063 = 0;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	private int anInt8075 = 0;

	@OriginalMember(owner = "client!rh", name = "Fb", descriptor = "I")
	private int anInt8104 = 0;

	@OriginalMember(owner = "client!rh", name = "nb", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_33;

	@OriginalMember(owner = "client!rh", name = "fb", descriptor = "Lclient!jl;")
	private Class166 aClass166_11;

	@OriginalMember(owner = "client!rh", name = "lc", descriptor = "Lclient!jl;")
	private Class166 aClass166_13;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "Lclient!jl;")
	private Class166 aClass166_10;

	@OriginalMember(owner = "client!rh", name = "wb", descriptor = "Lclient!jl;")
	private Class166 aClass166_12;

	@OriginalMember(owner = "client!rh", name = "vb", descriptor = "Lclient!tp;")
	private Class304 aClass304_1;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class23_Sub2(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_33 = arg0;
		this.aClass166_11 = new Class166(null, 5126, 3, 0);
		this.aClass166_13 = new Class166(null, 5126, 2, 0);
		this.aClass166_10 = new Class166(null, 5126, 3, 0);
		this.aClass166_12 = new Class166(null, 5121, 4, 0);
		this.aClass304_1 = new Class304();
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ap;Lclient!qda;IIII)V")
	public Class23_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8093 = arg5;
		this.aClass9_Sub2_33 = arg0;
		this.anInt8115 = arg2;
		if (Static93.method2045(arg2, arg5)) {
			this.aClass166_11 = new Class166(null, 5126, 3, 0);
		}
		if (Static174.method3505(arg5, arg2)) {
			this.aClass166_13 = new Class166(null, 5126, 2, 0);
		}
		if (Static334.method5311(arg2, arg5)) {
			this.aClass166_10 = new Class166(null, 5126, 3, 0);
		}
		if (Static515.method7180(arg5, arg2)) {
			this.aClass166_12 = new Class166(null, 5121, 4, 0);
		}
		if (Static90.method2003(arg2, arg5)) {
			this.aClass304_1 = new Class304();
		}
		@Pc(102) Interface2 local102 = arg0.anInterface2_11;
		@Pc(106) int[] local106 = new int[arg1.anInt7710];
		this.anIntArray576 = new int[arg1.anInt7707 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt7710; local115++) {
			if ((arg1.aByteArray88 == null || arg1.aByteArray88[local115] != 2) && (arg1.aShortArray98 == null || arg1.aShortArray98[local115] == -1 || !local102.method3585(arg1.aShortArray98[local115] & 0xFFFF).aBoolean660)) {
				local106[this.anInt8063++] = local115;
				this.anIntArray576[arg1.aShortArray104[local115]]++;
				this.anIntArray576[arg1.aShortArray105[local115]]++;
				this.anIntArray576[arg1.aShortArray99[local115]]++;
			}
		}
		this.anInt8075 = this.anInt8063;
		@Pc(209) long[] local209 = new long[this.anInt8063];
		@Pc(218) boolean local218 = (this.anInt8115 & 0x100) != 0;
		@Pc(230) int local230;
		@Pc(241) int local241;
		@Pc(370) int local370;
		label495: for (@Pc(220) int local220 = 0; local220 < this.anInt8063; local220++) {
			@Pc(226) int local226 = local106[local220];
			@Pc(228) Class296 local228 = null;
			local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			@Pc(236) byte local236 = 0;
			if (arg1.aClass346Array1 != null) {
				for (local241 = 0; local241 < arg1.aClass346Array1.length; local241++) {
					@Pc(248) Class346 local248 = arg1.aClass346Array1[local241];
					if (local248.anInt9613 == local226) {
						@Pc(261) Class235 local261 = Static139.method2602(local248.anInt9616);
						if (local261.aBoolean518) {
							local209[local220] = Long.MAX_VALUE;
							this.anInt8075--;
							continue label495;
						}
					}
				}
			}
			@Pc(284) short local284 = -1;
			if (arg1.aShortArray98 != null) {
				local284 = arg1.aShortArray98[local226];
				if (local284 != -1) {
					local228 = local102.method3585(local284 & 0xFFFF);
					local236 = local228.aByte102;
					local234 = local228.aByte104;
				}
			}
			@Pc(332) boolean local332 = arg1.aByteArray93 != null && arg1.aByteArray93[local226] != 0 || local228 != null && local228.aBoolean659 | !local228.aBoolean652;
			if ((local218 || local332) && arg1.aByteArray87 != null) {
				local230 += arg1.aByteArray87[local226] << 17;
			}
			if (local332) {
				local230 += 65536;
			}
			local230 += (local234 & 0xFF) << 8;
			local370 = local232 + ((local284 & 0xFFFF) << 16);
			local230 += local236 & 0xFF;
			@Pc(382) int local382 = local370 + (local220 & 0xFFFF);
			local209[local220] = ((long) local230 << 32) + (long) local382;
		}
		Static275.method4585(local209, local106);
		this.aShortArray114 = arg1.aShortArray103;
		this.anInt8091 = arg1.anInt7712;
		this.anInt8074 = arg1.anInt7707;
		this.anIntArray578 = arg1.anIntArray550;
		this.anIntArray575 = arg1.anIntArray548;
		this.anIntArray577 = arg1.anIntArray542;
		this.aClass69Array4 = arg1.aClass69Array3;
		@Pc(433) Class257[] local433 = new Class257[this.anInt8074];
		this.aClass128Array4 = arg1.aClass128Array3;
		@Pc(457) int local457;
		@Pc(471) int local471;
		if (arg1.aClass346Array1 != null) {
			this.anInt8109 = arg1.aClass346Array1.length;
			this.aClass326Array1 = new Class326[this.anInt8109];
			this.aClass76Array1 = new Class76[this.anInt8109];
			for (local457 = 0; local457 < this.anInt8109; local457++) {
				@Pc(464) Class346 local464 = arg1.aClass346Array1[local457];
				@Pc(469) Class235 local469 = Static139.method2602(local464.anInt9616);
				local471 = -1;
				for (@Pc(473) int local473 = 0; local473 < this.anInt8063; local473++) {
					if (local106[local473] == local464.anInt9613) {
						local471 = local473;
						break;
					}
				}
				if (local471 == -1) {
					throw new RuntimeException();
				}
				local241 = Static223.anIntArray301[arg1.aShortArray102[local464.anInt9613] & 0xFFFF] & 0xFFFFFF;
				local241 |= 255 - (arg1.aByteArray93 == null ? 0 : arg1.aByteArray93[local464.anInt9613]) << 24;
				this.aClass76Array1[local457] = new Class76(local471, arg1.aShortArray104[local464.anInt9613], arg1.aShortArray105[local464.anInt9613], arg1.aShortArray99[local464.anInt9613], local469.anInt6927, local469.anInt6932, local469.anInt6930, local469.anInt6928, local469.anInt6929, local469.aBoolean518, local469.aBoolean517, local464.anInt9620);
				this.aClass326Array1[local457] = new Class326(local241);
			}
		}
		local457 = this.anInt8063 * 3;
		this.aShortArray116 = new short[local457];
		Static152.aLongArray3 = new long[local457];
		if (arg1.aShortArray96 != null) {
			this.aShortArray112 = new short[this.anInt8063];
		}
		this.aShortArray118 = new short[this.anInt8063];
		this.aShortArray109 = new short[local457];
		this.aShort89 = (short) arg3;
		this.aShort90 = (short) arg4;
		this.aShortArray110 = new short[this.anInt8063];
		this.aShortArray108 = new short[this.anInt8063];
		this.aByteArray96 = new byte[local457];
		this.aShortArray115 = new short[this.anInt8063];
		this.aShortArray117 = new short[this.anInt8063];
		this.aFloatArray59 = new float[local457];
		this.aFloatArray60 = new float[local457];
		this.aByteArray97 = new byte[this.anInt8063];
		this.aShortArray111 = new short[local457];
		this.aShortArray113 = new short[local457];
		local230 = 0;
		for (local370 = 0; local370 < arg1.anInt7707; local370++) {
			local471 = this.anIntArray576[local370];
			this.anIntArray576[local370] = local230;
			local433[local370] = new Class257();
			local230 += local471;
		}
		this.anIntArray576[arg1.anInt7707] = local230;
		@Pc(709) int[] local709 = null;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) float[][] local715 = null;
		@Pc(741) int local741;
		@Pc(786) int local786;
		@Pc(792) int local792;
		@Pc(805) int local805;
		@Pc(807) int local807;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(1004) float local1004;
		@Pc(996) float local996;
		@Pc(1012) float local1012;
		if (arg1.aByteArray92 != null) {
			@Pc(721) int local721 = arg1.anInt7702;
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
			local713 = new int[local721];
			local709 = new int[local721];
			local715 = new float[local721][];
			for (local786 = 0; local786 < this.anInt8063; local786++) {
				local792 = local106[local786];
				if (arg1.aByteArray92[local792] != -1) {
					local805 = arg1.aByteArray92[local792] & 0xFF;
					for (local807 = 0; local807 < 3; local807++) {
						@Pc(824) short local824;
						if (local807 == 0) {
							local824 = arg1.aShortArray104[local792];
						} else if (local807 == 1) {
							local824 = arg1.aShortArray105[local792];
						} else {
							local824 = arg1.aShortArray99[local792];
						}
						local843 = arg1.anIntArray550[local824];
						local848 = arg1.anIntArray548[local824];
						@Pc(853) int local853 = arg1.anIntArray542[local824];
						if (local843 < local724[local805]) {
							local724[local805] = local843;
						}
						if (local843 > local727[local805]) {
							local727[local805] = local843;
						}
						if (local848 < local730[local805]) {
							local730[local805] = local848;
						}
						if (local733[local805] < local848) {
							local733[local805] = local848;
						}
						if (local853 < local736[local805]) {
							local736[local805] = local853;
						}
						if (local739[local805] < local853) {
							local739[local805] = local853;
						}
					}
				}
			}
			local711 = new int[local721];
			for (local792 = 0; local792 < local721; local792++) {
				@Pc(940) byte local940 = arg1.aByteArray91[local792];
				if (local940 > 0) {
					local709[local792] = (local727[local792] + local724[local792]) / 2;
					local711[local792] = (local733[local792] + local730[local792]) / 2;
					local713[local792] = (local739[local792] + local736[local792]) / 2;
					if (local940 == 1) {
						local848 = arg1.anIntArray544[local792];
						local996 = 64.0F / (float) arg1.anIntArray543[local792];
						if (local848 == 0) {
							local1012 = 1.0F;
							local1004 = 1.0F;
						} else if (local848 <= 0) {
							local1012 = 1.0F;
							local1004 = (float) -local848 / 1024.0F;
						} else {
							local1004 = 1.0F;
							local1012 = (float) local848 / 1024.0F;
						}
					} else if (local940 == 2) {
						local996 = 64.0F / (float) arg1.anIntArray543[local792];
						local1012 = 64.0F / (float) arg1.anIntArray551[local792];
						local1004 = 64.0F / (float) arg1.anIntArray544[local792];
					} else {
						local996 = (float) arg1.anIntArray543[local792] / 1024.0F;
						local1004 = (float) arg1.anIntArray544[local792] / 1024.0F;
						local1012 = (float) arg1.anIntArray551[local792] / 1024.0F;
					}
					local715[local792] = Static63.method1337(local1004, arg1.aShortArray101[local792], arg1.aShortArray97[local792], local1012, arg1.aByteArray90[local792] & 0xFF, arg1.aShortArray100[local792], local996);
				}
			}
		}
		@Pc(1121) Class154[] local1121 = new Class154[arg1.anInt7710];
		@Pc(1140) short local1140;
		@Pc(1151) int local1151;
		@Pc(1161) int local1161;
		@Pc(1223) int local1223;
		for (@Pc(1123) int local1123 = 0; local1123 < arg1.anInt7710; local1123++) {
			@Pc(1130) short local1130 = arg1.aShortArray104[local1123];
			@Pc(1135) short local1135 = arg1.aShortArray105[local1123];
			local1140 = arg1.aShortArray99[local1123];
			local1151 = this.anIntArray578[local1135] - this.anIntArray578[local1130];
			local1161 = this.anIntArray575[local1135] - this.anIntArray575[local1130];
			local741 = this.anIntArray577[local1135] - this.anIntArray577[local1130];
			local786 = this.anIntArray578[local1140] - this.anIntArray578[local1130];
			local792 = this.anIntArray575[local1140] - this.anIntArray575[local1130];
			local805 = this.anIntArray577[local1140] - this.anIntArray577[local1130];
			local807 = local1161 * local805 - local792 * local741;
			local1223 = local786 * local741 - local805 * local1151;
			local843 = local1151 * local792 - local1161 * local786;
			while (local807 > 8192 || local1223 > 8192 || local843 > 8192 || local807 < -8192 || local1223 < -8192 || local843 < -8192) {
				local1223 >>= 0x1;
				local843 >>= 0x1;
				local807 >>= 0x1;
			}
			local848 = (int) Math.sqrt((double) (local1223 * local1223 + local807 * local807 + local843 * local843));
			if (local848 <= 0) {
				local848 = 1;
			}
			local807 = local807 * 256 / local848;
			local1223 = local1223 * 256 / local848;
			local843 = local843 * 256 / local848;
			@Pc(1321) byte local1321 = arg1.aByteArray88 == null ? 0 : arg1.aByteArray88[local1123];
			if (local1321 == 0) {
				@Pc(1330) Class257 local1330 = local433[local1130];
				local1330.anInt7593 += local843;
				local1330.anInt7590++;
				local1330.anInt7591 += local807;
				local1330.anInt7589 += local1223;
				@Pc(1358) Class257 local1358 = local433[local1135];
				local1358.anInt7591 += local807;
				local1358.anInt7589 += local1223;
				local1358.anInt7593 += local843;
				local1358.anInt7590++;
				@Pc(1386) Class257 local1386 = local433[local1140];
				local1386.anInt7591 += local807;
				local1386.anInt7593 += local843;
				local1386.anInt7589 += local1223;
				local1386.anInt7590++;
			} else if (local1321 == 1) {
				@Pc(1423) Class154 local1423 = local1121[local1123] = new Class154();
				local1423.anInt4714 = local1223;
				local1423.anInt4717 = local807;
				local1423.anInt4716 = local843;
			}
		}
		@Pc(1445) int local1445;
		for (@Pc(1439) int local1439 = 0; local1439 < this.anInt8063; local1439++) {
			local1445 = local106[local1439];
			@Pc(1452) int local1452 = arg1.aShortArray102[local1445] & 0xFFFF;
			@Pc(1457) short local1457;
			if (arg1.aShortArray98 == null) {
				local1457 = -1;
			} else {
				local1457 = arg1.aShortArray98[local1445];
			}
			if (arg1.aByteArray92 == null) {
				local1161 = -1;
			} else {
				local1161 = arg1.aByteArray92[local1445];
			}
			if (arg1.aByteArray93 == null) {
				local741 = 0;
			} else {
				local741 = arg1.aByteArray93[local1445] & 0xFF;
			}
			@Pc(1492) float local1492 = 0.0F;
			@Pc(1494) float local1494 = 0.0F;
			@Pc(1496) float local1496 = 0.0F;
			local1004 = 0.0F;
			local996 = 0.0F;
			local1012 = 0.0F;
			@Pc(1504) byte local1504 = 0;
			@Pc(1506) byte local1506 = 0;
			@Pc(1508) int local1508 = 0;
			@Pc(1523) byte local1523;
			@Pc(1543) short local1543;
			@Pc(1548) short local1548;
			@Pc(1553) short local1553;
			if (local1457 != -1) {
				if (local1161 == -1) {
					local1496 = 1.0F;
					local1012 = 0.0F;
					local996 = 0.0F;
					local1506 = 2;
					local1494 = 1.0F;
					local1492 = 0.0F;
					local1504 = 1;
					local1004 = 1.0F;
				} else {
					local1161 &= 0xFF;
					local1523 = arg1.aByteArray91[local1161];
					@Pc(1533) short local1533;
					@Pc(1538) short local1538;
					@Pc(1576) float local1576;
					@Pc(1585) float local1585;
					@Pc(1593) float local1593;
					@Pc(1679) float local1679;
					@Pc(1687) float local1687;
					@Pc(1696) float local1696;
					@Pc(1705) float local1705;
					@Pc(1713) float local1713;
					@Pc(1721) float local1721;
					if (local1523 == 0) {
						local1533 = arg1.aShortArray104[local1445];
						local1538 = arg1.aShortArray105[local1445];
						local1543 = arg1.aShortArray99[local1445];
						local1548 = arg1.aShortArray100[local1161];
						local1553 = arg1.aShortArray101[local1161];
						@Pc(1558) short local1558 = arg1.aShortArray97[local1161];
						@Pc(1564) float local1564 = (float) arg1.anIntArray550[local1548];
						@Pc(1570) float local1570 = (float) arg1.anIntArray548[local1548];
						local1576 = arg1.anIntArray542[local1548];
						local1585 = (float) arg1.anIntArray550[local1553] - local1564;
						local1593 = (float) arg1.anIntArray548[local1553] - local1570;
						@Pc(1601) float local1601 = (float) arg1.anIntArray542[local1553] - local1576;
						@Pc(1610) float local1610 = (float) arg1.anIntArray550[local1558] - local1564;
						@Pc(1618) float local1618 = (float) arg1.anIntArray548[local1558] - local1570;
						@Pc(1626) float local1626 = (float) arg1.anIntArray542[local1558] - local1576;
						@Pc(1635) float local1635 = (float) arg1.anIntArray550[local1533] - local1564;
						@Pc(1643) float local1643 = (float) arg1.anIntArray548[local1533] - local1570;
						@Pc(1652) float local1652 = (float) arg1.anIntArray542[local1533] - local1576;
						@Pc(1661) float local1661 = (float) arg1.anIntArray550[local1538] - local1564;
						@Pc(1670) float local1670 = (float) arg1.anIntArray548[local1538] - local1570;
						local1679 = (float) arg1.anIntArray542[local1538] - local1576;
						local1687 = (float) arg1.anIntArray550[local1543] - local1564;
						local1696 = (float) arg1.anIntArray548[local1543] - local1570;
						local1705 = (float) arg1.anIntArray542[local1543] - local1576;
						local1713 = local1626 * local1593 - local1618 * local1601;
						local1721 = local1601 * local1610 - local1626 * local1585;
						@Pc(1729) float local1729 = local1618 * local1585 - local1593 * local1610;
						@Pc(1737) float local1737 = local1729 * local1618 - local1626 * local1721;
						@Pc(1746) float local1746 = local1713 * local1626 - local1729 * local1610;
						@Pc(1755) float local1755 = local1721 * local1610 - local1618 * local1713;
						@Pc(1769) float local1769 = 1.0F / (local1593 * local1746 + local1585 * local1737 + local1601 * local1755);
						local1496 = local1769 * (local1661 * local1737 + local1670 * local1746 + local1755 * local1679);
						local1492 = (local1755 * local1652 + local1643 * local1746 + local1635 * local1737) * local1769;
						local996 = (local1705 * local1755 + local1687 * local1737 + local1696 * local1746) * local1769;
						@Pc(1820) float local1820 = local1585 * local1721 - local1593 * local1713;
						@Pc(1829) float local1829 = local1593 * local1729 - local1601 * local1721;
						@Pc(1838) float local1838 = local1713 * local1601 - local1729 * local1585;
						@Pc(1852) float local1852 = 1.0F / (local1626 * local1820 + local1610 * local1829 + local1838 * local1618);
						local1012 = local1852 * (local1829 * local1687 + local1696 * local1838 + local1820 * local1705);
						local1004 = (local1820 * local1679 + local1829 * local1661 + local1670 * local1838) * local1852;
						local1494 = (local1652 * local1820 + local1643 * local1838 + local1635 * local1829) * local1852;
					} else {
						local1533 = arg1.aShortArray104[local1445];
						local1538 = arg1.aShortArray105[local1445];
						local1543 = arg1.aShortArray99[local1445];
						@Pc(1915) int local1915 = local709[local1161];
						@Pc(1919) int local1919 = local711[local1161];
						@Pc(1923) int local1923 = local713[local1161];
						@Pc(1927) float[] local1927 = local715[local1161];
						@Pc(1932) byte local1932 = arg1.aByteArray89[local1161];
						local1576 = (float) arg1.anIntArray547[local1161] / 256.0F;
						if (local1523 == 1) {
							local1585 = (float) arg1.anIntArray551[local1161] / 1024.0F;
							Static471.method7247(local1919, local1915, local1576, arg1.anIntArray542[local1533], arg1.anIntArray550[local1533], arg1.anIntArray548[local1533], local1923, local1927, local1585, local1932);
							local1492 = Static262.aFloat118;
							local1494 = Static22.aFloat36;
							Static471.method7247(local1919, local1915, local1576, arg1.anIntArray542[local1538], arg1.anIntArray550[local1538], arg1.anIntArray548[local1538], local1923, local1927, local1585, local1932);
							local1004 = Static22.aFloat36;
							local1496 = Static262.aFloat118;
							Static471.method7247(local1919, local1915, local1576, arg1.anIntArray542[local1543], arg1.anIntArray550[local1543], arg1.anIntArray548[local1543], local1923, local1927, local1585, local1932);
							local1012 = Static22.aFloat36;
							local996 = Static262.aFloat118;
							local1593 = local1585 / 2.0F;
							if ((local1932 & 0x1) == 0) {
								if (local996 - local1492 > local1593) {
									local1506 = 1;
									local996 -= local1585;
								} else if (local1593 < local1492 - local996) {
									local996 += local1585;
									local1506 = 2;
								}
								if (local1496 - local1492 > local1593) {
									local1504 = 1;
									local1496 -= local1585;
								} else if (local1492 - local1496 > local1593) {
									local1496 += local1585;
									local1504 = 2;
								}
							} else {
								if (local1012 - local1494 > local1593) {
									local1012 -= local1585;
									local1506 = 1;
								} else if (local1593 < local1494 - local1012) {
									local1012 += local1585;
									local1506 = 2;
								}
								if (local1004 - local1494 > local1593) {
									local1004 -= local1585;
									local1504 = 1;
								} else if (local1494 - local1004 > local1593) {
									local1504 = 2;
									local1004 += local1585;
								}
							}
						} else if (local1523 == 2) {
							local1585 = (float) arg1.anIntArray552[local1161] / 256.0F;
							local1593 = (float) arg1.anIntArray549[local1161] / 256.0F;
							@Pc(1972) int local1972 = arg1.anIntArray550[local1538] - arg1.anIntArray550[local1533];
							@Pc(1983) int local1983 = arg1.anIntArray548[local1538] - arg1.anIntArray548[local1533];
							@Pc(1994) int local1994 = arg1.anIntArray542[local1538] - arg1.anIntArray542[local1533];
							@Pc(2005) int local2005 = arg1.anIntArray550[local1543] - arg1.anIntArray550[local1533];
							@Pc(2016) int local2016 = arg1.anIntArray548[local1543] - arg1.anIntArray548[local1533];
							@Pc(2026) int local2026 = arg1.anIntArray542[local1543] - arg1.anIntArray542[local1533];
							@Pc(2035) int local2035 = local1983 * local2026 - local1994 * local2016;
							@Pc(2044) int local2044 = local2005 * local1994 - local1972 * local2026;
							@Pc(2053) int local2053 = local1972 * local2016 - local2005 * local1983;
							local1679 = 64.0F / (float) arg1.anIntArray544[local1161];
							local1687 = 64.0F / (float) arg1.anIntArray543[local1161];
							local1696 = 64.0F / (float) arg1.anIntArray551[local1161];
							local1705 = (local1927[1] * (float) local2044 + local1927[0] * (float) local2035 + local1927[2] * (float) local2053) / local1679;
							local1713 = (local1927[5] * (float) local2053 + local1927[4] * (float) local2044 + local1927[3] * (float) local2035) / local1687;
							local1721 = ((float) local2044 * local1927[7] + (float) local2035 * local1927[6] + local1927[8] * (float) local2053) / local1696;
							local1508 = Static36.method1079(local1713, local1705, local1721);
							Static331.method8154(local1593, arg1.anIntArray550[local1533], local1932, arg1.anIntArray542[local1533], arg1.anIntArray548[local1533], local1585, local1919, local1508, local1576, local1927, local1915, local1923);
							local1494 = Static406.aFloat204;
							local1492 = Static514.aFloat190;
							Static331.method8154(local1593, arg1.anIntArray550[local1538], local1932, arg1.anIntArray542[local1538], arg1.anIntArray548[local1538], local1585, local1919, local1508, local1576, local1927, local1915, local1923);
							local1004 = Static406.aFloat204;
							local1496 = Static514.aFloat190;
							Static331.method8154(local1593, arg1.anIntArray550[local1543], local1932, arg1.anIntArray542[local1543], arg1.anIntArray548[local1543], local1585, local1919, local1508, local1576, local1927, local1915, local1923);
							local1012 = Static406.aFloat204;
							local996 = Static514.aFloat190;
						} else if (local1523 == 3) {
							Static338.method5333(local1576, local1923, local1919, arg1.anIntArray548[local1533], local1915, arg1.anIntArray550[local1533], local1927, arg1.anIntArray542[local1533], local1932);
							local1494 = Static227.aFloat105;
							local1492 = Static141.aFloat51;
							Static338.method5333(local1576, local1923, local1919, arg1.anIntArray548[local1538], local1915, arg1.anIntArray550[local1538], local1927, arg1.anIntArray542[local1538], local1932);
							local1004 = Static227.aFloat105;
							local1496 = Static141.aFloat51;
							Static338.method5333(local1576, local1923, local1919, arg1.anIntArray548[local1543], local1915, arg1.anIntArray550[local1543], local1927, arg1.anIntArray542[local1543], local1932);
							local996 = Static141.aFloat51;
							local1012 = Static227.aFloat105;
							if ((local1932 & 0x1) == 0) {
								if (local996 - local1492 > 0.5F) {
									local996--;
									local1506 = 1;
								} else if (local1492 - local996 > 0.5F) {
									local996++;
									local1506 = 2;
								}
								if (local1496 - local1492 > 0.5F) {
									local1496--;
									local1504 = 1;
								} else if (local1492 - local1496 > 0.5F) {
									local1496++;
									local1504 = 2;
								}
							} else {
								if (local1012 - local1494 > 0.5F) {
									local1012--;
									local1506 = 1;
								} else if (local1494 - local1012 > 0.5F) {
									local1506 = 2;
									local1012++;
								}
								if (local1004 - local1494 > 0.5F) {
									local1504 = 1;
									local1004--;
								} else if (local1494 - local1004 > 0.5F) {
									local1504 = 2;
									local1004++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray88 == null) {
				local1523 = 0;
			} else {
				local1523 = arg1.aByteArray88[local1445];
			}
			if (local1523 == 0) {
				@Pc(2810) long local2810 = (long) (local1161 << 2) + ((long) (local1508 << 24) + (long) (local1452 << 8) + (long) local741 << 32);
				local1543 = arg1.aShortArray104[local1445];
				local1548 = arg1.aShortArray105[local1445];
				local1553 = arg1.aShortArray99[local1445];
				@Pc(2829) Class257 local2829 = local433[local1543];
				this.aShortArray117[local1439] = this.method6762(local2829.anInt7590, arg1, local1543, local2810, local1492, local2829.anInt7589, local2829.anInt7593, local2829.anInt7591, local1494);
				@Pc(2853) Class257 local2853 = local433[local1548];
				this.aShortArray118[local1439] = this.method6762(local2853.anInt7590, arg1, local1548, local2810 + (long) local1504, local1496, local2853.anInt7589, local2853.anInt7593, local2853.anInt7591, local1004);
				@Pc(2880) Class257 local2880 = local433[local1553];
				this.aShortArray108[local1439] = this.method6762(local2880.anInt7590, arg1, local1553, (long) local1506 + local2810, local996, local2880.anInt7589, local2880.anInt7593, local2880.anInt7591, local1012);
			} else if (local1523 == 1) {
				@Pc(2670) Class154 local2670 = local1121[local1445];
				@Pc(2713) long local2713 = (long) ((local2670.anInt4714 + 256 << 12) + ((local1161 << 2) - (-(local2670.anInt4717 <= 0 ? 2048 : 1024) - (local2670.anInt4716 + 256 << 22)))) + ((long) local741 + (long) (local1508 << 24) + (long) (local1452 << 8) << 32);
				this.aShortArray117[local1439] = this.method6762(0, arg1, arg1.aShortArray104[local1445], local2713, local1492, local2670.anInt4714, local2670.anInt4716, local2670.anInt4717, local1494);
				this.aShortArray118[local1439] = this.method6762(0, arg1, arg1.aShortArray105[local1445], (long) local1504 + local2713, local1496, local2670.anInt4714, local2670.anInt4716, local2670.anInt4717, local1004);
				this.aShortArray108[local1439] = this.method6762(0, arg1, arg1.aShortArray99[local1445], local2713 + (long) local1506, local996, local2670.anInt4714, local2670.anInt4716, local2670.anInt4717, local1012);
			}
			if (arg1.aShortArray98 == null) {
				this.aShortArray110[local1439] = -1;
			} else {
				this.aShortArray110[local1439] = arg1.aShortArray98[local1445];
			}
			if (arg1.aByteArray93 != null) {
				this.aByteArray97[local1439] = arg1.aByteArray93[local1445];
			}
			if (arg1.aShortArray96 != null) {
				this.aShortArray112[local1439] = arg1.aShortArray96[local1445];
			}
			this.aShortArray115[local1439] = arg1.aShortArray102[local1445];
		}
		local1445 = 0;
		local1140 = -10000;
		for (local1151 = 0; local1151 < this.anInt8075; local1151++) {
			@Pc(2973) short local2973 = this.aShortArray110[local1151];
			if (local2973 != local1140) {
				local1445++;
				local1140 = local2973;
			}
		}
		this.anIntArray579 = new int[local1445 + 1];
		local1445 = 0;
		local1140 = -10000;
		for (local1161 = 0; local1161 < this.anInt8075; local1161++) {
			@Pc(3003) short local3003 = this.aShortArray110[local1161];
			if (local1140 != local3003) {
				local1140 = local3003;
				this.anIntArray579[local1445++] = local1161;
			}
		}
		this.anIntArray579[local1445] = this.anInt8075;
		Static152.aLongArray3 = null;
		this.aShortArray109 = Static421.method6533(this.aShortArray109, this.anInt8104);
		this.aShortArray116 = Static421.method6533(this.aShortArray116, this.anInt8104);
		this.aShortArray111 = Static421.method6533(this.aShortArray111, this.anInt8104);
		this.aByteArray96 = Static324.method5243(this.aByteArray96, this.anInt8104);
		this.aFloatArray60 = Static323.method5220(this.anInt8104, this.aFloatArray60);
		this.aFloatArray59 = Static323.method5220(this.anInt8104, this.aFloatArray59);
		if (arg1.anIntArray546 != null && Static278.method4603(this.anInt8093, arg2)) {
			this.anIntArrayArray51 = arg1.method6437(false);
		}
		if (arg1.aClass346Array1 != null && Static267.method4538(arg2, this.anInt8093)) {
			this.anIntArrayArray50 = arg1.method6438();
		}
		if (arg1.anIntArray545 != null && Static290.method4774(arg2, this.anInt8093)) {
			local741 = 0;
			@Pc(3122) int[] local3122 = new int[256];
			for (local792 = 0; local792 < this.anInt8063; local792++) {
				local805 = arg1.anIntArray545[local106[local792]];
				if (local805 >= 0) {
					if (local741 < local805) {
						local741 = local805;
					}
					@Pc(3148) int local3148 = local3122[local805]++;
				}
			}
			this.anIntArrayArray52 = new int[local741 + 1][];
			for (local805 = 0; local805 <= local741; local805++) {
				this.anIntArrayArray52[local805] = new int[local3122[local805]];
				local3122[local805] = 0;
			}
			for (local807 = 0; local807 < this.anInt8063; local807++) {
				local1223 = arg1.anIntArray545[local106[local807]];
				if (local1223 >= 0) {
					this.anIntArrayArray52[local1223][local3122[local1223]++] = local807;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8091; local3++) {
			this.anIntArray578[local3] = this.anIntArray578[local3] + 7 >> 4;
			this.anIntArray575[local3] = this.anIntArray575[local3] + 7 >> 4;
			this.anIntArray577[local3] = this.anIntArray577[local3] + 7 >> 4;
		}
		this.aBoolean596 = false;
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!q;Lclient!mr;I)V")
	@Override
	public void method7077(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class5_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8104 == 0) {
			return;
		}
		@Pc(16) Class8_Sub2 local16 = this.aClass9_Sub2_33.aClass8_Sub2_3;
		if (!this.aBoolean596) {
			this.method6766();
		}
		@Pc(25) Class8_Sub2 local25 = (Class8_Sub2) arg0;
		Static64.aFloat42 = local16.aFloat161 * local25.aFloat163 + local16.aFloat168 * local25.aFloat159 + local16.aFloat169 * local25.aFloat168;
		Static150.aFloat172 = local25.aFloat160 * local16.aFloat169 + local16.aFloat161 * local25.aFloat164 + local25.aFloat162 * local16.aFloat168 + local16.aFloat160;
		@Pc(72) float local72 = (float) this.aShort85 * Static64.aFloat42 + Static150.aFloat172;
		@Pc(80) float local80 = (float) this.aShort88 * Static64.aFloat42 + Static150.aFloat172;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local96 = local80 - (float) this.aShort92;
			local90 = (float) this.aShort92 + local72;
		} else {
			local90 = local80 + (float) this.aShort92;
			local96 = local72 - (float) this.aShort92;
		}
		if (local96 >= this.aClass9_Sub2_33.aFloat17 || (float) this.aClass9_Sub2_33.anInt828 >= local90) {
			return;
		}
		Static394.aFloat173 = local16.aFloat165 * local25.aFloat168 + local16.aFloat163 * local25.aFloat159 + local25.aFloat163 * local16.aFloat166;
		Static350.aFloat124 = local16.aFloat164 + local25.aFloat162 * local16.aFloat163 + local25.aFloat164 * local16.aFloat166 + local16.aFloat165 * local25.aFloat160;
		@Pc(172) float local172 = (float) this.aShort85 * Static394.aFloat173 + Static350.aFloat124;
		@Pc(180) float local180 = Static350.aFloat124 + (float) this.aShort88 * Static394.aFloat173;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local172 > local180) {
			local195 = (local180 - (float) this.aShort92) * (float) this.aClass9_Sub2_33.anInt837;
			local206 = (local172 + (float) this.aShort92) * (float) this.aClass9_Sub2_33.anInt837;
		} else {
			local195 = (float) this.aClass9_Sub2_33.anInt837 * ((float) -this.aShort92 + local172);
			local206 = (local180 + (float) this.aShort92) * (float) this.aClass9_Sub2_33.anInt837;
		}
		if (local195 / local90 >= this.aClass9_Sub2_33.aFloat16 || local206 / local90 <= this.aClass9_Sub2_33.aFloat13) {
			return;
		}
		Static240.aFloat119 = local16.aFloat162 + local16.aFloat159 * local25.aFloat162 + local16.aFloat158 * local25.aFloat164 + local25.aFloat160 * local16.aFloat167;
		Static40.aFloat37 = local16.aFloat158 * local25.aFloat163 + local16.aFloat159 * local25.aFloat159 + local16.aFloat167 * local25.aFloat168;
		@Pc(296) float local296 = Static40.aFloat37 * (float) this.aShort85 + Static240.aFloat119;
		@Pc(304) float local304 = Static240.aFloat119 + (float) this.aShort88 * Static40.aFloat37;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local304 < local296) {
			local320 = (float) this.aClass9_Sub2_33.anInt841 * ((float) -this.aShort92 + local304);
			local331 = ((float) this.aShort92 + local296) * (float) this.aClass9_Sub2_33.anInt841;
		} else {
			local331 = (float) this.aClass9_Sub2_33.anInt841 * ((float) this.aShort92 + local304);
			local320 = (float) this.aClass9_Sub2_33.anInt841 * ((float) -this.aShort92 + local296);
		}
		if (this.aClass9_Sub2_33.aFloat20 <= local320 / local90 || this.aClass9_Sub2_33.aFloat21 >= local331 / local90) {
			return;
		}
		if (arg1 != null || this.aClass76Array1 != null) {
			Static143.aFloat52 = local16.aFloat163 * local25.aFloat167 + local16.aFloat166 * local25.aFloat165 + local16.aFloat165 * local25.aFloat169;
			Static486.aFloat186 = local16.aFloat169 * local25.aFloat169 + local25.aFloat165 * local16.aFloat161 + local25.aFloat167 * local16.aFloat168;
			Static510.aFloat151 = local25.aFloat169 * local16.aFloat167 + local25.aFloat165 * local16.aFloat158 + local25.aFloat167 * local16.aFloat159;
			Static187.aFloat94 = local16.aFloat168 * local25.aFloat158 + local16.aFloat161 * local25.aFloat166 + local25.aFloat161 * local16.aFloat169;
			Static230.aFloat106 = local16.aFloat159 * local25.aFloat158 + local16.aFloat158 * local25.aFloat166 + local16.aFloat167 * local25.aFloat161;
			Static175.aFloat93 = local16.aFloat166 * local25.aFloat166 + local25.aFloat158 * local16.aFloat163 + local25.aFloat161 * local16.aFloat165;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort93 + this.aShort86 >> 1;
			@Pc(509) int local509 = this.aShort87 + this.aShort91 >> 1;
			@Pc(528) int local528 = (int) (Static143.aFloat52 * (float) local509 + (float) this.aShort85 * Static394.aFloat173 + Static175.aFloat93 * (float) local501 + Static350.aFloat124);
			@Pc(547) int local547 = (int) (Static230.aFloat106 * (float) local501 + Static240.aFloat119 + (float) this.aShort85 * Static40.aFloat37 + Static510.aFloat151 * (float) local509);
			@Pc(566) int local566 = (int) (Static486.aFloat186 * (float) local509 + Static150.aFloat172 + (float) local501 * Static187.aFloat94 + Static64.aFloat42 * (float) this.aShort85);
			if (this.aClass9_Sub2_33.anInt828 > local566) {
				local491 = true;
			} else {
				arg1.anInt6177 = this.aClass9_Sub2_33.anInt851 + this.aClass9_Sub2_33.anInt841 * local547 / local566;
				arg1.anInt6180 = local528 * this.aClass9_Sub2_33.anInt837 / local566 + this.aClass9_Sub2_33.anInt829;
			}
			@Pc(620) int local620 = (int) (Static394.aFloat173 * (float) this.aShort88 + (float) local501 * Static175.aFloat93 + Static350.aFloat124 + Static143.aFloat52 * (float) local509);
			@Pc(639) int local639 = (int) ((float) local509 * Static510.aFloat151 + Static40.aFloat37 * (float) this.aShort88 + Static240.aFloat119 + (float) local501 * Static230.aFloat106);
			@Pc(658) int local658 = (int) (Static150.aFloat172 + (float) local501 * Static187.aFloat94 + (float) this.aShort88 * Static64.aFloat42 + (float) local509 * Static486.aFloat186);
			if (local658 >= this.aClass9_Sub2_33.anInt828) {
				arg1.anInt6178 = this.aClass9_Sub2_33.anInt829 + this.aClass9_Sub2_33.anInt837 * local620 / local658;
				arg1.anInt6179 = this.aClass9_Sub2_33.anInt841 * local639 / local658 + this.aClass9_Sub2_33.anInt851;
			} else {
				local491 = true;
			}
			if (local491) {
				if (this.aClass9_Sub2_33.anInt828 > local566 && this.aClass9_Sub2_33.anInt828 > local658) {
					local493 = false;
				} else {
					@Pc(732) int local732;
					@Pc(743) int local743;
					@Pc(754) int local754;
					if (this.aClass9_Sub2_33.anInt828 > local566) {
						local732 = (local658 - this.aClass9_Sub2_33.anInt828 << 16) / (local658 - local566);
						local743 = ((local620 - local528) * local732 >> 16) + local620;
						local754 = ((local639 - local547) * local732 >> 16) + local639;
						arg1.anInt6180 = this.aClass9_Sub2_33.anInt837 * local743 / this.aClass9_Sub2_33.anInt828 + this.aClass9_Sub2_33.anInt829;
						arg1.anInt6177 = this.aClass9_Sub2_33.anInt851 + this.aClass9_Sub2_33.anInt841 * local754 / this.aClass9_Sub2_33.anInt828;
					} else if (this.aClass9_Sub2_33.anInt828 > local658) {
						local732 = (local566 - this.aClass9_Sub2_33.anInt828 << 16) / (local566 - local658);
						local743 = local528 + ((local528 - local620) * local732 >> 16);
						arg1.anInt6180 = local743 * this.aClass9_Sub2_33.anInt837 / this.aClass9_Sub2_33.anInt828 + this.aClass9_Sub2_33.anInt829;
						local754 = local547 + ((local547 - local639) * local732 >> 16);
						arg1.anInt6177 = this.aClass9_Sub2_33.anInt851 + local754 * this.aClass9_Sub2_33.anInt841 / this.aClass9_Sub2_33.anInt828;
					}
				}
			}
			if (local493) {
				if (local566 <= local658) {
					arg1.anInt6181 = this.aClass9_Sub2_33.anInt829 + (local620 + this.aShort92) * this.aClass9_Sub2_33.anInt837 / local658 - arg1.anInt6178;
				} else {
					arg1.anInt6181 = this.aClass9_Sub2_33.anInt837 * (local528 + this.aShort92) / local566 + this.aClass9_Sub2_33.anInt829 - arg1.anInt6180;
				}
				arg1.aBoolean456 = true;
			}
		}
		this.aClass9_Sub2_33.method791();
		this.aClass9_Sub2_33.method809(local25);
		this.method6759();
		this.aClass9_Sub2_33.method783();
		this.method6764();
	}

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray51 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8091; local12++) {
			this.anIntArray578[local12] <<= 0x4;
			this.anIntArray575[local12] <<= 0x4;
			this.anIntArray577[local12] <<= 0x4;
		}
		Static20.anInt6004 = 0;
		Static552.anInt8650 = 0;
		Static556.anInt9486 = 0;
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7072(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class23_Sub2 local8 = (Class23_Sub2) arg0;
		if (this.anInt8063 == 0 || local8.anInt8063 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt8074;
		@Pc(27) int[] local27 = local8.anIntArray578;
		@Pc(30) int[] local30 = local8.anIntArray575;
		@Pc(33) int[] local33 = local8.anIntArray577;
		@Pc(36) short[] local36 = local8.aShortArray109;
		@Pc(39) short[] local39 = local8.aShortArray116;
		@Pc(42) short[] local42 = local8.aShortArray111;
		@Pc(45) byte[] local45 = local8.aByteArray96;
		@Pc(54) short[] local54;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(50) byte[] local50;
		if (this.aClass35_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass35_1.aShortArray15;
			local50 = this.aClass35_1.aByteArray24;
			local54 = this.aClass35_1.aShortArray14;
			local56 = this.aClass35_1.aShortArray16;
		}
		@Pc(89) short[] local89;
		@Pc(85) short[] local85;
		@Pc(93) short[] local93;
		@Pc(81) byte[] local81;
		if (local8.aClass35_1 == null) {
			local81 = null;
			local93 = null;
			local89 = null;
			local85 = null;
		} else {
			local81 = local8.aClass35_1.aByteArray24;
			local85 = local8.aClass35_1.aShortArray16;
			local89 = local8.aClass35_1.aShortArray14;
			local93 = local8.aClass35_1.aShortArray15;
		}
		@Pc(106) int[] local106 = local8.anIntArray576;
		@Pc(109) short[] local109 = local8.aShortArray113;
		if (!local8.aBoolean596) {
			local8.method6766();
		}
		@Pc(118) short local118 = local8.aShort85;
		@Pc(121) short local121 = local8.aShort88;
		@Pc(124) short local124 = local8.aShort86;
		@Pc(127) short local127 = local8.aShort93;
		@Pc(130) short local130 = local8.aShort91;
		@Pc(133) short local133 = local8.aShort87;
		for (@Pc(135) int local135 = 0; local135 < this.anInt8074; local135++) {
			@Pc(145) int local145 = this.anIntArray575[local135] - arg2;
			if (local145 >= local118 && local121 >= local145) {
				@Pc(168) int local168 = this.anIntArray578[local135] - arg1;
				if (local124 <= local168 && local127 >= local168) {
					@Pc(188) int local188 = this.anIntArray577[local135] - arg3;
					if (local130 <= local188 && local188 <= local133) {
						@Pc(198) int local198 = -1;
						@Pc(203) int local203 = this.anIntArray576[local135];
						@Pc(210) int local210 = this.anIntArray576[local135 + 1];
						for (@Pc(212) int local212 = local203; local212 < local210; local212++) {
							local198 = this.aShortArray113[local212] - 1;
							if (local198 == -1 || this.aByteArray96[local198] != 0) {
								break;
							}
						}
						if (local198 != -1) {
							for (@Pc(246) int local246 = 0; local246 < local24; local246++) {
								if (local27[local246] == local168 && local33[local246] == local188 && local145 == local30[local246]) {
									@Pc(269) int local269 = -1;
									local210 = local106[local246 + 1];
									local203 = local106[local246];
									for (@Pc(281) int local281 = local203; local281 < local210; local281++) {
										local269 = local109[local281] - 1;
										if (local269 == -1 || local45[local269] != 0) {
											break;
										}
									}
									if (local269 != -1) {
										if (local54 == null) {
											this.aClass35_1 = new Class35();
											local54 = this.aClass35_1.aShortArray14 = Static460.method7135(this.aShortArray109);
											local56 = this.aClass35_1.aShortArray16 = Static460.method7135(this.aShortArray116);
											local52 = this.aClass35_1.aShortArray15 = Static460.method7135(this.aShortArray111);
											local50 = this.aClass35_1.aByteArray24 = Static352.method5720(this.aByteArray96);
										}
										if (local89 == null) {
											@Pc(366) Class35 local366 = local8.aClass35_1 = new Class35();
											local89 = local366.aShortArray14 = Static460.method7135(local36);
											local85 = local366.aShortArray16 = Static460.method7135(local39);
											local93 = local366.aShortArray15 = Static460.method7135(local42);
											local81 = local366.aByteArray24 = Static352.method5720(local45);
										}
										@Pc(399) short local399 = this.aShortArray109[local198];
										@Pc(404) short local404 = this.aShortArray116[local198];
										@Pc(409) short local409 = this.aShortArray111[local198];
										local203 = local106[local246];
										local210 = local106[local246 + 1];
										@Pc(424) byte local424 = this.aByteArray96[local198];
										@Pc(434) int local434;
										for (@Pc(426) int local426 = local203; local426 < local210; local426++) {
											local434 = local109[local426] - 1;
											if (local434 == -1) {
												break;
											}
											if (local81[local434] != 0) {
												local89[local434] += local399;
												local85[local434] += local404;
												local93[local434] += local409;
												local81[local434] += local424;
											}
										}
										local409 = local42[local269];
										local404 = local39[local269];
										local210 = this.anIntArray576[local135 + 1];
										local203 = this.anIntArray576[local135];
										local424 = local45[local269];
										local399 = local36[local269];
										for (local434 = local203; local434 < local210; local434++) {
											@Pc(519) int local519 = this.aShortArray113[local434] - 1;
											if (local519 == -1) {
												break;
											}
											if (local50[local519] != 0) {
												local54[local519] += local399;
												local56[local519] += local404;
												local52[local519] += local409;
												local50[local519] += local424;
											}
										}
										if (this.aClass166_10 == null && this.aClass166_12 != null) {
											this.aClass166_12.anInterface18_3 = null;
										}
										if (this.aClass166_10 != null) {
											this.aClass166_10.anInterface18_3 = null;
										}
										if (local8.aClass166_10 == null && local8.aClass166_12 != null) {
											local8.aClass166_12.anInterface18_3 = null;
										}
										if (local8.aClass166_10 != null) {
											local8.aClass166_10.anInterface18_3 = null;
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

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!caa;)V")
	private void method6757(@OriginalArg(1) Class6_Sub4_Sub2_Sub1 arg0) {
		if (this.anInt8104 > this.aClass9_Sub2_33.anIntArray52.length) {
			this.aClass9_Sub2_33.anIntArray52 = new int[this.anInt8104];
			this.aClass9_Sub2_33.anIntArray50 = new int[this.anInt8104];
		}
		@Pc(28) int[] local28 = this.aClass9_Sub2_33.anIntArray52;
		@Pc(32) int[] local32 = this.aClass9_Sub2_33.anIntArray50;
		@Pc(61) int local61;
		@Pc(99) int local99;
		@Pc(108) int local108;
		for (@Pc(34) int local34 = 0; local34 < this.anInt8074; local34++) {
			local61 = (this.anIntArray578[local34] - (this.anIntArray575[local34] * this.aClass9_Sub2_33.anInt848 >> 8) >> this.aClass9_Sub2_33.anInt811) - arg0.anInt1438;
			@Pc(85) int local85 = (this.anIntArray577[local34] - (this.anIntArray575[local34] * this.aClass9_Sub2_33.anInt842 >> 8) >> this.aClass9_Sub2_33.anInt811) - arg0.anInt1437;
			@Pc(90) int local90 = this.anIntArray576[local34];
			@Pc(97) int local97 = this.anIntArray576[local34 + 1];
			for (local99 = local90; local99 < local97; local99++) {
				local108 = this.aShortArray113[local99] - 1;
				if (local108 == -1) {
					break;
				}
				local28[local108] = local61;
				local32[local108] = local85;
			}
		}
		for (local61 = 0; local61 < this.anInt8075; local61++) {
			if (this.aByteArray97 == null || this.aByteArray97[local61] <= 128) {
				@Pc(148) short local148 = this.aShortArray117[local61];
				@Pc(153) short local153 = this.aShortArray118[local61];
				@Pc(158) short local158 = this.aShortArray108[local61];
				local99 = local28[local148];
				local108 = local28[local153];
				@Pc(170) int local170 = local28[local158];
				@Pc(174) int local174 = local32[local148];
				@Pc(178) int local178 = local32[local153];
				@Pc(182) int local182 = local32[local158];
				if (-((local178 - local174) * (local170 - local108)) + (local178 - local182) * (local99 + -local108) > 0) {
					arg0.method1260(local178, local108, local99, local174, local170, local182);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!q;Lclient!mr;II)V")
	@Override
	public void method7075(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class5_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8104 == 0) {
			return;
		}
		@Pc(13) Class8_Sub2 local13 = this.aClass9_Sub2_33.aClass8_Sub2_3;
		if (!this.aBoolean596) {
			this.method6766();
		}
		@Pc(22) Class8_Sub2 local22 = (Class8_Sub2) arg0;
		Static64.aFloat42 = local13.aFloat169 * local22.aFloat168 + local13.aFloat168 * local22.aFloat159 + local22.aFloat163 * local13.aFloat161;
		Static150.aFloat172 = local13.aFloat161 * local22.aFloat164 + local13.aFloat168 * local22.aFloat162 + local22.aFloat160 * local13.aFloat169 + local13.aFloat160;
		@Pc(69) float local69 = Static150.aFloat172 + Static64.aFloat42 * (float) this.aShort85;
		@Pc(77) float local77 = (float) this.aShort88 * Static64.aFloat42 + Static150.aFloat172;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = (float) this.aShort92 + local69;
			local94 = (float) -this.aShort92 + local77;
		} else {
			local87 = local77 + (float) this.aShort92;
			local94 = (float) -this.aShort92 + local69;
		}
		if (this.aClass9_Sub2_33.aFloat24 <= local94 || local87 <= (float) this.aClass9_Sub2_33.anInt828) {
			return;
		}
		Static350.aFloat124 = local13.aFloat164 + local22.aFloat164 * local13.aFloat166 + local13.aFloat163 * local22.aFloat162 + local22.aFloat160 * local13.aFloat165;
		Static394.aFloat173 = local13.aFloat165 * local22.aFloat168 + local22.aFloat159 * local13.aFloat163 + local22.aFloat163 * local13.aFloat166;
		@Pc(171) float local171 = (float) this.aShort85 * Static394.aFloat173 + Static350.aFloat124;
		@Pc(179) float local179 = (float) this.aShort88 * Static394.aFloat173 + Static350.aFloat124;
		@Pc(205) float local205;
		@Pc(194) float local194;
		if (local171 > local179) {
			local194 = ((float) this.aShort92 + local171) * (float) this.aClass9_Sub2_33.anInt837;
			local205 = (float) this.aClass9_Sub2_33.anInt837 * (local179 - (float) this.aShort92);
		} else {
			local194 = (float) this.aClass9_Sub2_33.anInt837 * (local179 + (float) this.aShort92);
			local205 = ((float) -this.aShort92 + local171) * (float) this.aClass9_Sub2_33.anInt837;
		}
		if (this.aClass9_Sub2_33.aFloat16 <= local205 / (float) arg2 || this.aClass9_Sub2_33.aFloat13 >= local194 / (float) arg2) {
			return;
		}
		Static40.aFloat37 = local13.aFloat167 * local22.aFloat168 + local13.aFloat159 * local22.aFloat159 + local22.aFloat163 * local13.aFloat158;
		Static240.aFloat119 = local13.aFloat167 * local22.aFloat160 + local22.aFloat164 * local13.aFloat158 + local22.aFloat162 * local13.aFloat159 + local13.aFloat162;
		@Pc(297) float local297 = (float) this.aShort85 * Static40.aFloat37 + Static240.aFloat119;
		@Pc(305) float local305 = Static40.aFloat37 * (float) this.aShort88 + Static240.aFloat119;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local320 = (float) this.aClass9_Sub2_33.anInt841 * (local305 - (float) this.aShort92);
			local331 = (float) this.aClass9_Sub2_33.anInt841 * ((float) this.aShort92 + local297);
		} else {
			local320 = (float) this.aClass9_Sub2_33.anInt841 * (local297 - (float) this.aShort92);
			local331 = ((float) this.aShort92 + local305) * (float) this.aClass9_Sub2_33.anInt841;
		}
		if (local320 / (float) arg2 >= this.aClass9_Sub2_33.aFloat20 || this.aClass9_Sub2_33.aFloat21 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass76Array1 != null) {
			Static486.aFloat186 = local22.aFloat169 * local13.aFloat169 + local22.aFloat165 * local13.aFloat161 + local22.aFloat167 * local13.aFloat168;
			Static143.aFloat52 = local13.aFloat165 * local22.aFloat169 + local22.aFloat167 * local13.aFloat163 + local22.aFloat165 * local13.aFloat166;
			Static510.aFloat151 = local22.aFloat169 * local13.aFloat167 + local22.aFloat167 * local13.aFloat159 + local22.aFloat165 * local13.aFloat158;
			Static187.aFloat94 = local22.aFloat161 * local13.aFloat169 + local22.aFloat158 * local13.aFloat168 + local13.aFloat161 * local22.aFloat166;
			Static230.aFloat106 = local22.aFloat166 * local13.aFloat158 + local22.aFloat158 * local13.aFloat159 + local13.aFloat167 * local22.aFloat161;
			Static175.aFloat93 = local22.aFloat158 * local13.aFloat163 + local22.aFloat166 * local13.aFloat166 + local22.aFloat161 * local13.aFloat165;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort93 + this.aShort86 >> 1;
			@Pc(506) int local506 = this.aShort87 + this.aShort91 >> 1;
			@Pc(525) int local525 = (int) ((float) local498 * Static175.aFloat93 + Static350.aFloat124 + (float) this.aShort85 * Static394.aFloat173 + (float) local506 * Static143.aFloat52);
			@Pc(544) int local544 = (int) (Static510.aFloat151 * (float) local506 + Static240.aFloat119 + Static230.aFloat106 * (float) local498 + Static40.aFloat37 * (float) this.aShort85);
			@Pc(563) int local563 = (int) ((float) local498 * Static187.aFloat94 + Static150.aFloat172 + Static64.aFloat42 * (float) this.aShort85 + Static486.aFloat186 * (float) local506);
			@Pc(582) int local582 = (int) ((float) local506 * Static143.aFloat52 + (float) this.aShort88 * Static394.aFloat173 + Static175.aFloat93 * (float) local498 + Static350.aFloat124);
			@Pc(601) int local601 = (int) ((float) local498 * Static230.aFloat106 + Static240.aFloat119 + (float) this.aShort88 * Static40.aFloat37 + (float) local506 * Static510.aFloat151);
			arg1.anInt6178 = this.aClass9_Sub2_33.anInt837 * local582 / arg2 + this.aClass9_Sub2_33.anInt829;
			arg1.anInt6177 = local544 * this.aClass9_Sub2_33.anInt841 / arg2 + this.aClass9_Sub2_33.anInt851;
			@Pc(646) int local646 = (int) (Static486.aFloat186 * (float) local506 + Static150.aFloat172 + Static187.aFloat94 * (float) local498 + Static64.aFloat42 * (float) this.aShort88);
			arg1.anInt6179 = this.aClass9_Sub2_33.anInt841 * local601 / arg2 + this.aClass9_Sub2_33.anInt851;
			arg1.anInt6180 = this.aClass9_Sub2_33.anInt837 * local525 / arg2 + this.aClass9_Sub2_33.anInt829;
			if (this.aClass9_Sub2_33.anInt828 > local563 && this.aClass9_Sub2_33.anInt828 > local646) {
				arg1.aBoolean456 = true;
				arg1.anInt6181 = this.aClass9_Sub2_33.anInt837 * (this.aShort92 + local525) / arg2 + this.aClass9_Sub2_33.anInt829 - arg1.anInt6180;
			}
		}
		this.aClass9_Sub2_33.method776((float) arg2);
		this.aClass9_Sub2_33.method819();
		this.aClass9_Sub2_33.method809(local22);
		this.method6759();
		this.aClass9_Sub2_33.method783();
		this.method6764();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	private void method6758() {
		if (!this.aBoolean597) {
			return;
		}
		this.aBoolean597 = false;
		if (this.aClass69Array4 == null && this.aClass128Array4 == null && this.aClass76Array1 == null) {
			if (this.anIntArray578 != null && !Static443.method6789(this.anInt8115, this.anInt8093)) {
				if (this.aClass166_11 != null && this.aClass166_11.anInterface18_3 == null) {
					this.aBoolean597 = true;
				} else {
					if (!this.aBoolean596) {
						this.method6766();
					}
					this.anIntArray578 = null;
				}
			}
			if (this.anIntArray575 != null && !Static29.method992(this.anInt8115, this.anInt8093)) {
				if (this.aClass166_11 != null && this.aClass166_11.anInterface18_3 == null) {
					this.aBoolean597 = true;
				} else {
					if (!this.aBoolean596) {
						this.method6766();
					}
					this.anIntArray575 = null;
				}
			}
			if (this.anIntArray577 != null && !Static172.method3491(this.anInt8093, this.anInt8115)) {
				if (this.aClass166_11 != null && this.aClass166_11.anInterface18_3 == null) {
					this.aBoolean597 = true;
				} else {
					if (!this.aBoolean596) {
						this.method6766();
					}
					this.anIntArray577 = null;
				}
			}
		}
		if (this.aShortArray113 != null && this.anIntArray578 == null && this.anIntArray575 == null && this.anIntArray577 == null) {
			this.aShortArray113 = null;
			this.anIntArray576 = null;
		}
		if (this.aByteArray96 != null && !Static264.method5273(this.anInt8115, this.anInt8093)) {
			if (this.aClass166_10 == null) {
				if (this.aClass166_12 != null && this.aClass166_12.anInterface18_3 == null) {
					this.aBoolean597 = true;
				} else {
					this.aShortArray109 = this.aShortArray116 = this.aShortArray111 = null;
					this.aByteArray96 = null;
				}
			} else if (this.aClass166_10.anInterface18_3 == null) {
				this.aBoolean597 = true;
			} else {
				this.aShortArray109 = this.aShortArray116 = this.aShortArray111 = null;
				this.aByteArray96 = null;
			}
		}
		if (this.aShortArray115 != null && !Static225.method4052(this.anInt8093, this.anInt8115)) {
			if (this.aClass166_12 != null && this.aClass166_12.anInterface18_3 == null) {
				this.aBoolean597 = true;
			} else {
				this.aShortArray115 = null;
			}
		}
		if (this.aByteArray97 != null && !Static571.method8044(this.anInt8115, this.anInt8093)) {
			if (this.aClass166_12 != null && this.aClass166_12.anInterface18_3 == null) {
				this.aBoolean597 = true;
			} else {
				this.aByteArray97 = null;
			}
		}
		if (this.aFloatArray60 != null && !Static82.method1823(this.anInt8115, this.anInt8093)) {
			if (this.aClass166_13 != null && this.aClass166_13.anInterface18_3 == null) {
				this.aBoolean597 = true;
			} else {
				this.aFloatArray60 = this.aFloatArray59 = null;
			}
		}
		if (this.aShortArray110 != null && !Static121.method2386(this.anInt8093, this.anInt8115)) {
			if (this.aClass166_12 != null && this.aClass166_12.anInterface18_3 == null) {
				this.aBoolean597 = true;
			} else {
				this.aShortArray110 = null;
			}
		}
		if (this.aShortArray117 != null && !Static28.method989(this.anInt8093, this.anInt8115)) {
			if (this.aClass304_1 != null && this.aClass304_1.anInterface3_4 == null || this.aClass166_12 != null && this.aClass166_12.anInterface18_3 == null) {
				this.aBoolean597 = true;
			} else {
				this.aShortArray117 = this.aShortArray118 = this.aShortArray108 = null;
			}
		}
		if (this.anIntArrayArray52 != null && !Static290.method4774(this.anInt8115, this.anInt8093)) {
			this.anIntArrayArray52 = null;
			this.aShortArray112 = null;
		}
		if (this.anIntArrayArray51 != null && !Static278.method4603(this.anInt8093, this.anInt8115)) {
			this.aShortArray114 = null;
			this.anIntArrayArray51 = null;
		}
		if (this.anIntArrayArray50 != null && !Static267.method4538(this.anInt8115, this.anInt8093)) {
			this.anIntArrayArray50 = null;
		}
		if (this.anIntArray579 != null && (this.anInt8115 & 0x800) == 0 && (this.anInt8115 & 0x40000) == 0) {
			this.anIntArray579 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean596) {
			this.method6766();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort90;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8063; local7++) {
			local16 = this.aShortArray115[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray115[local7] = (short) (local32 | local28 << 7 | local22 << 10);
		}
		if (this.aClass76Array1 != null) {
			for (local16 = 0; local16 < this.anInt8109; local16++) {
				@Pc(108) Class76 local108 = this.aClass76Array1[local16];
				@Pc(113) Class326 local113 = this.aClass326Array1[local16];
				local113.anInt9252 = Static223.anIntArray301[this.aShortArray115[local108.anInt2373] & 0xFFFF] & 0xFFFFFF | local113.anInt9252 & 0xFF000000;
			}
		}
		if (this.aClass166_12 != null) {
			this.aClass166_12.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	private void method6759() {
		if (this.anInt8075 == 0) {
			return;
		}
		if (this.aByte96 != 0) {
			this.method6760(true);
		}
		this.method6760(false);
		if (this.aClass304_1 != null) {
			if (this.aClass304_1.anInterface3_4 == null) {
				this.method6761((this.aByte96 & 0x10) != 0);
			}
			if (this.aClass304_1.anInterface3_4 != null) {
				this.aClass9_Sub2_33.method826(this.aClass166_10 != null);
				this.aClass9_Sub2_33.method805(this.aClass166_11, this.aClass166_13, this.aClass166_12, this.aClass166_10);
				@Pc(74) int local74 = this.anIntArray579.length - 1;
				for (@Pc(76) int local76 = 0; local76 < local74; local76++) {
					@Pc(83) int local83 = this.anIntArray579[local76];
					@Pc(90) int local90 = this.anIntArray579[local76 + 1];
					@Pc(97) int local97 = this.aShortArray110[local83] & 0xFFFF;
					if (local97 == 65535) {
						local97 = -1;
					}
					this.aClass9_Sub2_33.method774(this.aClass166_10 != null, local97);
					this.aClass9_Sub2_33.method790((local90 - local83) * 3, local83 * 3, this.aClass304_1.anInterface3_4);
				}
			}
		}
		this.method6758();
	}

	@OriginalMember(owner = "client!rh", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean596) {
			this.method6766();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZB)V")
	private void method6760(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass166_12 != null && this.aClass166_12.anInterface18_3 == null;
		@Pc(27) boolean local27 = this.aClass166_10 != null && this.aClass166_10.anInterface18_3 == null;
		@Pc(38) boolean local38 = this.aClass166_11 != null && this.aClass166_11.anInterface18_3 == null;
		@Pc(49) boolean local49 = this.aClass166_13 != null && this.aClass166_13.anInterface18_3 == null;
		if (arg0) {
			local38 &= (this.aByte96 & 0x1) != 0;
			local49 &= (this.aByte96 & 0x8) != 0;
			local27 &= (this.aByte96 & 0x4) != 0;
			local16 &= (this.aByte96 & 0x2) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (local38) {
			local106 = 12;
		}
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local112 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local114 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.anInt8104 * local106 <= this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1.aByteArray65.length) {
			this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1.anInt5769 = 0;
		} else {
			this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1 = new Class6_Sub26_Sub1(local106 * (this.anInt8104 + 100));
		}
		@Pc(201) Class6_Sub26_Sub1 local201 = this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1;
		@Pc(209) int local209;
		@Pc(218) int local218;
		@Pc(246) int local246;
		@Pc(255) int local255;
		if (local38) {
			@Pc(225) int local225;
			@Pc(232) int local232;
			@Pc(237) int local237;
			@Pc(244) int local244;
			if (this.aClass9_Sub2_33.aBoolean65) {
				for (local209 = 0; local209 < this.anInt8074; local209++) {
					local218 = Stream.floatToRawIntBits((float) this.anIntArray578[local209]);
					local225 = Stream.floatToRawIntBits((float) this.anIntArray575[local209]);
					local232 = Stream.floatToRawIntBits((float) this.anIntArray577[local209]);
					local237 = this.anIntArray576[local209];
					local244 = this.anIntArray576[local209 + 1];
					for (local246 = local237; local246 < local244; local246++) {
						local255 = this.aShortArray113[local246] - 1;
						if (local255 == -1) {
							break;
						}
						local201.anInt5769 = local106 * local255;
						local201.method4979(local218);
						local201.method4979(local225);
						local201.method4979(local232);
					}
				}
			} else {
				for (local209 = 0; local209 < this.anInt8074; local209++) {
					local218 = Stream.floatToRawIntBits((float) this.anIntArray578[local209]);
					local225 = Stream.floatToRawIntBits((float) this.anIntArray575[local209]);
					local232 = Stream.floatToRawIntBits((float) this.anIntArray577[local209]);
					local237 = this.anIntArray576[local209];
					local244 = this.anIntArray576[local209 + 1];
					for (local246 = local237; local246 < local244; local246++) {
						local255 = this.aShortArray113[local246] - 1;
						if (local255 == -1) {
							break;
						}
						local201.anInt5769 = local255 * local106;
						local201.method4989(local218);
						local201.method4989(local225);
						local201.method4989(local232);
					}
				}
			}
		}
		@Pc(572) float local572;
		@Pc(468) short[] local468;
		@Pc(460) short[] local460;
		@Pc(472) short[] local472;
		@Pc(464) byte[] local464;
		@Pc(616) float local616;
		if (local16) {
			if (this.aClass166_10 == null) {
				if (this.aClass35_1 == null) {
					local468 = this.aShortArray109;
					local464 = this.aByteArray96;
					local460 = this.aShortArray116;
					local472 = this.aShortArray111;
				} else {
					local460 = this.aClass35_1.aShortArray16;
					local464 = this.aClass35_1.aByteArray24;
					local468 = this.aClass35_1.aShortArray14;
					local472 = this.aClass35_1.aShortArray15;
				}
				@Pc(492) float local492 = this.aClass9_Sub2_33.aFloatArray3[0];
				@Pc(498) float local498 = this.aClass9_Sub2_33.aFloatArray3[1];
				@Pc(504) float local504 = this.aClass9_Sub2_33.aFloatArray3[2];
				@Pc(508) float local508 = this.aClass9_Sub2_33.aFloat33;
				@Pc(518) float local518 = this.aClass9_Sub2_33.aFloat35 * 768.0F / (float) this.aShort90;
				@Pc(528) float local528 = this.aClass9_Sub2_33.aFloat14 * 768.0F / (float) this.aShort90;
				for (@Pc(530) int local530 = 0; local530 < this.anInt8063; local530++) {
					@Pc(550) int local550 = this.method6767(this.aShort89, this.aShortArray110[local530], this.aByteArray97[local530], this.aShortArray115[local530]);
					@Pc(561) float local561 = this.aClass9_Sub2_33.aFloat18 * (float) (local550 >> 8 & 0xFF);
					local572 = this.aClass9_Sub2_33.aFloat23 * (float) (local550 >> 16 & 0xFF);
					@Pc(577) short local577 = this.aShortArray117[local530];
					@Pc(586) float local586 = (float) (local550 >>> 24) * this.aClass9_Sub2_33.aFloat29;
					@Pc(591) short local591 = (short) local464[local577];
					if (local591 == 0) {
						local616 = (local498 * (float) local460[local577] + (float) local468[local577] * local492 + local504 * (float) local472[local577]) * 0.0026041667F;
					} else {
						local616 = ((float) local468[local577] * local492 + (float) local460[local577] * local498 + local504 * (float) local472[local577]) / (float) (local591 * 256);
					}
					@Pc(656) float local656 = local508 + (local616 < 0.0F ? local528 : local518) * local616;
					@Pc(661) int local661 = (int) (local586 * local656);
					@Pc(666) int local666 = (int) (local656 * local572);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					@Pc(698) int local698 = (int) (local656 * local561);
					local201.anInt5769 = local106 * local577 + local110;
					if (local698 < 0) {
						local698 = 0;
					} else if (local698 > 255) {
						local698 = 255;
					}
					local201.method4950(local661, -81849);
					local201.method4950(local666, -81849);
					local201.method4950(local698, -81849);
					local201.method4950(255 - (this.aByteArray97[local530] & 0xFF), -81849);
					local577 = this.aShortArray118[local530];
					local591 = local464[local577];
					if (local591 == 0) {
						local616 = (local504 * (float) local472[local577] + (float) local460[local577] * local498 + local492 * (float) local468[local577]) * 0.0026041667F;
					} else {
						local616 = ((float) local460[local577] * local498 + (float) local468[local577] * local492 + (float) local472[local577] * local504) / (float) (local591 * 256);
					}
					local656 = local508 + local616 * (local616 < 0.0F ? local528 : local518);
					local661 = (int) (local586 * local656);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					local666 = (int) (local656 * local572);
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					local698 = (int) (local656 * local561);
					local201.anInt5769 = local106 * local577 + local110;
					if (local698 < 0) {
						local698 = 0;
					} else if (local698 > 255) {
						local698 = 255;
					}
					local201.method4950(local661, -81849);
					local201.method4950(local666, -81849);
					local201.method4950(local698, -81849);
					local201.method4950(255 - (this.aByteArray97[local530] & 0xFF), -81849);
					local577 = this.aShortArray108[local530];
					local591 = local464[local577];
					if (local591 == 0) {
						local616 = (local504 * (float) local472[local577] + local498 * (float) local460[local577] + local492 * (float) local468[local577]) * 0.0026041667F;
					} else {
						local616 = ((float) local472[local577] * local504 + (float) local460[local577] * local498 + local492 * (float) local468[local577]) / (float) (local591 * 256);
					}
					local656 = local508 + local616 * (local616 < 0.0F ? local528 : local518);
					local661 = (int) (local586 * local656);
					local666 = (int) (local572 * local656);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					local698 = (int) (local656 * local561);
					local201.anInt5769 = local106 * local577 + local110;
					if (local698 < 0) {
						local698 = 0;
					} else if (local698 > 255) {
						local698 = 255;
					}
					local201.method4950(local661, -81849);
					local201.method4950(local666, -81849);
					local201.method4950(local698, -81849);
					local201.method4950(255 - (this.aByteArray97[local530] & 0xFF), -81849);
				}
			} else {
				for (local209 = 0; local209 < this.anInt8063; local209++) {
					local218 = this.method6767(this.aShort89, this.aShortArray110[local209], this.aByteArray97[local209], this.aShortArray115[local209]);
					local201.anInt5769 = local110 + local106 * this.aShortArray117[local209];
					local201.method4979(local218);
					local201.anInt5769 = local106 * this.aShortArray118[local209] + local110;
					local201.method4979(local218);
					local201.anInt5769 = local110 + this.aShortArray108[local209] * local106;
					local201.method4979(local218);
				}
			}
		}
		if (local27) {
			if (this.aClass35_1 == null) {
				local468 = this.aShortArray109;
				local460 = this.aShortArray116;
				local472 = this.aShortArray111;
				local464 = this.aByteArray96;
			} else {
				local460 = this.aClass35_1.aShortArray16;
				local464 = this.aClass35_1.aByteArray24;
				local468 = this.aClass35_1.aShortArray14;
				local472 = this.aClass35_1.aShortArray15;
			}
			@Pc(1107) float local1107 = 3.0F / (float) this.aShort90;
			local616 = 3.0F / (float) (this.aShort90 / 2 + this.aShort90);
			local201.anInt5769 = local112;
			if (this.aClass9_Sub2_33.aBoolean65) {
				for (local246 = 0; local246 < this.anInt8104; local246++) {
					local255 = local464[local246] & 0xFF;
					if (local255 == 0) {
						local201.method4361(local616 * (float) local468[local246]);
						local201.method4361((float) local460[local246] * local616);
						local201.method4361((float) local472[local246] * local616);
					} else {
						local572 = local1107 / (float) local255;
						local201.method4361((float) local468[local246] * local572);
						local201.method4361(local572 * (float) local460[local246]);
						local201.method4361((float) local472[local246] * local572);
					}
					local201.anInt5769 += local106 - 12;
				}
			} else {
				for (local246 = 0; local246 < this.anInt8104; local246++) {
					local255 = local464[local246] & 0xFF;
					if (local255 == 0) {
						local201.method4360((float) local468[local246] * local616);
						local201.method4360(local616 * (float) local460[local246]);
						local201.method4360((float) local472[local246] * local616);
					} else {
						local572 = local1107 / (float) local255;
						local201.method4360(local572 * (float) local468[local246]);
						local201.method4360((float) local460[local246] * local572);
						local201.method4360(local572 * (float) local472[local246]);
					}
					local201.anInt5769 += local106 - 12;
				}
			}
		}
		if (local49) {
			local201.anInt5769 = local114;
			if (this.aClass9_Sub2_33.aBoolean65) {
				for (local209 = 0; local209 < this.anInt8104; local209++) {
					local201.method4361(this.aFloatArray60[local209]);
					local201.method4361(this.aFloatArray59[local209]);
					local201.anInt5769 += local106 - 8;
				}
			} else {
				for (local209 = 0; local209 < this.anInt8104; local209++) {
					local201.method4360(this.aFloatArray60[local209]);
					local201.method4360(this.aFloatArray59[local209]);
					local201.anInt5769 += local106 - 8;
				}
			}
		}
		local201.anInt5769 = this.anInt8104 * local106;
		@Pc(1421) Interface18 local1421;
		if (arg0) {
			if (this.anInterface18_6 == null) {
				this.anInterface18_6 = this.aClass9_Sub2_33.method823(local201.aByteArray65, true, local106, local201.anInt5769);
			} else {
				this.anInterface18_6.method3933(local201.anInt5769, local201.aByteArray65, local106);
			}
			local1421 = this.anInterface18_6;
			this.aByte96 = 0;
		} else {
			local1421 = this.aClass9_Sub2_33.method823(local201.aByteArray65, false, local106, local201.anInt5769);
			this.aBoolean597 = true;
		}
		if (local38) {
			this.aClass166_11.anInterface18_3 = local1421;
			this.aClass166_11.aByte49 = 0;
		}
		if (local49) {
			this.aClass166_13.anInterface18_3 = local1421;
			this.aClass166_13.aByte49 = local114;
		}
		if (local16) {
			this.aClass166_12.anInterface18_3 = local1421;
			this.aClass166_12.aByte49 = local110;
		}
		if (local27) {
			this.aClass166_10.aByte49 = local112;
			this.aClass166_10.anInterface18_3 = local1421;
		}
	}

	@OriginalMember(owner = "client!rh", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static556.anInt9486 = 0;
			local29 = 0;
			Static20.anInt6004 = 0;
			Static552.anInt8650 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray51.length > local41) {
					local55 = this.anIntArrayArray51[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray114 == null || (this.aShortArray114[local63] & arg6) != 0) {
							Static552.anInt8650 += this.anIntArray578[local63];
							Static20.anInt6004 += this.anIntArray575[local63];
							local29++;
							Static556.anInt9486 += this.anIntArray577[local63];
						}
					}
				}
			}
			if (local29 > 0) {
				Static552.anInt8650 = Static552.anInt8650 / local29 + arg2;
				Static287.aBoolean410 = true;
				Static20.anInt6004 = arg3 + Static20.anInt6004 / local29;
				Static556.anInt9486 = arg4 + Static556.anInt9486 / local29;
			} else {
				Static20.anInt6004 = arg3;
				Static552.anInt8650 = arg2;
				Static556.anInt9486 = arg4;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg2 * arg7[0] + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg2 * arg7[3] + arg3 * arg7[4] + arg4 * arg7[5] + 8192 >> 14;
				local41 = arg3 * arg7[7] + arg2 * arg7[6] + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local29;
				arg4 = local41;
				arg3 = local35;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray51.length > local35) {
					local253 = this.anIntArrayArray51[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray114 == null || (this.aShortArray114[local57] & arg6) != 0) {
							this.anIntArray578[local57] += arg2;
							this.anIntArray575[local57] += arg3;
							this.anIntArray577[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(383) int local383;
		@Pc(401) int local401;
		@Pc(636) int local636;
		@Pc(645) int local645;
		@Pc(658) int local658;
		@Pc(662) int local662;
		@Pc(680) int local680;
		@Pc(1020) int local1020;
		@Pc(1028) int local1028;
		@Pc(1182) int local1182;
		@Pc(1208) int local1208;
		@Pc(1213) int local1213;
		@Pc(1221) int local1221;
		@Pc(1226) int local1226;
		@Pc(1230) int local1230;
		@Pc(1234) int local1234;
		@Pc(1236) int local1236;
		@Pc(1366) int[] local1366;
		@Pc(1368) int local1368;
		@Pc(1372) int local1372;
		@Pc(1376) int local1376;
		@Pc(1378) int local1378;
		@Pc(1509) int local1509;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray51.length) {
						local253 = this.anIntArrayArray51[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray114 == null || (this.aShortArray114[local57] & arg6) != 0) {
								this.anIntArray578[local57] -= Static552.anInt8650;
								this.anIntArray575[local57] -= Static20.anInt6004;
								this.anIntArray577[local57] -= Static556.anInt9486;
								if (arg4 != 0) {
									local63 = Class179.anIntArray756[arg4];
									local383 = Class179.anIntArray757[arg4];
									local401 = this.anIntArray578[local57] * local383 + local63 * this.anIntArray575[local57] + 16383 >> 14;
									this.anIntArray575[local57] = local383 * this.anIntArray575[local57] + 16383 - local63 * this.anIntArray578[local57] >> 14;
									this.anIntArray578[local57] = local401;
								}
								if (arg2 != 0) {
									local63 = Class179.anIntArray756[arg2];
									local383 = Class179.anIntArray757[arg2];
									local401 = this.anIntArray575[local57] * local383 + 16383 - this.anIntArray577[local57] * local63 >> 14;
									this.anIntArray577[local57] = this.anIntArray575[local57] * local63 + local383 * this.anIntArray577[local57] + 16383 >> 14;
									this.anIntArray575[local57] = local401;
								}
								if (arg3 != 0) {
									local63 = Class179.anIntArray756[arg3];
									local383 = Class179.anIntArray757[arg3];
									local401 = local383 * this.anIntArray578[local57] + this.anIntArray577[local57] * local63 + 16383 >> 14;
									this.anIntArray577[local57] = local383 * this.anIntArray577[local57] + 16383 - local63 * this.anIntArray578[local57] >> 14;
									this.anIntArray578[local57] = local401;
								}
								this.anIntArray578[local57] += Static552.anInt8650;
								this.anIntArray575[local57] += Static20.anInt6004;
								this.anIntArray577[local57] += Static556.anInt9486;
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
								if (this.aShortArray114 == null || (this.aShortArray114[local63] & arg6) != 0) {
									local383 = this.anIntArray576[local63];
									local401 = this.anIntArray576[local63 + 1];
									for (local636 = local383; local636 < local401; local636++) {
										local645 = this.aShortArray113[local636] - 1;
										if (local645 == -1) {
											break;
										}
										if (arg4 != 0) {
											local658 = Class179.anIntArray756[arg4];
											local662 = Class179.anIntArray757[arg4];
											local680 = this.aShortArray109[local645] * local662 + local658 * this.aShortArray116[local645] + 16383 >> 14;
											this.aShortArray116[local645] = (short) (local662 * this.aShortArray116[local645] + 16383 - this.aShortArray109[local645] * local658 >> 14);
											this.aShortArray109[local645] = (short) local680;
										}
										if (arg2 != 0) {
											local658 = Class179.anIntArray756[arg2];
											local662 = Class179.anIntArray757[arg2];
											local680 = this.aShortArray116[local645] * local662 + 16383 - this.aShortArray111[local645] * local658 >> 14;
											this.aShortArray111[local645] = (short) (local658 * this.aShortArray116[local645] + local662 * this.aShortArray111[local645] + 16383 >> 14);
											this.aShortArray116[local645] = (short) local680;
										}
										if (arg3 != 0) {
											local658 = Class179.anIntArray756[arg3];
											local662 = Class179.anIntArray757[arg3];
											local680 = this.aShortArray111[local645] * local658 + local662 * this.aShortArray109[local645] + 16383 >> 14;
											this.aShortArray111[local645] = (short) (this.aShortArray111[local645] * local662 + 16383 - this.aShortArray109[local645] * local658 >> 14);
											this.aShortArray109[local645] = (short) local680;
										}
									}
								}
							}
						}
					}
					if (this.aClass166_10 == null && this.aClass166_12 != null) {
						this.aClass166_12.anInterface18_3 = null;
					}
					if (this.aClass166_10 != null) {
						this.aClass166_10.anInterface18_3 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static287.aBoolean410) {
					local383 = arg7[0] * Static552.anInt8650 + arg7[3] * Static20.anInt6004 + arg7[6] * Static556.anInt9486 + 8192 >> 14;
					local401 = arg7[7] * Static556.anInt9486 + Static20.anInt6004 * arg7[4] + arg7[1] * Static552.anInt8650 + 8192 >> 14;
					local383 += local255;
					local401 += local57;
					local636 = arg7[8] * Static556.anInt9486 + Static20.anInt6004 * arg7[5] + arg7[2] * Static552.anInt8650 + 8192 >> 14;
					Static552.anInt8650 = local383;
					local636 += local63;
					Static20.anInt6004 = local401;
					Static287.aBoolean410 = false;
					Static556.anInt9486 = local636;
				}
				@Pc(988) int[] local988 = new int[9];
				local401 = Class179.anIntArray757[arg2];
				local636 = Class179.anIntArray756[arg2];
				local645 = Class179.anIntArray757[arg3];
				local658 = Class179.anIntArray756[arg3];
				local662 = Class179.anIntArray757[arg4];
				local680 = Class179.anIntArray756[arg4];
				local1020 = local636 * local662 + 8192 >> 14;
				local1028 = local636 * local680 + 8192 >> 14;
				local988[1] = local1020 * local658 + -local645 * local680 + 8192 >> 14;
				local988[3] = local680 * local401 + 8192 >> 14;
				local988[6] = -local658 * local662 + local1028 * local645 + 8192 >> 14;
				local988[7] = local658 * local680 + local645 * local1020 + 8192 >> 14;
				local988[5] = -local636;
				local988[2] = local401 * local658 + 8192 >> 14;
				local988[4] = local662 * local401 + 8192 >> 14;
				local988[0] = local658 * local1028 + local662 * local645 + 8192 >> 14;
				local988[8] = local645 * local401 + 8192 >> 14;
				@Pc(1157) int local1157 = -Static556.anInt9486 * local988[2] + -Static552.anInt8650 * local988[0] + -Static20.anInt6004 * local988[1] + 8192 >> 14;
				local1182 = -Static552.anInt8650 * local988[3] + -Static20.anInt6004 * local988[4] + local988[5] * -Static556.anInt9486 + 8192 >> 14;
				local1208 = local988[7] * -Static20.anInt6004 + local988[6] * -Static552.anInt8650 + -Static556.anInt9486 * local988[8] + 8192 >> 14;
				local1213 = local1157 + Static552.anInt8650;
				@Pc(1217) int local1217 = local1182 + Static20.anInt6004;
				local1221 = Static556.anInt9486 + local1208;
				@Pc(1224) int[] local1224 = new int[9];
				for (local1226 = 0; local1226 < 3; local1226++) {
					for (local1230 = 0; local1230 < 3; local1230++) {
						local1234 = 0;
						for (local1236 = 0; local1236 < 3; local1236++) {
							local1234 += local988[local1236 + local1226 * 3] * arg7[local1236 + local1230 * 3];
						}
						local1224[local1230 + local1226 * 3] = local1234 + 8192 >> 14;
					}
				}
				local1230 = local255 * local988[0] + local57 * local988[1] + local988[2] * local63 + 8192 >> 14;
				local1234 = local988[5] * local63 + local255 * local988[3] + local988[4] * local57 + 8192 >> 14;
				local1230 += local1213;
				local1236 = local57 * local988[7] + local255 * local988[6] + local63 * local988[8] + 8192 >> 14;
				local1234 += local1217;
				local1236 += local1221;
				local1366 = new int[9];
				for (local1368 = 0; local1368 < 3; local1368++) {
					for (local1372 = 0; local1372 < 3; local1372++) {
						local1376 = 0;
						for (local1378 = 0; local1378 < 3; local1378++) {
							local1376 += local1224[local1372 + local1378 * 3] * arg7[local1378 + local1368 * 3];
						}
						local1366[local1372 + local1368 * 3] = local1376 + 8192 >> 14;
					}
				}
				local1372 = local1234 * arg7[1] + arg7[0] * local1230 + local1236 * arg7[2] + 8192 >> 14;
				local1376 = arg7[4] * local1234 + arg7[3] * local1230 + local1236 * arg7[5] + 8192 >> 14;
				local1372 += local29;
				local1378 = arg7[6] * local1230 + local1234 * arg7[7] + local1236 * arg7[8] + 8192 >> 14;
				local1376 += local35;
				local1378 += local41;
				for (local1509 = 0; local1509 < local8; local1509++) {
					@Pc(1515) int local1515 = arg1[local1509];
					if (this.anIntArrayArray51.length > local1515) {
						@Pc(1529) int[] local1529 = this.anIntArrayArray51[local1515];
						for (@Pc(1531) int local1531 = 0; local1531 < local1529.length; local1531++) {
							@Pc(1537) int local1537 = local1529[local1531];
							if (this.aShortArray114 == null || (this.aShortArray114[local1537] & arg6) != 0) {
								@Pc(1578) int local1578 = this.anIntArray578[local1537] * local1366[0] + this.anIntArray575[local1537] * local1366[1] + local1366[2] * this.anIntArray577[local1537] + 8192 >> 14;
								@Pc(1609) int local1609 = local1366[4] * this.anIntArray575[local1537] + this.anIntArray578[local1537] * local1366[3] + this.anIntArray577[local1537] * local1366[5] + 8192 >> 14;
								@Pc(1613) int local1613 = local1578 + local1372;
								@Pc(1617) int local1617 = local1609 + local1376;
								@Pc(1648) int local1648 = this.anIntArray577[local1537] * local1366[8] + this.anIntArray575[local1537] * local1366[7] + local1366[6] * this.anIntArray578[local1537] + 8192 >> 14;
								@Pc(1652) int local1652 = local1648 + local1378;
								this.anIntArray578[local1537] = local1613;
								this.anIntArray575[local1537] = local1617;
								this.anIntArray577[local1537] = local1652;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2574) Class76 local2574;
			@Pc(2579) Class326 local2579;
			if (arg0 == 5) {
				if (this.anIntArrayArray52 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray52.length) {
							local253 = this.anIntArrayArray52[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local57 = local253[local255];
								if (this.aShortArray112 == null || (arg6 & this.aShortArray112[local57]) != 0) {
									local63 = arg2 * 8 + (this.aByteArray97[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray97[local57] = (byte) local63;
									if (this.aClass166_12 != null) {
										this.aClass166_12.anInterface18_3 = null;
									}
								}
							}
						}
					}
					if (this.aClass76Array1 != null) {
						for (local35 = 0; local35 < this.anInt8109; local35++) {
							local2574 = this.aClass76Array1[local35];
							local2579 = this.aClass326Array1[local35];
							local2579.anInt9252 = local2579.anInt9252 & 0xFFFFFF | 255 - (this.aByteArray97[local2574.anInt2373] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2826) Class326 local2826;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray50.length > local35) {
								local253 = this.anIntArrayArray50[local35];
								for (local255 = 0; local255 < local253.length; local255++) {
									local2826 = this.aClass326Array1[local253[local255]];
									local2826.anInt9247 += arg3;
									local2826.anInt9254 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray50.length > local35) {
								local253 = this.anIntArrayArray50[local35];
								for (local255 = 0; local255 < local253.length; local255++) {
									local2826 = this.aClass326Array1[local253[local255]];
									local2826.anInt9251 = local2826.anInt9251 * arg2 >> 7;
									local2826.anInt9255 = arg3 * local2826.anInt9255 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray50.length) {
							local253 = this.anIntArrayArray50[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2826 = this.aClass326Array1[local253[local255]];
								local2826.anInt9256 = local2826.anInt9256 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray52 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray52.length > local35) {
						local253 = this.anIntArrayArray52[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray112 == null || (arg6 & this.aShortArray112[local57]) != 0) {
								local63 = this.aShortArray115[local57] & 0xFFFF;
								local383 = local63 >> 10 & 0x3F;
								local401 = local63 >> 7 & 0x7;
								local401 += arg3 / 4;
								local636 = local63 & 0x7F;
								@Pc(2686) int local2686 = arg2 + local383 & 0x3F;
								local636 += arg4;
								if (local401 < 0) {
									local401 = 0;
								} else if (local401 > 7) {
									local401 = 7;
								}
								if (local636 < 0) {
									local636 = 0;
								} else if (local636 > 127) {
									local636 = 127;
								}
								this.aShortArray115[local57] = (short) (local636 | local2686 << 10 | local401 << 7);
								if (this.aClass166_12 != null) {
									this.aClass166_12.anInterface18_3 = null;
								}
							}
						}
					}
				}
				if (this.aClass76Array1 != null) {
					for (local35 = 0; local35 < this.anInt8109; local35++) {
						local2574 = this.aClass76Array1[local35];
						local2579 = this.aClass326Array1[local35];
						local2579.anInt9252 = Static223.anIntArray301[this.aShortArray115[local2574.anInt2373] & 0xFFFF] & 0xFFFFFF | local2579.anInt9252 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray51.length) {
					local253 = this.anIntArrayArray51[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray114 == null || (arg6 & this.aShortArray114[local57]) != 0) {
							this.anIntArray578[local57] -= Static552.anInt8650;
							this.anIntArray575[local57] -= Static20.anInt6004;
							this.anIntArray577[local57] -= Static556.anInt9486;
							this.anIntArray578[local57] = this.anIntArray578[local57] * arg2 >> 7;
							this.anIntArray575[local57] = arg3 * this.anIntArray575[local57] >> 7;
							this.anIntArray577[local57] = this.anIntArray577[local57] * arg4 >> 7;
							this.anIntArray578[local57] += Static552.anInt8650;
							this.anIntArray575[local57] += Static20.anInt6004;
							this.anIntArray577[local57] += Static556.anInt9486;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static287.aBoolean410) {
				local383 = arg7[6] * Static556.anInt9486 + Static552.anInt8650 * arg7[0] + arg7[3] * Static20.anInt6004 + 8192 >> 14;
				local401 = arg7[1] * Static552.anInt8650 + arg7[4] * Static20.anInt6004 + Static556.anInt9486 * arg7[7] + 8192 >> 14;
				local401 += local57;
				local636 = arg7[8] * Static556.anInt9486 + Static20.anInt6004 * arg7[5] + Static552.anInt8650 * arg7[2] + 8192 >> 14;
				local383 += local255;
				Static552.anInt8650 = local383;
				Static20.anInt6004 = local401;
				local636 += local63;
				Static287.aBoolean410 = false;
				Static556.anInt9486 = local636;
			}
			local383 = arg2 << 15 >> 7;
			local401 = arg3 << 15 >> 7;
			local636 = arg4 << 15 >> 7;
			local645 = local383 * -Static552.anInt8650 + 8192 >> 14;
			local658 = -Static20.anInt6004 * local401 + 8192 >> 14;
			local662 = local636 * -Static556.anInt9486 + 8192 >> 14;
			local680 = Static552.anInt8650 + local645;
			local1020 = Static20.anInt6004 + local658;
			local1028 = local662 + Static556.anInt9486;
			@Pc(2002) int[] local2002 = new int[] { arg7[0] * local383 + 8192 >> 14, local383 * arg7[3] + 8192 >> 14, arg7[6] * local383 + 8192 >> 14, arg7[1] * local401 + 8192 >> 14, local401 * arg7[4] + 8192 >> 14, arg7[7] * local401 + 8192 >> 14, arg7[2] * local636 + 8192 >> 14, local636 * arg7[5] + 8192 >> 14, arg7[8] * local636 + 8192 >> 14 };
			local1182 = local383 * local255 + 8192 >> 14;
			local1208 = local401 * local57 + 8192 >> 14;
			local1213 = local636 * local63 + 8192 >> 14;
			@Pc(2138) int local2138 = local1208 + local1020;
			@Pc(2142) int local2142 = local1182 + local680;
			@Pc(2146) int local2146 = local1213 + local1028;
			@Pc(2149) int[] local2149 = new int[9];
			@Pc(2155) int local2155;
			for (local1221 = 0; local1221 < 3; local1221++) {
				for (local2155 = 0; local2155 < 3; local2155++) {
					local1226 = 0;
					for (local1230 = 0; local1230 < 3; local1230++) {
						local1226 += local2002[local1230 * 3 + local2155] * arg7[local1221 * 3 + local1230];
					}
					local2149[local2155 + local1221 * 3] = local1226 + 8192 >> 14;
				}
			}
			local2155 = local2142 * arg7[0] + arg7[1] * local2138 + local2146 * arg7[2] + 8192 >> 14;
			local1226 = arg7[5] * local2146 + local2138 * arg7[4] + local2142 * arg7[3] + 8192 >> 14;
			local1230 = arg7[8] * local2146 + local2142 * arg7[6] + local2138 * arg7[7] + 8192 >> 14;
			local2155 += local29;
			local1226 += local35;
			local1230 += local41;
			for (local1234 = 0; local1234 < local8; local1234++) {
				local1236 = arg1[local1234];
				if (this.anIntArrayArray51.length > local1236) {
					local1366 = this.anIntArrayArray51[local1236];
					for (local1368 = 0; local1368 < local1366.length; local1368++) {
						local1372 = local1366[local1368];
						if (this.aShortArray114 == null || (arg6 & this.aShortArray114[local1372]) != 0) {
							local1376 = this.anIntArray578[local1372] * local2149[0] + local2149[1] * this.anIntArray575[local1372] + this.anIntArray577[local1372] * local2149[2] + 8192 >> 14;
							local1378 = this.anIntArray578[local1372] * local2149[3] + local2149[4] * this.anIntArray575[local1372] + local2149[5] * this.anIntArray577[local1372] + 8192 >> 14;
							@Pc(2396) int local2396 = local1378 + local1226;
							@Pc(2400) int local2400 = local1376 + local2155;
							local1509 = local2149[8] * this.anIntArray577[local1372] + local2149[7] * this.anIntArray575[local1372] + this.anIntArray578[local1372] * local2149[6] + 8192 >> 14;
							@Pc(2435) int local2435 = local1509 + local1230;
							this.anIntArray578[local1372] = local2400;
							this.anIntArray575[local1372] = local2396;
							this.anIntArray577[local1372] = local2435;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean596) {
			this.method6766();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!rh", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		this.anInt8115 = arg0;
		if (this.aClass35_1 != null && (this.anInt8115 & 0x10000) == 0) {
			this.aShortArray116 = this.aClass35_1.aShortArray16;
			this.aByteArray96 = this.aClass35_1.aByteArray24;
			this.aShortArray111 = this.aClass35_1.aShortArray15;
			this.aShortArray109 = this.aClass35_1.aShortArray14;
			this.aClass35_1 = null;
		}
		this.aBoolean597 = true;
		this.method6758();
	}

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub4_Sub2 Z(@OriginalArg(0) Class6_Sub4_Sub2 arg0) {
		if (this.anInt8104 == 0) {
			return null;
		}
		if (!this.aBoolean596) {
			this.method6766();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass9_Sub2_33.anInt848 <= 0) {
			local43 = this.aShort86 - (this.aClass9_Sub2_33.anInt848 * this.aShort85 >> 8) >> this.aClass9_Sub2_33.anInt811;
			local60 = this.aShort93 - (this.aClass9_Sub2_33.anInt848 * this.aShort88 >> 8) >> this.aClass9_Sub2_33.anInt811;
		} else {
			local43 = this.aShort86 - (this.aClass9_Sub2_33.anInt848 * this.aShort88 >> 8) >> this.aClass9_Sub2_33.anInt811;
			local60 = this.aShort93 - (this.aClass9_Sub2_33.anInt848 * this.aShort85 >> 8) >> this.aClass9_Sub2_33.anInt811;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass9_Sub2_33.anInt842 <= 0) {
			local117 = this.aShort91 - (this.aClass9_Sub2_33.anInt842 * this.aShort85 >> 8) >> this.aClass9_Sub2_33.anInt811;
			local134 = this.aShort87 - (this.aClass9_Sub2_33.anInt842 * this.aShort88 >> 8) >> this.aClass9_Sub2_33.anInt811;
		} else {
			local117 = this.aShort91 - (this.aClass9_Sub2_33.anInt842 * this.aShort88 >> 8) >> this.aClass9_Sub2_33.anInt811;
			local134 = this.aShort87 - (this.aShort85 * this.aClass9_Sub2_33.anInt842 >> 8) >> this.aClass9_Sub2_33.anInt811;
		}
		@Pc(175) int local175 = local60 + 1 - local43;
		@Pc(182) int local182 = local134 + 1 - local117;
		@Pc(185) Class6_Sub4_Sub2_Sub1 local185 = (Class6_Sub4_Sub2_Sub1) arg0;
		@Pc(201) Class6_Sub4_Sub2_Sub1 local201;
		if (local185 != null && local185.method1262(local175, local182)) {
			local201 = local185;
			local185.method1265();
		} else {
			local201 = new Class6_Sub4_Sub2_Sub1(this.aClass9_Sub2_33, local175, local182);
		}
		local201.method1259(local117, local60, local134, local43);
		this.method6757(local201);
		return local201;
	}

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg2 << 4;
			local22 = arg3 << 4;
			local24 = 0;
			Static556.anInt9486 = 0;
			Static20.anInt6004 = 0;
			Static552.anInt8650 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray51.length > local38) {
					local52 = this.anIntArrayArray51[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static552.anInt8650 += this.anIntArray578[local60];
						Static20.anInt6004 += this.anIntArray575[local60];
						local24++;
						Static556.anInt9486 += this.anIntArray577[local60];
					}
				}
			}
			if (local24 > 0) {
				Static556.anInt9486 = local14 + Static556.anInt9486 / local24;
				Static20.anInt6004 = Static20.anInt6004 / local24 + local22;
				Static552.anInt8650 = Static552.anInt8650 / local24 + local18;
			} else {
				Static556.anInt9486 = local14;
				Static20.anInt6004 = local22;
				Static552.anInt8650 = local18;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local14 = arg4 << 4;
			local22 = arg3 << 4;
			local18 = arg2 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray51.length) {
					local156 = this.anIntArrayArray51[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local54 = local156[local158];
						this.anIntArray578[local54] += local18;
						this.anIntArray575[local54] += local22;
						this.anIntArray577[local54] += local14;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(296) int local296;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray51.length) {
					local156 = this.anIntArrayArray51[local32];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							this.anIntArray578[local54] -= Static552.anInt8650;
							this.anIntArray575[local54] -= Static20.anInt6004;
							this.anIntArray577[local54] -= Static556.anInt9486;
							if (arg4 != 0) {
								local60 = Class179.anIntArray756[arg4];
								local277 = Class179.anIntArray757[arg4];
								local296 = local60 * this.anIntArray575[local54] + this.anIntArray578[local54] * local277 + 16383 >> 14;
								this.anIntArray575[local54] = this.anIntArray575[local54] * local277 + 16383 - this.anIntArray578[local54] * local60 >> 14;
								this.anIntArray578[local54] = local296;
							}
							if (arg2 != 0) {
								local60 = Class179.anIntArray756[arg2];
								local277 = Class179.anIntArray757[arg2];
								local296 = this.anIntArray575[local54] * local277 + 16383 - local60 * this.anIntArray577[local54] >> 14;
								this.anIntArray577[local54] = local277 * this.anIntArray577[local54] + this.anIntArray575[local54] * local60 + 16383 >> 14;
								this.anIntArray575[local54] = local296;
							}
							if (arg3 != 0) {
								local60 = Class179.anIntArray756[arg3];
								local277 = Class179.anIntArray757[arg3];
								local296 = local60 * this.anIntArray577[local54] + this.anIntArray578[local54] * local277 + 16383 >> 14;
								this.anIntArray577[local54] = local277 * this.anIntArray577[local54] + 16383 - local60 * this.anIntArray578[local54] >> 14;
								this.anIntArray578[local54] = local296;
							}
							this.anIntArray578[local54] += Static552.anInt8650;
							this.anIntArray575[local54] += Static20.anInt6004;
							this.anIntArray577[local54] += Static556.anInt9486;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							this.anIntArray578[local54] -= Static552.anInt8650;
							this.anIntArray575[local54] -= Static20.anInt6004;
							this.anIntArray577[local54] -= Static556.anInt9486;
							if (arg2 != 0) {
								local60 = Class179.anIntArray756[arg2];
								local277 = Class179.anIntArray757[arg2];
								local296 = this.anIntArray575[local54] * local277 + 16383 - this.anIntArray577[local54] * local60 >> 14;
								this.anIntArray577[local54] = this.anIntArray577[local54] * local277 + local60 * this.anIntArray575[local54] + 16383 >> 14;
								this.anIntArray575[local54] = local296;
							}
							if (arg4 != 0) {
								local60 = Class179.anIntArray756[arg4];
								local277 = Class179.anIntArray757[arg4];
								local296 = this.anIntArray575[local54] * local60 + this.anIntArray578[local54] * local277 + 16383 >> 14;
								this.anIntArray575[local54] = this.anIntArray575[local54] * local277 + 16383 - this.anIntArray578[local54] * local60 >> 14;
								this.anIntArray578[local54] = local296;
							}
							if (arg3 != 0) {
								local60 = Class179.anIntArray756[arg3];
								local277 = Class179.anIntArray757[arg3];
								local296 = this.anIntArray577[local54] * local60 + local277 * this.anIntArray578[local54] + 16383 >> 14;
								this.anIntArray577[local54] = local277 * this.anIntArray577[local54] + 16383 - this.anIntArray578[local54] * local60 >> 14;
								this.anIntArray578[local54] = local296;
							}
							this.anIntArray578[local54] += Static552.anInt8650;
							this.anIntArray575[local54] += Static20.anInt6004;
							this.anIntArray577[local54] += Static556.anInt9486;
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
							local277 = this.anIntArray576[local60];
							local296 = this.anIntArray576[local60 + 1];
							for (local752 = local277; local752 < local296; local752++) {
								@Pc(761) int local761 = this.aShortArray113[local752] - 1;
								if (local761 == -1) {
									break;
								}
								@Pc(773) int local773;
								@Pc(777) int local777;
								@Pc(795) int local795;
								if (arg4 != 0) {
									local773 = Class179.anIntArray756[arg4];
									local777 = Class179.anIntArray757[arg4];
									local795 = local777 * this.aShortArray109[local761] + this.aShortArray116[local761] * local773 + 16383 >> 14;
									this.aShortArray116[local761] = (short) (this.aShortArray116[local761] * local777 + 16383 - local773 * this.aShortArray109[local761] >> 14);
									this.aShortArray109[local761] = (short) local795;
								}
								if (arg2 != 0) {
									local773 = Class179.anIntArray756[arg2];
									local777 = Class179.anIntArray757[arg2];
									local795 = local777 * this.aShortArray116[local761] + 16383 - local773 * this.aShortArray111[local761] >> 14;
									this.aShortArray111[local761] = (short) (local777 * this.aShortArray111[local761] + this.aShortArray116[local761] * local773 + 16383 >> 14);
									this.aShortArray116[local761] = (short) local795;
								}
								if (arg3 != 0) {
									local773 = Class179.anIntArray756[arg3];
									local777 = Class179.anIntArray757[arg3];
									local795 = local773 * this.aShortArray111[local761] + this.aShortArray109[local761] * local777 + 16383 >> 14;
									this.aShortArray111[local761] = (short) (this.aShortArray111[local761] * local777 + 16383 - local773 * this.aShortArray109[local761] >> 14);
									this.aShortArray109[local761] = (short) local795;
								}
							}
						}
					}
				}
				if (this.aClass166_10 == null && this.aClass166_12 != null) {
					this.aClass166_12.anInterface18_3 = null;
				}
				if (this.aClass166_10 != null) {
					this.aClass166_10.anInterface18_3 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray51.length > local32) {
					local156 = this.anIntArrayArray51[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local54 = local156[local158];
						this.anIntArray578[local54] -= Static552.anInt8650;
						this.anIntArray575[local54] -= Static20.anInt6004;
						this.anIntArray577[local54] -= Static556.anInt9486;
						this.anIntArray578[local54] = this.anIntArray578[local54] * arg2 >> 7;
						this.anIntArray575[local54] = arg3 * this.anIntArray575[local54] >> 7;
						this.anIntArray577[local54] = arg4 * this.anIntArray577[local54] >> 7;
						this.anIntArray578[local54] += Static552.anInt8650;
						this.anIntArray575[local54] += Static20.anInt6004;
						this.anIntArray577[local54] += Static556.anInt9486;
					}
				}
			}
		} else {
			@Pc(1220) Class76 local1220;
			@Pc(1225) Class326 local1225;
			if (arg0 == 5) {
				if (this.anIntArrayArray52 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray52.length > local32) {
							local156 = this.anIntArrayArray52[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local54 = local156[local158];
								local60 = (this.aByteArray97[local54] & 0xFF) + (arg2 * 8);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray97[local54] = (byte) local60;
							}
							if (local156.length > 0 && this.aClass166_12 != null) {
								this.aClass166_12.anInterface18_3 = null;
							}
						}
					}
					if (this.aClass76Array1 != null) {
						for (local32 = 0; local32 < this.anInt8109; local32++) {
							local1220 = this.aClass76Array1[local32];
							local1225 = this.aClass326Array1[local32];
							local1225.anInt9252 = 255 - (this.aByteArray97[local1220.anInt2373] & 0xFF) << 24 | local1225.anInt9252 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1463) Class326 local1463;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray50.length > local32) {
								local156 = this.anIntArrayArray50[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1463 = this.aClass326Array1[local156[local158]];
									local1463.anInt9247 += arg3;
									local1463.anInt9254 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray50.length > local32) {
								local156 = this.anIntArrayArray50[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1463 = this.aClass326Array1[local156[local158]];
									local1463.anInt9255 = local1463.anInt9255 * arg3 >> 7;
									local1463.anInt9251 = arg2 * local1463.anInt9251 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray50.length > local32) {
							local156 = this.anIntArrayArray50[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1463 = this.aClass326Array1[local156[local158]];
								local1463.anInt9256 = arg2 + local1463.anInt9256 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray52 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray52.length) {
						local156 = this.anIntArrayArray52[local32];
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							local60 = this.aShortArray115[local54] & 0xFFFF;
							local277 = local60 >> 10 & 0x3F;
							local296 = local60 >> 7 & 0x7;
							local296 += arg3 / 4;
							@Pc(1313) int local1313 = arg2 + local277 & 0x3F;
							local752 = local60 & 0x7F;
							if (local296 < 0) {
								local296 = 0;
							} else if (local296 > 7) {
								local296 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray115[local54] = (short) (local752 | local296 << 7 | local1313 << 10);
						}
						if (local156.length > 0 && this.aClass166_12 != null) {
							this.aClass166_12.anInterface18_3 = null;
						}
					}
				}
				if (this.aClass76Array1 != null) {
					for (local32 = 0; local32 < this.anInt8109; local32++) {
						local1220 = this.aClass76Array1[local32];
						local1225 = this.aClass326Array1[local32];
						local1225.anInt9252 = local1225.anInt9252 & 0xFF000000 | Static223.anIntArray301[this.aShortArray115[local1220.anInt2373] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass9_Sub2_33.anInterface2_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8063; local11++) {
			if (this.aShortArray110[local11] == arg0) {
				this.aShortArray110[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class296 local52 = local9.method3585(arg0 & 0xFFFF);
			local39 = local52.aByte103;
			local41 = local52.aByte101;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(72) Class296 local72 = local9.method3585(arg1 & 0xFFFF);
			local60 = local72.aByte103;
			local62 = local72.aByte101;
		}
		if (!(local62 != local41 | local39 != local60)) {
			return;
		}
		if (this.aClass76Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt8109; local101++) {
				@Pc(108) Class76 local108 = this.aClass76Array1[local101];
				@Pc(113) Class326 local113 = this.aClass326Array1[local101];
				local113.anInt9252 = Static223.anIntArray301[this.aShortArray115[local108.anInt2373] & 0xFFFF] & 0xFFFFFF | local113.anInt9252 & 0xFF000000;
			}
		}
		if (this.aClass166_12 != null) {
			this.aClass166_12.anInterface18_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
	private void method6761(@OriginalArg(0) boolean arg0) {
		if (this.anInt8075 * 6 > this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1.aByteArray65.length) {
			this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1 = new Class6_Sub26_Sub1(this.anInt8075 * 6 + 600);
		} else {
			this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1.anInt5769 = 0;
		}
		@Pc(42) Class6_Sub26_Sub1 local42 = this.aClass9_Sub2_33.aClass6_Sub26_Sub1_1;
		@Pc(48) int local48;
		if (this.aClass9_Sub2_33.aBoolean65) {
			for (local48 = 0; local48 < this.anInt8075; local48++) {
				local42.method4962(this.aShortArray117[local48]);
				local42.method4962(this.aShortArray118[local48]);
				local42.method4962(this.aShortArray108[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt8075; local48++) {
				local42.method4993(this.aShortArray117[local48]);
				local42.method4993(this.aShortArray118[local48]);
				local42.method4993(this.aShortArray108[local48]);
			}
		}
		if (local42.anInt5769 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface3_3 == null) {
				this.anInterface3_3 = this.aClass9_Sub2_33.method807(true, local42.aByteArray65, local42.anInt5769);
			} else {
				this.anInterface3_3.method7657(local42.anInt5769, local42.aByteArray65);
			}
			this.aClass304_1.anInterface3_4 = this.anInterface3_3;
		} else {
			this.aClass304_1.anInterface3_4 = this.aClass9_Sub2_33.method807(false, local42.aByteArray65, local42.anInt5769);
		}
		if (!arg0) {
			this.aBoolean597 = true;
		}
	}

	@OriginalMember(owner = "client!rh", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		if (this.aClass166_12 != null) {
			this.aClass166_12.anInterface18_3 = null;
		}
		this.aShort89 = (short) arg0;
	}

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8074; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray577[local15] + this.anIntArray578[local15] * local13 >> 14;
			this.anIntArray577[local15] = this.anIntArray577[local15] * local13 - local9 * this.anIntArray578[local15] >> 14;
			this.anIntArray578[local15] = local34;
		}
		this.aBoolean596 = false;
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()[Lclient!haa;")
	@Override
	public Class128[] method7071() {
		return this.aClass128Array4;
	}

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt8115;
	}

	@OriginalMember(owner = "client!rh", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean596) {
			this.method6766();
		}
		return this.aShort86;
	}

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8074; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray578[local15] + this.anIntArray575[local15] * local9 >> 14;
			this.anIntArray575[local15] = local13 * this.anIntArray575[local15] - local9 * this.anIntArray578[local15] >> 14;
			this.anIntArray578[local15] = local33;
		}
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
		this.aBoolean596 = false;
	}

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8074; local3++) {
			if (arg0 != 0) {
				this.anIntArray578[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray575[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray577[local3] += arg2;
			}
		}
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
		this.aBoolean596 = false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class23 method7068(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(26) Class23_Sub2 local26;
		@Pc(30) Class23_Sub2 local30;
		if (arg0 == 1) {
			local30 = this.aClass9_Sub2_33.aClass23_Sub2_3;
			local26 = this.aClass9_Sub2_33.aClass23_Sub2_1;
		} else if (arg0 == 2) {
			local26 = this.aClass9_Sub2_33.aClass23_Sub2_2;
			local30 = this.aClass9_Sub2_33.aClass23_Sub2_6;
		} else if (arg0 == 3) {
			local26 = this.aClass9_Sub2_33.aClass23_Sub2_10;
			local30 = this.aClass9_Sub2_33.aClass23_Sub2_4;
		} else if (arg0 == 4) {
			local30 = this.aClass9_Sub2_33.aClass23_Sub2_7;
			local26 = this.aClass9_Sub2_33.aClass23_Sub2_5;
		} else if (arg0 == 5) {
			local26 = this.aClass9_Sub2_33.aClass23_Sub2_8;
			local30 = this.aClass9_Sub2_33.aClass23_Sub2_9;
		} else {
			local26 = local30 = new Class23_Sub2(this.aClass9_Sub2_33);
		}
		return this.method6768(arg2, local30, local26, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!rh", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		if (this.aClass166_12 != null) {
			this.aClass166_12.anInterface18_3 = null;
		}
		this.aShort90 = (short) arg0;
		if (this.aClass166_10 != null) {
			this.aClass166_10.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class8_Sub2 local8 = (Class8_Sub2) arg2;
		@Pc(12) Class8_Sub2 local12 = this.aClass9_Sub2_33.aClass8_Sub2_3;
		@Pc(33) float local33 = local12.aFloat165 * local8.aFloat160 + local12.aFloat166 * local8.aFloat164 + local8.aFloat162 * local12.aFloat163 + local12.aFloat164;
		@Pc(54) float local54 = local12.aFloat162 + local12.aFloat159 * local8.aFloat162 + local12.aFloat158 * local8.aFloat164 + local12.aFloat167 * local8.aFloat160;
		Static394.aFloat173 = local8.aFloat163 * local12.aFloat166 + local12.aFloat163 * local8.aFloat159 + local8.aFloat168 * local12.aFloat165;
		@Pc(93) float local93 = local12.aFloat168 * local8.aFloat162 + local12.aFloat161 * local8.aFloat164 + local8.aFloat160 * local12.aFloat169 + local12.aFloat160;
		Static175.aFloat93 = local8.aFloat166 * local12.aFloat166 + local12.aFloat163 * local8.aFloat158 + local8.aFloat161 * local12.aFloat165;
		Static486.aFloat186 = local12.aFloat168 * local8.aFloat167 + local8.aFloat165 * local12.aFloat161 + local8.aFloat169 * local12.aFloat169;
		Static143.aFloat52 = local8.aFloat165 * local12.aFloat166 + local12.aFloat163 * local8.aFloat167 + local12.aFloat165 * local8.aFloat169;
		Static510.aFloat151 = local12.aFloat167 * local8.aFloat169 + local8.aFloat167 * local12.aFloat159 + local8.aFloat165 * local12.aFloat158;
		Static40.aFloat37 = local8.aFloat163 * local12.aFloat158 + local12.aFloat159 * local8.aFloat159 + local12.aFloat167 * local8.aFloat168;
		Static64.aFloat42 = local8.aFloat168 * local12.aFloat169 + local8.aFloat159 * local12.aFloat168 + local12.aFloat161 * local8.aFloat163;
		Static187.aFloat94 = local8.aFloat161 * local12.aFloat169 + local8.aFloat166 * local12.aFloat161 + local12.aFloat168 * local8.aFloat158;
		Static230.aFloat106 = local12.aFloat159 * local8.aFloat158 + local12.aFloat158 * local8.aFloat166 + local12.aFloat167 * local8.aFloat161;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass9_Sub2_33.anInt837;
		@Pc(255) int local255 = this.aClass9_Sub2_33.anInt841;
		if (!this.aBoolean596) {
			this.method6766();
		}
		Static353.anIntArray481[0] = this.aShort86;
		Static183.anIntArray265[0] = this.aShort85;
		Static296.anIntArray421[0] = this.aShort91;
		Static353.anIntArray481[1] = this.aShort93;
		Static183.anIntArray265[1] = this.aShort85;
		Static353.anIntArray481[2] = this.aShort86;
		Static296.anIntArray421[1] = this.aShort91;
		Static183.anIntArray265[2] = this.aShort88;
		Static353.anIntArray481[3] = this.aShort93;
		Static296.anIntArray421[2] = this.aShort91;
		Static183.anIntArray265[3] = this.aShort88;
		Static296.anIntArray421[3] = this.aShort91;
		Static353.anIntArray481[4] = this.aShort86;
		Static183.anIntArray265[4] = this.aShort85;
		Static353.anIntArray481[5] = this.aShort93;
		Static296.anIntArray421[4] = this.aShort87;
		Static183.anIntArray265[5] = this.aShort85;
		Static296.anIntArray421[5] = this.aShort87;
		Static353.anIntArray481[6] = this.aShort86;
		Static183.anIntArray265[6] = this.aShort88;
		Static353.anIntArray481[7] = this.aShort93;
		Static296.anIntArray421[6] = this.aShort87;
		Static183.anIntArray265[7] = this.aShort88;
		Static296.anIntArray421[7] = this.aShort87;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(400) float local400;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static296.anIntArray421[local383];
			local395 = Static353.anIntArray481[local383];
			local400 = Static183.anIntArray265[local383];
			local414 = local93 + local390 * Static486.aFloat186 + local400 * Static64.aFloat42 + Static187.aFloat94 * local395;
			local428 = local54 + Static230.aFloat106 * local395 + local400 * Static40.aFloat37 + Static510.aFloat151 * local390;
			local442 = Static394.aFloat173 * local400 + local395 * Static175.aFloat93 + Static143.aFloat52 * local390 + local33;
			if (local414 >= (float) this.aClass9_Sub2_33.anInt828) {
				@Pc(461) float local461 = (float) this.aClass9_Sub2_33.anInt829 + local442 * (float) local251 / local414;
				@Pc(473) float local473 = (float) this.aClass9_Sub2_33.anInt851 + (float) local255 * local428 / local414;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				local239 = true;
				if (local473 < local245) {
					local245 = local473;
				}
				if (local247 < local473) {
					local247 = local473;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.aClass9_Sub2_33.anIntArray52.length < this.anInt8104) {
				this.aClass9_Sub2_33.anIntArray52 = new int[this.anInt8104];
				this.aClass9_Sub2_33.anIntArray50 = new int[this.anInt8104];
			}
			@Pc(558) int[] local558 = this.aClass9_Sub2_33.anIntArray52;
			@Pc(562) int[] local562 = this.aClass9_Sub2_33.anIntArray50;
			@Pc(646) int local646;
			for (@Pc(564) int local564 = 0; local564 < this.anInt8074; local564++) {
				local400 = this.anIntArray575[local564];
				local395 = this.anIntArray578[local564];
				local390 = this.anIntArray577[local564];
				local414 = local93 + local390 * Static486.aFloat186 + Static64.aFloat42 * local400 + Static187.aFloat94 * local395;
				local442 = local33 + Static394.aFloat173 * local400 + local395 * Static175.aFloat93 + Static143.aFloat52 * local390;
				local428 = Static230.aFloat106 * local395 + local400 * Static40.aFloat37 + Static510.aFloat151 * local390 + local54;
				@Pc(659) int local659;
				@Pc(664) int local664;
				@Pc(671) int local671;
				if (local414 >= (float) this.aClass9_Sub2_33.anInt828) {
					local646 = (int) ((float) this.aClass9_Sub2_33.anInt829 + (float) local251 * local442 / local414);
					local659 = (int) ((float) this.aClass9_Sub2_33.anInt851 + (float) local255 * local428 / local414);
					local664 = this.anIntArray576[local564];
					local671 = this.anIntArray576[local564 + 1];
					for (@Pc(673) int local673 = local664; local673 < local671; local673++) {
						@Pc(682) int local682 = this.aShortArray113[local673] - 1;
						if (local682 == -1) {
							break;
						}
						local558[local682] = local646;
						local562[local682] = local659;
					}
				} else {
					local646 = this.anIntArray576[local564];
					local659 = this.anIntArray576[local564 + 1];
					for (local664 = local646; local664 < local659; local664++) {
						local671 = this.aShortArray113[local664] - 1;
						if (local671 == -1) {
							break;
						}
						local558[this.aShortArray113[local664] - 1] = -999999;
					}
				}
			}
			for (local646 = 0; local646 < this.anInt8063; local646++) {
				if (local558[this.aShortArray117[local646]] != -999999 && local558[this.aShortArray118[local646]] != -999999 && local558[this.aShortArray108[local646]] != -999999 && this.method6763(arg0, local558[this.aShortArray108[local646]], local562[this.aShortArray117[local646]], local562[this.aShortArray108[local646]], local562[this.aShortArray118[local646]], local558[this.aShortArray118[local646]], arg1, local558[this.aShortArray117[local646]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean596) {
			this.method6766();
		}
		@Pc(16) int local16 = this.aShort86 + arg4;
		@Pc(21) int local21 = this.aShort93 + arg4;
		@Pc(26) int local26 = this.aShort91 + arg6;
		@Pc(31) int local31 = this.aShort87 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9884 >> arg2.anInt9883 >= arg2.anInt9881 || local26 < 0 || arg2.anInt9885 <= local31 + arg2.anInt9884 >> arg2.anInt9883)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9881 <= arg3.anInt9884 + local21 >> arg3.anInt9883 || local26 < 0 || arg3.anInt9885 <= local31 + arg3.anInt9884 >> arg3.anInt9883) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9883;
			local21 = local21 + arg2.anInt9884 - 1 >> arg2.anInt9883;
			local26 >>= arg2.anInt9883;
			local31 = local31 + arg2.anInt9884 - 1 >> arg2.anInt9883;
			if (arg2.JA(local16, local26) == arg5 && arg5 == arg2.JA(local21, local26) && arg5 == arg2.JA(local16, local31) && arg2.JA(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(217) int local217;
		if (arg0 == 1) {
			for (local217 = 0; local217 < this.anInt8074; local217++) {
				this.anIntArray575[local217] = this.anIntArray575[local217] + arg2.sa(arg4 + this.anIntArray578[local217], arg6 + this.anIntArray577[local217]) - arg5;
			}
		} else {
			@Pc(219) int local219;
			@Pc(229) int local229;
			if (arg0 == 2) {
				@Pc(426) short local426 = this.aShort85;
				if (local426 == 0) {
					return;
				}
				for (local219 = 0; local219 < this.anInt8074; local219++) {
					local229 = (this.anIntArray575[local219] << 16) / local426;
					if (arg1 > local229) {
						this.anIntArray575[local219] += (arg2.sa(this.anIntArray578[local219] + arg4, this.anIntArray577[local219] - -arg6) - arg5) * (arg1 + -local229) / arg1;
					}
				}
			} else {
				@Pc(236) int local236;
				if (arg0 == 3) {
					local217 = (arg1 & 0xFF) * 4;
					local219 = (arg1 >> 8 & 0xFF) * 4;
					local229 = (arg1 >> 16 & 0xFF) << 6;
					local236 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local217 >> 1) < 0 || arg2.anInt9881 << arg2.anInt9883 <= arg2.anInt9884 + (local217 >> 1) + arg4 || arg6 - (local219 >> 1) < 0 || arg2.anInt9885 << arg2.anInt9883 <= (local219 >> 1) + arg6 + arg2.anInt9884) {
						return;
					}
					this.method7082(arg5, arg6, arg2, local229, arg4, local217, local236, local219);
				} else if (arg0 == 4) {
					local217 = this.aShort88 - this.aShort85;
					for (local219 = 0; local219 < this.anInt8074; local219++) {
						this.anIntArray575[local219] = local217 + this.anIntArray575[local219] + arg3.sa(this.anIntArray578[local219] + arg4, this.anIntArray577[local219] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local217 = this.aShort88 - this.aShort85;
					for (local219 = 0; local219 < this.anInt8074; local219++) {
						local229 = this.anIntArray578[local219] + arg4;
						local236 = this.anIntArray577[local219] + arg6;
						@Pc(241) int local241 = arg2.sa(local229, local236);
						@Pc(246) int local246 = arg3.sa(local229, local236);
						@Pc(252) int local252 = local241 - local246 - arg1;
						this.anIntArray575[local219] = (local252 * ((this.anIntArray575[local219] << 8) / local217) >> 8) - (arg5 - local241);
					}
				}
			}
		}
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
		this.aBoolean596 = false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!qda;BIJFIIIF)S")
	private short method6762(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray576[arg2];
		@Pc(17) int local17 = this.anIntArray576[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = local10; local26 < local17; local26++) {
			@Pc(33) short local33 = this.aShortArray113[local26];
			if (local33 == 0) {
				local19 = local26;
				break;
			}
			if (Static152.aLongArray3[local26] == arg3) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray113[local19] = (short) (this.anInt8104 + 1);
		Static152.aLongArray3[local19] = arg3;
		this.aShortArray109[this.anInt8104] = (short) arg7;
		this.aShortArray116[this.anInt8104] = (short) arg5;
		this.aShortArray111[this.anInt8104] = (short) arg6;
		this.aByteArray96[this.anInt8104] = (byte) arg0;
		this.aFloatArray60[this.anInt8104] = arg4;
		this.aFloatArray59[this.anInt8104] = arg8;
		return (short) this.anInt8104++;
	}

	@OriginalMember(owner = "client!rh", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean596) {
			this.method6766();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!rh", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean596) {
			this.method6766();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method6763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg6 && arg4 > arg6 && arg6 < arg3) {
			return false;
		} else if (arg2 < arg6 && arg6 > arg4 && arg6 > arg3) {
			return false;
		} else if (arg0 < arg7 && arg5 > arg0 && arg1 > arg0) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg5 || arg0 <= arg1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7078(@OriginalArg(0) Class8 arg0) {
		@Pc(8) Class8_Sub2 local8 = (Class8_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass69Array4 != null) {
			for (local13 = 0; local13 < this.aClass69Array4.length; local13++) {
				@Pc(20) Class69 local20 = this.aClass69Array4[local13];
				@Pc(22) Class69 local22 = local20;
				if (local20.aClass69_1 != null) {
					local22 = local20.aClass69_1;
				}
				local22.anInt2219 = (int) (local8.aFloat164 + (float) this.anIntArray577[local20.anInt2226] * local8.aFloat165 + (float) this.anIntArray575[local20.anInt2226] * local8.aFloat163 + local8.aFloat166 * (float) this.anIntArray578[local20.anInt2226]);
				local22.anInt2217 = (int) (local8.aFloat167 * (float) this.anIntArray577[local20.anInt2226] + (float) this.anIntArray575[local20.anInt2226] * local8.aFloat159 + local8.aFloat158 * (float) this.anIntArray578[local20.anInt2226] + local8.aFloat162);
				local22.anInt2215 = (int) (local8.aFloat160 + local8.aFloat169 * (float) this.anIntArray577[local20.anInt2226] + local8.aFloat168 * (float) this.anIntArray575[local20.anInt2226] + (float) this.anIntArray578[local20.anInt2226] * local8.aFloat161);
				local22.anInt2218 = (int) ((float) this.anIntArray575[local20.anInt2232] * local8.aFloat163 + local8.aFloat166 * (float) this.anIntArray578[local20.anInt2232] + local8.aFloat165 * (float) this.anIntArray577[local20.anInt2232] + local8.aFloat164);
				local22.anInt2224 = (int) (local8.aFloat167 * (float) this.anIntArray577[local20.anInt2232] + (float) this.anIntArray578[local20.anInt2232] * local8.aFloat158 + local8.aFloat159 * (float) this.anIntArray575[local20.anInt2232] + local8.aFloat162);
				local22.anInt2233 = (int) (local8.aFloat169 * (float) this.anIntArray577[local20.anInt2232] + (float) this.anIntArray575[local20.anInt2232] * local8.aFloat168 + (float) this.anIntArray578[local20.anInt2232] * local8.aFloat161 + local8.aFloat160);
				local22.anInt2228 = (int) (local8.aFloat163 * (float) this.anIntArray575[local20.anInt2230] + local8.aFloat166 * (float) this.anIntArray578[local20.anInt2230] + local8.aFloat165 * (float) this.anIntArray577[local20.anInt2230] + local8.aFloat164);
				local22.anInt2229 = (int) ((float) this.anIntArray577[local20.anInt2230] * local8.aFloat167 + (float) this.anIntArray578[local20.anInt2230] * local8.aFloat158 + (float) this.anIntArray575[local20.anInt2230] * local8.aFloat159 + local8.aFloat162);
				local22.anInt2216 = (int) (local8.aFloat168 * (float) this.anIntArray575[local20.anInt2230] + local8.aFloat161 * (float) this.anIntArray578[local20.anInt2230] + (float) this.anIntArray577[local20.anInt2230] * local8.aFloat169 + local8.aFloat160);
			}
		}
		if (this.aClass128Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass128Array4.length; local13++) {
			@Pc(365) Class128 local365 = this.aClass128Array4[local13];
			@Pc(367) Class128 local367 = local365;
			if (local365.aClass128_1 != null) {
				local367 = local365.aClass128_1;
			}
			if (local365.aClass8_5 == null) {
				local365.aClass8_5 = local8.method8175();
			} else {
				local365.aClass8_5.la(local8);
			}
			local367.anInt4091 = (int) (local8.aFloat164 + (float) this.anIntArray577[local365.anInt4093] * local8.aFloat165 + (float) this.anIntArray578[local365.anInt4093] * local8.aFloat166 + (float) this.anIntArray575[local365.anInt4093] * local8.aFloat163);
			local367.anInt4086 = (int) (local8.aFloat162 + local8.aFloat158 * (float) this.anIntArray578[local365.anInt4093] + local8.aFloat159 * (float) this.anIntArray575[local365.anInt4093] + (float) this.anIntArray577[local365.anInt4093] * local8.aFloat167);
			local367.anInt4089 = (int) (local8.aFloat160 + (float) this.anIntArray577[local365.anInt4093] * local8.aFloat169 + local8.aFloat168 * (float) this.anIntArray575[local365.anInt4093] + (float) this.anIntArray578[local365.anInt4093] * local8.aFloat161);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	private void method6764() {
		if (this.aClass76Array1 == null) {
			return;
		}
		@Pc(8) Class8_Sub2 local8 = this.aClass9_Sub2_33.aClass8_Sub2_2;
		@Pc(12) float local12 = this.aClass9_Sub2_33.method769();
		@Pc(16) float local16 = this.aClass9_Sub2_33.method757();
		this.aClass9_Sub2_33.method781();
		this.aClass9_Sub2_33.method5455(false);
		this.aClass9_Sub2_33.method826(false);
		this.aClass9_Sub2_33.method805(this.aClass9_Sub2_33.aClass166_2, this.aClass9_Sub2_33.aClass166_1, null, null);
		for (@Pc(43) int local43 = 0; local43 < this.anInt8109; local43++) {
			@Pc(50) Class76 local50 = this.aClass76Array1[local43];
			@Pc(55) Class326 local55 = this.aClass326Array1[local43];
			if (!local50.aBoolean205 || !this.aClass9_Sub2_33.method5398()) {
				@Pc(84) float local84 = (float) (this.anIntArray578[local50.anInt2372] + this.anIntArray578[local50.anInt2371] + this.anIntArray578[local50.anInt2369]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray575[local50.anInt2369] + this.anIntArray575[local50.anInt2372] + this.anIntArray575[local50.anInt2371]) * 0.3333333F;
				@Pc(129) float local129 = (float) (this.anIntArray577[local50.anInt2372] + this.anIntArray577[local50.anInt2371] + this.anIntArray577[local50.anInt2369]) * 0.3333333F;
				@Pc(143) float local143 = Static350.aFloat124 + Static175.aFloat93 * local84 + Static394.aFloat173 * local106 + local129 * Static143.aFloat52;
				@Pc(157) float local157 = local129 * Static510.aFloat151 + Static230.aFloat106 * local84 + Static40.aFloat37 * local106 + Static240.aFloat119;
				@Pc(171) float local171 = local129 * Static486.aFloat186 + Static187.aFloat94 * local84 + Static64.aFloat42 * local106 + Static150.aFloat172;
				local8.method6059(local55.anInt9256, local50.aShort25 * local55.anInt9255 >> 7, -local171, (float) local55.anInt9254 + local143, (float) local55.anInt9247 - local157, local55.anInt9251 * local50.aShort23 >> 7);
				this.aClass9_Sub2_33.method760(local8);
				this.aClass9_Sub2_33.ka(local16, local12 - (float) local50.anInt2370 * 1.5F);
				@Pc(221) int local221 = local55.anInt9252;
				OpenGL.glColor4ub((byte) (local221 >> 16), (byte) (local221 >> 8), (byte) local221, (byte) (local221 >> 24));
				this.aClass9_Sub2_33.method747(local50.aShort24);
				this.aClass9_Sub2_33.method804(local50.aByte30);
				this.aClass9_Sub2_33.method784(4);
			}
		}
		this.aClass9_Sub2_33.ka(local16, local12);
		this.aClass9_Sub2_33.method5455(true);
		this.aClass9_Sub2_33.method783();
	}

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8074; local3++) {
			if (arg0 != 128) {
				this.anIntArray578[local3] = this.anIntArray578[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray575[local3] = arg1 * this.anIntArray575[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray577[local3] = this.anIntArray577[local3] * arg2 >> 7;
			}
		}
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
		this.aBoolean596 = false;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	private void method6766() {
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = 32767;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt8074; local31++) {
			@Pc(38) int local38 = this.anIntArray578[local31];
			@Pc(43) int local43 = this.anIntArray575[local31];
			if (local23 < local43) {
				local23 = local43;
			}
			if (local38 < local15) {
				local15 = local38;
			}
			if (local38 > local21) {
				local21 = local38;
			}
			if (local43 < local17) {
				local17 = local43;
			}
			@Pc(80) int local80 = this.anIntArray577[local31];
			if (local25 < local80) {
				local25 = local80;
			}
			if (local19 > local80) {
				local19 = local80;
			}
			@Pc(102) int local102 = local38 * local38 + local80 * local80;
			if (local102 > local27) {
				local27 = local102;
			}
			local102 = local80 * local80 + local38 * local38 + local43 * local43;
			if (local102 > local29) {
				local29 = local102;
			}
		}
		this.aShort91 = (short) local19;
		this.aShort85 = (short) local17;
		this.aShort87 = (short) local25;
		this.aShort93 = (short) local21;
		this.aShort86 = (short) local15;
		this.aShort88 = (short) local23;
		this.aShort92 = (short) (Math.sqrt((double) local27) + 0.99D);
		Math.sqrt((double) local29);
		this.aBoolean596 = true;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()V")
	@Override
	public void method7069() {
		if (this.anInt8104 <= 0 || this.anInt8075 <= 0) {
			return;
		}
		this.method6760(false);
		if ((this.aByte96 & 0x10) == 0 && this.aClass304_1.anInterface3_4 == null) {
			this.method6761(false);
		}
		this.method6758();
	}

	@OriginalMember(owner = "client!rh", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8063; local7++) {
			if (arg0 == this.aShortArray115[local7]) {
				this.aShortArray115[local7] = arg1;
			}
		}
		if (this.aClass76Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt8109; local30++) {
				@Pc(37) Class76 local37 = this.aClass76Array1[local30];
				@Pc(42) Class326 local42 = this.aClass326Array1[local30];
				local42.anInt9252 = local42.anInt9252 & 0xFF000000 | Static223.anIntArray301[this.aShortArray115[local37.anInt2373] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass166_12 != null) {
			this.aClass166_12.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static20.anInt6004 = 0;
			local11 = 0;
			Static552.anInt8650 = 0;
			Static556.anInt9486 = 0;
			for (local17 = 0; local17 < this.anInt8074; local17++) {
				Static552.anInt8650 += this.anIntArray578[local17];
				Static20.anInt6004 += this.anIntArray575[local17];
				local11++;
				Static556.anInt9486 += this.anIntArray577[local17];
			}
			if (local11 > 0) {
				Static552.anInt8650 = arg1 + Static552.anInt8650 / local11;
				Static556.anInt9486 = Static556.anInt9486 / local11 + arg3;
				Static20.anInt6004 = arg2 + Static20.anInt6004 / local11;
			} else {
				Static556.anInt9486 = arg3;
				Static20.anInt6004 = arg2;
				Static552.anInt8650 = arg1;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt8074; local11++) {
				this.anIntArray578[local11] += arg1;
				this.anIntArray575[local11] += arg2;
				this.anIntArray577[local11] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt8074; local11++) {
					this.anIntArray578[local11] -= Static552.anInt8650;
					this.anIntArray575[local11] -= Static20.anInt6004;
					this.anIntArray577[local11] -= Static556.anInt9486;
					if (arg3 != 0) {
						local17 = Class179.anIntArray756[arg3];
						local164 = Class179.anIntArray757[arg3];
						local182 = this.anIntArray575[local11] * local17 + this.anIntArray578[local11] * local164 + 16383 >> 14;
						this.anIntArray575[local11] = this.anIntArray575[local11] * local164 + 16383 - this.anIntArray578[local11] * local17 >> 14;
						this.anIntArray578[local11] = local182;
					}
					if (arg1 != 0) {
						local17 = Class179.anIntArray756[arg1];
						local164 = Class179.anIntArray757[arg1];
						local182 = this.anIntArray575[local11] * local164 + 16383 - local17 * this.anIntArray577[local11] >> 14;
						this.anIntArray577[local11] = this.anIntArray575[local11] * local17 + local164 * this.anIntArray577[local11] + 16383 >> 14;
						this.anIntArray575[local11] = local182;
					}
					if (arg2 != 0) {
						local17 = Class179.anIntArray756[arg2];
						local164 = Class179.anIntArray757[arg2];
						local182 = local164 * this.anIntArray578[local11] + this.anIntArray577[local11] * local17 + 16383 >> 14;
						this.anIntArray577[local11] = local164 * this.anIntArray577[local11] + 16383 - local17 * this.anIntArray578[local11] >> 14;
						this.anIntArray578[local11] = local182;
					}
					this.anIntArray578[local11] += Static552.anInt8650;
					this.anIntArray575[local11] += Static20.anInt6004;
					this.anIntArray577[local11] += Static556.anInt9486;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt8074; local11++) {
					this.anIntArray578[local11] -= Static552.anInt8650;
					this.anIntArray575[local11] -= Static20.anInt6004;
					this.anIntArray577[local11] -= Static556.anInt9486;
					this.anIntArray578[local11] = this.anIntArray578[local11] * arg1 / 128;
					this.anIntArray575[local11] = this.anIntArray575[local11] * arg2 / 128;
					this.anIntArray577[local11] = this.anIntArray577[local11] * arg3 / 128;
					this.anIntArray578[local11] += Static552.anInt8650;
					this.anIntArray575[local11] += Static20.anInt6004;
					this.anIntArray577[local11] += Static556.anInt9486;
				}
			} else {
				@Pc(515) Class76 local515;
				@Pc(520) Class326 local520;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt8063; local11++) {
						local17 = arg1 * 8 + (this.aByteArray97[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray97[local11] = (byte) local17;
					}
					if (this.aClass166_12 != null) {
						this.aClass166_12.anInterface18_3 = null;
					}
					if (this.aClass76Array1 != null) {
						for (local17 = 0; local17 < this.anInt8109; local17++) {
							local515 = this.aClass76Array1[local17];
							local520 = this.aClass326Array1[local17];
							local520.anInt9252 = local520.anInt9252 & 0xFFFFFF | 255 - (this.aByteArray97[local515.anInt2373] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt8063; local11++) {
						local17 = this.aShortArray115[local11] & 0xFFFF;
						local164 = local17 >> 10 & 0x3F;
						local182 = local17 >> 7 & 0x7;
						@Pc(581) int local581 = arg1 + local164 & 0x3F;
						local182 += arg2 / 4;
						@Pc(591) int local591 = local17 & 0x7F;
						local591 += arg3;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						if (local591 < 0) {
							local591 = 0;
						} else if (local591 > 127) {
							local591 = 127;
						}
						this.aShortArray115[local11] = (short) (local591 | local581 << 10 | local182 << 7);
					}
					if (this.aClass166_12 != null) {
						this.aClass166_12.anInterface18_3 = null;
					}
					if (this.aClass76Array1 != null) {
						for (local17 = 0; local17 < this.anInt8109; local17++) {
							local515 = this.aClass76Array1[local17];
							local520 = this.aClass326Array1[local17];
							local520.anInt9252 = local520.anInt9252 & 0xFF000000 | Static223.anIntArray301[this.aShortArray115[local515.anInt2373] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(703) Class326 local703;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt8109; local11++) {
							local703 = this.aClass326Array1[local11];
							local703.anInt9254 += arg1;
							local703.anInt9247 += arg2;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt8109; local11++) {
							local703 = this.aClass326Array1[local11];
							local703.anInt9255 = local703.anInt9255 * arg2 >> 7;
							local703.anInt9251 = arg1 * local703.anInt9251 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt8109; local11++) {
							local703 = this.aClass326Array1[local11];
							local703.anInt9256 = arg1 + local703.anInt9256 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBSBI)I")
	private int method6767(@OriginalArg(0) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static223.anIntArray301[Static396.method6257(arg0, arg3)];
		if (arg1 != -1) {
			@Pc(31) Class296 local31 = this.aClass9_Sub2_33.anInterface2_11.method3585(arg1 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte103 & 0xFF;
			@Pc(48) int local48;
			@Pc(74) int local74;
			if (local36 != 0) {
				if (arg0 < 0) {
					local48 = 0;
				} else if (arg0 > 127) {
					local48 = 16777215;
				} else {
					local48 = arg0 * 131586;
				}
				if (local36 == 256) {
					local12 = local48;
				} else {
					local74 = 256 - local36;
					local12 = (local74 * (local12 & 0xFF00) + local36 * (local48 & 0xFF00) & 0xFF0000) + (local74 * (local12 & 0xFF00FF) + (local48 & 0xFF00FF) * local36 & 0xFF00FF00) >> 8;
				}
			}
			local48 = local31.aByte101 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(120) int local120 = (local12 >> 16 & 0xFF) * local48;
				if (local120 > 65535) {
					local120 = 65535;
				}
				local74 = (local12 >> 8 & 0xFF) * local48;
				if (local74 > 65535) {
					local74 = 65535;
				}
				@Pc(144) int local144 = (local12 & 0xFF) * local48;
				if (local144 > 65535) {
					local144 = 65535;
				}
				local12 = (local144 >> 8) + (local74 & 0xFF00) + (local120 << 8 & 0xFF0074);
			}
		}
		return (local12 << 8) - ((arg2 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!rh", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8074; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray575[local15] - this.anIntArray577[local15] * local9 >> 14;
			this.anIntArray577[local15] = this.anIntArray575[local15] * local9 + local13 * this.anIntArray577[local15] >> 14;
			this.anIntArray575[local15] = local34;
		}
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
		this.aBoolean596 = false;
	}

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8074; local7++) {
			this.anIntArray577[local7] = -this.anIntArray577[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt8104; local25++) {
			this.aShortArray111[local25] = (short) -this.aShortArray111[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt8063; local48++) {
			@Pc(55) short local55 = this.aShortArray117[local48];
			this.aShortArray117[local48] = this.aShortArray108[local48];
			this.aShortArray108[local48] = local55;
		}
		if (this.aClass166_10 == null && this.aClass166_12 != null) {
			this.aClass166_12.anInterface18_3 = null;
		}
		if (this.aClass166_10 != null) {
			this.aClass166_10.anInterface18_3 = null;
		}
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
		if (this.aClass304_1 != null) {
			this.aClass304_1.anInterface3_4 = null;
		}
		this.aBoolean596 = false;
	}

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort89;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()[Lclient!dg;")
	@Override
	public Class69[] method7080() {
		return this.aClass69Array4;
	}

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean596) {
			this.method6766();
		}
		return this.aShort87;
	}

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class179.anIntArray756[arg0];
		@Pc(13) int local13 = Class179.anIntArray757[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8074; local15++) {
			local33 = this.anIntArray578[local15] * local13 + this.anIntArray577[local15] * local9 >> 14;
			this.anIntArray577[local15] = this.anIntArray577[local15] * local13 - this.anIntArray578[local15] * local9 >> 14;
			this.anIntArray578[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8104; local33++) {
			@Pc(84) int local84 = this.aShortArray111[local33] * local9 + local13 * this.aShortArray109[local33] >> 14;
			this.aShortArray111[local33] = (short) (local13 * this.aShortArray111[local33] - local9 * this.aShortArray109[local33] >> 14);
			this.aShortArray109[local33] = (short) local84;
		}
		if (this.aClass166_10 == null && this.aClass166_12 != null) {
			this.aClass166_12.anInterface18_3 = null;
		}
		if (this.aClass166_10 != null) {
			this.aClass166_10.anInterface18_3 = null;
		}
		this.aBoolean596 = false;
		if (this.aClass166_11 != null) {
			this.aClass166_11.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()Z")
	@Override
	public boolean method7066() {
		if (this.aShortArray110 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray110.length; local12++) {
			if (this.aShortArray110[local12] != -1 && !this.aClass9_Sub2_33.anInterface2_11.method3583(this.aShortArray110[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZLclient!rh;Lclient!rh;ZI)Lclient!ba;")
	private Class23 method6768(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class23_Sub2 arg1, @OriginalArg(3) Class23_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		arg2.anInt8115 = arg4;
		arg2.anInt8075 = this.anInt8075;
		arg2.aShort89 = this.aShort89;
		arg2.anInt8109 = this.anInt8109;
		arg2.aShort90 = this.aShort90;
		arg2.anInt8104 = this.anInt8104;
		arg2.anInt8074 = this.anInt8074;
		arg2.anInt8093 = this.anInt8093;
		arg2.aByte96 = 0;
		arg2.anInt8091 = this.anInt8091;
		arg2.anInt8063 = this.anInt8063;
		@Pc(59) boolean local59 = Static155.method6197(arg4, this.anInt8093);
		@Pc(67) boolean local67 = Static184.method3598(arg4, this.anInt8093);
		@Pc(75) boolean local75 = Static104.method6577(this.anInt8093, arg4);
		@Pc(81) boolean local81 = local75 | local67 | local59;
		@Pc(200) int local200;
		if (local81) {
			if (!local59) {
				arg2.anIntArray578 = this.anIntArray578;
			} else if (arg1.anIntArray578 == null || arg1.anIntArray578.length < this.anInt8091) {
				arg2.anIntArray578 = arg1.anIntArray578 = new int[this.anInt8091];
			} else {
				arg2.anIntArray578 = arg1.anIntArray578;
			}
			if (!local67) {
				arg2.anIntArray575 = this.anIntArray575;
			} else if (arg1.anIntArray575 == null || arg1.anIntArray575.length < this.anInt8091) {
				arg2.anIntArray575 = arg1.anIntArray575 = new int[this.anInt8091];
			} else {
				arg2.anIntArray575 = arg1.anIntArray575;
			}
			if (!local75) {
				arg2.anIntArray577 = this.anIntArray577;
			} else if (arg1.anIntArray577 == null || arg1.anIntArray577.length < this.anInt8091) {
				arg2.anIntArray577 = arg1.anIntArray577 = new int[this.anInt8091];
			} else {
				arg2.anIntArray577 = arg1.anIntArray577;
			}
			for (local200 = 0; local200 < this.anInt8091; local200++) {
				if (local59) {
					arg2.anIntArray578[local200] = this.anIntArray578[local200];
				}
				if (local67) {
					arg2.anIntArray575[local200] = this.anIntArray575[local200];
				}
				if (local75) {
					arg2.anIntArray577[local200] = this.anIntArray577[local200];
				}
			}
		} else {
			arg2.anIntArray575 = this.anIntArray575;
			arg2.anIntArray577 = this.anIntArray577;
			arg2.anIntArray578 = this.anIntArray578;
		}
		if (Static155.method6202(this.anInt8093, arg4)) {
			if (arg3) {
				arg2.aByte96 = (byte) (arg2.aByte96 | 0x1);
			}
			arg2.aClass166_11 = arg1.aClass166_11;
			arg2.aClass166_11.anInterface18_3 = this.aClass166_11.anInterface18_3;
			arg2.aClass166_11.aByte49 = this.aClass166_11.aByte49;
		} else if (Static93.method2045(arg4, this.anInt8093)) {
			arg2.aClass166_11 = this.aClass166_11;
		} else {
			arg2.aClass166_11 = null;
		}
		if (Static52.method1233(arg4, this.anInt8093)) {
			if (arg1.aShortArray115 == null || arg1.aShortArray115.length < this.anInt8063) {
				arg2.aShortArray115 = arg1.aShortArray115 = new short[this.anInt8063];
			} else {
				arg2.aShortArray115 = arg1.aShortArray115;
			}
			for (local200 = 0; local200 < this.anInt8063; local200++) {
				arg2.aShortArray115[local200] = this.aShortArray115[local200];
			}
		} else {
			arg2.aShortArray115 = this.aShortArray115;
		}
		if (Static249.method4397(this.anInt8093, arg4)) {
			if (arg1.aByteArray97 == null || this.anInt8063 > arg1.aByteArray97.length) {
				arg2.aByteArray97 = arg1.aByteArray97 = new byte[this.anInt8063];
			} else {
				arg2.aByteArray97 = arg1.aByteArray97;
			}
			for (local200 = 0; local200 < this.anInt8063; local200++) {
				arg2.aByteArray97[local200] = this.aByteArray97[local200];
			}
		} else {
			arg2.aByteArray97 = this.aByteArray97;
		}
		if (Static401.method6295(this.anInt8093, arg4)) {
			arg2.aClass166_12 = arg1.aClass166_12;
			if (arg3) {
				arg2.aByte96 = (byte) (arg2.aByte96 | 0x2);
			}
			arg2.aClass166_12.anInterface18_3 = this.aClass166_12.anInterface18_3;
			arg2.aClass166_12.aByte49 = this.aClass166_12.aByte49;
		} else if (Static515.method7180(this.anInt8093, arg4)) {
			arg2.aClass166_12 = this.aClass166_12;
		} else {
			arg2.aClass166_12 = null;
		}
		@Pc(582) int local582;
		if (Static181.method1443(this.anInt8093, arg4)) {
			if (arg1.aShortArray109 == null || arg1.aShortArray109.length < this.anInt8104) {
				local200 = this.anInt8104;
				arg2.aShortArray111 = arg1.aShortArray111 = new short[local200];
				arg2.aShortArray116 = arg1.aShortArray116 = new short[local200];
				arg2.aShortArray109 = arg1.aShortArray109 = new short[local200];
			} else {
				arg2.aShortArray111 = arg1.aShortArray111;
				arg2.aShortArray109 = arg1.aShortArray109;
				arg2.aShortArray116 = arg1.aShortArray116;
			}
			if (this.aClass35_1 == null) {
				for (local200 = 0; local200 < this.anInt8104; local200++) {
					arg2.aShortArray109[local200] = this.aShortArray109[local200];
					arg2.aShortArray116[local200] = this.aShortArray116[local200];
					arg2.aShortArray111[local200] = this.aShortArray111[local200];
				}
			} else {
				if (arg1.aClass35_1 == null) {
					arg1.aClass35_1 = new Class35();
				}
				@Pc(566) Class35 local566 = arg2.aClass35_1 = arg1.aClass35_1;
				if (local566.aShortArray14 == null || this.anInt8104 > local566.aShortArray14.length) {
					local582 = this.anInt8104;
					local566.aByteArray24 = new byte[local582];
					local566.aShortArray15 = new short[local582];
					local566.aShortArray14 = new short[local582];
					local566.aShortArray16 = new short[local582];
				}
				for (local582 = 0; local582 < this.anInt8104; local582++) {
					arg2.aShortArray109[local582] = this.aShortArray109[local582];
					arg2.aShortArray116[local582] = this.aShortArray116[local582];
					arg2.aShortArray111[local582] = this.aShortArray111[local582];
					local566.aShortArray14[local582] = this.aClass35_1.aShortArray14[local582];
					local566.aShortArray16[local582] = this.aClass35_1.aShortArray16[local582];
					local566.aShortArray15[local582] = this.aClass35_1.aShortArray15[local582];
					local566.aByteArray24[local582] = this.aClass35_1.aByteArray24[local582];
				}
			}
			arg2.aByteArray96 = this.aByteArray96;
		} else {
			arg2.aShortArray111 = this.aShortArray111;
			arg2.aClass35_1 = this.aClass35_1;
			arg2.aShortArray109 = this.aShortArray109;
			arg2.aByteArray96 = this.aByteArray96;
			arg2.aShortArray116 = this.aShortArray116;
		}
		if (Static90.method2002(this.anInt8093, arg4)) {
			arg2.aClass166_10 = arg1.aClass166_10;
			if (arg3) {
				arg2.aByte96 = (byte) (arg2.aByte96 | 0x4);
			}
			arg2.aClass166_10.aByte49 = this.aClass166_10.aByte49;
			arg2.aClass166_10.anInterface18_3 = this.aClass166_10.anInterface18_3;
		} else if (Static334.method5311(arg4, this.anInt8093)) {
			arg2.aClass166_10 = this.aClass166_10;
		} else {
			arg2.aClass166_10 = null;
		}
		if (Static370.method5898(arg4, this.anInt8093)) {
			if (arg1.aFloatArray60 == null || this.anInt8063 > arg1.aFloatArray60.length) {
				local200 = this.anInt8104;
				arg2.aFloatArray60 = arg1.aFloatArray60 = new float[local200];
				arg2.aFloatArray59 = arg1.aFloatArray59 = new float[local200];
			} else {
				arg2.aFloatArray60 = arg1.aFloatArray60;
				arg2.aFloatArray59 = arg1.aFloatArray59;
			}
			for (local200 = 0; local200 < this.anInt8104; local200++) {
				arg2.aFloatArray60[local200] = this.aFloatArray60[local200];
				arg2.aFloatArray59[local200] = this.aFloatArray59[local200];
			}
		} else {
			arg2.aFloatArray60 = this.aFloatArray60;
			arg2.aFloatArray59 = this.aFloatArray59;
		}
		if (Static538.method7765(arg4, this.anInt8093)) {
			if (arg3) {
				arg2.aByte96 = (byte) (arg2.aByte96 | 0x8);
			}
			arg2.aClass166_13 = arg1.aClass166_13;
			arg2.aClass166_13.aByte49 = this.aClass166_13.aByte49;
			arg2.aClass166_13.anInterface18_3 = this.aClass166_13.anInterface18_3;
		} else if (Static174.method3505(this.anInt8093, arg4)) {
			arg2.aClass166_13 = this.aClass166_13;
		} else {
			arg2.aClass166_13 = null;
		}
		if (Static61.method1332(this.anInt8093, arg4)) {
			if (arg1.aShortArray117 == null || this.anInt8063 > arg1.aShortArray117.length) {
				local200 = this.anInt8063;
				arg2.aShortArray118 = arg1.aShortArray118 = new short[local200];
				arg2.aShortArray117 = arg1.aShortArray117 = new short[local200];
				arg2.aShortArray108 = arg1.aShortArray108 = new short[local200];
			} else {
				arg2.aShortArray108 = arg1.aShortArray108;
				arg2.aShortArray117 = arg1.aShortArray117;
				arg2.aShortArray118 = arg1.aShortArray118;
			}
			for (local200 = 0; local200 < this.anInt8063; local200++) {
				arg2.aShortArray117[local200] = this.aShortArray117[local200];
				arg2.aShortArray118[local200] = this.aShortArray118[local200];
				arg2.aShortArray108[local200] = this.aShortArray108[local200];
			}
		} else {
			arg2.aShortArray108 = this.aShortArray108;
			arg2.aShortArray117 = this.aShortArray117;
			arg2.aShortArray118 = this.aShortArray118;
		}
		if (Static329.method5265(arg4, this.anInt8093)) {
			arg2.aClass304_1 = arg1.aClass304_1;
			if (arg3) {
				arg2.aByte96 = (byte) (arg2.aByte96 | 0x10);
			}
			arg2.aClass304_1.anInterface3_4 = this.aClass304_1.anInterface3_4;
		} else if (Static90.method2003(arg4, this.anInt8093)) {
			arg2.aClass304_1 = this.aClass304_1;
		} else {
			arg2.aClass304_1 = null;
		}
		if (Static293.method4804(arg4, this.anInt8093)) {
			if (arg1.aShortArray110 == null || arg1.aShortArray110.length < this.anInt8063) {
				local200 = this.anInt8063;
				arg2.aShortArray110 = arg1.aShortArray110 = new short[local200];
			} else {
				arg2.aShortArray110 = arg1.aShortArray110;
			}
			for (local200 = 0; local200 < this.anInt8063; local200++) {
				arg2.aShortArray110[local200] = this.aShortArray110[local200];
			}
		} else {
			arg2.aShortArray110 = this.aShortArray110;
		}
		if (!Static440.method6726(this.anInt8093, arg4)) {
			arg2.aClass326Array1 = this.aClass326Array1;
		} else if (arg1.aClass326Array1 == null || this.anInt8109 > arg1.aClass326Array1.length) {
			local200 = this.anInt8109;
			arg2.aClass326Array1 = arg1.aClass326Array1 = new Class326[local200];
			for (local582 = 0; local582 < this.anInt8109; local582++) {
				arg2.aClass326Array1[local582] = this.aClass326Array1[local582].method7761();
			}
		} else {
			arg2.aClass326Array1 = arg1.aClass326Array1;
			for (local200 = 0; local200 < this.anInt8109; local200++) {
				arg2.aClass326Array1[local200].method7760(this.aClass326Array1[local200]);
			}
		}
		arg2.aClass128Array4 = this.aClass128Array4;
		arg2.aShortArray114 = this.aShortArray114;
		arg2.anIntArray576 = this.anIntArray576;
		arg2.aClass69Array4 = this.aClass69Array4;
		arg2.aShortArray112 = this.aShortArray112;
		arg2.aShortArray113 = this.aShortArray113;
		arg2.anIntArrayArray51 = this.anIntArrayArray51;
		arg2.anIntArrayArray50 = this.anIntArrayArray50;
		arg2.anIntArray579 = this.anIntArray579;
		arg2.anIntArrayArray52 = this.anIntArrayArray52;
		if (this.aBoolean596) {
			arg2.aShort93 = this.aShort93;
			arg2.aShort86 = this.aShort86;
			arg2.aShort85 = this.aShort85;
			arg2.aShort91 = this.aShort91;
			arg2.aShort88 = this.aShort88;
			arg2.aShort92 = this.aShort92;
			arg2.aBoolean596 = true;
			arg2.aShort87 = this.aShort87;
		} else {
			arg2.aBoolean596 = false;
		}
		arg2.aClass76Array1 = this.aClass76Array1;
		return arg2;
	}
}
