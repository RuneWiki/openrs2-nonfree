import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class11_Sub2_Sub39 extends Class11_Sub2 {

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			Static363.method1670(local9, 0, Static339.anInt6549, Static155.anIntArray196[arg0]);
		}
		return local9;
	}
}
