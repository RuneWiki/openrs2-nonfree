import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class191 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "Lclient!oo;")
	private final Class264 aClass264_33 = new Class264(64);

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "Lclient!oo;")
	private final Class264 aClass264_34 = new Class264(100);

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "Lclient!wia;")
	private final Class386 aClass386_70;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!wia;Lclient!wia;)V")
	public Class191(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3, @OriginalArg(4) Class386 arg4) {
		this.aClass386_70 = arg2;
		if (this.aClass386_70 != null) {
			@Pc(26) int local26 = this.aClass386_70.method9189() - 1;
			this.aClass386_70.method9210(local26);
		}
		Static444.method6496(arg4, arg3);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)Lclient!ak;")
	public Class14_Sub3_Sub1 method4319(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_34;
		synchronized (this.aClass264_34) {
			@Pc(16) Class14_Sub3_Sub1 local16 = (Class14_Sub3_Sub1) this.aClass264_34.method6367((long) arg0);
			if (local16 == null) {
				local16 = new Class14_Sub3_Sub1(arg0);
				this.aClass264_34.method6364((long) arg0, local16);
			}
			return local16.method215() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
	public void method4320() {
		@Pc(11) Class264 local11 = this.aClass264_33;
		synchronized (this.aClass264_33) {
			this.aClass264_33.method6366(5);
		}
		local11 = this.aClass264_34;
		synchronized (this.aClass264_34) {
			this.aClass264_34.method6366(5);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public void method4321() {
		@Pc(12) Class264 local12 = this.aClass264_33;
		synchronized (this.aClass264_33) {
			this.aClass264_33.method6368();
		}
		local12 = this.aClass264_34;
		synchronized (this.aClass264_34) {
			this.aClass264_34.method6368();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)Lclient!pf;")
	public Class275 method4322(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_33;
		@Pc(24) Class275 local24;
		synchronized (this.aClass264_33) {
			local24 = (Class275) this.aClass264_33.method6367((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class386 local37 = this.aClass386_70;
		@Pc(50) byte[] local50;
		synchronized (this.aClass386_70) {
			local50 = this.aClass386_70.method9196(Static132.method2134(arg0), Static11.method436(arg0));
		}
		local24 = new Class275();
		local24.anInt7928 = arg0;
		local24.aClass191_1 = this;
		if (local50 != null) {
			local24.method6548(new Class14_Sub29(local50));
		}
		local24.method6550();
		@Pc(81) Class264 local81 = this.aClass264_33;
		synchronized (this.aClass264_33) {
			this.aClass264_33.method6364((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	public void method4324() {
		@Pc(12) Class264 local12 = this.aClass264_33;
		synchronized (this.aClass264_33) {
			this.aClass264_33.method6360();
		}
		local12 = this.aClass264_34;
		synchronized (this.aClass264_34) {
			this.aClass264_34.method6360();
		}
	}
}
