import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class229 {

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!wf;")
	private final Class316 aClass316_49 = new Class316(256);

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!kda;")
	private final Class160 aClass160_78;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class229(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_78 = arg2;
		this.aClass160_78.method4207(26);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public void method5694() {
		@Pc(6) Class316 local6 = this.aClass316_49;
		synchronized (this.aClass316_49) {
			this.aClass316_49.method7803();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	public void method5695() {
		@Pc(10) Class316 local10 = this.aClass316_49;
		synchronized (this.aClass316_49) {
			this.aClass316_49.method7794();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	public void method5697() {
		@Pc(12) Class316 local12 = this.aClass316_49;
		synchronized (this.aClass316_49) {
			this.aClass316_49.method7791(5);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lclient!td;")
	public Class1_Sub1_Sub18 method5698(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_49;
		@Pc(18) Class1_Sub1_Sub18 local18;
		synchronized (this.aClass316_49) {
			local18 = (Class1_Sub1_Sub18) this.aClass316_49.method7799((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class160 local31 = this.aClass160_78;
		@Pc(40) byte[] local40;
		synchronized (this.aClass160_78) {
			local40 = this.aClass160_78.method4198(arg0, 26);
		}
		local18 = new Class1_Sub1_Sub18();
		if (local40 != null) {
			local18.method6566(new Class1_Sub13(local40));
		}
		@Pc(62) Class316 local62 = this.aClass316_49;
		synchronized (this.aClass316_49) {
			this.aClass316_49.method7792((long) arg0, local18);
			return local18;
		}
	}
}
