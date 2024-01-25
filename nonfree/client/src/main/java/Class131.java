import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class131 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!nj;")
	private final Class171 aClass171_29 = new Class171(16);

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "Lclient!mg;")
	private final Class160 aClass160_33;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class131(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_33 = arg2;
		this.aClass160_33.method3722(30);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V")
	public void method2950() {
		@Pc(10) Class171 local10 = this.aClass171_29;
		synchronized (this.aClass171_29) {
			this.aClass171_29.method3933(5);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public void method2951() {
		@Pc(2) Class171 local2 = this.aClass171_29;
		synchronized (this.aClass171_29) {
			this.aClass171_29.method3936();
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
	public void method2953() {
		@Pc(12) Class171 local12 = this.aClass171_29;
		synchronized (this.aClass171_29) {
			this.aClass171_29.method3934();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Lclient!st;")
	public Class229 method2954(@OriginalArg(1) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_29;
		@Pc(21) Class229 local21;
		synchronized (this.aClass171_29) {
			local21 = (Class229) this.aClass171_29.method3941((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass160_33.method3696(arg0, 30);
		local21 = new Class229();
		if (local38 != null) {
			local21.method5016(new Class2_Sub23(local38));
		}
		@Pc(54) Class171 local54 = this.aClass171_29;
		synchronized (this.aClass171_29) {
			this.aClass171_29.method3940((long) arg0, local21);
			return local21;
		}
	}
}
