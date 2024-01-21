import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class77 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!ig;")
	private final Class47 aClass47_22;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.aClass47_22 = new Class47(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!e;JI)V")
	public void method2257(@OriginalArg(0) Class8 arg0, @OriginalArg(1) long arg1) {
		this.aClass47_22.method1273(arg1, new Class1_Sub3_Sub9(arg0));
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(JB)Lclient!e;")
	public Class8 method2259(@OriginalArg(0) long arg0) {
		@Pc(16) Class1_Sub3_Sub9 local16 = (Class1_Sub3_Sub9) this.aClass47_22.method1281(arg0);
		return local16 == null ? null : local16.aClass8_3;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public void method2260() {
		this.aClass47_22.method1276();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IJ)V")
	public void method2264(@OriginalArg(1) long arg0) {
		this.aClass47_22.method1278(arg0);
	}
}
