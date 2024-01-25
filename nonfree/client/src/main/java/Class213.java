import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class213 {

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!hm;")
	private Class136 aClass136_70 = new Class136(128);

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!hm;")
	public Class136 aClass136_71 = new Class136(64);

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_80;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_79;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;Lclient!pfa;)V")
	public Class213(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_80 = arg3;
		this.aClass251_79 = arg2;
		this.aClass251_79.method5768(36);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public void method5126() {
		@Pc(6) Class136 local6 = this.aClass136_70;
		synchronized (this.aClass136_70) {
			this.aClass136_70.method3476();
		}
		local6 = this.aClass136_71;
		synchronized (this.aClass136_71) {
			this.aClass136_71.method3476();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lclient!ki;")
	public Class176 method5127(@OriginalArg(0) int arg0) {
		@Pc(11) Class136 local11 = this.aClass136_70;
		@Pc(21) Class176 local21;
		synchronized (this.aClass136_70) {
			local21 = (Class176) this.aClass136_70.method3473((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class251 local34 = this.aClass251_79;
		@Pc(43) byte[] local43;
		synchronized (this.aClass251_79) {
			local43 = this.aClass251_79.method5772(arg0, 36);
		}
		local21 = new Class176();
		local21.anInt5084 = arg0;
		local21.aClass213_4 = this;
		if (local43 != null) {
			local21.method4377(new Class6_Sub21(local43));
		}
		local21.method4386();
		@Pc(74) Class136 local74 = this.aClass136_70;
		synchronized (this.aClass136_70) {
			this.aClass136_70.method3482((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
	public void method5128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass136_70 = new Class136(arg0);
		this.aClass136_71 = new Class136(arg1);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public void method5130() {
		@Pc(6) Class136 local6 = this.aClass136_70;
		synchronized (this.aClass136_70) {
			this.aClass136_70.method3470();
		}
		local6 = this.aClass136_71;
		synchronized (this.aClass136_71) {
			this.aClass136_71.method3470();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)V")
	public void method5131() {
		@Pc(6) Class136 local6 = this.aClass136_70;
		synchronized (this.aClass136_70) {
			this.aClass136_70.method3474(5);
		}
		local6 = this.aClass136_71;
		synchronized (this.aClass136_71) {
			this.aClass136_71.method3474(5);
		}
	}
}
