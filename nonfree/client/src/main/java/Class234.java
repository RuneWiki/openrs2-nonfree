import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class234 {

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!pha;")
	private Class9 aClass9_50;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!pha;")
	private final Class9 aClass9_49 = new Class9();

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class234() {
		this.aClass9_49.aClass9_68 = this.aClass9_49;
		this.aClass9_49.aClass9_67 = this.aClass9_49;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public void method6091() {
		while (true) {
			@Pc(17) Class9 local17 = this.aClass9_49.aClass9_68;
			if (this.aClass9_49 == local17) {
				this.aClass9_50 = null;
				return;
			}
			local17.method8408();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Lclient!pha;")
	public Class9 method6092() {
		@Pc(12) Class9 local12 = this.aClass9_49.aClass9_68;
		if (local12 == this.aClass9_49) {
			this.aClass9_50 = null;
			return null;
		} else {
			this.aClass9_50 = local12.aClass9_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)Lclient!pha;")
	public Class9 method6094() {
		@Pc(12) Class9 local12 = this.aClass9_49.aClass9_68;
		if (this.aClass9_49 == local12) {
			return null;
		} else {
			local12.method8408();
			return local12;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLclient!pha;)V")
	public void method6097(@OriginalArg(1) Class9 arg0) {
		if (arg0.aClass9_67 != null) {
			arg0.method8408();
		}
		arg0.aClass9_67 = this.aClass9_49.aClass9_67;
		arg0.aClass9_68 = this.aClass9_49;
		arg0.aClass9_67.aClass9_68 = arg0;
		arg0.aClass9_68.aClass9_67 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lclient!pha;")
	public Class9 method6098() {
		@Pc(6) Class9 local6 = this.aClass9_50;
		if (this.aClass9_49 == local6) {
			this.aClass9_50 = null;
			return null;
		} else {
			this.aClass9_50 = local6.aClass9_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)Lclient!pha;")
	public Class9 method6099() {
		@Pc(7) Class9 local7 = this.aClass9_49.aClass9_67;
		if (this.aClass9_49 == local7) {
			this.aClass9_50 = null;
			return null;
		} else {
			this.aClass9_50 = local7.aClass9_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I")
	public int method6100() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class9 local16 = this.aClass9_49.aClass9_68;
		while (local16 != this.aClass9_49) {
			local16 = local16.aClass9_68;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)Z")
	public boolean method6101() {
		return this.aClass9_49.aClass9_68 == this.aClass9_49;
	}
}
