import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class161 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!kr;")
	private Class30_Sub2 aClass30_Sub2_8;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Lclient!kr;")
	public final Class30_Sub2 aClass30_Sub2_7 = new Class30_Sub2();

	static {
		new Class40("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class161() {
		this.aClass30_Sub2_7.aClass30_Sub2_10 = this.aClass30_Sub2_7;
		this.aClass30_Sub2_7.aClass30_Sub2_9 = this.aClass30_Sub2_7;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)I")
	public int method4076() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class30_Sub2 local16 = this.aClass30_Sub2_7.aClass30_Sub2_9; local16 != this.aClass30_Sub2_7; local16 = local16.aClass30_Sub2_9) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Lclient!kr;")
	public Class30_Sub2 method4078() {
		@Pc(14) Class30_Sub2 local14 = this.aClass30_Sub2_8;
		if (this.aClass30_Sub2_7 == local14) {
			this.aClass30_Sub2_8 = null;
			return null;
		} else {
			this.aClass30_Sub2_8 = local14.aClass30_Sub2_9;
			return local14;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!kr;B)V")
	public void method4079(@OriginalArg(0) Class30_Sub2 arg0) {
		if (arg0.aClass30_Sub2_10 != null) {
			arg0.method4419();
		}
		arg0.aClass30_Sub2_10 = this.aClass30_Sub2_7.aClass30_Sub2_10;
		arg0.aClass30_Sub2_9 = this.aClass30_Sub2_7;
		arg0.aClass30_Sub2_10.aClass30_Sub2_9 = arg0;
		arg0.aClass30_Sub2_9.aClass30_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Lclient!kr;")
	public Class30_Sub2 method4080() {
		@Pc(7) Class30_Sub2 local7 = this.aClass30_Sub2_7.aClass30_Sub2_9;
		if (this.aClass30_Sub2_7 == local7) {
			this.aClass30_Sub2_8 = null;
			return null;
		} else {
			this.aClass30_Sub2_8 = local7.aClass30_Sub2_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public void method4081() {
		while (true) {
			@Pc(5) Class30_Sub2 local5 = this.aClass30_Sub2_7.aClass30_Sub2_9;
			if (local5 == this.aClass30_Sub2_7) {
				this.aClass30_Sub2_8 = null;
				return;
			}
			local5.method4419();
		}
	}
}
