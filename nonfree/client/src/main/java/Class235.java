import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class235 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!jk;")
	private Class137 aClass137_51 = new Class137(128);

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!jk;")
	public Class137 aClass137_52 = new Class137(64);

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!qn;")
	public final Class211 aClass211_82;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!qn;")
	private final Class211 aClass211_83;

	static {
		new Class15("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;Lclient!qn;)V")
	public Class235(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_82 = arg3;
		this.aClass211_83 = arg2;
		this.aClass211_83.method4365(36);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	public void method4956(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass137_51 = new Class137(arg0);
		this.aClass137_52 = new Class137(arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!gp;")
	public Class100 method4957(@OriginalArg(0) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_51;
		@Pc(16) Class100 local16;
		synchronized (this.aClass137_51) {
			local16 = (Class100) this.aClass137_51.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_83) {
			local38 = this.aClass211_83.method4377(36, arg0);
		}
		local16 = new Class100();
		local16.anInt2487 = arg0;
		local16.aClass235_2 = this;
		if (local38 != null) {
			local16.method1956(new Class4_Sub9(local38));
		}
		local16.method1960();
		@Pc(69) Class137 local69 = this.aClass137_51;
		synchronized (this.aClass137_51) {
			this.aClass137_51.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method4960() {
		@Pc(2) Class137 local2 = this.aClass137_51;
		synchronized (this.aClass137_51) {
			this.aClass137_51.method2737();
		}
		local2 = this.aClass137_52;
		synchronized (this.aClass137_52) {
			this.aClass137_52.method2737();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	public void method4961() {
		@Pc(2) Class137 local2 = this.aClass137_51;
		synchronized (this.aClass137_51) {
			this.aClass137_51.method2745(5);
		}
		local2 = this.aClass137_52;
		synchronized (this.aClass137_52) {
			this.aClass137_52.method2745(5);
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public void method4962() {
		@Pc(6) Class137 local6 = this.aClass137_51;
		synchronized (this.aClass137_51) {
			this.aClass137_51.method2739();
		}
		local6 = this.aClass137_52;
		synchronized (this.aClass137_52) {
			this.aClass137_52.method2739();
		}
	}
}
