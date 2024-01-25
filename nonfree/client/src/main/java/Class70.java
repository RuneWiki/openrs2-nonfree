import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class70 {

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Lclient!sr;")
	private Class1_Sub1 aClass1_Sub1_6;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "Lclient!sr;")
	public final Class1_Sub1 aClass1_Sub1_5 = new Class1_Sub1();

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class70() {
		this.aClass1_Sub1_5.aClass1_Sub1_8 = this.aClass1_Sub1_5;
		this.aClass1_Sub1_5.aClass1_Sub1_7 = this.aClass1_Sub1_5;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Lclient!sr;")
	public Class1_Sub1 method2171() {
		@Pc(6) Class1_Sub1 local6 = this.aClass1_Sub1_6;
		if (local6 == this.aClass1_Sub1_5) {
			this.aClass1_Sub1_6 = null;
			return null;
		} else {
			this.aClass1_Sub1_6 = local6.aClass1_Sub1_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!sr;I)V")
	public void method2172(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_8 != null) {
			arg0.method5703();
		}
		arg0.aClass1_Sub1_7 = this.aClass1_Sub1_5;
		arg0.aClass1_Sub1_8 = this.aClass1_Sub1_5.aClass1_Sub1_8;
		arg0.aClass1_Sub1_8.aClass1_Sub1_7 = arg0;
		arg0.aClass1_Sub1_7.aClass1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Lclient!sr;")
	public Class1_Sub1 method2174() {
		@Pc(13) Class1_Sub1 local13 = this.aClass1_Sub1_5.aClass1_Sub1_7;
		if (local13 == this.aClass1_Sub1_5) {
			this.aClass1_Sub1_6 = null;
			return null;
		} else {
			this.aClass1_Sub1_6 = local13.aClass1_Sub1_7;
			return local13;
		}
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V")
	public void method2176() {
		while (true) {
			@Pc(15) Class1_Sub1 local15 = this.aClass1_Sub1_5.aClass1_Sub1_7;
			if (this.aClass1_Sub1_5 == local15) {
				this.aClass1_Sub1_6 = null;
				return;
			}
			local15.method5703();
		}
	}
}
