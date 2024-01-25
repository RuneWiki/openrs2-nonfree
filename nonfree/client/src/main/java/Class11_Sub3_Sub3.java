import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class11_Sub3_Sub3 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "Lclient!ds;")
	public Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIILclient!ds;)V")
	public Class11_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3) {
		super(arg0, arg1, arg2, arg3.aShort80, false, false);
		this.aClass11_Sub3_2 = arg3;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return 0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return 0;
	}
}
