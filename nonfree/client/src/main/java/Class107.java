import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class107 {

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!af;")
	private final Class10 aClass10_13 = new Class10(64);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!ae;")
	private final Class8 aClass8_46;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!ae;")
	public final Class8 aClass8_47;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!ae;)V")
	public Class107(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3) {
		this.aClass8_46 = arg2;
		this.aClass8_47 = arg3;
		this.aClass8_46.method280(3);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	public void method2168() {
		@Pc(2) Class10 local2 = this.aClass10_13;
		synchronized (this.aClass10_13) {
			this.aClass10_13.method380();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public void method2172() {
		@Pc(2) Class10 local2 = this.aClass10_13;
		synchronized (this.aClass10_13) {
			this.aClass10_13.method369(5);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public void method2173() {
		@Pc(2) Class10 local2 = this.aClass10_13;
		synchronized (this.aClass10_13) {
			this.aClass10_13.method375();
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Lclient!us;")
	public Class359 method2175(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_13;
		@Pc(16) Class359 local16;
		synchronized (this.aClass10_13) {
			local16 = (Class359) this.aClass10_13.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class8 local29 = this.aClass8_46;
		@Pc(38) byte[] local38;
		synchronized (this.aClass8_46) {
			local38 = this.aClass8_46.method262(arg0, 3);
		}
		local16 = new Class359();
		local16.aClass107_2 = this;
		if (local38 != null) {
			local16.method8491(new Class6_Sub23(local38));
		}
		@Pc(63) Class10 local63 = this.aClass10_13;
		synchronized (this.aClass10_13) {
			this.aClass10_13.method366(local16, (long) arg0);
			return local16;
		}
	}
}
