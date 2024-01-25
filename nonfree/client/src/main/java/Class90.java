import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class90 {

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	public int anInt3289;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!wf;")
	private final Class316 aClass316_15 = new Class316(64);

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Lclient!wf;")
	public final Class316 aClass316_17 = new Class316(30);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Lclient!kda;")
	public final Class160 aClass160_30;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!kda;")
	private final Class160 aClass160_31;

	static {
		new Class266("", 76);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;Lclient!kda;)V")
	public Class90(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_30 = arg3;
		this.aClass160_31 = arg2;
		@Pc(26) int local26 = this.aClass160_31.method4206() - 1;
		this.aClass160_31.method4207(local26);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public void method2956() {
		@Pc(2) Class316 local2 = this.aClass316_15;
		synchronized (this.aClass316_15) {
			this.aClass316_15.method7803();
		}
		local2 = this.aClass316_17;
		synchronized (this.aClass316_17) {
			this.aClass316_17.method7803();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
	public void method2958() {
		@Pc(6) Class316 local6 = this.aClass316_15;
		synchronized (this.aClass316_15) {
			this.aClass316_15.method7791(5);
		}
		local6 = this.aClass316_17;
		synchronized (this.aClass316_17) {
			this.aClass316_17.method7791(5);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public void method2959(@OriginalArg(1) int arg0) {
		this.anInt3289 = arg0;
		@Pc(9) Class316 local9 = this.aClass316_17;
		synchronized (this.aClass316_17) {
			this.aClass316_17.method7794();
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	public void method2962() {
		@Pc(6) Class316 local6 = this.aClass316_15;
		synchronized (this.aClass316_15) {
			this.aClass316_15.method7794();
		}
		local6 = this.aClass316_17;
		synchronized (this.aClass316_17) {
			this.aClass316_17.method7794();
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(IB)Lclient!gt;")
	public Class112 method2963(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_15;
		@Pc(16) Class112 local16;
		synchronized (this.aClass316_15) {
			local16 = (Class112) this.aClass316_15.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_31;
		@Pc(42) byte[] local42;
		synchronized (this.aClass160_31) {
			local42 = this.aClass160_31.method4198(Static73.method1944(arg0), Static248.method4205(arg0));
		}
		local16 = new Class112();
		local16.anInt3710 = arg0;
		local16.aClass90_1 = this;
		if (local42 != null) {
			local16.method3305(new Class1_Sub13(local42));
		}
		@Pc(76) Class316 local76 = this.aClass316_15;
		synchronized (this.aClass316_15) {
			this.aClass316_15.method7792((long) arg0, local16);
			return local16;
		}
	}
}
