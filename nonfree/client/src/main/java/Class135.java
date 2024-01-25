import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class135 {

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Lclient!tja;")
	private final Class352 aClass352_28 = new Class352(64);

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!bt;")
	private final Class34 aClass34_49;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class135(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_49 = arg2;
		if (this.aClass34_49 != null) {
			this.aClass34_49.method1233(54);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method3022() {
		@Pc(6) Class352 local6 = this.aClass352_28;
		synchronized (this.aClass352_28) {
			this.aClass352_28.method7659();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Lclient!tea;")
	public Class347 method3025(@OriginalArg(1) int arg0) {
		@Pc(11) Class352 local11 = this.aClass352_28;
		@Pc(21) Class347 local21;
		synchronized (this.aClass352_28) {
			local21 = (Class347) this.aClass352_28.method7653((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class34 local34 = this.aClass34_49;
		@Pc(43) byte[] local43;
		synchronized (this.aClass34_49) {
			local43 = this.aClass34_49.method1239(54, arg0);
		}
		local21 = new Class347();
		if (local43 != null) {
			local21.method7592(new Class4_Sub11(local43));
		}
		@Pc(65) Class352 local65 = this.aClass352_28;
		synchronized (this.aClass352_28) {
			this.aClass352_28.method7655((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)V")
	public void method3027() {
		@Pc(2) Class352 local2 = this.aClass352_28;
		synchronized (this.aClass352_28) {
			this.aClass352_28.method7663(5);
		}
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
	public void method3029() {
		@Pc(6) Class352 local6 = this.aClass352_28;
		synchronized (this.aClass352_28) {
			this.aClass352_28.method7656();
		}
	}
}
