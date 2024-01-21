import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class4_Sub3_Sub1 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(31) int local31 = this.anInt293 + this.anInt293 + 1;
			@Pc(40) int local40 = this.anInt298 + this.anInt298 + 1;
			@Pc(43) int[][][] local43 = new int[local40][][];
			@Pc(81) int local81;
			@Pc(63) int local63;
			for (@Pc(49) int local49 = arg0 - this.anInt298; local49 <= this.anInt298 + arg0; local49++) {
				@Pc(59) int[][] local59 = this.method3150(0, Static5.anInt216 & local49);
				@Pc(61) int local61 = 0;
				local63 = 0;
				@Pc(67) int[][] local67 = new int[3][Static134.anInt3188];
				@Pc(71) int[] local71 = local59[0];
				@Pc(75) int[] local75 = local59[1];
				@Pc(79) int[] local79 = local59[2];
				local81 = 0;
				for (@Pc(85) int local85 = -this.anInt293; local85 <= this.anInt293; local85++) {
					@Pc(91) int local91 = local85 & Static2.anInt80;
					local81 += local75[local91];
					local61 += local71[local91];
					local63 += local79[local91];
				}
				@Pc(122) int[] local122 = local67[1];
				@Pc(126) int[] local126 = local67[0];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static134.anInt3188 > local132) {
					local126[local132] = local61 / local31;
					local122[local132] = local81 / local31;
					local130[local132] = local63 / local31;
					@Pc(159) int local159 = local132 - this.anInt293 & Static2.anInt80;
					local63 -= local79[local159];
					local61 -= local71[local159];
					local81 -= local75[local159];
					local132++;
					@Pc(185) int local185 = Static2.anInt80 & this.anInt293 + local132;
					local63 += local79[local185];
					local81 += local75[local185];
					local61 += local71[local185];
				}
				local43[this.anInt298 + local49 - arg0] = local67;
			}
			@Pc(226) int[] local226 = local19[1];
			@Pc(230) int[] local230 = local19[0];
			@Pc(234) int[] local234 = local19[2];
			for (local81 = 0; local81 < Static134.anInt3188; local81++) {
				local63 = 0;
				@Pc(242) int local242 = 0;
				@Pc(244) int local244 = 0;
				for (@Pc(246) int local246 = 0; local246 < local40; local246++) {
					@Pc(252) int[][] local252 = local43[local246];
					local242 += local252[1][local81];
					local63 += local252[0][local81];
					local244 += local252[2][local81];
				}
				local230[local81] = local63 / local40;
				local226[local81] = local242 / local40;
				local234[local81] = local244 / local40;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt293 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt298 = arg1.method1253();
		} else if (arg0 == 2) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(31) int local31 = this.anInt298 + this.anInt298 + 1;
			@Pc(34) int[][] local34 = new int[local31][];
			@Pc(42) int local42 = this.anInt293 + this.anInt293 + 1;
			@Pc(62) int local62;
			for (@Pc(47) int local47 = arg0 - this.anInt298; local47 <= arg0 + this.anInt298; local47++) {
				@Pc(57) int[] local57 = this.method3149(local47 & Static5.anInt216, 0);
				@Pc(60) int[] local60 = new int[Static134.anInt3188];
				local62 = 0;
				for (@Pc(66) int local66 = -this.anInt293; local66 <= this.anInt293; local66++) {
					local62 += local57[local66 & Static2.anInt80];
				}
				@Pc(83) int local83 = 0;
				while (local83 < Static134.anInt3188) {
					local60[local83] = local62 / local42;
					local62 -= local57[Static2.anInt80 & local83 - this.anInt293];
					local83++;
					local62 += local57[this.anInt293 + local83 & Static2.anInt80];
				}
				local34[local47 + this.anInt298 - arg0] = local60;
			}
			for (@Pc(139) int local139 = 0; local139 < Static134.anInt3188; local139++) {
				@Pc(143) int local143 = 0;
				for (local62 = 0; local62 < local31; local62++) {
					local143 += local34[local62][local139];
				}
				local19[local139] = local143 / local31;
			}
		}
		return local19;
	}
}
