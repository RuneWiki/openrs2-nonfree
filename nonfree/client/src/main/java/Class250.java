import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class250 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!wf;")
	private Class316 aClass316_53 = new Class316(128);

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!wf;")
	public Class316 aClass316_54 = new Class316(64);

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!kda;")
	public final Class160 aClass160_84;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!kda;")
	private final Class160 aClass160_85;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;Lclient!kda;)V")
	public Class250(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_84 = arg3;
		this.aClass160_85 = arg2;
		this.aClass160_85.method4207(36);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lclient!bc;")
	public Class24 method6143(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_53;
		@Pc(16) Class24 local16;
		synchronized (this.aClass316_53) {
			local16 = (Class24) this.aClass316_53.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_85;
		@Pc(38) byte[] local38;
		synchronized (this.aClass160_85) {
			local38 = this.aClass160_85.method4198(arg0, 36);
		}
		local16 = new Class24();
		local16.anInt1154 = arg0;
		local16.aClass250_1 = this;
		if (local38 != null) {
			local16.method1195(new Class1_Sub13(local38));
		}
		local16.method1186();
		@Pc(69) Class316 local69 = this.aClass316_53;
		synchronized (this.aClass316_53) {
			this.aClass316_53.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	public void method6144() {
		@Pc(2) Class316 local2 = this.aClass316_53;
		synchronized (this.aClass316_53) {
			this.aClass316_53.method7791(5);
		}
		local2 = this.aClass316_54;
		synchronized (this.aClass316_54) {
			this.aClass316_54.method7791(5);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	public void method6147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass316_53 = new Class316(arg1);
		this.aClass316_54 = new Class316(arg0);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public void method6148() {
		@Pc(2) Class316 local2 = this.aClass316_53;
		synchronized (this.aClass316_53) {
			this.aClass316_53.method7794();
		}
		local2 = this.aClass316_54;
		synchronized (this.aClass316_54) {
			this.aClass316_54.method7794();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	public void method6149() {
		@Pc(6) Class316 local6 = this.aClass316_53;
		synchronized (this.aClass316_53) {
			this.aClass316_53.method7803();
		}
		local6 = this.aClass316_54;
		synchronized (this.aClass316_54) {
			this.aClass316_54.method7803();
		}
	}
}
