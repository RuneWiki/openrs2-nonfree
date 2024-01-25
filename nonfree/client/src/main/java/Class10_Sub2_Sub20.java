import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class10_Sub2_Sub20 extends Class10_Sub2 {

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			Static468.method4353(local9, 0, Static121.anInt2458, Static67.anIntArray106[arg0]);
		}
		return local9;
	}
}
