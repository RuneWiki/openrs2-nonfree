import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class283 {

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "Lclient!uo;")
	private Class4 aClass4_46;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "Lclient!uo;")
	private final Class4 aClass4_45 = new Class4();

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	public Class283() {
		this.aClass4_45.aClass4_67 = this.aClass4_45;
		this.aClass4_45.aClass4_68 = this.aClass4_45;
	}

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "(I)Lclient!uo;")
	public Class4 method6791() {
		@Pc(14) Class4 local14 = this.aClass4_45.aClass4_67;
		if (local14 == this.aClass4_45) {
			this.aClass4_46 = null;
			return null;
		} else {
			this.aClass4_46 = local14.aClass4_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)Lclient!uo;")
	public Class4 method6792() {
		@Pc(13) Class4 local13 = this.aClass4_46;
		if (local13 == this.aClass4_45) {
			this.aClass4_46 = null;
			return null;
		} else {
			this.aClass4_46 = local13.aClass4_67;
			return local13;
		}
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)Z")
	public boolean method6795() {
		return this.aClass4_45.aClass4_67 == this.aClass4_45;
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)V")
	public void method6797() {
		while (true) {
			@Pc(7) Class4 local7 = this.aClass4_45.aClass4_67;
			if (local7 == this.aClass4_45) {
				this.aClass4_46 = null;
				return;
			}
			local7.method9473();
		}
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Lclient!uo;")
	public Class4 method6798() {
		@Pc(7) Class4 local7 = this.aClass4_45.aClass4_67;
		if (this.aClass4_45 == local7) {
			return null;
		} else {
			local7.method9473();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)I")
	public int method6799() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4 local11 = this.aClass4_45.aClass4_67; local11 != this.aClass4_45; local11 = local11.aClass4_67) {
			local7++;
		}
		if (127 < 28) {
			Static461.aClass32_44 = null;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!uo;Z)V")
	public void method6802(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_68 != null) {
			arg0.method9473();
		}
		arg0.aClass4_68 = this.aClass4_45.aClass4_68;
		arg0.aClass4_67 = this.aClass4_45;
		arg0.aClass4_68.aClass4_67 = arg0;
		arg0.aClass4_67.aClass4_68 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)Lclient!uo;")
	public Class4 method6803() {
		@Pc(14) Class4 local14 = this.aClass4_45.aClass4_68;
		if (this.aClass4_45 == local14) {
			this.aClass4_46 = null;
			return null;
		} else {
			this.aClass4_46 = local14.aClass4_68;
			return local14;
		}
	}
}
