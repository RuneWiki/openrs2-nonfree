import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class78 {

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Lclient!vh;")
	private final Class330 aClass330_15 = new Class330(64);

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "Lclient!pj;")
	private final Class248 aClass248_17;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
	public final int anInt1848;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class78(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_17 = arg2;
		if (this.aClass248_17 == null) {
			this.anInt1848 = 0;
		} else {
			this.anInt1848 = this.aClass248_17.method5793(16);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public void method1669() {
		@Pc(6) Class330 local6 = this.aClass330_15;
		synchronized (this.aClass330_15) {
			this.aClass330_15.method7688();
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
	public void method1671() {
		@Pc(6) Class330 local6 = this.aClass330_15;
		synchronized (this.aClass330_15) {
			this.aClass330_15.method7678();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
	public void method1672() {
		@Pc(2) Class330 local2 = this.aClass330_15;
		synchronized (this.aClass330_15) {
			this.aClass330_15.method7680(5);
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)Lclient!fp;")
	public Class110 method1673(@OriginalArg(0) int arg0) {
		@Pc(11) Class330 local11 = this.aClass330_15;
		@Pc(21) Class110 local21;
		synchronized (this.aClass330_15) {
			local21 = (Class110) this.aClass330_15.method7677((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class248 local34 = this.aClass248_17;
		@Pc(43) byte[] local43;
		synchronized (this.aClass248_17) {
			local43 = this.aClass248_17.method5797(16, arg0);
		}
		local21 = new Class110();
		if (local43 != null) {
			local21.method2460(new Class6_Sub12(local43));
		}
		@Pc(65) Class330 local65 = this.aClass330_15;
		synchronized (this.aClass330_15) {
			this.aClass330_15.method7676(local21, (long) arg0);
			return local21;
		}
	}
}
