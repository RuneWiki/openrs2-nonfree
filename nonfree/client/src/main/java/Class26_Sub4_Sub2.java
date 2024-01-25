import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class26_Sub4_Sub2 extends Class26_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Lclient!nu;")
	public Class26_Sub4 aClass26_Sub4_1;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIILclient!nu;)V")
	public Class26_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub4 arg3) {
		super(arg0, arg1, arg2, arg3.aShort107, false, false);
		this.aClass26_Sub4_1 = arg3;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}
}
