import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class310 {

	@OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
	public int anInt9181;

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "Z")
	public boolean aBoolean736 = false;

	@OriginalMember(owner = "client!sia", name = "q", descriptor = "Lclient!fc;")
	private Class94 aClass94_51 = new Class94(64);

	@OriginalMember(owner = "client!sia", name = "t", descriptor = "Lclient!fc;")
	public final Class94 aClass94_52 = new Class94(500);

	@OriginalMember(owner = "client!sia", name = "w", descriptor = "Lclient!fc;")
	public final Class94 aClass94_53 = new Class94(30);

	@OriginalMember(owner = "client!sia", name = "y", descriptor = "Lclient!fc;")
	public final Class94 aClass94_54 = new Class94(50);

	@OriginalMember(owner = "client!sia", name = "i", descriptor = "Z")
	public boolean aBoolean737;

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_121;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "Lclient!ni;")
	public final Class223 aClass223_120;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!rga;IZLclient!ni;Lclient!ni;)V")
	public Class310(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class223 arg4) {
		this.aBoolean737 = arg2;
		this.aClass223_121 = arg3;
		this.aClass223_120 = arg4;
		if (this.aClass223_121 != null) {
			@Pc(47) int local47 = this.aClass223_121.method5961() - 1;
			this.aClass223_121.method5970(local47);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)Lclient!vha;")
	public Class356 method7474(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_51;
		@Pc(22) Class356 local22;
		synchronized (this.aClass94_51) {
			local22 = (Class356) this.aClass94_51.method2960((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class223 local35 = this.aClass223_121;
		@Pc(48) byte[] local48;
		synchronized (this.aClass223_121) {
			local48 = this.aClass223_121.method5954(Static289.method8764(arg0), Static646.method8795(arg0));
		}
		local22 = new Class356();
		local22.anInt10211 = arg0;
		local22.aClass310_4 = this;
		if (local48 != null) {
			local22.method8320(new Class6_Sub8(local48));
		}
		local22.method8335();
		if (!this.aBoolean737 && local22.aBoolean792) {
			local22.anIntArray546 = null;
			local22.aStringArray38 = null;
		}
		if (local22.aBoolean796) {
			local22.aBoolean797 = false;
			local22.anInt10254 = 0;
		}
		@Pc(100) Class94 local100 = this.aClass94_51;
		synchronized (this.aClass94_51) {
			this.aClass94_51.method2963((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
	public void method7475() {
		@Pc(6) Class94 local6 = this.aClass94_51;
		synchronized (this.aClass94_51) {
			this.aClass94_51.method2964();
		}
		local6 = this.aClass94_52;
		synchronized (this.aClass94_52) {
			this.aClass94_52.method2964();
		}
		local6 = this.aClass94_53;
		synchronized (this.aClass94_53) {
			this.aClass94_53.method2964();
		}
		local6 = this.aClass94_54;
		synchronized (this.aClass94_54) {
			this.aClass94_54.method2964();
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(IB)V")
	public void method7476() {
		@Pc(6) Class94 local6 = this.aClass94_51;
		synchronized (this.aClass94_51) {
			this.aClass94_51.method2958(5);
		}
		local6 = this.aClass94_52;
		synchronized (this.aClass94_52) {
			this.aClass94_52.method2958(5);
		}
		local6 = this.aClass94_53;
		synchronized (this.aClass94_53) {
			this.aClass94_53.method2958(5);
		}
		local6 = this.aClass94_54;
		synchronized (this.aClass94_54) {
			this.aClass94_54.method2958(5);
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)V")
	public void method7477() {
		@Pc(6) Class94 local6 = this.aClass94_51;
		synchronized (this.aClass94_51) {
			this.aClass94_51.method2952();
		}
		local6 = this.aClass94_52;
		synchronized (this.aClass94_52) {
			this.aClass94_52.method2952();
		}
		local6 = this.aClass94_53;
		synchronized (this.aClass94_53) {
			this.aClass94_53.method2952();
		}
		local6 = this.aClass94_54;
		synchronized (this.aClass94_54) {
			this.aClass94_54.method2952();
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)V")
	public void method7478(@OriginalArg(1) int arg0) {
		this.aClass94_51 = new Class94(arg0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V")
	public void method7480(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean736 != arg0) {
			this.aBoolean736 = arg0;
			this.method7477();
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(ZI)V")
	public void method7482(@OriginalArg(1) int arg0) {
		this.anInt9181 = arg0;
		@Pc(9) Class94 local9 = this.aClass94_52;
		synchronized (this.aClass94_52) {
			this.aClass94_52.method2952();
		}
		local9 = this.aClass94_53;
		synchronized (this.aClass94_53) {
			this.aClass94_53.method2952();
		}
		local9 = this.aClass94_54;
		synchronized (this.aClass94_54) {
			this.aClass94_54.method2952();
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BZ)V")
	public void method7483(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean737) {
			this.aBoolean737 = arg0;
			this.method7477();
		}
	}
}
