import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class254 {

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Lclient!wf;")
	private final Class316 aClass316_55 = new Class316(16);

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Lclient!kda;")
	private final Class160 aClass160_86;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class254(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_86 = arg2;
		this.aClass160_86.method4207(30);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public void method6206() {
		@Pc(2) Class316 local2 = this.aClass316_55;
		synchronized (this.aClass316_55) {
			this.aClass316_55.method7803();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)Lclient!gr;")
	public Class111 method6207(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_55;
		@Pc(16) Class111 local16;
		synchronized (this.aClass316_55) {
			local16 = (Class111) this.aClass316_55.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class160 local35 = this.aClass160_86;
		@Pc(44) byte[] local44;
		synchronized (this.aClass160_86) {
			local44 = this.aClass160_86.method4198(arg0, 30);
		}
		local16 = new Class111();
		if (local44 != null) {
			local16.method3278(new Class1_Sub13(local44));
		}
		@Pc(66) Class316 local66 = this.aClass316_55;
		synchronized (this.aClass316_55) {
			this.aClass316_55.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
	public void method6208() {
		@Pc(10) Class316 local10 = this.aClass316_55;
		synchronized (this.aClass316_55) {
			this.aClass316_55.method7791(5);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	public void method6211() {
		@Pc(11) Class316 local11 = this.aClass316_55;
		synchronized (this.aClass316_55) {
			this.aClass316_55.method7794();
		}
	}
}
