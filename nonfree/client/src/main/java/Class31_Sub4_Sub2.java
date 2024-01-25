import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class31_Sub4_Sub2 extends Class31_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "Lclient!sr;")
	public Class31_Sub4 aClass31_Sub4_3;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIILclient!sr;)V")
	public Class31_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class31_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static214.method4409(arg0, arg1));
		this.aClass31_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return 0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return 0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return false;
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)I")
	@Override
	public int method5164() {
		return 0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return 0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		return null;
	}
}
