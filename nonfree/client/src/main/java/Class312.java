import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class312 {

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	public int anInt9193;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "Lclient!fc;")
	private final Class94 aClass94_55 = new Class94(64);

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Lclient!fc;")
	public final Class94 aClass94_56 = new Class94(60);

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!ni;")
	public final Class223 aClass223_123;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Lclient!ni;")
	private final Class223 aClass223_122;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;Lclient!ni;)V")
	public Class312(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_123 = arg3;
		this.aClass223_122 = arg2;
		@Pc(26) int local26 = this.aClass223_122.method5961() - 1;
		this.aClass223_122.method5970(local26);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public void method7487() {
		@Pc(6) Class94 local6 = this.aClass94_55;
		synchronized (this.aClass94_55) {
			this.aClass94_55.method2964();
		}
		local6 = this.aClass94_56;
		synchronized (this.aClass94_56) {
			this.aClass94_56.method2964();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
	public void method7488(@OriginalArg(0) int arg0) {
		this.anInt9193 = arg0;
		@Pc(9) Class94 local9 = this.aClass94_56;
		synchronized (this.aClass94_56) {
			this.aClass94_56.method2952();
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Lclient!gp;")
	public Class124 method7492(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_55;
		@Pc(16) Class124 local16;
		synchronized (this.aClass94_55) {
			local16 = (Class124) this.aClass94_55.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class223 local29 = this.aClass223_122;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_122) {
			local44 = this.aClass223_122.method5954(Static544.method7673(arg0), Static564.method7938(arg0));
		}
		local16 = new Class124();
		local16.aClass312_1 = this;
		local16.anInt4169 = arg0;
		if (local44 != null) {
			local16.method3526(new Class6_Sub8(local44));
		}
		@Pc(80) Class94 local80 = this.aClass94_55;
		synchronized (this.aClass94_55) {
			this.aClass94_55.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public void method7493() {
		@Pc(2) Class94 local2 = this.aClass94_55;
		synchronized (this.aClass94_55) {
			this.aClass94_55.method2952();
		}
		local2 = this.aClass94_56;
		synchronized (this.aClass94_56) {
			this.aClass94_56.method2952();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)V")
	public void method7494() {
		@Pc(6) Class94 local6 = this.aClass94_55;
		synchronized (this.aClass94_55) {
			this.aClass94_55.method2958(5);
		}
		local6 = this.aClass94_56;
		synchronized (this.aClass94_56) {
			this.aClass94_56.method2958(5);
		}
	}
}
