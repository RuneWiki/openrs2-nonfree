import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "Lclient!wk;")
	private Class357 aClass357_1;

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "[Lclient!efa;")
	private Class89[] aClass89Array5;

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "[Lclient!jt;")
	private Class181[] aClass181Array5;

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!ev", name = "F", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!ev", name = "G", descriptor = "I")
	private int anInt3025;

	@OriginalMember(owner = "client!ev", name = "J", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!ev", name = "M", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!ev", name = "O", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!ev", name = "R", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!ev", name = "S", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!ev", name = "V", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!ev", name = "W", descriptor = "B")
	private byte aByte32;

	@OriginalMember(owner = "client!ev", name = "ab", descriptor = "Lclient!qn;")
	private Interface18 anInterface18_2;

	@OriginalMember(owner = "client!ev", name = "bb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!ev", name = "nb", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!ev", name = "ob", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!ev", name = "pb", descriptor = "I")
	private int anInt3045;

	@OriginalMember(owner = "client!ev", name = "xb", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!ev", name = "yb", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!ev", name = "Ab", descriptor = "[Lclient!ib;")
	private Class154[] aClass154Array1;

	@OriginalMember(owner = "client!ev", name = "Db", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!ev", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!ev", name = "Lb", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!ev", name = "Tb", descriptor = "Lclient!gb;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!ev", name = "Vb", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!ev", name = "Yb", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!ev", name = "Zb", descriptor = "I")
	private int anInt3068;

	@OriginalMember(owner = "client!ev", name = "ac", descriptor = "[Lclient!dl;")
	private Class74[] aClass74Array1;

	@OriginalMember(owner = "client!ev", name = "bc", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!ev", name = "ec", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!ev", name = "fc", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!ev", name = "hc", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!ev", name = "ic", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!ev", name = "nc", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!ev", name = "oc", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!ev", name = "qc", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!ev", name = "rc", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ev", name = "P", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!ev", name = "Kb", descriptor = "I")
	private int anInt3058 = 0;

	@OriginalMember(owner = "client!ev", name = "X", descriptor = "I")
	private int anInt3034 = 0;

	@OriginalMember(owner = "client!ev", name = "Nb", descriptor = "I")
	private int anInt3060 = 0;

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
	private int anInt3021 = 0;

	@OriginalMember(owner = "client!ev", name = "mc", descriptor = "I")
	private int anInt3074 = 0;

	@OriginalMember(owner = "client!ev", name = "Jb", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_8;

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "Lclient!gda;")
	private Class117 aClass117_3;

	@OriginalMember(owner = "client!ev", name = "Rb", descriptor = "Lclient!gda;")
	private Class117 aClass117_5;

	@OriginalMember(owner = "client!ev", name = "zb", descriptor = "Lclient!gda;")
	private Class117 aClass117_4;

	@OriginalMember(owner = "client!ev", name = "jc", descriptor = "Lclient!gda;")
	private Class117 aClass117_6;

	@OriginalMember(owner = "client!ev", name = "fb", descriptor = "Lclient!rn;")
	private Class294 aClass294_1;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class9_Sub3(@OriginalArg(0) Class66_Sub3 arg0) {
		this.aClass66_Sub3_8 = arg0;
		this.aClass117_3 = new Class117(null, 5126, 3, 0);
		this.aClass117_5 = new Class117(null, 5126, 2, 0);
		this.aClass117_4 = new Class117(null, 5126, 3, 0);
		this.aClass117_6 = new Class117(null, 5121, 4, 0);
		this.aClass294_1 = new Class294();
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!no;Lclient!pf;IIII)V")
	public Class9_Sub3(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass66_Sub3_8 = arg0;
		this.anInt3045 = arg5;
		this.anInt3025 = arg2;
		if (Static401.method5810(arg2, arg5)) {
			this.aClass117_3 = new Class117(null, 5126, 3, 0);
		}
		if (Static404.method5843(arg2, arg5)) {
			this.aClass117_5 = new Class117(null, 5126, 2, 0);
		}
		if (Static344.method5100(arg2, arg5)) {
			this.aClass117_4 = new Class117(null, 5126, 3, 0);
		}
		if (Static453.method6412(arg5, arg2)) {
			this.aClass117_6 = new Class117(null, 5121, 4, 0);
		}
		if (Static521.method7302(arg5, arg2)) {
			this.aClass294_1 = new Class294();
		}
		@Pc(102) Interface3 local102 = arg0.anInterface3_15;
		this.anIntArray296 = new int[arg1.anInt7033 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt7038];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt7038; local115++) {
			if ((arg1.aByteArray85 == null || arg1.aByteArray85[local115] != 2) && (arg1.aShortArray124 == null || arg1.aShortArray124[local115] == -1 || !local102.method7249(arg1.aShortArray124[local115] & 0xFFFF).aBoolean512)) {
				local113[this.anInt3034++] = local115;
				this.anIntArray296[arg1.aShortArray128[local115]]++;
				this.anIntArray296[arg1.aShortArray127[local115]]++;
				this.anIntArray296[arg1.aShortArray121[local115]]++;
			}
		}
		this.anInt3058 = this.anInt3034;
		@Pc(205) long[] local205 = new long[this.anInt3034];
		@Pc(217) boolean local217 = (this.anInt3025 & 0x100) != 0;
		@Pc(229) int local229;
		@Pc(240) int local240;
		@Pc(380) int local380;
		label495: for (@Pc(219) int local219 = 0; local219 < this.anInt3034; local219++) {
			@Pc(225) int local225 = local113[local219];
			@Pc(227) Class271 local227 = null;
			local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			@Pc(235) byte local235 = 0;
			if (arg1.aClass253Array1 != null) {
				for (local240 = 0; local240 < arg1.aClass253Array1.length; local240++) {
					@Pc(247) Class253 local247 = arg1.aClass253Array1[local240];
					if (local225 == local247.anInt6798) {
						@Pc(260) Class97 local260 = Static504.method7176(local247.anInt6800);
						if (local260.aBoolean242) {
							local205[local219] = Long.MAX_VALUE;
							this.anInt3058--;
							continue label495;
						}
					}
				}
			}
			@Pc(287) short local287 = -1;
			if (arg1.aShortArray124 != null) {
				local287 = arg1.aShortArray124[local225];
				if (local287 != -1) {
					local227 = local102.method7249(local287 & 0xFFFF);
					local233 = local227.aByte84;
					local235 = local227.aByte81;
				}
			}
			@Pc(336) boolean local336 = arg1.aByteArray86 != null && arg1.aByteArray86[local225] != 0 || local227 != null && local227.aBoolean515 | !local227.aBoolean513;
			if ((local217 || local336) && arg1.aByteArray87 != null) {
				local229 += arg1.aByteArray87[local225] << 17;
			}
			if (local336) {
				local229 += 65536;
			}
			local229 += (local233 & 0xFF) << 8;
			local229 += local235 & 0xFF;
			local380 = local231 + ((local287 & 0xFFFF) << 16);
			@Pc(386) int local386 = local380 + (local219 & 0xFFFF);
			local205[local219] = (long) local386 + ((long) local229 << 32);
		}
		Static497.method7074(local113, local205);
		this.aShortArray60 = arg1.aShortArray123;
		this.anIntArray294 = arg1.anIntArray581;
		this.anInt3021 = arg1.anInt7033;
		this.anIntArray292 = arg1.anIntArray579;
		this.anInt3074 = arg1.anInt7023;
		this.anIntArray295 = arg1.anIntArray580;
		this.aClass181Array5 = arg1.aClass181Array7;
		@Pc(437) Class163[] local437 = new Class163[this.anInt3021];
		this.aClass89Array5 = arg1.aClass89Array7;
		@Pc(461) int local461;
		@Pc(475) int local475;
		if (arg1.aClass253Array1 != null) {
			this.anInt3068 = arg1.aClass253Array1.length;
			this.aClass154Array1 = new Class154[this.anInt3068];
			this.aClass74Array1 = new Class74[this.anInt3068];
			for (local461 = 0; local461 < this.anInt3068; local461++) {
				@Pc(468) Class253 local468 = arg1.aClass253Array1[local461];
				@Pc(473) Class97 local473 = Static504.method7176(local468.anInt6800);
				local475 = -1;
				for (@Pc(477) int local477 = 0; local477 < this.anInt3034; local477++) {
					if (local113[local477] == local468.anInt6798) {
						local475 = local477;
						break;
					}
				}
				if (local475 == -1) {
					throw new RuntimeException();
				}
				local240 = Static170.anIntArray696[arg1.aShortArray129[local468.anInt6798] & 0xFFFF] & 0xFFFFFF;
				local240 |= 255 - (arg1.aByteArray86 == null ? 0 : arg1.aByteArray86[local468.anInt6798]) << 24;
				this.aClass154Array1[local461] = new Class154(local475, arg1.aShortArray128[local468.anInt6798], arg1.aShortArray127[local468.anInt6798], arg1.aShortArray121[local468.anInt6798], local473.anInt3081, local473.anInt3078, local473.anInt3082, local473.anInt3076, local473.anInt3083, local473.aBoolean242, local473.aBoolean241, local468.anInt6797);
				this.aClass74Array1[local461] = new Class74(local240);
			}
		}
		local461 = this.anInt3034 * 3;
		this.aShortArray61 = new short[this.anInt3034];
		this.aShortArray64 = new short[this.anInt3034];
		this.aFloatArray25 = new float[local461];
		this.aShort41 = (short) arg4;
		this.aByteArray36 = new byte[this.anInt3034];
		this.aByteArray35 = new byte[local461];
		Static95.aLongArray14 = new long[local461];
		this.aShortArray58 = new short[this.anInt3034];
		this.aFloatArray24 = new float[local461];
		this.aShortArray56 = new short[local461];
		this.aShortArray63 = new short[local461];
		this.aShortArray55 = new short[local461];
		this.aShortArray59 = new short[this.anInt3034];
		this.aShortArray65 = new short[this.anInt3034];
		if (arg1.aShortArray126 != null) {
			this.aShortArray57 = new short[this.anInt3034];
		}
		this.aShortArray62 = new short[local461];
		this.aShort43 = (short) arg3;
		local229 = 0;
		for (local380 = 0; local380 < arg1.anInt7033; local380++) {
			local475 = this.anIntArray296[local380];
			this.anIntArray296[local380] = local229;
			local229 += local475;
			local437[local380] = new Class163();
		}
		this.anIntArray296[arg1.anInt7033] = local229;
		@Pc(716) int[] local716 = null;
		@Pc(718) int[] local718 = null;
		@Pc(720) int[] local720 = null;
		@Pc(722) float[][] local722 = null;
		@Pc(748) int local748;
		@Pc(786) int local786;
		@Pc(792) int local792;
		@Pc(805) int local805;
		@Pc(807) int local807;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(992) float local992;
		@Pc(1023) float local1023;
		@Pc(994) float local994;
		if (arg1.aByteArray90 != null) {
			@Pc(728) int local728 = arg1.anInt7030;
			@Pc(731) int[] local731 = new int[local728];
			@Pc(734) int[] local734 = new int[local728];
			@Pc(737) int[] local737 = new int[local728];
			@Pc(740) int[] local740 = new int[local728];
			@Pc(743) int[] local743 = new int[local728];
			@Pc(746) int[] local746 = new int[local728];
			for (local748 = 0; local748 < local728; local748++) {
				local731[local748] = Integer.MAX_VALUE;
				local734[local748] = -2147483647;
				local737[local748] = Integer.MAX_VALUE;
				local740[local748] = -2147483647;
				local743[local748] = Integer.MAX_VALUE;
				local746[local748] = -2147483647;
			}
			local716 = new int[local728];
			local720 = new int[local728];
			for (local786 = 0; local786 < this.anInt3034; local786++) {
				local792 = local113[local786];
				if (arg1.aByteArray90[local792] != -1) {
					local805 = arg1.aByteArray90[local792] & 0xFF;
					for (local807 = 0; local807 < 3; local807++) {
						@Pc(816) short local816;
						if (local807 == 0) {
							local816 = arg1.aShortArray128[local792];
						} else if (local807 == 1) {
							local816 = arg1.aShortArray127[local792];
						} else {
							local816 = arg1.aShortArray121[local792];
						}
						local838 = arg1.anIntArray581[local816];
						local843 = arg1.anIntArray580[local816];
						@Pc(848) int local848 = arg1.anIntArray579[local816];
						if (local731[local805] > local838) {
							local731[local805] = local838;
						}
						if (local838 > local734[local805]) {
							local734[local805] = local838;
						}
						if (local737[local805] > local843) {
							local737[local805] = local843;
						}
						if (local843 > local740[local805]) {
							local740[local805] = local843;
						}
						if (local743[local805] > local848) {
							local743[local805] = local848;
						}
						if (local848 > local746[local805]) {
							local746[local805] = local848;
						}
					}
				}
			}
			local718 = new int[local728];
			local722 = new float[local728][];
			for (local792 = 0; local792 < local728; local792++) {
				@Pc(936) byte local936 = arg1.aByteArray89[local792];
				if (local936 > 0) {
					local716[local792] = (local731[local792] + local734[local792]) / 2;
					local718[local792] = (local740[local792] + local737[local792]) / 2;
					local720[local792] = (local746[local792] + local743[local792]) / 2;
					if (local936 == 1) {
						local843 = arg1.anIntArray586[local792];
						if (local843 == 0) {
							local992 = 1.0F;
							local994 = 1.0F;
						} else if (local843 > 0) {
							local994 = (float) local843 / 1024.0F;
							local992 = 1.0F;
						} else {
							local994 = 1.0F;
							local992 = (float) -local843 / 1024.0F;
						}
						local1023 = 64.0F / (float) arg1.anIntArray578[local792];
					} else if (local936 == 2) {
						local992 = 64.0F / (float) arg1.anIntArray586[local792];
						local994 = 64.0F / (float) arg1.anIntArray588[local792];
						local1023 = 64.0F / (float) arg1.anIntArray578[local792];
					} else {
						local1023 = (float) arg1.anIntArray578[local792] / 1024.0F;
						local992 = (float) arg1.anIntArray586[local792] / 1024.0F;
						local994 = (float) arg1.anIntArray588[local792] / 1024.0F;
					}
					local722[local792] = Static358.method5268(arg1.aShortArray130[local792], local1023, arg1.aShortArray125[local792], local994, arg1.aShortArray122[local792], local992, arg1.aByteArray88[local792] & 0xFF);
				}
			}
		}
		@Pc(1116) Class332[] local1116 = new Class332[arg1.anInt7038];
		@Pc(1135) short local1135;
		@Pc(1145) int local1145;
		@Pc(1155) int local1155;
		@Pc(1214) int local1214;
		for (@Pc(1118) int local1118 = 0; local1118 < arg1.anInt7038; local1118++) {
			@Pc(1125) short local1125 = arg1.aShortArray128[local1118];
			@Pc(1130) short local1130 = arg1.aShortArray127[local1118];
			local1135 = arg1.aShortArray121[local1118];
			local1145 = this.anIntArray294[local1130] - this.anIntArray294[local1125];
			local1155 = this.anIntArray295[local1130] - this.anIntArray295[local1125];
			local748 = this.anIntArray292[local1130] - this.anIntArray292[local1125];
			local786 = this.anIntArray294[local1135] - this.anIntArray294[local1125];
			local792 = this.anIntArray295[local1135] - this.anIntArray295[local1125];
			local805 = this.anIntArray292[local1135] - this.anIntArray292[local1125];
			local807 = local1155 * local805 - local748 * local792;
			local1214 = local748 * local786 - local1145 * local805;
			local838 = local792 * local1145 - local1155 * local786;
			while (local807 > 8192 || local1214 > 8192 || local838 > 8192 || local807 < -8192 || local1214 < -8192 || local838 < -8192) {
				local838 >>= 0x1;
				local807 >>= 0x1;
				local1214 >>= 0x1;
			}
			local843 = (int) Math.sqrt((double) (local1214 * local1214 + local807 * local807 + local838 * local838));
			if (local843 <= 0) {
				local843 = 1;
			}
			local838 = local838 * 256 / local843;
			local807 = local807 * 256 / local843;
			local1214 = local1214 * 256 / local843;
			@Pc(1307) byte local1307 = arg1.aByteArray85 == null ? 0 : arg1.aByteArray85[local1118];
			if (local1307 == 0) {
				@Pc(1338) Class163 local1338 = local437[local1125];
				local1338.anInt4673++;
				local1338.anInt4675 += local807;
				local1338.anInt4674 += local1214;
				local1338.anInt4676 += local838;
				@Pc(1366) Class163 local1366 = local437[local1130];
				local1366.anInt4675 += local807;
				local1366.anInt4674 += local1214;
				local1366.anInt4673++;
				local1366.anInt4676 += local838;
				@Pc(1394) Class163 local1394 = local437[local1135];
				local1394.anInt4674 += local1214;
				local1394.anInt4675 += local807;
				local1394.anInt4673++;
				local1394.anInt4676 += local838;
			} else if (local1307 == 1) {
				@Pc(1323) Class332 local1323 = local1116[local1118] = new Class332();
				local1323.anInt9017 = local838;
				local1323.anInt9015 = local807;
				local1323.anInt9016 = local1214;
			}
		}
		@Pc(1435) int local1435;
		for (@Pc(1429) int local1429 = 0; local1429 < this.anInt3034; local1429++) {
			local1435 = local113[local1429];
			@Pc(1442) int local1442 = arg1.aShortArray129[local1435] & 0xFFFF;
			@Pc(1450) short local1450;
			if (arg1.aShortArray124 == null) {
				local1450 = -1;
			} else {
				local1450 = arg1.aShortArray124[local1435];
			}
			if (arg1.aByteArray90 == null) {
				local1155 = -1;
			} else {
				local1155 = arg1.aByteArray90[local1435];
			}
			if (arg1.aByteArray86 == null) {
				local748 = 0;
			} else {
				local748 = arg1.aByteArray86[local1435] & 0xFF;
			}
			@Pc(1482) float local1482 = 0.0F;
			@Pc(1484) float local1484 = 0.0F;
			@Pc(1486) float local1486 = 0.0F;
			local992 = 0.0F;
			local1023 = 0.0F;
			local994 = 0.0F;
			@Pc(1494) byte local1494 = 0;
			@Pc(1496) byte local1496 = 0;
			@Pc(1498) int local1498 = 0;
			@Pc(1533) byte local1533;
			@Pc(1553) short local1553;
			@Pc(1558) short local1558;
			@Pc(1563) short local1563;
			if (local1450 != -1) {
				if (local1155 == -1) {
					local1486 = 1.0F;
					local1023 = 0.0F;
					local1484 = 1.0F;
					local992 = 1.0F;
					local1494 = 1;
					local994 = 0.0F;
					local1482 = 0.0F;
					local1496 = 2;
				} else {
					local1155 &= 0xFF;
					local1533 = arg1.aByteArray89[local1155];
					@Pc(1543) short local1543;
					@Pc(1548) short local1548;
					@Pc(1586) float local1586;
					@Pc(1595) float local1595;
					@Pc(1604) float local1604;
					@Pc(1689) float local1689;
					@Pc(1697) float local1697;
					@Pc(1706) float local1706;
					@Pc(1715) float local1715;
					@Pc(1723) float local1723;
					@Pc(1731) float local1731;
					if (local1533 == 0) {
						local1543 = arg1.aShortArray128[local1435];
						local1548 = arg1.aShortArray127[local1435];
						local1553 = arg1.aShortArray121[local1435];
						local1558 = arg1.aShortArray122[local1155];
						local1563 = arg1.aShortArray125[local1155];
						@Pc(1568) short local1568 = arg1.aShortArray130[local1155];
						@Pc(1574) float local1574 = (float) arg1.anIntArray581[local1558];
						@Pc(1580) float local1580 = (float) arg1.anIntArray580[local1558];
						local1586 = arg1.anIntArray579[local1558];
						local1595 = (float) arg1.anIntArray581[local1563] - local1574;
						local1604 = (float) arg1.anIntArray580[local1563] - local1580;
						@Pc(1613) float local1613 = (float) arg1.anIntArray579[local1563] - local1586;
						@Pc(1621) float local1621 = (float) arg1.anIntArray581[local1568] - local1574;
						@Pc(1630) float local1630 = (float) arg1.anIntArray580[local1568] - local1580;
						@Pc(1638) float local1638 = (float) arg1.anIntArray579[local1568] - local1586;
						@Pc(1646) float local1646 = (float) arg1.anIntArray581[local1543] - local1574;
						@Pc(1655) float local1655 = (float) arg1.anIntArray580[local1543] - local1580;
						@Pc(1663) float local1663 = (float) arg1.anIntArray579[local1543] - local1586;
						@Pc(1672) float local1672 = (float) arg1.anIntArray581[local1548] - local1574;
						@Pc(1680) float local1680 = (float) arg1.anIntArray580[local1548] - local1580;
						local1689 = (float) arg1.anIntArray579[local1548] - local1586;
						local1697 = (float) arg1.anIntArray581[local1553] - local1574;
						local1706 = (float) arg1.anIntArray580[local1553] - local1580;
						local1715 = (float) arg1.anIntArray579[local1553] - local1586;
						local1723 = local1604 * local1638 - local1613 * local1630;
						local1731 = local1613 * local1621 - local1595 * local1638;
						@Pc(1740) float local1740 = local1630 * local1595 - local1604 * local1621;
						@Pc(1749) float local1749 = local1630 * local1740 - local1638 * local1731;
						@Pc(1758) float local1758 = local1723 * local1638 - local1740 * local1621;
						@Pc(1767) float local1767 = local1731 * local1621 - local1723 * local1630;
						@Pc(1781) float local1781 = 1.0F / (local1613 * local1767 + local1758 * local1604 + local1749 * local1595);
						local1023 = local1781 * (local1715 * local1767 + local1697 * local1749 + local1706 * local1758);
						local1486 = (local1758 * local1680 + local1749 * local1672 + local1767 * local1689) * local1781;
						local1482 = local1781 * (local1663 * local1767 + local1758 * local1655 + local1749 * local1646);
						@Pc(1831) float local1831 = local1740 * local1604 - local1731 * local1613;
						@Pc(1840) float local1840 = local1595 * local1731 - local1723 * local1604;
						@Pc(1849) float local1849 = local1613 * local1723 - local1740 * local1595;
						@Pc(1863) float local1863 = 1.0F / (local1840 * local1638 + local1849 * local1630 + local1621 * local1831);
						local1484 = (local1849 * local1655 + local1831 * local1646 + local1663 * local1840) * local1863;
						local994 = (local1715 * local1840 + local1831 * local1697 + local1849 * local1706) * local1863;
						local992 = local1863 * (local1840 * local1689 + local1831 * local1672 + local1849 * local1680);
					} else {
						local1543 = arg1.aShortArray128[local1435];
						local1548 = arg1.aShortArray127[local1435];
						local1553 = arg1.aShortArray121[local1435];
						@Pc(1926) int local1926 = local716[local1155];
						@Pc(1930) int local1930 = local718[local1155];
						@Pc(1934) int local1934 = local720[local1155];
						@Pc(1938) float[] local1938 = local722[local1155];
						@Pc(1943) byte local1943 = arg1.aByteArray91[local1155];
						local1586 = (float) arg1.anIntArray585[local1155] / 256.0F;
						if (local1533 == 1) {
							local1595 = (float) arg1.anIntArray588[local1155] / 1024.0F;
							Static303.method4691(local1926, arg1.anIntArray580[local1543], arg1.anIntArray579[local1543], local1586, local1595, arg1.anIntArray581[local1543], local1938, local1930, local1934, local1943);
							local1482 = Static228.aFloat92;
							local1484 = Static278.aFloat97;
							Static303.method4691(local1926, arg1.anIntArray580[local1548], arg1.anIntArray579[local1548], local1586, local1595, arg1.anIntArray581[local1548], local1938, local1930, local1934, local1943);
							local1486 = Static228.aFloat92;
							local992 = Static278.aFloat97;
							Static303.method4691(local1926, arg1.anIntArray580[local1553], arg1.anIntArray579[local1553], local1586, local1595, arg1.anIntArray581[local1553], local1938, local1930, local1934, local1943);
							local994 = Static278.aFloat97;
							local1023 = Static228.aFloat92;
							local1604 = local1595 / 2.0F;
							if ((local1943 & 0x1) == 0) {
								if (local1604 < local1023 - local1482) {
									local1023 -= local1595;
									local1496 = 1;
								} else if (local1482 - local1023 > local1604) {
									local1496 = 2;
									local1023 += local1595;
								}
								if (local1486 - local1482 > local1604) {
									local1494 = 1;
									local1486 -= local1595;
								} else if (local1604 < local1482 - local1486) {
									local1494 = 2;
									local1486 += local1595;
								}
							} else {
								if (local994 - local1484 > local1604) {
									local994 -= local1595;
									local1496 = 1;
								} else if (local1604 < local1484 - local994) {
									local1496 = 2;
									local994 += local1595;
								}
								if (local992 - local1484 > local1604) {
									local992 -= local1595;
									local1494 = 1;
								} else if (local1604 < local1484 - local992) {
									local992 += local1595;
									local1494 = 2;
								}
							}
						} else if (local1533 == 2) {
							local1595 = (float) arg1.anIntArray583[local1155] / 256.0F;
							local1604 = (float) arg1.anIntArray587[local1155] / 256.0F;
							@Pc(2385) int local2385 = arg1.anIntArray581[local1548] - arg1.anIntArray581[local1543];
							@Pc(2396) int local2396 = arg1.anIntArray580[local1548] - arg1.anIntArray580[local1543];
							@Pc(2407) int local2407 = arg1.anIntArray579[local1548] - arg1.anIntArray579[local1543];
							@Pc(2417) int local2417 = arg1.anIntArray581[local1553] - arg1.anIntArray581[local1543];
							@Pc(2428) int local2428 = arg1.anIntArray580[local1553] - arg1.anIntArray580[local1543];
							@Pc(2439) int local2439 = arg1.anIntArray579[local1553] - arg1.anIntArray579[local1543];
							@Pc(2447) int local2447 = local2396 * local2439 - local2428 * local2407;
							@Pc(2455) int local2455 = local2417 * local2407 - local2385 * local2439;
							@Pc(2464) int local2464 = local2385 * local2428 - local2417 * local2396;
							local1689 = 64.0F / (float) arg1.anIntArray586[local1155];
							local1697 = 64.0F / (float) arg1.anIntArray578[local1155];
							local1706 = 64.0F / (float) arg1.anIntArray588[local1155];
							local1715 = (local1938[2] * (float) local2464 + local1938[1] * (float) local2455 + (float) local2447 * local1938[0]) / local1689;
							local1723 = (local1938[5] * (float) local2464 + local1938[3] * (float) local2447 + (float) local2455 * local1938[4]) / local1697;
							local1731 = (local1938[8] * (float) local2464 + local1938[6] * (float) local2447 + local1938[7] * (float) local2455) / local1706;
							local1498 = Static419.method6625(local1731, local1715, local1723);
							Static234.method6127(arg1.anIntArray579[local1543], arg1.anIntArray581[local1543], arg1.anIntArray580[local1543], local1943, local1595, local1930, local1934, local1586, local1938, local1604, local1926, local1498);
							local1484 = Static572.aFloat202;
							local1482 = Static571.aFloat198;
							Static234.method6127(arg1.anIntArray579[local1548], arg1.anIntArray581[local1548], arg1.anIntArray580[local1548], local1943, local1595, local1930, local1934, local1586, local1938, local1604, local1926, local1498);
							local1486 = Static571.aFloat198;
							local992 = Static572.aFloat202;
							Static234.method6127(arg1.anIntArray579[local1553], arg1.anIntArray581[local1553], arg1.anIntArray580[local1553], local1943, local1595, local1930, local1934, local1586, local1938, local1604, local1926, local1498);
							local994 = Static572.aFloat202;
							local1023 = Static571.aFloat198;
						} else if (local1533 == 3) {
							Static167.method3210(local1943, local1926, arg1.anIntArray580[local1543], local1586, local1938, arg1.anIntArray581[local1543], local1934, local1930, arg1.anIntArray579[local1543]);
							local1484 = Static99.aFloat49;
							local1482 = Static395.aFloat140;
							Static167.method3210(local1943, local1926, arg1.anIntArray580[local1548], local1586, local1938, arg1.anIntArray581[local1548], local1934, local1930, arg1.anIntArray579[local1548]);
							local1486 = Static395.aFloat140;
							local992 = Static99.aFloat49;
							Static167.method3210(local1943, local1926, arg1.anIntArray580[local1553], local1586, local1938, arg1.anIntArray581[local1553], local1934, local1930, arg1.anIntArray579[local1553]);
							local1023 = Static395.aFloat140;
							local994 = Static99.aFloat49;
							if ((local1943 & 0x1) == 0) {
								if (local1023 - local1482 > 0.5F) {
									local1023--;
									local1496 = 1;
								} else if (local1482 - local1023 > 0.5F) {
									local1496 = 2;
									local1023++;
								}
								if (local1486 - local1482 > 0.5F) {
									local1486--;
									local1494 = 1;
								} else if (local1482 - local1486 > 0.5F) {
									local1486++;
									local1494 = 2;
								}
							} else {
								if (local992 - local1484 > 0.5F) {
									local1494 = 1;
									local992--;
								} else if (local1484 - local992 > 0.5F) {
									local1494 = 2;
									local992++;
								}
								if (local994 - local1484 > 0.5F) {
									local1496 = 1;
									local994--;
								} else if (local1484 - local994 > 0.5F) {
									local994++;
									local1496 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray85 == null) {
				local1533 = 0;
			} else {
				local1533 = arg1.aByteArray85[local1435];
			}
			if (local1533 == 0) {
				@Pc(2678) long local2678 = ((long) local748 + (long) (local1442 << 8) + (long) (local1498 << 24) << 32) + (long) (local1155 << 2);
				local1553 = arg1.aShortArray128[local1435];
				local1558 = arg1.aShortArray127[local1435];
				local1563 = arg1.aShortArray121[local1435];
				@Pc(2697) Class163 local2697 = local437[local1553];
				this.aShortArray64[local1429] = this.method2768(local1482, local2697.anInt4675, local2678, local1484, local1553, arg1, local2697.anInt4674, local2697.anInt4673, local2697.anInt4676);
				@Pc(2721) Class163 local2721 = local437[local1558];
				this.aShortArray59[local1429] = this.method2768(local1486, local2721.anInt4675, (long) local1494 + local2678, local992, local1558, arg1, local2721.anInt4674, local2721.anInt4673, local2721.anInt4676);
				@Pc(2748) Class163 local2748 = local437[local1563];
				this.aShortArray65[local1429] = this.method2768(local1023, local2748.anInt4675, (long) local1496 + local2678, local994, local1563, arg1, local2748.anInt4674, local2748.anInt4673, local2748.anInt4676);
			} else if (local1533 == 1) {
				@Pc(2782) Class332 local2782 = local1116[local1435];
				@Pc(2830) long local2830 = (long) ((local2782.anInt9015 > 0 ? 1024 : 2048) + (local1155 << 2) + (local2782.anInt9016 + 256 << 12) + (local2782.anInt9017 + 256 << 22)) + ((long) (local1498 << 24) + (long) (local1442 << 8) + (long) local748 << 32);
				this.aShortArray64[local1429] = this.method2768(local1482, local2782.anInt9015, local2830, local1484, arg1.aShortArray128[local1435], arg1, local2782.anInt9016, 0, local2782.anInt9017);
				this.aShortArray59[local1429] = this.method2768(local1486, local2782.anInt9015, local2830 + (long) local1494, local992, arg1.aShortArray127[local1435], arg1, local2782.anInt9016, 0, local2782.anInt9017);
				this.aShortArray65[local1429] = this.method2768(local1023, local2782.anInt9015, local2830 + (long) local1496, local994, arg1.aShortArray121[local1435], arg1, local2782.anInt9016, 0, local2782.anInt9017);
			}
			if (arg1.aShortArray124 == null) {
				this.aShortArray61[local1429] = -1;
			} else {
				this.aShortArray61[local1429] = arg1.aShortArray124[local1435];
			}
			if (arg1.aByteArray86 != null) {
				this.aByteArray36[local1429] = arg1.aByteArray86[local1435];
			}
			if (arg1.aShortArray126 != null) {
				this.aShortArray57[local1429] = arg1.aShortArray126[local1435];
			}
			this.aShortArray58[local1429] = arg1.aShortArray129[local1435];
		}
		local1435 = 0;
		local1135 = -10000;
		for (local1145 = 0; local1145 < this.anInt3058; local1145++) {
			@Pc(2968) short local2968 = this.aShortArray61[local1145];
			if (local2968 != local1135) {
				local1435++;
				local1135 = local2968;
			}
		}
		this.anIntArray293 = new int[local1435 + 1];
		local1135 = -10000;
		local1435 = 0;
		for (local1155 = 0; local1155 < this.anInt3058; local1155++) {
			@Pc(3002) short local3002 = this.aShortArray61[local1155];
			if (local1135 != local3002) {
				this.anIntArray293[local1435++] = local1155;
				local1135 = local3002;
			}
		}
		this.anIntArray293[local1435] = this.anInt3058;
		Static95.aLongArray14 = null;
		this.aShortArray63 = Static575.method7832(this.anInt3060, this.aShortArray63);
		this.aShortArray56 = Static575.method7832(this.anInt3060, this.aShortArray56);
		this.aShortArray62 = Static575.method7832(this.anInt3060, this.aShortArray62);
		this.aByteArray35 = Static174.method3325(this.anInt3060, this.aByteArray35);
		this.aFloatArray25 = Static286.method7189(this.anInt3060, this.aFloatArray25);
		this.aFloatArray24 = Static286.method7189(this.anInt3060, this.aFloatArray24);
		if (arg1.anIntArray584 != null && Static374.method5596(this.anInt3045, arg2)) {
			this.anIntArrayArray39 = arg1.method5858(false);
		}
		if (arg1.aClass253Array1 != null && Static76.method1357(arg2, this.anInt3045)) {
			this.anIntArrayArray40 = arg1.method5846();
		}
		if (arg1.anIntArray582 != null && Static258.method4292(arg2, this.anInt3045)) {
			local748 = 0;
			@Pc(3121) int[] local3121 = new int[256];
			for (local792 = 0; local792 < this.anInt3034; local792++) {
				local805 = arg1.anIntArray582[local113[local792]];
				if (local805 >= 0) {
					@Pc(3141) int local3141 = local3121[local805]++;
					if (local748 < local805) {
						local748 = local805;
					}
				}
			}
			this.anIntArrayArray41 = new int[local748 + 1][];
			for (local805 = 0; local805 <= local748; local805++) {
				this.anIntArrayArray41[local805] = new int[local3121[local805]];
				local3121[local805] = 0;
			}
			for (local807 = 0; local807 < this.anInt3034; local807++) {
				local1214 = arg1.anIntArray582[local113[local807]];
				if (local1214 >= 0) {
					this.anIntArrayArray41[local1214][local3121[local1214]++] = local807;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "()[Lclient!efa;")
	@Override
	public Class89[] method4015() {
		return this.aClass89Array5;
	}

	@OriginalMember(owner = "client!ev", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort44;
	}

	@OriginalMember(owner = "client!ev", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort47;
	}

	@OriginalMember(owner = "client!ev", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort46;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class134_Sub2 local8 = (Class134_Sub2) arg2;
		@Pc(12) Class134_Sub2 local12 = this.aClass66_Sub3_8.aClass134_Sub2_4;
		@Pc(33) float local33 = local8.aFloat82 * local12.aFloat86 + local12.aFloat85 * local8.aFloat84 + local8.aFloat83 * local12.aFloat80 + local12.aFloat84;
		@Pc(54) float local54 = local12.aFloat82 + local12.aFloat81 * local8.aFloat83 + local12.aFloat89 * local8.aFloat84 + local12.aFloat88 * local8.aFloat82;
		Static203.aFloat91 = local12.aFloat89 * local8.aFloat85 + local12.aFloat88 * local8.aFloat89 + local8.aFloat78 * local12.aFloat81;
		Static388.aFloat136 = local12.aFloat88 * local8.aFloat81 + local12.aFloat89 * local8.aFloat80 + local8.aFloat87 * local12.aFloat81;
		Static12.aFloat1 = local12.aFloat80 * local8.aFloat78 + local8.aFloat89 * local12.aFloat86 + local12.aFloat85 * local8.aFloat85;
		Static542.aFloat195 = local12.aFloat86 * local8.aFloat81 + local8.aFloat80 * local12.aFloat85 + local12.aFloat80 * local8.aFloat87;
		Static260.aFloat95 = local12.aFloat79 * local8.aFloat81 + local12.aFloat78 * local8.aFloat80 + local8.aFloat87 * local12.aFloat87;
		Static592.aFloat204 = local12.aFloat88 * local8.aFloat88 + local12.aFloat89 * local8.aFloat86 + local8.aFloat79 * local12.aFloat81;
		Static181.aFloat65 = local8.aFloat78 * local12.aFloat87 + local12.aFloat78 * local8.aFloat85 + local8.aFloat89 * local12.aFloat79;
		Static381.aFloat134 = local12.aFloat86 * local8.aFloat88 + local8.aFloat86 * local12.aFloat85 + local12.aFloat80 * local8.aFloat79;
		Static385.aFloat135 = local8.aFloat79 * local12.aFloat87 + local12.aFloat79 * local8.aFloat88 + local12.aFloat78 * local8.aFloat86;
		@Pc(237) float local237 = local12.aFloat83 + local12.aFloat87 * local8.aFloat83 + local8.aFloat84 * local12.aFloat78 + local12.aFloat79 * local8.aFloat82;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass66_Sub3_8.anInt6469;
		@Pc(255) int local255 = this.aClass66_Sub3_8.anInt6476;
		if (!this.aBoolean238) {
			this.method2778();
		}
		Static549.anIntArray697[0] = this.aShort44;
		Static50.anIntArray705[0] = this.aShort47;
		Static590.anIntArray715[0] = this.aShort46;
		Static549.anIntArray697[1] = this.aShort42;
		Static50.anIntArray705[1] = this.aShort47;
		Static549.anIntArray697[2] = this.aShort44;
		Static590.anIntArray715[1] = this.aShort46;
		Static50.anIntArray705[2] = this.aShort45;
		Static549.anIntArray697[3] = this.aShort42;
		Static590.anIntArray715[2] = this.aShort46;
		Static50.anIntArray705[3] = this.aShort45;
		Static590.anIntArray715[3] = this.aShort46;
		Static549.anIntArray697[4] = this.aShort44;
		Static50.anIntArray705[4] = this.aShort47;
		Static590.anIntArray715[4] = this.aShort49;
		Static549.anIntArray697[5] = this.aShort42;
		Static50.anIntArray705[5] = this.aShort47;
		Static549.anIntArray697[6] = this.aShort44;
		Static590.anIntArray715[5] = this.aShort49;
		Static50.anIntArray705[6] = this.aShort45;
		Static549.anIntArray697[7] = this.aShort42;
		Static590.anIntArray715[6] = this.aShort49;
		Static50.anIntArray705[7] = this.aShort45;
		Static590.anIntArray715[7] = this.aShort49;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static549.anIntArray697[local383];
			local395 = Static590.anIntArray715[local383];
			local400 = Static50.anIntArray705[local383];
			local414 = local400 * Static385.aFloat135 + Static181.aFloat65 * local390 + local395 * Static260.aFloat95 + local237;
			local428 = local33 + local395 * Static542.aFloat195 + local400 * Static381.aFloat134 + Static12.aFloat1 * local390;
			local442 = Static592.aFloat204 * local400 + local390 * Static203.aFloat91 + local395 * Static388.aFloat136 + local54;
			if (local414 >= (float) this.aClass66_Sub3_8.anInt6481) {
				@Pc(461) float local461 = (float) this.aClass66_Sub3_8.anInt6457 + local428 * (float) local251 / local414;
				@Pc(473) float local473 = (float) this.aClass66_Sub3_8.anInt6480 + (float) local255 * local442 / local414;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				if (local473 < local245) {
					local245 = local473;
				}
				local239 = true;
				if (local473 > local247) {
					local247 = local473;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.aClass66_Sub3_8.anIntArray515.length < this.anInt3060) {
				this.aClass66_Sub3_8.anIntArray515 = new int[this.anInt3060];
				this.aClass66_Sub3_8.anIntArray517 = new int[this.anInt3060];
			}
			@Pc(558) int[] local558 = this.aClass66_Sub3_8.anIntArray515;
			@Pc(562) int[] local562 = this.aClass66_Sub3_8.anIntArray517;
			@Pc(646) int local646;
			for (@Pc(564) int local564 = 0; local564 < this.anInt3021; local564++) {
				local390 = this.anIntArray294[local564];
				local395 = this.anIntArray292[local564];
				local400 = this.anIntArray295[local564];
				local442 = local54 + local395 * Static388.aFloat136 + local400 * Static592.aFloat204 + local390 * Static203.aFloat91;
				local428 = local33 + Static381.aFloat134 * local400 + Static12.aFloat1 * local390 + local395 * Static542.aFloat195;
				local414 = Static260.aFloat95 * local395 + local390 * Static181.aFloat65 + Static385.aFloat135 * local400 + local237;
				@Pc(659) int local659;
				@Pc(664) int local664;
				@Pc(671) int local671;
				if (local414 >= (float) this.aClass66_Sub3_8.anInt6481) {
					local646 = (int) (local428 * (float) local251 / local414 + (float) this.aClass66_Sub3_8.anInt6457);
					local659 = (int) (local442 * (float) local255 / local414 + (float) this.aClass66_Sub3_8.anInt6480);
					local664 = this.anIntArray296[local564];
					local671 = this.anIntArray296[local564 + 1];
					for (@Pc(673) int local673 = local664; local673 < local671; local673++) {
						@Pc(682) int local682 = this.aShortArray55[local673] - 1;
						if (local682 == -1) {
							break;
						}
						local558[local682] = local646;
						local562[local682] = local659;
					}
				} else {
					local646 = this.anIntArray296[local564];
					local659 = this.anIntArray296[local564 + 1];
					for (local664 = local646; local664 < local659; local664++) {
						local671 = this.aShortArray55[local664] - 1;
						if (local671 == -1) {
							break;
						}
						local558[this.aShortArray55[local664] - 1] = -999999;
					}
				}
			}
			for (local646 = 0; local646 < this.anInt3034; local646++) {
				if (local558[this.aShortArray64[local646]] != -999999 && local558[this.aShortArray59[local646]] != -999999 && local558[this.aShortArray65[local646]] != -999999 && this.method2769(local558[this.aShortArray59[local646]], local558[this.aShortArray64[local646]], arg1, local558[this.aShortArray65[local646]], local562[this.aShortArray59[local646]], local562[this.aShortArray65[local646]], arg0, local562[this.aShortArray64[local646]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3021; local3++) {
			if (arg0 != 0) {
				this.anIntArray294[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray295[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray292[local3] += arg2;
			}
		}
		this.aBoolean238 = false;
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	private void method2766() {
		if (this.anInt3058 == 0) {
			return;
		}
		if (this.aByte32 != 0) {
			this.method2771(true);
		}
		this.method2771(false);
		if (this.aClass294_1 != null) {
			if (this.aClass294_1.anInterface18_4 == null) {
				this.method2767((this.aByte32 & 0x10) != 0);
			}
			if (this.aClass294_1.anInterface18_4 != null) {
				this.aClass66_Sub3_8.method5405(this.aClass117_4 != null);
				this.aClass66_Sub3_8.method5413(this.aClass117_6, this.aClass117_3, this.aClass117_4, this.aClass117_5);
				@Pc(77) int local77 = this.anIntArray293.length - 1;
				for (@Pc(79) int local79 = 0; local79 < local77; local79++) {
					@Pc(86) int local86 = this.anIntArray293[local79];
					@Pc(93) int local93 = this.anIntArray293[local79 + 1];
					@Pc(100) int local100 = this.aShortArray61[local86] & 0xFFFF;
					if (local100 == 65535) {
						local100 = -1;
					}
					this.aClass66_Sub3_8.method5408(local100, this.aClass117_4 != null);
					this.aClass66_Sub3_8.method5357(local86 * 3, this.aClass294_1.anInterface18_4, (local93 - local86) * 3);
				}
			}
		}
		this.method2775();
	}

	@OriginalMember(owner = "client!ev", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort45;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZZ)V")
	private void method2767(@OriginalArg(1) boolean arg0) {
		if (this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2.aByteArray97.length < this.anInt3058 * 6) {
			this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2 = new Class4_Sub9_Sub2((this.anInt3058 + 100) * 6);
		} else {
			this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2.anInt7219 = 0;
		}
		@Pc(42) Class4_Sub9_Sub2 local42 = this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2;
		@Pc(53) int local53;
		if (this.aClass66_Sub3_8.aBoolean476) {
			for (local53 = 0; local53 < this.anInt3058; local53++) {
				local42.method6012(this.aShortArray64[local53]);
				local42.method6012(this.aShortArray59[local53]);
				local42.method6012(this.aShortArray65[local53]);
			}
		} else {
			for (local53 = 0; local53 < this.anInt3058; local53++) {
				local42.method5989(this.aShortArray64[local53]);
				local42.method5989(this.aShortArray59[local53]);
				local42.method5989(this.aShortArray65[local53]);
			}
		}
		if (local42.anInt7219 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface18_2 == null) {
				this.anInterface18_2 = this.aClass66_Sub3_8.method5377(true, local42.aByteArray97, local42.anInt7219);
			} else {
				this.anInterface18_2.method6570(local42.anInt7219, local42.aByteArray97);
			}
			this.aClass294_1.anInterface18_4 = this.anInterface18_2;
		} else {
			this.aClass294_1.anInterface18_4 = this.aClass66_Sub3_8.method5377(false, local42.aByteArray97, local42.anInt7219);
		}
		if (!arg0) {
			this.aBoolean239 = true;
		}
	}

	@OriginalMember(owner = "client!ev", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static133.anInt3084 = 0;
			Static360.anInt6332 = 0;
			local16 = 0;
			Static565.anInt9456 = 0;
			for (local20 = 0; local20 < this.anInt3021; local20++) {
				Static133.anInt3084 += this.anIntArray294[local20];
				Static565.anInt9456 += this.anIntArray295[local20];
				local16++;
				Static360.anInt6332 += this.anIntArray292[local20];
			}
			if (local16 > 0) {
				Static133.anInt3084 = Static133.anInt3084 / local16 + arg1;
				Static565.anInt9456 = Static565.anInt9456 / local16 + arg2;
				Static360.anInt6332 = arg3 + Static360.anInt6332 / local16;
			} else {
				Static565.anInt9456 = arg2;
				Static360.anInt6332 = arg3;
				Static133.anInt3084 = arg1;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt3021; local16++) {
				this.anIntArray294[local16] += arg1;
				this.anIntArray295[local16] += arg2;
				this.anIntArray292[local16] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt3021; local16++) {
					this.anIntArray294[local16] -= Static133.anInt3084;
					this.anIntArray295[local16] -= Static565.anInt9456;
					this.anIntArray292[local16] -= Static360.anInt6332;
					if (arg3 != 0) {
						local20 = Class4_Sub11.anIntArray148[arg3];
						local164 = Class4_Sub11.anIntArray147[arg3];
						local182 = local20 * this.anIntArray295[local16] + local164 * this.anIntArray294[local16] + 16383 >> 14;
						this.anIntArray295[local16] = local164 * this.anIntArray295[local16] + 16383 - local20 * this.anIntArray294[local16] >> 14;
						this.anIntArray294[local16] = local182;
					}
					if (arg1 != 0) {
						local20 = Class4_Sub11.anIntArray148[arg1];
						local164 = Class4_Sub11.anIntArray147[arg1];
						local182 = local164 * this.anIntArray295[local16] + 16383 - this.anIntArray292[local16] * local20 >> 14;
						this.anIntArray292[local16] = local20 * this.anIntArray295[local16] + local164 * this.anIntArray292[local16] + 16383 >> 14;
						this.anIntArray295[local16] = local182;
					}
					if (arg2 != 0) {
						local20 = Class4_Sub11.anIntArray148[arg2];
						local164 = Class4_Sub11.anIntArray147[arg2];
						local182 = local20 * this.anIntArray292[local16] + local164 * this.anIntArray294[local16] + 16383 >> 14;
						this.anIntArray292[local16] = local164 * this.anIntArray292[local16] + 16383 - local20 * this.anIntArray294[local16] >> 14;
						this.anIntArray294[local16] = local182;
					}
					this.anIntArray294[local16] += Static133.anInt3084;
					this.anIntArray295[local16] += Static565.anInt9456;
					this.anIntArray292[local16] += Static360.anInt6332;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt3021; local16++) {
					this.anIntArray294[local16] -= Static133.anInt3084;
					this.anIntArray295[local16] -= Static565.anInt9456;
					this.anIntArray292[local16] -= Static360.anInt6332;
					this.anIntArray294[local16] = arg1 * this.anIntArray294[local16] / 128;
					this.anIntArray295[local16] = arg2 * this.anIntArray295[local16] / 128;
					this.anIntArray292[local16] = arg3 * this.anIntArray292[local16] / 128;
					this.anIntArray294[local16] += Static133.anInt3084;
					this.anIntArray295[local16] += Static565.anInt9456;
					this.anIntArray292[local16] += Static360.anInt6332;
				}
			} else {
				@Pc(523) Class154 local523;
				@Pc(528) Class74 local528;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt3034; local16++) {
						local20 = (this.aByteArray36[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray36[local16] = (byte) local20;
					}
					if (this.aClass117_6 != null) {
						this.aClass117_6.anInterface10_3 = null;
					}
					if (this.aClass154Array1 != null) {
						for (local20 = 0; local20 < this.anInt3068; local20++) {
							local523 = this.aClass154Array1[local20];
							local528 = this.aClass74Array1[local20];
							local528.anInt2434 = 255 - (this.aByteArray36[local523.anInt4332] & 0xFF) << 24 | local528.anInt2434 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt3034; local16++) {
						local20 = this.aShortArray58[local16] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						local182 += arg2 / 4;
						@Pc(591) int local591 = local20 & 0x7F;
						@Pc(597) int local597 = local164 + arg1 & 0x3F;
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
						this.aShortArray58[local16] = (short) (local597 << 10 | local182 << 7 | local591);
					}
					if (this.aClass117_6 != null) {
						this.aClass117_6.anInterface10_3 = null;
					}
					if (this.aClass154Array1 != null) {
						for (local20 = 0; local20 < this.anInt3068; local20++) {
							local523 = this.aClass154Array1[local20];
							local528 = this.aClass74Array1[local20];
							local528.anInt2434 = Static170.anIntArray696[this.aShortArray58[local523.anInt4332] & 0xFFFF] & 0xFFFFFF | local528.anInt2434 & 0xFF000000;
						}
					}
				} else {
					@Pc(708) Class74 local708;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt3068; local16++) {
							local708 = this.aClass74Array1[local16];
							local708.anInt2439 += arg2;
							local708.anInt2435 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt3068; local16++) {
							local708 = this.aClass74Array1[local16];
							local708.anInt2436 = arg2 * local708.anInt2436 >> 7;
							local708.anInt2433 = local708.anInt2433 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt3068; local16++) {
							local708 = this.aClass74Array1[local16];
							local708.anInt2437 = arg1 + local708.anInt2437 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!q;Lclient!ot;II)V")
	@Override
	public void method4004(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3060 == 0) {
			return;
		}
		@Pc(13) Class134_Sub2 local13 = this.aClass66_Sub3_8.aClass134_Sub2_4;
		if (!this.aBoolean238) {
			this.method2778();
		}
		@Pc(22) Class134_Sub2 local22 = (Class134_Sub2) arg0;
		Static385.aFloat135 = local13.aFloat87 * local22.aFloat79 + local22.aFloat88 * local13.aFloat79 + local13.aFloat78 * local22.aFloat86;
		Static320.aFloat101 = local22.aFloat82 * local13.aFloat79 + local22.aFloat84 * local13.aFloat78 + local13.aFloat87 * local22.aFloat83 + local13.aFloat83;
		@Pc(69) float local69 = Static385.aFloat135 * (float) this.aShort47 + Static320.aFloat101;
		@Pc(77) float local77 = Static385.aFloat135 * (float) this.aShort45 + Static320.aFloat101;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.aShort48 + local77;
			local94 = (float) this.aShort48 + local69;
		} else {
			local88 = (float) -this.aShort48 + local69;
			local94 = (float) this.aShort48 + local77;
		}
		if (local88 >= this.aClass66_Sub3_8.aFloat125 || (float) this.aClass66_Sub3_8.anInt6481 >= local94) {
			return;
		}
		Static381.aFloat134 = local22.aFloat79 * local13.aFloat80 + local22.aFloat88 * local13.aFloat86 + local22.aFloat86 * local13.aFloat85;
		Static433.aFloat145 = local22.aFloat82 * local13.aFloat86 + local13.aFloat85 * local22.aFloat84 + local13.aFloat80 * local22.aFloat83 + local13.aFloat84;
		@Pc(171) float local171 = Static433.aFloat145 + (float) this.aShort47 * Static381.aFloat134;
		@Pc(179) float local179 = (float) this.aShort45 * Static381.aFloat134 + Static433.aFloat145;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local171 > local179) {
			local206 = (float) this.aClass66_Sub3_8.anInt6469 * ((float) this.aShort48 + local171);
			local195 = (local179 - (float) this.aShort48) * (float) this.aClass66_Sub3_8.anInt6469;
		} else {
			local195 = (float) this.aClass66_Sub3_8.anInt6469 * ((float) -this.aShort48 + local171);
			local206 = (float) this.aClass66_Sub3_8.anInt6469 * (local179 + (float) this.aShort48);
		}
		if (local195 / (float) arg2 >= this.aClass66_Sub3_8.aFloat124 || local206 / (float) arg2 <= this.aClass66_Sub3_8.aFloat132) {
			return;
		}
		Static352.aFloat192 = local13.aFloat82 + local22.aFloat82 * local13.aFloat88 + local13.aFloat89 * local22.aFloat84 + local22.aFloat83 * local13.aFloat81;
		Static592.aFloat204 = local22.aFloat79 * local13.aFloat81 + local13.aFloat89 * local22.aFloat86 + local22.aFloat88 * local13.aFloat88;
		@Pc(297) float local297 = Static592.aFloat204 * (float) this.aShort47 + Static352.aFloat192;
		@Pc(305) float local305 = Static592.aFloat204 * (float) this.aShort45 + Static352.aFloat192;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = (float) this.aClass66_Sub3_8.anInt6476 * (local297 + (float) this.aShort48);
			local332 = (float) this.aClass66_Sub3_8.anInt6476 * ((float) -this.aShort48 + local305);
		} else {
			local332 = (float) this.aClass66_Sub3_8.anInt6476 * (local297 - (float) this.aShort48);
			local320 = (float) this.aClass66_Sub3_8.anInt6476 * (local305 + (float) this.aShort48);
		}
		if (this.aClass66_Sub3_8.aFloat130 <= local332 / (float) arg2 || this.aClass66_Sub3_8.aFloat129 >= local320 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass154Array1 != null) {
			Static388.aFloat136 = local22.aFloat80 * local13.aFloat89 + local13.aFloat88 * local22.aFloat81 + local22.aFloat87 * local13.aFloat81;
			Static12.aFloat1 = local13.aFloat80 * local22.aFloat78 + local13.aFloat86 * local22.aFloat89 + local22.aFloat85 * local13.aFloat85;
			Static181.aFloat65 = local13.aFloat79 * local22.aFloat89 + local13.aFloat78 * local22.aFloat85 + local22.aFloat78 * local13.aFloat87;
			Static203.aFloat91 = local22.aFloat89 * local13.aFloat88 + local22.aFloat85 * local13.aFloat89 + local22.aFloat78 * local13.aFloat81;
			Static260.aFloat95 = local13.aFloat79 * local22.aFloat81 + local13.aFloat78 * local22.aFloat80 + local22.aFloat87 * local13.aFloat87;
			Static542.aFloat195 = local22.aFloat80 * local13.aFloat85 + local13.aFloat86 * local22.aFloat81 + local22.aFloat87 * local13.aFloat80;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort44 + this.aShort42 >> 1;
			@Pc(508) int local508 = this.aShort49 + this.aShort46 >> 1;
			@Pc(527) int local527 = (int) ((float) this.aShort47 * Static381.aFloat134 + Static12.aFloat1 * (float) local500 + Static433.aFloat145 + (float) local508 * Static542.aFloat195);
			@Pc(546) int local546 = (int) ((float) local508 * Static388.aFloat136 + Static352.aFloat192 + (float) local500 * Static203.aFloat91 + Static592.aFloat204 * (float) this.aShort47);
			@Pc(565) int local565 = (int) ((float) local508 * Static260.aFloat95 + Static320.aFloat101 + (float) local500 * Static181.aFloat65 + Static385.aFloat135 * (float) this.aShort47);
			@Pc(584) int local584 = (int) (Static542.aFloat195 * (float) local508 + Static12.aFloat1 * (float) local500 + Static433.aFloat145 + Static381.aFloat134 * (float) this.aShort45);
			@Pc(603) int local603 = (int) (Static388.aFloat136 * (float) local508 + (float) this.aShort45 * Static592.aFloat204 + Static203.aFloat91 * (float) local500 + Static352.aFloat192);
			arg1.anInt6863 = local584 * this.aClass66_Sub3_8.anInt6469 / arg2 + this.aClass66_Sub3_8.anInt6457;
			arg1.anInt6862 = this.aClass66_Sub3_8.anInt6480 + local603 * this.aClass66_Sub3_8.anInt6476 / arg2;
			@Pc(649) int local649 = (int) ((float) local508 * Static260.aFloat95 + Static320.aFloat101 + (float) local500 * Static181.aFloat65 + Static385.aFloat135 * (float) this.aShort45);
			arg1.anInt6866 = local527 * this.aClass66_Sub3_8.anInt6469 / arg2 + this.aClass66_Sub3_8.anInt6457;
			arg1.anInt6865 = this.aClass66_Sub3_8.anInt6476 * local546 / arg2 + this.aClass66_Sub3_8.anInt6480;
			if (this.aClass66_Sub3_8.anInt6481 > local565 && this.aClass66_Sub3_8.anInt6481 > local649) {
				arg1.anInt6864 = this.aClass66_Sub3_8.anInt6457 + (this.aShort48 + local527) * this.aClass66_Sub3_8.anInt6469 / arg2 - arg1.anInt6866;
				arg1.aBoolean508 = true;
			}
		}
		this.aClass66_Sub3_8.method5407((float) arg2);
		this.aClass66_Sub3_8.method5428();
		this.aClass66_Sub3_8.method5386(local22);
		this.method2766();
		this.aClass66_Sub3_8.method5433();
		this.method2770();
	}

	@OriginalMember(owner = "client!ev", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3021; local3++) {
			this.anIntArray292[local3] = -this.anIntArray292[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3060; local25++) {
			this.aShortArray62[local25] = (short) -this.aShortArray62[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt3034; local44++) {
			@Pc(51) short local51 = this.aShortArray64[local44];
			this.aShortArray64[local44] = this.aShortArray65[local44];
			this.aShortArray65[local44] = local51;
		}
		if (this.aClass117_4 == null && this.aClass117_6 != null) {
			this.aClass117_6.anInterface10_3 = null;
		}
		if (this.aClass117_4 != null) {
			this.aClass117_4.anInterface10_3 = null;
		}
		if (this.aClass294_1 != null) {
			this.aClass294_1.anInterface18_4 = null;
		}
		this.aBoolean238 = false;
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "()Z")
	@Override
	public boolean method4018() {
		if (this.aShortArray61 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray61.length; local12++) {
			if (this.aShortArray61[local12] != -1 && !this.aClass66_Sub3_8.anInterface3_15.method7248(this.aShortArray61[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ev", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3021; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray295[local15] - this.anIntArray292[local15] * local9 >> 14;
			this.anIntArray292[local15] = local9 * this.anIntArray295[local15] + this.anIntArray292[local15] * local13 >> 14;
			this.anIntArray295[local15] = local34;
		}
		this.aBoolean238 = false;
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort41;
	}

	@OriginalMember(owner = "client!ev", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean238) {
			this.method2778();
		}
		@Pc(16) int local16 = arg4 + this.aShort44;
		@Pc(21) int local21 = this.aShort42 + arg4;
		@Pc(27) int local27 = arg6 + this.aShort46;
		@Pc(32) int local32 = this.aShort49 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9841 >> arg2.anInt9837 >= arg2.anInt9838 || local27 < 0 || arg2.anInt9839 <= local32 + arg2.anInt9841 >> arg2.anInt9837)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9841 + local21 >> arg3.anInt9837 >= arg3.anInt9838 || local27 < 0 || arg3.anInt9839 <= local32 + arg3.anInt9841 >> arg3.anInt9837) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9837;
			local21 = local21 + arg2.anInt9841 - 1 >> arg2.anInt9837;
			local27 >>= arg2.anInt9837;
			local32 = local32 + arg2.anInt9841 - 1 >> arg2.anInt9837;
			if (arg5 == arg2.JA(local16, local27) && arg2.JA(local21, local27) == arg5 && arg5 == arg2.JA(local16, local32) && arg5 == arg2.JA(local21, local32)) {
				return;
			}
		}
		@Pc(198) int local198;
		if (arg0 == 1) {
			for (local198 = 0; local198 < this.anInt3021; local198++) {
				this.anIntArray295[local198] = this.anIntArray295[local198] + arg2.sa(this.anIntArray294[local198] + arg4, arg6 + this.anIntArray292[local198]) - arg5;
			}
		} else {
			@Pc(246) int local246;
			@Pc(257) int local257;
			if (arg0 == 2) {
				@Pc(241) short local241 = this.aShort47;
				if (local241 == 0) {
					return;
				}
				for (local246 = 0; local246 < this.anInt3021; local246++) {
					local257 = (this.anIntArray295[local246] << 16) / local241;
					if (arg1 > local257) {
						this.anIntArray295[local246] += (arg2.sa(this.anIntArray294[local246] + arg4, arg6 + this.anIntArray292[local246]) - arg5) * (arg1 - local257) / arg1;
					}
				}
			} else {
				@Pc(336) int local336;
				if (arg0 == 3) {
					local198 = (arg1 & 0xFF) * 4;
					local246 = (arg1 >> 8 & 0xFF) * 4;
					local257 = (arg1 >> 16 & 0xFF) << 6;
					local336 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local198 >> 1) < 0 || arg2.anInt9841 + (local198 >> 1) + arg4 >= arg2.anInt9838 << arg2.anInt9837 || arg6 - (local246 >> 1) < 0 || arg2.anInt9839 << arg2.anInt9837 <= arg2.anInt9841 + arg6 + (local246 >> 1)) {
						return;
					}
					this.method4003(local246, local198, arg6, arg2, arg5, local336, local257, arg4);
				} else if (arg0 == 4) {
					local198 = this.aShort45 - this.aShort47;
					for (local246 = 0; local246 < this.anInt3021; local246++) {
						this.anIntArray295[local246] = this.anIntArray295[local246] + arg3.sa(this.anIntArray294[local246] + arg4, this.anIntArray292[local246] + arg6) + local198 - arg5;
					}
				} else if (arg0 == 5) {
					local198 = this.aShort45 - this.aShort47;
					for (local246 = 0; local246 < this.anInt3021; local246++) {
						local257 = this.anIntArray294[local246] + arg4;
						local336 = arg6 + this.anIntArray292[local246];
						@Pc(483) int local483 = arg2.sa(local257, local336);
						@Pc(488) int local488 = arg3.sa(local257, local336);
						@Pc(495) int local495 = local483 - arg1 - local488;
						this.anIntArray295[local246] = (local495 * ((this.anIntArray295[local246] << 8) / local198) >> 8) + local483 - arg5;
					}
				}
			}
		}
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
		this.aBoolean238 = false;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(FIJFIBLclient!pf;III)S")
	private short method2768(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class266 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray296[arg4];
		@Pc(17) int local17 = this.anIntArray296[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray55[local27];
			if (local34 == 0) {
				local19 = local27;
				break;
			}
			if (arg2 == Static95.aLongArray14[local27]) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray55[local19] = (short) (this.anInt3060 + 1);
		Static95.aLongArray14[local19] = arg2;
		this.aShortArray63[this.anInt3060] = (short) arg1;
		this.aShortArray56[this.anInt3060] = (short) arg6;
		this.aShortArray62[this.anInt3060] = (short) arg8;
		this.aByteArray35[this.anInt3060] = (byte) arg7;
		this.aFloatArray25[this.anInt3060] = arg0;
		this.aFloatArray24[this.anInt3060] = arg3;
		return (short) this.anInt3060++;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > arg2 && arg4 > arg2 && arg5 > arg2) {
			return false;
		} else if (arg7 < arg2 && arg4 < arg2 && arg5 < arg2) {
			return false;
		} else if (arg6 < arg1 && arg0 > arg6 && arg3 > arg6) {
			return false;
		} else {
			return arg1 >= arg6 || arg6 <= arg0 || arg6 <= arg3;
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
	private void method2770() {
		if (this.aClass154Array1 == null) {
			return;
		}
		@Pc(8) Class134_Sub2 local8 = this.aClass66_Sub3_8.aClass134_Sub2_2;
		@Pc(12) float local12 = this.aClass66_Sub3_8.method5419();
		@Pc(16) float local16 = this.aClass66_Sub3_8.method5422();
		this.aClass66_Sub3_8.method5425();
		this.aClass66_Sub3_8.method6857(false);
		this.aClass66_Sub3_8.method5405(false);
		this.aClass66_Sub3_8.method5413(null, this.aClass66_Sub3_8.aClass117_8, null, this.aClass66_Sub3_8.aClass117_9);
		for (@Pc(45) int local45 = 0; local45 < this.anInt3068; local45++) {
			@Pc(52) Class154 local52 = this.aClass154Array1[local45];
			@Pc(57) Class74 local57 = this.aClass74Array1[local45];
			if (!local52.aBoolean324 || !this.aClass66_Sub3_8.method6852()) {
				@Pc(86) float local86 = (float) (this.anIntArray294[local52.anInt4335] + this.anIntArray294[local52.anInt4333] + this.anIntArray294[local52.anInt4330]) * 0.3333333F;
				@Pc(109) float local109 = (float) (this.anIntArray295[local52.anInt4335] + this.anIntArray295[local52.anInt4333] + this.anIntArray295[local52.anInt4330]) * 0.3333333F;
				@Pc(131) float local131 = (float) (this.anIntArray292[local52.anInt4330] + this.anIntArray292[local52.anInt4335] + this.anIntArray292[local52.anInt4333]) * 0.3333333F;
				@Pc(145) float local145 = Static433.aFloat145 + local131 * Static542.aFloat195 + Static381.aFloat134 * local109 + Static12.aFloat1 * local86;
				@Pc(159) float local159 = Static352.aFloat192 + Static203.aFloat91 * local86 + local109 * Static592.aFloat204 + local131 * Static388.aFloat136;
				@Pc(173) float local173 = Static385.aFloat135 * local109 + local86 * Static181.aFloat65 + Static260.aFloat95 * local131 + Static320.aFloat101;
				local8.method3450(local57.anInt2436 * local52.aShort68 >> 7, local52.aShort67 * local57.anInt2433 >> 7, -local173, local145 + (float) local57.anInt2435, -local159 + (float) local57.anInt2439, local57.anInt2437);
				this.aClass66_Sub3_8.method5370(local8);
				this.aClass66_Sub3_8.ka(local16, local12 - (float) local52.anInt4334 * 1.5F);
				@Pc(227) int local227 = local57.anInt2434;
				OpenGL.glColor4ub((byte) (local227 >> 16), (byte) (local227 >> 8), (byte) local227, (byte) (local227 >> 24));
				this.aClass66_Sub3_8.method5431(local52.aShort66);
				this.aClass66_Sub3_8.method5398(local52.aByte59);
				this.aClass66_Sub3_8.method5367(4);
			}
		}
		this.aClass66_Sub3_8.ka(local16, local12);
		this.aClass66_Sub3_8.method6857(true);
		this.aClass66_Sub3_8.method5433();
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3034; local7++) {
			local16 = this.aShortArray58[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local47 += (arg2 - local47) * arg3 >> 7;
			}
			this.aShortArray58[local7] = (short) (local47 | local28 << 7 | local22 << 10);
		}
		if (this.aClass154Array1 != null) {
			for (local16 = 0; local16 < this.anInt3068; local16++) {
				@Pc(111) Class154 local111 = this.aClass154Array1[local16];
				@Pc(116) Class74 local116 = this.aClass74Array1[local16];
				local116.anInt2434 = Static170.anIntArray696[this.aShortArray58[local111.anInt4332] & 0xFFFF] & 0xFFFFFF | local116.anInt2434 & 0xFF000000;
			}
		}
		if (this.aClass117_6 != null) {
			this.aClass117_6.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3021; local15++) {
			@Pc(33) int local33 = this.anIntArray294[local15] * local13 + local9 * this.anIntArray292[local15] >> 14;
			this.anIntArray292[local15] = local13 * this.anIntArray292[local15] - local9 * this.anIntArray294[local15] >> 14;
			this.anIntArray294[local15] = local33;
		}
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
		this.aBoolean238 = false;
	}

	@OriginalMember(owner = "client!ev", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort42;
	}

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "()[Lclient!jt;")
	@Override
	public Class181[] method4019() {
		return this.aClass181Array5;
	}

	@OriginalMember(owner = "client!ev", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray39 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3074; local12++) {
			this.anIntArray294[local12] <<= 0x4;
			this.anIntArray295[local12] <<= 0x4;
			this.anIntArray292[local12] <<= 0x4;
		}
		Static360.anInt6332 = 0;
		Static133.anInt3084 = 0;
		Static565.anInt9456 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort43 = (short) arg0;
		if (this.aClass117_6 != null) {
			this.aClass117_6.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort43;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V")
	private void method2771(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass117_6 != null && this.aClass117_6.anInterface10_3 == null;
		@Pc(27) boolean local27 = this.aClass117_4 != null && this.aClass117_4.anInterface10_3 == null;
		@Pc(38) boolean local38 = this.aClass117_3 != null && this.aClass117_3.anInterface10_3 == null;
		@Pc(49) boolean local49 = this.aClass117_5 != null && this.aClass117_5.anInterface10_3 == null;
		if (arg0) {
			local16 &= (this.aByte32 & 0x2) != 0;
			local27 &= (this.aByte32 & 0x4) != 0;
			local38 &= (this.aByte32 & 0x1) != 0;
			local49 &= (this.aByte32 & 0x8) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local111 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2.aByteArray97.length < local103 * this.anInt3060) {
			this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2 = new Class4_Sub9_Sub2(local103 * (this.anInt3060 + 100));
		} else {
			this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2.anInt7219 = 0;
		}
		@Pc(190) Class4_Sub9_Sub2 local190 = this.aClass66_Sub3_8.aClass4_Sub9_Sub2_2;
		@Pc(198) int local198;
		@Pc(207) int local207;
		@Pc(235) int local235;
		@Pc(244) int local244;
		if (local38) {
			@Pc(214) int local214;
			@Pc(221) int local221;
			@Pc(226) int local226;
			@Pc(233) int local233;
			if (this.aClass66_Sub3_8.aBoolean476) {
				for (local198 = 0; local198 < this.anInt3021; local198++) {
					local207 = Stream.floatToRawIntBits((float) this.anIntArray294[local198]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray295[local198]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray292[local198]);
					local226 = this.anIntArray296[local198];
					local233 = this.anIntArray296[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray55[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt7219 = local103 * local244;
						local190.method5963(local207);
						local190.method5963(local214);
						local190.method5963(local221);
					}
				}
			} else {
				for (local198 = 0; local198 < this.anInt3021; local198++) {
					local207 = Stream.floatToRawIntBits((float) this.anIntArray294[local198]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray295[local198]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray292[local198]);
					local226 = this.anIntArray296[local198];
					local233 = this.anIntArray296[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray55[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt7219 = local244 * local103;
						local190.method6013(local207);
						local190.method6013(local214);
						local190.method6013(local221);
					}
				}
			}
		}
		@Pc(489) float local489;
		@Pc(385) short[] local385;
		@Pc(377) short[] local377;
		@Pc(381) short[] local381;
		@Pc(389) byte[] local389;
		@Pc(541) float local541;
		if (local16) {
			if (this.aClass117_4 == null) {
				if (this.aClass357_1 == null) {
					local385 = this.aShortArray63;
					local381 = this.aShortArray62;
					local377 = this.aShortArray56;
					local389 = this.aByteArray35;
				} else {
					local377 = this.aClass357_1.aShortArray156;
					local381 = this.aClass357_1.aShortArray158;
					local385 = this.aClass357_1.aShortArray157;
					local389 = this.aClass357_1.aByteArray118;
				}
				@Pc(409) float local409 = this.aClass66_Sub3_8.aFloatArray41[0];
				@Pc(415) float local415 = this.aClass66_Sub3_8.aFloatArray41[1];
				@Pc(421) float local421 = this.aClass66_Sub3_8.aFloatArray41[2];
				@Pc(425) float local425 = this.aClass66_Sub3_8.aFloat128;
				@Pc(435) float local435 = this.aClass66_Sub3_8.aFloat111 * 768.0F / (float) this.aShort41;
				@Pc(445) float local445 = this.aClass66_Sub3_8.aFloat114 * 768.0F / (float) this.aShort41;
				for (@Pc(447) int local447 = 0; local447 < this.anInt3034; local447++) {
					@Pc(469) int local469 = this.method2777(this.aShortArray61[local447], this.aShortArray58[local447], this.aShort43, this.aByteArray36[local447]);
					@Pc(478) float local478 = this.aClass66_Sub3_8.aFloat116 * (float) (local469 >>> 24);
					local489 = this.aClass66_Sub3_8.aFloat112 * (float) (local469 >> 16 & 0xFF);
					@Pc(500) float local500 = this.aClass66_Sub3_8.aFloat131 * (float) (local469 >> 8 & 0xFF);
					@Pc(505) short local505 = this.aShortArray64[local447];
					@Pc(510) short local510 = (short) local389[local505];
					if (local510 == 0) {
						local541 = ((float) local385[local505] * local409 + (float) local377[local505] * local415 + (float) local381[local505] * local421) * 0.0026041667F;
					} else {
						local541 = ((float) local377[local505] * local415 + (float) local385[local505] * local409 + local421 * (float) local381[local505]) / (float) (local510 * 256);
					}
					@Pc(578) float local578 = local541 * (local541 < 0.0F ? local445 : local435) + local425;
					@Pc(583) int local583 = (int) (local478 * local578);
					@Pc(588) int local588 = (int) (local489 * local578);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					@Pc(618) int local618 = (int) (local578 * local500);
					local190.anInt7219 = local505 * local103 + local107;
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local190.method5961(-345277664, local583);
					local190.method5961(-345277664, local588);
					local190.method5961(-345277664, local618);
					local190.method5961(-345277664, 255 - (this.aByteArray36[local447] & 0xFF));
					local505 = this.aShortArray59[local447];
					local510 = local389[local505];
					if (local510 == 0) {
						local541 = (local421 * (float) local381[local505] + (float) local385[local505] * local409 + local415 * (float) local377[local505]) * 0.0026041667F;
					} else {
						local541 = (local409 * (float) local385[local505] + (float) local377[local505] * local415 + (float) local381[local505] * local421) / (float) (local510 * 256);
					}
					local578 = local425 + (local541 < 0.0F ? local445 : local435) * local541;
					local583 = (int) (local478 * local578);
					local588 = (int) (local578 * local489);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					local618 = (int) (local500 * local578);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local190.anInt7219 = local107 + local505 * local103;
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local190.method5961(-345277664, local583);
					local190.method5961(-345277664, local588);
					local190.method5961(-345277664, local618);
					local190.method5961(-345277664, 255 - (this.aByteArray36[local447] & 0xFF));
					local505 = this.aShortArray65[local447];
					local510 = local389[local505];
					if (local510 == 0) {
						local541 = ((float) local381[local505] * local421 + local415 * (float) local377[local505] + (float) local385[local505] * local409) * 0.0026041667F;
					} else {
						local541 = (local421 * (float) local381[local505] + (float) local377[local505] * local415 + local409 * (float) local385[local505]) / (float) (local510 * 256);
					}
					local578 = (local541 < 0.0F ? local445 : local435) * local541 + local425;
					local583 = (int) (local578 * local478);
					local588 = (int) (local578 * local489);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					local618 = (int) (local578 * local500);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local190.anInt7219 = local107 + local505 * local103;
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local190.method5961(-345277664, local583);
					local190.method5961(-345277664, local588);
					local190.method5961(-345277664, local618);
					local190.method5961(-345277664, 255 - (this.aByteArray36[local447] & 0xFF));
				}
			} else {
				for (local198 = 0; local198 < this.anInt3034; local198++) {
					local207 = this.method2777(this.aShortArray61[local198], this.aShortArray58[local198], this.aShort43, this.aByteArray36[local198]);
					local190.anInt7219 = local107 + local103 * this.aShortArray64[local198];
					local190.method5963(local207);
					local190.anInt7219 = local107 + local103 * this.aShortArray59[local198];
					local190.method5963(local207);
					local190.anInt7219 = local107 + this.aShortArray65[local198] * local103;
					local190.method5963(local207);
				}
			}
		}
		if (local27) {
			if (this.aClass357_1 == null) {
				local377 = this.aShortArray56;
				local389 = this.aByteArray35;
				local385 = this.aShortArray63;
				local381 = this.aShortArray62;
			} else {
				local377 = this.aClass357_1.aShortArray156;
				local389 = this.aClass357_1.aByteArray118;
				local385 = this.aClass357_1.aShortArray157;
				local381 = this.aClass357_1.aShortArray158;
			}
			@Pc(1119) float local1119 = 3.0F / (float) this.aShort41;
			local541 = 3.0F / (float) (this.aShort41 / 2 + this.aShort41);
			local190.anInt7219 = local109;
			if (this.aClass66_Sub3_8.aBoolean476) {
				for (local235 = 0; local235 < this.anInt3060; local235++) {
					local244 = local389[local235] & 0xFF;
					if (local244 == 0) {
						local190.method6031(local541 * (float) local385[local235], 103);
						local190.method6031((float) local377[local235] * local541, 79);
						local190.method6031((float) local381[local235] * local541, 35);
					} else {
						local489 = local1119 / (float) local244;
						local190.method6031((float) local385[local235] * local489, 92);
						local190.method6031(local489 * (float) local377[local235], 95);
						local190.method6031((float) local381[local235] * local489, 68);
					}
					local190.anInt7219 += local103 - 12;
				}
			} else {
				for (local235 = 0; local235 < this.anInt3060; local235++) {
					local244 = local389[local235] & 0xFF;
					if (local244 == 0) {
						local190.method6030((float) local385[local235] * local541);
						local190.method6030((float) local377[local235] * local541);
						local190.method6030(local541 * (float) local381[local235]);
					} else {
						local489 = local1119 / (float) local244;
						local190.method6030(local489 * (float) local385[local235]);
						local190.method6030(local489 * (float) local377[local235]);
						local190.method6030((float) local381[local235] * local489);
					}
					local190.anInt7219 += local103 - 12;
				}
			}
		}
		if (local49) {
			local190.anInt7219 = local111;
			if (this.aClass66_Sub3_8.aBoolean476) {
				for (local198 = 0; local198 < this.anInt3060; local198++) {
					local190.method6031(this.aFloatArray25[local198], 75);
					local190.method6031(this.aFloatArray24[local198], 64);
					local190.anInt7219 += local103 - 8;
				}
			} else {
				for (local198 = 0; local198 < this.anInt3060; local198++) {
					local190.method6030(this.aFloatArray25[local198]);
					local190.method6030(this.aFloatArray24[local198]);
					local190.anInt7219 += local103 - 8;
				}
			}
		}
		local190.anInt7219 = this.anInt3060 * local103;
		@Pc(1447) Interface10 local1447;
		if (arg0) {
			if (this.anInterface10_2 == null) {
				this.anInterface10_2 = this.aClass66_Sub3_8.method5393(local103, local190.aByteArray97, true, local190.anInt7219);
			} else {
				this.anInterface10_2.method5605(local190.aByteArray97, local103, local190.anInt7219);
			}
			this.aByte32 = 0;
			local1447 = this.anInterface10_2;
		} else {
			local1447 = this.aClass66_Sub3_8.method5393(local103, local190.aByteArray97, false, local190.anInt7219);
			this.aBoolean239 = true;
		}
		if (local38) {
			this.aClass117_3.aByte45 = 0;
			this.aClass117_3.anInterface10_3 = local1447;
		}
		if (local49) {
			this.aClass117_5.anInterface10_3 = local1447;
			this.aClass117_5.aByte45 = local111;
		}
		if (local16) {
			this.aClass117_6.anInterface10_3 = local1447;
			this.aClass117_6.aByte45 = local107;
		}
		if (local27) {
			this.aClass117_4.aByte45 = local109;
			this.aClass117_4.anInterface10_3 = local1447;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!ev;Lclient!ev;IZZ)Lclient!ba;")
	private Class9 method2772(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub3 arg1, @OriginalArg(2) Class9_Sub3 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg2.aByte32 = 0;
		arg2.aShort41 = this.aShort41;
		arg2.anInt3025 = arg0;
		arg2.anInt3074 = this.anInt3074;
		arg2.anInt3058 = this.anInt3058;
		arg2.aShort43 = this.aShort43;
		arg2.anInt3021 = this.anInt3021;
		arg2.anInt3060 = this.anInt3060;
		arg2.anInt3045 = this.anInt3045;
		arg2.anInt3034 = this.anInt3034;
		arg2.anInt3068 = this.anInt3068;
		@Pc(53) boolean local53 = Static440.method6237(this.anInt3045, arg0);
		@Pc(59) boolean local59 = Static59.method859(this.anInt3045, arg0);
		@Pc(65) boolean local65 = Static354.method5231(this.anInt3045, arg0);
		@Pc(71) boolean local71 = local65 | local59 | local53;
		@Pc(190) int local190;
		if (local71) {
			if (!local53) {
				arg2.anIntArray294 = this.anIntArray294;
			} else if (arg1.anIntArray294 == null || arg1.anIntArray294.length < this.anInt3074) {
				arg2.anIntArray294 = arg1.anIntArray294 = new int[this.anInt3074];
			} else {
				arg2.anIntArray294 = arg1.anIntArray294;
			}
			if (!local59) {
				arg2.anIntArray295 = this.anIntArray295;
			} else if (arg1.anIntArray295 == null || arg1.anIntArray295.length < this.anInt3074) {
				arg2.anIntArray295 = arg1.anIntArray295 = new int[this.anInt3074];
			} else {
				arg2.anIntArray295 = arg1.anIntArray295;
			}
			if (!local65) {
				arg2.anIntArray292 = this.anIntArray292;
			} else if (arg1.anIntArray292 == null || arg1.anIntArray292.length < this.anInt3074) {
				arg2.anIntArray292 = arg1.anIntArray292 = new int[this.anInt3074];
			} else {
				arg2.anIntArray292 = arg1.anIntArray292;
			}
			for (local190 = 0; local190 < this.anInt3074; local190++) {
				if (local53) {
					arg2.anIntArray294[local190] = this.anIntArray294[local190];
				}
				if (local59) {
					arg2.anIntArray295[local190] = this.anIntArray295[local190];
				}
				if (local65) {
					arg2.anIntArray292[local190] = this.anIntArray292[local190];
				}
			}
		} else {
			arg2.anIntArray292 = this.anIntArray292;
			arg2.anIntArray295 = this.anIntArray295;
			arg2.anIntArray294 = this.anIntArray294;
		}
		if (Static442.method6257(this.anInt3045, arg0)) {
			arg2.aClass117_3 = arg1.aClass117_3;
			if (arg4) {
				arg2.aByte32 = (byte) (arg2.aByte32 | 0x1);
			}
			arg2.aClass117_3.aByte45 = this.aClass117_3.aByte45;
			arg2.aClass117_3.anInterface10_3 = this.aClass117_3.anInterface10_3;
		} else if (Static401.method5810(arg0, this.anInt3045)) {
			arg2.aClass117_3 = this.aClass117_3;
		} else {
			arg2.aClass117_3 = null;
		}
		if (Static570.method7801(this.anInt3045, arg0)) {
			if (arg1.aShortArray58 == null || this.anInt3034 > arg1.aShortArray58.length) {
				arg2.aShortArray58 = arg1.aShortArray58 = new short[this.anInt3034];
			} else {
				arg2.aShortArray58 = arg1.aShortArray58;
			}
			for (local190 = 0; local190 < this.anInt3034; local190++) {
				arg2.aShortArray58[local190] = this.aShortArray58[local190];
			}
		} else {
			arg2.aShortArray58 = this.aShortArray58;
		}
		if (Static573.method7820(this.anInt3045, arg0)) {
			if (arg1.aByteArray36 == null || this.anInt3034 > arg1.aByteArray36.length) {
				arg2.aByteArray36 = arg1.aByteArray36 = new byte[this.anInt3034];
			} else {
				arg2.aByteArray36 = arg1.aByteArray36;
			}
			for (local190 = 0; local190 < this.anInt3034; local190++) {
				arg2.aByteArray36[local190] = this.aByteArray36[local190];
			}
		} else {
			arg2.aByteArray36 = this.aByteArray36;
		}
		if (Static270.method4371(this.anInt3045, arg0)) {
			if (arg4) {
				arg2.aByte32 = (byte) (arg2.aByte32 | 0x2);
			}
			arg2.aClass117_6 = arg1.aClass117_6;
			arg2.aClass117_6.anInterface10_3 = this.aClass117_6.anInterface10_3;
			arg2.aClass117_6.aByte45 = this.aClass117_6.aByte45;
		} else if (Static453.method6412(this.anInt3045, arg0)) {
			arg2.aClass117_6 = this.aClass117_6;
		} else {
			arg2.aClass117_6 = null;
		}
		@Pc(592) int local592;
		if (Static299.method4652(this.anInt3045, arg0)) {
			if (arg1.aShortArray63 == null || arg1.aShortArray63.length < this.anInt3060) {
				local190 = this.anInt3060;
				arg2.aShortArray63 = arg1.aShortArray63 = new short[local190];
				arg2.aShortArray62 = arg1.aShortArray62 = new short[local190];
				arg2.aShortArray56 = arg1.aShortArray56 = new short[local190];
			} else {
				arg2.aShortArray63 = arg1.aShortArray63;
				arg2.aShortArray56 = arg1.aShortArray56;
				arg2.aShortArray62 = arg1.aShortArray62;
			}
			if (this.aClass357_1 == null) {
				for (local190 = 0; local190 < this.anInt3060; local190++) {
					arg2.aShortArray63[local190] = this.aShortArray63[local190];
					arg2.aShortArray56[local190] = this.aShortArray56[local190];
					arg2.aShortArray62[local190] = this.aShortArray62[local190];
				}
			} else {
				if (arg1.aClass357_1 == null) {
					arg1.aClass357_1 = new Class357();
				}
				@Pc(576) Class357 local576 = arg2.aClass357_1 = arg1.aClass357_1;
				if (local576.aShortArray157 == null || local576.aShortArray157.length < this.anInt3060) {
					local592 = this.anInt3060;
					local576.aShortArray158 = new short[local592];
					local576.aShortArray157 = new short[local592];
					local576.aShortArray156 = new short[local592];
					local576.aByteArray118 = new byte[local592];
				}
				for (local592 = 0; local592 < this.anInt3060; local592++) {
					arg2.aShortArray63[local592] = this.aShortArray63[local592];
					arg2.aShortArray56[local592] = this.aShortArray56[local592];
					arg2.aShortArray62[local592] = this.aShortArray62[local592];
					local576.aShortArray157[local592] = this.aClass357_1.aShortArray157[local592];
					local576.aShortArray156[local592] = this.aClass357_1.aShortArray156[local592];
					local576.aShortArray158[local592] = this.aClass357_1.aShortArray158[local592];
					local576.aByteArray118[local592] = this.aClass357_1.aByteArray118[local592];
				}
			}
			arg2.aByteArray35 = this.aByteArray35;
		} else {
			arg2.aClass357_1 = this.aClass357_1;
			arg2.aShortArray63 = this.aShortArray63;
			arg2.aShortArray56 = this.aShortArray56;
			arg2.aShortArray62 = this.aShortArray62;
			arg2.aByteArray35 = this.aByteArray35;
		}
		if (Static73.method1301(arg0, this.anInt3045)) {
			if (arg4) {
				arg2.aByte32 = (byte) (arg2.aByte32 | 0x4);
			}
			arg2.aClass117_4 = arg1.aClass117_4;
			arg2.aClass117_4.aByte45 = this.aClass117_4.aByte45;
			arg2.aClass117_4.anInterface10_3 = this.aClass117_4.anInterface10_3;
		} else if (Static344.method5100(arg0, this.anInt3045)) {
			arg2.aClass117_4 = this.aClass117_4;
		} else {
			arg2.aClass117_4 = null;
		}
		if (Static95.method7582(this.anInt3045, arg0)) {
			if (arg1.aFloatArray25 == null || arg1.aFloatArray25.length < this.anInt3034) {
				local190 = this.anInt3060;
				arg2.aFloatArray24 = arg1.aFloatArray24 = new float[local190];
				arg2.aFloatArray25 = arg1.aFloatArray25 = new float[local190];
			} else {
				arg2.aFloatArray24 = arg1.aFloatArray24;
				arg2.aFloatArray25 = arg1.aFloatArray25;
			}
			for (local190 = 0; local190 < this.anInt3060; local190++) {
				arg2.aFloatArray25[local190] = this.aFloatArray25[local190];
				arg2.aFloatArray24[local190] = this.aFloatArray24[local190];
			}
		} else {
			arg2.aFloatArray24 = this.aFloatArray24;
			arg2.aFloatArray25 = this.aFloatArray25;
		}
		if (Static140.method2842(this.anInt3045, arg0)) {
			arg2.aClass117_5 = arg1.aClass117_5;
			if (arg4) {
				arg2.aByte32 = (byte) (arg2.aByte32 | 0x8);
			}
			arg2.aClass117_5.anInterface10_3 = this.aClass117_5.anInterface10_3;
			arg2.aClass117_5.aByte45 = this.aClass117_5.aByte45;
		} else if (Static404.method5843(arg0, this.anInt3045)) {
			arg2.aClass117_5 = this.aClass117_5;
		} else {
			arg2.aClass117_5 = null;
		}
		if (Static554.method7655(this.anInt3045, arg0)) {
			if (arg1.aShortArray64 == null || arg1.aShortArray64.length < this.anInt3034) {
				local190 = this.anInt3034;
				arg2.aShortArray65 = arg1.aShortArray65 = new short[local190];
				arg2.aShortArray59 = arg1.aShortArray59 = new short[local190];
				arg2.aShortArray64 = arg1.aShortArray64 = new short[local190];
			} else {
				arg2.aShortArray64 = arg1.aShortArray64;
				arg2.aShortArray65 = arg1.aShortArray65;
				arg2.aShortArray59 = arg1.aShortArray59;
			}
			for (local190 = 0; local190 < this.anInt3034; local190++) {
				arg2.aShortArray64[local190] = this.aShortArray64[local190];
				arg2.aShortArray59[local190] = this.aShortArray59[local190];
				arg2.aShortArray65[local190] = this.aShortArray65[local190];
			}
		} else {
			arg2.aShortArray59 = this.aShortArray59;
			arg2.aShortArray64 = this.aShortArray64;
			arg2.aShortArray65 = this.aShortArray65;
		}
		if (Static595.method8009(this.anInt3045, arg0)) {
			if (arg4) {
				arg2.aByte32 = (byte) (arg2.aByte32 | 0x10);
			}
			arg2.aClass294_1 = arg1.aClass294_1;
			arg2.aClass294_1.anInterface18_4 = this.aClass294_1.anInterface18_4;
		} else if (Static521.method7302(this.anInt3045, arg0)) {
			arg2.aClass294_1 = this.aClass294_1;
		} else {
			arg2.aClass294_1 = null;
		}
		if (Static349.method5195(this.anInt3045, arg0)) {
			if (arg1.aShortArray61 == null || this.anInt3034 > arg1.aShortArray61.length) {
				local190 = this.anInt3034;
				arg2.aShortArray61 = arg1.aShortArray61 = new short[local190];
			} else {
				arg2.aShortArray61 = arg1.aShortArray61;
			}
			for (local190 = 0; local190 < this.anInt3034; local190++) {
				arg2.aShortArray61[local190] = this.aShortArray61[local190];
			}
		} else {
			arg2.aShortArray61 = this.aShortArray61;
		}
		if (!Static440.method6234(arg0, this.anInt3045)) {
			arg2.aClass74Array1 = this.aClass74Array1;
		} else if (arg1.aClass74Array1 == null || arg1.aClass74Array1.length < this.anInt3068) {
			local190 = this.anInt3068;
			arg2.aClass74Array1 = arg1.aClass74Array1 = new Class74[local190];
			for (local592 = 0; local592 < this.anInt3068; local592++) {
				arg2.aClass74Array1[local592] = this.aClass74Array1[local592].method2182();
			}
		} else {
			arg2.aClass74Array1 = arg1.aClass74Array1;
			for (local190 = 0; local190 < this.anInt3068; local190++) {
				arg2.aClass74Array1[local190].method2181(this.aClass74Array1[local190]);
			}
		}
		arg2.anIntArray293 = this.anIntArray293;
		arg2.aClass154Array1 = this.aClass154Array1;
		arg2.aClass89Array5 = this.aClass89Array5;
		arg2.aShortArray60 = this.aShortArray60;
		arg2.anIntArray296 = this.anIntArray296;
		if (this.aBoolean238) {
			arg2.aBoolean238 = true;
			arg2.aShort42 = this.aShort42;
			arg2.aShort45 = this.aShort45;
			arg2.aShort48 = this.aShort48;
			arg2.aShort47 = this.aShort47;
			arg2.aShort49 = this.aShort49;
			arg2.aShort44 = this.aShort44;
			arg2.aShort46 = this.aShort46;
		} else {
			arg2.aBoolean238 = false;
		}
		arg2.aClass181Array5 = this.aClass181Array5;
		arg2.anIntArrayArray40 = this.anIntArrayArray40;
		arg2.anIntArrayArray39 = this.anIntArrayArray39;
		arg2.aShortArray57 = this.aShortArray57;
		arg2.anIntArrayArray41 = this.anIntArrayArray41;
		arg2.aShortArray55 = this.aShortArray55;
		return arg2;
	}

	@OriginalMember(owner = "client!ev", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort49;
	}

	@OriginalMember(owner = "client!ev", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
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
			Static360.anInt6332 = 0;
			Static133.anInt3084 = 0;
			local28 = 0;
			Static565.anInt9456 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray39.length) {
					local52 = this.anIntArrayArray39[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static133.anInt3084 += this.anIntArray294[local60];
						Static565.anInt9456 += this.anIntArray295[local60];
						local28++;
						Static360.anInt6332 += this.anIntArray292[local60];
					}
				}
			}
			if (local28 > 0) {
				Static565.anInt9456 = Static565.anInt9456 / local28 + local14;
				Static133.anInt3084 = Static133.anInt3084 / local28 + local22;
				Static360.anInt6332 = Static360.anInt6332 / local28 + local18;
			} else {
				Static565.anInt9456 = local14;
				Static133.anInt3084 = local22;
				Static360.anInt6332 = local18;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local22 = arg2 << 4;
			local18 = arg4 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray39.length > local32) {
					local161 = this.anIntArrayArray39[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local54 = local161[local163];
						this.anIntArray294[local54] += local22;
						this.anIntArray295[local54] += local14;
						this.anIntArray292[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(292) int local292;
		@Pc(748) int local748;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray39.length > local32) {
					local161 = this.anIntArrayArray39[local32];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local54 = local161[local163];
							this.anIntArray294[local54] -= Static133.anInt3084;
							this.anIntArray295[local54] -= Static565.anInt9456;
							this.anIntArray292[local54] -= Static360.anInt6332;
							if (arg4 != 0) {
								local60 = Class4_Sub11.anIntArray148[arg4];
								local274 = Class4_Sub11.anIntArray147[arg4];
								local292 = this.anIntArray294[local54] * local274 + this.anIntArray295[local54] * local60 + 16383 >> 14;
								this.anIntArray295[local54] = this.anIntArray295[local54] * local274 + 16383 - this.anIntArray294[local54] * local60 >> 14;
								this.anIntArray294[local54] = local292;
							}
							if (arg2 != 0) {
								local60 = Class4_Sub11.anIntArray148[arg2];
								local274 = Class4_Sub11.anIntArray147[arg2];
								local292 = this.anIntArray295[local54] * local274 + 16383 - this.anIntArray292[local54] * local60 >> 14;
								this.anIntArray292[local54] = this.anIntArray295[local54] * local60 + this.anIntArray292[local54] * local274 + 16383 >> 14;
								this.anIntArray295[local54] = local292;
							}
							if (arg3 != 0) {
								local60 = Class4_Sub11.anIntArray148[arg3];
								local274 = Class4_Sub11.anIntArray147[arg3];
								local292 = local60 * this.anIntArray292[local54] + local274 * this.anIntArray294[local54] + 16383 >> 14;
								this.anIntArray292[local54] = local274 * this.anIntArray292[local54] + 16383 - local60 * this.anIntArray294[local54] >> 14;
								this.anIntArray294[local54] = local292;
							}
							this.anIntArray294[local54] += Static133.anInt3084;
							this.anIntArray295[local54] += Static565.anInt9456;
							this.anIntArray292[local54] += Static360.anInt6332;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local54 = local161[local163];
							this.anIntArray294[local54] -= Static133.anInt3084;
							this.anIntArray295[local54] -= Static565.anInt9456;
							this.anIntArray292[local54] -= Static360.anInt6332;
							if (arg2 != 0) {
								local60 = Class4_Sub11.anIntArray148[arg2];
								local274 = Class4_Sub11.anIntArray147[arg2];
								local292 = local274 * this.anIntArray295[local54] + 16383 - local60 * this.anIntArray292[local54] >> 14;
								this.anIntArray292[local54] = local274 * this.anIntArray292[local54] + this.anIntArray295[local54] * local60 + 16383 >> 14;
								this.anIntArray295[local54] = local292;
							}
							if (arg4 != 0) {
								local60 = Class4_Sub11.anIntArray148[arg4];
								local274 = Class4_Sub11.anIntArray147[arg4];
								local292 = local274 * this.anIntArray294[local54] + this.anIntArray295[local54] * local60 + 16383 >> 14;
								this.anIntArray295[local54] = this.anIntArray295[local54] * local274 + 16383 - local60 * this.anIntArray294[local54] >> 14;
								this.anIntArray294[local54] = local292;
							}
							if (arg3 != 0) {
								local60 = Class4_Sub11.anIntArray148[arg3];
								local274 = Class4_Sub11.anIntArray147[arg3];
								local292 = local274 * this.anIntArray294[local54] + this.anIntArray292[local54] * local60 + 16383 >> 14;
								this.anIntArray292[local54] = local274 * this.anIntArray292[local54] + 16383 - local60 * this.anIntArray294[local54] >> 14;
								this.anIntArray294[local54] = local292;
							}
							this.anIntArray294[local54] += Static133.anInt3084;
							this.anIntArray295[local54] += Static565.anInt9456;
							this.anIntArray292[local54] += Static360.anInt6332;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray39.length) {
						local52 = this.anIntArrayArray39[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local274 = this.anIntArray296[local60];
							local292 = this.anIntArray296[local60 + 1];
							for (local748 = local274; local748 < local292; local748++) {
								@Pc(757) int local757 = this.aShortArray55[local748] - 1;
								if (local757 == -1) {
									break;
								}
								@Pc(769) int local769;
								@Pc(773) int local773;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local769 = Class4_Sub11.anIntArray148[arg4];
									local773 = Class4_Sub11.anIntArray147[arg4];
									local791 = this.aShortArray63[local757] * local773 + local769 * this.aShortArray56[local757] + 16383 >> 14;
									this.aShortArray56[local757] = (short) (this.aShortArray56[local757] * local773 + 16383 - local769 * this.aShortArray63[local757] >> 14);
									this.aShortArray63[local757] = (short) local791;
								}
								if (arg2 != 0) {
									local769 = Class4_Sub11.anIntArray148[arg2];
									local773 = Class4_Sub11.anIntArray147[arg2];
									local791 = local773 * this.aShortArray56[local757] + 16383 - local769 * this.aShortArray62[local757] >> 14;
									this.aShortArray62[local757] = (short) (this.aShortArray62[local757] * local773 + local769 * this.aShortArray56[local757] + 16383 >> 14);
									this.aShortArray56[local757] = (short) local791;
								}
								if (arg3 != 0) {
									local769 = Class4_Sub11.anIntArray148[arg3];
									local773 = Class4_Sub11.anIntArray147[arg3];
									local791 = this.aShortArray63[local757] * local773 + this.aShortArray62[local757] * local769 + 16383 >> 14;
									this.aShortArray62[local757] = (short) (this.aShortArray62[local757] * local773 + 16383 - this.aShortArray63[local757] * local769 >> 14);
									this.aShortArray63[local757] = (short) local791;
								}
							}
						}
					}
				}
				if (this.aClass117_4 == null && this.aClass117_6 != null) {
					this.aClass117_6.anInterface10_3 = null;
				}
				if (this.aClass117_4 != null) {
					this.aClass117_4.anInterface10_3 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray39.length > local32) {
					local161 = this.anIntArrayArray39[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local54 = local161[local163];
						this.anIntArray294[local54] -= Static133.anInt3084;
						this.anIntArray295[local54] -= Static565.anInt9456;
						this.anIntArray292[local54] -= Static360.anInt6332;
						this.anIntArray294[local54] = arg2 * this.anIntArray294[local54] >> 7;
						this.anIntArray295[local54] = this.anIntArray295[local54] * arg3 >> 7;
						this.anIntArray292[local54] = arg4 * this.anIntArray292[local54] >> 7;
						this.anIntArray294[local54] += Static133.anInt3084;
						this.anIntArray295[local54] += Static565.anInt9456;
						this.anIntArray292[local54] += Static360.anInt6332;
					}
				}
			}
		} else {
			@Pc(1208) Class154 local1208;
			@Pc(1213) Class74 local1213;
			if (arg0 == 5) {
				if (this.anIntArrayArray41 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray41.length > local32) {
							local161 = this.anIntArrayArray41[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local54 = local161[local163];
								local60 = arg2 * 8 + (this.aByteArray36[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray36[local54] = (byte) local60;
							}
							if (local161.length > 0 && this.aClass117_6 != null) {
								this.aClass117_6.anInterface10_3 = null;
							}
						}
					}
					if (this.aClass154Array1 != null) {
						for (local32 = 0; local32 < this.anInt3068; local32++) {
							local1208 = this.aClass154Array1[local32];
							local1213 = this.aClass74Array1[local32];
							local1213.anInt2434 = 255 - (this.aByteArray36[local1208.anInt4332] & 0xFF) << 24 | local1213.anInt2434 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1450) Class74 local1450;
				if (arg0 == 8) {
					if (this.anIntArrayArray40 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray40.length > local32) {
								local161 = this.anIntArrayArray40[local32];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1450 = this.aClass74Array1[local161[local163]];
									local1450.anInt2435 += arg2;
									local1450.anInt2439 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray40 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray40.length) {
								local161 = this.anIntArrayArray40[local32];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1450 = this.aClass74Array1[local161[local163]];
									local1450.anInt2436 = arg3 * local1450.anInt2436 >> 7;
									local1450.anInt2433 = local1450.anInt2433 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray40 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray40.length > local32) {
							local161 = this.anIntArrayArray40[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1450 = this.aClass74Array1[local161[local163]];
								local1450.anInt2437 = arg2 + local1450.anInt2437 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray41 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray41.length > local32) {
						local161 = this.anIntArrayArray41[local32];
						for (local163 = 0; local163 < local161.length; local163++) {
							local54 = local161[local163];
							local60 = this.aShortArray58[local54] & 0xFFFF;
							local274 = local60 >> 10 & 0x3F;
							local292 = local60 >> 7 & 0x7;
							local748 = local60 & 0x7F;
							local292 += arg3 / 4;
							@Pc(1310) int local1310 = local274 + arg2 & 0x3F;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 7) {
								local292 = 7;
							}
							local748 += arg4;
							if (local748 < 0) {
								local748 = 0;
							} else if (local748 > 127) {
								local748 = 127;
							}
							this.aShortArray58[local54] = (short) (local748 | local1310 << 10 | local292 << 7);
						}
						if (local161.length > 0 && this.aClass117_6 != null) {
							this.aClass117_6.anInterface10_3 = null;
						}
					}
				}
				if (this.aClass154Array1 != null) {
					for (local32 = 0; local32 < this.anInt3068; local32++) {
						local1208 = this.aClass154Array1[local32];
						local1213 = this.aClass74Array1[local32];
						local1213.anInt2434 = local1213.anInt2434 & 0xFF000000 | Static170.anIntArray696[this.aShortArray58[local1208.anInt4332] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!nw;B)V")
	private void method2773(@OriginalArg(0) Class4_Sub7_Sub3_Sub2 arg0) {
		if (this.aClass66_Sub3_8.anIntArray515.length < this.anInt3060) {
			this.aClass66_Sub3_8.anIntArray517 = new int[this.anInt3060];
			this.aClass66_Sub3_8.anIntArray515 = new int[this.anInt3060];
		}
		@Pc(32) int[] local32 = this.aClass66_Sub3_8.anIntArray515;
		@Pc(36) int[] local36 = this.aClass66_Sub3_8.anIntArray517;
		@Pc(81) int local81;
		@Pc(120) int local120;
		@Pc(129) int local129;
		for (@Pc(54) int local54 = 0; local54 < this.anInt3021; local54++) {
			local81 = (this.anIntArray294[local54] - (this.anIntArray295[local54] * this.aClass66_Sub3_8.anInt6461 >> 8) >> this.aClass66_Sub3_8.anInt6443) - arg0.anInt6608;
			@Pc(106) int local106 = (this.anIntArray292[local54] - (this.anIntArray295[local54] * this.aClass66_Sub3_8.anInt6452 >> 8) >> this.aClass66_Sub3_8.anInt6443) - arg0.anInt6601;
			@Pc(111) int local111 = this.anIntArray296[local54];
			@Pc(118) int local118 = this.anIntArray296[local54 + 1];
			for (local120 = local111; local120 < local118; local120++) {
				local129 = this.aShortArray55[local120] - 1;
				if (local129 == -1) {
					break;
				}
				local32[local129] = local81;
				local36[local129] = local106;
			}
		}
		for (local81 = 0; local81 < this.anInt3058; local81++) {
			if (this.aByteArray36 == null || this.aByteArray36[local81] <= 128) {
				@Pc(173) short local173 = this.aShortArray64[local81];
				@Pc(178) short local178 = this.aShortArray59[local81];
				@Pc(183) short local183 = this.aShortArray65[local81];
				local120 = local32[local173];
				local129 = local32[local178];
				@Pc(195) int local195 = local32[local183];
				@Pc(199) int local199 = local36[local173];
				@Pc(203) int local203 = local36[local178];
				@Pc(207) int local207 = local36[local183];
				if ((local203 - local207) * (-local129 + local120) - (local195 - local129) * (-local199 + local203) > 0) {
					arg0.method5511(local129, local207, local199, local203, local195, local120);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean238) {
			this.method2778();
		}
		return this.aShort48;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!q;Lclient!ot;I)V")
	@Override
	public void method4023(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3060 == 0) {
			return;
		}
		@Pc(13) Class134_Sub2 local13 = this.aClass66_Sub3_8.aClass134_Sub2_4;
		if (!this.aBoolean238) {
			this.method2778();
		}
		@Pc(22) Class134_Sub2 local22 = (Class134_Sub2) arg0;
		Static385.aFloat135 = local13.aFloat87 * local22.aFloat79 + local22.aFloat86 * local13.aFloat78 + local22.aFloat88 * local13.aFloat79;
		Static320.aFloat101 = local22.aFloat83 * local13.aFloat87 + local13.aFloat78 * local22.aFloat84 + local22.aFloat82 * local13.aFloat79 + local13.aFloat83;
		@Pc(69) float local69 = Static320.aFloat101 + Static385.aFloat135 * (float) this.aShort47;
		@Pc(77) float local77 = (float) this.aShort45 * Static385.aFloat135 + Static320.aFloat101;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local94 = (float) this.aShort48 + local69;
			local88 = local77 - (float) this.aShort48;
		} else {
			local88 = (float) -this.aShort48 + local69;
			local94 = (float) this.aShort48 + local77;
		}
		if (local88 >= this.aClass66_Sub3_8.aFloat119 || local94 <= (float) this.aClass66_Sub3_8.anInt6481) {
			return;
		}
		Static381.aFloat134 = local22.aFloat88 * local13.aFloat86 + local13.aFloat85 * local22.aFloat86 + local22.aFloat79 * local13.aFloat80;
		Static433.aFloat145 = local13.aFloat84 + local13.aFloat85 * local22.aFloat84 + local13.aFloat86 * local22.aFloat82 + local22.aFloat83 * local13.aFloat80;
		@Pc(170) float local170 = Static433.aFloat145 + Static381.aFloat134 * (float) this.aShort47;
		@Pc(178) float local178 = Static381.aFloat134 * (float) this.aShort45 + Static433.aFloat145;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local170 > local178) {
			local193 = (local178 - (float) this.aShort48) * (float) this.aClass66_Sub3_8.anInt6469;
			local204 = ((float) this.aShort48 + local170) * (float) this.aClass66_Sub3_8.anInt6469;
		} else {
			local193 = (float) this.aClass66_Sub3_8.anInt6469 * (local170 - (float) this.aShort48);
			local204 = (float) this.aClass66_Sub3_8.anInt6469 * (local178 + (float) this.aShort48);
		}
		if (this.aClass66_Sub3_8.aFloat124 <= local193 / local94 || this.aClass66_Sub3_8.aFloat132 >= local204 / local94) {
			return;
		}
		Static592.aFloat204 = local22.aFloat79 * local13.aFloat81 + local13.aFloat89 * local22.aFloat86 + local13.aFloat88 * local22.aFloat88;
		Static352.aFloat192 = local13.aFloat82 + local22.aFloat83 * local13.aFloat81 + local13.aFloat89 * local22.aFloat84 + local13.aFloat88 * local22.aFloat82;
		@Pc(293) float local293 = Static352.aFloat192 + (float) this.aShort47 * Static592.aFloat204;
		@Pc(301) float local301 = (float) this.aShort45 * Static592.aFloat204 + Static352.aFloat192;
		@Pc(327) float local327;
		@Pc(316) float local316;
		if (local293 > local301) {
			local316 = (float) this.aClass66_Sub3_8.anInt6476 * ((float) this.aShort48 + local293);
			local327 = (float) this.aClass66_Sub3_8.anInt6476 * ((float) -this.aShort48 + local301);
		} else {
			local316 = ((float) this.aShort48 + local301) * (float) this.aClass66_Sub3_8.anInt6476;
			local327 = (local293 - (float) this.aShort48) * (float) this.aClass66_Sub3_8.anInt6476;
		}
		if (local327 / local94 >= this.aClass66_Sub3_8.aFloat130 || this.aClass66_Sub3_8.aFloat129 >= local316 / local94) {
			return;
		}
		if (arg1 != null || this.aClass154Array1 != null) {
			Static181.aFloat65 = local13.aFloat79 * local22.aFloat89 + local22.aFloat85 * local13.aFloat78 + local13.aFloat87 * local22.aFloat78;
			Static203.aFloat91 = local13.aFloat81 * local22.aFloat78 + local22.aFloat89 * local13.aFloat88 + local22.aFloat85 * local13.aFloat89;
			Static388.aFloat136 = local13.aFloat88 * local22.aFloat81 + local22.aFloat80 * local13.aFloat89 + local22.aFloat87 * local13.aFloat81;
			Static542.aFloat195 = local22.aFloat81 * local13.aFloat86 + local22.aFloat80 * local13.aFloat85 + local22.aFloat87 * local13.aFloat80;
			Static12.aFloat1 = local13.aFloat80 * local22.aFloat78 + local22.aFloat85 * local13.aFloat85 + local13.aFloat86 * local22.aFloat89;
			Static260.aFloat95 = local13.aFloat78 * local22.aFloat80 + local13.aFloat79 * local22.aFloat81 + local22.aFloat87 * local13.aFloat87;
		}
		if (arg1 != null) {
			@Pc(487) boolean local487 = false;
			@Pc(489) boolean local489 = true;
			@Pc(497) int local497 = this.aShort42 + this.aShort44 >> 1;
			@Pc(505) int local505 = this.aShort46 + this.aShort49 >> 1;
			@Pc(524) int local524 = (int) (Static542.aFloat195 * (float) local505 + (float) this.aShort47 * Static381.aFloat134 + Static433.aFloat145 + Static12.aFloat1 * (float) local497);
			@Pc(543) int local543 = (int) ((float) local497 * Static203.aFloat91 + Static352.aFloat192 + Static592.aFloat204 * (float) this.aShort47 + (float) local505 * Static388.aFloat136);
			@Pc(562) int local562 = (int) (Static385.aFloat135 * (float) this.aShort47 + Static320.aFloat101 + (float) local497 * Static181.aFloat65 + (float) local505 * Static260.aFloat95);
			if (local562 >= this.aClass66_Sub3_8.anInt6481) {
				arg1.anInt6865 = this.aClass66_Sub3_8.anInt6480 + this.aClass66_Sub3_8.anInt6476 * local543 / local562;
				arg1.anInt6866 = this.aClass66_Sub3_8.anInt6469 * local524 / local562 + this.aClass66_Sub3_8.anInt6457;
			} else {
				local487 = true;
			}
			@Pc(617) int local617 = (int) (Static542.aFloat195 * (float) local505 + Static381.aFloat134 * (float) this.aShort45 + Static12.aFloat1 * (float) local497 + Static433.aFloat145);
			@Pc(636) int local636 = (int) ((float) local497 * Static203.aFloat91 + Static352.aFloat192 + Static592.aFloat204 * (float) this.aShort45 + Static388.aFloat136 * (float) local505);
			@Pc(655) int local655 = (int) (Static320.aFloat101 + Static181.aFloat65 * (float) local497 + Static385.aFloat135 * (float) this.aShort45 + Static260.aFloat95 * (float) local505);
			if (this.aClass66_Sub3_8.anInt6481 > local655) {
				local487 = true;
			} else {
				arg1.anInt6862 = this.aClass66_Sub3_8.anInt6476 * local636 / local655 + this.aClass66_Sub3_8.anInt6480;
				arg1.anInt6863 = this.aClass66_Sub3_8.anInt6457 + local617 * this.aClass66_Sub3_8.anInt6469 / local655;
			}
			if (local487) {
				if (this.aClass66_Sub3_8.anInt6481 > local562 && local655 < this.aClass66_Sub3_8.anInt6481) {
					local489 = false;
				} else {
					@Pc(737) int local737;
					@Pc(748) int local748;
					@Pc(759) int local759;
					if (local562 < this.aClass66_Sub3_8.anInt6481) {
						local737 = (local655 - this.aClass66_Sub3_8.anInt6481 << 16) / (local655 - local562);
						local748 = local617 + (local737 * (local617 - local524) >> 16);
						arg1.anInt6866 = this.aClass66_Sub3_8.anInt6457 + local748 * this.aClass66_Sub3_8.anInt6469 / this.aClass66_Sub3_8.anInt6481;
						local759 = ((local636 - local543) * local737 >> 16) + local636;
						arg1.anInt6865 = this.aClass66_Sub3_8.anInt6476 * local759 / this.aClass66_Sub3_8.anInt6481 + this.aClass66_Sub3_8.anInt6480;
					} else if (local655 < this.aClass66_Sub3_8.anInt6481) {
						local737 = (local562 - this.aClass66_Sub3_8.anInt6481 << 16) / (local562 - local655);
						local748 = (local737 * (local524 - local617) >> 16) + local524;
						local759 = ((local543 - local636) * local737 >> 16) + local543;
						arg1.anInt6866 = this.aClass66_Sub3_8.anInt6469 * local748 / this.aClass66_Sub3_8.anInt6481 + this.aClass66_Sub3_8.anInt6457;
						arg1.anInt6865 = this.aClass66_Sub3_8.anInt6480 + this.aClass66_Sub3_8.anInt6476 * local759 / this.aClass66_Sub3_8.anInt6481;
					}
				}
			}
			if (local489) {
				if (local562 > local655) {
					arg1.anInt6864 = this.aClass66_Sub3_8.anInt6469 * (this.aShort48 + local524) / local562 + this.aClass66_Sub3_8.anInt6457 - arg1.anInt6866;
				} else {
					arg1.anInt6864 = this.aClass66_Sub3_8.anInt6457 + this.aClass66_Sub3_8.anInt6469 * (local617 - -this.aShort48) / local655 - arg1.anInt6863;
				}
				arg1.aBoolean508 = true;
			}
		}
		this.aClass66_Sub3_8.method5412();
		this.aClass66_Sub3_8.method5386(local22);
		this.method2766();
		this.aClass66_Sub3_8.method5433();
		this.method2770();
	}

	@OriginalMember(owner = "client!ev", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3021; local15++) {
			local34 = this.anIntArray292[local15] * local9 + this.anIntArray294[local15] * local13 >> 14;
			this.anIntArray292[local15] = local13 * this.anIntArray292[local15] - this.anIntArray294[local15] * local9 >> 14;
			this.anIntArray294[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt3060; local34++) {
			@Pc(85) int local85 = this.aShortArray62[local34] * local9 + this.aShortArray63[local34] * local13 >> 14;
			this.aShortArray62[local34] = (short) (this.aShortArray62[local34] * local13 - local9 * this.aShortArray63[local34] >> 14);
			this.aShortArray63[local34] = (short) local85;
		}
		if (this.aClass117_4 == null && this.aClass117_6 != null) {
			this.aClass117_6.anInterface10_3 = null;
		}
		if (this.aClass117_4 != null) {
			this.aClass117_4.anInterface10_3 = null;
		}
		this.aBoolean238 = false;
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3021; local7++) {
			if (arg0 != 128) {
				this.anIntArray294[local7] = arg0 * this.anIntArray294[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray295[local7] = this.anIntArray295[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray292[local7] = arg2 * this.anIntArray292[local7] >> 7;
			}
		}
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
		this.aBoolean238 = false;
	}

	@OriginalMember(owner = "client!ev", name = "da", descriptor = "(I[IIIIZI[I)V")
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
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static565.anInt9456 = 0;
			local29 = 0;
			Static360.anInt6332 = 0;
			Static133.anInt3084 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray39.length > local41) {
					local55 = this.anIntArrayArray39[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray60 == null || (this.aShortArray60[local63] & arg6) != 0) {
							Static133.anInt3084 += this.anIntArray294[local63];
							Static565.anInt9456 += this.anIntArray295[local63];
							local29++;
							Static360.anInt6332 += this.anIntArray292[local63];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static360.anInt6332 = arg4;
				Static133.anInt3084 = arg2;
				Static565.anInt9456 = arg3;
			} else {
				Static62.aBoolean409 = true;
				Static133.anInt3084 = arg2 + Static133.anInt3084 / local29;
				Static565.anInt9456 = Static565.anInt9456 / local29 + arg3;
				Static360.anInt6332 = arg4 + Static360.anInt6332 / local29;
			}
			return;
		}
		@Pc(255) int[] local255;
		@Pc(257) int local257;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg3 * arg7[1] + arg7[0] * arg2 + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg4 = local41;
				arg3 = local35;
				arg2 = local29;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray39.length > local35) {
					local255 = this.anIntArrayArray39[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local57]) != 0) {
							this.anIntArray294[local57] += arg2;
							this.anIntArray295[local57] += arg3;
							this.anIntArray292[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(403) int local403;
		@Pc(421) int local421;
		@Pc(661) int local661;
		@Pc(670) int local670;
		@Pc(679) int local679;
		@Pc(683) int local683;
		@Pc(701) int local701;
		@Pc(1052) int local1052;
		@Pc(1060) int local1060;
		@Pc(1214) int local1214;
		@Pc(1240) int local1240;
		@Pc(1245) int local1245;
		@Pc(1253) int local1253;
		@Pc(1258) int local1258;
		@Pc(1262) int local1262;
		@Pc(1266) int local1266;
		@Pc(1268) int local1268;
		@Pc(1400) int[] local1400;
		@Pc(1402) int local1402;
		@Pc(1406) int local1406;
		@Pc(1410) int local1410;
		@Pc(1412) int local1412;
		@Pc(1537) int local1537;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray39.length > local35) {
						local255 = this.anIntArrayArray39[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray60 == null || (this.aShortArray60[local57] & arg6) != 0) {
								this.anIntArray294[local57] -= Static133.anInt3084;
								this.anIntArray295[local57] -= Static565.anInt9456;
								this.anIntArray292[local57] -= Static360.anInt6332;
								if (arg4 != 0) {
									local63 = Class4_Sub11.anIntArray148[arg4];
									local403 = Class4_Sub11.anIntArray147[arg4];
									local421 = local63 * this.anIntArray295[local57] + this.anIntArray294[local57] * local403 + 16383 >> 14;
									this.anIntArray295[local57] = this.anIntArray295[local57] * local403 + 16383 - this.anIntArray294[local57] * local63 >> 14;
									this.anIntArray294[local57] = local421;
								}
								if (arg2 != 0) {
									local63 = Class4_Sub11.anIntArray148[arg2];
									local403 = Class4_Sub11.anIntArray147[arg2];
									local421 = local403 * this.anIntArray295[local57] + 16383 - local63 * this.anIntArray292[local57] >> 14;
									this.anIntArray292[local57] = this.anIntArray295[local57] * local63 + this.anIntArray292[local57] * local403 + 16383 >> 14;
									this.anIntArray295[local57] = local421;
								}
								if (arg3 != 0) {
									local63 = Class4_Sub11.anIntArray148[arg3];
									local403 = Class4_Sub11.anIntArray147[arg3];
									local421 = this.anIntArray292[local57] * local63 + this.anIntArray294[local57] * local403 + 16383 >> 14;
									this.anIntArray292[local57] = local403 * this.anIntArray292[local57] + 16383 - this.anIntArray294[local57] * local63 >> 14;
									this.anIntArray294[local57] = local421;
								}
								this.anIntArray294[local57] += Static133.anInt3084;
								this.anIntArray295[local57] += Static565.anInt9456;
								this.anIntArray292[local57] += Static360.anInt6332;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray39.length > local41) {
							local55 = this.anIntArrayArray39[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local63]) != 0) {
									local403 = this.anIntArray296[local63];
									local421 = this.anIntArray296[local63 + 1];
									for (local661 = local403; local661 < local421; local661++) {
										local670 = this.aShortArray55[local661] - 1;
										if (local670 == -1) {
											break;
										}
										if (arg4 != 0) {
											local679 = Class4_Sub11.anIntArray148[arg4];
											local683 = Class4_Sub11.anIntArray147[arg4];
											local701 = this.aShortArray56[local670] * local679 + local683 * this.aShortArray63[local670] + 16383 >> 14;
											this.aShortArray56[local670] = (short) (this.aShortArray56[local670] * local683 + 16383 - this.aShortArray63[local670] * local679 >> 14);
											this.aShortArray63[local670] = (short) local701;
										}
										if (arg2 != 0) {
											local679 = Class4_Sub11.anIntArray148[arg2];
											local683 = Class4_Sub11.anIntArray147[arg2];
											local701 = this.aShortArray56[local670] * local683 + 16383 - this.aShortArray62[local670] * local679 >> 14;
											this.aShortArray62[local670] = (short) (local679 * this.aShortArray56[local670] + local683 * this.aShortArray62[local670] + 16383 >> 14);
											this.aShortArray56[local670] = (short) local701;
										}
										if (arg3 != 0) {
											local679 = Class4_Sub11.anIntArray148[arg3];
											local683 = Class4_Sub11.anIntArray147[arg3];
											local701 = local683 * this.aShortArray63[local670] + this.aShortArray62[local670] * local679 + 16383 >> 14;
											this.aShortArray62[local670] = (short) (this.aShortArray62[local670] * local683 + 16383 - local679 * this.aShortArray63[local670] >> 14);
											this.aShortArray63[local670] = (short) local701;
										}
									}
								}
							}
						}
					}
					if (this.aClass117_4 == null && this.aClass117_6 != null) {
						this.aClass117_6.anInterface10_3 = null;
					}
					if (this.aClass117_4 != null) {
						this.aClass117_4.anInterface10_3 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local257 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static62.aBoolean409) {
					local403 = Static133.anInt3084 * arg7[0] + arg7[3] * Static565.anInt9456 + arg7[6] * Static360.anInt6332 + 8192 >> 14;
					local421 = arg7[1] * Static133.anInt3084 + arg7[4] * Static565.anInt9456 + arg7[7] * Static360.anInt6332 + 8192 >> 14;
					local403 += local257;
					local661 = Static360.anInt6332 * arg7[8] + Static133.anInt3084 * arg7[2] + arg7[5] * Static565.anInt9456 + 8192 >> 14;
					local421 += local57;
					local661 += local63;
					Static565.anInt9456 = local421;
					Static133.anInt3084 = local403;
					Static62.aBoolean409 = false;
					Static360.anInt6332 = local661;
				}
				@Pc(1020) int[] local1020 = new int[9];
				local421 = Class4_Sub11.anIntArray147[arg2];
				local661 = Class4_Sub11.anIntArray148[arg2];
				local670 = Class4_Sub11.anIntArray147[arg3];
				local679 = Class4_Sub11.anIntArray148[arg3];
				local683 = Class4_Sub11.anIntArray147[arg4];
				local701 = Class4_Sub11.anIntArray148[arg4];
				local1052 = local661 * local683 + 8192 >> 14;
				local1060 = local701 * local661 + 8192 >> 14;
				local1020[7] = local1052 * local670 + local701 * local679 + 8192 >> 14;
				local1020[0] = local679 * local1060 + local670 * local683 + 8192 >> 14;
				local1020[2] = local421 * local679 + 8192 >> 14;
				local1020[3] = local701 * local421 + 8192 >> 14;
				local1020[1] = local1052 * local679 + local701 * -local670 + 8192 >> 14;
				local1020[6] = local670 * local1060 + local683 * -local679 + 8192 >> 14;
				local1020[5] = -local661;
				local1020[4] = local683 * local421 + 8192 >> 14;
				local1020[8] = local421 * local670 + 8192 >> 14;
				@Pc(1189) int local1189 = local1020[1] * -Static565.anInt9456 + local1020[0] * -Static133.anInt3084 + local1020[2] * -Static360.anInt6332 + 8192 >> 14;
				local1214 = -Static133.anInt3084 * local1020[3] + -Static565.anInt9456 * local1020[4] + -Static360.anInt6332 * local1020[5] + 8192 >> 14;
				local1240 = local1020[8] * -Static360.anInt6332 + local1020[6] * -Static133.anInt3084 + -Static565.anInt9456 * local1020[7] + 8192 >> 14;
				local1245 = local1189 + Static133.anInt3084;
				@Pc(1249) int local1249 = Static565.anInt9456 + local1214;
				local1253 = Static360.anInt6332 + local1240;
				@Pc(1256) int[] local1256 = new int[9];
				for (local1258 = 0; local1258 < 3; local1258++) {
					for (local1262 = 0; local1262 < 3; local1262++) {
						local1266 = 0;
						for (local1268 = 0; local1268 < 3; local1268++) {
							local1266 += arg7[local1262 * 3 + local1268] * local1020[local1268 + local1258 * 3];
						}
						local1256[local1258 * 3 + local1262] = local1266 + 8192 >> 14;
					}
				}
				local1262 = local1020[2] * local63 + local1020[1] * local57 + local257 * local1020[0] + 8192 >> 14;
				local1266 = local257 * local1020[3] + local1020[4] * local57 + local1020[5] * local63 + 8192 >> 14;
				local1266 += local1249;
				local1262 += local1245;
				local1268 = local1020[8] * local63 + local257 * local1020[6] + local57 * local1020[7] + 8192 >> 14;
				local1268 += local1253;
				local1400 = new int[9];
				for (local1402 = 0; local1402 < 3; local1402++) {
					for (local1406 = 0; local1406 < 3; local1406++) {
						local1410 = 0;
						for (local1412 = 0; local1412 < 3; local1412++) {
							local1410 += local1256[local1412 * 3 + local1406] * arg7[local1402 * 3 + local1412];
						}
						local1400[local1406 + local1402 * 3] = local1410 + 8192 >> 14;
					}
				}
				local1406 = arg7[2] * local1268 + arg7[1] * local1266 + arg7[0] * local1262 + 8192 >> 14;
				local1410 = arg7[5] * local1268 + arg7[4] * local1266 + arg7[3] * local1262 + 8192 >> 14;
				local1406 += local29;
				local1410 += local35;
				local1412 = arg7[8] * local1268 + local1262 * arg7[6] + local1266 * arg7[7] + 8192 >> 14;
				local1412 += local41;
				for (local1537 = 0; local1537 < local8; local1537++) {
					@Pc(1543) int local1543 = arg1[local1537];
					if (this.anIntArrayArray39.length > local1543) {
						@Pc(1553) int[] local1553 = this.anIntArrayArray39[local1543];
						for (@Pc(1555) int local1555 = 0; local1555 < local1553.length; local1555++) {
							@Pc(1561) int local1561 = local1553[local1555];
							if (this.aShortArray60 == null || (this.aShortArray60[local1561] & arg6) != 0) {
								@Pc(1606) int local1606 = local1400[2] * this.anIntArray292[local1561] + local1400[0] * this.anIntArray294[local1561] + this.anIntArray295[local1561] * local1400[1] + 8192 >> 14;
								@Pc(1637) int local1637 = this.anIntArray292[local1561] * local1400[5] + local1400[4] * this.anIntArray295[local1561] + this.anIntArray294[local1561] * local1400[3] + 8192 >> 14;
								@Pc(1641) int local1641 = local1606 + local1406;
								@Pc(1645) int local1645 = local1637 + local1410;
								@Pc(1676) int local1676 = this.anIntArray292[local1561] * local1400[8] + local1400[6] * this.anIntArray294[local1561] + local1400[7] * this.anIntArray295[local1561] + 8192 >> 14;
								@Pc(1680) int local1680 = local1676 + local1412;
								this.anIntArray294[local1561] = local1641;
								this.anIntArray295[local1561] = local1645;
								this.anIntArray292[local1561] = local1680;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2604) Class154 local2604;
			@Pc(2609) Class74 local2609;
			if (arg0 == 5) {
				if (this.anIntArrayArray41 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray41.length > local35) {
							local255 = this.anIntArrayArray41[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local57 = local255[local257];
								if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local57]) != 0) {
									local63 = (this.aByteArray36[local57] & 0xFF) + (arg2 * 8);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray36[local57] = (byte) local63;
									if (this.aClass117_6 != null) {
										this.aClass117_6.anInterface10_3 = null;
									}
								}
							}
						}
					}
					if (this.aClass154Array1 != null) {
						for (local35 = 0; local35 < this.anInt3068; local35++) {
							local2604 = this.aClass154Array1[local35];
							local2609 = this.aClass74Array1[local35];
							local2609.anInt2434 = local2609.anInt2434 & 0xFFFFFF | 255 - (this.aByteArray36[local2604.anInt4332] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2867) Class74 local2867;
				if (arg0 == 8) {
					if (this.anIntArrayArray40 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray40.length > local35) {
								local255 = this.anIntArrayArray40[local35];
								for (local257 = 0; local257 < local255.length; local257++) {
									local2867 = this.aClass74Array1[local255[local257]];
									local2867.anInt2439 += arg3;
									local2867.anInt2435 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray40 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray40.length) {
								local255 = this.anIntArrayArray40[local35];
								for (local257 = 0; local257 < local255.length; local257++) {
									local2867 = this.aClass74Array1[local255[local257]];
									local2867.anInt2436 = arg3 * local2867.anInt2436 >> 7;
									local2867.anInt2433 = local2867.anInt2433 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray40 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray40.length > local35) {
							local255 = this.anIntArrayArray40[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2867 = this.aClass74Array1[local255[local257]];
								local2867.anInt2437 = arg2 + local2867.anInt2437 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray41 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray41.length > local35) {
						local255 = this.anIntArrayArray41[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray57 == null || (this.aShortArray57[local57] & arg6) != 0) {
								local63 = this.aShortArray58[local57] & 0xFFFF;
								local403 = local63 >> 10 & 0x3F;
								local421 = local63 >> 7 & 0x7;
								local661 = local63 & 0x7F;
								local421 += arg3 / 4;
								@Pc(2717) int local2717 = local403 + arg2 & 0x3F;
								if (local421 < 0) {
									local421 = 0;
								} else if (local421 > 7) {
									local421 = 7;
								}
								local661 += arg4;
								if (local661 < 0) {
									local661 = 0;
								} else if (local661 > 127) {
									local661 = 127;
								}
								this.aShortArray58[local57] = (short) (local661 | local421 << 7 | local2717 << 10);
								if (this.aClass117_6 != null) {
									this.aClass117_6.anInterface10_3 = null;
								}
							}
						}
					}
				}
				if (this.aClass154Array1 != null) {
					for (local35 = 0; local35 < this.anInt3068; local35++) {
						local2604 = this.aClass154Array1[local35];
						local2609 = this.aClass74Array1[local35];
						local2609.anInt2434 = local2609.anInt2434 & 0xFF000000 | Static170.anIntArray696[this.aShortArray58[local2604.anInt4332] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray39.length > local35) {
					local255 = this.anIntArrayArray39[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray60 == null || (this.aShortArray60[local57] & arg6) != 0) {
							this.anIntArray294[local57] -= Static133.anInt3084;
							this.anIntArray295[local57] -= Static565.anInt9456;
							this.anIntArray292[local57] -= Static360.anInt6332;
							this.anIntArray294[local57] = this.anIntArray294[local57] * arg2 >> 7;
							this.anIntArray295[local57] = this.anIntArray295[local57] * arg3 >> 7;
							this.anIntArray292[local57] = arg4 * this.anIntArray292[local57] >> 7;
							this.anIntArray294[local57] += Static133.anInt3084;
							this.anIntArray295[local57] += Static565.anInt9456;
							this.anIntArray292[local57] += Static360.anInt6332;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local257 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static62.aBoolean409) {
				local403 = arg7[3] * Static565.anInt9456 + Static133.anInt3084 * arg7[0] + arg7[6] * Static360.anInt6332 + 8192 >> 14;
				local421 = arg7[7] * Static360.anInt6332 + arg7[4] * Static565.anInt9456 + arg7[1] * Static133.anInt3084 + 8192 >> 14;
				local421 += local57;
				local661 = arg7[8] * Static360.anInt6332 + arg7[2] * Static133.anInt3084 + arg7[5] * Static565.anInt9456 + 8192 >> 14;
				local403 += local257;
				Static133.anInt3084 = local403;
				local661 += local63;
				Static565.anInt9456 = local421;
				Static62.aBoolean409 = false;
				Static360.anInt6332 = local661;
			}
			local403 = arg2 << 15 >> 7;
			local421 = arg3 << 15 >> 7;
			local661 = arg4 << 15 >> 7;
			local670 = -Static133.anInt3084 * local403 + 8192 >> 14;
			local679 = -Static565.anInt9456 * local421 + 8192 >> 14;
			local683 = -Static360.anInt6332 * local661 + 8192 >> 14;
			local701 = local670 + Static133.anInt3084;
			local1052 = Static565.anInt9456 + local679;
			local1060 = Static360.anInt6332 + local683;
			@Pc(2034) int[] local2034 = new int[] { local403 * arg7[0] + 8192 >> 14, local403 * arg7[3] + 8192 >> 14, local403 * arg7[6] + 8192 >> 14, local421 * arg7[1] + 8192 >> 14, local421 * arg7[4] + 8192 >> 14, local421 * arg7[7] + 8192 >> 14, local661 * arg7[2] + 8192 >> 14, local661 * arg7[5] + 8192 >> 14, arg7[8] * local661 + 8192 >> 14 };
			local1214 = local257 * local403 + 8192 >> 14;
			local1240 = local57 * local421 + 8192 >> 14;
			@Pc(2162) int local2162 = local1214 + local701;
			local1245 = local63 * local661 + 8192 >> 14;
			@Pc(2174) int local2174 = local1240 + local1052;
			@Pc(2178) int local2178 = local1245 + local1060;
			@Pc(2181) int[] local2181 = new int[9];
			@Pc(2187) int local2187;
			for (local1253 = 0; local1253 < 3; local1253++) {
				for (local2187 = 0; local2187 < 3; local2187++) {
					local1258 = 0;
					for (local1262 = 0; local1262 < 3; local1262++) {
						local1258 += local2034[local2187 + local1262 * 3] * arg7[local1253 * 3 + local1262];
					}
					local2181[local2187 + local1253 * 3] = local1258 + 8192 >> 14;
				}
			}
			local2187 = local2174 * arg7[1] + arg7[0] * local2162 + local2178 * arg7[2] + 8192 >> 14;
			local1258 = local2178 * arg7[5] + local2162 * arg7[3] + arg7[4] * local2174 + 8192 >> 14;
			local2187 += local29;
			local1258 += local35;
			local1262 = local2174 * arg7[7] + local2162 * arg7[6] + arg7[8] * local2178 + 8192 >> 14;
			local1262 += local41;
			for (local1266 = 0; local1266 < local8; local1266++) {
				local1268 = arg1[local1266];
				if (local1268 < this.anIntArrayArray39.length) {
					local1400 = this.anIntArrayArray39[local1268];
					for (local1402 = 0; local1402 < local1400.length; local1402++) {
						local1406 = local1400[local1402];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local1406]) != 0) {
							local1410 = this.anIntArray292[local1406] * local2181[2] + local2181[1] * this.anIntArray295[local1406] + this.anIntArray294[local1406] * local2181[0] + 8192 >> 14;
							local1412 = local2181[5] * this.anIntArray292[local1406] + this.anIntArray295[local1406] * local2181[4] + local2181[3] * this.anIntArray294[local1406] + 8192 >> 14;
							@Pc(2430) int local2430 = local1412 + local1258;
							local1537 = this.anIntArray292[local1406] * local2181[8] + this.anIntArray295[local1406] * local2181[7] + this.anIntArray294[local1406] * local2181[6] + 8192 >> 14;
							@Pc(2465) int local2465 = local1410 + local2187;
							@Pc(2469) int local2469 = local1537 + local1262;
							this.anIntArray294[local1406] = local2465;
							this.anIntArray295[local1406] = local2430;
							this.anIntArray292[local1406] = local2469;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass66_Sub3_8.anInterface3_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3034; local11++) {
			if (arg0 == this.aShortArray61[local11]) {
				this.aShortArray61[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class271 local44 = local9.method7249(arg0 & 0xFFFF);
			local31 = local44.aByte82;
			local33 = local44.aByte80;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(65) Class271 local65 = local9.method7249(arg1 & 0xFFFF);
			local54 = local65.aByte80;
			local52 = local65.aByte82;
		}
		if (!(local33 != local54 | local31 != local52)) {
			return;
		}
		if (this.aClass154Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt3068; local94++) {
				@Pc(101) Class154 local101 = this.aClass154Array1[local94];
				@Pc(106) Class74 local106 = this.aClass74Array1[local94];
				local106.anInt2434 = Static170.anIntArray696[this.aShortArray58[local101.anInt4332] & 0xFFFF] & 0xFFFFFF | local106.anInt2434 & 0xFF000000;
			}
		}
		if (this.aClass117_6 != null) {
			this.aClass117_6.anInterface10_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
	private void method2775() {
		if (!this.aBoolean239) {
			return;
		}
		this.aBoolean239 = false;
		if (this.aClass181Array5 == null && this.aClass89Array5 == null && this.aClass154Array1 == null) {
			if (this.anIntArray294 != null && !Static160.method3163(this.anInt3045, this.anInt3025)) {
				if (this.aClass117_3 != null && this.aClass117_3.anInterface10_3 == null) {
					this.aBoolean239 = true;
				} else {
					if (!this.aBoolean238) {
						this.method2778();
					}
					this.anIntArray294 = null;
				}
			}
			if (this.anIntArray295 != null && !Static81.method8046(this.anInt3025, this.anInt3045)) {
				if (this.aClass117_3 != null && this.aClass117_3.anInterface10_3 == null) {
					this.aBoolean239 = true;
				} else {
					if (!this.aBoolean238) {
						this.method2778();
					}
					this.anIntArray295 = null;
				}
			}
			if (this.anIntArray292 != null && !Static101.method2202(this.anInt3025, this.anInt3045)) {
				if (this.aClass117_3 != null && this.aClass117_3.anInterface10_3 == null) {
					this.aBoolean239 = true;
				} else {
					if (!this.aBoolean238) {
						this.method2778();
					}
					this.anIntArray292 = null;
				}
			}
		}
		if (this.aShortArray55 != null && this.anIntArray294 == null && this.anIntArray295 == null && this.anIntArray292 == null) {
			this.anIntArray296 = null;
			this.aShortArray55 = null;
		}
		if (this.aByteArray35 != null && !Static6.method103(this.anInt3045, this.anInt3025)) {
			if (this.aClass117_4 == null) {
				if (this.aClass117_6 != null && this.aClass117_6.anInterface10_3 == null) {
					this.aBoolean239 = true;
				} else {
					this.aByteArray35 = null;
					this.aShortArray63 = this.aShortArray56 = this.aShortArray62 = null;
				}
			} else if (this.aClass117_4.anInterface10_3 == null) {
				this.aBoolean239 = true;
			} else {
				this.aShortArray63 = this.aShortArray56 = this.aShortArray62 = null;
				this.aByteArray35 = null;
			}
		}
		if (this.aShortArray58 != null && !Static293.method4586(this.anInt3025, this.anInt3045)) {
			if (this.aClass117_6 != null && this.aClass117_6.anInterface10_3 == null) {
				this.aBoolean239 = true;
			} else {
				this.aShortArray58 = null;
			}
		}
		if (this.aByteArray36 != null && !Static121.method5991(this.anInt3025, this.anInt3045)) {
			if (this.aClass117_6 != null && this.aClass117_6.anInterface10_3 == null) {
				this.aBoolean239 = true;
			} else {
				this.aByteArray36 = null;
			}
		}
		if (this.aFloatArray25 != null && !Static401.method5808(this.anInt3045, this.anInt3025)) {
			if (this.aClass117_5 != null && this.aClass117_5.anInterface10_3 == null) {
				this.aBoolean239 = true;
			} else {
				this.aFloatArray25 = this.aFloatArray24 = null;
			}
		}
		if (this.aShortArray61 != null && !Static131.method2742(this.anInt3045, this.anInt3025)) {
			if (this.aClass117_6 != null && this.aClass117_6.anInterface10_3 == null) {
				this.aBoolean239 = true;
			} else {
				this.aShortArray61 = null;
			}
		}
		if (this.aShortArray64 != null && !Static565.method7771(this.anInt3045, this.anInt3025)) {
			if ((this.aClass294_1 == null || this.aClass294_1.anInterface18_4 != null) && (this.aClass117_6 == null || this.aClass117_6.anInterface10_3 != null)) {
				this.aShortArray64 = this.aShortArray59 = this.aShortArray65 = null;
			} else {
				this.aBoolean239 = true;
			}
		}
		if (this.anIntArrayArray41 != null && !Static258.method4292(this.anInt3025, this.anInt3045)) {
			this.anIntArrayArray41 = null;
			this.aShortArray57 = null;
		}
		if (this.anIntArrayArray39 != null && !Static374.method5596(this.anInt3045, this.anInt3025)) {
			this.aShortArray60 = null;
			this.anIntArrayArray39 = null;
		}
		if (this.anIntArrayArray40 != null && !Static76.method1357(this.anInt3025, this.anInt3045)) {
			this.anIntArrayArray40 = null;
		}
		if (this.anIntArray293 != null && (this.anInt3025 & 0x800) == 0 && (this.anInt3025 & 0x40000) == 0) {
			this.anIntArray293 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method4010(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class9_Sub3 local8 = (Class9_Sub3) arg0;
		if (this.anInt3034 == 0 || local8.anInt3034 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt3021;
		@Pc(27) int[] local27 = local8.anIntArray294;
		@Pc(30) int[] local30 = local8.anIntArray295;
		@Pc(33) int[] local33 = local8.anIntArray292;
		@Pc(36) short[] local36 = local8.aShortArray63;
		@Pc(39) short[] local39 = local8.aShortArray56;
		@Pc(42) short[] local42 = local8.aShortArray62;
		@Pc(45) byte[] local45 = local8.aByteArray35;
		@Pc(52) short[] local52;
		@Pc(60) short[] local60;
		@Pc(56) short[] local56;
		@Pc(64) byte[] local64;
		if (this.aClass357_1 == null) {
			local60 = null;
			local56 = null;
			local52 = null;
			local64 = null;
		} else {
			local52 = this.aClass357_1.aShortArray157;
			local56 = this.aClass357_1.aShortArray158;
			local60 = this.aClass357_1.aShortArray156;
			local64 = this.aClass357_1.aByteArray118;
		}
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(79) short[] local79;
		@Pc(83) byte[] local83;
		if (local8.aClass357_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local85 = local8.aClass357_1.aShortArray157;
			local83 = local8.aClass357_1.aByteArray118;
			local81 = local8.aClass357_1.aShortArray156;
			local79 = local8.aClass357_1.aShortArray158;
		}
		@Pc(106) int[] local106 = local8.anIntArray296;
		@Pc(109) short[] local109 = local8.aShortArray55;
		if (!local8.aBoolean238) {
			local8.method2778();
		}
		@Pc(118) short local118 = local8.aShort47;
		@Pc(121) short local121 = local8.aShort45;
		@Pc(124) short local124 = local8.aShort44;
		@Pc(127) short local127 = local8.aShort42;
		@Pc(130) short local130 = local8.aShort46;
		@Pc(133) short local133 = local8.aShort49;
		for (@Pc(135) int local135 = 0; local135 < this.anInt3021; local135++) {
			@Pc(145) int local145 = this.anIntArray295[local135] - arg2;
			if (local145 >= local118 && local121 >= local145) {
				@Pc(161) int local161 = this.anIntArray294[local135] - arg1;
				if (local124 <= local161 && local127 >= local161) {
					@Pc(181) int local181 = this.anIntArray292[local135] - arg3;
					if (local130 <= local181 && local181 <= local133) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray296[local135];
						@Pc(207) int local207 = this.anIntArray296[local135 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray55[local209] - 1;
							if (local195 == -1 || this.aByteArray35[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local24; local243++) {
								if (local27[local243] == local161 && local33[local243] == local181 && local145 == local30[local243]) {
									@Pc(270) int local270 = -1;
									local207 = local106[local243 + 1];
									local200 = local106[local243];
									for (@Pc(282) int local282 = local200; local282 < local207; local282++) {
										local270 = local109[local282] - 1;
										if (local270 == -1 || local45[local270] != 0) {
											break;
										}
									}
									if (local270 != -1) {
										if (local52 == null) {
											this.aClass357_1 = new Class357();
											local52 = this.aClass357_1.aShortArray157 = Static580.method2380(this.aShortArray63);
											local60 = this.aClass357_1.aShortArray156 = Static580.method2380(this.aShortArray56);
											local56 = this.aClass357_1.aShortArray158 = Static580.method2380(this.aShortArray62);
											local64 = this.aClass357_1.aByteArray118 = Static496.method7066(this.aByteArray35);
										}
										if (local85 == null) {
											@Pc(367) Class357 local367 = local8.aClass357_1 = new Class357();
											local85 = local367.aShortArray157 = Static580.method2380(local36);
											local81 = local367.aShortArray156 = Static580.method2380(local39);
											local79 = local367.aShortArray158 = Static580.method2380(local42);
											local83 = local367.aByteArray118 = Static496.method7066(local45);
										}
										@Pc(400) short local400 = this.aShortArray63[local195];
										@Pc(405) short local405 = this.aShortArray56[local195];
										@Pc(410) short local410 = this.aShortArray62[local195];
										local207 = local106[local243 + 1];
										@Pc(421) byte local421 = this.aByteArray35[local195];
										local200 = local106[local243];
										@Pc(435) int local435;
										for (@Pc(427) int local427 = local200; local427 < local207; local427++) {
											local435 = local109[local427] - 1;
											if (local435 == -1) {
												break;
											}
											if (local83[local435] != 0) {
												local85[local435] += local400;
												local81[local435] += local405;
												local79[local435] += local410;
												local83[local435] += local421;
											}
										}
										local200 = this.anIntArray296[local135];
										local410 = local42[local270];
										local400 = local36[local270];
										local405 = local39[local270];
										local207 = this.anIntArray296[local135 + 1];
										local421 = local45[local270];
										for (local435 = local200; local435 < local207; local435++) {
											@Pc(517) int local517 = this.aShortArray55[local435] - 1;
											if (local517 == -1) {
												break;
											}
											if (local64[local517] != 0) {
												local52[local517] += local400;
												local60[local517] += local405;
												local56[local517] += local410;
												local64[local517] += local421;
											}
										}
										if (this.aClass117_4 == null && this.aClass117_6 != null) {
											this.aClass117_6.anInterface10_3 = null;
										}
										if (this.aClass117_4 != null) {
											this.aClass117_4.anInterface10_3 = null;
										}
										if (local8.aClass117_4 == null && local8.aClass117_6 != null) {
											local8.aClass117_6.anInterface10_3 = null;
										}
										if (local8.aClass117_4 != null) {
											local8.aClass117_4.anInterface10_3 = null;
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

	@OriginalMember(owner = "client!ev", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		this.anInt3025 = arg0;
		if (this.aClass357_1 != null && (this.anInt3025 & 0x10000) == 0) {
			this.aShortArray62 = this.aClass357_1.aShortArray158;
			this.aShortArray56 = this.aClass357_1.aShortArray156;
			this.aShortArray63 = this.aClass357_1.aShortArray157;
			this.aByteArray35 = this.aClass357_1.aByteArray118;
			this.aClass357_1 = null;
		}
		this.aBoolean239 = true;
		this.method2775();
	}

	@OriginalMember(owner = "client!ev", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3074; local7++) {
			this.anIntArray294[local7] = this.anIntArray294[local7] + 7 >> 4;
			this.anIntArray295[local7] = this.anIntArray295[local7] + 7 >> 4;
			this.anIntArray292[local7] = this.anIntArray292[local7] + 7 >> 4;
		}
		this.aBoolean238 = false;
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub11.anIntArray148[arg0];
		@Pc(13) int local13 = Class4_Sub11.anIntArray147[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3021; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray295[local15] + this.anIntArray294[local15] * local13 >> 14;
			this.anIntArray295[local15] = this.anIntArray295[local15] * local13 - local9 * this.anIntArray294[local15] >> 14;
			this.anIntArray294[local15] = local34;
		}
		this.aBoolean238 = false;
		if (this.aClass117_3 != null) {
			this.aClass117_3.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class9 method4006(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(20) Class9_Sub3 local20;
		@Pc(24) Class9_Sub3 local24;
		if (arg0 == 1) {
			local24 = this.aClass66_Sub3_8.aClass9_Sub3_7;
			local20 = this.aClass66_Sub3_8.aClass9_Sub3_8;
		} else if (arg0 == 2) {
			local24 = this.aClass66_Sub3_8.aClass9_Sub3_4;
			local20 = this.aClass66_Sub3_8.aClass9_Sub3_3;
		} else if (arg0 == 3) {
			local20 = this.aClass66_Sub3_8.aClass9_Sub3_9;
			local24 = this.aClass66_Sub3_8.aClass9_Sub3_2;
		} else if (arg0 == 4) {
			local20 = this.aClass66_Sub3_8.aClass9_Sub3_10;
			local24 = this.aClass66_Sub3_8.aClass9_Sub3_1;
		} else if (arg0 == 5) {
			local24 = this.aClass66_Sub3_8.aClass9_Sub3_6;
			local20 = this.aClass66_Sub3_8.aClass9_Sub3_5;
		} else {
			local20 = local24 = new Class9_Sub3(this.aClass66_Sub3_8);
		}
		return this.method2772(arg1, local24, local20, arg2, arg0 != 0);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(SIIIB)I")
	private int method2777(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static170.anIntArray696[Static19.method382(arg1, arg2)];
		if (arg0 != -1) {
			@Pc(27) Class271 local27 = this.aClass66_Sub3_8.anInterface3_15.method7249(arg0 & 0xFFFF);
			@Pc(32) int local32 = local27.aByte82 & 0xFF;
			@Pc(46) int local46;
			@Pc(66) int local66;
			if (local32 != 0) {
				if (arg2 < 0) {
					local46 = 0;
				} else if (arg2 > 127) {
					local46 = 16777215;
				} else {
					local46 = arg2 * 131586;
				}
				if (local32 == 256) {
					local12 = local46;
				} else {
					local66 = 256 - local32;
					local12 = (local66 * (local12 & 0xFF00FF) + local32 * (local46 & 0xFF00FF) & 0xFF00FF00) + (local66 * (local12 & 0xFF00) + (local46 & 0xFF00) * local32 & 0xFF0000) >> 8;
				}
			}
			local46 = local27.aByte80 & 0xFF;
			if (local46 != 0) {
				local46 += 256;
				@Pc(119) int local119 = local46 * (local12 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local66 = (local12 >> 8 & 0xFF) * local46;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(145) int local145 = (local12 & 0xFF) * local46;
				if (local145 > 65535) {
					local145 = 65535;
				}
				local12 = (local145 >> 8) + (local66 & 0xFF00) + (local119 << 8 & 0xFF00CD);
			}
		}
		return (local12 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4011(@OriginalArg(0) Class134 arg0) {
		@Pc(8) Class134_Sub2 local8 = (Class134_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass181Array5 != null) {
			for (local13 = 0; local13 < this.aClass181Array5.length; local13++) {
				@Pc(20) Class181 local20 = this.aClass181Array5[local13];
				@Pc(22) Class181 local22 = local20;
				if (local20.aClass181_1 != null) {
					local22 = local20.aClass181_1;
				}
				local22.anInt5025 = (int) ((float) this.anIntArray292[local20.anInt5035] * local8.aFloat80 + local8.aFloat85 * (float) this.anIntArray294[local20.anInt5035] + (float) this.anIntArray295[local20.anInt5035] * local8.aFloat86 + local8.aFloat84);
				local22.anInt5021 = (int) (local8.aFloat82 + local8.aFloat81 * (float) this.anIntArray292[local20.anInt5035] + local8.aFloat88 * (float) this.anIntArray295[local20.anInt5035] + local8.aFloat89 * (float) this.anIntArray294[local20.anInt5035]);
				local22.anInt5019 = (int) (local8.aFloat79 * (float) this.anIntArray295[local20.anInt5035] + local8.aFloat78 * (float) this.anIntArray294[local20.anInt5035] + local8.aFloat87 * (float) this.anIntArray292[local20.anInt5035] + local8.aFloat83);
				local22.anInt5024 = (int) ((float) this.anIntArray292[local20.anInt5020] * local8.aFloat80 + (float) this.anIntArray295[local20.anInt5020] * local8.aFloat86 + local8.aFloat85 * (float) this.anIntArray294[local20.anInt5020] + local8.aFloat84);
				local22.anInt5017 = (int) (local8.aFloat82 + local8.aFloat88 * (float) this.anIntArray295[local20.anInt5020] + local8.aFloat89 * (float) this.anIntArray294[local20.anInt5020] + local8.aFloat81 * (float) this.anIntArray292[local20.anInt5020]);
				local22.anInt5032 = (int) (local8.aFloat79 * (float) this.anIntArray295[local20.anInt5020] + local8.aFloat78 * (float) this.anIntArray294[local20.anInt5020] + (float) this.anIntArray292[local20.anInt5020] * local8.aFloat87 + local8.aFloat83);
				local22.anInt5027 = (int) (local8.aFloat85 * (float) this.anIntArray294[local20.anInt5018] + local8.aFloat86 * (float) this.anIntArray295[local20.anInt5018] + (float) this.anIntArray292[local20.anInt5018] * local8.aFloat80 + local8.aFloat84);
				local22.anInt5022 = (int) (local8.aFloat81 * (float) this.anIntArray292[local20.anInt5018] + (float) this.anIntArray295[local20.anInt5018] * local8.aFloat88 + (float) this.anIntArray294[local20.anInt5018] * local8.aFloat89 + local8.aFloat82);
				local22.anInt5029 = (int) (local8.aFloat79 * (float) this.anIntArray295[local20.anInt5018] + local8.aFloat78 * (float) this.anIntArray294[local20.anInt5018] + (float) this.anIntArray292[local20.anInt5018] * local8.aFloat87 + local8.aFloat83);
			}
		}
		if (this.aClass89Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass89Array5.length; local13++) {
			@Pc(365) Class89 local365 = this.aClass89Array5[local13];
			@Pc(367) Class89 local367 = local365;
			if (local365.aClass89_1 != null) {
				local367 = local365.aClass89_1;
			}
			if (local365.aClass134_3 == null) {
				local365.aClass134_3 = local8.method7825();
			} else {
				local365.aClass134_3.la(local8);
			}
			local367.anInt2748 = (int) (local8.aFloat80 * (float) this.anIntArray292[local365.anInt2746] + local8.aFloat86 * (float) this.anIntArray295[local365.anInt2746] + (float) this.anIntArray294[local365.anInt2746] * local8.aFloat85 + local8.aFloat84);
			local367.anInt2741 = (int) (local8.aFloat81 * (float) this.anIntArray292[local365.anInt2746] + (float) this.anIntArray294[local365.anInt2746] * local8.aFloat89 + (float) this.anIntArray295[local365.anInt2746] * local8.aFloat88 + local8.aFloat82);
			local367.anInt2744 = (int) ((float) this.anIntArray294[local365.anInt2746] * local8.aFloat78 + (float) this.anIntArray295[local365.anInt2746] * local8.aFloat79 + (float) this.anIntArray292[local365.anInt2746] * local8.aFloat87 + local8.aFloat83);
		}
	}

	@OriginalMember(owner = "client!ev", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort41 = (short) arg0;
		if (this.aClass117_6 != null) {
			this.aClass117_6.anInterface10_3 = null;
		}
		if (this.aClass117_4 != null) {
			this.aClass117_4.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3034; local3++) {
			if (this.aShortArray58[local3] == arg0) {
				this.aShortArray58[local3] = arg1;
			}
		}
		if (this.aClass154Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt3068; local34++) {
				@Pc(41) Class154 local41 = this.aClass154Array1[local34];
				@Pc(46) Class74 local46 = this.aClass74Array1[local34];
				local46.anInt2434 = Static170.anIntArray696[this.aShortArray58[local41.anInt4332] & 0xFFFF] & 0xFFFFFF | local46.anInt2434 & 0xFF000000;
			}
		}
		if (this.aClass117_6 != null) {
			this.aClass117_6.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "()V")
	@Override
	public void method4016() {
		if (this.anInt3060 <= 0 || this.anInt3058 <= 0) {
			return;
		}
		this.method2771(false);
		if ((this.aByte32 & 0x10) == 0 && this.aClass294_1.anInterface18_4 == null) {
			this.method2767(false);
		}
		this.method2775();
	}

	@OriginalMember(owner = "client!ev", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class4_Sub7_Sub3 Z(@OriginalArg(0) Class4_Sub7_Sub3 arg0) {
		if (this.anInt3060 == 0) {
			return null;
		}
		if (!this.aBoolean238) {
			this.method2778();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass66_Sub3_8.anInt6461 <= 0) {
			local39 = this.aShort44 - (this.aClass66_Sub3_8.anInt6461 * this.aShort47 >> 8) >> this.aClass66_Sub3_8.anInt6443;
			local56 = this.aShort42 - (this.aClass66_Sub3_8.anInt6461 * this.aShort45 >> 8) >> this.aClass66_Sub3_8.anInt6443;
		} else {
			local39 = this.aShort44 - (this.aClass66_Sub3_8.anInt6461 * this.aShort45 >> 8) >> this.aClass66_Sub3_8.anInt6443;
			local56 = this.aShort42 - (this.aClass66_Sub3_8.anInt6461 * this.aShort47 >> 8) >> this.aClass66_Sub3_8.anInt6443;
		}
		@Pc(112) int local112;
		@Pc(129) int local129;
		if (this.aClass66_Sub3_8.anInt6452 <= 0) {
			local112 = this.aShort46 - (this.aClass66_Sub3_8.anInt6452 * this.aShort47 >> 8) >> this.aClass66_Sub3_8.anInt6443;
			local129 = this.aShort49 - (this.aShort45 * this.aClass66_Sub3_8.anInt6452 >> 8) >> this.aClass66_Sub3_8.anInt6443;
		} else {
			local112 = this.aShort46 - (this.aClass66_Sub3_8.anInt6452 * this.aShort45 >> 8) >> this.aClass66_Sub3_8.anInt6443;
			local129 = this.aShort49 - (this.aClass66_Sub3_8.anInt6452 * this.aShort47 >> 8) >> this.aClass66_Sub3_8.anInt6443;
		}
		@Pc(172) int local172 = local56 + 1 - local39;
		@Pc(178) int local178 = local129 + 1 - local112;
		@Pc(181) Class4_Sub7_Sub3_Sub2 local181 = (Class4_Sub7_Sub3_Sub2) arg0;
		@Pc(197) Class4_Sub7_Sub3_Sub2 local197;
		if (local181 != null && local181.method5512(local172, local178)) {
			local197 = local181;
			local181.method5507();
		} else {
			local197 = new Class4_Sub7_Sub3_Sub2(this.aClass66_Sub3_8, local172, local178);
		}
		local197.method5508(local112, local129, local39, local56);
		this.method2773(local197);
		return local197;
	}

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt3025;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)V")
	private void method2778() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3021; local23++) {
			@Pc(30) int local30 = this.anIntArray294[local23];
			@Pc(35) int local35 = this.anIntArray295[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			@Pc(55) int local55 = this.anIntArray292[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local17 < local55) {
				local17 = local55;
			}
			if (local11 > local55) {
				local11 = local55;
			}
			@Pc(87) int local87 = local30 * local30 + local55 * local55;
			if (local87 > local19) {
				local19 = local87;
			}
			local87 = local55 * local55 + local30 * local30 + local35 * local35;
			if (local21 < local87) {
				local21 = local87;
			}
		}
		this.aShort42 = (short) local13;
		this.aShort47 = (short) local9;
		this.aShort45 = (short) local15;
		this.aShort44 = (short) local7;
		this.aShort46 = (short) local11;
		this.aShort49 = (short) local17;
		this.aShort48 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean238 = true;
	}
}
