import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class31_Sub1_Sub1 extends Class31_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "Lclient!se;")
	public Class31_Sub1 aClass31_Sub1_1;

	static {
		new Class7("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIILclient!se;)V")
	public Class31_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31_Sub1 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass31_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	@Override
	public Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)I")
	@Override
	public int method5176() {
		return 0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
	@Override
	public void method5171() {
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5173(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)I")
	@Override
	public int method5172() {
		return 0;
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5175() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5170(@OriginalArg(1) Class39 arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I")
	@Override
	public int method5169() {
		return 0;
	}
}
