import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class67 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!uc;")
	private final Class87 aClass87_59;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		this.aClass87_59 = new Class87(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IJ)V")
	public void method2566(@OriginalArg(1) long arg0) {
		this.aClass87_59.method3058(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wg;ZJ)V")
	public void method2567(@OriginalArg(0) Class6 arg0, @OriginalArg(2) long arg1) {
		this.aClass87_59.method3068(new Class1_Sub2_Sub15(arg0), arg1);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public void method2568() {
		this.aClass87_59.method3061();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(JZ)Lclient!wg;")
	public Class6 method2570(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2_Sub15 local10 = (Class1_Sub2_Sub15) this.aClass87_59.method3062(arg0);
		return local10 == null ? null : local10.aClass6_4;
	}
}
