import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "Lclient!es;")
	public Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIILclient!es;)V")
	public Class2_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub3 arg3) {
		super(arg0, arg1, arg2, arg3.aShort99, false, false);
		this.aClass2_Sub3_1 = arg3;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return 0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return 0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return 0;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
	}
}
