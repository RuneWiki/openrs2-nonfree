import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub5_Sub4 extends Class2_Sub5 {

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "[I")
	private final int[] anIntArray120;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "[I")
	private final int[] anIntArray119;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!vl;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!vl;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "Lclient!vl;")
	private final Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "[Lclient!vl;")
	private final Class2_Sub2[] aClass2_Sub2Array5;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	private Class2_Sub5_Sub4() {
		this.anIntArray120 = new int[0];
		this.anIntArray119 = new int[0];
		this.aClass2_Sub2_2 = new Class2_Sub2_Sub22(0);
		this.aClass2_Sub2_2.anInt7416 = 1;
		this.aClass2_Sub2_1 = new Class2_Sub2_Sub22();
		this.aClass2_Sub2_1.anInt7416 = 1;
		this.aClass2_Sub2_3 = new Class2_Sub2_Sub22();
		this.aClass2_Sub2_3.anInt7416 = 1;
		this.aClass2_Sub2Array5 = new Class2_Sub2[] { this.aClass2_Sub2_1, this.aClass2_Sub2_3, this.aClass2_Sub2_2 };
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class2_Sub5_Sub4(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(7) int local7 = arg0.method5495();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub2Array5 = new Class2_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub2 local26 = Static355.method4856(arg0);
			if (local26.method5837() >= 0) {
				local9++;
			}
			if (local26.method5841() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method5495();
			}
			this.aClass2_Sub2Array5[local20] = local26;
		}
		this.anIntArray119 = new int[local9];
		local9 = 0;
		this.anIntArray120 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class2_Sub2 local102 = this.aClass2_Sub2Array5[local95];
			local50 = local102.aClass2_Sub2Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub2Array42[local108] = this.aClass2_Sub2Array5[local18[local95][local108]];
			}
			@Pc(130) int local130 = local102.method5837();
			@Pc(134) int local134 = local102.method5841();
			if (local130 > 0) {
				this.anIntArray119[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray120[local11++] = local134;
			}
			local18[local95] = null;
		}
		this.aClass2_Sub2_1 = this.aClass2_Sub2Array5[arg0.method5495()];
		this.aClass2_Sub2_3 = this.aClass2_Sub2Array5[arg0.method5495()];
		this.aClass2_Sub2_2 = this.aClass2_Sub2Array5[arg0.method5495()];
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ga;ZZIDILclient!mg;Z)[I")
	public int[] method1162(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class160 arg5, @OriginalArg(7) boolean arg6) {
		Static236.anInterface4_4 = arg0;
		Static33.aClass160_5 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array5.length; local11++) {
			this.aClass2_Sub2Array5[local11].method5847(arg2, arg4);
		}
		Static123.method2166(arg3);
		Static22.method463(arg4, arg2);
		@Pc(39) int[] local39 = new int[arg2 * arg4];
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg1) {
			local45 = arg2 - 1;
			local47 = -1;
			local49 = -1;
		} else {
			local47 = arg2;
			local45 = 0;
			local49 = 1;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg4; local61++) {
			@Pc(85) int[] local85;
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			if (this.aClass2_Sub2_1.aBoolean488) {
				@Pc(93) int[] local93 = this.aClass2_Sub2_1.method5849(local61);
				local85 = local93;
				local77 = local93;
				local81 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass2_Sub2_1.method5836(local61);
				local77 = local73[1];
				local81 = local73[2];
				local85 = local73[0];
			}
			if (arg6) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local45; local105 != local47; local105 += local49) {
				@Pc(113) int local113 = local85[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(131) int local131 = local77[local105] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(149) int local149 = local81[local105] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				local131 = Static235.anIntArray520[local131];
				local113 = Static235.anIntArray520[local113];
				local149 = Static235.anIntArray520[local149];
				@Pc(186) int local186 = (local131 << 8) + ((local113 << 16) + local149);
				if (local186 != 0) {
					local186 |= 0xFF000000;
				}
				local39[local59++] = local186;
				if (arg6) {
					local59 += arg2 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass2_Sub2Array5.length; local229++) {
			this.aClass2_Sub2Array5[local229].method5842();
		}
		return local39;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!mg;DIZILclient!ga;)[I")
	public int[] method1164(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Interface4 arg5) {
		Static236.anInterface4_4 = arg5;
		Static33.aClass160_5 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array5.length; local11++) {
			this.aClass2_Sub2Array5[local11].method5847(arg3, arg0);
		}
		Static123.method2166(arg2);
		Static22.method463(arg0, arg3);
		@Pc(41) int[] local41 = new int[arg0 * arg3 * 4];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			@Pc(61) int[] local61;
			@Pc(77) int[] local77;
			if (this.aClass2_Sub2_1.aBoolean488) {
				local77 = this.aClass2_Sub2_1.method5849(local45);
				local61 = local77;
				local65 = local77;
				local69 = local77;
			} else {
				@Pc(57) int[][] local57 = this.aClass2_Sub2_1.method5836(local45);
				local61 = local57[2];
				local65 = local57[0];
				local69 = local57[1];
			}
			if (arg4) {
				local43 = local45;
			}
			if (this.aClass2_Sub2_3.aBoolean488) {
				local77 = this.aClass2_Sub2_3.method5849(local45);
			} else {
				local77 = this.aClass2_Sub2_3.method5836(local45)[0];
			}
			for (@Pc(111) int local111 = arg3 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local65[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local69[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(155) int local155 = local61[local111] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				local119 = Static235.anIntArray520[local119];
				if (local155 < 0) {
					local155 = 0;
				}
				local137 = Static235.anIntArray520[local137];
				local155 = Static235.anIntArray520[local155];
				@Pc(194) int local194;
				if (local119 == 0 && local137 == 0 && local155 == 0) {
					local194 = 0;
				} else {
					local194 = local77[local111] >> 4;
					if (local194 > 255) {
						local194 = 255;
					}
					if (local194 < 0) {
						local194 = 0;
					}
				}
				local41[local43++] = (local137 << 8) + (local119 << 16) + (local194 << 24) + local155;
				if (arg4) {
					local43 += arg3 - 1;
				}
			}
		}
		for (@Pc(245) int local245 = 0; local245 < this.aClass2_Sub2Array5.length; local245++) {
			this.aClass2_Sub2Array5[local245].method5842();
		}
		return local41;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ga;Lclient!mg;ZII)[F")
	public float[] method1165(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static33.aClass160_5 = arg1;
		Static236.anInterface4_4 = arg0;
		for (@Pc(23) int local23 = 0; local23 < this.aClass2_Sub2Array5.length; local23++) {
			this.aClass2_Sub2Array5[local23].method5847(arg4, arg3);
		}
		Static22.method463(arg3, arg4);
		@Pc(54) float[] local54 = new float[arg3 * 4 * arg4];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < arg3; local58++) {
			@Pc(78) int[] local78;
			@Pc(74) int[] local74;
			@Pc(82) int[] local82;
			if (this.aClass2_Sub2_1.aBoolean488) {
				@Pc(92) int[] local92 = this.aClass2_Sub2_1.method5849(local58);
				local74 = local92;
				local82 = local92;
				local78 = local92;
			} else {
				@Pc(70) int[][] local70 = this.aClass2_Sub2_1.method5836(local58);
				local74 = local70[1];
				local78 = local70[0];
				local82 = local70[2];
			}
			@Pc(108) int[] local108;
			if (this.aClass2_Sub2_3.aBoolean488) {
				local108 = this.aClass2_Sub2_3.method5849(local58);
			} else {
				local108 = this.aClass2_Sub2_3.method5836(local58)[0];
			}
			@Pc(130) int[] local130;
			if (this.aClass2_Sub2_2.aBoolean488) {
				local130 = this.aClass2_Sub2_2.method5849(local58);
			} else {
				local130 = this.aClass2_Sub2_2.method5836(local58)[0];
			}
			if (arg2) {
				local56 = local58 << 2;
			}
			for (@Pc(152) int local152 = arg4 - 1; local152 >= 0; local152--) {
				@Pc(161) float local161 = (float) local108[local152] / 4096.0F;
				@Pc(174) float local174 = ((float) local130[local152] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local161 < 0.0F) {
					local161 = 0.0F;
				} else if (local161 > 1.0F) {
					local161 = 1.0F;
				}
				local54[local56++] = local174 * (float) local78[local152];
				local54[local56++] = (float) local74[local152] * local174;
				local54[local56++] = local174 * (float) local82[local152];
				local54[local56++] = local161;
				if (arg2) {
					local56 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(242) int local242 = 0; local242 < this.aClass2_Sub2Array5.length; local242++) {
			this.aClass2_Sub2Array5[local242].method5842();
		}
		return local54;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ga;BLclient!mg;)Z")
	public boolean method1166(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class160 arg1) {
		@Pc(9) int local9;
		if (Static129.anInt2791 >= 0) {
			for (local9 = 0; local9 < this.anIntArray119.length; local9++) {
				if (!arg1.method3698(Static129.anInt2791, this.anIntArray119[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray119.length; local9++) {
				if (!arg1.method3716(this.anIntArray119[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray120.length; local9++) {
			if (!arg0.method3792(this.anIntArray120[local9])) {
				return false;
			}
		}
		return true;
	}
}
