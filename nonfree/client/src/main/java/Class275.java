import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class275 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!jr;")
	private final Class169 aClass169_47 = new Class169(128);

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!in;")
	private final Class157 aClass157_228;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class275(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_228 = arg2;
		this.aClass157_228.method4561(1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public void method7101() {
		@Pc(11) Class169 local11 = this.aClass169_47;
		synchronized (this.aClass169_47) {
			this.aClass169_47.method5006();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Lclient!hk;")
	public Class135 method7104(@OriginalArg(1) int arg0) {
		@Pc(11) Class169 local11 = this.aClass169_47;
		@Pc(21) Class135 local21;
		synchronized (this.aClass169_47) {
			local21 = (Class135) this.aClass169_47.method5002((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class157 local34 = this.aClass157_228;
		@Pc(43) byte[] local43;
		synchronized (this.aClass157_228) {
			local43 = this.aClass157_228.method4564(1, arg0);
		}
		local21 = new Class135();
		if (local43 != null) {
			local21.method4183(new Class2_Sub11(local43));
		}
		@Pc(65) Class169 local65 = this.aClass169_47;
		synchronized (this.aClass169_47) {
			this.aClass169_47.method5001(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	public void method7105() {
		@Pc(2) Class169 local2 = this.aClass169_47;
		synchronized (this.aClass169_47) {
			this.aClass169_47.method5009();
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	public void method7107() {
		@Pc(6) Class169 local6 = this.aClass169_47;
		synchronized (this.aClass169_47) {
			this.aClass169_47.method4997(5);
		}
	}
}
