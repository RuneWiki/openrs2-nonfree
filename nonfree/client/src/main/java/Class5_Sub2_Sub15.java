import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			Static652.method4544(local14, 0, Static597.anInt10025, Static493.anIntArray476[arg0]);
		}
		return local14;
	}
}
