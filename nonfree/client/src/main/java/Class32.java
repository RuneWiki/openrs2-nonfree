import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class32 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!tja;")
	private final Class352 aClass352_5 = new Class352(64);

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Lclient!tja;")
	public final Class352 aClass352_6 = new Class352(2);

	@OriginalMember(owner = "client!br", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_9;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!bt;")
	public final Class34 aClass34_8;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!bt;)V")
	public Class32(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3) {
		this.aClass34_9 = arg2;
		this.aClass34_8 = arg3;
		this.aClass34_9.method1233(33);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)Lclient!o;")
	public Class258 method1025(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_5;
		@Pc(16) Class258 local16;
		synchronized (this.aClass352_5) {
			local16 = (Class258) this.aClass352_5.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_9;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_9) {
			local38 = this.aClass34_9.method1239(33, arg0);
		}
		local16 = new Class258();
		local16.aClass32_2 = this;
		if (local38 != null) {
			local16.method5765(new Class4_Sub11(local38));
		}
		@Pc(69) Class352 local69 = this.aClass352_5;
		synchronized (this.aClass352_5) {
			this.aClass352_5.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
	public void method1027() {
		@Pc(2) Class352 local2 = this.aClass352_5;
		synchronized (this.aClass352_5) {
			this.aClass352_5.method7663(5);
		}
		local2 = this.aClass352_6;
		synchronized (this.aClass352_6) {
			this.aClass352_6.method7663(5);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public void method1028() {
		@Pc(2) Class352 local2 = this.aClass352_5;
		synchronized (this.aClass352_5) {
			this.aClass352_5.method7659();
		}
		local2 = this.aClass352_6;
		synchronized (this.aClass352_6) {
			this.aClass352_6.method7659();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public void method1029() {
		@Pc(2) Class352 local2 = this.aClass352_5;
		synchronized (this.aClass352_5) {
			this.aClass352_5.method7656();
		}
		local2 = this.aClass352_6;
		synchronized (this.aClass352_6) {
			this.aClass352_6.method7656();
		}
	}
}
