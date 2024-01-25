import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	private int anInt7549 = 0;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private int anInt7551 = 4096;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(29) int[] local29 = this.method6076(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static347.anInt5974; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = local37 >= this.anInt7549 && local37 <= this.anInt7551 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7549 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt7551 = arg0.method4093();
		}
	}
}
