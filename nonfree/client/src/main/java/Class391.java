import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class391 {

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Lclient!af;")
	private final Class10 aClass10_65 = new Class10(128);

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "Lclient!ae;")
	private final Class8 aClass8_149;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class391(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_149 = arg2;
		this.aClass8_149.method280(1);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public void method9091() {
		@Pc(7) Class10 local7 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method375();
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public void method9092() {
		@Pc(2) Class10 local2 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method380();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public void method9093() {
		@Pc(12) Class10 local12 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method369(5);
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)Lclient!pv;")
	public Class278 method9095(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_65;
		@Pc(25) Class278 local25;
		synchronized (this.aClass10_65) {
			local25 = (Class278) this.aClass10_65.method373((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class8 local38 = this.aClass8_149;
		@Pc(47) byte[] local47;
		synchronized (this.aClass8_149) {
			local47 = this.aClass8_149.method262(arg0, 1);
		}
		local25 = new Class278();
		if (local47 != null) {
			local25.method6864(new Class6_Sub23(local47));
		}
		local6 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method366(local25, (long) arg0);
			return local25;
		}
	}
}
