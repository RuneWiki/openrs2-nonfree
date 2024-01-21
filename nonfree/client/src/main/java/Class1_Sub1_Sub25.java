import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			Static214.method349(local14, 0, Static115.anInt2578, Static187.anIntArray362[arg0]);
		}
		return local14;
	}
}
