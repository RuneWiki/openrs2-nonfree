import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!e", name = "L", descriptor = "I")
	private int anInt1477 = 4096;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "I")
	private int anInt1476 = 0;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1476 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt1477 = arg0.method2130();
		} else if (arg1 == 2) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(21) int[][] local21 = this.method4600(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local11[1];
			for (@Pc(47) int local47 = 0; local47 < Static281.anInt5558; local47++) {
				@Pc(58) int local58 = local29[local47];
				@Pc(62) int local62 = local25[local47];
				@Pc(66) int local66 = local33[local47];
				if (this.anInt1476 > local62) {
					local37[local47] = this.anInt1476;
				} else if (local62 > this.anInt1477) {
					local37[local47] = this.anInt1477;
				} else {
					local37[local47] = local62;
				}
				if (this.anInt1476 > local58) {
					local45[local47] = this.anInt1476;
				} else if (this.anInt1477 >= local58) {
					local45[local47] = local58;
				} else {
					local45[local47] = this.anInt1477;
				}
				if (local66 < this.anInt1476) {
					local41[local47] = this.anInt1476;
				} else if (this.anInt1477 < local66) {
					local41[local47] = this.anInt1477;
				} else {
					local41[local47] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(19) int[] local19 = this.method4601(arg0, 0);
			for (@Pc(21) int local21 = 0; local21 < Static281.anInt5558; local21++) {
				@Pc(32) int local32 = local19[local21];
				if (this.anInt1476 > local32) {
					local9[local21] = this.anInt1476;
				} else if (this.anInt1477 < local32) {
					local9[local21] = this.anInt1477;
				} else {
					local9[local21] = local32;
				}
			}
		}
		return local9;
	}
}
