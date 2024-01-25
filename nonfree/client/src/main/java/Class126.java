import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class126 {

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!tp;")
	private Class1 aClass1_14;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!tp;")
	private final Class1 aClass1_13 = new Class1();

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class126() {
		this.aClass1_13.aClass1_24 = this.aClass1_13;
		this.aClass1_13.aClass1_23 = this.aClass1_13;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!tp;")
	public Class1 method3389() {
		@Pc(7) Class1 local7 = this.aClass1_13.aClass1_23;
		if (this.aClass1_13 == local7) {
			this.aClass1_14 = null;
			return null;
		} else {
			this.aClass1_14 = local7.aClass1_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!tp;")
	public Class1 method3391() {
		@Pc(14) Class1 local14 = this.aClass1_13.aClass1_23;
		if (this.aClass1_13 == local14) {
			return null;
		} else {
			local14.method5701();
			return local14;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)I")
	public int method3393() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1 local11 = this.aClass1_13.aClass1_23; local11 != this.aClass1_13; local11 = local11.aClass1_23) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lclient!tp;")
	public Class1 method3394() {
		@Pc(11) Class1 local11 = this.aClass1_14;
		if (this.aClass1_13 == local11) {
			this.aClass1_14 = null;
			return null;
		} else {
			this.aClass1_14 = local11.aClass1_23;
			return local11;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)Z")
	public boolean method3396() {
		return this.aClass1_13 == this.aClass1_13.aClass1_23;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public void method3398() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_13.aClass1_23;
			if (local9 == this.aClass1_13) {
				this.aClass1_14 = null;
				return;
			}
			local9.method5701();
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Lclient!tp;")
	public Class1 method3399() {
		@Pc(7) Class1 local7 = this.aClass1_13.aClass1_24;
		if (this.aClass1_13 == local7) {
			this.aClass1_14 = null;
			return null;
		} else {
			this.aClass1_14 = local7.aClass1_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!tp;B)V")
	public void method3401(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_24 != null) {
			arg0.method5701();
		}
		arg0.aClass1_24 = this.aClass1_13.aClass1_24;
		arg0.aClass1_23 = this.aClass1_13;
		arg0.aClass1_24.aClass1_23 = arg0;
		arg0.aClass1_23.aClass1_24 = arg0;
	}
}
