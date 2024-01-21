import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class61 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!ea;")
	private final Class2_Sub1 aClass2_Sub1_40 = new Class2_Sub1();

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class61() {
		this.aClass2_Sub1_40.aClass2_Sub1_61 = this.aClass2_Sub1_40;
		this.aClass2_Sub1_40.aClass2_Sub1_62 = this.aClass2_Sub1_40;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!ea;)V")
	public void method1783(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_62 != null) {
			arg0.method3186();
		}
		arg0.aClass2_Sub1_61 = this.aClass2_Sub1_40;
		arg0.aClass2_Sub1_62 = this.aClass2_Sub1_40.aClass2_Sub1_62;
		arg0.aClass2_Sub1_62.aClass2_Sub1_61 = arg0;
		arg0.aClass2_Sub1_61.aClass2_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILclient!ea;)V")
	public void method1785(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_62 != null) {
			arg0.method3186();
		}
		arg0.aClass2_Sub1_61 = this.aClass2_Sub1_40.aClass2_Sub1_61;
		arg0.aClass2_Sub1_62 = this.aClass2_Sub1_40;
		arg0.aClass2_Sub1_62.aClass2_Sub1_61 = arg0;
		arg0.aClass2_Sub1_61.aClass2_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)Lclient!ea;")
	public Class2_Sub1 method1786() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_40.aClass2_Sub1_61;
		return this.aClass2_Sub1_40 == local3 ? null : local3;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)Lclient!ea;")
	public Class2_Sub1 method1791() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_40.aClass2_Sub1_61;
		if (local3 == this.aClass2_Sub1_40) {
			return null;
		} else {
			local3.method3186();
			return local3;
		}
	}
}
