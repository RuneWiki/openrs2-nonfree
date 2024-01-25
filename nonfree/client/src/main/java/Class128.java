import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class128 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!jo;")
	private Class48 aClass48_18;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!jo;")
	private final Class48 aClass48_17 = new Class48();

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class128() {
		this.aClass48_17.aClass48_23 = this.aClass48_17;
		this.aClass48_17.aClass48_24 = this.aClass48_17;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
	public int method2828() {
		@Pc(7) int local7 = 0;
		@Pc(18) Class48 local18 = this.aClass48_17.aClass48_24;
		while (local18 != this.aClass48_17) {
			local18 = local18.aClass48_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public void method2829() {
		while (true) {
			@Pc(5) Class48 local5 = this.aClass48_17.aClass48_24;
			if (local5 == this.aClass48_17) {
				this.aClass48_18 = null;
				return;
			}
			local5.method5436();
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Lclient!jo;")
	public Class48 method2830() {
		@Pc(12) Class48 local12 = this.aClass48_17.aClass48_24;
		if (local12 == this.aClass48_17) {
			return null;
		} else {
			local12.method5436();
			return local12;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Lclient!jo;")
	public Class48 method2831() {
		@Pc(7) Class48 local7 = this.aClass48_17.aClass48_24;
		if (local7 == this.aClass48_17) {
			this.aClass48_18 = null;
			return null;
		} else {
			this.aClass48_18 = local7.aClass48_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)Lclient!jo;")
	public Class48 method2832() {
		@Pc(12) Class48 local12 = this.aClass48_18;
		if (this.aClass48_17 == local12) {
			this.aClass48_18 = null;
			return null;
		} else {
			this.aClass48_18 = local12.aClass48_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!jo;)V")
	public void method2833(@OriginalArg(1) Class48 arg0) {
		if (arg0.aClass48_23 != null) {
			arg0.method5436();
		}
		arg0.aClass48_23 = this.aClass48_17.aClass48_23;
		arg0.aClass48_24 = this.aClass48_17;
		arg0.aClass48_23.aClass48_24 = arg0;
		arg0.aClass48_24.aClass48_23 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)Z")
	public boolean method2836() {
		return this.aClass48_17.aClass48_24 == this.aClass48_17;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Lclient!jo;")
	public Class48 method2837() {
		@Pc(7) Class48 local7 = this.aClass48_17.aClass48_23;
		if (this.aClass48_17 == local7) {
			this.aClass48_18 = null;
			return null;
		} else {
			this.aClass48_18 = local7.aClass48_23;
			return local7;
		}
	}
}
