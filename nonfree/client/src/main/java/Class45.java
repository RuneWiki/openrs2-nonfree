import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class45 {

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!s;")
	private Class4 aClass4_60;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!s;")
	public final Class4 aClass4_59 = new Class4();

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class45() {
		this.aClass4_59.aClass4_128 = this.aClass4_59;
		this.aClass4_59.aClass4_127 = this.aClass4_59;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Lclient!s;")
	public Class4 method982() {
		@Pc(3) Class4 local3 = this.aClass4_59.aClass4_128;
		if (this.aClass4_59 == local3) {
			this.aClass4_60 = null;
			return null;
		} else {
			this.aClass4_60 = local3.aClass4_128;
			return local3;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!s;BLclient!s;)V")
	public void method983(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.aClass4_127 != null) {
			arg0.method1989();
		}
		arg0.aClass4_127 = arg1.aClass4_127;
		arg0.aClass4_128 = arg1;
		arg0.aClass4_127.aClass4_128 = arg0;
		arg0.aClass4_128.aClass4_127 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	public void method984() {
		while (true) {
			@Pc(12) Class4 local12 = this.aClass4_59.aClass4_128;
			if (local12 == this.aClass4_59) {
				return;
			}
			local12.method1989();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Lclient!s;")
	public Class4 method985() {
		@Pc(3) Class4 local3 = this.aClass4_59.aClass4_127;
		if (this.aClass4_59 == local3) {
			this.aClass4_60 = null;
			return null;
		} else {
			this.aClass4_60 = local3.aClass4_127;
			return local3;
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)Lclient!s;")
	public Class4 method986() {
		@Pc(11) Class4 local11 = this.aClass4_60;
		if (local11 == this.aClass4_59) {
			this.aClass4_60 = null;
			return null;
		} else {
			this.aClass4_60 = local11.aClass4_128;
			return local11;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!s;I)V")
	public void method988(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_127 != null) {
			arg0.method1989();
		}
		arg0.aClass4_127 = this.aClass4_59.aClass4_127;
		arg0.aClass4_128 = this.aClass4_59;
		arg0.aClass4_127.aClass4_128 = arg0;
		arg0.aClass4_128.aClass4_127 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Lclient!s;")
	public Class4 method989() {
		@Pc(6) Class4 local6 = this.aClass4_60;
		if (local6 == this.aClass4_59) {
			this.aClass4_60 = null;
			return null;
		} else {
			this.aClass4_60 = local6.aClass4_127;
			return local6;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!s;)V")
	public void method990(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_127 != null) {
			arg0.method1989();
		}
		arg0.aClass4_128 = this.aClass4_59.aClass4_128;
		arg0.aClass4_127 = this.aClass4_59;
		arg0.aClass4_127.aClass4_128 = arg0;
		arg0.aClass4_128.aClass4_127 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)Lclient!s;")
	public Class4 method993() {
		@Pc(3) Class4 local3 = this.aClass4_59.aClass4_127;
		if (local3 == this.aClass4_59) {
			return null;
		} else {
			local3.method1989();
			return local3;
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)Lclient!s;")
	public Class4 method995() {
		@Pc(7) Class4 local7 = this.aClass4_59.aClass4_128;
		if (local7 == this.aClass4_59) {
			return null;
		} else {
			local7.method1989();
			return local7;
		}
	}
}
