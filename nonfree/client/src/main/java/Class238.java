import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class238 {

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "Lclient!fba;")
	private final Class102 aClass102_41 = new Class102(128);

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "Lclient!la;")
	private final Class196 aClass196_79;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class238(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_79 = arg2;
		this.aClass196_79.method5118(1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)V")
	public void method6219() {
		@Pc(2) Class102 local2 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2668(5);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public void method6220() {
		@Pc(6) Class102 local6 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2681();
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lclient!iu;")
	public Class162 method6221(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_41;
		@Pc(16) Class162 local16;
		synchronized (this.aClass102_41) {
			local16 = (Class162) this.aClass102_41.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass196_79) {
			local38 = this.aClass196_79.method5102(1, arg0);
		}
		local16 = new Class162();
		if (local38 != null) {
			local16.method4087(new Class3_Sub3(local38));
		}
		@Pc(66) Class102 local66 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
	public void method6223() {
		@Pc(2) Class102 local2 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2680();
		}
	}
}
