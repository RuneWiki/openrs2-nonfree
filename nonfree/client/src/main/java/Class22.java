import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class22 {

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Lclient!pk;")
	private Class12 aClass12_6;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!pk;")
	private final Class12 aClass12_5 = new Class12();

	static {
		new Class57("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class22() {
		this.aClass12_5.aClass12_23 = this.aClass12_5;
		this.aClass12_5.aClass12_24 = this.aClass12_5;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Z")
	public boolean method282() {
		return this.aClass12_5.aClass12_23 == this.aClass12_5;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)Lclient!pk;")
	public Class12 method283() {
		@Pc(15) Class12 local15 = this.aClass12_5.aClass12_24;
		if (this.aClass12_5 == local15) {
			this.aClass12_6 = null;
			return null;
		} else {
			this.aClass12_6 = local15.aClass12_24;
			return local15;
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)Lclient!pk;")
	public Class12 method285() {
		@Pc(7) Class12 local7 = this.aClass12_5.aClass12_23;
		if (local7 == this.aClass12_5) {
			return null;
		} else {
			local7.method5277();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!pk;B)V")
	public void method286(@OriginalArg(0) Class12 arg0) {
		if (arg0.aClass12_24 != null) {
			arg0.method5277();
		}
		arg0.aClass12_23 = this.aClass12_5;
		arg0.aClass12_24 = this.aClass12_5.aClass12_24;
		arg0.aClass12_24.aClass12_23 = arg0;
		arg0.aClass12_23.aClass12_24 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public void method289() {
		while (true) {
			@Pc(17) Class12 local17 = this.aClass12_5.aClass12_23;
			if (local17 == this.aClass12_5) {
				this.aClass12_6 = null;
				return;
			}
			local17.method5277();
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)I")
	public int method290() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class12 local11 = this.aClass12_5.aClass12_23; local11 != this.aClass12_5; local11 = local11.aClass12_23) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)Lclient!pk;")
	public Class12 method291() {
		@Pc(7) Class12 local7 = this.aClass12_5.aClass12_23;
		if (this.aClass12_5 == local7) {
			this.aClass12_6 = null;
			return null;
		} else {
			this.aClass12_6 = local7.aClass12_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)Lclient!pk;")
	public Class12 method292() {
		@Pc(12) Class12 local12 = this.aClass12_6;
		if (local12 == this.aClass12_5) {
			this.aClass12_6 = null;
			return null;
		} else {
			this.aClass12_6 = local12.aClass12_23;
			return local12;
		}
	}
}
