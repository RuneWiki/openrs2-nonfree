import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class5_Sub5_Sub10 extends Class5_Sub5 {

	@OriginalMember(owner = "client!hv", name = "C", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[16384];

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16384];

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "[I")
	private final int[] anIntArray207;

	@OriginalMember(owner = "client!hv", name = "H", descriptor = "[I")
	private final int[] anIntArray208;

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "Lclient!fw;")
	private final Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "Lclient!fw;")
	private final Class5_Sub2 aClass5_Sub2_2;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "Lclient!fw;")
	private final Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "[Lclient!fw;")
	private final Class5_Sub2[] aClass5_Sub2Array17;

	static {
		@Pc(241) double local241 = 3.834951969714103E-4D;
		for (@Pc(243) int local243 = 0; local243 < 16384; local243++) {
			aFloatArray25[local243] = (float) Math.sin((double) local243 * local241);
			aFloatArray24[local243] = (float) Math.cos((double) local243 * local241);
		}
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	private Class5_Sub5_Sub10() {
		this.anIntArray207 = new int[0];
		this.anIntArray208 = new int[0];
		this.aClass5_Sub2_3 = new Class5_Sub2_Sub38(0);
		this.aClass5_Sub2_3.anInt10638 = 1;
		this.aClass5_Sub2_2 = new Class5_Sub2_Sub38();
		this.aClass5_Sub2_2.anInt10638 = 1;
		this.aClass5_Sub2_1 = new Class5_Sub2_Sub38();
		this.aClass5_Sub2Array17 = new Class5_Sub2[] { this.aClass5_Sub2_2, this.aClass5_Sub2_1, this.aClass5_Sub2_3 };
		this.aClass5_Sub2_1.anInt10638 = 1;
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!ofa;)V")
	public Class5_Sub5_Sub10(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(7) int local7 = arg0.method5966();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub2Array17 = new Class5_Sub2[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub2 local26 = Static642.method8630(arg0);
			if (local26.method9039() >= 0) {
				local9++;
			}
			if (local26.method9032() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass5_Sub2Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method5966();
			}
			this.aClass5_Sub2Array17[local20] = local26;
		}
		this.anIntArray207 = new int[local9];
		local9 = 0;
		this.anIntArray208 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class5_Sub2 local102 = this.aClass5_Sub2Array17[local95];
			local50 = local102.aClass5_Sub2Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass5_Sub2Array42[local108] = this.aClass5_Sub2Array17[local14[local95][local108]];
			}
			@Pc(130) int local130 = local102.method9039();
			@Pc(134) int local134 = local102.method9032();
			if (local130 > 0) {
				this.anIntArray207[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray208[local11++] = local134;
			}
			local14[local95] = null;
		}
		this.aClass5_Sub2_2 = this.aClass5_Sub2Array17[arg0.method5966()];
		this.aClass5_Sub2_1 = this.aClass5_Sub2Array17[arg0.method5966()];
		this.aClass5_Sub2_3 = this.aClass5_Sub2Array17[arg0.method5966()];
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZLclient!la;IIDLclient!d;)[I")
	public int[] method3699(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Interface3 arg5) {
		Static493.anInterface3_11 = arg5;
		Static431.aClass207_75 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array17.length; local11++) {
			this.aClass5_Sub2Array17[local11].method9043(arg0, arg3);
		}
		Static29.method326(arg4);
		Static53.method914(arg0, arg3);
		@Pc(39) int[] local39 = new int[arg0 * arg3];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg3; local43++) {
			@Pc(57) int[] local57;
			@Pc(61) int[] local61;
			@Pc(59) int[] local59;
			@Pc(55) int[] local55;
			if (this.aClass5_Sub2_2.aBoolean762) {
				local55 = this.aClass5_Sub2_2.method9034(local43);
				local57 = local55;
				local59 = local55;
				local61 = local55;
			} else {
				@Pc(69) int[][] local69 = this.aClass5_Sub2_2.method9037(local43);
				local57 = local69[0];
				local61 = local69[1];
				local59 = local69[2];
			}
			if (this.aClass5_Sub2_1.aBoolean762) {
				local55 = this.aClass5_Sub2_1.method9034(local43);
			} else {
				local55 = this.aClass5_Sub2_1.method9037(local43)[0];
			}
			if (arg1) {
				local41 = local43;
			}
			for (@Pc(109) int local109 = arg0 - 1; local109 >= 0; local109--) {
				@Pc(117) int local117 = local57[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local61[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(153) int local153 = local59[local109] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local135 = Static542.anIntArray505[local135];
				if (local153 < 0) {
					local153 = 0;
				}
				local117 = Static542.anIntArray505[local117];
				local153 = Static542.anIntArray505[local153];
				@Pc(187) int local187;
				if (local117 == 0 && local135 == 0 && local153 == 0) {
					local187 = 0;
				} else {
					local187 = local55[local109] >> 4;
					if (local187 > 255) {
						local187 = 255;
					}
					if (local187 < 0) {
						local187 = 0;
					}
				}
				local39[local41++] = (local135 << 8) + (local187 << 24) + (local117 << 16) + local153;
				if (arg1) {
					local41 += arg0 - 1;
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < this.aClass5_Sub2Array17.length; local252++) {
			this.aClass5_Sub2Array17[local252].method9038();
		}
		return local39;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!d;ZLclient!la;ZZDI)[I")
	public int[] method3701(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class207 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) double arg5, @OriginalArg(7) int arg6) {
		Static493.anInterface3_11 = arg1;
		Static431.aClass207_75 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array17.length; local11++) {
			this.aClass5_Sub2Array17[local11].method9043(arg0, arg6);
		}
		Static29.method326(arg5);
		Static53.method914(arg0, arg6);
		@Pc(43) int[] local43 = new int[arg0 * arg6];
		@Pc(56) int local56;
		@Pc(52) int local52;
		@Pc(58) byte local58;
		if (arg4) {
			local52 = -1;
			local56 = arg0 - 1;
			local58 = -1;
		} else {
			local56 = 0;
			local52 = arg0;
			local58 = 1;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg6; local70++) {
			if (arg2) {
				local68 = local70;
			}
			@Pc(88) int[] local88;
			@Pc(92) int[] local92;
			@Pc(90) int[] local90;
			if (this.aClass5_Sub2_2.aBoolean762) {
				@Pc(86) int[] local86 = this.aClass5_Sub2_2.method9034(local70);
				local88 = local86;
				local90 = local86;
				local92 = local86;
			} else {
				@Pc(100) int[][] local100 = this.aClass5_Sub2_2.method9037(local70);
				local92 = local100[1];
				local90 = local100[2];
				local88 = local100[0];
			}
			for (@Pc(114) int local114 = local56; local114 != local52; local114 += local58) {
				@Pc(122) int local122 = local88[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(137) int local137 = local92[local114] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(154) int local154 = local90[local114] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				local122 = Static542.anIntArray505[local122];
				local137 = Static542.anIntArray505[local137];
				if (local154 < 0) {
					local154 = 0;
				}
				local154 = Static542.anIntArray505[local154];
				@Pc(191) int local191 = local154 + (local122 << 16) + (local137 << 8);
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local43[local68++] = local191;
				if (arg2) {
					local68 += arg0 - 1;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass5_Sub2Array17.length; local223++) {
			this.aClass5_Sub2Array17[local223].method9038();
		}
		return local43;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!la;IIZLclient!d;I)[F")
	public float[] method3704(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Interface3 arg4) {
		Static493.anInterface3_11 = arg4;
		Static431.aClass207_75 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array17.length; local11++) {
			this.aClass5_Sub2Array17[local11].method9043(arg2, arg1);
		}
		Static53.method914(arg2, arg1);
		@Pc(42) float[] local42 = new float[arg2 * arg1 * 4];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(77) int[] local77;
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			if (this.aClass5_Sub2_2.aBoolean762) {
				@Pc(85) int[] local85 = this.aClass5_Sub2_2.method9034(local53);
				local73 = local85;
				local69 = local85;
				local77 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass5_Sub2_2.method9037(local53);
				local69 = local65[1];
				local73 = local65[2];
				local77 = local65[0];
			}
			@Pc(101) int[] local101;
			if (this.aClass5_Sub2_1.aBoolean762) {
				local101 = this.aClass5_Sub2_1.method9034(local53);
			} else {
				local101 = this.aClass5_Sub2_1.method9037(local53)[0];
			}
			if (arg3) {
				local51 = local53 << 2;
			}
			@Pc(129) int[] local129;
			if (this.aClass5_Sub2_3.aBoolean762) {
				local129 = this.aClass5_Sub2_3.method9034(local53);
			} else {
				local129 = this.aClass5_Sub2_3.method9037(local53)[0];
			}
			for (@Pc(141) int local141 = arg2 - 1; local141 >= 0; local141--) {
				@Pc(150) float local150 = (float) local101[local141] / 4096.0F;
				@Pc(163) float local163 = ((float) local129[local141] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local150 < 0.0F) {
					local150 = 0.0F;
				} else if (local150 > 1.0F) {
					local150 = 1.0F;
				}
				local42[local51++] = (float) local77[local141] * local163;
				local42[local51++] = (float) local69[local141] * local163;
				local42[local51++] = (float) local73[local141] * local163;
				local42[local51++] = local150;
				if (arg3) {
					local51 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.aClass5_Sub2Array17.length; local238++) {
			this.aClass5_Sub2Array17[local238].method9038();
		}
		return local42;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!d;ILclient!la;)Z")
	public boolean method3705(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class207 arg1) {
		@Pc(12) int local12;
		if (Static243.anInt4465 < 0) {
			for (local12 = 0; local12 < this.anIntArray207.length; local12++) {
				if (!arg1.method4678(this.anIntArray207[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray207.length; local12++) {
				if (!arg1.method4697(Static243.anInt4465, this.anIntArray207[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray208.length; local12++) {
			if (!arg0.method4654(this.anIntArray208[local12])) {
				return false;
			}
		}
		return true;
	}
}
