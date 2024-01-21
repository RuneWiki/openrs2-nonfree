import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub5_Sub18 extends Class1_Sub5 {

	@OriginalMember(owner = "client!md", name = "N", descriptor = "I")
	private int anInt2293;

	@OriginalMember(owner = "client!md", name = "W", descriptor = "I")
	private int anInt2298;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2293 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt2298 = arg0.method359();
		} else if (arg1 == 2) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(17) int[][] local17 = this.method3144(arg0, 0);
			@Pc(21) int[] local21 = local17[0];
			@Pc(25) int[] local25 = local17[2];
			@Pc(29) int[] local29 = local7[0];
			@Pc(33) int[] local33 = local7[1];
			@Pc(37) int[] local37 = local17[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Static177.anInt4018; local43++) {
				@Pc(49) int local49 = local21[local43];
				@Pc(53) int local53 = local37[local43];
				@Pc(57) int local57 = local25[local43];
				if (this.anInt2293 > local49) {
					local29[local43] = this.anInt2293;
				} else if (this.anInt2298 >= local49) {
					local29[local43] = local49;
				} else {
					local29[local43] = this.anInt2298;
				}
				if (this.anInt2293 > local53) {
					local33[local43] = this.anInt2293;
				} else if (this.anInt2298 < local53) {
					local33[local43] = this.anInt2298;
				} else {
					local33[local43] = local53;
				}
				if (this.anInt2293 > local57) {
					local41[local43] = this.anInt2293;
				} else if (this.anInt2298 < local57) {
					local41[local43] = this.anInt2298;
				} else {
					local41[local43] = local57;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(21) int[] local21 = this.method3145(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static177.anInt4018; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt2293 > local29) {
					local7[local23] = this.anInt2293;
				} else if (this.anInt2298 < local29) {
					local7[local23] = this.anInt2298;
				} else {
					local7[local23] = local29;
				}
			}
		}
		return local7;
	}
}
