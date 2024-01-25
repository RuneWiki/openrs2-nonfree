import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class324 {

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!vh;")
	private final Class330 aClass330_66 = new Class330(64);

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Lclient!vh;")
	private final Class330 aClass330_67 = new Class330(100);

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Lclient!pj;")
	private final Class248 aClass248_104;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;Lclient!pj;Lclient!pj;)V")
	public Class324(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class248 arg3, @OriginalArg(4) Class248 arg4) {
		this.aClass248_104 = arg2;
		if (this.aClass248_104 != null) {
			@Pc(26) int local26 = this.aClass248_104.method5774() - 1;
			this.aClass248_104.method5793(local26);
		}
		Static282.method4300(arg4, arg3);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Lclient!rs;")
	public Class6_Sub5_Sub15 method7259(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_67;
		@Pc(22) Class6_Sub5_Sub15 local22;
		synchronized (this.aClass330_67) {
			local22 = (Class6_Sub5_Sub15) this.aClass330_67.method7677((long) arg0);
			if (local22 == null) {
				local22 = new Class6_Sub5_Sub15(arg0);
				this.aClass330_67.method7676(local22, (long) arg0);
			}
		}
		synchronized (local22) {
			return local22.method6374() ? local22 : null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public void method7262() {
		@Pc(2) Class330 local2 = this.aClass330_66;
		synchronized (this.aClass330_66) {
			this.aClass330_66.method7678();
		}
		local2 = this.aClass330_67;
		synchronized (this.aClass330_67) {
			this.aClass330_67.method7678();
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V")
	public void method7263() {
		@Pc(6) Class330 local6 = this.aClass330_66;
		synchronized (this.aClass330_66) {
			this.aClass330_66.method7680(5);
		}
		local6 = this.aClass330_67;
		synchronized (this.aClass330_67) {
			this.aClass330_67.method7680(5);
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)Lclient!ct;")
	public Class63 method7265(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_66;
		@Pc(16) Class63 local16;
		synchronized (this.aClass330_66) {
			local16 = (Class63) this.aClass330_66.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_104;
		@Pc(44) byte[] local44;
		synchronized (this.aClass248_104) {
			local44 = this.aClass248_104.method5797(Static25.method355(arg0), Static57.method832(arg0));
		}
		local16 = new Class63();
		local16.aClass324_1 = this;
		local16.anInt1370 = arg0;
		if (local44 != null) {
			local16.method1149(new Class6_Sub12(local44));
		}
		local16.method1153();
		@Pc(75) Class330 local75 = this.aClass330_66;
		synchronized (this.aClass330_66) {
			this.aClass330_66.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	public void method7266() {
		@Pc(2) Class330 local2 = this.aClass330_66;
		synchronized (this.aClass330_66) {
			this.aClass330_66.method7688();
		}
		@Pc(29) Class330 local29 = this.aClass330_67;
		synchronized (this.aClass330_67) {
			this.aClass330_67.method7688();
		}
	}
}
