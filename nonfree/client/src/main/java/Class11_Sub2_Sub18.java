import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class11_Sub2_Sub18 extends Class11_Sub2 {

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
	private int anInt3080 = 1;

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
	private int anInt3077 = 1;

	static {
		new Class117("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(31) int local31 = this.anInt3077 + this.anInt3077 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt3080 + this.anInt3080 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local31][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt3077; local57 <= arg0 + this.anInt3077; local57++) {
				@Pc(67) int[][] local67 = this.method5715(Static75.anInt1419 & local57, 0);
				@Pc(71) int[][] local71 = new int[3][Static339.anInt6549];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt3080; local93 <= this.anInt3080; local93++) {
					@Pc(99) int local99 = Static323.anInt6272 & local93;
					local73 += local81[local99];
					local77 += local89[local99];
					local75 += local85[local99];
				}
				@Pc(126) int[] local126 = local71[0];
				@Pc(130) int[] local130 = local71[1];
				@Pc(134) int[] local134 = local71[2];
				@Pc(136) int local136 = 0;
				while (local136 < Static339.anInt6549) {
					local126[local136] = local48 * local73 >> 16;
					local130[local136] = local75 * local48 >> 16;
					local134[local136] = local77 * local48 >> 16;
					@Pc(170) int local170 = local136 - this.anInt3080 & Static323.anInt6272;
					local136++;
					local73 -= local81[local170];
					local77 -= local89[local170];
					local75 -= local85[local170];
					@Pc(196) int local196 = Static323.anInt6272 & this.anInt3080 + local136;
					local73 += local81[local196];
					local77 += local89[local196];
					local75 += local85[local196];
				}
				local51[local57 + this.anInt3077 - arg0] = local71;
			}
			@Pc(239) int[] local239 = local11[0];
			@Pc(243) int[] local243 = local11[1];
			@Pc(247) int[] local247 = local11[2];
			for (local75 = 0; local75 < Static339.anInt6549; local75++) {
				local77 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local31; local259++) {
					@Pc(265) int[][] local265 = local51[local259];
					local255 += local265[1][local75];
					local77 += local265[0][local75];
					local257 += local265[2][local75];
				}
				local239[local75] = local77 * local35 >> 16;
				local243[local75] = local255 * local35 >> 16;
				local247[local75] = local35 * local257 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3080 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt3077 = arg0.method5185();
		} else if (arg1 == 2) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(31) int local31 = this.anInt3077 + this.anInt3077 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt3080 + this.anInt3080 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt3077; local56 <= arg0 + this.anInt3077; local56++) {
				@Pc(66) int[] local66 = this.method5710(0, Static75.anInt1419 & local56);
				@Pc(69) int[] local69 = new int[Static339.anInt6549];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt3080; local75 <= this.anInt3080; local75++) {
					local71 += local66[local75 & Static323.anInt6272];
				}
				@Pc(96) int local96 = 0;
				while (local96 < Static339.anInt6549) {
					local69[local96] = local71 * local47 >> 16;
					local71 -= local66[Static323.anInt6272 & local96 - this.anInt3080];
					local96++;
					local71 += local66[local96 + this.anInt3080 & Static323.anInt6272];
				}
				local50[this.anInt3077 + local56 - arg0] = local69;
			}
			for (@Pc(162) int local162 = 0; local162 < Static339.anInt6549; local162++) {
				@Pc(166) int local166 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local166 += local50[local71][local162];
				}
				local19[local162] = local166 * local35 >> 16;
			}
		}
		return local19;
	}
}
