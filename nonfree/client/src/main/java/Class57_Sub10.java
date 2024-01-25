import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public final class Class57_Sub10 extends Class57 {

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class57_Sub10(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		super.aClass5_Sub2_23.method4032(false);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		super.aClass5_Sub2_23.method4008(arg1);
		super.aClass5_Sub2_23.method4018(arg0);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub2_23.method4032(true);
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return true;
	}
}
