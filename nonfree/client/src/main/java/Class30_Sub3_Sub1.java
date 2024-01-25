import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class30_Sub3_Sub1 extends Class30_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "Lclient!hc;")
	public Class30_Sub3 aClass30_Sub3_1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIIILclient!hc;)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30_Sub3 arg5) {
		super(arg2, arg3, arg4, Static194.method3144(arg1, arg0));
		this.aClass30_Sub3_1 = arg5;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		return null;
	}
}
