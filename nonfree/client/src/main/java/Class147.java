import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hka")
public final class Class147 {

	@OriginalMember(owner = "client!hka", name = "g", descriptor = "Lclient!af;")
	private final Class10 aClass10_17 = new Class10(16);

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "Lclient!ae;")
	private final Class8 aClass8_61;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class147(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_61 = arg2;
		this.aClass8_61.method280(30);
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(II)V")
	public void method3201() {
		@Pc(13) Class10 local13 = this.aClass10_17;
		synchronized (this.aClass10_17) {
			this.aClass10_17.method369(5);
		}
	}

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "(B)V")
	public void method3204() {
		@Pc(7) Class10 local7 = this.aClass10_17;
		synchronized (this.aClass10_17) {
			this.aClass10_17.method375();
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)V")
	public void method3205() {
		@Pc(10) Class10 local10 = this.aClass10_17;
		synchronized (this.aClass10_17) {
			this.aClass10_17.method380();
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(BI)Lclient!hfa;")
	public Class139 method3207(@OriginalArg(1) int arg0) {
		@Pc(12) Class10 local12 = this.aClass10_17;
		@Pc(24) Class139 local24;
		synchronized (this.aClass10_17) {
			local24 = (Class139) this.aClass10_17.method373((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class8 local37 = this.aClass8_61;
		@Pc(46) byte[] local46;
		synchronized (this.aClass8_61) {
			local46 = this.aClass8_61.method262(arg0, 30);
		}
		local24 = new Class139();
		if (local46 != null) {
			local24.method3103(new Class6_Sub23(local46));
		}
		@Pc(68) Class10 local68 = this.aClass10_17;
		synchronized (this.aClass10_17) {
			this.aClass10_17.method366(local24, (long) arg0);
			return local24;
		}
	}
}
