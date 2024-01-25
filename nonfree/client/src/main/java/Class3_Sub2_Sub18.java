import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			Static655.method6405(local9, 0, Static164.anInt8839, Static328.anIntArray387[arg0]);
		}
		return local9;
	}
}
