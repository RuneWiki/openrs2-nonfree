import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class5_Sub2_Sub23 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			Static655.method4110(local14, 0, Static314.anInt6320, Static61.anIntArray80[arg0]);
		}
		return local14;
	}
}
