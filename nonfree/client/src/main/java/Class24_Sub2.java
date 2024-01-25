import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[F")
	private float[] aFloatArray30;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	private int anInt4329;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "[I")
	private int[] anIntArray358;

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "[Lclient!ep;")
	private Class92[] aClass92Array1;

	@OriginalMember(owner = "client!jc", name = "kb", descriptor = "[Lclient!sh;")
	private Class292[] aClass292Array1;

	@OriginalMember(owner = "client!jc", name = "mb", descriptor = "Lclient!pn;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!jc", name = "qb", descriptor = "[Lclient!bh;")
	private Class33[] aClass33Array5;

	@OriginalMember(owner = "client!jc", name = "rb", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!jc", name = "tb", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!jc", name = "vb", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!jc", name = "yb", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!jc", name = "zb", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!jc", name = "Ab", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!jc", name = "Cb", descriptor = "B")
	private byte aByte52;

	@OriginalMember(owner = "client!jc", name = "Db", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!jc", name = "Ib", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!jc", name = "Kb", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!jc", name = "Ob", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!jc", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!jc", name = "Sb", descriptor = "I")
	private int anInt4361;

	@OriginalMember(owner = "client!jc", name = "Vb", descriptor = "Lclient!cea;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!jc", name = "ac", descriptor = "I")
	private int anInt4368;

	@OriginalMember(owner = "client!jc", name = "bc", descriptor = "[Lclient!vp;")
	private Class335[] aClass335Array5;

	@OriginalMember(owner = "client!jc", name = "cc", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!jc", name = "fc", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!jc", name = "kc", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!jc", name = "lc", descriptor = "Lclient!qa;")
	private Interface15 anInterface15_3;

	@OriginalMember(owner = "client!jc", name = "mc", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!jc", name = "pc", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
	private int anInt4331 = 0;

	@OriginalMember(owner = "client!jc", name = "xb", descriptor = "Z")
	private boolean aBoolean321 = true;

	@OriginalMember(owner = "client!jc", name = "Fb", descriptor = "I")
	private int anInt4354 = 0;

	@OriginalMember(owner = "client!jc", name = "Lb", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!jc", name = "jc", descriptor = "I")
	private int anInt4373 = 0;

	@OriginalMember(owner = "client!jc", name = "Bb", descriptor = "I")
	private int anInt4352 = 0;

	@OriginalMember(owner = "client!jc", name = "hc", descriptor = "I")
	private int anInt4371 = 0;

	@OriginalMember(owner = "client!jc", name = "wb", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_20;

	@OriginalMember(owner = "client!jc", name = "ub", descriptor = "Lclient!kca;")
	private Class166 aClass166_5;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Lclient!kca;")
	private Class166 aClass166_4;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!kca;")
	private Class166 aClass166_3;

	@OriginalMember(owner = "client!jc", name = "dc", descriptor = "Lclient!kca;")
	private Class166 aClass166_6;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "Lclient!re;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class24_Sub2(@OriginalArg(0) Class90_Sub1 arg0) {
		this.aClass90_Sub1_20 = arg0;
		this.aClass166_5 = new Class166(null, 5126, 3, 0);
		this.aClass166_4 = new Class166(null, 5126, 2, 0);
		this.aClass166_3 = new Class166(null, 5126, 3, 0);
		this.aClass166_6 = new Class166(null, 5121, 4, 0);
		this.aClass273_1 = new Class273();
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!en;Lclient!hn;IIII)V")
	public Class24_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass90_Sub1_20 = arg0;
		this.anInt4361 = arg2;
		this.anInt4368 = arg5;
		if (Static506.method5540(arg2, arg5)) {
			this.aClass166_5 = new Class166(null, 5126, 3, 0);
		}
		if (Static422.method5978(arg5, arg2)) {
			this.aClass166_4 = new Class166(null, 5126, 2, 0);
		}
		if (Static429.method6105(arg5, arg2)) {
			this.aClass166_3 = new Class166(null, 5126, 3, 0);
		}
		if (Static169.method7350(arg5, arg2)) {
			this.aClass166_6 = new Class166(null, 5121, 4, 0);
		}
		if (Static483.method6799(arg2, arg5)) {
			this.aClass273_1 = new Class273();
		}
		@Pc(102) Interface2 local102 = arg0.anInterface2_15;
		@Pc(106) int[] local106 = new int[arg1.anInt3853];
		this.anIntArray359 = new int[arg1.anInt3867 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt3853; local115++) {
			if ((arg1.aByteArray46 == null || arg1.aByteArray46[local115] != 2) && (arg1.aShortArray58 == null || arg1.aShortArray58[local115] == -1 || !local102.method3085(arg1.aShortArray58[local115] & 0xFFFF).aBoolean235)) {
				local106[this.anInt4373++] = local115;
				this.anIntArray359[arg1.aShortArray52[local115]]++;
				this.anIntArray359[arg1.aShortArray55[local115]]++;
				this.anIntArray359[arg1.aShortArray60[local115]]++;
			}
		}
		this.anInt4354 = this.anInt4373;
		@Pc(209) long[] local209 = new long[this.anInt4373];
		@Pc(221) boolean local221 = (this.anInt4361 & 0x100) != 0;
		@Pc(233) int local233;
		@Pc(244) int local244;
		@Pc(380) int local380;
		label495: for (@Pc(223) int local223 = 0; local223 < this.anInt4373; local223++) {
			@Pc(229) int local229 = local106[local223];
			@Pc(231) Class115 local231 = null;
			local233 = 0;
			@Pc(235) byte local235 = 0;
			@Pc(237) byte local237 = 0;
			@Pc(239) byte local239 = 0;
			if (arg1.aClass143Array1 != null) {
				for (local244 = 0; local244 < arg1.aClass143Array1.length; local244++) {
					@Pc(251) Class143 local251 = arg1.aClass143Array1[local244];
					if (local229 == local251.anInt4099) {
						@Pc(264) Class276 local264 = Static116.method1819(local251.anInt4098);
						if (local264.aBoolean518) {
							local209[local223] = Long.MAX_VALUE;
							this.anInt4354--;
							continue label495;
						}
					}
				}
			}
			@Pc(287) short local287 = -1;
			if (arg1.aShortArray58 != null) {
				local287 = arg1.aShortArray58[local229];
				if (local287 != -1) {
					local231 = local102.method3085(local287 & 0xFFFF);
					local239 = local231.aByte39;
					local237 = local231.aByte34;
				}
			}
			@Pc(336) boolean local336 = arg1.aByteArray48 != null && arg1.aByteArray48[local229] != 0 || local231 != null && !local231.aBoolean226 | local231.aBoolean228;
			if ((local221 || local336) && arg1.aByteArray49 != null) {
				local233 += arg1.aByteArray49[local229] << 17;
			}
			if (local336) {
				local233 += 65536;
			}
			local233 += (local237 & 0xFF) << 8;
			local233 += local239 & 0xFF;
			local380 = local235 + ((local287 & 0xFFFF) << 16);
			@Pc(386) int local386 = local380 + (local223 & 0xFFFF);
			local209[local223] = (long) local386 + ((long) local233 << 32);
		}
		Static15.method201(local106, local209);
		this.anInt4371 = arg1.anInt3867;
		this.anInt4352 = arg1.anInt3857;
		this.aShortArray72 = arg1.aShortArray53;
		this.anIntArray363 = arg1.anIntArray328;
		this.anIntArray360 = arg1.anIntArray336;
		this.anIntArray361 = arg1.anIntArray326;
		@Pc(437) Class20[] local437 = new Class20[this.anInt4371];
		this.aClass33Array5 = arg1.aClass33Array3;
		this.aClass335Array5 = arg1.aClass335Array3;
		@Pc(465) int local465;
		@Pc(479) int local479;
		if (arg1.aClass143Array1 != null) {
			this.anInt4329 = arg1.aClass143Array1.length;
			this.aClass292Array1 = new Class292[this.anInt4329];
			this.aClass92Array1 = new Class92[this.anInt4329];
			for (local465 = 0; local465 < this.anInt4329; local465++) {
				@Pc(472) Class143 local472 = arg1.aClass143Array1[local465];
				@Pc(477) Class276 local477 = Static116.method1819(local472.anInt4098);
				local479 = -1;
				for (@Pc(481) int local481 = 0; local481 < this.anInt4373; local481++) {
					if (local472.anInt4099 == local106[local481]) {
						local479 = local481;
						break;
					}
				}
				if (local479 == -1) {
					throw new RuntimeException();
				}
				local244 = Static36.anIntArray31[arg1.aShortArray51[local472.anInt4099] & 0xFFFF] & 0xFFFFFF;
				local244 |= 255 - (arg1.aByteArray48 == null ? 0 : arg1.aByteArray48[local472.anInt4099]) << 24;
				this.aClass92Array1[local465] = new Class92(local479, arg1.aShortArray52[local472.anInt4099], arg1.aShortArray55[local472.anInt4099], arg1.aShortArray60[local472.anInt4099], local477.anInt7927, local477.anInt7920, local477.anInt7928, local477.anInt7923, local477.anInt7922, local477.aBoolean518, local477.aBoolean519, local472.anInt4100);
				this.aClass292Array1[local465] = new Class292(local244);
			}
		}
		local465 = this.anInt4373 * 3;
		this.aFloatArray30 = new float[local465];
		this.aByteArray58 = new byte[local465];
		this.aShortArray68 = new short[local465];
		this.aShortArray67 = new short[this.anInt4373];
		this.aShortArray75 = new short[local465];
		this.aShortArray74 = new short[this.anInt4373];
		this.aFloatArray31 = new float[local465];
		if (arg1.aShortArray59 != null) {
			this.aShortArray66 = new short[this.anInt4373];
		}
		this.aShortArray71 = new short[local465];
		this.aShort64 = (short) arg4;
		this.aShortArray70 = new short[this.anInt4373];
		this.aShort69 = (short) arg3;
		this.aByteArray57 = new byte[this.anInt4373];
		this.aShortArray65 = new short[this.anInt4373];
		Static476.aLongArray20 = new long[local465];
		this.aShortArray69 = new short[local465];
		this.aShortArray73 = new short[this.anInt4373];
		local233 = 0;
		for (local380 = 0; local380 < arg1.anInt3867; local380++) {
			local479 = this.anIntArray359[local380];
			this.anIntArray359[local380] = local233;
			local233 += local479;
			local437[local380] = new Class20();
		}
		this.anIntArray359[arg1.anInt3867] = local233;
		@Pc(719) int[] local719 = null;
		@Pc(721) int[] local721 = null;
		@Pc(723) int[] local723 = null;
		@Pc(725) float[][] local725 = null;
		@Pc(751) int local751;
		@Pc(783) int local783;
		@Pc(789) int local789;
		@Pc(803) int local803;
		@Pc(805) int local805;
		@Pc(841) int local841;
		@Pc(846) int local846;
		@Pc(1004) float local1004;
		@Pc(1020) float local1020;
		@Pc(1012) float local1012;
		if (arg1.aByteArray47 != null) {
			@Pc(731) int local731 = arg1.anInt3860;
			@Pc(734) int[] local734 = new int[local731];
			@Pc(737) int[] local737 = new int[local731];
			@Pc(740) int[] local740 = new int[local731];
			@Pc(743) int[] local743 = new int[local731];
			@Pc(746) int[] local746 = new int[local731];
			@Pc(749) int[] local749 = new int[local731];
			for (local751 = 0; local751 < local731; local751++) {
				local734[local751] = Integer.MAX_VALUE;
				local737[local751] = -2147483647;
				local740[local751] = Integer.MAX_VALUE;
				local743[local751] = -2147483647;
				local746[local751] = Integer.MAX_VALUE;
				local749[local751] = -2147483647;
			}
			for (local783 = 0; local783 < this.anInt4373; local783++) {
				local789 = local106[local783];
				if (arg1.aByteArray47[local789] != -1) {
					local803 = arg1.aByteArray47[local789] & 0xFF;
					for (local805 = 0; local805 < 3; local805++) {
						@Pc(822) short local822;
						if (local805 == 0) {
							local822 = arg1.aShortArray52[local789];
						} else if (local805 == 1) {
							local822 = arg1.aShortArray55[local789];
						} else {
							local822 = arg1.aShortArray60[local789];
						}
						local841 = arg1.anIntArray326[local822];
						local846 = arg1.anIntArray328[local822];
						@Pc(851) int local851 = arg1.anIntArray336[local822];
						if (local734[local803] > local841) {
							local734[local803] = local841;
						}
						if (local841 > local737[local803]) {
							local737[local803] = local841;
						}
						if (local846 < local740[local803]) {
							local740[local803] = local846;
						}
						if (local743[local803] < local846) {
							local743[local803] = local846;
						}
						if (local851 < local746[local803]) {
							local746[local803] = local851;
						}
						if (local749[local803] < local851) {
							local749[local803] = local851;
						}
					}
				}
			}
			local719 = new int[local731];
			local725 = new float[local731][];
			local723 = new int[local731];
			local721 = new int[local731];
			for (local789 = 0; local789 < local731; local789++) {
				@Pc(951) byte local951 = arg1.aByteArray45[local789];
				if (local951 > 0) {
					local719[local789] = (local737[local789] + local734[local789]) / 2;
					local721[local789] = (local743[local789] + local740[local789]) / 2;
					local723[local789] = (local746[local789] + local749[local789]) / 2;
					if (local951 == 1) {
						local846 = arg1.anIntArray331[local789];
						if (local846 == 0) {
							local1020 = 1.0F;
							local1004 = 1.0F;
						} else if (local846 > 0) {
							local1004 = 1.0F;
							local1020 = (float) local846 / 1024.0F;
						} else {
							local1004 = (float) -local846 / 1024.0F;
							local1020 = 1.0F;
						}
						local1012 = 64.0F / (float) arg1.anIntArray327[local789];
					} else if (local951 == 2) {
						local1004 = 64.0F / (float) arg1.anIntArray331[local789];
						local1012 = 64.0F / (float) arg1.anIntArray327[local789];
						local1020 = 64.0F / (float) arg1.anIntArray333[local789];
					} else {
						local1012 = (float) arg1.anIntArray327[local789] / 1024.0F;
						local1004 = (float) arg1.anIntArray331[local789] / 1024.0F;
						local1020 = (float) arg1.anIntArray333[local789] / 1024.0F;
					}
					local725[local789] = Static184.method3084(local1004, arg1.aByteArray51[local789] & 0xFF, local1020, local1012, arg1.aShortArray54[local789], arg1.aShortArray56[local789], arg1.aShortArray57[local789]);
				}
			}
		}
		@Pc(1129) Class42[] local1129 = new Class42[arg1.anInt3853];
		@Pc(1148) short local1148;
		@Pc(1159) int local1159;
		@Pc(1170) int local1170;
		@Pc(1231) int local1231;
		for (@Pc(1131) int local1131 = 0; local1131 < arg1.anInt3853; local1131++) {
			@Pc(1138) short local1138 = arg1.aShortArray52[local1131];
			@Pc(1143) short local1143 = arg1.aShortArray55[local1131];
			local1148 = arg1.aShortArray60[local1131];
			local1159 = this.anIntArray361[local1143] - this.anIntArray361[local1138];
			local1170 = this.anIntArray363[local1143] - this.anIntArray363[local1138];
			local751 = this.anIntArray360[local1143] - this.anIntArray360[local1138];
			local783 = this.anIntArray361[local1148] - this.anIntArray361[local1138];
			local789 = this.anIntArray363[local1148] - this.anIntArray363[local1138];
			local803 = this.anIntArray360[local1148] - this.anIntArray360[local1138];
			local805 = local1170 * local803 - local789 * local751;
			local1231 = local783 * local751 - local803 * local1159;
			for (local841 = local1159 * local789 - local783 * local1170; local805 > 8192 || local1231 > 8192 || local841 > 8192 || local805 < -8192 || local1231 < -8192 || local841 < -8192; local841 >>= 0x1) {
				local805 >>= 0x1;
				local1231 >>= 0x1;
			}
			local846 = (int) Math.sqrt((double) (local841 * local841 + local1231 * local1231 + local805 * local805));
			if (local846 <= 0) {
				local846 = 1;
			}
			local1231 = local1231 * 256 / local846;
			local841 = local841 * 256 / local846;
			local805 = local805 * 256 / local846;
			@Pc(1329) byte local1329 = arg1.aByteArray46 == null ? 0 : arg1.aByteArray46[local1131];
			if (local1329 == 0) {
				@Pc(1338) Class20 local1338 = local437[local1138];
				local1338.anInt428 += local805;
				local1338.anInt430 += local841;
				local1338.anInt429++;
				local1338.anInt426 += local1231;
				@Pc(1366) Class20 local1366 = local437[local1143];
				local1366.anInt426 += local1231;
				local1366.anInt429++;
				local1366.anInt430 += local841;
				local1366.anInt428 += local805;
				@Pc(1394) Class20 local1394 = local437[local1148];
				local1394.anInt428 += local805;
				local1394.anInt429++;
				local1394.anInt426 += local1231;
				local1394.anInt430 += local841;
			} else if (local1329 == 1) {
				@Pc(1433) Class42 local1433 = local1129[local1131] = new Class42();
				local1433.anInt999 = local805;
				local1433.anInt994 = local841;
				local1433.anInt997 = local1231;
			}
		}
		@Pc(1455) int local1455;
		for (@Pc(1449) int local1449 = 0; local1449 < this.anInt4373; local1449++) {
			local1455 = local106[local1449];
			@Pc(1462) int local1462 = arg1.aShortArray51[local1455] & 0xFFFF;
			@Pc(1467) short local1467;
			if (arg1.aShortArray58 == null) {
				local1467 = -1;
			} else {
				local1467 = arg1.aShortArray58[local1455];
			}
			if (arg1.aByteArray47 == null) {
				local1170 = -1;
			} else {
				local1170 = arg1.aByteArray47[local1455];
			}
			if (arg1.aByteArray48 == null) {
				local751 = 0;
			} else {
				local751 = arg1.aByteArray48[local1455] & 0xFF;
			}
			@Pc(1502) float local1502 = 0.0F;
			@Pc(1504) float local1504 = 0.0F;
			@Pc(1506) float local1506 = 0.0F;
			local1004 = 0.0F;
			local1012 = 0.0F;
			local1020 = 0.0F;
			@Pc(1514) byte local1514 = 0;
			@Pc(1516) byte local1516 = 0;
			@Pc(1518) int local1518 = 0;
			@Pc(1552) byte local1552;
			@Pc(1572) short local1572;
			@Pc(1577) short local1577;
			@Pc(1582) short local1582;
			if (local1467 != -1) {
				if (local1170 == -1) {
					local1514 = 1;
					local1506 = 1.0F;
					local1504 = 1.0F;
					local1502 = 0.0F;
					local1012 = 0.0F;
					local1004 = 1.0F;
					local1516 = 2;
					local1020 = 0.0F;
				} else {
					local1170 &= 0xFF;
					local1552 = arg1.aByteArray45[local1170];
					@Pc(1562) short local1562;
					@Pc(1567) short local1567;
					@Pc(1605) float local1605;
					@Pc(1614) float local1614;
					@Pc(1622) float local1622;
					@Pc(1709) float local1709;
					@Pc(1717) float local1717;
					@Pc(1726) float local1726;
					@Pc(1734) float local1734;
					@Pc(1743) float local1743;
					@Pc(1751) float local1751;
					if (local1552 == 0) {
						local1562 = arg1.aShortArray52[local1455];
						local1567 = arg1.aShortArray55[local1455];
						local1572 = arg1.aShortArray60[local1455];
						local1577 = arg1.aShortArray56[local1170];
						local1582 = arg1.aShortArray57[local1170];
						@Pc(1587) short local1587 = arg1.aShortArray54[local1170];
						@Pc(1593) float local1593 = (float) arg1.anIntArray326[local1577];
						@Pc(1599) float local1599 = (float) arg1.anIntArray328[local1577];
						local1605 = arg1.anIntArray336[local1577];
						local1614 = (float) arg1.anIntArray326[local1582] - local1593;
						local1622 = (float) arg1.anIntArray328[local1582] - local1599;
						@Pc(1630) float local1630 = (float) arg1.anIntArray336[local1582] - local1605;
						@Pc(1639) float local1639 = (float) arg1.anIntArray326[local1587] - local1593;
						@Pc(1648) float local1648 = (float) arg1.anIntArray328[local1587] - local1599;
						@Pc(1657) float local1657 = (float) arg1.anIntArray336[local1587] - local1605;
						@Pc(1666) float local1666 = (float) arg1.anIntArray326[local1562] - local1593;
						@Pc(1674) float local1674 = (float) arg1.anIntArray328[local1562] - local1599;
						@Pc(1683) float local1683 = (float) arg1.anIntArray336[local1562] - local1605;
						@Pc(1692) float local1692 = (float) arg1.anIntArray326[local1567] - local1593;
						@Pc(1700) float local1700 = (float) arg1.anIntArray328[local1567] - local1599;
						local1709 = (float) arg1.anIntArray336[local1567] - local1605;
						local1717 = (float) arg1.anIntArray326[local1572] - local1593;
						local1726 = (float) arg1.anIntArray328[local1572] - local1599;
						local1734 = (float) arg1.anIntArray336[local1572] - local1605;
						local1743 = local1622 * local1657 - local1648 * local1630;
						local1751 = local1630 * local1639 - local1614 * local1657;
						@Pc(1759) float local1759 = local1614 * local1648 - local1639 * local1622;
						@Pc(1768) float local1768 = local1648 * local1759 - local1751 * local1657;
						@Pc(1776) float local1776 = local1657 * local1743 - local1759 * local1639;
						@Pc(1784) float local1784 = local1639 * local1751 - local1648 * local1743;
						@Pc(1798) float local1798 = 1.0F / (local1776 * local1622 + local1614 * local1768 + local1630 * local1784);
						local1506 = local1798 * (local1709 * local1784 + local1776 * local1700 + local1692 * local1768);
						local1502 = (local1768 * local1666 + local1674 * local1776 + local1683 * local1784) * local1798;
						local1012 = (local1734 * local1784 + local1768 * local1717 + local1776 * local1726) * local1798;
						@Pc(1849) float local1849 = local1614 * local1751 - local1622 * local1743;
						@Pc(1858) float local1858 = local1622 * local1759 - local1630 * local1751;
						@Pc(1867) float local1867 = local1630 * local1743 - local1614 * local1759;
						@Pc(1881) float local1881 = 1.0F / (local1858 * local1639 + local1867 * local1648 + local1657 * local1849);
						local1004 = (local1709 * local1849 + local1867 * local1700 + local1858 * local1692) * local1881;
						local1020 = (local1734 * local1849 + local1726 * local1867 + local1717 * local1858) * local1881;
						local1504 = (local1674 * local1867 + local1858 * local1666 + local1683 * local1849) * local1881;
					} else {
						local1562 = arg1.aShortArray52[local1455];
						local1567 = arg1.aShortArray55[local1455];
						local1572 = arg1.aShortArray60[local1455];
						@Pc(1944) int local1944 = local719[local1170];
						@Pc(1948) int local1948 = local721[local1170];
						@Pc(1952) int local1952 = local723[local1170];
						@Pc(1956) float[] local1956 = local725[local1170];
						@Pc(1961) byte local1961 = arg1.aByteArray50[local1170];
						local1605 = (float) arg1.anIntArray335[local1170] / 256.0F;
						if (local1552 == 1) {
							local1614 = (float) arg1.anIntArray333[local1170] / 1024.0F;
							Static358.method5359(arg1.anIntArray336[local1562], arg1.anIntArray328[local1562], local1961, local1944, local1614, local1948, arg1.anIntArray326[local1562], local1956, local1952, local1605);
							local1502 = Static142.aFloat62;
							local1504 = Static3.aFloat163;
							Static358.method5359(arg1.anIntArray336[local1567], arg1.anIntArray328[local1567], local1961, local1944, local1614, local1948, arg1.anIntArray326[local1567], local1956, local1952, local1605);
							local1506 = Static142.aFloat62;
							local1004 = Static3.aFloat163;
							Static358.method5359(arg1.anIntArray336[local1572], arg1.anIntArray328[local1572], local1961, local1944, local1614, local1948, arg1.anIntArray326[local1572], local1956, local1952, local1605);
							local1020 = Static3.aFloat163;
							local1012 = Static142.aFloat62;
							local1622 = local1614 / 2.0F;
							if ((local1961 & 0x1) == 0) {
								if (local1506 - local1502 > local1622) {
									local1514 = 1;
									local1506 -= local1614;
								} else if (local1502 - local1506 > local1622) {
									local1514 = 2;
									local1506 += local1614;
								}
								if (local1012 - local1502 > local1622) {
									local1516 = 1;
									local1012 -= local1614;
								} else if (local1622 < local1502 - local1012) {
									local1012 += local1614;
									local1516 = 2;
								}
							} else {
								if (local1622 < local1004 - local1504) {
									local1514 = 1;
									local1004 -= local1614;
								} else if (local1622 < local1504 - local1004) {
									local1004 += local1614;
									local1514 = 2;
								}
								if (local1622 < local1020 - local1504) {
									local1020 -= local1614;
									local1516 = 1;
								} else if (local1622 < local1504 - local1020) {
									local1516 = 2;
									local1020 += local1614;
								}
							}
						} else if (local1552 == 2) {
							local1614 = (float) arg1.anIntArray334[local1170] / 256.0F;
							local1622 = (float) arg1.anIntArray332[local1170] / 256.0F;
							@Pc(2400) int local2400 = arg1.anIntArray326[local1567] - arg1.anIntArray326[local1562];
							@Pc(2411) int local2411 = arg1.anIntArray328[local1567] - arg1.anIntArray328[local1562];
							@Pc(2422) int local2422 = arg1.anIntArray336[local1567] - arg1.anIntArray336[local1562];
							@Pc(2432) int local2432 = arg1.anIntArray326[local1572] - arg1.anIntArray326[local1562];
							@Pc(2443) int local2443 = arg1.anIntArray328[local1572] - arg1.anIntArray328[local1562];
							@Pc(2454) int local2454 = arg1.anIntArray336[local1572] - arg1.anIntArray336[local1562];
							@Pc(2462) int local2462 = local2454 * local2411 - local2443 * local2422;
							@Pc(2471) int local2471 = local2422 * local2432 - local2454 * local2400;
							@Pc(2480) int local2480 = local2443 * local2400 - local2432 * local2411;
							local1709 = 64.0F / (float) arg1.anIntArray331[local1170];
							local1717 = 64.0F / (float) arg1.anIntArray327[local1170];
							local1726 = 64.0F / (float) arg1.anIntArray333[local1170];
							local1734 = ((float) local2480 * local1956[2] + (float) local2471 * local1956[1] + local1956[0] * (float) local2462) / local1709;
							local1743 = ((float) local2471 * local1956[4] + (float) local2462 * local1956[3] + (float) local2480 * local1956[5]) / local1717;
							local1751 = (local1956[8] * (float) local2480 + local1956[7] * (float) local2471 + (float) local2462 * local1956[6]) / local1726;
							local1518 = Static444.method6284(local1734, local1743, local1751);
							Static340.method5218(local1944, local1518, local1605, local1952, local1956, local1961, arg1.anIntArray326[local1562], local1622, arg1.anIntArray328[local1562], local1948, local1614, arg1.anIntArray336[local1562]);
							local1502 = Static194.aFloat89;
							local1504 = Static565.aFloat207;
							Static340.method5218(local1944, local1518, local1605, local1952, local1956, local1961, arg1.anIntArray326[local1567], local1622, arg1.anIntArray328[local1567], local1948, local1614, arg1.anIntArray336[local1567]);
							local1506 = Static194.aFloat89;
							local1004 = Static565.aFloat207;
							Static340.method5218(local1944, local1518, local1605, local1952, local1956, local1961, arg1.anIntArray326[local1572], local1622, arg1.anIntArray328[local1572], local1948, local1614, arg1.anIntArray336[local1572]);
							local1012 = Static194.aFloat89;
							local1020 = Static565.aFloat207;
						} else if (local1552 == 3) {
							Static505.method6969(arg1.anIntArray336[local1562], local1605, local1944, local1956, local1952, arg1.anIntArray328[local1562], local1961, local1948, arg1.anIntArray326[local1562]);
							local1504 = Static385.aFloat161;
							local1502 = Static111.aFloat30;
							Static505.method6969(arg1.anIntArray336[local1567], local1605, local1944, local1956, local1952, arg1.anIntArray328[local1567], local1961, local1948, arg1.anIntArray326[local1567]);
							local1506 = Static111.aFloat30;
							local1004 = Static385.aFloat161;
							Static505.method6969(arg1.anIntArray336[local1572], local1605, local1944, local1956, local1952, arg1.anIntArray328[local1572], local1961, local1948, arg1.anIntArray326[local1572]);
							local1020 = Static385.aFloat161;
							local1012 = Static111.aFloat30;
							if ((local1961 & 0x1) == 0) {
								if (local1506 - local1502 > 0.5F) {
									local1514 = 1;
									local1506--;
								} else if (local1502 - local1506 > 0.5F) {
									local1514 = 2;
									local1506++;
								}
								if (local1012 - local1502 > 0.5F) {
									local1516 = 1;
									local1012--;
								} else if (local1502 - local1012 > 0.5F) {
									local1516 = 2;
									local1012++;
								}
							} else {
								if (local1020 - local1504 > 0.5F) {
									local1020--;
									local1516 = 1;
								} else if (local1504 - local1020 > 0.5F) {
									local1516 = 2;
									local1020++;
								}
								if (local1004 - local1504 > 0.5F) {
									local1514 = 1;
									local1004--;
								} else if (local1504 - local1004 > 0.5F) {
									local1004++;
									local1514 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray46 == null) {
				local1552 = 0;
			} else {
				local1552 = arg1.aByteArray46[local1455];
			}
			if (local1552 == 0) {
				@Pc(2698) long local2698 = ((long) local751 + (long) (local1518 << 24) + (long) (local1462 << 8) << 32) + (long) (local1170 << 2);
				local1572 = arg1.aShortArray52[local1455];
				local1577 = arg1.aShortArray55[local1455];
				local1582 = arg1.aShortArray60[local1455];
				@Pc(2717) Class20 local2717 = local437[local1572];
				this.aShortArray70[local1449] = this.method3724(local1504, local2717.anInt430, local2717.anInt429, local2698, local2717.anInt426, local1502, local1572, local2717.anInt428, arg1);
				@Pc(2741) Class20 local2741 = local437[local1577];
				this.aShortArray74[local1449] = this.method3724(local1004, local2741.anInt430, local2741.anInt429, (long) local1514 + local2698, local2741.anInt426, local1506, local1577, local2741.anInt428, arg1);
				@Pc(2768) Class20 local2768 = local437[local1582];
				this.aShortArray73[local1449] = this.method3724(local1020, local2768.anInt430, local2768.anInt429, local2698 + (long) local1516, local2768.anInt426, local1012, local1582, local2768.anInt428, arg1);
			} else if (local1552 == 1) {
				@Pc(2802) Class42 local2802 = local1129[local1455];
				@Pc(2847) long local2847 = ((long) (local1462 << 8) + (long) (local1518 << 24) + (long) local751 << 32) + (long) ((local2802.anInt994 + 256 << 22) + (local1170 << 2) + (local2802.anInt999 <= 0 ? 2048 : 1024) + (local2802.anInt997 + 256 << 12));
				this.aShortArray70[local1449] = this.method3724(local1504, local2802.anInt994, 0, local2847, local2802.anInt997, local1502, arg1.aShortArray52[local1455], local2802.anInt999, arg1);
				this.aShortArray74[local1449] = this.method3724(local1004, local2802.anInt994, 0, (long) local1514 + local2847, local2802.anInt997, local1506, arg1.aShortArray55[local1455], local2802.anInt999, arg1);
				this.aShortArray73[local1449] = this.method3724(local1020, local2802.anInt994, 0, (long) local1516 + local2847, local2802.anInt997, local1012, arg1.aShortArray60[local1455], local2802.anInt999, arg1);
			}
			if (arg1.aShortArray58 == null) {
				this.aShortArray67[local1449] = -1;
			} else {
				this.aShortArray67[local1449] = arg1.aShortArray58[local1455];
			}
			if (arg1.aByteArray48 != null) {
				this.aByteArray57[local1449] = arg1.aByteArray48[local1455];
			}
			if (arg1.aShortArray59 != null) {
				this.aShortArray66[local1449] = arg1.aShortArray59[local1455];
			}
			this.aShortArray65[local1449] = arg1.aShortArray51[local1455];
		}
		local1455 = 0;
		local1148 = -10000;
		for (local1159 = 0; local1159 < this.anInt4354; local1159++) {
			@Pc(2985) short local2985 = this.aShortArray67[local1159];
			if (local1148 != local2985) {
				local1455++;
				local1148 = local2985;
			}
		}
		this.anIntArray358 = new int[local1455 + 1];
		local1148 = -10000;
		local1455 = 0;
		for (local1170 = 0; local1170 < this.anInt4354; local1170++) {
			@Pc(3019) short local3019 = this.aShortArray67[local1170];
			if (local3019 != local1148) {
				local1148 = local3019;
				this.anIntArray358[local1455++] = local1170;
			}
		}
		this.anIntArray358[local1455] = this.anInt4354;
		Static476.aLongArray20 = null;
		this.aShortArray69 = Static404.method5838(this.anInt4331, this.aShortArray69);
		this.aShortArray68 = Static404.method5838(this.anInt4331, this.aShortArray68);
		this.aShortArray75 = Static404.method5838(this.anInt4331, this.aShortArray75);
		this.aByteArray58 = Static332.method5109(this.aByteArray58, this.anInt4331);
		this.aFloatArray30 = Static515.method7056(this.aFloatArray30, this.anInt4331);
		this.aFloatArray31 = Static515.method7056(this.aFloatArray31, this.anInt4331);
		if (arg1.anIntArray329 != null && Static465.method6497(this.anInt4368, arg2)) {
			this.anIntArrayArray38 = arg1.method3349(false);
		}
		if (arg1.aClass143Array1 != null && Static212.method7946(this.anInt4368, arg2)) {
			this.anIntArrayArray39 = arg1.method3350();
		}
		if (arg1.anIntArray330 != null && Static408.method5879(this.anInt4368, arg2)) {
			local751 = 0;
			@Pc(3134) int[] local3134 = new int[256];
			for (local789 = 0; local789 < this.anInt4373; local789++) {
				local803 = arg1.anIntArray330[local106[local789]];
				if (local803 >= 0) {
					@Pc(3151) int local3151 = local3134[local803]++;
					if (local751 < local803) {
						local751 = local803;
					}
				}
			}
			this.anIntArrayArray40 = new int[local751 + 1][];
			for (local803 = 0; local803 <= local751; local803++) {
				this.anIntArrayArray40[local803] = new int[local3134[local803]];
				local3134[local803] = 0;
			}
			for (local805 = 0; local805 < this.anInt4373; local805++) {
				local1231 = arg1.anIntArray330[local106[local805]];
				if (local1231 >= 0) {
					this.anIntArrayArray40[local1231][local3134[local1231]++] = local805;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
	@Override
	public void method7401() {
		if (this.anInt4331 <= 0 || this.anInt4354 <= 0) {
			return;
		}
		this.method3716(false);
		if ((this.aByte52 & 0x10) == 0 && this.aClass273_1.anInterface15_5 == null) {
			this.method3717(false);
		}
		this.method3719();
	}

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4371; local15++) {
			@Pc(33) int local33 = this.anIntArray361[local15] * local13 + this.anIntArray363[local15] * local9 >> 14;
			this.anIntArray363[local15] = local13 * this.anIntArray363[local15] - local9 * this.anIntArray361[local15] >> 14;
			this.anIntArray361[local15] = local33;
		}
		this.aBoolean322 = false;
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort64;
	}

	@OriginalMember(owner = "client!jc", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort64 = (short) arg0;
		if (this.aClass166_6 != null) {
			this.aClass166_6.anInterface14_4 = null;
		}
		if (this.aClass166_3 != null) {
			this.aClass166_3.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7388(@OriginalArg(0) Class93 arg0) {
		@Pc(8) Class93_Sub2 local8 = (Class93_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass33Array5 != null) {
			for (local13 = 0; local13 < this.aClass33Array5.length; local13++) {
				@Pc(20) Class33 local20 = this.aClass33Array5[local13];
				@Pc(22) Class33 local22 = local20;
				if (local20.aClass33_1 != null) {
					local22 = local20.aClass33_1;
				}
				local22.anInt769 = (int) ((float) this.anIntArray360[local20.anInt768] * local8.aFloat102 + (float) this.anIntArray363[local20.anInt768] * local8.aFloat95 + local8.aFloat98 * (float) this.anIntArray361[local20.anInt768] + local8.aFloat96);
				local22.anInt782 = (int) (local8.aFloat104 + local8.aFloat97 * (float) this.anIntArray360[local20.anInt768] + local8.aFloat99 * (float) this.anIntArray361[local20.anInt768] + (float) this.anIntArray363[local20.anInt768] * local8.aFloat101);
				local22.anInt780 = (int) (local8.aFloat100 + local8.aFloat103 * (float) this.anIntArray363[local20.anInt768] + (float) this.anIntArray361[local20.anInt768] * local8.aFloat94 + (float) this.anIntArray360[local20.anInt768] * local8.aFloat105);
				local22.anInt770 = (int) ((float) this.anIntArray360[local20.anInt775] * local8.aFloat102 + local8.aFloat95 * (float) this.anIntArray363[local20.anInt775] + local8.aFloat98 * (float) this.anIntArray361[local20.anInt775] + local8.aFloat96);
				local22.anInt776 = (int) (local8.aFloat104 + local8.aFloat101 * (float) this.anIntArray363[local20.anInt775] + (float) this.anIntArray361[local20.anInt775] * local8.aFloat99 + local8.aFloat97 * (float) this.anIntArray360[local20.anInt775]);
				local22.anInt777 = (int) (local8.aFloat105 * (float) this.anIntArray360[local20.anInt775] + (float) this.anIntArray363[local20.anInt775] * local8.aFloat103 + local8.aFloat94 * (float) this.anIntArray361[local20.anInt775] + local8.aFloat100);
				local22.anInt771 = (int) (local8.aFloat96 + (float) this.anIntArray363[local20.anInt774] * local8.aFloat95 + local8.aFloat98 * (float) this.anIntArray361[local20.anInt774] + local8.aFloat102 * (float) this.anIntArray360[local20.anInt774]);
				local22.anInt773 = (int) (local8.aFloat104 + local8.aFloat97 * (float) this.anIntArray360[local20.anInt774] + local8.aFloat99 * (float) this.anIntArray361[local20.anInt774] + (float) this.anIntArray363[local20.anInt774] * local8.aFloat101);
				local22.anInt778 = (int) (local8.aFloat105 * (float) this.anIntArray360[local20.anInt774] + local8.aFloat94 * (float) this.anIntArray361[local20.anInt774] + local8.aFloat103 * (float) this.anIntArray363[local20.anInt774] + local8.aFloat100);
			}
		}
		if (this.aClass335Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass335Array5.length; local13++) {
			@Pc(361) Class335 local361 = this.aClass335Array5[local13];
			@Pc(363) Class335 local363 = local361;
			if (local361.aClass335_2 != null) {
				local363 = local361.aClass335_2;
			}
			if (local361.aClass93_9 == null) {
				local361.aClass93_9 = local8.method7795();
			} else {
				local361.aClass93_9.la(local8);
			}
			local363.anInt9658 = (int) ((float) this.anIntArray360[local361.anInt9662] * local8.aFloat102 + local8.aFloat98 * (float) this.anIntArray361[local361.anInt9662] + (float) this.anIntArray363[local361.anInt9662] * local8.aFloat95 + local8.aFloat96);
			local363.anInt9655 = (int) ((float) this.anIntArray360[local361.anInt9662] * local8.aFloat97 + (float) this.anIntArray361[local361.anInt9662] * local8.aFloat99 + (float) this.anIntArray363[local361.anInt9662] * local8.aFloat101 + local8.aFloat104);
			local363.anInt9657 = (int) (local8.aFloat105 * (float) this.anIntArray360[local361.anInt9662] + (float) this.anIntArray363[local361.anInt9662] * local8.aFloat103 + (float) this.anIntArray361[local361.anInt9662] * local8.aFloat94 + local8.aFloat100);
		}
	}

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort69 = (short) arg0;
		if (this.aClass166_6 != null) {
			this.aClass166_6.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4373; local7++) {
			if (arg0 == this.aShortArray65[local7]) {
				this.aShortArray65[local7] = arg1;
			}
		}
		if (this.aClass92Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt4329; local34++) {
				@Pc(41) Class92 local41 = this.aClass92Array1[local34];
				@Pc(46) Class292 local46 = this.aClass292Array1[local34];
				local46.anInt8317 = Static36.anIntArray31[this.aShortArray65[local41.anInt2507] & 0xFFFF] & 0xFFFFFF | local46.anInt8317 & 0xFF000000;
			}
		}
		if (this.aClass166_6 != null) {
			this.aClass166_6.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class93_Sub2 local8 = (Class93_Sub2) arg2;
		@Pc(12) Class93_Sub2 local12 = this.aClass90_Sub1_20.aClass93_Sub2_4;
		@Pc(33) float local33 = local8.aFloat100 * local12.aFloat102 + local8.aFloat104 * local12.aFloat95 + local8.aFloat96 * local12.aFloat98 + local12.aFloat96;
		@Pc(54) float local54 = local12.aFloat97 * local8.aFloat100 + local12.aFloat99 * local8.aFloat96 + local12.aFloat101 * local8.aFloat104 + local12.aFloat104;
		Static578.aFloat211 = local12.aFloat97 * local8.aFloat94 + local12.aFloat99 * local8.aFloat98 + local12.aFloat101 * local8.aFloat99;
		Static175.aFloat67 = local8.aFloat95 * local12.aFloat98 + local8.aFloat101 * local12.aFloat95 + local12.aFloat102 * local8.aFloat103;
		Static154.aFloat65 = local12.aFloat98 * local8.aFloat102 + local12.aFloat95 * local8.aFloat97 + local8.aFloat105 * local12.aFloat102;
		Static205.aFloat92 = local8.aFloat105 * local12.aFloat97 + local8.aFloat97 * local12.aFloat101 + local8.aFloat102 * local12.aFloat99;
		Static487.aFloat178 = local12.aFloat101 * local8.aFloat101 + local12.aFloat99 * local8.aFloat95 + local8.aFloat103 * local12.aFloat97;
		Static486.aFloat177 = local8.aFloat94 * local12.aFloat102 + local12.aFloat95 * local8.aFloat99 + local8.aFloat98 * local12.aFloat98;
		Static545.aFloat187 = local8.aFloat97 * local12.aFloat103 + local8.aFloat102 * local12.aFloat94 + local8.aFloat105 * local12.aFloat105;
		Static430.aFloat166 = local12.aFloat105 * local8.aFloat103 + local8.aFloat101 * local12.aFloat103 + local8.aFloat95 * local12.aFloat94;
		Static439.aFloat167 = local8.aFloat99 * local12.aFloat103 + local8.aFloat98 * local12.aFloat94 + local12.aFloat105 * local8.aFloat94;
		@Pc(237) float local237 = local12.aFloat94 * local8.aFloat96 + local8.aFloat104 * local12.aFloat103 + local12.aFloat105 * local8.aFloat100 + local12.aFloat100;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass90_Sub1_20.anInt2465;
		@Pc(255) int local255 = this.aClass90_Sub1_20.anInt2470;
		if (!this.aBoolean322) {
			this.method3721();
		}
		Static156.anIntArray284[0] = this.aShort62;
		Static383.anIntArray496[0] = this.aShort65;
		Static444.anIntArray563[0] = this.aShort66;
		Static156.anIntArray284[1] = this.aShort68;
		Static383.anIntArray496[1] = this.aShort65;
		Static444.anIntArray563[1] = this.aShort66;
		Static156.anIntArray284[2] = this.aShort62;
		Static383.anIntArray496[2] = this.aShort63;
		Static444.anIntArray563[2] = this.aShort66;
		Static156.anIntArray284[3] = this.aShort68;
		Static383.anIntArray496[3] = this.aShort63;
		Static156.anIntArray284[4] = this.aShort62;
		Static444.anIntArray563[3] = this.aShort66;
		Static383.anIntArray496[4] = this.aShort65;
		Static444.anIntArray563[4] = this.aShort67;
		Static156.anIntArray284[5] = this.aShort68;
		Static383.anIntArray496[5] = this.aShort65;
		Static156.anIntArray284[6] = this.aShort62;
		Static444.anIntArray563[5] = this.aShort67;
		Static383.anIntArray496[6] = this.aShort63;
		Static444.anIntArray563[6] = this.aShort67;
		Static156.anIntArray284[7] = this.aShort68;
		Static383.anIntArray496[7] = this.aShort63;
		Static444.anIntArray563[7] = this.aShort67;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static444.anIntArray563[local383];
			local395 = Static383.anIntArray496[local383];
			local400 = Static156.anIntArray284[local383];
			local414 = Static545.aFloat187 * local390 + local395 * Static430.aFloat166 + Static439.aFloat167 * local400 + local237;
			local428 = local54 + local390 * Static205.aFloat92 + local400 * Static578.aFloat211 + local395 * Static487.aFloat178;
			local442 = local33 + Static486.aFloat177 * local400 + Static175.aFloat67 * local395 + local390 * Static154.aFloat65;
			if (local414 >= (float) this.aClass90_Sub1_20.anInt2477) {
				@Pc(461) float local461 = (float) this.aClass90_Sub1_20.anInt2473 + (float) local251 * local442 / local414;
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass90_Sub1_20.anInt2448 + (float) local255 * local428 / local414;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local247 < local479) {
					local247 = local479;
				}
				local239 = true;
				if (local479 < local245) {
					local245 = local479;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt4331 > this.aClass90_Sub1_20.anIntArray190.length) {
				this.aClass90_Sub1_20.anIntArray188 = new int[this.anInt4331];
				this.aClass90_Sub1_20.anIntArray190 = new int[this.anInt4331];
			}
			@Pc(558) int[] local558 = this.aClass90_Sub1_20.anIntArray190;
			@Pc(562) int[] local562 = this.aClass90_Sub1_20.anIntArray188;
			@Pc(646) int local646;
			for (@Pc(564) int local564 = 0; local564 < this.anInt4371; local564++) {
				local400 = this.anIntArray361[local564];
				local390 = this.anIntArray360[local564];
				local395 = this.anIntArray363[local564];
				local428 = local54 + local390 * Static205.aFloat92 + local395 * Static487.aFloat178 + local400 * Static578.aFloat211;
				local442 = local33 + Static486.aFloat177 * local400 + Static175.aFloat67 * local395 + local390 * Static154.aFloat65;
				local414 = local237 + Static439.aFloat167 * local400 + local395 * Static430.aFloat166 + Static545.aFloat187 * local390;
				@Pc(659) int local659;
				@Pc(664) int local664;
				@Pc(671) int local671;
				if (local414 >= (float) this.aClass90_Sub1_20.anInt2477) {
					local646 = (int) ((float) this.aClass90_Sub1_20.anInt2473 + (float) local251 * local442 / local414);
					local659 = (int) ((float) this.aClass90_Sub1_20.anInt2448 + local428 * (float) local255 / local414);
					local664 = this.anIntArray359[local564];
					local671 = this.anIntArray359[local564 + 1];
					for (@Pc(673) int local673 = local664; local673 < local671; local673++) {
						@Pc(682) int local682 = this.aShortArray71[local673] - 1;
						if (local682 == -1) {
							break;
						}
						local558[local682] = local646;
						local562[local682] = local659;
					}
				} else {
					local646 = this.anIntArray359[local564];
					local659 = this.anIntArray359[local564 + 1];
					for (local664 = local646; local664 < local659; local664++) {
						local671 = this.aShortArray71[local664] - 1;
						if (local671 == -1) {
							break;
						}
						local558[this.aShortArray71[local664] - 1] = -999999;
					}
				}
			}
			for (local646 = 0; local646 < this.anInt4373; local646++) {
				if (local558[this.aShortArray70[local646]] != -999999 && local558[this.aShortArray74[local646]] != -999999 && local558[this.aShortArray73[local646]] != -999999 && this.method3725(local562[this.aShortArray70[local646]], local558[this.aShortArray70[local646]], local558[this.aShortArray74[local646]], local562[this.aShortArray73[local646]], local558[this.aShortArray73[local646]], arg0, local562[this.aShortArray74[local646]], arg1)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZZ)V")
	private void method3716(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass166_6 != null && this.aClass166_6.anInterface14_4 == null;
		@Pc(27) boolean local27 = this.aClass166_3 != null && this.aClass166_3.anInterface14_4 == null;
		@Pc(38) boolean local38 = this.aClass166_5 != null && this.aClass166_5.anInterface14_4 == null;
		@Pc(49) boolean local49 = this.aClass166_4 != null && this.aClass166_4.anInterface14_4 == null;
		if (arg0) {
			local27 &= (this.aByte52 & 0x4) != 0;
			local38 &= (this.aByte52 & 0x1) != 0;
			local49 &= (this.aByte52 & 0x8) != 0;
			local16 &= (this.aByte52 & 0x2) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(129) byte local129 = 0;
		if (local16) {
			local116 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local118 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local129 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1.aByteArray97.length >= this.anInt4331 * local106) {
			this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1.anInt7556 = 0;
		} else {
			this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1 = new Class6_Sub12_Sub1(local106 * (this.anInt4331 + 100));
		}
		@Pc(192) Class6_Sub12_Sub1 local192 = this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1;
		@Pc(200) int local200;
		@Pc(209) int local209;
		@Pc(237) int local237;
		@Pc(246) int local246;
		if (local38) {
			@Pc(216) int local216;
			@Pc(223) int local223;
			@Pc(228) int local228;
			@Pc(235) int local235;
			if (this.aClass90_Sub1_20.aBoolean176) {
				for (local200 = 0; local200 < this.anInt4371; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray361[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray363[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray360[local200]);
					local228 = this.anIntArray359[local200];
					local235 = this.anIntArray359[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray71[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt7556 = local106 * local246;
						local192.method6042(local209);
						local192.method6042(local216);
						local192.method6042(local223);
					}
				}
			} else {
				for (local200 = 0; local200 < this.anInt4371; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray361[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray363[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray360[local200]);
					local228 = this.anIntArray359[local200];
					local235 = this.anIntArray359[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray71[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt7556 = local106 * local246;
						local192.method6046(local209);
						local192.method6046(local216);
						local192.method6046(local223);
					}
				}
			}
		}
		@Pc(572) float local572;
		@Pc(457) short[] local457;
		@Pc(463) short[] local463;
		@Pc(454) short[] local454;
		@Pc(460) byte[] local460;
		@Pc(611) float local611;
		if (local16) {
			if (this.aClass166_3 == null) {
				if (this.aClass49_1 == null) {
					local454 = this.aShortArray75;
					local457 = this.aShortArray68;
					local460 = this.aByteArray58;
					local463 = this.aShortArray69;
				} else {
					local454 = this.aClass49_1.aShortArray11;
					local457 = this.aClass49_1.aShortArray9;
					local463 = this.aClass49_1.aShortArray10;
					local460 = this.aClass49_1.aByteArray4;
				}
				@Pc(487) float local487 = this.aClass90_Sub1_20.aFloatArray16[0];
				@Pc(493) float local493 = this.aClass90_Sub1_20.aFloatArray16[1];
				@Pc(499) float local499 = this.aClass90_Sub1_20.aFloatArray16[2];
				@Pc(503) float local503 = this.aClass90_Sub1_20.aFloat49;
				@Pc(513) float local513 = this.aClass90_Sub1_20.aFloat48 * 768.0F / (float) this.aShort64;
				@Pc(523) float local523 = this.aClass90_Sub1_20.aFloat40 * 768.0F / (float) this.aShort64;
				for (@Pc(525) int local525 = 0; local525 < this.anInt4373; local525++) {
					@Pc(545) int local545 = this.method3720(this.aShortArray65[local525], this.aShort69, this.aByteArray57[local525], this.aShortArray67[local525]);
					@Pc(550) short local550 = this.aShortArray70[local525];
					@Pc(561) float local561 = this.aClass90_Sub1_20.aFloat44 * (float) (local545 >> 8 & 0xFF);
					local572 = this.aClass90_Sub1_20.aFloat41 * (float) (local545 >> 16 & 0xFF);
					@Pc(581) float local581 = this.aClass90_Sub1_20.aFloat52 * (float) (local545 >>> 24);
					@Pc(586) short local586 = (short) local460[local550];
					if (local586 == 0) {
						local611 = ((float) local457[local550] * local493 + local487 * (float) local463[local550] + local499 * (float) local454[local550]) * 0.0026041667F;
					} else {
						local611 = (local499 * (float) local454[local550] + (float) local463[local550] * local487 + local493 * (float) local457[local550]) / (float) (local586 * 256);
					}
					@Pc(651) float local651 = local611 * (local611 < 0.0F ? local523 : local513) + local503;
					@Pc(656) int local656 = (int) (local581 * local651);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					@Pc(674) int local674 = (int) (local651 * local572);
					@Pc(679) int local679 = (int) (local561 * local651);
					if (local674 < 0) {
						local674 = 0;
					} else if (local674 > 255) {
						local674 = 255;
					}
					local192.anInt7556 = local116 + local550 * local106;
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local192.method6047(local656);
					local192.method6047(local674);
					local192.method6047(local679);
					local192.method6047(255 - (this.aByteArray57[local525] & 0xFF));
					local550 = this.aShortArray74[local525];
					local586 = local460[local550];
					if (local586 == 0) {
						local611 = ((float) local463[local550] * local487 + local493 * (float) local457[local550] + (float) local454[local550] * local499) * 0.0026041667F;
					} else {
						local611 = ((float) local457[local550] * local493 + local487 * (float) local463[local550] + (float) local454[local550] * local499) / (float) (local586 * 256);
					}
					local651 = local503 + local611 * (local611 < 0.0F ? local523 : local513);
					local656 = (int) (local651 * local581);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					local674 = (int) (local651 * local572);
					if (local674 < 0) {
						local674 = 0;
					} else if (local674 > 255) {
						local674 = 255;
					}
					local679 = (int) (local651 * local561);
					local192.anInt7556 = local116 + local550 * local106;
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local192.method6047(local656);
					local192.method6047(local674);
					local192.method6047(local679);
					local192.method6047(255 - (this.aByteArray57[local525] & 0xFF));
					local550 = this.aShortArray73[local525];
					local586 = local460[local550];
					if (local586 == 0) {
						local611 = ((float) local463[local550] * local487 + (float) local457[local550] * local493 + (float) local454[local550] * local499) * 0.0026041667F;
					} else {
						local611 = (local499 * (float) local454[local550] + (float) local457[local550] * local493 + (float) local463[local550] * local487) / (float) (local586 * 256);
					}
					local651 = local503 + local611 * (local611 < 0.0F ? local523 : local513);
					local656 = (int) (local581 * local651);
					local674 = (int) (local572 * local651);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					if (local674 < 0) {
						local674 = 0;
					} else if (local674 > 255) {
						local674 = 255;
					}
					local679 = (int) (local651 * local561);
					local192.anInt7556 = local106 * local550 + local116;
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local192.method6047(local656);
					local192.method6047(local674);
					local192.method6047(local679);
					local192.method6047(255 - (this.aByteArray57[local525] & 0xFF));
				}
			} else {
				for (local200 = 0; local200 < this.anInt4373; local200++) {
					local209 = this.method3720(this.aShortArray65[local200], this.aShort69, this.aByteArray57[local200], this.aShortArray67[local200]);
					local192.anInt7556 = local106 * this.aShortArray70[local200] + local116;
					local192.method6042(local209);
					local192.anInt7556 = local116 + local106 * this.aShortArray74[local200];
					local192.method6042(local209);
					local192.anInt7556 = this.aShortArray73[local200] * local106 + local116;
					local192.method6042(local209);
				}
			}
		}
		if (local27) {
			if (this.aClass49_1 == null) {
				local460 = this.aByteArray58;
				local457 = this.aShortArray68;
				local454 = this.aShortArray75;
				local463 = this.aShortArray69;
			} else {
				local457 = this.aClass49_1.aShortArray9;
				local463 = this.aClass49_1.aShortArray10;
				local460 = this.aClass49_1.aByteArray4;
				local454 = this.aClass49_1.aShortArray11;
			}
			@Pc(1117) float local1117 = 3.0F / (float) this.aShort64;
			local611 = 3.0F / (float) (this.aShort64 + this.aShort64 / 2);
			local192.anInt7556 = local118;
			if (this.aClass90_Sub1_20.aBoolean176) {
				for (local237 = 0; local237 < this.anInt4331; local237++) {
					local246 = local460[local237] & 0xFF;
					if (local246 == 0) {
						local192.method1604((float) local463[local237] * local611);
						local192.method1604((float) local457[local237] * local611);
						local192.method1604((float) local454[local237] * local611);
					} else {
						local572 = local1117 / (float) local246;
						local192.method1604((float) local463[local237] * local572);
						local192.method1604(local572 * (float) local457[local237]);
						local192.method1604((float) local454[local237] * local572);
					}
					local192.anInt7556 += local106 - 12;
				}
			} else {
				for (local237 = 0; local237 < this.anInt4331; local237++) {
					local246 = local460[local237] & 0xFF;
					if (local246 == 0) {
						local192.method1602(local611 * (float) local463[local237]);
						local192.method1602(local611 * (float) local457[local237]);
						local192.method1602(local611 * (float) local454[local237]);
					} else {
						local572 = local1117 / (float) local246;
						local192.method1602(local572 * (float) local463[local237]);
						local192.method1602(local572 * (float) local457[local237]);
						local192.method1602((float) local454[local237] * local572);
					}
					local192.anInt7556 += local106 - 12;
				}
			}
		}
		if (local49) {
			local192.anInt7556 = local129;
			if (this.aClass90_Sub1_20.aBoolean176) {
				for (local200 = 0; local200 < this.anInt4331; local200++) {
					local192.method1604(this.aFloatArray30[local200]);
					local192.method1604(this.aFloatArray31[local200]);
					local192.anInt7556 += local106 - 8;
				}
			} else {
				for (local200 = 0; local200 < this.anInt4331; local200++) {
					local192.method1602(this.aFloatArray30[local200]);
					local192.method1602(this.aFloatArray31[local200]);
					local192.anInt7556 += local106 - 8;
				}
			}
		}
		local192.anInt7556 = local106 * this.anInt4331;
		@Pc(1409) Interface14 local1409;
		if (arg0) {
			if (this.anInterface14_3 == null) {
				this.anInterface14_3 = this.aClass90_Sub1_20.method2108(local192.aByteArray97, true, local106, local192.anInt7556);
			} else {
				this.anInterface14_3.method7306(local106, local192.aByteArray97, local192.anInt7556);
			}
			this.aByte52 = 0;
			local1409 = this.anInterface14_3;
		} else {
			local1409 = this.aClass90_Sub1_20.method2108(local192.aByteArray97, false, local106, local192.anInt7556);
			this.aBoolean321 = true;
		}
		if (local38) {
			this.aClass166_5.aByte54 = 0;
			this.aClass166_5.anInterface14_4 = local1409;
		}
		if (local49) {
			this.aClass166_4.aByte54 = local129;
			this.aClass166_4.anInterface14_4 = local1409;
		}
		if (local16) {
			this.aClass166_6.anInterface14_4 = local1409;
			this.aClass166_6.aByte54 = local116;
		}
		if (local27) {
			this.aClass166_3.aByte54 = local118;
			this.aClass166_3.anInterface14_4 = local1409;
		}
	}

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub5_Sub10 Z(@OriginalArg(0) Class6_Sub5_Sub10 arg0) {
		if (this.anInt4331 == 0) {
			return null;
		}
		if (!this.aBoolean322) {
			this.method3721();
		}
		@Pc(42) int local42;
		@Pc(59) int local59;
		if (this.aClass90_Sub1_20.anInt2478 <= 0) {
			local42 = this.aShort62 - (this.aClass90_Sub1_20.anInt2478 * this.aShort65 >> 8) >> this.aClass90_Sub1_20.anInt2433;
			local59 = this.aShort68 - (this.aShort63 * this.aClass90_Sub1_20.anInt2478 >> 8) >> this.aClass90_Sub1_20.anInt2433;
		} else {
			local42 = this.aShort62 - (this.aShort63 * this.aClass90_Sub1_20.anInt2478 >> 8) >> this.aClass90_Sub1_20.anInt2433;
			local59 = this.aShort68 - (this.aShort65 * this.aClass90_Sub1_20.anInt2478 >> 8) >> this.aClass90_Sub1_20.anInt2433;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass90_Sub1_20.anInt2444 <= 0) {
			local119 = this.aShort66 - (this.aClass90_Sub1_20.anInt2444 * this.aShort65 >> 8) >> this.aClass90_Sub1_20.anInt2433;
			local136 = this.aShort67 - (this.aClass90_Sub1_20.anInt2444 * this.aShort63 >> 8) >> this.aClass90_Sub1_20.anInt2433;
		} else {
			local119 = this.aShort66 - (this.aClass90_Sub1_20.anInt2444 * this.aShort63 >> 8) >> this.aClass90_Sub1_20.anInt2433;
			local136 = this.aShort67 - (this.aClass90_Sub1_20.anInt2444 * this.aShort65 >> 8) >> this.aClass90_Sub1_20.anInt2433;
		}
		@Pc(179) int local179 = local59 + 1 - local42;
		@Pc(186) int local186 = local136 + 1 - local119;
		@Pc(189) Class6_Sub5_Sub10_Sub2 local189 = (Class6_Sub5_Sub10_Sub2) arg0;
		@Pc(199) Class6_Sub5_Sub10_Sub2 local199;
		if (local189 != null && local189.method5064(local186, local179)) {
			local199 = local189;
			local189.method5061();
		} else {
			local199 = new Class6_Sub5_Sub10_Sub2(this.aClass90_Sub1_20, local179, local186);
		}
		local199.method5065(local59, local136, local42, local119);
		this.method3730(local199);
		return local199;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "()[Lclient!vp;")
	@Override
	public Class335[] method7402() {
		return this.aClass335Array5;
	}

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean322) {
			this.method3721();
		}
		return this.aShort68;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	private void method3717(@OriginalArg(0) boolean arg0) {
		if (this.anInt4354 * 6 > this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1.aByteArray97.length) {
			this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1 = new Class6_Sub12_Sub1((this.anInt4354 + 100) * 6);
		} else {
			this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1.anInt7556 = 0;
		}
		@Pc(38) Class6_Sub12_Sub1 local38 = this.aClass90_Sub1_20.aClass6_Sub12_Sub1_1;
		@Pc(44) int local44;
		if (this.aClass90_Sub1_20.aBoolean176) {
			for (local44 = 0; local44 < this.anInt4354; local44++) {
				local38.method6032(this.aShortArray70[local44]);
				local38.method6032(this.aShortArray74[local44]);
				local38.method6032(this.aShortArray73[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt4354; local44++) {
				local38.method6021(this.aShortArray70[local44]);
				local38.method6021(this.aShortArray74[local44]);
				local38.method6021(this.aShortArray73[local44]);
			}
		}
		if (local38.anInt7556 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface15_3 == null) {
				this.anInterface15_3 = this.aClass90_Sub1_20.method2065(local38.aByteArray97, local38.anInt7556, true);
			} else {
				this.anInterface15_3.method3357(local38.anInt7556, local38.aByteArray97);
			}
			this.aClass273_1.anInterface15_5 = this.anInterface15_3;
		} else {
			this.aClass273_1.anInterface15_5 = this.aClass90_Sub1_20.method2065(local38.aByteArray97, local38.anInt7556, false);
		}
		if (!arg0) {
			this.aBoolean321 = true;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	private void method3718() {
		if (this.aClass92Array1 == null) {
			return;
		}
		@Pc(8) Class93_Sub2 local8 = this.aClass90_Sub1_20.aClass93_Sub2_2;
		@Pc(12) float local12 = this.aClass90_Sub1_20.method2124();
		@Pc(16) float local16 = this.aClass90_Sub1_20.method2140();
		this.aClass90_Sub1_20.method2092();
		this.aClass90_Sub1_20.method7500(false);
		this.aClass90_Sub1_20.method2099(false);
		this.aClass90_Sub1_20.method2066(this.aClass90_Sub1_20.aClass166_2, this.aClass90_Sub1_20.aClass166_1, null, null);
		for (@Pc(43) int local43 = 0; local43 < this.anInt4329; local43++) {
			@Pc(50) Class92 local50 = this.aClass92Array1[local43];
			@Pc(55) Class292 local55 = this.aClass292Array1[local43];
			if (!local50.aBoolean179 || !this.aClass90_Sub1_20.method7496()) {
				@Pc(84) float local84 = (float) (this.anIntArray361[local50.anInt2506] + this.anIntArray361[local50.anInt2505] + this.anIntArray361[local50.anInt2508]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray363[local50.anInt2508] + this.anIntArray363[local50.anInt2505] + this.anIntArray363[local50.anInt2506]) * 0.3333333F;
				@Pc(126) float local126 = (float) (this.anIntArray360[local50.anInt2508] + this.anIntArray360[local50.anInt2505] + this.anIntArray360[local50.anInt2506]) * 0.3333333F;
				@Pc(140) float local140 = Static217.aFloat93 + local105 * Static175.aFloat67 + Static486.aFloat177 * local84 + Static154.aFloat65 * local126;
				@Pc(154) float local154 = Static373.aFloat158 + local105 * Static487.aFloat178 + Static578.aFloat211 * local84 + local126 * Static205.aFloat92;
				@Pc(168) float local168 = Static545.aFloat187 * local126 + local84 * Static439.aFloat167 + Static430.aFloat166 * local105 + Static2.aFloat1;
				local8.method3564((float) local55.anInt8318 - local154, local55.anInt8320, local55.anInt8322 * local50.aShort27 >> 7, local140 + (float) local55.anInt8321, -local168, local55.anInt8315 * local50.aShort29 >> 7);
				this.aClass90_Sub1_20.method2095(local8);
				this.aClass90_Sub1_20.ka(local16, local12 - (float) local50.anInt2510 * 1.5F);
				@Pc(220) int local220 = local55.anInt8317;
				OpenGL.glColor4ub((byte) (local220 >> 16), (byte) (local220 >> 8), (byte) local220, (byte) (local220 >> 24));
				this.aClass90_Sub1_20.method2111(local50.aShort28);
				this.aClass90_Sub1_20.method2090(local50.aByte24);
				this.aClass90_Sub1_20.method2081(4);
			}
		}
		this.aClass90_Sub1_20.ka(local16, local12);
		this.aClass90_Sub1_20.method7500(true);
		this.aClass90_Sub1_20.method2075();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	private void method3719() {
		if (!this.aBoolean321) {
			return;
		}
		this.aBoolean321 = false;
		if (this.aClass33Array5 == null && this.aClass335Array5 == null && this.aClass92Array1 == null) {
			if (this.anIntArray361 != null && !Static97.method1430(this.anInt4368, this.anInt4361)) {
				if (this.aClass166_5 != null && this.aClass166_5.anInterface14_4 == null) {
					this.aBoolean321 = true;
				} else {
					if (!this.aBoolean322) {
						this.method3721();
					}
					this.anIntArray361 = null;
				}
			}
			if (this.anIntArray363 != null && !Static420.method6485(this.anInt4361, this.anInt4368)) {
				if (this.aClass166_5 != null && this.aClass166_5.anInterface14_4 == null) {
					this.aBoolean321 = true;
				} else {
					if (!this.aBoolean322) {
						this.method3721();
					}
					this.anIntArray363 = null;
				}
			}
			if (this.anIntArray360 != null && !Static422.method5975(this.anInt4361, this.anInt4368)) {
				if (this.aClass166_5 != null && this.aClass166_5.anInterface14_4 == null) {
					this.aBoolean321 = true;
				} else {
					if (!this.aBoolean322) {
						this.method3721();
					}
					this.anIntArray360 = null;
				}
			}
		}
		if (this.aShortArray71 != null && this.anIntArray361 == null && this.anIntArray363 == null && this.anIntArray360 == null) {
			this.aShortArray71 = null;
			this.anIntArray359 = null;
		}
		if (this.aByteArray58 != null && !Static259.method3987(this.anInt4368, this.anInt4361)) {
			if (this.aClass166_3 == null) {
				if (this.aClass166_6 != null && this.aClass166_6.anInterface14_4 == null) {
					this.aBoolean321 = true;
				} else {
					this.aByteArray58 = null;
					this.aShortArray69 = this.aShortArray68 = this.aShortArray75 = null;
				}
			} else if (this.aClass166_3.anInterface14_4 == null) {
				this.aBoolean321 = true;
			} else {
				this.aShortArray69 = this.aShortArray68 = this.aShortArray75 = null;
				this.aByteArray58 = null;
			}
		}
		if (this.aShortArray65 != null && !Static302.method4567(this.anInt4361, this.anInt4368)) {
			if (this.aClass166_6 != null && this.aClass166_6.anInterface14_4 == null) {
				this.aBoolean321 = true;
			} else {
				this.aShortArray65 = null;
			}
		}
		if (this.aByteArray57 != null && !Static407.method5853(this.anInt4368, this.anInt4361)) {
			if (this.aClass166_6 != null && this.aClass166_6.anInterface14_4 == null) {
				this.aBoolean321 = true;
			} else {
				this.aByteArray57 = null;
			}
		}
		if (this.aFloatArray30 != null && !Static406.method5849(this.anInt4368, this.anInt4361)) {
			if (this.aClass166_4 != null && this.aClass166_4.anInterface14_4 == null) {
				this.aBoolean321 = true;
			} else {
				this.aFloatArray30 = this.aFloatArray31 = null;
			}
		}
		if (this.aShortArray67 != null && !Static488.method7871(this.anInt4368, this.anInt4361)) {
			if (this.aClass166_6 != null && this.aClass166_6.anInterface14_4 == null) {
				this.aBoolean321 = true;
			} else {
				this.aShortArray67 = null;
			}
		}
		if (this.aShortArray70 != null && !Static517.method7070(this.anInt4368, this.anInt4361)) {
			if ((this.aClass273_1 == null || this.aClass273_1.anInterface15_5 != null) && (this.aClass166_6 == null || this.aClass166_6.anInterface14_4 != null)) {
				this.aShortArray70 = this.aShortArray74 = this.aShortArray73 = null;
			} else {
				this.aBoolean321 = true;
			}
		}
		if (this.anIntArrayArray40 != null && !Static408.method5879(this.anInt4368, this.anInt4361)) {
			this.aShortArray66 = null;
			this.anIntArrayArray40 = null;
		}
		if (this.anIntArrayArray38 != null && !Static465.method6497(this.anInt4368, this.anInt4361)) {
			this.aShortArray72 = null;
			this.anIntArrayArray38 = null;
		}
		if (this.anIntArrayArray39 != null && !Static212.method7946(this.anInt4368, this.anInt4361)) {
			this.anIntArrayArray39 = null;
		}
		if (this.anIntArray358 != null && (this.anInt4361 & 0x800) == 0 && (this.anInt4361 & 0x40000) == 0) {
			this.anIntArray358 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4371; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray363[local15] - local9 * this.anIntArray360[local15] >> 14;
			this.anIntArray360[local15] = local9 * this.anIntArray363[local15] + local13 * this.anIntArray360[local15] >> 14;
			this.anIntArray363[local15] = local34;
		}
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
		this.aBoolean322 = false;
	}

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local27 = 0;
			Static554.anInt9647 = 0;
			Static306.anInt5636 = 0;
			Static575.anInt9880 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray38.length > local41) {
					local51 = this.anIntArrayArray38[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static575.anInt9880 += this.anIntArray361[local59];
						Static554.anInt9647 += this.anIntArray363[local59];
						Static306.anInt5636 += this.anIntArray360[local59];
						local27++;
					}
				}
			}
			if (local27 <= 0) {
				Static554.anInt9647 = local17;
				Static575.anInt9880 = local25;
				Static306.anInt5636 = local21;
			} else {
				Static554.anInt9647 = Static554.anInt9647 / local27 + local17;
				Static306.anInt5636 = local21 + Static306.anInt5636 / local27;
				Static575.anInt9880 = Static575.anInt9880 / local27 + local25;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray38.length > local35) {
					local164 = this.anIntArrayArray38[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local53 = local164[local166];
						this.anIntArray361[local53] += local25;
						this.anIntArray363[local53] += local17;
						this.anIntArray360[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(304) int local304;
		@Pc(761) int local761;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray38.length) {
					local164 = this.anIntArrayArray38[local35];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local53 = local164[local166];
							this.anIntArray361[local53] -= Static575.anInt9880;
							this.anIntArray363[local53] -= Static554.anInt9647;
							this.anIntArray360[local53] -= Static306.anInt5636;
							if (arg4 != 0) {
								local59 = Class22.anIntArray20[arg4];
								local286 = Class22.anIntArray19[arg4];
								local304 = local59 * this.anIntArray363[local53] + this.anIntArray361[local53] * local286 + 16383 >> 14;
								this.anIntArray363[local53] = local286 * this.anIntArray363[local53] + 16383 - this.anIntArray361[local53] * local59 >> 14;
								this.anIntArray361[local53] = local304;
							}
							if (arg2 != 0) {
								local59 = Class22.anIntArray20[arg2];
								local286 = Class22.anIntArray19[arg2];
								local304 = local286 * this.anIntArray363[local53] + 16383 - this.anIntArray360[local53] * local59 >> 14;
								this.anIntArray360[local53] = this.anIntArray360[local53] * local286 + this.anIntArray363[local53] * local59 + 16383 >> 14;
								this.anIntArray363[local53] = local304;
							}
							if (arg3 != 0) {
								local59 = Class22.anIntArray20[arg3];
								local286 = Class22.anIntArray19[arg3];
								local304 = this.anIntArray361[local53] * local286 + local59 * this.anIntArray360[local53] + 16383 >> 14;
								this.anIntArray360[local53] = local286 * this.anIntArray360[local53] + 16383 - local59 * this.anIntArray361[local53] >> 14;
								this.anIntArray361[local53] = local304;
							}
							this.anIntArray361[local53] += Static575.anInt9880;
							this.anIntArray363[local53] += Static554.anInt9647;
							this.anIntArray360[local53] += Static306.anInt5636;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local53 = local164[local166];
							this.anIntArray361[local53] -= Static575.anInt9880;
							this.anIntArray363[local53] -= Static554.anInt9647;
							this.anIntArray360[local53] -= Static306.anInt5636;
							if (arg2 != 0) {
								local59 = Class22.anIntArray20[arg2];
								local286 = Class22.anIntArray19[arg2];
								local304 = local286 * this.anIntArray363[local53] + 16383 - local59 * this.anIntArray360[local53] >> 14;
								this.anIntArray360[local53] = this.anIntArray360[local53] * local286 + local59 * this.anIntArray363[local53] + 16383 >> 14;
								this.anIntArray363[local53] = local304;
							}
							if (arg4 != 0) {
								local59 = Class22.anIntArray20[arg4];
								local286 = Class22.anIntArray19[arg4];
								local304 = local286 * this.anIntArray361[local53] + this.anIntArray363[local53] * local59 + 16383 >> 14;
								this.anIntArray363[local53] = local286 * this.anIntArray363[local53] + 16383 - local59 * this.anIntArray361[local53] >> 14;
								this.anIntArray361[local53] = local304;
							}
							if (arg3 != 0) {
								local59 = Class22.anIntArray20[arg3];
								local286 = Class22.anIntArray19[arg3];
								local304 = local286 * this.anIntArray361[local53] + local59 * this.anIntArray360[local53] + 16383 >> 14;
								this.anIntArray360[local53] = this.anIntArray360[local53] * local286 + 16383 - local59 * this.anIntArray361[local53] >> 14;
								this.anIntArray361[local53] = local304;
							}
							this.anIntArray361[local53] += Static575.anInt9880;
							this.anIntArray363[local53] += Static554.anInt9647;
							this.anIntArray360[local53] += Static306.anInt5636;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray38.length) {
						local51 = this.anIntArrayArray38[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local286 = this.anIntArray359[local59];
							local304 = this.anIntArray359[local59 + 1];
							for (local761 = local286; local761 < local304; local761++) {
								@Pc(770) int local770 = this.aShortArray71[local761] - 1;
								if (local770 == -1) {
									break;
								}
								@Pc(783) int local783;
								@Pc(787) int local787;
								@Pc(805) int local805;
								if (arg4 != 0) {
									local783 = Class22.anIntArray20[arg4];
									local787 = Class22.anIntArray19[arg4];
									local805 = this.aShortArray69[local770] * local787 + this.aShortArray68[local770] * local783 + 16383 >> 14;
									this.aShortArray68[local770] = (short) (local787 * this.aShortArray68[local770] + 16383 - this.aShortArray69[local770] * local783 >> 14);
									this.aShortArray69[local770] = (short) local805;
								}
								if (arg2 != 0) {
									local783 = Class22.anIntArray20[arg2];
									local787 = Class22.anIntArray19[arg2];
									local805 = this.aShortArray68[local770] * local787 + 16383 - this.aShortArray75[local770] * local783 >> 14;
									this.aShortArray75[local770] = (short) (local783 * this.aShortArray68[local770] + this.aShortArray75[local770] * local787 + 16383 >> 14);
									this.aShortArray68[local770] = (short) local805;
								}
								if (arg3 != 0) {
									local783 = Class22.anIntArray20[arg3];
									local787 = Class22.anIntArray19[arg3];
									local805 = local783 * this.aShortArray75[local770] + this.aShortArray69[local770] * local787 + 16383 >> 14;
									this.aShortArray75[local770] = (short) (this.aShortArray75[local770] * local787 + 16383 - local783 * this.aShortArray69[local770] >> 14);
									this.aShortArray69[local770] = (short) local805;
								}
							}
						}
					}
				}
				if (this.aClass166_3 == null && this.aClass166_6 != null) {
					this.aClass166_6.anInterface14_4 = null;
				}
				if (this.aClass166_3 != null) {
					this.aClass166_3.anInterface14_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray38.length > local35) {
					local164 = this.anIntArrayArray38[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local53 = local164[local166];
						this.anIntArray361[local53] -= Static575.anInt9880;
						this.anIntArray363[local53] -= Static554.anInt9647;
						this.anIntArray360[local53] -= Static306.anInt5636;
						this.anIntArray361[local53] = arg2 * this.anIntArray361[local53] >> 7;
						this.anIntArray363[local53] = this.anIntArray363[local53] * arg3 >> 7;
						this.anIntArray360[local53] = this.anIntArray360[local53] * arg4 >> 7;
						this.anIntArray361[local53] += Static575.anInt9880;
						this.anIntArray363[local53] += Static554.anInt9647;
						this.anIntArray360[local53] += Static306.anInt5636;
					}
				}
			}
		} else {
			@Pc(1224) Class92 local1224;
			@Pc(1229) Class292 local1229;
			if (arg0 == 5) {
				if (this.anIntArrayArray40 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray40.length > local35) {
							local164 = this.anIntArrayArray40[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local53 = local164[local166];
								local59 = arg2 * 8 + (this.aByteArray57[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray57[local53] = (byte) local59;
							}
							if (local164.length > 0 && this.aClass166_6 != null) {
								this.aClass166_6.anInterface14_4 = null;
							}
						}
					}
					if (this.aClass92Array1 != null) {
						for (local35 = 0; local35 < this.anInt4329; local35++) {
							local1224 = this.aClass92Array1[local35];
							local1229 = this.aClass292Array1[local35];
							local1229.anInt8317 = local1229.anInt8317 & 0xFFFFFF | 255 - (this.aByteArray57[local1224.anInt2507] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1472) Class292 local1472;
				if (arg0 == 8) {
					if (this.anIntArrayArray39 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray39.length > local35) {
								local164 = this.anIntArrayArray39[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1472 = this.aClass292Array1[local164[local166]];
									local1472.anInt8318 += arg3;
									local1472.anInt8321 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray39 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray39.length > local35) {
								local164 = this.anIntArrayArray39[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1472 = this.aClass292Array1[local164[local166]];
									local1472.anInt8322 = arg3 * local1472.anInt8322 >> 7;
									local1472.anInt8315 = local1472.anInt8315 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray39.length) {
							local164 = this.anIntArrayArray39[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1472 = this.aClass292Array1[local164[local166]];
								local1472.anInt8320 = local1472.anInt8320 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray40 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray40.length > local35) {
						local164 = this.anIntArrayArray40[local35];
						for (local166 = 0; local166 < local164.length; local166++) {
							local53 = local164[local166];
							local59 = this.aShortArray65[local53] & 0xFFFF;
							local286 = local59 >> 10 & 0x3F;
							local304 = local59 >> 7 & 0x7;
							local304 += arg3 / 4;
							@Pc(1319) int local1319 = arg2 + local286 & 0x3F;
							local761 = local59 & 0x7F;
							local761 += arg4;
							if (local304 < 0) {
								local304 = 0;
							} else if (local304 > 7) {
								local304 = 7;
							}
							if (local761 < 0) {
								local761 = 0;
							} else if (local761 > 127) {
								local761 = 127;
							}
							this.aShortArray65[local53] = (short) (local304 << 7 | local1319 << 10 | local761);
						}
						if (local164.length > 0 && this.aClass166_6 != null) {
							this.aClass166_6.anInterface14_4 = null;
						}
					}
				}
				if (this.aClass92Array1 != null) {
					for (local35 = 0; local35 < this.anInt4329; local35++) {
						local1224 = this.aClass92Array1[local35];
						local1229 = this.aClass292Array1[local35];
						local1229.anInt8317 = Static36.anIntArray31[this.aShortArray65[local1224.anInt2507] & 0xFFFF] & 0xFFFFFF | local1229.anInt8317 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIBS)I")
	private int method3720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3) {
		@Pc(12) int local12 = Static36.anIntArray31[Static89.method1371(arg0, arg1)];
		if (arg3 != -1) {
			@Pc(30) Class115 local30 = this.aClass90_Sub1_20.anInterface2_15.method3085(arg3 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte40 & 0xFF;
			@Pc(44) int local44;
			@Pc(66) int local66;
			if (local35 != 0) {
				if (arg1 < 0) {
					local44 = 0;
				} else if (arg1 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg1 * 131586;
				}
				if (local35 == 256) {
					local12 = local44;
				} else {
					local66 = 256 - local35;
					local12 = (local66 * (local12 & 0xFF00) + (local44 & 0xFF00) * local35 & 0xFF0000) + (local35 * (local44 & 0xFF00FF) + (local66 * (local12 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local44 = local30.aByte38 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(117) int local117 = local44 * (local12 >> 16 & 0xFF);
				if (local117 > 65535) {
					local117 = 65535;
				}
				local66 = local44 * (local12 >> 8 & 0xFF);
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(141) int local141 = local44 * (local12 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				local12 = (local141 >> 8) + (local66 & 0xFF00) + (local117 << 8 & 0xFF0030);
			}
		}
		return (local12 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!q;Lclient!rc;II)V")
	@Override
	public void method7392(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4331 == 0) {
			return;
		}
		@Pc(13) Class93_Sub2 local13 = this.aClass90_Sub1_20.aClass93_Sub2_4;
		@Pc(16) Class93_Sub2 local16 = (Class93_Sub2) arg0;
		if (!this.aBoolean322) {
			this.method3721();
		}
		Static2.aFloat1 = local13.aFloat100 + local13.aFloat94 * local16.aFloat96 + local13.aFloat103 * local16.aFloat104 + local13.aFloat105 * local16.aFloat100;
		Static430.aFloat166 = local16.aFloat95 * local13.aFloat94 + local16.aFloat101 * local13.aFloat103 + local16.aFloat103 * local13.aFloat105;
		@Pc(69) float local69 = Static2.aFloat1 + (float) this.aShort65 * Static430.aFloat166;
		@Pc(77) float local77 = Static430.aFloat166 * (float) this.aShort63 + Static2.aFloat1;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = (float) this.aShort70 + local69;
			local93 = local77 - (float) this.aShort70;
		} else {
			local87 = (float) this.aShort70 + local77;
			local93 = (float) -this.aShort70 + local69;
		}
		if (this.aClass90_Sub1_20.aFloat54 <= local93 || local87 <= (float) this.aClass90_Sub1_20.anInt2477) {
			return;
		}
		Static217.aFloat93 = local16.aFloat100 * local13.aFloat102 + local16.aFloat96 * local13.aFloat98 + local16.aFloat104 * local13.aFloat95 + local13.aFloat96;
		Static175.aFloat67 = local16.aFloat103 * local13.aFloat102 + local13.aFloat98 * local16.aFloat95 + local13.aFloat95 * local16.aFloat101;
		@Pc(170) float local170 = Static175.aFloat67 * (float) this.aShort65 + Static217.aFloat93;
		@Pc(178) float local178 = Static217.aFloat93 + (float) this.aShort63 * Static175.aFloat67;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = ((float) this.aShort70 + local170) * (float) this.aClass90_Sub1_20.anInt2465;
			local204 = ((float) -this.aShort70 + local178) * (float) this.aClass90_Sub1_20.anInt2465;
		} else {
			local193 = (float) this.aClass90_Sub1_20.anInt2465 * (local178 + (float) this.aShort70);
			local204 = (float) this.aClass90_Sub1_20.anInt2465 * (local170 - (float) this.aShort70);
		}
		if (this.aClass90_Sub1_20.aFloat42 <= local204 / (float) arg2 || local193 / (float) arg2 <= this.aClass90_Sub1_20.aFloat59) {
			return;
		}
		Static373.aFloat158 = local13.aFloat104 + local13.aFloat101 * local16.aFloat104 + local13.aFloat99 * local16.aFloat96 + local13.aFloat97 * local16.aFloat100;
		Static487.aFloat178 = local13.aFloat101 * local16.aFloat101 + local13.aFloat99 * local16.aFloat95 + local16.aFloat103 * local13.aFloat97;
		@Pc(296) float local296 = Static487.aFloat178 * (float) this.aShort65 + Static373.aFloat158;
		@Pc(304) float local304 = Static487.aFloat178 * (float) this.aShort63 + Static373.aFloat158;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local296 > local304) {
			local320 = (float) this.aClass90_Sub1_20.anInt2470 * ((float) -this.aShort70 + local304);
			local331 = ((float) this.aShort70 + local296) * (float) this.aClass90_Sub1_20.anInt2470;
		} else {
			local331 = (float) this.aClass90_Sub1_20.anInt2470 * (local304 + (float) this.aShort70);
			local320 = (float) this.aClass90_Sub1_20.anInt2470 * (local296 - (float) this.aShort70);
		}
		if (this.aClass90_Sub1_20.aFloat43 <= local320 / (float) arg2 || local331 / (float) arg2 <= this.aClass90_Sub1_20.aFloat51) {
			return;
		}
		if (arg1 != null || this.aClass92Array1 != null) {
			Static578.aFloat211 = local16.aFloat94 * local13.aFloat97 + local13.aFloat101 * local16.aFloat99 + local13.aFloat99 * local16.aFloat98;
			Static545.aFloat187 = local13.aFloat94 * local16.aFloat102 + local16.aFloat97 * local13.aFloat103 + local13.aFloat105 * local16.aFloat105;
			Static205.aFloat92 = local16.aFloat105 * local13.aFloat97 + local16.aFloat102 * local13.aFloat99 + local16.aFloat97 * local13.aFloat101;
			Static439.aFloat167 = local16.aFloat94 * local13.aFloat105 + local16.aFloat98 * local13.aFloat94 + local16.aFloat99 * local13.aFloat103;
			Static486.aFloat177 = local13.aFloat102 * local16.aFloat94 + local13.aFloat95 * local16.aFloat99 + local16.aFloat98 * local13.aFloat98;
			Static154.aFloat65 = local13.aFloat102 * local16.aFloat105 + local13.aFloat98 * local16.aFloat102 + local13.aFloat95 * local16.aFloat97;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort68 + this.aShort62 >> 1;
			@Pc(506) int local506 = this.aShort67 + this.aShort66 >> 1;
			@Pc(525) int local525 = (int) ((float) local506 * Static154.aFloat65 + Static175.aFloat67 * (float) this.aShort65 + Static486.aFloat177 * (float) local498 + Static217.aFloat93);
			@Pc(544) int local544 = (int) (Static373.aFloat158 + Static578.aFloat211 * (float) local498 + Static487.aFloat178 * (float) this.aShort65 + Static205.aFloat92 * (float) local506);
			@Pc(563) int local563 = (int) (Static430.aFloat166 * (float) this.aShort65 + (float) local498 * Static439.aFloat167 + Static2.aFloat1 + (float) local506 * Static545.aFloat187);
			@Pc(582) int local582 = (int) (Static486.aFloat177 * (float) local498 + Static217.aFloat93 + (float) this.aShort63 * Static175.aFloat67 + (float) local506 * Static154.aFloat65);
			@Pc(601) int local601 = (int) (Static487.aFloat178 * (float) this.aShort63 + Static578.aFloat211 * (float) local498 + Static373.aFloat158 + (float) local506 * Static205.aFloat92);
			arg1.anInt7809 = this.aClass90_Sub1_20.anInt2465 * local582 / arg2 + this.aClass90_Sub1_20.anInt2473;
			arg1.anInt7810 = this.aClass90_Sub1_20.anInt2448 + this.aClass90_Sub1_20.anInt2470 * local601 / arg2;
			arg1.anInt7808 = this.aClass90_Sub1_20.anInt2473 + this.aClass90_Sub1_20.anInt2465 * local525 / arg2;
			@Pc(659) int local659 = (int) (Static430.aFloat166 * (float) this.aShort63 + (float) local498 * Static439.aFloat167 + Static2.aFloat1 + Static545.aFloat187 * (float) local506);
			arg1.anInt7807 = this.aClass90_Sub1_20.anInt2448 + this.aClass90_Sub1_20.anInt2470 * local544 / arg2;
			if (this.aClass90_Sub1_20.anInt2477 > local563 && this.aClass90_Sub1_20.anInt2477 > local659) {
				arg1.anInt7806 = (local525 + this.aShort70) * this.aClass90_Sub1_20.anInt2465 / arg2 + this.aClass90_Sub1_20.anInt2473 - arg1.anInt7808;
				arg1.aBoolean513 = true;
			}
		}
		this.aClass90_Sub1_20.method2112((float) arg2);
		this.aClass90_Sub1_20.method2085();
		this.aClass90_Sub1_20.method2109(local16);
		this.method3729();
		this.aClass90_Sub1_20.method2075();
		this.method3718();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	private void method3721() {
		@Pc(7) int local7 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4371; local29++) {
			@Pc(36) int local36 = this.anIntArray361[local29];
			@Pc(41) int local41 = this.anIntArray363[local29];
			if (local15 > local41) {
				local15 = local41;
			}
			if (local36 > local19) {
				local19 = local36;
			}
			if (local41 > local21) {
				local21 = local41;
			}
			if (local36 < local7) {
				local7 = local36;
			}
			@Pc(74) int local74 = this.anIntArray360[local29];
			if (local74 < local17) {
				local17 = local74;
			}
			if (local74 > local23) {
				local23 = local74;
			}
			@Pc(97) int local97 = local36 * local36 + local74 * local74;
			if (local97 > local25) {
				local25 = local97;
			}
			local97 = local74 * local74 + local36 * local36 + local41 * local41;
			if (local27 < local97) {
				local27 = local97;
			}
		}
		this.aShort68 = (short) local19;
		this.aShort63 = (short) local21;
		this.aShort67 = (short) local23;
		this.aShort65 = (short) local15;
		this.aShort62 = (short) local7;
		this.aShort66 = (short) local17;
		this.aShort70 = (short) (Math.sqrt((double) local25) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean322 = true;
	}

	@OriginalMember(owner = "client!jc", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean322) {
			this.method3721();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4352; local7++) {
			this.anIntArray361[local7] = this.anIntArray361[local7] + 7 >> 4;
			this.anIntArray363[local7] = this.anIntArray363[local7] + 7 >> 4;
			this.anIntArray360[local7] = this.anIntArray360[local7] + 7 >> 4;
		}
		this.aBoolean322 = false;
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean322) {
			this.method3721();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!jc", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static554.anInt9647 = 0;
			Static306.anInt5636 = 0;
			local13 = 0;
			Static575.anInt9880 = 0;
			for (local17 = 0; local17 < this.anInt4371; local17++) {
				Static575.anInt9880 += this.anIntArray361[local17];
				Static554.anInt9647 += this.anIntArray363[local17];
				local13++;
				Static306.anInt5636 += this.anIntArray360[local17];
			}
			if (local13 <= 0) {
				Static575.anInt9880 = arg1;
				Static554.anInt9647 = arg2;
				Static306.anInt5636 = arg3;
			} else {
				Static554.anInt9647 = Static554.anInt9647 / local13 + arg2;
				Static306.anInt5636 = Static306.anInt5636 / local13 + arg3;
				Static575.anInt9880 = Static575.anInt9880 / local13 + arg1;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt4371; local13++) {
				this.anIntArray361[local13] += arg1;
				this.anIntArray363[local13] += arg2;
				this.anIntArray360[local13] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(179) int local179;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt4371; local13++) {
					this.anIntArray361[local13] -= Static575.anInt9880;
					this.anIntArray363[local13] -= Static554.anInt9647;
					this.anIntArray360[local13] -= Static306.anInt5636;
					if (arg3 != 0) {
						local17 = Class22.anIntArray20[arg3];
						local161 = Class22.anIntArray19[arg3];
						local179 = local161 * this.anIntArray361[local13] + this.anIntArray363[local13] * local17 + 16383 >> 14;
						this.anIntArray363[local13] = this.anIntArray363[local13] * local161 + 16383 - local17 * this.anIntArray361[local13] >> 14;
						this.anIntArray361[local13] = local179;
					}
					if (arg1 != 0) {
						local17 = Class22.anIntArray20[arg1];
						local161 = Class22.anIntArray19[arg1];
						local179 = this.anIntArray363[local13] * local161 + 16383 - this.anIntArray360[local13] * local17 >> 14;
						this.anIntArray360[local13] = this.anIntArray363[local13] * local17 + this.anIntArray360[local13] * local161 + 16383 >> 14;
						this.anIntArray363[local13] = local179;
					}
					if (arg2 != 0) {
						local17 = Class22.anIntArray20[arg2];
						local161 = Class22.anIntArray19[arg2];
						local179 = local161 * this.anIntArray361[local13] + local17 * this.anIntArray360[local13] + 16383 >> 14;
						this.anIntArray360[local13] = this.anIntArray360[local13] * local161 + 16383 - this.anIntArray361[local13] * local17 >> 14;
						this.anIntArray361[local13] = local179;
					}
					this.anIntArray361[local13] += Static575.anInt9880;
					this.anIntArray363[local13] += Static554.anInt9647;
					this.anIntArray360[local13] += Static306.anInt5636;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt4371; local13++) {
					this.anIntArray361[local13] -= Static575.anInt9880;
					this.anIntArray363[local13] -= Static554.anInt9647;
					this.anIntArray360[local13] -= Static306.anInt5636;
					this.anIntArray361[local13] = this.anIntArray361[local13] * arg1 / 128;
					this.anIntArray363[local13] = this.anIntArray363[local13] * arg2 / 128;
					this.anIntArray360[local13] = this.anIntArray360[local13] * arg3 / 128;
					this.anIntArray361[local13] += Static575.anInt9880;
					this.anIntArray363[local13] += Static554.anInt9647;
					this.anIntArray360[local13] += Static306.anInt5636;
				}
			} else {
				@Pc(522) Class92 local522;
				@Pc(527) Class292 local527;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt4373; local13++) {
						local17 = (this.aByteArray57[local13] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray57[local13] = (byte) local17;
					}
					if (this.aClass166_6 != null) {
						this.aClass166_6.anInterface14_4 = null;
					}
					if (this.aClass92Array1 != null) {
						for (local17 = 0; local17 < this.anInt4329; local17++) {
							local522 = this.aClass92Array1[local17];
							local527 = this.aClass292Array1[local17];
							local527.anInt8317 = 255 - (this.aByteArray57[local522.anInt2507] & 0xFF) << 24 | local527.anInt8317 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt4373; local13++) {
						local17 = this.aShortArray65[local13] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local179 = local17 >> 7 & 0x7;
						@Pc(587) int local587 = local161 + arg1 & 0x3F;
						@Pc(591) int local591 = local17 & 0x7F;
						local179 += arg2 / 4;
						if (local179 < 0) {
							local179 = 0;
						} else if (local179 > 7) {
							local179 = 7;
						}
						local591 += arg3;
						if (local591 < 0) {
							local591 = 0;
						} else if (local591 > 127) {
							local591 = 127;
						}
						this.aShortArray65[local13] = (short) (local591 | local587 << 10 | local179 << 7);
					}
					if (this.aClass166_6 != null) {
						this.aClass166_6.anInterface14_4 = null;
					}
					if (this.aClass92Array1 != null) {
						for (local17 = 0; local17 < this.anInt4329; local17++) {
							local522 = this.aClass92Array1[local17];
							local527 = this.aClass292Array1[local17];
							local527.anInt8317 = Static36.anIntArray31[this.aShortArray65[local522.anInt2507] & 0xFFFF] & 0xFFFFFF | local527.anInt8317 & 0xFF000000;
						}
					}
				} else {
					@Pc(715) Class292 local715;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt4329; local13++) {
							local715 = this.aClass292Array1[local13];
							local715.anInt8321 += arg1;
							local715.anInt8318 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt4329; local13++) {
							local715 = this.aClass292Array1[local13];
							local715.anInt8322 = arg2 * local715.anInt8322 >> 7;
							local715.anInt8315 = arg1 * local715.anInt8315 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt4329; local13++) {
							local715 = this.aClass292Array1[local13];
							local715.anInt8320 = arg1 + local715.anInt8320 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass90_Sub1_20.anInterface2_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4373; local11++) {
			if (arg0 == this.aShortArray67[local11]) {
				this.aShortArray67[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class115 local47 = local9.method3085(arg0 & 0xFFFF);
			local37 = local47.aByte38;
			local35 = local47.aByte40;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class115 local67 = local9.method3085(arg1 & 0xFFFF);
			local57 = local67.aByte38;
			local55 = local67.aByte40;
		}
		if (!(local35 != local55 | local57 != local37)) {
			return;
		}
		if (this.aClass92Array1 != null) {
			for (@Pc(100) int local100 = 0; local100 < this.anInt4329; local100++) {
				@Pc(107) Class92 local107 = this.aClass92Array1[local100];
				@Pc(112) Class292 local112 = this.aClass292Array1[local100];
				local112.anInt8317 = local112.anInt8317 & 0xFF000000 | Static36.anIntArray31[this.aShortArray65[local107.anInt2507] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass166_6 != null) {
			this.aClass166_6.anInterface14_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean322) {
			this.method3721();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!jc", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean322) {
			this.method3721();
		}
		return this.aShort62;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()Z")
	@Override
	public boolean method7397() {
		if (this.aShortArray67 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray67.length; local12++) {
			if (this.aShortArray67[local12] != -1 && !this.aClass90_Sub1_20.anInterface2_15.method3089(this.aShortArray67[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean322) {
			this.method3721();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class24 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class24_Sub2 local14;
		@Pc(18) Class24_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass90_Sub1_20.aClass24_Sub2_4;
			local18 = this.aClass90_Sub1_20.aClass24_Sub2_8;
		} else if (arg0 == 2) {
			local18 = this.aClass90_Sub1_20.aClass24_Sub2_5;
			local14 = this.aClass90_Sub1_20.aClass24_Sub2_3;
		} else if (arg0 == 3) {
			local18 = this.aClass90_Sub1_20.aClass24_Sub2_7;
			local14 = this.aClass90_Sub1_20.aClass24_Sub2_2;
		} else if (arg0 == 4) {
			local14 = this.aClass90_Sub1_20.aClass24_Sub2_10;
			local18 = this.aClass90_Sub1_20.aClass24_Sub2_9;
		} else if (arg0 == 5) {
			local14 = this.aClass90_Sub1_20.aClass24_Sub2_1;
			local18 = this.aClass90_Sub1_20.aClass24_Sub2_6;
		} else {
			local14 = local18 = new Class24_Sub2(this.aClass90_Sub1_20);
		}
		return this.method3726(arg1, arg0 != 0, local18, arg2, local14);
	}

	@OriginalMember(owner = "client!jc", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean322) {
			this.method3721();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(FIIJIIFIILclient!hn;)S")
	private short method3724(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class134 arg8) {
		@Pc(10) int local10 = this.anIntArray359[arg6];
		@Pc(17) int local17 = this.anIntArray359[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = local10; local29 < local17; local29++) {
			@Pc(36) short local36 = this.aShortArray71[local29];
			if (local36 == 0) {
				local19 = local29;
				break;
			}
			if (Static476.aLongArray20[local29] == arg3) {
				return (short) (local36 - 1);
			}
		}
		this.aShortArray71[local19] = (short) (this.anInt4331 + 1);
		Static476.aLongArray20[local19] = arg3;
		this.aShortArray69[this.anInt4331] = (short) arg7;
		this.aShortArray68[this.anInt4331] = (short) arg4;
		this.aShortArray75[this.anInt4331] = (short) arg1;
		this.aByteArray58[this.anInt4331] = (byte) arg2;
		this.aFloatArray30[this.anInt4331] = arg5;
		this.aFloatArray31[this.anInt4331] = arg0;
		return (short) this.anInt4331++;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7389(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class24_Sub2 local8 = (Class24_Sub2) arg0;
		if (this.anInt4373 == 0 || local8.anInt4373 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt4371;
		@Pc(24) int[] local24 = local8.anIntArray361;
		@Pc(27) int[] local27 = local8.anIntArray363;
		@Pc(30) int[] local30 = local8.anIntArray360;
		@Pc(33) short[] local33 = local8.aShortArray69;
		@Pc(36) short[] local36 = local8.aShortArray68;
		@Pc(39) short[] local39 = local8.aShortArray75;
		@Pc(42) byte[] local42 = local8.aByteArray58;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(49) short[] local49;
		@Pc(51) byte[] local51;
		if (this.aClass49_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local49 = this.aClass49_1.aShortArray11;
			local53 = this.aClass49_1.aShortArray10;
			local47 = this.aClass49_1.aShortArray9;
			local51 = this.aClass49_1.aByteArray4;
		}
		@Pc(82) short[] local82;
		@Pc(78) short[] local78;
		@Pc(90) short[] local90;
		@Pc(86) byte[] local86;
		if (local8.aClass49_1 == null) {
			local90 = null;
			local78 = null;
			local86 = null;
			local82 = null;
		} else {
			local78 = local8.aClass49_1.aShortArray9;
			local82 = local8.aClass49_1.aShortArray10;
			local86 = local8.aClass49_1.aByteArray4;
			local90 = local8.aClass49_1.aShortArray11;
		}
		@Pc(103) int[] local103 = local8.anIntArray359;
		@Pc(106) short[] local106 = local8.aShortArray71;
		if (!local8.aBoolean322) {
			local8.method3721();
		}
		@Pc(115) short local115 = local8.aShort65;
		@Pc(118) short local118 = local8.aShort63;
		@Pc(121) short local121 = local8.aShort62;
		@Pc(124) short local124 = local8.aShort68;
		@Pc(127) short local127 = local8.aShort66;
		@Pc(130) short local130 = local8.aShort67;
		for (@Pc(132) int local132 = 0; local132 < this.anInt4371; local132++) {
			@Pc(142) int local142 = this.anIntArray363[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(166) int local166 = this.anIntArray361[local132] - arg1;
				if (local121 <= local166 && local124 >= local166) {
					@Pc(186) int local186 = this.anIntArray360[local132] - arg3;
					if (local186 >= local127 && local130 >= local186) {
						@Pc(200) int local200 = -1;
						@Pc(205) int local205 = this.anIntArray359[local132];
						@Pc(212) int local212 = this.anIntArray359[local132 + 1];
						for (@Pc(214) int local214 = local205; local214 < local212; local214++) {
							local200 = this.aShortArray71[local214] - 1;
							if (local200 == -1 || this.aByteArray58[local200] != 0) {
								break;
							}
						}
						if (local200 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local21; local247++) {
								if (local166 == local24[local247] && local30[local247] == local186 && local142 == local27[local247]) {
									local205 = local103[local247];
									@Pc(270) int local270 = -1;
									local212 = local103[local247 + 1];
									for (@Pc(278) int local278 = local205; local278 < local212; local278++) {
										local270 = local106[local278] - 1;
										if (local270 == -1 || local42[local270] != 0) {
											break;
										}
									}
									if (local270 != -1) {
										if (local53 == null) {
											this.aClass49_1 = new Class49();
											local53 = this.aClass49_1.aShortArray10 = Static288.method6410(this.aShortArray69);
											local47 = this.aClass49_1.aShortArray9 = Static288.method6410(this.aShortArray68);
											local49 = this.aClass49_1.aShortArray11 = Static288.method6410(this.aShortArray75);
											local51 = this.aClass49_1.aByteArray4 = Static81.method1145(this.aByteArray58);
										}
										if (local82 == null) {
											@Pc(357) Class49 local357 = local8.aClass49_1 = new Class49();
											local82 = local357.aShortArray10 = Static288.method6410(local33);
											local78 = local357.aShortArray9 = Static288.method6410(local36);
											local90 = local357.aShortArray11 = Static288.method6410(local39);
											local86 = local357.aByteArray4 = Static81.method1145(local42);
										}
										@Pc(390) short local390 = this.aShortArray69[local200];
										@Pc(395) short local395 = this.aShortArray68[local200];
										@Pc(400) short local400 = this.aShortArray75[local200];
										@Pc(405) byte local405 = this.aByteArray58[local200];
										local205 = local103[local247];
										local212 = local103[local247 + 1];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local205; local417 < local212; local417++) {
											local425 = local106[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local86[local425] != 0) {
												local82[local425] += local390;
												local78[local425] += local395;
												local90[local425] += local400;
												local86[local425] += local405;
											}
										}
										local205 = this.anIntArray359[local132];
										local405 = local42[local270];
										local400 = local39[local270];
										local395 = local36[local270];
										local390 = local33[local270];
										local212 = this.anIntArray359[local132 + 1];
										for (local425 = local205; local425 < local212; local425++) {
											@Pc(508) int local508 = this.aShortArray71[local425] - 1;
											if (local508 == -1) {
												break;
											}
											if (local51[local508] != 0) {
												local53[local508] += local390;
												local47[local508] += local395;
												local49[local508] += local400;
												local51[local508] += local405;
											}
										}
										if (this.aClass166_3 == null && this.aClass166_6 != null) {
											this.aClass166_6.anInterface14_4 = null;
										}
										if (this.aClass166_3 != null) {
											this.aClass166_3.anInterface14_4 = null;
										}
										if (local8.aClass166_3 == null && local8.aClass166_6 != null) {
											local8.aClass166_6.anInterface14_4 = null;
										}
										if (local8.aClass166_3 != null) {
											local8.aClass166_3.anInterface14_4 = null;
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

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray38 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4352; local12++) {
			this.anIntArray361[local12] <<= 0x4;
			this.anIntArray363[local12] <<= 0x4;
			this.anIntArray360[local12] <<= 0x4;
		}
		Static554.anInt9647 = 0;
		Static575.anInt9880 = 0;
		Static306.anInt5636 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static575.anInt9880 = 0;
			Static554.anInt9647 = 0;
			Static306.anInt5636 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray38.length) {
					local48 = this.anIntArrayArray38[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray72 == null || (this.aShortArray72[local56] & arg6) != 0) {
							Static575.anInt9880 += this.anIntArray361[local56];
							Static554.anInt9647 += this.anIntArray363[local56];
							local24++;
							Static306.anInt5636 += this.anIntArray360[local56];
						}
					}
				}
			}
			if (local24 <= 0) {
				Static306.anInt5636 = arg4;
				Static554.anInt9647 = arg3;
				Static575.anInt9880 = arg2;
			} else {
				Static306.anInt5636 = arg4 + Static306.anInt5636 / local24;
				Static554.anInt9647 = Static554.anInt9647 / local24 + arg3;
				Static575.anInt9880 = arg2 + Static575.anInt9880 / local24;
				Static104.aBoolean121 = true;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg4 * arg7[2] + arg2 * arg7[0] + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg7[4] * arg3 + arg2 * arg7[3] + 8192 >> 14;
				local38 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
				arg3 = local32;
				arg2 = local24;
				arg4 = local38;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray38.length) {
					local246 = this.anIntArrayArray38[local32];
					for (local248 = 0; local248 < local246.length; local248++) {
						local50 = local246[local248];
						if (this.aShortArray72 == null || (arg6 & this.aShortArray72[local50]) != 0) {
							this.anIntArray361[local50] += arg2;
							this.anIntArray363[local50] += arg3;
							this.anIntArray360[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(373) int local373;
		@Pc(395) int local395;
		@Pc(425) int local425;
		@Pc(452) int local452;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(472) int local472;
		@Pc(480) int local480;
		@Pc(636) int local636;
		@Pc(661) int local661;
		@Pc(665) int local665;
		@Pc(675) int local675;
		@Pc(680) int local680;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(690) int local690;
		@Pc(819) int[] local819;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(831) int local831;
		@Pc(961) int local961;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray38.length > local32) {
						local246 = this.anIntArrayArray38[local32];
						for (local248 = 0; local248 < local246.length; local248++) {
							local50 = local246[local248];
							if (this.aShortArray72 == null || (this.aShortArray72[local50] & arg6) != 0) {
								this.anIntArray361[local50] -= Static575.anInt9880;
								this.anIntArray363[local50] -= Static554.anInt9647;
								this.anIntArray360[local50] -= Static306.anInt5636;
								if (arg4 != 0) {
									local56 = Class22.anIntArray20[arg4];
									local373 = Class22.anIntArray19[arg4];
									local395 = this.anIntArray363[local50] * local56 + this.anIntArray361[local50] * local373 + 16383 >> 14;
									this.anIntArray363[local50] = local373 * this.anIntArray363[local50] + 16383 - this.anIntArray361[local50] * local56 >> 14;
									this.anIntArray361[local50] = local395;
								}
								if (arg2 != 0) {
									local56 = Class22.anIntArray20[arg2];
									local373 = Class22.anIntArray19[arg2];
									local395 = this.anIntArray363[local50] * local373 + 16383 - this.anIntArray360[local50] * local56 >> 14;
									this.anIntArray360[local50] = local373 * this.anIntArray360[local50] + this.anIntArray363[local50] * local56 + 16383 >> 14;
									this.anIntArray363[local50] = local395;
								}
								if (arg3 != 0) {
									local56 = Class22.anIntArray20[arg3];
									local373 = Class22.anIntArray19[arg3];
									local395 = local56 * this.anIntArray360[local50] + this.anIntArray361[local50] * local373 + 16383 >> 14;
									this.anIntArray360[local50] = local373 * this.anIntArray360[local50] + 16383 - local56 * this.anIntArray361[local50] >> 14;
									this.anIntArray361[local50] = local395;
								}
								this.anIntArray361[local50] += Static575.anInt9880;
								this.anIntArray363[local50] += Static554.anInt9647;
								this.anIntArray360[local50] += Static306.anInt5636;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray38.length) {
							local48 = this.anIntArrayArray38[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray72 == null || (arg6 & this.aShortArray72[local56]) != 0) {
									local373 = this.anIntArray359[local56];
									local395 = this.anIntArray359[local56 + 1];
									for (local425 = local373; local425 < local395; local425++) {
										local452 = this.aShortArray71[local425] - 1;
										if (local452 == -1) {
											break;
										}
										if (arg4 != 0) {
											local456 = Class22.anIntArray20[arg4];
											local460 = Class22.anIntArray19[arg4];
											local464 = this.aShortArray69[local452] * local460 + local456 * this.aShortArray68[local452] + 16383 >> 14;
											this.aShortArray68[local452] = (short) (local460 * this.aShortArray68[local452] + 16383 - this.aShortArray69[local452] * local456 >> 14);
											this.aShortArray69[local452] = (short) local464;
										}
										if (arg2 != 0) {
											local456 = Class22.anIntArray20[arg2];
											local460 = Class22.anIntArray19[arg2];
											local464 = local460 * this.aShortArray68[local452] + 16383 - this.aShortArray75[local452] * local456 >> 14;
											this.aShortArray75[local452] = (short) (this.aShortArray75[local452] * local460 + this.aShortArray68[local452] * local456 + 16383 >> 14);
											this.aShortArray68[local452] = (short) local464;
										}
										if (arg3 != 0) {
											local456 = Class22.anIntArray20[arg3];
											local460 = Class22.anIntArray19[arg3];
											local464 = this.aShortArray75[local452] * local456 + this.aShortArray69[local452] * local460 + 16383 >> 14;
											this.aShortArray75[local452] = (short) (local460 * this.aShortArray75[local452] + 16383 - local456 * this.aShortArray69[local452] >> 14);
											this.aShortArray69[local452] = (short) local464;
										}
									}
								}
							}
						}
					}
					if (this.aClass166_3 == null && this.aClass166_6 != null) {
						this.aClass166_6.anInterface14_4 = null;
					}
					if (this.aClass166_3 != null) {
						this.aClass166_3.anInterface14_4 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static104.aBoolean121) {
					local373 = arg7[6] * Static306.anInt5636 + Static575.anInt9880 * arg7[0] + arg7[3] * Static554.anInt9647 + 8192 >> 14;
					local395 = arg7[7] * Static306.anInt5636 + arg7[4] * Static554.anInt9647 + arg7[1] * Static575.anInt9880 + 8192 >> 14;
					local373 += local248;
					local395 += local50;
					local425 = arg7[8] * Static306.anInt5636 + Static554.anInt9647 * arg7[5] + arg7[2] * Static575.anInt9880 + 8192 >> 14;
					Static575.anInt9880 = local373;
					Static554.anInt9647 = local395;
					local425 += local56;
					Static306.anInt5636 = local425;
					Static104.aBoolean121 = false;
				}
				@Pc(440) int[] local440 = new int[9];
				local395 = Class22.anIntArray19[arg2];
				local425 = Class22.anIntArray20[arg2];
				local452 = Class22.anIntArray19[arg3];
				local456 = Class22.anIntArray20[arg3];
				local460 = Class22.anIntArray19[arg4];
				local464 = Class22.anIntArray20[arg4];
				local472 = local460 * local425 + 8192 >> 14;
				local480 = local425 * local464 + 8192 >> 14;
				local440[4] = local395 * local460 + 8192 >> 14;
				local440[6] = local480 * local452 + -local456 * local460 + 8192 >> 14;
				local440[2] = local395 * local456 + 8192 >> 14;
				local440[0] = local460 * local452 + local456 * local480 + 8192 >> 14;
				local440[3] = local395 * local464 + 8192 >> 14;
				local440[5] = -local425;
				local440[8] = local452 * local395 + 8192 >> 14;
				local440[1] = local456 * local472 + local464 * -local452 + 8192 >> 14;
				local440[7] = local456 * local464 + local452 * local472 + 8192 >> 14;
				@Pc(609) int local609 = -Static575.anInt9880 * local440[0] + local440[1] * -Static554.anInt9647 + local440[2] * -Static306.anInt5636 + 8192 >> 14;
				local636 = local440[3] * -Static575.anInt9880 + -Static554.anInt9647 * local440[4] + -Static306.anInt5636 * local440[5] + 8192 >> 14;
				local661 = -Static306.anInt5636 * local440[8] + -Static575.anInt9880 * local440[6] + local440[7] * -Static554.anInt9647 + 8192 >> 14;
				local665 = local609 + Static575.anInt9880;
				@Pc(670) int local670 = local636 + Static554.anInt9647;
				local675 = local661 + Static306.anInt5636;
				@Pc(678) int[] local678 = new int[9];
				for (local680 = 0; local680 < 3; local680++) {
					for (local684 = 0; local684 < 3; local684++) {
						local688 = 0;
						for (local690 = 0; local690 < 3; local690++) {
							local688 += local440[local690 + local680 * 3] * arg7[local684 * 3 + local690];
						}
						local678[local684 + local680 * 3] = local688 + 8192 >> 14;
					}
				}
				local684 = local56 * local440[2] + local440[0] * local248 + local440[1] * local50 + 8192 >> 14;
				local688 = local440[5] * local56 + local440[4] * local50 + local248 * local440[3] + 8192 >> 14;
				local688 += local670;
				local690 = local50 * local440[7] + local440[6] * local248 + local440[8] * local56 + 8192 >> 14;
				local684 += local665;
				local690 += local675;
				local819 = new int[9];
				for (local821 = 0; local821 < 3; local821++) {
					for (local825 = 0; local825 < 3; local825++) {
						local829 = 0;
						for (local831 = 0; local831 < 3; local831++) {
							local829 += local678[local825 + local831 * 3] * arg7[local821 * 3 + local831];
						}
						local819[local825 + local821 * 3] = local829 + 8192 >> 14;
					}
				}
				local825 = local690 * arg7[2] + local688 * arg7[1] + local684 * arg7[0] + 8192 >> 14;
				local829 = local690 * arg7[5] + local684 * arg7[3] + arg7[4] * local688 + 8192 >> 14;
				local831 = arg7[6] * local684 + arg7[7] * local688 + local690 * arg7[8] + 8192 >> 14;
				local825 += local24;
				local829 += local32;
				local831 += local38;
				for (local961 = 0; local961 < local8; local961++) {
					@Pc(967) int local967 = arg1[local961];
					if (local967 < this.anIntArrayArray38.length) {
						@Pc(981) int[] local981 = this.anIntArrayArray38[local967];
						for (@Pc(983) int local983 = 0; local983 < local981.length; local983++) {
							@Pc(989) int local989 = local981[local983];
							if (this.aShortArray72 == null || (this.aShortArray72[local989] & arg6) != 0) {
								@Pc(1030) int local1030 = this.anIntArray361[local989] * local819[0] + local819[1] * this.anIntArray363[local989] + this.anIntArray360[local989] * local819[2] + 8192 >> 14;
								@Pc(1062) int local1062 = this.anIntArray361[local989] * local819[3] + local819[4] * this.anIntArray363[local989] + this.anIntArray360[local989] * local819[5] + 8192 >> 14;
								@Pc(1066) int local1066 = local1062 + local829;
								@Pc(1070) int local1070 = local1030 + local825;
								@Pc(1101) int local1101 = local819[7] * this.anIntArray363[local989] + this.anIntArray361[local989] * local819[6] + local819[8] * this.anIntArray360[local989] + 8192 >> 14;
								@Pc(1105) int local1105 = local1101 + local831;
								this.anIntArray361[local989] = local1070;
								this.anIntArray363[local989] = local1066;
								this.anIntArray360[local989] = local1105;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2585) Class92 local2585;
			@Pc(2590) Class292 local2590;
			if (arg0 == 5) {
				if (this.anIntArrayArray40 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray40.length > local32) {
							local246 = this.anIntArrayArray40[local32];
							for (local248 = 0; local248 < local246.length; local248++) {
								local50 = local246[local248];
								if (this.aShortArray66 == null || (this.aShortArray66[local50] & arg6) != 0) {
									local56 = (this.aByteArray57[local50] & 0xFF) + arg2 * 8;
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray57[local50] = (byte) local56;
									if (this.aClass166_6 != null) {
										this.aClass166_6.anInterface14_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass92Array1 != null) {
						for (local32 = 0; local32 < this.anInt4329; local32++) {
							local2585 = this.aClass92Array1[local32];
							local2590 = this.aClass292Array1[local32];
							local2590.anInt8317 = local2590.anInt8317 & 0xFFFFFF | 255 - (this.aByteArray57[local2585.anInt2507] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2849) Class292 local2849;
				if (arg0 == 8) {
					if (this.anIntArrayArray39 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray39.length > local32) {
								local246 = this.anIntArrayArray39[local32];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2849 = this.aClass292Array1[local246[local248]];
									local2849.anInt8318 += arg3;
									local2849.anInt8321 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray39 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray39.length > local32) {
								local246 = this.anIntArrayArray39[local32];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2849 = this.aClass292Array1[local246[local248]];
									local2849.anInt8322 = arg3 * local2849.anInt8322 >> 7;
									local2849.anInt8315 = arg2 * local2849.anInt8315 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray39.length > local32) {
							local246 = this.anIntArrayArray39[local32];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2849 = this.aClass292Array1[local246[local248]];
								local2849.anInt8320 = local2849.anInt8320 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray40 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray40.length > local32) {
						local246 = this.anIntArrayArray40[local32];
						for (local248 = 0; local248 < local246.length; local248++) {
							local50 = local246[local248];
							if (this.aShortArray66 == null || (this.aShortArray66[local50] & arg6) != 0) {
								local56 = this.aShortArray65[local50] & 0xFFFF;
								local373 = local56 >> 10 & 0x3F;
								local395 = local56 >> 7 & 0x7;
								@Pc(2690) int local2690 = arg2 + local373 & 0x3F;
								local425 = local56 & 0x7F;
								local395 += arg3 / 4;
								if (local395 < 0) {
									local395 = 0;
								} else if (local395 > 7) {
									local395 = 7;
								}
								local425 += arg4;
								if (local425 < 0) {
									local425 = 0;
								} else if (local425 > 127) {
									local425 = 127;
								}
								this.aShortArray65[local50] = (short) (local395 << 7 | local2690 << 10 | local425);
								if (this.aClass166_6 != null) {
									this.aClass166_6.anInterface14_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass92Array1 != null) {
					for (local32 = 0; local32 < this.anInt4329; local32++) {
						local2585 = this.aClass92Array1[local32];
						local2590 = this.aClass292Array1[local32];
						local2590.anInt8317 = Static36.anIntArray31[this.aShortArray65[local2585.anInt2507] & 0xFFFF] & 0xFFFFFF | local2590.anInt8317 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray38.length) {
					local246 = this.anIntArrayArray38[local32];
					for (local248 = 0; local248 < local246.length; local248++) {
						local50 = local246[local248];
						if (this.aShortArray72 == null || (this.aShortArray72[local50] & arg6) != 0) {
							this.anIntArray361[local50] -= Static575.anInt9880;
							this.anIntArray363[local50] -= Static554.anInt9647;
							this.anIntArray360[local50] -= Static306.anInt5636;
							this.anIntArray361[local50] = this.anIntArray361[local50] * arg2 >> 7;
							this.anIntArray363[local50] = arg3 * this.anIntArray363[local50] >> 7;
							this.anIntArray360[local50] = this.anIntArray360[local50] * arg4 >> 7;
							this.anIntArray361[local50] += Static575.anInt9880;
							this.anIntArray363[local50] += Static554.anInt9647;
							this.anIntArray360[local50] += Static306.anInt5636;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static104.aBoolean121) {
				local373 = arg7[0] * Static575.anInt9880 + Static554.anInt9647 * arg7[3] + Static306.anInt5636 * arg7[6] + 8192 >> 14;
				local395 = Static306.anInt5636 * arg7[7] + arg7[4] * Static554.anInt9647 + arg7[1] * Static575.anInt9880 + 8192 >> 14;
				local425 = arg7[2] * Static575.anInt9880 + arg7[5] * Static554.anInt9647 + Static306.anInt5636 * arg7[8] + 8192 >> 14;
				local373 += local248;
				local395 += local50;
				Static554.anInt9647 = local395;
				local425 += local56;
				Static575.anInt9880 = local373;
				Static104.aBoolean121 = false;
				Static306.anInt5636 = local425;
			}
			local373 = arg2 << 15 >> 7;
			local395 = arg3 << 15 >> 7;
			local425 = arg4 << 15 >> 7;
			local452 = local373 * -Static575.anInt9880 + 8192 >> 14;
			local456 = -Static554.anInt9647 * local395 + 8192 >> 14;
			local460 = local425 * -Static306.anInt5636 + 8192 >> 14;
			local464 = Static575.anInt9880 + local452;
			local472 = local456 + Static554.anInt9647;
			local480 = local460 + Static306.anInt5636;
			@Pc(2011) int[] local2011 = new int[] { arg7[0] * local373 + 8192 >> 14, arg7[3] * local373 + 8192 >> 14, arg7[6] * local373 + 8192 >> 14, local395 * arg7[1] + 8192 >> 14, arg7[4] * local395 + 8192 >> 14, arg7[7] * local395 + 8192 >> 14, arg7[2] * local425 + 8192 >> 14, local425 * arg7[5] + 8192 >> 14, local425 * arg7[8] + 8192 >> 14 };
			local636 = local373 * local248 + 8192 >> 14;
			local661 = local395 * local50 + 8192 >> 14;
			@Pc(2139) int local2139 = local636 + local464;
			@Pc(2143) int local2143 = local661 + local472;
			local665 = local425 * local56 + 8192 >> 14;
			@Pc(2155) int local2155 = local665 + local480;
			@Pc(2158) int[] local2158 = new int[9];
			@Pc(2164) int local2164;
			for (local675 = 0; local675 < 3; local675++) {
				for (local2164 = 0; local2164 < 3; local2164++) {
					local680 = 0;
					for (local684 = 0; local684 < 3; local684++) {
						local680 += local2011[local2164 + local684 * 3] * arg7[local684 + local675 * 3];
					}
					local2158[local675 * 3 + local2164] = local680 + 8192 >> 14;
				}
			}
			local2164 = arg7[1] * local2143 + local2139 * arg7[0] + arg7[2] * local2155 + 8192 >> 14;
			local680 = arg7[5] * local2155 + local2143 * arg7[4] + arg7[3] * local2139 + 8192 >> 14;
			local684 = arg7[8] * local2155 + local2143 * arg7[7] + arg7[6] * local2139 + 8192 >> 14;
			local680 += local32;
			local2164 += local24;
			local684 += local38;
			for (local688 = 0; local688 < local8; local688++) {
				local690 = arg1[local688];
				if (this.anIntArrayArray38.length > local690) {
					local819 = this.anIntArrayArray38[local690];
					for (local821 = 0; local821 < local819.length; local821++) {
						local825 = local819[local821];
						if (this.aShortArray72 == null || (this.aShortArray72[local825] & arg6) != 0) {
							local829 = this.anIntArray360[local825] * local2158[2] + local2158[0] * this.anIntArray361[local825] + this.anIntArray363[local825] * local2158[1] + 8192 >> 14;
							local831 = this.anIntArray361[local825] * local2158[3] + this.anIntArray363[local825] * local2158[4] + local2158[5] * this.anIntArray360[local825] + 8192 >> 14;
							@Pc(2409) int local2409 = local831 + local680;
							local961 = this.anIntArray363[local825] * local2158[7] + this.anIntArray361[local825] * local2158[6] + this.anIntArray360[local825] * local2158[8] + 8192 >> 14;
							@Pc(2444) int local2444 = local829 + local2164;
							this.anIntArray361[local825] = local2444;
							@Pc(2453) int local2453 = local961 + local684;
							this.anIntArray363[local825] = local2409;
							this.anIntArray360[local825] = local2453;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < arg0 && arg6 > arg7 && arg3 > arg7) {
			return false;
		} else if (arg0 < arg7 && arg7 > arg6 && arg7 > arg3) {
			return false;
		} else if (arg1 > arg5 && arg2 > arg5 && arg5 < arg4) {
			return false;
		} else {
			return arg5 <= arg1 || arg2 >= arg5 || arg4 >= arg5;
		}
	}

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4371; local7++) {
			this.anIntArray360[local7] = -this.anIntArray360[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4331; local25++) {
			this.aShortArray75[local25] = (short) -this.aShortArray75[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4373; local48++) {
			@Pc(55) short local55 = this.aShortArray70[local48];
			this.aShortArray70[local48] = this.aShortArray73[local48];
			this.aShortArray73[local48] = local55;
		}
		if (this.aClass166_3 == null && this.aClass166_6 != null) {
			this.aClass166_6.anInterface14_4 = null;
		}
		if (this.aClass166_3 != null) {
			this.aClass166_3.anInterface14_4 = null;
		}
		if (this.aClass273_1 != null) {
			this.aClass273_1.anInterface15_5 = null;
		}
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
		this.aBoolean322 = false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZLclient!jc;BZLclient!jc;)Lclient!ba;")
	private Class24 method3726(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class24_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class24_Sub2 arg4) {
		arg4.aByte52 = 0;
		arg4.anInt4373 = this.anInt4373;
		arg4.anInt4354 = this.anInt4354;
		arg4.anInt4371 = this.anInt4371;
		arg4.anInt4361 = arg0;
		arg4.anInt4352 = this.anInt4352;
		arg4.aShort69 = this.aShort69;
		arg4.anInt4368 = this.anInt4368;
		arg4.aShort64 = this.aShort64;
		arg4.anInt4329 = this.anInt4329;
		arg4.anInt4331 = this.anInt4331;
		@Pc(53) boolean local53 = Static263.method4002(arg0, this.anInt4368);
		@Pc(59) boolean local59 = Static424.method5983(this.anInt4368, arg0);
		@Pc(65) boolean local65 = Static165.method2642(arg0, this.anInt4368);
		@Pc(71) boolean local71 = local59 | local53 | local65;
		@Pc(172) int local172;
		if (local71) {
			if (!local53) {
				arg4.anIntArray361 = this.anIntArray361;
			} else if (arg2.anIntArray361 == null || this.anInt4352 > arg2.anIntArray361.length) {
				arg4.anIntArray361 = arg2.anIntArray361 = new int[this.anInt4352];
			} else {
				arg4.anIntArray361 = arg2.anIntArray361;
			}
			if (!local59) {
				arg4.anIntArray363 = this.anIntArray363;
			} else if (arg2.anIntArray363 == null || this.anInt4352 > arg2.anIntArray363.length) {
				arg4.anIntArray363 = arg2.anIntArray363 = new int[this.anInt4352];
			} else {
				arg4.anIntArray363 = arg2.anIntArray363;
			}
			if (!local65) {
				arg4.anIntArray360 = this.anIntArray360;
			} else if (arg2.anIntArray360 == null || arg2.anIntArray360.length < this.anInt4352) {
				arg4.anIntArray360 = arg2.anIntArray360 = new int[this.anInt4352];
			} else {
				arg4.anIntArray360 = arg2.anIntArray360;
			}
			for (local172 = 0; local172 < this.anInt4352; local172++) {
				if (local53) {
					arg4.anIntArray361[local172] = this.anIntArray361[local172];
				}
				if (local59) {
					arg4.anIntArray363[local172] = this.anIntArray363[local172];
				}
				if (local65) {
					arg4.anIntArray360[local172] = this.anIntArray360[local172];
				}
			}
		} else {
			arg4.anIntArray363 = this.anIntArray363;
			arg4.anIntArray361 = this.anIntArray361;
			arg4.anIntArray360 = this.anIntArray360;
		}
		if (Static404.method5832(arg0, this.anInt4368)) {
			if (arg1) {
				arg4.aByte52 = (byte) (arg4.aByte52 | 0x1);
			}
			arg4.aClass166_5 = arg2.aClass166_5;
			arg4.aClass166_5.anInterface14_4 = this.aClass166_5.anInterface14_4;
			arg4.aClass166_5.aByte54 = this.aClass166_5.aByte54;
		} else if (Static506.method5540(arg0, this.anInt4368)) {
			arg4.aClass166_5 = this.aClass166_5;
		} else {
			arg4.aClass166_5 = null;
		}
		if (Static564.method7800(this.anInt4368, arg0)) {
			if (arg2.aShortArray65 == null || arg2.aShortArray65.length < this.anInt4373) {
				arg4.aShortArray65 = arg2.aShortArray65 = new short[this.anInt4373];
			} else {
				arg4.aShortArray65 = arg2.aShortArray65;
			}
			for (local172 = 0; local172 < this.anInt4373; local172++) {
				arg4.aShortArray65[local172] = this.aShortArray65[local172];
			}
		} else {
			arg4.aShortArray65 = this.aShortArray65;
		}
		if (Static23.method346(this.anInt4368, arg0)) {
			if (arg2.aByteArray57 == null || arg2.aByteArray57.length < this.anInt4373) {
				arg4.aByteArray57 = arg2.aByteArray57 = new byte[this.anInt4373];
			} else {
				arg4.aByteArray57 = arg2.aByteArray57;
			}
			for (local172 = 0; local172 < this.anInt4373; local172++) {
				arg4.aByteArray57[local172] = this.aByteArray57[local172];
			}
		} else {
			arg4.aByteArray57 = this.aByteArray57;
		}
		if (Static369.method5433(this.anInt4368, arg0)) {
			if (arg1) {
				arg4.aByte52 = (byte) (arg4.aByte52 | 0x2);
			}
			arg4.aClass166_6 = arg2.aClass166_6;
			arg4.aClass166_6.anInterface14_4 = this.aClass166_6.anInterface14_4;
			arg4.aClass166_6.aByte54 = this.aClass166_6.aByte54;
		} else if (Static169.method7350(this.anInt4368, arg0)) {
			arg4.aClass166_6 = this.aClass166_6;
		} else {
			arg4.aClass166_6 = null;
		}
		@Pc(535) int local535;
		if (Static391.method5695(arg0, this.anInt4368)) {
			if (arg2.aShortArray69 == null || this.anInt4331 > arg2.aShortArray69.length) {
				local172 = this.anInt4331;
				arg4.aShortArray75 = arg2.aShortArray75 = new short[local172];
				arg4.aShortArray68 = arg2.aShortArray68 = new short[local172];
				arg4.aShortArray69 = arg2.aShortArray69 = new short[local172];
			} else {
				arg4.aShortArray69 = arg2.aShortArray69;
				arg4.aShortArray75 = arg2.aShortArray75;
				arg4.aShortArray68 = arg2.aShortArray68;
			}
			if (this.aClass49_1 == null) {
				for (local172 = 0; local172 < this.anInt4331; local172++) {
					arg4.aShortArray69[local172] = this.aShortArray69[local172];
					arg4.aShortArray68[local172] = this.aShortArray68[local172];
					arg4.aShortArray75[local172] = this.aShortArray75[local172];
				}
			} else {
				if (arg2.aClass49_1 == null) {
					arg2.aClass49_1 = new Class49();
				}
				@Pc(523) Class49 local523 = arg4.aClass49_1 = arg2.aClass49_1;
				if (local523.aShortArray10 == null || local523.aShortArray10.length < this.anInt4331) {
					local535 = this.anInt4331;
					local523.aByteArray4 = new byte[local535];
					local523.aShortArray11 = new short[local535];
					local523.aShortArray10 = new short[local535];
					local523.aShortArray9 = new short[local535];
				}
				for (local535 = 0; local535 < this.anInt4331; local535++) {
					arg4.aShortArray69[local535] = this.aShortArray69[local535];
					arg4.aShortArray68[local535] = this.aShortArray68[local535];
					arg4.aShortArray75[local535] = this.aShortArray75[local535];
					local523.aShortArray10[local535] = this.aClass49_1.aShortArray10[local535];
					local523.aShortArray9[local535] = this.aClass49_1.aShortArray9[local535];
					local523.aShortArray11[local535] = this.aClass49_1.aShortArray11[local535];
					local523.aByteArray4[local535] = this.aClass49_1.aByteArray4[local535];
				}
			}
			arg4.aByteArray58 = this.aByteArray58;
		} else {
			arg4.aShortArray69 = this.aShortArray69;
			arg4.aShortArray68 = this.aShortArray68;
			arg4.aShortArray75 = this.aShortArray75;
			arg4.aByteArray58 = this.aByteArray58;
			arg4.aClass49_1 = this.aClass49_1;
		}
		if (Static451.method6337(arg0, this.anInt4368)) {
			arg4.aClass166_3 = arg2.aClass166_3;
			if (arg1) {
				arg4.aByte52 = (byte) (arg4.aByte52 | 0x4);
			}
			arg4.aClass166_3.anInterface14_4 = this.aClass166_3.anInterface14_4;
			arg4.aClass166_3.aByte54 = this.aClass166_3.aByte54;
		} else if (Static429.method6105(this.anInt4368, arg0)) {
			arg4.aClass166_3 = this.aClass166_3;
		} else {
			arg4.aClass166_3 = null;
		}
		if (Static362.method5387(arg0, this.anInt4368)) {
			if (arg2.aFloatArray30 == null || this.anInt4373 > arg2.aFloatArray30.length) {
				local172 = this.anInt4331;
				arg4.aFloatArray30 = arg2.aFloatArray30 = new float[local172];
				arg4.aFloatArray31 = arg2.aFloatArray31 = new float[local172];
			} else {
				arg4.aFloatArray31 = arg2.aFloatArray31;
				arg4.aFloatArray30 = arg2.aFloatArray30;
			}
			for (local172 = 0; local172 < this.anInt4331; local172++) {
				arg4.aFloatArray30[local172] = this.aFloatArray30[local172];
				arg4.aFloatArray31[local172] = this.aFloatArray31[local172];
			}
		} else {
			arg4.aFloatArray31 = this.aFloatArray31;
			arg4.aFloatArray30 = this.aFloatArray30;
		}
		if (Static359.method7509(this.anInt4368, arg0)) {
			arg4.aClass166_4 = arg2.aClass166_4;
			if (arg1) {
				arg4.aByte52 = (byte) (arg4.aByte52 | 0x8);
			}
			arg4.aClass166_4.aByte54 = this.aClass166_4.aByte54;
			arg4.aClass166_4.anInterface14_4 = this.aClass166_4.anInterface14_4;
		} else if (Static422.method5978(this.anInt4368, arg0)) {
			arg4.aClass166_4 = this.aClass166_4;
		} else {
			arg4.aClass166_4 = null;
		}
		if (Static277.method4167(arg0, this.anInt4368)) {
			if (arg2.aShortArray70 == null || arg2.aShortArray70.length < this.anInt4373) {
				local172 = this.anInt4373;
				arg4.aShortArray70 = arg2.aShortArray70 = new short[local172];
				arg4.aShortArray73 = arg2.aShortArray73 = new short[local172];
				arg4.aShortArray74 = arg2.aShortArray74 = new short[local172];
			} else {
				arg4.aShortArray74 = arg2.aShortArray74;
				arg4.aShortArray70 = arg2.aShortArray70;
				arg4.aShortArray73 = arg2.aShortArray73;
			}
			for (local172 = 0; local172 < this.anInt4373; local172++) {
				arg4.aShortArray70[local172] = this.aShortArray70[local172];
				arg4.aShortArray74[local172] = this.aShortArray74[local172];
				arg4.aShortArray73[local172] = this.aShortArray73[local172];
			}
		} else {
			arg4.aShortArray70 = this.aShortArray70;
			arg4.aShortArray74 = this.aShortArray74;
			arg4.aShortArray73 = this.aShortArray73;
		}
		if (Static133.method2179(arg0, this.anInt4368)) {
			if (arg1) {
				arg4.aByte52 = (byte) (arg4.aByte52 | 0x10);
			}
			arg4.aClass273_1 = arg2.aClass273_1;
			arg4.aClass273_1.anInterface15_5 = this.aClass273_1.anInterface15_5;
		} else if (Static483.method6799(arg0, this.anInt4368)) {
			arg4.aClass273_1 = this.aClass273_1;
		} else {
			arg4.aClass273_1 = null;
		}
		if (Static224.method3525(this.anInt4368, arg0)) {
			if (arg2.aShortArray67 == null || arg2.aShortArray67.length < this.anInt4373) {
				local172 = this.anInt4373;
				arg4.aShortArray67 = arg2.aShortArray67 = new short[local172];
			} else {
				arg4.aShortArray67 = arg2.aShortArray67;
			}
			for (local172 = 0; local172 < this.anInt4373; local172++) {
				arg4.aShortArray67[local172] = this.aShortArray67[local172];
			}
		} else {
			arg4.aShortArray67 = this.aShortArray67;
		}
		if (!Static149.method4034(arg0, this.anInt4368)) {
			arg4.aClass292Array1 = this.aClass292Array1;
		} else if (arg2.aClass292Array1 == null || this.anInt4329 > arg2.aClass292Array1.length) {
			local172 = this.anInt4329;
			arg4.aClass292Array1 = arg2.aClass292Array1 = new Class292[local172];
			for (local535 = 0; local535 < this.anInt4329; local535++) {
				arg4.aClass292Array1[local535] = this.aClass292Array1[local535].method6552();
			}
		} else {
			arg4.aClass292Array1 = arg2.aClass292Array1;
			for (local172 = 0; local172 < this.anInt4329; local172++) {
				arg4.aClass292Array1[local172].method6555(this.aClass292Array1[local172]);
			}
		}
		arg4.anIntArrayArray40 = this.anIntArrayArray40;
		arg4.anIntArray358 = this.anIntArray358;
		arg4.aClass33Array5 = this.aClass33Array5;
		arg4.aClass92Array1 = this.aClass92Array1;
		arg4.aClass335Array5 = this.aClass335Array5;
		if (this.aBoolean322) {
			arg4.aShort67 = this.aShort67;
			arg4.aShort70 = this.aShort70;
			arg4.aShort62 = this.aShort62;
			arg4.aBoolean322 = true;
			arg4.aShort63 = this.aShort63;
			arg4.aShort65 = this.aShort65;
			arg4.aShort66 = this.aShort66;
			arg4.aShort68 = this.aShort68;
		} else {
			arg4.aBoolean322 = false;
		}
		arg4.aShortArray71 = this.aShortArray71;
		arg4.anIntArrayArray38 = this.anIntArrayArray38;
		arg4.anIntArray359 = this.anIntArray359;
		arg4.aShortArray72 = this.aShortArray72;
		arg4.aShortArray66 = this.aShortArray66;
		arg4.anIntArrayArray39 = this.anIntArrayArray39;
		return arg4;
	}

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort69;
	}

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4371; local15++) {
			local33 = local13 * this.anIntArray361[local15] + this.anIntArray360[local15] * local9 >> 14;
			this.anIntArray360[local15] = local13 * this.anIntArray360[local15] - this.anIntArray361[local15] * local9 >> 14;
			this.anIntArray361[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4331; local33++) {
			@Pc(84) int local84 = this.aShortArray75[local33] * local9 + this.aShortArray69[local33] * local13 >> 14;
			this.aShortArray75[local33] = (short) (local13 * this.aShortArray75[local33] - this.aShortArray69[local33] * local9 >> 14);
			this.aShortArray69[local33] = (short) local84;
		}
		if (this.aClass166_3 == null && this.aClass166_6 != null) {
			this.aClass166_6.anInterface14_4 = null;
		}
		if (this.aClass166_3 != null) {
			this.aClass166_3.anInterface14_4 = null;
		}
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
		this.aBoolean322 = false;
	}

	@OriginalMember(owner = "client!jc", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		this.anInt4361 = arg0;
		if (this.aClass49_1 != null && (this.anInt4361 & 0x10000) == 0) {
			this.aByteArray58 = this.aClass49_1.aByteArray4;
			this.aShortArray75 = this.aClass49_1.aShortArray11;
			this.aShortArray69 = this.aClass49_1.aShortArray10;
			this.aShortArray68 = this.aClass49_1.aShortArray9;
			this.aClass49_1 = null;
		}
		this.aBoolean321 = true;
		this.method3719();
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	private void method3729() {
		if (this.anInt4354 == 0) {
			return;
		}
		if (this.aByte52 != 0) {
			this.method3716(true);
		}
		this.method3716(false);
		if (this.aClass273_1 != null) {
			if (this.aClass273_1.anInterface15_5 == null) {
				this.method3717((this.aByte52 & 0x10) != 0);
			}
			if (this.aClass273_1.anInterface15_5 != null) {
				this.aClass90_Sub1_20.method2099(this.aClass166_3 != null);
				this.aClass90_Sub1_20.method2066(this.aClass166_5, this.aClass166_4, this.aClass166_6, this.aClass166_3);
				@Pc(82) int local82 = this.anIntArray358.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray358[local84];
					@Pc(98) int local98 = this.anIntArray358[local84 + 1];
					@Pc(105) int local105 = this.aShortArray67[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass90_Sub1_20.method2082(this.aClass166_3 != null, local105);
					this.aClass90_Sub1_20.method2144((local98 - local91) * 3, this.aClass273_1.anInterface15_5, local91 * 3);
				}
			}
		}
		this.method3719();
	}

	@OriginalMember(owner = "client!jc", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean322) {
			this.method3721();
		}
		@Pc(16) int local16 = this.aShort62 + arg4;
		@Pc(21) int local21 = this.aShort68 + arg4;
		@Pc(26) int local26 = this.aShort66 + arg6;
		@Pc(31) int local31 = this.aShort67 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9998 >> arg2.anInt10000 >= arg2.anInt9997 || local26 < 0 || arg2.anInt9998 + local31 >> arg2.anInt10000 >= arg2.anInt9995)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9998 + local21 >> arg3.anInt10000 >= arg3.anInt9997 || local26 < 0 || local31 + arg3.anInt9998 >> arg3.anInt10000 >= arg3.anInt9995) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10000;
			local21 = local21 + arg2.anInt9998 - 1 >> arg2.anInt10000;
			local26 >>= arg2.anInt10000;
			local31 = arg2.anInt9998 + local31 - 1 >> arg2.anInt10000;
			if (arg2.JA(local16, local26) == arg5 && arg5 == arg2.JA(local21, local26) && arg5 == arg2.JA(local16, local31) && arg5 == arg2.JA(local21, local31)) {
				return;
			}
		}
		@Pc(284) int local284;
		if (arg0 == 1) {
			for (local284 = 0; local284 < this.anInt4371; local284++) {
				this.anIntArray363[local284] = this.anIntArray363[local284] + arg2.sa(this.anIntArray361[local284] + arg4, this.anIntArray360[local284] - -arg6) - arg5;
			}
		} else {
			@Pc(210) int local210;
			@Pc(221) int local221;
			if (arg0 == 2) {
				@Pc(205) short local205 = this.aShort65;
				if (local205 == 0) {
					return;
				}
				for (local210 = 0; local210 < this.anInt4371; local210++) {
					local221 = (this.anIntArray363[local210] << 16) / local205;
					if (local221 < arg1) {
						this.anIntArray363[local210] += (arg1 - local221) * (-arg5 + arg2.sa(arg4 + this.anIntArray361[local210], arg6 + this.anIntArray360[local210])) / arg1;
					}
				}
			} else {
				@Pc(357) int local357;
				if (arg0 == 3) {
					local284 = (arg1 & 0xFF) * 4;
					local210 = (arg1 >> 8 & 0xFF) * 4;
					local221 = (arg1 >> 16 & 0xFF) << 6;
					local357 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local284 >> 1) < 0 || arg2.anInt9997 << arg2.anInt10000 <= arg2.anInt9998 + (local284 >> 1) + arg4 || arg6 - (local210 >> 1) < 0 || arg2.anInt9995 << arg2.anInt10000 <= arg2.anInt9998 + (local210 >> 1) + arg6) {
						return;
					}
					this.method7396(arg4, arg5, local221, arg6, local357, local210, local284, arg2);
				} else if (arg0 == 4) {
					local284 = this.aShort63 - this.aShort65;
					for (local210 = 0; local210 < this.anInt4371; local210++) {
						this.anIntArray363[local210] -= arg5 - arg3.sa(arg4 + this.anIntArray361[local210], arg6 + this.anIntArray360[local210]) - local284;
					}
				} else if (arg0 == 5) {
					local284 = this.aShort63 - this.aShort65;
					for (local210 = 0; local210 < this.anInt4371; local210++) {
						local221 = arg4 + this.anIntArray361[local210];
						local357 = arg6 + this.anIntArray360[local210];
						@Pc(362) int local362 = arg2.sa(local221, local357);
						@Pc(367) int local367 = arg3.sa(local221, local357);
						@Pc(374) int local374 = local362 - local367 - arg1;
						this.anIntArray363[local210] = ((this.anIntArray363[local210] << 8) / local284 * local374 >> 8) - (arg5 - local362);
					}
				}
			}
		}
		this.aBoolean322 = false;
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4373; local7++) {
			local16 = this.aShortArray65[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local47 += (arg2 - local47) * arg3 >> 7;
			}
			this.aShortArray65[local7] = (short) (local47 | local22 << 10 | local28 << 7);
		}
		if (this.aClass92Array1 != null) {
			for (local16 = 0; local16 < this.anInt4329; local16++) {
				@Pc(109) Class92 local109 = this.aClass92Array1[local16];
				@Pc(114) Class292 local114 = this.aClass292Array1[local16];
				local114.anInt8317 = Static36.anIntArray31[this.aShortArray65[local109.anInt2507] & 0xFFFF] & 0xFFFFFF | local114.anInt8317 & 0xFF000000;
			}
		}
		if (this.aClass166_6 != null) {
			this.aClass166_6.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22.anIntArray20[arg0];
		@Pc(13) int local13 = Class22.anIntArray19[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4371; local15++) {
			@Pc(33) int local33 = this.anIntArray361[local15] * local13 + local9 * this.anIntArray360[local15] >> 14;
			this.anIntArray360[local15] = this.anIntArray360[local15] * local13 - this.anIntArray361[local15] * local9 >> 14;
			this.anIntArray361[local15] = local33;
		}
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
		this.aBoolean322 = false;
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4371; local7++) {
			if (arg0 != 128) {
				this.anIntArray361[local7] = arg0 * this.anIntArray361[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray363[local7] = arg1 * this.anIntArray363[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray360[local7] = this.anIntArray360[local7] * arg2 >> 7;
			}
		}
		this.aBoolean322 = false;
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!q;Lclient!rc;I)V")
	@Override
	public void method7393(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4331 == 0) {
			return;
		}
		@Pc(13) Class93_Sub2 local13 = this.aClass90_Sub1_20.aClass93_Sub2_4;
		if (!this.aBoolean322) {
			this.method3721();
		}
		@Pc(22) Class93_Sub2 local22 = (Class93_Sub2) arg0;
		Static2.aFloat1 = local22.aFloat96 * local13.aFloat94 + local22.aFloat104 * local13.aFloat103 + local22.aFloat100 * local13.aFloat105 + local13.aFloat100;
		Static430.aFloat166 = local13.aFloat105 * local22.aFloat103 + local22.aFloat101 * local13.aFloat103 + local22.aFloat95 * local13.aFloat94;
		@Pc(69) float local69 = Static2.aFloat1 + Static430.aFloat166 * (float) this.aShort65;
		@Pc(77) float local77 = (float) this.aShort63 * Static430.aFloat166 + Static2.aFloat1;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local94 = local69 + (float) this.aShort70;
			local88 = (float) -this.aShort70 + local77;
		} else {
			local88 = (float) -this.aShort70 + local69;
			local94 = (float) this.aShort70 + local77;
		}
		if (local88 >= this.aClass90_Sub1_20.aFloat53 || local94 <= (float) this.aClass90_Sub1_20.anInt2477) {
			return;
		}
		Static217.aFloat93 = local13.aFloat96 + local22.aFloat100 * local13.aFloat102 + local13.aFloat95 * local22.aFloat104 + local13.aFloat98 * local22.aFloat96;
		Static175.aFloat67 = local13.aFloat98 * local22.aFloat95 + local22.aFloat101 * local13.aFloat95 + local22.aFloat103 * local13.aFloat102;
		@Pc(171) float local171 = (float) this.aShort65 * Static175.aFloat67 + Static217.aFloat93;
		@Pc(179) float local179 = Static217.aFloat93 + Static175.aFloat67 * (float) this.aShort63;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local179 < local171) {
			local194 = (float) this.aClass90_Sub1_20.anInt2465 * ((float) this.aShort70 + local171);
			local206 = (float) this.aClass90_Sub1_20.anInt2465 * (local179 - (float) this.aShort70);
		} else {
			local194 = (float) this.aClass90_Sub1_20.anInt2465 * (local179 + (float) this.aShort70);
			local206 = ((float) -this.aShort70 + local171) * (float) this.aClass90_Sub1_20.anInt2465;
		}
		if (this.aClass90_Sub1_20.aFloat42 <= local206 / local94 || this.aClass90_Sub1_20.aFloat59 >= local194 / local94) {
			return;
		}
		Static487.aFloat178 = local22.aFloat103 * local13.aFloat97 + local13.aFloat101 * local22.aFloat101 + local13.aFloat99 * local22.aFloat95;
		Static373.aFloat158 = local22.aFloat104 * local13.aFloat101 + local13.aFloat99 * local22.aFloat96 + local22.aFloat100 * local13.aFloat97 + local13.aFloat104;
		@Pc(295) float local295 = Static373.aFloat158 + Static487.aFloat178 * (float) this.aShort65;
		@Pc(303) float local303 = Static487.aFloat178 * (float) this.aShort63 + Static373.aFloat158;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local295 > local303) {
			local330 = (float) this.aClass90_Sub1_20.anInt2470 * (local295 + (float) this.aShort70);
			local319 = (float) this.aClass90_Sub1_20.anInt2470 * ((float) -this.aShort70 + local303);
		} else {
			local319 = ((float) -this.aShort70 + local295) * (float) this.aClass90_Sub1_20.anInt2470;
			local330 = ((float) this.aShort70 + local303) * (float) this.aClass90_Sub1_20.anInt2470;
		}
		if (this.aClass90_Sub1_20.aFloat43 <= local319 / local94 || this.aClass90_Sub1_20.aFloat51 >= local330 / local94) {
			return;
		}
		if (arg1 != null || this.aClass92Array1 != null) {
			Static545.aFloat187 = local22.aFloat105 * local13.aFloat105 + local22.aFloat97 * local13.aFloat103 + local13.aFloat94 * local22.aFloat102;
			Static486.aFloat177 = local22.aFloat98 * local13.aFloat98 + local22.aFloat99 * local13.aFloat95 + local22.aFloat94 * local13.aFloat102;
			Static439.aFloat167 = local13.aFloat94 * local22.aFloat98 + local13.aFloat103 * local22.aFloat99 + local22.aFloat94 * local13.aFloat105;
			Static578.aFloat211 = local22.aFloat98 * local13.aFloat99 + local13.aFloat101 * local22.aFloat99 + local22.aFloat94 * local13.aFloat97;
			Static205.aFloat92 = local22.aFloat105 * local13.aFloat97 + local13.aFloat101 * local22.aFloat97 + local22.aFloat102 * local13.aFloat99;
			Static154.aFloat65 = local13.aFloat102 * local22.aFloat105 + local22.aFloat97 * local13.aFloat95 + local13.aFloat98 * local22.aFloat102;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(501) int local501 = this.aShort62 + this.aShort68 >> 1;
			@Pc(509) int local509 = this.aShort67 + this.aShort66 >> 1;
			@Pc(528) int local528 = (int) (Static154.aFloat65 * (float) local509 + Static217.aFloat93 + (float) local501 * Static486.aFloat177 + (float) this.aShort65 * Static175.aFloat67);
			@Pc(547) int local547 = (int) (Static205.aFloat92 * (float) local509 + Static578.aFloat211 * (float) local501 + Static373.aFloat158 + (float) this.aShort65 * Static487.aFloat178);
			@Pc(566) int local566 = (int) (Static2.aFloat1 + (float) local501 * Static439.aFloat167 + Static430.aFloat166 * (float) this.aShort65 + (float) local509 * Static545.aFloat187);
			if (this.aClass90_Sub1_20.anInt2477 > local566) {
				local490 = true;
			} else {
				arg1.anInt7807 = local547 * this.aClass90_Sub1_20.anInt2470 / local566 + this.aClass90_Sub1_20.anInt2448;
				arg1.anInt7808 = this.aClass90_Sub1_20.anInt2465 * local528 / local566 + this.aClass90_Sub1_20.anInt2473;
			}
			@Pc(620) int local620 = (int) ((float) local501 * Static486.aFloat177 + Static217.aFloat93 + (float) this.aShort63 * Static175.aFloat67 + (float) local509 * Static154.aFloat65);
			@Pc(639) int local639 = (int) ((float) local509 * Static205.aFloat92 + Static373.aFloat158 + (float) local501 * Static578.aFloat211 + Static487.aFloat178 * (float) this.aShort63);
			@Pc(658) int local658 = (int) (Static439.aFloat167 * (float) local501 + Static2.aFloat1 + (float) this.aShort63 * Static430.aFloat166 + (float) local509 * Static545.aFloat187);
			if (this.aClass90_Sub1_20.anInt2477 > local658) {
				local490 = true;
			} else {
				arg1.anInt7810 = this.aClass90_Sub1_20.anInt2470 * local639 / local658 + this.aClass90_Sub1_20.anInt2448;
				arg1.anInt7809 = this.aClass90_Sub1_20.anInt2473 + local620 * this.aClass90_Sub1_20.anInt2465 / local658;
			}
			if (local490) {
				if (this.aClass90_Sub1_20.anInt2477 > local566 && this.aClass90_Sub1_20.anInt2477 > local658) {
					local492 = false;
				} else {
					@Pc(729) int local729;
					@Pc(740) int local740;
					@Pc(768) int local768;
					if (local566 < this.aClass90_Sub1_20.anInt2477) {
						local729 = (local658 - this.aClass90_Sub1_20.anInt2477 << 16) / (local658 - local566);
						local740 = local620 + (local729 * (local620 - local528) >> 16);
						arg1.anInt7808 = this.aClass90_Sub1_20.anInt2473 + local740 * this.aClass90_Sub1_20.anInt2465 / this.aClass90_Sub1_20.anInt2477;
						local768 = local639 + ((local639 - local547) * local729 >> 16);
						arg1.anInt7807 = this.aClass90_Sub1_20.anInt2448 + this.aClass90_Sub1_20.anInt2470 * local768 / this.aClass90_Sub1_20.anInt2477;
					} else if (this.aClass90_Sub1_20.anInt2477 > local658) {
						local729 = (local566 - this.aClass90_Sub1_20.anInt2477 << 16) / (local566 - local658);
						local740 = local528 + (local729 * (local528 - local620) >> 16);
						arg1.anInt7808 = this.aClass90_Sub1_20.anInt2473 + local740 * this.aClass90_Sub1_20.anInt2465 / this.aClass90_Sub1_20.anInt2477;
						local768 = local547 + ((local547 - local639) * local729 >> 16);
						arg1.anInt7807 = local768 * this.aClass90_Sub1_20.anInt2470 / this.aClass90_Sub1_20.anInt2477 + this.aClass90_Sub1_20.anInt2448;
					}
				}
			}
			if (local492) {
				arg1.aBoolean513 = true;
				if (local658 >= local566) {
					arg1.anInt7806 = this.aClass90_Sub1_20.anInt2473 + this.aClass90_Sub1_20.anInt2465 * (local620 + this.aShort70) / local658 - arg1.anInt7809;
				} else {
					arg1.anInt7806 = this.aClass90_Sub1_20.anInt2465 * (this.aShort70 + local528) / local566 + this.aClass90_Sub1_20.anInt2473 - arg1.anInt7808;
				}
			}
		}
		this.aClass90_Sub1_20.method2122();
		this.aClass90_Sub1_20.method2109(local22);
		this.method3729();
		this.aClass90_Sub1_20.method2075();
		this.method3718();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()[Lclient!bh;")
	@Override
	public Class33[] method7383() {
		return this.aClass33Array5;
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt4361;
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4371; local3++) {
			if (arg0 != 0) {
				this.anIntArray361[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray363[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray360[local3] += arg2;
			}
		}
		if (this.aClass166_5 != null) {
			this.aClass166_5.anInterface14_4 = null;
		}
		this.aBoolean322 = false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!mv;)V")
	private void method3730(@OriginalArg(1) Class6_Sub5_Sub10_Sub2 arg0) {
		if (this.anInt4331 > this.aClass90_Sub1_20.anIntArray190.length) {
			this.aClass90_Sub1_20.anIntArray190 = new int[this.anInt4331];
			this.aClass90_Sub1_20.anIntArray188 = new int[this.anInt4331];
		}
		@Pc(32) int[] local32 = this.aClass90_Sub1_20.anIntArray190;
		@Pc(36) int[] local36 = this.aClass90_Sub1_20.anIntArray188;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(38) int local38 = 0; local38 < this.anInt4371; local38++) {
			local65 = (this.anIntArray361[local38] - (this.anIntArray363[local38] * this.aClass90_Sub1_20.anInt2478 >> 8) >> this.aClass90_Sub1_20.anInt2433) - arg0.anInt6252;
			@Pc(90) int local90 = (this.anIntArray360[local38] - (this.aClass90_Sub1_20.anInt2444 * this.anIntArray363[local38] >> 8) >> this.aClass90_Sub1_20.anInt2433) - arg0.anInt6246;
			@Pc(95) int local95 = this.anIntArray359[local38];
			@Pc(102) int local102 = this.anIntArray359[local38 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray71[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local32[local113] = local65;
				local36[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt4354; local65++) {
			if (this.aByteArray57 == null || this.aByteArray57[local65] <= 128) {
				@Pc(156) short local156 = this.aShortArray70[local65];
				@Pc(161) short local161 = this.aShortArray74[local65];
				@Pc(166) short local166 = this.aShortArray73[local65];
				local104 = local32[local156];
				local113 = local32[local161];
				@Pc(178) int local178 = local32[local166];
				@Pc(182) int local182 = local36[local156];
				@Pc(186) int local186 = local36[local161];
				@Pc(190) int local190 = local36[local166];
				if ((local186 - local190) * (local104 - local113) - (local178 - local113) * (local186 - local182) > 0) {
					arg0.method5063(local178, local190, local113, local186, local182, local104);
				}
			}
		}
	}
}
