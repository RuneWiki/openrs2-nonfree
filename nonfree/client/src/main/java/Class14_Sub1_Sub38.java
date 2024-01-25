import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class14_Sub1_Sub38 extends Class14_Sub1 {

	@OriginalMember(owner = "client!vja", name = "I", descriptor = "I")
	private int anInt10648 = 4096;

	@OriginalMember(owner = "client!vja", name = "L", descriptor = "I")
	private int anInt10650 = 0;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(26) int[] local26 = this.method8897(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static371.anInt6835; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt10650 > local34) {
					local11[local28] = this.anInt10650;
				} else if (local34 <= this.anInt10648) {
					local11[local28] = local34;
				} else {
					local11[local28] = this.anInt10648;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10650 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt10648 = arg0.method5900();
		} else if (arg1 == 2) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(21) int[][] local21 = this.method8904(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static371.anInt6835; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt10650) {
					local37[local47] = this.anInt10650;
				} else if (this.anInt10648 >= local53) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt10648;
				}
				if (this.anInt10650 > local57) {
					local41[local47] = this.anInt10650;
				} else if (local57 <= this.anInt10648) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt10648;
				}
				if (local61 < this.anInt10650) {
					local45[local47] = this.anInt10650;
				} else if (local61 > this.anInt10648) {
					local45[local47] = this.anInt10648;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}
}
