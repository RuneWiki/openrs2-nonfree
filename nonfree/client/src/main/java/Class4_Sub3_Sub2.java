import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(28) int local28 = Static61.anInt1639 / this.anInt357;
			@Pc(33) int local33 = Static134.anInt3188 / this.anInt359;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local28 <= 0) {
				local41 = this.method3149(0, 0);
			} else {
				local47 = arg0 % local28;
				local41 = this.method3149(local47 * Static61.anInt1639 / local28, 0);
			}
			for (local47 = 0; local47 < Static134.anInt3188; local47++) {
				if (local33 > 0) {
					@Pc(70) int local70 = local47 % local33;
					local19[local47] = local41[Static134.anInt3188 * local70 / local33];
				} else {
					local19[local47] = local41[0];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(22) int local22 = Static61.anInt1639 / this.anInt357;
			@Pc(27) int local27 = Static134.anInt3188 / this.anInt359;
			@Pc(43) int[][] local43;
			if (local22 > 0) {
				@Pc(33) int local33 = arg0 % local22;
				local43 = this.method3150(0, local33 * Static61.anInt1639 / local22);
			} else {
				local43 = this.method3150(0, 0);
			}
			@Pc(55) int[] local55 = local43[0];
			@Pc(59) int[] local59 = local43[1];
			@Pc(63) int[] local63 = local43[2];
			@Pc(67) int[] local67 = local13[0];
			@Pc(71) int[] local71 = local13[1];
			@Pc(75) int[] local75 = local13[2];
			for (@Pc(77) int local77 = 0; local77 < Static134.anInt3188; local77++) {
				@Pc(91) int local91;
				if (local27 > 0) {
					@Pc(85) int local85 = local77 % local27;
					local91 = Static134.anInt3188 * local85 / local27;
				} else {
					local91 = 0;
				}
				local67[local77] = local55[local91];
				local71[local77] = local59[local91];
				local75[local77] = local63[local91];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt359 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt357 = arg1.method1253();
		}
	}
}
