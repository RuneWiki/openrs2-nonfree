import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class219 {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!d;")
	private final Class44 aClass44_59 = new Class44(64);

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!d;")
	private final Class44 aClass44_60 = new Class44(100);

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!um;")
	private final Class243 aClass243_210;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;Lclient!um;Lclient!um;)V")
	public Class219(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3, @OriginalArg(4) Class243 arg4) {
		this.aClass243_210 = arg2;
		if (this.aClass243_210 != null) {
			@Pc(26) int local26 = this.aClass243_210.method5478() - 1;
			this.aClass243_210.method5472(local26);
		}
		Static376.method5013(arg4, arg3);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public void method4749() {
		@Pc(11) Class44 local11 = this.aClass44_59;
		synchronized (this.aClass44_59) {
			this.aClass44_59.method1031();
		}
		local11 = this.aClass44_60;
		synchronized (this.aClass44_60) {
			this.aClass44_60.method1031();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public void method4750() {
		@Pc(6) Class44 local6 = this.aClass44_59;
		synchronized (this.aClass44_59) {
			this.aClass44_59.method1025(5);
		}
		local6 = this.aClass44_60;
		synchronized (this.aClass44_60) {
			this.aClass44_60.method1025(5);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Lclient!kt;")
	public Class143 method4752(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_59;
		@Pc(16) Class143 local16;
		synchronized (this.aClass44_59) {
			local16 = (Class143) this.aClass44_59.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_210;
		@Pc(44) byte[] local44;
		synchronized (this.aClass243_210) {
			local44 = this.aClass243_210.method5455(Static320.method3948(arg0), Static107.method1477(arg0));
		}
		local16 = new Class143();
		local16.anInt3771 = arg0;
		local16.aClass219_3 = this;
		if (local44 != null) {
			local16.method2996(new Class5_Sub15(local44));
		}
		local16.method2989();
		@Pc(75) Class44 local75 = this.aClass44_59;
		synchronized (this.aClass44_59) {
			this.aClass44_59.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public void method4753() {
		@Pc(6) Class44 local6 = this.aClass44_59;
		synchronized (this.aClass44_59) {
			this.aClass44_59.method1024();
		}
		local6 = this.aClass44_60;
		synchronized (this.aClass44_60) {
			this.aClass44_60.method1024();
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Lclient!go;")
	public Class5_Sub2_Sub6 method4756(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_60;
		@Pc(26) Class5_Sub2_Sub6 local26;
		synchronized (this.aClass44_60) {
			local26 = (Class5_Sub2_Sub6) this.aClass44_60.method1028((long) arg0);
			if (local26 == null) {
				local26 = new Class5_Sub2_Sub6(arg0);
				this.aClass44_60.method1017((long) arg0, local26);
			}
		}
		synchronized (local26) {
			return local26.method2001() ? local26 : null;
		}
	}
}
