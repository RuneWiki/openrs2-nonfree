import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class11_Sub2_Sub3 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "Lclient!or;")
	public Class11_Sub2 aClass11_Sub2_3;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIILclient!or;)V")
	public Class11_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub2 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static285.method4043(arg0, arg1));
		this.aClass11_Sub2_3 = arg5;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return 0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)I")
	@Override
	public int method3586() {
		return 0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return 0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return 0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		return null;
	}
}
