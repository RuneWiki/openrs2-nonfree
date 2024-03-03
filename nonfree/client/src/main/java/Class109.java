import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class109 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt2800 = 0;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public static int anInt2804;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_66;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "J")
	public static long aLong89;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "Lclient!hu;")
	private final Class98 aClass98_23 = new Class98(128);

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Lclient!r;")
	private final Class197 aClass197_43;

	static {
		new Class79("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
		anInt2804 = 0;
		aClass79_66 = new Class79("cyan:", "blaugrün:", "cyan:", "cyan:");
		aLong89 = 0L;
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 274)
	public Class109(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_43 = arg2;
		if (this.aClass197_43 != null) {
			@Pc(20) int local20 = this.aClass197_43.method5093() - 1;
			this.aClass197_43.method5082(local20);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)Lclient!ds;", line = 3)
	public Class52 method2781(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_23;
		@Pc(16) Class52 local16;
		synchronized (this.aClass98_23) {
			local16 = (Class52) this.aClass98_23.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass197_43.method5090(Static114.method2395(arg0), Static245.method4499(arg0));
		local16 = new Class52();
		if (local37 != null) {
			local16.method1776(new Class2_Sub4(local37));
		}
		@Pc(61) Class98 local61 = this.aClass98_23;
		synchronized (this.aClass98_23) {
			this.aClass98_23.method2626((long) arg0, local16);
			return local16;
		}
	}
}
