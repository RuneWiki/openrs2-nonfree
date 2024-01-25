import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class28 {

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!ff;")
	private final Class83 aClass83_4 = new Class83(64);

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!ff;")
	private final Class83 aClass83_5 = new Class83(100);

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!vh;")
	private final Class250 aClass250_8;

	static {
		new Class84("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;Lclient!vh;Lclient!vh;)V")
	public Class28(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) Class250 arg4) {
		this.aClass250_8 = arg2;
		if (this.aClass250_8 != null) {
			@Pc(26) int local26 = this.aClass250_8.method5666() - 1;
			this.aClass250_8.method5653(local26);
		}
		Static97.method1526(arg4, arg3);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!qp;")
	public Class191 method567(@OriginalArg(1) int arg0) {
		@Pc(10) Class83 local10 = this.aClass83_4;
		@Pc(20) Class191 local20;
		synchronized (this.aClass83_4) {
			local20 = (Class191) this.aClass83_4.method1658((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(41) byte[] local41 = this.aClass250_8.method5667(Static403.method5452(arg0), Static107.method1652(arg0));
		local20 = new Class191();
		local20.aClass28_2 = this;
		local20.anInt5746 = arg0;
		if (local41 != null) {
			local20.method4610(new Class1_Sub1(local41));
		}
		local20.method4611();
		@Pc(68) Class83 local68 = this.aClass83_4;
		synchronized (this.aClass83_4) {
			this.aClass83_4.method1675((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
	public void method569() {
		@Pc(10) Class83 local10 = this.aClass83_4;
		synchronized (this.aClass83_4) {
			this.aClass83_4.method1663(5);
		}
		local10 = this.aClass83_5;
		synchronized (this.aClass83_5) {
			this.aClass83_5.method1663(5);
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)Lclient!d;")
	public Class1_Sub2_Sub6 method571(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_5;
		@Pc(16) Class1_Sub2_Sub6 local16;
		synchronized (this.aClass83_5) {
			local16 = (Class1_Sub2_Sub6) this.aClass83_5.method1658((long) arg0);
			if (local16 == null) {
				local16 = new Class1_Sub2_Sub6(arg0);
				this.aClass83_5.method1675((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method1122() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V")
	public void method573() {
		@Pc(6) Class83 local6 = this.aClass83_4;
		synchronized (this.aClass83_4) {
			this.aClass83_4.method1669();
		}
		local6 = this.aClass83_5;
		synchronized (this.aClass83_5) {
			this.aClass83_5.method1669();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public void method574() {
		@Pc(2) Class83 local2 = this.aClass83_4;
		synchronized (this.aClass83_4) {
			this.aClass83_4.method1667();
		}
		local2 = this.aClass83_5;
		synchronized (this.aClass83_5) {
			this.aClass83_5.method1667();
		}
	}
}
