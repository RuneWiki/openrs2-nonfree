import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class94 {

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!ri;")
	private final Class85 aClass85_37;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	public Class94(@OriginalArg(0) int arg0) {
		this.aClass85_37 = new Class85(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(JI)Lclient!m;")
	public Class26 method3153(@OriginalArg(0) long arg0) {
		@Pc(12) Class3_Sub3_Sub18 local12 = (Class3_Sub3_Sub18) this.aClass85_37.method2558(arg0);
		return local12 == null ? null : local12.aClass26_7;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(JLclient!m;B)V")
	public void method3154(@OriginalArg(0) long arg0, @OriginalArg(1) Class26 arg1) {
		this.aClass85_37.method2560(new Class3_Sub3_Sub18(arg1), arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZJ)V")
	public void method3155(@OriginalArg(1) long arg0) {
		this.aClass85_37.method2561(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public void method3157() {
		this.aClass85_37.method2557();
	}
}
