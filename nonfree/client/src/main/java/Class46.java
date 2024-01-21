import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class46 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!ri;")
	private final Class86 aClass86_32;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
	public Class46(@OriginalArg(0) int arg0) {
		this.aClass86_32 = new Class86(arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)V")
	public void method1584(@OriginalArg(1) long arg0) {
		this.aClass86_32.method2818(arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!wd;JI)V")
	public void method1586(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		this.aClass86_32.method2821(new Class1_Sub2_Sub17(arg0), arg1);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public void method1587() {
		this.aClass86_32.method2817();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IJ)Lclient!wd;")
	public Class5 method1588(@OriginalArg(1) long arg0) {
		@Pc(12) Class1_Sub2_Sub17 local12 = (Class1_Sub2_Sub17) this.aClass86_32.method2816(arg0);
		return local12 == null ? null : local12.aClass5_7;
	}
}
