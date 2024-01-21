import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class3_Sub5_Sub14 extends Class3_Sub5 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			Static200.method1180(local13, 0, Static104.anInt2195, Static94.anIntArray277[arg0]);
		}
		return local13;
	}
}
