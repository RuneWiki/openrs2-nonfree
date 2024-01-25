import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			Static689.method8056(local11, 0, Static30.anInt908, Static201.anIntArray251[arg0]);
		}
		return local11;
	}
}
