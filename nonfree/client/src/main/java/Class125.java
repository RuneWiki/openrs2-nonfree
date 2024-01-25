import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class125 {

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Lclient!jk;")
	private final Class137 aClass137_31 = new Class137(64);

	@OriginalMember(owner = "client!in", name = "m", descriptor = "Lclient!jk;")
	private final Class137 aClass137_32 = new Class137(100);

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!qn;")
	private final Class211 aClass211_45;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;Lclient!qn;Lclient!qn;)V")
	public Class125(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3, @OriginalArg(4) Class211 arg4) {
		this.aClass211_45 = arg2;
		if (this.aClass211_45 != null) {
			@Pc(26) int local26 = this.aClass211_45.method4368() - 1;
			this.aClass211_45.method4365(local26);
		}
		Static233.method3174(arg3, arg4);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)Lclient!cm;")
	public Class4_Sub2_Sub6 method2383(@OriginalArg(0) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_32;
		@Pc(18) Class4_Sub2_Sub6 local18;
		synchronized (this.aClass137_32) {
			local18 = (Class4_Sub2_Sub6) this.aClass137_32.method2744((long) arg0);
			if (local18 == null) {
				local18 = new Class4_Sub2_Sub6(arg0);
				this.aClass137_32.method2732((long) arg0, local18);
			}
		}
		synchronized (local18) {
			return local18.method784() ? local18 : null;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public void method2384() {
		@Pc(6) Class137 local6 = this.aClass137_31;
		synchronized (this.aClass137_31) {
			this.aClass137_31.method2737();
		}
		local6 = this.aClass137_32;
		synchronized (this.aClass137_32) {
			this.aClass137_32.method2737();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	public void method2385() {
		@Pc(6) Class137 local6 = this.aClass137_31;
		synchronized (this.aClass137_31) {
			this.aClass137_31.method2739();
		}
		local6 = this.aClass137_32;
		synchronized (this.aClass137_32) {
			this.aClass137_32.method2739();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)V")
	public void method2388() {
		@Pc(6) Class137 local6 = this.aClass137_31;
		synchronized (this.aClass137_31) {
			this.aClass137_31.method2745(5);
		}
		local6 = this.aClass137_32;
		synchronized (this.aClass137_32) {
			this.aClass137_32.method2745(5);
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(II)Lclient!id;")
	public Class119 method2389(@OriginalArg(0) int arg0) {
		@Pc(12) Class137 local12 = this.aClass137_31;
		@Pc(22) Class119 local22;
		synchronized (this.aClass137_31) {
			local22 = (Class119) this.aClass137_31.method2744((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class211 local35 = this.aClass211_45;
		@Pc(52) byte[] local52;
		synchronized (this.aClass211_45) {
			local52 = this.aClass211_45.method4377(Static104.method1553(arg0), Static68.method1157(arg0));
		}
		local22 = new Class119();
		local22.anInt2993 = arg0;
		local22.aClass125_1 = this;
		if (local52 != null) {
			local22.method2291(new Class4_Sub9(local52));
		}
		local22.method2296();
		@Pc(83) Class137 local83 = this.aClass137_31;
		synchronized (this.aClass137_31) {
			this.aClass137_31.method2732((long) arg0, local22);
			return local22;
		}
	}
}
