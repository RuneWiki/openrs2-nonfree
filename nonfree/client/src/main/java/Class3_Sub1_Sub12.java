import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			Static188.method2241(local17, 0, Static129.anInt3285, Static22.anIntArray152[arg0]);
		}
		return local17;
	}
}
