import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class349 {

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Lclient!ir;")
	private Class60 aClass60_26;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!ir;")
	private final Class60 aClass60_25 = new Class60();

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class349() {
		this.aClass60_25.aClass60_24 = this.aClass60_25;
		this.aClass60_25.aClass60_23 = this.aClass60_25;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Z")
	public boolean method7889() {
		return this.aClass60_25 == this.aClass60_25.aClass60_24;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)Lclient!ir;")
	public Class60 method7890() {
		@Pc(7) Class60 local7 = this.aClass60_25.aClass60_24;
		if (local7 == this.aClass60_25) {
			this.aClass60_26 = null;
			return null;
		} else {
			this.aClass60_26 = local7.aClass60_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Lclient!ir;")
	public Class60 method7892() {
		@Pc(7) Class60 local7 = this.aClass60_25.aClass60_24;
		if (local7 == this.aClass60_25) {
			return null;
		} else {
			local7.method7802();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!ir;I)V")
	public void method7893(@OriginalArg(0) Class60 arg0) {
		if (arg0.aClass60_23 != null) {
			arg0.method7802();
		}
		arg0.aClass60_24 = this.aClass60_25;
		arg0.aClass60_23 = this.aClass60_25.aClass60_23;
		arg0.aClass60_23.aClass60_24 = arg0;
		arg0.aClass60_24.aClass60_23 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)Lclient!ir;")
	public Class60 method7894() {
		@Pc(7) Class60 local7 = this.aClass60_25.aClass60_23;
		if (local7 == this.aClass60_25) {
			this.aClass60_26 = null;
			return null;
		} else {
			this.aClass60_26 = local7.aClass60_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)I")
	public int method7895() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class60 local16 = this.aClass60_25.aClass60_24; local16 != this.aClass60_25; local16 = local16.aClass60_24) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)Lclient!ir;")
	public Class60 method7896() {
		@Pc(6) Class60 local6 = this.aClass60_26;
		if (this.aClass60_25 == local6) {
			this.aClass60_26 = null;
			return null;
		} else {
			this.aClass60_26 = local6.aClass60_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V")
	public void method7897() {
		while (true) {
			@Pc(9) Class60 local9 = this.aClass60_25.aClass60_24;
			if (local9 == this.aClass60_25) {
				this.aClass60_26 = null;
				return;
			}
			local9.method7802();
		}
	}
}
