import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class179 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!dv;")
	private Class4_Sub4 aClass4_Sub4_4;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!dv;")
	public final Class4_Sub4 aClass4_Sub4_3 = new Class4_Sub4();

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class179() {
		this.aClass4_Sub4_3.aClass4_Sub4_9 = this.aClass4_Sub4_3;
		this.aClass4_Sub4_3.aClass4_Sub4_10 = this.aClass4_Sub4_3;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method4234() {
		while (true) {
			@Pc(17) Class4_Sub4 local17 = this.aClass4_Sub4_3.aClass4_Sub4_10;
			if (this.aClass4_Sub4_3 == local17) {
				this.aClass4_Sub4_4 = null;
				return;
			}
			local17.method8572();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)Lclient!dv;")
	public Class4_Sub4 method4235() {
		@Pc(6) Class4_Sub4 local6 = this.aClass4_Sub4_4;
		if (local6 == this.aClass4_Sub4_3) {
			this.aClass4_Sub4_4 = null;
			return null;
		} else {
			this.aClass4_Sub4_4 = local6.aClass4_Sub4_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!dv;)V")
	public void method4236(@OriginalArg(1) Class4_Sub4 arg0) {
		if (arg0.aClass4_Sub4_9 != null) {
			arg0.method8572();
		}
		arg0.aClass4_Sub4_10 = this.aClass4_Sub4_3;
		arg0.aClass4_Sub4_9 = this.aClass4_Sub4_3.aClass4_Sub4_9;
		arg0.aClass4_Sub4_9.aClass4_Sub4_10 = arg0;
		arg0.aClass4_Sub4_10.aClass4_Sub4_9 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
	public int method4237() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class4_Sub4 local19 = this.aClass4_Sub4_3.aClass4_Sub4_10;
		while (this.aClass4_Sub4_3 != local19) {
			local19 = local19.aClass4_Sub4_10;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Lclient!dv;")
	public Class4_Sub4 method4240() {
		@Pc(7) Class4_Sub4 local7 = this.aClass4_Sub4_3.aClass4_Sub4_10;
		if (this.aClass4_Sub4_3 == local7) {
			this.aClass4_Sub4_4 = null;
			return null;
		} else {
			this.aClass4_Sub4_4 = local7.aClass4_Sub4_10;
			return local7;
		}
	}
}
