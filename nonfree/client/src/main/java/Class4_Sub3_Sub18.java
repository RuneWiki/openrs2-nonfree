import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class4_Sub3_Sub18 extends Class4_Sub3 {

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			Static474.method3330(local14, 0, Static304.anInt5637, Static376.anIntArray531[arg0]);
		}
		return local14;
	}
}
