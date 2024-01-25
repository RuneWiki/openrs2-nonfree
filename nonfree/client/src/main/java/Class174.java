import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class174 {

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "Lclient!js;")
	private Class2_Sub1 aClass2_Sub1_40;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!js;")
	private final Class2_Sub1 aClass2_Sub1_39 = new Class2_Sub1();

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class174() {
		this.aClass2_Sub1_39.aClass2_Sub1_53 = this.aClass2_Sub1_39;
		this.aClass2_Sub1_39.aClass2_Sub1_54 = this.aClass2_Sub1_39;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)I")
	public int method4097() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class2_Sub1 local16 = this.aClass2_Sub1_39.aClass2_Sub1_54; local16 != this.aClass2_Sub1_39; local16 = local16.aClass2_Sub1_54) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)Lclient!js;")
	public Class2_Sub1 method4098() {
		@Pc(6) Class2_Sub1 local6 = this.aClass2_Sub1_40;
		if (this.aClass2_Sub1_39 == local6) {
			this.aClass2_Sub1_40 = null;
			return null;
		} else {
			this.aClass2_Sub1_40 = local6.aClass2_Sub1_54;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!js;)V")
	public void method4099(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_53 != null) {
			arg0.method5748();
		}
		arg0.aClass2_Sub1_53 = this.aClass2_Sub1_39.aClass2_Sub1_53;
		arg0.aClass2_Sub1_54 = this.aClass2_Sub1_39;
		arg0.aClass2_Sub1_53.aClass2_Sub1_54 = arg0;
		arg0.aClass2_Sub1_54.aClass2_Sub1_53 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V")
	public void method4101() {
		while (true) {
			@Pc(9) Class2_Sub1 local9 = this.aClass2_Sub1_39.aClass2_Sub1_54;
			if (this.aClass2_Sub1_39 == local9) {
				this.aClass2_Sub1_40 = null;
				return;
			}
			local9.method5748();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Lclient!js;")
	public Class2_Sub1 method4102() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_39.aClass2_Sub1_54;
		if (local7 == this.aClass2_Sub1_39) {
			this.aClass2_Sub1_40 = null;
			return null;
		} else {
			this.aClass2_Sub1_40 = local7.aClass2_Sub1_54;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)Lclient!js;")
	public Class2_Sub1 method4104() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_39.aClass2_Sub1_54;
		if (local7 == this.aClass2_Sub1_39) {
			return null;
		} else {
			local7.method5748();
			return local7;
		}
	}
}
