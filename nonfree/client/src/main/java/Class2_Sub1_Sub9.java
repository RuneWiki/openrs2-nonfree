import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(10) int[] local10 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			Static186.method1562(local10, 0, Static129.anInt3118, Static166.anIntArray619[arg0]);
		}
		return local10;
	}
}
