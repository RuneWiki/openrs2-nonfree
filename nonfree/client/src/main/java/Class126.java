import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class126 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!ff;")
	private Class83 aClass83_29 = new Class83(64);

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!ff;")
	public Class83 aClass83_31 = new Class83(64);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!vh;")
	public final Class250 aClass250_43;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!vh;")
	private final Class250 aClass250_42;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;Lclient!vh;)V")
	public Class126(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_43 = arg3;
		this.aClass250_42 = arg2;
		this.aClass250_42.method5653(34);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!mo;")
	public Class158 method2905(@OriginalArg(1) int arg0) {
		@Pc(11) Class83 local11 = this.aClass83_29;
		@Pc(21) Class158 local21;
		synchronized (this.aClass83_29) {
			local21 = (Class158) this.aClass83_29.method1658((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass250_42.method5667(arg0, 34);
		local21 = new Class158();
		local21.aClass126_4 = this;
		if (local38 != null) {
			local21.method3738(new Class1_Sub1(local38));
		}
		@Pc(57) Class83 local57 = this.aClass83_29;
		synchronized (this.aClass83_29) {
			this.aClass83_29.method1675((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method2906() {
		@Pc(6) Class83 local6 = this.aClass83_29;
		synchronized (this.aClass83_29) {
			this.aClass83_29.method1667();
		}
		local6 = this.aClass83_31;
		synchronized (this.aClass83_31) {
			this.aClass83_31.method1667();
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	public void method2907() {
		@Pc(2) Class83 local2 = this.aClass83_29;
		synchronized (this.aClass83_29) {
			this.aClass83_29.method1663(5);
		}
		local2 = this.aClass83_31;
		synchronized (this.aClass83_31) {
			this.aClass83_31.method1663(5);
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public void method2909() {
		@Pc(11) Class83 local11 = this.aClass83_29;
		synchronized (this.aClass83_29) {
			this.aClass83_29.method1669();
		}
		local11 = this.aClass83_31;
		synchronized (this.aClass83_31) {
			this.aClass83_31.method1669();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public void method2910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass83_29 = new Class83(arg1);
		this.aClass83_31 = new Class83(arg0);
	}
}
