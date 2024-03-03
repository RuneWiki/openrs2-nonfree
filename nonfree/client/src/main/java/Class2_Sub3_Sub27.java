import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class2_Sub3_Sub27 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	public static int anInt5187 = 0;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 131)
	public Class2_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)[I", line = 70)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		return Static311.anIntArray424;
	}
}
