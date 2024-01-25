import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class51 {

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Lclient!mo;")
	private final Class160 aClass160_14 = new Class160(64);

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Lclient!nl;")
	private final Class171 aClass171_24;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class51(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_24 = arg2;
		if (this.aClass171_24 != null) {
			this.aClass171_24.method3750(35);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Lclient!cp;")
	public Class38 method1043(@OriginalArg(1) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_14;
		@Pc(16) Class38 local16;
		synchronized (this.aClass160_14) {
			local16 = (Class38) this.aClass160_14.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass171_24.method3745(35, arg0);
		local16 = new Class38();
		if (local33 != null) {
			local16.method810(new Class2_Sub16(local33));
		}
		local16.method811();
		@Pc(52) Class160 local52 = this.aClass160_14;
		synchronized (this.aClass160_14) {
			this.aClass160_14.method3602((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
	public void method1045() {
		@Pc(6) Class160 local6 = this.aClass160_14;
		synchronized (this.aClass160_14) {
			this.aClass160_14.method3605();
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(Z)V")
	public void method1046() {
		@Pc(12) Class160 local12 = this.aClass160_14;
		synchronized (this.aClass160_14) {
			this.aClass160_14.method3595();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)V")
	public void method1047() {
		@Pc(2) Class160 local2 = this.aClass160_14;
		synchronized (this.aClass160_14) {
			this.aClass160_14.method3606(5);
		}
	}
}
