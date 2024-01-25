import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class233 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Lclient!af;")
	private final Class10 aClass10_39 = new Class10(64);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!ae;")
	private final Class8 aClass8_100;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class233(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_100 = arg2;
		if (this.aClass8_100 != null) {
			this.aClass8_100.method280(35);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)V")
	public void method5356() {
		@Pc(6) Class10 local6 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method369(5);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public void method5358() {
		@Pc(2) Class10 local2 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method380();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)Lclient!kp;")
	public Class196 method5359(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_39;
		@Pc(18) Class196 local18;
		synchronized (this.aClass10_39) {
			local18 = (Class196) this.aClass10_39.method373((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class8 local31 = this.aClass8_100;
		@Pc(40) byte[] local40;
		synchronized (this.aClass8_100) {
			local40 = this.aClass8_100.method262(arg0, 35);
		}
		local18 = new Class196();
		if (local40 != null) {
			local18.method4557(new Class6_Sub23(local40));
		}
		local18.method4558();
		@Pc(65) Class10 local65 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method366(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public void method5362() {
		@Pc(2) Class10 local2 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method375();
		}
	}
}
