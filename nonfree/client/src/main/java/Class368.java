import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class368 {

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "Lclient!af;")
	private final Class10 aClass10_59 = new Class10(64);

	@OriginalMember(owner = "client!vfa", name = "i", descriptor = "Lclient!ae;")
	private final Class8 aClass8_140;

	@OriginalMember(owner = "client!vfa", name = "k", descriptor = "Lclient!lo;")
	public final Class212 aClass212_3;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!lo;)V")
	public Class368(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class212 arg3) {
		this.aClass8_140 = arg2;
		this.aClass8_140.method280(32);
		this.aClass212_3 = arg3;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BI)V")
	public void method8685() {
		@Pc(2) Class10 local2 = this.aClass10_59;
		synchronized (this.aClass10_59) {
			this.aClass10_59.method369(5);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	public void method8686() {
		@Pc(10) Class10 local10 = this.aClass10_59;
		synchronized (this.aClass10_59) {
			this.aClass10_59.method375();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	public void method8688() {
		@Pc(6) Class10 local6 = this.aClass10_59;
		synchronized (this.aClass10_59) {
			this.aClass10_59.method380();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(BI)Lclient!wl;")
	public Class389 method8689(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_59;
		@Pc(16) Class389 local16;
		synchronized (this.aClass10_59) {
			local16 = (Class389) this.aClass10_59.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class8 local29 = this.aClass8_140;
		@Pc(38) byte[] local38;
		synchronized (this.aClass8_140) {
			local38 = this.aClass8_140.method262(arg0, 32);
		}
		local16 = new Class389();
		local16.aClass368_2 = this;
		if (local38 != null) {
			local16.method9071(new Class6_Sub23(local38));
		}
		@Pc(71) Class10 local71 = this.aClass10_59;
		synchronized (this.aClass10_59) {
			this.aClass10_59.method366(local16, (long) arg0);
			return local16;
		}
	}
}
