import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class138 {

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!gs;")
	private Class6 aClass6_16;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lclient!gs;")
	private final Class6 aClass6_15 = new Class6();

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class138() {
		this.aClass6_15.aClass6_23 = this.aClass6_15;
		this.aClass6_15.aClass6_24 = this.aClass6_15;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Lclient!gs;")
	public Class6 method3305() {
		@Pc(14) Class6 local14 = this.aClass6_15.aClass6_24;
		if (local14 == this.aClass6_15) {
			return null;
		} else {
			local14.method5914();
			return local14;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)I")
	public int method3306() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class6 local16 = this.aClass6_15.aClass6_24;
		while (local16 != this.aClass6_15) {
			local16 = local16.aClass6_24;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!gs;)V")
	public void method3307(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_23 != null) {
			arg0.method5914();
		}
		arg0.aClass6_23 = this.aClass6_15.aClass6_23;
		arg0.aClass6_24 = this.aClass6_15;
		arg0.aClass6_23.aClass6_24 = arg0;
		arg0.aClass6_24.aClass6_23 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
	public void method3308() {
		while (true) {
			@Pc(3) Class6 local3 = this.aClass6_15.aClass6_24;
			if (local3 == this.aClass6_15) {
				this.aClass6_16 = null;
				return;
			}
			local3.method5914();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)Lclient!gs;")
	public Class6 method3309() {
		@Pc(7) Class6 local7 = this.aClass6_15.aClass6_23;
		if (this.aClass6_15 == local7) {
			this.aClass6_16 = null;
			return null;
		} else {
			this.aClass6_16 = local7.aClass6_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)Lclient!gs;")
	public Class6 method3311() {
		@Pc(7) Class6 local7 = this.aClass6_15.aClass6_24;
		if (local7 == this.aClass6_15) {
			this.aClass6_16 = null;
			return null;
		} else {
			this.aClass6_16 = local7.aClass6_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(Z)Lclient!gs;")
	public Class6 method3312() {
		@Pc(6) Class6 local6 = this.aClass6_16;
		if (local6 == this.aClass6_15) {
			this.aClass6_16 = null;
			return null;
		} else {
			this.aClass6_16 = local6.aClass6_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)Z")
	public boolean method3313() {
		return this.aClass6_15.aClass6_24 == this.aClass6_15;
	}
}
