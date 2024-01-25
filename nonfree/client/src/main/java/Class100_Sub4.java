import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class100_Sub4 extends Class100 {

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class100_Sub4(@OriginalArg(0) Class106_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6154(@OriginalArg(0) boolean arg0) {
		super.aClass106_Sub2_43.method2888(true);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	@Override
	public void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6157() {
		return true;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILclient!kk;)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1) {
		super.aClass106_Sub2_43.method2912(arg1);
		super.aClass106_Sub2_43.method2851(arg0);
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	@Override
	public void method6160() {
		super.aClass106_Sub2_43.method2888(false);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6155(@OriginalArg(1) boolean arg0) {
	}
}
