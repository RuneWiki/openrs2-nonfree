import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class345 {

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lclient!bh;")
	private final Class32 aClass32_81 = new Class32(64);

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "Lclient!wu;")
	private final Class380 aClass380_127;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class345(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_127 = arg2;
		if (this.aClass380_127 != null) {
			this.aClass380_127.method8631(35);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	public void method7727() {
		@Pc(12) Class32 local12 = this.aClass32_81;
		synchronized (this.aClass32_81) {
			this.aClass32_81.method632();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lclient!hq;")
	public Class142 method7728(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_81;
		@Pc(18) Class142 local18;
		synchronized (this.aClass32_81) {
			local18 = (Class142) this.aClass32_81.method630((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class380 local31 = this.aClass380_127;
		@Pc(40) byte[] local40;
		synchronized (this.aClass380_127) {
			local40 = this.aClass380_127.method8620(35, arg0);
		}
		local18 = new Class142();
		if (local40 != null) {
			local18.method3016(new Class2_Sub22(local40));
		}
		local18.method3017();
		@Pc(70) Class32 local70 = this.aClass32_81;
		synchronized (this.aClass32_81) {
			this.aClass32_81.method629(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public void method7729() {
		@Pc(2) Class32 local2 = this.aClass32_81;
		synchronized (this.aClass32_81) {
			this.aClass32_81.method640();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V")
	public void method7732() {
		@Pc(14) Class32 local14 = this.aClass32_81;
		synchronized (this.aClass32_81) {
			this.aClass32_81.method634(5);
		}
	}
}
