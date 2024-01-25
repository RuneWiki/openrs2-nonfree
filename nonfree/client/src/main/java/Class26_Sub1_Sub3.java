import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class26_Sub1_Sub3 extends Class26_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "Lclient!oa;")
	public Class26_Sub1 aClass26_Sub1_3;

	static {
		new Class55("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIILclient!oa;)V")
	public Class26_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class26_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static199.method2858(arg1, arg0));
		this.aClass26_Sub1_3 = arg5;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)I")
	@Override
	public int method5551() {
		return 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return false;
	}
}
