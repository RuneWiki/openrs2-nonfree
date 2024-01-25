import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class45 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Lclient!lh;")
	private final Class151 aClass151_29 = new Class151(64);

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!lh;")
	private final Class151 aClass151_30 = new Class151(100);

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!hh;")
	private final Class109 aClass109_21;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;Lclient!hh;Lclient!hh;)V")
	public Class45(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) Class109 arg4) {
		this.aClass109_21 = arg2;
		if (this.aClass109_21 != null) {
			@Pc(26) int local26 = this.aClass109_21.method2324() - 1;
			this.aClass109_21.method2322(local26);
		}
		Static413.method5598(arg4, arg3);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)Lclient!ul;")
	public Class1_Sub1_Sub16 method689(@OriginalArg(1) int arg0) {
		@Pc(12) Class151 local12 = this.aClass151_30;
		@Pc(22) Class1_Sub1_Sub16 local22;
		synchronized (this.aClass151_30) {
			local22 = (Class1_Sub1_Sub16) this.aClass151_30.method3288((long) arg0);
			if (local22 == null) {
				local22 = new Class1_Sub1_Sub16(arg0);
				this.aClass151_30.method3291((long) arg0, local22);
			}
		}
		synchronized (local22) {
			return local22.method5528() ? local22 : null;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Lclient!dn;")
	public Class58 method690(@OriginalArg(1) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_29;
		@Pc(16) Class58 local16;
		synchronized (this.aClass151_29) {
			local16 = (Class58) this.aClass151_29.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass109_21.method2349(Static372.method5281(arg0), Static453.method2831(arg0));
		local16 = new Class58();
		local16.aClass45_1 = this;
		local16.anInt1435 = arg0;
		if (local45 != null) {
			local16.method1132(new Class1_Sub14(local45));
		}
		local16.method1131();
		@Pc(70) Class151 local70 = this.aClass151_29;
		synchronized (this.aClass151_29) {
			this.aClass151_29.method3291((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public void method693() {
		@Pc(6) Class151 local6 = this.aClass151_29;
		synchronized (this.aClass151_29) {
			this.aClass151_29.method3299();
		}
		local6 = this.aClass151_30;
		synchronized (this.aClass151_30) {
			this.aClass151_30.method3299();
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	public void method695() {
		@Pc(2) Class151 local2 = this.aClass151_29;
		synchronized (this.aClass151_29) {
			this.aClass151_29.method3298();
		}
		local2 = this.aClass151_30;
		synchronized (this.aClass151_30) {
			this.aClass151_30.method3298();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(BI)V")
	public void method696() {
		@Pc(2) Class151 local2 = this.aClass151_29;
		synchronized (this.aClass151_29) {
			this.aClass151_29.method3297(5);
		}
		local2 = this.aClass151_30;
		synchronized (this.aClass151_30) {
			this.aClass151_30.method3297(5);
		}
	}
}
