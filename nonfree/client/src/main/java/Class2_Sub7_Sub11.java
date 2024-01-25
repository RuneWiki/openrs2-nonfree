import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class2_Sub7_Sub11 extends Class2_Sub7 {

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "[I")
	private final int[] anIntArray436;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "[I")
	private final int[] anIntArray435;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Lclient!au;")
	private final Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "Lclient!au;")
	private final Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "Lclient!au;")
	private final Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "[Lclient!au;")
	private final Class2_Sub4[] aClass2_Sub4Array31;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	private Class2_Sub7_Sub11() {
		this.anIntArray436 = new int[0];
		this.anIntArray435 = new int[0];
		this.aClass2_Sub4_1 = new Class2_Sub4_Sub25(0);
		this.aClass2_Sub4_1.anInt10456 = 1;
		this.aClass2_Sub4_3 = new Class2_Sub4_Sub25();
		this.aClass2_Sub4_3.anInt10456 = 1;
		this.aClass2_Sub4_2 = new Class2_Sub4_Sub25();
		this.aClass2_Sub4Array31 = new Class2_Sub4[] { this.aClass2_Sub4_3, this.aClass2_Sub4_2, this.aClass2_Sub4_1 };
		this.aClass2_Sub4_2.anInt10456 = 1;
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class2_Sub7_Sub11(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method2859();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub4Array31 = new Class2_Sub4[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub4 local26 = Static197.method3394(arg0);
			if (local26.method8893() >= 0) {
				local9++;
			}
			if (local26.method8888() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub4Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method2859();
			}
			this.aClass2_Sub4Array31[local20] = local26;
		}
		this.anIntArray435 = new int[local9];
		this.anIntArray436 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class2_Sub4 local102 = this.aClass2_Sub4Array31[local95];
			local50 = local102.aClass2_Sub4Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub4Array42[local108] = this.aClass2_Sub4Array31[local18[local95][local108]];
			}
			@Pc(134) int local134 = local102.method8893();
			@Pc(138) int local138 = local102.method8888();
			if (local134 > 0) {
				this.anIntArray435[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray436[local11++] = local138;
			}
			local18[local95] = null;
		}
		this.aClass2_Sub4_3 = this.aClass2_Sub4Array31[arg0.method2859()];
		this.aClass2_Sub4_2 = this.aClass2_Sub4Array31[arg0.method2859()];
		this.aClass2_Sub4_1 = this.aClass2_Sub4Array31[arg0.method2859()];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLclient!nd;IIZIDLclient!d;)[I")
	public int[] method5704(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) double arg5, @OriginalArg(7) Interface2 arg6) {
		Static353.anInterface2_9 = arg6;
		Static565.aClass238_258 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array31.length; local11++) {
			this.aClass2_Sub4Array31[local11].method8891(arg4, arg2);
		}
		Static132.method2449(arg5);
		Static267.method4404(arg2, arg4);
		@Pc(43) int[] local43 = new int[arg4 * arg2];
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) byte local53;
		if (arg0) {
			local49 = arg4 - 1;
			local51 = -1;
			local53 = -1;
		} else {
			local53 = 1;
			local51 = arg4;
			local49 = 0;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
			if (arg3) {
				local63 = local65;
			}
			@Pc(85) int[] local85;
			@Pc(87) int[] local87;
			@Pc(83) int[] local83;
			if (this.aClass2_Sub4_3.aBoolean763) {
				@Pc(81) int[] local81 = this.aClass2_Sub4_3.method8900(local65);
				local83 = local81;
				local85 = local81;
				local87 = local81;
			} else {
				@Pc(95) int[][] local95 = this.aClass2_Sub4_3.method8901(local65);
				local83 = local95[2];
				local85 = local95[0];
				local87 = local95[1];
			}
			for (@Pc(109) int local109 = local49; local109 != local51; local109 += local53) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local87[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(152) int local152 = local83[local109] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				local135 = Static184.anIntArray237[local135];
				local117 = Static184.anIntArray237[local117];
				local152 = Static184.anIntArray237[local152];
				@Pc(185) int local185 = local152 + (local135 << 8) + (local117 << 16);
				if (local185 != 0) {
					local185 |= 0xFF000000;
				}
				local43[local63++] = local185;
				if (arg3) {
					local63 += arg4 - 1;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass2_Sub4Array31.length; local225++) {
			this.aClass2_Sub4Array31[local225].method8890();
		}
		return local43;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BZLclient!d;IILclient!nd;)[F")
	public float[] method5706(@OriginalArg(1) boolean arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class238 arg4) {
		Static565.aClass238_258 = arg4;
		Static353.anInterface2_9 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array31.length; local11++) {
			this.aClass2_Sub4Array31[local11].method8891(arg3, arg2);
		}
		Static267.method4404(arg2, arg3);
		@Pc(42) float[] local42 = new float[arg2 * 4 * arg3];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg2; local46++) {
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			@Pc(62) int[] local62;
			if (this.aClass2_Sub4_3.aBoolean763) {
				@Pc(78) int[] local78 = this.aClass2_Sub4_3.method8900(local46);
				local70 = local78;
				local66 = local78;
				local62 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass2_Sub4_3.method8901(local46);
				local62 = local58[2];
				local66 = local58[0];
				local70 = local58[1];
			}
			@Pc(94) int[] local94;
			if (this.aClass2_Sub4_2.aBoolean763) {
				local94 = this.aClass2_Sub4_2.method8900(local46);
			} else {
				local94 = this.aClass2_Sub4_2.method8901(local46)[0];
			}
			if (arg0) {
				local44 = local46 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass2_Sub4_1.aBoolean763) {
				local122 = this.aClass2_Sub4_1.method8900(local46);
			} else {
				local122 = this.aClass2_Sub4_1.method8901(local46)[0];
			}
			for (@Pc(134) int local134 = arg3 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local122[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local66[local134] * local170;
				local42[local44++] = (float) local70[local134] * local170;
				local42[local44++] = (float) local62[local134] * local170;
				local42[local44++] = local143;
				if (arg0) {
					local44 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass2_Sub4Array31.length; local237++) {
			this.aClass2_Sub4Array31[local237].method8890();
		}
		return local42;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!d;Lclient!nd;)Z")
	public boolean method5707(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class238 arg1) {
		@Pc(12) int local12;
		if (Static60.anInt1448 < 0) {
			for (local12 = 0; local12 < this.anIntArray435.length; local12++) {
				if (!arg1.method5568(this.anIntArray435[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray435.length; local12++) {
				if (!arg1.method5571(this.anIntArray435[local12], Static60.anInt1448)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray436.length; local12++) {
			if (!arg0.method6026(this.anIntArray436[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IDLclient!d;ZBILclient!nd;)[I")
	public int[] method5709(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class238 arg5) {
		Static565.aClass238_258 = arg5;
		Static353.anInterface2_9 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array31.length; local11++) {
			this.aClass2_Sub4Array31[local11].method8891(arg0, arg4);
		}
		Static132.method2449(arg1);
		Static267.method4404(arg4, arg0);
		@Pc(39) int[] local39 = new int[arg4 * arg0];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg4; local43++) {
			@Pc(59) int[] local59;
			@Pc(61) int[] local61;
			@Pc(57) int[] local57;
			@Pc(55) int[] local55;
			if (this.aClass2_Sub4_3.aBoolean763) {
				local55 = this.aClass2_Sub4_3.method8900(local43);
				local57 = local55;
				local59 = local55;
				local61 = local55;
			} else {
				@Pc(69) int[][] local69 = this.aClass2_Sub4_3.method8901(local43);
				local57 = local69[2];
				local61 = local69[1];
				local59 = local69[0];
			}
			if (this.aClass2_Sub4_2.aBoolean763) {
				local55 = this.aClass2_Sub4_2.method8900(local43);
			} else {
				local55 = this.aClass2_Sub4_2.method8901(local43)[0];
			}
			if (arg3) {
				local41 = local43;
			}
			for (@Pc(111) int local111 = arg0 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local59[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(136) int local136 = local61[local111] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(154) int local154 = local57[local111] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				local119 = Static184.anIntArray237[local119];
				local136 = Static184.anIntArray237[local136];
				local154 = Static184.anIntArray237[local154];
				@Pc(192) int local192;
				if (local119 == 0 && local136 == 0 && local154 == 0) {
					local192 = 0;
				} else {
					local192 = local55[local111] >> 4;
					if (local192 > 255) {
						local192 = 255;
					}
					if (local192 < 0) {
						local192 = 0;
					}
				}
				local39[local41++] = (local119 << 16) + (local192 << 24) + (local136 << 8) + local154;
				if (arg3) {
					local41 += arg0 - 1;
				}
			}
		}
		for (@Pc(247) int local247 = 0; local247 < this.aClass2_Sub4Array31.length; local247++) {
			this.aClass2_Sub4Array31[local247].method8890();
		}
		return local39;
	}
}
