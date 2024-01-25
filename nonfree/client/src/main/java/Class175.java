import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class175 {

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!jda;")
	private Class2_Sub5 aClass2_Sub5_35;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!jda;")
	public final Class2_Sub5 aClass2_Sub5_34 = new Class2_Sub5();

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class175() {
		this.aClass2_Sub5_34.aClass2_Sub5_67 = this.aClass2_Sub5_34;
		this.aClass2_Sub5_34.aClass2_Sub5_66 = this.aClass2_Sub5_34;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Lclient!jda;")
	public Class2_Sub5 method4280() {
		@Pc(12) Class2_Sub5 local12 = this.aClass2_Sub5_34.aClass2_Sub5_66;
		if (local12 == this.aClass2_Sub5_34) {
			this.aClass2_Sub5_35 = null;
			return null;
		} else {
			this.aClass2_Sub5_35 = local12.aClass2_Sub5_66;
			return local12;
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
	public int method4282() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class2_Sub5 local9 = this.aClass2_Sub5_34.aClass2_Sub5_66;
		while (local9 != this.aClass2_Sub5_34) {
			local9 = local9.aClass2_Sub5_66;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public void method4283() {
		while (true) {
			@Pc(7) Class2_Sub5 local7 = this.aClass2_Sub5_34.aClass2_Sub5_66;
			if (local7 == this.aClass2_Sub5_34) {
				this.aClass2_Sub5_35 = null;
				return;
			}
			local7.method8464();
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Lclient!jda;")
	public Class2_Sub5 method4284() {
		@Pc(14) Class2_Sub5 local14 = this.aClass2_Sub5_34.aClass2_Sub5_66;
		if (this.aClass2_Sub5_34 == local14) {
			return null;
		} else {
			local14.method8464();
			return local14;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!jda;I)V")
	public void method4287(@OriginalArg(0) Class2_Sub5 arg0) {
		if (arg0.aClass2_Sub5_67 != null) {
			arg0.method8464();
		}
		arg0.aClass2_Sub5_66 = this.aClass2_Sub5_34;
		arg0.aClass2_Sub5_67 = this.aClass2_Sub5_34.aClass2_Sub5_67;
		arg0.aClass2_Sub5_67.aClass2_Sub5_66 = arg0;
		arg0.aClass2_Sub5_66.aClass2_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(Z)Lclient!jda;")
	public Class2_Sub5 method4288() {
		@Pc(6) Class2_Sub5 local6 = this.aClass2_Sub5_35;
		if (local6 == this.aClass2_Sub5_34) {
			this.aClass2_Sub5_35 = null;
			return null;
		} else {
			this.aClass2_Sub5_35 = local6.aClass2_Sub5_66;
			return local6;
		}
	}
}
