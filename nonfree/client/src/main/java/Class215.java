import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class215 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lclient!nj;")
	private Class171 aClass171_49 = new Class171(128);

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "Lclient!nj;")
	public Class171 aClass171_50 = new Class171(64);

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "Lclient!mg;")
	private final Class160 aClass160_67;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "Lclient!mg;")
	public final Class160 aClass160_66;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;Lclient!mg;)V")
	public Class215(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_67 = arg2;
		this.aClass160_66 = arg3;
		this.aClass160_67.method3722(36);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)Lclient!cu;")
	public Class48 method4741(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_49;
		@Pc(16) Class48 local16;
		synchronized (this.aClass171_49) {
			local16 = (Class48) this.aClass171_49.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass160_67.method3696(arg0, 36);
		local16 = new Class48();
		local16.aClass215_1 = this;
		local16.anInt1221 = arg0;
		if (local33 != null) {
			local16.method925(new Class2_Sub23(local33));
		}
		local16.method927();
		@Pc(58) Class171 local58 = this.aClass171_49;
		synchronized (this.aClass171_49) {
			this.aClass171_49.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public void method4742() {
		@Pc(6) Class171 local6 = this.aClass171_49;
		synchronized (this.aClass171_49) {
			this.aClass171_49.method3934();
		}
		local6 = this.aClass171_50;
		synchronized (this.aClass171_50) {
			this.aClass171_50.method3934();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
	public void method4743() {
		@Pc(12) Class171 local12 = this.aClass171_49;
		synchronized (this.aClass171_49) {
			this.aClass171_49.method3933(5);
		}
		local12 = this.aClass171_50;
		synchronized (this.aClass171_50) {
			this.aClass171_50.method3933(5);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public void method4745() {
		@Pc(6) Class171 local6 = this.aClass171_49;
		synchronized (this.aClass171_49) {
			this.aClass171_49.method3936();
		}
		local6 = this.aClass171_50;
		synchronized (this.aClass171_50) {
			this.aClass171_50.method3936();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	public void method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass171_49 = new Class171(arg1);
		this.aClass171_50 = new Class171(arg0);
	}
}
