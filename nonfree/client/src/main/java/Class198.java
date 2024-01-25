import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class198 {

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!af;")
	private final Class10 aClass10_32 = new Class10(64);

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "Lclient!ae;")
	private final Class8 aClass8_90;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class198(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_90 = arg2;
		if (this.aClass8_90 != null) {
			this.aClass8_90.method280(54);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public void method4601() {
		@Pc(2) Class10 local2 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method375();
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
	public void method4603() {
		@Pc(6) Class10 local6 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method380();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)Lclient!nga;")
	public Class240 method4604(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_32;
		@Pc(18) Class240 local18;
		synchronized (this.aClass10_32) {
			local18 = (Class240) this.aClass10_32.method373((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class8 local31 = this.aClass8_90;
		@Pc(40) byte[] local40;
		synchronized (this.aClass8_90) {
			local40 = this.aClass8_90.method262(arg0, 54);
		}
		local18 = new Class240();
		if (local40 != null) {
			local18.method5567(new Class6_Sub23(local40));
		}
		@Pc(62) Class10 local62 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method366(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V")
	public void method4605() {
		@Pc(2) Class10 local2 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method369(5);
		}
	}
}
