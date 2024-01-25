import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class36 {

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!mo;")
	private Class160 aClass160_7 = new Class160(64);

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!nl;")
	private final Class171 aClass171_16;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class36(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_16 = arg2;
		if (this.aClass171_16 != null) {
			@Pc(20) int local20 = this.aClass171_16.method3770() - 1;
			this.aClass171_16.method3750(local20);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	public void method794() {
		@Pc(11) Class160 local11 = this.aClass160_7;
		synchronized (this.aClass160_7) {
			this.aClass160_7.method3595();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method797() {
		@Pc(10) Class160 local10 = this.aClass160_7;
		synchronized (this.aClass160_7) {
			this.aClass160_7.method3605();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public void method798(@OriginalArg(1) int arg0) {
		@Pc(2) Class160 local2 = this.aClass160_7;
		synchronized (this.aClass160_7) {
			this.aClass160_7.method3595();
			this.aClass160_7 = new Class160(arg0);
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Lclient!ma;")
	public Class153 method799(@OriginalArg(1) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_7;
		@Pc(18) Class153 local18;
		synchronized (this.aClass160_7) {
			local18 = (Class153) this.aClass160_7.method3599((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41 = this.aClass171_16.method3745(Static119.method2466(arg0), Static6.method147(arg0));
		local18 = new Class153();
		if (local41 != null) {
			local18.method3473(new Class2_Sub16(local41));
		}
		@Pc(57) Class160 local57 = this.aClass160_7;
		synchronized (this.aClass160_7) {
			this.aClass160_7.method3602((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V")
	public void method802() {
		@Pc(6) Class160 local6 = this.aClass160_7;
		synchronized (this.aClass160_7) {
			this.aClass160_7.method3606(5);
		}
	}
}
