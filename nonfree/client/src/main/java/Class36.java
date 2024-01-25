import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class36 {

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!ka;")
	private final Class132 aClass132_5 = new Class132(64);

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "Lclient!ka;")
	public final Class132 aClass132_6 = new Class132(30);

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!dk;")
	private final Class54 aClass54_17;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!dk;")
	public final Class54 aClass54_16;

	static {
		new Class134("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;Lclient!dk;)V")
	public Class36(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class54 arg3) {
		this.aClass54_17 = arg2;
		this.aClass54_16 = arg3;
		@Pc(26) int local26 = this.aClass54_17.method1107() - 1;
		this.aClass54_17.method1123(local26);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Lclient!sr;")
	public Class229 method696(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_5;
		@Pc(16) Class229 local16;
		synchronized (this.aClass132_5) {
			local16 = (Class229) this.aClass132_5.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_17;
		@Pc(42) byte[] local42;
		synchronized (this.aClass54_17) {
			local42 = this.aClass54_17.method1126(Static272.method3657(arg0), Static302.method3976(arg0));
		}
		local16 = new Class229();
		local16.aClass36_1 = this;
		local16.anInt6239 = arg0;
		if (local42 != null) {
			local16.method4857(new Class2_Sub13(local42));
		}
		@Pc(76) Class132 local76 = this.aClass132_5;
		synchronized (this.aClass132_5) {
			this.aClass132_5.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public void method697(@OriginalArg(1) int arg0) {
		this.anInt865 = arg0;
		@Pc(9) Class132 local9 = this.aClass132_6;
		synchronized (this.aClass132_6) {
			this.aClass132_6.method2698();
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(BI)V")
	public void method698() {
		@Pc(10) Class132 local10 = this.aClass132_5;
		synchronized (this.aClass132_5) {
			this.aClass132_5.method2713(5);
		}
		local10 = this.aClass132_6;
		synchronized (this.aClass132_6) {
			this.aClass132_6.method2713(5);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public void method699() {
		@Pc(6) Class132 local6 = this.aClass132_5;
		synchronized (this.aClass132_5) {
			this.aClass132_5.method2708();
		}
		local6 = this.aClass132_6;
		synchronized (this.aClass132_6) {
			this.aClass132_6.method2708();
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	public void method701() {
		@Pc(2) Class132 local2 = this.aClass132_5;
		synchronized (this.aClass132_5) {
			this.aClass132_5.method2698();
		}
		local2 = this.aClass132_6;
		synchronized (this.aClass132_6) {
			this.aClass132_6.method2698();
		}
	}
}
