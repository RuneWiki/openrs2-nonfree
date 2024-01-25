import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			Static651.method751(local14, 0, Static201.anInt3738, Static376.anIntArray665[arg0]);
		}
		return local14;
	}
}
