import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class137 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "Lclient!wf;")
	private final Class316 aClass316_26 = new Class316(64);

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "Lclient!wf;")
	public final Class316 aClass316_27 = new Class316(2);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!kda;")
	private final Class160 aClass160_46;

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "Lclient!kda;")
	public final Class160 aClass160_47;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;Lclient!kda;)V")
	public Class137(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_46 = arg2;
		this.aClass160_47 = arg3;
		this.aClass160_46.method4207(33);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public void method3824() {
		@Pc(2) Class316 local2 = this.aClass316_26;
		synchronized (this.aClass316_26) {
			this.aClass316_26.method7803();
		}
		local2 = this.aClass316_27;
		synchronized (this.aClass316_27) {
			this.aClass316_27.method7803();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BI)V")
	public void method3825() {
		@Pc(6) Class316 local6 = this.aClass316_26;
		synchronized (this.aClass316_26) {
			this.aClass316_26.method7791(5);
		}
		local6 = this.aClass316_27;
		synchronized (this.aClass316_27) {
			this.aClass316_27.method7791(5);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)Lclient!tu;")
	public Class281 method3828(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_26;
		@Pc(16) Class281 local16;
		synchronized (this.aClass316_26) {
			local16 = (Class281) this.aClass316_26.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class160 local35 = this.aClass160_46;
		@Pc(44) byte[] local44;
		synchronized (this.aClass160_46) {
			local44 = this.aClass160_46.method4198(arg0, 33);
		}
		local16 = new Class281();
		local16.aClass137_1 = this;
		if (local44 != null) {
			local16.method6885(new Class1_Sub13(local44));
		}
		@Pc(69) Class316 local69 = this.aClass316_26;
		synchronized (this.aClass316_26) {
			this.aClass316_26.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	public void method3829() {
		@Pc(12) Class316 local12 = this.aClass316_26;
		synchronized (this.aClass316_26) {
			this.aClass316_26.method7794();
		}
		local12 = this.aClass316_27;
		synchronized (this.aClass316_27) {
			this.aClass316_27.method7794();
		}
	}
}
