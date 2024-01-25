import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class131 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!jda;")
	public final Class165 aClass165_27 = new Class165(20);

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Lclient!jda;")
	private final Class165 aClass165_28 = new Class165(64);

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!aj;")
	private final Class15 aClass15_60;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!aj;")
	public final Class15 aClass15_61;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!aj;)V")
	public Class131(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class15 arg3) {
		this.aClass15_60 = arg2;
		this.aClass15_61 = arg3;
		this.aClass15_60.method512(46);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public void method3755() {
		@Pc(10) Class165 local10 = this.aClass165_28;
		synchronized (this.aClass165_28) {
			this.aClass165_28.method4403();
		}
		local10 = this.aClass165_27;
		synchronized (this.aClass165_27) {
			this.aClass165_27.method4403();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	public void method3758() {
		@Pc(2) Class165 local2 = this.aClass165_28;
		synchronized (this.aClass165_28) {
			this.aClass165_28.method4394(5);
		}
		local2 = this.aClass165_27;
		synchronized (this.aClass165_27) {
			this.aClass165_27.method4394(5);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lclient!nv;")
	public Class246 method3759(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_28;
		@Pc(16) Class246 local16;
		synchronized (this.aClass165_28) {
			local16 = (Class246) this.aClass165_28.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class15 local35 = this.aClass15_60;
		@Pc(46) byte[] local46;
		synchronized (this.aClass15_60) {
			local46 = this.aClass15_60.method517(arg0, 46);
		}
		local16 = new Class246();
		local16.aClass131_2 = this;
		if (local46 != null) {
			local16.method5917(new Class3_Sub25(local46));
		}
		@Pc(71) Class165 local71 = this.aClass165_28;
		synchronized (this.aClass165_28) {
			this.aClass165_28.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public void method3761() {
		@Pc(9) Class165 local9 = this.aClass165_28;
		synchronized (this.aClass165_28) {
			this.aClass165_28.method4400();
		}
		local9 = this.aClass165_27;
		synchronized (this.aClass165_27) {
			this.aClass165_27.method4400();
		}
	}
}
