import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			Static184.method1122(local5, 0, Static86.anInt1942, Static123.anIntArray308[arg0]);
		}
		return local5;
	}
}
