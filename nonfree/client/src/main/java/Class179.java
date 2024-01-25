import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class179 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!jk;")
	private final Class137 aClass137_47 = new Class137(256);

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!qn;")
	private final Class211 aClass211_64;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class179(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_64 = arg2;
		this.aClass211_64.method4365(26);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public void method3489() {
		@Pc(2) Class137 local2 = this.aClass137_47;
		synchronized (this.aClass137_47) {
			this.aClass137_47.method2739();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public void method3491() {
		@Pc(2) Class137 local2 = this.aClass137_47;
		synchronized (this.aClass137_47) {
			this.aClass137_47.method2745(5);
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lclient!bb;")
	public Class4_Sub2_Sub4 method3493(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_47;
		@Pc(18) Class4_Sub2_Sub4 local18;
		synchronized (this.aClass137_47) {
			local18 = (Class4_Sub2_Sub4) this.aClass137_47.method2744((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class211 local31 = this.aClass211_64;
		@Pc(40) byte[] local40;
		synchronized (this.aClass211_64) {
			local40 = this.aClass211_64.method4377(26, arg0);
		}
		local18 = new Class4_Sub2_Sub4();
		if (local40 != null) {
			local18.method339(new Class4_Sub9(local40));
		}
		@Pc(62) Class137 local62 = this.aClass137_47;
		synchronized (this.aClass137_47) {
			this.aClass137_47.method2732((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V")
	public void method3495() {
		@Pc(14) Class137 local14 = this.aClass137_47;
		synchronized (this.aClass137_47) {
			this.aClass137_47.method2737();
		}
	}
}
