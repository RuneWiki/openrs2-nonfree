import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class60 {

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "Lclient!jda;")
	private Class15 aClass15_20;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "Lclient!jda;")
	private final Class15 aClass15_19 = new Class15();

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class60() {
		this.aClass15_19.aClass15_67 = this.aClass15_19;
		this.aClass15_19.aClass15_68 = this.aClass15_19;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Lclient!jda;")
	public Class15 method1545() {
		@Pc(7) Class15 local7 = this.aClass15_19.aClass15_67;
		if (local7 == this.aClass15_19) {
			this.aClass15_20 = null;
			return null;
		} else {
			this.aClass15_20 = local7.aClass15_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Lclient!jda;")
	public Class15 method1546() {
		@Pc(12) Class15 local12 = this.aClass15_20;
		if (this.aClass15_19 == local12) {
			this.aClass15_20 = null;
			return null;
		} else {
			this.aClass15_20 = local12.aClass15_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)Lclient!jda;")
	public Class15 method1547() {
		@Pc(7) Class15 local7 = this.aClass15_19.aClass15_68;
		if (local7 == this.aClass15_19) {
			this.aClass15_20 = null;
			return null;
		} else {
			this.aClass15_20 = local7.aClass15_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
	public void method1548() {
		while (true) {
			@Pc(13) Class15 local13 = this.aClass15_19.aClass15_68;
			if (local13 == this.aClass15_19) {
				this.aClass15_20 = null;
				return;
			}
			local13.method9741();
		}
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)I")
	public int method1549() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class15 local19 = this.aClass15_19.aClass15_68;
		while (this.aClass15_19 != local19) {
			local19 = local19.aClass15_68;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)Z")
	public boolean method1550() {
		return this.aClass15_19.aClass15_68 == this.aClass15_19;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!jda;I)V")
	public void method1551(@OriginalArg(0) Class15 arg0) {
		if (arg0.aClass15_67 != null) {
			arg0.method9741();
		}
		arg0.aClass15_67 = this.aClass15_19.aClass15_67;
		arg0.aClass15_68 = this.aClass15_19;
		arg0.aClass15_67.aClass15_68 = arg0;
		arg0.aClass15_68.aClass15_67 = arg0;
	}

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "(I)Lclient!jda;")
	public Class15 method1552() {
		@Pc(7) Class15 local7 = this.aClass15_19.aClass15_68;
		if (local7 == this.aClass15_19) {
			return null;
		} else {
			local7.method9741();
			return local7;
		}
	}
}
