import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class1_Sub1_Sub6_Sub1 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118 && this.method2994()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(43) int local43 = this.anInt3698 * (arg0 % this.anInt3698);
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static75.anInt1848; local49++) {
				@Pc(62) int local62 = this.anIntArray335[local49 % this.anInt3700 + local43];
				local47[local49] = (local62 & 0xFF) << 4;
				local35[local49] = local62 >> 4 & 0xFF0;
				local31[local49] = local62 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
