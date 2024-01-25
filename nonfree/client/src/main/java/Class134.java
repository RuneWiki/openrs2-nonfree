import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class134 {

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "Lclient!gs;")
	private Class55 aClass55_12;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "Lclient!gs;")
	private final Class55 aClass55_11 = new Class55();

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
	public Class134() {
		this.aClass55_11.aClass55_26 = this.aClass55_11;
		this.aClass55_11.aClass55_25 = this.aClass55_11;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
	public boolean method3227() {
		return this.aClass55_11 == this.aClass55_11.aClass55_26;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I")
	public int method3229() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class55 local9 = this.aClass55_11.aClass55_26;
		while (local9 != this.aClass55_11) {
			local9 = local9.aClass55_26;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)Lclient!gs;")
	public Class55 method3230() {
		@Pc(11) Class55 local11 = this.aClass55_12;
		if (local11 == this.aClass55_11) {
			this.aClass55_12 = null;
			return null;
		} else {
			this.aClass55_12 = local11.aClass55_26;
			return local11;
		}
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(B)V")
	public void method3232() {
		while (true) {
			@Pc(7) Class55 local7 = this.aClass55_11.aClass55_26;
			if (this.aClass55_11 == local7) {
				this.aClass55_12 = null;
				return;
			}
			local7.method7112();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lclient!gs;")
	public Class55 method3233() {
		@Pc(13) Class55 local13 = this.aClass55_11.aClass55_26;
		if (this.aClass55_11 == local13) {
			this.aClass55_12 = null;
			return null;
		} else {
			this.aClass55_12 = local13.aClass55_26;
			return local13;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Lclient!gs;")
	public Class55 method3234() {
		@Pc(7) Class55 local7 = this.aClass55_11.aClass55_26;
		if (local7 == this.aClass55_11) {
			return null;
		} else {
			local7.method7112();
			return local7;
		}
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)Lclient!gs;")
	public Class55 method3235() {
		@Pc(7) Class55 local7 = this.aClass55_11.aClass55_25;
		if (this.aClass55_11 == local7) {
			this.aClass55_12 = null;
			return null;
		} else {
			this.aClass55_12 = local7.aClass55_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLclient!gs;)V")
	public void method3236(@OriginalArg(1) Class55 arg0) {
		if (arg0.aClass55_25 != null) {
			arg0.method7112();
		}
		arg0.aClass55_25 = this.aClass55_11.aClass55_25;
		arg0.aClass55_26 = this.aClass55_11;
		arg0.aClass55_25.aClass55_26 = arg0;
		arg0.aClass55_26.aClass55_25 = arg0;
	}
}
