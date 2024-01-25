import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class21 {

	@OriginalMember(owner = "client!at", name = "i", descriptor = "Lclient!fc;")
	private final Class94 aClass94_4 = new Class94(64);

	@OriginalMember(owner = "client!at", name = "h", descriptor = "Lclient!ni;")
	private final Class223 aClass223_8;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class21(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_8 = arg2;
		if (this.aClass223_8 != null) {
			this.aClass223_8.method5970(35);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
	public void method700() {
		@Pc(2) Class94 local2 = this.aClass94_4;
		synchronized (this.aClass94_4) {
			this.aClass94_4.method2964();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Lclient!oba;")
	public Class236 method702(@OriginalArg(0) int arg0) {
		@Pc(12) Class94 local12 = this.aClass94_4;
		@Pc(22) Class236 local22;
		synchronized (this.aClass94_4) {
			local22 = (Class236) this.aClass94_4.method2960((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class223 local35 = this.aClass223_8;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_8) {
			local44 = this.aClass223_8.method5954(arg0, 35);
		}
		local22 = new Class236();
		if (local44 != null) {
			local22.method6198(new Class6_Sub8(local44));
		}
		local22.method6201();
		@Pc(69) Class94 local69 = this.aClass94_4;
		synchronized (this.aClass94_4) {
			this.aClass94_4.method2963((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public void method703() {
		@Pc(11) Class94 local11 = this.aClass94_4;
		synchronized (this.aClass94_4) {
			this.aClass94_4.method2952();
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)V")
	public void method705() {
		@Pc(2) Class94 local2 = this.aClass94_4;
		synchronized (this.aClass94_4) {
			this.aClass94_4.method2958(5);
		}
	}
}
