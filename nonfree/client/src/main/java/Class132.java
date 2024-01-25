import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class132 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!tja;")
	private Class352 aClass352_26 = new Class352(64);

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!tja;")
	public Class352 aClass352_27 = new Class352(64);

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!bt;")
	private final Class34 aClass34_46;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!bt;")
	public final Class34 aClass34_47;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!bt;)V")
	public Class132(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3) {
		this.aClass34_46 = arg2;
		this.aClass34_47 = arg3;
		this.aClass34_46.method1233(34);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public void method2913() {
		@Pc(2) Class352 local2 = this.aClass352_26;
		synchronized (this.aClass352_26) {
			this.aClass352_26.method7659();
		}
		local2 = this.aClass352_27;
		synchronized (this.aClass352_27) {
			this.aClass352_27.method7659();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method2914() {
		@Pc(2) Class352 local2 = this.aClass352_26;
		synchronized (this.aClass352_26) {
			this.aClass352_26.method7663(5);
		}
		local2 = this.aClass352_27;
		synchronized (this.aClass352_27) {
			this.aClass352_27.method7663(5);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lclient!rl;")
	public Class318 method2915(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_26;
		@Pc(16) Class318 local16;
		synchronized (this.aClass352_26) {
			local16 = (Class318) this.aClass352_26.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_46;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_46) {
			local38 = this.aClass34_46.method1239(34, arg0);
		}
		local16 = new Class318();
		local16.aClass132_3 = this;
		if (local38 != null) {
			local16.method7048(new Class4_Sub11(local38));
		}
		@Pc(68) Class352 local68 = this.aClass352_26;
		synchronized (this.aClass352_26) {
			this.aClass352_26.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public void method2916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass352_26 = new Class352(arg0);
		this.aClass352_27 = new Class352(arg1);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public void method2917() {
		@Pc(2) Class352 local2 = this.aClass352_26;
		synchronized (this.aClass352_26) {
			this.aClass352_26.method7656();
		}
		local2 = this.aClass352_27;
		synchronized (this.aClass352_27) {
			this.aClass352_27.method7656();
		}
	}
}
