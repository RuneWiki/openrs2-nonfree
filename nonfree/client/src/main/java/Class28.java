import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class28 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!ed;")
	private final Class2_Sub1 aClass2_Sub1_30 = new Class2_Sub1();

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class28() {
		this.aClass2_Sub1_30.aClass2_Sub1_60 = this.aClass2_Sub1_30;
		this.aClass2_Sub1_30.aClass2_Sub1_59 = this.aClass2_Sub1_30;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ed;I)V")
	public void method819(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_60 != null) {
			arg0.method1803();
		}
		arg0.aClass2_Sub1_59 = this.aClass2_Sub1_30;
		arg0.aClass2_Sub1_60 = this.aClass2_Sub1_30.aClass2_Sub1_60;
		arg0.aClass2_Sub1_60.aClass2_Sub1_59 = arg0;
		arg0.aClass2_Sub1_59.aClass2_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lclient!ed;")
	public Class2_Sub1 method824() {
		@Pc(14) Class2_Sub1 local14 = this.aClass2_Sub1_30.aClass2_Sub1_59;
		return this.aClass2_Sub1_30 == local14 ? null : local14;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!ed;)V")
	public void method828(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_60 != null) {
			arg0.method1803();
		}
		arg0.aClass2_Sub1_59 = this.aClass2_Sub1_30.aClass2_Sub1_59;
		arg0.aClass2_Sub1_60 = this.aClass2_Sub1_30;
		arg0.aClass2_Sub1_60.aClass2_Sub1_59 = arg0;
		arg0.aClass2_Sub1_59.aClass2_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Lclient!ed;")
	public Class2_Sub1 method829() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_30.aClass2_Sub1_59;
		if (this.aClass2_Sub1_30 == local3) {
			return null;
		} else {
			local3.method1803();
			return local3;
		}
	}
}
