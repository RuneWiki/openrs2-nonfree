import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	private int anInt3847 = 4096;

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
	private int anInt3848 = 4096;

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
	private int anInt3849 = 4096;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(21) int[][] local21 = this.method3579(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local21[1];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local11[1];
			for (@Pc(47) int local47 = 0; local47 < Static115.anInt2578; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 == local57 && local61 == local57) {
					local37[local47] = local53 * this.anInt3848 >> 12;
					local45[local47] = local57 * this.anInt3849 >> 12;
					local41[local47] = local61 * this.anInt3847 >> 12;
				} else {
					local37[local47] = this.anInt3848;
					local45[local47] = this.anInt3849;
					local41[local47] = this.anInt3847;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3848 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt3849 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt3847 = arg0.method2765();
		}
	}
}
