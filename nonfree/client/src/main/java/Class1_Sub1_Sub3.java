import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "Lclient!va;")
	public Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIILclient!va;)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass1_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return 0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return 0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return 0;
	}
}
