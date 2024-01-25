import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class68 {

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "I")
	public int anInt2206;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "Lclient!fba;")
	private final Class102 aClass102_12 = new Class102(64);

	@OriginalMember(owner = "client!dea", name = "r", descriptor = "Lclient!fba;")
	public final Class102 aClass102_13 = new Class102(60);

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Lclient!la;")
	public final Class196 aClass196_28;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "Lclient!la;")
	private final Class196 aClass196_29;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;Lclient!la;)V")
	public Class68(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class196 arg3) {
		this.aClass196_28 = arg3;
		this.aClass196_29 = arg2;
		@Pc(26) int local26 = this.aClass196_29.method5125() - 1;
		this.aClass196_29.method5118(local26);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V")
	public void method2080(@OriginalArg(1) int arg0) {
		this.anInt2206 = arg0;
		@Pc(9) Class102 local9 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2681();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IB)V")
	public void method2081() {
		@Pc(2) Class102 local2 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2668(5);
		}
		local2 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2668(5);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
	public void method2082() {
		@Pc(2) Class102 local2 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2680();
		}
		local2 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2680();
		}
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V")
	public void method2085() {
		@Pc(2) Class102 local2 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2681();
		}
		local2 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2681();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)Lclient!hq;")
	public Class145 method2087(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_12;
		@Pc(21) Class145 local21;
		synchronized (this.aClass102_12) {
			local21 = (Class145) this.aClass102_12.method2677((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class196 local34 = this.aClass196_29;
		@Pc(47) byte[] local47;
		synchronized (this.aClass196_29) {
			local47 = this.aClass196_29.method5102(Static603.method8434(arg0), Static109.method2233(arg0));
		}
		local21 = new Class145();
		local21.anInt4233 = arg0;
		local21.aClass68_1 = this;
		if (local47 != null) {
			local21.method3715(new Class3_Sub3(local47));
		}
		@Pc(75) Class102 local75 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2674((long) arg0, local21);
			return local21;
		}
	}
}
