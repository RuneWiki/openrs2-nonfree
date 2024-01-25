import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 implements Interface8 {

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "Lclient!v;")
	public Class1_Sub5 aClass1_Sub5_3;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIILclient!v;)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub5 arg5) {
		super(arg2, arg3, arg4, Static34.method469(arg0, arg1));
		this.aClass1_Sub5_3 = arg5;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return false;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
	}
}
