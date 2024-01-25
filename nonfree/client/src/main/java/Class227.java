import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class227 {

	@OriginalMember(owner = "client!st", name = "n", descriptor = "Lclient!ts;")
	private Class13 aClass13_20;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lclient!ts;")
	private final Class13 aClass13_19 = new Class13();

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class227() {
		this.aClass13_19.aClass13_23 = this.aClass13_19;
		this.aClass13_19.aClass13_24 = this.aClass13_19;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Lclient!ts;")
	public Class13 method4827() {
		@Pc(7) Class13 local7 = this.aClass13_19.aClass13_24;
		if (this.aClass13_19 == local7) {
			this.aClass13_20 = null;
			return null;
		} else {
			this.aClass13_20 = local7.aClass13_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)Lclient!ts;")
	public Class13 method4828() {
		@Pc(12) Class13 local12 = this.aClass13_19.aClass13_23;
		if (local12 == this.aClass13_19) {
			this.aClass13_20 = null;
			return null;
		} else {
			this.aClass13_20 = local12.aClass13_23;
			return local12;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Lclient!ts;")
	public Class13 method4829() {
		@Pc(11) Class13 local11 = this.aClass13_19.aClass13_24;
		if (local11 == this.aClass13_19) {
			return null;
		} else {
			local11.method5413();
			return local11;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
	public int method4830() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class13 local16 = this.aClass13_19.aClass13_24; local16 != this.aClass13_19; local16 = local16.aClass13_24) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Z")
	public boolean method4831() {
		return this.aClass13_19.aClass13_24 == this.aClass13_19;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!ts;)V")
	public void method4832(@OriginalArg(1) Class13 arg0) {
		if (arg0.aClass13_23 != null) {
			arg0.method5413();
		}
		arg0.aClass13_23 = this.aClass13_19.aClass13_23;
		arg0.aClass13_24 = this.aClass13_19;
		arg0.aClass13_23.aClass13_24 = arg0;
		arg0.aClass13_24.aClass13_23 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(I)Lclient!ts;")
	public Class13 method4834() {
		@Pc(11) Class13 local11 = this.aClass13_20;
		if (this.aClass13_19 == local11) {
			this.aClass13_20 = null;
			return null;
		} else {
			this.aClass13_20 = local11.aClass13_24;
			return local11;
		}
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(I)V")
	public void method4835() {
		while (true) {
			@Pc(5) Class13 local5 = this.aClass13_19.aClass13_24;
			if (local5 == this.aClass13_19) {
				this.aClass13_20 = null;
				return;
			}
			local5.method5413();
		}
	}
}
