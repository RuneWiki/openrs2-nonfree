import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class298 {

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!hm;")
	private final Class136 aClass136_87 = new Class136(64);

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!hm;")
	private final Class136 aClass136_88 = new Class136(100);

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_112;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;Lclient!pfa;Lclient!pfa;)V")
	public Class298(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) Class251 arg4) {
		this.aClass251_112 = arg2;
		if (this.aClass251_112 != null) {
			@Pc(26) int local26 = this.aClass251_112.method5755() - 1;
			this.aClass251_112.method5768(local26);
		}
		Static473.method6575(arg3, arg4);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public void method6515() {
		@Pc(6) Class136 local6 = this.aClass136_87;
		synchronized (this.aClass136_87) {
			this.aClass136_87.method3476();
		}
		local6 = this.aClass136_88;
		synchronized (this.aClass136_88) {
			this.aClass136_88.method3476();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lclient!tn;")
	public Class6_Sub2_Sub19 method6517(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_88;
		@Pc(16) Class6_Sub2_Sub19 local16;
		synchronized (this.aClass136_88) {
			local16 = (Class6_Sub2_Sub19) this.aClass136_88.method3473((long) arg0);
			if (local16 == null) {
				local16 = new Class6_Sub2_Sub19(arg0);
				this.aClass136_88.method3482((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method7105() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V")
	public void method6518() {
		@Pc(12) Class136 local12 = this.aClass136_87;
		synchronized (this.aClass136_87) {
			this.aClass136_87.method3474(5);
		}
		local12 = this.aClass136_88;
		synchronized (this.aClass136_88) {
			this.aClass136_88.method3474(5);
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public void method6520() {
		@Pc(6) Class136 local6 = this.aClass136_87;
		synchronized (this.aClass136_87) {
			this.aClass136_87.method3470();
		}
		local6 = this.aClass136_88;
		synchronized (this.aClass136_88) {
			this.aClass136_88.method3470();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Lclient!cu;")
	public Class57 method6521(@OriginalArg(0) int arg0) {
		@Pc(14) Class136 local14 = this.aClass136_87;
		@Pc(24) Class57 local24;
		synchronized (this.aClass136_87) {
			local24 = (Class57) this.aClass136_87.method3473((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class251 local37 = this.aClass251_112;
		@Pc(50) byte[] local50;
		synchronized (this.aClass251_112) {
			local50 = this.aClass251_112.method5772(Static158.method2949(arg0), Static334.method5200(arg0));
		}
		local24 = new Class57();
		local24.aClass298_1 = this;
		local24.anInt1538 = arg0;
		if (local50 != null) {
			local24.method1449(new Class6_Sub21(local50));
		}
		local24.method1455();
		@Pc(81) Class136 local81 = this.aClass136_87;
		synchronized (this.aClass136_87) {
			this.aClass136_87.method3482((long) arg0, local24);
			return local24;
		}
	}
}
