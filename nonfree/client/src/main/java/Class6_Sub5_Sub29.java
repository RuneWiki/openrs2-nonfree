import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class6_Sub5_Sub29 extends Class6_Sub5 {

	static {
		new Class267(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			Static459.method6344(local9, 0, Static240.anInt4386, Static247.anIntArray318[arg0]);
		}
		return local9;
	}
}
