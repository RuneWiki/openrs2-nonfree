import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class225 {

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Lclient!qc;")
	private final Class231 aClass231_55 = new Class231(64);

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_107;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class225(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_107 = arg2;
		if (this.aClass53_107 != null) {
			this.aClass53_107.method1592(35);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Lclient!uk;")
	public Class285 method5907(@OriginalArg(0) int arg0) {
		@Pc(12) Class231 local12 = this.aClass231_55;
		@Pc(22) Class285 local22;
		synchronized (this.aClass231_55) {
			local22 = (Class285) this.aClass231_55.method6228((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class53 local35 = this.aClass53_107;
		@Pc(44) byte[] local44;
		synchronized (this.aClass53_107) {
			local44 = this.aClass53_107.method1616(arg0, 35);
		}
		local22 = new Class285();
		if (local44 != null) {
			local22.method7226(new Class2_Sub29(local44));
		}
		local22.method7224();
		@Pc(69) Class231 local69 = this.aClass231_55;
		synchronized (this.aClass231_55) {
			this.aClass231_55.method6232(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(II)V")
	public void method5909() {
		@Pc(2) Class231 local2 = this.aClass231_55;
		synchronized (this.aClass231_55) {
			this.aClass231_55.method6231(5);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public void method5910() {
		@Pc(9) Class231 local9 = this.aClass231_55;
		synchronized (this.aClass231_55) {
			this.aClass231_55.method6227();
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	public void method5911() {
		@Pc(6) Class231 local6 = this.aClass231_55;
		synchronized (this.aClass231_55) {
			this.aClass231_55.method6240();
		}
	}
}
