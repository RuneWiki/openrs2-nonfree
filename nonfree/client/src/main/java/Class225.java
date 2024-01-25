import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class225 {

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "Lclient!sr;")
	private Class88_Sub1 aClass88_Sub1_10;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!sr;")
	public final Class88_Sub1 aClass88_Sub1_9 = new Class88_Sub1();

	static {
		new Class198("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class225() {
		this.aClass88_Sub1_9.aClass88_Sub1_8 = this.aClass88_Sub1_9;
		this.aClass88_Sub1_9.aClass88_Sub1_7 = this.aClass88_Sub1_9;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Lclient!sr;")
	public Class88_Sub1 method4938() {
		@Pc(7) Class88_Sub1 local7 = this.aClass88_Sub1_9.aClass88_Sub1_7;
		if (this.aClass88_Sub1_9 == local7) {
			this.aClass88_Sub1_10 = null;
			return null;
		} else {
			this.aClass88_Sub1_10 = local7.aClass88_Sub1_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I")
	public int method4941() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class88_Sub1 local11 = this.aClass88_Sub1_9.aClass88_Sub1_7;
		while (local11 != this.aClass88_Sub1_9) {
			local11 = local11.aClass88_Sub1_7;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)Lclient!sr;")
	public Class88_Sub1 method4943() {
		@Pc(11) Class88_Sub1 local11 = this.aClass88_Sub1_10;
		if (this.aClass88_Sub1_9 == local11) {
			this.aClass88_Sub1_10 = null;
			return null;
		} else {
			this.aClass88_Sub1_10 = local11.aClass88_Sub1_7;
			return local11;
		}
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V")
	public void method4944() {
		while (true) {
			@Pc(10) Class88_Sub1 local10 = this.aClass88_Sub1_9.aClass88_Sub1_7;
			if (this.aClass88_Sub1_9 == local10) {
				this.aClass88_Sub1_10 = null;
				return;
			}
			local10.method3065();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!sr;I)V")
	public void method4945(@OriginalArg(0) Class88_Sub1 arg0) {
		if (arg0.aClass88_Sub1_8 != null) {
			arg0.method3065();
		}
		arg0.aClass88_Sub1_8 = this.aClass88_Sub1_9.aClass88_Sub1_8;
		arg0.aClass88_Sub1_7 = this.aClass88_Sub1_9;
		arg0.aClass88_Sub1_8.aClass88_Sub1_7 = arg0;
		arg0.aClass88_Sub1_7.aClass88_Sub1_8 = arg0;
	}
}
