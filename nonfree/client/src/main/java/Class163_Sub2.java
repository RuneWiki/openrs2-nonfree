import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class163_Sub2 extends Class163 {

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "[I")
	private int[] anIntArray535;

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
	private int anInt5774;

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!sg", name = "V", descriptor = "[Lclient!r;")
	private Class212[] aClass212Array1;

	@OriginalMember(owner = "client!sg", name = "X", descriptor = "Lclient!qt;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!sg", name = "Y", descriptor = "B")
	private byte aByte73;

	@OriginalMember(owner = "client!sg", name = "cb", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!sg", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!sg", name = "lb", descriptor = "[Lclient!dh;")
	private Class52[] lb;

	@OriginalMember(owner = "client!sg", name = "nb", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!sg", name = "ob", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!sg", name = "qb", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!sg", name = "sb", descriptor = "[Lclient!ru;")
	private Class224[] aClass224Array1;

	@OriginalMember(owner = "client!sg", name = "tb", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!sg", name = "ub", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!sg", name = "wb", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sg", name = "Bb", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!sg", name = "Cb", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!sg", name = "Hb", descriptor = "I")
	private int anInt5800;

	@OriginalMember(owner = "client!sg", name = "Kb", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!sg", name = "Lb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!sg", name = "Ob", descriptor = "Lclient!lm;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!sg", name = "Qb", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!sg", name = "Tb", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!sg", name = "Zb", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!sg", name = "ac", descriptor = "I")
	private int anInt5811;

	@OriginalMember(owner = "client!sg", name = "hc", descriptor = "[Lclient!ng;")
	private Class167[] aClass167Array4;

	@OriginalMember(owner = "client!sg", name = "ic", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!sg", name = "jc", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!sg", name = "mc", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!sg", name = "nc", descriptor = "Lclient!oj;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!sg", name = "sc", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
	private int anInt5773 = 0;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
	private int anInt5770 = 0;

	@OriginalMember(owner = "client!sg", name = "ib", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
	private int anInt5786 = 0;

	@OriginalMember(owner = "client!sg", name = "Nb", descriptor = "I")
	private int anInt5804 = 0;

	@OriginalMember(owner = "client!sg", name = "kb", descriptor = "I")
	private int anInt5788 = 0;

	@OriginalMember(owner = "client!sg", name = "Ab", descriptor = "Z")
	private boolean aBoolean388 = true;

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_36;

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "Lclient!ft;")
	private Class87 aClass87_10;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "Lclient!ft;")
	private Class87 aClass87_9;

	@OriginalMember(owner = "client!sg", name = "S", descriptor = "Lclient!ft;")
	private Class87 aClass87_11;

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "Lclient!ft;")
	private Class87 aClass87_8;

	@OriginalMember(owner = "client!sg", name = "Pb", descriptor = "Lclient!cp;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class163_Sub2(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aClass51_Sub2_36 = arg0;
		this.aClass87_10 = new Class87(null, 5126, 3, 0);
		this.aClass87_9 = new Class87(null, 5126, 2, 0);
		this.aClass87_11 = new Class87(null, 5126, 3, 0);
		this.aClass87_8 = new Class87(null, 5121, 4, 0);
		this.aClass44_1 = new Class44();
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!vd;Lclient!io;IIII)V")
	public Class163_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5811 = arg2;
		this.anInt5774 = arg5;
		this.aClass51_Sub2_36 = arg0;
		if (Static273.method3654(arg2, arg5)) {
			this.aClass87_10 = new Class87(null, 5126, 3, 0);
		}
		if (Static42.method575(arg2, arg5)) {
			this.aClass87_9 = new Class87(null, 5126, 2, 0);
		}
		if (Static175.method2538(arg2, arg5)) {
			this.aClass87_11 = new Class87(null, 5126, 3, 0);
		}
		if (Static449.method5706(arg2, arg5)) {
			this.aClass87_8 = new Class87(null, 5121, 4, 0);
		}
		if (Static71.method1185(arg5, arg2)) {
			this.aClass44_1 = new Class44();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_8;
		this.anIntArray537 = new int[arg1.anInt3210 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt3202];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt3202; local115++) {
			if ((arg1.aByteArray51 == null || arg1.aByteArray51[local115] != 2) && (arg1.aShortArray58 == null || arg1.aShortArray58[local115] == -1 || !local102.method3138(arg1.aShortArray58[local115] & 0xFFFF).aBoolean366)) {
				local113[this.anInt5788++] = local115;
				this.anIntArray537[arg1.aShortArray55[local115]]++;
				this.anIntArray537[arg1.aShortArray53[local115]]++;
				this.anIntArray537[arg1.aShortArray57[local115]]++;
			}
		}
		this.anInt5804 = this.anInt5788;
		@Pc(203) long[] local203 = new long[this.anInt5788];
		@Pc(212) boolean local212 = (this.anInt5811 & 0x100) != 0;
		@Pc(224) int local224;
		@Pc(235) int local235;
		@Pc(358) int local358;
		label488: for (@Pc(214) int local214 = 0; local214 < this.anInt5788; local214++) {
			@Pc(220) int local220 = local113[local214];
			@Pc(222) Class203 local222 = null;
			local224 = 0;
			@Pc(226) byte local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			if (arg1.aClass194Array1 != null) {
				for (local235 = 0; local235 < arg1.aClass194Array1.length; local235++) {
					@Pc(242) Class194 local242 = arg1.aClass194Array1[local235];
					if (local242.anInt5148 == local220) {
						@Pc(255) Class15 local255 = Static302.method4032(local242.anInt5151);
						if (local255.aBoolean2) {
							local203[local214] = Long.MAX_VALUE;
							this.anInt5804--;
							continue label488;
						}
					}
				}
			}
			@Pc(278) short local278 = -1;
			if (arg1.aShortArray58 != null) {
				local278 = arg1.aShortArray58[local220];
				if (local278 != -1) {
					local222 = local102.method3138(local278 & 0xFFFF);
					local230 = local222.aByte60;
					local228 = local222.aByte59;
				}
			}
			@Pc(320) boolean local320 = arg1.aByteArray49 != null && arg1.aByteArray49[local220] != 0 || local222 != null && !local222.aBoolean361;
			if ((local212 || local320) && arg1.aByteArray53 != null) {
				local224 += arg1.aByteArray53[local220] << 17;
			}
			if (local320) {
				local224 += 65536;
			}
			local224 += (local228 & 0xFF) << 8;
			local358 = local226 + ((local278 & 0xFFFF) << 16);
			local224 += local230 & 0xFF;
			@Pc(370) int local370 = local358 + (local214 & 0xFFFF);
			local203[local214] = ((long) local224 << 32) + ((long) local370);
		}
		Static109.method1894(local113, local203);
		this.anInt5773 = arg1.anInt3210;
		this.anIntArray536 = arg1.anIntArray275;
		this.anInt5770 = arg1.anInt3213;
		this.aShortArray109 = arg1.aShortArray54;
		this.anIntArray534 = arg1.anIntArray284;
		this.anIntArray538 = arg1.anIntArray283;
		@Pc(418) Class261[] local418 = new Class261[this.anInt5773];
		this.lb = arg1.aClass52Array2;
		this.aClass167Array4 = arg1.aClass167Array2;
		@Pc(446) int local446;
		@Pc(460) int local460;
		if (arg1.aClass194Array1 != null) {
			this.anInt5800 = arg1.aClass194Array1.length;
			this.aClass224Array1 = new Class224[this.anInt5800];
			this.aClass212Array1 = new Class212[this.anInt5800];
			for (local446 = 0; local446 < this.anInt5800; local446++) {
				@Pc(453) Class194 local453 = arg1.aClass194Array1[local446];
				@Pc(458) Class15 local458 = Static302.method4032(local453.anInt5151);
				local460 = -1;
				for (@Pc(462) int local462 = 0; local462 < this.anInt5788; local462++) {
					if (local453.anInt5148 == local113[local462]) {
						local460 = local462;
						break;
					}
				}
				if (local460 == -1) {
					throw new RuntimeException();
				}
				local235 = Static165.anIntArray263[arg1.aShortArray59[local453.anInt5148] & 0xFFFF] & 0xFFFFFF;
				local235 |= 255 - (arg1.aByteArray49 == null ? 0 : arg1.aByteArray49[local453.anInt5148]) << 24;
				this.aClass224Array1[local446] = new Class224(local460, arg1.aShortArray55[local453.anInt5148], arg1.aShortArray53[local453.anInt5148], arg1.aShortArray57[local453.anInt5148], local458.anInt161, local458.anInt163, local458.anInt166, local458.anInt160, local458.anInt159, local458.aBoolean2, local458.aBoolean3, local453.anInt5152);
				this.aClass212Array1[local446] = new Class212(local235);
			}
		}
		local446 = this.anInt5788 * 3;
		Static170.aLongArray9 = new long[local446];
		this.aShortArray100 = new short[local446];
		this.aShort79 = (short) arg4;
		this.aByteArray84 = new byte[this.anInt5788];
		this.aShort81 = (short) arg3;
		this.aShortArray107 = new short[this.anInt5788];
		this.aShortArray104 = new short[local446];
		this.aShortArray103 = new short[this.anInt5788];
		this.aByteArray85 = new byte[local446];
		this.aShortArray105 = new short[this.anInt5788];
		if (arg1.aShortArray56 != null) {
			this.aShortArray102 = new short[this.anInt5788];
		}
		this.aFloatArray26 = new float[local446];
		this.aShortArray101 = new short[this.anInt5788];
		this.aShortArray108 = new short[local446];
		this.aFloatArray25 = new float[local446];
		this.aShortArray99 = new short[this.anInt5788];
		this.aShortArray106 = new short[local446];
		local224 = 0;
		for (local358 = 0; local358 < arg1.anInt3210; local358++) {
			local460 = this.anIntArray537[local358];
			this.anIntArray537[local358] = local224;
			local224 += local460;
			local418[local358] = new Class261();
		}
		this.anIntArray537[arg1.anInt3210] = local224;
		@Pc(689) int[] local689 = null;
		@Pc(691) int[] local691 = null;
		@Pc(693) int[] local693 = null;
		@Pc(695) float[][] local695 = null;
		@Pc(721) int local721;
		@Pc(760) int local760;
		@Pc(766) int local766;
		@Pc(779) int local779;
		@Pc(781) int local781;
		@Pc(817) int local817;
		@Pc(822) int local822;
		@Pc(995) float local995;
		@Pc(980) float local980;
		@Pc(989) float local989;
		if (arg1.aByteArray47 != null) {
			@Pc(701) int local701 = arg1.anInt3214;
			@Pc(704) int[] local704 = new int[local701];
			@Pc(707) int[] local707 = new int[local701];
			@Pc(710) int[] local710 = new int[local701];
			@Pc(713) int[] local713 = new int[local701];
			@Pc(716) int[] local716 = new int[local701];
			@Pc(719) int[] local719 = new int[local701];
			for (local721 = 0; local721 < local701; local721++) {
				local704[local721] = Integer.MAX_VALUE;
				local707[local721] = -2147483647;
				local710[local721] = Integer.MAX_VALUE;
				local713[local721] = -2147483647;
				local716[local721] = Integer.MAX_VALUE;
				local719[local721] = -2147483647;
			}
			local689 = new int[local701];
			for (local760 = 0; local760 < this.anInt5788; local760++) {
				local766 = local113[local760];
				if (arg1.aByteArray47[local766] != -1) {
					local779 = arg1.aByteArray47[local766] & 0xFF;
					for (local781 = 0; local781 < 3; local781++) {
						@Pc(793) short local793;
						if (local781 == 0) {
							local793 = arg1.aShortArray55[local766];
						} else if (local781 == 1) {
							local793 = arg1.aShortArray53[local766];
						} else {
							local793 = arg1.aShortArray57[local766];
						}
						local817 = arg1.anIntArray275[local793];
						local822 = arg1.anIntArray284[local793];
						@Pc(827) int local827 = arg1.anIntArray283[local793];
						if (local704[local779] > local817) {
							local704[local779] = local817;
						}
						if (local707[local779] < local817) {
							local707[local779] = local817;
						}
						if (local822 < local710[local779]) {
							local710[local779] = local822;
						}
						if (local822 > local713[local779]) {
							local713[local779] = local822;
						}
						if (local827 < local716[local779]) {
							local716[local779] = local827;
						}
						if (local827 > local719[local779]) {
							local719[local779] = local827;
						}
					}
				}
			}
			local693 = new int[local701];
			local695 = new float[local701][];
			local691 = new int[local701];
			for (local766 = 0; local766 < local701; local766++) {
				@Pc(926) byte local926 = arg1.aByteArray52[local766];
				if (local926 > 0) {
					local689[local766] = (local707[local766] + local704[local766]) / 2;
					local691[local766] = (local710[local766] + local713[local766]) / 2;
					local693[local766] = (local719[local766] + local716[local766]) / 2;
					if (local926 == 1) {
						local822 = arg1.anIntArray276[local766];
						local980 = 64.0F / (float) arg1.anIntArray281[local766];
						if (local822 == 0) {
							local995 = 1.0F;
							local989 = 1.0F;
						} else if (local822 <= 0) {
							local989 = 1.0F;
							local995 = (float) -local822 / 1024.0F;
						} else {
							local989 = (float) local822 / 1024.0F;
							local995 = 1.0F;
						}
					} else if (local926 == 2) {
						local989 = 64.0F / (float) arg1.anIntArray279[local766];
						local980 = 64.0F / (float) arg1.anIntArray281[local766];
						local995 = 64.0F / (float) arg1.anIntArray276[local766];
					} else {
						local989 = (float) arg1.anIntArray279[local766] / 1024.0F;
						local995 = (float) arg1.anIntArray276[local766] / 1024.0F;
						local980 = (float) arg1.anIntArray281[local766] / 1024.0F;
					}
					local695[local766] = Static180.method2623(local980, arg1.aByteArray48[local766] & 0xFF, local989, local995, arg1.aShortArray62[local766], arg1.aShortArray61[local766], arg1.aShortArray60[local766]);
				}
			}
		}
		@Pc(1101) Class168[] local1101 = new Class168[arg1.anInt3202];
		@Pc(1120) short local1120;
		@Pc(1130) int local1130;
		@Pc(1140) int local1140;
		@Pc(1202) int local1202;
		for (@Pc(1103) int local1103 = 0; local1103 < arg1.anInt3202; local1103++) {
			@Pc(1110) short local1110 = arg1.aShortArray55[local1103];
			@Pc(1115) short local1115 = arg1.aShortArray53[local1103];
			local1120 = arg1.aShortArray57[local1103];
			local1130 = this.anIntArray536[local1115] - this.anIntArray536[local1110];
			local1140 = this.anIntArray534[local1115] - this.anIntArray534[local1110];
			local721 = this.anIntArray538[local1115] - this.anIntArray538[local1110];
			local760 = this.anIntArray536[local1120] - this.anIntArray536[local1110];
			local766 = this.anIntArray534[local1120] - this.anIntArray534[local1110];
			local779 = this.anIntArray538[local1120] - this.anIntArray538[local1110];
			local781 = local779 * local1140 - local766 * local721;
			local1202 = local721 * local760 - local1130 * local779;
			local817 = local1130 * local766 - local1140 * local760;
			while (local781 > 8192 || local1202 > 8192 || local817 > 8192 || local781 < -8192 || local1202 < -8192 || local817 < -8192) {
				local781 >>= 0x1;
				local817 >>= 0x1;
				local1202 >>= 0x1;
			}
			local822 = (int) Math.sqrt((double) (local781 * local781 + local1202 * local1202 + local817 * local817));
			if (local822 <= 0) {
				local822 = 1;
			}
			local781 = local781 * 256 / local822;
			local817 = local817 * 256 / local822;
			local1202 = local1202 * 256 / local822;
			@Pc(1296) byte local1296 = arg1.aByteArray51 == null ? 0 : arg1.aByteArray51[local1103];
			if (local1296 == 0) {
				@Pc(1324) Class261 local1324 = local418[local1110];
				local1324.anInt7235++;
				local1324.anInt7237 += local817;
				local1324.anInt7234 += local781;
				local1324.anInt7236 += local1202;
				@Pc(1352) Class261 local1352 = local418[local1115];
				local1352.anInt7235++;
				local1352.anInt7234 += local781;
				local1352.anInt7236 += local1202;
				local1352.anInt7237 += local817;
				@Pc(1380) Class261 local1380 = local418[local1120];
				local1380.anInt7235++;
				local1380.anInt7236 += local1202;
				local1380.anInt7237 += local817;
				local1380.anInt7234 += local781;
			} else if (local1296 == 1) {
				@Pc(1309) Class168 local1309 = local1101[local1103] = new Class168();
				local1309.anInt4533 = local781;
				local1309.anInt4532 = local1202;
				local1309.anInt4531 = local817;
			}
		}
		@Pc(1421) int local1421;
		for (@Pc(1415) int local1415 = 0; local1415 < this.anInt5788; local1415++) {
			local1421 = local113[local1415];
			@Pc(1428) int local1428 = arg1.aShortArray59[local1421] & 0xFFFF;
			@Pc(1433) short local1433;
			if (arg1.aShortArray58 == null) {
				local1433 = -1;
			} else {
				local1433 = arg1.aShortArray58[local1421];
			}
			if (arg1.aByteArray47 == null) {
				local1140 = -1;
			} else {
				local1140 = arg1.aByteArray47[local1421];
			}
			if (arg1.aByteArray49 == null) {
				local721 = 0;
			} else {
				local721 = arg1.aByteArray49[local1421] & 0xFF;
			}
			@Pc(1468) float local1468 = 0.0F;
			@Pc(1470) float local1470 = 0.0F;
			@Pc(1472) float local1472 = 0.0F;
			local995 = 0.0F;
			local980 = 0.0F;
			local989 = 0.0F;
			@Pc(1480) byte local1480 = 0;
			@Pc(1482) byte local1482 = 0;
			@Pc(1484) int local1484 = 0;
			@Pc(1500) byte local1500;
			@Pc(1520) short local1520;
			@Pc(1525) short local1525;
			@Pc(1530) short local1530;
			if (local1433 != -1) {
				if (local1140 == -1) {
					local1482 = 2;
					local989 = 0.0F;
					local980 = 0.0F;
					local995 = 1.0F;
					local1480 = 1;
					local1468 = 0.0F;
					local1470 = 1.0F;
					local1472 = 1.0F;
				} else {
					local1140 &= 0xFF;
					local1500 = arg1.aByteArray52[local1140];
					@Pc(1510) short local1510;
					@Pc(1515) short local1515;
					@Pc(1553) float local1553;
					@Pc(1562) float local1562;
					@Pc(1570) float local1570;
					@Pc(1654) float local1654;
					@Pc(1663) float local1663;
					@Pc(1672) float local1672;
					@Pc(1680) float local1680;
					@Pc(1689) float local1689;
					@Pc(1697) float local1697;
					if (local1500 == 0) {
						local1510 = arg1.aShortArray55[local1421];
						local1515 = arg1.aShortArray53[local1421];
						local1520 = arg1.aShortArray57[local1421];
						local1525 = arg1.aShortArray62[local1140];
						local1530 = arg1.aShortArray61[local1140];
						@Pc(1535) short local1535 = arg1.aShortArray60[local1140];
						@Pc(1541) float local1541 = (float) arg1.anIntArray275[local1525];
						@Pc(1547) float local1547 = (float) arg1.anIntArray284[local1525];
						local1553 = arg1.anIntArray283[local1525];
						local1562 = (float) arg1.anIntArray275[local1530] - local1541;
						local1570 = (float) arg1.anIntArray284[local1530] - local1547;
						@Pc(1578) float local1578 = (float) arg1.anIntArray283[local1530] - local1553;
						@Pc(1586) float local1586 = (float) arg1.anIntArray275[local1535] - local1541;
						@Pc(1595) float local1595 = (float) arg1.anIntArray284[local1535] - local1547;
						@Pc(1604) float local1604 = (float) arg1.anIntArray283[local1535] - local1553;
						@Pc(1612) float local1612 = (float) arg1.anIntArray275[local1510] - local1541;
						@Pc(1621) float local1621 = (float) arg1.anIntArray284[local1510] - local1547;
						@Pc(1629) float local1629 = (float) arg1.anIntArray283[local1510] - local1553;
						@Pc(1638) float local1638 = (float) arg1.anIntArray275[local1515] - local1541;
						@Pc(1646) float local1646 = (float) arg1.anIntArray284[local1515] - local1547;
						local1654 = (float) arg1.anIntArray283[local1515] - local1553;
						local1663 = (float) arg1.anIntArray275[local1520] - local1541;
						local1672 = (float) arg1.anIntArray284[local1520] - local1547;
						local1680 = (float) arg1.anIntArray283[local1520] - local1553;
						local1689 = local1604 * local1570 - local1595 * local1578;
						local1697 = local1586 * local1578 - local1604 * local1562;
						@Pc(1706) float local1706 = local1595 * local1562 - local1586 * local1570;
						@Pc(1715) float local1715 = local1595 * local1706 - local1604 * local1697;
						@Pc(1724) float local1724 = local1689 * local1604 - local1586 * local1706;
						@Pc(1733) float local1733 = local1586 * local1697 - local1595 * local1689;
						@Pc(1747) float local1747 = 1.0F / (local1715 * local1562 + local1570 * local1724 + local1733 * local1578);
						local1472 = (local1646 * local1724 + local1638 * local1715 + local1733 * local1654) * local1747;
						local980 = (local1733 * local1680 + local1724 * local1672 + local1663 * local1715) * local1747;
						local1468 = (local1715 * local1612 + local1621 * local1724 + local1733 * local1629) * local1747;
						@Pc(1797) float local1797 = local1570 * local1706 - local1578 * local1697;
						@Pc(1805) float local1805 = local1562 * local1697 - local1689 * local1570;
						@Pc(1813) float local1813 = local1689 * local1578 - local1706 * local1562;
						@Pc(1827) float local1827 = 1.0F / (local1797 * local1586 + local1813 * local1595 + local1604 * local1805);
						local989 = (local1680 * local1805 + local1813 * local1672 + local1797 * local1663) * local1827;
						local995 = (local1797 * local1638 + local1646 * local1813 + local1805 * local1654) * local1827;
						local1470 = local1827 * (local1629 * local1805 + local1797 * local1612 + local1813 * local1621);
					} else {
						local1510 = arg1.aShortArray55[local1421];
						local1515 = arg1.aShortArray53[local1421];
						local1520 = arg1.aShortArray57[local1421];
						@Pc(1890) int local1890 = local689[local1140];
						@Pc(1894) int local1894 = local691[local1140];
						@Pc(1898) int local1898 = local693[local1140];
						@Pc(1902) float[] local1902 = local695[local1140];
						@Pc(1907) byte local1907 = arg1.aByteArray50[local1140];
						local1553 = (float) arg1.anIntArray280[local1140] / 256.0F;
						if (local1500 == 1) {
							local1562 = (float) arg1.anIntArray279[local1140] / 1024.0F;
							Static164.method2387(arg1.anIntArray283[local1510], local1907, local1553, local1562, local1902, local1898, local1890, arg1.anIntArray284[local1510], local1894, arg1.anIntArray275[local1510]);
							local1470 = Static60.aFloat27;
							local1468 = Static83.aFloat222;
							Static164.method2387(arg1.anIntArray283[local1515], local1907, local1553, local1562, local1902, local1898, local1890, arg1.anIntArray284[local1515], local1894, arg1.anIntArray275[local1515]);
							local1472 = Static83.aFloat222;
							local995 = Static60.aFloat27;
							Static164.method2387(arg1.anIntArray283[local1520], local1907, local1553, local1562, local1902, local1898, local1890, arg1.anIntArray284[local1520], local1894, arg1.anIntArray275[local1520]);
							local980 = Static83.aFloat222;
							local989 = Static60.aFloat27;
							local1570 = local1562 / 2.0F;
							if ((local1907 & 0x1) == 0) {
								if (local1472 - local1468 > local1570) {
									local1472 -= local1562;
									local1480 = 1;
								} else if (local1570 < local1468 - local1472) {
									local1472 += local1562;
									local1480 = 2;
								}
								if (local1570 < local980 - local1468) {
									local1482 = 1;
									local980 -= local1562;
								} else if (local1570 < local1468 - local980) {
									local1482 = 2;
									local980 += local1562;
								}
							} else {
								if (local989 - local1470 > local1570) {
									local989 -= local1562;
									local1482 = 1;
								} else if (local1570 < local1470 - local989) {
									local1482 = 2;
									local989 += local1562;
								}
								if (local995 - local1470 > local1570) {
									local1480 = 1;
									local995 -= local1562;
								} else if (local1470 - local995 > local1570) {
									local995 += local1562;
									local1480 = 2;
								}
							}
						} else if (local1500 == 2) {
							local1562 = (float) arg1.anIntArray285[local1140] / 256.0F;
							local1570 = (float) arg1.anIntArray278[local1140] / 256.0F;
							@Pc(2156) int local2156 = arg1.anIntArray275[local1515] - arg1.anIntArray275[local1510];
							@Pc(2167) int local2167 = arg1.anIntArray284[local1515] - arg1.anIntArray284[local1510];
							@Pc(2178) int local2178 = arg1.anIntArray283[local1515] - arg1.anIntArray283[local1510];
							@Pc(2189) int local2189 = arg1.anIntArray275[local1520] - arg1.anIntArray275[local1510];
							@Pc(2199) int local2199 = arg1.anIntArray284[local1520] - arg1.anIntArray284[local1510];
							@Pc(2209) int local2209 = arg1.anIntArray283[local1520] - arg1.anIntArray283[local1510];
							@Pc(2217) int local2217 = local2167 * local2209 - local2199 * local2178;
							@Pc(2226) int local2226 = local2178 * local2189 - local2156 * local2209;
							@Pc(2235) int local2235 = local2156 * local2199 - local2167 * local2189;
							local1654 = 64.0F / (float) arg1.anIntArray276[local1140];
							local1663 = 64.0F / (float) arg1.anIntArray281[local1140];
							local1672 = 64.0F / (float) arg1.anIntArray279[local1140];
							local1680 = (local1902[2] * (float) local2235 + (float) local2217 * local1902[0] + (float) local2226 * local1902[1]) / local1654;
							local1689 = ((float) local2217 * local1902[3] + (float) local2226 * local1902[4] + local1902[5] * (float) local2235) / local1663;
							local1697 = ((float) local2217 * local1902[6] + local1902[7] * (float) local2226 + local1902[8] * (float) local2235) / local1672;
							local1484 = Static143.method2211(local1689, local1697, local1680);
							Static384.method5649(arg1.anIntArray275[local1510], local1562, arg1.anIntArray283[local1510], local1898, local1894, arg1.anIntArray284[local1510], local1902, local1907, local1570, local1890, local1553, local1484);
							local1470 = Static130.aFloat61;
							local1468 = Static276.aFloat136;
							Static384.method5649(arg1.anIntArray275[local1515], local1562, arg1.anIntArray283[local1515], local1898, local1894, arg1.anIntArray284[local1515], local1902, local1907, local1570, local1890, local1553, local1484);
							local995 = Static130.aFloat61;
							local1472 = Static276.aFloat136;
							Static384.method5649(arg1.anIntArray275[local1520], local1562, arg1.anIntArray283[local1520], local1898, local1894, arg1.anIntArray284[local1520], local1902, local1907, local1570, local1890, local1553, local1484);
							local980 = Static276.aFloat136;
							local989 = Static130.aFloat61;
						} else if (local1500 == 3) {
							Static136.method2144(local1553, local1898, arg1.anIntArray284[local1510], local1902, local1890, arg1.anIntArray283[local1510], local1894, local1907, arg1.anIntArray275[local1510]);
							local1470 = Static20.aFloat55;
							local1468 = Static332.aFloat158;
							Static136.method2144(local1553, local1898, arg1.anIntArray284[local1515], local1902, local1890, arg1.anIntArray283[local1515], local1894, local1907, arg1.anIntArray275[local1515]);
							local1472 = Static332.aFloat158;
							local995 = Static20.aFloat55;
							Static136.method2144(local1553, local1898, arg1.anIntArray284[local1520], local1902, local1890, arg1.anIntArray283[local1520], local1894, local1907, arg1.anIntArray275[local1520]);
							local989 = Static20.aFloat55;
							local980 = Static332.aFloat158;
							if ((local1907 & 0x1) == 0) {
								if (local1472 - local1468 > 0.5F) {
									local1480 = 1;
									local1472--;
								} else if (local1468 - local1472 > 0.5F) {
									local1480 = 2;
									local1472++;
								}
								if (local980 - local1468 > 0.5F) {
									local1482 = 1;
									local980--;
								} else if (local1468 - local980 > 0.5F) {
									local1482 = 2;
									local980++;
								}
							} else {
								if (local989 - local1470 > 0.5F) {
									local989--;
									local1482 = 1;
								} else if (local1470 - local989 > 0.5F) {
									local989++;
									local1482 = 2;
								}
								if (local995 - local1470 > 0.5F) {
									local1480 = 1;
									local995--;
								} else if (local1470 - local995 > 0.5F) {
									local1480 = 2;
									local995++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray51 == null) {
				local1500 = 0;
			} else {
				local1500 = arg1.aByteArray51[local1421];
			}
			if (local1500 == 0) {
				@Pc(2793) long local2793 = (long) (local1140 << 2) + ((long) local721 + (long) (local1484 << 24) + (long) (local1428 << 8) << 32);
				local1520 = arg1.aShortArray55[local1421];
				local1525 = arg1.aShortArray53[local1421];
				local1530 = arg1.aShortArray57[local1421];
				@Pc(2812) Class261 local2812 = local418[local1520];
				this.aShortArray105[local1415] = this.method4678(local2812.anInt7234, local2812.anInt7236, local2812.anInt7237, local1520, local2793, local1470, arg1, local2812.anInt7235, local1468);
				@Pc(2836) Class261 local2836 = local418[local1525];
				this.aShortArray103[local1415] = this.method4678(local2836.anInt7234, local2836.anInt7236, local2836.anInt7237, local1525, (long) local1480 + local2793, local995, arg1, local2836.anInt7235, local1472);
				@Pc(2863) Class261 local2863 = local418[local1530];
				this.aShortArray107[local1415] = this.method4678(local2863.anInt7234, local2863.anInt7236, local2863.anInt7237, local1530, (long) local1482 + local2793, local989, arg1, local2863.anInt7235, local980);
			} else if (local1500 == 1) {
				@Pc(2655) Class168 local2655 = local1101[local1421];
				@Pc(2697) long local2697 = (long) ((local2655.anInt4531 + 256 << 22) + (local2655.anInt4532 + 256 << 12) + (local1140 << 2) + (local2655.anInt4533 <= 0 ? 2048 : 1024)) + ((long) (local1428 << 8) + (long) (local1484 << 24) + (long) local721 << 32);
				this.aShortArray105[local1415] = this.method4678(local2655.anInt4533, local2655.anInt4532, local2655.anInt4531, arg1.aShortArray55[local1421], local2697, local1470, arg1, 0, local1468);
				this.aShortArray103[local1415] = this.method4678(local2655.anInt4533, local2655.anInt4532, local2655.anInt4531, arg1.aShortArray53[local1421], (long) local1480 + local2697, local995, arg1, 0, local1472);
				this.aShortArray107[local1415] = this.method4678(local2655.anInt4533, local2655.anInt4532, local2655.anInt4531, arg1.aShortArray57[local1421], (long) local1482 + local2697, local989, arg1, 0, local980);
			}
			if (arg1.aShortArray58 == null) {
				this.aShortArray101[local1415] = -1;
			} else {
				this.aShortArray101[local1415] = arg1.aShortArray58[local1421];
			}
			if (arg1.aByteArray49 != null) {
				this.aByteArray84[local1415] = arg1.aByteArray49[local1421];
			}
			if (arg1.aShortArray56 != null) {
				this.aShortArray102[local1415] = arg1.aShortArray56[local1421];
			}
			this.aShortArray99[local1415] = arg1.aShortArray59[local1421];
		}
		local1421 = 0;
		local1120 = -10000;
		for (local1130 = 0; local1130 < this.anInt5804; local1130++) {
			@Pc(2956) short local2956 = this.aShortArray101[local1130];
			if (local1120 != local2956) {
				local1421++;
				local1120 = local2956;
			}
		}
		this.anIntArray535 = new int[local1421 + 1];
		local1120 = -10000;
		local1421 = 0;
		for (local1140 = 0; local1140 < this.anInt5804; local1140++) {
			@Pc(2990) short local2990 = this.aShortArray101[local1140];
			if (local1120 != local2990) {
				this.anIntArray535[local1421++] = local1140;
				local1120 = local2990;
			}
		}
		this.anIntArray535[local1421] = this.anInt5804;
		Static170.aLongArray9 = null;
		this.aShortArray100 = Static110.method1906(this.aShortArray100, this.anInt5786);
		this.aShortArray108 = Static110.method1906(this.aShortArray108, this.anInt5786);
		this.aShortArray104 = Static110.method1906(this.aShortArray104, this.anInt5786);
		this.aByteArray85 = Static295.method3894(this.aByteArray85, this.anInt5786);
		this.aFloatArray25 = Static303.method4039(this.anInt5786, this.aFloatArray25);
		this.aFloatArray26 = Static303.method4039(this.anInt5786, this.aFloatArray26);
		if (arg1.anIntArray282 != null && Static258.method3431(this.anInt5774, arg2)) {
			this.anIntArrayArray49 = arg1.method2603();
		}
		if (arg1.aClass194Array1 != null && Static223.method3123(arg2, this.anInt5774)) {
			this.anIntArrayArray50 = arg1.method2591();
		}
		if (arg1.anIntArray277 != null && Static226.method3130(arg2, this.anInt5774)) {
			local721 = 0;
			@Pc(3108) int[] local3108 = new int[256];
			for (local766 = 0; local766 < this.anInt5788; local766++) {
				local779 = arg1.anIntArray277[local113[local766]];
				if (local779 >= 0) {
					@Pc(3128) int local3128 = local3108[local779]++;
					if (local779 > local721) {
						local721 = local779;
					}
				}
			}
			this.anIntArrayArray51 = new int[local721 + 1][];
			for (local779 = 0; local779 <= local721; local779++) {
				this.anIntArrayArray51[local779] = new int[local3108[local779]];
				local3108[local779] = 0;
			}
			for (local781 = 0; local781 < this.anInt5788; local781++) {
				local1202 = arg1.anIntArray277[local113[local781]];
				if (local1202 >= 0) {
					this.anIntArrayArray51[local1202][local3108[local1202]++] = local781;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean387) {
			this.method4681();
		}
		return this.aShort75;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22_Sub7.anIntArray411[arg0];
		@Pc(13) int local13 = Class22_Sub7.anIntArray410[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5773; local15++) {
			local33 = this.anIntArray536[local15] * local13 + this.anIntArray538[local15] * local9 >> 15;
			this.anIntArray538[local15] = local13 * this.anIntArray538[local15] - this.anIntArray536[local15] * local9 >> 15;
			this.anIntArray536[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5786; local33++) {
			@Pc(87) int local87 = this.aShortArray104[local33] * local9 + this.aShortArray100[local33] * local13 >> 15;
			this.aShortArray104[local33] = (short) (local13 * this.aShortArray104[local33] - this.aShortArray100[local33] * local9 >> 15);
			this.aShortArray100[local33] = (short) local87;
		}
		if (this.aClass87_11 == null && this.aClass87_8 != null) {
			this.aClass87_8.anInterface8_2 = null;
		}
		if (this.aClass87_11 != null) {
			this.aClass87_11.anInterface8_2 = null;
		}
		this.aBoolean387 = false;
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()Z")
	@Override
	public boolean method4651() {
		if (this.aShortArray101 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray101.length; local12++) {
			if (this.aShortArray101[local12] != -1 && !this.aClass51_Sub2_36.anInterface4_8.method3140(this.aShortArray101[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!c;Lclient!qb;I)V")
	@Override
	public void method4667(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class28_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5786 == 0) {
			return;
		}
		@Pc(13) Class33_Sub2 local13 = this.aClass51_Sub2_36.aClass33_Sub2_3;
		if (!this.aBoolean387) {
			this.method4681();
		}
		@Pc(22) Class33_Sub2 local22 = (Class33_Sub2) arg0;
		this.method4680(local22);
		Static67.aFloat37 = local13.aFloat74 * local22.aFloat72 + local22.aFloat79 * local13.aFloat78 + local13.aFloat80 * local22.aFloat75 + local13.aFloat72;
		Static450.aFloat219 = local13.aFloat74 * local22.aFloat78 + local22.aFloat71 * local13.aFloat78 + local22.aFloat76 * local13.aFloat80;
		@Pc(73) float local73 = Static450.aFloat219 * (float) this.aShort76 + Static67.aFloat37;
		@Pc(81) float local81 = Static450.aFloat219 * (float) this.aShort78 + Static67.aFloat37;
		@Pc(97) float local97;
		@Pc(91) float local91;
		if (local73 > local81) {
			local91 = (float) this.aShort75 + local73;
			local97 = local81 - (float) this.aShort75;
		} else {
			local91 = (float) this.aShort75 + local81;
			local97 = local73 - (float) this.aShort75;
		}
		if (local97 >= this.aClass51_Sub2_36.bf || local91 <= (float) this.aClass51_Sub2_36.anInt6923) {
			return;
		}
		Static114.aFloat58 = local22.aFloat75 * local13.aFloat82 + local13.aFloat76 * local22.aFloat79 + local22.aFloat72 * local13.aFloat81 + local13.aFloat75;
		Static268.aFloat130 = local13.aFloat81 * local22.aFloat78 + local13.aFloat76 * local22.aFloat71 + local13.aFloat82 * local22.aFloat76;
		@Pc(173) float local173 = Static114.aFloat58 + Static268.aFloat130 * (float) this.aShort76;
		@Pc(181) float local181 = Static114.aFloat58 + (float) this.aShort78 * Static268.aFloat130;
		@Pc(208) float local208;
		@Pc(196) float local196;
		if (local173 > local181) {
			local208 = (local181 - (float) this.aShort75) * (float) this.aClass51_Sub2_36.anInt6952;
			local196 = (local173 + (float) this.aShort75) * (float) this.aClass51_Sub2_36.anInt6952;
		} else {
			local196 = ((float) this.aShort75 + local181) * (float) this.aClass51_Sub2_36.anInt6952;
			local208 = (float) this.aClass51_Sub2_36.anInt6952 * ((float) -this.aShort75 + local173);
		}
		if (this.aClass51_Sub2_36.aFloat196 <= local208 / local91 || this.aClass51_Sub2_36.aFloat209 >= local196 / local91) {
			return;
		}
		Static65.aFloat54 = local22.aFloat78 * local13.aFloat77 + local13.aFloat71 * local22.aFloat71 + local22.aFloat76 * local13.aFloat73;
		Static39.aFloat20 = local22.aFloat72 * local13.aFloat77 + local13.aFloat71 * local22.aFloat79 + local22.aFloat75 * local13.aFloat73 + local13.aFloat79;
		@Pc(297) float local297 = Static39.aFloat20 + (float) this.aShort76 * Static65.aFloat54;
		@Pc(305) float local305 = Static39.aFloat20 + Static65.aFloat54 * (float) this.aShort78;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local297 > local305) {
			local320 = (float) this.aClass51_Sub2_36.anInt6934 * (local305 - (float) this.aShort75);
			local331 = ((float) this.aShort75 + local297) * (float) this.aClass51_Sub2_36.anInt6934;
		} else {
			local320 = ((float) -this.aShort75 + local297) * (float) this.aClass51_Sub2_36.anInt6934;
			local331 = (float) this.aClass51_Sub2_36.anInt6934 * (local305 + (float) this.aShort75);
		}
		if (local320 / local91 >= this.aClass51_Sub2_36.aFloat197 || this.aClass51_Sub2_36.aFloat204 >= local331 / local91) {
			return;
		}
		if (arg1 != null || this.aClass224Array1 != null) {
			Static162.aFloat70 = local22.aFloat81 * local13.aFloat73 + local13.aFloat71 * local22.aFloat77 + local22.aFloat74 * local13.aFloat77;
			Static278.aFloat138 = local22.aFloat74 * local13.aFloat81 + local13.aFloat76 * local22.aFloat77 + local13.aFloat82 * local22.aFloat81;
			Static346.aFloat161 = local22.aFloat80 * local13.aFloat77 + local13.aFloat71 * local22.aFloat73 + local22.aFloat82 * local13.aFloat73;
			Static272.aFloat131 = local22.aFloat73 * local13.aFloat76 + local22.aFloat82 * local13.aFloat82 + local13.aFloat81 * local22.aFloat80;
			Static459.aFloat190 = local22.aFloat74 * local13.aFloat74 + local22.aFloat81 * local13.aFloat80 + local13.aFloat78 * local22.aFloat77;
			Static357.aFloat166 = local13.aFloat74 * local22.aFloat80 + local13.aFloat80 * local22.aFloat82 + local13.aFloat78 * local22.aFloat73;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort83 + this.aShort82 >> 1;
			@Pc(509) int local509 = this.aShort80 + this.aShort77 >> 1;
			@Pc(528) int local528 = (int) (Static272.aFloat131 * (float) local501 + Static114.aFloat58 + Static268.aFloat130 * (float) this.aShort76 + Static278.aFloat138 * (float) local509);
			@Pc(547) int local547 = (int) (Static65.aFloat54 * (float) this.aShort76 + Static39.aFloat20 + Static346.aFloat161 * (float) local501 + (float) local509 * Static162.aFloat70);
			@Pc(566) int local566 = (int) ((float) this.aShort76 * Static450.aFloat219 + Static67.aFloat37 + Static357.aFloat166 * (float) local501 + (float) local509 * Static459.aFloat190);
			if (this.aClass51_Sub2_36.anInt6923 <= local566) {
				arg1.anInt5225 = this.aClass51_Sub2_36.anInt6932 + local528 * this.aClass51_Sub2_36.anInt6952 / local566;
				arg1.anInt5228 = local547 * this.aClass51_Sub2_36.anInt6934 / local566 + this.aClass51_Sub2_36.anInt6949;
			} else {
				local491 = true;
			}
			@Pc(621) int local621 = (int) (Static268.aFloat130 * (float) this.aShort78 + (float) local501 * Static272.aFloat131 + Static114.aFloat58 + (float) local509 * Static278.aFloat138);
			@Pc(640) int local640 = (int) (Static346.aFloat161 * (float) local501 + Static39.aFloat20 + Static65.aFloat54 * (float) this.aShort78 + (float) local509 * Static162.aFloat70);
			@Pc(659) int local659 = (int) ((float) local509 * Static459.aFloat190 + Static450.aFloat219 * (float) this.aShort78 + Static67.aFloat37 + (float) local501 * Static357.aFloat166);
			if (this.aClass51_Sub2_36.anInt6923 > local659) {
				local491 = true;
			} else {
				arg1.anInt5224 = this.aClass51_Sub2_36.anInt6952 * local621 / local659 + this.aClass51_Sub2_36.anInt6932;
				arg1.anInt5227 = this.aClass51_Sub2_36.anInt6949 + this.aClass51_Sub2_36.anInt6934 * local640 / local659;
			}
			if (local491) {
				if (this.aClass51_Sub2_36.anInt6923 > local566 && local659 < this.aClass51_Sub2_36.anInt6923) {
					local493 = false;
				} else {
					@Pc(743) int local743;
					@Pc(754) int local754;
					@Pc(765) int local765;
					if (local566 < this.aClass51_Sub2_36.anInt6923) {
						local743 = (local659 - this.aClass51_Sub2_36.anInt6923 << 16) / (local659 - local566);
						local754 = (local743 * (local621 - local528) >> 16) + local621;
						local765 = ((local640 - local547) * local743 >> 16) + local640;
						arg1.anInt5225 = this.aClass51_Sub2_36.anInt6952 * local754 / this.aClass51_Sub2_36.anInt6923 + this.aClass51_Sub2_36.anInt6932;
						arg1.anInt5228 = local765 * this.aClass51_Sub2_36.anInt6934 / this.aClass51_Sub2_36.anInt6923 + this.aClass51_Sub2_36.anInt6949;
					} else if (this.aClass51_Sub2_36.anInt6923 > local659) {
						local743 = (local566 - this.aClass51_Sub2_36.anInt6923 << 16) / (local566 - local659);
						local754 = ((local528 - local621) * local743 >> 16) + local528;
						local765 = (local743 * (local547 - local640) >> 16) + local547;
						arg1.anInt5225 = this.aClass51_Sub2_36.anInt6932 + this.aClass51_Sub2_36.anInt6952 * local754 / this.aClass51_Sub2_36.anInt6923;
						arg1.anInt5228 = local765 * this.aClass51_Sub2_36.anInt6934 / this.aClass51_Sub2_36.anInt6923 + this.aClass51_Sub2_36.anInt6949;
					}
				}
			}
			if (local493) {
				if (local659 < local566) {
					arg1.anInt5226 = this.aClass51_Sub2_36.anInt6952 * (this.aShort75 + local528) / local566 + this.aClass51_Sub2_36.anInt6932 - arg1.anInt5225;
				} else {
					arg1.anInt5226 = this.aClass51_Sub2_36.anInt6932 + (this.aShort75 + local621) * this.aClass51_Sub2_36.anInt6952 / local659 - arg1.anInt5224;
				}
				arg1.aBoolean336 = true;
			}
		}
		this.aClass51_Sub2_36.method5384();
		this.aClass51_Sub2_36.method5421(local22);
		this.method4676();
		this.aClass51_Sub2_36.method5388();
		this.method4673();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	@Override
	public void method4658(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class163_Sub2 local8 = (Class163_Sub2) arg0;
		if (this.anInt5788 == 0 || local8.anInt5788 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5773;
		@Pc(27) int[] local27 = local8.anIntArray536;
		@Pc(30) int[] local30 = local8.anIntArray534;
		@Pc(33) int[] local33 = local8.anIntArray538;
		@Pc(36) short[] local36 = local8.aShortArray100;
		@Pc(39) short[] local39 = local8.aShortArray108;
		@Pc(42) short[] local42 = local8.aShortArray104;
		@Pc(45) byte[] local45 = local8.aByteArray85;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(64) short[] local64;
		@Pc(60) byte[] local60;
		if (this.aClass209_1 == null) {
			local56 = null;
			local64 = null;
			local60 = null;
			local52 = null;
		} else {
			local52 = this.aClass209_1.aShortArray96;
			local56 = this.aClass209_1.aShortArray95;
			local60 = this.aClass209_1.aByteArray82;
			local64 = this.aClass209_1.aShortArray97;
		}
		@Pc(81) short[] local81;
		@Pc(85) short[] local85;
		@Pc(93) short[] local93;
		@Pc(89) byte[] local89;
		if (local8.aClass209_1 == null) {
			local85 = null;
			local89 = null;
			local81 = null;
			local93 = null;
		} else {
			local81 = local8.aClass209_1.aShortArray95;
			local85 = local8.aClass209_1.aShortArray96;
			local89 = local8.aClass209_1.aByteArray82;
			local93 = local8.aClass209_1.aShortArray97;
		}
		@Pc(106) int[] local106 = local8.anIntArray537;
		@Pc(109) short[] local109 = local8.aShortArray106;
		if (!local8.aBoolean387) {
			local8.method4681();
		}
		@Pc(118) short local118 = local8.aShort76;
		@Pc(121) short local121 = local8.aShort78;
		@Pc(124) short local124 = local8.aShort82;
		@Pc(127) short local127 = local8.aShort83;
		@Pc(130) short local130 = local8.aShort80;
		@Pc(133) short local133 = local8.aShort77;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5773; local135++) {
			@Pc(145) int local145 = this.anIntArray534[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(165) int local165 = this.anIntArray536[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(181) int local181 = this.anIntArray538[local135] - arg3;
					if (local181 >= local130 && local181 <= local133) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray537[local135];
						@Pc(211) int local211 = this.anIntArray537[local135 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray106[local213] - 1;
							if (local199 == -1 || this.aByteArray85[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(248) int local248 = 0; local248 < local24; local248++) {
								if (local27[local248] == local165 && local181 == local33[local248] && local145 == local30[local248]) {
									local211 = local106[local248 + 1];
									local204 = local106[local248];
									@Pc(281) int local281 = -1;
									for (@Pc(283) int local283 = local204; local283 < local211; local283++) {
										local281 = local109[local283] - 1;
										if (local281 == -1 || local45[local281] != 0) {
											break;
										}
									}
									if (local281 != -1) {
										if (local56 == null) {
											this.aClass209_1 = new Class209();
											local56 = this.aClass209_1.aShortArray95 = Static239.method3256(this.aShortArray100);
											local52 = this.aClass209_1.aShortArray96 = Static239.method3256(this.aShortArray108);
											local64 = this.aClass209_1.aShortArray97 = Static239.method3256(this.aShortArray104);
											local60 = this.aClass209_1.aByteArray82 = Static82.method1437(this.aByteArray85);
										}
										if (local81 == null) {
											@Pc(364) Class209 local364 = local8.aClass209_1 = new Class209();
											local81 = local364.aShortArray95 = Static239.method3256(local36);
											local85 = local364.aShortArray96 = Static239.method3256(local39);
											local93 = local364.aShortArray97 = Static239.method3256(local42);
											local89 = local364.aByteArray82 = Static82.method1437(local45);
										}
										@Pc(397) short local397 = this.aShortArray100[local199];
										@Pc(402) short local402 = this.aShortArray108[local199];
										@Pc(407) short local407 = this.aShortArray104[local199];
										local204 = local106[local248];
										local211 = local106[local248 + 1];
										@Pc(422) byte local422 = this.aByteArray85[local199];
										@Pc(432) int local432;
										for (@Pc(424) int local424 = local204; local424 < local211; local424++) {
											local432 = local109[local424] - 1;
											if (local432 == -1) {
												break;
											}
											if (local89[local432] != 0) {
												local81[local432] += local397;
												local85[local432] += local402;
												local93[local432] += local407;
												local89[local432] += local422;
											}
										}
										local397 = local36[local281];
										local211 = this.anIntArray537[local135 + 1];
										local407 = local42[local281];
										local402 = local39[local281];
										local204 = this.anIntArray537[local135];
										local422 = local45[local281];
										for (local432 = local204; local432 < local211; local432++) {
											@Pc(515) int local515 = this.aShortArray106[local432] - 1;
											if (local515 == -1) {
												break;
											}
											if (local60[local515] != 0) {
												local56[local515] += local397;
												local52[local515] += local402;
												local64[local515] += local407;
												local60[local515] += local422;
											}
										}
										if (this.aClass87_11 == null && this.aClass87_8 != null) {
											this.aClass87_8.anInterface8_2 = null;
										}
										if (this.aClass87_11 != null) {
											this.aClass87_11.anInterface8_2 = null;
										}
										if (local8.aClass87_11 == null && local8.aClass87_8 != null) {
											local8.aClass87_8.anInterface8_2 = null;
										}
										if (local8.aClass87_11 != null) {
											local8.aClass87_11.anInterface8_2 = null;
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

	@OriginalMember(owner = "client!sg", name = "BA", descriptor = "(SS)V")
	@Override
	public void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5788; local3++) {
			if (this.aShortArray99[local3] == arg0) {
				this.aShortArray99[local3] = arg1;
			}
		}
		if (this.aClass224Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt5800; local30++) {
				@Pc(37) Class224 local37 = this.aClass224Array1[local30];
				@Pc(42) Class212 local42 = this.aClass212Array1[local30];
				local42.anInt5461 = Static165.anIntArray263[this.aShortArray99[local37.anInt5678] & 0xFFFF] & 0xFFFFFF | local42.anInt5461 & 0xFF000000;
			}
		}
		if (this.aClass87_8 != null) {
			this.aClass87_8.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZB)V")
	private void method4672(@OriginalArg(0) boolean arg0) {
		if (this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2.aByteArray75.length >= this.anInt5804 * 6) {
			this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2.anInt4989 = 0;
		} else {
			this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2 = new Class7_Sub14_Sub2((this.anInt5804 + 100) * 6);
		}
		@Pc(38) Class7_Sub14_Sub2 local38 = this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2;
		@Pc(50) int local50;
		if (this.aClass51_Sub2_36.aBoolean461) {
			for (local50 = 0; local50 < this.anInt5804; local50++) {
				local38.method3993(this.aShortArray105[local50]);
				local38.method3993(this.aShortArray103[local50]);
				local38.method3993(this.aShortArray107[local50]);
			}
		} else {
			for (local50 = 0; local50 < this.anInt5804; local50++) {
				local38.method3976(this.aShortArray105[local50]);
				local38.method3976(this.aShortArray103[local50]);
				local38.method3976(this.aShortArray107[local50]);
			}
		}
		if (local38.anInt4989 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface10_4 == null) {
				this.anInterface10_4 = this.aClass51_Sub2_36.method5383(local38.aByteArray75, true, local38.anInt4989);
			} else {
				this.anInterface10_4.method5743(local38.anInt4989, local38.aByteArray75);
			}
			this.aClass44_1.anInterface10_3 = this.anInterface10_4;
		} else {
			this.aClass44_1.anInterface10_3 = this.aClass51_Sub2_36.method5383(local38.aByteArray75, false, local38.anInt4989);
		}
		if (!arg0) {
			this.aBoolean388 = true;
		}
	}

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "(IIII)V")
	@Override
	protected void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static277.anInt4656 = 0;
			Static103.anInt7471 = 0;
			local13 = 0;
			Static206.anInt3641 = 0;
			for (local17 = 0; local17 < this.anInt5773; local17++) {
				Static206.anInt3641 += this.anIntArray536[local17];
				Static103.anInt7471 += this.anIntArray534[local17];
				Static277.anInt4656 += this.anIntArray538[local17];
				local13++;
			}
			if (local13 <= 0) {
				Static206.anInt3641 = arg1;
				Static103.anInt7471 = arg2;
				Static277.anInt4656 = arg3;
			} else {
				Static103.anInt7471 = arg2 + Static103.anInt7471 / local13;
				Static206.anInt3641 = arg1 + Static206.anInt3641 / local13;
				Static277.anInt4656 = arg3 + Static277.anInt4656 / local13;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt5773; local13++) {
				this.anIntArray536[local13] += arg1;
				this.anIntArray534[local13] += arg2;
				this.anIntArray538[local13] += arg3;
			}
		} else {
			@Pc(159) int local159;
			@Pc(177) int local177;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt5773; local13++) {
					this.anIntArray536[local13] -= Static206.anInt3641;
					this.anIntArray534[local13] -= Static103.anInt7471;
					this.anIntArray538[local13] -= Static277.anInt4656;
					if (arg3 != 0) {
						local17 = Class22_Sub7.anIntArray411[arg3];
						local159 = Class22_Sub7.anIntArray410[arg3];
						local177 = this.anIntArray536[local13] * local159 + this.anIntArray534[local13] * local17 + 32767 >> 15;
						this.anIntArray534[local13] = this.anIntArray534[local13] * local159 + 32767 - local17 * this.anIntArray536[local13] >> 15;
						this.anIntArray536[local13] = local177;
					}
					if (arg1 != 0) {
						local17 = Class22_Sub7.anIntArray411[arg1];
						local159 = Class22_Sub7.anIntArray410[arg1];
						local177 = local159 * this.anIntArray534[local13] + 32767 - this.anIntArray538[local13] * local17 >> 15;
						this.anIntArray538[local13] = this.anIntArray538[local13] * local159 + this.anIntArray534[local13] * local17 + 32767 >> 15;
						this.anIntArray534[local13] = local177;
					}
					if (arg2 != 0) {
						local17 = Class22_Sub7.anIntArray411[arg2];
						local159 = Class22_Sub7.anIntArray410[arg2];
						local177 = this.anIntArray536[local13] * local159 + this.anIntArray538[local13] * local17 + 32767 >> 15;
						this.anIntArray538[local13] = this.anIntArray538[local13] * local159 + 32767 - local17 * this.anIntArray536[local13] >> 15;
						this.anIntArray536[local13] = local177;
					}
					this.anIntArray536[local13] += Static206.anInt3641;
					this.anIntArray534[local13] += Static103.anInt7471;
					this.anIntArray538[local13] += Static277.anInt4656;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt5773; local13++) {
					this.anIntArray536[local13] -= Static206.anInt3641;
					this.anIntArray534[local13] -= Static103.anInt7471;
					this.anIntArray538[local13] -= Static277.anInt4656;
					this.anIntArray536[local13] = arg1 * this.anIntArray536[local13] / 128;
					this.anIntArray534[local13] = this.anIntArray534[local13] * arg2 / 128;
					this.anIntArray538[local13] = this.anIntArray538[local13] * arg3 / 128;
					this.anIntArray536[local13] += Static206.anInt3641;
					this.anIntArray534[local13] += Static103.anInt7471;
					this.anIntArray538[local13] += Static277.anInt4656;
				}
			} else {
				@Pc(518) Class224 local518;
				@Pc(523) Class212 local523;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt5788; local13++) {
						local17 = arg1 * 8 + (this.aByteArray84[local13] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray84[local13] = (byte) local17;
					}
					if (this.aClass87_8 != null) {
						this.aClass87_8.anInterface8_2 = null;
					}
					if (this.aClass224Array1 != null) {
						for (local17 = 0; local17 < this.anInt5800; local17++) {
							local518 = this.aClass224Array1[local17];
							local523 = this.aClass212Array1[local17];
							local523.anInt5461 = 255 - (this.aByteArray84[local518.anInt5678] & 0xFF) << 24 | local523.anInt5461 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt5788; local13++) {
						local17 = this.aShortArray99[local13] & 0xFFFF;
						local159 = local17 >> 10 & 0x3F;
						local177 = local17 >> 7 & 0x7;
						local177 += arg2 / 4;
						@Pc(591) int local591 = local159 + arg1 & 0x3F;
						@Pc(595) int local595 = local17 & 0x7F;
						if (local177 < 0) {
							local177 = 0;
						} else if (local177 > 7) {
							local177 = 7;
						}
						local595 += arg3;
						if (local595 < 0) {
							local595 = 0;
						} else if (local595 > 127) {
							local595 = 127;
						}
						this.aShortArray99[local13] = (short) (local591 << 10 | local177 << 7 | local595);
					}
					if (this.aClass87_8 != null) {
						this.aClass87_8.anInterface8_2 = null;
					}
					if (this.aClass224Array1 != null) {
						for (local17 = 0; local17 < this.anInt5800; local17++) {
							local518 = this.aClass224Array1[local17];
							local523 = this.aClass212Array1[local17];
							local523.anInt5461 = local523.anInt5461 & 0xFF000000 | Static165.anIntArray263[this.aShortArray99[local518.anInt5678] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(709) Class212 local709;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt5800; local13++) {
							local709 = this.aClass212Array1[local13];
							local709.anInt5466 += arg1;
							local709.anInt5462 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt5800; local13++) {
							local709 = this.aClass212Array1[local13];
							local709.anInt5463 = local709.anInt5463 * arg2 >> 7;
							local709.anInt5459 = local709.anInt5459 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt5800; local13++) {
							local709 = this.aClass212Array1[local13];
							local709.anInt5467 = local709.anInt5467 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!c;Lclient!qb;II)V")
	@Override
	public void method4650(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class28_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5786 == 0) {
			return;
		}
		@Pc(13) Class33_Sub2 local13 = this.aClass51_Sub2_36.aClass33_Sub2_3;
		@Pc(16) Class33_Sub2 local16 = (Class33_Sub2) arg0;
		if (!this.aBoolean387) {
			this.method4681();
		}
		Static450.aFloat219 = local13.aFloat74 * local16.aFloat78 + local16.aFloat71 * local13.aFloat78 + local13.aFloat80 * local16.aFloat76;
		Static67.aFloat37 = local13.aFloat74 * local16.aFloat72 + local16.aFloat75 * local13.aFloat80 + local13.aFloat78 * local16.aFloat79 + local13.aFloat72;
		@Pc(69) float local69 = Static67.aFloat37 + Static450.aFloat219 * (float) this.aShort76;
		@Pc(77) float local77 = Static67.aFloat37 + Static450.aFloat219 * (float) this.aShort78;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = (float) this.aShort75 + local69;
			local93 = local77 - (float) this.aShort75;
		} else {
			local87 = local77 + (float) this.aShort75;
			local93 = (float) -this.aShort75 + local69;
		}
		if (this.aClass51_Sub2_36.aFloat210 <= local93 || local87 <= (float) this.aClass51_Sub2_36.anInt6923) {
			return;
		}
		Static114.aFloat58 = local13.aFloat75 + local16.aFloat72 * local13.aFloat81 + local13.aFloat76 * local16.aFloat79 + local13.aFloat82 * local16.aFloat75;
		Static268.aFloat130 = local16.aFloat76 * local13.aFloat82 + local16.aFloat71 * local13.aFloat76 + local13.aFloat81 * local16.aFloat78;
		@Pc(170) float local170 = Static114.aFloat58 + (float) this.aShort76 * Static268.aFloat130;
		@Pc(178) float local178 = Static268.aFloat130 * (float) this.aShort78 + Static114.aFloat58;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local170 > local178) {
			local205 = (float) this.aClass51_Sub2_36.anInt6952 * ((float) this.aShort75 + local170);
			local194 = (float) this.aClass51_Sub2_36.anInt6952 * (local178 - (float) this.aShort75);
		} else {
			local194 = (float) this.aClass51_Sub2_36.anInt6952 * ((float) -this.aShort75 + local170);
			local205 = ((float) this.aShort75 + local178) * (float) this.aClass51_Sub2_36.anInt6952;
		}
		if (local194 / (float) arg2 >= this.aClass51_Sub2_36.aFloat196 || local205 / (float) arg2 <= this.aClass51_Sub2_36.aFloat209) {
			return;
		}
		Static65.aFloat54 = local16.aFloat71 * local13.aFloat71 + local16.aFloat76 * local13.aFloat73 + local16.aFloat78 * local13.aFloat77;
		Static39.aFloat20 = local13.aFloat79 + local13.aFloat71 * local16.aFloat79 + local13.aFloat73 * local16.aFloat75 + local16.aFloat72 * local13.aFloat77;
		@Pc(296) float local296 = Static39.aFloat20 + (float) this.aShort76 * Static65.aFloat54;
		@Pc(304) float local304 = (float) this.aShort78 * Static65.aFloat54 + Static39.aFloat20;
		@Pc(330) float local330;
		@Pc(319) float local319;
		if (local304 < local296) {
			local330 = (local304 - (float) this.aShort75) * (float) this.aClass51_Sub2_36.anInt6934;
			local319 = ((float) this.aShort75 + local296) * (float) this.aClass51_Sub2_36.anInt6934;
		} else {
			local319 = ((float) this.aShort75 + local304) * (float) this.aClass51_Sub2_36.anInt6934;
			local330 = (local296 - (float) this.aShort75) * (float) this.aClass51_Sub2_36.anInt6934;
		}
		if (local330 / (float) arg2 >= this.aClass51_Sub2_36.aFloat197 || this.aClass51_Sub2_36.aFloat204 >= local319 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass224Array1 != null) {
			Static162.aFloat70 = local16.aFloat74 * local13.aFloat77 + local13.aFloat71 * local16.aFloat77 + local16.aFloat81 * local13.aFloat73;
			Static272.aFloat131 = local16.aFloat80 * local13.aFloat81 + local16.aFloat73 * local13.aFloat76 + local16.aFloat82 * local13.aFloat82;
			Static278.aFloat138 = local16.aFloat74 * local13.aFloat81 + local13.aFloat82 * local16.aFloat81 + local13.aFloat76 * local16.aFloat77;
			Static459.aFloat190 = local13.aFloat74 * local16.aFloat74 + local16.aFloat77 * local13.aFloat78 + local16.aFloat81 * local13.aFloat80;
			Static346.aFloat161 = local13.aFloat77 * local16.aFloat80 + local16.aFloat82 * local13.aFloat73 + local16.aFloat73 * local13.aFloat71;
			Static357.aFloat166 = local13.aFloat80 * local16.aFloat82 + local16.aFloat73 * local13.aFloat78 + local16.aFloat80 * local13.aFloat74;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort82 + this.aShort83 >> 1;
			@Pc(506) int local506 = this.aShort80 + this.aShort77 >> 1;
			@Pc(525) int local525 = (int) ((float) local506 * Static278.aFloat138 + Static114.aFloat58 + Static272.aFloat131 * (float) local498 + Static268.aFloat130 * (float) this.aShort76);
			@Pc(544) int local544 = (int) (Static162.aFloat70 * (float) local506 + Static39.aFloat20 + Static346.aFloat161 * (float) local498 + Static65.aFloat54 * (float) this.aShort76);
			@Pc(563) int local563 = (int) ((float) local506 * Static459.aFloat190 + (float) this.aShort76 * Static450.aFloat219 + (float) local498 * Static357.aFloat166 + Static67.aFloat37);
			@Pc(582) int local582 = (int) (Static114.aFloat58 + (float) local498 * Static272.aFloat131 + (float) this.aShort78 * Static268.aFloat130 + (float) local506 * Static278.aFloat138);
			@Pc(601) int local601 = (int) (Static39.aFloat20 + Static346.aFloat161 * (float) local498 + (float) this.aShort78 * Static65.aFloat54 + (float) local506 * Static162.aFloat70);
			arg1.anInt5227 = this.aClass51_Sub2_36.anInt6949 + this.aClass51_Sub2_36.anInt6934 * local601 / arg2;
			arg1.anInt5228 = this.aClass51_Sub2_36.anInt6949 + local544 * this.aClass51_Sub2_36.anInt6934 / arg2;
			@Pc(647) int local647 = (int) ((float) local506 * Static459.aFloat190 + (float) this.aShort78 * Static450.aFloat219 + Static67.aFloat37 + Static357.aFloat166 * (float) local498);
			arg1.anInt5225 = local525 * this.aClass51_Sub2_36.anInt6952 / arg2 + this.aClass51_Sub2_36.anInt6932;
			arg1.anInt5224 = local582 * this.aClass51_Sub2_36.anInt6952 / arg2 + this.aClass51_Sub2_36.anInt6932;
			if (local563 < this.aClass51_Sub2_36.anInt6923 && this.aClass51_Sub2_36.anInt6923 > local647) {
				arg1.anInt5226 = this.aClass51_Sub2_36.anInt6952 * (local525 + this.aShort75) / arg2 + this.aClass51_Sub2_36.anInt6932 - arg1.anInt5225;
				arg1.aBoolean336 = true;
			}
		}
		this.aClass51_Sub2_36.method5373((float) arg2);
		this.aClass51_Sub2_36.method5390();
		this.aClass51_Sub2_36.method5421(local16);
		this.method4676();
		this.aClass51_Sub2_36.method5388();
		this.method4673();
	}

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static103.anInt7471 = 0;
			local26 = 0;
			Static277.anInt4656 = 0;
			Static206.anInt3641 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray49.length) {
					local48 = this.anIntArrayArray49[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray109 == null || (this.aShortArray109[local56] & arg6) != 0) {
							Static206.anInt3641 += this.anIntArray536[local56];
							Static103.anInt7471 += this.anIntArray534[local56];
							local26++;
							Static277.anInt4656 += this.anIntArray538[local56];
						}
					}
				}
			}
			if (local26 <= 0) {
				Static206.anInt3641 = arg2;
				Static103.anInt7471 = arg3;
				Static277.anInt4656 = arg4;
			} else {
				Static103.anInt7471 = arg3 + Static103.anInt7471 / local26;
				Static130.aBoolean143 = true;
				Static277.anInt4656 = Static277.anInt4656 / local26 + arg4;
				Static206.anInt3641 = Static206.anInt3641 / local26 + arg2;
			}
			return;
		}
		@Pc(244) int[] local244;
		@Pc(246) int local246;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg7[1] * arg3 + arg7[0] * arg2 + arg4 * arg7[2] + 16384 >> 15;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg3 * arg7[4] + 16384 >> 15;
				local38 = arg7[8] * arg4 + arg7[7] * arg3 + arg2 * arg7[6] + 16384 >> 15;
				arg2 = local26;
				arg4 = local38;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray49.length > local32) {
					local244 = this.anIntArrayArray49[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local50 = local244[local246];
						if (this.aShortArray109 == null || (this.aShortArray109[local50] & arg6) != 0) {
							this.anIntArray536[local50] += arg2;
							this.anIntArray534[local50] += arg3;
							this.anIntArray538[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(388) int local388;
		@Pc(414) int local414;
		@Pc(445) int local445;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(628) int local628;
		@Pc(653) int local653;
		@Pc(657) int local657;
		@Pc(665) int local665;
		@Pc(670) int local670;
		@Pc(674) int local674;
		@Pc(678) int local678;
		@Pc(680) int local680;
		@Pc(814) int[] local814;
		@Pc(816) int local816;
		@Pc(820) int local820;
		@Pc(824) int local824;
		@Pc(826) int local826;
		@Pc(959) int local959;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray49.length) {
						local244 = this.anIntArrayArray49[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local50 = local244[local246];
							if (this.aShortArray109 == null || (this.aShortArray109[local50] & arg6) != 0) {
								this.anIntArray536[local50] -= Static206.anInt3641;
								this.anIntArray534[local50] -= Static103.anInt7471;
								this.anIntArray538[local50] -= Static277.anInt4656;
								if (arg4 != 0) {
									local56 = Class22_Sub7.anIntArray411[arg4];
									local366 = Class22_Sub7.anIntArray410[arg4];
									local388 = local366 * this.anIntArray536[local50] + this.anIntArray534[local50] * local56 + 32767 >> 15;
									this.anIntArray534[local50] = local366 * this.anIntArray534[local50] + 32767 - this.anIntArray536[local50] * local56 >> 15;
									this.anIntArray536[local50] = local388;
								}
								if (arg2 != 0) {
									local56 = Class22_Sub7.anIntArray411[arg2];
									local366 = Class22_Sub7.anIntArray410[arg2];
									local388 = this.anIntArray534[local50] * local366 + 32767 - local56 * this.anIntArray538[local50] >> 15;
									this.anIntArray538[local50] = this.anIntArray534[local50] * local56 + this.anIntArray538[local50] * local366 + 32767 >> 15;
									this.anIntArray534[local50] = local388;
								}
								if (arg3 != 0) {
									local56 = Class22_Sub7.anIntArray411[arg3];
									local366 = Class22_Sub7.anIntArray410[arg3];
									local388 = local366 * this.anIntArray536[local50] + local56 * this.anIntArray538[local50] + 32767 >> 15;
									this.anIntArray538[local50] = this.anIntArray538[local50] * local366 + 32767 - local56 * this.anIntArray536[local50] >> 15;
									this.anIntArray536[local50] = local388;
								}
								this.anIntArray536[local50] += Static206.anInt3641;
								this.anIntArray534[local50] += Static103.anInt7471;
								this.anIntArray538[local50] += Static277.anInt4656;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray49.length) {
							local48 = this.anIntArrayArray49[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray109 == null || (this.aShortArray109[local56] & arg6) != 0) {
									local366 = this.anIntArray537[local56];
									local388 = this.anIntArray537[local56 + 1];
									for (local414 = local366; local414 < local388; local414++) {
										local445 = this.aShortArray106[local414] - 1;
										if (local445 == -1) {
											break;
										}
										if (arg4 != 0) {
											local449 = Class22_Sub7.anIntArray411[arg4];
											local453 = Class22_Sub7.anIntArray410[arg4];
											local457 = this.aShortArray100[local445] * local453 + this.aShortArray108[local445] * local449 + 32767 >> 15;
											this.aShortArray108[local445] = (short) (local453 * this.aShortArray108[local445] + 32767 - local449 * this.aShortArray100[local445] >> 15);
											this.aShortArray100[local445] = (short) local457;
										}
										if (arg2 != 0) {
											local449 = Class22_Sub7.anIntArray411[arg2];
											local453 = Class22_Sub7.anIntArray410[arg2];
											local457 = this.aShortArray108[local445] * local453 + 32767 - local449 * this.aShortArray104[local445] >> 15;
											this.aShortArray104[local445] = (short) (local449 * this.aShortArray108[local445] + local453 * this.aShortArray104[local445] + 32767 >> 15);
											this.aShortArray108[local445] = (short) local457;
										}
										if (arg3 != 0) {
											local449 = Class22_Sub7.anIntArray411[arg3];
											local453 = Class22_Sub7.anIntArray410[arg3];
											local457 = local449 * this.aShortArray104[local445] + local453 * this.aShortArray100[local445] + 32767 >> 15;
											this.aShortArray104[local445] = (short) (this.aShortArray104[local445] * local453 + 32767 - local449 * this.aShortArray100[local445] >> 15);
											this.aShortArray100[local445] = (short) local457;
										}
									}
								}
							}
						}
					}
					if (this.aClass87_11 == null && this.aClass87_8 != null) {
						this.aClass87_8.anInterface8_2 = null;
					}
					if (this.aClass87_11 != null) {
						this.aClass87_11.anInterface8_2 = null;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local246 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static130.aBoolean143) {
					local366 = Static206.anInt3641 * arg7[0] + Static103.anInt7471 * arg7[3] + arg7[6] * Static277.anInt4656 + 16384 >> 15;
					local388 = Static206.anInt3641 * arg7[1] + Static103.anInt7471 * arg7[4] + Static277.anInt4656 * arg7[7] + 16384 >> 15;
					local366 += local246;
					local414 = Static277.anInt4656 * arg7[8] + arg7[2] * Static206.anInt3641 + arg7[5] * Static103.anInt7471 + 16384 >> 15;
					local388 += local50;
					Static103.anInt7471 = local388;
					local414 += local56;
					Static206.anInt3641 = local366;
					Static130.aBoolean143 = false;
					Static277.anInt4656 = local414;
				}
				@Pc(433) int[] local433 = new int[9];
				local388 = Class22_Sub7.anIntArray410[arg2];
				local414 = Class22_Sub7.anIntArray411[arg2];
				local445 = Class22_Sub7.anIntArray410[arg3];
				local449 = Class22_Sub7.anIntArray411[arg3];
				local453 = Class22_Sub7.anIntArray410[arg4];
				local457 = Class22_Sub7.anIntArray411[arg4];
				local465 = local453 * local414 + 16384 >> 15;
				local473 = local457 * local414 + 16384 >> 15;
				local433[8] = local445 * local388 + 16384 >> 15;
				local433[6] = local473 * local445 + local453 * -local449 + 16384 >> 15;
				local433[7] = local445 * local465 + local449 * local457 + 16384 >> 15;
				local433[1] = local457 * -local445 + local465 * local449 + 16384 >> 15;
				local433[0] = local445 * local453 + local449 * local473 + 16384 >> 15;
				local433[3] = local457 * local388 + 16384 >> 15;
				local433[4] = local453 * local388 + 16384 >> 15;
				local433[5] = -local414;
				local433[2] = local388 * local449 + 16384 >> 15;
				@Pc(603) int local603 = local433[2] * -Static277.anInt4656 + -Static206.anInt3641 * local433[0] + local433[1] * -Static103.anInt7471 + 16384 >> 15;
				local628 = local433[5] * -Static277.anInt4656 + local433[3] * -Static206.anInt3641 + -Static103.anInt7471 * local433[4] + 16384 >> 15;
				local653 = -Static277.anInt4656 * local433[8] + local433[7] * -Static103.anInt7471 + -Static206.anInt3641 * local433[6] + 16384 >> 15;
				local657 = Static206.anInt3641 + local603;
				@Pc(661) int local661 = Static103.anInt7471 + local628;
				local665 = Static277.anInt4656 + local653;
				@Pc(668) int[] local668 = new int[9];
				for (local670 = 0; local670 < 3; local670++) {
					for (local674 = 0; local674 < 3; local674++) {
						local678 = 0;
						for (local680 = 0; local680 < 3; local680++) {
							local678 += local433[local670 * 3 + local680] * arg7[local674 * 3 + local680];
						}
						local668[local670 * 3 + local674] = local678 + 16384 >> 15;
					}
				}
				local674 = local433[0] * local246 + local50 * local433[1] + local56 * local433[2] + 16384 >> 15;
				local678 = local433[4] * local50 + local433[3] * local246 + local433[5] * local56 + 16384 >> 15;
				local680 = local433[8] * local56 + local246 * local433[6] + local433[7] * local50 + 16384 >> 15;
				local678 += local661;
				local674 += local657;
				local680 += local665;
				local814 = new int[9];
				for (local816 = 0; local816 < 3; local816++) {
					for (local820 = 0; local820 < 3; local820++) {
						local824 = 0;
						for (local826 = 0; local826 < 3; local826++) {
							local824 += local668[local820 + local826 * 3] * arg7[local826 + local816 * 3];
						}
						local814[local816 * 3 + local820] = local824 + 16384 >> 15;
					}
				}
				local820 = local680 * arg7[2] + arg7[0] * local674 + arg7[1] * local678 + 16384 >> 15;
				local824 = local674 * arg7[3] + arg7[4] * local678 + arg7[5] * local680 + 16384 >> 15;
				local826 = local680 * arg7[8] + arg7[6] * local674 + arg7[7] * local678 + 16384 >> 15;
				local824 += local32;
				local820 += local26;
				local826 += local38;
				for (local959 = 0; local959 < local8; local959++) {
					@Pc(965) int local965 = arg1[local959];
					if (local965 < this.anIntArrayArray49.length) {
						@Pc(979) int[] local979 = this.anIntArrayArray49[local965];
						for (@Pc(981) int local981 = 0; local981 < local979.length; local981++) {
							@Pc(987) int local987 = local979[local981];
							if (this.aShortArray109 == null || (arg6 & this.aShortArray109[local987]) != 0) {
								@Pc(1032) int local1032 = this.anIntArray534[local987] * local814[1] + local814[0] * this.anIntArray536[local987] + local814[2] * this.anIntArray538[local987] + 16384 >> 15;
								@Pc(1065) int local1065 = this.anIntArray536[local987] * local814[3] + local814[4] * this.anIntArray534[local987] + this.anIntArray538[local987] * local814[5] + 16384 >> 15;
								@Pc(1069) int local1069 = local1032 + local820;
								@Pc(1100) int local1100 = this.anIntArray538[local987] * local814[8] + local814[6] * this.anIntArray536[local987] + local814[7] * this.anIntArray534[local987] + 16384 >> 15;
								@Pc(1104) int local1104 = local1065 + local824;
								this.anIntArray536[local987] = local1069;
								@Pc(1113) int local1113 = local1100 + local826;
								this.anIntArray534[local987] = local1104;
								this.anIntArray538[local987] = local1113;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2592) Class224 local2592;
			@Pc(2597) Class212 local2597;
			if (arg0 == 5) {
				if (this.anIntArrayArray51 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray51.length > local32) {
							local244 = this.anIntArrayArray51[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local50 = local244[local246];
								if (this.aShortArray102 == null || (arg6 & this.aShortArray102[local50]) != 0) {
									local56 = (this.aByteArray84[local50] & 0xFF) + (arg2 * 8);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray84[local50] = (byte) local56;
									if (this.aClass87_8 != null) {
										this.aClass87_8.anInterface8_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass224Array1 != null) {
						for (local32 = 0; local32 < this.anInt5800; local32++) {
							local2592 = this.aClass224Array1[local32];
							local2597 = this.aClass212Array1[local32];
							local2597.anInt5461 = local2597.anInt5461 & 0xFFFFFF | 255 - (this.aByteArray84[local2592.anInt5678] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2842) Class212 local2842;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray50.length > local32) {
								local244 = this.anIntArrayArray50[local32];
								for (local246 = 0; local246 < local244.length; local246++) {
									local2842 = this.aClass212Array1[local244[local246]];
									local2842.anInt5462 += arg3;
									local2842.anInt5466 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray50.length) {
								local244 = this.anIntArrayArray50[local32];
								for (local246 = 0; local246 < local244.length; local246++) {
									local2842 = this.aClass212Array1[local244[local246]];
									local2842.anInt5463 = local2842.anInt5463 * arg3 >> 7;
									local2842.anInt5459 = local2842.anInt5459 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray50.length > local32) {
							local244 = this.anIntArrayArray50[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local2842 = this.aClass212Array1[local244[local246]];
								local2842.anInt5467 = local2842.anInt5467 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray51 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray51.length > local32) {
						local244 = this.anIntArrayArray51[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local50 = local244[local246];
							if (this.aShortArray102 == null || (this.aShortArray102[local50] & arg6) != 0) {
								local56 = this.aShortArray99[local50] & 0xFFFF;
								local366 = local56 >> 10 & 0x3F;
								local388 = local56 >> 7 & 0x7;
								local414 = local56 & 0x7F;
								@Pc(2695) int local2695 = arg2 + local366 & 0x3F;
								local388 += arg3 / 4;
								local414 += arg4;
								if (local388 < 0) {
									local388 = 0;
								} else if (local388 > 7) {
									local388 = 7;
								}
								if (local414 < 0) {
									local414 = 0;
								} else if (local414 > 127) {
									local414 = 127;
								}
								this.aShortArray99[local50] = (short) (local2695 << 10 | local388 << 7 | local414);
								if (this.aClass87_8 != null) {
									this.aClass87_8.anInterface8_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass224Array1 != null) {
					for (local32 = 0; local32 < this.anInt5800; local32++) {
						local2592 = this.aClass224Array1[local32];
						local2597 = this.aClass212Array1[local32];
						local2597.anInt5461 = Static165.anIntArray263[this.aShortArray99[local2592.anInt5678] & 0xFFFF] & 0xFFFFFF | local2597.anInt5461 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray49.length) {
					local244 = this.anIntArrayArray49[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local50 = local244[local246];
						if (this.aShortArray109 == null || (this.aShortArray109[local50] & arg6) != 0) {
							this.anIntArray536[local50] -= Static206.anInt3641;
							this.anIntArray534[local50] -= Static103.anInt7471;
							this.anIntArray538[local50] -= Static277.anInt4656;
							this.anIntArray536[local50] = arg2 * this.anIntArray536[local50] >> 7;
							this.anIntArray534[local50] = arg3 * this.anIntArray534[local50] >> 7;
							this.anIntArray538[local50] = this.anIntArray538[local50] * arg4 >> 7;
							this.anIntArray536[local50] += Static206.anInt3641;
							this.anIntArray534[local50] += Static103.anInt7471;
							this.anIntArray538[local50] += Static277.anInt4656;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local246 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static130.aBoolean143) {
				local366 = Static206.anInt3641 * arg7[0] + Static103.anInt7471 * arg7[3] + arg7[6] * Static277.anInt4656 + 16384 >> 15;
				local388 = Static277.anInt4656 * arg7[7] + arg7[4] * Static103.anInt7471 + Static206.anInt3641 * arg7[1] + 16384 >> 15;
				local414 = arg7[5] * Static103.anInt7471 + Static206.anInt3641 * arg7[2] + arg7[8] * Static277.anInt4656 + 16384 >> 15;
				local366 += local246;
				local388 += local50;
				Static206.anInt3641 = local366;
				local414 += local56;
				Static103.anInt7471 = local388;
				Static130.aBoolean143 = false;
				Static277.anInt4656 = local414;
			}
			local366 = arg2 << 15 >> 7;
			local388 = arg3 << 15 >> 7;
			local414 = arg4 << 15 >> 7;
			local445 = -Static206.anInt3641 * local366 + 16384 >> 15;
			local449 = local388 * -Static103.anInt7471 + 16384 >> 15;
			local453 = -Static277.anInt4656 * local414 + 16384 >> 15;
			local457 = local445 + Static206.anInt3641;
			local465 = local449 + Static103.anInt7471;
			local473 = Static277.anInt4656 + local453;
			@Pc(1877) int[] local1877 = new int[] { local366 * arg7[0] + 16384 >> 15, local366 * arg7[3] + 16384 >> 15, local366 * arg7[6] + 16384 >> 15, arg7[1] * local388 + 16384 >> 15, arg7[4] * local388 + 16384 >> 15, arg7[7] * local388 + 16384 >> 15, arg7[2] * local414 + 16384 >> 15, local414 * arg7[5] + 16384 >> 15, local414 * arg7[8] + 16384 >> 15 };
			local628 = local366 * local246 + 16384 >> 15;
			local653 = local388 * local50 + 16384 >> 15;
			@Pc(2005) int local2005 = local628 + local457;
			@Pc(2009) int local2009 = local653 + local465;
			local657 = local414 * local56 + 16384 >> 15;
			@Pc(2021) int local2021 = local657 + local473;
			@Pc(2024) int[] local2024 = new int[9];
			@Pc(2030) int local2030;
			for (local665 = 0; local665 < 3; local665++) {
				for (local2030 = 0; local2030 < 3; local2030++) {
					local670 = 0;
					for (local674 = 0; local674 < 3; local674++) {
						local670 += local1877[local674 * 3 + local2030] * arg7[local674 + local665 * 3];
					}
					local2024[local665 * 3 + local2030] = local670 + 16384 >> 15;
				}
			}
			local2030 = local2021 * arg7[2] + local2009 * arg7[1] + local2005 * arg7[0] + 16384 >> 15;
			local670 = arg7[4] * local2009 + arg7[3] * local2005 + local2021 * arg7[5] + 16384 >> 15;
			local674 = arg7[8] * local2021 + arg7[7] * local2009 + arg7[6] * local2005 + 16384 >> 15;
			local670 += local32;
			local2030 += local26;
			local674 += local38;
			for (local678 = 0; local678 < local8; local678++) {
				local680 = arg1[local678];
				if (local680 < this.anIntArrayArray49.length) {
					local814 = this.anIntArrayArray49[local680];
					for (local816 = 0; local816 < local814.length; local816++) {
						local820 = local814[local816];
						if (this.aShortArray109 == null || (arg6 & this.aShortArray109[local820]) != 0) {
							local824 = this.anIntArray538[local820] * local2024[2] + this.anIntArray536[local820] * local2024[0] + this.anIntArray534[local820] * local2024[1] + 16384 >> 15;
							local826 = this.anIntArray534[local820] * local2024[4] + local2024[3] * this.anIntArray536[local820] + this.anIntArray538[local820] * local2024[5] + 16384 >> 15;
							local959 = local2024[7] * this.anIntArray534[local820] + this.anIntArray536[local820] * local2024[6] + local2024[8] * this.anIntArray538[local820] + 16384 >> 15;
							@Pc(2306) int local2306 = local824 + local2030;
							@Pc(2310) int local2310 = local826 + local670;
							@Pc(2314) int local2314 = local959 + local674;
							this.anIntArray536[local820] = local2306;
							this.anIntArray534[local820] = local2310;
							this.anIntArray538[local820] = local2314;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	private void method4673() {
		if (this.aClass224Array1 == null) {
			return;
		}
		@Pc(8) Class33_Sub2 local8 = this.aClass51_Sub2_36.aClass33_Sub2_2;
		@Pc(12) float local12 = this.aClass51_Sub2_36.xa();
		@Pc(16) float local16 = this.aClass51_Sub2_36.W();
		this.aClass51_Sub2_36.method5359();
		this.aClass51_Sub2_36.method5333(false);
		this.aClass51_Sub2_36.method5392(false);
		this.aClass51_Sub2_36.method5415(this.aClass51_Sub2_36.aClass87_13, null, null, this.aClass51_Sub2_36.aClass87_12);
		for (@Pc(43) int local43 = 0; local43 < this.anInt5800; local43++) {
			@Pc(50) Class224 local50 = this.aClass224Array1[local43];
			@Pc(55) Class212 local55 = this.aClass212Array1[local43];
			if (!local50.aBoolean386 || !this.aClass51_Sub2_36.method5326()) {
				@Pc(84) float local84 = (float) (this.anIntArray536[local50.anInt5682] + this.anIntArray536[local50.anInt5679] + this.anIntArray536[local50.anInt5680]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray534[local50.anInt5680] + this.anIntArray534[local50.anInt5679] + this.anIntArray534[local50.anInt5682]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray538[local50.anInt5680] + this.anIntArray538[local50.anInt5679] + this.anIntArray538[local50.anInt5682]) * 0.3333333F;
				@Pc(142) float local142 = local128 * Static278.aFloat138 + Static268.aFloat130 * local106 + local84 * Static272.aFloat131 + Static114.aFloat58;
				@Pc(156) float local156 = Static39.aFloat20 + local128 * Static162.aFloat70 + local84 * Static346.aFloat161 + Static65.aFloat54 * local106;
				@Pc(170) float local170 = Static67.aFloat37 + local84 * Static357.aFloat166 + Static450.aFloat219 * local106 + local128 * Static459.aFloat190;
				local8.method2384((float) local55.anInt5462 - local156, local55.anInt5459 * local50.aShort72 >> 7, local55.anInt5463 * local50.aShort74 >> 7, local142 + (float) local55.anInt5466, -local170, local55.anInt5467);
				this.aClass51_Sub2_36.method5434(local8);
				this.aClass51_Sub2_36.g(local16, local12 - (float) local50.anInt5677 * 1.5F);
				@Pc(221) int local221 = local55.anInt5461;
				OpenGL.glColor4ub((byte) (local221 >> 16), (byte) (local221 >> 8), (byte) local221, (byte) (local221 >> 24));
				this.aClass51_Sub2_36.method5431(local50.aShort73);
				this.aClass51_Sub2_36.method5412(local50.aByte71);
				this.aClass51_Sub2_36.method5400(local50.aByte72);
				this.aClass51_Sub2_36.method5423(4);
			}
		}
		this.aClass51_Sub2_36.g(local16, local12);
		this.aClass51_Sub2_36.method5333(true);
		this.aClass51_Sub2_36.method5388();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLclient!sg;ZZLclient!sg;I)Lclient!t;")
	private Class163 method4674(@OriginalArg(1) Class163_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class163_Sub2 arg3, @OriginalArg(5) int arg4) {
		arg0.aByte73 = 0;
		arg0.anInt5786 = this.anInt5786;
		arg0.anInt5800 = this.anInt5800;
		arg0.anInt5804 = this.anInt5804;
		arg0.anInt5770 = this.anInt5770;
		arg0.anInt5811 = arg4;
		arg0.anInt5774 = this.anInt5774;
		arg0.anInt5788 = this.anInt5788;
		arg0.anInt5773 = this.anInt5773;
		arg0.aShort79 = this.aShort79;
		arg0.aShort81 = this.aShort81;
		@Pc(53) boolean local53 = Static40.method2438(this.anInt5774, arg4);
		@Pc(59) boolean local59 = Static282.method3734(arg4, this.anInt5774);
		@Pc(65) boolean local65 = Static256.method3399(arg4, this.anInt5774);
		@Pc(71) boolean local71 = local59 | local53 | local65;
		@Pc(190) int local190;
		if (local71) {
			if (!local53) {
				arg0.anIntArray536 = this.anIntArray536;
			} else if (arg3.anIntArray536 == null || this.anInt5770 > arg3.anIntArray536.length) {
				arg0.anIntArray536 = arg3.anIntArray536 = new int[this.anInt5770];
			} else {
				arg0.anIntArray536 = arg3.anIntArray536;
			}
			if (!local59) {
				arg0.anIntArray534 = this.anIntArray534;
			} else if (arg3.anIntArray534 == null || arg3.anIntArray534.length < this.anInt5770) {
				arg0.anIntArray534 = arg3.anIntArray534 = new int[this.anInt5770];
			} else {
				arg0.anIntArray534 = arg3.anIntArray534;
			}
			if (!local65) {
				arg0.anIntArray538 = this.anIntArray538;
			} else if (arg3.anIntArray538 == null || this.anInt5770 > arg3.anIntArray538.length) {
				arg0.anIntArray538 = arg3.anIntArray538 = new int[this.anInt5770];
			} else {
				arg0.anIntArray538 = arg3.anIntArray538;
			}
			for (local190 = 0; local190 < this.anInt5770; local190++) {
				if (local53) {
					arg0.anIntArray536[local190] = this.anIntArray536[local190];
				}
				if (local59) {
					arg0.anIntArray534[local190] = this.anIntArray534[local190];
				}
				if (local65) {
					arg0.anIntArray538[local190] = this.anIntArray538[local190];
				}
			}
		} else {
			arg0.anIntArray538 = this.anIntArray538;
			arg0.anIntArray536 = this.anIntArray536;
			arg0.anIntArray534 = this.anIntArray534;
		}
		if (Static45.method605(arg4, this.anInt5774)) {
			arg0.aClass87_10 = arg3.aClass87_10;
			if (arg2) {
				arg0.aByte73 = (byte) (arg0.aByte73 | 0x1);
			}
			arg0.aClass87_10.aByte19 = this.aClass87_10.aByte19;
			arg0.aClass87_10.anInterface8_2 = this.aClass87_10.anInterface8_2;
		} else if (Static273.method3654(arg4, this.anInt5774)) {
			arg0.aClass87_10 = this.aClass87_10;
		} else {
			arg0.aClass87_10 = null;
		}
		if (Static408.method5123(arg4, this.anInt5774)) {
			if (arg3.aShortArray99 == null || arg3.aShortArray99.length < this.anInt5788) {
				arg0.aShortArray99 = arg3.aShortArray99 = new short[this.anInt5788];
			} else {
				arg0.aShortArray99 = arg3.aShortArray99;
			}
			for (local190 = 0; local190 < this.anInt5788; local190++) {
				arg0.aShortArray99[local190] = this.aShortArray99[local190];
			}
		} else {
			arg0.aShortArray99 = this.aShortArray99;
		}
		if (Static392.method4989(this.anInt5774, arg4)) {
			if (arg3.aByteArray84 == null || this.anInt5788 > arg3.aByteArray84.length) {
				arg0.aByteArray84 = arg3.aByteArray84 = new byte[this.anInt5788];
			} else {
				arg0.aByteArray84 = arg3.aByteArray84;
			}
			for (local190 = 0; local190 < this.anInt5788; local190++) {
				arg0.aByteArray84[local190] = this.aByteArray84[local190];
			}
		} else {
			arg0.aByteArray84 = this.aByteArray84;
		}
		if (Static141.method2175(arg4, this.anInt5774)) {
			if (arg2) {
				arg0.aByte73 = (byte) (arg0.aByte73 | 0x2);
			}
			arg0.aClass87_8 = arg3.aClass87_8;
			arg0.aClass87_8.aByte19 = this.aClass87_8.aByte19;
			arg0.aClass87_8.anInterface8_2 = this.aClass87_8.anInterface8_2;
		} else if (Static449.method5706(arg4, this.anInt5774)) {
			arg0.aClass87_8 = this.aClass87_8;
		} else {
			arg0.aClass87_8 = null;
		}
		@Pc(547) int local547;
		if (Static187.method2739(arg4, this.anInt5774)) {
			if (arg3.aShortArray100 == null || this.anInt5786 > arg3.aShortArray100.length) {
				local190 = this.anInt5786;
				arg0.aShortArray100 = arg3.aShortArray100 = new short[local190];
				arg0.aShortArray108 = arg3.aShortArray108 = new short[local190];
				arg0.aShortArray104 = arg3.aShortArray104 = new short[local190];
			} else {
				arg0.aShortArray100 = arg3.aShortArray100;
				arg0.aShortArray104 = arg3.aShortArray104;
				arg0.aShortArray108 = arg3.aShortArray108;
			}
			if (this.aClass209_1 == null) {
				for (local190 = 0; local190 < this.anInt5786; local190++) {
					arg0.aShortArray100[local190] = this.aShortArray100[local190];
					arg0.aShortArray108[local190] = this.aShortArray108[local190];
					arg0.aShortArray104[local190] = this.aShortArray104[local190];
				}
			} else {
				if (arg3.aClass209_1 == null) {
					arg3.aClass209_1 = new Class209();
				}
				@Pc(535) Class209 local535 = arg0.aClass209_1 = arg3.aClass209_1;
				if (local535.aShortArray95 == null || local535.aShortArray95.length < this.anInt5786) {
					local547 = this.anInt5786;
					local535.aShortArray96 = new short[local547];
					local535.aByteArray82 = new byte[local547];
					local535.aShortArray97 = new short[local547];
					local535.aShortArray95 = new short[local547];
				}
				for (local547 = 0; local547 < this.anInt5786; local547++) {
					arg0.aShortArray100[local547] = this.aShortArray100[local547];
					arg0.aShortArray108[local547] = this.aShortArray108[local547];
					arg0.aShortArray104[local547] = this.aShortArray104[local547];
					local535.aShortArray95[local547] = this.aClass209_1.aShortArray95[local547];
					local535.aShortArray96[local547] = this.aClass209_1.aShortArray96[local547];
					local535.aShortArray97[local547] = this.aClass209_1.aShortArray97[local547];
					local535.aByteArray82[local547] = this.aClass209_1.aByteArray82[local547];
				}
			}
			arg0.aByteArray85 = this.aByteArray85;
		} else {
			arg0.aByteArray85 = this.aByteArray85;
			arg0.aClass209_1 = this.aClass209_1;
			arg0.aShortArray100 = this.aShortArray100;
			arg0.aShortArray108 = this.aShortArray108;
			arg0.aShortArray104 = this.aShortArray104;
		}
		if (Static128.method2063(this.anInt5774, arg4)) {
			if (arg2) {
				arg0.aByte73 = (byte) (arg0.aByte73 | 0x4);
			}
			arg0.aClass87_11 = arg3.aClass87_11;
			arg0.aClass87_11.anInterface8_2 = this.aClass87_11.anInterface8_2;
			arg0.aClass87_11.aByte19 = this.aClass87_11.aByte19;
		} else if (Static175.method2538(arg4, this.anInt5774)) {
			arg0.aClass87_11 = this.aClass87_11;
		} else {
			arg0.aClass87_11 = null;
		}
		if (Static381.method4854(arg4, this.anInt5774)) {
			if (arg3.aFloatArray25 == null || this.anInt5788 > arg3.aFloatArray25.length) {
				local190 = this.anInt5786;
				arg0.aFloatArray25 = arg3.aFloatArray25 = new float[local190];
				arg0.aFloatArray26 = arg3.aFloatArray26 = new float[local190];
			} else {
				arg0.aFloatArray25 = arg3.aFloatArray25;
				arg0.aFloatArray26 = arg3.aFloatArray26;
			}
			for (local190 = 0; local190 < this.anInt5786; local190++) {
				arg0.aFloatArray25[local190] = this.aFloatArray25[local190];
				arg0.aFloatArray26[local190] = this.aFloatArray26[local190];
			}
		} else {
			arg0.aFloatArray25 = this.aFloatArray25;
			arg0.aFloatArray26 = this.aFloatArray26;
		}
		if (Static342.method4434(arg4, this.anInt5774)) {
			if (arg2) {
				arg0.aByte73 = (byte) (arg0.aByte73 | 0x8);
			}
			arg0.aClass87_9 = arg3.aClass87_9;
			arg0.aClass87_9.aByte19 = this.aClass87_9.aByte19;
			arg0.aClass87_9.anInterface8_2 = this.aClass87_9.anInterface8_2;
		} else if (Static42.method575(arg4, this.anInt5774)) {
			arg0.aClass87_9 = this.aClass87_9;
		} else {
			arg0.aClass87_9 = null;
		}
		if (Static366.method4713(this.anInt5774, arg4)) {
			if (arg3.aShortArray105 == null || this.anInt5788 > arg3.aShortArray105.length) {
				local190 = this.anInt5788;
				arg0.aShortArray107 = arg3.aShortArray107 = new short[local190];
				arg0.aShortArray103 = arg3.aShortArray103 = new short[local190];
				arg0.aShortArray105 = arg3.aShortArray105 = new short[local190];
			} else {
				arg0.aShortArray107 = arg3.aShortArray107;
				arg0.aShortArray103 = arg3.aShortArray103;
				arg0.aShortArray105 = arg3.aShortArray105;
			}
			for (local190 = 0; local190 < this.anInt5788; local190++) {
				arg0.aShortArray105[local190] = this.aShortArray105[local190];
				arg0.aShortArray103[local190] = this.aShortArray103[local190];
				arg0.aShortArray107[local190] = this.aShortArray107[local190];
			}
		} else {
			arg0.aShortArray105 = this.aShortArray105;
			arg0.aShortArray107 = this.aShortArray107;
			arg0.aShortArray103 = this.aShortArray103;
		}
		if (Static339.method4423(arg4, this.anInt5774)) {
			arg0.aClass44_1 = arg3.aClass44_1;
			if (arg2) {
				arg0.aByte73 = (byte) (arg0.aByte73 | 0x10);
			}
			arg0.aClass44_1.anInterface10_3 = this.aClass44_1.anInterface10_3;
		} else if (Static71.method1185(this.anInt5774, arg4)) {
			arg0.aClass44_1 = this.aClass44_1;
		} else {
			arg0.aClass44_1 = null;
		}
		if (Static206.method2966(arg4, this.anInt5774)) {
			if (arg3.aShortArray101 == null || arg3.aShortArray101.length < this.anInt5788) {
				local190 = this.anInt5788;
				arg0.aShortArray101 = arg3.aShortArray101 = new short[local190];
			} else {
				arg0.aShortArray101 = arg3.aShortArray101;
			}
			for (local190 = 0; local190 < this.anInt5788; local190++) {
				arg0.aShortArray101[local190] = this.aShortArray101[local190];
			}
		} else {
			arg0.aShortArray101 = this.aShortArray101;
		}
		if (!Static204.method5068(arg4, this.anInt5774)) {
			arg0.aClass212Array1 = this.aClass212Array1;
		} else if (arg3.aClass212Array1 == null || this.anInt5800 > arg3.aClass212Array1.length) {
			local190 = this.anInt5800;
			arg0.aClass212Array1 = arg3.aClass212Array1 = new Class212[local190];
			for (local547 = 0; local547 < this.anInt5800; local547++) {
				arg0.aClass212Array1[local547] = this.aClass212Array1[local547].method4385();
			}
		} else {
			arg0.aClass212Array1 = arg3.aClass212Array1;
			for (local190 = 0; local190 < this.anInt5800; local190++) {
				arg0.aClass212Array1[local190].method4388(this.aClass212Array1[local190]);
			}
		}
		arg0.lb = this.lb;
		arg0.aClass167Array4 = this.aClass167Array4;
		arg0.aClass224Array1 = this.aClass224Array1;
		arg0.anIntArrayArray49 = this.anIntArrayArray49;
		arg0.anIntArrayArray50 = this.anIntArrayArray50;
		arg0.anIntArray535 = this.anIntArray535;
		arg0.anIntArrayArray51 = this.anIntArrayArray51;
		arg0.aShortArray109 = this.aShortArray109;
		if (this.aBoolean387) {
			arg0.aShort78 = this.aShort78;
			arg0.aShort80 = this.aShort80;
			arg0.aShort83 = this.aShort83;
			arg0.aShort77 = this.aShort77;
			arg0.aBoolean387 = true;
			arg0.aShort82 = this.aShort82;
			arg0.aShort76 = this.aShort76;
			arg0.aShort75 = this.aShort75;
		} else {
			arg0.aBoolean387 = false;
		}
		arg0.aShortArray102 = this.aShortArray102;
		arg0.anIntArray537 = this.anIntArray537;
		arg0.aShortArray106 = this.aShortArray106;
		return arg0;
	}

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "()I")
	@Override
	public int l() {
		return this.aShort79;
	}

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "()Z")
	@Override
	protected boolean w() {
		if (this.anIntArrayArray49 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5770; local12++) {
			this.anIntArray536[local12] <<= 0x4;
			this.anIntArray534[local12] <<= 0x4;
			this.anIntArray538[local12] <<= 0x4;
		}
		Static206.anInt3641 = 0;
		Static277.anInt4656 = 0;
		Static103.anInt7471 = 0;
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZ)V")
	private void method4675(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass87_8 != null && this.aClass87_8.anInterface8_2 == null;
		@Pc(27) boolean local27 = this.aClass87_11 != null && this.aClass87_11.anInterface8_2 == null;
		@Pc(44) boolean local44 = this.aClass87_10 != null && this.aClass87_10.anInterface8_2 == null;
		@Pc(55) boolean local55 = this.aClass87_9 != null && this.aClass87_9.anInterface8_2 == null;
		if (arg0) {
			local27 &= (this.aByte73 & 0x4) != 0;
			local16 &= (this.aByte73 & 0x2) != 0;
			local44 &= (this.aByte73 & 0x1) != 0;
			local55 &= (this.aByte73 & 0x8) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (local44) {
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
		if (local55) {
			local114 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2.aByteArray75.length < local106 * this.anInt5786) {
			this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2 = new Class7_Sub14_Sub2((this.anInt5786 + 100) * local106);
		} else {
			this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2.anInt4989 = 0;
		}
		@Pc(193) Class7_Sub14_Sub2 local193 = this.aClass51_Sub2_36.aClass7_Sub14_Sub2_2;
		@Pc(201) int local201;
		@Pc(210) int local210;
		@Pc(238) int local238;
		@Pc(247) int local247;
		if (local44) {
			@Pc(217) int local217;
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(236) int local236;
			if (this.aClass51_Sub2_36.aBoolean461) {
				for (local201 = 0; local201 < this.anInt5773; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray536[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray534[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray538[local201]);
					local229 = this.anIntArray537[local201];
					local236 = this.anIntArray537[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray106[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt4989 = local247 * local106;
						local193.method3933(local210);
						local193.method3933(local217);
						local193.method3933(local224);
					}
				}
			} else {
				for (local201 = 0; local201 < this.anInt5773; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray536[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray534[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray538[local201]);
					local229 = this.anIntArray537[local201];
					local236 = this.anIntArray537[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray106[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt4989 = local247 * local106;
						local193.method3966(local210);
						local193.method3966(local217);
						local193.method3966(local224);
					}
				}
			}
		}
		@Pc(566) float local566;
		@Pc(468) short[] local468;
		@Pc(460) short[] local460;
		@Pc(456) short[] local456;
		@Pc(464) byte[] local464;
		@Pc(618) float local618;
		if (local16) {
			if (this.aClass87_11 == null) {
				if (this.aClass209_1 == null) {
					local464 = this.aByteArray85;
					local468 = this.aShortArray108;
					local460 = this.aShortArray100;
					local456 = this.aShortArray104;
				} else {
					local456 = this.aClass209_1.aShortArray97;
					local460 = this.aClass209_1.aShortArray95;
					local464 = this.aClass209_1.aByteArray82;
					local468 = this.aClass209_1.aShortArray96;
				}
				@Pc(488) float local488 = this.aClass51_Sub2_36.aFloatArray30[0];
				@Pc(494) float local494 = this.aClass51_Sub2_36.aFloatArray30[1];
				@Pc(500) float local500 = this.aClass51_Sub2_36.aFloatArray30[2];
				@Pc(504) float local504 = this.aClass51_Sub2_36.aFloat199;
				@Pc(514) float local514 = this.aClass51_Sub2_36.aFloat207 * 768.0F / (float) this.aShort79;
				@Pc(524) float local524 = this.aClass51_Sub2_36.aFloat208 * 768.0F / (float) this.aShort79;
				for (@Pc(526) int local526 = 0; local526 < this.anInt5788; local526++) {
					@Pc(546) int local546 = this.method4684(this.aByteArray84[local526], this.aShortArray99[local526], this.aShort81, this.aShortArray101[local526]);
					@Pc(555) float local555 = (float) (local546 >>> 24) * this.aClass51_Sub2_36.aFloat203;
					local566 = this.aClass51_Sub2_36.aFloat193 * (float) (local546 >> 16 & 0xFF);
					@Pc(577) float local577 = (float) (local546 >> 8 & 0xFF) * this.aClass51_Sub2_36.aFloat202;
					@Pc(582) short local582 = this.aShortArray105[local526];
					@Pc(587) short local587 = (short) local464[local582];
					if (local587 == 0) {
						local618 = ((float) local468[local582] * local494 + (float) local460[local582] * local488 + local500 * (float) local456[local582]) * 0.0026041667F;
					} else {
						local618 = ((float) local468[local582] * local494 + local488 * (float) local460[local582] + (float) local456[local582] * local500) / (float) (local587 * 256);
					}
					@Pc(655) float local655 = local504 + (local618 < 0.0F ? local524 : local514) * local618;
					@Pc(660) int local660 = (int) (local555 * local655);
					@Pc(665) int local665 = (int) (local566 * local655);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					if (local665 < 0) {
						local665 = 0;
					} else if (local665 > 255) {
						local665 = 255;
					}
					@Pc(697) int local697 = (int) (local655 * local577);
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local193.anInt4989 = local582 * local106 + local110;
					local193.method3970(local660);
					local193.method3970(local665);
					local193.method3970(local697);
					local193.method3970(255 - (this.aByteArray84[local526] & 0xFF));
					local582 = this.aShortArray103[local526];
					local587 = local464[local582];
					if (local587 == 0) {
						local618 = (local494 * (float) local468[local582] + (float) local460[local582] * local488 + local500 * (float) local456[local582]) * 0.0026041667F;
					} else {
						local618 = ((float) local456[local582] * local500 + local494 * (float) local468[local582] + local488 * (float) local460[local582]) / (float) (local587 * 256);
					}
					local655 = local504 + local618 * (local618 < 0.0F ? local524 : local514);
					local660 = (int) (local555 * local655);
					local665 = (int) (local655 * local566);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local697 = (int) (local577 * local655);
					if (local665 < 0) {
						local665 = 0;
					} else if (local665 > 255) {
						local665 = 255;
					}
					local193.anInt4989 = local106 * local582 + local110;
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local193.method3970(local660);
					local193.method3970(local665);
					local193.method3970(local697);
					local193.method3970(255 - (this.aByteArray84[local526] & 0xFF));
					local582 = this.aShortArray107[local526];
					local587 = local464[local582];
					if (local587 == 0) {
						local618 = (local488 * (float) local460[local582] + (float) local468[local582] * local494 + local500 * (float) local456[local582]) * 0.0026041667F;
					} else {
						local618 = ((float) local468[local582] * local494 + (float) local460[local582] * local488 + local500 * (float) local456[local582]) / (float) (local587 * 256);
					}
					local655 = (local618 < 0.0F ? local524 : local514) * local618 + local504;
					local660 = (int) (local555 * local655);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local665 = (int) (local566 * local655);
					if (local665 < 0) {
						local665 = 0;
					} else if (local665 > 255) {
						local665 = 255;
					}
					local697 = (int) (local577 * local655);
					local193.anInt4989 = local110 + local582 * local106;
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local193.method3970(local660);
					local193.method3970(local665);
					local193.method3970(local697);
					local193.method3970(255 - (this.aByteArray84[local526] & 0xFF));
				}
			} else {
				for (local201 = 0; local201 < this.anInt5788; local201++) {
					local210 = this.method4684(this.aByteArray84[local201], this.aShortArray99[local201], this.aShort81, this.aShortArray101[local201]);
					local193.anInt4989 = this.aShortArray105[local201] * local106 + local110;
					local193.method3933(local210);
					local193.anInt4989 = local110 + this.aShortArray103[local201] * local106;
					local193.method3933(local210);
					local193.anInt4989 = local110 + this.aShortArray107[local201] * local106;
					local193.method3933(local210);
				}
			}
		}
		if (local27) {
			if (this.aClass209_1 == null) {
				local464 = this.aByteArray85;
				local460 = this.aShortArray100;
				local468 = this.aShortArray108;
				local456 = this.aShortArray104;
			} else {
				local460 = this.aClass209_1.aShortArray95;
				local456 = this.aClass209_1.aShortArray97;
				local468 = this.aClass209_1.aShortArray96;
				local464 = this.aClass209_1.aByteArray82;
			}
			@Pc(1115) float local1115 = 3.0F / (float) this.aShort79;
			local618 = 3.0F / (float) (this.aShort79 + this.aShort79 / 2);
			local193.anInt4989 = local112;
			if (this.aClass51_Sub2_36.aBoolean461) {
				for (local238 = 0; local238 < this.anInt5786; local238++) {
					local247 = local464[local238] & 0xFF;
					if (local247 == 0) {
						local193.method3996(local618 * (float) local460[local238]);
						local193.method3996((float) local468[local238] * local618);
						local193.method3996(local618 * (float) local456[local238]);
					} else {
						local566 = local1115 / (float) local247;
						local193.method3996((float) local460[local238] * local566);
						local193.method3996((float) local468[local238] * local566);
						local193.method3996((float) local456[local238] * local566);
					}
					local193.anInt4989 += local106 - 12;
				}
			} else {
				for (local238 = 0; local238 < this.anInt5786; local238++) {
					local247 = local464[local238] & 0xFF;
					if (local247 == 0) {
						local193.method3994((float) local460[local238] * local618);
						local193.method3994((float) local468[local238] * local618);
						local193.method3994((float) local456[local238] * local618);
					} else {
						local566 = local1115 / (float) local247;
						local193.method3994((float) local460[local238] * local566);
						local193.method3994(local566 * (float) local468[local238]);
						local193.method3994(local566 * (float) local456[local238]);
					}
					local193.anInt4989 += local106 - 12;
				}
			}
		}
		if (local55) {
			local193.anInt4989 = local114;
			if (this.aClass51_Sub2_36.aBoolean461) {
				for (local201 = 0; local201 < this.anInt5786; local201++) {
					local193.method3996(this.aFloatArray25[local201]);
					local193.method3996(this.aFloatArray26[local201]);
					local193.anInt4989 += local106 - 8;
				}
			} else {
				for (local201 = 0; local201 < this.anInt5786; local201++) {
					local193.method3994(this.aFloatArray25[local201]);
					local193.method3994(this.aFloatArray26[local201]);
					local193.anInt4989 += local106 - 8;
				}
			}
		}
		local193.anInt4989 = local106 * this.anInt5786;
		@Pc(1435) Interface8 local1435;
		if (arg0) {
			if (this.anInterface8_4 == null) {
				this.anInterface8_4 = this.aClass51_Sub2_36.method5433(local193.aByteArray75, true, local106, local193.anInt4989);
			} else {
				this.anInterface8_4.method4988(local193.aByteArray75, local193.anInt4989, local106);
			}
			this.aByte73 = 0;
			local1435 = this.anInterface8_4;
		} else {
			local1435 = this.aClass51_Sub2_36.method5433(local193.aByteArray75, false, local106, local193.anInt4989);
			this.aBoolean388 = true;
		}
		if (local44) {
			this.aClass87_10.aByte19 = 0;
			this.aClass87_10.anInterface8_2 = local1435;
		}
		if (local55) {
			this.aClass87_9.anInterface8_2 = local1435;
			this.aClass87_9.aByte19 = local114;
		}
		if (local16) {
			this.aClass87_8.aByte19 = local110;
			this.aClass87_8.anInterface8_2 = local1435;
		}
		if (local27) {
			this.aClass87_11.aByte19 = local112;
			this.aClass87_11.anInterface8_2 = local1435;
		}
	}

	@OriginalMember(owner = "client!sg", name = "Q", descriptor = "(I)V")
	@Override
	public void Q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22_Sub7.anIntArray411[arg0];
		@Pc(13) int local13 = Class22_Sub7.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5773; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray538[local15] + local13 * this.anIntArray536[local15] >> 15;
			this.anIntArray538[local15] = local13 * this.anIntArray538[local15] - local9 * this.anIntArray536[local15] >> 15;
			this.anIntArray536[local15] = local34;
		}
		this.aBoolean387 = false;
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5788; local3++) {
			local12 = this.aShortArray99[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 -= -((arg1 - local24) * arg3 >> 7);
			}
			@Pc(44) int local44 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 -= -((arg0 - local18) * arg3 >> 7);
			}
			if (arg2 != -1) {
				local44 += arg3 * (arg2 - local44) >> 7;
			}
			this.aShortArray99[local3] = (short) (local44 | local24 << 7 | local18 << 10);
		}
		if (this.aClass224Array1 != null) {
			for (local12 = 0; local12 < this.anInt5800; local12++) {
				@Pc(111) Class224 local111 = this.aClass224Array1[local12];
				@Pc(116) Class212 local116 = this.aClass212Array1[local12];
				local116.anInt5461 = local116.anInt5461 & 0xFF000000 | Static165.anIntArray263[this.aShortArray99[local111.anInt5678] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass87_8 != null) {
			this.aClass87_8.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5773; local3++) {
			if (arg0 != 128) {
				this.anIntArray536[local3] = this.anIntArray536[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray534[local3] = this.anIntArray534[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray538[local3] = arg2 * this.anIntArray538[local3] >> 7;
			}
		}
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "(SS)V")
	@Override
	public void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass51_Sub2_36.anInterface4_8;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5788; local11++) {
			if (arg0 == this.aShortArray101[local11]) {
				this.aShortArray101[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class203 local52 = local9.method3138(arg0 & 0xFFFF);
			local41 = local52.aByte57;
			local39 = local52.aByte62;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(72) Class203 local72 = local9.method3138(arg1 & 0xFFFF);
			local60 = local72.aByte62;
			local62 = local72.aByte57;
		}
		if (!(local62 != local41 | local60 != local39)) {
			return;
		}
		if (this.aClass224Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt5800; local101++) {
				@Pc(108) Class224 local108 = this.aClass224Array1[local101];
				@Pc(113) Class212 local113 = this.aClass212Array1[local101];
				local113.anInt5461 = local113.anInt5461 & 0xFF000000 | Static165.anIntArray263[this.aShortArray99[local108.anInt5678] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass87_8 != null) {
			this.aClass87_8.anInterface8_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!sg", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22_Sub7.anIntArray411[arg0];
		@Pc(13) int local13 = Class22_Sub7.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5773; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray534[local15] - this.anIntArray538[local15] * local9 >> 15;
			this.anIntArray538[local15] = local9 * this.anIntArray534[local15] + this.anIntArray538[local15] * local13 >> 15;
			this.anIntArray534[local15] = local34;
		}
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "()V")
	@Override
	public void method4671() {
		if (this.anInt5786 <= 0 || this.anInt5804 <= 0) {
			return;
		}
		this.method4675(false);
		if ((this.aByte73 & 0x10) == 0 && this.aClass44_1.anInterface10_3 == null) {
			this.method4672(false);
		}
		this.method4679();
	}

	@OriginalMember(owner = "client!sg", name = "NA", descriptor = "()I")
	@Override
	public int NA() {
		if (!this.aBoolean387) {
			this.method4681();
		}
		return this.aShort83;
	}

	@OriginalMember(owner = "client!sg", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		if (!this.aBoolean387) {
			this.method4681();
		}
		return this.aShort80;
	}

	@OriginalMember(owner = "client!sg", name = "XA", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static103.anInt7471 = 0;
			Static277.anInt4656 = 0;
			Static206.anInt3641 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray49.length > local41) {
					local55 = this.anIntArrayArray49[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static206.anInt3641 += this.anIntArray536[local63];
						Static103.anInt7471 += this.anIntArray534[local63];
						Static277.anInt4656 += this.anIntArray538[local63];
						local33++;
					}
				}
			}
			if (local33 > 0) {
				Static277.anInt4656 = local21 + Static277.anInt4656 / local33;
				Static206.anInt3641 = local17 + Static206.anInt3641 / local33;
				Static103.anInt7471 = Static103.anInt7471 / local33 + local25;
			} else {
				Static206.anInt3641 = local17;
				Static103.anInt7471 = local25;
				Static277.anInt4656 = local21;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local17 = arg2 << 4;
			local25 = arg3 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray49.length) {
					local162 = this.anIntArrayArray49[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local57 = local162[local164];
						this.anIntArray536[local57] += local17;
						this.anIntArray534[local57] += local25;
						this.anIntArray538[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(278) int local278;
		@Pc(297) int local297;
		@Pc(753) int local753;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray49.length) {
					local162 = this.anIntArrayArray49[local35];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local57 = local162[local164];
							this.anIntArray536[local57] -= Static206.anInt3641;
							this.anIntArray534[local57] -= Static103.anInt7471;
							this.anIntArray538[local57] -= Static277.anInt4656;
							if (arg4 != 0) {
								local63 = Class22_Sub7.anIntArray411[arg4];
								local278 = Class22_Sub7.anIntArray410[arg4];
								local297 = this.anIntArray534[local57] * local63 + this.anIntArray536[local57] * local278 + 32767 >> 15;
								this.anIntArray534[local57] = local278 * this.anIntArray534[local57] + 32767 - this.anIntArray536[local57] * local63 >> 15;
								this.anIntArray536[local57] = local297;
							}
							if (arg2 != 0) {
								local63 = Class22_Sub7.anIntArray411[arg2];
								local278 = Class22_Sub7.anIntArray410[arg2];
								local297 = local278 * this.anIntArray534[local57] + 32767 - local63 * this.anIntArray538[local57] >> 15;
								this.anIntArray538[local57] = this.anIntArray538[local57] * local278 + local63 * this.anIntArray534[local57] + 32767 >> 15;
								this.anIntArray534[local57] = local297;
							}
							if (arg3 != 0) {
								local63 = Class22_Sub7.anIntArray411[arg3];
								local278 = Class22_Sub7.anIntArray410[arg3];
								local297 = local63 * this.anIntArray538[local57] + this.anIntArray536[local57] * local278 + 32767 >> 15;
								this.anIntArray538[local57] = local278 * this.anIntArray538[local57] + 32767 - local63 * this.anIntArray536[local57] >> 15;
								this.anIntArray536[local57] = local297;
							}
							this.anIntArray536[local57] += Static206.anInt3641;
							this.anIntArray534[local57] += Static103.anInt7471;
							this.anIntArray538[local57] += Static277.anInt4656;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local57 = local162[local164];
							this.anIntArray536[local57] -= Static206.anInt3641;
							this.anIntArray534[local57] -= Static103.anInt7471;
							this.anIntArray538[local57] -= Static277.anInt4656;
							if (arg2 != 0) {
								local63 = Class22_Sub7.anIntArray411[arg2];
								local278 = Class22_Sub7.anIntArray410[arg2];
								local297 = this.anIntArray534[local57] * local278 + 32767 - local63 * this.anIntArray538[local57] >> 15;
								this.anIntArray538[local57] = local63 * this.anIntArray534[local57] + local278 * this.anIntArray538[local57] + 32767 >> 15;
								this.anIntArray534[local57] = local297;
							}
							if (arg4 != 0) {
								local63 = Class22_Sub7.anIntArray411[arg4];
								local278 = Class22_Sub7.anIntArray410[arg4];
								local297 = this.anIntArray534[local57] * local63 + this.anIntArray536[local57] * local278 + 32767 >> 15;
								this.anIntArray534[local57] = this.anIntArray534[local57] * local278 + 32767 - local63 * this.anIntArray536[local57] >> 15;
								this.anIntArray536[local57] = local297;
							}
							if (arg3 != 0) {
								local63 = Class22_Sub7.anIntArray411[arg3];
								local278 = Class22_Sub7.anIntArray410[arg3];
								local297 = local63 * this.anIntArray538[local57] + local278 * this.anIntArray536[local57] + 32767 >> 15;
								this.anIntArray538[local57] = this.anIntArray538[local57] * local278 + 32767 - local63 * this.anIntArray536[local57] >> 15;
								this.anIntArray536[local57] = local297;
							}
							this.anIntArray536[local57] += Static206.anInt3641;
							this.anIntArray534[local57] += Static103.anInt7471;
							this.anIntArray538[local57] += Static277.anInt4656;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray49.length > local41) {
						local55 = this.anIntArrayArray49[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local278 = this.anIntArray537[local63];
							local297 = this.anIntArray537[local63 + 1];
							for (local753 = local278; local753 < local297; local753++) {
								@Pc(762) int local762 = this.aShortArray106[local753] - 1;
								if (local762 == -1) {
									break;
								}
								@Pc(774) int local774;
								@Pc(778) int local778;
								@Pc(797) int local797;
								if (arg4 != 0) {
									local774 = Class22_Sub7.anIntArray411[arg4];
									local778 = Class22_Sub7.anIntArray410[arg4];
									local797 = this.aShortArray108[local762] * local774 + this.aShortArray100[local762] * local778 + 32767 >> 15;
									this.aShortArray108[local762] = (short) (local778 * this.aShortArray108[local762] + 32767 - this.aShortArray100[local762] * local774 >> 15);
									this.aShortArray100[local762] = (short) local797;
								}
								if (arg2 != 0) {
									local774 = Class22_Sub7.anIntArray411[arg2];
									local778 = Class22_Sub7.anIntArray410[arg2];
									local797 = local778 * this.aShortArray108[local762] + 32767 - this.aShortArray104[local762] * local774 >> 15;
									this.aShortArray104[local762] = (short) (local774 * this.aShortArray108[local762] + local778 * this.aShortArray104[local762] + 32767 >> 15);
									this.aShortArray108[local762] = (short) local797;
								}
								if (arg3 != 0) {
									local774 = Class22_Sub7.anIntArray411[arg3];
									local778 = Class22_Sub7.anIntArray410[arg3];
									local797 = this.aShortArray100[local762] * local778 + local774 * this.aShortArray104[local762] + 32767 >> 15;
									this.aShortArray104[local762] = (short) (local778 * this.aShortArray104[local762] + 32767 - local774 * this.aShortArray100[local762] >> 15);
									this.aShortArray100[local762] = (short) local797;
								}
							}
						}
					}
				}
				if (this.aClass87_11 == null && this.aClass87_8 != null) {
					this.aClass87_8.anInterface8_2 = null;
				}
				if (this.aClass87_11 != null) {
					this.aClass87_11.anInterface8_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray49.length) {
					local162 = this.anIntArrayArray49[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local57 = local162[local164];
						this.anIntArray536[local57] -= Static206.anInt3641;
						this.anIntArray534[local57] -= Static103.anInt7471;
						this.anIntArray538[local57] -= Static277.anInt4656;
						this.anIntArray536[local57] = this.anIntArray536[local57] * arg2 >> 7;
						this.anIntArray534[local57] = this.anIntArray534[local57] * arg3 >> 7;
						this.anIntArray538[local57] = this.anIntArray538[local57] * arg4 >> 7;
						this.anIntArray536[local57] += Static206.anInt3641;
						this.anIntArray534[local57] += Static103.anInt7471;
						this.anIntArray538[local57] += Static277.anInt4656;
					}
				}
			}
		} else {
			@Pc(1217) Class224 local1217;
			@Pc(1222) Class212 local1222;
			if (arg0 == 5) {
				if (this.anIntArrayArray51 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray51.length > local35) {
							local162 = this.anIntArrayArray51[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local57 = local162[local164];
								local63 = arg2 * 8 + (this.aByteArray84[local57] & 0xFF);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray84[local57] = (byte) local63;
							}
							if (local162.length > 0 && this.aClass87_8 != null) {
								this.aClass87_8.anInterface8_2 = null;
							}
						}
					}
					if (this.aClass224Array1 != null) {
						for (local35 = 0; local35 < this.anInt5800; local35++) {
							local1217 = this.aClass224Array1[local35];
							local1222 = this.aClass212Array1[local35];
							local1222.anInt5461 = 255 - (this.aByteArray84[local1217.anInt5678] & 0xFF) << 24 | local1222.anInt5461 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1468) Class212 local1468;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray50.length > local35) {
								local162 = this.anIntArrayArray50[local35];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1468 = this.aClass212Array1[local162[local164]];
									local1468.anInt5466 += arg2;
									local1468.anInt5462 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray50.length > local35) {
								local162 = this.anIntArrayArray50[local35];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1468 = this.aClass212Array1[local162[local164]];
									local1468.anInt5459 = local1468.anInt5459 * arg2 >> 7;
									local1468.anInt5463 = local1468.anInt5463 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray50.length > local35) {
							local162 = this.anIntArrayArray50[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1468 = this.aClass212Array1[local162[local164]];
								local1468.anInt5467 = local1468.anInt5467 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray51 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray51.length > local35) {
						local162 = this.anIntArrayArray51[local35];
						for (local164 = 0; local164 < local162.length; local164++) {
							local57 = local162[local164];
							local63 = this.aShortArray99[local57] & 0xFFFF;
							local278 = local63 >> 10 & 0x3F;
							local297 = local63 >> 7 & 0x7;
							local297 += arg3 / 4;
							local753 = local63 & 0x7F;
							@Pc(1318) int local1318 = arg2 + local278 & 0x3F;
							local753 += arg4;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 > 7) {
								local297 = 7;
							}
							if (local753 < 0) {
								local753 = 0;
							} else if (local753 > 127) {
								local753 = 127;
							}
							this.aShortArray99[local57] = (short) (local753 | local1318 << 10 | local297 << 7);
						}
						if (local162.length > 0 && this.aClass87_8 != null) {
							this.aClass87_8.anInterface8_2 = null;
						}
					}
				}
				if (this.aClass224Array1 != null) {
					for (local35 = 0; local35 < this.anInt5800; local35++) {
						local1217 = this.aClass224Array1[local35];
						local1222 = this.aClass212Array1[local35];
						local1222.anInt5461 = local1222.anInt5461 & 0xFF000000 | Static165.anIntArray263[this.aShortArray99[local1217.anInt5678] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean387) {
			this.method4681();
		}
		return this.aShort76;
	}

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "()I")
	@Override
	public int m() {
		if (!this.aBoolean387) {
			this.method4681();
		}
		return this.aShort77;
	}

	@OriginalMember(owner = "client!sg", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean387) {
			this.method4681();
		}
		return this.aShort82;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()[Lclient!ng;")
	@Override
	public Class167[] method4661() {
		return this.aClass167Array4;
	}

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "(I)V")
	@Override
	public void E(@OriginalArg(0) int arg0) {
		if (this.aClass87_8 != null) {
			this.aClass87_8.anInterface8_2 = null;
		}
		this.aShort81 = (short) arg0;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
	private void method4676() {
		if (this.anInt5804 == 0) {
			return;
		}
		if (this.aByte73 != 0) {
			this.method4675(true);
		}
		this.method4675(false);
		if (this.aClass44_1 != null) {
			if (this.aClass44_1.anInterface10_3 == null) {
				this.method4672((this.aByte73 & 0x10) != 0);
			}
			if (this.aClass44_1.anInterface10_3 != null) {
				this.aClass51_Sub2_36.method5392(this.aClass87_11 != null);
				this.aClass51_Sub2_36.method5415(this.aClass87_10, this.aClass87_8, this.aClass87_11, this.aClass87_9);
				@Pc(84) int local84 = this.anIntArray535.length - 1;
				for (@Pc(86) int local86 = 0; local86 < local84; local86++) {
					@Pc(93) int local93 = this.anIntArray535[local86];
					@Pc(100) int local100 = this.anIntArray535[local86 + 1];
					@Pc(107) int local107 = this.aShortArray101[local93] & 0xFFFF;
					if (local107 == 65535) {
						local107 = -1;
					}
					this.aClass51_Sub2_36.method5430(local107, this.aClass87_11 != null);
					this.aClass51_Sub2_36.method5365(this.aClass44_1.anInterface10_3, local93 * 3, (local100 - local93) * 3);
				}
			}
		}
		this.method4679();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ds;B)V")
	private void method4677(@OriginalArg(0) Class7_Sub4_Sub2_Sub1 arg0) {
		if (this.aClass51_Sub2_36.anIntArray594.length < this.anInt5786) {
			this.aClass51_Sub2_36.anIntArray594 = new int[this.anInt5786];
			this.aClass51_Sub2_36.anIntArray592 = new int[this.anInt5786];
		}
		@Pc(38) int[] local38 = this.aClass51_Sub2_36.anIntArray594;
		@Pc(42) int[] local42 = this.aClass51_Sub2_36.anIntArray592;
		@Pc(71) int local71;
		@Pc(109) int local109;
		@Pc(118) int local118;
		for (@Pc(44) int local44 = 0; local44 < this.anInt5773; local44++) {
			local71 = (this.anIntArray536[local44] - (this.aClass51_Sub2_36.anInt6921 * this.anIntArray534[local44] >> 8) >> this.aClass51_Sub2_36.anInt6909) - arg0.anInt1585;
			@Pc(95) int local95 = (this.anIntArray538[local44] - (this.anIntArray534[local44] * this.aClass51_Sub2_36.anInt6940 >> 8) >> this.aClass51_Sub2_36.anInt6909) - arg0.anInt1588;
			@Pc(100) int local100 = this.anIntArray537[local44];
			@Pc(107) int local107 = this.anIntArray537[local44 + 1];
			for (local109 = local100; local109 < local107; local109++) {
				local118 = this.aShortArray106[local109] - 1;
				if (local118 == -1) {
					break;
				}
				local38[local118] = local71;
				local42[local118] = local95;
			}
		}
		for (local71 = 0; local71 < this.anInt5804; local71++) {
			if (this.aByteArray84 == null || this.aByteArray84[local71] <= 128) {
				@Pc(163) short local163 = this.aShortArray105[local71];
				@Pc(168) short local168 = this.aShortArray103[local71];
				@Pc(173) short local173 = this.aShortArray107[local71];
				local109 = local38[local163];
				local118 = local38[local168];
				@Pc(185) int local185 = local38[local173];
				@Pc(189) int local189 = local42[local163];
				@Pc(193) int local193 = local42[local168];
				@Pc(197) int local197 = local42[local173];
				if (-((local193 - local189) * (local185 - local118)) + (local193 - local197) * (local109 - local118) > 0) {
					arg0.method1376(local197, local193, local118, local109, local189, local185);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIZ)Lclient!t;")
	@Override
	public Class163 method4654(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class163_Sub2 local17;
		@Pc(21) Class163_Sub2 local21;
		if (arg0 == 1) {
			local17 = this.aClass51_Sub2_36.aClass163_Sub2_2;
			local21 = this.aClass51_Sub2_36.aClass163_Sub2_10;
		} else if (arg0 == 2) {
			local17 = this.aClass51_Sub2_36.aClass163_Sub2_9;
			local21 = this.aClass51_Sub2_36.aClass163_Sub2_8;
		} else if (arg0 == 3) {
			local17 = this.aClass51_Sub2_36.aClass163_Sub2_7;
			local21 = this.aClass51_Sub2_36.aClass163_Sub2_4;
		} else if (arg0 == 4) {
			local17 = this.aClass51_Sub2_36.aClass163_Sub2_1;
			local21 = this.aClass51_Sub2_36.aClass163_Sub2_5;
		} else if (arg0 == 5) {
			local17 = this.aClass51_Sub2_36.aClass163_Sub2_3;
			local21 = this.aClass51_Sub2_36.aClass163_Sub2_6;
		} else {
			local17 = local21 = new Class163_Sub2(this.aClass51_Sub2_36);
		}
		return this.method4674(local17, arg2, arg0 != 0, local21, arg1);
	}

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "(I)V")
	@Override
	public void R(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class22_Sub7.anIntArray411[arg0];
		@Pc(13) int local13 = Class22_Sub7.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5773; local15++) {
			@Pc(34) int local34 = this.anIntArray534[local15] * local9 + local13 * this.anIntArray536[local15] >> 15;
			this.anIntArray534[local15] = this.anIntArray534[local15] * local13 - this.anIntArray536[local15] * local9 >> 15;
			this.anIntArray536[local15] = local34;
		}
		this.aBoolean387 = false;
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "IA", descriptor = "()V")
	@Override
	public void IA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5773; local7++) {
			this.anIntArray538[local7] = -this.anIntArray538[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5786; local25++) {
			this.aShortArray104[local25] = (short) -this.aShortArray104[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5788; local44++) {
			@Pc(51) short local51 = this.aShortArray105[local44];
			this.aShortArray105[local44] = this.aShortArray107[local44];
			this.aShortArray107[local44] = local51;
		}
		if (this.aClass87_11 == null && this.aClass87_8 != null) {
			this.aClass87_8.anInterface8_2 = null;
		}
		if (this.aClass87_11 != null) {
			this.aClass87_11.anInterface8_2 = null;
		}
		this.aBoolean387 = false;
		if (this.aClass44_1 != null) {
			this.aClass44_1.anInterface10_3 = null;
		}
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIJFLclient!io;IIF)S")
	private short method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class117 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray537[arg3];
		@Pc(17) int local17 = this.anIntArray537[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = local10; local26 < local17; local26++) {
			@Pc(33) short local33 = this.aShortArray106[local26];
			if (local33 == 0) {
				local19 = local26;
				break;
			}
			if (arg4 == Static170.aLongArray9[local26]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray106[local19] = (short) (this.anInt5786 + 1);
		Static170.aLongArray9[local19] = arg4;
		this.aShortArray100[this.anInt5786] = (short) arg0;
		this.aShortArray108[this.anInt5786] = (short) arg1;
		this.aShortArray104[this.anInt5786] = (short) arg2;
		this.aByteArray85[this.anInt5786] = (byte) arg7;
		this.aFloatArray25[this.anInt5786] = arg8;
		this.aFloatArray26[this.anInt5786] = arg5;
		return (short) this.anInt5786++;
	}

	@OriginalMember(owner = "client!sg", name = "aa", descriptor = "(I)V")
	@Override
	public void aa(@OriginalArg(0) int arg0) {
		if (this.aClass87_8 != null) {
			this.aClass87_8.anInterface8_2 = null;
		}
		this.aShort79 = (short) arg0;
		if (this.aClass87_11 != null) {
			this.aClass87_11.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "()V")
	@Override
	protected void j() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5770; local3++) {
			this.anIntArray536[local3] = this.anIntArray536[local3] + 7 >> 4;
			this.anIntArray534[local3] = this.anIntArray534[local3] + 7 >> 4;
			this.anIntArray538[local3] = this.anIntArray538[local3] + 7 >> 4;
		}
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
	private void method4679() {
		if (!this.aBoolean388) {
			return;
		}
		this.aBoolean388 = false;
		if (this.aClass167Array4 == null && this.lb == null && this.aClass224Array1 == null) {
			if (this.anIntArray536 != null && !Static113.method1933(this.anInt5774, this.anInt5811)) {
				if (this.aClass87_10 != null && this.aClass87_10.anInterface8_2 == null) {
					this.aBoolean388 = true;
				} else {
					if (!this.aBoolean387) {
						this.method4681();
					}
					this.anIntArray536 = null;
				}
			}
			if (this.anIntArray534 != null && !Static360.method4614(this.anInt5811, this.anInt5774)) {
				if (this.aClass87_10 != null && this.aClass87_10.anInterface8_2 == null) {
					this.aBoolean388 = true;
				} else {
					if (!this.aBoolean387) {
						this.method4681();
					}
					this.anIntArray534 = null;
				}
			}
			if (this.anIntArray538 != null && !Static18.method202(this.anInt5774, this.anInt5811)) {
				if (this.aClass87_10 != null && this.aClass87_10.anInterface8_2 == null) {
					this.aBoolean388 = true;
				} else {
					if (!this.aBoolean387) {
						this.method4681();
					}
					this.anIntArray538 = null;
				}
			}
		}
		if (this.aShortArray106 != null && this.anIntArray536 == null && this.anIntArray534 == null && this.anIntArray538 == null) {
			this.anIntArray537 = null;
			this.aShortArray106 = null;
		}
		if (this.aByteArray85 != null && !Static322.method4272(this.anInt5774, this.anInt5811)) {
			if (this.aClass87_11 == null) {
				if (this.aClass87_8 != null && this.aClass87_8.anInterface8_2 == null) {
					this.aBoolean388 = true;
				} else {
					this.aShortArray100 = this.aShortArray108 = this.aShortArray104 = null;
					this.aByteArray85 = null;
				}
			} else if (this.aClass87_11.anInterface8_2 == null) {
				this.aBoolean388 = true;
			} else {
				this.aByteArray85 = null;
				this.aShortArray100 = this.aShortArray108 = this.aShortArray104 = null;
			}
		}
		if (this.aShortArray99 != null && !Static58.method809(this.anInt5774, this.anInt5811)) {
			if (this.aClass87_8 != null && this.aClass87_8.anInterface8_2 == null) {
				this.aBoolean388 = true;
			} else {
				this.aShortArray99 = null;
			}
		}
		if (this.aByteArray84 != null && !Static387.method2753(this.anInt5811, this.anInt5774)) {
			if (this.aClass87_8 != null && this.aClass87_8.anInterface8_2 == null) {
				this.aBoolean388 = true;
			} else {
				this.aByteArray84 = null;
			}
		}
		if (this.aFloatArray25 != null && !Static400.method4733(this.anInt5774, this.anInt5811)) {
			if (this.aClass87_9 != null && this.aClass87_9.anInterface8_2 == null) {
				this.aBoolean388 = true;
			} else {
				this.aFloatArray25 = this.aFloatArray26 = null;
			}
		}
		if (this.aShortArray101 != null && !Static89.method1595(this.anInt5774, this.anInt5811)) {
			if (this.aClass87_8 != null && this.aClass87_8.anInterface8_2 == null) {
				this.aBoolean388 = true;
			} else {
				this.aShortArray101 = null;
			}
		}
		if (this.aShortArray105 != null && !Static199.method2857(this.anInt5774, this.anInt5811)) {
			if (this.aClass44_1 != null && this.aClass44_1.anInterface10_3 == null || this.aClass87_8 != null && this.aClass87_8.anInterface8_2 == null) {
				this.aBoolean388 = true;
			} else {
				this.aShortArray105 = this.aShortArray103 = this.aShortArray107 = null;
			}
		}
		if (this.anIntArrayArray51 != null && !Static226.method3130(this.anInt5811, this.anInt5774)) {
			this.anIntArrayArray51 = null;
			this.aShortArray102 = null;
		}
		if (this.anIntArrayArray49 != null && !Static258.method3431(this.anInt5774, this.anInt5811)) {
			this.aShortArray109 = null;
			this.anIntArrayArray49 = null;
		}
		if (this.anIntArrayArray50 != null && !Static223.method3123(this.anInt5811, this.anInt5774)) {
			this.anIntArrayArray50 = null;
		}
		if (this.anIntArray535 != null && (this.anInt5811 & 0x800) == 0 && (this.anInt5811 & 0x40000) == 0) {
			this.anIntArray535 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()[Lclient!dh;")
	@Override
	public Class52[] method4663() {
		return this.lb;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!hs;B)V")
	private void method4680(@OriginalArg(0) Class33_Sub2 arg0) {
		@Pc(14) int local14;
		if (this.aClass167Array4 != null) {
			for (local14 = 0; local14 < this.aClass167Array4.length; local14++) {
				@Pc(21) Class167 local21 = this.aClass167Array4[local14];
				@Pc(23) Class167 local23 = local21;
				if (local21.aClass167_2 != null) {
					local23 = local21.aClass167_2;
				}
				local23.anInt4527 = (int) (arg0.aFloat75 + arg0.aFloat81 * (float) this.anIntArray538[local21.anInt4523] + (float) this.anIntArray536[local21.anInt4523] * arg0.aFloat82 + (float) this.anIntArray534[local21.anInt4523] * arg0.aFloat76);
				local23.anInt4525 = (int) ((float) this.anIntArray536[local21.anInt4523] * arg0.aFloat73 + (float) this.anIntArray534[local21.anInt4523] * arg0.aFloat71 + (float) this.anIntArray538[local21.anInt4523] * arg0.aFloat77 + arg0.aFloat79);
				local23.anInt4530 = (int) (arg0.aFloat72 + (float) this.anIntArray534[local21.anInt4523] * arg0.aFloat78 + arg0.aFloat80 * (float) this.anIntArray536[local21.anInt4523] + (float) this.anIntArray538[local21.anInt4523] * arg0.aFloat74);
				local23.anInt4526 = (int) (arg0.aFloat75 + (float) this.anIntArray536[local21.anInt4520] * arg0.aFloat82 + arg0.aFloat76 * (float) this.anIntArray534[local21.anInt4520] + (float) this.anIntArray538[local21.anInt4520] * arg0.aFloat81);
				local23.anInt4522 = (int) (arg0.aFloat77 * (float) this.anIntArray538[local21.anInt4520] + arg0.aFloat73 * (float) this.anIntArray536[local21.anInt4520] + (float) this.anIntArray534[local21.anInt4520] * arg0.aFloat71 + arg0.aFloat79);
				local23.anInt4517 = (int) (arg0.aFloat78 * (float) this.anIntArray534[local21.anInt4520] + (float) this.anIntArray536[local21.anInt4520] * arg0.aFloat80 + arg0.aFloat74 * (float) this.anIntArray538[local21.anInt4520] + arg0.aFloat72);
				local23.anInt4515 = (int) ((float) this.anIntArray538[local21.anInt4521] * arg0.aFloat81 + (float) this.anIntArray534[local21.anInt4521] * arg0.aFloat76 + arg0.aFloat82 * (float) this.anIntArray536[local21.anInt4521] + arg0.aFloat75);
				local23.anInt4528 = (int) (arg0.aFloat77 * (float) this.anIntArray538[local21.anInt4521] + (float) this.anIntArray534[local21.anInt4521] * arg0.aFloat71 + arg0.aFloat73 * (float) this.anIntArray536[local21.anInt4521] + arg0.aFloat79);
				local23.anInt4529 = (int) (arg0.aFloat72 + arg0.aFloat74 * (float) this.anIntArray538[local21.anInt4521] + arg0.aFloat80 * (float) this.anIntArray536[local21.anInt4521] + arg0.aFloat78 * (float) this.anIntArray534[local21.anInt4521]);
			}
		}
		if (this.lb == null) {
			return;
		}
		for (local14 = 0; local14 < this.lb.length; local14++) {
			@Pc(362) Class52 local362 = this.lb[local14];
			@Pc(364) Class52 local364 = local362;
			if (local362.aClass52_1 != null) {
				local364 = local362.aClass52_1;
			}
			if (local362.aClass33_4 == null) {
				local362.aClass33_4 = arg0.method2435();
			} else {
				local362.aClass33_4.za(arg0);
			}
			local364.anInt1304 = (int) (arg0.aFloat81 * (float) this.anIntArray538[local362.anInt1309] + arg0.aFloat82 * (float) this.anIntArray536[local362.anInt1309] + arg0.aFloat76 * (float) this.anIntArray534[local362.anInt1309] + arg0.aFloat75);
			local364.anInt1306 = (int) ((float) this.anIntArray538[local362.anInt1309] * arg0.aFloat77 + (float) this.anIntArray536[local362.anInt1309] * arg0.aFloat73 + arg0.aFloat71 * (float) this.anIntArray534[local362.anInt1309] + arg0.aFloat79);
			local364.anInt1307 = (int) (arg0.aFloat72 + arg0.aFloat74 * (float) this.anIntArray538[local362.anInt1309] + (float) this.anIntArray534[local362.anInt1309] * arg0.aFloat78 + arg0.aFloat80 * (float) this.anIntArray536[local362.anInt1309]);
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
	private void method4681() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5773; local23++) {
			@Pc(30) int local30 = this.anIntArray536[local23];
			@Pc(35) int local35 = this.anIntArray534[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			@Pc(68) int local68 = this.anIntArray538[local23];
			if (local68 > local17) {
				local17 = local68;
			}
			if (local11 > local68) {
				local11 = local68;
			}
			@Pc(90) int local90 = local30 * local30 + local68 * local68;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local35 * local35 + local30 * local30 + local68 * local68;
			if (local90 > local21) {
				local21 = local90;
			}
		}
		this.aShort80 = (short) local11;
		this.aShort77 = (short) local17;
		this.aShort83 = (short) local13;
		this.aShort76 = (short) local9;
		this.aShort82 = (short) local7;
		this.aShort78 = (short) local15;
		this.aShort75 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean387 = true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method4682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg2 && arg5 > arg1 && arg1 < arg4) {
			return false;
		} else if (arg2 < arg1 && arg1 > arg5 && arg1 > arg4) {
			return false;
		} else if (arg3 > arg0 && arg0 < arg7 && arg0 < arg6) {
			return false;
		} else {
			return arg0 <= arg3 || arg7 >= arg0 || arg0 <= arg6;
		}
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean387) {
			this.method4681();
		}
		@Pc(17) int local17 = arg4 + this.aShort82;
		@Pc(22) int local22 = arg4 + this.aShort83;
		@Pc(28) int local28 = arg6 + this.aShort80;
		@Pc(33) int local33 = this.aShort77 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt4489 <= local22 + arg2.anInt4485 >> arg2.anInt4488 || local28 < 0 || arg2.anInt4485 + local33 >> arg2.anInt4488 >= arg2.anInt4490)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || local22 + arg3.anInt4485 >> arg3.anInt4488 >= arg3.anInt4489 || local28 < 0 || arg3.anInt4485 + local33 >> arg3.anInt4488 >= arg3.anInt4490) {
				return;
			}
		} else {
			local17 >>= arg2.anInt4488;
			local22 = local22 + arg2.anInt4485 - 1 >> arg2.anInt4488;
			local28 >>= arg2.anInt4488;
			local33 = arg2.anInt4485 + local33 - 1 >> arg2.anInt4488;
			if (arg5 == arg2.l(local17, local28) && arg5 == arg2.l(local22, local28) && arg2.l(local17, local33) == arg5 && arg5 == arg2.l(local22, local33)) {
				return;
			}
		}
		@Pc(272) int local272;
		if (arg0 == 1) {
			for (local272 = 0; local272 < this.anInt5773; local272++) {
				this.anIntArray534[local272] -= arg5 - arg2.a(arg4 + this.anIntArray536[local272], arg6 + this.anIntArray538[local272]);
			}
		} else {
			@Pc(203) int local203;
			@Pc(214) int local214;
			if (arg0 == 2) {
				@Pc(195) short local195 = this.aShort76;
				if (local195 == 0) {
					return;
				}
				for (local203 = 0; local203 < this.anInt5773; local203++) {
					local214 = (this.anIntArray534[local203] << 16) / local195;
					if (arg1 > local214) {
						this.anIntArray534[local203] += (arg2.a(arg4 + this.anIntArray536[local203], arg6 + this.anIntArray538[local203]) - arg5) * (-local214 + arg1) / arg1;
					}
				}
			} else {
				@Pc(291) int local291;
				if (arg0 == 3) {
					local272 = (arg1 & 0xFF) * 4;
					local203 = (arg1 >> 8 & 0xFF) * 4;
					local214 = (arg1 >> 16 & 0xFF) << 6;
					local291 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local272 >> 1) < 0 || arg4 + (local272 >> 1) + arg2.anInt4485 >= arg2.anInt4489 << arg2.anInt4488 || arg6 - (local203 >> 1) < 0 || arg2.anInt4490 << arg2.anInt4488 <= (local203 >> 1) + arg6 + arg2.anInt4485) {
						return;
					}
					this.method4668(arg6, local214, local291, arg5, arg4, local203, arg2, local272);
				} else if (arg0 == 4) {
					local272 = this.aShort78 - this.aShort76;
					for (local203 = 0; local203 < this.anInt5773; local203++) {
						this.anIntArray534[local203] = local272 + this.anIntArray534[local203] + arg3.a(this.anIntArray536[local203] + arg4, arg6 + this.anIntArray538[local203]) - arg5;
					}
				} else if (arg0 == 5) {
					local272 = this.aShort78 - this.aShort76;
					for (local203 = 0; local203 < this.anInt5773; local203++) {
						local214 = this.anIntArray536[local203] + arg4;
						local291 = arg6 + this.anIntArray538[local203];
						@Pc(296) int local296 = arg2.a(local214, local291);
						@Pc(301) int local301 = arg3.a(local214, local291);
						@Pc(306) int local306 = local296 - local301;
						this.anIntArray534[local203] = local296 + (local306 * ((this.anIntArray534[local203] << 8) / local272) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "()I")
	@Override
	public int P() {
		return this.anInt5811;
	}

	@OriginalMember(owner = "client!sg", name = "UA", descriptor = "(I)V")
	@Override
	public void UA(@OriginalArg(0) int arg0) {
		this.anInt5811 = arg0;
		this.aBoolean388 = true;
		if (this.aClass209_1 != null && (this.anInt5811 & 0x10000) == 0) {
			this.aShortArray100 = this.aClass209_1.aShortArray95;
			this.aShortArray104 = this.aClass209_1.aShortArray97;
			this.aByteArray85 = this.aClass209_1.aByteArray82;
			this.aShortArray108 = this.aClass209_1.aShortArray96;
			this.aClass209_1 = null;
		}
		this.method4679();
	}

	@OriginalMember(owner = "client!sg", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	@Override
	public Class7_Sub4_Sub2 fa(@OriginalArg(0) Class7_Sub4_Sub2 arg0) {
		if (this.anInt5786 == 0) {
			return null;
		}
		if (!this.aBoolean387) {
			this.method4681();
		}
		@Pc(37) int local37;
		@Pc(53) int local53;
		if (this.aClass51_Sub2_36.anInt6921 > 0) {
			local37 = this.aShort82 - (this.aShort78 * this.aClass51_Sub2_36.anInt6921 >> 8) >> this.aClass51_Sub2_36.anInt6909;
			local53 = this.aShort83 - (this.aShort76 * this.aClass51_Sub2_36.anInt6921 >> 8) >> this.aClass51_Sub2_36.anInt6909;
		} else {
			local37 = this.aShort82 - (this.aClass51_Sub2_36.anInt6921 * this.aShort76 >> 8) >> this.aClass51_Sub2_36.anInt6909;
			local53 = this.aShort83 - (this.aShort78 * this.aClass51_Sub2_36.anInt6921 >> 8) >> this.aClass51_Sub2_36.anInt6909;
		}
		@Pc(110) int local110;
		@Pc(127) int local127;
		if (this.aClass51_Sub2_36.anInt6940 <= 0) {
			local110 = this.aShort80 - (this.aClass51_Sub2_36.anInt6940 * this.aShort76 >> 8) >> this.aClass51_Sub2_36.anInt6909;
			local127 = this.aShort77 - (this.aShort78 * this.aClass51_Sub2_36.anInt6940 >> 8) >> this.aClass51_Sub2_36.anInt6909;
		} else {
			local110 = this.aShort80 - (this.aShort78 * this.aClass51_Sub2_36.anInt6940 >> 8) >> this.aClass51_Sub2_36.anInt6909;
			local127 = this.aShort77 - (this.aClass51_Sub2_36.anInt6940 * this.aShort76 >> 8) >> this.aClass51_Sub2_36.anInt6909;
		}
		@Pc(170) int local170 = local53 + 1 - local37;
		@Pc(177) int local177 = local127 + 1 - local110;
		@Pc(180) Class7_Sub4_Sub2_Sub1 local180 = (Class7_Sub4_Sub2_Sub1) arg0;
		@Pc(196) Class7_Sub4_Sub2_Sub1 local196;
		if (local180 != null && local180.method1374(local170, local177)) {
			local196 = local180;
			local180.method1373();
		} else {
			local196 = new Class7_Sub4_Sub2_Sub1(this.aClass51_Sub2_36, local170, local177);
		}
		local196.method1377(local110, local127, local37, local53);
		this.method4677(local196);
		return local196;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BBIIS)I")
	private int method4684(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3) {
		@Pc(17) int local17 = Static165.anIntArray263[Static344.method4447(arg2, arg1)];
		if (arg3 != -1) {
			@Pc(31) Class203 local31 = this.aClass51_Sub2_36.anInterface4_8.method3138(arg3 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte62 & 0xFF;
			@Pc(45) int local45;
			@Pc(74) int local74;
			if (local36 != 0) {
				if (arg2 < 0) {
					local45 = 0;
				} else if (arg2 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg2 * 131586;
				}
				if (local36 == 256) {
					local17 = local45;
				} else {
					local74 = 256 - local36;
					local17 = ((local17 & 0xFF00) * local74 + (local45 & 0xFF00) * local36 & 0xFF0000) + ((local45 & 0xFF00FF) * local36 + ((local17 & 0xFF00FF) * local74) & 0xFF00FF00) >> 8;
				}
			}
			local45 = local31.aByte57 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(124) int local124 = (local17 >> 16 & 0xFF) * local45;
				if (local124 > 65535) {
					local124 = 65535;
				}
				local74 = (local17 >> 8 & 0xFF) * local45;
				if (local74 > 65535) {
					local74 = 65535;
				}
				@Pc(148) int local148 = (local17 & 0xFF) * local45;
				if (local148 > 65535) {
					local148 = 65535;
				}
				local17 = (local148 >> 8) + ((local124 & 0xC200FF00) << 8) + (local74 & 0xFF00);
			}
		}
		return (local17 << 8) - ((arg0 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!sg", name = "JA", descriptor = "(III)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5773; local7++) {
			if (arg0 != 0) {
				this.anIntArray536[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray534[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray538[local7] += arg2;
			}
		}
		if (this.aClass87_10 != null) {
			this.aClass87_10.anInterface8_2 = null;
		}
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class33_Sub2 local8 = (Class33_Sub2) arg2;
		@Pc(12) Class33_Sub2 local12 = this.aClass51_Sub2_36.aClass33_Sub2_3;
		@Pc(33) float local33 = local12.aFloat75 + local12.aFloat82 * local8.aFloat75 + local12.aFloat76 * local8.aFloat79 + local8.aFloat72 * local12.aFloat81;
		@Pc(54) float local54 = local12.aFloat79 + local12.aFloat71 * local8.aFloat79 + local8.aFloat75 * local12.aFloat73 + local8.aFloat72 * local12.aFloat77;
		@Pc(75) float local75 = local12.aFloat78 * local8.aFloat79 + local8.aFloat75 * local12.aFloat80 + local12.aFloat74 * local8.aFloat72 + local12.aFloat72;
		Static272.aFloat131 = local8.aFloat82 * local12.aFloat82 + local8.aFloat73 * local12.aFloat76 + local8.aFloat80 * local12.aFloat81;
		Static162.aFloat70 = local8.aFloat74 * local12.aFloat77 + local8.aFloat77 * local12.aFloat71 + local8.aFloat81 * local12.aFloat73;
		Static278.aFloat138 = local12.aFloat76 * local8.aFloat77 + local12.aFloat82 * local8.aFloat81 + local12.aFloat81 * local8.aFloat74;
		Static65.aFloat54 = local12.aFloat77 * local8.aFloat78 + local8.aFloat71 * local12.aFloat71 + local8.aFloat76 * local12.aFloat73;
		Static268.aFloat130 = local12.aFloat81 * local8.aFloat78 + local8.aFloat76 * local12.aFloat82 + local8.aFloat71 * local12.aFloat76;
		Static357.aFloat166 = local8.aFloat80 * local12.aFloat74 + local8.aFloat82 * local12.aFloat80 + local12.aFloat78 * local8.aFloat73;
		Static450.aFloat219 = local12.aFloat74 * local8.aFloat78 + local8.aFloat71 * local12.aFloat78 + local8.aFloat76 * local12.aFloat80;
		Static459.aFloat190 = local8.aFloat81 * local12.aFloat80 + local8.aFloat77 * local12.aFloat78 + local12.aFloat74 * local8.aFloat74;
		Static346.aFloat161 = local12.aFloat73 * local8.aFloat82 + local8.aFloat73 * local12.aFloat71 + local8.aFloat80 * local12.aFloat77;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass51_Sub2_36.anInt6952;
		@Pc(255) int local255 = this.aClass51_Sub2_36.anInt6934;
		if (!this.aBoolean387) {
			this.method4681();
		}
		Static162.anIntArray260[0] = this.aShort82;
		Static123.anIntArray171[0] = this.aShort76;
		Static21.anIntArray31[0] = this.aShort80;
		Static162.anIntArray260[1] = this.aShort83;
		Static123.anIntArray171[1] = this.aShort76;
		Static21.anIntArray31[1] = this.aShort80;
		Static162.anIntArray260[2] = this.aShort82;
		Static123.anIntArray171[2] = this.aShort78;
		Static21.anIntArray31[2] = this.aShort80;
		Static162.anIntArray260[3] = this.aShort83;
		Static123.anIntArray171[3] = this.aShort78;
		Static162.anIntArray260[4] = this.aShort82;
		Static21.anIntArray31[3] = this.aShort80;
		Static123.anIntArray171[4] = this.aShort76;
		Static162.anIntArray260[5] = this.aShort83;
		Static21.anIntArray31[4] = this.aShort77;
		Static123.anIntArray171[5] = this.aShort76;
		Static21.anIntArray31[5] = this.aShort77;
		Static162.anIntArray260[6] = this.aShort82;
		Static123.anIntArray171[6] = this.aShort78;
		Static21.anIntArray31[6] = this.aShort77;
		Static162.anIntArray260[7] = this.aShort83;
		Static123.anIntArray171[7] = this.aShort78;
		Static21.anIntArray31[7] = this.aShort77;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static162.anIntArray260[local383];
			local395 = Static123.anIntArray171[local383];
			local400 = Static21.anIntArray31[local383];
			local414 = local54 + Static346.aFloat161 * local390 + local395 * Static65.aFloat54 + local400 * Static162.aFloat70;
			local428 = local75 + local400 * Static459.aFloat190 + Static357.aFloat166 * local390 + Static450.aFloat219 * local395;
			local442 = local33 + local400 * Static278.aFloat138 + local390 * Static272.aFloat131 + local395 * Static268.aFloat130;
			if (local428 >= (float) this.aClass51_Sub2_36.anInt6923) {
				@Pc(461) float local461 = (float) local251 * local442 / local428 + (float) this.aClass51_Sub2_36.anInt6932;
				@Pc(473) float local473 = local414 * (float) local255 / local428 + (float) this.aClass51_Sub2_36.anInt6949;
				if (local241 > local461) {
					local241 = local461;
				}
				if (local243 < local461) {
					local243 = local461;
				}
				if (local247 < local473) {
					local247 = local473;
				}
				local239 = true;
				if (local473 < local245) {
					local245 = local473;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.aClass51_Sub2_36.anIntArray594.length < this.anInt5786) {
				this.aClass51_Sub2_36.anIntArray592 = new int[this.anInt5786];
				this.aClass51_Sub2_36.anIntArray594 = new int[this.anInt5786];
			}
			@Pc(558) int[] local558 = this.aClass51_Sub2_36.anIntArray594;
			@Pc(562) int[] local562 = this.aClass51_Sub2_36.anIntArray592;
			@Pc(638) int local638;
			for (@Pc(564) int local564 = 0; local564 < this.anInt5773; local564++) {
				local395 = this.anIntArray534[local564];
				local400 = this.anIntArray538[local564];
				local390 = this.anIntArray536[local564];
				local428 = Static357.aFloat166 * local390 + local395 * Static450.aFloat219 + Static459.aFloat190 * local400 + local75;
				local442 = Static278.aFloat138 * local400 + local395 * Static268.aFloat130 + local390 * Static272.aFloat131 + local33;
				local414 = Static346.aFloat161 * local390 + local395 * Static65.aFloat54 + local400 * Static162.aFloat70 + local54;
				@Pc(645) int local645;
				@Pc(647) int local647;
				@Pc(656) int local656;
				if (local428 >= (float) this.aClass51_Sub2_36.anInt6923) {
					local638 = (int) ((float) this.aClass51_Sub2_36.anInt6932 + (float) local251 * local442 / local428);
					local645 = (int) ((float) this.aClass51_Sub2_36.anInt6949 + local414 * (float) local255 / local428);
					local647 = this.anIntArray537[local564];
					local656 = this.anIntArray537[local564 + 1];
					for (@Pc(719) int local719 = local647; local719 < local656; local719++) {
						@Pc(728) int local728 = this.aShortArray106[local719] - 1;
						if (local728 == -1) {
							break;
						}
						local558[local728] = local638;
						local562[local728] = local645;
					}
				} else {
					local638 = this.anIntArray537[local564];
					local645 = this.anIntArray537[local564 + 1];
					for (local647 = local638; local647 < local645; local647++) {
						local656 = this.aShortArray106[local647] - 1;
						if (local656 == -1) {
							break;
						}
						local558[this.aShortArray106[local647] - 1] = -999999;
					}
				}
			}
			for (local638 = 0; local638 < this.anInt5788; local638++) {
				if (local558[this.aShortArray105[local638]] != -999999 && local558[this.aShortArray103[local638]] != -999999 && local558[this.aShortArray107[local638]] != -999999 && this.method4682(arg0, arg1, local562[this.aShortArray105[local638]], local558[this.aShortArray105[local638]], local562[this.aShortArray107[local638]], local562[this.aShortArray103[local638]], local558[this.aShortArray107[local638]], local558[this.aShortArray103[local638]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "()I")
	@Override
	public int D() {
		return this.aShort81;
	}

	@OriginalMember(owner = "client!sg", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		if (!this.aBoolean387) {
			this.method4681();
		}
		return this.aShort78;
	}
}
