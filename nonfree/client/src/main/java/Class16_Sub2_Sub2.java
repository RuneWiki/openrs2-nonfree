import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class16_Sub2_Sub2 extends Class16_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!en", name = "I", descriptor = "Lclient!ii;")
	public Class16_Sub2 aClass16_Sub2_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIILclient!ii;)V")
	public Class16_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class16_Sub2 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static325.method4394(arg1, arg0));
		this.aClass16_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)I")
	@Override
	public int method5354() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5349(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5348(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	@Override
	public int method5350() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)I")
	@Override
	public int method3583() {
		return 0;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	@Override
	public void method5353() {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	@Override
	public Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5351() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
