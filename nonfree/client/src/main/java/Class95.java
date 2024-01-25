import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class95 {

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Lclient!ac;")
	private Class4_Sub1 aClass4_Sub1_4;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "Lclient!ac;")
	public final Class4_Sub1 aClass4_Sub1_3 = new Class4_Sub1();

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class95() {
		this.aClass4_Sub1_3.aClass4_Sub1_9 = this.aClass4_Sub1_3;
		this.aClass4_Sub1_3.aClass4_Sub1_10 = this.aClass4_Sub1_3;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Lclient!ac;")
	public Class4_Sub1 method2133() {
		@Pc(13) Class4_Sub1 local13 = this.aClass4_Sub1_3.aClass4_Sub1_9;
		if (local13 == this.aClass4_Sub1_3) {
			this.aClass4_Sub1_4 = null;
			return null;
		} else {
			this.aClass4_Sub1_4 = local13.aClass4_Sub1_9;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Lclient!ac;")
	public Class4_Sub1 method2135() {
		@Pc(6) Class4_Sub1 local6 = this.aClass4_Sub1_4;
		if (this.aClass4_Sub1_3 == local6) {
			this.aClass4_Sub1_4 = null;
			return null;
		} else {
			this.aClass4_Sub1_4 = local6.aClass4_Sub1_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public void method2136() {
		while (true) {
			@Pc(5) Class4_Sub1 local5 = this.aClass4_Sub1_3.aClass4_Sub1_9;
			if (local5 == this.aClass4_Sub1_3) {
				this.aClass4_Sub1_4 = null;
				return;
			}
			local5.method4555();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	public int method2137() {
		@Pc(7) int local7 = 0;
		@Pc(21) Class4_Sub1 local21 = this.aClass4_Sub1_3.aClass4_Sub1_9;
		while (this.aClass4_Sub1_3 != local21) {
			local21 = local21.aClass4_Sub1_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!ac;)V")
	public void method2139(@OriginalArg(1) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_10 != null) {
			arg0.method4555();
		}
		arg0.aClass4_Sub1_10 = this.aClass4_Sub1_3.aClass4_Sub1_10;
		arg0.aClass4_Sub1_9 = this.aClass4_Sub1_3;
		arg0.aClass4_Sub1_10.aClass4_Sub1_9 = arg0;
		arg0.aClass4_Sub1_9.aClass4_Sub1_10 = arg0;
	}
}
