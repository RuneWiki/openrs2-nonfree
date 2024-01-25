import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
	private int anInt1704;

	@OriginalMember(owner = "client!cfa", name = "p", descriptor = "Z")
	private boolean aBoolean126;

	@OriginalMember(owner = "client!cfa", name = "r", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_3;

	@OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
	private int anInt1714;

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "I")
	private int anInt1717;

	@OriginalMember(owner = "client!cfa", name = "N", descriptor = "I")
	private int anInt1721;

	@OriginalMember(owner = "client!cfa", name = "P", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "client!cfa", name = "S", descriptor = "I")
	private int anInt1725;

	@OriginalMember(owner = "client!cfa", name = "V", descriptor = "Z")
	private boolean aBoolean128;

	@OriginalMember(owner = "client!cfa", name = "ab", descriptor = "I")
	private int anInt1728;

	@OriginalMember(owner = "client!cfa", name = "fb", descriptor = "Lclient!rv;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!cfa", name = "mb", descriptor = "I")
	private int anInt1737;

	@OriginalMember(owner = "client!cfa", name = "Fb", descriptor = "I")
	private int anInt1750;

	@OriginalMember(owner = "client!cfa", name = "Jb", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!cfa", name = "Kb", descriptor = "Lclient!rv;")
	private Class293 aClass293_2;

	@OriginalMember(owner = "client!cfa", name = "Pb", descriptor = "I")
	private int anInt1756;

	@OriginalMember(owner = "client!cfa", name = "Tb", descriptor = "Lclient!nt;")
	private Class229 aClass229_1;

	@OriginalMember(owner = "client!cfa", name = "Vb", descriptor = "I")
	private int anInt1760;

	@OriginalMember(owner = "client!cfa", name = "Wb", descriptor = "Lclient!tu;")
	private Class324 aClass324_1;

	@OriginalMember(owner = "client!cfa", name = "hc", descriptor = "Lclient!rv;")
	private Class293 aClass293_3;

	@OriginalMember(owner = "client!cfa", name = "tc", descriptor = "Lclient!rv;")
	private Class293 aClass293_4;

	@OriginalMember(owner = "client!cfa", name = "mc", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!cfa", name = "tb", descriptor = "I")
	private int anInt1742;

	@OriginalMember(owner = "client!cfa", name = "zc", descriptor = "I")
	private int anInt1776;

	@OriginalMember(owner = "client!cfa", name = "Rb", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
	private int anInt1710;

	@OriginalMember(owner = "client!cfa", name = "A", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!cfa", name = "ub", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!cfa", name = "wb", descriptor = "I")
	private int anInt1744;

	@OriginalMember(owner = "client!cfa", name = "nc", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!cfa", name = "t", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!cfa", name = "ob", descriptor = "[Lclient!rea;")
	private Class280[] aClass280Array1;

	@OriginalMember(owner = "client!cfa", name = "zb", descriptor = "[Lclient!ti;")
	private Class317[] aClass317Array1;

	@OriginalMember(owner = "client!cfa", name = "ib", descriptor = "I")
	private int anInt1735;

	@OriginalMember(owner = "client!cfa", name = "lc", descriptor = "[Lclient!dea;")
	private Class66[] aClass66Array1;

	@OriginalMember(owner = "client!cfa", name = "dc", descriptor = "[Lclient!in;")
	private Class148[] aClass148Array1;

	@OriginalMember(owner = "client!cfa", name = "kc", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!cfa", name = "Xb", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!cfa", name = "Yb", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!cfa", name = "Ob", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!cfa", name = "T", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!cfa", name = "D", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!cfa", name = "Ab", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!cfa", name = "y", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!cfa", name = "W", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!cfa", name = "Ec", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!cfa", name = "ic", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!cfa", name = "pc", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!cfa", name = "u", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!cfa", name = "qc", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!cfa", name = "X", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!cfa", name = "w", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!cfa", name = "Y", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!cfa", name = "Cc", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!cfa", name = "Ib", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!cfa", name = "jb", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!cfa", name = "nb", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!cfa", name = "ec", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!cfa", name = "Mb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!cfa", name = "Ic", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!rr;Lclient!uo;IIII)V")
	public Class52_Sub1(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_14;
		@Pc(15) int[] local15 = new int[arg1.anInt9552];
		this.anIntArray55 = new int[arg1.anInt9546 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt9552; local24++) {
			if ((arg1.aByteArray223 == null || arg1.aByteArray223[local24] != 2) && (arg1.aShortArray132 == null || arg1.aShortArray132[local24] == -1 || !local11.method7229(arg1.aShortArray132[local24] & 0xFFFF).aBoolean357)) {
				local15[this.anInt1742++] = local24;
				this.anIntArray55[arg1.aShortArray135[local24]]++;
				this.anIntArray55[arg1.aShortArray138[local24]]++;
				this.anIntArray55[arg1.aShortArray137[local24]]++;
			}
		}
		this.anInt1776 = this.anInt1742;
		@Pc(112) long[] local112 = new long[this.anInt1742];
		@Pc(124) boolean local124 = (this.anInt1704 & 0x100) != 0;
		@Pc(136) int local136;
		@Pc(299) int local299;
		for (@Pc(126) int local126 = 0; local126 < this.anInt1742; local126++) {
			@Pc(132) int local132 = local15[local126];
			@Pc(134) Class172 local134 = null;
			local136 = 0;
			@Pc(138) byte local138 = 0;
			@Pc(140) byte local140 = 0;
			@Pc(142) byte local142 = 0;
			if (arg1.aClass10Array1 != null) {
				@Pc(147) boolean local147 = false;
				for (@Pc(149) int local149 = 0; local149 < arg1.aClass10Array1.length; local149++) {
					@Pc(156) Class10 local156 = arg1.aClass10Array1[local149];
					if (local132 == local156.anInt88) {
						@Pc(165) Class75 local165 = Static487.method6594(local156.anInt89);
						if (local165.aBoolean183) {
							local147 = true;
						}
						if (local165.anInt2593 != -1) {
							@Pc(181) Class172 local181 = local11.method7229(local165.anInt2593);
							if (local181.aBoolean351) {
								this.aBoolean129 = true;
							}
						}
					}
				}
				if (local147) {
					local112[local126] = Long.MAX_VALUE;
					this.anInt1776--;
					continue;
				}
			}
			@Pc(209) short local209 = -1;
			if (arg1.aShortArray132 != null) {
				local209 = arg1.aShortArray132[local132];
				if (local209 != -1) {
					local134 = local11.method7229(local209 & 0xFFFF);
					local140 = local134.aByte62;
					local142 = local134.aByte60;
				}
			}
			@Pc(261) boolean local261 = arg1.aByteArray224 != null && arg1.aByteArray224[local132] != 0 || local134 != null && !local134.aBoolean350 | local134.aBoolean351;
			if ((local124 || local261) && arg1.aByteArray227 != null) {
				local136 += arg1.aByteArray227[local132] << 17;
			}
			if (local261) {
				local136 += 65536;
			}
			local136 += (local140 & 0xFF) << 8;
			local299 = local138 + ((local209 & 0xFFFF) << 16);
			local136 += local142 & 0xFF;
			@Pc(311) int local311 = local299 + (local126 & 0xFFFF);
			local112[local126] = (long) local311 + ((long) local136 << 32);
			this.aBoolean129 |= local261;
		}
		Static107.method2199(local112, local15);
		this.anInt1710 = arg1.anInt9546;
		this.anIntArray49 = arg1.anIntArray548;
		this.anIntArray52 = arg1.anIntArray555;
		this.anInt1744 = arg1.anInt9541;
		this.aShortArray18 = arg1.aShortArray134;
		this.anIntArray48 = arg1.anIntArray550;
		this.aClass280Array1 = arg1.aClass280Array4;
		@Pc(372) Class336[] local372 = new Class336[this.anInt1710];
		this.aClass317Array1 = arg1.aClass317Array4;
		@Pc(396) int local396;
		@Pc(410) int local410;
		if (arg1.aClass10Array1 != null) {
			this.anInt1735 = arg1.aClass10Array1.length;
			this.aClass66Array1 = new Class66[this.anInt1735];
			this.aClass148Array1 = new Class148[this.anInt1735];
			for (local396 = 0; local396 < this.anInt1735; local396++) {
				@Pc(403) Class10 local403 = arg1.aClass10Array1[local396];
				@Pc(408) Class75 local408 = Static487.method6594(local403.anInt89);
				local410 = -1;
				for (@Pc(412) int local412 = 0; local412 < this.anInt1742; local412++) {
					if (local403.anInt88 == local15[local412]) {
						local410 = local412;
						break;
					}
				}
				if (local410 == -1) {
					throw new RuntimeException();
				}
				@Pc(453) int local453 = Static422.anIntArray428[arg1.aShortArray136[local403.anInt88] & 0xFFFF] & 0xFFFFFF;
				@Pc(470) int local470 = local453 | 255 - (arg1.aByteArray224 == null ? 0 : arg1.aByteArray224[local403.anInt88]) << 24;
				this.aClass148Array1[local396] = new Class148(local410, arg1.aShortArray135[local403.anInt88], arg1.aShortArray138[local403.anInt88], arg1.aShortArray137[local403.anInt88], local408.anInt2600, local408.anInt2602, local408.anInt2593, local408.anInt2592, local408.anInt2601, local408.aBoolean183, local408.aBoolean184, local403.anInt86);
				this.aClass66Array1[local396] = new Class66(local470);
			}
		}
		local396 = this.anInt1742 * 3;
		this.aShortArray17 = new short[local396];
		this.aShort19 = (short) arg4;
		this.aShortArray15 = new short[this.anInt1742];
		this.aShortArray14 = new short[local396];
		this.aFloatArray23 = new float[local396];
		this.aShortArray10 = new short[this.anInt1742];
		this.aShortArray13 = new short[local396];
		Static196.aLongArray4 = new long[local396];
		this.aByteArray20 = new byte[this.anInt1742];
		this.aShortArray11 = new short[local396];
		this.aShortArray20 = new short[this.anInt1742];
		this.aShortArray16 = new short[local396];
		this.aFloatArray24 = new float[local396];
		this.aShortArray8 = new short[this.anInt1742];
		this.aShortArray19 = new short[this.anInt1742];
		if (arg1.aShortArray131 != null) {
			this.aShortArray12 = new short[this.anInt1742];
		}
		this.aShortArray9 = new short[local396];
		this.aShort18 = (short) arg3;
		this.aByteArray21 = new byte[local396];
		local136 = 0;
		for (local299 = 0; local299 < arg1.anInt9546; local299++) {
			local410 = this.anIntArray55[local299];
			this.anIntArray55[local299] = local136;
			local136 += local410;
			local372[local299] = new Class336();
		}
		this.anIntArray55[arg1.anInt9546] = local136;
		@Pc(651) int[] local651 = null;
		@Pc(653) int[] local653 = null;
		@Pc(655) int[] local655 = null;
		@Pc(657) float[][] local657 = null;
		@Pc(675) int[] local675;
		@Pc(683) int local683;
		@Pc(718) int local718;
		@Pc(724) int local724;
		@Pc(737) int local737;
		@Pc(739) int local739;
		@Pc(770) int local770;
		@Pc(775) int local775;
		@Pc(928) float local928;
		@Pc(926) float local926;
		@Pc(957) float local957;
		if (arg1.aByteArray228 != null) {
			@Pc(663) int local663 = arg1.anInt9553;
			@Pc(666) int[] local666 = new int[local663];
			@Pc(669) int[] local669 = new int[local663];
			@Pc(672) int[] local672 = new int[local663];
			local675 = new int[local663];
			@Pc(678) int[] local678 = new int[local663];
			@Pc(681) int[] local681 = new int[local663];
			for (local683 = 0; local683 < local663; local683++) {
				local666[local683] = Integer.MAX_VALUE;
				local669[local683] = -2147483647;
				local672[local683] = Integer.MAX_VALUE;
				local675[local683] = -2147483647;
				local678[local683] = Integer.MAX_VALUE;
				local681[local683] = -2147483647;
			}
			local651 = new int[local663];
			for (local718 = 0; local718 < this.anInt1742; local718++) {
				local724 = local15[local718];
				if (arg1.aByteArray228[local724] != -1) {
					local737 = arg1.aByteArray228[local724] & 0xFF;
					for (local739 = 0; local739 < 3; local739++) {
						@Pc(751) short local751;
						if (local739 == 0) {
							local751 = arg1.aShortArray135[local724];
						} else if (local739 == 1) {
							local751 = arg1.aShortArray138[local724];
						} else {
							local751 = arg1.aShortArray137[local724];
						}
						local770 = arg1.anIntArray555[local751];
						local775 = arg1.anIntArray550[local751];
						@Pc(780) int local780 = arg1.anIntArray548[local751];
						if (local770 < local666[local737]) {
							local666[local737] = local770;
						}
						if (local669[local737] < local770) {
							local669[local737] = local770;
						}
						if (local775 < local672[local737]) {
							local672[local737] = local775;
						}
						if (local675[local737] < local775) {
							local675[local737] = local775;
						}
						if (local678[local737] > local780) {
							local678[local737] = local780;
						}
						if (local780 > local681[local737]) {
							local681[local737] = local780;
						}
					}
				}
			}
			local653 = new int[local663];
			local657 = new float[local663][];
			local655 = new int[local663];
			for (local724 = 0; local724 < local663; local724++) {
				@Pc(871) byte local871 = arg1.aByteArray229[local724];
				if (local871 > 0) {
					local651[local724] = (local669[local724] + local666[local724]) / 2;
					local653[local724] = (local675[local724] + local672[local724]) / 2;
					local655[local724] = (local678[local724] + local681[local724]) / 2;
					if (local871 == 1) {
						local775 = arg1.anIntArray556[local724];
						if (local775 == 0) {
							local926 = 1.0F;
							local928 = 1.0F;
						} else if (local775 > 0) {
							local926 = (float) local775 / 1024.0F;
							local928 = 1.0F;
						} else {
							local926 = 1.0F;
							local928 = (float) -local775 / 1024.0F;
						}
						local957 = 64.0F / (float) arg1.anIntArray549[local724];
					} else if (local871 == 2) {
						local926 = 64.0F / (float) arg1.anIntArray554[local724];
						local928 = 64.0F / (float) arg1.anIntArray556[local724];
						local957 = 64.0F / (float) arg1.anIntArray549[local724];
					} else {
						local957 = (float) arg1.anIntArray549[local724] / 1024.0F;
						local926 = (float) arg1.anIntArray554[local724] / 1024.0F;
						local928 = (float) arg1.anIntArray556[local724] / 1024.0F;
					}
					local657[local724] = Static353.method5081(arg1.aByteArray226[local724] & 0xFF, arg1.aShortArray133[local724], local957, arg1.aShortArray140[local724], local926, local928, arg1.aShortArray139[local724]);
				}
			}
		}
		@Pc(1052) Class330[] local1052 = new Class330[arg1.anInt9552];
		@Pc(1071) short local1071;
		@Pc(1082) int local1082;
		@Pc(1093) int local1093;
		for (@Pc(1054) int local1054 = 0; local1054 < arg1.anInt9552; local1054++) {
			@Pc(1061) short local1061 = arg1.aShortArray135[local1054];
			@Pc(1066) short local1066 = arg1.aShortArray138[local1054];
			local1071 = arg1.aShortArray137[local1054];
			local1082 = this.anIntArray52[local1066] - this.anIntArray52[local1061];
			local1093 = this.anIntArray48[local1066] - this.anIntArray48[local1061];
			local683 = this.anIntArray49[local1066] - this.anIntArray49[local1061];
			local718 = this.anIntArray52[local1071] - this.anIntArray52[local1061];
			local724 = this.anIntArray48[local1071] - this.anIntArray48[local1061];
			local737 = this.anIntArray49[local1071] - this.anIntArray49[local1061];
			local739 = local1093 * local737 - local683 * local724;
			@Pc(1152) int local1152 = local718 * local683 - local1082 * local737;
			local770 = local724 * local1082 - local1093 * local718;
			while (local739 > 8192 || local1152 > 8192 || local770 > 8192 || local739 < -8192 || local1152 < -8192 || local770 < -8192) {
				local739 >>= 0x1;
				local770 >>= 0x1;
				local1152 >>= 0x1;
			}
			local775 = (int) Math.sqrt((double) (local1152 * local1152 + local739 * local739 + local770 * local770));
			if (local775 <= 0) {
				local775 = 1;
			}
			local739 = local739 * 256 / local775;
			local770 = local770 * 256 / local775;
			local1152 = local1152 * 256 / local775;
			@Pc(1251) byte local1251 = arg1.aByteArray223 == null ? 0 : arg1.aByteArray223[local1054];
			if (local1251 == 0) {
				@Pc(1281) Class336 local1281 = local372[local1061];
				local1281.anInt9705 += local770;
				local1281.anInt9703++;
				local1281.anInt9699 += local739;
				local1281.anInt9704 += local1152;
				@Pc(1309) Class336 local1309 = local372[local1066];
				local1309.anInt9704 += local1152;
				local1309.anInt9699 += local739;
				local1309.anInt9705 += local770;
				local1309.anInt9703++;
				@Pc(1337) Class336 local1337 = local372[local1071];
				local1337.anInt9704 += local1152;
				local1337.anInt9705 += local770;
				local1337.anInt9703++;
				local1337.anInt9699 += local739;
			} else if (local1251 == 1) {
				@Pc(1266) Class330 local1266 = local1052[local1054] = new Class330();
				local1266.anInt9459 = local770;
				local1266.anInt9460 = local1152;
				local1266.anInt9461 = local739;
			}
		}
		@Pc(1378) int local1378;
		for (@Pc(1372) int local1372 = 0; local1372 < this.anInt1742; local1372++) {
			local1378 = local15[local1372];
			@Pc(1385) int local1385 = arg1.aShortArray136[local1378] & 0xFFFF;
			@Pc(1393) short local1393;
			if (arg1.aShortArray132 == null) {
				local1393 = -1;
			} else {
				local1393 = arg1.aShortArray132[local1378];
			}
			if (arg1.aByteArray228 == null) {
				local1093 = -1;
			} else {
				local1093 = arg1.aByteArray228[local1378];
			}
			if (arg1.aByteArray224 == null) {
				local683 = 0;
			} else {
				local683 = arg1.aByteArray224[local1378] & 0xFF;
			}
			@Pc(1425) float local1425 = 0.0F;
			@Pc(1427) float local1427 = 0.0F;
			@Pc(1429) float local1429 = 0.0F;
			local928 = 0.0F;
			local957 = 0.0F;
			local926 = 0.0F;
			@Pc(1437) byte local1437 = 0;
			@Pc(1439) byte local1439 = 0;
			@Pc(1441) int local1441 = 0;
			@Pc(1457) byte local1457;
			@Pc(1477) short local1477;
			@Pc(2227) short local2227;
			@Pc(2232) short local2232;
			if (local1393 != -1) {
				if (local1093 == -1) {
					local1439 = 2;
					local1429 = 1.0F;
					local1437 = 1;
					local926 = 0.0F;
					local1425 = 0.0F;
					local957 = 0.0F;
					local928 = 1.0F;
					local1427 = 1.0F;
				} else {
					local1093 &= 0xFF;
					local1457 = arg1.aByteArray229[local1093];
					@Pc(1467) short local1467;
					@Pc(1472) short local1472;
					@Pc(1506) float local1506;
					@Pc(1717) float local1717;
					@Pc(1725) float local1725;
					@Pc(1825) float local1825;
					@Pc(1833) float local1833;
					@Pc(1841) float local1841;
					@Pc(1864) float local1864;
					@Pc(1887) float local1887;
					@Pc(1910) float local1910;
					if (local1457 == 0) {
						local1467 = arg1.aShortArray135[local1378];
						local1472 = arg1.aShortArray138[local1378];
						local1477 = arg1.aShortArray137[local1378];
						local2227 = arg1.aShortArray133[local1093];
						local2232 = arg1.aShortArray140[local1093];
						@Pc(2237) short local2237 = arg1.aShortArray139[local1093];
						@Pc(2243) float local2243 = (float) arg1.anIntArray555[local2227];
						@Pc(2249) float local2249 = (float) arg1.anIntArray550[local2227];
						local1506 = arg1.anIntArray548[local2227];
						local1717 = (float) arg1.anIntArray555[local2232] - local2243;
						local1725 = (float) arg1.anIntArray550[local2232] - local2249;
						@Pc(2281) float local2281 = (float) arg1.anIntArray548[local2232] - local1506;
						@Pc(2289) float local2289 = (float) arg1.anIntArray555[local2237] - local2243;
						@Pc(2298) float local2298 = (float) arg1.anIntArray550[local2237] - local2249;
						@Pc(2306) float local2306 = (float) arg1.anIntArray548[local2237] - local1506;
						@Pc(2314) float local2314 = (float) arg1.anIntArray555[local1467] - local2243;
						@Pc(2323) float local2323 = (float) arg1.anIntArray550[local1467] - local2249;
						@Pc(2332) float local2332 = (float) arg1.anIntArray548[local1467] - local1506;
						@Pc(2340) float local2340 = (float) arg1.anIntArray555[local1472] - local2243;
						@Pc(2348) float local2348 = (float) arg1.anIntArray550[local1472] - local2249;
						local1825 = (float) arg1.anIntArray548[local1472] - local1506;
						local1833 = (float) arg1.anIntArray555[local1477] - local2243;
						local1841 = (float) arg1.anIntArray550[local1477] - local2249;
						local1864 = (float) arg1.anIntArray548[local1477] - local1506;
						local1887 = local2306 * local1725 - local2298 * local2281;
						local1910 = local2281 * local2289 - local2306 * local1717;
						@Pc(2409) float local2409 = local1717 * local2298 - local2289 * local1725;
						@Pc(2418) float local2418 = local2298 * local2409 - local1910 * local2306;
						@Pc(2426) float local2426 = local1887 * local2306 - local2409 * local2289;
						@Pc(2435) float local2435 = local1910 * local2289 - local1887 * local2298;
						@Pc(2449) float local2449 = 1.0F / (local2435 * local2281 + local2418 * local1717 + local2426 * local1725);
						local1425 = local2449 * (local2332 * local2435 + local2323 * local2426 + local2418 * local2314);
						local1429 = (local2340 * local2418 + local2426 * local2348 + local2435 * local1825) * local2449;
						local957 = (local2426 * local1841 + local2418 * local1833 + local2435 * local1864) * local2449;
						@Pc(2499) float local2499 = local1725 * local2409 - local2281 * local1910;
						@Pc(2507) float local2507 = local1717 * local1910 - local1725 * local1887;
						@Pc(2515) float local2515 = local2281 * local1887 - local2409 * local1717;
						@Pc(2529) float local2529 = 1.0F / (local2507 * local2306 + local2515 * local2298 + local2499 * local2289);
						local926 = (local2507 * local1864 + local2499 * local1833 + local2515 * local1841) * local2529;
						local928 = (local2507 * local1825 + local2348 * local2515 + local2340 * local2499) * local2529;
						local1427 = local2529 * (local2507 * local2332 + local2499 * local2314 + local2515 * local2323);
					} else {
						local1467 = arg1.aShortArray135[local1378];
						local1472 = arg1.aShortArray138[local1378];
						local1477 = arg1.aShortArray137[local1378];
						@Pc(1481) int local1481 = local651[local1093];
						@Pc(1485) int local1485 = local653[local1093];
						@Pc(1489) int local1489 = local655[local1093];
						@Pc(1493) float[] local1493 = local657[local1093];
						@Pc(1498) byte local1498 = arg1.aByteArray225[local1093];
						local1506 = (float) arg1.anIntArray546[local1093] / 256.0F;
						if (local1457 == 1) {
							local1717 = (float) arg1.anIntArray554[local1093] / 1024.0F;
							Static533.method7299(local1493, arg1.anIntArray555[local1467], local1485, local1481, arg1.anIntArray548[local1467], local1498, local1717, local1489, local1506, arg1.anIntArray550[local1467]);
							local1425 = Static571.aFloat227;
							local1427 = Static484.aFloat181;
							Static533.method7299(local1493, arg1.anIntArray555[local1472], local1485, local1481, arg1.anIntArray548[local1472], local1498, local1717, local1489, local1506, arg1.anIntArray550[local1472]);
							local928 = Static484.aFloat181;
							local1429 = Static571.aFloat227;
							Static533.method7299(local1493, arg1.anIntArray555[local1477], local1485, local1481, arg1.anIntArray548[local1477], local1498, local1717, local1489, local1506, arg1.anIntArray550[local1477]);
							local957 = Static571.aFloat227;
							local926 = Static484.aFloat181;
							local1725 = local1717 / 2.0F;
							if ((local1498 & 0x1) == 0) {
								if (local1725 < local957 - local1425) {
									local1439 = 1;
									local957 -= local1717;
								} else if (local1725 < local1425 - local957) {
									local957 += local1717;
									local1439 = 2;
								}
								if (local1429 - local1425 > local1725) {
									local1437 = 1;
									local1429 -= local1717;
								} else if (local1425 - local1429 > local1725) {
									local1437 = 2;
									local1429 += local1717;
								}
							} else {
								if (local926 - local1427 > local1725) {
									local1439 = 1;
									local926 -= local1717;
								} else if (local1427 - local926 > local1725) {
									local926 += local1717;
									local1439 = 2;
								}
								if (local928 - local1427 > local1725) {
									local928 -= local1717;
									local1437 = 1;
								} else if (local1427 - local928 > local1725) {
									local928 += local1717;
									local1437 = 2;
								}
							}
						} else if (local1457 == 2) {
							local1717 = (float) arg1.anIntArray551[local1093] / 256.0F;
							local1725 = (float) arg1.anIntArray547[local1093] / 256.0F;
							@Pc(1736) int local1736 = arg1.anIntArray555[local1472] - arg1.anIntArray555[local1467];
							@Pc(1747) int local1747 = arg1.anIntArray550[local1472] - arg1.anIntArray550[local1467];
							@Pc(1758) int local1758 = arg1.anIntArray548[local1472] - arg1.anIntArray548[local1467];
							@Pc(1769) int local1769 = arg1.anIntArray555[local1477] - arg1.anIntArray555[local1467];
							@Pc(1780) int local1780 = arg1.anIntArray550[local1477] - arg1.anIntArray550[local1467];
							@Pc(1791) int local1791 = arg1.anIntArray548[local1477] - arg1.anIntArray548[local1467];
							@Pc(1800) int local1800 = local1791 * local1747 - local1758 * local1780;
							@Pc(1808) int local1808 = local1769 * local1758 - local1736 * local1791;
							@Pc(1817) int local1817 = local1736 * local1780 - local1747 * local1769;
							local1825 = 64.0F / (float) arg1.anIntArray556[local1093];
							local1833 = 64.0F / (float) arg1.anIntArray549[local1093];
							local1841 = 64.0F / (float) arg1.anIntArray554[local1093];
							local1864 = ((float) local1808 * local1493[1] + local1493[0] * (float) local1800 + (float) local1817 * local1493[2]) / local1825;
							local1887 = ((float) local1800 * local1493[3] + local1493[4] * (float) local1808 + local1493[5] * (float) local1817) / local1833;
							local1910 = ((float) local1808 * local1493[7] + (float) local1800 * local1493[6] + local1493[8] * (float) local1817) / local1841;
							local1441 = Static240.method3815(local1910, local1887, local1864);
							Static54.method1342(local1717, local1441, local1489, local1481, arg1.anIntArray550[local1467], local1506, local1493, arg1.anIntArray548[local1467], local1498, local1725, local1485, arg1.anIntArray555[local1467]);
							local1425 = Static304.aFloat131;
							local1427 = Static206.aFloat113;
							Static54.method1342(local1717, local1441, local1489, local1481, arg1.anIntArray550[local1472], local1506, local1493, arg1.anIntArray548[local1472], local1498, local1725, local1485, arg1.anIntArray555[local1472]);
							local928 = Static206.aFloat113;
							local1429 = Static304.aFloat131;
							Static54.method1342(local1717, local1441, local1489, local1481, arg1.anIntArray550[local1477], local1506, local1493, arg1.anIntArray548[local1477], local1498, local1725, local1485, arg1.anIntArray555[local1477]);
							local957 = Static304.aFloat131;
							local926 = Static206.aFloat113;
						} else if (local1457 == 3) {
							Static558.method7652(arg1.anIntArray555[local1467], local1485, local1506, local1489, local1498, local1481, local1493, arg1.anIntArray548[local1467], arg1.anIntArray550[local1467]);
							local1427 = Static290.aFloat128;
							local1425 = Static340.aFloat147;
							Static558.method7652(arg1.anIntArray555[local1472], local1485, local1506, local1489, local1498, local1481, local1493, arg1.anIntArray548[local1472], arg1.anIntArray550[local1472]);
							local928 = Static290.aFloat128;
							local1429 = Static340.aFloat147;
							Static558.method7652(arg1.anIntArray555[local1477], local1485, local1506, local1489, local1498, local1481, local1493, arg1.anIntArray548[local1477], arg1.anIntArray550[local1477]);
							local926 = Static290.aFloat128;
							local957 = Static340.aFloat147;
							if ((local1498 & 0x1) == 0) {
								if (local957 - local1425 > 0.5F) {
									local1439 = 1;
									local957--;
								} else if (local1425 - local957 > 0.5F) {
									local957++;
									local1439 = 2;
								}
								if (local1429 - local1425 > 0.5F) {
									local1429--;
									local1437 = 1;
								} else if (local1425 - local1429 > 0.5F) {
									local1429++;
									local1437 = 2;
								}
							} else {
								if (local928 - local1427 > 0.5F) {
									local1437 = 1;
									local928--;
								} else if (local1427 - local928 > 0.5F) {
									local1437 = 2;
									local928++;
								}
								if (local926 - local1427 > 0.5F) {
									local926--;
									local1439 = 1;
								} else if (local1427 - local926 > 0.5F) {
									local1439 = 2;
									local926++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray223 == null) {
				local1457 = 0;
			} else {
				local1457 = arg1.aByteArray223[local1378];
			}
			if (local1457 == 0) {
				@Pc(2753) long local2753 = ((long) (local1441 << 24) + (long) (local1385 << 8) + (long) local683 << 32) + (long) (local1093 << 2);
				local1477 = arg1.aShortArray135[local1378];
				local2227 = arg1.aShortArray138[local1378];
				local2232 = arg1.aShortArray137[local1378];
				@Pc(2772) Class336 local2772 = local372[local1477];
				this.aShortArray15[local1372] = this.method1567(local2753, local2772.anInt9705, local1425, arg1, local1427, local1477, local2772.anInt9704, local1372, local2772.anInt9699, local2772.anInt9703);
				@Pc(2797) Class336 local2797 = local372[local2227];
				this.aShortArray20[local1372] = this.method1567((long) local1437 + local2753, local2797.anInt9705, local1429, arg1, local928, local2227, local2797.anInt9704, local1372, local2797.anInt9699, local2797.anInt9703);
				@Pc(2825) Class336 local2825 = local372[local2232];
				this.aShortArray8[local1372] = this.method1567(local2753 + (long) local1439, local2825.anInt9705, local957, arg1, local926, local2232, local2825.anInt9704, local1372, local2825.anInt9699, local2825.anInt9703);
			} else if (local1457 == 1) {
				@Pc(2613) Class330 local2613 = local1052[local1378];
				@Pc(2655) long local2655 = (long) ((local2613.anInt9459 + 256 << 22) + (local2613.anInt9460 + 256 << 12) + (local1093 << 2) + (local2613.anInt9461 <= 0 ? 2048 : 1024)) + ((long) local683 + (long) (local1441 << 24) + (long) (local1385 << 8) << 32);
				this.aShortArray15[local1372] = this.method1567(local2655, local2613.anInt9459, local1425, arg1, local1427, arg1.aShortArray135[local1378], local2613.anInt9460, local1372, local2613.anInt9461, 0);
				this.aShortArray20[local1372] = this.method1567((long) local1437 + local2655, local2613.anInt9459, local1429, arg1, local928, arg1.aShortArray138[local1378], local2613.anInt9460, local1372, local2613.anInt9461, 0);
				this.aShortArray8[local1372] = this.method1567(local2655 + (long) local1439, local2613.anInt9459, local957, arg1, local926, arg1.aShortArray137[local1378], local2613.anInt9460, local1372, local2613.anInt9461, 0);
			}
			if (arg1.aShortArray132 == null) {
				this.aShortArray19[local1372] = -1;
			} else {
				this.aShortArray19[local1372] = arg1.aShortArray132[local1378];
			}
			if (arg1.aByteArray224 != null) {
				this.aByteArray20[local1372] = arg1.aByteArray224[local1378];
			}
			if (arg1.aShortArray131 != null) {
				this.aShortArray12[local1372] = arg1.aShortArray131[local1378];
			}
			this.aShortArray10[local1372] = arg1.aShortArray136[local1378];
		}
		if (this.anInt1776 > 0) {
			local1378 = 1;
			local1071 = this.aShortArray19[0];
			for (local1082 = 0; local1082 < this.anInt1776; local1082++) {
				@Pc(2928) short local2928 = this.aShortArray19[local1082];
				if (local1071 != local2928) {
					local1378++;
					local1071 = local2928;
				}
			}
			this.anIntArray54 = new int[local1378 + 1];
			this.anIntArray50 = new int[local1378];
			this.anIntArray51 = new int[local1378];
			this.anIntArray54[0] = 0;
			local1093 = this.anInt1714;
			local1071 = this.aShortArray19[0];
			local1378 = 0;
			@Pc(2974) short local2974 = 0;
			for (local718 = 0; local718 < this.anInt1776; local718++) {
				@Pc(2983) short local2983 = this.aShortArray19[local718];
				if (local1071 != local2983) {
					this.anIntArray50[local1378] = local1093;
					this.anIntArray51[local1378] = local2974 + 1 - local1093;
					local1378++;
					this.anIntArray54[local1378] = local718;
					local2974 = 0;
					local1071 = local2983;
					local1093 = this.anInt1714;
				}
				@Pc(3018) short local3018 = this.aShortArray15[local718];
				if (local2974 < local3018) {
					local2974 = local3018;
				}
				if (local1093 > local3018) {
					local1093 = local3018;
				}
				local3018 = this.aShortArray20[local718];
				if (local3018 > local2974) {
					local2974 = local3018;
				}
				if (local3018 < local1093) {
					local1093 = local3018;
				}
				local3018 = this.aShortArray8[local718];
				if (local1093 > local3018) {
					local1093 = local3018;
				}
				if (local2974 < local3018) {
					local2974 = local3018;
				}
			}
			this.anIntArray50[local1378] = local1093;
			this.anIntArray51[local1378] = local2974 + 1 - local1093;
			local1378++;
			this.anIntArray54[local1378] = this.anInt1776;
		}
		Static196.aLongArray4 = null;
		this.aShortArray9 = Static557.method4954(this.aShortArray9, this.anInt1714);
		this.aShortArray11 = Static557.method4954(this.aShortArray11, this.anInt1714);
		this.aShortArray13 = Static557.method4954(this.aShortArray13, this.anInt1714);
		this.aShortArray16 = Static557.method4954(this.aShortArray16, this.anInt1714);
		this.aShortArray17 = Static557.method4954(this.aShortArray17, this.anInt1714);
		this.aByteArray21 = Static561.method7677(this.aByteArray21, this.anInt1714);
		this.aFloatArray24 = Static246.method3897(this.aFloatArray24, this.anInt1714);
		this.aFloatArray23 = Static246.method3897(this.aFloatArray23, this.anInt1714);
		if (arg1.anIntArray553 != null && Static267.method4075(this.anInt1721, arg2)) {
			this.anIntArrayArray12 = arg1.method7497(false);
		}
		if (arg1.aClass10Array1 != null && Static196.method3430(this.anInt1721, arg2)) {
			this.anIntArrayArray11 = arg1.method7488();
		}
		if (arg1.anIntArray552 != null && Static172.method3058(arg2, this.anInt1721)) {
			local1378 = 0;
			local675 = new int[256];
			for (local1082 = 0; local1082 < this.anInt1742; local1082++) {
				local1093 = arg1.anIntArray552[local15[local1082]];
				if (local1093 >= 0) {
					if (local1093 > local1378) {
						local1378 = local1093;
					}
					@Pc(3239) int local3239 = local675[local1093]++;
				}
			}
			this.anIntArrayArray13 = new int[local1378 + 1][];
			for (local1093 = 0; local1093 <= local1378; local1093++) {
				this.anIntArrayArray13[local1093] = new int[local675[local1093]];
				local675[local1093] = 0;
			}
			for (local683 = 0; local683 < this.anInt1742; local683++) {
				local718 = arg1.anIntArray552[local15[local683]];
				if (local718 >= 0) {
					this.anIntArrayArray13[local718][local675[local718]++] = local683;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!rr;IIZZ)V")
	public Class52_Sub1(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean126 = false;
		this.anInt1742 = 0;
		this.anInt1714 = 0;
		this.aBoolean128 = false;
		this.anInt1710 = 0;
		this.anInt1744 = 0;
		this.aBoolean129 = false;
		this.aBoolean127 = true;
		this.anInt1776 = 0;
		this.aClass31_Sub1_3 = arg0;
		this.anInt1704 = arg1;
		this.anInt1721 = arg2;
		this.aBoolean128 = arg4;
		if (arg3 || Static160.method2925(this.anInt1721, this.anInt1704)) {
			this.aClass293_3 = new Class293(Static230.method3739(this.anInt1721, this.anInt1704));
		}
		if (arg3 || Static567.method4396(this.anInt1704, this.anInt1721)) {
			this.aClass293_1 = new Class293(Static113.method2270(this.anInt1721, this.anInt1704));
		}
		if (arg3 || Static313.method4671(this.anInt1704, this.anInt1721)) {
			this.aClass293_2 = new Class293(Static576.method7812(this.anInt1704, this.anInt1721));
		}
		if (arg3 || Static339.method4966(this.anInt1704, this.anInt1721)) {
			this.aClass293_4 = new Class293(Static252.method3945(this.anInt1721, this.anInt1704));
		}
		if (arg3 || Static409.method1339(this.anInt1704, this.anInt1721)) {
			this.aClass324_1 = new Class324(Static19.method208(this.anInt1704, this.anInt1721));
		}
	}

	@OriginalMember(owner = "client!cfa", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1737;
	}

	@OriginalMember(owner = "client!cfa", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean129;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!q;ZIII)Z")
	private boolean method1565(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class42_Sub3 local8 = (Class42_Sub3) arg1;
		@Pc(12) Class42_Sub3 local12 = this.aClass31_Sub1_3.aClass42_Sub3_16;
		@Pc(33) float local33 = local8.aFloat215 * local12.aFloat219 + local8.aFloat224 * local12.aFloat223 + local12.aFloat221 * local8.aFloat220 + local12.aFloat220;
		@Pc(54) float local54 = local12.aFloat224 + local8.aFloat224 * local12.aFloat216 + local12.aFloat213 * local8.aFloat220 + local8.aFloat215 * local12.aFloat214;
		Static563.aFloat151 = local8.aFloat213 * local12.aFloat216 + local12.aFloat213 * local8.aFloat221 + local12.aFloat214 * local8.aFloat218;
		Static483.aFloat180 = local8.aFloat222 * local12.aFloat214 + local8.aFloat214 * local12.aFloat216 + local12.aFloat213 * local8.aFloat219;
		Static477.aFloat178 = local12.aFloat222 * local8.aFloat217 + local8.aFloat216 * local12.aFloat217 + local8.aFloat223 * local12.aFloat218;
		Static517.aFloat188 = local8.aFloat216 * local12.aFloat216 + local12.aFloat213 * local8.aFloat223 + local8.aFloat217 * local12.aFloat214;
		Static121.aFloat74 = local8.aFloat214 * local12.aFloat217 + local12.aFloat218 * local8.aFloat219 + local12.aFloat222 * local8.aFloat222;
		Static546.aFloat212 = local12.aFloat217 * local8.aFloat213 + local12.aFloat218 * local8.aFloat221 + local8.aFloat218 * local12.aFloat222;
		Static243.aFloat186 = local8.aFloat218 * local12.aFloat219 + local12.aFloat223 * local8.aFloat213 + local12.aFloat221 * local8.aFloat221;
		Static537.aFloat208 = local12.aFloat221 * local8.aFloat219 + local8.aFloat214 * local12.aFloat223 + local12.aFloat219 * local8.aFloat222;
		Static100.aFloat225 = local8.aFloat217 * local12.aFloat219 + local8.aFloat216 * local12.aFloat223 + local8.aFloat223 * local12.aFloat221;
		@Pc(237) float local237 = local12.aFloat215 + local8.aFloat220 * local12.aFloat218 + local8.aFloat224 * local12.aFloat217 + local8.aFloat215 * local12.aFloat222;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass31_Sub1_3.anInt9124;
		@Pc(261) int local261 = this.aClass31_Sub1_3.bf;
		if (!this.aBoolean126) {
			this.method1571();
		}
		Static169.anIntArray152[0] = this.anInt1725;
		Static375.anIntArray364[0] = this.anInt1756;
		Static169.anIntArray152[1] = this.anInt1728;
		Static257.anIntArray236[0] = this.anInt1760;
		Static375.anIntArray364[1] = this.anInt1756;
		Static257.anIntArray236[1] = this.anInt1760;
		Static169.anIntArray152[2] = this.anInt1725;
		Static375.anIntArray364[2] = this.anInt1717;
		Static257.anIntArray236[2] = this.anInt1760;
		Static169.anIntArray152[3] = this.anInt1728;
		Static375.anIntArray364[3] = this.anInt1717;
		Static169.anIntArray152[4] = this.anInt1725;
		Static257.anIntArray236[3] = this.anInt1760;
		Static375.anIntArray364[4] = this.anInt1756;
		Static169.anIntArray152[5] = this.anInt1728;
		Static257.anIntArray236[4] = this.anInt1750;
		Static375.anIntArray364[5] = this.anInt1756;
		Static257.anIntArray236[5] = this.anInt1750;
		Static169.anIntArray152[6] = this.anInt1725;
		Static375.anIntArray364[6] = this.anInt1717;
		Static169.anIntArray152[7] = this.anInt1728;
		Static257.anIntArray236[6] = this.anInt1750;
		Static375.anIntArray364[7] = this.anInt1717;
		Static257.anIntArray236[7] = this.anInt1750;
		@Pc(448) float local448;
		@Pc(420) float local420;
		@Pc(434) float local434;
		@Pc(396) float local396;
		@Pc(401) float local401;
		@Pc(406) float local406;
		for (@Pc(389) int local389 = 0; local389 < 8; local389++) {
			local396 = Static169.anIntArray152[local389];
			local401 = Static375.anIntArray364[local389];
			local406 = Static257.anIntArray236[local389];
			local420 = local54 + local406 * Static483.aFloat180 + local396 * Static563.aFloat151 + local401 * Static517.aFloat188;
			local434 = local237 + local406 * Static121.aFloat74 + local396 * Static546.aFloat212 + Static477.aFloat178 * local401;
			local448 = Static243.aFloat186 * local396 + Static100.aFloat225 * local401 + local406 * Static537.aFloat208 + local33;
			if ((float) this.aClass31_Sub1_3.anInt9127 <= local434) {
				if (arg4 > 0) {
					local434 = arg4;
				}
				@Pc(472) float local472 = local448 * (float) local257 / local434 + (float) this.aClass31_Sub1_3.anInt9119;
				@Pc(484) float local484 = (float) this.aClass31_Sub1_3.anInt9142 + local420 * (float) local261 / local434;
				if (local472 > local243) {
					local243 = local472;
				}
				if (local472 < local241) {
					local241 = local472;
				}
				local239 = true;
				if (local484 > local253) {
					local253 = local484;
				}
				if (local484 < local251) {
					local251 = local484;
				}
			}
		}
		if (local239 && local241 < (float) arg3 && (float) arg3 < local243 && (float) arg0 > local251 && local253 > (float) arg0) {
			if (arg2) {
				return true;
			}
			if (this.anInt1714 > Static53.anIntArray40.length) {
				Static53.anIntArray40 = new int[this.anInt1714];
				Static501.anIntArray518 = new int[this.anInt1714];
			}
			@Pc(649) int local649;
			for (@Pc(559) int local559 = 0; local559 < this.anInt1710; local559++) {
				local406 = this.anIntArray49[local559];
				local396 = this.anIntArray52[local559];
				local401 = this.anIntArray48[local559];
				local420 = local54 + Static517.aFloat188 * local401 + local396 * Static563.aFloat151 + Static483.aFloat180 * local406;
				local434 = local237 + local396 * Static546.aFloat212 + Static477.aFloat178 * local401 + Static121.aFloat74 * local406;
				local448 = local33 + Static537.aFloat208 * local406 + Static243.aFloat186 * local396 + Static100.aFloat225 * local401;
				@Pc(662) int local662;
				@Pc(667) int local667;
				@Pc(674) int local674;
				if (local434 >= (float) this.aClass31_Sub1_3.anInt9127) {
					if (arg4 > 0) {
						local434 = arg4;
					}
					local649 = (int) ((float) local257 * local448 / local434 + (float) this.aClass31_Sub1_3.anInt9119);
					local662 = (int) ((float) local261 * local420 / local434 + (float) this.aClass31_Sub1_3.anInt9142);
					local667 = this.anIntArray55[local559];
					local674 = this.anIntArray55[local559 + 1];
					for (@Pc(676) int local676 = local667; local676 < local674; local676++) {
						@Pc(685) int local685 = this.aShortArray14[local676] - 1;
						if (local685 == -1) {
							break;
						}
						Static53.anIntArray40[local685] = local649;
						Static501.anIntArray518[local685] = local662;
					}
				} else {
					local649 = this.anIntArray55[local559];
					local662 = this.anIntArray55[local559 + 1];
					for (local667 = local649; local667 < local662; local667++) {
						local674 = this.aShortArray14[local667] - 1;
						if (local674 == -1) {
							break;
						}
						Static53.anIntArray40[this.aShortArray14[local667] - 1] = -999999;
					}
				}
			}
			for (local649 = 0; local649 < this.anInt1742; local649++) {
				if (Static53.anIntArray40[this.aShortArray15[local649]] != -999999 && Static53.anIntArray40[this.aShortArray20[local649]] != -999999 && Static53.anIntArray40[this.aShortArray8[local649]] != -999999 && this.method1569(arg0, Static501.anIntArray518[this.aShortArray15[local649]], Static53.anIntArray40[this.aShortArray15[local649]], arg3, Static501.anIntArray518[this.aShortArray8[local649]], Static501.anIntArray518[this.aShortArray20[local649]], Static53.anIntArray40[this.aShortArray8[local649]], Static53.anIntArray40[this.aShortArray20[local649]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cfa", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1750;
	}

	@OriginalMember(owner = "client!cfa", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static286.anInt5360 = 0;
			Static501.anInt8647 = 0;
			Static39.anInt1147 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray12.length > local41) {
					local51 = this.anIntArrayArray12[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray18 == null || (this.aShortArray18[local59] & arg6) != 0) {
							Static286.anInt5360 += this.anIntArray52[local59];
							Static39.anInt1147 += this.anIntArray48[local59];
							Static501.anInt8647 += this.anIntArray49[local59];
							local33++;
						}
					}
				}
			}
			if (local33 <= 0) {
				Static286.anInt5360 = arg2;
				Static39.anInt1147 = arg3;
				Static501.anInt8647 = arg4;
			} else {
				Static286.anInt5360 = Static286.anInt5360 / local33 + arg2;
				Static501.anInt8647 = arg4 + Static501.anInt8647 / local33;
				Static39.anInt1147 = Static39.anInt1147 / local33 + arg3;
				Static507.aBoolean585 = true;
			}
			return;
		}
		@Pc(241) int[] local241;
		@Pc(243) int local243;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg4 * arg7[2] + arg2 * arg7[0] + arg7[1] * arg3 + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[4] * arg3 + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg2 = local33;
				arg3 = local35;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray12.length) {
					local241 = this.anIntArrayArray12[local35];
					for (local243 = 0; local243 < local241.length; local243++) {
						local53 = local241[local243];
						if (this.aShortArray18 == null || (arg6 & this.aShortArray18[local53]) != 0) {
							this.anIntArray52[local53] += arg2;
							this.anIntArray48[local53] += arg3;
							this.anIntArray49[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(362) int local362;
		@Pc(384) int local384;
		@Pc(411) int local411;
		@Pc(442) int local442;
		@Pc(446) int local446;
		@Pc(450) int local450;
		@Pc(454) int local454;
		@Pc(462) int local462;
		@Pc(470) int local470;
		@Pc(624) int local624;
		@Pc(651) int local651;
		@Pc(655) int local655;
		@Pc(663) int local663;
		@Pc(668) int local668;
		@Pc(672) int local672;
		@Pc(676) int local676;
		@Pc(678) int local678;
		@Pc(809) int[] local809;
		@Pc(811) int local811;
		@Pc(815) int local815;
		@Pc(819) int local819;
		@Pc(821) int local821;
		@Pc(950) int local950;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray12.length) {
						local241 = this.anIntArrayArray12[local35];
						for (local243 = 0; local243 < local241.length; local243++) {
							local53 = local241[local243];
							if (this.aShortArray18 == null || (this.aShortArray18[local53] & arg6) != 0) {
								this.anIntArray52[local53] -= Static286.anInt5360;
								this.anIntArray48[local53] -= Static39.anInt1147;
								this.anIntArray49[local53] -= Static501.anInt8647;
								if (arg4 != 0) {
									local59 = Class3_Sub28.anIntArray232[arg4];
									local362 = Class3_Sub28.anIntArray231[arg4];
									local384 = local362 * this.anIntArray52[local53] + this.anIntArray48[local53] * local59 + 16383 >> 14;
									this.anIntArray48[local53] = local362 * this.anIntArray48[local53] + 16383 - this.anIntArray52[local53] * local59 >> 14;
									this.anIntArray52[local53] = local384;
								}
								if (arg2 != 0) {
									local59 = Class3_Sub28.anIntArray232[arg2];
									local362 = Class3_Sub28.anIntArray231[arg2];
									local384 = this.anIntArray48[local53] * local362 + 16383 - local59 * this.anIntArray49[local53] >> 14;
									this.anIntArray49[local53] = this.anIntArray48[local53] * local59 + local362 * this.anIntArray49[local53] + 16383 >> 14;
									this.anIntArray48[local53] = local384;
								}
								if (arg3 != 0) {
									local59 = Class3_Sub28.anIntArray232[arg3];
									local362 = Class3_Sub28.anIntArray231[arg3];
									local384 = this.anIntArray52[local53] * local362 + local59 * this.anIntArray49[local53] + 16383 >> 14;
									this.anIntArray49[local53] = this.anIntArray49[local53] * local362 + 16383 - local59 * this.anIntArray52[local53] >> 14;
									this.anIntArray52[local53] = local384;
								}
								this.anIntArray52[local53] += Static286.anInt5360;
								this.anIntArray48[local53] += Static39.anInt1147;
								this.anIntArray49[local53] += Static501.anInt8647;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray12.length) {
							local51 = this.anIntArrayArray12[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray18 == null || (this.aShortArray18[local59] & arg6) != 0) {
									local362 = this.anIntArray55[local59];
									local384 = this.anIntArray55[local59 + 1];
									for (local411 = local362; local411 < local384; local411++) {
										local442 = this.aShortArray14[local411] - 1;
										if (local442 == -1) {
											break;
										}
										if (arg4 != 0) {
											local446 = Class3_Sub28.anIntArray232[arg4];
											local450 = Class3_Sub28.anIntArray231[arg4];
											local454 = local446 * this.aShortArray16[local442] + this.aShortArray13[local442] * local450 + 16383 >> 14;
											this.aShortArray16[local442] = (short) (this.aShortArray16[local442] * local450 + 16383 - local446 * this.aShortArray13[local442] >> 14);
											this.aShortArray13[local442] = (short) local454;
										}
										if (arg2 != 0) {
											local446 = Class3_Sub28.anIntArray232[arg2];
											local450 = Class3_Sub28.anIntArray231[arg2];
											local454 = local450 * this.aShortArray16[local442] + 16383 - local446 * this.aShortArray17[local442] >> 14;
											this.aShortArray17[local442] = (short) (this.aShortArray17[local442] * local450 + local446 * this.aShortArray16[local442] + 16383 >> 14);
											this.aShortArray16[local442] = (short) local454;
										}
										if (arg3 != 0) {
											local446 = Class3_Sub28.anIntArray232[arg3];
											local450 = Class3_Sub28.anIntArray231[arg3];
											local454 = local446 * this.aShortArray17[local442] + this.aShortArray13[local442] * local450 + 16383 >> 14;
											this.aShortArray17[local442] = (short) (this.aShortArray17[local442] * local450 + 16383 - this.aShortArray13[local442] * local446 >> 14);
											this.aShortArray13[local442] = (short) local454;
										}
									}
								}
							}
						}
					}
					this.method1583();
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local243 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static507.aBoolean585) {
					local362 = Static501.anInt8647 * arg7[6] + arg7[0] * Static286.anInt5360 + Static39.anInt1147 * arg7[3] + 8192 >> 14;
					local384 = Static286.anInt5360 * arg7[1] + arg7[4] * Static39.anInt1147 + arg7[7] * Static501.anInt8647 + 8192 >> 14;
					local362 += local243;
					local411 = arg7[5] * Static39.anInt1147 + arg7[2] * Static286.anInt5360 + Static501.anInt8647 * arg7[8] + 8192 >> 14;
					local384 += local53;
					Static286.anInt5360 = local362;
					local411 += local59;
					Static39.anInt1147 = local384;
					Static507.aBoolean585 = false;
					Static501.anInt8647 = local411;
				}
				@Pc(430) int[] local430 = new int[9];
				local384 = Class3_Sub28.anIntArray231[arg2];
				local411 = Class3_Sub28.anIntArray232[arg2];
				local442 = Class3_Sub28.anIntArray231[arg3];
				local446 = Class3_Sub28.anIntArray232[arg3];
				local450 = Class3_Sub28.anIntArray231[arg4];
				local454 = Class3_Sub28.anIntArray232[arg4];
				local462 = local450 * local411 + 8192 >> 14;
				local470 = local454 * local411 + 8192 >> 14;
				local430[1] = -local442 * local454 + local462 * local446 + 8192 >> 14;
				local430[6] = local450 * -local446 + local442 * local470 + 8192 >> 14;
				local430[7] = local462 * local442 + local454 * local446 + 8192 >> 14;
				local430[3] = local454 * local384 + 8192 >> 14;
				local430[0] = local446 * local470 + local442 * local450 + 8192 >> 14;
				local430[4] = local450 * local384 + 8192 >> 14;
				local430[5] = -local411;
				local430[2] = local384 * local446 + 8192 >> 14;
				local430[8] = local384 * local442 + 8192 >> 14;
				@Pc(599) int local599 = -Static501.anInt8647 * local430[2] + -Static39.anInt1147 * local430[1] + -Static286.anInt5360 * local430[0] + 8192 >> 14;
				local624 = local430[4] * -Static39.anInt1147 + -Static286.anInt5360 * local430[3] + local430[5] * -Static501.anInt8647 + 8192 >> 14;
				local651 = local430[6] * -Static286.anInt5360 + local430[7] * -Static39.anInt1147 + local430[8] * -Static501.anInt8647 + 8192 >> 14;
				local655 = Static286.anInt5360 + local599;
				@Pc(659) int local659 = Static39.anInt1147 + local624;
				local663 = Static501.anInt8647 + local651;
				@Pc(666) int[] local666 = new int[9];
				for (local668 = 0; local668 < 3; local668++) {
					for (local672 = 0; local672 < 3; local672++) {
						local676 = 0;
						for (local678 = 0; local678 < 3; local678++) {
							local676 += local430[local668 * 3 + local678] * arg7[local672 * 3 + local678];
						}
						local666[local672 + local668 * 3] = local676 + 8192 >> 14;
					}
				}
				local672 = local430[0] * local243 + local430[1] * local53 + local430[2] * local59 + 8192 >> 14;
				local676 = local430[5] * local59 + local430[3] * local243 + local53 * local430[4] + 8192 >> 14;
				local676 += local659;
				local678 = local243 * local430[6] + local430[7] * local53 + local59 * local430[8] + 8192 >> 14;
				local672 += local655;
				local678 += local663;
				local809 = new int[9];
				for (local811 = 0; local811 < 3; local811++) {
					for (local815 = 0; local815 < 3; local815++) {
						local819 = 0;
						for (local821 = 0; local821 < 3; local821++) {
							local819 += arg7[local811 * 3 + local821] * local666[local821 * 3 + local815];
						}
						local809[local811 * 3 + local815] = local819 + 8192 >> 14;
					}
				}
				local815 = arg7[0] * local672 + local676 * arg7[1] + arg7[2] * local678 + 8192 >> 14;
				local819 = local678 * arg7[5] + local676 * arg7[4] + arg7[3] * local672 + 8192 >> 14;
				local815 += local33;
				local819 += local35;
				local821 = arg7[8] * local678 + arg7[6] * local672 + local676 * arg7[7] + 8192 >> 14;
				local821 += local41;
				for (local950 = 0; local950 < local8; local950++) {
					@Pc(956) int local956 = arg1[local950];
					if (this.anIntArrayArray12.length > local956) {
						@Pc(970) int[] local970 = this.anIntArrayArray12[local956];
						for (@Pc(972) int local972 = 0; local972 < local970.length; local972++) {
							@Pc(978) int local978 = local970[local972];
							if (this.aShortArray18 == null || (this.aShortArray18[local978] & arg6) != 0) {
								@Pc(1022) int local1022 = local809[2] * this.anIntArray49[local978] + local809[0] * this.anIntArray52[local978] + local809[1] * this.anIntArray48[local978] + 8192 >> 14;
								@Pc(1053) int local1053 = this.anIntArray48[local978] * local809[4] + local809[3] * this.anIntArray52[local978] + local809[5] * this.anIntArray49[local978] + 8192 >> 14;
								@Pc(1084) int local1084 = this.anIntArray48[local978] * local809[7] + local809[6] * this.anIntArray52[local978] + local809[8] * this.anIntArray49[local978] + 8192 >> 14;
								@Pc(1088) int local1088 = local1053 + local819;
								@Pc(1092) int local1092 = local1022 + local815;
								@Pc(1096) int local1096 = local1084 + local821;
								this.anIntArray52[local978] = local1092;
								this.anIntArray48[local978] = local1088;
								this.anIntArray49[local978] = local1096;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2576) Class66 local2576;
			@Pc(2463) boolean local2463;
			@Pc(2571) Class148 local2571;
			if (arg0 == 5) {
				if (this.anIntArrayArray13 != null) {
					local2463 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray13.length > local41) {
							local51 = this.anIntArrayArray13[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray12 == null || (this.aShortArray12[local59] & arg6) != 0) {
									local362 = (this.aByteArray20[local59] & 0xFF) + arg2 * 8;
									if (local362 < 0) {
										local362 = 0;
									} else if (local362 > 255) {
										local362 = 255;
									}
									this.aByteArray20[local59] = (byte) local362;
								}
							}
							local2463 |= local51.length > 0;
						}
					}
					if (local2463) {
						if (this.aClass148Array1 != null) {
							for (local41 = 0; local41 < this.anInt1735; local41++) {
								local2571 = this.aClass148Array1[local41];
								local2576 = this.aClass66Array1[local41];
								local2576.anInt2316 = 255 - (this.aByteArray20[local2571.anInt4661] & 0xFF) << 24 | local2576.anInt2316 & 0xFFFFFF;
							}
						}
						this.method1579();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray13 != null) {
					local2463 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray13.length > local41) {
							local51 = this.anIntArrayArray13[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local59]) != 0) {
									local362 = this.aShortArray10[local59] & 0xFFFF;
									local384 = local362 >> 10 & 0x3F;
									local411 = local362 >> 7 & 0x7;
									local442 = local362 & 0x7F;
									@Pc(2684) int local2684 = local384 + arg2 & 0x3F;
									local411 += arg3 / 4;
									local442 += arg4;
									if (local411 < 0) {
										local411 = 0;
									} else if (local411 > 7) {
										local411 = 7;
									}
									if (local442 < 0) {
										local442 = 0;
									} else if (local442 > 127) {
										local442 = 127;
									}
									this.aShortArray10[local59] = (short) (local442 | local2684 << 10 | local411 << 7);
								}
							}
							local2463 |= local51.length > 0;
						}
					}
					if (local2463) {
						if (this.aClass148Array1 != null) {
							for (local41 = 0; local41 < this.anInt1735; local41++) {
								local2571 = this.aClass148Array1[local41];
								local2576 = this.aClass66Array1[local41];
								local2576.anInt2316 = local2576.anInt2316 & 0xFF000000 | Static422.anIntArray428[this.aShortArray10[local2571.anInt4661] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1579();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray11 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray11.length) {
							local241 = this.anIntArrayArray11[local35];
							for (local243 = 0; local243 < local241.length; local243++) {
								local2576 = this.aClass66Array1[local241[local243]];
								local2576.anInt2321 += arg3;
								local2576.anInt2319 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray11 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray11.length) {
							local241 = this.anIntArrayArray11[local35];
							for (local243 = 0; local243 < local241.length; local243++) {
								local2576 = this.aClass66Array1[local241[local243]];
								local2576.anInt2314 = local2576.anInt2314 * arg3 >> 7;
								local2576.anInt2313 = local2576.anInt2313 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray11 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray11.length) {
						local241 = this.anIntArrayArray11[local35];
						for (local243 = 0; local243 < local241.length; local243++) {
							local2576 = this.aClass66Array1[local241[local243]];
							local2576.anInt2317 = local2576.anInt2317 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray12.length) {
					local241 = this.anIntArrayArray12[local35];
					for (local243 = 0; local243 < local241.length; local243++) {
						local53 = local241[local243];
						if (this.aShortArray18 == null || (this.aShortArray18[local53] & arg6) != 0) {
							this.anIntArray52[local53] -= Static286.anInt5360;
							this.anIntArray48[local53] -= Static39.anInt1147;
							this.anIntArray49[local53] -= Static501.anInt8647;
							this.anIntArray52[local53] = arg2 * this.anIntArray52[local53] >> 7;
							this.anIntArray48[local53] = this.anIntArray48[local53] * arg3 >> 7;
							this.anIntArray49[local53] = arg4 * this.anIntArray49[local53] >> 7;
							this.anIntArray52[local53] += Static286.anInt5360;
							this.anIntArray48[local53] += Static39.anInt1147;
							this.anIntArray49[local53] += Static501.anInt8647;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local243 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static507.aBoolean585) {
				local362 = arg7[0] * Static286.anInt5360 + Static39.anInt1147 * arg7[3] + Static501.anInt8647 * arg7[6] + 8192 >> 14;
				local384 = arg7[7] * Static501.anInt8647 + Static39.anInt1147 * arg7[4] + Static286.anInt5360 * arg7[1] + 8192 >> 14;
				local384 += local53;
				local411 = arg7[2] * Static286.anInt5360 + Static39.anInt1147 * arg7[5] + arg7[8] * Static501.anInt8647 + 8192 >> 14;
				local362 += local243;
				local411 += local59;
				Static286.anInt5360 = local362;
				Static39.anInt1147 = local384;
				Static501.anInt8647 = local411;
				Static507.aBoolean585 = false;
			}
			local362 = arg2 << 15 >> 7;
			local384 = arg3 << 15 >> 7;
			local411 = arg4 << 15 >> 7;
			local442 = -Static286.anInt5360 * local362 + 8192 >> 14;
			local446 = -Static39.anInt1147 * local384 + 8192 >> 14;
			local450 = -Static501.anInt8647 * local411 + 8192 >> 14;
			local454 = local442 + Static286.anInt5360;
			local462 = local446 + Static39.anInt1147;
			local470 = Static501.anInt8647 + local450;
			@Pc(1988) int[] local1988 = new int[] { local362 * arg7[0] + 8192 >> 14, arg7[3] * local362 + 8192 >> 14, local362 * arg7[6] + 8192 >> 14, local384 * arg7[1] + 8192 >> 14, local384 * arg7[4] + 8192 >> 14, local384 * arg7[7] + 8192 >> 14, arg7[2] * local411 + 8192 >> 14, local411 * arg7[5] + 8192 >> 14, arg7[8] * local411 + 8192 >> 14 };
			local624 = local243 * local362 + 8192 >> 14;
			local651 = local384 * local53 + 8192 >> 14;
			@Pc(2116) int local2116 = local651 + local462;
			local655 = local59 * local411 + 8192 >> 14;
			@Pc(2128) int local2128 = local624 + local454;
			@Pc(2132) int local2132 = local655 + local470;
			@Pc(2135) int[] local2135 = new int[9];
			@Pc(2141) int local2141;
			for (local663 = 0; local663 < 3; local663++) {
				for (local2141 = 0; local2141 < 3; local2141++) {
					local668 = 0;
					for (local672 = 0; local672 < 3; local672++) {
						local668 += arg7[local672 + local663 * 3] * local1988[local672 * 3 + local2141];
					}
					local2135[local2141 + local663 * 3] = local668 + 8192 >> 14;
				}
			}
			local2141 = local2116 * arg7[1] + arg7[0] * local2128 + arg7[2] * local2132 + 8192 >> 14;
			local668 = arg7[3] * local2128 + local2116 * arg7[4] + local2132 * arg7[5] + 8192 >> 14;
			local672 = arg7[8] * local2132 + local2116 * arg7[7] + arg7[6] * local2128 + 8192 >> 14;
			local2141 += local33;
			local668 += local35;
			local672 += local41;
			for (local676 = 0; local676 < local8; local676++) {
				local678 = arg1[local676];
				if (local678 < this.anIntArrayArray12.length) {
					local809 = this.anIntArrayArray12[local678];
					for (local811 = 0; local811 < local809.length; local811++) {
						local815 = local809[local811];
						if (this.aShortArray18 == null || (this.aShortArray18[local815] & arg6) != 0) {
							local819 = this.anIntArray49[local815] * local2135[2] + local2135[0] * this.anIntArray52[local815] + this.anIntArray48[local815] * local2135[1] + 8192 >> 14;
							local821 = this.anIntArray49[local815] * local2135[5] + this.anIntArray48[local815] * local2135[4] + local2135[3] * this.anIntArray52[local815] + 8192 >> 14;
							@Pc(2383) int local2383 = local819 + local2141;
							@Pc(2387) int local2387 = local821 + local668;
							local950 = this.anIntArray52[local815] * local2135[6] + this.anIntArray48[local815] * local2135[7] + local2135[8] * this.anIntArray49[local815] + 8192 >> 14;
							this.anIntArray52[local815] = local2383;
							@Pc(2429) int local2429 = local950 + local672;
							this.anIntArray48[local815] = local2387;
							this.anIntArray49[local815] = local2429;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(JIBFLclient!uo;FIIIII)S")
	private short method1567(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) Class332 arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray55[arg5];
		@Pc(17) int local17 = this.anIntArray55[arg5 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray14[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static196.aLongArray4[local21] == arg0) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray14[local19] = (short) (this.anInt1714 + 1);
		Static196.aLongArray4[local19] = arg0;
		this.aShortArray11[this.anInt1714] = (short) arg7;
		this.aShortArray9[this.anInt1714] = (short) arg5;
		this.aShortArray13[this.anInt1714] = (short) arg8;
		this.aShortArray16[this.anInt1714] = (short) arg6;
		this.aShortArray17[this.anInt1714] = (short) arg1;
		this.aByteArray21[this.anInt1714] = (byte) arg9;
		this.aFloatArray24[this.anInt1714] = arg2;
		this.aFloatArray23[this.anInt1714] = arg4;
		return (short) this.anInt1714++;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3) {
		return this.method1565(arg1, arg2, arg3, arg0, -1);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1565(arg1, arg2, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!cfa", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1728;
	}

	@OriginalMember(owner = "client!cfa", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1710; local15++) {
			@Pc(33) int local33 = this.anIntArray52[local15] * local13 + this.anIntArray49[local15] * local9 >> 14;
			this.anIntArray49[local15] = this.anIntArray49[local15] * local13 - local9 * this.anIntArray52[local15] >> 14;
			this.anIntArray52[local15] = local33;
		}
		this.method1580();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V")
	public void method1568() {
		if (this.aClass293_3 != null) {
			this.aClass293_3.method6451();
		}
		if (this.aClass293_1 != null) {
			this.aClass293_1.method6451();
		}
		if (this.aClass293_2 != null) {
			this.aClass293_2.method6451();
		}
		if (this.aClass293_4 != null) {
			this.aClass293_4.method6451();
		}
		if (this.aClass324_1 != null) {
			this.aClass324_1.method7237();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1717;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class52 method7618(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class52_Sub1 local16;
		@Pc(12) Class52_Sub1 local12;
		if (arg0 == 1) {
			local12 = this.aClass31_Sub1_3.aClass52_Sub1_23;
			local16 = this.aClass31_Sub1_3.aClass52_Sub1_27;
		} else if (arg0 == 2) {
			local12 = this.aClass31_Sub1_3.aClass52_Sub1_26;
			local16 = this.aClass31_Sub1_3.aClass52_Sub1_30;
		} else if (arg0 == 3) {
			local16 = this.aClass31_Sub1_3.aClass52_Sub1_24;
			local12 = this.aClass31_Sub1_3.aClass52_Sub1_25;
		} else if (arg0 == 4) {
			local12 = this.aClass31_Sub1_3.aClass52_Sub1_29;
			local16 = this.aClass31_Sub1_3.aClass52_Sub1_21;
		} else if (arg0 == 5) {
			local16 = this.aClass31_Sub1_3.aClass52_Sub1_28;
			local12 = this.aClass31_Sub1_3.aClass52_Sub1_22;
		} else {
			local16 = local12 = new Class52_Sub1(this.aClass31_Sub1_3, 0, 0, true, false);
		}
		return this.method1578(local16, local12, arg2, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIBIII)Z")
	private boolean method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg1 && arg5 > arg0 && arg0 < arg4) {
			return false;
		} else if (arg0 > arg1 && arg0 > arg5 && arg4 < arg0) {
			return false;
		} else if (arg2 > arg3 && arg7 > arg3 && arg3 < arg6) {
			return false;
		} else {
			return arg3 <= arg2 || arg3 <= arg7 || arg6 >= arg3;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			Static286.anInt5360 = 0;
			Static39.anInt1147 = 0;
			Static501.anInt8647 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray12.length) {
					local55 = this.anIntArrayArray12[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static286.anInt5360 += this.anIntArray52[local63];
						Static39.anInt1147 += this.anIntArray48[local63];
						local33++;
						Static501.anInt8647 += this.anIntArray49[local63];
					}
				}
			}
			if (local33 > 0) {
				Static39.anInt1147 = Static39.anInt1147 / local33 + local17;
				Static501.anInt8647 = Static501.anInt8647 / local33 + local25;
				Static286.anInt5360 = Static286.anInt5360 / local33 + local21;
			} else {
				Static39.anInt1147 = local17;
				Static501.anInt8647 = local25;
				Static286.anInt5360 = local21;
			}
			return;
		}
		@Pc(160) int[] local160;
		@Pc(162) int local162;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local25 = arg4 << 4;
			local21 = arg2 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray12.length > local35) {
					local160 = this.anIntArrayArray12[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local57 = local160[local162];
						this.anIntArray52[local57] += local21;
						this.anIntArray48[local57] += local17;
						this.anIntArray49[local57] += local25;
					}
				}
			}
			return;
		}
		@Pc(285) int local285;
		@Pc(303) int local303;
		@Pc(758) int local758;
		@Pc(767) int local767;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray12.length > local35) {
					local160 = this.anIntArrayArray12[local35];
					if ((arg5 & 0x1) == 0) {
						for (local162 = 0; local162 < local160.length; local162++) {
							local57 = local160[local162];
							this.anIntArray52[local57] -= Static286.anInt5360;
							this.anIntArray48[local57] -= Static39.anInt1147;
							this.anIntArray49[local57] -= Static501.anInt8647;
							if (arg4 != 0) {
								local63 = Class3_Sub28.anIntArray232[arg4];
								local285 = Class3_Sub28.anIntArray231[arg4];
								local303 = this.anIntArray48[local57] * local63 + local285 * this.anIntArray52[local57] + 16383 >> 14;
								this.anIntArray48[local57] = local285 * this.anIntArray48[local57] + 16383 - this.anIntArray52[local57] * local63 >> 14;
								this.anIntArray52[local57] = local303;
							}
							if (arg2 != 0) {
								local63 = Class3_Sub28.anIntArray232[arg2];
								local285 = Class3_Sub28.anIntArray231[arg2];
								local303 = local285 * this.anIntArray48[local57] + 16383 - this.anIntArray49[local57] * local63 >> 14;
								this.anIntArray49[local57] = this.anIntArray49[local57] * local285 + local63 * this.anIntArray48[local57] + 16383 >> 14;
								this.anIntArray48[local57] = local303;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub28.anIntArray232[arg3];
								local285 = Class3_Sub28.anIntArray231[arg3];
								local303 = this.anIntArray52[local57] * local285 + local63 * this.anIntArray49[local57] + 16383 >> 14;
								this.anIntArray49[local57] = local285 * this.anIntArray49[local57] + 16383 - local63 * this.anIntArray52[local57] >> 14;
								this.anIntArray52[local57] = local303;
							}
							this.anIntArray52[local57] += Static286.anInt5360;
							this.anIntArray48[local57] += Static39.anInt1147;
							this.anIntArray49[local57] += Static501.anInt8647;
						}
					} else {
						for (local162 = 0; local162 < local160.length; local162++) {
							local57 = local160[local162];
							this.anIntArray52[local57] -= Static286.anInt5360;
							this.anIntArray48[local57] -= Static39.anInt1147;
							this.anIntArray49[local57] -= Static501.anInt8647;
							if (arg2 != 0) {
								local63 = Class3_Sub28.anIntArray232[arg2];
								local285 = Class3_Sub28.anIntArray231[arg2];
								local303 = this.anIntArray48[local57] * local285 + 16383 - local63 * this.anIntArray49[local57] >> 14;
								this.anIntArray49[local57] = local285 * this.anIntArray49[local57] + local63 * this.anIntArray48[local57] + 16383 >> 14;
								this.anIntArray48[local57] = local303;
							}
							if (arg4 != 0) {
								local63 = Class3_Sub28.anIntArray232[arg4];
								local285 = Class3_Sub28.anIntArray231[arg4];
								local303 = this.anIntArray52[local57] * local285 + this.anIntArray48[local57] * local63 + 16383 >> 14;
								this.anIntArray48[local57] = local285 * this.anIntArray48[local57] + 16383 - this.anIntArray52[local57] * local63 >> 14;
								this.anIntArray52[local57] = local303;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub28.anIntArray232[arg3];
								local285 = Class3_Sub28.anIntArray231[arg3];
								local303 = this.anIntArray52[local57] * local285 + local63 * this.anIntArray49[local57] + 16383 >> 14;
								this.anIntArray49[local57] = this.anIntArray49[local57] * local285 + 16383 - this.anIntArray52[local57] * local63 >> 14;
								this.anIntArray52[local57] = local303;
							}
							this.anIntArray52[local57] += Static286.anInt5360;
							this.anIntArray48[local57] += Static39.anInt1147;
							this.anIntArray49[local57] += Static501.anInt8647;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray12.length > local41) {
						local55 = this.anIntArrayArray12[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local285 = this.anIntArray55[local63];
							local303 = this.anIntArray55[local63 + 1];
							for (local758 = local285; local758 < local303; local758++) {
								local767 = this.aShortArray14[local758] - 1;
								if (local767 == -1) {
									break;
								}
								@Pc(776) int local776;
								@Pc(780) int local780;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local776 = Class3_Sub28.anIntArray232[arg4];
									local780 = Class3_Sub28.anIntArray231[arg4];
									local798 = this.aShortArray16[local767] * local776 + this.aShortArray13[local767] * local780 + 16383 >> 14;
									this.aShortArray16[local767] = (short) (local780 * this.aShortArray16[local767] + 16383 - local776 * this.aShortArray13[local767] >> 14);
									this.aShortArray13[local767] = (short) local798;
								}
								if (arg2 != 0) {
									local776 = Class3_Sub28.anIntArray232[arg2];
									local780 = Class3_Sub28.anIntArray231[arg2];
									local798 = local780 * this.aShortArray16[local767] + 16383 - local776 * this.aShortArray17[local767] >> 14;
									this.aShortArray17[local767] = (short) (this.aShortArray17[local767] * local780 + local776 * this.aShortArray16[local767] + 16383 >> 14);
									this.aShortArray16[local767] = (short) local798;
								}
								if (arg3 != 0) {
									local776 = Class3_Sub28.anIntArray232[arg3];
									local780 = Class3_Sub28.anIntArray231[arg3];
									local798 = local780 * this.aShortArray13[local767] + this.aShortArray17[local767] * local776 + 16383 >> 14;
									this.aShortArray17[local767] = (short) (local780 * this.aShortArray17[local767] + 16383 - local776 * this.aShortArray13[local767] >> 14);
									this.aShortArray13[local767] = (short) local798;
								}
							}
						}
					}
				}
				this.method1583();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray12.length > local35) {
					local160 = this.anIntArrayArray12[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local57 = local160[local162];
						this.anIntArray52[local57] -= Static286.anInt5360;
						this.anIntArray48[local57] -= Static39.anInt1147;
						this.anIntArray49[local57] -= Static501.anInt8647;
						this.anIntArray52[local57] = arg2 * this.anIntArray52[local57] >> 7;
						this.anIntArray48[local57] = this.anIntArray48[local57] * arg3 >> 7;
						this.anIntArray49[local57] = this.anIntArray49[local57] * arg4 >> 7;
						this.anIntArray52[local57] += Static286.anInt5360;
						this.anIntArray48[local57] += Static39.anInt1147;
						this.anIntArray49[local57] += Static501.anInt8647;
					}
				}
			}
		} else {
			@Pc(1198) Class66 local1198;
			@Pc(1100) boolean local1100;
			@Pc(1193) Class148 local1193;
			if (arg0 == 5) {
				if (this.anIntArrayArray13 != null) {
					local1100 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray13.length > local41) {
							local55 = this.anIntArrayArray13[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local285 = (this.aByteArray20[local63] & 0xFF) + (arg2 * 8);
								if (local285 < 0) {
									local285 = 0;
								} else if (local285 > 255) {
									local285 = 255;
								}
								this.aByteArray20[local63] = (byte) local285;
							}
							local1100 |= local55.length > 0;
						}
					}
					if (local1100) {
						if (this.aClass148Array1 != null) {
							for (local41 = 0; local41 < this.anInt1735; local41++) {
								local1193 = this.aClass148Array1[local41];
								local1198 = this.aClass66Array1[local41];
								local1198.anInt2316 = local1198.anInt2316 & 0xFFFFFF | 255 - (this.aByteArray20[local1193.anInt4661] & 0xFF) << 24;
							}
						}
						this.method1579();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray13 != null) {
					local1100 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray13.length > local41) {
							local55 = this.anIntArrayArray13[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local285 = this.aShortArray10[local63] & 0xFFFF;
								local303 = local285 >> 10 & 0x3F;
								local758 = local285 >> 7 & 0x7;
								local758 += arg3 / 4;
								local767 = local285 & 0x7F;
								@Pc(1301) int local1301 = arg2 + local303 & 0x3F;
								local767 += arg4;
								if (local758 < 0) {
									local758 = 0;
								} else if (local758 > 7) {
									local758 = 7;
								}
								if (local767 < 0) {
									local767 = 0;
								} else if (local767 > 127) {
									local767 = 127;
								}
								this.aShortArray10[local63] = (short) (local767 | local1301 << 10 | local758 << 7);
							}
							local1100 |= local55.length > 0;
						}
					}
					if (local1100) {
						if (this.aClass148Array1 != null) {
							for (local41 = 0; local41 < this.anInt1735; local41++) {
								local1193 = this.aClass148Array1[local41];
								local1198 = this.aClass66Array1[local41];
								local1198.anInt2316 = Static422.anIntArray428[this.aShortArray10[local1193.anInt4661] & 0xFFFF] & 0xFFFFFF | local1198.anInt2316 & 0xFF000000;
							}
						}
						this.method1579();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray11 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray11.length) {
							local160 = this.anIntArrayArray11[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1198 = this.aClass66Array1[local160[local162]];
								local1198.anInt2319 += arg2;
								local1198.anInt2321 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray11 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray11.length) {
							local160 = this.anIntArrayArray11[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1198 = this.aClass66Array1[local160[local162]];
								local1198.anInt2313 = local1198.anInt2313 * arg2 >> 7;
								local1198.anInt2314 = arg3 * local1198.anInt2314 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray11 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray11.length > local35) {
						local160 = this.anIntArrayArray11[local35];
						for (local162 = 0; local162 < local160.length; local162++) {
							local1198 = this.aClass66Array1[local160[local162]];
							local1198.anInt2317 = arg2 + local1198.anInt2317 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass293_3 != null) {
			this.aClass293_3.aBoolean566 = Static230.method3739(this.anInt1721, arg0);
		}
		if (this.aClass293_1 != null) {
			this.aClass293_1.aBoolean566 = Static113.method2270(this.anInt1721, arg0);
		}
		if (this.aClass293_2 != null) {
			this.aClass293_2.aBoolean566 = Static576.method7812(arg0, this.anInt1721);
		}
		if (this.aClass293_4 != null) {
			this.aClass293_4.aBoolean566 = Static252.method3945(this.anInt1721, arg0);
		}
		this.anInt1704 = arg0;
		if (this.aClass229_1 != null && (this.anInt1704 & 0x10000) == 0) {
			this.aShortArray13 = this.aClass229_1.aShortArray96;
			this.aShortArray16 = this.aClass229_1.aShortArray94;
			this.aByteArray21 = this.aClass229_1.aByteArray165;
			this.aShortArray17 = this.aClass229_1.aShortArray95;
			this.aClass229_1 = null;
		}
		this.aBoolean127 = true;
		this.method1576();
	}

	@OriginalMember(owner = "client!cfa", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1744; local7++) {
			this.anIntArray52[local7] = this.anIntArray52[local7] + 7 >> 4;
			this.anIntArray48[local7] = this.anIntArray48[local7] + 7 >> 4;
			this.anIntArray49[local7] = this.anIntArray49[local7] + 7 >> 4;
		}
		this.method1580();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)V")
	private void method1571() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1710; local23++) {
			@Pc(30) int local30 = this.anIntArray52[local23];
			@Pc(35) int local35 = this.anIntArray48[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(45) int local45 = this.anIntArray49[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local45 < local11) {
				local11 = local45;
			}
			if (local17 < local45) {
				local17 = local45;
			}
			@Pc(86) int local86 = local45 * local45 + local30 * local30;
			if (local86 > local19) {
				local19 = local86;
			}
			local86 = local35 * local35 + local45 * local45 + local30 * local30;
			if (local21 < local86) {
				local21 = local86;
			}
		}
		this.anInt1760 = local11;
		this.anInt1728 = local13;
		this.anInt1717 = local15;
		this.anInt1725 = local7;
		this.anInt1756 = local9;
		this.anInt1750 = local17;
		this.anInt1753 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt1737 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!cfa", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		this.method1580();
		this.method1583();
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!q;Lclient!b;I)V")
	@Override
	public void method7617(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1714 == 0) {
			return;
		}
		@Pc(16) Class42_Sub3 local16 = this.aClass31_Sub1_3.aClass42_Sub3_16;
		@Pc(19) Class42_Sub3 local19 = (Class42_Sub3) arg0;
		if (!this.aBoolean126) {
			this.method1571();
		}
		Static477.aFloat178 = local19.aFloat217 * local16.aFloat222 + local19.aFloat216 * local16.aFloat217 + local19.aFloat223 * local16.aFloat218;
		Static20.aFloat5 = local16.aFloat215 + local19.aFloat215 * local16.aFloat222 + local16.aFloat218 * local19.aFloat220 + local16.aFloat217 * local19.aFloat224;
		@Pc(72) float local72 = Static20.aFloat5 + (float) this.anInt1756 * Static477.aFloat178;
		@Pc(80) float local80 = Static20.aFloat5 + (float) this.anInt1717 * Static477.aFloat178;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = (float) -this.anInt1753 + local80;
			local96 = local72 + (float) this.anInt1753;
		} else {
			local90 = local72 - (float) this.anInt1753;
			local96 = (float) this.anInt1753 + local80;
		}
		if (this.aClass31_Sub1_3.aFloat194 <= local90 || (float) this.aClass31_Sub1_3.anInt9127 >= local96) {
			return;
		}
		Static51.aFloat130 = local16.aFloat220 + local16.aFloat223 * local19.aFloat224 + local16.aFloat221 * local19.aFloat220 + local19.aFloat215 * local16.aFloat219;
		Static100.aFloat225 = local16.aFloat223 * local19.aFloat216 + local19.aFloat223 * local16.aFloat221 + local19.aFloat217 * local16.aFloat219;
		@Pc(173) float local173 = Static51.aFloat130 + Static100.aFloat225 * (float) this.anInt1756;
		@Pc(181) float local181 = Static51.aFloat130 + (float) this.anInt1717 * Static100.aFloat225;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local173 > local181) {
			local196 = ((float) -this.anInt1753 + local181) * (float) this.aClass31_Sub1_3.anInt9124;
			local207 = (local173 + (float) this.anInt1753) * (float) this.aClass31_Sub1_3.anInt9124;
		} else {
			local196 = (float) this.aClass31_Sub1_3.anInt9124 * (local173 - (float) this.anInt1753);
			local207 = (float) this.aClass31_Sub1_3.anInt9124 * (local181 + (float) this.anInt1753);
		}
		if (local196 / local96 >= this.aClass31_Sub1_3.aFloat192 || local207 / local96 <= this.aClass31_Sub1_3.aFloat196) {
			return;
		}
		Static427.aFloat166 = local16.aFloat213 * local19.aFloat220 + local16.aFloat216 * local19.aFloat224 + local19.aFloat215 * local16.aFloat214 + local16.aFloat224;
		Static517.aFloat188 = local19.aFloat216 * local16.aFloat216 + local19.aFloat223 * local16.aFloat213 + local16.aFloat214 * local19.aFloat217;
		@Pc(297) float local297 = (float) this.anInt1756 * Static517.aFloat188 + Static427.aFloat166;
		@Pc(305) float local305 = (float) this.anInt1717 * Static517.aFloat188 + Static427.aFloat166;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = (local297 + (float) this.anInt1753) * (float) this.aClass31_Sub1_3.bf;
			local332 = (float) this.aClass31_Sub1_3.bf * ((float) -this.anInt1753 + local305);
		} else {
			local332 = (local297 - (float) this.anInt1753) * (float) this.aClass31_Sub1_3.bf;
			local320 = (float) this.aClass31_Sub1_3.bf * (local305 + (float) this.anInt1753);
		}
		if (this.aClass31_Sub1_3.aFloat199 <= local332 / local96 || this.aClass31_Sub1_3.aFloat200 >= local320 / local96) {
			return;
		}
		if (arg1 != null || this.aClass148Array1 != null) {
			Static243.aFloat186 = local19.aFloat221 * local16.aFloat221 + local19.aFloat213 * local16.aFloat223 + local19.aFloat218 * local16.aFloat219;
			Static483.aFloat180 = local16.aFloat214 * local19.aFloat222 + local16.aFloat216 * local19.aFloat214 + local16.aFloat213 * local19.aFloat219;
			Static121.aFloat74 = local19.aFloat214 * local16.aFloat217 + local16.aFloat218 * local19.aFloat219 + local19.aFloat222 * local16.aFloat222;
			Static546.aFloat212 = local19.aFloat218 * local16.aFloat222 + local16.aFloat217 * local19.aFloat213 + local16.aFloat218 * local19.aFloat221;
			Static537.aFloat208 = local19.aFloat222 * local16.aFloat219 + local16.aFloat223 * local19.aFloat214 + local16.aFloat221 * local19.aFloat219;
			Static563.aFloat151 = local19.aFloat221 * local16.aFloat213 + local16.aFloat216 * local19.aFloat213 + local16.aFloat214 * local19.aFloat218;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt1725 + this.anInt1728 >> 1;
			@Pc(509) int local509 = this.anInt1760 + this.anInt1750 >> 1;
			@Pc(528) int local528 = (int) (Static537.aFloat208 * (float) local509 + (float) this.anInt1756 * Static100.aFloat225 + Static51.aFloat130 + Static243.aFloat186 * (float) local501);
			@Pc(547) int local547 = (int) ((float) this.anInt1756 * Static517.aFloat188 + Static563.aFloat151 * (float) local501 + Static427.aFloat166 + Static483.aFloat180 * (float) local509);
			@Pc(566) int local566 = (int) (Static20.aFloat5 + (float) local501 * Static546.aFloat212 + (float) this.anInt1756 * Static477.aFloat178 + (float) local509 * Static121.aFloat74);
			if (this.aClass31_Sub1_3.anInt9127 <= local566) {
				arg1.anInt314 = this.aClass31_Sub1_3.anInt9142 + this.aClass31_Sub1_3.bf * local547 / local566;
				arg1.anInt317 = local528 * this.aClass31_Sub1_3.anInt9124 / local566 + this.aClass31_Sub1_3.anInt9119;
			} else {
				local491 = true;
			}
			@Pc(624) int local624 = (int) (Static537.aFloat208 * (float) local509 + Static100.aFloat225 * (float) this.anInt1717 + Static51.aFloat130 + Static243.aFloat186 * (float) local501);
			@Pc(643) int local643 = (int) (Static517.aFloat188 * (float) this.anInt1717 + Static563.aFloat151 * (float) local501 + Static427.aFloat166 + (float) local509 * Static483.aFloat180);
			@Pc(662) int local662 = (int) ((float) local509 * Static121.aFloat74 + Static20.aFloat5 + Static546.aFloat212 * (float) local501 + Static477.aFloat178 * (float) this.anInt1717);
			if (this.aClass31_Sub1_3.anInt9127 > local662) {
				local491 = true;
			} else {
				arg1.anInt316 = this.aClass31_Sub1_3.anInt9142 + local643 * this.aClass31_Sub1_3.bf / local662;
				arg1.anInt318 = this.aClass31_Sub1_3.anInt9119 + this.aClass31_Sub1_3.anInt9124 * local624 / local662;
			}
			if (local491) {
				if (this.aClass31_Sub1_3.anInt9127 > local566 && local662 < this.aClass31_Sub1_3.anInt9127) {
					local493 = false;
				} else {
					@Pc(745) int local745;
					@Pc(757) int local757;
					@Pc(783) int local783;
					if (local566 < this.aClass31_Sub1_3.anInt9127) {
						local745 = (local662 - this.aClass31_Sub1_3.anInt9127 << 16) / (local662 - local566);
						local757 = local624 + (local745 * (local624 - local528) >> 16);
						local783 = (local745 * (local643 - local547) >> 16) + local643;
						arg1.anInt317 = this.aClass31_Sub1_3.anInt9119 + this.aClass31_Sub1_3.anInt9124 * local757 / this.aClass31_Sub1_3.anInt9127;
						arg1.anInt314 = this.aClass31_Sub1_3.anInt9142 + this.aClass31_Sub1_3.bf * local783 / this.aClass31_Sub1_3.anInt9127;
					} else if (local662 < this.aClass31_Sub1_3.anInt9127) {
						local745 = (local566 - this.aClass31_Sub1_3.anInt9127 << 16) / (local566 - local662);
						local757 = local528 + (local745 * (local528 - local624) >> 16);
						arg1.anInt317 = this.aClass31_Sub1_3.anInt9119 + local757 * this.aClass31_Sub1_3.anInt9124 / this.aClass31_Sub1_3.anInt9127;
						local783 = (local745 * (local547 - local643) >> 16) + local547;
						arg1.anInt314 = this.aClass31_Sub1_3.anInt9142 + local783 * this.aClass31_Sub1_3.bf / this.aClass31_Sub1_3.anInt9127;
					}
				}
			}
			if (local493) {
				arg1.aBoolean21 = true;
				if (local662 >= local566) {
					arg1.anInt315 = this.aClass31_Sub1_3.anInt9119 + (this.anInt1753 + local624) * this.aClass31_Sub1_3.anInt9124 / local662 - arg1.anInt318;
				} else {
					arg1.anInt315 = this.aClass31_Sub1_3.anInt9119 + this.aClass31_Sub1_3.anInt9124 * (this.anInt1753 + local528) / local566 - arg1.anInt317;
				}
			}
		}
		this.aClass31_Sub1_3.method7139();
		this.aClass31_Sub1_3.method7164(local19);
		this.method1573();
		this.method1577();
	}

	@OriginalMember(owner = "client!cfa", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1710; local3++) {
			if (arg0 != 128) {
				this.anIntArray52[local3] = this.anIntArray52[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray48[local3] = arg1 * this.anIntArray48[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray49[local3] = this.anIntArray49[local3] * arg2 >> 7;
			}
		}
		this.method1580();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)Z")
	private boolean method1572() {
		@Pc(18) boolean local18 = !this.aClass293_2.aBoolean565;
		@Pc(34) boolean local34 = (this.anInt1721 & 0x37) != 0 && !this.aClass293_4.aBoolean565;
		@Pc(42) boolean local42 = !this.aClass293_3.aBoolean565;
		@Pc(50) boolean local50 = !this.aClass293_1.aBoolean565;
		if (!local42 && !local18 && !local34 && !local50) {
			return true;
		}
		@Pc(62) boolean local62 = true;
		@Pc(81) Interface15 local81;
		@Pc(95) Buffer local95;
		if (local42) {
			if (this.aClass293_3.anInterface15_13 == null) {
				this.aClass293_3.anInterface15_13 = this.aClass31_Sub1_3.method7132(this.aBoolean128);
			}
			local81 = this.aClass293_3.anInterface15_13;
			local81.method5277(this.anInt1714 * 12, 12);
			local95 = local81.method5275();
			if (local95 == null) {
				local62 = false;
			} else {
				this.aClass31_Sub1_3.aNativeInterface3.copyPositions(this.anIntArray52, this.anIntArray48, this.anIntArray49, this.aShortArray9, 0, 12, this.anInt1714, local95.getAddress());
				if (local81.method5276()) {
					this.aClass293_3.anInterface15_12 = local81;
					this.aClass293_3.aBoolean565 = true;
				} else {
					local62 = false;
				}
			}
		}
		@Pc(215) short[] local215;
		@Pc(212) short[] local212;
		@Pc(206) short[] local206;
		@Pc(209) byte[] local209;
		if (local18) {
			if (this.aClass293_2.anInterface15_13 == null) {
				this.aClass293_2.anInterface15_13 = this.aClass31_Sub1_3.method7132(this.aBoolean128);
			}
			local81 = this.aClass293_2.anInterface15_13;
			local81.method5277(this.anInt1714 * 4, 4);
			local95 = local81.method5275();
			if (local95 == null) {
				local62 = false;
			} else {
				if ((this.anInt1721 & 0x37) == 0) {
					if (this.aClass229_1 == null) {
						local206 = this.aShortArray17;
						local209 = this.aByteArray21;
						local212 = this.aShortArray16;
						local215 = this.aShortArray13;
					} else {
						local209 = this.aClass229_1.aByteArray165;
						local215 = this.aClass229_1.aShortArray96;
						local212 = this.aClass229_1.aShortArray94;
						local206 = this.aClass229_1.aShortArray95;
					}
					this.aClass31_Sub1_3.aNativeInterface3.copyLighting(this.aShortArray10, this.aByteArray20, this.aShortArray19, local215, local212, local206, local209, this.aShort18, this.aShort19, this.aShortArray11, 0, 4, this.anInt1714, local95.getAddress());
				} else {
					this.aClass31_Sub1_3.aNativeInterface3.copyColours(this.aShortArray10, this.aByteArray20, this.aShortArray19, this.aShort18, this.aShortArray11, 0, 4, this.anInt1714, local95.getAddress());
				}
				if (local81.method5276()) {
					this.aClass293_2.aBoolean565 = true;
					this.aClass293_2.anInterface15_12 = local81;
				} else {
					local62 = false;
				}
			}
		}
		if (local34) {
			if (this.aClass293_4.anInterface15_13 == null) {
				this.aClass293_4.anInterface15_13 = this.aClass31_Sub1_3.method7132(this.aBoolean128);
			}
			local81 = this.aClass293_4.anInterface15_13;
			local81.method5277(this.anInt1714 * 12, 12);
			local95 = local81.method5275();
			if (local95 == null) {
				local62 = false;
			} else {
				if (this.aClass229_1 == null) {
					local215 = this.aShortArray13;
					local209 = this.aByteArray21;
					local206 = this.aShortArray17;
					local212 = this.aShortArray16;
				} else {
					local212 = this.aClass229_1.aShortArray94;
					local206 = this.aClass229_1.aShortArray95;
					local209 = this.aClass229_1.aByteArray165;
					local215 = this.aClass229_1.aShortArray96;
				}
				this.aClass31_Sub1_3.aNativeInterface3.copyNormals(local215, local212, local206, local209, 3.0F / (float) this.aShort19, 3.0F / (float) (this.aShort19 / 2 + this.aShort19), 0, 12, this.anInt1714, local95.getAddress());
				if (local81.method5276()) {
					this.aClass293_4.anInterface15_12 = local81;
					this.aClass293_4.aBoolean565 = true;
				} else {
					local62 = false;
				}
			}
		}
		if (local50) {
			if (this.aClass293_1.anInterface15_13 == null) {
				this.aClass293_1.anInterface15_13 = this.aClass31_Sub1_3.method7132(this.aBoolean128);
			}
			local81 = this.aClass293_1.anInterface15_13;
			local81.method5277(this.anInt1714 * 8, 8);
			local95 = local81.method5275();
			if (local95 == null) {
				local62 = false;
			} else {
				this.aClass31_Sub1_3.aNativeInterface3.copyTexCoords(this.aFloatArray24, this.aFloatArray23, 0, 8, this.anInt1714, local95.getAddress());
				if (local81.method5276()) {
					this.aClass293_1.aBoolean565 = true;
					this.aClass293_1.anInterface15_12 = local81;
				} else {
					local62 = false;
				}
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "()Z")
	@Override
	public boolean method7632() {
		if (this.aShortArray19 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray19.length; local12++) {
			if (this.aShortArray19[local12] != -1 && !this.aClass31_Sub1_3.anInterface4_14.method7227(this.aShortArray19[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray12 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt1744; local12++) {
			this.anIntArray52[local12] <<= 0x4;
			this.anIntArray48[local12] <<= 0x4;
			this.anIntArray49[local12] <<= 0x4;
		}
		Static286.anInt5360 = 0;
		Static501.anInt8647 = 0;
		Static39.anInt1147 = 0;
		return true;
	}

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "(I)V")
	private void method1573() {
		if (this.anInt1776 == 0) {
			return;
		}
		if (this.method1572() && this.method1582()) {
			this.aClass31_Sub1_3.method7113(this.aClass293_3.anInterface15_12, 0);
			this.aClass31_Sub1_3.method7113(this.aClass293_2.anInterface15_12, 1);
			this.aClass31_Sub1_3.method7113(this.aClass293_1.anInterface15_12, 2);
			@Pc(66) boolean local66;
			if ((this.anInt1721 & 0x37) == 0) {
				this.aClass31_Sub1_3.method7082(false);
				local66 = false;
				this.aClass31_Sub1_3.method7149(this.aClass31_Sub1_3.aClass1_16);
			} else {
				local66 = true;
				this.aClass31_Sub1_3.method7082(true);
				this.aClass31_Sub1_3.method7113(this.aClass293_4.anInterface15_12, 3);
				this.aClass31_Sub1_3.method7149(this.aClass31_Sub1_3.aClass1_15);
			}
			for (@Pc(99) int local99 = 0; local99 < this.anIntArray50.length; local99++) {
				@Pc(106) int local106 = this.anIntArray54[local99];
				@Pc(113) int local113 = this.anIntArray54[local99 + 1];
				@Pc(120) int local120 = this.aShortArray19[local106] & 0xFFFF;
				if (local120 == 65535) {
					local120 = -1;
				}
				this.aClass31_Sub1_3.method7088(true, local120, local66);
				this.aClass31_Sub1_3.method7174(Static486.aClass265_10, this.anIntArray51[local99], this.aClass324_1.anInterface2_8, local106 * 3, local113 - local106, this.anIntArray50[local99]);
			}
		}
		this.method1576();
	}

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1756;
	}

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "(I)V")
	private void method1574() {
		if (this.aClass324_1 != null) {
			this.aClass324_1.aBoolean621 = false;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7634(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class52_Sub1 local8 = (Class52_Sub1) arg0;
		if (this.anInt1742 == 0 || local8.anInt1742 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt1710;
		@Pc(24) int[] local24 = local8.anIntArray52;
		@Pc(27) int[] local27 = local8.anIntArray48;
		@Pc(30) int[] local30 = local8.anIntArray49;
		@Pc(33) short[] local33 = local8.aShortArray13;
		@Pc(36) short[] local36 = local8.aShortArray16;
		@Pc(39) short[] local39 = local8.aShortArray17;
		@Pc(42) byte[] local42 = local8.aByteArray21;
		@Pc(51) short[] local51;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(47) byte[] local47;
		if (this.aClass229_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local47 = this.aClass229_1.aByteArray165;
			local51 = this.aClass229_1.aShortArray96;
			local49 = this.aClass229_1.aShortArray94;
			local53 = this.aClass229_1.aShortArray95;
		}
		@Pc(80) short[] local80;
		@Pc(82) short[] local82;
		@Pc(76) short[] local76;
		@Pc(78) byte[] local78;
		if (local8.aClass229_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass229_1.aShortArray96;
			local76 = local8.aClass229_1.aShortArray95;
			local78 = local8.aClass229_1.aByteArray165;
			local82 = local8.aClass229_1.aShortArray94;
		}
		@Pc(103) int[] local103 = local8.anIntArray55;
		@Pc(106) short[] local106 = local8.aShortArray14;
		if (!local8.aBoolean126) {
			local8.method1571();
		}
		@Pc(115) int local115 = local8.anInt1756;
		@Pc(118) int local118 = local8.anInt1717;
		@Pc(121) int local121 = local8.anInt1725;
		@Pc(124) int local124 = local8.anInt1728;
		@Pc(127) int local127 = local8.anInt1760;
		@Pc(130) int local130 = local8.anInt1750;
		for (@Pc(132) int local132 = 0; local132 < this.anInt1710; local132++) {
			@Pc(142) int local142 = this.anIntArray48[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(165) int local165 = this.anIntArray52[local132] - arg1;
				if (local165 >= local121 && local165 <= local124) {
					@Pc(181) int local181 = this.anIntArray49[local132] - arg3;
					if (local181 >= local127 && local130 >= local181) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray55[local132];
						@Pc(203) int local203 = this.anIntArray55[local132 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray14[local205] - 1;
							if (local191 == -1 || this.aByteArray21[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(236) int local236 = 0; local236 < local21; local236++) {
								if (local24[local236] == local165 && local30[local236] == local181 && local27[local236] == local142) {
									local196 = local103[local236];
									@Pc(267) int local267 = -1;
									local203 = local103[local236 + 1];
									for (@Pc(275) int local275 = local196; local275 < local203; local275++) {
										local267 = local106[local275] - 1;
										if (local267 == -1 || local42[local267] != 0) {
											break;
										}
									}
									if (local267 != -1) {
										if (local51 == null) {
											this.aClass229_1 = new Class229();
											local51 = this.aClass229_1.aShortArray96 = Static149.method2825(this.aShortArray13);
											local49 = this.aClass229_1.aShortArray94 = Static149.method2825(this.aShortArray16);
											local53 = this.aClass229_1.aShortArray95 = Static149.method2825(this.aShortArray17);
											local47 = this.aClass229_1.aByteArray165 = Static579.method7894(this.aByteArray21);
										}
										if (local80 == null) {
											@Pc(358) Class229 local358 = local8.aClass229_1 = new Class229();
											local80 = local358.aShortArray96 = Static149.method2825(local33);
											local82 = local358.aShortArray94 = Static149.method2825(local36);
											local76 = local358.aShortArray95 = Static149.method2825(local39);
											local78 = local358.aByteArray165 = Static579.method7894(local42);
										}
										@Pc(391) short local391 = this.aShortArray13[local191];
										@Pc(396) short local396 = this.aShortArray16[local191];
										@Pc(401) short local401 = this.aShortArray17[local191];
										local203 = local103[local236 + 1];
										@Pc(412) byte local412 = this.aByteArray21[local191];
										local196 = local103[local236];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local196; local418 < local203; local418++) {
											local426 = local106[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local78[local426] != 0) {
												local80[local426] += local391;
												local82[local426] += local396;
												local76[local426] += local401;
												local78[local426] += local412;
											}
										}
										local412 = local42[local267];
										local203 = this.anIntArray55[local132 + 1];
										local396 = local36[local267];
										local401 = local39[local267];
										local196 = this.anIntArray55[local132];
										local391 = local33[local267];
										for (local426 = local196; local426 < local203; local426++) {
											@Pc(515) int local515 = this.aShortArray14[local426] - 1;
											if (local515 == -1) {
												break;
											}
											if (local47[local515] != 0) {
												local51[local515] += local391;
												local49[local515] += local396;
												local53[local515] += local401;
												local47[local515] += local412;
											}
										}
										local8.method1583();
										this.method1583();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "(I)V")
	private void method1576() {
		if (!this.aBoolean127) {
			return;
		}
		this.aBoolean127 = false;
		if (this.aClass317Array1 == null && this.aClass280Array1 == null && this.aClass148Array1 == null) {
			if (this.anIntArray52 != null && !Static3.method41(this.anInt1721, this.anInt1704)) {
				if (this.aClass293_3 == null || this.aClass293_3.method6449()) {
					if (!this.aBoolean126) {
						this.method1571();
					}
					this.anIntArray52 = null;
				} else {
					this.aBoolean127 = true;
				}
			}
			if (this.anIntArray48 != null && !Static228.method3729(this.anInt1721, this.anInt1704)) {
				if (this.aClass293_3 == null || this.aClass293_3.method6449()) {
					if (!this.aBoolean126) {
						this.method1571();
					}
					this.anIntArray48 = null;
				} else {
					this.aBoolean127 = true;
				}
			}
			if (this.anIntArray49 != null && !Static351.method5049(this.anInt1704, this.anInt1721)) {
				if (this.aClass293_3 == null || this.aClass293_3.method6449()) {
					if (!this.aBoolean126) {
						this.method1571();
					}
					this.anIntArray49 = null;
				} else {
					this.aBoolean127 = true;
				}
			}
		}
		if (this.aShortArray14 != null && this.anIntArray52 == null && this.anIntArray48 == null && this.anIntArray49 == null) {
			this.anIntArray55 = null;
			this.aShortArray14 = null;
		}
		if (this.aByteArray21 != null && !Static568.method7709(this.anInt1704, this.anInt1721)) {
			label197: {
				label196: {
					@Pc(159) boolean local159;
					if ((this.anInt1721 & 0x37) == 0) {
						if (this.aClass293_2 == null || this.aClass293_2.method6449()) {
							break label196;
						}
						local159 = false;
					} else {
						if (this.aClass293_4 == null || this.aClass293_4.method6449()) {
							break label196;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean127 = true;
						break label197;
					}
				}
				this.aShortArray13 = this.aShortArray16 = this.aShortArray17 = null;
				this.aByteArray21 = null;
			}
		}
		if (this.aShortArray10 != null && !Static122.method2357(this.anInt1721, this.anInt1704)) {
			if (this.aClass293_2 == null || this.aClass293_2.method6449()) {
				this.aShortArray10 = null;
			} else {
				this.aBoolean127 = true;
			}
		}
		if (this.aByteArray20 != null && !Static553.method7584(this.anInt1704, this.anInt1721)) {
			if (this.aClass293_2 == null || this.aClass293_2.method6449()) {
				this.aByteArray20 = null;
			} else {
				this.aBoolean127 = true;
			}
		}
		if (this.aFloatArray24 != null && !Static60.method1447(this.anInt1721, this.anInt1704)) {
			if (this.aClass293_1 == null || this.aClass293_1.method6449()) {
				this.aFloatArray24 = this.aFloatArray23 = null;
			} else {
				this.aBoolean127 = true;
			}
		}
		if (this.aShortArray19 != null && !Static462.method6358(this.anInt1704, this.anInt1721)) {
			if (this.aClass293_2 == null || this.aClass293_2.method6449()) {
				this.aShortArray19 = null;
			} else {
				this.aBoolean127 = true;
			}
		}
		if (this.aShortArray15 != null && !Static280.method4231(this.anInt1721, this.anInt1704)) {
			if ((this.aClass324_1 == null || this.aClass324_1.method7240()) && (this.aClass293_2 == null || this.aClass293_2.method6449())) {
				this.aShortArray15 = this.aShortArray20 = this.aShortArray8 = null;
			} else {
				this.aBoolean127 = true;
			}
		}
		if (this.aShortArray9 != null) {
			if (this.aClass293_3 == null || this.aClass293_3.method6449()) {
				this.aShortArray9 = null;
			} else {
				this.aBoolean127 = true;
			}
		}
		if (this.aShortArray11 != null) {
			if (this.aClass293_2 == null || this.aClass293_2.method6449()) {
				this.aShortArray11 = null;
			} else {
				this.aBoolean127 = true;
			}
		}
		if (this.anIntArrayArray13 != null && !Static172.method3058(this.anInt1704, this.anInt1721)) {
			this.aShortArray12 = null;
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArrayArray12 != null && !Static267.method4075(this.anInt1721, this.anInt1704)) {
			this.anIntArrayArray12 = null;
			this.aShortArray18 = null;
		}
		if (this.anIntArrayArray11 != null && !Static196.method3430(this.anInt1721, this.anInt1704)) {
			this.anIntArrayArray11 = null;
		}
		if (this.anIntArray54 != null && (this.anInt1704 & 0x800) == 0 && (this.anInt1704 & 0x40000) == 0) {
			this.anIntArray50 = null;
			this.anIntArray54 = null;
			this.anIntArray51 = null;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub3 S(@OriginalArg(0) Class3_Sub7_Sub3 arg0) {
		if (this.anInt1714 == 0) {
			return null;
		}
		if (!this.aBoolean126) {
			this.method1571();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass31_Sub1_3.anInt9143 > 0) {
			local40 = this.anInt1725 - (this.anInt1717 * this.aClass31_Sub1_3.anInt9143 >> 8) >> this.aClass31_Sub1_3.anInt9130;
			local56 = this.anInt1728 - (this.aClass31_Sub1_3.anInt9143 * this.anInt1756 >> 8) >> this.aClass31_Sub1_3.anInt9130;
		} else {
			local40 = this.anInt1725 - (this.anInt1756 * this.aClass31_Sub1_3.anInt9143 >> 8) >> this.aClass31_Sub1_3.anInt9130;
			local56 = this.anInt1728 - (this.aClass31_Sub1_3.anInt9143 * this.anInt1717 >> 8) >> this.aClass31_Sub1_3.anInt9130;
		}
		@Pc(112) int local112;
		@Pc(129) int local129;
		if (this.aClass31_Sub1_3.anInt9118 > 0) {
			local112 = this.anInt1760 - (this.aClass31_Sub1_3.anInt9118 * this.anInt1717 >> 8) >> this.aClass31_Sub1_3.anInt9130;
			local129 = this.anInt1750 - (this.aClass31_Sub1_3.anInt9118 * this.anInt1756 >> 8) >> this.aClass31_Sub1_3.anInt9130;
		} else {
			local112 = this.anInt1760 - (this.aClass31_Sub1_3.anInt9118 * this.anInt1756 >> 8) >> this.aClass31_Sub1_3.anInt9130;
			local129 = this.anInt1750 - (this.aClass31_Sub1_3.anInt9118 * this.anInt1717 >> 8) >> this.aClass31_Sub1_3.anInt9130;
		}
		@Pc(172) int local172 = local56 + 1 - local40;
		@Pc(178) int local178 = local129 + 1 - local112;
		@Pc(181) Class3_Sub7_Sub3_Sub2 local181 = (Class3_Sub7_Sub3_Sub2) arg0;
		@Pc(191) Class3_Sub7_Sub3_Sub2 local191;
		if (local181 != null && local181.method8142(local178, local172)) {
			local191 = local181;
			local181.method8144();
		} else {
			local191 = new Class3_Sub7_Sub3_Sub2(this.aClass31_Sub1_3, local172, local178);
		}
		local191.method8146(local129, local112, local56, local40);
		this.method1581(local191);
		return local191;
	}

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "(I)V")
	private void method1577() {
		if (this.aClass148Array1 == null) {
			return;
		}
		this.aClass31_Sub1_3.ZA(!this.aBoolean129);
		this.aClass31_Sub1_3.method7082(false);
		this.aClass31_Sub1_3.method7155(1, Static438.aClass179_14);
		this.aClass31_Sub1_3.method7185(Static438.aClass179_14, 1);
		for (@Pc(40) int local40 = 0; local40 < this.anInt1735; local40++) {
			@Pc(47) Class148 local47 = this.aClass148Array1[local40];
			@Pc(52) Class66 local52 = this.aClass66Array1[local40];
			if (!local47.aBoolean301 || !this.aClass31_Sub1_3.method8085()) {
				@Pc(81) float local81 = (float) (this.anIntArray52[local47.anInt4658] + this.anIntArray52[local47.anInt4662] + this.anIntArray52[local47.anInt4657]) * 0.3333333F;
				@Pc(102) float local102 = (float) (this.anIntArray48[local47.anInt4658] + this.anIntArray48[local47.anInt4662] + this.anIntArray48[local47.anInt4657]) * 0.3333333F;
				@Pc(123) float local123 = (float) (this.anIntArray49[local47.anInt4657] + this.anIntArray49[local47.anInt4662] + this.anIntArray49[local47.anInt4658]) * 0.3333333F;
				@Pc(137) float local137 = local123 * Static537.aFloat208 + local81 * Static243.aFloat186 + local102 * Static100.aFloat225 + Static51.aFloat130;
				@Pc(151) float local151 = Static427.aFloat166 + Static483.aFloat180 * local123 + Static517.aFloat188 * local102 + Static563.aFloat151 * local81;
				@Pc(165) float local165 = local102 * Static477.aFloat178 + Static546.aFloat212 * local81 + local123 * Static121.aFloat74 + Static20.aFloat5;
				@Pc(170) Class42_Sub3 local170 = this.aClass31_Sub1_3.method7168();
				local170.method7526(local52.anInt2317, local52.anInt2313 * local47.aShort53 >> 7, (float) local52.anInt2319 + local137, (float) -local47.anInt4659 + local165, local151 + (float) local52.anInt2321, local47.aShort54 * local52.anInt2314 >> 7);
				local170.method7538(this.aClass31_Sub1_3.aClass42_Sub3_17);
				this.aClass31_Sub1_3.method7128();
				@Pc(218) int local218 = local52.anInt2316;
				this.aClass31_Sub1_3.method7088(false, local47.aShort52, false);
				this.aClass31_Sub1_3.method7115(local47.aByte44);
				this.aClass31_Sub1_3.method7160(local218);
				this.aClass31_Sub1_3.method7100();
			}
		}
		this.aClass31_Sub1_3.method7185(Static415.aClass179_24, 1);
		this.aClass31_Sub1_3.method7155(1, Static415.aClass179_24);
		this.aClass31_Sub1_3.ZA(true);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7614(@OriginalArg(0) Class42 arg0) {
		@Pc(8) Class42_Sub3 local8 = (Class42_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass317Array1 != null) {
			for (local13 = 0; local13 < this.aClass317Array1.length; local13++) {
				@Pc(20) Class317 local20 = this.aClass317Array1[local13];
				@Pc(22) Class317 local22 = local20;
				if (local20.aClass317_2 != null) {
					local22 = local20.aClass317_2;
				}
				local22.anInt8865 = (int) (local8.aFloat220 + local8.aFloat219 * (float) this.anIntArray49[local20.anInt8871] + local8.aFloat221 * (float) this.anIntArray52[local20.anInt8871] + (float) this.anIntArray48[local20.anInt8871] * local8.aFloat223);
				local22.anInt8863 = (int) (local8.aFloat224 + (float) this.anIntArray49[local20.anInt8871] * local8.aFloat214 + local8.aFloat213 * (float) this.anIntArray52[local20.anInt8871] + local8.aFloat216 * (float) this.anIntArray48[local20.anInt8871]);
				local22.anInt8875 = (int) (local8.aFloat215 + local8.aFloat222 * (float) this.anIntArray49[local20.anInt8871] + (float) this.anIntArray52[local20.anInt8871] * local8.aFloat218 + (float) this.anIntArray48[local20.anInt8871] * local8.aFloat217);
				local22.anInt8862 = (int) (local8.aFloat220 + local8.aFloat219 * (float) this.anIntArray49[local20.anInt8874] + (float) this.anIntArray48[local20.anInt8874] * local8.aFloat223 + (float) this.anIntArray52[local20.anInt8874] * local8.aFloat221);
				local22.anInt8872 = (int) ((float) this.anIntArray49[local20.anInt8874] * local8.aFloat214 + (float) this.anIntArray52[local20.anInt8874] * local8.aFloat213 + (float) this.anIntArray48[local20.anInt8874] * local8.aFloat216 + local8.aFloat224);
				local22.anInt8868 = (int) (local8.aFloat215 + local8.aFloat218 * (float) this.anIntArray52[local20.anInt8874] + (float) this.anIntArray48[local20.anInt8874] * local8.aFloat217 + (float) this.anIntArray49[local20.anInt8874] * local8.aFloat222);
				local22.anInt8864 = (int) (local8.aFloat220 + local8.aFloat221 * (float) this.anIntArray52[local20.anInt8867] + (float) this.anIntArray48[local20.anInt8867] * local8.aFloat223 + (float) this.anIntArray49[local20.anInt8867] * local8.aFloat219);
				local22.anInt8877 = (int) (local8.aFloat224 + (float) this.anIntArray48[local20.anInt8867] * local8.aFloat216 + (float) this.anIntArray52[local20.anInt8867] * local8.aFloat213 + local8.aFloat214 * (float) this.anIntArray49[local20.anInt8867]);
				local22.anInt8879 = (int) ((float) this.anIntArray48[local20.anInt8867] * local8.aFloat217 + local8.aFloat218 * (float) this.anIntArray52[local20.anInt8867] + local8.aFloat222 * (float) this.anIntArray49[local20.anInt8867] + local8.aFloat215);
			}
		}
		if (this.aClass280Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass280Array1.length; local13++) {
			@Pc(361) Class280 local361 = this.aClass280Array1[local13];
			@Pc(363) Class280 local363 = local361;
			if (local361.aClass280_2 != null) {
				local363 = local361.aClass280_2;
			}
			if (local361.aClass42_5 == null) {
				local361.aClass42_5 = local8.method7519();
			} else {
				local361.aClass42_5.M(local8);
			}
			local363.anInt7965 = (int) (local8.aFloat223 * (float) this.anIntArray48[local361.anInt7963] + (float) this.anIntArray52[local361.anInt7963] * local8.aFloat221 + local8.aFloat219 * (float) this.anIntArray49[local361.anInt7963] + local8.aFloat220);
			local363.anInt7971 = (int) (local8.aFloat224 + (float) this.anIntArray48[local361.anInt7963] * local8.aFloat216 + (float) this.anIntArray52[local361.anInt7963] * local8.aFloat213 + (float) this.anIntArray49[local361.anInt7963] * local8.aFloat214);
			local363.anInt7964 = (int) ((float) this.anIntArray48[local361.anInt7963] * local8.aFloat217 + (float) this.anIntArray52[local361.anInt7963] * local8.aFloat218 + (float) this.anIntArray49[local361.anInt7963] * local8.aFloat222 + local8.aFloat215);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7629(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray18 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1710; local14++) {
			if ((this.aShortArray18[local14] & arg1) != 0) {
				if (arg2) {
					arg0.I(this.anIntArray52[local14], this.anIntArray48[local14], this.anIntArray49[local14], local12);
				} else {
					arg0.method7518(this.anIntArray52[local14], this.anIntArray48[local14], this.anIntArray49[local14], local12);
				}
				this.anIntArray52[local14] = local12[0];
				this.anIntArray48[local14] = local12[1];
				this.anIntArray49[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean126) {
			this.method1571();
		}
		@Pc(16) int local16 = arg4 + this.anInt1725;
		@Pc(21) int local21 = this.anInt1728 + arg4;
		@Pc(27) int local27 = arg6 + this.anInt1760;
		@Pc(32) int local32 = this.anInt1750 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt10004 <= arg2.anInt10009 + local21 >> arg2.anInt10008 || local27 < 0 || local32 + arg2.anInt10009 >> arg2.anInt10008 >= arg2.anInt10007)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10004 <= arg3.anInt10009 + local21 >> arg3.anInt10008 || local27 < 0 || local32 + arg3.anInt10009 >> arg3.anInt10008 >= arg3.anInt10007) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10008;
			local21 = local21 + arg2.anInt10009 - 1 >> arg2.anInt10008;
			local27 >>= arg2.anInt10008;
			local32 = arg2.anInt10009 + local32 - 1 >> arg2.anInt10008;
			if (arg5 == arg2.method7862(local27, local16) && arg2.method7862(local27, local21) == arg5 && arg2.method7862(local32, local16) == arg5 && arg5 == arg2.method7862(local32, local21)) {
				return;
			}
		}
		@Pc(190) int local190;
		if (arg0 == 1) {
			for (local190 = 0; local190 < this.anInt1710; local190++) {
				this.anIntArray48[local190] = this.anIntArray48[local190] + arg2.method7860(this.anIntArray49[local190] + arg6, this.anIntArray52[local190] - -arg4) - arg5;
			}
		} else {
			@Pc(195) int local195;
			@Pc(206) int local206;
			if (arg0 == 2) {
				local190 = this.anInt1756;
				if (local190 == 0) {
					return;
				}
				for (local195 = 0; local195 < this.anInt1710; local195++) {
					local206 = (this.anIntArray48[local195] << 16) / local190;
					if (arg1 > local206) {
						this.anIntArray48[local195] -= -((arg2.method7860(arg6 + this.anIntArray49[local195], this.anIntArray52[local195] + arg4) - arg5) * (arg1 + -local206) / arg1);
					}
				}
			} else {
				@Pc(292) int local292;
				if (arg0 == 3) {
					local190 = (arg1 & 0xFF) * 4;
					local195 = (arg1 >> 8 & 0xFF) * 4;
					local206 = (arg1 >> 16 & 0xFF) << 6;
					local292 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local190 >> 1) < 0 || arg2.anInt10004 << arg2.anInt10008 <= (local190 >> 1) + arg4 + arg2.anInt10009 || arg6 - (local195 >> 1) < 0 || (local195 >> 1) + (arg6 + arg2.anInt10009) >= arg2.anInt10007 << arg2.anInt10008) {
						return;
					}
					this.method7627(arg4, local190, local206, arg5, arg2, arg6, local292, local195);
				} else if (arg0 == 4) {
					local190 = this.anInt1717 - this.anInt1756;
					for (local195 = 0; local195 < this.anInt1710; local195++) {
						this.anIntArray48[local195] = this.anIntArray48[local195] + arg3.method7860(arg6 + this.anIntArray49[local195], this.anIntArray52[local195] + arg4) + local190 - arg5;
					}
				} else if (arg0 == 5) {
					local190 = this.anInt1717 - this.anInt1756;
					for (local195 = 0; local195 < this.anInt1710; local195++) {
						local206 = arg4 + this.anIntArray52[local195];
						local292 = this.anIntArray49[local195] + arg6;
						@Pc(298) int local298 = arg2.method7860(local292, local206);
						@Pc(304) int local304 = arg3.method7860(local292, local206);
						@Pc(312) int local312 = local298 - arg1 - local304;
						this.anIntArray48[local195] = (local312 * ((this.anIntArray48[local195] << 8) / local190) >> 8) + local298 - arg5;
					}
				}
			}
		}
		this.method1580();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!cfa;Lclient!cfa;ZIZ)Lclient!da;")
	private Class52 method1578(@OriginalArg(1) Class52_Sub1 arg0, @OriginalArg(2) Class52_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt1742 = this.anInt1742;
		arg0.anInt1704 = arg3;
		arg0.aShort19 = this.aShort19;
		arg0.anInt1710 = this.anInt1710;
		arg0.anInt1714 = this.anInt1714;
		arg0.anInt1735 = this.anInt1735;
		if ((arg3 & 0x100) == 0) {
			arg0.aBoolean129 = this.aBoolean129;
		} else {
			arg0.aBoolean129 = true;
		}
		arg0.anInt1744 = this.anInt1744;
		arg0.anInt1721 = this.anInt1721;
		arg0.aShort18 = this.aShort18;
		arg0.anInt1776 = this.anInt1776;
		@Pc(63) boolean local63 = Static584.method7945(this.anInt1721, arg3);
		@Pc(69) boolean local69 = Static310.method4645(arg3, this.anInt1721);
		@Pc(75) boolean local75 = Static370.method5107(arg3, this.anInt1721);
		@Pc(81) boolean local81 = local75 | local63 | local69;
		@Pc(196) int local196;
		if (local81) {
			if (!local63) {
				arg0.anIntArray52 = this.anIntArray52;
			} else if (arg1.anIntArray52 == null || this.anInt1744 > arg1.anIntArray52.length) {
				arg0.anIntArray52 = arg1.anIntArray52 = new int[this.anInt1744];
			} else {
				arg0.anIntArray52 = arg1.anIntArray52;
			}
			if (!local69) {
				arg0.anIntArray48 = this.anIntArray48;
			} else if (arg1.anIntArray48 == null || arg1.anIntArray48.length < this.anInt1744) {
				arg0.anIntArray48 = arg1.anIntArray48 = new int[this.anInt1744];
			} else {
				arg0.anIntArray48 = arg1.anIntArray48;
			}
			if (!local75) {
				arg0.anIntArray49 = this.anIntArray49;
			} else if (arg1.anIntArray49 == null || arg1.anIntArray49.length < this.anInt1744) {
				arg0.anIntArray49 = arg1.anIntArray49 = new int[this.anInt1744];
			} else {
				arg0.anIntArray49 = arg1.anIntArray49;
			}
			for (local196 = 0; local196 < this.anInt1744; local196++) {
				if (local63) {
					arg0.anIntArray52[local196] = this.anIntArray52[local196];
				}
				if (local69) {
					arg0.anIntArray48[local196] = this.anIntArray48[local196];
				}
				if (local75) {
					arg0.anIntArray49[local196] = this.anIntArray49[local196];
				}
			}
		} else {
			arg0.anIntArray49 = this.anIntArray49;
			arg0.anIntArray52 = this.anIntArray52;
			arg0.anIntArray48 = this.anIntArray48;
		}
		if (Static230.method3739(this.anInt1721, arg3)) {
			arg0.aClass293_3 = arg1.aClass293_3;
			arg0.aClass293_3.aBoolean566 = true;
			arg0.aClass293_3.anInterface15_12 = this.aClass293_3.anInterface15_12;
			arg0.aClass293_3.aBoolean565 = this.aClass293_3.aBoolean565;
		} else if (Static160.method2925(this.anInt1721, arg3)) {
			arg0.aClass293_3 = this.aClass293_3;
		} else {
			arg0.aClass293_3 = null;
		}
		if (Static317.method4702(arg3, this.anInt1721)) {
			if (arg1.aShortArray10 == null || arg1.aShortArray10.length < this.anInt1742) {
				arg0.aShortArray10 = arg1.aShortArray10 = new short[this.anInt1742];
			} else {
				arg0.aShortArray10 = arg1.aShortArray10;
			}
			for (local196 = 0; local196 < this.anInt1742; local196++) {
				arg0.aShortArray10[local196] = this.aShortArray10[local196];
			}
		} else {
			arg0.aShortArray10 = this.aShortArray10;
		}
		if (Static286.method4308(this.anInt1721, arg3)) {
			if (arg1.aByteArray20 == null || arg1.aByteArray20.length < this.anInt1742) {
				arg0.aByteArray20 = arg1.aByteArray20 = new byte[this.anInt1742];
			} else {
				arg0.aByteArray20 = arg1.aByteArray20;
			}
			for (local196 = 0; local196 < this.anInt1742; local196++) {
				arg0.aByteArray20[local196] = this.aByteArray20[local196];
			}
		} else {
			arg0.aByteArray20 = this.aByteArray20;
		}
		if (Static576.method7812(arg3, this.anInt1721)) {
			arg0.aClass293_2 = arg1.aClass293_2;
			arg0.aClass293_2.aBoolean566 = true;
			arg0.aClass293_2.aBoolean565 = this.aClass293_2.aBoolean565;
			arg0.aClass293_2.anInterface15_12 = this.aClass293_2.anInterface15_12;
		} else if (Static313.method4671(arg3, this.anInt1721)) {
			arg0.aClass293_2 = this.aClass293_2;
		} else {
			arg0.aClass293_2 = null;
		}
		@Pc(517) int local517;
		if (Static266.method4068(this.anInt1721, arg3)) {
			if (arg1.aShortArray13 == null || arg1.aShortArray13.length < this.anInt1714) {
				local196 = this.anInt1714;
				arg0.aShortArray13 = arg1.aShortArray13 = new short[local196];
				arg0.aShortArray16 = arg1.aShortArray16 = new short[local196];
				arg0.aShortArray17 = arg1.aShortArray17 = new short[local196];
			} else {
				arg0.aShortArray17 = arg1.aShortArray17;
				arg0.aShortArray16 = arg1.aShortArray16;
				arg0.aShortArray13 = arg1.aShortArray13;
			}
			if (this.aClass229_1 == null) {
				arg0.aClass229_1 = null;
				for (local196 = 0; local196 < this.anInt1714; local196++) {
					arg0.aShortArray13[local196] = this.aShortArray13[local196];
					arg0.aShortArray16[local196] = this.aShortArray16[local196];
					arg0.aShortArray17[local196] = this.aShortArray17[local196];
				}
			} else {
				if (arg1.aClass229_1 == null) {
					arg1.aClass229_1 = new Class229();
				}
				@Pc(505) Class229 local505 = arg0.aClass229_1 = arg1.aClass229_1;
				if (local505.aShortArray96 == null || local505.aShortArray96.length < this.anInt1714) {
					local517 = this.anInt1714;
					local505.aShortArray96 = new short[local517];
					local505.aShortArray95 = new short[local517];
					local505.aShortArray94 = new short[local517];
					local505.aByteArray165 = new byte[local517];
				}
				for (local517 = 0; local517 < this.anInt1714; local517++) {
					arg0.aShortArray13[local517] = this.aShortArray13[local517];
					arg0.aShortArray16[local517] = this.aShortArray16[local517];
					arg0.aShortArray17[local517] = this.aShortArray17[local517];
					local505.aShortArray96[local517] = this.aClass229_1.aShortArray96[local517];
					local505.aShortArray94[local517] = this.aClass229_1.aShortArray94[local517];
					local505.aShortArray95[local517] = this.aClass229_1.aShortArray95[local517];
					local505.aByteArray165[local517] = this.aClass229_1.aByteArray165[local517];
				}
			}
			arg0.aByteArray21 = this.aByteArray21;
		} else {
			arg0.aShortArray17 = this.aShortArray17;
			arg0.aShortArray16 = this.aShortArray16;
			arg0.aByteArray21 = this.aByteArray21;
			arg0.aShortArray13 = this.aShortArray13;
			arg0.aClass229_1 = this.aClass229_1;
		}
		if (Static252.method3945(this.anInt1721, arg3)) {
			arg0.aClass293_4 = arg1.aClass293_4;
			arg0.aClass293_4.aBoolean566 = true;
			arg0.aClass293_4.aBoolean565 = this.aClass293_4.aBoolean565;
			arg0.aClass293_4.anInterface15_12 = this.aClass293_4.anInterface15_12;
		} else if (Static339.method4966(arg3, this.anInt1721)) {
			arg0.aClass293_4 = this.aClass293_4;
		} else {
			arg0.aClass293_4 = null;
		}
		if (Static44.method8133(this.anInt1721, arg3)) {
			if (arg1.aFloatArray24 == null || this.anInt1742 > arg1.aFloatArray24.length) {
				local196 = this.anInt1714;
				arg0.aFloatArray24 = arg1.aFloatArray24 = new float[local196];
				arg0.aFloatArray23 = arg1.aFloatArray23 = new float[local196];
			} else {
				arg0.aFloatArray24 = arg1.aFloatArray24;
				arg0.aFloatArray23 = arg1.aFloatArray23;
			}
			for (local196 = 0; local196 < this.anInt1714; local196++) {
				arg0.aFloatArray24[local196] = this.aFloatArray24[local196];
				arg0.aFloatArray23[local196] = this.aFloatArray23[local196];
			}
		} else {
			arg0.aFloatArray23 = this.aFloatArray23;
			arg0.aFloatArray24 = this.aFloatArray24;
		}
		if (Static113.method2270(this.anInt1721, arg3)) {
			arg0.aClass293_1 = arg1.aClass293_1;
			arg0.aClass293_1.aBoolean565 = this.aClass293_1.aBoolean565;
			arg0.aClass293_1.anInterface15_12 = this.aClass293_1.anInterface15_12;
			arg0.aClass293_1.aBoolean566 = true;
		} else if (Static567.method4396(arg3, this.anInt1721)) {
			arg0.aClass293_1 = this.aClass293_1;
		} else {
			arg0.aClass293_1 = null;
		}
		if (Static492.method6622(arg3, this.anInt1721)) {
			if (arg1.aShortArray15 == null || arg1.aShortArray15.length < this.anInt1742) {
				local196 = this.anInt1742;
				arg0.aShortArray20 = arg1.aShortArray20 = new short[local196];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local196];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local196];
			} else {
				arg0.aShortArray15 = arg1.aShortArray15;
				arg0.aShortArray20 = arg1.aShortArray20;
				arg0.aShortArray8 = arg1.aShortArray8;
			}
			for (local196 = 0; local196 < this.anInt1742; local196++) {
				arg0.aShortArray15[local196] = this.aShortArray15[local196];
				arg0.aShortArray20[local196] = this.aShortArray20[local196];
				arg0.aShortArray8[local196] = this.aShortArray8[local196];
			}
		} else {
			arg0.aShortArray15 = this.aShortArray15;
			arg0.aShortArray8 = this.aShortArray8;
			arg0.aShortArray20 = this.aShortArray20;
		}
		if (Static19.method208(arg3, this.anInt1721)) {
			arg0.aClass324_1 = arg1.aClass324_1;
			arg0.aClass324_1.anInterface2_8 = this.aClass324_1.anInterface2_8;
			arg0.aClass324_1.aBoolean621 = this.aClass324_1.aBoolean621;
			arg0.aClass324_1.aBoolean622 = true;
		} else if (Static409.method1339(arg3, this.anInt1721)) {
			arg0.aClass324_1 = this.aClass324_1;
		} else {
			arg0.aClass324_1 = null;
		}
		if (Static472.method6445(this.anInt1721, arg3)) {
			if (arg1.aShortArray19 == null || arg1.aShortArray19.length < this.anInt1742) {
				local196 = this.anInt1742;
				arg0.aShortArray19 = arg1.aShortArray19 = new short[local196];
			} else {
				arg0.aShortArray19 = arg1.aShortArray19;
			}
			for (local196 = 0; local196 < this.anInt1742; local196++) {
				arg0.aShortArray19[local196] = this.aShortArray19[local196];
			}
		} else {
			arg0.aShortArray19 = this.aShortArray19;
		}
		if (!Static68.method1646(this.anInt1721, arg3)) {
			arg0.aClass66Array1 = this.aClass66Array1;
		} else if (arg1.aClass66Array1 == null || this.anInt1735 > arg1.aClass66Array1.length) {
			local196 = this.anInt1735;
			arg0.aClass66Array1 = arg1.aClass66Array1 = new Class66[local196];
			for (local517 = 0; local517 < this.anInt1735; local517++) {
				arg0.aClass66Array1[local517] = this.aClass66Array1[local517].method1969();
			}
		} else {
			arg0.aClass66Array1 = arg1.aClass66Array1;
			for (local196 = 0; local196 < this.anInt1735; local196++) {
				arg0.aClass66Array1[local196].method1968(this.aClass66Array1[local196]);
			}
		}
		arg0.anIntArray51 = this.anIntArray51;
		arg0.anIntArray54 = this.anIntArray54;
		arg0.aClass280Array1 = this.aClass280Array1;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray9 = this.aShortArray9;
		arg0.anIntArray50 = this.anIntArray50;
		arg0.aShortArray11 = this.aShortArray11;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.anIntArray55 = this.anIntArray55;
		arg0.aShortArray18 = this.aShortArray18;
		arg0.aClass148Array1 = this.aClass148Array1;
		arg0.aClass317Array1 = this.aClass317Array1;
		if (this.aBoolean126) {
			arg0.anInt1760 = this.anInt1760;
			arg0.anInt1750 = this.anInt1750;
			arg0.anInt1737 = this.anInt1737;
			arg0.anInt1756 = this.anInt1756;
			arg0.aBoolean126 = true;
			arg0.anInt1725 = this.anInt1725;
			arg0.anInt1717 = this.anInt1717;
			arg0.anInt1728 = this.anInt1728;
			arg0.anInt1753 = this.anInt1753;
		} else {
			arg0.aBoolean126 = false;
		}
		arg0.anIntArrayArray11 = this.anIntArrayArray11;
		arg0.aShortArray14 = this.aShortArray14;
		arg0.anIntArrayArray13 = this.anIntArrayArray13;
		return arg0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!q;Lclient!b;II)V")
	@Override
	public void method7619(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1714 == 0) {
			return;
		}
		@Pc(13) Class42_Sub3 local13 = this.aClass31_Sub1_3.aClass42_Sub3_16;
		@Pc(16) Class42_Sub3 local16 = (Class42_Sub3) arg0;
		if (!this.aBoolean126) {
			this.method1571();
		}
		Static477.aFloat178 = local16.aFloat223 * local13.aFloat218 + local13.aFloat217 * local16.aFloat216 + local16.aFloat217 * local13.aFloat222;
		Static20.aFloat5 = local16.aFloat215 * local13.aFloat222 + local16.aFloat224 * local13.aFloat217 + local13.aFloat218 * local16.aFloat220 + local13.aFloat215;
		@Pc(69) float local69 = (float) this.anInt1756 * Static477.aFloat178 + Static20.aFloat5;
		@Pc(77) float local77 = (float) this.anInt1717 * Static477.aFloat178 + Static20.aFloat5;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.anInt1753;
			local93 = local77 - (float) this.anInt1753;
		} else {
			local93 = local69 - (float) this.anInt1753;
			local87 = (float) this.anInt1753 + local77;
		}
		if (local93 >= this.aClass31_Sub1_3.aFloat190 || local87 <= (float) this.aClass31_Sub1_3.anInt9127) {
			return;
		}
		Static100.aFloat225 = local16.aFloat217 * local13.aFloat219 + local16.aFloat216 * local13.aFloat223 + local16.aFloat223 * local13.aFloat221;
		Static51.aFloat130 = local13.aFloat219 * local16.aFloat215 + local13.aFloat223 * local16.aFloat224 + local16.aFloat220 * local13.aFloat221 + local13.aFloat220;
		@Pc(169) float local169 = (float) this.anInt1756 * Static100.aFloat225 + Static51.aFloat130;
		@Pc(177) float local177 = (float) this.anInt1717 * Static100.aFloat225 + Static51.aFloat130;
		@Pc(192) float local192;
		@Pc(203) float local203;
		if (local177 < local169) {
			local192 = (local177 - (float) this.anInt1753) * (float) this.aClass31_Sub1_3.anInt9124;
			local203 = (float) this.aClass31_Sub1_3.anInt9124 * (local169 + (float) this.anInt1753);
		} else {
			local192 = (float) this.aClass31_Sub1_3.anInt9124 * ((float) -this.anInt1753 + local169);
			local203 = ((float) this.anInt1753 + local177) * (float) this.aClass31_Sub1_3.anInt9124;
		}
		if (this.aClass31_Sub1_3.aFloat192 <= local192 / (float) arg2 || this.aClass31_Sub1_3.aFloat196 >= local203 / (float) arg2) {
			return;
		}
		Static517.aFloat188 = local16.aFloat217 * local13.aFloat214 + local16.aFloat223 * local13.aFloat213 + local13.aFloat216 * local16.aFloat216;
		Static427.aFloat166 = local13.aFloat224 + local13.aFloat216 * local16.aFloat224 + local16.aFloat220 * local13.aFloat213 + local13.aFloat214 * local16.aFloat215;
		@Pc(295) float local295 = (float) this.anInt1756 * Static517.aFloat188 + Static427.aFloat166;
		@Pc(303) float local303 = Static427.aFloat166 + (float) this.anInt1717 * Static517.aFloat188;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local295 > local303) {
			local319 = ((float) -this.anInt1753 + local303) * (float) this.aClass31_Sub1_3.bf;
			local330 = (float) this.aClass31_Sub1_3.bf * (local295 + (float) this.anInt1753);
		} else {
			local319 = (local295 - (float) this.anInt1753) * (float) this.aClass31_Sub1_3.bf;
			local330 = (float) this.aClass31_Sub1_3.bf * ((float) this.anInt1753 + local303);
		}
		if (local319 / (float) arg2 >= this.aClass31_Sub1_3.aFloat199 || this.aClass31_Sub1_3.aFloat200 >= local330 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass148Array1 != null) {
			Static537.aFloat208 = local13.aFloat219 * local16.aFloat222 + local13.aFloat223 * local16.aFloat214 + local16.aFloat219 * local13.aFloat221;
			Static563.aFloat151 = local16.aFloat218 * local13.aFloat214 + local13.aFloat216 * local16.aFloat213 + local16.aFloat221 * local13.aFloat213;
			Static121.aFloat74 = local16.aFloat222 * local13.aFloat222 + local13.aFloat217 * local16.aFloat214 + local16.aFloat219 * local13.aFloat218;
			Static546.aFloat212 = local16.aFloat218 * local13.aFloat222 + local16.aFloat213 * local13.aFloat217 + local13.aFloat218 * local16.aFloat221;
			Static243.aFloat186 = local13.aFloat219 * local16.aFloat218 + local13.aFloat221 * local16.aFloat221 + local16.aFloat213 * local13.aFloat223;
			Static483.aFloat180 = local16.aFloat222 * local13.aFloat214 + local13.aFloat213 * local16.aFloat219 + local13.aFloat216 * local16.aFloat214;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.anInt1728 + this.anInt1725 >> 1;
			@Pc(505) int local505 = this.anInt1750 + this.anInt1760 >> 1;
			@Pc(524) int local524 = (int) ((float) this.anInt1756 * Static100.aFloat225 + Static51.aFloat130 + (float) local497 * Static243.aFloat186 + (float) local505 * Static537.aFloat208);
			@Pc(543) int local543 = (int) (Static483.aFloat180 * (float) local505 + (float) local497 * Static563.aFloat151 + Static427.aFloat166 + Static517.aFloat188 * (float) this.anInt1756);
			@Pc(562) int local562 = (int) (Static20.aFloat5 + (float) local497 * Static546.aFloat212 + (float) this.anInt1756 * Static477.aFloat178 + Static121.aFloat74 * (float) local505);
			@Pc(581) int local581 = (int) (Static51.aFloat130 + Static243.aFloat186 * (float) local497 + (float) this.anInt1717 * Static100.aFloat225 + (float) local505 * Static537.aFloat208);
			@Pc(600) int local600 = (int) (Static427.aFloat166 + Static563.aFloat151 * (float) local497 + Static517.aFloat188 * (float) this.anInt1717 + Static483.aFloat180 * (float) local505);
			arg1.anInt318 = this.aClass31_Sub1_3.anInt9119 + this.aClass31_Sub1_3.anInt9124 * local581 / arg2;
			arg1.anInt316 = this.aClass31_Sub1_3.bf * local600 / arg2 + this.aClass31_Sub1_3.anInt9142;
			@Pc(646) int local646 = (int) ((float) local505 * Static121.aFloat74 + Static477.aFloat178 * (float) this.anInt1717 + Static20.aFloat5 + Static546.aFloat212 * (float) local497);
			arg1.anInt314 = local543 * this.aClass31_Sub1_3.bf / arg2 + this.aClass31_Sub1_3.anInt9142;
			arg1.anInt317 = this.aClass31_Sub1_3.anInt9119 + local524 * this.aClass31_Sub1_3.anInt9124 / arg2;
			if (local562 >= this.aClass31_Sub1_3.anInt9127 || this.aClass31_Sub1_3.anInt9127 <= local646) {
				arg1.anInt315 = this.aClass31_Sub1_3.anInt9119 + this.aClass31_Sub1_3.anInt9124 * (this.anInt1753 + local524) / arg2 - arg1.anInt317;
				arg1.aBoolean21 = true;
			}
		}
		this.aClass31_Sub1_3.method7140((float) arg2);
		this.aClass31_Sub1_3.method7071();
		this.aClass31_Sub1_3.method7164(local16);
		this.method1573();
		this.method1577();
	}

	@OriginalMember(owner = "client!cfa", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1753;
	}

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "(I)V")
	private void method1579() {
		if (this.aClass293_2 != null) {
			this.aClass293_2.aBoolean565 = false;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt1704;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1742; local7++) {
			local16 = this.aShortArray10[local7] & 0xFFFF;
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
			this.aShortArray10[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass148Array1 != null) {
			for (local16 = 0; local16 < this.anInt1735; local16++) {
				@Pc(109) Class148 local109 = this.aClass148Array1[local16];
				@Pc(114) Class66 local114 = this.aClass66Array1[local16];
				local114.anInt2316 = Static422.anIntArray428[this.aShortArray10[local109.anInt4661] & 0xFFFF] & 0xFFFFFF | local114.anInt2316 & 0xFF000000;
			}
		}
		this.method1579();
	}

	@OriginalMember(owner = "client!cfa", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort18;
	}

	@OriginalMember(owner = "client!cfa", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1710; local3++) {
			this.anIntArray49[local3] = -this.anIntArray49[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1714; local29++) {
			this.aShortArray17[local29] = (short) -this.aShortArray17[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt1742; local52++) {
			@Pc(59) short local59 = this.aShortArray15[local52];
			this.aShortArray15[local52] = this.aShortArray8[local52];
			this.aShortArray8[local52] = local59;
		}
		this.method1580();
		this.method1583();
		this.method1574();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static501.anInt8647 = 0;
			Static286.anInt5360 = 0;
			Static39.anInt1147 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt1710; local20++) {
				Static286.anInt5360 += this.anIntArray52[local20];
				Static39.anInt1147 += this.anIntArray48[local20];
				Static501.anInt8647 += this.anIntArray49[local20];
				local18++;
			}
			if (local18 > 0) {
				Static39.anInt1147 = Static39.anInt1147 / local18 + arg2;
				Static286.anInt5360 = arg1 + Static286.anInt5360 / local18;
				Static501.anInt8647 = arg3 + Static501.anInt8647 / local18;
			} else {
				Static39.anInt1147 = arg2;
				Static286.anInt5360 = arg1;
				Static501.anInt8647 = arg3;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt1710; local18++) {
				this.anIntArray52[local18] += arg1;
				this.anIntArray48[local18] += arg2;
				this.anIntArray49[local18] += arg3;
			}
		} else {
			@Pc(171) int local171;
			@Pc(189) int local189;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt1710; local18++) {
					this.anIntArray52[local18] -= Static286.anInt5360;
					this.anIntArray48[local18] -= Static39.anInt1147;
					this.anIntArray49[local18] -= Static501.anInt8647;
					if (arg3 != 0) {
						local20 = Class3_Sub28.anIntArray232[arg3];
						local171 = Class3_Sub28.anIntArray231[arg3];
						local189 = local171 * this.anIntArray52[local18] + local20 * this.anIntArray48[local18] + 16383 >> 14;
						this.anIntArray48[local18] = local171 * this.anIntArray48[local18] + 16383 - this.anIntArray52[local18] * local20 >> 14;
						this.anIntArray52[local18] = local189;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub28.anIntArray232[arg1];
						local171 = Class3_Sub28.anIntArray231[arg1];
						local189 = local171 * this.anIntArray48[local18] + 16383 - local20 * this.anIntArray49[local18] >> 14;
						this.anIntArray49[local18] = this.anIntArray48[local18] * local20 + local171 * this.anIntArray49[local18] + 16383 >> 14;
						this.anIntArray48[local18] = local189;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub28.anIntArray232[arg2];
						local171 = Class3_Sub28.anIntArray231[arg2];
						local189 = this.anIntArray49[local18] * local20 + this.anIntArray52[local18] * local171 + 16383 >> 14;
						this.anIntArray49[local18] = local171 * this.anIntArray49[local18] + 16383 - local20 * this.anIntArray52[local18] >> 14;
						this.anIntArray52[local18] = local189;
					}
					this.anIntArray52[local18] += Static286.anInt5360;
					this.anIntArray48[local18] += Static39.anInt1147;
					this.anIntArray49[local18] += Static501.anInt8647;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt1710; local18++) {
					this.anIntArray52[local18] -= Static286.anInt5360;
					this.anIntArray48[local18] -= Static39.anInt1147;
					this.anIntArray49[local18] -= Static501.anInt8647;
					this.anIntArray52[local18] = this.anIntArray52[local18] * arg1 / 128;
					this.anIntArray48[local18] = this.anIntArray48[local18] * arg2 / 128;
					this.anIntArray49[local18] = this.anIntArray49[local18] * arg3 / 128;
					this.anIntArray52[local18] += Static286.anInt5360;
					this.anIntArray48[local18] += Static39.anInt1147;
					this.anIntArray49[local18] += Static501.anInt8647;
				}
			} else {
				@Pc(531) Class148 local531;
				@Pc(536) Class66 local536;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt1742; local18++) {
						local20 = (this.aByteArray20[local18] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray20[local18] = (byte) local20;
					}
					if (this.aClass148Array1 != null) {
						for (local20 = 0; local20 < this.anInt1735; local20++) {
							local531 = this.aClass148Array1[local20];
							local536 = this.aClass66Array1[local20];
							local536.anInt2316 = 255 - (this.aByteArray20[local531.anInt4661] & 0xFF) << 24 | local536.anInt2316 & 0xFFFFFF;
						}
					}
					this.method1579();
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt1742; local18++) {
						local20 = this.aShortArray10[local18] & 0xFFFF;
						local171 = local20 >> 10 & 0x3F;
						local189 = local20 >> 7 & 0x7;
						local189 += arg2 / 4;
						@Pc(606) int local606 = arg1 + local171 & 0x3F;
						@Pc(610) int local610 = local20 & 0x7F;
						if (local189 < 0) {
							local189 = 0;
						} else if (local189 > 7) {
							local189 = 7;
						}
						local610 += arg3;
						if (local610 < 0) {
							local610 = 0;
						} else if (local610 > 127) {
							local610 = 127;
						}
						this.aShortArray10[local18] = (short) (local606 << 10 | local189 << 7 | local610);
					}
					if (this.aClass148Array1 != null) {
						for (local20 = 0; local20 < this.anInt1735; local20++) {
							local531 = this.aClass148Array1[local20];
							local536 = this.aClass66Array1[local20];
							local536.anInt2316 = local536.anInt2316 & 0xFF000000 | Static422.anIntArray428[this.aShortArray10[local531.anInt4661] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method1579();
				} else {
					@Pc(718) Class66 local718;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt1735; local18++) {
							local718 = this.aClass66Array1[local18];
							local718.anInt2321 += arg2;
							local718.anInt2319 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt1735; local18++) {
							local718 = this.aClass66Array1[local18];
							local718.anInt2313 = local718.anInt2313 * arg1 >> 7;
							local718.anInt2314 = local718.anInt2314 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt1735; local18++) {
							local718 = this.aClass66Array1[local18];
							local718.anInt2317 = local718.anInt2317 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass31_Sub1_3.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1742; local11++) {
			if (arg0 == this.aShortArray19[local11]) {
				this.aShortArray19[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class172 local44 = local9.method7229(arg0 & 0xFFFF);
			local31 = local44.aByte61;
			local33 = local44.aByte58;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class172 local64 = local9.method7229(arg1 & 0xFFFF);
			local54 = local64.aByte58;
			local52 = local64.aByte61;
		}
		if (!(local33 != local54 | local31 != local52)) {
			return;
		}
		if (this.aClass148Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt1735; local97++) {
				@Pc(104) Class148 local104 = this.aClass148Array1[local97];
				@Pc(109) Class66 local109 = this.aClass66Array1[local97];
				local109.anInt2316 = Static422.anIntArray428[this.aShortArray10[local104.anInt4661] & 0xFFFF] & 0xFFFFFF | local109.anInt2316 & 0xFF000000;
			}
		}
		this.method1579();
	}

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "()[Lclient!rea;")
	@Override
	public Class280[] method7636() {
		return this.aClass280Array1;
	}

	@OriginalMember(owner = "client!cfa", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1710; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray48[local15] + this.anIntArray52[local15] * local13 >> 14;
			this.anIntArray48[local15] = local13 * this.anIntArray48[local15] - this.anIntArray52[local15] * local9 >> 14;
			this.anIntArray52[local15] = local33;
		}
		this.method1580();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "()V")
	@Override
	protected void method7628() {
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "()V")
	@Override
	protected void method7615() {
	}

	@OriginalMember(owner = "client!cfa", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort18 = (short) arg0;
		this.method1579();
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V")
	private void method1580() {
		if (this.aClass293_3 != null) {
			this.aClass293_3.aBoolean565 = false;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!wp;B)V")
	private void method1581(@OriginalArg(0) Class3_Sub7_Sub3_Sub2 arg0) {
		if (this.anInt1714 > Static53.anIntArray40.length) {
			Static53.anIntArray40 = new int[this.anInt1714];
			Static501.anIntArray518 = new int[this.anInt1714];
		}
		@Pc(50) int local50;
		@Pc(88) int local88;
		@Pc(97) int local97;
		for (@Pc(24) int local24 = 0; local24 < this.anInt1710; local24++) {
			local50 = (this.anIntArray52[local24] - (this.aClass31_Sub1_3.anInt9143 * this.anIntArray48[local24] >> 8) >> this.aClass31_Sub1_3.anInt9130) - arg0.anInt10304;
			@Pc(74) int local74 = (this.anIntArray49[local24] - (this.aClass31_Sub1_3.anInt9118 * this.anIntArray48[local24] >> 8) >> this.aClass31_Sub1_3.anInt9130) - arg0.anInt10303;
			@Pc(79) int local79 = this.anIntArray55[local24];
			@Pc(86) int local86 = this.anIntArray55[local24 + 1];
			for (local88 = local79; local88 < local86; local88++) {
				local97 = this.aShortArray14[local88] - 1;
				if (local97 == -1) {
					break;
				}
				Static53.anIntArray40[local97] = local50;
				Static501.anIntArray518[local97] = local74;
			}
		}
		for (local50 = 0; local50 < this.anInt1776; local50++) {
			if (this.aByteArray20 == null || this.aByteArray20[local50] <= 128) {
				@Pc(148) short local148 = this.aShortArray15[local50];
				@Pc(153) short local153 = this.aShortArray20[local50];
				@Pc(158) short local158 = this.aShortArray8[local50];
				local88 = Static53.anIntArray40[local148];
				local97 = Static53.anIntArray40[local153];
				@Pc(170) int local170 = Static53.anIntArray40[local158];
				@Pc(174) int local174 = Static501.anIntArray518[local148];
				@Pc(178) int local178 = Static501.anIntArray518[local153];
				@Pc(182) int local182 = Static501.anIntArray518[local158];
				if ((local88 - local97) * (-local182 + local178) - (local170 - local97) * (-local174 + local178) > 0) {
					arg0.method8143(local88, local174, local178, local97, local170, local182);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1710; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray48[local15] - this.anIntArray49[local15] * local9 >> 14;
			this.anIntArray49[local15] = local9 * this.anIntArray48[local15] + local13 * this.anIntArray49[local15] >> 14;
			this.anIntArray48[local15] = local34;
		}
		this.method1580();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1710; local7++) {
			if (arg0 != 0) {
				this.anIntArray52[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray48[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray49[local7] += arg2;
			}
		}
		this.method1580();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "()V")
	@Override
	public void method7624() {
		if (this.anInt1714 > 0 && this.anInt1776 > 0) {
			this.method1572();
			this.method1582();
			this.method1576();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1725;
	}

	@OriginalMember(owner = "client!cfa", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean126) {
			this.method1571();
		}
		return this.anInt1760;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "()[Lclient!ti;")
	@Override
	public Class317[] method7613() {
		return this.aClass317Array1;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)Z")
	private boolean method1582() {
		if (this.aClass324_1.aBoolean621) {
			return true;
		}
		if (this.aClass324_1.anInterface2_7 == null) {
			this.aClass324_1.anInterface2_7 = this.aClass31_Sub1_3.method7158(this.aBoolean128);
		}
		@Pc(34) Interface2 local34 = this.aClass324_1.anInterface2_7;
		local34.method7282(this.anInt1776 * 6);
		@Pc(46) Buffer local46 = local34.method7292();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass31_Sub1_3.method7154(local46);
			@Pc(58) int local58;
			if (Stream.a()) {
				for (local58 = 0; local58 < this.anInt1776; local58++) {
					local54.e(this.aShortArray15[local58]);
					local54.e(this.aShortArray20[local58]);
					local54.e(this.aShortArray8[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt1776; local58++) {
					local54.c(this.aShortArray15[local58]);
					local54.c(this.aShortArray20[local58]);
					local54.c(this.aShortArray8[local58]);
				}
			}
			local54.c();
			if (local34.method7291()) {
				this.aBoolean127 = true;
				this.aClass324_1.aBoolean621 = true;
				this.aClass324_1.anInterface2_8 = local34;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1742; local3++) {
			if (arg0 == this.aShortArray10[local3]) {
				this.aShortArray10[local3] = arg1;
			}
		}
		if (this.aClass148Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt1735; local30++) {
				@Pc(37) Class148 local37 = this.aClass148Array1[local30];
				@Pc(42) Class66 local42 = this.aClass66Array1[local30];
				local42.anInt2316 = Static422.anIntArray428[this.aShortArray10[local37.anInt4661] & 0xFFFF] & 0xFFFFFF | local42.anInt2316 & 0xFF000000;
			}
		}
		this.method1579();
	}

	@OriginalMember(owner = "client!cfa", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1710; local15++) {
			local33 = this.anIntArray52[local15] * local13 + this.anIntArray49[local15] * local9 >> 14;
			this.anIntArray49[local15] = this.anIntArray49[local15] * local13 - local9 * this.anIntArray52[local15] >> 14;
			this.anIntArray52[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt1714; local33++) {
			@Pc(87) int local87 = local9 * this.aShortArray17[local33] + local13 * this.aShortArray13[local33] >> 14;
			this.aShortArray17[local33] = (short) (this.aShortArray17[local33] * local13 - this.aShortArray13[local33] * local9 >> 14);
			this.aShortArray13[local33] = (short) local87;
		}
		this.method1580();
		this.method1583();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!cfa", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(B)V")
	private void method1583() {
		if ((this.anInt1721 & 0x37) != 0) {
			if (this.aClass293_4 == null) {
				return;
			}
			this.aClass293_4.aBoolean565 = false;
		} else if (this.aClass293_2 != null) {
			this.aClass293_2.aBoolean565 = false;
			return;
		}
	}
}
