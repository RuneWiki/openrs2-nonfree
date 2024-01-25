import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class68 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!d;")
	private final Class44 aClass44_20 = new Class44(64);

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!um;")
	private final Class243 aClass243_63;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "I")
	public final int anInt1804;

	static {
		new Class198("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class68(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_63 = arg2;
		this.anInt1804 = this.aClass243_63.method5472(19);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)Lclient!an;")
	public Class12 method1480(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_20;
		@Pc(18) Class12 local18;
		synchronized (this.aClass44_20) {
			local18 = (Class12) this.aClass44_20.method1028((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class243 local31 = this.aClass243_63;
		@Pc(42) byte[] local42;
		synchronized (this.aClass243_63) {
			local42 = this.aClass243_63.method5455(arg0, 19);
		}
		local18 = new Class12();
		if (local42 != null) {
			local18.method263(new Class5_Sub15(local42));
		}
		@Pc(66) Class44 local66 = this.aClass44_20;
		synchronized (this.aClass44_20) {
			this.aClass44_20.method1017((long) arg0, local18);
			return local18;
		}
	}
}
