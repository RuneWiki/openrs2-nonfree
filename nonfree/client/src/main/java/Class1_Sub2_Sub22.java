import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kf", name = "ib", descriptor = "Z")
	private boolean aBoolean119;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(33) int[] local33 = this.method3130(0, this.aBoolean119 ? Static64.anInt1680 - arg0 : arg0);
			if (this.aBoolean118) {
				for (@Pc(38) int local38 = 0; local38 < Static110.anInt2825; local38++) {
					local16[local38] = local33[Static99.anInt2523 - local38];
				}
			} else {
				Static184.method629(local33, 0, local16, 0, Static110.anInt2825);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean118 = arg0.method861() == 1;
		} else if (arg1 == 1) {
			this.aBoolean119 = arg0.method861() == 1;
		} else if (arg1 == 2) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(33) int[][] local33 = this.method3118(this.aBoolean119 ? Static64.anInt1680 - arg0 : arg0, 0);
			@Pc(37) int[] local37 = local33[1];
			@Pc(41) int[] local41 = local33[0];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local15[0];
			@Pc(53) int[] local53 = local15[1];
			@Pc(57) int[] local57 = local15[2];
			@Pc(62) int local62;
			if (this.aBoolean118) {
				for (local62 = 0; local62 < Static110.anInt2825; local62++) {
					local49[local62] = local41[Static99.anInt2523 - local62];
					local53[local62] = local37[Static99.anInt2523 - local62];
					local57[local62] = local45[Static99.anInt2523 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static110.anInt2825; local62++) {
					local49[local62] = local41[local62];
					local53[local62] = local37[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local15;
	}
}
