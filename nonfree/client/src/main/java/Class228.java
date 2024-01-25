import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class228 {

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!mo;")
	private final Class160 aClass160_57 = new Class160(64);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!nl;")
	private final Class171 aClass171_90;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class228(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_90 = arg2;
		this.aClass171_90.method3750(31);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public void method4976() {
		@Pc(2) Class160 local2 = this.aClass160_57;
		synchronized (this.aClass160_57) {
			this.aClass160_57.method3605();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!o;")
	public Class174 method4978(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_57;
		@Pc(16) Class174 local16;
		synchronized (this.aClass160_57) {
			local16 = (Class174) this.aClass160_57.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass171_90.method3745(31, arg0);
		local16 = new Class174();
		if (local39 != null) {
			local16.method3872(new Class2_Sub16(local39));
		}
		@Pc(55) Class160 local55 = this.aClass160_57;
		synchronized (this.aClass160_57) {
			this.aClass160_57.method3602((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
	public void method4979() {
		@Pc(14) Class160 local14 = this.aClass160_57;
		synchronized (this.aClass160_57) {
			this.aClass160_57.method3606(5);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public void method4980() {
		@Pc(6) Class160 local6 = this.aClass160_57;
		synchronized (this.aClass160_57) {
			this.aClass160_57.method3595();
		}
	}
}
