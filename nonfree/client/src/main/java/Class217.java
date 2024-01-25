import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class217 {

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Lclient!dc;")
	private final Class44 aClass44_46 = new Class44(64);

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "Lclient!dc;")
	private final Class44 aClass44_47 = new Class44(100);

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Lclient!he;")
	private final Class100 aClass100_70;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;Lclient!he;Lclient!he;)V")
	public Class217(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4) {
		this.aClass100_70 = arg2;
		if (this.aClass100_70 != null) {
			@Pc(26) int local26 = this.aClass100_70.method2516() - 1;
			this.aClass100_70.method2523(local26);
		}
		Static66.method1374(arg3, arg4);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public void method5226() {
		@Pc(6) Class44 local6 = this.aClass44_46;
		synchronized (this.aClass44_46) {
			this.aClass44_46.method1348();
		}
		local6 = this.aClass44_47;
		synchronized (this.aClass44_47) {
			this.aClass44_47.method1348();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BI)V")
	public void method5229() {
		@Pc(2) Class44 local2 = this.aClass44_46;
		synchronized (this.aClass44_46) {
			this.aClass44_46.method1352(5);
		}
		local2 = this.aClass44_47;
		synchronized (this.aClass44_47) {
			this.aClass44_47.method1352(5);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)Lclient!jl;")
	public Class131 method5234(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_46;
		@Pc(18) Class131 local18;
		synchronized (this.aClass44_46) {
			local18 = (Class131) this.aClass44_46.method1353((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(46) byte[] local46 = this.aClass100_70.method2520(Static206.method3173(arg0), Static134.method2370(arg0));
		local18 = new Class131();
		local18.aClass217_2 = this;
		local18.anInt3694 = arg0;
		if (local46 != null) {
			local18.method3045(new Class6_Sub1(local46));
		}
		local18.method3044();
		@Pc(71) Class44 local71 = this.aClass44_46;
		synchronized (this.aClass44_46) {
			this.aClass44_46.method1349(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(II)Lclient!kt;")
	public Class6_Sub2_Sub8 method5235(@OriginalArg(1) int arg0) {
		@Pc(11) Class44 local11 = this.aClass44_47;
		@Pc(21) Class6_Sub2_Sub8 local21;
		synchronized (this.aClass44_47) {
			local21 = (Class6_Sub2_Sub8) this.aClass44_47.method1353((long) arg0);
			if (local21 == null) {
				local21 = new Class6_Sub2_Sub8(arg0);
				this.aClass44_47.method1349(local21, (long) arg0);
			}
		}
		synchronized (local21) {
			return local21.method3328() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public void method5236() {
		@Pc(9) Class44 local9 = this.aClass44_46;
		synchronized (this.aClass44_46) {
			this.aClass44_46.method1351();
		}
		local9 = this.aClass44_47;
		synchronized (this.aClass44_47) {
			this.aClass44_47.method1351();
		}
	}
}
