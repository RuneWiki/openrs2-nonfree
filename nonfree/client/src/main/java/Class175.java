import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class175 {

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!mq;")
	private final Class154 aClass154_34 = new Class154(64);

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!mq;")
	private final Class154 aClass154_35 = new Class154(100);

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!fc;")
	private final Class71 aClass71_64;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;Lclient!fc;Lclient!fc;)V")
	public Class175(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class71 arg3, @OriginalArg(4) Class71 arg4) {
		this.aClass71_64 = arg2;
		if (this.aClass71_64 != null) {
			@Pc(26) int local26 = this.aClass71_64.method1553() - 1;
			this.aClass71_64.method1580(local26);
		}
		Static347.method5294(arg4, arg3);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public void method4105() {
		@Pc(6) Class154 local6 = this.aClass154_34;
		synchronized (this.aClass154_34) {
			this.aClass154_34.method3746();
		}
		local6 = this.aClass154_35;
		synchronized (this.aClass154_35) {
			this.aClass154_35.method3746();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lclient!aa;")
	public Class2_Sub1_Sub1 method4106(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_35;
		@Pc(16) Class2_Sub1_Sub1 local16;
		synchronized (this.aClass154_35) {
			local16 = (Class2_Sub1_Sub1) this.aClass154_35.method3751((long) arg0);
			if (local16 == null) {
				local16 = new Class2_Sub1_Sub1(arg0);
				this.aClass154_35.method3745((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method28() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)Lclient!qg;")
	public Class189 method4107(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_34;
		@Pc(16) Class189 local16;
		synchronized (this.aClass154_34) {
			local16 = (Class189) this.aClass154_34.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass71_64.method1555(Static110.method2123(arg0), Static347.method5301(arg0));
		local16 = new Class189();
		local16.aClass175_4 = this;
		local16.anInt5152 = arg0;
		if (local37 != null) {
			local16.method4435(new Class2_Sub13(local37));
		}
		local16.method4432();
		@Pc(68) Class154 local68 = this.aClass154_34;
		synchronized (this.aClass154_34) {
			this.aClass154_34.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public void method4111() {
		@Pc(2) Class154 local2 = this.aClass154_34;
		synchronized (this.aClass154_34) {
			this.aClass154_34.method3748();
		}
		local2 = this.aClass154_35;
		synchronized (this.aClass154_35) {
			this.aClass154_35.method3748();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	public void method4112() {
		@Pc(6) Class154 local6 = this.aClass154_34;
		synchronized (this.aClass154_34) {
			this.aClass154_34.method3758(5);
		}
		local6 = this.aClass154_35;
		synchronized (this.aClass154_35) {
			this.aClass154_35.method3758(5);
		}
	}
}
