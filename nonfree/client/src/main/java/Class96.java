import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class96 {

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Lclient!ka;")
	private final Class132 aClass132_15 = new Class132(64);

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Lclient!dk;")
	private final Class54 aClass54_42;

	static {
		new Class134("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class96(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_42 = arg2;
		if (this.aClass54_42 != null) {
			this.aClass54_42.method1123(35);
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	public void method2088() {
		@Pc(6) Class132 local6 = this.aClass132_15;
		synchronized (this.aClass132_15) {
			this.aClass132_15.method2708();
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
	public void method2089() {
		@Pc(12) Class132 local12 = this.aClass132_15;
		synchronized (this.aClass132_15) {
			this.aClass132_15.method2698();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Lclient!lh;")
	public Class144 method2091(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_15;
		@Pc(16) Class144 local16;
		synchronized (this.aClass132_15) {
			local16 = (Class144) this.aClass132_15.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_42;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_42) {
			local38 = this.aClass54_42.method1126(35, arg0);
		}
		local16 = new Class144();
		if (local38 != null) {
			local16.method2986(new Class2_Sub13(local38));
		}
		local16.method2983();
		@Pc(63) Class132 local63 = this.aClass132_15;
		synchronized (this.aClass132_15) {
			this.aClass132_15.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)V")
	public void method2093() {
		@Pc(6) Class132 local6 = this.aClass132_15;
		synchronized (this.aClass132_15) {
			this.aClass132_15.method2713(5);
		}
	}
}
