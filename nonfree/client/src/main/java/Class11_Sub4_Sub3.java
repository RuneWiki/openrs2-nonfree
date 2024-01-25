import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class11_Sub4_Sub3 extends Class11_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "Lclient!gq;")
	public Class11_Sub4 aClass11_Sub4_3;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIILclient!gq;)V")
	public Class11_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static372.method4836(arg0, arg1));
		this.aClass11_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return 0;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return 0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return 0;
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)I")
	@Override
	public int method4889() {
		return 0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
