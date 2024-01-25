import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "[Lclient!ia;")
	private Class129[] aClass129Array6;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "B")
	private byte aByte85;

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!qu", name = "y", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!qu", name = "C", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "[F")
	private float[] aFloatArray57;

	@OriginalMember(owner = "client!qu", name = "N", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!qu", name = "R", descriptor = "Lclient!jf;")
	private Class148 aClass148_1;

	@OriginalMember(owner = "client!qu", name = "S", descriptor = "[Lclient!ge;")
	private Class100[] aClass100Array1;

	@OriginalMember(owner = "client!qu", name = "T", descriptor = "Lclient!sp;")
	private Interface16 anInterface16_4;

	@OriginalMember(owner = "client!qu", name = "X", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!qu", name = "Z", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!qu", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!qu", name = "db", descriptor = "I")
	private int anInt7012;

	@OriginalMember(owner = "client!qu", name = "eb", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!qu", name = "fb", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!qu", name = "hb", descriptor = "Lclient!mj;")
	private Interface7 anInterface7_4;

	@OriginalMember(owner = "client!qu", name = "lb", descriptor = "[Lclient!vd;")
	private Class301[] lb;

	@OriginalMember(owner = "client!qu", name = "nb", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!qu", name = "sb", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!qu", name = "ub", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!qu", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!qu", name = "Hb", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!qu", name = "Jb", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!qu", name = "Kb", descriptor = "I")
	private int anInt7032;

	@OriginalMember(owner = "client!qu", name = "Ob", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!qu", name = "Qb", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!qu", name = "Sb", descriptor = "[Lclient!lh;")
	private Class178[] aClass178Array6;

	@OriginalMember(owner = "client!qu", name = "Xb", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!qu", name = "Yb", descriptor = "[F")
	private float[] aFloatArray58;

	@OriginalMember(owner = "client!qu", name = "Zb", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!qu", name = "cc", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!qu", name = "gc", descriptor = "[I")
	private int[] anIntArray527;

	@OriginalMember(owner = "client!qu", name = "hc", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!qu", name = "jc", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!qu", name = "kc", descriptor = "I")
	private int anInt7047;

	@OriginalMember(owner = "client!qu", name = "mc", descriptor = "[I")
	private int[] anIntArray528;

	@OriginalMember(owner = "client!qu", name = "nc", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!qu", name = "pc", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!qu", name = "rc", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
	private int anInt7002 = 0;

	@OriginalMember(owner = "client!qu", name = "H", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!qu", name = "ib", descriptor = "I")
	private int anInt7014 = 0;

	@OriginalMember(owner = "client!qu", name = "Ub", descriptor = "I")
	private int anInt7038 = 0;

	@OriginalMember(owner = "client!qu", name = "jb", descriptor = "Z")
	private boolean aBoolean466 = true;

	@OriginalMember(owner = "client!qu", name = "dc", descriptor = "I")
	private int anInt7043 = 0;

	@OriginalMember(owner = "client!qu", name = "tb", descriptor = "I")
	private int anInt7020 = 0;

	@OriginalMember(owner = "client!qu", name = "yb", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_34;

	@OriginalMember(owner = "client!qu", name = "Mb", descriptor = "Lclient!maa;")
	private Class188 aClass188_10;

	@OriginalMember(owner = "client!qu", name = "P", descriptor = "Lclient!maa;")
	private Class188 aClass188_9;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "Lclient!maa;")
	private Class188 aClass188_7;

	@OriginalMember(owner = "client!qu", name = "K", descriptor = "Lclient!maa;")
	private Class188 aClass188_8;

	@OriginalMember(owner = "client!qu", name = "pb", descriptor = "Lclient!im;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class19_Sub3(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass9_Sub3_34 = arg0;
		this.aClass188_10 = new Class188(null, 5126, 3, 0);
		this.aClass188_9 = new Class188(null, 5126, 2, 0);
		this.aClass188_7 = new Class188(null, 5126, 3, 0);
		this.aClass188_8 = new Class188(null, 5121, 4, 0);
		this.aClass136_1 = new Class136();
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!te;Lclient!fd;IIII)V")
	public Class19_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7047 = arg5;
		this.aClass9_Sub3_34 = arg0;
		this.anInt7032 = arg2;
		if (Static44.method1398(arg5, arg2)) {
			this.aClass188_10 = new Class188(null, 5126, 3, 0);
		}
		if (Static48.method1462(arg2, arg5)) {
			this.aClass188_9 = new Class188(null, 5126, 2, 0);
		}
		if (Static114.method6188(arg5, arg2)) {
			this.aClass188_7 = new Class188(null, 5126, 3, 0);
		}
		if (Static402.method7872(arg5, arg2)) {
			this.aClass188_8 = new Class188(null, 5121, 4, 0);
		}
		if (Static198.method3659(arg5, arg2)) {
			this.aClass136_1 = new Class136();
		}
		@Pc(102) Interface8 local102 = arg0.anInterface8_13;
		@Pc(106) int[] local106 = new int[arg1.anInt3068];
		this.anIntArray529 = new int[arg1.anInt3066 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt3068; local115++) {
			if ((arg1.aByteArray35 == null || arg1.aByteArray35[local115] != 2) && (arg1.aShortArray40 == null || arg1.aShortArray40[local115] == -1 || !local102.method7085(arg1.aShortArray40[local115] & 0xFFFF).aBoolean350)) {
				local106[this.anInt7014++] = local115;
				this.anIntArray529[arg1.aShortArray37[local115]]++;
				this.anIntArray529[arg1.aShortArray44[local115]]++;
				this.anIntArray529[arg1.aShortArray46[local115]]++;
			}
		}
		this.anInt7038 = this.anInt7014;
		@Pc(202) long[] local202 = new long[this.anInt7014];
		@Pc(214) boolean local214 = (this.anInt7032 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(372) int local372;
		label497: for (@Pc(216) int local216 = 0; local216 < this.anInt7014; local216++) {
			@Pc(222) int local222 = local106[local216];
			@Pc(224) Class175 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass26Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass26Array1.length; local237++) {
					@Pc(244) Class26 local244 = arg1.aClass26Array1[local237];
					if (local244.anInt1199 == local222) {
						@Pc(253) Class103 local253 = Static193.method3619(local244.anInt1200);
						if (local253.aBoolean212) {
							local202[local216] = Long.MAX_VALUE;
							this.anInt7038--;
							continue label497;
						}
					}
				}
			}
			@Pc(280) short local280 = -1;
			if (arg1.aShortArray40 != null) {
				local280 = arg1.aShortArray40[local222];
				if (local280 != -1) {
					local224 = local102.method7085(local280 & 0xFFFF);
					local232 = local224.aByte56;
					local230 = local224.aByte54;
				}
			}
			@Pc(328) boolean local328 = arg1.aByteArray34 != null && arg1.aByteArray34[local222] != 0 || local224 != null && !local224.aBoolean359 | local224.aBoolean353;
			if ((local214 || local328) && arg1.aByteArray36 != null) {
				local226 += arg1.aByteArray36[local222] << 17;
			}
			if (local328) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local226 += local232 & 0xFF;
			local372 = local228 + ((local280 & 0xFFFF) << 16);
			@Pc(378) int local378 = local372 + (local216 & 0xFFFF);
			local202[local216] = ((long) local226 << 32) + ((long) local378);
		}
		Static331.method5390(local106, local202);
		this.aShortArray131 = arg1.aShortArray42;
		this.anIntArray528 = arg1.anIntArray249;
		this.anIntArray526 = arg1.anIntArray246;
		this.anInt7002 = arg1.anInt3066;
		this.anIntArray525 = arg1.anIntArray251;
		this.anInt7043 = arg1.anInt3059;
		@Pc(430) Class274[] local430 = new Class274[this.anInt7002];
		this.aClass178Array6 = arg1.aClass178Array3;
		this.aClass129Array6 = arg1.aClass129Array3;
		@Pc(458) int local458;
		@Pc(472) int local472;
		if (arg1.aClass26Array1 != null) {
			this.anInt7012 = arg1.aClass26Array1.length;
			this.aClass100Array1 = new Class100[this.anInt7012];
			this.lb = new Class301[this.anInt7012];
			for (local458 = 0; local458 < this.anInt7012; local458++) {
				@Pc(465) Class26 local465 = arg1.aClass26Array1[local458];
				@Pc(470) Class103 local470 = Static193.method3619(local465.anInt1200);
				local472 = -1;
				for (@Pc(474) int local474 = 0; local474 < this.anInt7014; local474++) {
					if (local465.anInt1199 == local106[local474]) {
						local472 = local474;
						break;
					}
				}
				if (local472 == -1) {
					throw new RuntimeException();
				}
				local237 = Static392.anIntArray516[arg1.aShortArray45[local465.anInt1199] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray34 == null ? 0 : arg1.aByteArray34[local465.anInt1199]) << 24;
				this.aClass100Array1[local458] = new Class100(local472, arg1.aShortArray37[local465.anInt1199], arg1.aShortArray44[local465.anInt1199], arg1.aShortArray46[local465.anInt1199], local470.anInt3483, local470.anInt3485, local470.anInt3488, local470.anInt3481, local470.anInt3484, local470.aBoolean212, local470.aBoolean213, local465.anInt1202);
				this.lb[local458] = new Class301(local237);
			}
		}
		local458 = this.anInt7014 * 3;
		this.aShort105 = (short) arg3;
		Static251.aLongArray4 = new long[local458];
		this.aShortArray130 = new short[local458];
		this.aShort102 = (short) arg4;
		this.aShortArray123 = new short[this.anInt7014];
		this.aShortArray124 = new short[this.anInt7014];
		this.aFloatArray57 = new float[local458];
		this.aFloatArray58 = new float[local458];
		this.aShortArray133 = new short[this.anInt7014];
		this.aShortArray128 = new short[this.anInt7014];
		this.aShortArray126 = new short[local458];
		this.aShortArray125 = new short[local458];
		this.aByteArray84 = new byte[this.anInt7014];
		this.aShortArray127 = new short[local458];
		this.aShortArray132 = new short[this.anInt7014];
		this.aByteArray85 = new byte[local458];
		if (arg1.aShortArray38 != null) {
			this.aShortArray129 = new short[this.anInt7014];
		}
		local226 = 0;
		for (local372 = 0; local372 < arg1.anInt3066; local372++) {
			local472 = this.anIntArray529[local372];
			this.anIntArray529[local372] = local226;
			local430[local372] = new Class274();
			local226 += local472;
		}
		this.anIntArray529[arg1.anInt3066] = local226;
		@Pc(713) int[] local713 = null;
		@Pc(715) int[] local715 = null;
		@Pc(717) int[] local717 = null;
		@Pc(719) float[][] local719 = null;
		@Pc(745) int local745;
		@Pc(783) int local783;
		@Pc(789) int local789;
		@Pc(803) int local803;
		@Pc(805) int local805;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(1008) float local1008;
		@Pc(1000) float local1000;
		@Pc(992) float local992;
		if (arg1.aByteArray37 != null) {
			@Pc(725) int local725 = arg1.anInt3054;
			@Pc(728) int[] local728 = new int[local725];
			@Pc(731) int[] local731 = new int[local725];
			@Pc(734) int[] local734 = new int[local725];
			@Pc(737) int[] local737 = new int[local725];
			@Pc(740) int[] local740 = new int[local725];
			@Pc(743) int[] local743 = new int[local725];
			for (local745 = 0; local745 < local725; local745++) {
				local728[local745] = Integer.MAX_VALUE;
				local731[local745] = -2147483647;
				local734[local745] = Integer.MAX_VALUE;
				local737[local745] = -2147483647;
				local740[local745] = Integer.MAX_VALUE;
				local743[local745] = -2147483647;
			}
			local715 = new int[local725];
			local719 = new float[local725][];
			for (local783 = 0; local783 < this.anInt7014; local783++) {
				local789 = local106[local783];
				if (arg1.aByteArray37[local789] != -1) {
					local803 = arg1.aByteArray37[local789] & 0xFF;
					for (local805 = 0; local805 < 3; local805++) {
						@Pc(814) short local814;
						if (local805 == 0) {
							local814 = arg1.aShortArray37[local789];
						} else if (local805 == 1) {
							local814 = arg1.aShortArray44[local789];
						} else {
							local814 = arg1.aShortArray46[local789];
						}
						local838 = arg1.anIntArray251[local814];
						local843 = arg1.anIntArray249[local814];
						@Pc(848) int local848 = arg1.anIntArray246[local814];
						if (local728[local803] > local838) {
							local728[local803] = local838;
						}
						if (local731[local803] < local838) {
							local731[local803] = local838;
						}
						if (local843 < local734[local803]) {
							local734[local803] = local843;
						}
						if (local843 > local737[local803]) {
							local737[local803] = local843;
						}
						if (local740[local803] > local848) {
							local740[local803] = local848;
						}
						if (local743[local803] < local848) {
							local743[local803] = local848;
						}
					}
				}
			}
			local717 = new int[local725];
			local713 = new int[local725];
			for (local789 = 0; local789 < local725; local789++) {
				@Pc(938) byte local938 = arg1.aByteArray38[local789];
				if (local938 > 0) {
					local713[local789] = (local731[local789] + local728[local789]) / 2;
					local715[local789] = (local737[local789] + local734[local789]) / 2;
					local717[local789] = (local743[local789] + local740[local789]) / 2;
					if (local938 == 1) {
						local843 = arg1.anIntArray242[local789];
						if (local843 == 0) {
							local1000 = 1.0F;
							local1008 = 1.0F;
						} else if (local843 > 0) {
							local1008 = 1.0F;
							local1000 = (float) local843 / 1024.0F;
						} else {
							local1000 = 1.0F;
							local1008 = (float) -local843 / 1024.0F;
						}
						local992 = 64.0F / (float) arg1.anIntArray250[local789];
					} else if (local938 == 2) {
						local1000 = 64.0F / (float) arg1.anIntArray248[local789];
						local992 = 64.0F / (float) arg1.anIntArray250[local789];
						local1008 = 64.0F / (float) arg1.anIntArray242[local789];
					} else {
						local992 = (float) arg1.anIntArray250[local789] / 1024.0F;
						local1000 = (float) arg1.anIntArray248[local789] / 1024.0F;
						local1008 = (float) arg1.anIntArray242[local789] / 1024.0F;
					}
					local719[local789] = Static202.method5310(arg1.aShortArray41[local789], arg1.aShortArray39[local789], arg1.aByteArray39[local789] & 0xFF, local1008, arg1.aShortArray43[local789], local1000, local992);
				}
			}
		}
		@Pc(1116) Class276[] local1116 = new Class276[arg1.anInt3068];
		@Pc(1135) short local1135;
		@Pc(1145) int local1145;
		@Pc(1155) int local1155;
		@Pc(1215) int local1215;
		for (@Pc(1118) int local1118 = 0; local1118 < arg1.anInt3068; local1118++) {
			@Pc(1125) short local1125 = arg1.aShortArray37[local1118];
			@Pc(1130) short local1130 = arg1.aShortArray44[local1118];
			local1135 = arg1.aShortArray46[local1118];
			local1145 = this.anIntArray525[local1130] - this.anIntArray525[local1125];
			local1155 = this.anIntArray528[local1130] - this.anIntArray528[local1125];
			local745 = this.anIntArray526[local1130] - this.anIntArray526[local1125];
			local783 = this.anIntArray525[local1135] - this.anIntArray525[local1125];
			local789 = this.anIntArray528[local1135] - this.anIntArray528[local1125];
			local803 = this.anIntArray526[local1135] - this.anIntArray526[local1125];
			local805 = local1155 * local803 - local789 * local745;
			local1215 = local783 * local745 - local1145 * local803;
			for (local838 = local1145 * local789 - local783 * local1155; local805 > 8192 || local1215 > 8192 || local838 > 8192 || local805 < -8192 || local1215 < -8192 || local838 < -8192; local838 >>= 0x1) {
				local1215 >>= 0x1;
				local805 >>= 0x1;
			}
			local843 = (int) Math.sqrt((double) (local805 * local805 + local1215 * local1215 + local838 * local838));
			if (local843 <= 0) {
				local843 = 1;
			}
			local805 = local805 * 256 / local843;
			local1215 = local1215 * 256 / local843;
			local838 = local838 * 256 / local843;
			@Pc(1313) byte local1313 = arg1.aByteArray35 == null ? 0 : arg1.aByteArray35[local1118];
			if (local1313 == 0) {
				@Pc(1341) Class274 local1341 = local430[local1125];
				local1341.anInt7944 += local838;
				local1341.anInt7946 += local1215;
				local1341.anInt7943 += local805;
				local1341.anInt7947++;
				@Pc(1369) Class274 local1369 = local430[local1130];
				local1369.anInt7947++;
				local1369.anInt7946 += local1215;
				local1369.anInt7943 += local805;
				local1369.anInt7944 += local838;
				@Pc(1397) Class274 local1397 = local430[local1135];
				local1397.anInt7946 += local1215;
				local1397.anInt7947++;
				local1397.anInt7944 += local838;
				local1397.anInt7943 += local805;
			} else if (local1313 == 1) {
				@Pc(1326) Class276 local1326 = local1116[local1118] = new Class276();
				local1326.anInt8002 = local805;
				local1326.anInt7999 = local838;
				local1326.anInt8001 = local1215;
			}
		}
		@Pc(1434) int local1434;
		for (@Pc(1428) int local1428 = 0; local1428 < this.anInt7014; local1428++) {
			local1434 = local106[local1428];
			@Pc(1441) int local1441 = arg1.aShortArray45[local1434] & 0xFFFF;
			@Pc(1449) short local1449;
			if (arg1.aShortArray40 == null) {
				local1449 = -1;
			} else {
				local1449 = arg1.aShortArray40[local1434];
			}
			if (arg1.aByteArray37 == null) {
				local1155 = -1;
			} else {
				local1155 = arg1.aByteArray37[local1434];
			}
			if (arg1.aByteArray34 == null) {
				local745 = 0;
			} else {
				local745 = arg1.aByteArray34[local1434] & 0xFF;
			}
			@Pc(1481) float local1481 = 0.0F;
			@Pc(1483) float local1483 = 0.0F;
			@Pc(1485) float local1485 = 0.0F;
			local1008 = 0.0F;
			local992 = 0.0F;
			local1000 = 0.0F;
			@Pc(1493) byte local1493 = 0;
			@Pc(1495) byte local1495 = 0;
			@Pc(1497) int local1497 = 0;
			@Pc(1532) byte local1532;
			@Pc(1552) short local1552;
			@Pc(2294) short local2294;
			@Pc(2299) short local2299;
			if (local1449 != -1) {
				if (local1155 == -1) {
					local1481 = 0.0F;
					local1493 = 1;
					local1008 = 1.0F;
					local1000 = 0.0F;
					local992 = 0.0F;
					local1495 = 2;
					local1485 = 1.0F;
					local1483 = 1.0F;
				} else {
					local1155 &= 0xFF;
					local1532 = arg1.aByteArray38[local1155];
					@Pc(1542) short local1542;
					@Pc(1547) short local1547;
					@Pc(1581) float local1581;
					@Pc(1592) float local1592;
					@Pc(1671) float local1671;
					@Pc(1908) float local1908;
					@Pc(1916) float local1916;
					@Pc(1924) float local1924;
					@Pc(1947) float local1947;
					@Pc(1970) float local1970;
					@Pc(1993) float local1993;
					if (local1532 == 0) {
						local1542 = arg1.aShortArray37[local1434];
						local1547 = arg1.aShortArray44[local1434];
						local1552 = arg1.aShortArray46[local1434];
						local2294 = arg1.aShortArray43[local1155];
						local2299 = arg1.aShortArray41[local1155];
						@Pc(2304) short local2304 = arg1.aShortArray39[local1155];
						@Pc(2310) float local2310 = (float) arg1.anIntArray251[local2294];
						@Pc(2316) float local2316 = (float) arg1.anIntArray249[local2294];
						local1581 = arg1.anIntArray246[local2294];
						local1592 = (float) arg1.anIntArray251[local2299] - local2310;
						local1671 = (float) arg1.anIntArray249[local2299] - local2316;
						@Pc(2346) float local2346 = (float) arg1.anIntArray246[local2299] - local1581;
						@Pc(2355) float local2355 = (float) arg1.anIntArray251[local2304] - local2310;
						@Pc(2363) float local2363 = (float) arg1.anIntArray249[local2304] - local2316;
						@Pc(2371) float local2371 = (float) arg1.anIntArray246[local2304] - local1581;
						@Pc(2379) float local2379 = (float) arg1.anIntArray251[local1542] - local2310;
						@Pc(2387) float local2387 = (float) arg1.anIntArray249[local1542] - local2316;
						@Pc(2395) float local2395 = (float) arg1.anIntArray246[local1542] - local1581;
						@Pc(2404) float local2404 = (float) arg1.anIntArray251[local1547] - local2310;
						@Pc(2413) float local2413 = (float) arg1.anIntArray249[local1547] - local2316;
						local1908 = (float) arg1.anIntArray246[local1547] - local1581;
						local1916 = (float) arg1.anIntArray251[local1552] - local2310;
						local1924 = (float) arg1.anIntArray249[local1552] - local2316;
						local1947 = (float) arg1.anIntArray246[local1552] - local1581;
						local1970 = local2371 * local1671 - local2363 * local2346;
						local1993 = local2355 * local2346 - local2371 * local1592;
						@Pc(2472) float local2472 = local1592 * local2363 - local2355 * local1671;
						@Pc(2480) float local2480 = local2472 * local2363 - local2371 * local1993;
						@Pc(2488) float local2488 = local2371 * local1970 - local2472 * local2355;
						@Pc(2496) float local2496 = local2355 * local1993 - local1970 * local2363;
						@Pc(2510) float local2510 = 1.0F / (local2488 * local1671 + local2480 * local1592 + local2346 * local2496);
						local992 = local2510 * (local1947 * local2496 + local1924 * local2488 + local2480 * local1916);
						local1481 = local2510 * (local2496 * local2395 + local2379 * local2480 + local2387 * local2488);
						local1485 = (local1908 * local2496 + local2480 * local2404 + local2413 * local2488) * local2510;
						@Pc(2560) float local2560 = local1970 * local2346 - local1592 * local2472;
						@Pc(2569) float local2569 = local1671 * local2472 - local1993 * local2346;
						@Pc(2577) float local2577 = local1592 * local1993 - local1970 * local1671;
						@Pc(2591) float local2591 = 1.0F / (local2577 * local2371 + local2569 * local2355 + local2363 * local2560);
						local1483 = local2591 * (local2395 * local2577 + local2560 * local2387 + local2379 * local2569);
						local1008 = (local2569 * local2404 + local2413 * local2560 + local1908 * local2577) * local2591;
						local1000 = local2591 * (local1916 * local2569 + local1924 * local2560 + local2577 * local1947);
					} else {
						local1542 = arg1.aShortArray37[local1434];
						local1547 = arg1.aShortArray44[local1434];
						local1552 = arg1.aShortArray46[local1434];
						@Pc(1556) int local1556 = local713[local1155];
						@Pc(1560) int local1560 = local715[local1155];
						@Pc(1564) int local1564 = local717[local1155];
						@Pc(1568) float[] local1568 = local719[local1155];
						@Pc(1573) byte local1573 = arg1.aByteArray40[local1155];
						local1581 = (float) arg1.anIntArray245[local1155] / 256.0F;
						if (local1532 == 1) {
							local1592 = (float) arg1.anIntArray248[local1155] / 1024.0F;
							Static214.method3850(local1556, local1564, arg1.anIntArray246[local1542], local1568, local1592, local1581, local1573, arg1.anIntArray249[local1542], local1560, arg1.anIntArray251[local1542]);
							local1483 = Static348.aFloat125;
							local1481 = Static205.aFloat92;
							Static214.method3850(local1556, local1564, arg1.anIntArray246[local1547], local1568, local1592, local1581, local1573, arg1.anIntArray249[local1547], local1560, arg1.anIntArray251[local1547]);
							local1008 = Static348.aFloat125;
							local1485 = Static205.aFloat92;
							Static214.method3850(local1556, local1564, arg1.anIntArray246[local1552], local1568, local1592, local1581, local1573, arg1.anIntArray249[local1552], local1560, arg1.anIntArray251[local1552]);
							local1000 = Static348.aFloat125;
							local992 = Static205.aFloat92;
							local1671 = local1592 / 2.0F;
							if ((local1573 & 0x1) == 0) {
								if (local992 - local1481 > local1671) {
									local1495 = 1;
									local992 -= local1592;
								} else if (local1671 < local1481 - local992) {
									local992 += local1592;
									local1495 = 2;
								}
								if (local1671 < local1485 - local1481) {
									local1485 -= local1592;
									local1493 = 1;
								} else if (local1481 - local1485 > local1671) {
									local1493 = 2;
									local1485 += local1592;
								}
							} else {
								if (local1671 < local1000 - local1483) {
									local1495 = 1;
									local1000 -= local1592;
								} else if (local1671 < local1483 - local1000) {
									local1495 = 2;
									local1000 += local1592;
								}
								if (local1008 - local1483 > local1671) {
									local1493 = 1;
									local1008 -= local1592;
								} else if (local1671 < local1483 - local1008) {
									local1493 = 2;
									local1008 += local1592;
								}
							}
						} else if (local1532 == 2) {
							local1592 = (float) arg1.anIntArray240[local1155] / 256.0F;
							local1671 = (float) arg1.anIntArray244[local1155] / 256.0F;
							@Pc(1819) int local1819 = arg1.anIntArray251[local1547] - arg1.anIntArray251[local1542];
							@Pc(1830) int local1830 = arg1.anIntArray249[local1547] - arg1.anIntArray249[local1542];
							@Pc(1841) int local1841 = arg1.anIntArray246[local1547] - arg1.anIntArray246[local1542];
							@Pc(1852) int local1852 = arg1.anIntArray251[local1552] - arg1.anIntArray251[local1542];
							@Pc(1863) int local1863 = arg1.anIntArray249[local1552] - arg1.anIntArray249[local1542];
							@Pc(1874) int local1874 = arg1.anIntArray246[local1552] - arg1.anIntArray246[local1542];
							@Pc(1883) int local1883 = local1874 * local1830 - local1841 * local1863;
							@Pc(1891) int local1891 = local1841 * local1852 - local1819 * local1874;
							@Pc(1900) int local1900 = local1863 * local1819 - local1830 * local1852;
							local1908 = 64.0F / (float) arg1.anIntArray242[local1155];
							local1916 = 64.0F / (float) arg1.anIntArray250[local1155];
							local1924 = 64.0F / (float) arg1.anIntArray248[local1155];
							local1947 = ((float) local1883 * local1568[0] + local1568[1] * (float) local1891 + (float) local1900 * local1568[2]) / local1908;
							local1970 = (local1568[5] * (float) local1900 + (float) local1883 * local1568[3] + local1568[4] * (float) local1891) / local1916;
							local1993 = (local1568[6] * (float) local1883 + (float) local1891 * local1568[7] + (float) local1900 * local1568[8]) / local1924;
							local1497 = Static128.method2802(local1993, local1947, local1970);
							Static289.method4883(local1581, local1592, local1564, arg1.anIntArray251[local1542], arg1.anIntArray249[local1542], local1556, local1671, local1568, local1560, local1573, arg1.anIntArray246[local1542], local1497);
							local1481 = Static30.aFloat51;
							local1483 = Static356.aFloat127;
							Static289.method4883(local1581, local1592, local1564, arg1.anIntArray251[local1547], arg1.anIntArray249[local1547], local1556, local1671, local1568, local1560, local1573, arg1.anIntArray246[local1547], local1497);
							local1485 = Static30.aFloat51;
							local1008 = Static356.aFloat127;
							Static289.method4883(local1581, local1592, local1564, arg1.anIntArray251[local1552], arg1.anIntArray249[local1552], local1556, local1671, local1568, local1560, local1573, arg1.anIntArray246[local1552], local1497);
							local1000 = Static356.aFloat127;
							local992 = Static30.aFloat51;
						} else if (local1532 == 3) {
							Static481.method6966(arg1.anIntArray251[local1542], local1568, local1556, local1573, arg1.anIntArray249[local1542], local1581, arg1.anIntArray246[local1542], local1564, local1560);
							local1483 = Static375.aFloat130;
							local1481 = Static101.aFloat76;
							Static481.method6966(arg1.anIntArray251[local1547], local1568, local1556, local1573, arg1.anIntArray249[local1547], local1581, arg1.anIntArray246[local1547], local1564, local1560);
							local1485 = Static101.aFloat76;
							local1008 = Static375.aFloat130;
							Static481.method6966(arg1.anIntArray251[local1552], local1568, local1556, local1573, arg1.anIntArray249[local1552], local1581, arg1.anIntArray246[local1552], local1564, local1560);
							local1000 = Static375.aFloat130;
							local992 = Static101.aFloat76;
							if ((local1573 & 0x1) == 0) {
								if (local1485 - local1481 > 0.5F) {
									local1485--;
									local1493 = 1;
								} else if (local1481 - local1485 > 0.5F) {
									local1493 = 2;
									local1485++;
								}
								if (local992 - local1481 > 0.5F) {
									local1495 = 1;
									local992--;
								} else if (local1481 - local992 > 0.5F) {
									local1495 = 2;
									local992++;
								}
							} else {
								if (local1008 - local1483 > 0.5F) {
									local1493 = 1;
									local1008--;
								} else if (local1483 - local1008 > 0.5F) {
									local1493 = 2;
									local1008++;
								}
								if (local1000 - local1483 > 0.5F) {
									local1000--;
									local1495 = 1;
								} else if (local1483 - local1000 > 0.5F) {
									local1000++;
									local1495 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray35 == null) {
				local1532 = 0;
			} else {
				local1532 = arg1.aByteArray35[local1434];
			}
			if (local1532 == 0) {
				@Pc(2791) long local2791 = ((long) local745 + (long) (local1441 << 8) + (long) (local1497 << 24) << 32) + (long) (local1155 << 2);
				local1552 = arg1.aShortArray37[local1434];
				local2294 = arg1.aShortArray44[local1434];
				local2299 = arg1.aShortArray46[local1434];
				@Pc(2810) Class274 local2810 = local430[local1552];
				this.aShortArray128[local1428] = this.method6034(local2810.anInt7946, local2791, local1483, arg1, local2810.anInt7943, local2810.anInt7947, local1552, local2810.anInt7944, local1481);
				@Pc(2834) Class274 local2834 = local430[local2294];
				this.aShortArray133[local1428] = this.method6034(local2834.anInt7946, (long) local1493 + local2791, local1008, arg1, local2834.anInt7943, local2834.anInt7947, local2294, local2834.anInt7944, local1485);
				@Pc(2861) Class274 local2861 = local430[local2299];
				this.aShortArray132[local1428] = this.method6034(local2861.anInt7946, local2791 + (long) local1495, local1000, arg1, local2861.anInt7943, local2861.anInt7947, local2299, local2861.anInt7944, local992);
			} else if (local1532 == 1) {
				@Pc(2654) Class276 local2654 = local1116[local1434];
				@Pc(2697) long local2697 = (long) ((local2654.anInt7999 + 256 << 22) + (local2654.anInt8001 + 256 << 12) + (local1155 << 2) + (local2654.anInt8002 > 0 ? 1024 : 2048)) + ((long) (local1441 << 8) + (long) (local1497 << 24) + (long) local745 << 32);
				this.aShortArray128[local1428] = this.method6034(local2654.anInt8001, local2697, local1483, arg1, local2654.anInt8002, 0, arg1.aShortArray37[local1434], local2654.anInt7999, local1481);
				this.aShortArray133[local1428] = this.method6034(local2654.anInt8001, (long) local1493 + local2697, local1008, arg1, local2654.anInt8002, 0, arg1.aShortArray44[local1434], local2654.anInt7999, local1485);
				this.aShortArray132[local1428] = this.method6034(local2654.anInt8001, local2697 + (long) local1495, local1000, arg1, local2654.anInt8002, 0, arg1.aShortArray46[local1434], local2654.anInt7999, local992);
			}
			if (arg1.aShortArray40 == null) {
				this.aShortArray124[local1428] = -1;
			} else {
				this.aShortArray124[local1428] = arg1.aShortArray40[local1434];
			}
			if (arg1.aByteArray34 != null) {
				this.aByteArray84[local1428] = arg1.aByteArray34[local1434];
			}
			if (arg1.aShortArray38 != null) {
				this.aShortArray129[local1428] = arg1.aShortArray38[local1434];
			}
			this.aShortArray123[local1428] = arg1.aShortArray45[local1434];
		}
		local1434 = 0;
		local1135 = -10000;
		for (local1145 = 0; local1145 < this.anInt7038; local1145++) {
			@Pc(2954) short local2954 = this.aShortArray124[local1145];
			if (local2954 != local1135) {
				local1135 = local2954;
				local1434++;
			}
		}
		this.anIntArray527 = new int[local1434 + 1];
		local1434 = 0;
		local1135 = -10000;
		for (local1155 = 0; local1155 < this.anInt7038; local1155++) {
			@Pc(2988) short local2988 = this.aShortArray124[local1155];
			if (local1135 != local2988) {
				local1135 = local2988;
				this.anIntArray527[local1434++] = local1155;
			}
		}
		this.anIntArray527[local1434] = this.anInt7038;
		Static251.aLongArray4 = null;
		this.aShortArray127 = Static385.method6075(this.aShortArray127, this.anInt7020);
		this.aShortArray126 = Static385.method6075(this.aShortArray126, this.anInt7020);
		this.aShortArray130 = Static385.method6075(this.aShortArray130, this.anInt7020);
		this.aByteArray85 = Static259.method4329(this.aByteArray85, this.anInt7020);
		this.aFloatArray58 = Static148.method2999(this.anInt7020, this.aFloatArray58);
		this.aFloatArray57 = Static148.method2999(this.anInt7020, this.aFloatArray57);
		if (arg1.anIntArray243 != null && Static446.method6424(arg2, this.anInt7047)) {
			this.anIntArrayArray63 = arg1.method2794(false);
		}
		if (arg1.aClass26Array1 != null && Static369.method5693(this.anInt7047, arg2)) {
			this.anIntArrayArray62 = arg1.method2796();
		}
		if (arg1.anIntArray241 != null && Static500.method7153(arg2, this.anInt7047)) {
			local745 = 0;
			@Pc(3103) int[] local3103 = new int[256];
			for (local789 = 0; local789 < this.anInt7014; local789++) {
				local803 = arg1.anIntArray241[local106[local789]];
				if (local803 >= 0) {
					if (local745 < local803) {
						local745 = local803;
					}
					@Pc(3129) int local3129 = local3103[local803]++;
				}
			}
			this.anIntArrayArray61 = new int[local745 + 1][];
			for (local803 = 0; local803 <= local745; local803++) {
				this.anIntArrayArray61[local803] = new int[local3103[local803]];
				local3103[local803] = 0;
			}
			for (local805 = 0; local805 < this.anInt7014; local805++) {
				local1215 = arg1.anIntArray241[local106[local805]];
				if (local1215 >= 0) {
					this.anIntArrayArray61[local1215][local3103[local1215]++] = local805;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort102;
	}

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7002; local15++) {
			local34 = local9 * this.anIntArray526[local15] + this.anIntArray525[local15] * local13 >> 15;
			this.anIntArray526[local15] = this.anIntArray526[local15] * local13 - this.anIntArray525[local15] * local9 >> 15;
			this.anIntArray525[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt7020; local34++) {
			@Pc(84) int local84 = this.aShortArray127[local34] * local13 + local9 * this.aShortArray130[local34] >> 15;
			this.aShortArray130[local34] = (short) (this.aShortArray130[local34] * local13 - this.aShortArray127[local34] * local9 >> 15);
			this.aShortArray127[local34] = (short) local84;
		}
		if (this.aClass188_7 == null && this.aClass188_8 != null) {
			this.aClass188_8.anInterface16_1 = null;
		}
		if (this.aClass188_7 != null) {
			this.aClass188_7.anInterface16_1 = null;
		}
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!qu", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean465) {
			this.method6041();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!da;)V")
	private void method6033(@OriginalArg(1) Class22_Sub2 arg0) {
		@Pc(16) int local16;
		if (this.aClass178Array6 != null) {
			for (local16 = 0; local16 < this.aClass178Array6.length; local16++) {
				@Pc(23) Class178 local23 = this.aClass178Array6[local16];
				@Pc(25) Class178 local25 = local23;
				if (local23.aClass178_2 != null) {
					local25 = local23.aClass178_2;
				}
				local25.anInt5393 = (int) (arg0.aFloat67 + (float) this.anIntArray528[local23.anInt5394] * arg0.aFloat64 + arg0.aFloat71 * (float) this.anIntArray525[local23.anInt5394] + arg0.aFloat63 * (float) this.anIntArray526[local23.anInt5394]);
				local25.anInt5383 = (int) (arg0.aFloat60 + (float) this.anIntArray525[local23.anInt5394] * arg0.aFloat68 + (float) this.anIntArray528[local23.anInt5394] * arg0.aFloat65 + (float) this.anIntArray526[local23.anInt5394] * arg0.aFloat66);
				local25.anInt5381 = (int) (arg0.aFloat69 * (float) this.anIntArray526[local23.anInt5394] + (float) this.anIntArray528[local23.anInt5394] * arg0.aFloat70 + (float) this.anIntArray525[local23.anInt5394] * arg0.aFloat62 + arg0.aFloat61);
				local25.anInt5382 = (int) ((float) this.anIntArray526[local23.anInt5388] * arg0.aFloat63 + arg0.aFloat64 * (float) this.anIntArray528[local23.anInt5388] + arg0.aFloat71 * (float) this.anIntArray525[local23.anInt5388] + arg0.aFloat67);
				local25.anInt5387 = (int) (arg0.aFloat60 + (float) this.anIntArray525[local23.anInt5388] * arg0.aFloat68 + arg0.aFloat65 * (float) this.anIntArray528[local23.anInt5388] + arg0.aFloat66 * (float) this.anIntArray526[local23.anInt5388]);
				local25.anInt5380 = (int) ((float) this.anIntArray528[local23.anInt5388] * arg0.aFloat70 + (float) this.anIntArray525[local23.anInt5388] * arg0.aFloat62 + (float) this.anIntArray526[local23.anInt5388] * arg0.aFloat69 + arg0.aFloat61);
				local25.anInt5395 = (int) (arg0.aFloat63 * (float) this.anIntArray526[local23.anInt5386] + arg0.aFloat71 * (float) this.anIntArray525[local23.anInt5386] + (float) this.anIntArray528[local23.anInt5386] * arg0.aFloat64 + arg0.aFloat67);
				local25.anInt5391 = (int) ((float) this.anIntArray528[local23.anInt5386] * arg0.aFloat65 + arg0.aFloat68 * (float) this.anIntArray525[local23.anInt5386] + arg0.aFloat66 * (float) this.anIntArray526[local23.anInt5386] + arg0.aFloat60);
				local25.anInt5385 = (int) ((float) this.anIntArray526[local23.anInt5386] * arg0.aFloat69 + (float) this.anIntArray528[local23.anInt5386] * arg0.aFloat70 + arg0.aFloat62 * (float) this.anIntArray525[local23.anInt5386] + arg0.aFloat61);
			}
		}
		if (this.aClass129Array6 == null) {
			return;
		}
		for (local16 = 0; local16 < this.aClass129Array6.length; local16++) {
			@Pc(364) Class129 local364 = this.aClass129Array6[local16];
			@Pc(366) Class129 local366 = local364;
			if (local364.aClass129_2 != null) {
				local366 = local364.aClass129_2;
			}
			if (local364.aClass22_7 == null) {
				local364.aClass22_7 = arg0.method5945();
			} else {
				local364.aClass22_7.EA(arg0);
			}
			local366.anInt4068 = (int) (arg0.aFloat63 * (float) this.anIntArray526[local364.anInt4062] + arg0.aFloat71 * (float) this.anIntArray525[local364.anInt4062] + arg0.aFloat64 * (float) this.anIntArray528[local364.anInt4062] + arg0.aFloat67);
			local366.anInt4063 = (int) (arg0.aFloat60 + (float) this.anIntArray526[local364.anInt4062] * arg0.aFloat66 + (float) this.anIntArray525[local364.anInt4062] * arg0.aFloat68 + (float) this.anIntArray528[local364.anInt4062] * arg0.aFloat65);
			local366.anInt4064 = (int) (arg0.aFloat69 * (float) this.anIntArray526[local364.anInt4062] + arg0.aFloat70 * (float) this.anIntArray528[local364.anInt4062] + (float) this.anIntArray525[local364.anInt4062] * arg0.aFloat62 + arg0.aFloat61);
		}
	}

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean465) {
			this.method6041();
		}
		return this.aShort108;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7014; local7++) {
			local16 = this.aShortArray123[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 += arg3 * (arg2 - local61) >> 7;
			}
			this.aShortArray123[local7] = (short) (local22 << 10 | local28 << 7 | local61);
		}
		if (this.aClass100Array1 != null) {
			for (local16 = 0; local16 < this.anInt7012; local16++) {
				@Pc(110) Class100 local110 = this.aClass100Array1[local16];
				@Pc(115) Class301 local115 = this.lb[local16];
				local115.anInt8601 = local115.anInt8601 & 0xFF000000 | Static392.anIntArray516[this.aShortArray123[local110.anInt3467] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass188_8 != null) {
			this.aClass188_8.anInterface16_1 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!m;Lclient!pr;I)V")
	@Override
	public void method7258(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7020 == 0) {
			return;
		}
		@Pc(13) Class22_Sub2 local13 = this.aClass9_Sub3_34.aClass22_Sub2_4;
		@Pc(16) Class22_Sub2 local16 = (Class22_Sub2) arg0;
		if (!this.aBoolean465) {
			this.method6041();
		}
		this.method6033(local16);
		Static310.aFloat113 = local13.aFloat69 * local16.aFloat70 + local13.aFloat70 * local16.aFloat65 + local16.aFloat64 * local13.aFloat62;
		Static156.aFloat81 = local13.aFloat61 + local13.aFloat69 * local16.aFloat61 + local16.aFloat60 * local13.aFloat70 + local13.aFloat62 * local16.aFloat67;
		@Pc(73) float local73 = Static156.aFloat81 + (float) this.aShort101 * Static310.aFloat113;
		@Pc(81) float local81 = Static156.aFloat81 + (float) this.aShort108 * Static310.aFloat113;
		@Pc(97) float local97;
		@Pc(91) float local91;
		if (local81 < local73) {
			local91 = (float) this.aShort103 + local73;
			local97 = (float) -this.aShort103 + local81;
		} else {
			local91 = local81 + (float) this.aShort103;
			local97 = local73 - (float) this.aShort103;
		}
		if (this.aClass9_Sub3_34.aFloat153 <= local97 || (float) this.aClass9_Sub3_34.anInt7898 >= local91) {
			return;
		}
		Static85.aFloat73 = local13.aFloat63 * local16.aFloat70 + local16.aFloat65 * local13.aFloat64 + local13.aFloat71 * local16.aFloat64;
		Static183.aFloat87 = local13.aFloat67 + local16.aFloat61 * local13.aFloat63 + local13.aFloat64 * local16.aFloat60 + local16.aFloat67 * local13.aFloat71;
		@Pc(174) float local174 = Static183.aFloat87 + (float) this.aShort101 * Static85.aFloat73;
		@Pc(182) float local182 = Static183.aFloat87 + (float) this.aShort108 * Static85.aFloat73;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = ((float) this.aShort103 + local174) * (float) this.aClass9_Sub3_34.anInt7893;
			local209 = ((float) -this.aShort103 + local182) * (float) this.aClass9_Sub3_34.anInt7893;
		} else {
			local209 = (float) this.aClass9_Sub3_34.anInt7893 * ((float) -this.aShort103 + local174);
			local197 = ((float) this.aShort103 + local182) * (float) this.aClass9_Sub3_34.anInt7893;
		}
		if (local209 / local91 >= this.aClass9_Sub3_34.aFloat154 || local197 / local91 <= this.aClass9_Sub3_34.aFloat173) {
			return;
		}
		Static58.aFloat59 = local16.aFloat61 * local13.aFloat66 + local13.aFloat68 * local16.aFloat67 + local13.aFloat65 * local16.aFloat60 + local13.aFloat60;
		Static14.aFloat45 = local13.aFloat66 * local16.aFloat70 + local16.aFloat64 * local13.aFloat68 + local16.aFloat65 * local13.aFloat65;
		@Pc(299) float local299 = Static58.aFloat59 + Static14.aFloat45 * (float) this.aShort101;
		@Pc(307) float local307 = Static58.aFloat59 + Static14.aFloat45 * (float) this.aShort108;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local299 > local307) {
			local334 = (float) this.aClass9_Sub3_34.anInt7911 * (local307 - (float) this.aShort103);
			local322 = ((float) this.aShort103 + local299) * (float) this.aClass9_Sub3_34.anInt7911;
		} else {
			local322 = (float) this.aClass9_Sub3_34.anInt7911 * ((float) this.aShort103 + local307);
			local334 = ((float) -this.aShort103 + local299) * (float) this.aClass9_Sub3_34.anInt7911;
		}
		if (this.aClass9_Sub3_34.aFloat155 <= local334 / local91 || local322 / local91 <= this.aClass9_Sub3_34.aFloat166) {
			return;
		}
		if (arg1 != null || this.aClass100Array1 != null) {
			Static139.aFloat80 = local16.aFloat69 * local13.aFloat66 + local16.aFloat63 * local13.aFloat68 + local16.aFloat66 * local13.aFloat65;
			Static544.aFloat205 = local13.aFloat70 * local16.aFloat68 + local13.aFloat62 * local16.aFloat71 + local16.aFloat62 * local13.aFloat69;
			Static15.aFloat46 = local16.aFloat62 * local13.aFloat66 + local16.aFloat68 * local13.aFloat65 + local13.aFloat68 * local16.aFloat71;
			Static42.aFloat54 = local13.aFloat64 * local16.aFloat66 + local16.aFloat63 * local13.aFloat71 + local16.aFloat69 * local13.aFloat63;
			Static323.aFloat118 = local13.aFloat62 * local16.aFloat63 + local16.aFloat66 * local13.aFloat70 + local16.aFloat69 * local13.aFloat69;
			Static87.aFloat120 = local16.aFloat62 * local13.aFloat63 + local13.aFloat71 * local16.aFloat71 + local16.aFloat68 * local13.aFloat64;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort109 + this.aShort104 >> 1;
			@Pc(511) int local511 = this.aShort106 + this.aShort107 >> 1;
			@Pc(530) int local530 = (int) (Static85.aFloat73 * (float) this.aShort101 + Static183.aFloat87 + Static87.aFloat120 * (float) local503 + Static42.aFloat54 * (float) local511);
			@Pc(549) int local549 = (int) (Static14.aFloat45 * (float) this.aShort101 + (float) local503 * Static15.aFloat46 + Static58.aFloat59 + (float) local511 * Static139.aFloat80);
			@Pc(568) int local568 = (int) ((float) local511 * Static323.aFloat118 + Static310.aFloat113 * (float) this.aShort101 + Static544.aFloat205 * (float) local503 + Static156.aFloat81);
			if (local568 < this.aClass9_Sub3_34.anInt7898) {
				local493 = true;
			} else {
				arg1.anInt6640 = this.aClass9_Sub3_34.anInt7893 * local530 / local568 + this.aClass9_Sub3_34.anInt7917;
				arg1.anInt6642 = this.aClass9_Sub3_34.anInt7909 + local549 * this.aClass9_Sub3_34.anInt7911 / local568;
			}
			@Pc(622) int local622 = (int) (Static42.aFloat54 * (float) local511 + Static87.aFloat120 * (float) local503 + Static183.aFloat87 + Static85.aFloat73 * (float) this.aShort108);
			@Pc(641) int local641 = (int) ((float) this.aShort108 * Static14.aFloat45 + Static58.aFloat59 + (float) local503 * Static15.aFloat46 + (float) local511 * Static139.aFloat80);
			@Pc(660) int local660 = (int) ((float) this.aShort108 * Static310.aFloat113 + Static156.aFloat81 + Static544.aFloat205 * (float) local503 + (float) local511 * Static323.aFloat118);
			if (local660 >= this.aClass9_Sub3_34.anInt7898) {
				arg1.anInt6639 = this.aClass9_Sub3_34.anInt7909 + this.aClass9_Sub3_34.anInt7911 * local641 / local660;
				arg1.anInt6643 = local622 * this.aClass9_Sub3_34.anInt7893 / local660 + this.aClass9_Sub3_34.anInt7917;
			} else {
				local493 = true;
			}
			if (local493) {
				if (this.aClass9_Sub3_34.anInt7898 > local568 && this.aClass9_Sub3_34.anInt7898 > local660) {
					local495 = false;
				} else {
					@Pc(743) int local743;
					@Pc(754) int local754;
					@Pc(780) int local780;
					if (local568 < this.aClass9_Sub3_34.anInt7898) {
						local743 = (local660 - this.aClass9_Sub3_34.anInt7898 << 16) / (local660 - local568);
						local754 = ((local622 - local530) * local743 >> 16) + local622;
						arg1.anInt6640 = this.aClass9_Sub3_34.anInt7917 + local754 * this.aClass9_Sub3_34.anInt7893 / this.aClass9_Sub3_34.anInt7898;
						local780 = (local743 * (local641 - local549) >> 16) + local641;
						arg1.anInt6642 = this.aClass9_Sub3_34.anInt7911 * local780 / this.aClass9_Sub3_34.anInt7898 + this.aClass9_Sub3_34.anInt7909;
					} else if (local660 < this.aClass9_Sub3_34.anInt7898) {
						local743 = (local568 - this.aClass9_Sub3_34.anInt7898 << 16) / (local568 - local660);
						local754 = ((local530 - local622) * local743 >> 16) + local530;
						local780 = local549 + (local743 * (local549 - local641) >> 16);
						arg1.anInt6640 = this.aClass9_Sub3_34.anInt7917 + local754 * this.aClass9_Sub3_34.anInt7893 / this.aClass9_Sub3_34.anInt7898;
						arg1.anInt6642 = this.aClass9_Sub3_34.anInt7911 * local780 / this.aClass9_Sub3_34.anInt7898 + this.aClass9_Sub3_34.anInt7909;
					}
				}
			}
			if (local495) {
				arg1.aBoolean437 = true;
				if (local660 >= local568) {
					arg1.anInt6641 = this.aClass9_Sub3_34.anInt7893 * (this.aShort103 + local622) / local660 + this.aClass9_Sub3_34.anInt7917 - arg1.anInt6643;
				} else {
					arg1.anInt6641 = this.aClass9_Sub3_34.anInt7893 * (local530 + this.aShort103) / local568 + this.aClass9_Sub3_34.anInt7917 - arg1.anInt6640;
				}
			}
		}
		this.aClass9_Sub3_34.method6679();
		this.aClass9_Sub3_34.method6694(local16);
		this.method6040();
		this.aClass9_Sub3_34.method6715();
		this.method6035();
	}

	@OriginalMember(owner = "client!qu", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean465) {
			this.method6041();
		}
		return this.aShort107;
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "()V")
	@Override
	public void method7259() {
		if (this.anInt7020 <= 0 || this.anInt7038 <= 0) {
			return;
		}
		this.method6043(false);
		if ((this.aByte85 & 0x10) == 0 && this.aClass136_1.anInterface7_1 == null) {
			this.method6044(false);
		}
		this.method6047();
	}

	@OriginalMember(owner = "client!qu", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7002; local7++) {
			if (arg0 != 128) {
				this.anIntArray525[local7] = arg0 * this.anIntArray525[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray528[local7] = this.anIntArray528[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray526[local7] = this.anIntArray526[local7] * arg2 >> 7;
			}
		}
		this.aBoolean465 = false;
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			local24 = 0;
			Static49.anInt1498 = 0;
			Static138.anInt9430 = 0;
			Static224.anInt4514 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray63.length) {
					local52 = this.anIntArrayArray63[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray131 == null || (arg6 & this.aShortArray131[local60]) != 0) {
							Static224.anInt4514 += this.anIntArray525[local60];
							Static138.anInt9430 += this.anIntArray528[local60];
							Static49.anInt1498 += this.anIntArray526[local60];
							local24++;
						}
					}
				}
			}
			if (local24 > 0) {
				Static224.anInt4514 = Static224.anInt4514 / local24 + arg2;
				Static138.anInt9430 = Static138.anInt9430 / local24 + arg3;
				Static479.aBoolean552 = true;
				Static49.anInt1498 = arg4 + Static49.anInt1498 / local24;
			} else {
				Static49.anInt1498 = arg4;
				Static138.anInt9430 = arg3;
				Static224.anInt4514 = arg2;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 16384 >> 15;
				local32 = arg2 * arg7[3] + arg3 * arg7[4] + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
				arg2 = local24;
				arg4 = local38;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray63.length > local32) {
					local250 = this.anIntArrayArray63[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray131 == null || (arg6 & this.aShortArray131[local54]) != 0) {
							this.anIntArray525[local54] += arg2;
							this.anIntArray528[local54] += arg3;
							this.anIntArray526[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(377) int local377;
		@Pc(399) int local399;
		@Pc(422) int local422;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(469) int local469;
		@Pc(477) int local477;
		@Pc(485) int local485;
		@Pc(639) int local639;
		@Pc(664) int local664;
		@Pc(669) int local669;
		@Pc(677) int local677;
		@Pc(682) int local682;
		@Pc(686) int local686;
		@Pc(690) int local690;
		@Pc(692) int local692;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(832) int local832;
		@Pc(834) int local834;
		@Pc(961) int local961;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray63.length) {
						local250 = this.anIntArrayArray63[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray131 == null || (this.aShortArray131[local54] & arg6) != 0) {
								this.anIntArray525[local54] -= Static224.anInt4514;
								this.anIntArray528[local54] -= Static138.anInt9430;
								this.anIntArray526[local54] -= Static49.anInt1498;
								if (arg4 != 0) {
									local60 = Class307.anIntArray744[arg4];
									local377 = Class307.anIntArray743[arg4];
									local399 = local377 * this.anIntArray525[local54] + local60 * this.anIntArray528[local54] + 32767 >> 15;
									this.anIntArray528[local54] = this.anIntArray528[local54] * local377 + 32767 - this.anIntArray525[local54] * local60 >> 15;
									this.anIntArray525[local54] = local399;
								}
								if (arg2 != 0) {
									local60 = Class307.anIntArray744[arg2];
									local377 = Class307.anIntArray743[arg2];
									local399 = this.anIntArray528[local54] * local377 + 32767 - this.anIntArray526[local54] * local60 >> 15;
									this.anIntArray526[local54] = local377 * this.anIntArray526[local54] + local60 * this.anIntArray528[local54] + 32767 >> 15;
									this.anIntArray528[local54] = local399;
								}
								if (arg3 != 0) {
									local60 = Class307.anIntArray744[arg3];
									local377 = Class307.anIntArray743[arg3];
									local399 = this.anIntArray526[local54] * local60 + this.anIntArray525[local54] * local377 + 32767 >> 15;
									this.anIntArray526[local54] = this.anIntArray526[local54] * local377 + 32767 - this.anIntArray525[local54] * local60 >> 15;
									this.anIntArray525[local54] = local399;
								}
								this.anIntArray525[local54] += Static224.anInt4514;
								this.anIntArray528[local54] += Static138.anInt9430;
								this.anIntArray526[local54] += Static49.anInt1498;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray63.length > local38) {
							local52 = this.anIntArrayArray63[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray131 == null || (arg6 & this.aShortArray131[local60]) != 0) {
									local377 = this.anIntArray529[local60];
									local399 = this.anIntArray529[local60 + 1];
									for (local422 = local377; local422 < local399; local422++) {
										local457 = this.aShortArray125[local422] - 1;
										if (local457 == -1) {
											break;
										}
										if (arg4 != 0) {
											local461 = Class307.anIntArray744[arg4];
											local465 = Class307.anIntArray743[arg4];
											local469 = this.aShortArray127[local457] * local465 + this.aShortArray126[local457] * local461 + 32767 >> 15;
											this.aShortArray126[local457] = (short) (this.aShortArray126[local457] * local465 + 32767 - local461 * this.aShortArray127[local457] >> 15);
											this.aShortArray127[local457] = (short) local469;
										}
										if (arg2 != 0) {
											local461 = Class307.anIntArray744[arg2];
											local465 = Class307.anIntArray743[arg2];
											local469 = this.aShortArray126[local457] * local465 + 32767 - local461 * this.aShortArray130[local457] >> 15;
											this.aShortArray130[local457] = (short) (local461 * this.aShortArray126[local457] + this.aShortArray130[local457] * local465 + 32767 >> 15);
											this.aShortArray126[local457] = (short) local469;
										}
										if (arg3 != 0) {
											local461 = Class307.anIntArray744[arg3];
											local465 = Class307.anIntArray743[arg3];
											local469 = this.aShortArray127[local457] * local465 + local461 * this.aShortArray130[local457] + 32767 >> 15;
											this.aShortArray130[local457] = (short) (this.aShortArray130[local457] * local465 + 32767 - local461 * this.aShortArray127[local457] >> 15);
											this.aShortArray127[local457] = (short) local469;
										}
									}
								}
							}
						}
					}
					if (this.aClass188_7 == null && this.aClass188_8 != null) {
						this.aClass188_8.anInterface16_1 = null;
					}
					if (this.aClass188_7 != null) {
						this.aClass188_7.anInterface16_1 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static479.aBoolean552) {
					local377 = Static138.anInt9430 * arg7[3] + Static224.anInt4514 * arg7[0] + arg7[6] * Static49.anInt1498 + 16384 >> 15;
					local399 = Static49.anInt1498 * arg7[7] + arg7[1] * Static224.anInt4514 + Static138.anInt9430 * arg7[4] + 16384 >> 15;
					local422 = arg7[8] * Static49.anInt1498 + Static224.anInt4514 * arg7[2] + arg7[5] * Static138.anInt9430 + 16384 >> 15;
					local399 += local54;
					local377 += local252;
					Static224.anInt4514 = local377;
					local422 += local60;
					Static138.anInt9430 = local399;
					Static49.anInt1498 = local422;
					Static479.aBoolean552 = false;
				}
				@Pc(445) int[] local445 = new int[9];
				local399 = Class307.anIntArray743[arg2];
				local422 = Class307.anIntArray744[arg2];
				local457 = Class307.anIntArray743[arg3];
				local461 = Class307.anIntArray744[arg3];
				local465 = Class307.anIntArray743[arg4];
				local469 = Class307.anIntArray744[arg4];
				local477 = local465 * local422 + 16384 >> 15;
				local485 = local422 * local469 + 16384 >> 15;
				local445[4] = local465 * local399 + 16384 >> 15;
				local445[0] = local461 * local485 + local465 * local457 + 16384 >> 15;
				local445[6] = -local461 * local465 + local485 * local457 + 16384 >> 15;
				local445[8] = local457 * local399 + 16384 >> 15;
				local445[3] = local469 * local399 + 16384 >> 15;
				local445[5] = -local422;
				local445[7] = local457 * local477 + local469 * local461 + 16384 >> 15;
				local445[1] = local461 * local477 + local469 * -local457 + 16384 >> 15;
				local445[2] = local461 * local399 + 16384 >> 15;
				@Pc(614) int local614 = local445[1] * -Static138.anInt9430 + -Static224.anInt4514 * local445[0] + -Static49.anInt1498 * local445[2] + 16384 >> 15;
				local639 = -Static138.anInt9430 * local445[4] + -Static224.anInt4514 * local445[3] + local445[5] * -Static49.anInt1498 + 16384 >> 15;
				local664 = -Static49.anInt1498 * local445[8] + -Static138.anInt9430 * local445[7] + local445[6] * -Static224.anInt4514 + 16384 >> 15;
				local669 = local614 + Static224.anInt4514;
				@Pc(673) int local673 = local639 + Static138.anInt9430;
				local677 = local664 + Static49.anInt1498;
				@Pc(680) int[] local680 = new int[9];
				for (local682 = 0; local682 < 3; local682++) {
					for (local686 = 0; local686 < 3; local686++) {
						local690 = 0;
						for (local692 = 0; local692 < 3; local692++) {
							local690 += arg7[local692 + local686 * 3] * local445[local692 + local682 * 3];
						}
						local680[local686 + local682 * 3] = local690 + 16384 >> 15;
					}
				}
				local686 = local54 * local445[1] + local252 * local445[0] + local60 * local445[2] + 16384 >> 15;
				local690 = local60 * local445[5] + local54 * local445[4] + local445[3] * local252 + 16384 >> 15;
				local686 += local669;
				local690 += local673;
				local692 = local445[8] * local60 + local445[6] * local252 + local54 * local445[7] + 16384 >> 15;
				local692 += local677;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local828 = 0; local828 < 3; local828++) {
						local832 = 0;
						for (local834 = 0; local834 < 3; local834++) {
							local832 += arg7[local834 + local824 * 3] * local680[local834 * 3 + local828];
						}
						local822[local824 * 3 + local828] = local832 + 16384 >> 15;
					}
				}
				local828 = local690 * arg7[1] + arg7[0] * local686 + arg7[2] * local692 + 16384 >> 15;
				local832 = arg7[3] * local686 + local690 * arg7[4] + arg7[5] * local692 + 16384 >> 15;
				local828 += local24;
				local834 = arg7[8] * local692 + local690 * arg7[7] + arg7[6] * local686 + 16384 >> 15;
				local832 += local32;
				local834 += local38;
				for (local961 = 0; local961 < local8; local961++) {
					@Pc(967) int local967 = arg1[local961];
					if (this.anIntArrayArray63.length > local967) {
						@Pc(981) int[] local981 = this.anIntArrayArray63[local967];
						for (@Pc(983) int local983 = 0; local983 < local981.length; local983++) {
							@Pc(989) int local989 = local981[local983];
							if (this.aShortArray131 == null || (this.aShortArray131[local989] & arg6) != 0) {
								@Pc(1033) int local1033 = local822[2] * this.anIntArray526[local989] + this.anIntArray528[local989] * local822[1] + this.anIntArray525[local989] * local822[0] + 16384 >> 15;
								@Pc(1064) int local1064 = local822[5] * this.anIntArray526[local989] + local822[3] * this.anIntArray525[local989] + local822[4] * this.anIntArray528[local989] + 16384 >> 15;
								@Pc(1068) int local1068 = local1033 + local828;
								@Pc(1100) int local1100 = this.anIntArray526[local989] * local822[8] + local822[6] * this.anIntArray525[local989] + local822[7] * this.anIntArray528[local989] + 16384 >> 15;
								@Pc(1104) int local1104 = local1064 + local832;
								this.anIntArray525[local989] = local1068;
								@Pc(1113) int local1113 = local1100 + local834;
								this.anIntArray528[local989] = local1104;
								this.anIntArray526[local989] = local1113;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2597) Class100 local2597;
			@Pc(2602) Class301 local2602;
			if (arg0 == 5) {
				if (this.anIntArrayArray61 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray61.length > local32) {
							local250 = this.anIntArrayArray61[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local54 = local250[local252];
								if (this.aShortArray129 == null || (arg6 & this.aShortArray129[local54]) != 0) {
									local60 = arg2 * 8 + (this.aByteArray84[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray84[local54] = (byte) local60;
									if (this.aClass188_8 != null) {
										this.aClass188_8.anInterface16_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass100Array1 != null) {
						for (local32 = 0; local32 < this.anInt7012; local32++) {
							local2597 = this.aClass100Array1[local32];
							local2602 = this.lb[local32];
							local2602.anInt8601 = local2602.anInt8601 & 0xFFFFFF | 255 - (this.aByteArray84[local2597.anInt3467] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2852) Class301 local2852;
				if (arg0 == 8) {
					if (this.anIntArrayArray62 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray62.length) {
								local250 = this.anIntArrayArray62[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2852 = this.lb[local250[local252]];
									local2852.anInt8604 += arg2;
									local2852.anInt8602 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray62 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray62.length) {
								local250 = this.anIntArrayArray62[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2852 = this.lb[local250[local252]];
									local2852.anInt8603 = arg3 * local2852.anInt8603 >> 7;
									local2852.anInt8600 = local2852.anInt8600 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray62 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray62.length) {
							local250 = this.anIntArrayArray62[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2852 = this.lb[local250[local252]];
								local2852.anInt8598 = local2852.anInt8598 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray61 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray61.length) {
						local250 = this.anIntArrayArray61[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray129 == null || (arg6 & this.aShortArray129[local54]) != 0) {
								local60 = this.aShortArray123[local54] & 0xFFFF;
								local377 = local60 >> 10 & 0x3F;
								local399 = local60 >> 7 & 0x7;
								local399 += arg3 / 4;
								local422 = local60 & 0x7F;
								@Pc(2710) int local2710 = local377 + arg2 & 0x3F;
								local422 += arg4;
								if (local399 < 0) {
									local399 = 0;
								} else if (local399 > 7) {
									local399 = 7;
								}
								if (local422 < 0) {
									local422 = 0;
								} else if (local422 > 127) {
									local422 = 127;
								}
								this.aShortArray123[local54] = (short) (local2710 << 10 | local399 << 7 | local422);
								if (this.aClass188_8 != null) {
									this.aClass188_8.anInterface16_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass100Array1 != null) {
					for (local32 = 0; local32 < this.anInt7012; local32++) {
						local2597 = this.aClass100Array1[local32];
						local2602 = this.lb[local32];
						local2602.anInt8601 = Static392.anIntArray516[this.aShortArray123[local2597.anInt3467] & 0xFFFF] & 0xFFFFFF | local2602.anInt8601 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray63.length) {
					local250 = this.anIntArrayArray63[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray131 == null || (this.aShortArray131[local54] & arg6) != 0) {
							this.anIntArray525[local54] -= Static224.anInt4514;
							this.anIntArray528[local54] -= Static138.anInt9430;
							this.anIntArray526[local54] -= Static49.anInt1498;
							this.anIntArray525[local54] = this.anIntArray525[local54] * arg2 >> 7;
							this.anIntArray528[local54] = this.anIntArray528[local54] * arg3 >> 7;
							this.anIntArray526[local54] = arg4 * this.anIntArray526[local54] >> 7;
							this.anIntArray525[local54] += Static224.anInt4514;
							this.anIntArray528[local54] += Static138.anInt9430;
							this.anIntArray526[local54] += Static49.anInt1498;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static479.aBoolean552) {
				local377 = arg7[0] * Static224.anInt4514 + Static138.anInt9430 * arg7[3] + arg7[6] * Static49.anInt1498 + 16384 >> 15;
				local399 = arg7[7] * Static49.anInt1498 + Static224.anInt4514 * arg7[1] + Static138.anInt9430 * arg7[4] + 16384 >> 15;
				local422 = Static49.anInt1498 * arg7[8] + Static138.anInt9430 * arg7[5] + arg7[2] * Static224.anInt4514 + 16384 >> 15;
				local377 += local252;
				local399 += local54;
				Static224.anInt4514 = local377;
				Static138.anInt9430 = local399;
				local422 += local60;
				Static49.anInt1498 = local422;
				Static479.aBoolean552 = false;
			}
			local377 = arg2 << 15 >> 7;
			local399 = arg3 << 15 >> 7;
			local422 = arg4 << 15 >> 7;
			local457 = local377 * -Static224.anInt4514 + 16384 >> 15;
			local461 = local399 * -Static138.anInt9430 + 16384 >> 15;
			local465 = -Static49.anInt1498 * local422 + 16384 >> 15;
			local469 = local457 + Static224.anInt4514;
			local477 = local461 + Static138.anInt9430;
			local485 = Static49.anInt1498 + local465;
			@Pc(1880) int[] local1880 = new int[] { local377 * arg7[0] + 16384 >> 15, local377 * arg7[3] + 16384 >> 15, local377 * arg7[6] + 16384 >> 15, arg7[1] * local399 + 16384 >> 15, arg7[4] * local399 + 16384 >> 15, arg7[7] * local399 + 16384 >> 15, local422 * arg7[2] + 16384 >> 15, arg7[5] * local422 + 16384 >> 15, local422 * arg7[8] + 16384 >> 15 };
			local639 = local252 * local377 + 16384 >> 15;
			local664 = local399 * local54 + 16384 >> 15;
			@Pc(2008) int local2008 = local639 + local469;
			@Pc(2012) int local2012 = local664 + local477;
			local669 = local422 * local60 + 16384 >> 15;
			@Pc(2024) int local2024 = local669 + local485;
			@Pc(2027) int[] local2027 = new int[9];
			@Pc(2033) int local2033;
			for (local677 = 0; local677 < 3; local677++) {
				for (local2033 = 0; local2033 < 3; local2033++) {
					local682 = 0;
					for (local686 = 0; local686 < 3; local686++) {
						local682 += local1880[local686 * 3 + local2033] * arg7[local677 * 3 + local686];
					}
					local2027[local677 * 3 + local2033] = local682 + 16384 >> 15;
				}
			}
			local2033 = local2024 * arg7[2] + local2008 * arg7[0] + arg7[1] * local2012 + 16384 >> 15;
			local682 = arg7[5] * local2024 + arg7[4] * local2012 + local2008 * arg7[3] + 16384 >> 15;
			local682 += local32;
			local686 = arg7[6] * local2008 + local2012 * arg7[7] + arg7[8] * local2024 + 16384 >> 15;
			local2033 += local24;
			local686 += local38;
			for (local690 = 0; local690 < local8; local690++) {
				local692 = arg1[local690];
				if (local692 < this.anIntArrayArray63.length) {
					local822 = this.anIntArrayArray63[local692];
					for (local824 = 0; local824 < local822.length; local824++) {
						local828 = local822[local824];
						if (this.aShortArray131 == null || (arg6 & this.aShortArray131[local828]) != 0) {
							local832 = local2027[2] * this.anIntArray526[local828] + this.anIntArray528[local828] * local2027[1] + this.anIntArray525[local828] * local2027[0] + 16384 >> 15;
							local834 = this.anIntArray526[local828] * local2027[5] + local2027[3] * this.anIntArray525[local828] + local2027[4] * this.anIntArray528[local828] + 16384 >> 15;
							local961 = local2027[8] * this.anIntArray526[local828] + local2027[7] * this.anIntArray528[local828] + local2027[6] * this.anIntArray525[local828] + 16384 >> 15;
							@Pc(2305) int local2305 = local832 + local2033;
							@Pc(2309) int local2309 = local834 + local682;
							this.anIntArray525[local828] = local2305;
							@Pc(2318) int local2318 = local961 + local686;
							this.anIntArray528[local828] = local2309;
							this.anIntArray526[local828] = local2318;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		if (this.aClass188_8 != null) {
			this.aClass188_8.anInterface16_1 = null;
		}
		this.aShort105 = (short) arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IJFLclient!fd;IIIIIF)S")
	private short method6034(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray529[arg6];
		@Pc(17) int local17 = this.anIntArray529[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray125[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static251.aLongArray4[local21] == arg1) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray125[local19] = (short) (this.anInt7020 + 1);
		Static251.aLongArray4[local19] = arg1;
		this.aShortArray127[this.anInt7020] = (short) arg4;
		this.aShortArray126[this.anInt7020] = (short) arg0;
		this.aShortArray130[this.anInt7020] = (short) arg7;
		this.aByteArray85[this.anInt7020] = (byte) arg5;
		this.aFloatArray58[this.anInt7020] = arg8;
		this.aFloatArray57[this.anInt7020] = arg2;
		return (short) this.anInt7020++;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	private void method6035() {
		if (this.aClass100Array1 == null) {
			return;
		}
		@Pc(8) Class22_Sub2 local8 = this.aClass9_Sub3_34.aClass22_Sub2_2;
		@Pc(12) float local12 = this.aClass9_Sub3_34.ra();
		@Pc(16) float local16 = this.aClass9_Sub3_34.P();
		this.aClass9_Sub3_34.method6724();
		this.aClass9_Sub3_34.method7589(false);
		this.aClass9_Sub3_34.method6733(false);
		this.aClass9_Sub3_34.method6713(this.aClass9_Sub3_34.aClass188_16, this.aClass9_Sub3_34.aClass188_15, null, null);
		for (@Pc(43) int local43 = 0; local43 < this.anInt7012; local43++) {
			@Pc(50) Class100 local50 = this.aClass100Array1[local43];
			@Pc(55) Class301 local55 = this.lb[local43];
			if (!local50.aBoolean211 || !this.aClass9_Sub3_34.method7591()) {
				@Pc(84) float local84 = (float) (this.anIntArray525[local50.anInt3468] + this.anIntArray525[local50.anInt3472] + this.anIntArray525[local50.anInt3466]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray528[local50.anInt3466] + this.anIntArray528[local50.anInt3468] + this.anIntArray528[local50.anInt3472]) * 0.3333333F;
				@Pc(127) float local127 = (float) (this.anIntArray526[local50.anInt3466] + this.anIntArray526[local50.anInt3468] + this.anIntArray526[local50.anInt3472]) * 0.3333333F;
				@Pc(141) float local141 = local106 * Static85.aFloat73 + Static87.aFloat120 * local84 + local127 * Static42.aFloat54 + Static183.aFloat87;
				@Pc(155) float local155 = Static58.aFloat59 + Static139.aFloat80 * local127 + local84 * Static15.aFloat46 + local106 * Static14.aFloat45;
				@Pc(169) float local169 = Static156.aFloat81 + Static323.aFloat118 * local127 + Static544.aFloat205 * local84 + Static310.aFloat113 * local106;
				local8.method1964((float) local55.anInt8604 + local141, -local169, local55.anInt8600 * local50.aShort57 >> 7, local50.aShort56 * local55.anInt8603 >> 7, local55.anInt8598, (float) local55.anInt8602 - local155);
				this.aClass9_Sub3_34.method6689(local8);
				this.aClass9_Sub3_34.la(local16, local12 - (float) local50.anInt3469 * 1.5F);
				@Pc(219) int local219 = local55.anInt8601;
				OpenGL.glColor4ub((byte) (local219 >> 16), (byte) (local219 >> 8), (byte) local219, (byte) (local219 >> 24));
				this.aClass9_Sub3_34.method6672(local50.aShort55);
				this.aClass9_Sub3_34.method6654(local50.aByte25);
				this.aClass9_Sub3_34.method6670(local50.aByte26);
				this.aClass9_Sub3_34.method6700(4);
			}
		}
		this.aClass9_Sub3_34.la(local16, local12);
		this.aClass9_Sub3_34.method7589(true);
		this.aClass9_Sub3_34.method6715();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7002; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray528[local15] + local13 * this.anIntArray525[local15] >> 15;
			this.anIntArray528[local15] = local13 * this.anIntArray528[local15] - this.anIntArray525[local15] * local9 >> 15;
			this.anIntArray525[local15] = local34;
		}
		this.aBoolean465 = false;
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
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
			Static49.anInt1498 = 0;
			local26 = 0;
			Static224.anInt4514 = 0;
			Static138.anInt9430 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray63.length > local38) {
					local48 = this.anIntArrayArray63[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static224.anInt4514 += this.anIntArray525[local56];
						Static138.anInt9430 += this.anIntArray528[local56];
						local26++;
						Static49.anInt1498 += this.anIntArray526[local56];
					}
				}
			}
			if (local26 > 0) {
				Static138.anInt9430 = Static138.anInt9430 / local26 + local18;
				Static224.anInt4514 = Static224.anInt4514 / local26 + local22;
				Static49.anInt1498 = Static49.anInt1498 / local26 + local14;
			} else {
				Static138.anInt9430 = local18;
				Static224.anInt4514 = local22;
				Static49.anInt1498 = local14;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local18 = arg3 << 4;
			local14 = arg4 << 4;
			local22 = arg2 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray63.length > local32) {
					local162 = this.anIntArrayArray63[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local50 = local162[local164];
						this.anIntArray525[local50] += local22;
						this.anIntArray528[local50] += local18;
						this.anIntArray526[local50] += local14;
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(306) int local306;
		@Pc(759) int local759;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray63.length) {
					local162 = this.anIntArrayArray63[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local50 = local162[local164];
							this.anIntArray525[local50] -= Static224.anInt4514;
							this.anIntArray528[local50] -= Static138.anInt9430;
							this.anIntArray526[local50] -= Static49.anInt1498;
							if (arg4 != 0) {
								local56 = Class307.anIntArray744[arg4];
								local287 = Class307.anIntArray743[arg4];
								local306 = local287 * this.anIntArray525[local50] + local56 * this.anIntArray528[local50] + 32767 >> 15;
								this.anIntArray528[local50] = this.anIntArray528[local50] * local287 + 32767 - this.anIntArray525[local50] * local56 >> 15;
								this.anIntArray525[local50] = local306;
							}
							if (arg2 != 0) {
								local56 = Class307.anIntArray744[arg2];
								local287 = Class307.anIntArray743[arg2];
								local306 = this.anIntArray528[local50] * local287 + 32767 - local56 * this.anIntArray526[local50] >> 15;
								this.anIntArray526[local50] = local56 * this.anIntArray528[local50] + local287 * this.anIntArray526[local50] + 32767 >> 15;
								this.anIntArray528[local50] = local306;
							}
							if (arg3 != 0) {
								local56 = Class307.anIntArray744[arg3];
								local287 = Class307.anIntArray743[arg3];
								local306 = this.anIntArray525[local50] * local287 + this.anIntArray526[local50] * local56 + 32767 >> 15;
								this.anIntArray526[local50] = this.anIntArray526[local50] * local287 + 32767 - local56 * this.anIntArray525[local50] >> 15;
								this.anIntArray525[local50] = local306;
							}
							this.anIntArray525[local50] += Static224.anInt4514;
							this.anIntArray528[local50] += Static138.anInt9430;
							this.anIntArray526[local50] += Static49.anInt1498;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local50 = local162[local164];
							this.anIntArray525[local50] -= Static224.anInt4514;
							this.anIntArray528[local50] -= Static138.anInt9430;
							this.anIntArray526[local50] -= Static49.anInt1498;
							if (arg2 != 0) {
								local56 = Class307.anIntArray744[arg2];
								local287 = Class307.anIntArray743[arg2];
								local306 = this.anIntArray528[local50] * local287 + 32767 - local56 * this.anIntArray526[local50] >> 15;
								this.anIntArray526[local50] = local56 * this.anIntArray528[local50] + local287 * this.anIntArray526[local50] + 32767 >> 15;
								this.anIntArray528[local50] = local306;
							}
							if (arg4 != 0) {
								local56 = Class307.anIntArray744[arg4];
								local287 = Class307.anIntArray743[arg4];
								local306 = this.anIntArray528[local50] * local56 + this.anIntArray525[local50] * local287 + 32767 >> 15;
								this.anIntArray528[local50] = this.anIntArray528[local50] * local287 + 32767 - this.anIntArray525[local50] * local56 >> 15;
								this.anIntArray525[local50] = local306;
							}
							if (arg3 != 0) {
								local56 = Class307.anIntArray744[arg3];
								local287 = Class307.anIntArray743[arg3];
								local306 = local56 * this.anIntArray526[local50] + this.anIntArray525[local50] * local287 + 32767 >> 15;
								this.anIntArray526[local50] = local287 * this.anIntArray526[local50] + 32767 - this.anIntArray525[local50] * local56 >> 15;
								this.anIntArray525[local50] = local306;
							}
							this.anIntArray525[local50] += Static224.anInt4514;
							this.anIntArray528[local50] += Static138.anInt9430;
							this.anIntArray526[local50] += Static49.anInt1498;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray63.length > local38) {
						local48 = this.anIntArrayArray63[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local287 = this.anIntArray529[local56];
							local306 = this.anIntArray529[local56 + 1];
							for (local759 = local287; local759 < local306; local759++) {
								@Pc(768) int local768 = this.aShortArray125[local759] - 1;
								if (local768 == -1) {
									break;
								}
								@Pc(781) int local781;
								@Pc(785) int local785;
								@Pc(803) int local803;
								if (arg4 != 0) {
									local781 = Class307.anIntArray744[arg4];
									local785 = Class307.anIntArray743[arg4];
									local803 = this.aShortArray127[local768] * local785 + local781 * this.aShortArray126[local768] + 32767 >> 15;
									this.aShortArray126[local768] = (short) (local785 * this.aShortArray126[local768] + 32767 - this.aShortArray127[local768] * local781 >> 15);
									this.aShortArray127[local768] = (short) local803;
								}
								if (arg2 != 0) {
									local781 = Class307.anIntArray744[arg2];
									local785 = Class307.anIntArray743[arg2];
									local803 = local785 * this.aShortArray126[local768] + 32767 - this.aShortArray130[local768] * local781 >> 15;
									this.aShortArray130[local768] = (short) (this.aShortArray126[local768] * local781 + local785 * this.aShortArray130[local768] + 32767 >> 15);
									this.aShortArray126[local768] = (short) local803;
								}
								if (arg3 != 0) {
									local781 = Class307.anIntArray744[arg3];
									local785 = Class307.anIntArray743[arg3];
									local803 = this.aShortArray130[local768] * local781 + local785 * this.aShortArray127[local768] + 32767 >> 15;
									this.aShortArray130[local768] = (short) (local785 * this.aShortArray130[local768] + 32767 - local781 * this.aShortArray127[local768] >> 15);
									this.aShortArray127[local768] = (short) local803;
								}
							}
						}
					}
				}
				if (this.aClass188_7 == null && this.aClass188_8 != null) {
					this.aClass188_8.anInterface16_1 = null;
				}
				if (this.aClass188_7 != null) {
					this.aClass188_7.anInterface16_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray63.length) {
					local162 = this.anIntArrayArray63[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local50 = local162[local164];
						this.anIntArray525[local50] -= Static224.anInt4514;
						this.anIntArray528[local50] -= Static138.anInt9430;
						this.anIntArray526[local50] -= Static49.anInt1498;
						this.anIntArray525[local50] = this.anIntArray525[local50] * arg2 >> 7;
						this.anIntArray528[local50] = this.anIntArray528[local50] * arg3 >> 7;
						this.anIntArray526[local50] = arg4 * this.anIntArray526[local50] >> 7;
						this.anIntArray525[local50] += Static224.anInt4514;
						this.anIntArray528[local50] += Static138.anInt9430;
						this.anIntArray526[local50] += Static49.anInt1498;
					}
				}
			}
		} else {
			@Pc(1225) Class100 local1225;
			@Pc(1230) Class301 local1230;
			if (arg0 == 5) {
				if (this.anIntArrayArray61 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray61.length > local32) {
							local162 = this.anIntArrayArray61[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local50 = local162[local164];
								local56 = arg2 * 8 + (this.aByteArray84[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray84[local50] = (byte) local56;
							}
							if (local162.length > 0 && this.aClass188_8 != null) {
								this.aClass188_8.anInterface16_1 = null;
							}
						}
					}
					if (this.aClass100Array1 != null) {
						for (local32 = 0; local32 < this.anInt7012; local32++) {
							local1225 = this.aClass100Array1[local32];
							local1230 = this.lb[local32];
							local1230.anInt8601 = 255 - (this.aByteArray84[local1225.anInt3467] & 0xFF) << 24 | local1230.anInt8601 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1482) Class301 local1482;
				if (arg0 == 8) {
					if (this.anIntArrayArray62 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray62.length) {
								local162 = this.anIntArrayArray62[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1482 = this.lb[local162[local164]];
									local1482.anInt8604 += arg2;
									local1482.anInt8602 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray62 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray62.length) {
								local162 = this.anIntArrayArray62[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1482 = this.lb[local162[local164]];
									local1482.anInt8600 = local1482.anInt8600 * arg2 >> 7;
									local1482.anInt8603 = local1482.anInt8603 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray62 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray62.length) {
							local162 = this.anIntArrayArray62[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1482 = this.lb[local162[local164]];
								local1482.anInt8598 = arg2 + local1482.anInt8598 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray61 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray61.length) {
						local162 = this.anIntArrayArray61[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local50 = local162[local164];
							local56 = this.aShortArray123[local50] & 0xFFFF;
							local287 = local56 >> 10 & 0x3F;
							local306 = local56 >> 7 & 0x7;
							local306 += arg3 / 4;
							@Pc(1324) int local1324 = arg2 + local287 & 0x3F;
							local759 = local56 & 0x7F;
							if (local306 < 0) {
								local306 = 0;
							} else if (local306 > 7) {
								local306 = 7;
							}
							local759 += arg4;
							if (local759 < 0) {
								local759 = 0;
							} else if (local759 > 127) {
								local759 = 127;
							}
							this.aShortArray123[local50] = (short) (local306 << 7 | local1324 << 10 | local759);
						}
						if (local162.length > 0 && this.aClass188_8 != null) {
							this.aClass188_8.anInterface16_1 = null;
						}
					}
				}
				if (this.aClass100Array1 != null) {
					for (local32 = 0; local32 < this.anInt7012; local32++) {
						local1225 = this.aClass100Array1[local32];
						local1230 = this.lb[local32];
						local1230.anInt8601 = local1230.anInt8601 & 0xFF000000 | Static392.anIntArray516[this.aShortArray123[local1225.anInt3467] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean465) {
			this.method6041();
		}
		return this.aShort106;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class22_Sub2 local8 = (Class22_Sub2) arg2;
		@Pc(12) Class22_Sub2 local12 = this.aClass9_Sub3_34.aClass22_Sub2_4;
		@Pc(33) float local33 = local12.aFloat67 + local8.aFloat61 * local12.aFloat63 + local8.aFloat60 * local12.aFloat64 + local12.aFloat71 * local8.aFloat67;
		@Pc(54) float local54 = local8.aFloat67 * local12.aFloat68 + local8.aFloat60 * local12.aFloat65 + local8.aFloat61 * local12.aFloat66 + local12.aFloat60;
		Static87.aFloat120 = local12.aFloat71 * local8.aFloat71 + local8.aFloat68 * local12.aFloat64 + local8.aFloat62 * local12.aFloat63;
		Static323.aFloat118 = local8.aFloat69 * local12.aFloat69 + local8.aFloat63 * local12.aFloat62 + local8.aFloat66 * local12.aFloat70;
		Static42.aFloat54 = local12.aFloat63 * local8.aFloat69 + local12.aFloat71 * local8.aFloat63 + local8.aFloat66 * local12.aFloat64;
		Static14.aFloat45 = local8.aFloat64 * local12.aFloat68 + local8.aFloat65 * local12.aFloat65 + local8.aFloat70 * local12.aFloat66;
		Static85.aFloat73 = local8.aFloat65 * local12.aFloat64 + local8.aFloat64 * local12.aFloat71 + local12.aFloat63 * local8.aFloat70;
		@Pc(165) float local165 = local8.aFloat61 * local12.aFloat69 + local8.aFloat67 * local12.aFloat62 + local8.aFloat60 * local12.aFloat70 + local12.aFloat61;
		Static544.aFloat205 = local12.aFloat70 * local8.aFloat68 + local12.aFloat62 * local8.aFloat71 + local8.aFloat62 * local12.aFloat69;
		Static15.aFloat46 = local8.aFloat68 * local12.aFloat65 + local8.aFloat71 * local12.aFloat68 + local12.aFloat66 * local8.aFloat62;
		Static139.aFloat80 = local8.aFloat69 * local12.aFloat66 + local12.aFloat68 * local8.aFloat63 + local8.aFloat66 * local12.aFloat65;
		Static310.aFloat113 = local12.aFloat69 * local8.aFloat70 + local12.aFloat70 * local8.aFloat65 + local12.aFloat62 * local8.aFloat64;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass9_Sub3_34.anInt7893;
		@Pc(255) int local255 = this.aClass9_Sub3_34.anInt7911;
		if (!this.aBoolean465) {
			this.method6041();
		}
		Static360.anIntArray784[0] = this.aShort109;
		Static15.anIntArray33[0] = this.aShort101;
		Static360.anIntArray784[1] = this.aShort104;
		Static449.anIntArray595[0] = this.aShort107;
		Static15.anIntArray33[1] = this.aShort101;
		Static360.anIntArray784[2] = this.aShort109;
		Static449.anIntArray595[1] = this.aShort107;
		Static15.anIntArray33[2] = this.aShort108;
		Static449.anIntArray595[2] = this.aShort107;
		Static360.anIntArray784[3] = this.aShort104;
		Static15.anIntArray33[3] = this.aShort108;
		Static360.anIntArray784[4] = this.aShort109;
		Static449.anIntArray595[3] = this.aShort107;
		Static15.anIntArray33[4] = this.aShort101;
		Static449.anIntArray595[4] = this.aShort106;
		Static360.anIntArray784[5] = this.aShort104;
		Static15.anIntArray33[5] = this.aShort101;
		Static360.anIntArray784[6] = this.aShort109;
		Static449.anIntArray595[5] = this.aShort106;
		Static15.anIntArray33[6] = this.aShort108;
		Static360.anIntArray784[7] = this.aShort104;
		Static449.anIntArray595[6] = this.aShort106;
		Static15.anIntArray33[7] = this.aShort108;
		Static449.anIntArray595[7] = this.aShort106;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static360.anIntArray784[local383];
			local395 = Static449.anIntArray595[local383];
			local400 = Static15.anIntArray33[local383];
			local414 = local33 + Static42.aFloat54 * local395 + Static85.aFloat73 * local400 + local390 * Static87.aFloat120;
			local428 = Static14.aFloat45 * local400 + Static15.aFloat46 * local390 + local395 * Static139.aFloat80 + local54;
			local442 = local165 + Static323.aFloat118 * local395 + Static310.aFloat113 * local400 + local390 * Static544.aFloat205;
			if (local442 >= (float) this.aClass9_Sub3_34.anInt7898) {
				@Pc(461) float local461 = (float) local251 * local414 / local442 + (float) this.aClass9_Sub3_34.anInt7917;
				@Pc(473) float local473 = (float) local255 * local428 / local442 + (float) this.aClass9_Sub3_34.anInt7909;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				if (local473 > local247) {
					local247 = local473;
				}
				if (local473 < local245) {
					local245 = local473;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.aClass9_Sub3_34.anIntArray617.length < this.anInt7020) {
				this.aClass9_Sub3_34.anIntArray617 = new int[this.anInt7020];
				this.aClass9_Sub3_34.anIntArray619 = new int[this.anInt7020];
			}
			@Pc(558) int[] local558 = this.aClass9_Sub3_34.anIntArray617;
			@Pc(562) int[] local562 = this.aClass9_Sub3_34.anIntArray619;
			@Pc(638) int local638;
			for (@Pc(564) int local564 = 0; local564 < this.anInt7002; local564++) {
				local390 = this.anIntArray525[local564];
				local400 = this.anIntArray528[local564];
				local395 = this.anIntArray526[local564];
				local428 = local54 + local390 * Static15.aFloat46 + local400 * Static14.aFloat45 + Static139.aFloat80 * local395;
				local414 = local395 * Static42.aFloat54 + Static87.aFloat120 * local390 + local400 * Static85.aFloat73 + local33;
				local442 = local165 + local395 * Static323.aFloat118 + Static544.aFloat205 * local390 + Static310.aFloat113 * local400;
				@Pc(645) int local645;
				@Pc(647) int local647;
				@Pc(656) int local656;
				if ((float) this.aClass9_Sub3_34.anInt7898 <= local442) {
					local638 = (int) ((float) local251 * local414 / local442 + (float) this.aClass9_Sub3_34.anInt7917);
					local645 = (int) ((float) this.aClass9_Sub3_34.anInt7909 + local428 * (float) local255 / local442);
					local647 = this.anIntArray529[local564];
					local656 = this.anIntArray529[local564 + 1];
					for (@Pc(714) int local714 = local647; local714 < local656; local714++) {
						@Pc(723) int local723 = this.aShortArray125[local714] - 1;
						if (local723 == -1) {
							break;
						}
						local558[local723] = local638;
						local562[local723] = local645;
					}
				} else {
					local638 = this.anIntArray529[local564];
					local645 = this.anIntArray529[local564 + 1];
					for (local647 = local638; local647 < local645; local647++) {
						local656 = this.aShortArray125[local647] - 1;
						if (local656 == -1) {
							break;
						}
						local558[this.aShortArray125[local647] - 1] = -999999;
					}
				}
			}
			for (local638 = 0; local638 < this.anInt7014; local638++) {
				if (local558[this.aShortArray128[local638]] != -999999 && local558[this.aShortArray133[local638]] != -999999 && local558[this.aShortArray132[local638]] != -999999 && this.method6037(local558[this.aShortArray132[local638]], arg1, local562[this.aShortArray132[local638]], local562[this.aShortArray133[local638]], local562[this.aShortArray128[local638]], local558[this.aShortArray128[local638]], arg0, local558[this.aShortArray133[local638]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray63 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7043; local12++) {
			this.anIntArray525[local12] <<= 0x4;
			this.anIntArray528[local12] <<= 0x4;
			this.anIntArray526[local12] <<= 0x4;
		}
		Static224.anInt4514 = 0;
		Static49.anInt1498 = 0;
		Static138.anInt9430 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qu", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt7032;
	}

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static224.anInt4514 = 0;
			Static138.anInt9430 = 0;
			Static49.anInt1498 = 0;
			for (local17 = 0; local17 < this.anInt7002; local17++) {
				Static224.anInt4514 += this.anIntArray525[local17];
				Static138.anInt9430 += this.anIntArray528[local17];
				local9++;
				Static49.anInt1498 += this.anIntArray526[local17];
			}
			if (local9 <= 0) {
				Static49.anInt1498 = arg3;
				Static224.anInt4514 = arg1;
				Static138.anInt9430 = arg2;
			} else {
				Static138.anInt9430 = arg2 + Static138.anInt9430 / local9;
				Static224.anInt4514 = arg1 + Static224.anInt4514 / local9;
				Static49.anInt1498 = arg3 + Static49.anInt1498 / local9;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt7002; local9++) {
				this.anIntArray525[local9] += arg1;
				this.anIntArray528[local9] += arg2;
				this.anIntArray526[local9] += arg3;
			}
		} else {
			@Pc(156) int local156;
			@Pc(174) int local174;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt7002; local9++) {
					this.anIntArray525[local9] -= Static224.anInt4514;
					this.anIntArray528[local9] -= Static138.anInt9430;
					this.anIntArray526[local9] -= Static49.anInt1498;
					if (arg3 != 0) {
						local17 = Class307.anIntArray744[arg3];
						local156 = Class307.anIntArray743[arg3];
						local174 = local156 * this.anIntArray525[local9] + this.anIntArray528[local9] * local17 + 32767 >> 15;
						this.anIntArray528[local9] = local156 * this.anIntArray528[local9] + 32767 - local17 * this.anIntArray525[local9] >> 15;
						this.anIntArray525[local9] = local174;
					}
					if (arg1 != 0) {
						local17 = Class307.anIntArray744[arg1];
						local156 = Class307.anIntArray743[arg1];
						local174 = this.anIntArray528[local9] * local156 + 32767 - local17 * this.anIntArray526[local9] >> 15;
						this.anIntArray526[local9] = local156 * this.anIntArray526[local9] + this.anIntArray528[local9] * local17 + 32767 >> 15;
						this.anIntArray528[local9] = local174;
					}
					if (arg2 != 0) {
						local17 = Class307.anIntArray744[arg2];
						local156 = Class307.anIntArray743[arg2];
						local174 = this.anIntArray525[local9] * local156 + this.anIntArray526[local9] * local17 + 32767 >> 15;
						this.anIntArray526[local9] = local156 * this.anIntArray526[local9] + 32767 - local17 * this.anIntArray525[local9] >> 15;
						this.anIntArray525[local9] = local174;
					}
					this.anIntArray525[local9] += Static224.anInt4514;
					this.anIntArray528[local9] += Static138.anInt9430;
					this.anIntArray526[local9] += Static49.anInt1498;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt7002; local9++) {
					this.anIntArray525[local9] -= Static224.anInt4514;
					this.anIntArray528[local9] -= Static138.anInt9430;
					this.anIntArray526[local9] -= Static49.anInt1498;
					this.anIntArray525[local9] = this.anIntArray525[local9] * arg1 / 128;
					this.anIntArray528[local9] = this.anIntArray528[local9] * arg2 / 128;
					this.anIntArray526[local9] = this.anIntArray526[local9] * arg3 / 128;
					this.anIntArray525[local9] += Static224.anInt4514;
					this.anIntArray528[local9] += Static138.anInt9430;
					this.anIntArray526[local9] += Static49.anInt1498;
				}
			} else {
				@Pc(506) Class100 local506;
				@Pc(511) Class301 local511;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt7014; local9++) {
						local17 = arg1 * 8 + (this.aByteArray84[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray84[local9] = (byte) local17;
					}
					if (this.aClass188_8 != null) {
						this.aClass188_8.anInterface16_1 = null;
					}
					if (this.aClass100Array1 != null) {
						for (local17 = 0; local17 < this.anInt7012; local17++) {
							local506 = this.aClass100Array1[local17];
							local511 = this.lb[local17];
							local511.anInt8601 = local511.anInt8601 & 0xFFFFFF | 255 - (this.aByteArray84[local506.anInt3467] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt7014; local9++) {
						local17 = this.aShortArray123[local9] & 0xFFFF;
						local156 = local17 >> 10 & 0x3F;
						local174 = local17 >> 7 & 0x7;
						@Pc(570) int local570 = local156 + arg1 & 0x3F;
						@Pc(574) int local574 = local17 & 0x7F;
						local174 += arg2 / 4;
						if (local174 < 0) {
							local174 = 0;
						} else if (local174 > 7) {
							local174 = 7;
						}
						local574 += arg3;
						if (local574 < 0) {
							local574 = 0;
						} else if (local574 > 127) {
							local574 = 127;
						}
						this.aShortArray123[local9] = (short) (local570 << 10 | local174 << 7 | local574);
					}
					if (this.aClass188_8 != null) {
						this.aClass188_8.anInterface16_1 = null;
					}
					if (this.aClass100Array1 != null) {
						for (local17 = 0; local17 < this.anInt7012; local17++) {
							local506 = this.aClass100Array1[local17];
							local511 = this.lb[local17];
							local511.anInt8601 = Static392.anIntArray516[this.aShortArray123[local506.anInt3467] & 0xFFFF] & 0xFFFFFF | local511.anInt8601 & 0xFF000000;
						}
					}
				} else {
					@Pc(698) Class301 local698;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt7012; local9++) {
							local698 = this.lb[local9];
							local698.anInt8604 += arg1;
							local698.anInt8602 += arg2;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt7012; local9++) {
							local698 = this.lb[local9];
							local698.anInt8600 = arg1 * local698.anInt8600 >> 7;
							local698.anInt8603 = arg2 * local698.anInt8603 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt7012; local9++) {
							local698 = this.lb[local9];
							local698.anInt8598 = arg1 + local698.anInt8598 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7043; local7++) {
			this.anIntArray525[local7] = this.anIntArray525[local7] + 7 >> 4;
			this.anIntArray528[local7] = this.anIntArray528[local7] + 7 >> 4;
			this.anIntArray526[local7] = this.anIntArray526[local7] + 7 >> 4;
		}
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg4 && arg1 < arg3 && arg1 < arg2) {
			return false;
		} else if (arg4 < arg1 && arg3 < arg1 && arg2 < arg1) {
			return false;
		} else if (arg6 < arg5 && arg7 > arg6 && arg0 > arg6) {
			return false;
		} else {
			return arg5 >= arg6 || arg7 >= arg6 || arg6 <= arg0;
		}
	}

	@OriginalMember(owner = "client!qu", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7002; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray526[local15] + local13 * this.anIntArray525[local15] >> 15;
			this.anIntArray526[local15] = this.anIntArray526[local15] * local13 - local9 * this.anIntArray525[local15] >> 15;
			this.anIntArray525[local15] = local34;
		}
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "()Z")
	@Override
	public boolean method7256() {
		if (this.aShortArray124 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray124.length; local12++) {
			if (this.aShortArray124[local12] != -1 && !this.aClass9_Sub3_34.anInterface8_13.method7084(this.aShortArray124[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!qu;Lclient!qu;ZZIB)Lclient!r;")
	private Class19 method6039(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class19_Sub3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		arg0.aShort105 = this.aShort105;
		arg0.aByte85 = 0;
		arg0.anInt7032 = arg4;
		arg0.anInt7014 = this.anInt7014;
		arg0.anInt7002 = this.anInt7002;
		arg0.anInt7043 = this.anInt7043;
		arg0.anInt7047 = this.anInt7047;
		arg0.anInt7020 = this.anInt7020;
		arg0.anInt7012 = this.anInt7012;
		arg0.aShort102 = this.aShort102;
		arg0.anInt7038 = this.anInt7038;
		@Pc(59) boolean local59 = Static400.method6038(this.anInt7047, arg4);
		@Pc(65) boolean local65 = Static477.method6910(this.anInt7047, arg4);
		@Pc(71) boolean local71 = Static116.method2634(arg4, this.anInt7047);
		@Pc(77) boolean local77 = local65 | local59 | local71;
		@Pc(192) int local192;
		if (local77) {
			if (!local59) {
				arg0.anIntArray525 = this.anIntArray525;
			} else if (arg1.anIntArray525 == null || this.anInt7043 > arg1.anIntArray525.length) {
				arg0.anIntArray525 = arg1.anIntArray525 = new int[this.anInt7043];
			} else {
				arg0.anIntArray525 = arg1.anIntArray525;
			}
			if (!local65) {
				arg0.anIntArray528 = this.anIntArray528;
			} else if (arg1.anIntArray528 == null || this.anInt7043 > arg1.anIntArray528.length) {
				arg0.anIntArray528 = arg1.anIntArray528 = new int[this.anInt7043];
			} else {
				arg0.anIntArray528 = arg1.anIntArray528;
			}
			if (!local71) {
				arg0.anIntArray526 = this.anIntArray526;
			} else if (arg1.anIntArray526 == null || arg1.anIntArray526.length < this.anInt7043) {
				arg0.anIntArray526 = arg1.anIntArray526 = new int[this.anInt7043];
			} else {
				arg0.anIntArray526 = arg1.anIntArray526;
			}
			for (local192 = 0; local192 < this.anInt7043; local192++) {
				if (local59) {
					arg0.anIntArray525[local192] = this.anIntArray525[local192];
				}
				if (local65) {
					arg0.anIntArray528[local192] = this.anIntArray528[local192];
				}
				if (local71) {
					arg0.anIntArray526[local192] = this.anIntArray526[local192];
				}
			}
		} else {
			arg0.anIntArray526 = this.anIntArray526;
			arg0.anIntArray525 = this.anIntArray525;
			arg0.anIntArray528 = this.anIntArray528;
		}
		if (Static90.method2166(this.anInt7047, arg4)) {
			arg0.aClass188_10 = arg1.aClass188_10;
			if (arg3) {
				arg0.aByte85 = (byte) (arg0.aByte85 | 0x1);
			}
			arg0.aClass188_10.aByte65 = this.aClass188_10.aByte65;
			arg0.aClass188_10.anInterface16_1 = this.aClass188_10.anInterface16_1;
		} else if (Static44.method1398(this.anInt7047, arg4)) {
			arg0.aClass188_10 = this.aClass188_10;
		} else {
			arg0.aClass188_10 = null;
		}
		if (Static518.method7376(this.anInt7047, arg4)) {
			if (arg1.aShortArray123 == null || this.anInt7014 > arg1.aShortArray123.length) {
				arg0.aShortArray123 = arg1.aShortArray123 = new short[this.anInt7014];
			} else {
				arg0.aShortArray123 = arg1.aShortArray123;
			}
			for (local192 = 0; local192 < this.anInt7014; local192++) {
				arg0.aShortArray123[local192] = this.aShortArray123[local192];
			}
		} else {
			arg0.aShortArray123 = this.aShortArray123;
		}
		if (Static496.method7130(this.anInt7047, arg4)) {
			if (arg1.aByteArray84 == null || this.anInt7014 > arg1.aByteArray84.length) {
				arg0.aByteArray84 = arg1.aByteArray84 = new byte[this.anInt7014];
			} else {
				arg0.aByteArray84 = arg1.aByteArray84;
			}
			for (local192 = 0; local192 < this.anInt7014; local192++) {
				arg0.aByteArray84[local192] = this.aByteArray84[local192];
			}
		} else {
			arg0.aByteArray84 = this.aByteArray84;
		}
		if (Static50.method7746(arg4, this.anInt7047)) {
			arg0.aClass188_8 = arg1.aClass188_8;
			if (arg3) {
				arg0.aByte85 = (byte) (arg0.aByte85 | 0x2);
			}
			arg0.aClass188_8.aByte65 = this.aClass188_8.aByte65;
			arg0.aClass188_8.anInterface16_1 = this.aClass188_8.anInterface16_1;
		} else if (Static402.method7872(this.anInt7047, arg4)) {
			arg0.aClass188_8 = this.aClass188_8;
		} else {
			arg0.aClass188_8 = null;
		}
		@Pc(549) int local549;
		if (Static422.method6288(this.anInt7047, arg4)) {
			if (arg1.aShortArray127 == null || arg1.aShortArray127.length < this.anInt7020) {
				local192 = this.anInt7020;
				arg0.aShortArray126 = arg1.aShortArray126 = new short[local192];
				arg0.aShortArray130 = arg1.aShortArray130 = new short[local192];
				arg0.aShortArray127 = arg1.aShortArray127 = new short[local192];
			} else {
				arg0.aShortArray127 = arg1.aShortArray127;
				arg0.aShortArray130 = arg1.aShortArray130;
				arg0.aShortArray126 = arg1.aShortArray126;
			}
			if (this.aClass148_1 == null) {
				for (local192 = 0; local192 < this.anInt7020; local192++) {
					arg0.aShortArray127[local192] = this.aShortArray127[local192];
					arg0.aShortArray126[local192] = this.aShortArray126[local192];
					arg0.aShortArray130[local192] = this.aShortArray130[local192];
				}
			} else {
				if (arg1.aClass148_1 == null) {
					arg1.aClass148_1 = new Class148();
				}
				@Pc(533) Class148 local533 = arg0.aClass148_1 = arg1.aClass148_1;
				if (local533.aShortArray72 == null || local533.aShortArray72.length < this.anInt7020) {
					local549 = this.anInt7020;
					local533.aByteArray65 = new byte[local549];
					local533.aShortArray72 = new short[local549];
					local533.aShortArray71 = new short[local549];
					local533.aShortArray73 = new short[local549];
				}
				for (local549 = 0; local549 < this.anInt7020; local549++) {
					arg0.aShortArray127[local549] = this.aShortArray127[local549];
					arg0.aShortArray126[local549] = this.aShortArray126[local549];
					arg0.aShortArray130[local549] = this.aShortArray130[local549];
					local533.aShortArray72[local549] = this.aClass148_1.aShortArray72[local549];
					local533.aShortArray71[local549] = this.aClass148_1.aShortArray71[local549];
					local533.aShortArray73[local549] = this.aClass148_1.aShortArray73[local549];
					local533.aByteArray65[local549] = this.aClass148_1.aByteArray65[local549];
				}
			}
			arg0.aByteArray85 = this.aByteArray85;
		} else {
			arg0.aByteArray85 = this.aByteArray85;
			arg0.aShortArray127 = this.aShortArray127;
			arg0.aShortArray130 = this.aShortArray130;
			arg0.aClass148_1 = this.aClass148_1;
			arg0.aShortArray126 = this.aShortArray126;
		}
		if (Static218.method3891(arg4, this.anInt7047)) {
			if (arg3) {
				arg0.aByte85 = (byte) (arg0.aByte85 | 0x4);
			}
			arg0.aClass188_7 = arg1.aClass188_7;
			arg0.aClass188_7.anInterface16_1 = this.aClass188_7.anInterface16_1;
			arg0.aClass188_7.aByte65 = this.aClass188_7.aByte65;
		} else if (Static114.method6188(this.anInt7047, arg4)) {
			arg0.aClass188_7 = this.aClass188_7;
		} else {
			arg0.aClass188_7 = null;
		}
		if (Static489.method7072(arg4, this.anInt7047)) {
			if (arg1.aFloatArray58 == null || this.anInt7014 > arg1.aFloatArray58.length) {
				local192 = this.anInt7020;
				arg0.aFloatArray57 = arg1.aFloatArray57 = new float[local192];
				arg0.aFloatArray58 = arg1.aFloatArray58 = new float[local192];
			} else {
				arg0.aFloatArray58 = arg1.aFloatArray58;
				arg0.aFloatArray57 = arg1.aFloatArray57;
			}
			for (local192 = 0; local192 < this.anInt7020; local192++) {
				arg0.aFloatArray58[local192] = this.aFloatArray58[local192];
				arg0.aFloatArray57[local192] = this.aFloatArray57[local192];
			}
		} else {
			arg0.aFloatArray57 = this.aFloatArray57;
			arg0.aFloatArray58 = this.aFloatArray58;
		}
		if (Static495.method7109(this.anInt7047, arg4)) {
			if (arg3) {
				arg0.aByte85 = (byte) (arg0.aByte85 | 0x8);
			}
			arg0.aClass188_9 = arg1.aClass188_9;
			arg0.aClass188_9.aByte65 = this.aClass188_9.aByte65;
			arg0.aClass188_9.anInterface16_1 = this.aClass188_9.anInterface16_1;
		} else if (Static48.method1462(arg4, this.anInt7047)) {
			arg0.aClass188_9 = this.aClass188_9;
		} else {
			arg0.aClass188_9 = null;
		}
		if (Static34.method1307(this.anInt7047, arg4)) {
			if (arg1.aShortArray128 == null || arg1.aShortArray128.length < this.anInt7014) {
				local192 = this.anInt7014;
				arg0.aShortArray128 = arg1.aShortArray128 = new short[local192];
				arg0.aShortArray132 = arg1.aShortArray132 = new short[local192];
				arg0.aShortArray133 = arg1.aShortArray133 = new short[local192];
			} else {
				arg0.aShortArray132 = arg1.aShortArray132;
				arg0.aShortArray133 = arg1.aShortArray133;
				arg0.aShortArray128 = arg1.aShortArray128;
			}
			for (local192 = 0; local192 < this.anInt7014; local192++) {
				arg0.aShortArray128[local192] = this.aShortArray128[local192];
				arg0.aShortArray133[local192] = this.aShortArray133[local192];
				arg0.aShortArray132[local192] = this.aShortArray132[local192];
			}
		} else {
			arg0.aShortArray133 = this.aShortArray133;
			arg0.aShortArray128 = this.aShortArray128;
			arg0.aShortArray132 = this.aShortArray132;
		}
		if (Static530.method7542(this.anInt7047, arg4)) {
			if (arg3) {
				arg0.aByte85 = (byte) (arg0.aByte85 | 0x10);
			}
			arg0.aClass136_1 = arg1.aClass136_1;
			arg0.aClass136_1.anInterface7_1 = this.aClass136_1.anInterface7_1;
		} else if (Static198.method3659(this.anInt7047, arg4)) {
			arg0.aClass136_1 = this.aClass136_1;
		} else {
			arg0.aClass136_1 = null;
		}
		if (Static71.method1916(this.anInt7047, arg4)) {
			if (arg1.aShortArray124 == null || this.anInt7014 > arg1.aShortArray124.length) {
				local192 = this.anInt7014;
				arg0.aShortArray124 = arg1.aShortArray124 = new short[local192];
			} else {
				arg0.aShortArray124 = arg1.aShortArray124;
			}
			for (local192 = 0; local192 < this.anInt7014; local192++) {
				arg0.aShortArray124[local192] = this.aShortArray124[local192];
			}
		} else {
			arg0.aShortArray124 = this.aShortArray124;
		}
		if (!Static501.method7183(this.anInt7047, arg4)) {
			arg0.lb = this.lb;
		} else if (arg1.lb == null || this.anInt7012 > arg1.lb.length) {
			local192 = this.anInt7012;
			arg0.lb = arg1.lb = new Class301[local192];
			for (local549 = 0; local549 < this.anInt7012; local549++) {
				arg0.lb[local549] = this.lb[local549].method7298();
			}
		} else {
			arg0.lb = arg1.lb;
			for (local192 = 0; local192 < this.anInt7012; local192++) {
				arg0.lb[local192].method7297(this.lb[local192]);
			}
		}
		arg0.anIntArrayArray61 = this.anIntArrayArray61;
		arg0.anIntArrayArray62 = this.anIntArrayArray62;
		arg0.aShortArray129 = this.aShortArray129;
		arg0.aClass100Array1 = this.aClass100Array1;
		if (this.aBoolean465) {
			arg0.aShort109 = this.aShort109;
			arg0.aShort103 = this.aShort103;
			arg0.aShort104 = this.aShort104;
			arg0.aBoolean465 = true;
			arg0.aShort106 = this.aShort106;
			arg0.aShort108 = this.aShort108;
			arg0.aShort107 = this.aShort107;
			arg0.aShort101 = this.aShort101;
		} else {
			arg0.aBoolean465 = false;
		}
		arg0.aShortArray125 = this.aShortArray125;
		arg0.anIntArray527 = this.anIntArray527;
		arg0.aClass129Array6 = this.aClass129Array6;
		arg0.anIntArrayArray63 = this.anIntArrayArray63;
		arg0.aClass178Array6 = this.aClass178Array6;
		arg0.aShortArray131 = this.aShortArray131;
		arg0.anIntArray529 = this.anIntArray529;
		return arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	private void method6040() {
		if (this.anInt7038 == 0) {
			return;
		}
		if (this.aByte85 != 0) {
			this.method6043(true);
		}
		this.method6043(false);
		if (this.aClass136_1 != null) {
			if (this.aClass136_1.anInterface7_1 == null) {
				this.method6044((this.aByte85 & 0x10) != 0);
			}
			if (this.aClass136_1.anInterface7_1 != null) {
				this.aClass9_Sub3_34.method6733(this.aClass188_7 != null);
				this.aClass9_Sub3_34.method6713(this.aClass188_9, this.aClass188_10, this.aClass188_7, this.aClass188_8);
				@Pc(82) int local82 = this.anIntArray527.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray527[local84];
					@Pc(98) int local98 = this.anIntArray527[local84 + 1];
					@Pc(105) int local105 = this.aShortArray124[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass9_Sub3_34.method6695(local105, this.aClass188_7 != null);
					this.aClass9_Sub3_34.method6719(local91 * 3, (local98 - local91) * 3, this.aClass136_1.anInterface7_1);
				}
			}
		}
		this.method6047();
	}

	@OriginalMember(owner = "client!qu", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean465) {
			this.method6041();
		}
		return this.aShort109;
	}

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean465) {
			this.method6041();
		}
		return this.aShort103;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7263(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class19_Sub3 local8 = (Class19_Sub3) arg0;
		if (this.anInt7014 == 0 || local8.anInt7014 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7002;
		@Pc(24) int[] local24 = local8.anIntArray525;
		@Pc(27) int[] local27 = local8.anIntArray528;
		@Pc(30) int[] local30 = local8.anIntArray526;
		@Pc(33) short[] local33 = local8.aShortArray127;
		@Pc(36) short[] local36 = local8.aShortArray126;
		@Pc(39) short[] local39 = local8.aShortArray130;
		@Pc(42) byte[] local42 = local8.aByteArray85;
		@Pc(49) short[] local49;
		@Pc(47) short[] local47;
		@Pc(53) short[] local53;
		@Pc(51) byte[] local51;
		if (this.aClass148_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local49 = this.aClass148_1.aShortArray72;
			local53 = this.aClass148_1.aShortArray73;
			local47 = this.aClass148_1.aShortArray71;
			local51 = this.aClass148_1.aByteArray65;
		}
		@Pc(82) short[] local82;
		@Pc(76) short[] local76;
		@Pc(78) short[] local78;
		@Pc(80) byte[] local80;
		if (local8.aClass148_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass148_1.aShortArray73;
			local76 = local8.aClass148_1.aShortArray71;
			local80 = local8.aClass148_1.aByteArray65;
			local82 = local8.aClass148_1.aShortArray72;
		}
		@Pc(103) int[] local103 = local8.anIntArray529;
		@Pc(106) short[] local106 = local8.aShortArray125;
		if (!local8.aBoolean465) {
			local8.method6041();
		}
		@Pc(115) short local115 = local8.aShort101;
		@Pc(118) short local118 = local8.aShort108;
		@Pc(121) short local121 = local8.aShort109;
		@Pc(124) short local124 = local8.aShort104;
		@Pc(127) short local127 = local8.aShort107;
		@Pc(130) short local130 = local8.aShort106;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7002; local132++) {
			@Pc(142) int local142 = this.anIntArray528[local132] - arg2;
			if (local142 >= local115 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray525[local132] - arg1;
				if (local162 >= local121 && local124 >= local162) {
					@Pc(178) int local178 = this.anIntArray526[local132] - arg3;
					if (local127 <= local178 && local130 >= local178) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray529[local132];
						@Pc(204) int local204 = this.anIntArray529[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray125[local206] - 1;
							if (local192 == -1 || this.aByteArray85[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(240) int local240 = 0; local240 < local21; local240++) {
								if (local162 == local24[local240] && local178 == local30[local240] && local27[local240] == local142) {
									@Pc(271) int local271 = -1;
									local197 = local103[local240];
									local204 = local103[local240 + 1];
									for (@Pc(283) int local283 = local197; local283 < local204; local283++) {
										local271 = local106[local283] - 1;
										if (local271 == -1 || local42[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local49 == null) {
											this.aClass148_1 = new Class148();
											local49 = this.aClass148_1.aShortArray72 = Static376.method5719(this.aShortArray127);
											local47 = this.aClass148_1.aShortArray71 = Static376.method5719(this.aShortArray126);
											local53 = this.aClass148_1.aShortArray73 = Static376.method5719(this.aShortArray130);
											local51 = this.aClass148_1.aByteArray65 = Static164.method3259(this.aByteArray85);
										}
										if (local82 == null) {
											@Pc(368) Class148 local368 = local8.aClass148_1 = new Class148();
											local82 = local368.aShortArray72 = Static376.method5719(local33);
											local76 = local368.aShortArray71 = Static376.method5719(local36);
											local78 = local368.aShortArray73 = Static376.method5719(local39);
											local80 = local368.aByteArray65 = Static164.method3259(local42);
										}
										@Pc(401) short local401 = this.aShortArray127[local192];
										@Pc(406) short local406 = this.aShortArray126[local192];
										@Pc(411) short local411 = this.aShortArray130[local192];
										@Pc(416) byte local416 = this.aByteArray85[local192];
										local197 = local103[local240];
										local204 = local103[local240 + 1];
										@Pc(436) int local436;
										for (@Pc(428) int local428 = local197; local428 < local204; local428++) {
											local436 = local106[local428] - 1;
											if (local436 == -1) {
												break;
											}
											if (local80[local436] != 0) {
												local82[local436] += local401;
												local76[local436] += local406;
												local78[local436] += local411;
												local80[local436] += local416;
											}
										}
										local401 = local33[local271];
										local197 = this.anIntArray529[local132];
										local406 = local36[local271];
										local204 = this.anIntArray529[local132 + 1];
										local411 = local39[local271];
										local416 = local42[local271];
										for (local436 = local197; local436 < local204; local436++) {
											@Pc(523) int local523 = this.aShortArray125[local436] - 1;
											if (local523 == -1) {
												break;
											}
											if (local51[local523] != 0) {
												local49[local523] += local401;
												local47[local523] += local406;
												local53[local523] += local411;
												local51[local523] += local416;
											}
										}
										if (this.aClass188_7 == null && this.aClass188_8 != null) {
											this.aClass188_8.anInterface16_1 = null;
										}
										if (this.aClass188_7 != null) {
											this.aClass188_7.anInterface16_1 = null;
										}
										if (local8.aClass188_7 == null && local8.aClass188_8 != null) {
											local8.aClass188_8.anInterface16_1 = null;
										}
										if (local8.aClass188_7 != null) {
											local8.aClass188_7.anInterface16_1 = null;
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

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort105;
	}

	@OriginalMember(owner = "client!qu", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass9_Sub3_34.anInterface8_13;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7014; local11++) {
			if (arg0 == this.aShortArray124[local11]) {
				this.aShortArray124[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class175 local52 = local9.method7085(arg0 & 0xFFFF);
			local41 = local52.aByte58;
			local39 = local52.aByte59;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(72) Class175 local72 = local9.method7085(arg1 & 0xFFFF);
			local62 = local72.aByte58;
			local60 = local72.aByte59;
		}
		if (!(local41 != local62 | local39 != local60)) {
			return;
		}
		if (this.aClass100Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt7012; local97++) {
				@Pc(104) Class100 local104 = this.aClass100Array1[local97];
				@Pc(109) Class301 local109 = this.lb[local97];
				local109.anInt8601 = local109.anInt8601 & 0xFF000000 | Static392.anIntArray516[this.aShortArray123[local104.anInt3467] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass188_8 != null) {
			this.aClass188_8.anInterface16_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
	private void method6041() {
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = 32767;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt7002; local31++) {
			@Pc(38) int local38 = this.anIntArray525[local31];
			@Pc(43) int local43 = this.anIntArray528[local31];
			if (local38 < local15) {
				local15 = local38;
			}
			if (local43 < local17) {
				local17 = local43;
			}
			if (local21 < local38) {
				local21 = local38;
			}
			if (local23 < local43) {
				local23 = local43;
			}
			@Pc(76) int local76 = this.anIntArray526[local31];
			if (local25 < local76) {
				local25 = local76;
			}
			if (local76 < local19) {
				local19 = local76;
			}
			@Pc(94) int local94 = local76 * local76 + local38 * local38;
			if (local27 < local94) {
				local27 = local94;
			}
			local94 = local76 * local76 + local38 * local38 + local43 * local43;
			if (local94 > local29) {
				local29 = local94;
			}
		}
		this.aShort109 = (short) local15;
		this.aShort106 = (short) local25;
		this.aShort107 = (short) local19;
		this.aShort104 = (short) local21;
		this.aShort101 = (short) local17;
		this.aShort108 = (short) local23;
		this.aShort103 = (short) (Math.sqrt((double) local27) + 0.99D);
		Math.sqrt((double) local29);
		this.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "()[Lclient!ia;")
	@Override
	public Class129[] method7246() {
		return this.aClass129Array6;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "()[Lclient!lh;")
	@Override
	public Class178[] method7251() {
		return this.aClass178Array6;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!m;Lclient!pr;II)V")
	@Override
	public void method7253(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7020 == 0) {
			return;
		}
		@Pc(13) Class22_Sub2 local13 = this.aClass9_Sub3_34.aClass22_Sub2_4;
		if (!this.aBoolean465) {
			this.method6041();
		}
		@Pc(22) Class22_Sub2 local22 = (Class22_Sub2) arg0;
		Static156.aFloat81 = local13.aFloat61 + local13.aFloat62 * local22.aFloat67 + local22.aFloat60 * local13.aFloat70 + local22.aFloat61 * local13.aFloat69;
		Static310.aFloat113 = local13.aFloat70 * local22.aFloat65 + local13.aFloat62 * local22.aFloat64 + local22.aFloat70 * local13.aFloat69;
		@Pc(69) float local69 = (float) this.aShort101 * Static310.aFloat113 + Static156.aFloat81;
		@Pc(77) float local77 = Static156.aFloat81 + Static310.aFloat113 * (float) this.aShort108;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local93 = (float) -this.aShort103 + local77;
			local87 = local69 + (float) this.aShort103;
		} else {
			local87 = (float) this.aShort103 + local77;
			local93 = local69 - (float) this.aShort103;
		}
		if (local93 >= this.aClass9_Sub3_34.aFloat158 || (float) this.aClass9_Sub3_34.anInt7898 >= local87) {
			return;
		}
		Static183.aFloat87 = local13.aFloat67 + local13.aFloat64 * local22.aFloat60 + local13.aFloat71 * local22.aFloat67 + local22.aFloat61 * local13.aFloat63;
		Static85.aFloat73 = local13.aFloat71 * local22.aFloat64 + local13.aFloat64 * local22.aFloat65 + local13.aFloat63 * local22.aFloat70;
		@Pc(170) float local170 = Static183.aFloat87 + Static85.aFloat73 * (float) this.aShort101;
		@Pc(178) float local178 = Static183.aFloat87 + (float) this.aShort108 * Static85.aFloat73;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local178 < local170) {
			local194 = (float) this.aClass9_Sub3_34.anInt7893 * ((float) -this.aShort103 + local178);
			local205 = (float) this.aClass9_Sub3_34.anInt7893 * (local170 + (float) this.aShort103);
		} else {
			local205 = (float) this.aClass9_Sub3_34.anInt7893 * (local178 + (float) this.aShort103);
			local194 = ((float) -this.aShort103 + local170) * (float) this.aClass9_Sub3_34.anInt7893;
		}
		if (local194 / (float) arg2 >= this.aClass9_Sub3_34.aFloat154 || local205 / (float) arg2 <= this.aClass9_Sub3_34.aFloat173) {
			return;
		}
		Static14.aFloat45 = local22.aFloat70 * local13.aFloat66 + local22.aFloat64 * local13.aFloat68 + local13.aFloat65 * local22.aFloat65;
		Static58.aFloat59 = local13.aFloat60 + local22.aFloat67 * local13.aFloat68 + local13.aFloat65 * local22.aFloat60 + local22.aFloat61 * local13.aFloat66;
		@Pc(297) float local297 = Static58.aFloat59 + (float) this.aShort101 * Static14.aFloat45;
		@Pc(305) float local305 = Static58.aFloat59 + (float) this.aShort108 * Static14.aFloat45;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local305 < local297) {
			local332 = (float) this.aClass9_Sub3_34.anInt7911 * ((float) this.aShort103 + local297);
			local321 = (float) this.aClass9_Sub3_34.anInt7911 * (local305 - (float) this.aShort103);
		} else {
			local321 = (float) this.aClass9_Sub3_34.anInt7911 * ((float) -this.aShort103 + local297);
			local332 = (float) this.aClass9_Sub3_34.anInt7911 * ((float) this.aShort103 + local305);
		}
		if (this.aClass9_Sub3_34.aFloat155 <= local321 / (float) arg2 || local332 / (float) arg2 <= this.aClass9_Sub3_34.aFloat166) {
			return;
		}
		if (arg1 != null || this.aClass100Array1 != null) {
			Static544.aFloat205 = local22.aFloat71 * local13.aFloat62 + local22.aFloat68 * local13.aFloat70 + local13.aFloat69 * local22.aFloat62;
			Static87.aFloat120 = local13.aFloat71 * local22.aFloat71 + local22.aFloat68 * local13.aFloat64 + local13.aFloat63 * local22.aFloat62;
			Static139.aFloat80 = local13.aFloat66 * local22.aFloat69 + local22.aFloat63 * local13.aFloat68 + local22.aFloat66 * local13.aFloat65;
			Static42.aFloat54 = local13.aFloat63 * local22.aFloat69 + local22.aFloat63 * local13.aFloat71 + local13.aFloat64 * local22.aFloat66;
			Static323.aFloat118 = local22.aFloat69 * local13.aFloat69 + local13.aFloat62 * local22.aFloat63 + local22.aFloat66 * local13.aFloat70;
			Static15.aFloat46 = local22.aFloat62 * local13.aFloat66 + local22.aFloat71 * local13.aFloat68 + local22.aFloat68 * local13.aFloat65;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort104 + this.aShort109 >> 1;
			@Pc(507) int local507 = this.aShort106 + this.aShort107 >> 1;
			@Pc(526) int local526 = (int) (Static42.aFloat54 * (float) local507 + (float) this.aShort101 * Static85.aFloat73 + (float) local499 * Static87.aFloat120 + Static183.aFloat87);
			@Pc(545) int local545 = (int) ((float) local499 * Static15.aFloat46 + Static58.aFloat59 + Static14.aFloat45 * (float) this.aShort101 + Static139.aFloat80 * (float) local507);
			@Pc(564) int local564 = (int) ((float) local507 * Static323.aFloat118 + Static156.aFloat81 + (float) local499 * Static544.aFloat205 + (float) this.aShort101 * Static310.aFloat113);
			@Pc(583) int local583 = (int) ((float) local507 * Static42.aFloat54 + (float) this.aShort108 * Static85.aFloat73 + (float) local499 * Static87.aFloat120 + Static183.aFloat87);
			@Pc(602) int local602 = (int) (Static139.aFloat80 * (float) local507 + Static58.aFloat59 + (float) local499 * Static15.aFloat46 + Static14.aFloat45 * (float) this.aShort108);
			arg1.anInt6640 = this.aClass9_Sub3_34.anInt7893 * local526 / arg2 + this.aClass9_Sub3_34.anInt7917;
			arg1.anInt6642 = this.aClass9_Sub3_34.anInt7909 + this.aClass9_Sub3_34.anInt7911 * local545 / arg2;
			arg1.anInt6643 = this.aClass9_Sub3_34.anInt7917 + this.aClass9_Sub3_34.anInt7893 * local583 / arg2;
			@Pc(660) int local660 = (int) (Static310.aFloat113 * (float) this.aShort108 + (float) local499 * Static544.aFloat205 + Static156.aFloat81 + Static323.aFloat118 * (float) local507);
			arg1.anInt6639 = local602 * this.aClass9_Sub3_34.anInt7911 / arg2 + this.aClass9_Sub3_34.anInt7909;
			if (this.aClass9_Sub3_34.anInt7898 > local564 && local660 < this.aClass9_Sub3_34.anInt7898) {
				arg1.anInt6641 = this.aClass9_Sub3_34.anInt7893 * (this.aShort103 + local526) / arg2 + this.aClass9_Sub3_34.anInt7917 - arg1.anInt6640;
				arg1.aBoolean437 = true;
			}
		}
		this.aClass9_Sub3_34.method6684((float) arg2);
		this.aClass9_Sub3_34.method6712();
		this.aClass9_Sub3_34.method6694(local22);
		this.method6040();
		this.aClass9_Sub3_34.method6715();
		this.method6035();
	}

	@OriginalMember(owner = "client!qu", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7014; local7++) {
			if (this.aShortArray123[local7] == arg0) {
				this.aShortArray123[local7] = arg1;
			}
		}
		if (this.aClass100Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7012; local34++) {
				@Pc(41) Class100 local41 = this.aClass100Array1[local34];
				@Pc(46) Class301 local46 = this.lb[local34];
				local46.anInt8601 = local46.anInt8601 & 0xFF000000 | Static392.anIntArray516[this.aShortArray123[local41.anInt3467] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass188_8 != null) {
			this.aClass188_8.anInterface16_1 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(SIBII)I")
	private int method6042(@OriginalArg(0) short arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static392.anIntArray516[Static460.method6779(arg2, arg3)];
		if (arg0 != -1) {
			@Pc(26) Class175 local26 = this.aClass9_Sub3_34.anInterface8_13.method7085(arg0 & 0xFFFF);
			@Pc(31) int local31 = local26.aByte59 & 0xFF;
			@Pc(40) int local40;
			@Pc(65) int local65;
			if (local31 != 0) {
				if (arg3 < 0) {
					local40 = 0;
				} else if (arg3 > 127) {
					local40 = 16777215;
				} else {
					local40 = arg3 * 131586;
				}
				if (local31 == 256) {
					local12 = local40;
				} else {
					local65 = 256 - local31;
					local12 = ((local12 & 0xFF00FF) * local65 + local31 * (local40 & 0xFF00FF) & 0xFF00FF00) + ((local12 & 0xFF00) * local65 + (local40 & 0xFF00) * local31 & 0xFF0000) >> 8;
				}
			}
			local40 = local26.aByte58 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(115) int local115 = (local12 >> 16 & 0xFF) * local40;
				if (local115 > 65535) {
					local115 = 65535;
				}
				local65 = (local12 >> 8 & 0xFF) * local40;
				if (local65 > 65535) {
					local65 = 65535;
				}
				@Pc(139) int local139 = local40 * (local12 & 0xFF);
				if (local139 > 65535) {
					local139 = 65535;
				}
				local12 = ((local115 & 0x7700FF00) << 8) + (local65 & 0xFF00) + (local139 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class19 method7260(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class19_Sub3 local12;
		@Pc(16) Class19_Sub3 local16;
		if (arg0 == 1) {
			local12 = this.aClass9_Sub3_34.aClass19_Sub3_7;
			local16 = this.aClass9_Sub3_34.aClass19_Sub3_5;
		} else if (arg0 == 2) {
			local12 = this.aClass9_Sub3_34.aClass19_Sub3_9;
			local16 = this.aClass9_Sub3_34.aClass19_Sub3_2;
		} else if (arg0 == 3) {
			local16 = this.aClass9_Sub3_34.aClass19_Sub3_4;
			local12 = this.aClass9_Sub3_34.aClass19_Sub3_10;
		} else if (arg0 == 4) {
			local12 = this.aClass9_Sub3_34.aClass19_Sub3_3;
			local16 = this.aClass9_Sub3_34.aClass19_Sub3_1;
		} else if (arg0 == 5) {
			local16 = this.aClass9_Sub3_34.aClass19_Sub3_6;
			local12 = this.aClass9_Sub3_34.aClass19_Sub3_8;
		} else {
			local12 = local16 = new Class19_Sub3(this.aClass9_Sub3_34);
		}
		return this.method6039(local12, local16, arg2, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZZ)V")
	private void method6043(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass188_8 != null && this.aClass188_8.anInterface16_1 == null;
		@Pc(27) boolean local27 = this.aClass188_7 != null && this.aClass188_7.anInterface16_1 == null;
		@Pc(38) boolean local38 = this.aClass188_10 != null && this.aClass188_10.anInterface16_1 == null;
		@Pc(49) boolean local49 = this.aClass188_9 != null && this.aClass188_9.anInterface16_1 == null;
		if (arg0) {
			local38 &= (this.aByte85 & 0x1) != 0;
			local27 &= (this.aByte85 & 0x4) != 0;
			local16 &= (this.aByte85 & 0x2) != 0;
			local49 &= (this.aByte85 & 0x8) != 0;
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
		if (this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3.aByteArray45.length < this.anInt7020 * local106) {
			this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3 = new Class1_Sub13_Sub1(local106 * (this.anInt7020 + 100));
		} else {
			this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3.anInt3400 = 0;
		}
		@Pc(193) Class1_Sub13_Sub1 local193 = this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3;
		@Pc(205) int local205;
		@Pc(214) int local214;
		@Pc(242) int local242;
		@Pc(251) int local251;
		if (local38) {
			@Pc(221) int local221;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(240) int local240;
			if (this.aClass9_Sub3_34.aBoolean523) {
				for (local205 = 0; local205 < this.anInt7002; local205++) {
					local214 = Stream.floatToRawIntBits((float) this.anIntArray525[local205]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray528[local205]);
					local228 = Stream.floatToRawIntBits((float) this.anIntArray526[local205]);
					local233 = this.anIntArray529[local205];
					local240 = this.anIntArray529[local205 + 1];
					for (local242 = local233; local242 < local240; local242++) {
						local251 = this.aShortArray125[local242] - 1;
						if (local251 == -1) {
							break;
						}
						local193.anInt3400 = local251 * local106;
						local193.method3069(local214);
						local193.method3069(local221);
						local193.method3069(local228);
					}
				}
			} else {
				for (local205 = 0; local205 < this.anInt7002; local205++) {
					local214 = Stream.floatToRawIntBits((float) this.anIntArray525[local205]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray528[local205]);
					local228 = Stream.floatToRawIntBits((float) this.anIntArray526[local205]);
					local233 = this.anIntArray529[local205];
					local240 = this.anIntArray529[local205 + 1];
					for (local242 = local233; local242 < local240; local242++) {
						local251 = this.aShortArray125[local242] - 1;
						if (local251 == -1) {
							break;
						}
						local193.anInt3400 = local251 * local106;
						local193.method3075(local214);
						local193.method3075(local221);
						local193.method3075(local228);
					}
				}
			}
		}
		@Pc(580) float local580;
		@Pc(456) short[] local456;
		@Pc(462) short[] local462;
		@Pc(459) short[] local459;
		@Pc(453) byte[] local453;
		@Pc(613) float local613;
		if (local16) {
			if (this.aClass188_7 == null) {
				if (this.aClass148_1 == null) {
					local453 = this.aByteArray85;
					local456 = this.aShortArray126;
					local459 = this.aShortArray130;
					local462 = this.aShortArray127;
				} else {
					local456 = this.aClass148_1.aShortArray71;
					local453 = this.aClass148_1.aByteArray65;
					local462 = this.aClass148_1.aShortArray72;
					local459 = this.aClass148_1.aShortArray73;
				}
				@Pc(486) float local486 = this.aClass9_Sub3_34.aFloatArray65[0];
				@Pc(492) float local492 = this.aClass9_Sub3_34.aFloatArray65[1];
				@Pc(498) float local498 = this.aClass9_Sub3_34.aFloatArray65[2];
				@Pc(502) float local502 = this.aClass9_Sub3_34.aFloat157;
				@Pc(512) float local512 = this.aClass9_Sub3_34.aFloat170 * 768.0F / (float) this.aShort102;
				@Pc(522) float local522 = this.aClass9_Sub3_34.aFloat174 * 768.0F / (float) this.aShort102;
				for (@Pc(524) int local524 = 0; local524 < this.anInt7014; local524++) {
					@Pc(544) int local544 = this.method6042(this.aShortArray124[local524], this.aByteArray84[local524], this.aShortArray123[local524], this.aShort105);
					@Pc(549) short local549 = this.aShortArray128[local524];
					@Pc(560) float local560 = this.aClass9_Sub3_34.aFloat172 * (float) (local544 >> 8 & 0xFF);
					@Pc(569) float local569 = this.aClass9_Sub3_34.aFloat169 * (float) (local544 >>> 24);
					local580 = this.aClass9_Sub3_34.aFloat165 * (float) (local544 >> 16 & 0xFF);
					@Pc(585) short local585 = (short) local453[local549];
					if (local585 == 0) {
						local613 = ((float) local462[local549] * local486 + (float) local456[local549] * local492 + local498 * (float) local459[local549]) * 0.0026041667F;
					} else {
						local613 = (local492 * (float) local456[local549] + local486 * (float) local462[local549] + local498 * (float) local459[local549]) / (float) (local585 * 256);
					}
					@Pc(653) float local653 = (local613 < 0.0F ? local522 : local512) * local613 + local502;
					@Pc(658) int local658 = (int) (local653 * local569);
					@Pc(663) int local663 = (int) (local653 * local580);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					@Pc(693) int local693 = (int) (local653 * local560);
					local193.anInt3400 = local106 * local549 + local110;
					if (local693 < 0) {
						local693 = 0;
					} else if (local693 > 255) {
						local693 = 255;
					}
					local193.method3060(local658);
					local193.method3060(local663);
					local193.method3060(local693);
					local193.method3060(255 - (this.aByteArray84[local524] & 0xFF));
					local549 = this.aShortArray133[local524];
					local585 = local453[local549];
					if (local585 == 0) {
						local613 = ((float) local459[local549] * local498 + (float) local462[local549] * local486 + local492 * (float) local456[local549]) * 0.0026041667F;
					} else {
						local613 = (local492 * (float) local456[local549] + (float) local462[local549] * local486 + local498 * (float) local459[local549]) / (float) (local585 * 256);
					}
					local653 = local502 + local613 * (local613 < 0.0F ? local522 : local512);
					local658 = (int) (local569 * local653);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local663 = (int) (local653 * local580);
					local693 = (int) (local560 * local653);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					if (local693 < 0) {
						local693 = 0;
					} else if (local693 > 255) {
						local693 = 255;
					}
					local193.anInt3400 = local110 + local106 * local549;
					local193.method3060(local658);
					local193.method3060(local663);
					local193.method3060(local693);
					local193.method3060(255 - (this.aByteArray84[local524] & 0xFF));
					local549 = this.aShortArray132[local524];
					local585 = local453[local549];
					if (local585 == 0) {
						local613 = (local498 * (float) local459[local549] + local492 * (float) local456[local549] + local486 * (float) local462[local549]) * 0.0026041667F;
					} else {
						local613 = ((float) local456[local549] * local492 + (float) local462[local549] * local486 + local498 * (float) local459[local549]) / (float) (local585 * 256);
					}
					local653 = local502 + local613 * (local613 < 0.0F ? local522 : local512);
					local658 = (int) (local653 * local569);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local663 = (int) (local580 * local653);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					local693 = (int) (local653 * local560);
					local193.anInt3400 = local110 + local106 * local549;
					if (local693 < 0) {
						local693 = 0;
					} else if (local693 > 255) {
						local693 = 255;
					}
					local193.method3060(local658);
					local193.method3060(local663);
					local193.method3060(local693);
					local193.method3060(255 - (this.aByteArray84[local524] & 0xFF));
				}
			} else {
				for (local205 = 0; local205 < this.anInt7014; local205++) {
					local214 = this.method6042(this.aShortArray124[local205], this.aByteArray84[local205], this.aShortArray123[local205], this.aShort105);
					local193.anInt3400 = this.aShortArray128[local205] * local106 + local110;
					local193.method3069(local214);
					local193.anInt3400 = local110 + local106 * this.aShortArray133[local205];
					local193.method3069(local214);
					local193.anInt3400 = local110 + this.aShortArray132[local205] * local106;
					local193.method3069(local214);
				}
			}
		}
		if (local27) {
			if (this.aClass148_1 == null) {
				local456 = this.aShortArray126;
				local462 = this.aShortArray127;
				local459 = this.aShortArray130;
				local453 = this.aByteArray85;
			} else {
				local459 = this.aClass148_1.aShortArray73;
				local453 = this.aClass148_1.aByteArray65;
				local456 = this.aClass148_1.aShortArray71;
				local462 = this.aClass148_1.aShortArray72;
			}
			@Pc(1115) float local1115 = 3.0F / (float) this.aShort102;
			local613 = 3.0F / (float) (this.aShort102 / 2 + this.aShort102);
			local193.anInt3400 = local112;
			if (this.aClass9_Sub3_34.aBoolean523) {
				for (local242 = 0; local242 < this.anInt7020; local242++) {
					local251 = local453[local242] & 0xFF;
					if (local251 == 0) {
						local193.method2612(local613 * (float) local462[local242]);
						local193.method2612((float) local456[local242] * local613);
						local193.method2612((float) local459[local242] * local613);
					} else {
						local580 = local1115 / (float) local251;
						local193.method2612((float) local462[local242] * local580);
						local193.method2612((float) local456[local242] * local580);
						local193.method2612((float) local459[local242] * local580);
					}
					local193.anInt3400 += local106 - 12;
				}
			} else {
				for (local242 = 0; local242 < this.anInt7020; local242++) {
					local251 = local453[local242] & 0xFF;
					if (local251 == 0) {
						local193.method2611(local613 * (float) local462[local242]);
						local193.method2611((float) local456[local242] * local613);
						local193.method2611(local613 * (float) local459[local242]);
					} else {
						local580 = local1115 / (float) local251;
						local193.method2611(local580 * (float) local462[local242]);
						local193.method2611(local580 * (float) local456[local242]);
						local193.method2611(local580 * (float) local459[local242]);
					}
					local193.anInt3400 += local106 - 12;
				}
			}
		}
		if (local49) {
			local193.anInt3400 = local114;
			if (this.aClass9_Sub3_34.aBoolean523) {
				for (local205 = 0; local205 < this.anInt7020; local205++) {
					local193.method2612(this.aFloatArray58[local205]);
					local193.method2612(this.aFloatArray57[local205]);
					local193.anInt3400 += local106 - 8;
				}
			} else {
				for (local205 = 0; local205 < this.anInt7020; local205++) {
					local193.method2611(this.aFloatArray58[local205]);
					local193.method2611(this.aFloatArray57[local205]);
					local193.anInt3400 += local106 - 8;
				}
			}
		}
		local193.anInt3400 = this.anInt7020 * local106;
		@Pc(1438) Interface16 local1438;
		if (arg0) {
			if (this.anInterface16_4 == null) {
				this.anInterface16_4 = this.aClass9_Sub3_34.method6729(local193.aByteArray45, true, local193.anInt3400, local106);
			} else {
				this.anInterface16_4.method6005(local193.aByteArray45, local106, local193.anInt3400);
			}
			this.aByte85 = 0;
			local1438 = this.anInterface16_4;
		} else {
			local1438 = this.aClass9_Sub3_34.method6729(local193.aByteArray45, false, local193.anInt3400, local106);
			this.aBoolean466 = true;
		}
		if (local38) {
			this.aClass188_10.anInterface16_1 = local1438;
			this.aClass188_10.aByte65 = 0;
		}
		if (local49) {
			this.aClass188_9.anInterface16_1 = local1438;
			this.aClass188_9.aByte65 = local114;
		}
		if (local16) {
			this.aClass188_8.aByte65 = local110;
			this.aClass188_8.anInterface16_1 = local1438;
		}
		if (local27) {
			this.aClass188_7.anInterface16_1 = local1438;
			this.aClass188_7.aByte65 = local112;
		}
	}

	@OriginalMember(owner = "client!qu", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub4 EA(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		if (this.anInt7020 == 0) {
			return null;
		}
		if (!this.aBoolean465) {
			this.method6041();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass9_Sub3_34.anInt7915 <= 0) {
			local43 = this.aShort109 - (this.aShort101 * this.aClass9_Sub3_34.anInt7915 >> 8) >> this.aClass9_Sub3_34.anInt7874;
			local59 = this.aShort104 - (this.aClass9_Sub3_34.anInt7915 * this.aShort108 >> 8) >> this.aClass9_Sub3_34.anInt7874;
		} else {
			local43 = this.aShort109 - (this.aShort108 * this.aClass9_Sub3_34.anInt7915 >> 8) >> this.aClass9_Sub3_34.anInt7874;
			local59 = this.aShort104 - (this.aShort101 * this.aClass9_Sub3_34.anInt7915 >> 8) >> this.aClass9_Sub3_34.anInt7874;
		}
		@Pc(118) int local118;
		@Pc(134) int local134;
		if (this.aClass9_Sub3_34.anInt7912 > 0) {
			local118 = this.aShort107 - (this.aClass9_Sub3_34.anInt7912 * this.aShort108 >> 8) >> this.aClass9_Sub3_34.anInt7874;
			local134 = this.aShort106 - (this.aShort101 * this.aClass9_Sub3_34.anInt7912 >> 8) >> this.aClass9_Sub3_34.anInt7874;
		} else {
			local118 = this.aShort107 - (this.aShort101 * this.aClass9_Sub3_34.anInt7912 >> 8) >> this.aClass9_Sub3_34.anInt7874;
			local134 = this.aShort106 - (this.aClass9_Sub3_34.anInt7912 * this.aShort108 >> 8) >> this.aClass9_Sub3_34.anInt7874;
		}
		@Pc(176) int local176 = local59 + 1 - local43;
		@Pc(182) int local182 = local134 + 1 - local118;
		@Pc(185) Class1_Sub1_Sub4_Sub2 local185 = (Class1_Sub1_Sub4_Sub2) arg0;
		@Pc(195) Class1_Sub1_Sub4_Sub2 local195;
		if (local185 != null && local185.method2715(local182, local176)) {
			local195 = local185;
			local185.method2713();
		} else {
			local195 = new Class1_Sub1_Sub4_Sub2(this.aClass9_Sub3_34, local176, local182);
		}
		local195.method2716(local43, local118, local59, local134);
		this.method6045(local195);
		return local195;
	}

	@OriginalMember(owner = "client!qu", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7002; local7++) {
			if (arg0 != 0) {
				this.anIntArray525[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray528[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray526[local7] += arg2;
			}
		}
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V")
	private void method6044(@OriginalArg(0) boolean arg0) {
		if (this.anInt7038 * 6 > this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3.aByteArray45.length) {
			this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3 = new Class1_Sub13_Sub1(this.anInt7038 * 6 + 600);
		} else {
			this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3.anInt3400 = 0;
		}
		@Pc(42) Class1_Sub13_Sub1 local42 = this.aClass9_Sub3_34.aClass1_Sub13_Sub1_3;
		@Pc(48) int local48;
		if (this.aClass9_Sub3_34.aBoolean523) {
			for (local48 = 0; local48 < this.anInt7038; local48++) {
				local42.method3038(this.aShortArray128[local48]);
				local42.method3038(this.aShortArray133[local48]);
				local42.method3038(this.aShortArray132[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt7038; local48++) {
				local42.method3068(this.aShortArray128[local48]);
				local42.method3068(this.aShortArray133[local48]);
				local42.method3068(this.aShortArray132[local48]);
			}
		}
		if (local42.anInt3400 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface7_4 == null) {
				this.anInterface7_4 = this.aClass9_Sub3_34.method6687(local42.aByteArray45, local42.anInt3400, true);
			} else {
				this.anInterface7_4.method6741(local42.anInt3400, local42.aByteArray45);
			}
			this.aClass136_1.anInterface7_1 = this.anInterface7_4;
		} else {
			this.aClass136_1.anInterface7_1 = this.aClass9_Sub3_34.method6687(local42.aByteArray45, local42.anInt3400, false);
		}
		if (!arg0) {
			this.aBoolean466 = true;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!fa;Z)V")
	private void method6045(@OriginalArg(0) Class1_Sub1_Sub4_Sub2 arg0) {
		if (this.anInt7020 > this.aClass9_Sub3_34.anIntArray617.length) {
			this.aClass9_Sub3_34.anIntArray619 = new int[this.anInt7020];
			this.aClass9_Sub3_34.anIntArray617 = new int[this.anInt7020];
		}
		@Pc(36) int[] local36 = this.aClass9_Sub3_34.anIntArray617;
		@Pc(40) int[] local40 = this.aClass9_Sub3_34.anIntArray619;
		@Pc(68) int local68;
		@Pc(107) int local107;
		@Pc(116) int local116;
		for (@Pc(42) int local42 = 0; local42 < this.anInt7002; local42++) {
			local68 = (this.anIntArray525[local42] - (this.anIntArray528[local42] * this.aClass9_Sub3_34.anInt7915 >> 8) >> this.aClass9_Sub3_34.anInt7874) - arg0.anInt2916;
			@Pc(93) int local93 = (this.anIntArray526[local42] - (this.anIntArray528[local42] * this.aClass9_Sub3_34.anInt7912 >> 8) >> this.aClass9_Sub3_34.anInt7874) - arg0.anInt2910;
			@Pc(98) int local98 = this.anIntArray529[local42];
			@Pc(105) int local105 = this.anIntArray529[local42 + 1];
			for (local107 = local98; local107 < local105; local107++) {
				local116 = this.aShortArray125[local107] - 1;
				if (local116 == -1) {
					break;
				}
				local36[local116] = local68;
				local40[local116] = local93;
			}
		}
		for (local68 = 0; local68 < this.anInt7038; local68++) {
			if (this.aByteArray84 == null || this.aByteArray84[local68] <= 128) {
				@Pc(163) short local163 = this.aShortArray128[local68];
				@Pc(168) short local168 = this.aShortArray133[local68];
				@Pc(173) short local173 = this.aShortArray132[local68];
				local107 = local36[local163];
				local116 = local36[local168];
				@Pc(185) int local185 = local36[local173];
				@Pc(189) int local189 = local40[local163];
				@Pc(193) int local193 = local40[local168];
				@Pc(197) int local197 = local40[local173];
				if ((local107 - local116) * (local193 - local197) - (local185 - local116) * (local193 - local189) > 0) {
					arg0.method2712(local197, local193, local185, local107, local116, local189);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean465) {
			this.method6041();
		}
		@Pc(16) int local16 = this.aShort109 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort104;
		@Pc(27) int local27 = arg6 + this.aShort107;
		@Pc(32) int local32 = this.aShort106 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7410 + local22 >> arg2.anInt7411 >= arg2.anInt7412 || local27 < 0 || arg2.anInt7410 + local32 >> arg2.anInt7411 >= arg2.anInt7409)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt7412 <= arg3.anInt7410 + local22 >> arg3.anInt7411 || local27 < 0 || local32 + arg3.anInt7410 >> arg3.anInt7411 >= arg3.anInt7409) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7411;
			local22 = local22 + arg2.anInt7410 - 1 >> arg2.anInt7411;
			local27 >>= arg2.anInt7411;
			local32 = arg2.anInt7410 + local32 - 1 >> arg2.anInt7411;
			if (arg5 == arg2.ba(local16, local27) && arg2.ba(local22, local27) == arg5 && arg2.ba(local16, local32) == arg5 && arg2.ba(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(187) int local187;
		if (arg0 == 1) {
			for (local187 = 0; local187 < this.anInt7002; local187++) {
				this.anIntArray528[local187] -= arg5 - arg2.aa(this.anIntArray525[local187] + arg4, arg6 + this.anIntArray526[local187]);
			}
		} else {
			@Pc(248) int local248;
			@Pc(311) int local311;
			if (arg0 == 2) {
				@Pc(463) short local463 = this.aShort101;
				if (local463 == 0) {
					return;
				}
				for (local248 = 0; local248 < this.anInt7002; local248++) {
					local311 = (this.anIntArray528[local248] << 16) / local463;
					if (arg1 > local311) {
						this.anIntArray528[local248] -= -((arg1 - local311) * (arg2.aa(this.anIntArray525[local248] - -arg4, this.anIntArray526[local248] + arg6) - arg5) / arg1);
					}
				}
			} else {
				@Pc(318) int local318;
				if (arg0 == 3) {
					local187 = (arg1 & 0xFF) * 4;
					local248 = (arg1 >> 8 & 0xFF) * 4;
					local311 = (arg1 >> 16 & 0xFF) << 6;
					local318 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local187 >> 1) < 0 || arg2.anInt7412 << arg2.anInt7411 <= (local187 >> 1) + (arg4 + arg2.anInt7410) || arg6 - (local248 >> 1) < 0 || arg2.anInt7409 << arg2.anInt7411 <= arg2.anInt7410 + arg6 + (local248 >> 1)) {
						return;
					}
					this.method7264(local248, local187, arg4, local311, local318, arg5, arg2, arg6);
				} else if (arg0 == 4) {
					local187 = this.aShort108 - this.aShort101;
					for (local248 = 0; local248 < this.anInt7002; local248++) {
						this.anIntArray528[local248] = local187 + this.anIntArray528[local248] + arg3.aa(this.anIntArray525[local248] - -arg4, arg6 + this.anIntArray526[local248]) - arg5;
					}
				} else if (arg0 == 5) {
					local187 = this.aShort108 - this.aShort101;
					for (local248 = 0; local248 < this.anInt7002; local248++) {
						local311 = this.anIntArray525[local248] + arg4;
						local318 = arg6 + this.anIntArray526[local248];
						@Pc(323) int local323 = arg2.aa(local311, local318);
						@Pc(328) int local328 = arg3.aa(local311, local318);
						@Pc(336) int local336 = local323 - arg1 - local328;
						this.anIntArray528[local248] = (local336 * ((this.anIntArray528[local248] << 8) / local187) >> 8) - (arg5 - local323);
					}
				}
			}
		}
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	private void method6047() {
		if (!this.aBoolean466) {
			return;
		}
		this.aBoolean466 = false;
		if (this.aClass178Array6 == null && this.aClass129Array6 == null && this.aClass100Array1 == null) {
			if (this.anIntArray525 != null && !Static248.method4223(this.anInt7047, this.anInt7032)) {
				if (this.aClass188_10 != null && this.aClass188_10.anInterface16_1 == null) {
					this.aBoolean466 = true;
				} else {
					if (!this.aBoolean465) {
						this.method6041();
					}
					this.anIntArray525 = null;
				}
			}
			if (this.anIntArray528 != null && !Static247.method4185(this.anInt7047, this.anInt7032)) {
				if (this.aClass188_10 != null && this.aClass188_10.anInterface16_1 == null) {
					this.aBoolean466 = true;
				} else {
					if (!this.aBoolean465) {
						this.method6041();
					}
					this.anIntArray528 = null;
				}
			}
			if (this.anIntArray526 != null && !Static188.method3538(this.anInt7032, this.anInt7047)) {
				if (this.aClass188_10 != null && this.aClass188_10.anInterface16_1 == null) {
					this.aBoolean466 = true;
				} else {
					if (!this.aBoolean465) {
						this.method6041();
					}
					this.anIntArray526 = null;
				}
			}
		}
		if (this.aShortArray125 != null && this.anIntArray525 == null && this.anIntArray528 == null && this.anIntArray526 == null) {
			this.anIntArray529 = null;
			this.aShortArray125 = null;
		}
		if (this.aByteArray85 != null && !Static252.method4281(this.anInt7032, this.anInt7047)) {
			if (this.aClass188_7 == null) {
				if (this.aClass188_8 != null && this.aClass188_8.anInterface16_1 == null) {
					this.aBoolean466 = true;
				} else {
					this.aByteArray85 = null;
					this.aShortArray127 = this.aShortArray126 = this.aShortArray130 = null;
				}
			} else if (this.aClass188_7.anInterface16_1 == null) {
				this.aBoolean466 = true;
			} else {
				this.aShortArray127 = this.aShortArray126 = this.aShortArray130 = null;
				this.aByteArray85 = null;
			}
		}
		if (this.aShortArray123 != null && !Static41.method1362(this.anInt7047, this.anInt7032)) {
			if (this.aClass188_8 != null && this.aClass188_8.anInterface16_1 == null) {
				this.aBoolean466 = true;
			} else {
				this.aShortArray123 = null;
			}
		}
		if (this.aByteArray84 != null && !Static452.method6483(this.anInt7032, this.anInt7047)) {
			if (this.aClass188_8 != null && this.aClass188_8.anInterface16_1 == null) {
				this.aBoolean466 = true;
			} else {
				this.aByteArray84 = null;
			}
		}
		if (this.aFloatArray58 != null && !Static150.method3003(this.anInt7032, this.anInt7047)) {
			if (this.aClass188_9 != null && this.aClass188_9.anInterface16_1 == null) {
				this.aBoolean466 = true;
			} else {
				this.aFloatArray58 = this.aFloatArray57 = null;
			}
		}
		if (this.aShortArray124 != null && !Static263.method4390(this.anInt7047, this.anInt7032)) {
			if (this.aClass188_8 != null && this.aClass188_8.anInterface16_1 == null) {
				this.aBoolean466 = true;
			} else {
				this.aShortArray124 = null;
			}
		}
		if (this.aShortArray128 != null && !Static162.method6797(this.anInt7032, this.anInt7047)) {
			if ((this.aClass136_1 == null || this.aClass136_1.anInterface7_1 != null) && (this.aClass188_8 == null || this.aClass188_8.anInterface16_1 != null)) {
				this.aShortArray128 = this.aShortArray133 = this.aShortArray132 = null;
			} else {
				this.aBoolean466 = true;
			}
		}
		if (this.anIntArrayArray61 != null && !Static500.method7153(this.anInt7032, this.anInt7047)) {
			this.aShortArray129 = null;
			this.anIntArrayArray61 = null;
		}
		if (this.anIntArrayArray63 != null && !Static446.method6424(this.anInt7032, this.anInt7047)) {
			this.aShortArray131 = null;
			this.anIntArrayArray63 = null;
		}
		if (this.anIntArrayArray62 != null && !Static369.method5693(this.anInt7047, this.anInt7032)) {
			this.anIntArrayArray62 = null;
		}
		if (this.anIntArray527 != null && (this.anInt7032 & 0x800) == 0 && (this.anInt7032 & 0x40000) == 0) {
			this.anIntArray527 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		this.anInt7032 = arg0;
		if (this.aClass148_1 != null && (this.anInt7032 & 0x10000) == 0) {
			this.aShortArray130 = this.aClass148_1.aShortArray73;
			this.aShortArray127 = this.aClass148_1.aShortArray72;
			this.aShortArray126 = this.aClass148_1.aShortArray71;
			this.aByteArray85 = this.aClass148_1.aByteArray65;
			this.aClass148_1 = null;
		}
		this.aBoolean466 = true;
		this.method6047();
	}

	@OriginalMember(owner = "client!qu", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean465) {
			this.method6041();
		}
		return this.aShort101;
	}

	@OriginalMember(owner = "client!qu", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class307.anIntArray744[arg0];
		@Pc(13) int local13 = Class307.anIntArray743[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7002; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray528[local15] - this.anIntArray526[local15] * local9 >> 15;
			this.anIntArray526[local15] = this.anIntArray526[local15] * local13 + this.anIntArray528[local15] * local9 >> 15;
			this.anIntArray528[local15] = local34;
		}
		this.aBoolean465 = false;
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.aShort102 = (short) arg0;
		if (this.aClass188_8 != null) {
			this.aClass188_8.anInterface16_1 = null;
		}
		if (this.aClass188_7 != null) {
			this.aClass188_7.anInterface16_1 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7002; local7++) {
			this.anIntArray526[local7] = -this.anIntArray526[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt7020; local25++) {
			this.aShortArray130[local25] = (short) -this.aShortArray130[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt7014; local44++) {
			@Pc(51) short local51 = this.aShortArray128[local44];
			this.aShortArray128[local44] = this.aShortArray132[local44];
			this.aShortArray132[local44] = local51;
		}
		if (this.aClass188_7 == null && this.aClass188_8 != null) {
			this.aClass188_8.anInterface16_1 = null;
		}
		if (this.aClass188_7 != null) {
			this.aClass188_7.anInterface16_1 = null;
		}
		if (this.aClass188_10 != null) {
			this.aClass188_10.anInterface16_1 = null;
		}
		if (this.aClass136_1 != null) {
			this.aClass136_1.anInterface7_1 = null;
		}
		this.aBoolean465 = false;
	}
}
