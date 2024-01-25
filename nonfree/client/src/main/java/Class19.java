import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class19 {

	@OriginalMember(owner = "client!an", name = "k", descriptor = "Lclient!nfa;")
	private Class16 aClass16_10;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!nfa;")
	private final Class16 aClass16_9 = new Class16();

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class19() {
		this.aClass16_9.aClass16_67 = this.aClass16_9;
		this.aClass16_9.aClass16_68 = this.aClass16_9;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lclient!nfa;")
	public Class16 method557() {
		@Pc(7) Class16 local7 = this.aClass16_9.aClass16_67;
		if (local7 == this.aClass16_9) {
			return null;
		} else {
			local7.method8874();
			return local7;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)Lclient!nfa;")
	public Class16 method558() {
		@Pc(6) Class16 local6 = this.aClass16_10;
		if (local6 == this.aClass16_9) {
			this.aClass16_10 = null;
			return null;
		} else {
			this.aClass16_10 = local6.aClass16_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)Lclient!nfa;")
	public Class16 method559() {
		@Pc(7) Class16 local7 = this.aClass16_9.aClass16_68;
		if (local7 == this.aClass16_9) {
			this.aClass16_10 = null;
			return null;
		} else {
			this.aClass16_10 = local7.aClass16_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
	public int method561() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class16 local18 = this.aClass16_9.aClass16_67; local18 != this.aClass16_9; local18 = local18.aClass16_67) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lclient!nfa;")
	public Class16 method562() {
		@Pc(12) Class16 local12 = this.aClass16_9.aClass16_67;
		if (this.aClass16_9 == local12) {
			this.aClass16_10 = null;
			return null;
		} else {
			this.aClass16_10 = local12.aClass16_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Z")
	public boolean method564() {
		return this.aClass16_9 == this.aClass16_9.aClass16_67;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
	public void method565() {
		while (true) {
			@Pc(3) Class16 local3 = this.aClass16_9.aClass16_67;
			if (local3 == this.aClass16_9) {
				this.aClass16_10 = null;
				return;
			}
			local3.method8874();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!nfa;)V")
	public void method566(@OriginalArg(1) Class16 arg0) {
		if (arg0.aClass16_68 != null) {
			arg0.method8874();
		}
		arg0.aClass16_68 = this.aClass16_9.aClass16_68;
		arg0.aClass16_67 = this.aClass16_9;
		arg0.aClass16_68.aClass16_67 = arg0;
		arg0.aClass16_67.aClass16_68 = arg0;
	}
}
