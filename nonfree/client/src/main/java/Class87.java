import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class87 {

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Lclient!ad;")
	private Class6 aClass6_11 = new Class6(64);

	@OriginalMember(owner = "client!el", name = "l", descriptor = "Lclient!ad;")
	public Class6 aClass6_12 = new Class6(64);

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Lclient!tf;")
	public final Class322 aClass322_49;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Lclient!tf;")
	private final Class322 aClass322_48;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;Lclient!tf;)V")
	public Class87(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Class322 arg3) {
		this.aClass322_49 = arg3;
		this.aClass322_48 = arg2;
		this.aClass322_48.method6831(34);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public void method2535() {
		@Pc(10) Class6 local10 = this.aClass6_11;
		synchronized (this.aClass6_11) {
			this.aClass6_11.method102();
		}
		local10 = this.aClass6_12;
		synchronized (this.aClass6_12) {
			this.aClass6_12.method102();
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!gw;")
	public Class120 method2536(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_11;
		@Pc(16) Class120 local16;
		synchronized (this.aClass6_11) {
			local16 = (Class120) this.aClass6_11.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_48;
		@Pc(44) byte[] local44;
		synchronized (this.aClass322_48) {
			local44 = this.aClass322_48.method6802(34, arg0);
		}
		local16 = new Class120();
		local16.aClass87_2 = this;
		if (local44 != null) {
			local16.method3172(new Class3_Sub11(local44));
		}
		@Pc(69) Class6 local69 = this.aClass6_11;
		synchronized (this.aClass6_11) {
			this.aClass6_11.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public void method2538() {
		@Pc(12) Class6 local12 = this.aClass6_11;
		synchronized (this.aClass6_11) {
			this.aClass6_11.method94();
		}
		local12 = this.aClass6_12;
		synchronized (this.aClass6_12) {
			this.aClass6_12.method94();
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public void method2540() {
		@Pc(6) Class6 local6 = this.aClass6_11;
		synchronized (this.aClass6_11) {
			this.aClass6_11.method97(5);
		}
		local6 = this.aClass6_12;
		synchronized (this.aClass6_12) {
			this.aClass6_12.method97(5);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)V")
	public void method2541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass6_11 = new Class6(arg1);
		this.aClass6_12 = new Class6(arg0);
	}
}
