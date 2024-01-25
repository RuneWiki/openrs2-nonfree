import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Lclient!mt;")
	public Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIIILclient!mt;)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class1_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static321.method5188(arg1, arg0));
		this.aClass1_Sub2_2 = arg10;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)I")
	@Override
	public int method5894() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}
}
