import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class11_Sub4(@OriginalArg(0) Class16_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		super.aClass16_Sub1_21.method3931(true);
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_21.method3889(arg0);
		super.aClass16_Sub1_21.method3937(arg1);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		super.aClass16_Sub1_21.method3931(false);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
