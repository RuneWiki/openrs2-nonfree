import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class3_Sub9_Sub11 extends Class3_Sub9 {

	@OriginalMember(owner = "client!em", name = "E", descriptor = "I")
	private int anInt2817 = 4096;

	@OriginalMember(owner = "client!em", name = "H", descriptor = "I")
	private int anInt2818 = 4096;

	@OriginalMember(owner = "client!em", name = "J", descriptor = "I")
	private int anInt2819 = 4096;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(21) int[][] local21 = this.method9167(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static62.anInt1251; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local57 && local61 == local57) {
					local37[local47] = local53 * this.anInt2818 >> 12;
					local41[local47] = local57 * this.anInt2817 >> 12;
					local45[local47] = local61 * this.anInt2819 >> 12;
				} else {
					local37[local47] = this.anInt2818;
					local41[local47] = this.anInt2817;
					local45[local47] = this.anInt2819;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2818 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt2817 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt2819 = arg0.method8593();
		}
	}
}
