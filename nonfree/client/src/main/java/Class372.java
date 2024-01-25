import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class372 {

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Lclient!af;")
	private Class10 aClass10_60 = new Class10(64);

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!ae;")
	private final Class8 aClass8_141;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class372(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_141 = arg2;
		if (this.aClass8_141 != null) {
			@Pc(20) int local20 = this.aClass8_141.method279() - 1;
			this.aClass8_141.method280(local20);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public void method8721() {
		@Pc(6) Class10 local6 = this.aClass10_60;
		synchronized (this.aClass10_60) {
			this.aClass10_60.method375();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
	public void method8722() {
		@Pc(11) Class10 local11 = this.aClass10_60;
		synchronized (this.aClass10_60) {
			this.aClass10_60.method369(5);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)V")
	public void method8723(@OriginalArg(1) int arg0) {
		@Pc(2) Class10 local2 = this.aClass10_60;
		synchronized (this.aClass10_60) {
			this.aClass10_60.method375();
			this.aClass10_60 = new Class10(arg0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(BI)Lclient!uca;")
	public Class348 method8725(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_60;
		@Pc(16) Class348 local16;
		synchronized (this.aClass10_60) {
			local16 = (Class348) this.aClass10_60.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class8 local37 = this.aClass8_141;
		@Pc(50) byte[] local50;
		synchronized (this.aClass8_141) {
			local50 = this.aClass8_141.method262(Static123.method1898(arg0), Static499.method7174(arg0));
		}
		local16 = new Class348();
		if (local50 != null) {
			local16.method8152(new Class6_Sub23(local50));
		}
		@Pc(72) Class10 local72 = this.aClass10_60;
		synchronized (this.aClass10_60) {
			this.aClass10_60.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public void method8726() {
		@Pc(6) Class10 local6 = this.aClass10_60;
		synchronized (this.aClass10_60) {
			this.aClass10_60.method380();
		}
	}
}
