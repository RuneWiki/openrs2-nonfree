import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class6_Sub1_Sub29 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			Static589.method5379(local9, 0, Static289.anInt5549, Static346.anIntArray472[arg0]);
		}
		return local9;
	}
}
