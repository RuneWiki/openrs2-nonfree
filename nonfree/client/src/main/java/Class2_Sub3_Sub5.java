import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
	private int anInt590;

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
	private int anInt591;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	private int anInt596;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt591 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt590 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt596 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(17) int[][] local17 = this.method2900(arg0, 0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[2];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[2];
			@Pc(41) int[] local41 = local7[1];
			for (@Pc(43) int local43 = 0; local43 < Static54.anInt1423; local43++) {
				@Pc(49) int local49 = local25[local43];
				@Pc(53) int local53 = local21[local43];
				@Pc(57) int local57 = local29[local43];
				if (local57 == local49 && local53 == local57) {
					local33[local43] = this.anInt591 * local49 >> 12;
					local41[local43] = this.anInt590 * local57 >> 12;
					local37[local43] = this.anInt596 * local53 >> 12;
				} else {
					local33[local43] = this.anInt591;
					local41[local43] = this.anInt590;
					local37[local43] = this.anInt596;
				}
			}
		}
		return local7;
	}
}
