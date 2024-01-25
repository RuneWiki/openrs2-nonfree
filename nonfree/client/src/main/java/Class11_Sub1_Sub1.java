import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "Lclient!fv;")
	public Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIIIILclient!fv;)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub1 arg5) {
		super(arg2, arg3, arg4, Static37.method581(arg1, arg0));
		this.aClass11_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return 0;
	}
}
