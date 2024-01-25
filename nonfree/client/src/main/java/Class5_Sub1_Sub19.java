import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class5_Sub1_Sub19 extends Class5_Sub1 {

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			Static468.method3861(local17, 0, Static148.anInt2666, Static346.anIntArray401[arg0]);
		}
		return local17;
	}
}
