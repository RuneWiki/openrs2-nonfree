import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class16 {

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "Lclient!qc;")
	private final Class231 aClass231_6 = new Class231(128);

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!dda;")
	private final Class53 aClass53_7;

	static {
		new Class202("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class16(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_7 = arg2;
		this.aClass53_7.method1592(1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public void method570() {
		@Pc(6) Class231 local6 = this.aClass231_6;
		synchronized (this.aClass231_6) {
			this.aClass231_6.method6227();
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	public void method571() {
		@Pc(2) Class231 local2 = this.aClass231_6;
		synchronized (this.aClass231_6) {
			this.aClass231_6.method6240();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
	public void method573() {
		@Pc(6) Class231 local6 = this.aClass231_6;
		synchronized (this.aClass231_6) {
			this.aClass231_6.method6231(5);
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)Lclient!li;")
	public Class176 method574(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_6;
		@Pc(24) Class176 local24;
		synchronized (this.aClass231_6) {
			local24 = (Class176) this.aClass231_6.method6228((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class53 local37 = this.aClass53_7;
		@Pc(46) byte[] local46;
		synchronized (this.aClass53_7) {
			local46 = this.aClass53_7.method1616(arg0, 1);
		}
		local24 = new Class176();
		if (local46 != null) {
			local24.method4354(new Class2_Sub29(local46));
		}
		@Pc(68) Class231 local68 = this.aClass231_6;
		synchronized (this.aClass231_6) {
			this.aClass231_6.method6232(local24, (long) arg0);
			return local24;
		}
	}
}
