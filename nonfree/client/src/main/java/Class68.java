import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class68 {

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!ac;")
	private final Class3_Sub1 aClass3_Sub1_52 = new Class3_Sub1();

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class68() {
		this.aClass3_Sub1_52.aClass3_Sub1_63 = this.aClass3_Sub1_52;
		this.aClass3_Sub1_52.aClass3_Sub1_64 = this.aClass3_Sub1_52;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ac;)V")
	public void method1730(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_64 != null) {
			arg0.method2024();
		}
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_52;
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_52.aClass3_Sub1_64;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ac;B)V")
	public void method1734(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_64 != null) {
			arg0.method2024();
		}
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_52.aClass3_Sub1_63;
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_52;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Lclient!ac;")
	public Class3_Sub1 method1735() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_52.aClass3_Sub1_63;
		return this.aClass3_Sub1_52 == local3 ? null : local3;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Lclient!ac;")
	public Class3_Sub1 method1738() {
		@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1_52.aClass3_Sub1_63;
		if (this.aClass3_Sub1_52 == local12) {
			return null;
		} else {
			local12.method2024();
			return local12;
		}
	}
}
