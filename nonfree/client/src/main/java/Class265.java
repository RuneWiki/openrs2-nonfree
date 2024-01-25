import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class265 {

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!mf;")
	private final Class222 aClass222_45 = new Class222(256);

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!pu;")
	private final Class270 aClass270_82;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class265(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_82 = arg2;
		this.aClass270_82.method5685(26);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public void method5650() {
		@Pc(2) Class222 local2 = this.aClass222_45;
		synchronized (this.aClass222_45) {
			this.aClass222_45.method4422();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Lclient!tt;")
	public Class1_Sub6_Sub18 method5652(@OriginalArg(1) int arg0) {
		@Pc(11) Class222 local11 = this.aClass222_45;
		@Pc(23) Class1_Sub6_Sub18 local23;
		synchronized (this.aClass222_45) {
			local23 = (Class1_Sub6_Sub18) this.aClass222_45.method4430((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class270 local36 = this.aClass270_82;
		@Pc(45) byte[] local45;
		synchronized (this.aClass270_82) {
			local45 = this.aClass270_82.method5704(26, arg0);
		}
		local23 = new Class1_Sub6_Sub18();
		if (local45 != null) {
			local23.method7120(new Class1_Sub35(local45));
		}
		@Pc(67) Class222 local67 = this.aClass222_45;
		synchronized (this.aClass222_45) {
			this.aClass222_45.method4434(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)V")
	public void method5653() {
		@Pc(2) Class222 local2 = this.aClass222_45;
		synchronized (this.aClass222_45) {
			this.aClass222_45.method4433(5);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public void method5654() {
		@Pc(10) Class222 local10 = this.aClass222_45;
		synchronized (this.aClass222_45) {
			this.aClass222_45.method4428();
		}
	}
}
