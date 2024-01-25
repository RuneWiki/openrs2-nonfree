import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!d", name = "q", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!bk;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[Lclient!ph;")
	private Class255[] aClass255Array1;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Lclient!vd;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "[Lclient!rea;")
	private Class280[] aClass280Array2;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!d", name = "pb", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!d", name = "qb", descriptor = "[Lclient!eba;")
	private Class81[] aClass81Array1;

	@OriginalMember(owner = "client!d", name = "tb", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!d", name = "ub", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!d", name = "wb", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!d", name = "xb", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!d", name = "zb", descriptor = "I")
	private int anInt2183;

	@OriginalMember(owner = "client!d", name = "Db", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!d", name = "Ib", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!d", name = "Kb", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!d", name = "Nb", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!d", name = "Ob", descriptor = "Lclient!lga;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!d", name = "Ub", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!d", name = "Wb", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!d", name = "Xb", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!d", name = "Yb", descriptor = "I")
	private int anInt2196;

	@OriginalMember(owner = "client!d", name = "ac", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!d", name = "fc", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!d", name = "gc", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!d", name = "jc", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!d", name = "lc", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!d", name = "oc", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!d", name = "uc", descriptor = "[Lclient!ti;")
	private Class317[] aClass317Array2;

	@OriginalMember(owner = "client!d", name = "vc", descriptor = "B")
	private byte aByte23;

	@OriginalMember(owner = "client!d", name = "wc", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!d", name = "yc", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!d", name = "Ac", descriptor = "I")
	private int anInt2211;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
	private int anInt2171 = 0;

	@OriginalMember(owner = "client!d", name = "kc", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!d", name = "Vb", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!d", name = "xc", descriptor = "I")
	private int anInt2209 = 0;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "I")
	private int anInt2156 = 0;

	@OriginalMember(owner = "client!d", name = "zc", descriptor = "I")
	private int anInt2210 = 0;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	private int anInt2163 = 0;

	@OriginalMember(owner = "client!d", name = "Eb", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_11;

	@OriginalMember(owner = "client!d", name = "Qb", descriptor = "Lclient!mk;")
	private Class208 aClass208_5;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "Lclient!mk;")
	private Class208 aClass208_4;

	@OriginalMember(owner = "client!d", name = "mc", descriptor = "Lclient!mk;")
	private Class208 aClass208_6;

	@OriginalMember(owner = "client!d", name = "Dc", descriptor = "Lclient!mk;")
	private Class208 aClass208_7;

	@OriginalMember(owner = "client!d", name = "Sb", descriptor = "Lclient!fn;")
	private Class107 aClass107_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class52_Sub2(@OriginalArg(0) Class31_Sub2 arg0) {
		this.aClass31_Sub2_11 = arg0;
		this.aClass208_5 = new Class208(null, 5126, 3, 0);
		this.aClass208_4 = new Class208(null, 5126, 2, 0);
		this.aClass208_6 = new Class208(null, 5126, 3, 0);
		this.aClass208_7 = new Class208(null, 5121, 4, 0);
		this.aClass107_1 = new Class107();
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!er;Lclient!uo;IIII)V")
	public Class52_Sub2(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass31_Sub2_11 = arg0;
		this.anInt2196 = arg2;
		this.anInt2183 = arg5;
		if (Static210.method7448(arg2, arg5)) {
			this.aClass208_5 = new Class208(null, 5126, 3, 0);
		}
		if (Static522.method7235(arg2, arg5)) {
			this.aClass208_4 = new Class208(null, 5126, 2, 0);
		}
		if (Static519.method7214(arg5, arg2)) {
			this.aClass208_6 = new Class208(null, 5126, 3, 0);
		}
		if (Static523.method7236(arg2, arg5)) {
			this.aClass208_7 = new Class208(null, 5121, 4, 0);
		}
		if (Static336.method4912(arg5, arg2)) {
			this.aClass107_1 = new Class107();
		}
		@Pc(105) Interface4 local105 = arg0.anInterface4_14;
		@Pc(109) int[] local109 = new int[arg1.anInt9552];
		this.anIntArray70 = new int[arg1.anInt9546 + 1];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt9552; local118++) {
			if ((arg1.aByteArray223 == null || arg1.aByteArray223[local118] != 2) && (arg1.aShortArray132 == null || arg1.aShortArray132[local118] == -1 || !local105.method7229(arg1.aShortArray132[local118] & 0xFFFF).aBoolean357)) {
				local109[this.anInt2156++] = local118;
				this.anIntArray70[arg1.aShortArray135[local118]]++;
				this.anIntArray70[arg1.aShortArray138[local118]]++;
				this.anIntArray70[arg1.aShortArray137[local118]]++;
			}
		}
		this.anInt2171 = this.anInt2156;
		@Pc(210) long[] local210 = new long[this.anInt2156];
		@Pc(219) boolean local219 = (this.anInt2196 & 0x100) != 0;
		@Pc(231) int local231;
		@Pc(395) int local395;
		for (@Pc(221) int local221 = 0; local221 < this.anInt2156; local221++) {
			@Pc(227) int local227 = local109[local221];
			@Pc(229) Class172 local229 = null;
			local231 = 0;
			@Pc(233) byte local233 = 0;
			@Pc(235) byte local235 = 0;
			@Pc(237) byte local237 = 0;
			if (arg1.aClass10Array1 != null) {
				@Pc(242) boolean local242 = false;
				for (@Pc(244) int local244 = 0; local244 < arg1.aClass10Array1.length; local244++) {
					@Pc(251) Class10 local251 = arg1.aClass10Array1[local244];
					if (local251.anInt88 == local227) {
						@Pc(260) Class75 local260 = Static487.method6594(local251.anInt89);
						if (local260.aBoolean183) {
							local242 = true;
						}
						if (local260.anInt2593 != -1) {
							@Pc(275) Class172 local275 = local105.method7229(local260.anInt2593);
							if (local275.aBoolean351) {
								this.aBoolean163 = true;
							}
						}
					}
				}
				if (local242) {
					local210[local221] = Long.MAX_VALUE;
					this.anInt2171--;
					continue;
				}
			}
			@Pc(303) short local303 = -1;
			if (arg1.aShortArray132 != null) {
				local303 = arg1.aShortArray132[local227];
				if (local303 != -1) {
					local229 = local105.method7229(local303 & 0xFFFF);
					local235 = local229.aByte62;
					local237 = local229.aByte60;
				}
			}
			@Pc(351) boolean local351 = arg1.aByteArray224 != null && arg1.aByteArray224[local227] != 0 || local229 != null && local229.aBoolean351 | !local229.aBoolean350;
			if ((local219 || local351) && arg1.aByteArray227 != null) {
				local231 += arg1.aByteArray227[local227] << 17;
			}
			if (local351) {
				local231 += 65536;
			}
			local231 += (local235 & 0xFF) << 8;
			local231 += local237 & 0xFF;
			local395 = local233 + ((local303 & 0xFFFF) << 16);
			@Pc(401) int local401 = local395 + (local221 & 0xFFFF);
			local210[local221] = (long) local401 + ((long) local231 << 32);
			this.aBoolean163 |= local351;
		}
		Static107.method2199(local210, local109);
		this.anInt2210 = arg1.anInt9546;
		this.anIntArray69 = arg1.anIntArray548;
		this.anInt2163 = arg1.anInt9541;
		this.aShortArray37 = arg1.aShortArray134;
		this.anIntArray72 = arg1.anIntArray550;
		this.anIntArray71 = arg1.anIntArray555;
		@Pc(458) Class239[] local458 = new Class239[this.anInt2210];
		this.aClass280Array2 = arg1.aClass280Array4;
		this.aClass317Array2 = arg1.aClass317Array4;
		@Pc(486) int local486;
		@Pc(500) int local500;
		if (arg1.aClass10Array1 != null) {
			this.anInt2211 = arg1.aClass10Array1.length;
			this.aClass81Array1 = new Class81[this.anInt2211];
			this.aClass255Array1 = new Class255[this.anInt2211];
			for (local486 = 0; local486 < this.anInt2211; local486++) {
				@Pc(493) Class10 local493 = arg1.aClass10Array1[local486];
				@Pc(498) Class75 local498 = Static487.method6594(local493.anInt89);
				local500 = -1;
				for (@Pc(502) int local502 = 0; local502 < this.anInt2156; local502++) {
					if (local109[local502] == local493.anInt88) {
						local500 = local502;
						break;
					}
				}
				if (local500 == -1) {
					throw new RuntimeException();
				}
				@Pc(543) int local543 = Static422.anIntArray428[arg1.aShortArray136[local493.anInt88] & 0xFFFF] & 0xFFFFFF;
				@Pc(561) int local561 = local543 | 255 - (arg1.aByteArray224 == null ? 0 : arg1.aByteArray224[local493.anInt88]) << 24;
				this.aClass255Array1[local486] = new Class255(local500, arg1.aShortArray135[local493.anInt88], arg1.aShortArray138[local493.anInt88], arg1.aShortArray137[local493.anInt88], local498.anInt2600, local498.anInt2602, local498.anInt2593, local498.anInt2592, local498.anInt2601, local498.aBoolean183, local498.aBoolean184, local493.anInt86);
				this.aClass81Array1[local486] = new Class81(local561);
			}
		}
		local486 = this.anInt2156 * 3;
		this.aShort24 = (short) arg3;
		this.aShortArray38 = new short[this.anInt2156];
		this.aShortArray32 = new short[local486];
		this.aShortArray31 = new short[this.anInt2156];
		this.aByteArray30 = new byte[local486];
		this.aShortArray30 = new short[local486];
		this.aByteArray29 = new byte[this.anInt2156];
		if (arg1.aShortArray131 != null) {
			this.aShortArray39 = new short[this.anInt2156];
		}
		this.aShortArray29 = new short[this.anInt2156];
		this.aShort28 = (short) arg4;
		this.aShortArray36 = new short[this.anInt2156];
		Static8.aLongArray1 = new long[local486];
		this.aShortArray33 = new short[local486];
		this.aFloatArray25 = new float[local486];
		this.aShortArray35 = new short[this.anInt2156];
		this.aShortArray34 = new short[local486];
		this.aFloatArray26 = new float[local486];
		local231 = 0;
		for (local395 = 0; local395 < arg1.anInt9546; local395++) {
			local500 = this.anIntArray70[local395];
			this.anIntArray70[local395] = local231;
			local458[local395] = new Class239();
			local231 += local500;
		}
		this.anIntArray70[arg1.anInt9546] = local231;
		@Pc(734) int[] local734 = null;
		@Pc(736) int[] local736 = null;
		@Pc(738) int[] local738 = null;
		@Pc(740) float[][] local740 = null;
		@Pc(766) int local766;
		@Pc(802) int local802;
		@Pc(808) int local808;
		@Pc(821) int local821;
		@Pc(823) int local823;
		@Pc(859) int local859;
		@Pc(864) int local864;
		@Pc(1030) float local1030;
		@Pc(1038) float local1038;
		@Pc(1046) float local1046;
		if (arg1.aByteArray228 != null) {
			@Pc(746) int local746 = arg1.anInt9553;
			@Pc(749) int[] local749 = new int[local746];
			@Pc(752) int[] local752 = new int[local746];
			@Pc(755) int[] local755 = new int[local746];
			@Pc(758) int[] local758 = new int[local746];
			@Pc(761) int[] local761 = new int[local746];
			@Pc(764) int[] local764 = new int[local746];
			for (local766 = 0; local766 < local746; local766++) {
				local749[local766] = Integer.MAX_VALUE;
				local752[local766] = -2147483647;
				local755[local766] = Integer.MAX_VALUE;
				local758[local766] = -2147483647;
				local761[local766] = Integer.MAX_VALUE;
				local764[local766] = -2147483647;
			}
			for (local802 = 0; local802 < this.anInt2156; local802++) {
				local808 = local109[local802];
				if (arg1.aByteArray228[local808] != -1) {
					local821 = arg1.aByteArray228[local808] & 0xFF;
					for (local823 = 0; local823 < 3; local823++) {
						@Pc(835) short local835;
						if (local823 == 0) {
							local835 = arg1.aShortArray135[local808];
						} else if (local823 == 1) {
							local835 = arg1.aShortArray138[local808];
						} else {
							local835 = arg1.aShortArray137[local808];
						}
						local859 = arg1.anIntArray555[local835];
						local864 = arg1.anIntArray550[local835];
						@Pc(869) int local869 = arg1.anIntArray548[local835];
						if (local749[local821] > local859) {
							local749[local821] = local859;
						}
						if (local859 > local752[local821]) {
							local752[local821] = local859;
						}
						if (local755[local821] > local864) {
							local755[local821] = local864;
						}
						if (local758[local821] < local864) {
							local758[local821] = local864;
						}
						if (local869 < local761[local821]) {
							local761[local821] = local869;
						}
						if (local764[local821] < local869) {
							local764[local821] = local869;
						}
					}
				}
			}
			local736 = new int[local746];
			local740 = new float[local746][];
			local734 = new int[local746];
			local738 = new int[local746];
			for (local808 = 0; local808 < local746; local808++) {
				@Pc(975) byte local975 = arg1.aByteArray229[local808];
				if (local975 > 0) {
					local734[local808] = (local749[local808] + local752[local808]) / 2;
					local736[local808] = (local755[local808] + local758[local808]) / 2;
					local738[local808] = (local764[local808] + local761[local808]) / 2;
					if (local975 == 1) {
						local864 = arg1.anIntArray556[local808];
						local1038 = 64.0F / (float) arg1.anIntArray549[local808];
						if (local864 == 0) {
							local1030 = 1.0F;
							local1046 = 1.0F;
						} else if (local864 <= 0) {
							local1030 = (float) -local864 / 1024.0F;
							local1046 = 1.0F;
						} else {
							local1030 = 1.0F;
							local1046 = (float) local864 / 1024.0F;
						}
					} else if (local975 == 2) {
						local1046 = 64.0F / (float) arg1.anIntArray554[local808];
						local1030 = 64.0F / (float) arg1.anIntArray556[local808];
						local1038 = 64.0F / (float) arg1.anIntArray549[local808];
					} else {
						local1030 = (float) arg1.anIntArray556[local808] / 1024.0F;
						local1038 = (float) arg1.anIntArray549[local808] / 1024.0F;
						local1046 = (float) arg1.anIntArray554[local808] / 1024.0F;
					}
					local740[local808] = Static329.method4874(arg1.aShortArray140[local808], local1030, arg1.aShortArray139[local808], local1038, arg1.aShortArray133[local808], arg1.aByteArray226[local808] & 0xFF, local1046);
				}
			}
		}
		@Pc(1151) Class233[] local1151 = new Class233[arg1.anInt9552];
		@Pc(1170) short local1170;
		@Pc(1181) int local1181;
		@Pc(1192) int local1192;
		@Pc(1252) int local1252;
		for (@Pc(1153) int local1153 = 0; local1153 < arg1.anInt9552; local1153++) {
			@Pc(1160) short local1160 = arg1.aShortArray135[local1153];
			@Pc(1165) short local1165 = arg1.aShortArray138[local1153];
			local1170 = arg1.aShortArray137[local1153];
			local1181 = this.anIntArray71[local1165] - this.anIntArray71[local1160];
			local1192 = this.anIntArray72[local1165] - this.anIntArray72[local1160];
			local766 = this.anIntArray69[local1165] - this.anIntArray69[local1160];
			local802 = this.anIntArray71[local1170] - this.anIntArray71[local1160];
			local808 = this.anIntArray72[local1170] - this.anIntArray72[local1160];
			local821 = this.anIntArray69[local1170] - this.anIntArray69[local1160];
			local823 = local1192 * local821 - local766 * local808;
			local1252 = local766 * local802 - local1181 * local821;
			for (local859 = local1181 * local808 - local1192 * local802; local823 > 8192 || local1252 > 8192 || local859 > 8192 || local823 < -8192 || local1252 < -8192 || local859 < -8192; local859 >>= 0x1) {
				local1252 >>= 0x1;
				local823 >>= 0x1;
			}
			local864 = (int) Math.sqrt((double) (local823 * local823 + local1252 * local1252 + local859 * local859));
			if (local864 <= 0) {
				local864 = 1;
			}
			local1252 = local1252 * 256 / local864;
			local859 = local859 * 256 / local864;
			local823 = local823 * 256 / local864;
			@Pc(1348) byte local1348 = arg1.aByteArray223 == null ? 0 : arg1.aByteArray223[local1153];
			if (local1348 == 0) {
				@Pc(1357) Class239 local1357 = local458[local1160];
				local1357.anInt6636++;
				local1357.anInt6634 += local859;
				local1357.anInt6639 += local1252;
				local1357.anInt6637 += local823;
				@Pc(1385) Class239 local1385 = local458[local1165];
				local1385.anInt6636++;
				local1385.anInt6637 += local823;
				local1385.anInt6639 += local1252;
				local1385.anInt6634 += local859;
				@Pc(1413) Class239 local1413 = local458[local1170];
				local1413.anInt6634 += local859;
				local1413.anInt6637 += local823;
				local1413.anInt6639 += local1252;
				local1413.anInt6636++;
			} else if (local1348 == 1) {
				@Pc(1452) Class233 local1452 = local1151[local1153] = new Class233();
				local1452.anInt6504 = local823;
				local1452.anInt6500 = local859;
				local1452.anInt6502 = local1252;
			}
		}
		@Pc(1474) int local1474;
		for (@Pc(1468) int local1468 = 0; local1468 < this.anInt2156; local1468++) {
			local1474 = local109[local1468];
			@Pc(1481) int local1481 = arg1.aShortArray136[local1474] & 0xFFFF;
			@Pc(1489) short local1489;
			if (arg1.aShortArray132 == null) {
				local1489 = -1;
			} else {
				local1489 = arg1.aShortArray132[local1474];
			}
			if (arg1.aByteArray228 == null) {
				local1192 = -1;
			} else {
				local1192 = arg1.aByteArray228[local1474];
			}
			if (arg1.aByteArray224 == null) {
				local766 = 0;
			} else {
				local766 = arg1.aByteArray224[local1474] & 0xFF;
			}
			@Pc(1521) float local1521 = 0.0F;
			@Pc(1523) float local1523 = 0.0F;
			@Pc(1525) float local1525 = 0.0F;
			local1030 = 0.0F;
			local1038 = 0.0F;
			local1046 = 0.0F;
			@Pc(1533) byte local1533 = 0;
			@Pc(1535) byte local1535 = 0;
			@Pc(1537) int local1537 = 0;
			@Pc(1572) byte local1572;
			@Pc(1589) short local1589;
			@Pc(1594) short local1594;
			@Pc(1599) short local1599;
			if (local1489 != -1) {
				if (local1192 == -1) {
					local1046 = 0.0F;
					local1030 = 1.0F;
					local1533 = 1;
					local1525 = 1.0F;
					local1521 = 0.0F;
					local1038 = 0.0F;
					local1535 = 2;
					local1523 = 1.0F;
				} else {
					local1192 &= 0xFF;
					local1572 = arg1.aByteArray229[local1192];
					@Pc(1579) short local1579;
					@Pc(1584) short local1584;
					@Pc(1622) float local1622;
					@Pc(1630) float local1630;
					@Pc(1639) float local1639;
					@Pc(1724) float local1724;
					@Pc(1732) float local1732;
					@Pc(1740) float local1740;
					@Pc(1748) float local1748;
					@Pc(1757) float local1757;
					@Pc(1765) float local1765;
					if (local1572 == 0) {
						local1579 = arg1.aShortArray135[local1474];
						local1584 = arg1.aShortArray138[local1474];
						local1589 = arg1.aShortArray137[local1474];
						local1594 = arg1.aShortArray133[local1192];
						local1599 = arg1.aShortArray140[local1192];
						@Pc(1604) short local1604 = arg1.aShortArray139[local1192];
						@Pc(1610) float local1610 = (float) arg1.anIntArray555[local1594];
						@Pc(1616) float local1616 = (float) arg1.anIntArray550[local1594];
						local1622 = arg1.anIntArray548[local1594];
						local1630 = (float) arg1.anIntArray555[local1599] - local1610;
						local1639 = (float) arg1.anIntArray550[local1599] - local1616;
						@Pc(1647) float local1647 = (float) arg1.anIntArray548[local1599] - local1622;
						@Pc(1655) float local1655 = (float) arg1.anIntArray555[local1604] - local1610;
						@Pc(1663) float local1663 = (float) arg1.anIntArray550[local1604] - local1616;
						@Pc(1672) float local1672 = (float) arg1.anIntArray548[local1604] - local1622;
						@Pc(1681) float local1681 = (float) arg1.anIntArray555[local1579] - local1610;
						@Pc(1689) float local1689 = (float) arg1.anIntArray550[local1579] - local1616;
						@Pc(1697) float local1697 = (float) arg1.anIntArray548[local1579] - local1622;
						@Pc(1706) float local1706 = (float) arg1.anIntArray555[local1584] - local1610;
						@Pc(1715) float local1715 = (float) arg1.anIntArray550[local1584] - local1616;
						local1724 = (float) arg1.anIntArray548[local1584] - local1622;
						local1732 = (float) arg1.anIntArray555[local1589] - local1610;
						local1740 = (float) arg1.anIntArray550[local1589] - local1616;
						local1748 = (float) arg1.anIntArray548[local1589] - local1622;
						local1757 = local1672 * local1639 - local1647 * local1663;
						local1765 = local1647 * local1655 - local1672 * local1630;
						@Pc(1773) float local1773 = local1663 * local1630 - local1655 * local1639;
						@Pc(1781) float local1781 = local1773 * local1663 - local1765 * local1672;
						@Pc(1789) float local1789 = local1672 * local1757 - local1655 * local1773;
						@Pc(1798) float local1798 = local1765 * local1655 - local1757 * local1663;
						@Pc(1812) float local1812 = 1.0F / (local1789 * local1639 + local1630 * local1781 + local1798 * local1647);
						local1525 = local1812 * (local1724 * local1798 + local1715 * local1789 + local1781 * local1706);
						local1038 = (local1748 * local1798 + local1789 * local1740 + local1732 * local1781) * local1812;
						local1521 = (local1689 * local1789 + local1781 * local1681 + local1697 * local1798) * local1812;
						@Pc(1863) float local1863 = local1639 * local1773 - local1647 * local1765;
						@Pc(1872) float local1872 = local1647 * local1757 - local1773 * local1630;
						@Pc(1880) float local1880 = local1630 * local1765 - local1757 * local1639;
						@Pc(1894) float local1894 = 1.0F / (local1880 * local1672 + local1863 * local1655 + local1872 * local1663);
						local1030 = (local1706 * local1863 + local1872 * local1715 + local1724 * local1880) * local1894;
						local1523 = local1894 * (local1697 * local1880 + local1872 * local1689 + local1863 * local1681);
						local1046 = (local1748 * local1880 + local1863 * local1732 + local1872 * local1740) * local1894;
					} else {
						local1579 = arg1.aShortArray135[local1474];
						local1584 = arg1.aShortArray138[local1474];
						local1589 = arg1.aShortArray137[local1474];
						@Pc(1957) int local1957 = local734[local1192];
						@Pc(1961) int local1961 = local736[local1192];
						@Pc(1965) int local1965 = local738[local1192];
						@Pc(1969) float[] local1969 = local740[local1192];
						@Pc(1974) byte local1974 = arg1.aByteArray225[local1192];
						local1622 = (float) arg1.anIntArray546[local1192] / 256.0F;
						if (local1572 == 1) {
							local1630 = (float) arg1.anIntArray554[local1192] / 1024.0F;
							Static261.method4020(arg1.anIntArray548[local1579], local1961, arg1.anIntArray550[local1579], local1622, local1969, local1957, local1974, local1965, arg1.anIntArray555[local1579], local1630);
							local1521 = Static496.aFloat184;
							local1523 = Static401.aFloat156;
							Static261.method4020(arg1.anIntArray548[local1584], local1961, arg1.anIntArray550[local1584], local1622, local1969, local1957, local1974, local1965, arg1.anIntArray555[local1584], local1630);
							local1030 = Static401.aFloat156;
							local1525 = Static496.aFloat184;
							Static261.method4020(arg1.anIntArray548[local1589], local1961, arg1.anIntArray550[local1589], local1622, local1969, local1957, local1974, local1965, arg1.anIntArray555[local1589], local1630);
							local1038 = Static496.aFloat184;
							local1046 = Static401.aFloat156;
							local1639 = local1630 / 2.0F;
							if ((local1974 & 0x1) == 0) {
								if (local1639 < local1525 - local1521) {
									local1525 -= local1630;
									local1533 = 1;
								} else if (local1639 < local1521 - local1525) {
									local1525 += local1630;
									local1533 = 2;
								}
								if (local1639 < local1038 - local1521) {
									local1038 -= local1630;
									local1535 = 1;
								} else if (local1639 < local1521 - local1038) {
									local1535 = 2;
									local1038 += local1630;
								}
							} else {
								if (local1030 - local1523 > local1639) {
									local1030 -= local1630;
									local1533 = 1;
								} else if (local1523 - local1030 > local1639) {
									local1533 = 2;
									local1030 += local1630;
								}
								if (local1046 - local1523 > local1639) {
									local1046 -= local1630;
									local1535 = 1;
								} else if (local1523 - local1046 > local1639) {
									local1046 += local1630;
									local1535 = 2;
								}
							}
						} else if (local1572 == 2) {
							local1630 = (float) arg1.anIntArray551[local1192] / 256.0F;
							local1639 = (float) arg1.anIntArray547[local1192] / 256.0F;
							@Pc(2019) int local2019 = arg1.anIntArray555[local1584] - arg1.anIntArray555[local1579];
							@Pc(2030) int local2030 = arg1.anIntArray550[local1584] - arg1.anIntArray550[local1579];
							@Pc(2041) int local2041 = arg1.anIntArray548[local1584] - arg1.anIntArray548[local1579];
							@Pc(2052) int local2052 = arg1.anIntArray555[local1589] - arg1.anIntArray555[local1579];
							@Pc(2062) int local2062 = arg1.anIntArray550[local1589] - arg1.anIntArray550[local1579];
							@Pc(2073) int local2073 = arg1.anIntArray548[local1589] - arg1.anIntArray548[local1579];
							@Pc(2081) int local2081 = local2030 * local2073 - local2062 * local2041;
							@Pc(2089) int local2089 = local2041 * local2052 - local2073 * local2019;
							@Pc(2097) int local2097 = local2062 * local2019 - local2052 * local2030;
							local1724 = 64.0F / (float) arg1.anIntArray556[local1192];
							local1732 = 64.0F / (float) arg1.anIntArray549[local1192];
							local1740 = 64.0F / (float) arg1.anIntArray554[local1192];
							local1748 = (local1969[1] * (float) local2089 + local1969[0] * (float) local2081 + local1969[2] * (float) local2097) / local1724;
							local1757 = ((float) local2097 * local1969[5] + local1969[3] * (float) local2081 + local1969[4] * (float) local2089) / local1732;
							local1765 = (local1969[7] * (float) local2089 + (float) local2081 * local1969[6] + (float) local2097 * local1969[8]) / local1740;
							local1537 = Static422.method5873(local1748, local1757, local1765);
							Static114.method2277(local1965, local1639, local1537, local1974, local1622, arg1.anIntArray550[local1579], local1961, local1969, local1957, local1630, arg1.anIntArray555[local1579], arg1.anIntArray548[local1579]);
							local1521 = Static291.aFloat129;
							local1523 = Static210.aFloat211;
							Static114.method2277(local1965, local1639, local1537, local1974, local1622, arg1.anIntArray550[local1584], local1961, local1969, local1957, local1630, arg1.anIntArray555[local1584], arg1.anIntArray548[local1584]);
							local1030 = Static210.aFloat211;
							local1525 = Static291.aFloat129;
							Static114.method2277(local1965, local1639, local1537, local1974, local1622, arg1.anIntArray550[local1589], local1961, local1969, local1957, local1630, arg1.anIntArray555[local1589], arg1.anIntArray548[local1589]);
							local1038 = Static291.aFloat129;
							local1046 = Static210.aFloat211;
						} else if (local1572 == 3) {
							Static119.method2329(local1622, local1965, local1969, arg1.anIntArray548[local1579], arg1.anIntArray555[local1579], arg1.anIntArray550[local1579], local1974, local1961, local1957);
							local1523 = Static229.aFloat114;
							local1521 = Static385.aFloat153;
							Static119.method2329(local1622, local1965, local1969, arg1.anIntArray548[local1584], arg1.anIntArray555[local1584], arg1.anIntArray550[local1584], local1974, local1961, local1957);
							local1030 = Static229.aFloat114;
							local1525 = Static385.aFloat153;
							Static119.method2329(local1622, local1965, local1969, arg1.anIntArray548[local1589], arg1.anIntArray555[local1589], arg1.anIntArray550[local1589], local1974, local1961, local1957);
							local1046 = Static229.aFloat114;
							local1038 = Static385.aFloat153;
							if ((local1974 & 0x1) == 0) {
								if (local1038 - local1521 > 0.5F) {
									local1535 = 1;
									local1038--;
								} else if (local1521 - local1038 > 0.5F) {
									local1038++;
									local1535 = 2;
								}
								if (local1525 - local1521 > 0.5F) {
									local1533 = 1;
									local1525--;
								} else if (local1521 - local1525 > 0.5F) {
									local1525++;
									local1533 = 2;
								}
							} else {
								if (local1030 - local1523 > 0.5F) {
									local1533 = 1;
									local1030--;
								} else if (local1523 - local1030 > 0.5F) {
									local1533 = 2;
									local1030++;
								}
								if (local1046 - local1523 > 0.5F) {
									local1046--;
									local1535 = 1;
								} else if (local1523 - local1046 > 0.5F) {
									local1046++;
									local1535 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray223 == null) {
				local1572 = 0;
			} else {
				local1572 = arg1.aByteArray223[local1474];
			}
			if (local1572 == 0) {
				@Pc(2847) long local2847 = ((long) local766 + (long) (local1537 << 24) + (long) (local1481 << 8) << 32) + (long) (local1192 << 2);
				local1589 = arg1.aShortArray135[local1474];
				local1594 = arg1.aShortArray138[local1474];
				local1599 = arg1.aShortArray137[local1474];
				@Pc(2866) Class239 local2866 = local458[local1589];
				this.aShortArray35[local1468] = this.method1878(local1523, local1589, local2866.anInt6634, local2866.anInt6636, local2866.anInt6639, local1521, arg1, local2866.anInt6637, local2847);
				@Pc(2890) Class239 local2890 = local458[local1594];
				this.aShortArray29[local1468] = this.method1878(local1030, local1594, local2890.anInt6634, local2890.anInt6636, local2890.anInt6639, local1525, arg1, local2890.anInt6637, (long) local1533 + local2847);
				@Pc(2917) Class239 local2917 = local458[local1599];
				this.aShortArray38[local1468] = this.method1878(local1046, local1599, local2917.anInt6634, local2917.anInt6636, local2917.anInt6639, local1038, arg1, local2917.anInt6637, local2847 + (long) local1535);
			} else if (local1572 == 1) {
				@Pc(2706) Class233 local2706 = local1151[local1474];
				@Pc(2752) long local2752 = (long) ((local2706.anInt6500 + 256 << 22) + (local2706.anInt6502 + 256 << 12) + (local1192 << 2) + (local2706.anInt6504 <= 0 ? 2048 : 1024)) + ((long) local766 + (long) (local1481 << 8) + (long) (local1537 << 24) << 32);
				this.aShortArray35[local1468] = this.method1878(local1523, arg1.aShortArray135[local1474], local2706.anInt6500, 0, local2706.anInt6502, local1521, arg1, local2706.anInt6504, local2752);
				this.aShortArray29[local1468] = this.method1878(local1030, arg1.aShortArray138[local1474], local2706.anInt6500, 0, local2706.anInt6502, local1525, arg1, local2706.anInt6504, (long) local1533 + local2752);
				this.aShortArray38[local1468] = this.method1878(local1046, arg1.aShortArray137[local1474], local2706.anInt6500, 0, local2706.anInt6502, local1038, arg1, local2706.anInt6504, (long) local1535 + local2752);
			}
			if (arg1.aShortArray132 == null) {
				this.aShortArray31[local1468] = -1;
			} else {
				this.aShortArray31[local1468] = arg1.aShortArray132[local1474];
			}
			if (arg1.aByteArray224 != null) {
				this.aByteArray29[local1468] = arg1.aByteArray224[local1474];
			}
			if (arg1.aShortArray131 != null) {
				this.aShortArray39[local1468] = arg1.aShortArray131[local1474];
			}
			this.aShortArray36[local1468] = arg1.aShortArray136[local1474];
		}
		local1474 = 0;
		local1170 = -10000;
		for (local1181 = 0; local1181 < this.anInt2171; local1181++) {
			@Pc(3006) short local3006 = this.aShortArray31[local1181];
			if (local3006 != local1170) {
				local1170 = local3006;
				local1474++;
			}
		}
		this.anIntArray73 = new int[local1474 + 1];
		local1474 = 0;
		local1170 = -10000;
		for (local1192 = 0; local1192 < this.anInt2171; local1192++) {
			@Pc(3036) short local3036 = this.aShortArray31[local1192];
			if (local3036 != local1170) {
				local1170 = local3036;
				this.anIntArray73[local1474++] = local1192;
			}
		}
		this.anIntArray73[local1474] = this.anInt2171;
		Static8.aLongArray1 = null;
		this.aShortArray30 = Static313.method4668(this.anInt2209, this.aShortArray30);
		this.aShortArray33 = Static313.method4668(this.anInt2209, this.aShortArray33);
		this.aShortArray32 = Static313.method4668(this.anInt2209, this.aShortArray32);
		this.aByteArray30 = Static129.method2395(this.anInt2209, this.aByteArray30);
		this.aFloatArray26 = Static189.method3315(this.anInt2209, this.aFloatArray26);
		this.aFloatArray25 = Static189.method3315(this.anInt2209, this.aFloatArray25);
		if (arg1.anIntArray553 != null && Static88.method1959(arg2, this.anInt2183)) {
			this.anIntArrayArray17 = arg1.method7497(false);
		}
		if (arg1.aClass10Array1 != null && Static562.method7679(this.anInt2183, arg2)) {
			this.anIntArrayArray15 = arg1.method7488();
		}
		if (arg1.anIntArray552 != null && Static422.method5872(arg2, this.anInt2183)) {
			local766 = 0;
			@Pc(3159) int[] local3159 = new int[256];
			for (local808 = 0; local808 < this.anInt2156; local808++) {
				local821 = arg1.anIntArray552[local109[local808]];
				if (local821 >= 0) {
					if (local821 > local766) {
						local766 = local821;
					}
					@Pc(3184) int local3184 = local3159[local821]++;
				}
			}
			this.anIntArrayArray16 = new int[local766 + 1][];
			for (local821 = 0; local821 <= local766; local821++) {
				this.anIntArrayArray16[local821] = new int[local3159[local821]];
				local3159[local821] = 0;
			}
			for (local823 = 0; local823 < this.anInt2156; local823++) {
				local1252 = arg1.anIntArray552[local109[local823]];
				if (local1252 >= 0) {
					this.anIntArrayArray16[local1252][local3159[local1252]++] = local823;
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	private void method1877() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2210; local23++) {
			@Pc(30) int local30 = this.anIntArray71[local23];
			@Pc(35) int local35 = this.anIntArray72[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(54) int local54 = this.anIntArray69[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local11 > local54) {
				local11 = local54;
			}
			if (local17 < local54) {
				local17 = local54;
			}
			@Pc(91) int local91 = local30 * local30 + local54 * local54;
			if (local19 < local91) {
				local19 = local91;
			}
			local91 = local35 * local35 + local54 * local54 + local30 * local30;
			if (local91 > local21) {
				local21 = local91;
			}
		}
		this.aShort22 = (short) local11;
		this.aShort25 = (short) local15;
		this.aShort29 = (short) local9;
		this.aShort21 = (short) local7;
		this.aShort27 = (short) local17;
		this.aShort30 = (short) local13;
		this.aShort26 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort23 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean164 = true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7634(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class52_Sub2 local8 = (Class52_Sub2) arg0;
		if (this.anInt2156 == 0 || local8.anInt2156 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt2210;
		@Pc(27) int[] local27 = local8.anIntArray71;
		@Pc(30) int[] local30 = local8.anIntArray72;
		@Pc(33) int[] local33 = local8.anIntArray69;
		@Pc(36) short[] local36 = local8.aShortArray30;
		@Pc(39) short[] local39 = local8.aShortArray33;
		@Pc(42) short[] local42 = local8.aShortArray32;
		@Pc(45) byte[] local45 = local8.aByteArray30;
		@Pc(50) short[] local50;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(54) byte[] local54;
		if (this.aClass37_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass37_1.aShortArray3;
			local54 = this.aClass37_1.aByteArray13;
			local50 = this.aClass37_1.aShortArray4;
			local56 = this.aClass37_1.aShortArray5;
		}
		@Pc(85) short[] local85;
		@Pc(89) short[] local89;
		@Pc(93) short[] local93;
		@Pc(81) byte[] local81;
		if (local8.aClass37_1 == null) {
			local85 = null;
			local93 = null;
			local81 = null;
			local89 = null;
		} else {
			local81 = local8.aClass37_1.aByteArray13;
			local85 = local8.aClass37_1.aShortArray4;
			local89 = local8.aClass37_1.aShortArray5;
			local93 = local8.aClass37_1.aShortArray3;
		}
		@Pc(106) int[] local106 = local8.anIntArray70;
		@Pc(109) short[] local109 = local8.aShortArray34;
		if (!local8.aBoolean164) {
			local8.method1877();
		}
		@Pc(118) short local118 = local8.aShort29;
		@Pc(121) short local121 = local8.aShort25;
		@Pc(124) short local124 = local8.aShort21;
		@Pc(127) short local127 = local8.aShort30;
		@Pc(130) short local130 = local8.aShort22;
		@Pc(133) short local133 = local8.aShort27;
		for (@Pc(135) int local135 = 0; local135 < this.anInt2210; local135++) {
			@Pc(145) int local145 = this.anIntArray72[local135] - arg2;
			if (local118 <= local145 && local121 >= local145) {
				@Pc(169) int local169 = this.anIntArray71[local135] - arg1;
				if (local124 <= local169 && local127 >= local169) {
					@Pc(189) int local189 = this.anIntArray69[local135] - arg3;
					if (local189 >= local130 && local189 <= local133) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray70[local135];
						@Pc(211) int local211 = this.anIntArray70[local135 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray34[local213] - 1;
							if (local199 == -1 || this.aByteArray30[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local24; local242++) {
								if (local27[local242] == local169 && local189 == local33[local242] && local30[local242] == local145) {
									local204 = local106[local242];
									local211 = local106[local242 + 1];
									@Pc(279) int local279 = -1;
									for (@Pc(281) int local281 = local204; local281 < local211; local281++) {
										local279 = local109[local281] - 1;
										if (local279 == -1 || local45[local279] != 0) {
											break;
										}
									}
									if (local279 != -1) {
										if (local50 == null) {
											this.aClass37_1 = new Class37();
											local50 = this.aClass37_1.aShortArray4 = Static149.method2825(this.aShortArray30);
											local56 = this.aClass37_1.aShortArray5 = Static149.method2825(this.aShortArray33);
											local52 = this.aClass37_1.aShortArray3 = Static149.method2825(this.aShortArray32);
											local54 = this.aClass37_1.aByteArray13 = Static579.method7894(this.aByteArray30);
										}
										if (local85 == null) {
											@Pc(366) Class37 local366 = local8.aClass37_1 = new Class37();
											local85 = local366.aShortArray4 = Static149.method2825(local36);
											local89 = local366.aShortArray5 = Static149.method2825(local39);
											local93 = local366.aShortArray3 = Static149.method2825(local42);
											local81 = local366.aByteArray13 = Static579.method7894(local45);
										}
										@Pc(399) short local399 = this.aShortArray30[local199];
										@Pc(404) short local404 = this.aShortArray33[local199];
										@Pc(409) short local409 = this.aShortArray32[local199];
										@Pc(414) byte local414 = this.aByteArray30[local199];
										local204 = local106[local242];
										local211 = local106[local242 + 1];
										@Pc(434) int local434;
										for (@Pc(426) int local426 = local204; local426 < local211; local426++) {
											local434 = local109[local426] - 1;
											if (local434 == -1) {
												break;
											}
											if (local81[local434] != 0) {
												local85[local434] += local399;
												local89[local434] += local404;
												local93[local434] += local409;
												local81[local434] += local414;
											}
										}
										local414 = local45[local279];
										local404 = local39[local279];
										local409 = local42[local279];
										local204 = this.anIntArray70[local135];
										local399 = local36[local279];
										local211 = this.anIntArray70[local135 + 1];
										for (local434 = local204; local434 < local211; local434++) {
											@Pc(521) int local521 = this.aShortArray34[local434] - 1;
											if (local521 == -1) {
												break;
											}
											if (local54[local521] != 0) {
												local50[local521] += local399;
												local56[local521] += local404;
												local52[local521] += local409;
												local54[local521] += local414;
											}
										}
										if (this.aClass208_6 == null && this.aClass208_7 != null) {
											this.aClass208_7.anInterface22_5 = null;
										}
										if (this.aClass208_6 != null) {
											this.aClass208_6.anInterface22_5 = null;
										}
										if (local8.aClass208_6 == null && local8.aClass208_7 != null) {
											local8.aClass208_7.anInterface22_5 = null;
										}
										if (local8.aClass208_6 != null) {
											local8.aClass208_6.anInterface22_5 = null;
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

	@OriginalMember(owner = "client!d", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass31_Sub2_11.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2156; local11++) {
			if (arg0 == this.aShortArray31[local11]) {
				this.aShortArray31[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class172 local43 = local9.method7229(arg0 & 0xFFFF);
			local33 = local43.aByte58;
			local31 = local43.aByte61;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(63) Class172 local63 = local9.method7229(arg1 & 0xFFFF);
			local51 = local63.aByte61;
			local53 = local63.aByte58;
		}
		if (!(local31 != local51 | local53 != local33)) {
			return;
		}
		if (this.aClass255Array1 != null) {
			for (@Pc(92) int local92 = 0; local92 < this.anInt2211; local92++) {
				@Pc(99) Class255 local99 = this.aClass255Array1[local92];
				@Pc(104) Class81 local104 = this.aClass81Array1[local92];
				local104.anInt2691 = Static422.anIntArray428[this.aShortArray36[local99.anInt7375] & 0xFFFF] & 0xFFFFFF | local104.anInt2691 & 0xFF000000;
			}
		}
		if (this.aClass208_7 != null) {
			this.aClass208_7.anInterface22_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "()Z")
	@Override
	public boolean method7632() {
		if (this.aShortArray31 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray31.length; local12++) {
			if (this.aShortArray31[local12] != -1 && !this.aClass31_Sub2_11.anInterface4_14.method7227(this.aShortArray31[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFIIIIFLclient!uo;IJ)S")
	private short method1878(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) Class332 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(18) int local18 = this.anIntArray70[arg1];
		@Pc(25) int local25 = this.anIntArray70[arg1 + 1];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = local18; local29 < local25; local29++) {
			@Pc(36) short local36 = this.aShortArray34[local29];
			if (local36 == 0) {
				local27 = local29;
				break;
			}
			if (Static8.aLongArray1[local29] == arg8) {
				return (short) (local36 - 1);
			}
		}
		this.aShortArray34[local27] = (short) (this.anInt2209 + 1);
		Static8.aLongArray1[local27] = arg8;
		this.aShortArray30[this.anInt2209] = (short) arg7;
		this.aShortArray33[this.anInt2209] = (short) arg4;
		this.aShortArray32[this.anInt2209] = (short) arg2;
		this.aByteArray30[this.anInt2209] = (byte) arg3;
		this.aFloatArray26[this.anInt2209] = arg5;
		this.aFloatArray25[this.anInt2209] = arg0;
		return (short) this.anInt2209++;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(SBBII)I")
	private int method1879(@OriginalArg(0) short arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18 = Static422.anIntArray428[Static212.method4712(arg3, arg2)];
		if (arg0 != -1) {
			@Pc(30) Class172 local30 = this.aClass31_Sub2_11.anInterface4_14.method7229(arg0 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte61 & 0xFF;
			@Pc(44) int local44;
			@Pc(64) int local64;
			if (local35 != 0) {
				if (arg3 < 0) {
					local44 = 0;
				} else if (arg3 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg3 * 131586;
				}
				if (local35 == 256) {
					local18 = local44;
				} else {
					local64 = 256 - local35;
					local18 = ((local44 & 0xFF00FF) * local35 + local64 * (local18 & 0xFF00FF) & 0xFF00FF00) + (local35 * (local44 & 0xFF00) + ((local18 & 0xFF00) * local64) & 0xFF0000) >> 8;
				}
			}
			local44 = local30.aByte58 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(115) int local115 = local44 * (local18 >> 16 & 0xFF);
				if (local115 > 65535) {
					local115 = 65535;
				}
				local64 = (local18 >> 8 & 0xFF) * local44;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(141) int local141 = local44 * (local18 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				local18 = (local141 >> 8) + (local115 << 8 & 0xFF00B5) + (local64 & 0xFF00);
			}
		}
		return (local18 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()V")
	@Override
	protected void method7615() {
	}

	@OriginalMember(owner = "client!d", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2210; local7++) {
			if (arg0 != 0) {
				this.anIntArray71[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray72[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray69[local7] += arg2;
			}
		}
		this.aBoolean164 = false;
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!q;Lclient!b;II)V")
	@Override
	public void method7619(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2209 == 0) {
			return;
		}
		@Pc(16) Class42_Sub1 local16 = this.aClass31_Sub2_11.aClass42_Sub1_3;
		@Pc(19) Class42_Sub1 local19 = (Class42_Sub1) arg0;
		if (!this.aBoolean164) {
			this.method1877();
		}
		Static340.aFloat146 = local16.aFloat51 * local19.aFloat46 + local16.aFloat44 * local19.aFloat50 + local16.aFloat45 * local19.aFloat52 + local16.aFloat46;
		Static543.aFloat210 = local16.aFloat44 * local19.aFloat48 + local16.aFloat45 * local19.aFloat49 + local19.aFloat44 * local16.aFloat51;
		@Pc(72) float local72 = Static340.aFloat146 + (float) this.aShort29 * Static543.aFloat210;
		@Pc(80) float local80 = (float) this.aShort25 * Static543.aFloat210 + Static340.aFloat146;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort26 + local72;
			local97 = (float) -this.aShort26 + local80;
		} else {
			local90 = local80 + (float) this.aShort26;
			local97 = local72 - (float) this.aShort26;
		}
		if (this.aClass31_Sub2_11.aFloat80 <= local97 || (float) this.aClass31_Sub2_11.anInt3172 >= local90) {
			return;
		}
		Static160.aFloat104 = local16.aFloat47 * local19.aFloat49 + local19.aFloat48 * local16.aFloat49 + local19.aFloat44 * local16.aFloat55;
		Static440.aFloat168 = local19.aFloat50 * local16.aFloat49 + local19.aFloat52 * local16.aFloat47 + local16.aFloat55 * local19.aFloat46 + local16.aFloat52;
		@Pc(173) float local173 = Static440.aFloat168 + Static160.aFloat104 * (float) this.aShort29;
		@Pc(181) float local181 = (float) this.aShort25 * Static160.aFloat104 + Static440.aFloat168;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local181 < local173) {
			local197 = (float) this.aClass31_Sub2_11.anInt3145 * ((float) -this.aShort26 + local181);
			local208 = (float) this.aClass31_Sub2_11.anInt3145 * ((float) this.aShort26 + local173);
		} else {
			local197 = ((float) -this.aShort26 + local173) * (float) this.aClass31_Sub2_11.anInt3145;
			local208 = ((float) this.aShort26 + local181) * (float) this.aClass31_Sub2_11.anInt3145;
		}
		if (local197 / (float) arg2 >= this.aClass31_Sub2_11.aFloat91 || this.aClass31_Sub2_11.aFloat81 >= local208 / (float) arg2) {
			return;
		}
		Static572.aFloat228 = local19.aFloat46 * local16.aFloat54 + local19.aFloat50 * local16.aFloat48 + local19.aFloat52 * local16.aFloat53 + local16.aFloat50;
		Static385.aFloat154 = local19.aFloat44 * local16.aFloat54 + local19.aFloat49 * local16.aFloat53 + local19.aFloat48 * local16.aFloat48;
		@Pc(300) float local300 = (float) this.aShort29 * Static385.aFloat154 + Static572.aFloat228;
		@Pc(308) float local308 = Static385.aFloat154 * (float) this.aShort25 + Static572.aFloat228;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local308 < local300) {
			local323 = (float) this.aClass31_Sub2_11.anInt3157 * (local308 - (float) this.aShort26);
			local334 = (float) this.aClass31_Sub2_11.anInt3157 * (local300 + (float) this.aShort26);
		} else {
			local334 = (float) this.aClass31_Sub2_11.anInt3157 * (local308 + (float) this.aShort26);
			local323 = ((float) -this.aShort26 + local300) * (float) this.aClass31_Sub2_11.anInt3157;
		}
		if (local323 / (float) arg2 >= this.aClass31_Sub2_11.aFloat85 || this.aClass31_Sub2_11.aFloat95 >= local334 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass255Array1 != null) {
			Static460.aFloat173 = local16.aFloat47 * local19.aFloat47 + local19.aFloat53 * local16.aFloat49 + local16.aFloat55 * local19.aFloat45;
			Static494.aFloat177 = local19.aFloat47 * local16.aFloat45 + local19.aFloat53 * local16.aFloat44 + local19.aFloat45 * local16.aFloat51;
			Static190.aFloat107 = local19.aFloat53 * local16.aFloat48 + local16.aFloat53 * local19.aFloat47 + local16.aFloat54 * local19.aFloat45;
			Static537.aFloat209 = local16.aFloat48 * local19.aFloat54 + local19.aFloat55 * local16.aFloat53 + local19.aFloat51 * local16.aFloat54;
			Static517.aFloat187 = local16.aFloat51 * local19.aFloat51 + local19.aFloat55 * local16.aFloat45 + local19.aFloat54 * local16.aFloat44;
			Static269.aFloat121 = local19.aFloat54 * local16.aFloat49 + local16.aFloat47 * local19.aFloat55 + local16.aFloat55 * local19.aFloat51;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.aShort21 + this.aShort30 >> 1;
			@Pc(512) int local512 = this.aShort22 + this.aShort27 >> 1;
			@Pc(531) int local531 = (int) ((float) local512 * Static269.aFloat121 + Static440.aFloat168 + (float) local503 * Static460.aFloat173 + (float) this.aShort29 * Static160.aFloat104);
			@Pc(550) int local550 = (int) (Static537.aFloat209 * (float) local512 + Static190.aFloat107 * (float) local503 + Static572.aFloat228 + Static385.aFloat154 * (float) this.aShort29);
			@Pc(569) int local569 = (int) (Static340.aFloat146 + (float) local503 * Static494.aFloat177 + Static543.aFloat210 * (float) this.aShort29 + Static517.aFloat187 * (float) local512);
			@Pc(588) int local588 = (int) (Static460.aFloat173 * (float) local503 + Static440.aFloat168 + (float) this.aShort25 * Static160.aFloat104 + Static269.aFloat121 * (float) local512);
			@Pc(607) int local607 = (int) (Static537.aFloat209 * (float) local512 + Static385.aFloat154 * (float) this.aShort25 + Static572.aFloat228 + Static190.aFloat107 * (float) local503);
			arg1.anInt316 = this.aClass31_Sub2_11.anInt3157 * local607 / arg2 + this.aClass31_Sub2_11.anInt3163;
			@Pc(639) int local639 = (int) (Static517.aFloat187 * (float) local512 + Static494.aFloat177 * (float) local503 + Static340.aFloat146 + (float) this.aShort25 * Static543.aFloat210);
			arg1.anInt318 = this.aClass31_Sub2_11.anInt3160 + local588 * this.aClass31_Sub2_11.anInt3145 / arg2;
			arg1.anInt317 = this.aClass31_Sub2_11.anInt3145 * local531 / arg2 + this.aClass31_Sub2_11.anInt3160;
			arg1.anInt314 = this.aClass31_Sub2_11.anInt3163 + local550 * this.aClass31_Sub2_11.anInt3157 / arg2;
			if (this.aClass31_Sub2_11.anInt3172 <= local569 || this.aClass31_Sub2_11.anInt3172 <= local639) {
				arg1.anInt315 = this.aClass31_Sub2_11.anInt3160 + (this.aShort26 + local531) * this.aClass31_Sub2_11.anInt3145 / arg2 - arg1.anInt317;
				arg1.aBoolean21 = true;
			}
		}
		this.aClass31_Sub2_11.method2500((float) arg2);
		this.aClass31_Sub2_11.method2534();
		this.aClass31_Sub2_11.method2541(local19);
		this.method1889();
		this.aClass31_Sub2_11.method2531();
		this.method1883();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg1 && arg1 < arg0 && arg7 > arg1) {
			return false;
		} else if (arg1 > arg5 && arg0 < arg1 && arg7 < arg1) {
			return false;
		} else if (arg2 > arg4 && arg4 < arg3 && arg6 > arg4) {
			return false;
		} else {
			return arg4 <= arg2 || arg4 <= arg3 || arg4 <= arg6;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			Static188.anInt4084 = 0;
			local26 = 0;
			Static395.anInt6980 = 0;
			Static323.anInt5922 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray17.length > local38) {
					local52 = this.anIntArrayArray17[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static323.anInt5922 += this.anIntArray71[local60];
						Static188.anInt4084 += this.anIntArray72[local60];
						Static395.anInt6980 += this.anIntArray69[local60];
						local26++;
					}
				}
			}
			if (local26 > 0) {
				Static395.anInt6980 = local14 + Static395.anInt6980 / local26;
				Static323.anInt5922 = local22 + Static323.anInt5922 / local26;
				Static188.anInt4084 = local18 + Static188.anInt4084 / local26;
			} else {
				Static188.anInt4084 = local18;
				Static323.anInt5922 = local22;
				Static395.anInt6980 = local14;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local14 = arg4 << 4;
			local22 = arg2 << 4;
			local18 = arg3 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray17.length) {
					local156 = this.anIntArrayArray17[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local54 = local156[local158];
						this.anIntArray71[local54] += local22;
						this.anIntArray72[local54] += local18;
						this.anIntArray69[local54] += local14;
					}
				}
			}
			return;
		}
		@Pc(265) int local265;
		@Pc(283) int local283;
		@Pc(741) int local741;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray17.length > local32) {
					local156 = this.anIntArrayArray17[local32];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							this.anIntArray71[local54] -= Static323.anInt5922;
							this.anIntArray72[local54] -= Static188.anInt4084;
							this.anIntArray69[local54] -= Static395.anInt6980;
							if (arg4 != 0) {
								local60 = Class3_Sub28.anIntArray232[arg4];
								local265 = Class3_Sub28.anIntArray231[arg4];
								local283 = this.anIntArray71[local54] * local265 + local60 * this.anIntArray72[local54] + 16383 >> 14;
								this.anIntArray72[local54] = local265 * this.anIntArray72[local54] + 16383 - local60 * this.anIntArray71[local54] >> 14;
								this.anIntArray71[local54] = local283;
							}
							if (arg2 != 0) {
								local60 = Class3_Sub28.anIntArray232[arg2];
								local265 = Class3_Sub28.anIntArray231[arg2];
								local283 = this.anIntArray72[local54] * local265 + 16383 - this.anIntArray69[local54] * local60 >> 14;
								this.anIntArray69[local54] = this.anIntArray69[local54] * local265 + this.anIntArray72[local54] * local60 + 16383 >> 14;
								this.anIntArray72[local54] = local283;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub28.anIntArray232[arg3];
								local265 = Class3_Sub28.anIntArray231[arg3];
								local283 = local60 * this.anIntArray69[local54] + local265 * this.anIntArray71[local54] + 16383 >> 14;
								this.anIntArray69[local54] = local265 * this.anIntArray69[local54] + 16383 - this.anIntArray71[local54] * local60 >> 14;
								this.anIntArray71[local54] = local283;
							}
							this.anIntArray71[local54] += Static323.anInt5922;
							this.anIntArray72[local54] += Static188.anInt4084;
							this.anIntArray69[local54] += Static395.anInt6980;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							this.anIntArray71[local54] -= Static323.anInt5922;
							this.anIntArray72[local54] -= Static188.anInt4084;
							this.anIntArray69[local54] -= Static395.anInt6980;
							if (arg2 != 0) {
								local60 = Class3_Sub28.anIntArray232[arg2];
								local265 = Class3_Sub28.anIntArray231[arg2];
								local283 = this.anIntArray72[local54] * local265 + 16383 - this.anIntArray69[local54] * local60 >> 14;
								this.anIntArray69[local54] = this.anIntArray72[local54] * local60 + local265 * this.anIntArray69[local54] + 16383 >> 14;
								this.anIntArray72[local54] = local283;
							}
							if (arg4 != 0) {
								local60 = Class3_Sub28.anIntArray232[arg4];
								local265 = Class3_Sub28.anIntArray231[arg4];
								local283 = this.anIntArray72[local54] * local60 + local265 * this.anIntArray71[local54] + 16383 >> 14;
								this.anIntArray72[local54] = local265 * this.anIntArray72[local54] + 16383 - local60 * this.anIntArray71[local54] >> 14;
								this.anIntArray71[local54] = local283;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub28.anIntArray232[arg3];
								local265 = Class3_Sub28.anIntArray231[arg3];
								local283 = local60 * this.anIntArray69[local54] + local265 * this.anIntArray71[local54] + 16383 >> 14;
								this.anIntArray69[local54] = local265 * this.anIntArray69[local54] + 16383 - this.anIntArray71[local54] * local60 >> 14;
								this.anIntArray71[local54] = local283;
							}
							this.anIntArray71[local54] += Static323.anInt5922;
							this.anIntArray72[local54] += Static188.anInt4084;
							this.anIntArray69[local54] += Static395.anInt6980;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray17.length > local38) {
						local52 = this.anIntArrayArray17[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local265 = this.anIntArray70[local60];
							local283 = this.anIntArray70[local60 + 1];
							for (local741 = local265; local741 < local283; local741++) {
								@Pc(750) int local750 = this.aShortArray34[local741] - 1;
								if (local750 == -1) {
									break;
								}
								@Pc(760) int local760;
								@Pc(764) int local764;
								@Pc(782) int local782;
								if (arg4 != 0) {
									local760 = Class3_Sub28.anIntArray232[arg4];
									local764 = Class3_Sub28.anIntArray231[arg4];
									local782 = this.aShortArray33[local750] * local760 + this.aShortArray30[local750] * local764 + 16383 >> 14;
									this.aShortArray33[local750] = (short) (this.aShortArray33[local750] * local764 + 16383 - local760 * this.aShortArray30[local750] >> 14);
									this.aShortArray30[local750] = (short) local782;
								}
								if (arg2 != 0) {
									local760 = Class3_Sub28.anIntArray232[arg2];
									local764 = Class3_Sub28.anIntArray231[arg2];
									local782 = local764 * this.aShortArray33[local750] + 16383 - this.aShortArray32[local750] * local760 >> 14;
									this.aShortArray32[local750] = (short) (local760 * this.aShortArray33[local750] + this.aShortArray32[local750] * local764 + 16383 >> 14);
									this.aShortArray33[local750] = (short) local782;
								}
								if (arg3 != 0) {
									local760 = Class3_Sub28.anIntArray232[arg3];
									local764 = Class3_Sub28.anIntArray231[arg3];
									local782 = local764 * this.aShortArray30[local750] + local760 * this.aShortArray32[local750] + 16383 >> 14;
									this.aShortArray32[local750] = (short) (this.aShortArray32[local750] * local764 + 16383 - this.aShortArray30[local750] * local760 >> 14);
									this.aShortArray30[local750] = (short) local782;
								}
							}
						}
					}
				}
				if (this.aClass208_6 == null && this.aClass208_7 != null) {
					this.aClass208_7.anInterface22_5 = null;
				}
				if (this.aClass208_6 != null) {
					this.aClass208_6.anInterface22_5 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray17.length) {
					local156 = this.anIntArrayArray17[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local54 = local156[local158];
						this.anIntArray71[local54] -= Static323.anInt5922;
						this.anIntArray72[local54] -= Static188.anInt4084;
						this.anIntArray69[local54] -= Static395.anInt6980;
						this.anIntArray71[local54] = arg2 * this.anIntArray71[local54] >> 7;
						this.anIntArray72[local54] = arg3 * this.anIntArray72[local54] >> 7;
						this.anIntArray69[local54] = arg4 * this.anIntArray69[local54] >> 7;
						this.anIntArray71[local54] += Static323.anInt5922;
						this.anIntArray72[local54] += Static188.anInt4084;
						this.anIntArray69[local54] += Static395.anInt6980;
					}
				}
			}
		} else {
			@Pc(1196) Class255 local1196;
			@Pc(1201) Class81 local1201;
			if (arg0 == 5) {
				if (this.anIntArrayArray16 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray16.length > local32) {
							local156 = this.anIntArrayArray16[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local54 = local156[local158];
								local60 = arg2 * 8 + (this.aByteArray29[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray29[local54] = (byte) local60;
							}
							if (local156.length > 0 && this.aClass208_7 != null) {
								this.aClass208_7.anInterface22_5 = null;
							}
						}
					}
					if (this.aClass255Array1 != null) {
						for (local32 = 0; local32 < this.anInt2211; local32++) {
							local1196 = this.aClass255Array1[local32];
							local1201 = this.aClass81Array1[local32];
							local1201.anInt2691 = local1201.anInt2691 & 0xFFFFFF | 255 - (this.aByteArray29[local1196.anInt7375] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1451) Class81 local1451;
				if (arg0 == 8) {
					if (this.anIntArrayArray15 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray15.length) {
								local156 = this.anIntArrayArray15[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1451 = this.aClass81Array1[local156[local158]];
									local1451.anInt2681 += arg2;
									local1451.anInt2683 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray15 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray15.length) {
								local156 = this.anIntArrayArray15[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1451 = this.aClass81Array1[local156[local158]];
									local1451.anInt2686 = local1451.anInt2686 * arg3 >> 7;
									local1451.anInt2684 = local1451.anInt2684 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray15 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray15.length > local32) {
							local156 = this.anIntArrayArray15[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1451 = this.aClass81Array1[local156[local158]];
								local1451.anInt2690 = local1451.anInt2690 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray16 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray16.length) {
						local156 = this.anIntArrayArray16[local32];
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							local60 = this.aShortArray36[local54] & 0xFFFF;
							local265 = local60 >> 10 & 0x3F;
							local283 = local60 >> 7 & 0x7;
							local283 += arg3 / 4;
							@Pc(1297) int local1297 = arg2 + local265 & 0x3F;
							local741 = local60 & 0x7F;
							if (local283 < 0) {
								local283 = 0;
							} else if (local283 > 7) {
								local283 = 7;
							}
							local741 += arg4;
							if (local741 < 0) {
								local741 = 0;
							} else if (local741 > 127) {
								local741 = 127;
							}
							this.aShortArray36[local54] = (short) (local283 << 7 | local1297 << 10 | local741);
						}
						if (local156.length > 0 && this.aClass208_7 != null) {
							this.aClass208_7.anInterface22_5 = null;
						}
					}
				}
				if (this.aClass255Array1 != null) {
					for (local32 = 0; local32 < this.anInt2211; local32++) {
						local1196 = this.aClass255Array1[local32];
						local1201 = this.aClass81Array1[local32];
						local1201.anInt2691 = Static422.anIntArray428[this.aShortArray36[local1196.anInt7375] & 0xFFFF] & 0xFFFFFF | local1201.anInt2691 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt2196 = arg0;
		if (this.aClass37_1 != null && (this.anInt2196 & 0x10000) == 0) {
			this.aShortArray30 = this.aClass37_1.aShortArray4;
			this.aShortArray32 = this.aClass37_1.aShortArray3;
			this.aByteArray30 = this.aClass37_1.aByteArray13;
			this.aShortArray33 = this.aClass37_1.aShortArray5;
			this.aClass37_1 = null;
		}
		this.aBoolean162 = true;
		this.method1888();
	}

	@OriginalMember(owner = "client!d", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort28;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	private void method1883() {
		if (this.aClass255Array1 == null) {
			return;
		}
		@Pc(12) Class42_Sub1 local12 = this.aClass31_Sub2_11.aClass42_Sub1_2;
		this.aClass31_Sub2_11.method2519();
		this.aClass31_Sub2_11.ZA(!this.aBoolean163);
		this.aClass31_Sub2_11.method2545(false);
		this.aClass31_Sub2_11.method2537(this.aClass31_Sub2_11.aClass208_9, null, this.aClass31_Sub2_11.aClass208_8, null);
		for (@Pc(46) int local46 = 0; local46 < this.anInt2211; local46++) {
			@Pc(53) Class255 local53 = this.aClass255Array1[local46];
			@Pc(58) Class81 local58 = this.aClass81Array1[local46];
			if (!local53.aBoolean516 || !this.aClass31_Sub2_11.method8085()) {
				@Pc(86) float local86 = (float) (this.anIntArray71[local53.anInt7368] + this.anIntArray71[local53.anInt7367] + this.anIntArray71[local53.anInt7369]) * 0.3333333F;
				@Pc(108) float local108 = (float) (this.anIntArray72[local53.anInt7367] + this.anIntArray72[local53.anInt7369] + this.anIntArray72[local53.anInt7368]) * 0.3333333F;
				@Pc(130) float local130 = (float) (this.anIntArray69[local53.anInt7369] + this.anIntArray69[local53.anInt7367] + this.anIntArray69[local53.anInt7368]) * 0.3333333F;
				@Pc(144) float local144 = Static440.aFloat168 + local130 * Static269.aFloat121 + Static460.aFloat173 * local86 + local108 * Static160.aFloat104;
				@Pc(158) float local158 = local108 * Static385.aFloat154 + local86 * Static190.aFloat107 + local130 * Static537.aFloat209 + Static572.aFloat228;
				@Pc(172) float local172 = local108 * Static543.aFloat210 + local86 * Static494.aFloat177 + Static517.aFloat187 * local130 + Static340.aFloat146;
				local12.method1232(local58.anInt2690, local58.anInt2686 * local53.aShort98 >> 7, (float) local58.anInt2681 + local144, local53.aShort97 * local58.anInt2684 >> 7, (float) local58.anInt2683 - local158, -local172 + (float) local53.anInt7374);
				this.aClass31_Sub2_11.method2505(local12);
				@Pc(216) int local216 = local58.anInt2691;
				OpenGL.glColor4ub((byte) (local216 >> 16), (byte) (local216 >> 8), (byte) local216, (byte) (local216 >> 24));
				this.aClass31_Sub2_11.method2566(local53.aShort99);
				this.aClass31_Sub2_11.method2568(local53.aByte114);
				this.aClass31_Sub2_11.method2529(4);
			}
		}
		this.aClass31_Sub2_11.ZA(true);
		this.aClass31_Sub2_11.method2531();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7614(@OriginalArg(0) Class42 arg0) {
		@Pc(8) Class42_Sub1 local8 = (Class42_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass317Array2 != null) {
			for (local13 = 0; local13 < this.aClass317Array2.length; local13++) {
				@Pc(20) Class317 local20 = this.aClass317Array2[local13];
				@Pc(22) Class317 local22 = local20;
				if (local20.aClass317_2 != null) {
					local22 = local20.aClass317_2;
				}
				local22.anInt8865 = (int) ((float) this.anIntArray69[local20.anInt8871] * local8.aFloat55 + local8.aFloat49 * (float) this.anIntArray72[local20.anInt8871] + (float) this.anIntArray71[local20.anInt8871] * local8.aFloat47 + local8.aFloat52);
				local22.anInt8863 = (int) (local8.aFloat54 * (float) this.anIntArray69[local20.anInt8871] + (float) this.anIntArray71[local20.anInt8871] * local8.aFloat53 + local8.aFloat48 * (float) this.anIntArray72[local20.anInt8871] + local8.aFloat50);
				local22.anInt8875 = (int) (local8.aFloat46 + local8.aFloat45 * (float) this.anIntArray71[local20.anInt8871] + (float) this.anIntArray72[local20.anInt8871] * local8.aFloat44 + (float) this.anIntArray69[local20.anInt8871] * local8.aFloat51);
				local22.anInt8862 = (int) (local8.aFloat52 + local8.aFloat55 * (float) this.anIntArray69[local20.anInt8874] + (float) this.anIntArray72[local20.anInt8874] * local8.aFloat49 + (float) this.anIntArray71[local20.anInt8874] * local8.aFloat47);
				local22.anInt8872 = (int) (local8.aFloat50 + (float) this.anIntArray69[local20.anInt8874] * local8.aFloat54 + local8.aFloat48 * (float) this.anIntArray72[local20.anInt8874] + (float) this.anIntArray71[local20.anInt8874] * local8.aFloat53);
				local22.anInt8868 = (int) (local8.aFloat45 * (float) this.anIntArray71[local20.anInt8874] + (float) this.anIntArray72[local20.anInt8874] * local8.aFloat44 + local8.aFloat51 * (float) this.anIntArray69[local20.anInt8874] + local8.aFloat46);
				local22.anInt8864 = (int) (local8.aFloat52 + local8.aFloat55 * (float) this.anIntArray69[local20.anInt8867] + local8.aFloat49 * (float) this.anIntArray72[local20.anInt8867] + (float) this.anIntArray71[local20.anInt8867] * local8.aFloat47);
				local22.anInt8877 = (int) ((float) this.anIntArray69[local20.anInt8867] * local8.aFloat54 + local8.aFloat53 * (float) this.anIntArray71[local20.anInt8867] + (float) this.anIntArray72[local20.anInt8867] * local8.aFloat48 + local8.aFloat50);
				local22.anInt8879 = (int) ((float) this.anIntArray69[local20.anInt8867] * local8.aFloat51 + (float) this.anIntArray71[local20.anInt8867] * local8.aFloat45 + (float) this.anIntArray72[local20.anInt8867] * local8.aFloat44 + local8.aFloat46);
			}
		}
		if (this.aClass280Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass280Array2.length; local13++) {
			@Pc(361) Class280 local361 = this.aClass280Array2[local13];
			@Pc(363) Class280 local363 = local361;
			if (local361.aClass280_2 != null) {
				local363 = local361.aClass280_2;
			}
			if (local361.aClass42_5 == null) {
				local361.aClass42_5 = local8.method7519();
			} else {
				local361.aClass42_5.M(local8);
			}
			local363.anInt7965 = (int) (local8.aFloat52 + local8.aFloat55 * (float) this.anIntArray69[local361.anInt7963] + (float) this.anIntArray71[local361.anInt7963] * local8.aFloat47 + (float) this.anIntArray72[local361.anInt7963] * local8.aFloat49);
			local363.anInt7971 = (int) (local8.aFloat48 * (float) this.anIntArray72[local361.anInt7963] + (float) this.anIntArray71[local361.anInt7963] * local8.aFloat53 + local8.aFloat54 * (float) this.anIntArray69[local361.anInt7963] + local8.aFloat50);
			local363.anInt7964 = (int) ((float) this.anIntArray69[local361.anInt7963] * local8.aFloat51 + local8.aFloat45 * (float) this.anIntArray71[local361.anInt7963] + local8.aFloat44 * (float) this.anIntArray72[local361.anInt7963] + local8.aFloat46);
		}
	}

	@OriginalMember(owner = "client!d", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean164) {
			this.method1877();
		}
		@Pc(16) int local16 = arg4 + this.aShort21;
		@Pc(21) int local21 = this.aShort30 + arg4;
		@Pc(26) int local26 = this.aShort22 + arg6;
		@Pc(32) int local32 = arg6 + this.aShort27;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt10009 + local21 >> arg2.anInt10008 >= arg2.anInt10004 || local26 < 0 || arg2.anInt10009 + local32 >> arg2.anInt10008 >= arg2.anInt10007)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10009 + local21 >> arg3.anInt10008 >= arg3.anInt10004 || local26 < 0 || arg3.anInt10007 <= arg3.anInt10009 + local32 >> arg3.anInt10008) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10008;
			local21 = local21 + arg2.anInt10009 - 1 >> arg2.anInt10008;
			local26 >>= arg2.anInt10008;
			local32 = arg2.anInt10009 + local32 - 1 >> arg2.anInt10008;
			if (arg2.method7862(local26, local16) == arg5 && arg5 == arg2.method7862(local26, local21) && arg2.method7862(local32, local16) == arg5 && arg5 == arg2.method7862(local32, local21)) {
				return;
			}
		}
		@Pc(202) int local202;
		if (arg0 == 1) {
			for (local202 = 0; local202 < this.anInt2210; local202++) {
				this.anIntArray72[local202] = this.anIntArray72[local202] + arg2.method7860(this.anIntArray69[local202] + arg6, arg4 + this.anIntArray71[local202]) - arg5;
			}
		} else {
			@Pc(252) int local252;
			@Pc(263) int local263;
			if (arg0 == 2) {
				@Pc(244) short local244 = this.aShort29;
				if (local244 == 0) {
					return;
				}
				for (local252 = 0; local252 < this.anInt2210; local252++) {
					local263 = (this.anIntArray72[local252] << 16) / local244;
					if (arg1 > local263) {
						this.anIntArray72[local252] += (arg2.method7860(arg6 + this.anIntArray69[local252], arg4 + this.anIntArray71[local252]) - arg5) * (arg1 + -local263) / arg1;
					}
				}
			} else {
				@Pc(348) int local348;
				if (arg0 == 3) {
					local202 = (arg1 & 0xFF) * 4;
					local252 = (arg1 >> 8 & 0xFF) * 4;
					local263 = (arg1 >> 16 & 0xFF) << 6;
					local348 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local202 >> 1) < 0 || arg2.anInt10004 << arg2.anInt10008 <= arg2.anInt10009 + (local202 >> 1) + arg4 || arg6 - (local252 >> 1) < 0 || arg6 + (local252 >> 1) + arg2.anInt10009 >= arg2.anInt10007 << arg2.anInt10008) {
						return;
					}
					this.method7627(arg4, local202, local263, arg5, arg2, arg6, local348, local252);
				} else if (arg0 == 4) {
					local202 = this.aShort25 - this.aShort29;
					for (local252 = 0; local252 < this.anInt2210; local252++) {
						this.anIntArray72[local252] = local202 + this.anIntArray72[local252] + arg3.method7860(this.anIntArray69[local252] + arg6, this.anIntArray71[local252] + arg4) - arg5;
					}
				} else if (arg0 == 5) {
					local202 = this.aShort25 - this.aShort29;
					for (local252 = 0; local252 < this.anInt2210; local252++) {
						local263 = this.anIntArray71[local252] + arg4;
						local348 = this.anIntArray69[local252] + arg6;
						@Pc(354) int local354 = arg2.method7860(local348, local263);
						@Pc(360) int local360 = arg3.method7860(local348, local263);
						@Pc(368) int local368 = local354 - local360 - arg1;
						this.anIntArray72[local252] = ((this.anIntArray72[local252] << 8) / local202 * local368 >> 8) + local354 - arg5;
					}
				}
			}
		}
		this.aBoolean164 = false;
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort23;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZB)V")
	private void method1885(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass208_7 != null && this.aClass208_7.anInterface22_5 == null;
		@Pc(27) boolean local27 = this.aClass208_6 != null && this.aClass208_6.anInterface22_5 == null;
		@Pc(38) boolean local38 = this.aClass208_5 != null && this.aClass208_5.anInterface22_5 == null;
		@Pc(49) boolean local49 = this.aClass208_4 != null && this.aClass208_4.anInterface22_5 == null;
		if (arg0) {
			local49 &= (this.aByte23 & 0x8) != 0;
			local38 &= (this.aByte23 & 0x1) != 0;
			local27 &= (this.aByte23 & 0x4) != 0;
			local16 &= (this.aByte23 & 0x2) != 0;
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
		if (local100 * this.anInt2209 <= this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2.aByteArray213.length) {
			this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2.anInt8703 = 0;
		} else {
			this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2 = new Class3_Sub26_Sub2(local100 * (this.anInt2209 + 100));
		}
		@Pc(183) Class3_Sub26_Sub2 local183 = this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2;
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local38) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass31_Sub2_11.aBoolean216) {
				for (local191 = 0; local191 < this.anInt2210; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray71[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray72[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray69[local191]);
					local219 = this.anIntArray70[local191];
					local226 = this.anIntArray70[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray34[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt8703 = local237 * local100;
						local183.method6826(local200);
						local183.method6826(local207);
						local183.method6826(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt2210; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray71[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray72[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray69[local191]);
					local219 = this.anIntArray70[local191];
					local226 = this.anIntArray70[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray34[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt8703 = local100 * local237;
						local183.method6827(local200);
						local183.method6827(local207);
						local183.method6827(local214);
					}
				}
			}
		}
		@Pc(473) float local473;
		@Pc(369) short[] local369;
		@Pc(372) short[] local372;
		@Pc(375) short[] local375;
		@Pc(366) byte[] local366;
		@Pc(529) float local529;
		if (local16) {
			if (this.aClass208_6 == null) {
				if (this.aClass37_1 == null) {
					local366 = this.aByteArray30;
					local369 = this.aShortArray30;
					local372 = this.aShortArray33;
					local375 = this.aShortArray32;
				} else {
					local369 = this.aClass37_1.aShortArray4;
					local375 = this.aClass37_1.aShortArray3;
					local366 = this.aClass37_1.aByteArray13;
					local372 = this.aClass37_1.aShortArray5;
				}
				@Pc(399) float local399 = this.aClass31_Sub2_11.aFloatArray29[0];
				@Pc(405) float local405 = this.aClass31_Sub2_11.aFloatArray29[1];
				@Pc(411) float local411 = this.aClass31_Sub2_11.aFloatArray29[2];
				@Pc(415) float local415 = this.aClass31_Sub2_11.aFloat92;
				@Pc(425) float local425 = this.aClass31_Sub2_11.aFloat90 * 768.0F / (float) this.aShort28;
				@Pc(435) float local435 = this.aClass31_Sub2_11.aFloat96 * 768.0F / (float) this.aShort28;
				for (@Pc(437) int local437 = 0; local437 < this.anInt2156; local437++) {
					@Pc(457) int local457 = this.method1879(this.aShortArray31[local437], this.aByteArray29[local437], this.aShortArray36[local437], this.aShort24);
					@Pc(462) short local462 = this.aShortArray35[local437];
					local473 = (float) (local457 >> 16 & 0xFF) * this.aClass31_Sub2_11.aFloat76;
					@Pc(484) float local484 = (float) (local457 >> 8 & 0xFF) * this.aClass31_Sub2_11.aFloat88;
					@Pc(493) float local493 = this.aClass31_Sub2_11.aFloat86 * (float) (local457 >>> 24);
					@Pc(498) short local498 = (short) local366[local462];
					if (local498 == 0) {
						local529 = ((float) local375[local462] * local411 + local405 * (float) local372[local462] + (float) local369[local462] * local399) * 0.0026041667F;
					} else {
						local529 = ((float) local369[local462] * local399 + (float) local372[local462] * local405 + (float) local375[local462] * local411) / (float) (local498 * 256);
					}
					@Pc(566) float local566 = (local529 < 0.0F ? local435 : local425) * local529 + local415;
					@Pc(571) int local571 = (int) (local493 * local566);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					@Pc(590) int local590 = (int) (local566 * local473);
					@Pc(595) int local595 = (int) (local566 * local484);
					if (local590 < 0) {
						local590 = 0;
					} else if (local590 > 255) {
						local590 = 255;
					}
					local183.anInt8703 = local104 + local462 * local100;
					if (local595 < 0) {
						local595 = 0;
					} else if (local595 > 255) {
						local595 = 255;
					}
					local183.method6809(local571);
					local183.method6809(local590);
					local183.method6809(local595);
					local183.method6809(255 - (this.aByteArray29[local437] & 0xFF));
					local462 = this.aShortArray29[local437];
					local498 = local366[local462];
					if (local498 == 0) {
						local529 = ((float) local369[local462] * local399 + local405 * (float) local372[local462] + local411 * (float) local375[local462]) * 0.0026041667F;
					} else {
						local529 = (local411 * (float) local375[local462] + (float) local372[local462] * local405 + local399 * (float) local369[local462]) / (float) (local498 * 256);
					}
					local566 = (local529 < 0.0F ? local435 : local425) * local529 + local415;
					local571 = (int) (local493 * local566);
					local590 = (int) (local473 * local566);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					local595 = (int) (local484 * local566);
					if (local590 < 0) {
						local590 = 0;
					} else if (local590 > 255) {
						local590 = 255;
					}
					if (local595 < 0) {
						local595 = 0;
					} else if (local595 > 255) {
						local595 = 255;
					}
					local183.anInt8703 = local104 + local462 * local100;
					local183.method6809(local571);
					local183.method6809(local590);
					local183.method6809(local595);
					local183.method6809(255 - (this.aByteArray29[local437] & 0xFF));
					local462 = this.aShortArray38[local437];
					local498 = local366[local462];
					if (local498 == 0) {
						local529 = ((float) local369[local462] * local399 + (float) local372[local462] * local405 + local411 * (float) local375[local462]) * 0.0026041667F;
					} else {
						local529 = (local411 * (float) local375[local462] + local399 * (float) local369[local462] + (float) local372[local462] * local405) / (float) (local498 * 256);
					}
					local566 = local415 + local529 * (local529 < 0.0F ? local435 : local425);
					local571 = (int) (local493 * local566);
					local590 = (int) (local473 * local566);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					if (local590 < 0) {
						local590 = 0;
					} else if (local590 > 255) {
						local590 = 255;
					}
					local595 = (int) (local484 * local566);
					local183.anInt8703 = local100 * local462 + local104;
					if (local595 < 0) {
						local595 = 0;
					} else if (local595 > 255) {
						local595 = 255;
					}
					local183.method6809(local571);
					local183.method6809(local590);
					local183.method6809(local595);
					local183.method6809(255 - (this.aByteArray29[local437] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt2156; local191++) {
					local200 = this.method1879(this.aShortArray31[local191], this.aByteArray29[local191], this.aShortArray36[local191], this.aShort24);
					local183.anInt8703 = local104 + this.aShortArray35[local191] * local100;
					local183.method6826(local200);
					local183.anInt8703 = local104 + local100 * this.aShortArray29[local191];
					local183.method6826(local200);
					local183.anInt8703 = local104 + local100 * this.aShortArray38[local191];
					local183.method6826(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass37_1 == null) {
				local369 = this.aShortArray30;
				local366 = this.aByteArray30;
				local372 = this.aShortArray33;
				local375 = this.aShortArray32;
			} else {
				local369 = this.aClass37_1.aShortArray4;
				local372 = this.aClass37_1.aShortArray5;
				local366 = this.aClass37_1.aByteArray13;
				local375 = this.aClass37_1.aShortArray3;
			}
			@Pc(1097) float local1097 = 3.0F / (float) this.aShort28;
			local183.anInt8703 = local106;
			local529 = 3.0F / (float) (this.aShort28 / 2 + this.aShort28);
			if (this.aClass31_Sub2_11.aBoolean216) {
				for (local228 = 0; local228 < this.anInt2209; local228++) {
					local237 = local366[local228] & 0xFF;
					if (local237 == 0) {
						local183.method6837((float) local369[local228] * local529);
						local183.method6837(local529 * (float) local372[local228]);
						local183.method6837((float) local375[local228] * local529);
					} else {
						local473 = local1097 / (float) local237;
						local183.method6837((float) local369[local228] * local473);
						local183.method6837((float) local372[local228] * local473);
						local183.method6837(local473 * (float) local375[local228]);
					}
					local183.anInt8703 += local100 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt2209; local228++) {
					local237 = local366[local228] & 0xFF;
					if (local237 == 0) {
						local183.method6839((float) local369[local228] * local529);
						local183.method6839(local529 * (float) local372[local228]);
						local183.method6839((float) local375[local228] * local529);
					} else {
						local473 = local1097 / (float) local237;
						local183.method6839(local473 * (float) local369[local228]);
						local183.method6839(local473 * (float) local372[local228]);
						local183.method6839(local473 * (float) local375[local228]);
					}
					local183.anInt8703 += local100 - 12;
				}
			}
		}
		if (local49) {
			local183.anInt8703 = local108;
			if (this.aClass31_Sub2_11.aBoolean216) {
				for (local191 = 0; local191 < this.anInt2209; local191++) {
					local183.method6837(this.aFloatArray26[local191]);
					local183.method6837(this.aFloatArray25[local191]);
					local183.anInt8703 += local100 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt2209; local191++) {
					local183.method6839(this.aFloatArray26[local191]);
					local183.method6839(this.aFloatArray25[local191]);
					local183.anInt8703 += local100 - 8;
				}
			}
		}
		local183.anInt8703 = local100 * this.anInt2209;
		@Pc(1417) Interface22 local1417;
		if (arg0) {
			if (this.anInterface22_2 == null) {
				this.anInterface22_2 = this.aClass31_Sub2_11.method2577(local100, true, local183.anInt8703, local183.aByteArray213);
			} else {
				this.anInterface22_2.method4050(local183.aByteArray213, local100, local183.anInt8703);
			}
			this.aByte23 = 0;
			local1417 = this.anInterface22_2;
		} else {
			local1417 = this.aClass31_Sub2_11.method2577(local100, false, local183.anInt8703, local183.aByteArray213);
			this.aBoolean162 = true;
		}
		if (local38) {
			this.aClass208_5.aByte72 = 0;
			this.aClass208_5.anInterface22_5 = local1417;
		}
		if (local49) {
			this.aClass208_4.anInterface22_5 = local1417;
			this.aClass208_4.aByte72 = local108;
		}
		if (local16) {
			this.aClass208_7.anInterface22_5 = local1417;
			this.aClass208_7.aByte72 = local104;
		}
		if (local27) {
			this.aClass208_6.aByte72 = local106;
			this.aClass208_6.anInterface22_5 = local1417;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!cda;)V")
	private void method1886(@OriginalArg(1) Class3_Sub7_Sub3_Sub1 arg0) {
		if (this.anInt2209 > this.aClass31_Sub2_11.anIntArray108.length) {
			this.aClass31_Sub2_11.anIntArray109 = new int[this.anInt2209];
			this.aClass31_Sub2_11.anIntArray108 = new int[this.anInt2209];
		}
		@Pc(28) int[] local28 = this.aClass31_Sub2_11.anIntArray108;
		@Pc(32) int[] local32 = this.aClass31_Sub2_11.anIntArray109;
		@Pc(60) int local60;
		@Pc(97) int local97;
		@Pc(106) int local106;
		for (@Pc(34) int local34 = 0; local34 < this.anInt2210; local34++) {
			local60 = (this.anIntArray71[local34] - (this.aClass31_Sub2_11.anInt3148 * this.anIntArray72[local34] >> 8) >> this.aClass31_Sub2_11.anInt3133) - arg0.anInt1589;
			@Pc(83) int local83 = (this.anIntArray69[local34] - (this.anIntArray72[local34] * this.aClass31_Sub2_11.anInt3154 >> 8) >> this.aClass31_Sub2_11.anInt3133) - arg0.anInt1587;
			@Pc(88) int local88 = this.anIntArray70[local34];
			@Pc(95) int local95 = this.anIntArray70[local34 + 1];
			for (local97 = local88; local97 < local95; local97++) {
				local106 = this.aShortArray34[local97] - 1;
				if (local106 == -1) {
					break;
				}
				local28[local106] = local60;
				local32[local106] = local83;
			}
		}
		for (local60 = 0; local60 < this.anInt2171; local60++) {
			if (this.aByteArray29 == null || this.aByteArray29[local60] <= 128) {
				@Pc(163) short local163 = this.aShortArray35[local60];
				@Pc(168) short local168 = this.aShortArray29[local60];
				@Pc(173) short local173 = this.aShortArray38[local60];
				local97 = local28[local163];
				local106 = local28[local168];
				@Pc(185) int local185 = local28[local173];
				@Pc(189) int local189 = local32[local163];
				@Pc(193) int local193 = local32[local168];
				@Pc(197) int local197 = local32[local173];
				if (-((local185 - local106) * (-local189 + local193)) + (local97 - local106) * (local193 - local197) > 0) {
					arg0.method1439(local106, local193, local185, local197, local97, local189);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub3 S(@OriginalArg(0) Class3_Sub7_Sub3 arg0) {
		if (this.anInt2209 == 0) {
			return null;
		}
		if (!this.aBoolean164) {
			this.method1877();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass31_Sub2_11.anInt3148 > 0) {
			local40 = this.aShort21 - (this.aShort25 * this.aClass31_Sub2_11.anInt3148 >> 8) >> this.aClass31_Sub2_11.anInt3133;
			local57 = this.aShort30 - (this.aClass31_Sub2_11.anInt3148 * this.aShort29 >> 8) >> this.aClass31_Sub2_11.anInt3133;
		} else {
			local40 = this.aShort21 - (this.aShort29 * this.aClass31_Sub2_11.anInt3148 >> 8) >> this.aClass31_Sub2_11.anInt3133;
			local57 = this.aShort30 - (this.aShort25 * this.aClass31_Sub2_11.anInt3148 >> 8) >> this.aClass31_Sub2_11.anInt3133;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass31_Sub2_11.anInt3154 > 0) {
			local113 = this.aShort22 - (this.aShort25 * this.aClass31_Sub2_11.anInt3154 >> 8) >> this.aClass31_Sub2_11.anInt3133;
			local130 = this.aShort27 - (this.aShort29 * this.aClass31_Sub2_11.anInt3154 >> 8) >> this.aClass31_Sub2_11.anInt3133;
		} else {
			local113 = this.aShort22 - (this.aShort29 * this.aClass31_Sub2_11.anInt3154 >> 8) >> this.aClass31_Sub2_11.anInt3133;
			local130 = this.aShort27 - (this.aClass31_Sub2_11.anInt3154 * this.aShort25 >> 8) >> this.aClass31_Sub2_11.anInt3133;
		}
		@Pc(171) int local171 = local57 + 1 - local40;
		@Pc(178) int local178 = local130 + 1 - local113;
		@Pc(181) Class3_Sub7_Sub3_Sub1 local181 = (Class3_Sub7_Sub3_Sub1) arg0;
		@Pc(197) Class3_Sub7_Sub3_Sub1 local197;
		if (local181 != null && local181.method1443(local178, local171)) {
			local197 = local181;
			local181.method1445();
		} else {
			local197 = new Class3_Sub7_Sub3_Sub1(this.aClass31_Sub2_11, local171, local178);
		}
		local197.method1442(local40, local113, local130, local57);
		this.method1886(local197);
		return local197;
	}

	@OriginalMember(owner = "client!d", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static323.anInt5922 = 0;
			local29 = 0;
			Static395.anInt6980 = 0;
			Static188.anInt4084 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray17.length > local41) {
					local55 = this.anIntArrayArray17[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray37 == null || (arg6 & this.aShortArray37[local63]) != 0) {
							Static323.anInt5922 += this.anIntArray71[local63];
							Static188.anInt4084 += this.anIntArray72[local63];
							Static395.anInt6980 += this.anIntArray69[local63];
							local29++;
						}
					}
				}
			}
			if (local29 <= 0) {
				Static395.anInt6980 = arg4;
				Static323.anInt5922 = arg2;
				Static188.anInt4084 = arg3;
			} else {
				Static323.anInt5922 = Static323.anInt5922 / local29 + arg2;
				Static447.aBoolean548 = true;
				Static395.anInt6980 = Static395.anInt6980 / local29 + arg4;
				Static188.anInt4084 = Static188.anInt4084 / local29 + arg3;
			}
			return;
		}
		@Pc(251) int[] local251;
		@Pc(253) int local253;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[4] * arg3 + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg3 * arg7[7] + arg2 * arg7[6] + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local29;
				arg3 = local35;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray17.length > local35) {
					local251 = this.anIntArrayArray17[local35];
					for (local253 = 0; local253 < local251.length; local253++) {
						local57 = local251[local253];
						if (this.aShortArray37 == null || (this.aShortArray37[local57] & arg6) != 0) {
							this.anIntArray71[local57] += arg2;
							this.anIntArray72[local57] += arg3;
							this.anIntArray69[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(388) int local388;
		@Pc(406) int local406;
		@Pc(634) int local634;
		@Pc(643) int local643;
		@Pc(656) int local656;
		@Pc(660) int local660;
		@Pc(679) int local679;
		@Pc(1020) int local1020;
		@Pc(1028) int local1028;
		@Pc(1182) int local1182;
		@Pc(1207) int local1207;
		@Pc(1211) int local1211;
		@Pc(1219) int local1219;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1234) int local1234;
		@Pc(1364) int[] local1364;
		@Pc(1366) int local1366;
		@Pc(1370) int local1370;
		@Pc(1374) int local1374;
		@Pc(1376) int local1376;
		@Pc(1505) int local1505;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray17.length > local35) {
						local251 = this.anIntArrayArray17[local35];
						for (local253 = 0; local253 < local251.length; local253++) {
							local57 = local251[local253];
							if (this.aShortArray37 == null || (this.aShortArray37[local57] & arg6) != 0) {
								this.anIntArray71[local57] -= Static323.anInt5922;
								this.anIntArray72[local57] -= Static188.anInt4084;
								this.anIntArray69[local57] -= Static395.anInt6980;
								if (arg4 != 0) {
									local63 = Class3_Sub28.anIntArray232[arg4];
									local388 = Class3_Sub28.anIntArray231[arg4];
									local406 = local388 * this.anIntArray71[local57] + this.anIntArray72[local57] * local63 + 16383 >> 14;
									this.anIntArray72[local57] = this.anIntArray72[local57] * local388 + 16383 - this.anIntArray71[local57] * local63 >> 14;
									this.anIntArray71[local57] = local406;
								}
								if (arg2 != 0) {
									local63 = Class3_Sub28.anIntArray232[arg2];
									local388 = Class3_Sub28.anIntArray231[arg2];
									local406 = this.anIntArray72[local57] * local388 + 16383 - this.anIntArray69[local57] * local63 >> 14;
									this.anIntArray69[local57] = this.anIntArray69[local57] * local388 + this.anIntArray72[local57] * local63 + 16383 >> 14;
									this.anIntArray72[local57] = local406;
								}
								if (arg3 != 0) {
									local63 = Class3_Sub28.anIntArray232[arg3];
									local388 = Class3_Sub28.anIntArray231[arg3];
									local406 = this.anIntArray71[local57] * local388 + local63 * this.anIntArray69[local57] + 16383 >> 14;
									this.anIntArray69[local57] = local388 * this.anIntArray69[local57] + 16383 - this.anIntArray71[local57] * local63 >> 14;
									this.anIntArray71[local57] = local406;
								}
								this.anIntArray71[local57] += Static323.anInt5922;
								this.anIntArray72[local57] += Static188.anInt4084;
								this.anIntArray69[local57] += Static395.anInt6980;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray17.length > local41) {
							local55 = this.anIntArrayArray17[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray37 == null || (this.aShortArray37[local63] & arg6) != 0) {
									local388 = this.anIntArray70[local63];
									local406 = this.anIntArray70[local63 + 1];
									for (local634 = local388; local634 < local406; local634++) {
										local643 = this.aShortArray34[local634] - 1;
										if (local643 == -1) {
											break;
										}
										if (arg4 != 0) {
											local656 = Class3_Sub28.anIntArray232[arg4];
											local660 = Class3_Sub28.anIntArray231[arg4];
											local679 = local656 * this.aShortArray33[local643] + this.aShortArray30[local643] * local660 + 16383 >> 14;
											this.aShortArray33[local643] = (short) (this.aShortArray33[local643] * local660 + 16383 - this.aShortArray30[local643] * local656 >> 14);
											this.aShortArray30[local643] = (short) local679;
										}
										if (arg2 != 0) {
											local656 = Class3_Sub28.anIntArray232[arg2];
											local660 = Class3_Sub28.anIntArray231[arg2];
											local679 = local660 * this.aShortArray33[local643] + 16383 - this.aShortArray32[local643] * local656 >> 14;
											this.aShortArray32[local643] = (short) (this.aShortArray33[local643] * local656 + this.aShortArray32[local643] * local660 + 16383 >> 14);
											this.aShortArray33[local643] = (short) local679;
										}
										if (arg3 != 0) {
											local656 = Class3_Sub28.anIntArray232[arg3];
											local660 = Class3_Sub28.anIntArray231[arg3];
											local679 = local656 * this.aShortArray32[local643] + this.aShortArray30[local643] * local660 + 16383 >> 14;
											this.aShortArray32[local643] = (short) (local660 * this.aShortArray32[local643] + 16383 - local656 * this.aShortArray30[local643] >> 14);
											this.aShortArray30[local643] = (short) local679;
										}
									}
								}
							}
						}
					}
					if (this.aClass208_6 == null && this.aClass208_7 != null) {
						this.aClass208_7.anInterface22_5 = null;
					}
					if (this.aClass208_6 != null) {
						this.aClass208_6.anInterface22_5 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local253 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static447.aBoolean548) {
					local388 = arg7[3] * Static188.anInt4084 + arg7[0] * Static323.anInt5922 + arg7[6] * Static395.anInt6980 + 8192 >> 14;
					local406 = arg7[7] * Static395.anInt6980 + arg7[4] * Static188.anInt4084 + arg7[1] * Static323.anInt5922 + 8192 >> 14;
					local406 += local57;
					local388 += local253;
					local634 = Static188.anInt4084 * arg7[5] + arg7[2] * Static323.anInt5922 + arg7[8] * Static395.anInt6980 + 8192 >> 14;
					Static323.anInt5922 = local388;
					Static188.anInt4084 = local406;
					local634 += local63;
					Static447.aBoolean548 = false;
					Static395.anInt6980 = local634;
				}
				@Pc(988) int[] local988 = new int[9];
				local406 = Class3_Sub28.anIntArray231[arg2];
				local634 = Class3_Sub28.anIntArray232[arg2];
				local643 = Class3_Sub28.anIntArray231[arg3];
				local656 = Class3_Sub28.anIntArray232[arg3];
				local660 = Class3_Sub28.anIntArray231[arg4];
				local679 = Class3_Sub28.anIntArray232[arg4];
				local1020 = local634 * local660 + 8192 >> 14;
				local1028 = local634 * local679 + 8192 >> 14;
				local988[1] = local679 * -local643 + local656 * local1020 + 8192 >> 14;
				local988[6] = local1028 * local643 + -local656 * local660 + 8192 >> 14;
				local988[2] = local656 * local406 + 8192 >> 14;
				local988[8] = local643 * local406 + 8192 >> 14;
				local988[3] = local406 * local679 + 8192 >> 14;
				local988[7] = local656 * local679 + local643 * local1020 + 8192 >> 14;
				local988[0] = local1028 * local656 + local643 * local660 + 8192 >> 14;
				local988[4] = local406 * local660 + 8192 >> 14;
				local988[5] = -local634;
				@Pc(1156) int local1156 = -Static395.anInt6980 * local988[2] + local988[1] * -Static188.anInt4084 + -Static323.anInt5922 * local988[0] + 8192 >> 14;
				local1182 = -Static395.anInt6980 * local988[5] + -Static323.anInt5922 * local988[3] + -Static188.anInt4084 * local988[4] + 8192 >> 14;
				local1207 = local988[8] * -Static395.anInt6980 + -Static188.anInt4084 * local988[7] + -Static323.anInt5922 * local988[6] + 8192 >> 14;
				local1211 = local1156 + Static323.anInt5922;
				@Pc(1215) int local1215 = Static188.anInt4084 + local1182;
				local1219 = Static395.anInt6980 + local1207;
				@Pc(1222) int[] local1222 = new int[9];
				for (local1224 = 0; local1224 < 3; local1224++) {
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1232 = 0;
						for (local1234 = 0; local1234 < 3; local1234++) {
							local1232 += arg7[local1228 * 3 + local1234] * local988[local1234 + local1224 * 3];
						}
						local1222[local1228 + local1224 * 3] = local1232 + 8192 >> 14;
					}
				}
				local1228 = local988[2] * local63 + local57 * local988[1] + local988[0] * local253 + 8192 >> 14;
				local1232 = local988[5] * local63 + local988[4] * local57 + local988[3] * local253 + 8192 >> 14;
				local1232 += local1215;
				local1228 += local1211;
				local1234 = local253 * local988[6] + local57 * local988[7] + local63 * local988[8] + 8192 >> 14;
				local1234 += local1219;
				local1364 = new int[9];
				for (local1366 = 0; local1366 < 3; local1366++) {
					for (local1370 = 0; local1370 < 3; local1370++) {
						local1374 = 0;
						for (local1376 = 0; local1376 < 3; local1376++) {
							local1374 += arg7[local1376 + local1366 * 3] * local1222[local1376 * 3 + local1370];
						}
						local1364[local1370 + local1366 * 3] = local1374 + 8192 >> 14;
					}
				}
				local1370 = local1234 * arg7[2] + arg7[0] * local1228 + local1232 * arg7[1] + 8192 >> 14;
				local1374 = arg7[5] * local1234 + arg7[3] * local1228 + arg7[4] * local1232 + 8192 >> 14;
				local1376 = arg7[6] * local1228 + local1232 * arg7[7] + local1234 * arg7[8] + 8192 >> 14;
				local1370 += local29;
				local1374 += local35;
				local1376 += local41;
				for (local1505 = 0; local1505 < local8; local1505++) {
					@Pc(1511) int local1511 = arg1[local1505];
					if (this.anIntArrayArray17.length > local1511) {
						@Pc(1525) int[] local1525 = this.anIntArrayArray17[local1511];
						for (@Pc(1527) int local1527 = 0; local1527 < local1525.length; local1527++) {
							@Pc(1533) int local1533 = local1525[local1527];
							if (this.aShortArray37 == null || (arg6 & this.aShortArray37[local1533]) != 0) {
								@Pc(1574) int local1574 = local1364[2] * this.anIntArray69[local1533] + this.anIntArray71[local1533] * local1364[0] + local1364[1] * this.anIntArray72[local1533] + 8192 >> 14;
								@Pc(1605) int local1605 = local1364[5] * this.anIntArray69[local1533] + this.anIntArray72[local1533] * local1364[4] + local1364[3] * this.anIntArray71[local1533] + 8192 >> 14;
								@Pc(1609) int local1609 = local1574 + local1370;
								@Pc(1640) int local1640 = local1364[8] * this.anIntArray69[local1533] + local1364[6] * this.anIntArray71[local1533] + local1364[7] * this.anIntArray72[local1533] + 8192 >> 14;
								@Pc(1644) int local1644 = local1605 + local1374;
								this.anIntArray71[local1533] = local1609;
								@Pc(1653) int local1653 = local1640 + local1376;
								this.anIntArray72[local1533] = local1644;
								this.anIntArray69[local1533] = local1653;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2590) Class255 local2590;
			@Pc(2595) Class81 local2595;
			if (arg0 == 5) {
				if (this.anIntArrayArray16 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray16.length > local35) {
							local251 = this.anIntArrayArray16[local35];
							for (local253 = 0; local253 < local251.length; local253++) {
								local57 = local251[local253];
								if (this.aShortArray39 == null || (arg6 & this.aShortArray39[local57]) != 0) {
									local63 = arg2 * 8 + (this.aByteArray29[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray29[local57] = (byte) local63;
									if (this.aClass208_7 != null) {
										this.aClass208_7.anInterface22_5 = null;
									}
								}
							}
						}
					}
					if (this.aClass255Array1 != null) {
						for (local35 = 0; local35 < this.anInt2211; local35++) {
							local2590 = this.aClass255Array1[local35];
							local2595 = this.aClass81Array1[local35];
							local2595.anInt2691 = local2595.anInt2691 & 0xFFFFFF | 255 - (this.aByteArray29[local2590.anInt7375] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2852) Class81 local2852;
				if (arg0 == 8) {
					if (this.anIntArrayArray15 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray15.length > local35) {
								local251 = this.anIntArrayArray15[local35];
								for (local253 = 0; local253 < local251.length; local253++) {
									local2852 = this.aClass81Array1[local251[local253]];
									local2852.anInt2683 += arg3;
									local2852.anInt2681 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray15 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray15.length) {
								local251 = this.anIntArrayArray15[local35];
								for (local253 = 0; local253 < local251.length; local253++) {
									local2852 = this.aClass81Array1[local251[local253]];
									local2852.anInt2686 = local2852.anInt2686 * arg3 >> 7;
									local2852.anInt2684 = local2852.anInt2684 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray15 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray15.length > local35) {
							local251 = this.anIntArrayArray15[local35];
							for (local253 = 0; local253 < local251.length; local253++) {
								local2852 = this.aClass81Array1[local251[local253]];
								local2852.anInt2690 = local2852.anInt2690 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray16 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray16.length > local35) {
						local251 = this.anIntArrayArray16[local35];
						for (local253 = 0; local253 < local251.length; local253++) {
							local57 = local251[local253];
							if (this.aShortArray39 == null || (arg6 & this.aShortArray39[local57]) != 0) {
								local63 = this.aShortArray36[local57] & 0xFFFF;
								local388 = local63 >> 10 & 0x3F;
								local406 = local63 >> 7 & 0x7;
								local634 = local63 & 0x7F;
								local406 += arg3 / 4;
								@Pc(2707) int local2707 = arg2 + local388 & 0x3F;
								local634 += arg4;
								if (local406 < 0) {
									local406 = 0;
								} else if (local406 > 7) {
									local406 = 7;
								}
								if (local634 < 0) {
									local634 = 0;
								} else if (local634 > 127) {
									local634 = 127;
								}
								this.aShortArray36[local57] = (short) (local634 | local2707 << 10 | local406 << 7);
								if (this.aClass208_7 != null) {
									this.aClass208_7.anInterface22_5 = null;
								}
							}
						}
					}
				}
				if (this.aClass255Array1 != null) {
					for (local35 = 0; local35 < this.anInt2211; local35++) {
						local2590 = this.aClass255Array1[local35];
						local2595 = this.aClass81Array1[local35];
						local2595.anInt2691 = local2595.anInt2691 & 0xFF000000 | Static422.anIntArray428[this.aShortArray36[local2590.anInt7375] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray17.length) {
					local251 = this.anIntArrayArray17[local35];
					for (local253 = 0; local253 < local251.length; local253++) {
						local57 = local251[local253];
						if (this.aShortArray37 == null || (this.aShortArray37[local57] & arg6) != 0) {
							this.anIntArray71[local57] -= Static323.anInt5922;
							this.anIntArray72[local57] -= Static188.anInt4084;
							this.anIntArray69[local57] -= Static395.anInt6980;
							this.anIntArray71[local57] = arg2 * this.anIntArray71[local57] >> 7;
							this.anIntArray72[local57] = this.anIntArray72[local57] * arg3 >> 7;
							this.anIntArray69[local57] = this.anIntArray69[local57] * arg4 >> 7;
							this.anIntArray71[local57] += Static323.anInt5922;
							this.anIntArray72[local57] += Static188.anInt4084;
							this.anIntArray69[local57] += Static395.anInt6980;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local253 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static447.aBoolean548) {
				local388 = arg7[0] * Static323.anInt5922 + arg7[3] * Static188.anInt4084 + Static395.anInt6980 * arg7[6] + 8192 >> 14;
				local406 = arg7[7] * Static395.anInt6980 + arg7[1] * Static323.anInt5922 + arg7[4] * Static188.anInt4084 + 8192 >> 14;
				local634 = arg7[2] * Static323.anInt5922 + arg7[5] * Static188.anInt4084 + arg7[8] * Static395.anInt6980 + 8192 >> 14;
				local406 += local57;
				local388 += local253;
				Static323.anInt5922 = local388;
				Static188.anInt4084 = local406;
				local634 += local63;
				Static447.aBoolean548 = false;
				Static395.anInt6980 = local634;
			}
			local388 = arg2 << 15 >> 7;
			local406 = arg3 << 15 >> 7;
			local634 = arg4 << 15 >> 7;
			local643 = local388 * -Static323.anInt5922 + 8192 >> 14;
			local656 = local406 * -Static188.anInt4084 + 8192 >> 14;
			local660 = -Static395.anInt6980 * local634 + 8192 >> 14;
			local679 = Static323.anInt5922 + local643;
			local1020 = Static188.anInt4084 + local656;
			local1028 = Static395.anInt6980 + local660;
			@Pc(2010) int[] local2010 = new int[] { local388 * arg7[0] + 8192 >> 14, local388 * arg7[3] + 8192 >> 14, arg7[6] * local388 + 8192 >> 14, arg7[1] * local406 + 8192 >> 14, local406 * arg7[4] + 8192 >> 14, local406 * arg7[7] + 8192 >> 14, local634 * arg7[2] + 8192 >> 14, local634 * arg7[5] + 8192 >> 14, arg7[8] * local634 + 8192 >> 14 };
			local1182 = local253 * local388 + 8192 >> 14;
			local1207 = local57 * local406 + 8192 >> 14;
			local1211 = local63 * local634 + 8192 >> 14;
			@Pc(2146) int local2146 = local1207 + local1020;
			@Pc(2150) int local2150 = local1182 + local679;
			@Pc(2154) int local2154 = local1211 + local1028;
			@Pc(2157) int[] local2157 = new int[9];
			@Pc(2163) int local2163;
			for (local1219 = 0; local1219 < 3; local1219++) {
				for (local2163 = 0; local2163 < 3; local2163++) {
					local1224 = 0;
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1224 += arg7[local1219 * 3 + local1228] * local2010[local2163 + local1228 * 3];
					}
					local2157[local1219 * 3 + local2163] = local1224 + 8192 >> 14;
				}
			}
			local2163 = arg7[0] * local2150 + arg7[1] * local2146 + arg7[2] * local2154 + 8192 >> 14;
			local1224 = arg7[4] * local2146 + local2150 * arg7[3] + arg7[5] * local2154 + 8192 >> 14;
			local2163 += local29;
			local1224 += local35;
			local1228 = local2154 * arg7[8] + arg7[7] * local2146 + arg7[6] * local2150 + 8192 >> 14;
			local1228 += local41;
			for (local1232 = 0; local1232 < local8; local1232++) {
				local1234 = arg1[local1232];
				if (local1234 < this.anIntArrayArray17.length) {
					local1364 = this.anIntArrayArray17[local1234];
					for (local1366 = 0; local1366 < local1364.length; local1366++) {
						local1370 = local1364[local1366];
						if (this.aShortArray37 == null || (arg6 & this.aShortArray37[local1370]) != 0) {
							local1374 = this.anIntArray72[local1370] * local2157[1] + this.anIntArray71[local1370] * local2157[0] + local2157[2] * this.anIntArray69[local1370] + 8192 >> 14;
							local1376 = this.anIntArray69[local1370] * local2157[5] + local2157[4] * this.anIntArray72[local1370] + this.anIntArray71[local1370] * local2157[3] + 8192 >> 14;
							local1505 = this.anIntArray69[local1370] * local2157[8] + local2157[7] * this.anIntArray72[local1370] + this.anIntArray71[local1370] * local2157[6] + 8192 >> 14;
							@Pc(2435) int local2435 = local1374 + local2163;
							@Pc(2439) int local2439 = local1376 + local1224;
							@Pc(2443) int local2443 = local1505 + local1228;
							this.anIntArray71[local1370] = local2435;
							this.anIntArray72[local1370] = local2439;
							this.anIntArray69[local1370] = local2443;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!d", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2210; local15++) {
			@Pc(33) int local33 = this.anIntArray69[local15] * local9 + local13 * this.anIntArray71[local15] >> 14;
			this.anIntArray69[local15] = local13 * this.anIntArray69[local15] - local9 * this.anIntArray71[local15] >> 14;
			this.anIntArray71[local15] = local33;
		}
		this.aBoolean164 = false;
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()[Lclient!ti;")
	@Override
	public Class317[] method7613() {
		return this.aClass317Array2;
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!d", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort24;
	}

	@OriginalMember(owner = "client!d", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2163; local3++) {
			this.anIntArray71[local3] = this.anIntArray71[local3] + 7 >> 4;
			this.anIntArray72[local3] = this.anIntArray72[local3] + 7 >> 4;
			this.anIntArray69[local3] = this.anIntArray69[local3] + 7 >> 4;
		}
		this.aBoolean164 = false;
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
	private void method1888() {
		if (!this.aBoolean162) {
			return;
		}
		this.aBoolean162 = false;
		if (this.aClass317Array2 == null && this.aClass280Array2 == null && this.aClass255Array1 == null) {
			if (this.anIntArray71 != null && !Static491.method6618(this.anInt2196, this.anInt2183)) {
				if (this.aClass208_5 != null && this.aClass208_5.anInterface22_5 == null) {
					this.aBoolean162 = true;
				} else {
					if (!this.aBoolean164) {
						this.method1877();
					}
					this.anIntArray71 = null;
				}
			}
			if (this.anIntArray72 != null && !Static577.method7841(this.anInt2183, this.anInt2196)) {
				if (this.aClass208_5 != null && this.aClass208_5.anInterface22_5 == null) {
					this.aBoolean162 = true;
				} else {
					if (!this.aBoolean164) {
						this.method1877();
					}
					this.anIntArray72 = null;
				}
			}
			if (this.anIntArray69 != null && !Static514.method6935(this.anInt2183, this.anInt2196)) {
				if (this.aClass208_5 != null && this.aClass208_5.anInterface22_5 == null) {
					this.aBoolean162 = true;
				} else {
					if (!this.aBoolean164) {
						this.method1877();
					}
					this.anIntArray69 = null;
				}
			}
		}
		if (this.aShortArray34 != null && this.anIntArray71 == null && this.anIntArray72 == null && this.anIntArray69 == null) {
			this.aShortArray34 = null;
			this.anIntArray70 = null;
		}
		if (this.aByteArray30 != null && !Static430.method5958(this.anInt2183, this.anInt2196)) {
			if (this.aClass208_6 == null) {
				if (this.aClass208_7 != null && this.aClass208_7.anInterface22_5 == null) {
					this.aBoolean162 = true;
				} else {
					this.aShortArray30 = this.aShortArray33 = this.aShortArray32 = null;
					this.aByteArray30 = null;
				}
			} else if (this.aClass208_6.anInterface22_5 == null) {
				this.aBoolean162 = true;
			} else {
				this.aByteArray30 = null;
				this.aShortArray30 = this.aShortArray33 = this.aShortArray32 = null;
			}
		}
		if (this.aShortArray36 != null && !Static315.method4632(this.anInt2196, this.anInt2183)) {
			if (this.aClass208_7 != null && this.aClass208_7.anInterface22_5 == null) {
				this.aBoolean162 = true;
			} else {
				this.aShortArray36 = null;
			}
		}
		if (this.aByteArray29 != null && !Static425.method5880(this.anInt2196, this.anInt2183)) {
			if (this.aClass208_7 != null && this.aClass208_7.anInterface22_5 == null) {
				this.aBoolean162 = true;
			} else {
				this.aByteArray29 = null;
			}
		}
		if (this.aFloatArray26 != null && !Static50.method1223(this.anInt2183, this.anInt2196)) {
			if (this.aClass208_4 != null && this.aClass208_4.anInterface22_5 == null) {
				this.aBoolean162 = true;
			} else {
				this.aFloatArray26 = this.aFloatArray25 = null;
			}
		}
		if (this.aShortArray31 != null && !Static341.method4970(this.anInt2183, this.anInt2196)) {
			if (this.aClass208_7 != null && this.aClass208_7.anInterface22_5 == null) {
				this.aBoolean162 = true;
			} else {
				this.aShortArray31 = null;
			}
		}
		if (this.aShortArray35 != null && !Static138.method2724(this.anInt2183, this.anInt2196)) {
			if (this.aClass107_1 != null && this.aClass107_1.anInterface11_3 == null || this.aClass208_7 != null && this.aClass208_7.anInterface22_5 == null) {
				this.aBoolean162 = true;
			} else {
				this.aShortArray35 = this.aShortArray29 = this.aShortArray38 = null;
			}
		}
		if (this.anIntArrayArray16 != null && !Static422.method5872(this.anInt2196, this.anInt2183)) {
			this.aShortArray39 = null;
			this.anIntArrayArray16 = null;
		}
		if (this.anIntArrayArray17 != null && !Static88.method1959(this.anInt2196, this.anInt2183)) {
			this.anIntArrayArray17 = null;
			this.aShortArray37 = null;
		}
		if (this.anIntArrayArray15 != null && !Static562.method7679(this.anInt2183, this.anInt2196)) {
			this.anIntArrayArray15 = null;
		}
		if (this.anIntArray73 != null && (this.anInt2196 & 0x800) == 0 && (this.anInt2196 & 0x40000) == 0) {
			this.anIntArray73 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!d", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray17 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt2163; local12++) {
			this.anIntArray71[local12] <<= 0x4;
			this.anIntArray72[local12] <<= 0x4;
			this.anIntArray69[local12] <<= 0x4;
		}
		Static395.anInt6980 = 0;
		Static188.anInt4084 = 0;
		Static323.anInt5922 = 0;
		return true;
	}

	@OriginalMember(owner = "client!d", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort28 = (short) arg0;
		if (this.aClass208_7 != null) {
			this.aClass208_7.anInterface22_5 = null;
		}
		if (this.aClass208_6 != null) {
			this.aClass208_6.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2210; local15++) {
			local34 = this.anIntArray69[local15] * local9 + local13 * this.anIntArray71[local15] >> 14;
			this.anIntArray69[local15] = this.anIntArray69[local15] * local13 - this.anIntArray71[local15] * local9 >> 14;
			this.anIntArray71[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt2209; local34++) {
			@Pc(85) int local85 = local9 * this.aShortArray32[local34] + this.aShortArray30[local34] * local13 >> 14;
			this.aShortArray32[local34] = (short) (local13 * this.aShortArray32[local34] - this.aShortArray30[local34] * local9 >> 14);
			this.aShortArray30[local34] = (short) local85;
		}
		if (this.aClass208_6 == null && this.aClass208_7 != null) {
			this.aClass208_7.anInterface22_5 = null;
		}
		if (this.aClass208_6 != null) {
			this.aClass208_6.anInterface22_5 = null;
		}
		this.aBoolean164 = false;
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3) {
		return this.method1891(arg3, -1, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()V")
	@Override
	protected void method7628() {
	}

	@OriginalMember(owner = "client!d", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2156; local7++) {
			if (this.aShortArray36[local7] == arg0) {
				this.aShortArray36[local7] = arg1;
			}
		}
		if (this.aClass255Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt2211; local38++) {
				@Pc(45) Class255 local45 = this.aClass255Array1[local38];
				@Pc(50) Class81 local50 = this.aClass81Array1[local38];
				local50.anInt2691 = local50.anInt2691 & 0xFF000000 | Static422.anIntArray428[this.aShortArray36[local45.anInt7375] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass208_7 != null) {
			this.aClass208_7.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2210; local7++) {
			this.anIntArray69[local7] = -this.anIntArray69[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2209; local25++) {
			this.aShortArray32[local25] = (short) -this.aShortArray32[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2156; local48++) {
			@Pc(55) short local55 = this.aShortArray35[local48];
			this.aShortArray35[local48] = this.aShortArray38[local48];
			this.aShortArray38[local48] = local55;
		}
		if (this.aClass208_6 == null && this.aClass208_7 != null) {
			this.aClass208_7.anInterface22_5 = null;
		}
		if (this.aClass208_6 != null) {
			this.aClass208_6.anInterface22_5 = null;
		}
		if (this.aClass107_1 != null) {
			this.aClass107_1.anInterface11_3 = null;
		}
		this.aBoolean164 = false;
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()V")
	@Override
	public void method7624() {
		if (this.anInt2209 <= 0 || this.anInt2171 <= 0) {
			return;
		}
		this.method1885(false);
		if ((this.aByte23 & 0x10) == 0 && this.aClass107_1.anInterface11_3 == null) {
			this.method1894(false);
		}
		this.method1888();
	}

	@OriginalMember(owner = "client!d", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7629(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray37 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2210; local14++) {
			if ((arg1 & this.aShortArray37[local14]) != 0) {
				if (arg2) {
					arg0.I(this.anIntArray71[local14], this.anIntArray72[local14], this.anIntArray69[local14], local12);
				} else {
					arg0.method7518(this.anIntArray71[local14], this.anIntArray72[local14], this.anIntArray69[local14], local12);
				}
				this.anIntArray71[local14] = local12[0];
				this.anIntArray72[local14] = local12[1];
				this.anIntArray69[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	private void method1889() {
		if (this.anInt2171 == 0) {
			return;
		}
		if (this.aByte23 != 0) {
			this.method1885(true);
		}
		this.method1885(false);
		if (this.aClass107_1 != null) {
			if (this.aClass107_1.anInterface11_3 == null) {
				this.method1894((this.aByte23 & 0x10) != 0);
			}
			if (this.aClass107_1.anInterface11_3 != null) {
				this.aClass31_Sub2_11.method2545(this.aClass208_6 != null);
				this.aClass31_Sub2_11.method2537(this.aClass208_4, this.aClass208_7, this.aClass208_5, this.aClass208_6);
				@Pc(88) int local88 = this.anIntArray73.length - 1;
				for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
					@Pc(97) int local97 = this.anIntArray73[local90];
					@Pc(104) int local104 = this.anIntArray73[local90 + 1];
					@Pc(111) int local111 = this.aShortArray31[local97] & 0xFFFF;
					if (local111 == 65535) {
						local111 = -1;
					}
					this.aClass31_Sub2_11.method2530(this.aClass208_6 != null, local111);
					this.aClass31_Sub2_11.method2498((local104 - local97) * 3, local97 * 3, this.aClass107_1.anInterface11_3);
				}
			}
		}
		this.method1888();
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()[Lclient!rea;")
	@Override
	public Class280[] method7636() {
		return this.aClass280Array2;
	}

	@OriginalMember(owner = "client!d", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort22;
	}

	@OriginalMember(owner = "client!d", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean164) {
			this.method1877();
		}
		return this.aShort26;
	}

	@OriginalMember(owner = "client!d", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean163;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1891(arg3, arg4, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!d", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		if (this.aClass208_7 != null) {
			this.aClass208_7.anInterface22_5 = null;
		}
		this.aShort24 = (short) arg0;
	}

	@OriginalMember(owner = "client!d", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt2196;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class52 method7618(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class52_Sub2 local18;
		@Pc(14) Class52_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass31_Sub2_11.aClass52_Sub2_10;
			local18 = this.aClass31_Sub2_11.aClass52_Sub2_8;
		} else if (arg0 == 2) {
			local14 = this.aClass31_Sub2_11.aClass52_Sub2_7;
			local18 = this.aClass31_Sub2_11.aClass52_Sub2_6;
		} else if (arg0 == 3) {
			local14 = this.aClass31_Sub2_11.aClass52_Sub2_1;
			local18 = this.aClass31_Sub2_11.aClass52_Sub2_2;
		} else if (arg0 == 4) {
			local14 = this.aClass31_Sub2_11.aClass52_Sub2_9;
			local18 = this.aClass31_Sub2_11.aClass52_Sub2_3;
		} else if (arg0 == 5) {
			local14 = this.aClass31_Sub2_11.aClass52_Sub2_5;
			local18 = this.aClass31_Sub2_11.aClass52_Sub2_4;
		} else {
			local18 = local14 = new Class52_Sub2(this.aClass31_Sub2_11);
		}
		return this.method1892(arg1, arg2, arg0 != 0, local14, local18);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIIILclient!q;)Z")
	private boolean method1891(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class42 arg4) {
		@Pc(8) Class42_Sub1 local8 = (Class42_Sub1) arg4;
		@Pc(12) Class42_Sub1 local12 = this.aClass31_Sub2_11.aClass42_Sub1_3;
		@Pc(33) float local33 = local12.aFloat52 + local12.aFloat55 * local8.aFloat46 + local8.aFloat50 * local12.aFloat49 + local8.aFloat52 * local12.aFloat47;
		@Pc(54) float local54 = local12.aFloat50 + local8.aFloat52 * local12.aFloat53 + local12.aFloat48 * local8.aFloat50 + local12.aFloat54 * local8.aFloat46;
		@Pc(75) float local75 = local12.aFloat46 + local12.aFloat44 * local8.aFloat50 + local12.aFloat45 * local8.aFloat52 + local8.aFloat46 * local12.aFloat51;
		Static537.aFloat209 = local8.aFloat51 * local12.aFloat54 + local12.aFloat53 * local8.aFloat55 + local12.aFloat48 * local8.aFloat54;
		Static517.aFloat187 = local8.aFloat55 * local12.aFloat45 + local12.aFloat44 * local8.aFloat54 + local8.aFloat51 * local12.aFloat51;
		Static269.aFloat121 = local8.aFloat55 * local12.aFloat47 + local12.aFloat49 * local8.aFloat54 + local8.aFloat51 * local12.aFloat55;
		Static543.aFloat210 = local8.aFloat44 * local12.aFloat51 + local12.aFloat44 * local8.aFloat48 + local8.aFloat49 * local12.aFloat45;
		Static190.aFloat107 = local8.aFloat47 * local12.aFloat53 + local8.aFloat53 * local12.aFloat48 + local8.aFloat45 * local12.aFloat54;
		Static385.aFloat154 = local12.aFloat54 * local8.aFloat44 + local8.aFloat49 * local12.aFloat53 + local12.aFloat48 * local8.aFloat48;
		Static494.aFloat177 = local12.aFloat51 * local8.aFloat45 + local8.aFloat47 * local12.aFloat45 + local8.aFloat53 * local12.aFloat44;
		Static460.aFloat173 = local8.aFloat53 * local12.aFloat49 + local8.aFloat47 * local12.aFloat47 + local8.aFloat45 * local12.aFloat55;
		Static160.aFloat104 = local12.aFloat47 * local8.aFloat49 + local8.aFloat48 * local12.aFloat49 + local8.aFloat44 * local12.aFloat55;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(256) int local256 = this.aClass31_Sub2_11.anInt3145;
		@Pc(260) int local260 = this.aClass31_Sub2_11.anInt3157;
		if (!this.aBoolean164) {
			this.method1877();
		}
		Static24.anIntArray14[0] = this.aShort21;
		Static446.anIntArray469[0] = this.aShort29;
		Static24.anIntArray14[1] = this.aShort30;
		Static589.anIntArray598[0] = this.aShort22;
		Static446.anIntArray469[1] = this.aShort29;
		Static24.anIntArray14[2] = this.aShort21;
		Static589.anIntArray598[1] = this.aShort22;
		Static446.anIntArray469[2] = this.aShort25;
		Static24.anIntArray14[3] = this.aShort30;
		Static589.anIntArray598[2] = this.aShort22;
		Static446.anIntArray469[3] = this.aShort25;
		Static589.anIntArray598[3] = this.aShort22;
		Static24.anIntArray14[4] = this.aShort21;
		Static446.anIntArray469[4] = this.aShort29;
		Static24.anIntArray14[5] = this.aShort30;
		Static589.anIntArray598[4] = this.aShort27;
		Static446.anIntArray469[5] = this.aShort29;
		Static589.anIntArray598[5] = this.aShort27;
		Static24.anIntArray14[6] = this.aShort21;
		Static446.anIntArray469[6] = this.aShort25;
		Static24.anIntArray14[7] = this.aShort30;
		Static589.anIntArray598[6] = this.aShort27;
		Static446.anIntArray469[7] = this.aShort25;
		Static589.anIntArray598[7] = this.aShort27;
		@Pc(419) float local419;
		@Pc(433) float local433;
		@Pc(447) float local447;
		@Pc(405) float local405;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(388) int local388 = 0; local388 < 8; local388++) {
			local395 = Static589.anIntArray598[local388];
			local400 = Static446.anIntArray469[local388];
			local405 = Static24.anIntArray14[local388];
			local419 = Static460.aFloat173 * local405 + Static160.aFloat104 * local400 + local395 * Static269.aFloat121 + local33;
			local433 = local395 * Static537.aFloat209 + local405 * Static190.aFloat107 + Static385.aFloat154 * local400 + local54;
			local447 = local75 + Static494.aFloat177 * local405 + Static543.aFloat210 * local400 + local395 * Static517.aFloat187;
			if ((float) this.aClass31_Sub2_11.anInt3172 <= local447) {
				if (arg1 > 0) {
					local447 = arg1;
				}
				@Pc(471) float local471 = (float) this.aClass31_Sub2_11.anInt3160 + (float) local256 * local419 / local447;
				@Pc(483) float local483 = local433 * (float) local260 / local447 + (float) this.aClass31_Sub2_11.anInt3163;
				if (local471 < local241) {
					local241 = local471;
				}
				if (local243 < local471) {
					local243 = local471;
				}
				local239 = true;
				if (local247 < local483) {
					local247 = local483;
				}
				if (local483 < local245) {
					local245 = local483;
				}
			}
		}
		if (local239 && local241 < (float) arg3 && local243 > (float) arg3 && (float) arg2 > local245 && local247 > (float) arg2) {
			if (arg0) {
				return true;
			}
			if (this.anInt2209 > this.aClass31_Sub2_11.anIntArray108.length) {
				this.aClass31_Sub2_11.anIntArray109 = new int[this.anInt2209];
				this.aClass31_Sub2_11.anIntArray108 = new int[this.anInt2209];
			}
			@Pc(568) int[] local568 = this.aClass31_Sub2_11.anIntArray108;
			@Pc(572) int[] local572 = this.aClass31_Sub2_11.anIntArray109;
			@Pc(664) int local664;
			for (@Pc(574) int local574 = 0; local574 < this.anInt2210; local574++) {
				local405 = this.anIntArray71[local574];
				local395 = this.anIntArray69[local574];
				local400 = this.anIntArray72[local574];
				local419 = Static269.aFloat121 * local395 + Static160.aFloat104 * local400 + Static460.aFloat173 * local405 + local33;
				local433 = local54 + local395 * Static537.aFloat209 + Static385.aFloat154 * local400 + Static190.aFloat107 * local405;
				local447 = local75 + Static517.aFloat187 * local395 + local405 * Static494.aFloat177 + local400 * Static543.aFloat210;
				@Pc(677) int local677;
				@Pc(682) int local682;
				@Pc(689) int local689;
				if ((float) this.aClass31_Sub2_11.anInt3172 <= local447) {
					if (arg1 > 0) {
						local447 = arg1;
					}
					local664 = (int) ((float) this.aClass31_Sub2_11.anInt3160 + local419 * (float) local256 / local447);
					local677 = (int) (local433 * (float) local260 / local447 + (float) this.aClass31_Sub2_11.anInt3163);
					local682 = this.anIntArray70[local574];
					local689 = this.anIntArray70[local574 + 1];
					for (@Pc(691) int local691 = local682; local691 < local689; local691++) {
						@Pc(700) int local700 = this.aShortArray34[local691] - 1;
						if (local700 == -1) {
							break;
						}
						local568[local700] = local664;
						local572[local700] = local677;
					}
				} else {
					local664 = this.anIntArray70[local574];
					local677 = this.anIntArray70[local574 + 1];
					for (local682 = local664; local682 < local677; local682++) {
						local689 = this.aShortArray34[local682] - 1;
						if (local689 == -1) {
							break;
						}
						local568[this.aShortArray34[local682] - 1] = -999999;
					}
				}
			}
			for (local664 = 0; local664 < this.anInt2156; local664++) {
				if (local568[this.aShortArray35[local664]] != -999999 && local568[this.aShortArray29[local664]] != -999999 && local568[this.aShortArray38[local664]] != -999999 && this.method1880(local572[this.aShortArray29[local664]], arg2, local568[this.aShortArray35[local664]], local568[this.aShortArray29[local664]], arg3, local572[this.aShortArray35[local664]], local568[this.aShortArray38[local664]], local572[this.aShortArray38[local664]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2210; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray72[local15] - local9 * this.anIntArray69[local15] >> 14;
			this.anIntArray69[local15] = local13 * this.anIntArray69[local15] + this.anIntArray72[local15] * local9 >> 14;
			this.anIntArray72[local15] = local34;
		}
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2156; local7++) {
			local16 = this.aShortArray36[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local32 -= -(arg3 * (arg2 - local32) >> 7);
			}
			this.aShortArray36[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass255Array1 != null) {
			for (local16 = 0; local16 < this.anInt2211; local16++) {
				@Pc(110) Class255 local110 = this.aClass255Array1[local16];
				@Pc(115) Class81 local115 = this.aClass81Array1[local16];
				local115.anInt2691 = Static422.anIntArray428[this.aShortArray36[local110.anInt7375] & 0xFFFF] & 0xFFFFFF | local115.anInt2691 & 0xFF000000;
			}
		}
		if (this.aClass208_7 != null) {
			this.aClass208_7.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static323.anInt5922 = 0;
			Static188.anInt4084 = 0;
			Static395.anInt6980 = 0;
			for (local20 = 0; local20 < this.anInt2210; local20++) {
				Static323.anInt5922 += this.anIntArray71[local20];
				Static188.anInt4084 += this.anIntArray72[local20];
				local12++;
				Static395.anInt6980 += this.anIntArray69[local20];
			}
			if (local12 <= 0) {
				Static323.anInt5922 = arg1;
				Static395.anInt6980 = arg3;
				Static188.anInt4084 = arg2;
			} else {
				Static395.anInt6980 = Static395.anInt6980 / local12 + arg3;
				Static323.anInt5922 = arg1 + Static323.anInt5922 / local12;
				Static188.anInt4084 = Static188.anInt4084 / local12 + arg2;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt2210; local12++) {
				this.anIntArray71[local12] += arg1;
				this.anIntArray72[local12] += arg2;
				this.anIntArray69[local12] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(187) int local187;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt2210; local12++) {
					this.anIntArray71[local12] -= Static323.anInt5922;
					this.anIntArray72[local12] -= Static188.anInt4084;
					this.anIntArray69[local12] -= Static395.anInt6980;
					if (arg3 != 0) {
						local20 = Class3_Sub28.anIntArray232[arg3];
						local168 = Class3_Sub28.anIntArray231[arg3];
						local187 = local20 * this.anIntArray72[local12] + local168 * this.anIntArray71[local12] + 16383 >> 14;
						this.anIntArray72[local12] = this.anIntArray72[local12] * local168 + 16383 - local20 * this.anIntArray71[local12] >> 14;
						this.anIntArray71[local12] = local187;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub28.anIntArray232[arg1];
						local168 = Class3_Sub28.anIntArray231[arg1];
						local187 = this.anIntArray72[local12] * local168 + 16383 - this.anIntArray69[local12] * local20 >> 14;
						this.anIntArray69[local12] = this.anIntArray72[local12] * local20 + local168 * this.anIntArray69[local12] + 16383 >> 14;
						this.anIntArray72[local12] = local187;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub28.anIntArray232[arg2];
						local168 = Class3_Sub28.anIntArray231[arg2];
						local187 = this.anIntArray69[local12] * local20 + local168 * this.anIntArray71[local12] + 16383 >> 14;
						this.anIntArray69[local12] = this.anIntArray69[local12] * local168 + 16383 - this.anIntArray71[local12] * local20 >> 14;
						this.anIntArray71[local12] = local187;
					}
					this.anIntArray71[local12] += Static323.anInt5922;
					this.anIntArray72[local12] += Static188.anInt4084;
					this.anIntArray69[local12] += Static395.anInt6980;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt2210; local12++) {
					this.anIntArray71[local12] -= Static323.anInt5922;
					this.anIntArray72[local12] -= Static188.anInt4084;
					this.anIntArray69[local12] -= Static395.anInt6980;
					this.anIntArray71[local12] = this.anIntArray71[local12] * arg1 / 128;
					this.anIntArray72[local12] = arg2 * this.anIntArray72[local12] / 128;
					this.anIntArray69[local12] = this.anIntArray69[local12] * arg3 / 128;
					this.anIntArray71[local12] += Static323.anInt5922;
					this.anIntArray72[local12] += Static188.anInt4084;
					this.anIntArray69[local12] += Static395.anInt6980;
				}
			} else {
				@Pc(527) Class255 local527;
				@Pc(532) Class81 local532;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt2156; local12++) {
						local20 = (this.aByteArray29[local12] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray29[local12] = (byte) local20;
					}
					if (this.aClass208_7 != null) {
						this.aClass208_7.anInterface22_5 = null;
					}
					if (this.aClass255Array1 != null) {
						for (local20 = 0; local20 < this.anInt2211; local20++) {
							local527 = this.aClass255Array1[local20];
							local532 = this.aClass81Array1[local20];
							local532.anInt2691 = local532.anInt2691 & 0xFFFFFF | 255 - (this.aByteArray29[local527.anInt7375] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt2156; local12++) {
						local20 = this.aShortArray36[local12] & 0xFFFF;
						local168 = local20 >> 10 & 0x3F;
						local187 = local20 >> 7 & 0x7;
						@Pc(589) int local589 = local20 & 0x7F;
						local187 += arg2 / 4;
						@Pc(602) int local602 = local168 + arg1 & 0x3F;
						if (local187 < 0) {
							local187 = 0;
						} else if (local187 > 7) {
							local187 = 7;
						}
						local589 += arg3;
						if (local589 < 0) {
							local589 = 0;
						} else if (local589 > 127) {
							local589 = 127;
						}
						this.aShortArray36[local12] = (short) (local602 << 10 | local187 << 7 | local589);
					}
					if (this.aClass208_7 != null) {
						this.aClass208_7.anInterface22_5 = null;
					}
					if (this.aClass255Array1 != null) {
						for (local20 = 0; local20 < this.anInt2211; local20++) {
							local527 = this.aClass255Array1[local20];
							local532 = this.aClass81Array1[local20];
							local532.anInt2691 = local532.anInt2691 & 0xFF000000 | Static422.anIntArray428[this.aShortArray36[local527.anInt7375] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(718) Class81 local718;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt2211; local12++) {
							local718 = this.aClass81Array1[local12];
							local718.anInt2683 += arg2;
							local718.anInt2681 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt2211; local12++) {
							local718 = this.aClass81Array1[local12];
							local718.anInt2684 = arg1 * local718.anInt2684 >> 7;
							local718.anInt2686 = local718.anInt2686 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt2211; local12++) {
							local718 = this.aClass81Array1[local12];
							local718.anInt2690 = arg1 + local718.anInt2690 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub28.anIntArray232[arg0];
		@Pc(13) int local13 = Class3_Sub28.anIntArray231[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2210; local15++) {
			@Pc(33) int local33 = this.anIntArray71[local15] * local13 + local9 * this.anIntArray72[local15] >> 14;
			this.anIntArray72[local15] = local13 * this.anIntArray72[local15] - this.anIntArray71[local15] * local9 >> 14;
			this.anIntArray71[local15] = local33;
		}
		this.aBoolean164 = false;
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2210; local7++) {
			if (arg0 != 128) {
				this.anIntArray71[local7] = arg0 * this.anIntArray71[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray72[local7] = this.anIntArray72[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray69[local7] = arg2 * this.anIntArray69[local7] >> 7;
			}
		}
		if (this.aClass208_5 != null) {
			this.aClass208_5.anInterface22_5 = null;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!q;Lclient!b;I)V")
	@Override
	public void method7617(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2209 == 0) {
			return;
		}
		@Pc(13) Class42_Sub1 local13 = this.aClass31_Sub2_11.aClass42_Sub1_3;
		@Pc(16) Class42_Sub1 local16 = (Class42_Sub1) arg0;
		if (!this.aBoolean164) {
			this.method1877();
		}
		Static543.aFloat210 = local13.aFloat45 * local16.aFloat49 + local13.aFloat44 * local16.aFloat48 + local16.aFloat44 * local13.aFloat51;
		Static340.aFloat146 = local13.aFloat46 + local16.aFloat46 * local13.aFloat51 + local16.aFloat52 * local13.aFloat45 + local13.aFloat44 * local16.aFloat50;
		@Pc(69) float local69 = (float) this.aShort29 * Static543.aFloat210 + Static340.aFloat146;
		@Pc(77) float local77 = Static340.aFloat146 + (float) this.aShort25 * Static543.aFloat210;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.aShort26 + local77;
			local94 = (float) this.aShort26 + local69;
		} else {
			local88 = local69 - (float) this.aShort26;
			local94 = (float) this.aShort26 + local77;
		}
		if (this.aClass31_Sub2_11.aFloat89 <= local88 || local94 <= (float) this.aClass31_Sub2_11.anInt3172) {
			return;
		}
		Static440.aFloat168 = local13.aFloat55 * local16.aFloat46 + local16.aFloat50 * local13.aFloat49 + local13.aFloat47 * local16.aFloat52 + local13.aFloat52;
		Static160.aFloat104 = local13.aFloat55 * local16.aFloat44 + local16.aFloat49 * local13.aFloat47 + local16.aFloat48 * local13.aFloat49;
		@Pc(170) float local170 = Static160.aFloat104 * (float) this.aShort29 + Static440.aFloat168;
		@Pc(178) float local178 = Static160.aFloat104 * (float) this.aShort25 + Static440.aFloat168;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local170 > local178) {
			local194 = (float) this.aClass31_Sub2_11.anInt3145 * ((float) -this.aShort26 + local178);
			local205 = ((float) this.aShort26 + local170) * (float) this.aClass31_Sub2_11.anInt3145;
		} else {
			local194 = (local170 - (float) this.aShort26) * (float) this.aClass31_Sub2_11.anInt3145;
			local205 = ((float) this.aShort26 + local178) * (float) this.aClass31_Sub2_11.anInt3145;
		}
		if (local194 / local94 >= this.aClass31_Sub2_11.aFloat91 || this.aClass31_Sub2_11.aFloat81 >= local205 / local94) {
			return;
		}
		Static385.aFloat154 = local13.aFloat54 * local16.aFloat44 + local16.aFloat48 * local13.aFloat48 + local16.aFloat49 * local13.aFloat53;
		Static572.aFloat228 = local13.aFloat50 + local13.aFloat48 * local16.aFloat50 + local13.aFloat53 * local16.aFloat52 + local16.aFloat46 * local13.aFloat54;
		@Pc(294) float local294 = (float) this.aShort29 * Static385.aFloat154 + Static572.aFloat228;
		@Pc(302) float local302 = Static572.aFloat228 + (float) this.aShort25 * Static385.aFloat154;
		@Pc(329) float local329;
		@Pc(317) float local317;
		if (local302 < local294) {
			local329 = (float) this.aClass31_Sub2_11.anInt3157 * ((float) -this.aShort26 + local302);
			local317 = ((float) this.aShort26 + local294) * (float) this.aClass31_Sub2_11.anInt3157;
		} else {
			local317 = (local302 + (float) this.aShort26) * (float) this.aClass31_Sub2_11.anInt3157;
			local329 = ((float) -this.aShort26 + local294) * (float) this.aClass31_Sub2_11.anInt3157;
		}
		if (this.aClass31_Sub2_11.aFloat85 <= local329 / local94 || local317 / local94 <= this.aClass31_Sub2_11.aFloat95) {
			return;
		}
		if (arg1 != null || this.aClass255Array1 != null) {
			Static494.aFloat177 = local16.aFloat45 * local13.aFloat51 + local16.aFloat53 * local13.aFloat44 + local13.aFloat45 * local16.aFloat47;
			Static190.aFloat107 = local16.aFloat47 * local13.aFloat53 + local13.aFloat48 * local16.aFloat53 + local16.aFloat45 * local13.aFloat54;
			Static517.aFloat187 = local16.aFloat51 * local13.aFloat51 + local16.aFloat54 * local13.aFloat44 + local16.aFloat55 * local13.aFloat45;
			Static269.aFloat121 = local16.aFloat51 * local13.aFloat55 + local13.aFloat49 * local16.aFloat54 + local16.aFloat55 * local13.aFloat47;
			Static460.aFloat173 = local16.aFloat53 * local13.aFloat49 + local13.aFloat47 * local16.aFloat47 + local13.aFloat55 * local16.aFloat45;
			Static537.aFloat209 = local16.aFloat51 * local13.aFloat54 + local16.aFloat55 * local13.aFloat53 + local13.aFloat48 * local16.aFloat54;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(500) int local500 = this.aShort21 + this.aShort30 >> 1;
			@Pc(508) int local508 = this.aShort22 + this.aShort27 >> 1;
			@Pc(527) int local527 = (int) (Static440.aFloat168 + Static460.aFloat173 * (float) local500 + (float) this.aShort29 * Static160.aFloat104 + Static269.aFloat121 * (float) local508);
			@Pc(546) int local546 = (int) (Static572.aFloat228 + (float) local500 * Static190.aFloat107 + Static385.aFloat154 * (float) this.aShort29 + (float) local508 * Static537.aFloat209);
			@Pc(565) int local565 = (int) ((float) local508 * Static517.aFloat187 + Static340.aFloat146 + Static494.aFloat177 * (float) local500 + (float) this.aShort29 * Static543.aFloat210);
			if (local565 < this.aClass31_Sub2_11.anInt3172) {
				local489 = true;
			} else {
				arg1.anInt317 = this.aClass31_Sub2_11.anInt3145 * local527 / local565 + this.aClass31_Sub2_11.anInt3160;
				arg1.anInt314 = this.aClass31_Sub2_11.anInt3157 * local546 / local565 + this.aClass31_Sub2_11.anInt3163;
			}
			@Pc(619) int local619 = (int) ((float) local508 * Static269.aFloat121 + Static440.aFloat168 + (float) local500 * Static460.aFloat173 + Static160.aFloat104 * (float) this.aShort25);
			@Pc(638) int local638 = (int) (Static537.aFloat209 * (float) local508 + Static190.aFloat107 * (float) local500 + Static572.aFloat228 + (float) this.aShort25 * Static385.aFloat154);
			@Pc(657) int local657 = (int) (Static340.aFloat146 + Static494.aFloat177 * (float) local500 + Static543.aFloat210 * (float) this.aShort25 + (float) local508 * Static517.aFloat187);
			if (this.aClass31_Sub2_11.anInt3172 <= local657) {
				arg1.anInt316 = this.aClass31_Sub2_11.anInt3163 + local638 * this.aClass31_Sub2_11.anInt3157 / local657;
				arg1.anInt318 = local619 * this.aClass31_Sub2_11.anInt3145 / local657 + this.aClass31_Sub2_11.anInt3160;
			} else {
				local489 = true;
			}
			if (local489) {
				if (local565 < this.aClass31_Sub2_11.anInt3172 && this.aClass31_Sub2_11.anInt3172 > local657) {
					local491 = false;
				} else {
					@Pc(728) int local728;
					@Pc(738) int local738;
					@Pc(749) int local749;
					if (local565 < this.aClass31_Sub2_11.anInt3172) {
						local728 = (local657 - this.aClass31_Sub2_11.anInt3172 << 16) / (local657 - local565);
						local738 = ((local619 - local527) * local728 >> 16) + local619;
						local749 = local638 + (local728 * (local638 - local546) >> 16);
						arg1.anInt317 = local738 * this.aClass31_Sub2_11.anInt3145 / this.aClass31_Sub2_11.anInt3172 + this.aClass31_Sub2_11.anInt3160;
						arg1.anInt314 = local749 * this.aClass31_Sub2_11.anInt3157 / this.aClass31_Sub2_11.anInt3172 + this.aClass31_Sub2_11.anInt3163;
					} else if (local657 < this.aClass31_Sub2_11.anInt3172) {
						local728 = (local565 - this.aClass31_Sub2_11.anInt3172 << 16) / (local565 - local657);
						local738 = ((local527 - local619) * local728 >> 16) + local527;
						arg1.anInt317 = local738 * this.aClass31_Sub2_11.anInt3145 / this.aClass31_Sub2_11.anInt3172 + this.aClass31_Sub2_11.anInt3160;
						local749 = local546 + (local728 * (local546 - local638) >> 16);
						arg1.anInt314 = local749 * this.aClass31_Sub2_11.anInt3157 / this.aClass31_Sub2_11.anInt3172 + this.aClass31_Sub2_11.anInt3163;
					}
				}
			}
			if (local491) {
				if (local657 >= local565) {
					arg1.anInt315 = this.aClass31_Sub2_11.anInt3160 + this.aClass31_Sub2_11.anInt3145 * (local619 - -this.aShort26) / local657 - arg1.anInt318;
				} else {
					arg1.anInt315 = this.aClass31_Sub2_11.anInt3160 + (this.aShort26 + local527) * this.aClass31_Sub2_11.anInt3145 / local565 - arg1.anInt317;
				}
				arg1.aBoolean21 = true;
			}
		}
		this.aClass31_Sub2_11.method2522();
		this.aClass31_Sub2_11.method2541(local16);
		this.method1889();
		this.aClass31_Sub2_11.method2531();
		this.method1883();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZZILclient!d;Lclient!d;)Lclient!da;")
	private Class52 method1892(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class52_Sub2 arg3, @OriginalArg(5) Class52_Sub2 arg4) {
		arg4.anInt2210 = this.anInt2210;
		if ((arg0 & 0x100) == 0) {
			arg4.aBoolean163 = this.aBoolean163;
		} else {
			arg4.aBoolean163 = true;
		}
		arg4.anInt2156 = this.anInt2156;
		arg4.aShort28 = this.aShort28;
		arg4.aByte23 = 0;
		arg4.anInt2209 = this.anInt2209;
		arg4.anInt2163 = this.anInt2163;
		arg4.anInt2183 = this.anInt2183;
		arg4.aShort24 = this.aShort24;
		arg4.anInt2171 = this.anInt2171;
		arg4.anInt2196 = arg0;
		arg4.anInt2211 = this.anInt2211;
		@Pc(76) boolean local76 = Static134.method2612(arg0, this.anInt2183);
		@Pc(82) boolean local82 = Static216.method3595(this.anInt2183, arg0);
		@Pc(90) boolean local90 = Static171.method3048(this.anInt2183, arg0);
		@Pc(96) boolean local96 = local76 | local82 | local90;
		@Pc(207) int local207;
		if (local96) {
			if (!local76) {
				arg4.anIntArray71 = this.anIntArray71;
			} else if (arg3.anIntArray71 == null || this.anInt2163 > arg3.anIntArray71.length) {
				arg4.anIntArray71 = arg3.anIntArray71 = new int[this.anInt2163];
			} else {
				arg4.anIntArray71 = arg3.anIntArray71;
			}
			if (!local82) {
				arg4.anIntArray72 = this.anIntArray72;
			} else if (arg3.anIntArray72 == null || this.anInt2163 > arg3.anIntArray72.length) {
				arg4.anIntArray72 = arg3.anIntArray72 = new int[this.anInt2163];
			} else {
				arg4.anIntArray72 = arg3.anIntArray72;
			}
			if (!local90) {
				arg4.anIntArray69 = this.anIntArray69;
			} else if (arg3.anIntArray69 == null || this.anInt2163 > arg3.anIntArray69.length) {
				arg4.anIntArray69 = arg3.anIntArray69 = new int[this.anInt2163];
			} else {
				arg4.anIntArray69 = arg3.anIntArray69;
			}
			for (local207 = 0; local207 < this.anInt2163; local207++) {
				if (local76) {
					arg4.anIntArray71[local207] = this.anIntArray71[local207];
				}
				if (local82) {
					arg4.anIntArray72[local207] = this.anIntArray72[local207];
				}
				if (local90) {
					arg4.anIntArray69[local207] = this.anIntArray69[local207];
				}
			}
		} else {
			arg4.anIntArray72 = this.anIntArray72;
			arg4.anIntArray69 = this.anIntArray69;
			arg4.anIntArray71 = this.anIntArray71;
		}
		if (Static295.method4420(arg0, this.anInt2183)) {
			arg4.aClass208_5 = arg3.aClass208_5;
			if (arg2) {
				arg4.aByte23 = (byte) (arg4.aByte23 | 0x1);
			}
			arg4.aClass208_5.anInterface22_5 = this.aClass208_5.anInterface22_5;
			arg4.aClass208_5.aByte72 = this.aClass208_5.aByte72;
		} else if (Static210.method7448(arg0, this.anInt2183)) {
			arg4.aClass208_5 = this.aClass208_5;
		} else {
			arg4.aClass208_5 = null;
		}
		if (Static516.method6952(arg0, this.anInt2183)) {
			if (arg3.aShortArray36 == null || this.anInt2156 > arg3.aShortArray36.length) {
				arg4.aShortArray36 = arg3.aShortArray36 = new short[this.anInt2156];
			} else {
				arg4.aShortArray36 = arg3.aShortArray36;
			}
			for (local207 = 0; local207 < this.anInt2156; local207++) {
				arg4.aShortArray36[local207] = this.aShortArray36[local207];
			}
		} else {
			arg4.aShortArray36 = this.aShortArray36;
		}
		if (Static531.method7276(arg0, this.anInt2183)) {
			if (arg3.aByteArray29 == null || arg3.aByteArray29.length < this.anInt2156) {
				arg4.aByteArray29 = arg3.aByteArray29 = new byte[this.anInt2156];
			} else {
				arg4.aByteArray29 = arg3.aByteArray29;
			}
			for (local207 = 0; local207 < this.anInt2156; local207++) {
				arg4.aByteArray29[local207] = this.aByteArray29[local207];
			}
		} else {
			arg4.aByteArray29 = this.aByteArray29;
		}
		if (Static81.method1881(this.anInt2183, arg0)) {
			arg4.aClass208_7 = arg3.aClass208_7;
			if (arg2) {
				arg4.aByte23 = (byte) (arg4.aByte23 | 0x2);
			}
			arg4.aClass208_7.anInterface22_5 = this.aClass208_7.anInterface22_5;
			arg4.aClass208_7.aByte72 = this.aClass208_7.aByte72;
		} else if (Static523.method7236(arg0, this.anInt2183)) {
			arg4.aClass208_7 = this.aClass208_7;
		} else {
			arg4.aClass208_7 = null;
		}
		@Pc(587) int local587;
		if (Static251.method5133(this.anInt2183, arg0)) {
			if (arg3.aShortArray30 == null || this.anInt2209 > arg3.aShortArray30.length) {
				local207 = this.anInt2209;
				arg4.aShortArray33 = arg3.aShortArray33 = new short[local207];
				arg4.aShortArray32 = arg3.aShortArray32 = new short[local207];
				arg4.aShortArray30 = arg3.aShortArray30 = new short[local207];
			} else {
				arg4.aShortArray32 = arg3.aShortArray32;
				arg4.aShortArray33 = arg3.aShortArray33;
				arg4.aShortArray30 = arg3.aShortArray30;
			}
			if (this.aClass37_1 == null) {
				for (local207 = 0; local207 < this.anInt2209; local207++) {
					arg4.aShortArray30[local207] = this.aShortArray30[local207];
					arg4.aShortArray33[local207] = this.aShortArray33[local207];
					arg4.aShortArray32[local207] = this.aShortArray32[local207];
				}
			} else {
				if (arg3.aClass37_1 == null) {
					arg3.aClass37_1 = new Class37();
				}
				@Pc(575) Class37 local575 = arg4.aClass37_1 = arg3.aClass37_1;
				if (local575.aShortArray4 == null || local575.aShortArray4.length < this.anInt2209) {
					local587 = this.anInt2209;
					local575.aShortArray5 = new short[local587];
					local575.aShortArray3 = new short[local587];
					local575.aShortArray4 = new short[local587];
					local575.aByteArray13 = new byte[local587];
				}
				for (local587 = 0; local587 < this.anInt2209; local587++) {
					arg4.aShortArray30[local587] = this.aShortArray30[local587];
					arg4.aShortArray33[local587] = this.aShortArray33[local587];
					arg4.aShortArray32[local587] = this.aShortArray32[local587];
					local575.aShortArray4[local587] = this.aClass37_1.aShortArray4[local587];
					local575.aShortArray5[local587] = this.aClass37_1.aShortArray5[local587];
					local575.aShortArray3[local587] = this.aClass37_1.aShortArray3[local587];
					local575.aByteArray13[local587] = this.aClass37_1.aByteArray13[local587];
				}
			}
			arg4.aByteArray30 = this.aByteArray30;
		} else {
			arg4.aShortArray30 = this.aShortArray30;
			arg4.aByteArray30 = this.aByteArray30;
			arg4.aShortArray33 = this.aShortArray33;
			arg4.aShortArray32 = this.aShortArray32;
			arg4.aClass37_1 = this.aClass37_1;
		}
		if (Static507.method6860(this.anInt2183, arg0)) {
			arg4.aClass208_6 = arg3.aClass208_6;
			if (arg2) {
				arg4.aByte23 = (byte) (arg4.aByte23 | 0x4);
			}
			arg4.aClass208_6.anInterface22_5 = this.aClass208_6.anInterface22_5;
			arg4.aClass208_6.aByte72 = this.aClass208_6.aByte72;
		} else if (Static519.method7214(this.anInt2183, arg0)) {
			arg4.aClass208_6 = this.aClass208_6;
		} else {
			arg4.aClass208_6 = null;
		}
		if (Static49.method1210(this.anInt2183, arg0)) {
			if (arg3.aFloatArray26 == null || arg3.aFloatArray26.length < this.anInt2156) {
				local207 = this.anInt2209;
				arg4.aFloatArray26 = arg3.aFloatArray26 = new float[local207];
				arg4.aFloatArray25 = arg3.aFloatArray25 = new float[local207];
			} else {
				arg4.aFloatArray26 = arg3.aFloatArray26;
				arg4.aFloatArray25 = arg3.aFloatArray25;
			}
			for (local207 = 0; local207 < this.anInt2209; local207++) {
				arg4.aFloatArray26[local207] = this.aFloatArray26[local207];
				arg4.aFloatArray25[local207] = this.aFloatArray25[local207];
			}
		} else {
			arg4.aFloatArray26 = this.aFloatArray26;
			arg4.aFloatArray25 = this.aFloatArray25;
		}
		if (Static71.method1725(this.anInt2183, arg0)) {
			if (arg2) {
				arg4.aByte23 = (byte) (arg4.aByte23 | 0x8);
			}
			arg4.aClass208_4 = arg3.aClass208_4;
			arg4.aClass208_4.aByte72 = this.aClass208_4.aByte72;
			arg4.aClass208_4.anInterface22_5 = this.aClass208_4.anInterface22_5;
		} else if (Static522.method7235(arg0, this.anInt2183)) {
			arg4.aClass208_4 = this.aClass208_4;
		} else {
			arg4.aClass208_4 = null;
		}
		if (Static412.method5786(arg0, this.anInt2183)) {
			if (arg3.aShortArray35 == null || arg3.aShortArray35.length < this.anInt2156) {
				local207 = this.anInt2156;
				arg4.aShortArray29 = arg3.aShortArray29 = new short[local207];
				arg4.aShortArray35 = arg3.aShortArray35 = new short[local207];
				arg4.aShortArray38 = arg3.aShortArray38 = new short[local207];
			} else {
				arg4.aShortArray38 = arg3.aShortArray38;
				arg4.aShortArray35 = arg3.aShortArray35;
				arg4.aShortArray29 = arg3.aShortArray29;
			}
			for (local207 = 0; local207 < this.anInt2156; local207++) {
				arg4.aShortArray35[local207] = this.aShortArray35[local207];
				arg4.aShortArray29[local207] = this.aShortArray29[local207];
				arg4.aShortArray38[local207] = this.aShortArray38[local207];
			}
		} else {
			arg4.aShortArray35 = this.aShortArray35;
			arg4.aShortArray38 = this.aShortArray38;
			arg4.aShortArray29 = this.aShortArray29;
		}
		if (Static164.method2974(arg0, this.anInt2183)) {
			if (arg2) {
				arg4.aByte23 = (byte) (arg4.aByte23 | 0x10);
			}
			arg4.aClass107_1 = arg3.aClass107_1;
			arg4.aClass107_1.anInterface11_3 = this.aClass107_1.anInterface11_3;
		} else if (Static336.method4912(this.anInt2183, arg0)) {
			arg4.aClass107_1 = this.aClass107_1;
		} else {
			arg4.aClass107_1 = null;
		}
		if (Static395.method5583(this.anInt2183, arg0)) {
			if (arg3.aShortArray31 == null || this.anInt2156 > arg3.aShortArray31.length) {
				local207 = this.anInt2156;
				arg4.aShortArray31 = arg3.aShortArray31 = new short[local207];
			} else {
				arg4.aShortArray31 = arg3.aShortArray31;
			}
			for (local207 = 0; local207 < this.anInt2156; local207++) {
				arg4.aShortArray31[local207] = this.aShortArray31[local207];
			}
		} else {
			arg4.aShortArray31 = this.aShortArray31;
		}
		if (!Static417.method5815(arg0, this.anInt2183)) {
			arg4.aClass81Array1 = this.aClass81Array1;
		} else if (arg3.aClass81Array1 == null || this.anInt2211 > arg3.aClass81Array1.length) {
			local207 = this.anInt2211;
			arg4.aClass81Array1 = arg3.aClass81Array1 = new Class81[local207];
			for (local587 = 0; local587 < this.anInt2211; local587++) {
				arg4.aClass81Array1[local587] = this.aClass81Array1[local587].method2261();
			}
		} else {
			arg4.aClass81Array1 = arg3.aClass81Array1;
			for (local207 = 0; local207 < this.anInt2211; local207++) {
				arg4.aClass81Array1[local207].method2260(this.aClass81Array1[local207]);
			}
		}
		if (this.aBoolean164) {
			arg4.aShort23 = this.aShort23;
			arg4.aBoolean164 = true;
			arg4.aShort27 = this.aShort27;
			arg4.aShort26 = this.aShort26;
			arg4.aShort30 = this.aShort30;
			arg4.aShort21 = this.aShort21;
			arg4.aShort25 = this.aShort25;
			arg4.aShort22 = this.aShort22;
			arg4.aShort29 = this.aShort29;
		} else {
			arg4.aBoolean164 = false;
		}
		arg4.aShortArray37 = this.aShortArray37;
		arg4.aClass255Array1 = this.aClass255Array1;
		arg4.anIntArrayArray16 = this.anIntArrayArray16;
		arg4.anIntArrayArray17 = this.anIntArrayArray17;
		arg4.aClass317Array2 = this.aClass317Array2;
		arg4.aShortArray34 = this.aShortArray34;
		arg4.aShortArray39 = this.aShortArray39;
		arg4.anIntArray70 = this.anIntArray70;
		arg4.anIntArrayArray15 = this.anIntArrayArray15;
		arg4.aClass280Array2 = this.aClass280Array2;
		arg4.anIntArray73 = this.anIntArray73;
		return arg4;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZZ)V")
	private void method1894(@OriginalArg(0) boolean arg0) {
		if (this.anInt2171 * 6 <= this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2.aByteArray213.length) {
			this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2.anInt8703 = 0;
		} else {
			this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2 = new Class3_Sub26_Sub2((this.anInt2171 + 100) * 6);
		}
		@Pc(42) Class3_Sub26_Sub2 local42 = this.aClass31_Sub2_11.aClass3_Sub26_Sub2_2;
		@Pc(48) int local48;
		if (this.aClass31_Sub2_11.aBoolean216) {
			for (local48 = 0; local48 < this.anInt2171; local48++) {
				local42.method6769(this.aShortArray35[local48]);
				local42.method6769(this.aShortArray29[local48]);
				local42.method6769(this.aShortArray38[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt2171; local48++) {
				local42.method6793(this.aShortArray35[local48]);
				local42.method6793(this.aShortArray29[local48]);
				local42.method6793(this.aShortArray38[local48]);
			}
		}
		if (local42.anInt8703 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface11_1 == null) {
				this.anInterface11_1 = this.aClass31_Sub2_11.method2571(local42.anInt8703, true, local42.aByteArray213);
			} else {
				this.anInterface11_1.method5869(local42.anInt8703, local42.aByteArray213);
			}
			this.aClass107_1.anInterface11_3 = this.anInterface11_1;
		} else {
			this.aClass107_1.anInterface11_3 = this.aClass31_Sub2_11.method2571(local42.anInt8703, false, local42.aByteArray213);
		}
		if (!arg0) {
			this.aBoolean162 = true;
		}
	}
}
