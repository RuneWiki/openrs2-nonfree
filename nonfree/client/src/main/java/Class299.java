import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class299 {

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "Lclient!ui;")
	private Class72 aClass72_26;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "Lclient!ui;")
	private final Class72 aClass72_25 = new Class72();

	static {
		new Class306("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
	public Class299() {
		this.aClass72_25.aClass72_24 = this.aClass72_25;
		this.aClass72_25.aClass72_23 = this.aClass72_25;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!ui;Z)V")
	public void method7027(@OriginalArg(0) Class72 arg0) {
		if (arg0.aClass72_24 != null) {
			arg0.method6719();
		}
		arg0.aClass72_24 = this.aClass72_25.aClass72_24;
		arg0.aClass72_23 = this.aClass72_25;
		arg0.aClass72_24.aClass72_23 = arg0;
		arg0.aClass72_23.aClass72_24 = arg0;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	public void method7028() {
		while (true) {
			@Pc(10) Class72 local10 = this.aClass72_25.aClass72_23;
			if (this.aClass72_25 == local10) {
				this.aClass72_26 = null;
				return;
			}
			local10.method6719();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Lclient!ui;")
	public Class72 method7029() {
		@Pc(12) Class72 local12 = this.aClass72_25.aClass72_24;
		if (this.aClass72_25 == local12) {
			this.aClass72_26 = null;
			return null;
		} else {
			this.aClass72_26 = local12.aClass72_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)Lclient!ui;")
	public Class72 method7030() {
		@Pc(15) Class72 local15 = this.aClass72_25.aClass72_23;
		if (local15 == this.aClass72_25) {
			this.aClass72_26 = null;
			return null;
		} else {
			this.aClass72_26 = local15.aClass72_23;
			return local15;
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)Lclient!ui;")
	public Class72 method7031() {
		@Pc(6) Class72 local6 = this.aClass72_26;
		if (local6 == this.aClass72_25) {
			this.aClass72_26 = null;
			return null;
		} else {
			this.aClass72_26 = local6.aClass72_23;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)I")
	public int method7032() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class72 local11 = this.aClass72_25.aClass72_23; local11 != this.aClass72_25; local11 = local11.aClass72_23) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)Lclient!ui;")
	public Class72 method7034() {
		@Pc(16) Class72 local16 = this.aClass72_25.aClass72_23;
		if (this.aClass72_25 == local16) {
			return null;
		} else {
			local16.method6719();
			return local16;
		}
	}

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)Z")
	public boolean method7035() {
		return this.aClass72_25.aClass72_23 == this.aClass72_25;
	}
}
