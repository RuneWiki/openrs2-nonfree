import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			Static553.method2532(local9, 0, Static147.anInt3075, Static295.anIntArray403[arg0]);
		}
		return local9;
	}
}
