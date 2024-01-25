import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class102 {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!ad;")
	private Class6 aClass6_16 = new Class6(128);

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Lclient!ad;")
	public Class6 aClass6_17 = new Class6(64);

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!tf;")
	public final Class322 aClass322_63;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Lclient!tf;")
	private final Class322 aClass322_62;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;Lclient!tf;)V")
	public Class102(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Class322 arg3) {
		this.aClass322_63 = arg3;
		this.aClass322_62 = arg2;
		this.aClass322_62.method6831(36);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public void method2920() {
		@Pc(6) Class6 local6 = this.aClass6_16;
		synchronized (this.aClass6_16) {
			this.aClass6_16.method94();
		}
		local6 = this.aClass6_17;
		synchronized (this.aClass6_17) {
			this.aClass6_17.method94();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V")
	public void method2922() {
		@Pc(6) Class6 local6 = this.aClass6_16;
		synchronized (this.aClass6_16) {
			this.aClass6_16.method97(5);
		}
		local6 = this.aClass6_17;
		synchronized (this.aClass6_17) {
			this.aClass6_17.method97(5);
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	public void method2923() {
		@Pc(2) Class6 local2 = this.aClass6_16;
		synchronized (this.aClass6_16) {
			this.aClass6_16.method102();
		}
		local2 = this.aClass6_17;
		synchronized (this.aClass6_17) {
			this.aClass6_17.method102();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZ)V")
	public void method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass6_16 = new Class6(arg0);
		this.aClass6_17 = new Class6(arg1);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)Lclient!kca;")
	public Class174 method2925(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_16;
		@Pc(16) Class174 local16;
		synchronized (this.aClass6_16) {
			local16 = (Class174) this.aClass6_16.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class322 local34 = this.aClass322_62;
		@Pc(43) byte[] local43;
		synchronized (this.aClass322_62) {
			local43 = this.aClass322_62.method6802(36, arg0);
		}
		local16 = new Class174();
		local16.aClass102_3 = this;
		local16.anInt4756 = arg0;
		if (local43 != null) {
			local16.method4115(new Class3_Sub11(local43));
		}
		local16.method4117();
		@Pc(74) Class6 local74 = this.aClass6_16;
		synchronized (this.aClass6_16) {
			this.aClass6_16.method106((long) arg0, local16);
			return local16;
		}
	}
}
