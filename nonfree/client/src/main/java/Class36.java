import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class36 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!kh;")
	private Class134 aClass134_6 = new Class134(64);

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!ul;")
	private final Class246 aClass246_35;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class36(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_35 = arg2;
		if (this.aClass246_35 != null) {
			@Pc(20) int local20 = this.aClass246_35.method5502() - 1;
			this.aClass246_35.method5492(local20);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public void method873() {
		@Pc(2) Class134 local2 = this.aClass134_6;
		synchronized (this.aClass134_6) {
			this.aClass134_6.method3272();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public void method874(@OriginalArg(0) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_6;
		synchronized (this.aClass134_6) {
			this.aClass134_6.method3272();
			this.aClass134_6 = new Class134(arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lclient!nh;")
	public Class172 method875(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_6;
		@Pc(16) Class172 local16;
		synchronized (this.aClass134_6) {
			local16 = (Class172) this.aClass134_6.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_35;
		@Pc(42) byte[] local42;
		synchronized (this.aClass246_35) {
			local42 = this.aClass246_35.method5477(Static110.method1979(arg0), Static183.method2897(arg0));
		}
		local16 = new Class172();
		if (local42 != null) {
			local16.method3891(new Class1_Sub5(local42));
		}
		@Pc(64) Class134 local64 = this.aClass134_6;
		synchronized (this.aClass134_6) {
			this.aClass134_6.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)V")
	public void method876() {
		@Pc(6) Class134 local6 = this.aClass134_6;
		synchronized (this.aClass134_6) {
			this.aClass134_6.method3270(5);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public void method877() {
		@Pc(12) Class134 local12 = this.aClass134_6;
		synchronized (this.aClass134_6) {
			this.aClass134_6.method3267();
		}
	}
}
