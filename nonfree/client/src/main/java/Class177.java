import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class177 {

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
	public int anInt4971;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "Lclient!fba;")
	private final Class102 aClass102_27 = new Class102(64);

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "Lclient!fba;")
	public final Class102 aClass102_28 = new Class102(50);

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "Lclient!fba;")
	public final Class102 aClass102_29 = new Class102(5);

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Lclient!la;")
	private final Class196 aClass196_51;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "Lclient!mp;")
	public final Class222 aClass222_4;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "Lclient!la;")
	public final Class196 aClass196_50;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!mp;IZLclient!la;Lclient!la;)V")
	public Class177(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class196 arg3, @OriginalArg(4) Class196 arg4) {
		this.aClass196_51 = arg3;
		this.aClass222_4 = arg0;
		this.aClass196_50 = arg4;
		this.aBoolean327 = arg2;
		if (this.aClass196_51 != null) {
			@Pc(41) int local41 = this.aClass196_51.method5125() - 1;
			this.aClass196_51.method5118(local41);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lclient!fha;")
	public Class109 method4471(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_27;
		@Pc(16) Class109 local16;
		synchronized (this.aClass102_27) {
			local16 = (Class109) this.aClass102_27.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_51;
		@Pc(42) byte[] local42;
		synchronized (this.aClass196_51) {
			local42 = this.aClass196_51.method5102(Static66.method1675(arg0), Static579.method8209(arg0));
		}
		local16 = new Class109();
		local16.anInt3055 = arg0;
		local16.aClass177_3 = this;
		if (local42 != null) {
			local16.method2821(new Class3_Sub3(local42));
		}
		local16.method2820();
		@Pc(79) Class102 local79 = this.aClass102_27;
		synchronized (this.aClass102_27) {
			this.aClass102_27.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
	public void method4473(@OriginalArg(0) int arg0) {
		this.anInt4971 = arg0;
		@Pc(9) Class102 local9 = this.aClass102_28;
		synchronized (this.aClass102_28) {
			this.aClass102_28.method2681();
		}
		local9 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2681();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)V")
	public void method4475(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean327) {
			this.aBoolean327 = arg0;
			this.method4481();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public void method4477() {
		@Pc(2) Class102 local2 = this.aClass102_28;
		synchronized (this.aClass102_28) {
			this.aClass102_28.method2681();
		}
		local2 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2681();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)V")
	public void method4479() {
		@Pc(2) Class102 local2 = this.aClass102_27;
		synchronized (this.aClass102_27) {
			this.aClass102_27.method2668(5);
		}
		local2 = this.aClass102_28;
		synchronized (this.aClass102_28) {
			this.aClass102_28.method2668(5);
		}
		@Pc(46) Class102 local46 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2668(5);
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	public void method4480() {
		@Pc(6) Class102 local6 = this.aClass102_27;
		synchronized (this.aClass102_27) {
			this.aClass102_27.method2680();
		}
		local6 = this.aClass102_28;
		synchronized (this.aClass102_28) {
			this.aClass102_28.method2680();
		}
		local6 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2680();
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	public void method4481() {
		@Pc(2) Class102 local2 = this.aClass102_27;
		synchronized (this.aClass102_27) {
			this.aClass102_27.method2681();
		}
		local2 = this.aClass102_28;
		synchronized (this.aClass102_28) {
			this.aClass102_28.method2681();
		}
		local2 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2681();
		}
	}
}
