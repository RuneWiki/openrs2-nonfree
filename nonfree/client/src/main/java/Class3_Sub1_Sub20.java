import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			Static184.method1308(local9, 0, Static141.anInt3261, Static125.anIntArray336[arg0]);
		}
		return local9;
	}
}
