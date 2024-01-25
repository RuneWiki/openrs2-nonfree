import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!fc;")
	private final Class77 aClass77_1 = new Class77(64);

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!fc;")
	public final Class77 aClass77_2 = new Class77(2);

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!oi;")
	private final Class185 aClass185_1;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!oi;")
	public final Class185 aClass185_2;

	static {
		new Class142("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;Lclient!oi;)V")
	public Class3(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Class185 arg3) {
		this.aClass185_1 = arg2;
		this.aClass185_2 = arg3;
		this.aClass185_1.method4011(33);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public void method22() {
		@Pc(2) Class77 local2 = this.aClass77_1;
		synchronized (this.aClass77_1) {
			this.aClass77_1.method1394();
		}
		local2 = this.aClass77_2;
		synchronized (this.aClass77_2) {
			this.aClass77_2.method1394();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Lclient!ee;")
	public Class66 method24(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_1;
		@Pc(16) Class66 local16;
		synchronized (this.aClass77_1) {
			local16 = (Class66) this.aClass77_1.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_1;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_1) {
			local38 = this.aClass185_1.method4002(33, arg0);
		}
		local16 = new Class66();
		local16.aClass3_1 = this;
		if (local38 != null) {
			local16.method1068(new Class1_Sub19(local38));
		}
		@Pc(67) Class77 local67 = this.aClass77_1;
		synchronized (this.aClass77_1) {
			this.aClass77_1.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public void method25() {
		@Pc(2) Class77 local2 = this.aClass77_1;
		synchronized (this.aClass77_1) {
			this.aClass77_1.method1395();
		}
		local2 = this.aClass77_2;
		synchronized (this.aClass77_2) {
			this.aClass77_2.method1395();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
	public void method26() {
		@Pc(2) Class77 local2 = this.aClass77_1;
		synchronized (this.aClass77_1) {
			this.aClass77_1.method1386(5);
		}
		local2 = this.aClass77_2;
		synchronized (this.aClass77_2) {
			this.aClass77_2.method1386(5);
		}
	}
}
