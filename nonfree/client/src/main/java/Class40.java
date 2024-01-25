import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class40 {

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "Lclient!wf;")
	private final Class316 aClass316_7 = new Class316(128);

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "Lclient!kda;")
	private final Class160 aClass160_14;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class40(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_14 = arg2;
		this.aClass160_14.method4207(1);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V")
	public void method1493() {
		@Pc(11) Class316 local11 = this.aClass316_7;
		synchronized (this.aClass316_7) {
			this.aClass316_7.method7791(5);
		}
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(II)Lclient!dp;")
	public Class63 method1495(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_7;
		@Pc(16) Class63 local16;
		synchronized (this.aClass316_7) {
			local16 = (Class63) this.aClass316_7.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_14;
		@Pc(38) byte[] local38;
		synchronized (this.aClass160_14) {
			local38 = this.aClass160_14.method4198(arg0, 1);
		}
		local16 = new Class63();
		if (local38 != null) {
			local16.method2171(new Class1_Sub13(local38));
		}
		@Pc(60) Class316 local60 = this.aClass316_7;
		synchronized (this.aClass316_7) {
			this.aClass316_7.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
	public void method1496() {
		@Pc(14) Class316 local14 = this.aClass316_7;
		synchronized (this.aClass316_7) {
			this.aClass316_7.method7803();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
	public void method1497() {
		@Pc(6) Class316 local6 = this.aClass316_7;
		synchronized (this.aClass316_7) {
			this.aClass316_7.method7794();
		}
	}
}
