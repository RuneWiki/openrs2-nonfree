import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class62 {

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	public int anInt2419;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!jr;")
	private final Class169 aClass169_11 = new Class169(64);

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!jr;")
	public final Class169 aClass169_12 = new Class169(60);

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!in;")
	public final Class157 aClass157_50;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!in;")
	private final Class157 aClass157_49;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;Lclient!in;)V")
	public Class62(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3) {
		this.aClass157_50 = arg3;
		this.aClass157_49 = arg2;
		@Pc(26) int local26 = this.aClass157_49.method4568() - 1;
		this.aClass157_49.method4561(local26);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public void method2248(@OriginalArg(1) int arg0) {
		this.anInt2419 = arg0;
		@Pc(9) Class169 local9 = this.aClass169_12;
		synchronized (this.aClass169_12) {
			this.aClass169_12.method5009();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method2249() {
		@Pc(2) Class169 local2 = this.aClass169_11;
		synchronized (this.aClass169_11) {
			this.aClass169_11.method5006();
		}
		local2 = this.aClass169_12;
		synchronized (this.aClass169_12) {
			this.aClass169_12.method5006();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Lclient!fk;")
	public Class109 method2250(@OriginalArg(1) int arg0) {
		@Pc(12) Class169 local12 = this.aClass169_11;
		@Pc(22) Class109 local22;
		synchronized (this.aClass169_11) {
			local22 = (Class109) this.aClass169_11.method5002((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class157 local35 = this.aClass157_49;
		@Pc(48) byte[] local48;
		synchronized (this.aClass157_49) {
			local48 = this.aClass157_49.method4564(Static105.method2756(arg0), Static98.method2589(arg0));
		}
		local22 = new Class109();
		local22.aClass62_1 = this;
		local22.anInt3970 = arg0;
		if (local48 != null) {
			local22.method3482(new Class2_Sub11(local48));
		}
		@Pc(76) Class169 local76 = this.aClass169_11;
		synchronized (this.aClass169_11) {
			this.aClass169_11.method5001(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
	public void method2251() {
		@Pc(2) Class169 local2 = this.aClass169_11;
		synchronized (this.aClass169_11) {
			this.aClass169_11.method4997(5);
		}
		local2 = this.aClass169_12;
		synchronized (this.aClass169_12) {
			this.aClass169_12.method4997(5);
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public void method2253() {
		@Pc(6) Class169 local6 = this.aClass169_11;
		synchronized (this.aClass169_11) {
			this.aClass169_11.method5009();
		}
		local6 = this.aClass169_12;
		synchronized (this.aClass169_12) {
			this.aClass169_12.method5009();
		}
	}
}
