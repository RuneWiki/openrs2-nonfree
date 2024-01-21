import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			Static193.method2479(local14, 0, Static65.anInt1933, Static18.anIntArray101[arg0]);
		}
		return local14;
	}
}
