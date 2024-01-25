import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class35 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!kh;")
	private final Class134 aClass134_5 = new Class134(64);

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!ul;")
	private final Class246 aClass246_34;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class35(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_34 = arg2;
		if (this.aClass246_34 != null) {
			this.aClass246_34.method5492(11);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!oj;")
	public Class184 method867(@OriginalArg(0) int arg0) {
		@Pc(11) Class134 local11 = this.aClass134_5;
		@Pc(21) Class184 local21;
		synchronized (this.aClass134_5) {
			local21 = (Class184) this.aClass134_5.method3266((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class246 local34 = this.aClass246_34;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_34) {
			local43 = this.aClass246_34.method5477(11, arg0);
		}
		local21 = new Class184();
		if (local43 != null) {
			local21.method4168(new Class1_Sub5(local43));
		}
		@Pc(65) Class134 local65 = this.aClass134_5;
		synchronized (this.aClass134_5) {
			this.aClass134_5.method3263((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	public void method868() {
		@Pc(2) Class134 local2 = this.aClass134_5;
		synchronized (this.aClass134_5) {
			this.aClass134_5.method3270(5);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public void method869() {
		@Pc(2) Class134 local2 = this.aClass134_5;
		synchronized (this.aClass134_5) {
			this.aClass134_5.method3267();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public void method872() {
		@Pc(7) Class134 local7 = this.aClass134_5;
		synchronized (this.aClass134_5) {
			this.aClass134_5.method3272();
		}
	}
}
