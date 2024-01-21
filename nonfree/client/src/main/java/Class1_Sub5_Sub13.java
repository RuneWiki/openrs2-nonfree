import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub5_Sub13 extends Class1_Sub5 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			Static190.method1385(local14, 0, Static177.anInt4018, Static34.anIntArray75[arg0]);
		}
		return local14;
	}
}
