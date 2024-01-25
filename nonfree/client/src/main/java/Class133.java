import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class133 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!fr;")
	private final Class91 aClass91_56 = new Class91(64);

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "Lclient!fr;")
	public final Class91 aClass91_57 = new Class91(2);

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!qs;")
	public final Class211 aClass211_52;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!qs;")
	private final Class211 aClass211_51;

	static {
		new Class158("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;Lclient!qs;)V")
	public Class133(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_52 = arg3;
		this.aClass211_51 = arg2;
		this.aClass211_51.method4772(33);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)Lclient!he;")
	public Class104 method3160(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_56;
		@Pc(16) Class104 local16;
		synchronized (this.aClass91_56) {
			local16 = (Class104) this.aClass91_56.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_51;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_51) {
			local38 = this.aClass211_51.method4758(arg0, 33);
		}
		local16 = new Class104();
		local16.aClass133_2 = this;
		if (local38 != null) {
			local16.method2374(new Class1_Sub3(local38));
		}
		@Pc(71) Class91 local71 = this.aClass91_56;
		synchronized (this.aClass91_56) {
			this.aClass91_56.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public void method3161() {
		@Pc(6) Class91 local6 = this.aClass91_56;
		synchronized (this.aClass91_56) {
			this.aClass91_56.method1998(5);
		}
		local6 = this.aClass91_57;
		synchronized (this.aClass91_57) {
			this.aClass91_57.method1998(5);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public void method3162() {
		@Pc(2) Class91 local2 = this.aClass91_56;
		synchronized (this.aClass91_56) {
			this.aClass91_56.method1999();
		}
		local2 = this.aClass91_57;
		synchronized (this.aClass91_57) {
			this.aClass91_57.method1999();
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public void method3163() {
		@Pc(10) Class91 local10 = this.aClass91_56;
		synchronized (this.aClass91_56) {
			this.aClass91_56.method1993();
		}
		local10 = this.aClass91_57;
		synchronized (this.aClass91_57) {
			this.aClass91_57.method1993();
		}
	}
}
