import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class30_Sub2_Sub1 extends Class30_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "Lclient!f;")
	public Class30_Sub2 aClass30_Sub2_1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIILclient!f;)V")
	public Class30_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30_Sub2 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static314.method4500(arg1, arg0));
		this.aClass30_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)I")
	@Override
	public int method5620() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
	}
}
