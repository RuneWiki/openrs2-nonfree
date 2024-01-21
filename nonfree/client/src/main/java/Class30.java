import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class30 {

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "Lclient!hb;")
	private final Class2_Sub1 aClass2_Sub1_42 = new Class2_Sub1();

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class30() {
		this.aClass2_Sub1_42.aClass2_Sub1_62 = this.aClass2_Sub1_42;
		this.aClass2_Sub1_42.aClass2_Sub1_61 = this.aClass2_Sub1_42;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!hb;")
	public Class2_Sub1 method1217() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_42.aClass2_Sub1_61;
		if (local12 == this.aClass2_Sub1_42) {
			return null;
		} else {
			local12.method1773();
			return local12;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!hb;)V")
	public void method1218(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_62 != null) {
			arg0.method1773();
		}
		arg0.aClass2_Sub1_61 = this.aClass2_Sub1_42;
		arg0.aClass2_Sub1_62 = this.aClass2_Sub1_42.aClass2_Sub1_62;
		arg0.aClass2_Sub1_62.aClass2_Sub1_61 = arg0;
		arg0.aClass2_Sub1_61.aClass2_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lclient!hb;")
	public Class2_Sub1 method1228() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_42.aClass2_Sub1_61;
		return local12 == this.aClass2_Sub1_42 ? null : local12;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!hb;)V")
	public void method1233(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_62 != null) {
			arg0.method1773();
		}
		arg0.aClass2_Sub1_61 = this.aClass2_Sub1_42.aClass2_Sub1_61;
		arg0.aClass2_Sub1_62 = this.aClass2_Sub1_42;
		arg0.aClass2_Sub1_62.aClass2_Sub1_61 = arg0;
		arg0.aClass2_Sub1_61.aClass2_Sub1_62 = arg0;
	}
}
