import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class43 {

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Lclient!db;")
	private final Class3_Sub1 aClass3_Sub1_46 = new Class3_Sub1();

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class43() {
		this.aClass3_Sub1_46.aClass3_Sub1_63 = this.aClass3_Sub1_46;
		this.aClass3_Sub1_46.aClass3_Sub1_64 = this.aClass3_Sub1_46;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lclient!db;")
	public Class3_Sub1 method1386() {
		@Pc(7) Class3_Sub1 local7 = this.aClass3_Sub1_46.aClass3_Sub1_64;
		return this.aClass3_Sub1_46 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!db;)V")
	public void method1389(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_63 != null) {
			arg0.method2270();
		}
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_46;
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_46.aClass3_Sub1_64;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLclient!db;)V")
	public void method1392(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_63 != null) {
			arg0.method2270();
		}
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_46.aClass3_Sub1_63;
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_46;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)Lclient!db;")
	public Class3_Sub1 method1394() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_46.aClass3_Sub1_64;
		if (local3 == this.aClass3_Sub1_46) {
			return null;
		} else {
			local3.method2270();
			return local3;
		}
	}
}
