import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			Static732.method6314(local9, 0, Static379.anInt5859, Static121.anIntArray145[arg0]);
		}
		return local9;
	}
}
