import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class200 {

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!af;")
	private final Class10 aClass10_33 = new Class10(64);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!ae;")
	private final Class8 aClass8_91;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public final int anInt5427;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class200(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_91 = arg2;
		if (this.aClass8_91 == null) {
			this.anInt5427 = 0;
		} else {
			this.anInt5427 = this.aClass8_91.method280(16);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public void method4609() {
		@Pc(6) Class10 local6 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method380();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public void method4610() {
		@Pc(2) Class10 local2 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method375();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Lclient!wi;")
	public Class387 method4611(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_33;
		@Pc(16) Class387 local16;
		synchronized (this.aClass10_33) {
			local16 = (Class387) this.aClass10_33.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class8 local34 = this.aClass8_91;
		@Pc(43) byte[] local43;
		synchronized (this.aClass8_91) {
			local43 = this.aClass8_91.method262(arg0, 16);
		}
		local16 = new Class387();
		if (local43 != null) {
			local16.method9010(new Class6_Sub23(local43));
		}
		@Pc(65) Class10 local65 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)V")
	public void method4614() {
		@Pc(11) Class10 local11 = this.aClass10_33;
		synchronized (this.aClass10_33) {
			this.aClass10_33.method369(5);
		}
	}
}
