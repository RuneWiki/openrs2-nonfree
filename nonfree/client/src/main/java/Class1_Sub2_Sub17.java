import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			Static471.method3064(local17, 0, Static218.anInt3990, Static258.anIntArray335[arg0]);
		}
		return local17;
	}
}
