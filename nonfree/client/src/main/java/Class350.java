import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class350 {

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "Lclient!af;")
	private final Class10 aClass10_56 = new Class10(64);

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "Lclient!af;")
	public final Class10 aClass10_57 = new Class10(2);

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "Lclient!ae;")
	public final Class8 aClass8_133;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "Lclient!ae;")
	private final Class8 aClass8_132;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!ae;)V")
	public Class350(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3) {
		this.aClass8_133 = arg3;
		this.aClass8_132 = arg2;
		this.aClass8_132.method280(33);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Lclient!tp;")
	public Class341 method8189(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_56;
		@Pc(16) Class341 local16;
		synchronized (this.aClass10_56) {
			local16 = (Class341) this.aClass10_56.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class8 local29 = this.aClass8_132;
		@Pc(38) byte[] local38;
		synchronized (this.aClass8_132) {
			local38 = this.aClass8_132.method262(arg0, 33);
		}
		local16 = new Class341();
		local16.aClass350_2 = this;
		if (local38 != null) {
			local16.method8050(new Class6_Sub23(local38));
		}
		@Pc(65) Class10 local65 = this.aClass10_56;
		synchronized (this.aClass10_56) {
			this.aClass10_56.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB)V")
	public void method8190() {
		@Pc(2) Class10 local2 = this.aClass10_56;
		synchronized (this.aClass10_56) {
			this.aClass10_56.method369(5);
		}
		local2 = this.aClass10_57;
		synchronized (this.aClass10_57) {
			this.aClass10_57.method369(5);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
	public void method8192() {
		@Pc(14) Class10 local14 = this.aClass10_56;
		synchronized (this.aClass10_56) {
			this.aClass10_56.method380();
		}
		local14 = this.aClass10_57;
		synchronized (this.aClass10_57) {
			this.aClass10_57.method380();
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V")
	public void method8193() {
		@Pc(6) Class10 local6 = this.aClass10_56;
		synchronized (this.aClass10_56) {
			this.aClass10_56.method375();
		}
		local6 = this.aClass10_57;
		synchronized (this.aClass10_57) {
			this.aClass10_57.method375();
		}
	}
}
