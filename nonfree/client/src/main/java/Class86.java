import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class86 {

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Lclient!nj;")
	private final Class171 aClass171_18 = new Class171(64);

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "Lclient!mg;")
	private final Class160 aClass160_17;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class86(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_17 = arg2;
		this.aClass160_17.method3722(31);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V")
	public void method2078() {
		@Pc(8) Class171 local8 = this.aClass171_18;
		synchronized (this.aClass171_18) {
			this.aClass171_18.method3933(5);
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
	public void method2081() {
		@Pc(2) Class171 local2 = this.aClass171_18;
		synchronized (this.aClass171_18) {
			this.aClass171_18.method3936();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Lclient!cw;")
	public Class50 method2082(@OriginalArg(1) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_18;
		@Pc(16) Class50 local16;
		synchronized (this.aClass171_18) {
			local16 = (Class50) this.aClass171_18.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass160_17.method3696(arg0, 31);
		local16 = new Class50();
		if (local39 != null) {
			local16.method1100(new Class2_Sub23(local39));
		}
		@Pc(57) Class171 local57 = this.aClass171_18;
		synchronized (this.aClass171_18) {
			this.aClass171_18.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
	public void method2085() {
		@Pc(7) Class171 local7 = this.aClass171_18;
		synchronized (this.aClass171_18) {
			this.aClass171_18.method3934();
		}
	}
}
