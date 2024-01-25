import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class32 {

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!fq;")
	private Class2 aClass2_10;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!fq;")
	private final Class2 aClass2_9 = new Class2();

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class32() {
		this.aClass2_9.aClass2_24 = this.aClass2_9;
		this.aClass2_9.aClass2_23 = this.aClass2_9;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	public int method838() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2 local11 = this.aClass2_9.aClass2_23;
		while (local11 != this.aClass2_9) {
			local11 = local11.aClass2_23;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)Z")
	public boolean method839() {
		return this.aClass2_9 == this.aClass2_9.aClass2_23;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Lclient!fq;")
	public Class2 method843() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_23;
		if (local7 == this.aClass2_9) {
			return null;
		} else {
			local7.method5419();
			return local7;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!fq;)V")
	public void method844(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_24 != null) {
			arg0.method5419();
		}
		arg0.aClass2_24 = this.aClass2_9.aClass2_24;
		arg0.aClass2_23 = this.aClass2_9;
		arg0.aClass2_24.aClass2_23 = arg0;
		arg0.aClass2_23.aClass2_24 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)Lclient!fq;")
	public Class2 method846() {
		@Pc(6) Class2 local6 = this.aClass2_10;
		if (local6 == this.aClass2_9) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local6.aClass2_23;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(Z)Lclient!fq;")
	public Class2 method847() {
		@Pc(14) Class2 local14 = this.aClass2_9.aClass2_24;
		if (this.aClass2_9 == local14) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local14.aClass2_24;
			return local14;
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)Lclient!fq;")
	public Class2 method850() {
		@Pc(7) Class2 local7 = this.aClass2_9.aClass2_23;
		if (this.aClass2_9 == local7) {
			this.aClass2_10 = null;
			return null;
		} else {
			this.aClass2_10 = local7.aClass2_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
	public void method851() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_9.aClass2_23;
			if (local5 == this.aClass2_9) {
				this.aClass2_10 = null;
				return;
			}
			local5.method5419();
		}
	}
}
