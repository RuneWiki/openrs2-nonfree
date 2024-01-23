import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			Static235.method864(local9, 0, Static76.anInt1531, Static23.anIntArray47[arg0]);
		}
		return local9;
	}
}
