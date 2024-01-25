import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class309 {

	@OriginalMember(owner = "client!sha", name = "u", descriptor = "I")
	public int anInt9139;

	@OriginalMember(owner = "client!sha", name = "n", descriptor = "Lclient!fc;")
	private final Class94 aClass94_48 = new Class94(64);

	@OriginalMember(owner = "client!sha", name = "s", descriptor = "Lclient!fc;")
	public final Class94 aClass94_49 = new Class94(50);

	@OriginalMember(owner = "client!sha", name = "t", descriptor = "Lclient!fc;")
	public final Class94 aClass94_50 = new Class94(5);

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "Lclient!ni;")
	private final Class223 aClass223_118;

	@OriginalMember(owner = "client!sha", name = "o", descriptor = "Lclient!ni;")
	public final Class223 aClass223_119;

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "Lclient!rga;")
	public final Class290 aClass290_36;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!rga;IZLclient!ni;Lclient!ni;)V")
	public Class309(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class223 arg4) {
		this.aClass223_118 = arg3;
		this.aClass223_119 = arg4;
		this.aBoolean735 = arg2;
		this.aClass290_36 = arg0;
		if (this.aClass223_118 != null) {
			@Pc(41) int local41 = this.aClass223_118.method5961() - 1;
			this.aClass223_118.method5970(local41);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
	public void method7449() {
		@Pc(2) Class94 local2 = this.aClass94_49;
		synchronized (this.aClass94_49) {
			this.aClass94_49.method2952();
		}
		local2 = this.aClass94_50;
		synchronized (this.aClass94_50) {
			this.aClass94_50.method2952();
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V")
	public void method7450() {
		@Pc(6) Class94 local6 = this.aClass94_48;
		synchronized (this.aClass94_48) {
			this.aClass94_48.method2964();
		}
		local6 = this.aClass94_49;
		synchronized (this.aClass94_49) {
			this.aClass94_49.method2964();
		}
		local6 = this.aClass94_50;
		synchronized (this.aClass94_50) {
			this.aClass94_50.method2964();
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)Lclient!jl;")
	public Class158 method7453(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_48;
		@Pc(21) Class158 local21;
		synchronized (this.aClass94_48) {
			local21 = (Class158) this.aClass94_48.method2960((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class223 local34 = this.aClass223_118;
		@Pc(49) byte[] local49;
		synchronized (this.aClass223_118) {
			local49 = this.aClass223_118.method5954(Static303.method5140(arg0), Static483.method7127(arg0));
		}
		local21 = new Class158();
		local21.anInt5817 = arg0;
		local21.aClass309_2 = this;
		if (local49 != null) {
			local21.method4864(new Class6_Sub8(local49));
		}
		local21.method4862();
		@Pc(80) Class94 local80 = this.aClass94_48;
		synchronized (this.aClass94_48) {
			this.aClass94_48.method2963((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IB)V")
	public void method7454() {
		@Pc(6) Class94 local6 = this.aClass94_48;
		synchronized (this.aClass94_48) {
			this.aClass94_48.method2958(5);
		}
		local6 = this.aClass94_49;
		synchronized (this.aClass94_49) {
			this.aClass94_49.method2958(5);
		}
		local6 = this.aClass94_50;
		synchronized (this.aClass94_50) {
			this.aClass94_50.method2958(5);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZI)V")
	public void method7456(@OriginalArg(1) int arg0) {
		this.anInt9139 = arg0;
		@Pc(9) Class94 local9 = this.aClass94_49;
		synchronized (this.aClass94_49) {
			this.aClass94_49.method2952();
		}
		local9 = this.aClass94_50;
		synchronized (this.aClass94_50) {
			this.aClass94_50.method2952();
		}
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(B)V")
	public void method7459() {
		@Pc(10) Class94 local10 = this.aClass94_48;
		synchronized (this.aClass94_48) {
			this.aClass94_48.method2952();
		}
		local10 = this.aClass94_49;
		synchronized (this.aClass94_49) {
			this.aClass94_49.method2952();
		}
		local10 = this.aClass94_50;
		synchronized (this.aClass94_50) {
			this.aClass94_50.method2952();
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)V")
	public void method7460(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean735) {
			this.aBoolean735 = arg0;
			this.method7459();
		}
	}
}
