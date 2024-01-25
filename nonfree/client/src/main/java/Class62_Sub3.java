import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class62_Sub3(@OriginalArg(0) Class49_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!mk;II)V")
	@Override
	public void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		super.aClass49_Sub2_43.method1646(arg0);
		super.aClass49_Sub2_43.method1624(arg1);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5822(@OriginalArg(1) boolean arg0) {
		super.aClass49_Sub2_43.method1583(true);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	@Override
	public void method5829() {
		super.aClass49_Sub2_43.method1583(false);
	}
}
