import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class350 {

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Lclient!vh;")
	private final Class330 aClass330_68 = new Class330(256);

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "Lclient!pj;")
	private final Class248 aClass248_110;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class350(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_110 = arg2;
		this.aClass248_110.method5793(26);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	public void method7898() {
		@Pc(6) Class330 local6 = this.aClass330_68;
		synchronized (this.aClass330_68) {
			this.aClass330_68.method7680(5);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public void method7899() {
		@Pc(2) Class330 local2 = this.aClass330_68;
		synchronized (this.aClass330_68) {
			this.aClass330_68.method7678();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Lclient!am;")
	public Class6_Sub5_Sub1 method7900(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_68;
		@Pc(16) Class6_Sub5_Sub1 local16;
		synchronized (this.aClass330_68) {
			local16 = (Class6_Sub5_Sub1) this.aClass330_68.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class248 local34 = this.aClass248_110;
		@Pc(43) byte[] local43;
		synchronized (this.aClass248_110) {
			local43 = this.aClass248_110.method5797(26, arg0);
		}
		local16 = new Class6_Sub5_Sub1();
		if (local43 != null) {
			local16.method252(new Class6_Sub12(local43));
		}
		@Pc(65) Class330 local65 = this.aClass330_68;
		synchronized (this.aClass330_68) {
			this.aClass330_68.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	public void method7901() {
		@Pc(6) Class330 local6 = this.aClass330_68;
		synchronized (this.aClass330_68) {
			this.aClass330_68.method7688();
		}
	}
}
