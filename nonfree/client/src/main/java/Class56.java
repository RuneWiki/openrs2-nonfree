import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class56 {

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!ld;")
	private final Class3_Sub1 aClass3_Sub1_52 = new Class3_Sub1();

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass3_Sub1_52.aClass3_Sub1_63 = this.aClass3_Sub1_52;
		this.aClass3_Sub1_52.aClass3_Sub1_64 = this.aClass3_Sub1_52;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lclient!ld;")
	public Class3_Sub1 method1538() {
		@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1_52.aClass3_Sub1_64;
		return this.aClass3_Sub1_52 == local12 ? null : local12;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!ld;)V")
	public void method1542(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_63 != null) {
			arg0.method1931();
		}
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_52.aClass3_Sub1_64;
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_52;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ld;I)V")
	public void method1546(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_63 != null) {
			arg0.method1931();
		}
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_52;
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_52.aClass3_Sub1_63;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lclient!ld;")
	public Class3_Sub1 method1547() {
		@Pc(8) Class3_Sub1 local8 = this.aClass3_Sub1_52.aClass3_Sub1_64;
		if (local8 == this.aClass3_Sub1_52) {
			return null;
		} else {
			local8.method1931();
			return local8;
		}
	}
}
