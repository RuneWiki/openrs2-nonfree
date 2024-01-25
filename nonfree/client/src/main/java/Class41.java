import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class41 {

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	public int anInt1107;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_3 = new Class288(64);

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_4 = new Class288(30);

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!gp;")
	public final Class117 aClass117_24;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "Lclient!gp;")
	private final Class117 aClass117_23;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;Lclient!gp;)V")
	public Class41(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class117 arg3) {
		this.aClass117_24 = arg3;
		this.aClass117_23 = arg2;
		@Pc(26) int local26 = this.aClass117_23.method2972() - 1;
		this.aClass117_23.method2951(local26);
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	public void method1065() {
		@Pc(6) Class288 local6 = this.aClass288_3;
		synchronized (this.aClass288_3) {
			this.aClass288_3.method6744();
		}
		local6 = this.aClass288_4;
		synchronized (this.aClass288_4) {
			this.aClass288_4.method6744();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZI)V")
	public void method1066() {
		@Pc(13) Class288 local13 = this.aClass288_3;
		synchronized (this.aClass288_3) {
			this.aClass288_3.method6735(5);
		}
		local13 = this.aClass288_4;
		synchronized (this.aClass288_4) {
			this.aClass288_4.method6735(5);
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
	public void method1067() {
		@Pc(6) Class288 local6 = this.aClass288_3;
		synchronized (this.aClass288_3) {
			this.aClass288_3.method6742();
		}
		local6 = this.aClass288_4;
		synchronized (this.aClass288_4) {
			this.aClass288_4.method6742();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Lclient!cf;")
	public Class48 method1068(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_3;
		@Pc(16) Class48 local16;
		synchronized (this.aClass288_3) {
			local16 = (Class48) this.aClass288_3.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_23;
		@Pc(42) byte[] local42;
		synchronized (this.aClass117_23) {
			local42 = this.aClass117_23.method2962(Static204.method3343(arg0), Static433.method6184(arg0));
		}
		local16 = new Class48();
		local16.anInt1222 = arg0;
		local16.aClass41_1 = this;
		if (local42 != null) {
			local16.method1169(new Class5_Sub3(local42));
		}
		@Pc(76) Class288 local76 = this.aClass288_3;
		synchronized (this.aClass288_3) {
			this.aClass288_3.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)V")
	public void method1069(@OriginalArg(0) int arg0) {
		this.anInt1107 = arg0;
		@Pc(9) Class288 local9 = this.aClass288_4;
		synchronized (this.aClass288_4) {
			this.aClass288_4.method6744();
		}
	}
}
