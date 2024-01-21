import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class28 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!qb;")
	private final Class2_Sub1 aClass2_Sub1_23 = new Class2_Sub1();

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class28() {
		this.aClass2_Sub1_23.aClass2_Sub1_59 = this.aClass2_Sub1_23;
		this.aClass2_Sub1_23.aClass2_Sub1_60 = this.aClass2_Sub1_23;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lclient!qb;")
	public Class2_Sub1 method817() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_23.aClass2_Sub1_59;
		return this.aClass2_Sub1_23 == local12 ? null : local12;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!qb;)V")
	public void method822(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_60 != null) {
			arg0.method2053();
		}
		arg0.aClass2_Sub1_60 = this.aClass2_Sub1_23;
		arg0.aClass2_Sub1_59 = this.aClass2_Sub1_23.aClass2_Sub1_59;
		arg0.aClass2_Sub1_60.aClass2_Sub1_59 = arg0;
		arg0.aClass2_Sub1_59.aClass2_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Lclient!qb;")
	public Class2_Sub1 method823() {
		@Pc(14) Class2_Sub1 local14 = this.aClass2_Sub1_23.aClass2_Sub1_59;
		if (this.aClass2_Sub1_23 == local14) {
			return null;
		} else {
			local14.method2053();
			return local14;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(BLclient!qb;)V")
	public void method824(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_60 != null) {
			arg0.method2053();
		}
		arg0.aClass2_Sub1_60 = this.aClass2_Sub1_23.aClass2_Sub1_60;
		arg0.aClass2_Sub1_59 = this.aClass2_Sub1_23;
		arg0.aClass2_Sub1_60.aClass2_Sub1_59 = arg0;
		arg0.aClass2_Sub1_59.aClass2_Sub1_60 = arg0;
	}
}
