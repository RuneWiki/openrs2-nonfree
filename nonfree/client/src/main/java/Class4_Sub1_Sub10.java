import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class4_Sub1_Sub10 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			Static597.method3724(local9, 0, Static376.anInt7260, Static442.anIntArray449[arg0]);
		}
		return local9;
	}
}
