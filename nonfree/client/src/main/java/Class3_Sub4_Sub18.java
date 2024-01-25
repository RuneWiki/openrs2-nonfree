import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class3_Sub4_Sub18 extends Class3_Sub4 {

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "[I")
	private final int[] anIntArray531;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "[I")
	private final int[] anIntArray530;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "Lclient!qn;")
	private final Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "Lclient!qn;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "Lclient!qn;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "[Lclient!qn;")
	private final Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	private Class3_Sub4_Sub18() {
		this.anIntArray531 = new int[0];
		this.anIntArray530 = new int[0];
		this.aClass3_Sub2_3 = new Class3_Sub2_Sub33(0);
		this.aClass3_Sub2_3.anInt7553 = 1;
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub33();
		this.aClass3_Sub2_2.anInt7553 = 1;
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub33();
		this.aClass3_Sub2Array42 = new Class3_Sub2[] { this.aClass3_Sub2_2, this.aClass3_Sub2_1, this.aClass3_Sub2_3 };
		this.aClass3_Sub2_1.anInt7553 = 1;
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!cu;)V")
	public Class3_Sub4_Sub18(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method2582();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub2Array42 = new Class3_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub2 local26 = Static288.method4089(arg0);
			if (local26.method5900() >= 0) {
				local9++;
			}
			if (local26.method5897() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass3_Sub2Array41.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method2582();
			}
			this.aClass3_Sub2Array42[local20] = local26;
		}
		this.anIntArray531 = new int[local9];
		local9 = 0;
		this.anIntArray530 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class3_Sub2 local102 = this.aClass3_Sub2Array42[local95];
			local50 = local102.aClass3_Sub2Array41.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass3_Sub2Array41[local108] = this.aClass3_Sub2Array42[local18[local95][local108]];
			}
			@Pc(134) int local134 = local102.method5900();
			@Pc(138) int local138 = local102.method5897();
			if (local134 > 0) {
				this.anIntArray531[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray530[local11++] = local138;
			}
			local18[local95] = null;
		}
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array42[arg0.method2582()];
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array42[arg0.method2582()];
		this.aClass3_Sub2_3 = this.aClass3_Sub2Array42[arg0.method2582()];
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!bu;BLclient!m;)Z")
	public boolean method5953(@OriginalArg(0) Class32 arg0, @OriginalArg(2) Interface5 arg1) {
		@Pc(12) int local12;
		if (Static24.anInt838 < 0) {
			for (local12 = 0; local12 < this.anIntArray531.length; local12++) {
				if (!arg0.method800(this.anIntArray531[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray531.length; local12++) {
				if (!arg0.method808(Static24.anInt838, this.anIntArray531[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray530.length; local12++) {
			if (!arg1.method3921(this.anIntArray530[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZDZLclient!m;ZLclient!bu;II)[I")
	public int[] method5956(@OriginalArg(1) double arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class32 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static32.anInterface5_1 = arg2;
		Static437.aClass32_87 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array42.length; local11++) {
			this.aClass3_Sub2Array42[local11].method5896(arg6, arg5);
		}
		Static421.method5373(arg0);
		Static44.method5688(arg5, arg6);
		@Pc(39) int[] local39 = new int[arg6 * arg5];
		@Pc(47) int local47;
		@Pc(45) int local45;
		@Pc(43) byte local43;
		if (arg3) {
			local43 = -1;
			local47 = arg5 - 1;
			local45 = -1;
		} else {
			local43 = 1;
			local45 = arg5;
			local47 = 0;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg6; local66++) {
			@Pc(82) int[] local82;
			@Pc(80) int[] local80;
			@Pc(84) int[] local84;
			if (this.aClass3_Sub2_2.aBoolean650) {
				@Pc(78) int[] local78 = this.aClass3_Sub2_2.method5895(local66);
				local80 = local78;
				local82 = local78;
				local84 = local78;
			} else {
				@Pc(92) int[][] local92 = this.aClass3_Sub2_2.method5901(local66);
				local84 = local92[2];
				local82 = local92[0];
				local80 = local92[1];
			}
			if (arg1) {
				local59 = local66;
			}
			for (@Pc(110) int local110 = local47; local110 != local45; local110 += local43) {
				@Pc(118) int local118 = local82[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(138) int local138 = local80[local110] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(156) int local156 = local84[local110] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local118 = Static171.anIntArray222[local118];
				local138 = Static171.anIntArray222[local138];
				if (local156 < 0) {
					local156 = 0;
				}
				local156 = Static171.anIntArray222[local156];
				@Pc(188) int local188 = (local118 << 16) + (local138 << 8) + local156;
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local39[local59++] = local188;
				if (arg1) {
					local59 += arg5 - 1;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass3_Sub2Array42.length; local231++) {
			this.aClass3_Sub2Array42[local231].method5893();
		}
		return local39;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!bu;ZILclient!m;II)[F")
	public float[] method5958(@OriginalArg(0) Class32 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(5) int arg4) {
		Static32.anInterface5_1 = arg3;
		Static437.aClass32_87 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array42.length; local11++) {
			this.aClass3_Sub2Array42[local11].method5896(arg2, arg4);
		}
		Static44.method5688(arg4, arg2);
		@Pc(51) float[] local51 = new float[arg2 * 4 * arg4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg2; local55++) {
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(79) int[] local79;
			if (this.aClass3_Sub2_2.aBoolean650) {
				@Pc(87) int[] local87 = this.aClass3_Sub2_2.method5895(local55);
				local75 = local87;
				local71 = local87;
				local79 = local87;
			} else {
				@Pc(67) int[][] local67 = this.aClass3_Sub2_2.method5901(local55);
				local71 = local67[0];
				local75 = local67[1];
				local79 = local67[2];
			}
			@Pc(103) int[] local103;
			if (this.aClass3_Sub2_1.aBoolean650) {
				local103 = this.aClass3_Sub2_1.method5895(local55);
			} else {
				local103 = this.aClass3_Sub2_1.method5901(local55)[0];
			}
			if (arg1) {
				local53 = local55 << 2;
			}
			@Pc(131) int[] local131;
			if (this.aClass3_Sub2_3.aBoolean650) {
				local131 = this.aClass3_Sub2_3.method5895(local55);
			} else {
				local131 = this.aClass3_Sub2_3.method5901(local55)[0];
			}
			for (@Pc(143) int local143 = arg4 - 1; local143 >= 0; local143--) {
				@Pc(152) float local152 = (float) local103[local143] / 4096.0F;
				@Pc(165) float local165 = ((float) local131[local143] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				local51[local53++] = local165 * (float) local71[local143];
				local51[local53++] = local165 * (float) local75[local143];
				local51[local53++] = local165 * (float) local79[local143];
				local51[local53++] = local152;
				if (arg1) {
					local53 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass3_Sub2Array42.length; local236++) {
			this.aClass3_Sub2Array42[local236].method5893();
		}
		return local51;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!bu;IBIDZLclient!m;)[I")
	public int[] method5959(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Interface5 arg5) {
		Static32.anInterface5_1 = arg5;
		Static437.aClass32_87 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array42.length; local11++) {
			this.aClass3_Sub2Array42[local11].method5896(arg2, arg1);
		}
		Static421.method5373(arg3);
		Static44.method5688(arg1, arg2);
		@Pc(50) int[] local50 = new int[arg1 * arg2 * 4];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg2; local54++) {
			@Pc(70) int[] local70;
			@Pc(68) int[] local68;
			@Pc(72) int[] local72;
			@Pc(66) int[] local66;
			if (this.aClass3_Sub2_2.aBoolean650) {
				local66 = this.aClass3_Sub2_2.method5895(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass3_Sub2_2.method5901(local54);
				local70 = local80[0];
				local72 = local80[2];
				local68 = local80[1];
			}
			if (arg4) {
				local52 = local54;
			}
			if (this.aClass3_Sub2_1.aBoolean650) {
				local66 = this.aClass3_Sub2_1.method5895(local54);
			} else {
				local66 = this.aClass3_Sub2_1.method5901(local54)[0];
			}
			for (@Pc(120) int local120 = arg1 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local70[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(143) int local143 = local68[local120] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(163) int local163 = local72[local120] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local143 = Static171.anIntArray222[local143];
				local128 = Static171.anIntArray222[local128];
				if (local163 < 0) {
					local163 = 0;
				}
				local163 = Static171.anIntArray222[local163];
				@Pc(201) int local201;
				if (local128 == 0 && local143 == 0 && local163 == 0) {
					local201 = 0;
				} else {
					local201 = local66[local120] >> 4;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 < 0) {
						local201 = 0;
					}
				}
				local50[local52++] = (local201 << 24) + (local128 << 16) + (local143 << 8) + local163;
				if (arg4) {
					local52 += arg1 - 1;
				}
			}
		}
		for (@Pc(262) int local262 = 0; local262 < this.aClass3_Sub2Array42.length; local262++) {
			this.aClass3_Sub2Array42[local262].method5893();
		}
		return local50;
	}
}
