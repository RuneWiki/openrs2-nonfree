import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class31_Sub2_Sub5 extends Class31_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "Lclient!lq;")
	public Class31_Sub2 aClass31_Sub2_2;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIIIIIIIILclient!lq;)V")
	public Class31_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class31_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static177.method2836(arg1, arg0));
		this.aClass31_Sub2_2 = arg10;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return 0;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return 0;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(I)I")
	@Override
	public int method5976() {
		return 0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return 0;
	}
}
