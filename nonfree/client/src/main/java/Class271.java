import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class271 {

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "Lclient!vh;")
	private final Class330 aClass330_54 = new Class330(64);

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "Lclient!pj;")
	private final Class248 aClass248_82;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class271(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_82 = arg2;
		this.aClass248_82.method5793(31);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
	public void method6189() {
		@Pc(11) Class330 local11 = this.aClass330_54;
		synchronized (this.aClass330_54) {
			this.aClass330_54.method7688();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)V")
	public void method6190() {
		@Pc(12) Class330 local12 = this.aClass330_54;
		synchronized (this.aClass330_54) {
			this.aClass330_54.method7680(5);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	public void method6191() {
		@Pc(2) Class330 local2 = this.aClass330_54;
		synchronized (this.aClass330_54) {
			this.aClass330_54.method7678();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZ)Lclient!cw;")
	public Class64 method6193(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_54;
		@Pc(16) Class64 local16;
		synchronized (this.aClass330_54) {
			local16 = (Class64) this.aClass330_54.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_82;
		@Pc(38) byte[] local38;
		synchronized (this.aClass248_82) {
			local38 = this.aClass248_82.method5797(31, arg0);
		}
		local16 = new Class64();
		if (local38 != null) {
			local16.method1183(new Class6_Sub12(local38));
		}
		@Pc(66) Class330 local66 = this.aClass330_54;
		synchronized (this.aClass330_54) {
			this.aClass330_54.method7676(local16, (long) arg0);
			return local16;
		}
	}
}
