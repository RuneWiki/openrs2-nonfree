import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class187 {

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
	public int anInt5607;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!ff;")
	private final Class83 aClass83_42 = new Class83(64);

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!ff;")
	public final Class83 aClass83_43 = new Class83(50);

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!ff;")
	public final Class83 aClass83_44 = new Class83(5);

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Lclient!vh;")
	public final Class250 aClass250_64;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
	public boolean aBoolean367;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!vh;")
	private final Class250 aClass250_63;

	static {
		new Class84("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!lf;IZLclient!vh;Lclient!vh;)V")
	public Class187(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) Class250 arg4) {
		this.aClass250_64 = arg4;
		this.aBoolean367 = arg2;
		this.aClass250_63 = arg3;
		if (this.aClass250_63 != null) {
			@Pc(38) int local38 = this.aClass250_63.method5666() - 1;
			this.aClass250_63.method5653(local38);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public void method4495() {
		@Pc(6) Class83 local6 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method1669();
		}
		local6 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method1669();
		}
		local6 = this.aClass83_44;
		synchronized (this.aClass83_44) {
			this.aClass83_44.method1669();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public void method4496(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean367) {
			this.aBoolean367 = arg0;
			this.method4495();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public void method4497() {
		@Pc(2) Class83 local2 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method1669();
		}
		local2 = this.aClass83_44;
		synchronized (this.aClass83_44) {
			this.aClass83_44.method1669();
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	public void method4498() {
		@Pc(17) Class83 local17 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method1667();
		}
		local17 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method1667();
		}
		local17 = this.aClass83_44;
		synchronized (this.aClass83_44) {
			this.aClass83_44.method1667();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	public void method4501() {
		@Pc(6) Class83 local6 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method1663(5);
		}
		local6 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method1663(5);
		}
		local6 = this.aClass83_44;
		synchronized (this.aClass83_44) {
			this.aClass83_44.method1663(5);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
	public void method4502(@OriginalArg(0) int arg0) {
		this.anInt5607 = arg0;
		@Pc(9) Class83 local9 = this.aClass83_43;
		synchronized (this.aClass83_43) {
			this.aClass83_43.method1669();
		}
		local9 = this.aClass83_44;
		synchronized (this.aClass83_44) {
			this.aClass83_44.method1669();
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Lclient!ef;")
	public Class66 method4504(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_42;
		@Pc(16) Class66 local16;
		synchronized (this.aClass83_42) {
			local16 = (Class66) this.aClass83_42.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass250_63.method5667(Static325.method4586(arg0), Static307.method4409(arg0));
		local16 = new Class66();
		local16.aClass187_1 = this;
		local16.anInt1718 = arg0;
		if (local37 != null) {
			local16.method1457(new Class1_Sub1(local37));
		}
		local16.method1455();
		@Pc(70) Class83 local70 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method1675((long) arg0, local16);
			return local16;
		}
	}
}
