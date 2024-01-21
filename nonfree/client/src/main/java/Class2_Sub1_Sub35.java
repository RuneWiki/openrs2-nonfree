import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!w", name = "S", descriptor = "I")
	private int anInt4118 = 4096;

	@OriginalMember(owner = "client!w", name = "W", descriptor = "I")
	private int anInt4122 = 4096;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	private int anInt4113 = 4096;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4118 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt4113 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt4122 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(21) int[][] local21 = this.method3259(arg0, 0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local21[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static135.anInt2897; local47++) {
				@Pc(53) int local53 = local33[local47];
				@Pc(57) int local57 = local25[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local61 && local61 == local57) {
					local41[local47] = local53 * this.anInt4118 >> 12;
					local37[local47] = this.anInt4113 * local61 >> 12;
					local45[local47] = local57 * this.anInt4122 >> 12;
				} else {
					local41[local47] = this.anInt4118;
					local37[local47] = this.anInt4113;
					local45[local47] = this.anInt4122;
				}
			}
		}
		return local11;
	}
}
