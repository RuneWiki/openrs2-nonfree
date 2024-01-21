import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class50 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!bh;")
	private final Class3_Sub1 aClass3_Sub1_44 = new Class3_Sub1();

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class50() {
		this.aClass3_Sub1_44.aClass3_Sub1_70 = this.aClass3_Sub1_44;
		this.aClass3_Sub1_44.aClass3_Sub1_69 = this.aClass3_Sub1_44;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lclient!bh;")
	public Class3_Sub1 method1595() {
		@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1_44.aClass3_Sub1_70;
		return local12 == this.aClass3_Sub1_44 ? null : local12;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lclient!bh;")
	public Class3_Sub1 method1598() {
		@Pc(10) Class3_Sub1 local10 = this.aClass3_Sub1_44.aClass3_Sub1_70;
		if (this.aClass3_Sub1_44 == local10) {
			return null;
		} else {
			local10.method2681();
			return local10;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!bh;I)V")
	public void method1599(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_69 != null) {
			arg0.method2681();
		}
		arg0.aClass3_Sub1_69 = this.aClass3_Sub1_44.aClass3_Sub1_69;
		arg0.aClass3_Sub1_70 = this.aClass3_Sub1_44;
		arg0.aClass3_Sub1_69.aClass3_Sub1_70 = arg0;
		arg0.aClass3_Sub1_70.aClass3_Sub1_69 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!bh;)V")
	public void method1600(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_69 != null) {
			arg0.method2681();
		}
		arg0.aClass3_Sub1_70 = this.aClass3_Sub1_44.aClass3_Sub1_70;
		arg0.aClass3_Sub1_69 = this.aClass3_Sub1_44;
		arg0.aClass3_Sub1_69.aClass3_Sub1_70 = arg0;
		arg0.aClass3_Sub1_70.aClass3_Sub1_69 = arg0;
	}
}
