import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class26_Sub2_Sub5 extends Class26_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!ks", name = "H", descriptor = "Lclient!mv;")
	public Class26_Sub2 aClass26_Sub2_1;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIIIIIIIILclient!mv;)V")
	public Class26_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class26_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static201.method2881(arg1, arg0));
		this.aClass26_Sub2_1 = arg10;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return false;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)I")
	@Override
	public int method5695() {
		return 0;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return null;
	}
}
