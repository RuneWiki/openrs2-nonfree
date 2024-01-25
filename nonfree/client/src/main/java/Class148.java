import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class148 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "Lclient!h;")
	private final Class125 aClass125_28 = new Class125(64);

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!h;")
	public final Class125 aClass125_29 = new Class125(2);

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Lclient!an;")
	private final Class16 aClass16_56;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!an;")
	public final Class16 aClass16_55;

	static {
		new Class88("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;Lclient!an;)V")
	public Class148(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3) {
		this.aClass16_56 = arg2;
		this.aClass16_55 = arg3;
		this.aClass16_56.method399(33);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Lclient!th;")
	public Class284 method3974(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_28;
		@Pc(16) Class284 local16;
		synchronized (this.aClass125_28) {
			local16 = (Class284) this.aClass125_28.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_56;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_56) {
			local38 = this.aClass16_56.method408(33, arg0);
		}
		local16 = new Class284();
		local16.aClass148_2 = this;
		if (local38 != null) {
			local16.method7052(new Class12_Sub8(local38));
		}
		@Pc(63) Class125 local63 = this.aClass125_28;
		synchronized (this.aClass125_28) {
			this.aClass125_28.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public void method3976() {
		@Pc(12) Class125 local12 = this.aClass125_28;
		synchronized (this.aClass125_28) {
			this.aClass125_28.method3442();
		}
		local12 = this.aClass125_29;
		synchronized (this.aClass125_29) {
			this.aClass125_29.method3442();
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(II)V")
	public void method3977() {
		@Pc(2) Class125 local2 = this.aClass125_28;
		synchronized (this.aClass125_28) {
			this.aClass125_28.method3447(5);
		}
		local2 = this.aClass125_29;
		synchronized (this.aClass125_29) {
			this.aClass125_29.method3447(5);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
	public void method3978() {
		@Pc(6) Class125 local6 = this.aClass125_28;
		synchronized (this.aClass125_28) {
			this.aClass125_28.method3440();
		}
		local6 = this.aClass125_29;
		synchronized (this.aClass125_29) {
			this.aClass125_29.method3440();
		}
	}
}
