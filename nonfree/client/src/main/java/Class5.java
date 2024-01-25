import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!fr;")
	private final Class91 aClass91_2 = new Class91(64);

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!qs;")
	private final Class211 aClass211_1;

	static {
		new Class158("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class5(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_1 = arg2;
		if (this.aClass211_1 != null) {
			this.aClass211_1.method4772(35);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public void method56() {
		@Pc(2) Class91 local2 = this.aClass91_2;
		synchronized (this.aClass91_2) {
			this.aClass91_2.method1999();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V")
	public void method57() {
		@Pc(12) Class91 local12 = this.aClass91_2;
		synchronized (this.aClass91_2) {
			this.aClass91_2.method1998(5);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public void method59() {
		@Pc(10) Class91 local10 = this.aClass91_2;
		synchronized (this.aClass91_2) {
			this.aClass91_2.method1993();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lclient!cu;")
	public Class50 method60(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_2;
		@Pc(16) Class50 local16;
		synchronized (this.aClass91_2) {
			local16 = (Class50) this.aClass91_2.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_1;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_1) {
			local38 = this.aClass211_1.method4758(arg0, 35);
		}
		local16 = new Class50();
		if (local38 != null) {
			local16.method1240(new Class1_Sub3(local38));
		}
		local16.method1245();
		@Pc(63) Class91 local63 = this.aClass91_2;
		synchronized (this.aClass91_2) {
			this.aClass91_2.method1990(local16, (long) arg0);
			return local16;
		}
	}
}
