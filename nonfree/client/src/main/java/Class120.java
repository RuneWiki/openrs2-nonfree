import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class120 {

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!jga;")
	private Class4_Sub6 aClass4_Sub6_22;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!jga;")
	private final Class4_Sub6 aClass4_Sub6_21 = new Class4_Sub6();

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class120() {
		this.aClass4_Sub6_21.aClass4_Sub6_61 = this.aClass4_Sub6_21;
		this.aClass4_Sub6_21.aClass4_Sub6_62 = this.aClass4_Sub6_21;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public void method2665() {
		while (true) {
			@Pc(9) Class4_Sub6 local9 = this.aClass4_Sub6_21.aClass4_Sub6_62;
			if (local9 == this.aClass4_Sub6_21) {
				this.aClass4_Sub6_22 = null;
				return;
			}
			local9.method7880();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Lclient!jga;")
	public Class4_Sub6 method2667() {
		@Pc(12) Class4_Sub6 local12 = this.aClass4_Sub6_21.aClass4_Sub6_62;
		if (this.aClass4_Sub6_21 == local12) {
			return null;
		} else {
			local12.method7880();
			return local12;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!jga;)V")
	public void method2669(@OriginalArg(1) Class4_Sub6 arg0) {
		if (arg0.aClass4_Sub6_61 != null) {
			arg0.method7880();
		}
		arg0.aClass4_Sub6_61 = this.aClass4_Sub6_21.aClass4_Sub6_61;
		arg0.aClass4_Sub6_62 = this.aClass4_Sub6_21;
		arg0.aClass4_Sub6_61.aClass4_Sub6_62 = arg0;
		arg0.aClass4_Sub6_62.aClass4_Sub6_61 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!jga;B)V")
	public void method2670(@OriginalArg(0) Class4_Sub6 arg0) {
		if (arg0.aClass4_Sub6_61 != null) {
			arg0.method7880();
		}
		arg0.aClass4_Sub6_61 = this.aClass4_Sub6_21;
		arg0.aClass4_Sub6_62 = this.aClass4_Sub6_21.aClass4_Sub6_62;
		arg0.aClass4_Sub6_61.aClass4_Sub6_62 = arg0;
		arg0.aClass4_Sub6_62.aClass4_Sub6_61 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lclient!jga;")
	public Class4_Sub6 method2671() {
		@Pc(13) Class4_Sub6 local13 = this.aClass4_Sub6_22;
		if (local13 == this.aClass4_Sub6_21) {
			this.aClass4_Sub6_22 = null;
			return null;
		} else {
			this.aClass4_Sub6_22 = local13.aClass4_Sub6_62;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Lclient!jga;")
	public Class4_Sub6 method2672() {
		@Pc(7) Class4_Sub6 local7 = this.aClass4_Sub6_21.aClass4_Sub6_61;
		if (this.aClass4_Sub6_21 == local7) {
			return null;
		} else {
			local7.method7880();
			return local7;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
	public int method2673() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class4_Sub6 local9 = this.aClass4_Sub6_21.aClass4_Sub6_62;
		while (local9 != this.aClass4_Sub6_21) {
			local9 = local9.aClass4_Sub6_62;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Lclient!jga;")
	public Class4_Sub6 method2674() {
		@Pc(7) Class4_Sub6 local7 = this.aClass4_Sub6_21.aClass4_Sub6_62;
		if (this.aClass4_Sub6_21 == local7) {
			this.aClass4_Sub6_22 = null;
			return null;
		} else {
			this.aClass4_Sub6_22 = local7.aClass4_Sub6_62;
			return local7;
		}
	}
}
