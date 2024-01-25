import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
	private int anInt4028 = 4096;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
	private int anInt4029 = 0;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(23) int[] local23 = this.method7765(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static206.anInt4182; local25++) {
				@Pc(31) int local31 = local23[local25];
				if (local31 < this.anInt4029) {
					local13[local25] = this.anInt4029;
				} else if (this.anInt4028 >= local31) {
					local13[local25] = local31;
				} else {
					local13[local25] = this.anInt4028;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4029 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt4028 = arg0.method3109();
		} else if (arg1 == 2) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(21) int[][] local21 = this.method7766(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static206.anInt4182; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt4029 > local53) {
					local37[local47] = this.anInt4029;
				} else if (this.anInt4028 >= local53) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt4028;
				}
				if (this.anInt4029 > local57) {
					local41[local47] = this.anInt4029;
				} else if (local57 <= this.anInt4028) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt4028;
				}
				if (this.anInt4029 > local61) {
					local45[local47] = this.anInt4029;
				} else if (local61 <= this.anInt4028) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt4028;
				}
			}
		}
		return local11;
	}
}
