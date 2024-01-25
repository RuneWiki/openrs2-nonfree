import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!iga", name = "M", descriptor = "I")
	private int anInt4737 = 4096;

	@OriginalMember(owner = "client!iga", name = "J", descriptor = "I")
	private int anInt4734 = 4096;

	@OriginalMember(owner = "client!iga", name = "G", descriptor = "I")
	private int anInt4732 = 4096;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(29) int[][] local29 = this.method8672(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static201.anInt3738; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local65 == local69) {
					local45[local55] = local61 * this.anInt4734 >> 12;
					local49[local55] = local65 * this.anInt4732 >> 12;
					local53[local55] = local69 * this.anInt4737 >> 12;
				} else {
					local45[local55] = this.anInt4734;
					local49[local55] = this.anInt4732;
					local53[local55] = this.anInt4737;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4734 = arg0.method5610();
		} else if (arg1 == 1) {
			this.anInt4732 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt4737 = arg0.method5610();
		}
	}
}
