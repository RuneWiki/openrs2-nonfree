import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class46 {

	@OriginalMember(owner = "client!cfa", name = "l", descriptor = "Lclient!fc;")
	private final Class94 aClass94_11 = new Class94(64);

	@OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
	public int anInt2310 = 0;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_30;

	@OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
	public final int anInt2307;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class46(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_30 = arg2;
		this.anInt2307 = this.aClass223_30.method5970(4);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)V")
	public void method2003() {
		@Pc(6) Class94 local6 = this.aClass94_11;
		synchronized (this.aClass94_11) {
			this.aClass94_11.method2958(5);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)V")
	public void method2005() {
		@Pc(6) Class94 local6 = this.aClass94_11;
		synchronized (this.aClass94_11) {
			this.aClass94_11.method2964();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)Lclient!nba;")
	public Class215 method2007(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_11;
		@Pc(16) Class215 local16;
		synchronized (this.aClass94_11) {
			local16 = (Class215) this.aClass94_11.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class223 local29 = this.aClass223_30;
		@Pc(38) byte[] local38;
		synchronized (this.aClass223_30) {
			local38 = this.aClass223_30.method5954(arg0, 4);
		}
		local16 = new Class215();
		local16.anInt7039 = arg0;
		local16.aClass46_3 = this;
		if (local38 != null) {
			local16.method5878(new Class6_Sub8(local38));
		}
		local16.method5881();
		@Pc(71) Class94 local71 = this.aClass94_11;
		synchronized (this.aClass94_11) {
			this.aClass94_11.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V")
	public void method2009() {
		@Pc(6) Class94 local6 = this.aClass94_11;
		synchronized (this.aClass94_11) {
			this.aClass94_11.method2952();
		}
	}
}
