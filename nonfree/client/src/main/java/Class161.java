import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class161 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!nj;")
	private final Class171 aClass171_40 = new Class171(64);

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "Lclient!mg;")
	private final Class160 aClass160_48;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class161(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_48 = arg2;
		if (this.aClass160_48 != null) {
			this.aClass160_48.method3722(11);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public void method3726() {
		@Pc(13) Class171 local13 = this.aClass171_40;
		synchronized (this.aClass171_40) {
			this.aClass171_40.method3936();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
	public void method3728() {
		@Pc(12) Class171 local12 = this.aClass171_40;
		synchronized (this.aClass171_40) {
			this.aClass171_40.method3933(5);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lclient!jl;")
	public Class132 method3729(@OriginalArg(1) int arg0) {
		@Pc(14) Class171 local14 = this.aClass171_40;
		@Pc(24) Class132 local24;
		synchronized (this.aClass171_40) {
			local24 = (Class132) this.aClass171_40.method3941((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass160_48.method3696(arg0, 11);
		local24 = new Class132();
		if (local41 != null) {
			local24.method2961(new Class2_Sub23(local41));
		}
		@Pc(57) Class171 local57 = this.aClass171_40;
		synchronized (this.aClass171_40) {
			this.aClass171_40.method3940((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public void method3730() {
		@Pc(10) Class171 local10 = this.aClass171_40;
		synchronized (this.aClass171_40) {
			this.aClass171_40.method3934();
		}
	}
}
