import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class84 {

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "Lclient!tja;")
	private final Class352 aClass352_21 = new Class352(64);

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "Lclient!bt;")
	private final Class34 aClass34_27;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class84(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_27 = arg2;
		if (this.aClass34_27 != null) {
			this.aClass34_27.method1233(11);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V")
	public void method2147() {
		@Pc(7) Class352 local7 = this.aClass352_21;
		synchronized (this.aClass352_21) {
			this.aClass352_21.method7663(5);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
	public void method2148() {
		@Pc(2) Class352 local2 = this.aClass352_21;
		synchronized (this.aClass352_21) {
			this.aClass352_21.method7659();
		}
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)V")
	public void method2150() {
		@Pc(6) Class352 local6 = this.aClass352_21;
		synchronized (this.aClass352_21) {
			this.aClass352_21.method7656();
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(ZI)Lclient!nw;")
	public Class257 method2152(@OriginalArg(1) int arg0) {
		@Pc(11) Class352 local11 = this.aClass352_21;
		@Pc(21) Class257 local21;
		synchronized (this.aClass352_21) {
			local21 = (Class257) this.aClass352_21.method7653((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class34 local34 = this.aClass34_27;
		@Pc(43) byte[] local43;
		synchronized (this.aClass34_27) {
			local43 = this.aClass34_27.method1239(11, arg0);
		}
		local21 = new Class257();
		if (local43 != null) {
			local21.method5758(new Class4_Sub11(local43));
		}
		@Pc(65) Class352 local65 = this.aClass352_21;
		synchronized (this.aClass352_21) {
			this.aClass352_21.method7655((long) arg0, local21);
			return local21;
		}
	}
}
