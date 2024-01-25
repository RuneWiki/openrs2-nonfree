import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public final class Class48_Sub10 extends Class48 {

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class48_Sub10(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		super.aClass100_Sub1_23.method7925(false);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		super.aClass100_Sub1_23.method7925(true);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_23.method7923(arg0);
		super.aClass100_Sub1_23.method7962(arg1);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rha", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return true;
	}
}
