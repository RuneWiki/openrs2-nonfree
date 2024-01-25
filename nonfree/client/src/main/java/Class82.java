import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class82 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!tb;")
	private final Class313 aClass313_15 = new Class313(64);

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!pl;")
	private final Class259 aClass259_41;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class82(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_41 = arg2;
		if (this.aClass259_41 != null) {
			this.aClass259_41.method5969(11);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public void method1493() {
		@Pc(13) Class313 local13 = this.aClass313_15;
		synchronized (this.aClass313_15) {
			this.aClass313_15.method6983();
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
	public void method1495() {
		@Pc(2) Class313 local2 = this.aClass313_15;
		synchronized (this.aClass313_15) {
			this.aClass313_15.method6977();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)Lclient!vu;")
	public Class352 method1498(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_15;
		@Pc(16) Class352 local16;
		synchronized (this.aClass313_15) {
			local16 = (Class352) this.aClass313_15.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_41;
		@Pc(38) byte[] local38;
		synchronized (this.aClass259_41) {
			local38 = this.aClass259_41.method5985(arg0, 11);
		}
		local16 = new Class352();
		if (local38 != null) {
			local16.method7725(new Class2_Sub15(local38));
		}
		@Pc(65) Class313 local65 = this.aClass313_15;
		synchronized (this.aClass313_15) {
			this.aClass313_15.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public void method1499() {
		@Pc(6) Class313 local6 = this.aClass313_15;
		synchronized (this.aClass313_15) {
			this.aClass313_15.method6982(5);
		}
	}
}
