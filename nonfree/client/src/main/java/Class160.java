import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class160 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!tja;")
	private final Class352 aClass352_34 = new Class352(128);

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!bt;")
	private final Class34 aClass34_55;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class160(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_55 = arg2;
		this.aClass34_55.method1233(1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
	public void method3541() {
		@Pc(2) Class352 local2 = this.aClass352_34;
		synchronized (this.aClass352_34) {
			this.aClass352_34.method7663(5);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method3542() {
		@Pc(2) Class352 local2 = this.aClass352_34;
		synchronized (this.aClass352_34) {
			this.aClass352_34.method7656();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public void method3544() {
		@Pc(2) Class352 local2 = this.aClass352_34;
		synchronized (this.aClass352_34) {
			this.aClass352_34.method7659();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)Lclient!aj;")
	public Class14 method3545(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_34;
		@Pc(25) Class14 local25;
		synchronized (this.aClass352_34) {
			local25 = (Class14) this.aClass352_34.method7653((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class34 local38 = this.aClass34_55;
		@Pc(47) byte[] local47;
		synchronized (this.aClass34_55) {
			local47 = this.aClass34_55.method1239(1, arg0);
		}
		local25 = new Class14();
		if (local47 != null) {
			local25.method243(new Class4_Sub11(local47));
		}
		local6 = this.aClass352_34;
		synchronized (this.aClass352_34) {
			this.aClass352_34.method7655((long) arg0, local25);
			return local25;
		}
	}
}
