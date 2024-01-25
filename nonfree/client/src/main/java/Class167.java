import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class167 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!fc;")
	private final Class94 aClass94_28 = new Class94(128);

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!ni;")
	private final Class223 aClass223_64;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class167(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_64 = arg2;
		this.aClass223_64.method5970(1);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method5015() {
		@Pc(6) Class94 local6 = this.aClass94_28;
		synchronized (this.aClass94_28) {
			this.aClass94_28.method2964();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!el;")
	public Class87 method5016(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_28;
		@Pc(16) Class87 local16;
		synchronized (this.aClass94_28) {
			local16 = (Class87) this.aClass94_28.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class223 local34 = this.aClass223_64;
		@Pc(43) byte[] local43;
		synchronized (this.aClass223_64) {
			local43 = this.aClass223_64.method5954(arg0, 1);
		}
		local16 = new Class87();
		if (local43 != null) {
			local16.method2697(new Class6_Sub8(local43));
		}
		@Pc(65) Class94 local65 = this.aClass94_28;
		synchronized (this.aClass94_28) {
			this.aClass94_28.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
	public void method5018() {
		@Pc(2) Class94 local2 = this.aClass94_28;
		synchronized (this.aClass94_28) {
			this.aClass94_28.method2958(5);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public void method5019() {
		@Pc(2) Class94 local2 = this.aClass94_28;
		synchronized (this.aClass94_28) {
			this.aClass94_28.method2952();
		}
	}
}
