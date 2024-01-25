import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class141 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!mf;")
	private final Class222 aClass222_21 = new Class222(64);

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "Lclient!mf;")
	public final Class222 aClass222_22 = new Class222(2);

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "Lclient!pu;")
	private final Class270 aClass270_42;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Lclient!pu;")
	public final Class270 aClass270_41;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;Lclient!pu;)V")
	public Class141(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class270 arg3) {
		this.aClass270_42 = arg2;
		this.aClass270_41 = arg3;
		this.aClass270_42.method5685(33);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lclient!bg;")
	public Class30 method2983(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_21;
		@Pc(16) Class30 local16;
		synchronized (this.aClass222_21) {
			local16 = (Class30) this.aClass222_21.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_42;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_42) {
			local38 = this.aClass270_42.method5704(33, arg0);
		}
		local16 = new Class30();
		local16.aClass141_1 = this;
		if (local38 != null) {
			local16.method478(new Class1_Sub35(local38));
		}
		@Pc(63) Class222 local63 = this.aClass222_21;
		synchronized (this.aClass222_21) {
			this.aClass222_21.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	public void method2985() {
		@Pc(12) Class222 local12 = this.aClass222_21;
		synchronized (this.aClass222_21) {
			this.aClass222_21.method4422();
		}
		local12 = this.aClass222_22;
		synchronized (this.aClass222_22) {
			this.aClass222_22.method4422();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public void method2986() {
		@Pc(6) Class222 local6 = this.aClass222_21;
		synchronized (this.aClass222_21) {
			this.aClass222_21.method4428();
		}
		local6 = this.aClass222_22;
		synchronized (this.aClass222_22) {
			this.aClass222_22.method4428();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)V")
	public void method2988() {
		@Pc(2) Class222 local2 = this.aClass222_21;
		synchronized (this.aClass222_21) {
			this.aClass222_21.method4433(5);
		}
		local2 = this.aClass222_22;
		synchronized (this.aClass222_22) {
			this.aClass222_22.method4433(5);
		}
	}
}
