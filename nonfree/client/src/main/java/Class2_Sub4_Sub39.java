import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class2_Sub4_Sub39 extends Class2_Sub4 {

	@OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
	private int anInt10470 = 4096;

	@OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
	private int anInt10475 = 4096;

	@OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
	private int anInt10473 = 4096;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10473 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt10475 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt10470 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(29) int[][] local29 = this.method8898(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static395.anInt6816; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local69 == local65) {
					local45[local55] = local61 * this.anInt10473 >> 12;
					local49[local55] = local65 * this.anInt10475 >> 12;
					local53[local55] = local69 * this.anInt10470 >> 12;
				} else {
					local45[local55] = this.anInt10473;
					local49[local55] = this.anInt10475;
					local53[local55] = this.anInt10470;
				}
			}
		}
		return local11;
	}
}
