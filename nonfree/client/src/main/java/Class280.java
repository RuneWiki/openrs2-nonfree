import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class280 {

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!af;")
	private Class10 aClass10_50 = new Class10(128);

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!af;")
	public Class10 aClass10_51 = new Class10(64);

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!ae;")
	public final Class8 aClass8_118;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!ae;")
	private final Class8 aClass8_117;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!ae;)V")
	public Class280(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3) {
		this.aClass8_118 = arg3;
		this.aClass8_117 = arg2;
		this.aClass8_117.method280(36);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method6910() {
		@Pc(14) Class10 local14 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method375();
		}
		local14 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method375();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lclient!sda;")
	public Class318 method6911(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_50;
		@Pc(16) Class318 local16;
		synchronized (this.aClass10_50) {
			local16 = (Class318) this.aClass10_50.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class8 local29 = this.aClass8_117;
		@Pc(38) byte[] local38;
		synchronized (this.aClass8_117) {
			local38 = this.aClass8_117.method262(arg0, 36);
		}
		local16 = new Class318();
		local16.anInt8708 = arg0;
		local16.aClass280_4 = this;
		if (local38 != null) {
			local16.method7384(new Class6_Sub23(local38));
		}
		local16.method7383();
		@Pc(69) Class10 local69 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)V")
	public void method6912() {
		@Pc(2) Class10 local2 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method369(5);
		}
		local2 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method369(5);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public void method6914() {
		@Pc(6) Class10 local6 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method380();
		}
		local6 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method380();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V")
	public void method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass10_50 = new Class10(arg1);
		this.aClass10_51 = new Class10(arg0);
	}
}
