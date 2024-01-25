import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class348 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!aj;")
	private Class10 aClass10_63 = new Class10(64);

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!aj;")
	public Class10 aClass10_64 = new Class10(64);

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!om;")
	public final Class246 aClass246_255;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!om;")
	private final Class246 aClass246_254;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;Lclient!om;)V")
	public Class348(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_255 = arg3;
		this.aClass246_254 = arg2;
		this.aClass246_254.method5673(34);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V")
	public void method7401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass10_63 = new Class10(arg0);
		this.aClass10_64 = new Class10(arg1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public void method7403() {
		@Pc(6) Class10 local6 = this.aClass10_63;
		synchronized (this.aClass10_63) {
			this.aClass10_63.method262();
		}
		local6 = this.aClass10_64;
		synchronized (this.aClass10_64) {
			this.aClass10_64.method262();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public void method7404() {
		@Pc(2) Class10 local2 = this.aClass10_63;
		synchronized (this.aClass10_63) {
			this.aClass10_63.method263();
		}
		local2 = this.aClass10_64;
		synchronized (this.aClass10_64) {
			this.aClass10_64.method263();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
	public void method7406() {
		@Pc(2) Class10 local2 = this.aClass10_63;
		synchronized (this.aClass10_63) {
			this.aClass10_63.method258(5);
		}
		local2 = this.aClass10_64;
		synchronized (this.aClass10_64) {
			this.aClass10_64.method258(5);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lclient!ge;")
	public Class113 method7407(@OriginalArg(0) int arg0) {
		@Pc(11) Class10 local11 = this.aClass10_63;
		@Pc(21) Class113 local21;
		synchronized (this.aClass10_63) {
			local21 = (Class113) this.aClass10_63.method250((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class246 local34 = this.aClass246_254;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_254) {
			local43 = this.aClass246_254.method5653(34, arg0);
		}
		local21 = new Class113();
		local21.aClass348_1 = this;
		if (local43 != null) {
			local21.method2921(new Class3_Sub11(local43));
		}
		@Pc(68) Class10 local68 = this.aClass10_63;
		synchronized (this.aClass10_63) {
			this.aClass10_63.method254(local21, (long) arg0);
			return local21;
		}
	}
}
