import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class77 {

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!po;")
	private Class30 aClass30_6;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!po;")
	private final Class30 aClass30_5 = new Class30();

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class77() {
		this.aClass30_5.aClass30_25 = this.aClass30_5;
		this.aClass30_5.aClass30_26 = this.aClass30_5;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lclient!po;")
	public Class30 method2157() {
		@Pc(7) Class30 local7 = this.aClass30_5.aClass30_26;
		if (local7 == this.aClass30_5) {
			this.aClass30_6 = null;
			return null;
		} else {
			this.aClass30_6 = local7.aClass30_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Z")
	public boolean method2158() {
		return this.aClass30_5 == this.aClass30_5.aClass30_26;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)Lclient!po;")
	public Class30 method2160() {
		@Pc(14) Class30 local14 = this.aClass30_6;
		if (this.aClass30_5 == local14) {
			this.aClass30_6 = null;
			return null;
		} else {
			this.aClass30_6 = local14.aClass30_26;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)Lclient!po;")
	public Class30 method2161() {
		@Pc(12) Class30 local12 = this.aClass30_5.aClass30_25;
		if (this.aClass30_5 == local12) {
			this.aClass30_6 = null;
			return null;
		} else {
			this.aClass30_6 = local12.aClass30_25;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)I")
	public int method2162() {
		@Pc(7) int local7 = 0;
		@Pc(18) Class30 local18 = this.aClass30_5.aClass30_26;
		while (this.aClass30_5 != local18) {
			local18 = local18.aClass30_26;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Lclient!po;")
	public Class30 method2163() {
		@Pc(15) Class30 local15 = this.aClass30_5.aClass30_26;
		if (local15 == this.aClass30_5) {
			return null;
		} else {
			local15.method6004();
			return local15;
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	public void method2164() {
		while (true) {
			@Pc(16) Class30 local16 = this.aClass30_5.aClass30_26;
			if (local16 == this.aClass30_5) {
				this.aClass30_6 = null;
				return;
			}
			local16.method6004();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!po;)V")
	public void method2165(@OriginalArg(1) Class30 arg0) {
		if (arg0.aClass30_25 != null) {
			arg0.method6004();
		}
		arg0.aClass30_26 = this.aClass30_5;
		arg0.aClass30_25 = this.aClass30_5.aClass30_25;
		arg0.aClass30_25.aClass30_26 = arg0;
		arg0.aClass30_26.aClass30_25 = arg0;
	}
}
