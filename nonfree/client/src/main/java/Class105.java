import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class105 {

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
	public int anInt2646;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!ff;")
	private Class83 aClass83_18 = new Class83(64);

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "Lclient!ff;")
	public final Class83 aClass83_19 = new Class83(500);

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "Lclient!ff;")
	public final Class83 aClass83_20 = new Class83(30);

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "Lclient!ff;")
	public final Class83 aClass83_21 = new Class83(50);

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Lclient!vh;")
	public final Class250 aClass250_30;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Lclient!vh;")
	private final Class250 aClass250_31;

	static {
		new Class84("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!lf;IZLclient!vh;Lclient!vh;)V")
	public Class105(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) Class250 arg4) {
		this.aClass250_30 = arg4;
		this.aBoolean141 = arg2;
		this.aClass250_31 = arg3;
		if (this.aClass250_31 != null) {
			@Pc(47) int local47 = this.aClass250_31.method5666() - 1;
			this.aClass250_31.method5653(local47);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
	public void method2335(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean141) {
			this.aBoolean141 = arg0;
			this.method2337();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)Lclient!pk;")
	public Class182 method2336(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_18;
		@Pc(16) Class182 local16;
		synchronized (this.aClass83_18) {
			local16 = (Class182) this.aClass83_18.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = this.aClass250_31.method5667(Static115.method1707(arg0), Static198.method3009(arg0));
		local16 = new Class182();
		local16.anInt5478 = arg0;
		local16.aClass105_4 = this;
		if (local43 != null) {
			local16.method4390(new Class1_Sub1(local43));
		}
		local16.method4375();
		if (local16.aBoolean358) {
			local16.anInt5492 = 0;
			local16.aBoolean357 = false;
		}
		if (!this.aBoolean141 && local16.aBoolean356) {
			local16.aStringArray42 = null;
			local16.anIntArray430 = null;
		}
		@Pc(89) Class83 local89 = this.aClass83_18;
		synchronized (this.aClass83_18) {
			this.aClass83_18.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method2337() {
		@Pc(10) Class83 local10 = this.aClass83_18;
		synchronized (this.aClass83_18) {
			this.aClass83_18.method1669();
		}
		local10 = this.aClass83_19;
		synchronized (this.aClass83_19) {
			this.aClass83_19.method1669();
		}
		local10 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method1669();
		}
		local10 = this.aClass83_21;
		synchronized (this.aClass83_21) {
			this.aClass83_21.method1669();
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public void method2339() {
		@Pc(2) Class83 local2 = this.aClass83_18;
		synchronized (this.aClass83_18) {
			this.aClass83_18.method1667();
		}
		local2 = this.aClass83_19;
		synchronized (this.aClass83_19) {
			this.aClass83_19.method1667();
		}
		local2 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method1667();
		}
		local2 = this.aClass83_21;
		synchronized (this.aClass83_21) {
			this.aClass83_21.method1667();
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IZ)V")
	public void method2340(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean140) {
			this.aBoolean140 = arg0;
			this.method2337();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
	public void method2341(@OriginalArg(1) int arg0) {
		this.aClass83_18 = new Class83(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
	public void method2342(@OriginalArg(0) int arg0) {
		this.anInt2646 = arg0;
		@Pc(9) Class83 local9 = this.aClass83_19;
		synchronized (this.aClass83_19) {
			this.aClass83_19.method1669();
		}
		local9 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method1669();
		}
		local9 = this.aClass83_21;
		synchronized (this.aClass83_21) {
			this.aClass83_21.method1669();
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)V")
	public void method2343() {
		@Pc(6) Class83 local6 = this.aClass83_18;
		synchronized (this.aClass83_18) {
			this.aClass83_18.method1663(5);
		}
		local6 = this.aClass83_19;
		synchronized (this.aClass83_19) {
			this.aClass83_19.method1663(5);
		}
		local6 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method1663(5);
		}
		local6 = this.aClass83_21;
		synchronized (this.aClass83_21) {
			this.aClass83_21.method1663(5);
		}
	}
}
