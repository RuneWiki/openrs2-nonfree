import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class311 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "Lclient!uf;")
	private final Class326 aClass326_50 = new Class326(64);

	@OriginalMember(owner = "client!tfa", name = "l", descriptor = "Lclient!uf;")
	private final Class326 aClass326_51 = new Class326(100);

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lclient!ga;")
	private final Class111 aClass111_113;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;Lclient!ga;Lclient!ga;)V")
	public Class311(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Class111 arg3, @OriginalArg(4) Class111 arg4) {
		this.aClass111_113 = arg2;
		if (this.aClass111_113 != null) {
			@Pc(26) int local26 = this.aClass111_113.method2436() - 1;
			this.aClass111_113.method2442(local26);
		}
		Static235.method3830(arg4, arg3);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Lclient!nt;")
	public Class1_Sub3_Sub13 method7006(@OriginalArg(1) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_51;
		synchronized (this.aClass326_51) {
			@Pc(24) Class1_Sub3_Sub13 local24 = (Class1_Sub3_Sub13) this.aClass326_51.method7238((long) arg0);
			if (local24 == null) {
				local24 = new Class1_Sub3_Sub13(arg0);
				this.aClass326_51.method7236(local24, (long) arg0);
			}
			return local24.method5308() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
	public void method7008() {
		@Pc(2) Class326 local2 = this.aClass326_50;
		synchronized (this.aClass326_50) {
			this.aClass326_50.method7241(5);
		}
		local2 = this.aClass326_51;
		synchronized (this.aClass326_51) {
			this.aClass326_51.method7241(5);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(II)Lclient!hca;")
	public Class131 method7009(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_50;
		@Pc(16) Class131 local16;
		synchronized (this.aClass326_50) {
			local16 = (Class131) this.aClass326_50.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_113;
		@Pc(42) byte[] local42;
		synchronized (this.aClass111_113) {
			local42 = this.aClass111_113.method2441(Static411.method5777(arg0), Static443.method6347(arg0));
		}
		local16 = new Class131();
		local16.anInt3737 = arg0;
		local16.aClass311_1 = this;
		if (local42 != null) {
			local16.method3242(new Class1_Sub20(local42));
		}
		local16.method3234();
		@Pc(81) Class326 local81 = this.aClass326_50;
		synchronized (this.aClass326_50) {
			this.aClass326_50.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V")
	public void method7010() {
		@Pc(2) Class326 local2 = this.aClass326_50;
		synchronized (this.aClass326_50) {
			this.aClass326_50.method7234();
		}
		local2 = this.aClass326_51;
		synchronized (this.aClass326_51) {
			this.aClass326_51.method7234();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
	public void method7011() {
		@Pc(6) Class326 local6 = this.aClass326_50;
		synchronized (this.aClass326_50) {
			this.aClass326_50.method7230();
		}
		local6 = this.aClass326_51;
		synchronized (this.aClass326_51) {
			this.aClass326_51.method7230();
		}
	}
}
