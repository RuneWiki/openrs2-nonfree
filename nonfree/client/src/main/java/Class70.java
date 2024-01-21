import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class70 {

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!u;")
	private final Class2_Sub1 aClass2_Sub1_60 = new Class2_Sub1();

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class70() {
		this.aClass2_Sub1_60.aClass2_Sub1_63 = this.aClass2_Sub1_60;
		this.aClass2_Sub1_60.aClass2_Sub1_64 = this.aClass2_Sub1_60;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Lclient!u;")
	public Class2_Sub1 method1846() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_60.aClass2_Sub1_64;
		if (local7 == this.aClass2_Sub1_60) {
			return null;
		} else {
			local7.method1934();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!u;)V")
	public void method1849(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_63 != null) {
			arg0.method1934();
		}
		arg0.aClass2_Sub1_64 = this.aClass2_Sub1_60;
		arg0.aClass2_Sub1_63 = this.aClass2_Sub1_60.aClass2_Sub1_63;
		arg0.aClass2_Sub1_63.aClass2_Sub1_64 = arg0;
		arg0.aClass2_Sub1_64.aClass2_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!u;I)V")
	public void method1850(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_63 != null) {
			arg0.method1934();
		}
		arg0.aClass2_Sub1_64 = this.aClass2_Sub1_60.aClass2_Sub1_64;
		arg0.aClass2_Sub1_63 = this.aClass2_Sub1_60;
		arg0.aClass2_Sub1_63.aClass2_Sub1_64 = arg0;
		arg0.aClass2_Sub1_64.aClass2_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Lclient!u;")
	public Class2_Sub1 method1851() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_60.aClass2_Sub1_64;
		return local3 == this.aClass2_Sub1_60 ? null : local3;
	}
}
