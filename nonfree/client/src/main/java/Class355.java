import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class355 {

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "Lclient!au;")
	private final Class21 aClass21_93 = new Class21(64);

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!mv;")
	private final Class229 aClass229_127;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
	public final int anInt9331;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class355(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_127 = arg2;
		this.anInt9331 = this.aClass229_127.method4981(19);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)Lclient!hk;")
	public Class144 method7449(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_93;
		@Pc(24) Class144 local24;
		synchronized (this.aClass21_93) {
			local24 = (Class144) this.aClass21_93.method324((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class229 local37 = this.aClass229_127;
		@Pc(46) byte[] local46;
		synchronized (this.aClass229_127) {
			local46 = this.aClass229_127.method4980(19, arg0);
		}
		local24 = new Class144();
		if (local46 != null) {
			local24.method2539(new Class2_Sub7(local46));
		}
		@Pc(68) Class21 local68 = this.aClass21_93;
		synchronized (this.aClass21_93) {
			this.aClass21_93.method317(local24, (long) arg0);
			return local24;
		}
	}
}
