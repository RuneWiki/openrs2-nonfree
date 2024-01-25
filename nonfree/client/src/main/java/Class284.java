import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class284 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Lclient!jr;")
	private Class169 aClass169_50 = new Class169(64);

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!in;")
	private final Class157 aClass157_234;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class284(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_234 = arg2;
		if (this.aClass157_234 != null) {
			@Pc(20) int local20 = this.aClass157_234.method4568() - 1;
			this.aClass157_234.method4561(local20);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)V")
	public void method7407() {
		@Pc(6) Class169 local6 = this.aClass169_50;
		synchronized (this.aClass169_50) {
			this.aClass169_50.method4997(5);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method7408() {
		@Pc(14) Class169 local14 = this.aClass169_50;
		synchronized (this.aClass169_50) {
			this.aClass169_50.method5006();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	public void method7409(@OriginalArg(0) int arg0) {
		@Pc(14) Class169 local14 = this.aClass169_50;
		synchronized (this.aClass169_50) {
			this.aClass169_50.method5009();
			this.aClass169_50 = new Class169(arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	public void method7410() {
		@Pc(10) Class169 local10 = this.aClass169_50;
		synchronized (this.aClass169_50) {
			this.aClass169_50.method5009();
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)Lclient!bia;")
	public Class35 method7411(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_50;
		@Pc(16) Class35 local16;
		synchronized (this.aClass169_50) {
			local16 = (Class35) this.aClass169_50.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_234;
		@Pc(44) byte[] local44;
		synchronized (this.aClass157_234) {
			local44 = this.aClass157_234.method4564(Static51.method1761(arg0), Static243.method4513(arg0));
		}
		local16 = new Class35();
		if (local44 != null) {
			local16.method1644(new Class2_Sub11(local44));
		}
		@Pc(73) Class169 local73 = this.aClass169_50;
		synchronized (this.aClass169_50) {
			this.aClass169_50.method5001(local16, (long) arg0);
			return local16;
		}
	}
}
