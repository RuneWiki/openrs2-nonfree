import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class15 {

	@OriginalMember(owner = "client!at", name = "q", descriptor = "[Lclient!hp;")
	private static final Class108[] aClass108Array1 = new Class108[32];

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!ff;")
	private final Class83 aClass83_2 = new Class83(128);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!vh;")
	private final Class250 aClass250_5;

	static {
		@Pc(77) Class108[] local77 = Static15.method2738();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass108Array1[local77[local79].anInt2675] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class15(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_5 = arg2;
		if (this.aClass250_5 != null) {
			@Pc(20) int local20 = this.aClass250_5.method5666() - 1;
			this.aClass250_5.method5653(local20);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Lclient!da;")
	public Class46 method387(@OriginalArg(0) int arg0) {
		@Pc(11) Class83 local11 = this.aClass83_2;
		@Pc(23) Class46 local23;
		synchronized (this.aClass83_2) {
			local23 = (Class46) this.aClass83_2.method1658((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(46) byte[] local46 = this.aClass250_5.method5667(Static88.method1467(arg0), Static240.method3551(arg0));
		local23 = new Class46();
		if (local46 != null) {
			local23.method1128(new Class1_Sub1(local46));
		}
		@Pc(62) Class83 local62 = this.aClass83_2;
		synchronized (this.aClass83_2) {
			this.aClass83_2.method1675((long) arg0, local23);
			return local23;
		}
	}
}
