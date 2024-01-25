import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class10_Sub1_Sub5 extends Class10_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "Lclient!ag;")
	public Class10_Sub1 aClass10_Sub1_2;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIIILclient!ag;)V")
	public Class10_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class10_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static164.method3179(arg1, arg0));
		this.aClass10_Sub1_2 = arg10;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return 0;
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return 0;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return false;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return 0;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass10_Sub1_2.method7731(arg0);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "(Z)I")
	@Override
	public int method7342() {
		return 0;
	}
}
