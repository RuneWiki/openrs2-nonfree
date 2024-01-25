import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class65 {

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "Lclient!gp;")
	private Class8 aClass8_10;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!gp;")
	private final Class8 aClass8_9 = new Class8();

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class65() {
		this.aClass8_9.aClass8_23 = this.aClass8_9;
		this.aClass8_9.aClass8_24 = this.aClass8_9;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z")
	public boolean method1455() {
		return this.aClass8_9 == this.aClass8_9.aClass8_23;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public void method1456() {
		while (true) {
			@Pc(9) Class8 local9 = this.aClass8_9.aClass8_23;
			if (local9 == this.aClass8_9) {
				this.aClass8_10 = null;
				return;
			}
			local9.method4645();
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
	public int method1457() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class8 local11 = this.aClass8_9.aClass8_23; local11 != this.aClass8_9; local11 = local11.aClass8_23) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!gp;B)V")
	public void method1458(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_24 != null) {
			arg0.method4645();
		}
		arg0.aClass8_24 = this.aClass8_9.aClass8_24;
		arg0.aClass8_23 = this.aClass8_9;
		arg0.aClass8_24.aClass8_23 = arg0;
		arg0.aClass8_23.aClass8_24 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)Lclient!gp;")
	public Class8 method1460() {
		@Pc(7) Class8 local7 = this.aClass8_9.aClass8_23;
		if (local7 == this.aClass8_9) {
			return null;
		} else {
			local7.method4645();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Lclient!gp;")
	public Class8 method1461() {
		@Pc(6) Class8 local6 = this.aClass8_10;
		if (local6 == this.aClass8_9) {
			this.aClass8_10 = null;
			return null;
		} else {
			this.aClass8_10 = local6.aClass8_23;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Lclient!gp;")
	public Class8 method1462() {
		@Pc(13) Class8 local13 = this.aClass8_9.aClass8_23;
		if (local13 == this.aClass8_9) {
			this.aClass8_10 = null;
			return null;
		} else {
			this.aClass8_10 = local13.aClass8_23;
			return local13;
		}
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)Lclient!gp;")
	public Class8 method1464() {
		@Pc(12) Class8 local12 = this.aClass8_9.aClass8_24;
		if (this.aClass8_9 == local12) {
			this.aClass8_10 = null;
			return null;
		} else {
			this.aClass8_10 = local12.aClass8_24;
			return local12;
		}
	}
}
