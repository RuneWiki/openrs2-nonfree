import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			Static602.method4663(local9, 0, Static131.anInt2935, Static324.anIntArray440[arg0]);
		}
		return local9;
	}
}
