import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class32_Sub11 extends Class32 {

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class32_Sub11(@OriginalArg(0) Class31_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		super.aClass31_Sub1_22.method7133(true);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		super.aClass31_Sub1_22.method7129(arg1);
		super.aClass31_Sub1_22.method7141(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		super.aClass31_Sub1_22.method7133(false);
	}
}
