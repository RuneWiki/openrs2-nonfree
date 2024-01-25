import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class184 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!tja;")
	private Class352 aClass352_40 = new Class352(64);

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!bt;")
	private final Class34 aClass34_66;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class184(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_66 = arg2;
		if (this.aClass34_66 != null) {
			@Pc(20) int local20 = this.aClass34_66.method1247() - 1;
			this.aClass34_66.method1233(local20);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public void method4121() {
		@Pc(7) Class352 local7 = this.aClass352_40;
		synchronized (this.aClass352_40) {
			this.aClass352_40.method7663(5);
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Lclient!fga;")
	public Class114 method4122(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_40;
		@Pc(16) Class114 local16;
		synchronized (this.aClass352_40) {
			local16 = (Class114) this.aClass352_40.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_66;
		@Pc(42) byte[] local42;
		synchronized (this.aClass34_66) {
			local42 = this.aClass34_66.method1239(Static637.method8480(arg0), Static207.method8077(arg0));
		}
		local16 = new Class114();
		if (local42 != null) {
			local16.method2712(new Class4_Sub11(local42));
		}
		@Pc(64) Class352 local64 = this.aClass352_40;
		synchronized (this.aClass352_40) {
			this.aClass352_40.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V")
	public void method4123(@OriginalArg(1) int arg0) {
		@Pc(2) Class352 local2 = this.aClass352_40;
		synchronized (this.aClass352_40) {
			this.aClass352_40.method7659();
			this.aClass352_40 = new Class352(arg0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public void method4124() {
		@Pc(10) Class352 local10 = this.aClass352_40;
		synchronized (this.aClass352_40) {
			this.aClass352_40.method7659();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public void method4125() {
		@Pc(2) Class352 local2 = this.aClass352_40;
		synchronized (this.aClass352_40) {
			this.aClass352_40.method7656();
		}
	}
}
