import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class63_Sub1(@OriginalArg(0) Class163_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		super.aClass163_Sub2_43.method4169(false);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		super.aClass163_Sub2_43.method4118(arg0);
		super.aClass163_Sub2_43.method4107(arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		super.aClass163_Sub2_43.method4169(true);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
