import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class16 {

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!id;")
	private Class43 aClass43_5;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		this.aClass43_5 = new Class43(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJLclient!nc;)V")
	public void method432(@OriginalArg(1) long arg0, @OriginalArg(2) Class12 arg1) {
		this.aClass43_5.method1462(arg0, new Class2_Sub2_Sub8(arg1));
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZJ)V")
	public void method435(@OriginalArg(1) long arg0) {
		this.aClass43_5.method1465(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public void method436() {
		this.aClass43_5.method1469();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJ)Lclient!nc;")
	public Class12 method437(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub2_Sub8 local15 = (Class2_Sub2_Sub8) this.aClass43_5.method1464(arg0);
		return local15 == null ? null : local15.aClass12_3;
	}
}
