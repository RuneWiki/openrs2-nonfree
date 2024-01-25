import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class118 {

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "Lclient!uk;")
	private Class102_Sub1 aClass102_Sub1_8;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "Lclient!uk;")
	public final Class102_Sub1 aClass102_Sub1_7 = new Class102_Sub1();

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
	public Class118() {
		this.aClass102_Sub1_7.aClass102_Sub1_9 = this.aClass102_Sub1_7;
		this.aClass102_Sub1_7.aClass102_Sub1_10 = this.aClass102_Sub1_7;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)Lclient!uk;")
	public Class102_Sub1 method2331() {
		@Pc(15) Class102_Sub1 local15 = this.aClass102_Sub1_7.aClass102_Sub1_9;
		if (this.aClass102_Sub1_7 == local15) {
			this.aClass102_Sub1_8 = null;
			return null;
		} else {
			this.aClass102_Sub1_8 = local15.aClass102_Sub1_9;
			return local15;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V")
	public void method2332() {
		while (true) {
			@Pc(9) Class102_Sub1 local9 = this.aClass102_Sub1_7.aClass102_Sub1_9;
			if (local9 == this.aClass102_Sub1_7) {
				this.aClass102_Sub1_8 = null;
				return;
			}
			local9.method6765();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLclient!uk;)V")
	public void method2333(@OriginalArg(1) Class102_Sub1 arg0) {
		if (arg0.aClass102_Sub1_10 != null) {
			arg0.method6765();
		}
		arg0.aClass102_Sub1_9 = this.aClass102_Sub1_7;
		arg0.aClass102_Sub1_10 = this.aClass102_Sub1_7.aClass102_Sub1_10;
		arg0.aClass102_Sub1_10.aClass102_Sub1_9 = arg0;
		arg0.aClass102_Sub1_9.aClass102_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)I")
	public int method2334() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) Class102_Sub1 local17 = this.aClass102_Sub1_7.aClass102_Sub1_9; local17 != this.aClass102_Sub1_7; local17 = local17.aClass102_Sub1_9) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)Lclient!uk;")
	public Class102_Sub1 method2335() {
		@Pc(6) Class102_Sub1 local6 = this.aClass102_Sub1_8;
		if (local6 == this.aClass102_Sub1_7) {
			this.aClass102_Sub1_8 = null;
			return null;
		} else {
			this.aClass102_Sub1_8 = local6.aClass102_Sub1_9;
			return local6;
		}
	}
}
