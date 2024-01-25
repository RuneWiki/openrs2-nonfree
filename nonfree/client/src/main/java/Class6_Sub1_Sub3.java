import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			Static653.method6539(local9, 0, Static53.anInt1787, Static603.anIntArray549[arg0]);
		}
		return local9;
	}
}
