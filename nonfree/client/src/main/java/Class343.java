import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class343 {

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "Lclient!jda;")
	private final Class165 aClass165_69 = new Class165(64);

	@OriginalMember(owner = "client!uaa", name = "l", descriptor = "Lclient!jda;")
	private final Class165 aClass165_70 = new Class165(100);

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lclient!aj;")
	private final Class15 aClass15_147;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!aj;Lclient!aj;)V")
	public Class343(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) Class15 arg4) {
		this.aClass15_147 = arg2;
		if (this.aClass15_147 != null) {
			@Pc(26) int local26 = this.aClass15_147.method516() - 1;
			this.aClass15_147.method512(local26);
		}
		Static160.method2904(arg4, arg3);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public void method8348() {
		@Pc(6) Class165 local6 = this.aClass165_69;
		synchronized (this.aClass165_69) {
			this.aClass165_69.method4400();
		}
		local6 = this.aClass165_70;
		synchronized (this.aClass165_70) {
			this.aClass165_70.method4400();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IB)V")
	public void method8350() {
		@Pc(6) Class165 local6 = this.aClass165_69;
		synchronized (this.aClass165_69) {
			this.aClass165_69.method4394(5);
		}
		local6 = this.aClass165_70;
		synchronized (this.aClass165_70) {
			this.aClass165_70.method4394(5);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lclient!bs;")
	public Class3_Sub11_Sub1 method8352(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_70;
		synchronized (this.aClass165_70) {
			@Pc(24) Class3_Sub11_Sub1 local24 = (Class3_Sub11_Sub1) this.aClass165_70.method4389((long) arg0);
			if (local24 == null) {
				local24 = new Class3_Sub11_Sub1(arg0);
				this.aClass165_70.method4392(local24, (long) arg0);
			}
			return local24.method1180() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	public void method8353() {
		@Pc(6) Class165 local6 = this.aClass165_69;
		synchronized (this.aClass165_69) {
			this.aClass165_69.method4403();
		}
		local6 = this.aClass165_70;
		synchronized (this.aClass165_70) {
			this.aClass165_70.method4403();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)Lclient!vq;")
	public Class372 method8356(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_69;
		@Pc(16) Class372 local16;
		synchronized (this.aClass165_69) {
			local16 = (Class372) this.aClass165_69.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_147;
		@Pc(42) byte[] local42;
		synchronized (this.aClass15_147) {
			local42 = this.aClass15_147.method517(Static597.method8389(arg0), Static323.method4167(arg0));
		}
		local16 = new Class372();
		local16.aClass343_4 = this;
		local16.anInt10252 = arg0;
		if (local42 != null) {
			local16.method8973(new Class3_Sub25(local42));
		}
		local16.method8977();
		@Pc(78) Class165 local78 = this.aClass165_69;
		synchronized (this.aClass165_69) {
			this.aClass165_69.method4392(local16, (long) arg0);
			return local16;
		}
	}
}
