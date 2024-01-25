import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class273 {

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "Lclient!tja;")
	private final Class352 aClass352_51 = new Class352(16);

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "Lclient!bt;")
	private final Class34 aClass34_95;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class273(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_95 = arg2;
		this.aClass34_95.method1233(30);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)Lclient!iea;")
	public Class162 method6186(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_51;
		@Pc(16) Class162 local16;
		synchronized (this.aClass352_51) {
			local16 = (Class162) this.aClass352_51.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_95;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_95) {
			local38 = this.aClass34_95.method1239(30, arg0);
		}
		local16 = new Class162();
		if (local38 != null) {
			local16.method3634(new Class4_Sub11(local38));
		}
		@Pc(60) Class352 local60 = this.aClass352_51;
		synchronized (this.aClass352_51) {
			this.aClass352_51.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	public void method6187() {
		@Pc(6) Class352 local6 = this.aClass352_51;
		synchronized (this.aClass352_51) {
			this.aClass352_51.method7656();
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(II)V")
	public void method6188() {
		@Pc(6) Class352 local6 = this.aClass352_51;
		synchronized (this.aClass352_51) {
			this.aClass352_51.method7663(5);
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
	public void method6189() {
		@Pc(2) Class352 local2 = this.aClass352_51;
		synchronized (this.aClass352_51) {
			this.aClass352_51.method7659();
		}
	}
}
