import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class128 {

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!wh;")
	public static final Class2_Sub43 aClass2_Sub43_1 = new Class2_Sub43(0, 0);

	@OriginalMember(owner = "client!km", name = "l", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public static int anInt3432;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!hu;")
	private Class98 aClass98_28 = new Class98(64);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!r;")
	private final Class197 aClass197_51;

	static {
		new Class79("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		aFloat38 = 0.0F;
		anInt3432 = -1;
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 54)
	public Class128(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_51 = arg2;
		if (this.aClass197_51 != null) {
			@Pc(20) int local20 = this.aClass197_51.method5093() - 1;
			this.aClass197_51.method5082(local20);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V", line = 5)
	public void method3391() {
		@Pc(2) Class98 local2 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2617(5);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V", line = 37)
	public void method3393(@OriginalArg(0) int arg0) {
		@Pc(7) Class98 local7 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2616();
			this.aClass98_28 = new Class98(arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 78)
	public void method3394() {
		@Pc(2) Class98 local2 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2623();
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)Lclient!la;", line = 93)
	public Class134 method3395(@OriginalArg(0) int arg0) {
		@Pc(14) Class98 local14 = this.aClass98_28;
		@Pc(24) Class134 local24;
		synchronized (this.aClass98_28) {
			local24 = (Class134) this.aClass98_28.method2614((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass197_51.method5090(Static71.method1839(arg0), Static296.method5432(arg0));
		local24 = new Class134();
		if (local45 != null) {
			local24.method3510(new Class2_Sub4(local45));
		}
		@Pc(61) Class98 local61 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2626((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 122)
	public void method3396() {
		@Pc(6) Class98 local6 = this.aClass98_28;
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2616();
		}
	}
}
