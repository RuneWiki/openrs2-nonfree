import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Lclient!na;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIILclient!na;)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3) {
		super(arg0, arg1, arg2, arg3.aShort71, false, false);
		this.aClass11_Sub2_1 = arg3;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return 0;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return 0;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return false;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return 0;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
	}
}
