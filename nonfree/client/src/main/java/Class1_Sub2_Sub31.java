import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
	private int anInt3874 = 4096;

	@OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
	private int anInt3878 = 0;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3878 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt3874 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(28) int[] local28 = this.method3514(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static105.anInt2391; local30++) {
				@Pc(36) int local36 = local28[local30];
				local16[local30] = this.anInt3878 <= local36 && local36 <= this.anInt3874 ? 4096 : 0;
			}
		}
		return local16;
	}
}
