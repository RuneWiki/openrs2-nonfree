import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class240 {

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "Lclient!j;")
	private Class40 aClass40_26;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Lclient!j;")
	private final Class40 aClass40_25 = new Class40();

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class240() {
		this.aClass40_25.aClass40_24 = this.aClass40_25;
		this.aClass40_25.aClass40_23 = this.aClass40_25;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!j;)V")
	public void method5225(@OriginalArg(1) Class40 arg0) {
		if (arg0.aClass40_24 != null) {
			arg0.method4364();
		}
		arg0.aClass40_23 = this.aClass40_25;
		arg0.aClass40_24 = this.aClass40_25.aClass40_24;
		arg0.aClass40_24.aClass40_23 = arg0;
		arg0.aClass40_23.aClass40_24 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Lclient!j;")
	public Class40 method5226() {
		@Pc(7) Class40 local7 = this.aClass40_25.aClass40_23;
		if (local7 == this.aClass40_25) {
			return null;
		} else {
			local7.method4364();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lclient!j;")
	public Class40 method5227() {
		@Pc(14) Class40 local14 = this.aClass40_25.aClass40_23;
		if (this.aClass40_25 == local14) {
			this.aClass40_26 = null;
			return null;
		} else {
			this.aClass40_26 = local14.aClass40_23;
			return local14;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Lclient!j;")
	public Class40 method5230() {
		@Pc(6) Class40 local6 = this.aClass40_26;
		if (this.aClass40_25 == local6) {
			this.aClass40_26 = null;
			return null;
		} else {
			this.aClass40_26 = local6.aClass40_23;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)I")
	public int method5231() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class40 local16 = this.aClass40_25.aClass40_23; local16 != this.aClass40_25; local16 = local16.aClass40_23) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
	public void method5232() {
		while (true) {
			@Pc(5) Class40 local5 = this.aClass40_25.aClass40_23;
			if (local5 == this.aClass40_25) {
				this.aClass40_26 = null;
				return;
			}
			local5.method4364();
		}
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)Lclient!j;")
	public Class40 method5233() {
		@Pc(12) Class40 local12 = this.aClass40_25.aClass40_24;
		if (this.aClass40_25 == local12) {
			this.aClass40_26 = null;
			return null;
		} else {
			this.aClass40_26 = local12.aClass40_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)Z")
	public boolean method5235() {
		return this.aClass40_25 == this.aClass40_25.aClass40_23;
	}
}
