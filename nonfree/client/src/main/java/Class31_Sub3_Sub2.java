import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class31_Sub3_Sub2 extends Class31_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!es", name = "x", descriptor = "Lclient!qv;")
	public Class31_Sub3 aClass31_Sub3_1;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIILclient!qv;)V")
	public Class31_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class31_Sub3 arg5) {
		super(arg2, arg3, arg4, Static359.method4937(arg1, arg0));
		this.aClass31_Sub3_1 = arg5;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return 0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return 0;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return 0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
	}
}
