import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class27 {

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "Lclient!ge;")
	private Class39 aClass39_8;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
	public Class27(@OriginalArg(0) int arg0) {
		this.aClass39_8 = new Class39(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!dd;J)V")
	public void method961(@OriginalArg(1) Class9 arg0, @OriginalArg(2) long arg1) {
		this.aClass39_8.method1152(arg1, new Class1_Sub1_Sub12(arg0));
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	public void method963() {
		this.aClass39_8.method1158();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(JI)V")
	public void method964(@OriginalArg(0) long arg0) {
		this.aClass39_8.method1162(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IJ)Lclient!dd;")
	public Class9 method965(@OriginalArg(1) long arg0) {
		@Pc(6) Class1_Sub1_Sub12 local6 = (Class1_Sub1_Sub12) this.aClass39_8.method1161(arg0);
		return local6 == null ? null : local6.aClass9_6;
	}
}
