import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class4_Sub4(@OriginalArg(0) Class13_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return false;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass13_Sub1_23.method7530(arg1);
		super.aClass13_Sub1_23.method7509(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
	}
}
