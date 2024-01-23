import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
	private int anInt2770 = 4096;

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
	private int anInt2769 = 0;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(26) int[] local26 = this.method3955(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static54.anInt953; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt2769) {
					local16[local28] = this.anInt2769;
				} else if (local34 > this.anInt2770) {
					local16[local28] = this.anInt2770;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2769 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt2770 = arg0.method2095();
		} else if (arg1 == 2) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(17) int[][] local17 = this.method3952(0, arg0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[2];
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[2];
			@Pc(41) int[] local41 = local7[1];
			for (@Pc(43) int local43 = 0; local43 < Static54.anInt953; local43++) {
				@Pc(49) int local49 = local29[local43];
				@Pc(53) int local53 = local21[local43];
				@Pc(57) int local57 = local25[local43];
				if (this.anInt2769 > local49) {
					local33[local43] = this.anInt2769;
				} else if (this.anInt2770 < local49) {
					local33[local43] = this.anInt2770;
				} else {
					local33[local43] = local49;
				}
				if (local53 < this.anInt2769) {
					local41[local43] = this.anInt2769;
				} else if (local53 > this.anInt2770) {
					local41[local43] = this.anInt2770;
				} else {
					local41[local43] = local53;
				}
				if (this.anInt2769 > local57) {
					local37[local43] = this.anInt2769;
				} else if (local57 <= this.anInt2770) {
					local37[local43] = local57;
				} else {
					local37[local43] = this.anInt2770;
				}
			}
		}
		return local7;
	}
}
