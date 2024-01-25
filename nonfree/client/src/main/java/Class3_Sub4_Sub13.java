import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class3_Sub4_Sub13 extends Class3_Sub4 {

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			Static464.method5795(local14, 0, Static106.anInt2356, Static285.anIntArray401[arg0]);
		}
		return local14;
	}
}
