import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "I")
	private int anInt585 = -1;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(BLclient!cg;)V")
	@Override
	public void method4954(@OriginalArg(1) Class3_Sub14 arg0) {
		arg0.method1629(this.anInt585);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!ika;B)V")
	@Override
	public void method4957(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt585 = arg0.method2028(-14795);
		arg0.method2048(255);
		if (arg0.method2048(255) != 255) {
			arg0.anInt2178--;
			arg0.method2063();
		}
	}
}
