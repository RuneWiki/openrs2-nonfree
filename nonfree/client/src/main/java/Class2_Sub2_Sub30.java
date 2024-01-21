import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			Static182.method1345(local14, 0, Static149.anInt3233, Static86.anIntArray218[arg0]);
		}
		return local14;
	}
}
