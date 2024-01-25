import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class55 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!af;")
	public final Class10 aClass10_2 = new Class10(20);

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Lclient!af;")
	private final Class10 aClass10_3 = new Class10(64);

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!ae;")
	private final Class8 aClass8_23;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!ae;")
	public final Class8 aClass8_24;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!ae;)V")
	public Class55(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3) {
		this.aClass8_23 = arg2;
		this.aClass8_24 = arg3;
		this.aClass8_23.method280(46);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method1400() {
		@Pc(6) Class10 local6 = this.aClass10_3;
		synchronized (this.aClass10_3) {
			this.aClass10_3.method375();
		}
		local6 = this.aClass10_2;
		synchronized (this.aClass10_2) {
			this.aClass10_2.method375();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)Lclient!qg;")
	public Class285 method1401(@OriginalArg(1) int arg0) {
		@Pc(11) Class10 local11 = this.aClass10_3;
		@Pc(21) Class285 local21;
		synchronized (this.aClass10_3) {
			local21 = (Class285) this.aClass10_3.method373((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class8 local34 = this.aClass8_23;
		@Pc(43) byte[] local43;
		synchronized (this.aClass8_23) {
			local43 = this.aClass8_23.method262(arg0, 46);
		}
		local21 = new Class285();
		local21.aClass55_2 = this;
		if (local43 != null) {
			local21.method6982(new Class6_Sub23(local43));
		}
		@Pc(68) Class10 local68 = this.aClass10_3;
		synchronized (this.aClass10_3) {
			this.aClass10_3.method366(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public void method1402() {
		@Pc(6) Class10 local6 = this.aClass10_3;
		synchronized (this.aClass10_3) {
			this.aClass10_3.method380();
		}
		local6 = this.aClass10_2;
		synchronized (this.aClass10_2) {
			this.aClass10_2.method380();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V")
	public void method1405() {
		@Pc(6) Class10 local6 = this.aClass10_3;
		synchronized (this.aClass10_3) {
			this.aClass10_3.method369(5);
		}
		local6 = this.aClass10_2;
		synchronized (this.aClass10_2) {
			this.aClass10_2.method369(5);
		}
	}
}
