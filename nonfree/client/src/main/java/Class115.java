import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class115 {

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "Lclient!fr;")
	private final Class91 aClass91_51 = new Class91(256);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Lclient!qs;")
	private final Class211 aClass211_42;

	static {
		new Class158("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class115(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_42 = arg2;
		this.aClass211_42.method4772(26);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI)V")
	public void method2702() {
		@Pc(2) Class91 local2 = this.aClass91_51;
		synchronized (this.aClass91_51) {
			this.aClass91_51.method1998(5);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Lclient!wn;")
	public Class1_Sub1_Sub18 method2703(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_51;
		@Pc(16) Class1_Sub1_Sub18 local16;
		synchronized (this.aClass91_51) {
			local16 = (Class1_Sub1_Sub18) this.aClass91_51.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_42;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_42) {
			local38 = this.aClass211_42.method4758(arg0, 26);
		}
		local16 = new Class1_Sub1_Sub18();
		if (local38 != null) {
			local16.method6131(new Class1_Sub3(local38));
		}
		@Pc(60) Class91 local60 = this.aClass91_51;
		synchronized (this.aClass91_51) {
			this.aClass91_51.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public void method2704() {
		@Pc(12) Class91 local12 = this.aClass91_51;
		synchronized (this.aClass91_51) {
			this.aClass91_51.method1993();
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public void method2705() {
		@Pc(6) Class91 local6 = this.aClass91_51;
		synchronized (this.aClass91_51) {
			this.aClass91_51.method1999();
		}
	}
}
