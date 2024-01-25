import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class22_Sub9 extends Class22 {

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class22_Sub9(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return true;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		super.aClass95_Sub3_37.method4885(true);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub3_37.method4864(arg0);
		super.aClass95_Sub3_37.method4870(arg1);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		super.aClass95_Sub3_37.method4885(false);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
