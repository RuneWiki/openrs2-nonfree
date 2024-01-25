import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class8_Sub3(@OriginalArg(0) Class90_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6918(@OriginalArg(0) boolean arg0) {
		super.aClass90_Sub1_38.method2073(true);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6927(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILclient!it;)V")
	@Override
	public void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		super.aClass90_Sub1_38.method2126(arg1);
		super.aClass90_Sub1_38.method2123(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6919() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	@Override
	public void method6922() {
		super.aClass90_Sub1_38.method2073(false);
	}
}
