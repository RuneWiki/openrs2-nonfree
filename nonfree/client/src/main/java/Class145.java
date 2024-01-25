import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class145 {

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!cs;")
	private Class2 aClass2_20;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!cs;")
	private final Class2 aClass2_19 = new Class2();

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class145() {
		this.aClass2_19.aClass2_25 = this.aClass2_19;
		this.aClass2_19.aClass2_26 = this.aClass2_19;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Lclient!cs;")
	public Class2 method3919() {
		@Pc(7) Class2 local7 = this.aClass2_19.aClass2_26;
		if (local7 == this.aClass2_19) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local7.aClass2_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public void method3920() {
		while (true) {
			@Pc(7) Class2 local7 = this.aClass2_19.aClass2_26;
			if (local7 == this.aClass2_19) {
				this.aClass2_20 = null;
				return;
			}
			local7.method7890();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	public int method3924() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class2 local19 = this.aClass2_19.aClass2_26; local19 != this.aClass2_19; local19 = local19.aClass2_26) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Lclient!cs;")
	public Class2 method3925() {
		@Pc(7) Class2 local7 = this.aClass2_19.aClass2_25;
		if (local7 == this.aClass2_19) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local7.aClass2_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Lclient!cs;")
	public Class2 method3926() {
		@Pc(11) Class2 local11 = this.aClass2_20;
		if (this.aClass2_19 == local11) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local11.aClass2_26;
			return local11;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!cs;)V")
	public void method3927(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_25 != null) {
			arg0.method7890();
		}
		arg0.aClass2_26 = this.aClass2_19;
		arg0.aClass2_25 = this.aClass2_19.aClass2_25;
		arg0.aClass2_25.aClass2_26 = arg0;
		arg0.aClass2_26.aClass2_25 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)Lclient!cs;")
	public Class2 method3928() {
		@Pc(7) Class2 local7 = this.aClass2_19.aClass2_26;
		if (local7 == this.aClass2_19) {
			return null;
		} else {
			local7.method7890();
			return local7;
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Z")
	public boolean method3929() {
		return this.aClass2_19.aClass2_26 == this.aClass2_19;
	}
}
