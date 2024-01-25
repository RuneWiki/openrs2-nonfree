import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class76 {

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "Lclient!af;")
	private final Class10 aClass10_6 = new Class10(256);

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lclient!ae;")
	private final Class8 aClass8_34;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class76(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_34 = arg2;
		this.aClass8_34.method280(26);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public void method1830() {
		@Pc(2) Class10 local2 = this.aClass10_6;
		synchronized (this.aClass10_6) {
			this.aClass10_6.method380();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)Lclient!qh;")
	public Class6_Sub4_Sub15 method1832(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_6;
		@Pc(16) Class6_Sub4_Sub15 local16;
		synchronized (this.aClass10_6) {
			local16 = (Class6_Sub4_Sub15) this.aClass10_6.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class8 local29 = this.aClass8_34;
		@Pc(38) byte[] local38;
		synchronized (this.aClass8_34) {
			local38 = this.aClass8_34.method262(arg0, 26);
		}
		local16 = new Class6_Sub4_Sub15();
		if (local38 != null) {
			local16.method7013(new Class6_Sub23(local38));
		}
		@Pc(66) Class10 local66 = this.aClass10_6;
		synchronized (this.aClass10_6) {
			this.aClass10_6.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)V")
	public void method1833() {
		@Pc(10) Class10 local10 = this.aClass10_6;
		synchronized (this.aClass10_6) {
			this.aClass10_6.method375();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)V")
	public void method1834() {
		@Pc(2) Class10 local2 = this.aClass10_6;
		synchronized (this.aClass10_6) {
			this.aClass10_6.method369(5);
		}
	}
}
