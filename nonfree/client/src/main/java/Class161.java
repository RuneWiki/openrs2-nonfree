import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class161 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "Lclient!of;")
	private final Class236 aClass236_47 = new Class236(64);

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!oh;")
	private final Class237 aClass237_68;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	public final int anInt5584;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class161(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_68 = arg2;
		if (this.aClass237_68 == null) {
			this.anInt5584 = 0;
		} else {
			this.anInt5584 = this.aClass237_68.method6315(16);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public void method4574() {
		@Pc(2) Class236 local2 = this.aClass236_47;
		synchronized (this.aClass236_47) {
			this.aClass236_47.method6253();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(BI)Lclient!tba;")
	public Class322 method4576(@OriginalArg(1) int arg0) {
		@Pc(11) Class236 local11 = this.aClass236_47;
		@Pc(21) Class322 local21;
		synchronized (this.aClass236_47) {
			local21 = (Class322) this.aClass236_47.method6242((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class237 local34 = this.aClass237_68;
		@Pc(43) byte[] local43;
		synchronized (this.aClass237_68) {
			local43 = this.aClass237_68.method6314(16, arg0);
		}
		local21 = new Class322();
		if (local43 != null) {
			local21.method7519(new Class8_Sub8(local43));
		}
		@Pc(65) Class236 local65 = this.aClass236_47;
		synchronized (this.aClass236_47) {
			this.aClass236_47.method6241((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public void method4577() {
		@Pc(10) Class236 local10 = this.aClass236_47;
		synchronized (this.aClass236_47) {
			this.aClass236_47.method6245();
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(BI)V")
	public void method4579() {
		@Pc(12) Class236 local12 = this.aClass236_47;
		synchronized (this.aClass236_47) {
			this.aClass236_47.method6243(5);
		}
	}
}
