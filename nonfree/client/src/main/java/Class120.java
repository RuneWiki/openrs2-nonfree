import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class120 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!nj;")
	private Class171 aClass171_24 = new Class171(64);

	@OriginalMember(owner = "client!im", name = "p", descriptor = "Lclient!nj;")
	public Class171 aClass171_25 = new Class171(64);

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Lclient!mg;")
	private final Class160 aClass160_27;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!mg;")
	public final Class160 aClass160_26;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;Lclient!mg;)V")
	public Class120(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_27 = arg2;
		this.aClass160_26 = arg3;
		this.aClass160_27.method3722(34);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public void method2657() {
		@Pc(6) Class171 local6 = this.aClass171_24;
		synchronized (this.aClass171_24) {
			this.aClass171_24.method3934();
		}
		local6 = this.aClass171_25;
		synchronized (this.aClass171_25) {
			this.aClass171_25.method3934();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)V")
	public void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass171_24 = new Class171(arg1);
		this.aClass171_25 = new Class171(arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
	public void method2659() {
		@Pc(13) Class171 local13 = this.aClass171_24;
		synchronized (this.aClass171_24) {
			this.aClass171_24.method3933(5);
		}
		local13 = this.aClass171_25;
		synchronized (this.aClass171_25) {
			this.aClass171_25.method3933(5);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Lclient!at;")
	public Class16 method2660(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_24;
		@Pc(16) Class16 local16;
		synchronized (this.aClass171_24) {
			local16 = (Class16) this.aClass171_24.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass160_27.method3696(arg0, 34);
		local16 = new Class16();
		local16.aClass120_3 = this;
		if (local33 != null) {
			local16.method322(new Class2_Sub23(local33));
		}
		@Pc(57) Class171 local57 = this.aClass171_24;
		synchronized (this.aClass171_24) {
			this.aClass171_24.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public void method2661() {
		@Pc(2) Class171 local2 = this.aClass171_24;
		synchronized (this.aClass171_24) {
			this.aClass171_24.method3936();
		}
		local2 = this.aClass171_25;
		synchronized (this.aClass171_25) {
			this.aClass171_25.method3936();
		}
	}
}
