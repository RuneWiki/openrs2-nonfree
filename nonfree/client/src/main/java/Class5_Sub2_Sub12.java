import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!no", name = "E", descriptor = "[I")
	private final int[] anIntArray343;

	@OriginalMember(owner = "client!no", name = "J", descriptor = "[I")
	private final int[] anIntArray344;

	@OriginalMember(owner = "client!no", name = "B", descriptor = "Lclient!ub;")
	private final Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!no", name = "C", descriptor = "Lclient!ub;")
	private final Class5_Sub1 aClass5_Sub1_2;

	@OriginalMember(owner = "client!no", name = "I", descriptor = "Lclient!ub;")
	private final Class5_Sub1 aClass5_Sub1_3;

	@OriginalMember(owner = "client!no", name = "H", descriptor = "[Lclient!ub;")
	private final Class5_Sub1[] aClass5_Sub1Array31;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	private Class5_Sub2_Sub12() {
		this.anIntArray343 = new int[0];
		this.anIntArray344 = new int[0];
		this.aClass5_Sub1_1 = new Class5_Sub1_Sub17(0);
		this.aClass5_Sub1_1.anInt7254 = 1;
		this.aClass5_Sub1_2 = new Class5_Sub1_Sub17();
		this.aClass5_Sub1_2.anInt7254 = 1;
		this.aClass5_Sub1_3 = new Class5_Sub1_Sub17();
		this.aClass5_Sub1Array31 = new Class5_Sub1[] { this.aClass5_Sub1_2, this.aClass5_Sub1_3, this.aClass5_Sub1_1 };
		this.aClass5_Sub1_3.anInt7254 = 1;
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class5_Sub2_Sub12(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method5539();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub1Array31 = new Class5_Sub1[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub1 local26 = Static409.method5399(arg0);
			if (local26.method5766() >= 0) {
				local9++;
			}
			if (local26.method5769() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass5_Sub1Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method5539();
			}
			this.aClass5_Sub1Array31[local20] = local26;
		}
		this.anIntArray344 = new int[local9];
		this.anIntArray343 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class5_Sub1 local102 = this.aClass5_Sub1Array31[local95];
			local50 = local102.aClass5_Sub1Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass5_Sub1Array42[local108] = this.aClass5_Sub1Array31[local14[local95][local108]];
			}
			@Pc(134) int local134 = local102.method5766();
			@Pc(138) int local138 = local102.method5769();
			if (local134 > 0) {
				this.anIntArray344[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray343[local11++] = local138;
			}
			local14[local95] = null;
		}
		this.aClass5_Sub1_2 = this.aClass5_Sub1Array31[arg0.method5539()];
		this.aClass5_Sub1_3 = this.aClass5_Sub1Array31[arg0.method5539()];
		this.aClass5_Sub1_1 = this.aClass5_Sub1Array31[arg0.method5539()];
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!l;Lclient!um;)Z")
	public boolean method3515(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Class243 arg1) {
		@Pc(10) int local10;
		if (Static308.anInt4794 < 0) {
			for (local10 = 0; local10 < this.anIntArray344.length; local10++) {
				if (!arg1.method5463(this.anIntArray344[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray344.length; local10++) {
				if (!arg1.method5482(Static308.anInt4794, this.anIntArray344[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray343.length; local10++) {
			if (!arg0.method4123(this.anIntArray343[local10])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLclient!um;ILclient!l;II)[F")
	public float[] method3517(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static185.anInterface8_55 = arg2;
		Static165.aClass243_96 = arg1;
		for (@Pc(16) int local16 = 0; local16 < this.aClass5_Sub1Array31.length; local16++) {
			this.aClass5_Sub1Array31[local16].method5767(arg3, arg4);
		}
		Static320.method3944(arg3, arg4);
		@Pc(43) float[] local43 = new float[arg3 * 4 * arg4];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
			@Pc(63) int[] local63;
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			if (this.aClass5_Sub1_2.aBoolean486) {
				@Pc(79) int[] local79 = this.aClass5_Sub1_2.method5770(local47);
				local71 = local79;
				local63 = local79;
				local67 = local79;
			} else {
				@Pc(59) int[][] local59 = this.aClass5_Sub1_2.method5763(local47);
				local63 = local59[0];
				local67 = local59[1];
				local71 = local59[2];
			}
			@Pc(97) int[] local97;
			if (this.aClass5_Sub1_3.aBoolean486) {
				local97 = this.aClass5_Sub1_3.method5770(local47);
			} else {
				local97 = this.aClass5_Sub1_3.method5763(local47)[0];
			}
			@Pc(117) int[] local117;
			if (this.aClass5_Sub1_1.aBoolean486) {
				local117 = this.aClass5_Sub1_1.method5770(local47);
			} else {
				local117 = this.aClass5_Sub1_1.method5763(local47)[0];
			}
			if (arg0) {
				local45 = local47 << 2;
			}
			for (@Pc(135) int local135 = arg4 - 1; local135 >= 0; local135--) {
				@Pc(144) float local144 = (float) local97[local135] / 4096.0F;
				if (local144 < 0.0F) {
					local144 = 0.0F;
				} else if (local144 > 1.0F) {
					local144 = 1.0F;
				}
				@Pc(171) float local171 = ((float) local117[local135] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local43[local45++] = local171 * (float) local63[local135];
				local43[local45++] = (float) local67[local135] * local171;
				local43[local45++] = local171 * (float) local71[local135];
				local43[local45++] = local144;
				if (arg0) {
					local45 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass5_Sub1Array31.length; local228++) {
			this.aClass5_Sub1Array31[local228].method5768();
		}
		return local43;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BZDIILclient!um;Lclient!l;)[I")
	public int[] method3521(@OriginalArg(1) boolean arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class243 arg4, @OriginalArg(6) Interface8 arg5) {
		Static165.aClass243_96 = arg4;
		Static185.anInterface8_55 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub1Array31.length; local11++) {
			this.aClass5_Sub1Array31[local11].method5767(arg2, arg3);
		}
		Static82.method1227(arg1);
		Static320.method3944(arg2, arg3);
		@Pc(41) int[] local41 = new int[arg2 * 4 * arg3];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg2; local45++) {
			@Pc(69) int[] local69;
			@Pc(61) int[] local61;
			@Pc(65) int[] local65;
			@Pc(77) int[] local77;
			if (this.aClass5_Sub1_2.aBoolean486) {
				local77 = this.aClass5_Sub1_2.method5770(local45);
				local69 = local77;
				local65 = local77;
				local61 = local77;
			} else {
				@Pc(57) int[][] local57 = this.aClass5_Sub1_2.method5763(local45);
				local61 = local57[1];
				local65 = local57[2];
				local69 = local57[0];
			}
			if (arg0) {
				local43 = local45;
			}
			if (this.aClass5_Sub1_3.aBoolean486) {
				local77 = this.aClass5_Sub1_3.method5770(local45);
			} else {
				local77 = this.aClass5_Sub1_3.method5763(local45)[0];
			}
			for (@Pc(111) int local111 = arg3 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local69[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(139) int local139 = local61[local111] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(156) int local156 = local65[local111] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local119 = Static268.anIntArray335[local119];
				if (local156 < 0) {
					local156 = 0;
				}
				local139 = Static268.anIntArray335[local139];
				local156 = Static268.anIntArray335[local156];
				@Pc(194) int local194;
				if (local119 == 0 && local139 == 0 && local156 == 0) {
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
				local41[local43++] = (local139 << 8) + (local194 << 24) + (local119 << 16) + local156;
				if (arg0) {
					local43 += arg3 - 1;
				}
			}
		}
		for (@Pc(257) int local257 = 0; local257 < this.aClass5_Sub1Array31.length; local257++) {
			this.aClass5_Sub1Array31[local257].method5768();
		}
		return local41;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZILclient!um;ZILclient!l;D)[I")
	public int[] method3522(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class243 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Interface8 arg5, @OriginalArg(7) double arg6) {
		Static185.anInterface8_55 = arg5;
		Static165.aClass243_96 = arg3;
		for (@Pc(16) int local16 = 0; local16 < this.aClass5_Sub1Array31.length; local16++) {
			this.aClass5_Sub1Array31[local16].method5767(arg2, arg0);
		}
		Static82.method1227(arg6);
		Static320.method3944(arg2, arg0);
		@Pc(44) int[] local44 = new int[arg2 * arg0];
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(50) byte local50;
		if (arg4) {
			local50 = -1;
			local48 = -1;
			local52 = arg0 - 1;
		} else {
			local48 = arg0;
			local50 = 1;
			local52 = 0;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg2; local66++) {
			if (arg1) {
				local64 = local66;
			}
			@Pc(84) int[] local84;
			@Pc(88) int[] local88;
			@Pc(86) int[] local86;
			if (this.aClass5_Sub1_2.aBoolean486) {
				@Pc(82) int[] local82 = this.aClass5_Sub1_2.method5770(local66);
				local84 = local82;
				local86 = local82;
				local88 = local82;
			} else {
				@Pc(96) int[][] local96 = this.aClass5_Sub1_2.method5763(local66);
				local86 = local96[2];
				local84 = local96[0];
				local88 = local96[1];
			}
			for (@Pc(110) int local110 = local52; local110 != local48; local110 += local50) {
				@Pc(118) int local118 = local84[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(138) int local138 = local88[local110] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(158) int local158 = local86[local110] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local138 = Static268.anIntArray335[local138];
				local118 = Static268.anIntArray335[local118];
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static268.anIntArray335[local158];
				@Pc(195) int local195 = (local118 << 16) - (-(local138 << 8) - local158);
				if (local195 != 0) {
					local195 |= 0xFF000000;
				}
				local44[local64++] = local195;
				if (arg1) {
					local64 += arg0 - 1;
				}
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.aClass5_Sub1Array31.length; local238++) {
			this.aClass5_Sub1Array31[local238].method5768();
		}
		return local44;
	}
}
