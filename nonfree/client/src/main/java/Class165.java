import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class165 {

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Lclient!wf;")
	private Class316 aClass316_31 = new Class316(64);

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "Lclient!wf;")
	public Class316 aClass316_32 = new Class316(64);

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!kda;")
	public final Class160 aClass160_57;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!kda;")
	private final Class160 aClass160_56;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;Lclient!kda;)V")
	public Class165(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_57 = arg3;
		this.aClass160_56 = arg2;
		this.aClass160_56.method4207(34);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public void method4288() {
		@Pc(6) Class316 local6 = this.aClass316_31;
		synchronized (this.aClass316_31) {
			this.aClass316_31.method7803();
		}
		local6 = this.aClass316_32;
		synchronized (this.aClass316_32) {
			this.aClass316_32.method7803();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	public void method4289() {
		@Pc(6) Class316 local6 = this.aClass316_31;
		synchronized (this.aClass316_31) {
			this.aClass316_31.method7791(5);
		}
		local6 = this.aClass316_32;
		synchronized (this.aClass316_32) {
			this.aClass316_32.method7791(5);
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Lclient!it;")
	public Class140 method4290(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_31;
		@Pc(18) Class140 local18;
		synchronized (this.aClass316_31) {
			local18 = (Class140) this.aClass316_31.method7799((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class160 local31 = this.aClass160_56;
		@Pc(40) byte[] local40;
		synchronized (this.aClass160_56) {
			local40 = this.aClass160_56.method4198(arg0, 34);
		}
		local18 = new Class140();
		local18.aClass165_4 = this;
		if (local40 != null) {
			local18.method3860(new Class1_Sub13(local40));
		}
		@Pc(65) Class316 local65 = this.aClass316_31;
		synchronized (this.aClass316_31) {
			this.aClass316_31.method7792((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public void method4291() {
		@Pc(6) Class316 local6 = this.aClass316_31;
		synchronized (this.aClass316_31) {
			this.aClass316_31.method7794();
		}
		local6 = this.aClass316_32;
		synchronized (this.aClass316_32) {
			this.aClass316_32.method7794();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	public void method4292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass316_31 = new Class316(arg0);
		this.aClass316_32 = new Class316(arg1);
	}
}
