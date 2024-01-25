import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class205 {

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!mf;")
	private final Class222 aClass222_31 = new Class222(64);

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!pu;")
	private final Class270 aClass270_58;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class205(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_58 = arg2;
		this.aClass270_58.method5685(31);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
	public void method4121() {
		@Pc(2) Class222 local2 = this.aClass222_31;
		synchronized (this.aClass222_31) {
			this.aClass222_31.method4433(5);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method4122() {
		@Pc(2) Class222 local2 = this.aClass222_31;
		synchronized (this.aClass222_31) {
			this.aClass222_31.method4422();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public void method4124() {
		@Pc(6) Class222 local6 = this.aClass222_31;
		synchronized (this.aClass222_31) {
			this.aClass222_31.method4428();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lclient!kf;")
	public Class188 method4125(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_31;
		@Pc(16) Class188 local16;
		synchronized (this.aClass222_31) {
			local16 = (Class188) this.aClass222_31.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_58;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_58) {
			local38 = this.aClass270_58.method5704(31, arg0);
		}
		local16 = new Class188();
		if (local38 != null) {
			local16.method3806(new Class1_Sub35(local38));
		}
		@Pc(60) Class222 local60 = this.aClass222_31;
		synchronized (this.aClass222_31) {
			this.aClass222_31.method4434(local16, (long) arg0);
			return local16;
		}
	}
}
