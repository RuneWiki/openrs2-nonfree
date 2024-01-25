import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class280 {

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!as;")
	private Class12_Sub4 aClass12_Sub4_52;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!as;")
	private final Class12_Sub4 aClass12_Sub4_51 = new Class12_Sub4();

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class280() {
		this.aClass12_Sub4_51.aClass12_Sub4_60 = this.aClass12_Sub4_51;
		this.aClass12_Sub4_51.aClass12_Sub4_59 = this.aClass12_Sub4_51;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Lclient!as;")
	public Class12_Sub4 method6888() {
		@Pc(7) Class12_Sub4 local7 = this.aClass12_Sub4_51.aClass12_Sub4_59;
		if (local7 == this.aClass12_Sub4_51) {
			return null;
		} else {
			local7.method7959();
			return local7;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)I")
	public int method6890() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class12_Sub4 local18 = this.aClass12_Sub4_51.aClass12_Sub4_59; local18 != this.aClass12_Sub4_51; local18 = local18.aClass12_Sub4_59) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)Lclient!as;")
	public Class12_Sub4 method6892() {
		@Pc(13) Class12_Sub4 local13 = this.aClass12_Sub4_51.aClass12_Sub4_59;
		if (this.aClass12_Sub4_51 == local13) {
			this.aClass12_Sub4_52 = null;
			return null;
		} else {
			this.aClass12_Sub4_52 = local13.aClass12_Sub4_59;
			return local13;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!as;)V")
	public void method6894(@OriginalArg(1) Class12_Sub4 arg0) {
		if (arg0.aClass12_Sub4_60 != null) {
			arg0.method7959();
		}
		arg0.aClass12_Sub4_60 = this.aClass12_Sub4_51.aClass12_Sub4_60;
		arg0.aClass12_Sub4_59 = this.aClass12_Sub4_51;
		arg0.aClass12_Sub4_60.aClass12_Sub4_59 = arg0;
		arg0.aClass12_Sub4_59.aClass12_Sub4_60 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Lclient!as;")
	public Class12_Sub4 method6895() {
		@Pc(6) Class12_Sub4 local6 = this.aClass12_Sub4_52;
		if (this.aClass12_Sub4_51 == local6) {
			this.aClass12_Sub4_52 = null;
			return null;
		} else {
			this.aClass12_Sub4_52 = local6.aClass12_Sub4_59;
			return local6;
		}
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(I)V")
	public void method6896() {
		while (true) {
			@Pc(5) Class12_Sub4 local5 = this.aClass12_Sub4_51.aClass12_Sub4_59;
			if (local5 == this.aClass12_Sub4_51) {
				this.aClass12_Sub4_52 = null;
				return;
			}
			local5.method7959();
		}
	}
}
