import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class18 {

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!lga;")
	private final Class207 aClass207_1 = new Class207(64);

	@OriginalMember(owner = "client!av", name = "l", descriptor = "Lclient!lga;")
	public final Class207 aClass207_2 = new Class207(2);

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Lclient!sea;")
	private final Class308 aClass308_10;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Lclient!sea;")
	public final Class308 aClass308_9;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;Lclient!sea;)V")
	public Class18(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Class308 arg3) {
		this.aClass308_10 = arg2;
		this.aClass308_9 = arg3;
		this.aClass308_10.method6568(33);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)V")
	public void method492() {
		@Pc(2) Class207 local2 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4397(5);
		}
		local2 = this.aClass207_2;
		synchronized (this.aClass207_2) {
			this.aClass207_2.method4397(5);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public void method493() {
		@Pc(6) Class207 local6 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4398();
		}
		local6 = this.aClass207_2;
		synchronized (this.aClass207_2) {
			this.aClass207_2.method4398();
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
	public void method494() {
		@Pc(2) Class207 local2 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4392();
		}
		local2 = this.aClass207_2;
		synchronized (this.aClass207_2) {
			this.aClass207_2.method4392();
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(IB)Lclient!hq;")
	public Class143 method495(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_1;
		@Pc(16) Class143 local16;
		synchronized (this.aClass207_1) {
			local16 = (Class143) this.aClass207_1.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_10;
		@Pc(47) byte[] local47;
		synchronized (this.aClass308_10) {
			local47 = this.aClass308_10.method6569(33, arg0);
		}
		local16 = new Class143();
		local16.aClass18_1 = this;
		if (local47 != null) {
			local16.method3093(new Class1_Sub3(local47));
		}
		@Pc(72) Class207 local72 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4391((long) arg0, local16);
			return local16;
		}
	}
}
