import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class162 {

	@OriginalMember(owner = "client!iia", name = "g", descriptor = "Lclient!af;")
	private final Class10 aClass10_20 = new Class10(64);

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "Lclient!ae;")
	private final Class8 aClass8_67;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class162(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_67 = arg2;
		this.aClass8_67.method280(31);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	public void method3617() {
		@Pc(11) Class10 local11 = this.aClass10_20;
		synchronized (this.aClass10_20) {
			this.aClass10_20.method375();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IB)Lclient!sv;")
	public Class328 method3622(@OriginalArg(0) int arg0) {
		@Pc(11) Class10 local11 = this.aClass10_20;
		@Pc(21) Class328 local21;
		synchronized (this.aClass10_20) {
			local21 = (Class328) this.aClass10_20.method373((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class8 local34 = this.aClass8_67;
		@Pc(43) byte[] local43;
		synchronized (this.aClass8_67) {
			local43 = this.aClass8_67.method262(arg0, 31);
		}
		local21 = new Class328();
		if (local43 != null) {
			local21.method7835(new Class6_Sub23(local43));
		}
		@Pc(65) Class10 local65 = this.aClass10_20;
		synchronized (this.aClass10_20) {
			this.aClass10_20.method366(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V")
	public void method3623() {
		@Pc(6) Class10 local6 = this.aClass10_20;
		synchronized (this.aClass10_20) {
			this.aClass10_20.method369(5);
		}
	}

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)V")
	public void method3624() {
		@Pc(12) Class10 local12 = this.aClass10_20;
		synchronized (this.aClass10_20) {
			this.aClass10_20.method380();
		}
	}
}
