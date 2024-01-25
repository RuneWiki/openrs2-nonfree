import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class186 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!af;")
	private Class10 aClass10_25 = new Class10(64);

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!af;")
	public Class10 aClass10_26 = new Class10(64);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!ae;")
	public final Class8 aClass8_77;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!ae;")
	private final Class8 aClass8_78;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!ae;)V")
	public Class186(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3) {
		this.aClass8_77 = arg3;
		this.aClass8_78 = arg2;
		this.aClass8_78.method280(34);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!qba;")
	public Class281 method4234(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_25;
		@Pc(16) Class281 local16;
		synchronized (this.aClass10_25) {
			local16 = (Class281) this.aClass10_25.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class8 local37 = this.aClass8_78;
		@Pc(46) byte[] local46;
		synchronized (this.aClass8_78) {
			local46 = this.aClass8_78.method262(arg0, 34);
		}
		local16 = new Class281();
		local16.aClass186_4 = this;
		if (local46 != null) {
			local16.method6919(new Class6_Sub23(local46));
		}
		@Pc(71) Class10 local71 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)V")
	public void method4236() {
		@Pc(8) Class10 local8 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method369(5);
		}
		local8 = this.aClass10_26;
		synchronized (this.aClass10_26) {
			this.aClass10_26.method369(5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)V")
	public void method4237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass10_25 = new Class10(arg1);
		this.aClass10_26 = new Class10(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method4238() {
		@Pc(6) Class10 local6 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method380();
		}
		local6 = this.aClass10_26;
		synchronized (this.aClass10_26) {
			this.aClass10_26.method380();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public void method4239() {
		@Pc(2) Class10 local2 = this.aClass10_25;
		synchronized (this.aClass10_25) {
			this.aClass10_25.method375();
		}
		local2 = this.aClass10_26;
		synchronized (this.aClass10_26) {
			this.aClass10_26.method375();
		}
	}
}
