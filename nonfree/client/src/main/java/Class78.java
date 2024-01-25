import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class78 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Lclient!nj;")
	private final Class171 aClass171_15 = new Class171(64);

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Lclient!mg;")
	private final Class160 aClass160_15;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class78(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_15 = arg2;
		if (this.aClass160_15 != null) {
			this.aClass160_15.method3722(35);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Lclient!wi;")
	public Class264 method1963(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_15;
		@Pc(16) Class264 local16;
		synchronized (this.aClass171_15) {
			local16 = (Class264) this.aClass171_15.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) byte[] local35 = this.aClass160_15.method3696(arg0, 35);
		local16 = new Class264();
		if (local35 != null) {
			local16.method5708(new Class2_Sub23(local35));
		}
		local16.method5709();
		@Pc(59) Class171 local59 = this.aClass171_15;
		synchronized (this.aClass171_15) {
			this.aClass171_15.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public void method1964() {
		@Pc(2) Class171 local2 = this.aClass171_15;
		synchronized (this.aClass171_15) {
			this.aClass171_15.method3934();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public void method1965() {
		@Pc(2) Class171 local2 = this.aClass171_15;
		synchronized (this.aClass171_15) {
			this.aClass171_15.method3936();
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)V")
	public void method1967() {
		@Pc(2) Class171 local2 = this.aClass171_15;
		synchronized (this.aClass171_15) {
			this.aClass171_15.method3933(5);
		}
	}
}
