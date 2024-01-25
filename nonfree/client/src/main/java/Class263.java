import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class263 {

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!nj;")
	private final Class171 aClass171_61 = new Class171(64);

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Lclient!nj;")
	public final Class171 aClass171_62 = new Class171(2);

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!mg;")
	public final Class160 aClass160_90;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Lclient!mg;")
	private final Class160 aClass160_91;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;Lclient!mg;)V")
	public Class263(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_90 = arg3;
		this.aClass160_91 = arg2;
		this.aClass160_91.method3722(33);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method5703() {
		@Pc(6) Class171 local6 = this.aClass171_61;
		synchronized (this.aClass171_61) {
			this.aClass171_61.method3936();
		}
		local6 = this.aClass171_62;
		synchronized (this.aClass171_62) {
			this.aClass171_62.method3936();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public void method5704() {
		@Pc(6) Class171 local6 = this.aClass171_61;
		synchronized (this.aClass171_61) {
			this.aClass171_61.method3934();
		}
		local6 = this.aClass171_62;
		synchronized (this.aClass171_62) {
			this.aClass171_62.method3934();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public void method5705() {
		@Pc(2) Class171 local2 = this.aClass171_61;
		synchronized (this.aClass171_61) {
			this.aClass171_61.method3933(5);
		}
		local2 = this.aClass171_62;
		synchronized (this.aClass171_62) {
			this.aClass171_62.method3933(5);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lclient!ui;")
	public Class244 method5706(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_61;
		@Pc(16) Class244 local16;
		synchronized (this.aClass171_61) {
			local16 = (Class244) this.aClass171_61.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass160_91.method3696(arg0, 33);
		local16 = new Class244();
		local16.aClass263_2 = this;
		if (local33 != null) {
			local16.method5265(new Class2_Sub23(local33));
		}
		@Pc(52) Class171 local52 = this.aClass171_61;
		synchronized (this.aClass171_61) {
			this.aClass171_61.method3940((long) arg0, local16);
			return local16;
		}
	}
}
