import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class254 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!tja;")
	private final Class352 aClass352_48 = new Class352(64);

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Lclient!bt;")
	public final Class34 aClass34_87;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!bt;")
	private final Class34 aClass34_88;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!bt;)V")
	public Class254(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3) {
		this.aClass34_87 = arg3;
		this.aClass34_88 = arg2;
		this.aClass34_88.method1233(3);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method5197() {
		@Pc(2) Class352 local2 = this.aClass352_48;
		synchronized (this.aClass352_48) {
			this.aClass352_48.method7656();
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public void method5199() {
		@Pc(2) Class352 local2 = this.aClass352_48;
		synchronized (this.aClass352_48) {
			this.aClass352_48.method7659();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
	public void method5200() {
		@Pc(2) Class352 local2 = this.aClass352_48;
		synchronized (this.aClass352_48) {
			this.aClass352_48.method7663(5);
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(BI)Lclient!su;")
	public Class339 method5202(@OriginalArg(1) int arg0) {
		@Pc(12) Class352 local12 = this.aClass352_48;
		@Pc(22) Class339 local22;
		synchronized (this.aClass352_48) {
			local22 = (Class339) this.aClass352_48.method7653((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class34 local35 = this.aClass34_88;
		@Pc(44) byte[] local44;
		synchronized (this.aClass34_88) {
			local44 = this.aClass34_88.method1239(3, arg0);
		}
		local22 = new Class339();
		local22.aClass254_2 = this;
		if (local44 != null) {
			local22.method7438(new Class4_Sub11(local44));
		}
		@Pc(69) Class352 local69 = this.aClass352_48;
		synchronized (this.aClass352_48) {
			this.aClass352_48.method7655((long) arg0, local22);
			return local22;
		}
	}
}
