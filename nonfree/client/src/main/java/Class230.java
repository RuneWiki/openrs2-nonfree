import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class230 {

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!qc;")
	private final Class231 aClass231_56 = new Class231(64);

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!dda;")
	private final Class53 aClass53_110;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public final int anInt7083;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class230(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_110 = arg2;
		if (this.aClass53_110 == null) {
			this.anInt7083 = 0;
		} else {
			this.anInt7083 = this.aClass53_110.method1592(16);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public void method6000() {
		@Pc(10) Class231 local10 = this.aClass231_56;
		synchronized (this.aClass231_56) {
			this.aClass231_56.method6240();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public void method6001() {
		@Pc(2) Class231 local2 = this.aClass231_56;
		synchronized (this.aClass231_56) {
			this.aClass231_56.method6227();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lclient!cq;")
	public Class43 method6002(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_56;
		@Pc(16) Class43 local16;
		synchronized (this.aClass231_56) {
			local16 = (Class43) this.aClass231_56.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_110;
		@Pc(38) byte[] local38;
		synchronized (this.aClass53_110) {
			local38 = this.aClass53_110.method1616(arg0, 16);
		}
		local16 = new Class43();
		if (local38 != null) {
			local16.method1458(new Class2_Sub29(local38));
		}
		@Pc(60) Class231 local60 = this.aClass231_56;
		synchronized (this.aClass231_56) {
			this.aClass231_56.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
	public void method6003() {
		@Pc(2) Class231 local2 = this.aClass231_56;
		synchronized (this.aClass231_56) {
			this.aClass231_56.method6231(5);
		}
	}
}
