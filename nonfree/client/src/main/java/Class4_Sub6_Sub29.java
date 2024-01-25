import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class4_Sub6_Sub29 extends Class4_Sub6 {

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	private int anInt5795 = 1;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
	private int anInt5800 = 1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5800 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt5795 = arg1.method2490();
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(29) int local29 = this.anInt5795 + this.anInt5795 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt5800 + this.anInt5800 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local29][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt5795; local53 <= arg0 + this.anInt5795; local53++) {
				@Pc(63) int[][] local63 = this.method5516(0, Static211.anInt3929 & local53);
				@Pc(67) int[][] local67 = new int[3][Static80.anInt1616];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt5800; local89 <= this.anInt5800; local89++) {
					@Pc(95) int local95 = local89 & Static203.anInt3883;
					local69 += local77[local95];
					local71 += local81[local95];
					local73 += local85[local95];
				}
				@Pc(126) int[] local126 = local67[0];
				@Pc(130) int[] local130 = local67[1];
				@Pc(134) int[] local134 = local67[2];
				@Pc(136) int local136 = 0;
				while (Static80.anInt1616 > local136) {
					local126[local136] = local69 * local45 >> 16;
					local130[local136] = local45 * local71 >> 16;
					local134[local136] = local45 * local73 >> 16;
					@Pc(170) int local170 = Static203.anInt3883 & local136 - this.anInt5800;
					local71 -= local81[local170];
					local69 -= local77[local170];
					local136++;
					local73 -= local85[local170];
					@Pc(196) int local196 = Static203.anInt3883 & local136 + this.anInt5800;
					local69 += local77[local196];
					local73 += local85[local196];
					local71 += local81[local196];
				}
				local48[local53 + this.anInt5795 - arg0] = local67;
			}
			@Pc(245) int[] local245 = local11[0];
			@Pc(249) int[] local249 = local11[1];
			@Pc(253) int[] local253 = local11[2];
			for (local71 = 0; local71 < Static80.anInt1616; local71++) {
				local73 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local29; local265++) {
					@Pc(271) int[][] local271 = local48[local265];
					local261 += local271[1][local71];
					local263 += local271[2][local71];
					local73 += local271[0][local71];
				}
				local245[local71] = local73 * local33 >> 16;
				local249[local71] = local261 * local33 >> 16;
				local253[local71] = local263 * local33 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(31) int local31 = this.anInt5795 + this.anInt5795 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt5800 + this.anInt5800 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt5795; local56 <= arg0 + this.anInt5795; local56++) {
				@Pc(66) int[] local66 = this.method5508(Static211.anInt3929 & local56, 0);
				@Pc(69) int[] local69 = new int[Static80.anInt1616];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt5800; local75 <= this.anInt5800; local75++) {
					local71 += local66[local75 & Static203.anInt3883];
				}
				@Pc(92) int local92 = 0;
				while (local92 < Static80.anInt1616) {
					local69[local92] = local71 * local47 >> 16;
					local71 -= local66[local92 - this.anInt5800 & Static203.anInt3883];
					local92++;
					local71 += local66[Static203.anInt3883 & this.anInt5800 + local92];
				}
				local50[local56 + this.anInt5795 - arg0] = local69;
			}
			for (@Pc(152) int local152 = 0; local152 < Static80.anInt1616; local152++) {
				@Pc(156) int local156 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local156 += local50[local71][local152];
				}
				local19[local152] = local35 * local156 >> 16;
			}
		}
		return local19;
	}
}
