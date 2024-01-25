import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class210 {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!ng;")
	private Class10 aClass10_24;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!ng;")
	private final Class10 aClass10_23 = new Class10();

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class210() {
		this.aClass10_23.aClass10_22 = this.aClass10_23;
		this.aClass10_23.aClass10_21 = this.aClass10_23;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	public int method5607() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class10 local11 = this.aClass10_23.aClass10_21;
		while (this.aClass10_23 != local11) {
			local11 = local11.aClass10_21;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!ng;")
	public Class10 method5608() {
		@Pc(13) Class10 local13 = this.aClass10_23.aClass10_21;
		if (local13 == this.aClass10_23) {
			this.aClass10_24 = null;
			return null;
		} else {
			this.aClass10_24 = local13.aClass10_21;
			return local13;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z")
	public boolean method5609() {
		return this.aClass10_23.aClass10_21 == this.aClass10_23;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Lclient!ng;")
	public Class10 method5611() {
		@Pc(12) Class10 local12 = this.aClass10_23.aClass10_22;
		if (local12 == this.aClass10_23) {
			this.aClass10_24 = null;
			return null;
		} else {
			this.aClass10_24 = local12.aClass10_22;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ng;Z)V")
	public void method5612(@OriginalArg(0) Class10 arg0) {
		if (arg0.aClass10_22 != null) {
			arg0.method5452();
		}
		arg0.aClass10_22 = this.aClass10_23.aClass10_22;
		arg0.aClass10_21 = this.aClass10_23;
		arg0.aClass10_22.aClass10_21 = arg0;
		arg0.aClass10_21.aClass10_22 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public void method5614() {
		while (true) {
			@Pc(17) Class10 local17 = this.aClass10_23.aClass10_21;
			if (local17 == this.aClass10_23) {
				this.aClass10_24 = null;
				return;
			}
			local17.method5452();
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Lclient!ng;")
	public Class10 method5615() {
		@Pc(14) Class10 local14 = this.aClass10_24;
		if (local14 == this.aClass10_23) {
			this.aClass10_24 = null;
			return null;
		} else {
			this.aClass10_24 = local14.aClass10_21;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Lclient!ng;")
	public Class10 method5616() {
		@Pc(12) Class10 local12 = this.aClass10_23.aClass10_21;
		if (this.aClass10_23 == local12) {
			return null;
		} else {
			local12.method5452();
			return local12;
		}
	}
}
