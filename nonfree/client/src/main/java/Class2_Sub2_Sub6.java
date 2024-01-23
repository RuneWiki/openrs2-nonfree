import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
	private int anInt1223 = 4096;

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
	private int anInt1229 = 4096;

	@OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
	private int anInt1231 = 4096;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(29) int[][] local29 = this.method3952(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static54.anInt953; local55++) {
				@Pc(61) int local61 = local41[local55];
				@Pc(65) int local65 = local33[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local69 == local61) {
					local45[local55] = local65 * this.anInt1223 >> 12;
					local49[local55] = local61 * this.anInt1229 >> 12;
					local53[local55] = this.anInt1231 * local69 >> 12;
				} else {
					local45[local55] = this.anInt1223;
					local49[local55] = this.anInt1229;
					local53[local55] = this.anInt1231;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1223 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt1229 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt1231 = arg0.method2095();
		}
	}
}
