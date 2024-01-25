import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class3_Sub6_Sub25 extends Class3_Sub6 {

	@OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
	private int anInt6271 = 4096;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
	private int anInt6273 = 0;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6273 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt6271 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(29) int[] local29 = this.method7769(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static521.anInt8383; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt6273 <= local37 && local37 <= this.anInt6271 ? 4096 : 0;
			}
		}
		return local11;
	}
}
