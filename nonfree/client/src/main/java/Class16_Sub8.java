import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class16_Sub8 extends Class16 {

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class16_Sub8(@OriginalArg(0) Class33_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		super.aClass33_Sub1_23.method2117(false);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub1_23.method1987(arg0);
		super.aClass33_Sub1_23.method2105(arg1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		super.aClass33_Sub1_23.method2117(true);
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return true;
	}
}
