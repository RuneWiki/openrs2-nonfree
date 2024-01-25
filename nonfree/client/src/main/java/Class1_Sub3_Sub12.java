import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			Static460.method4215(local14, 0, Static347.anInt5974, Static342.anIntArray469[arg0]);
		}
		return local14;
	}
}
