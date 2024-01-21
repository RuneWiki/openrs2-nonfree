import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class79 {

	@OriginalMember(owner = "client!q", name = "p", descriptor = "Lclient!kg;")
	private final Class53 aClass53_20;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.aClass53_20 = new Class53(arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZJ)V")
	public void method2348(@OriginalArg(1) long arg0) {
		this.aClass53_20.method1646(arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JLclient!mf;Z)V")
	public void method2349(@OriginalArg(0) long arg0, @OriginalArg(1) Class7 arg1) {
		this.aClass53_20.method1645(arg0, new Class2_Sub1_Sub14(arg1));
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method2351() {
		this.aClass53_20.method1649();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)Lclient!mf;")
	public Class7 method2352(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1_Sub14 local10 = (Class2_Sub1_Sub14) this.aClass53_20.method1648(arg0);
		return local10 == null ? null : local10.aClass7_7;
	}
}
