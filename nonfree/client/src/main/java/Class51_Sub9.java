import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class51_Sub9 extends Class51 {

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class51_Sub9(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return true;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		super.aClass75_Sub2_39.method2430(false);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		super.aClass75_Sub2_39.method2456(arg0);
		super.aClass75_Sub2_39.method2424(arg1);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		super.aClass75_Sub2_39.method2430(true);
	}
}
