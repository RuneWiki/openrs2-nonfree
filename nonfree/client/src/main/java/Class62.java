import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class62 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!ka;")
	private final Class132 aClass132_10 = new Class132(64);

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!ka;")
	private final Class132 aClass132_11 = new Class132(100);

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!dk;")
	private final Class54 aClass54_27;

	static {
		new Class134("From", "Von:", "De", "De");
		new Class134("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;Lclient!dk;Lclient!dk;)V")
	public Class62(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class54 arg3, @OriginalArg(4) Class54 arg4) {
		this.aClass54_27 = arg2;
		if (this.aClass54_27 != null) {
			@Pc(26) int local26 = this.aClass54_27.method1107() - 1;
			this.aClass54_27.method1123(local26);
		}
		Static236.method3052(arg4, arg3);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Lclient!wh;")
	public Class2_Sub5_Sub18 method1414(@OriginalArg(0) int arg0) {
		@Pc(14) Class132 local14 = this.aClass132_11;
		@Pc(24) Class2_Sub5_Sub18 local24;
		synchronized (this.aClass132_11) {
			local24 = (Class2_Sub5_Sub18) this.aClass132_11.method2701((long) arg0);
			if (local24 == null) {
				local24 = new Class2_Sub5_Sub18(arg0);
				this.aClass132_11.method2711(local24, (long) arg0);
			}
		}
		synchronized (local24) {
			return local24.method5627() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public void method1417() {
		@Pc(2) Class132 local2 = this.aClass132_10;
		synchronized (this.aClass132_10) {
			this.aClass132_10.method2698();
		}
		local2 = this.aClass132_11;
		synchronized (this.aClass132_11) {
			this.aClass132_11.method2698();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)Lclient!jp;")
	public Class128 method1418(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_10;
		@Pc(16) Class128 local16;
		synchronized (this.aClass132_10) {
			local16 = (Class128) this.aClass132_10.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class54 local34 = this.aClass54_27;
		@Pc(47) byte[] local47;
		synchronized (this.aClass54_27) {
			local47 = this.aClass54_27.method1126(Static36.method539(arg0), Static424.method5111(arg0));
		}
		local16 = new Class128();
		local16.aClass62_1 = this;
		local16.anInt3333 = arg0;
		if (local47 != null) {
			local16.method2639(new Class2_Sub13(local47));
		}
		local16.method2643();
		@Pc(78) Class132 local78 = this.aClass132_10;
		synchronized (this.aClass132_10) {
			this.aClass132_10.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public void method1420() {
		@Pc(6) Class132 local6 = this.aClass132_10;
		synchronized (this.aClass132_10) {
			this.aClass132_10.method2713(5);
		}
		local6 = this.aClass132_11;
		synchronized (this.aClass132_11) {
			this.aClass132_11.method2713(5);
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	public void method1422() {
		@Pc(6) Class132 local6 = this.aClass132_10;
		synchronized (this.aClass132_10) {
			this.aClass132_10.method2708();
		}
		local6 = this.aClass132_11;
		synchronized (this.aClass132_11) {
			this.aClass132_11.method2708();
		}
	}
}
