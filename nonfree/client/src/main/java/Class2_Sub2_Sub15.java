import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			for (@Pc(22) int local22 = 0; local22 < Static149.anInt3233; local22++) {
				local16[local22] = Static154.anIntArray354[local22];
			}
		}
		return local16;
	}
}
