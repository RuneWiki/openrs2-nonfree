import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class97 {

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "Lclient!hc;")
	private Class28 aClass28_10;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Lclient!hc;")
	private final Class28 aClass28_9 = new Class28();

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class97() {
		this.aClass28_9.aClass28_26 = this.aClass28_9;
		this.aClass28_9.aClass28_25 = this.aClass28_9;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lclient!hc;")
	public Class28 method2145() {
		@Pc(7) Class28 local7 = this.aClass28_9.aClass28_25;
		if (this.aClass28_9 == local7) {
			this.aClass28_10 = null;
			return null;
		} else {
			this.aClass28_10 = local7.aClass28_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I")
	public int method2146() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) Class28 local17 = this.aClass28_9.aClass28_25; local17 != this.aClass28_9; local17 = local17.aClass28_25) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public void method2147() {
		while (true) {
			@Pc(9) Class28 local9 = this.aClass28_9.aClass28_25;
			if (local9 == this.aClass28_9) {
				this.aClass28_10 = null;
				return;
			}
			local9.method5916();
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Lclient!hc;")
	public Class28 method2148() {
		@Pc(11) Class28 local11 = this.aClass28_10;
		if (this.aClass28_9 == local11) {
			this.aClass28_10 = null;
			return null;
		} else {
			this.aClass28_10 = local11.aClass28_25;
			return local11;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Lclient!hc;")
	public Class28 method2149() {
		@Pc(14) Class28 local14 = this.aClass28_9.aClass28_25;
		if (this.aClass28_9 == local14) {
			return null;
		} else {
			local14.method5916();
			return local14;
		}
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)Z")
	public boolean method2151() {
		return this.aClass28_9 == this.aClass28_9.aClass28_25;
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lclient!hc;")
	public Class28 method2153() {
		@Pc(7) Class28 local7 = this.aClass28_9.aClass28_26;
		if (local7 == this.aClass28_9) {
			this.aClass28_10 = null;
			return null;
		} else {
			this.aClass28_10 = local7.aClass28_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!hc;I)V")
	public void method2154(@OriginalArg(0) Class28 arg0) {
		if (arg0.aClass28_26 != null) {
			arg0.method5916();
		}
		arg0.aClass28_26 = this.aClass28_9.aClass28_26;
		arg0.aClass28_25 = this.aClass28_9;
		arg0.aClass28_26.aClass28_25 = arg0;
		arg0.aClass28_25.aClass28_26 = arg0;
	}
}
