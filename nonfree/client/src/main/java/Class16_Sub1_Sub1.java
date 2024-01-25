import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class16_Sub1_Sub1 extends Class16_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!av", name = "H", descriptor = "Lclient!pe;")
	public Class16_Sub1 aClass16_Sub1_2;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIIIILclient!pe;)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class16_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static84.method3341(arg1, arg0));
		this.aClass16_Sub1_2 = arg10;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5351() {
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5348(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return 0;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5349(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)I")
	@Override
	public int method5350() {
		return 0;
	}

	@OriginalMember(owner = "client!av", name = "e", descriptor = "(I)I")
	@Override
	public int method5342() {
		return 0;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
	@Override
	public void method5353() {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	@Override
	public Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(I)I")
	@Override
	public int method5354() {
		return 0;
	}
}
