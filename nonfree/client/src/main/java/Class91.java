import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class91 {

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!s;")
	private final Class86 aClass86_47;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
	public Class91(@OriginalArg(0) int arg0) {
		this.aClass86_47 = new Class86(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(JI)Lclient!rb;")
	public Class24 method2702(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub2_Sub22 local10 = (Class2_Sub2_Sub22) this.aClass86_47.method2643(arg0);
		return local10 == null ? null : local10.aClass24_3;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(JI)V")
	public void method2706(@OriginalArg(0) long arg0) {
		this.aClass86_47.method2648(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public void method2709() {
		this.aClass86_47.method2641();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(JZLclient!rb;)V")
	public void method2710(@OriginalArg(0) long arg0, @OriginalArg(2) Class24 arg1) {
		this.aClass86_47.method2647(new Class2_Sub2_Sub22(arg1), arg0);
	}
}
