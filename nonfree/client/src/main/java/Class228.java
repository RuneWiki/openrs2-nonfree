import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class228 {

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "Lclient!ok;")
	private Class22_Sub4 aClass22_Sub4_8;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!ok;")
	public final Class22_Sub4 aClass22_Sub4_7 = new Class22_Sub4();

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class228() {
		this.aClass22_Sub4_7.aClass22_Sub4_6 = this.aClass22_Sub4_7;
		this.aClass22_Sub4_7.aClass22_Sub4_5 = this.aClass22_Sub4_7;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lclient!ok;")
	public Class22_Sub4 method5360() {
		@Pc(11) Class22_Sub4 local11 = this.aClass22_Sub4_8;
		if (local11 == this.aClass22_Sub4_7) {
			this.aClass22_Sub4_8 = null;
			return null;
		} else {
			this.aClass22_Sub4_8 = local11.aClass22_Sub4_6;
			return local11;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lclient!ok;")
	public Class22_Sub4 method5362() {
		@Pc(7) Class22_Sub4 local7 = this.aClass22_Sub4_7.aClass22_Sub4_6;
		if (this.aClass22_Sub4_7 == local7) {
			this.aClass22_Sub4_8 = null;
			return null;
		} else {
			this.aClass22_Sub4_8 = local7.aClass22_Sub4_6;
			return local7;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ok;I)V")
	public void method5364(@OriginalArg(0) Class22_Sub4 arg0) {
		if (arg0.aClass22_Sub4_5 != null) {
			arg0.method3658();
		}
		arg0.aClass22_Sub4_5 = this.aClass22_Sub4_7.aClass22_Sub4_5;
		arg0.aClass22_Sub4_6 = this.aClass22_Sub4_7;
		arg0.aClass22_Sub4_5.aClass22_Sub4_6 = arg0;
		arg0.aClass22_Sub4_6.aClass22_Sub4_5 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
	public void method5367() {
		while (true) {
			@Pc(14) Class22_Sub4 local14 = this.aClass22_Sub4_7.aClass22_Sub4_6;
			if (local14 == this.aClass22_Sub4_7) {
				this.aClass22_Sub4_8 = null;
				return;
			}
			local14.method3658();
		}
	}
}
