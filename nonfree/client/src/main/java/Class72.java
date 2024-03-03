import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class72 {

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_10 = new Class98(32);

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_73 = new Class145(46, 2);

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!h;")
	public static final Class89 aClass89_83 = new Class89(49, -1);

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!h;")
	public static final Class89 aClass89_84 = new Class89(52, 9);

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!hu;")
	private final Class98 aClass98_11 = new Class98(64);

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public int anInt2057 = 0;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!r;")
	private final Class197 aClass197_22;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public final int anInt2056;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 149)
	public Class72(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_22 = arg2;
		this.anInt2056 = this.aClass197_22.method5082(4);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V", line = 7)
	public void method2104() {
		@Pc(10) Class98 local10 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2617(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 26)
	public void method2105() {
		@Pc(6) Class98 local6 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2616();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lclient!mg;", line = 52)
	public Class148 method2107(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_11;
		@Pc(16) Class148 local16;
		synchronized (this.aClass98_11) {
			local16 = (Class148) this.aClass98_11.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass197_22.method5090(arg0, 4);
		local16 = new Class148();
		local16.aClass72_4 = this;
		local16.anInt3752 = arg0;
		if (local41 != null) {
			local16.method3719(new Class2_Sub4(local41));
		}
		local16.method3717();
		@Pc(66) Class98 local66 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2626((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 124)
	public void method2110() {
		@Pc(6) Class98 local6 = this.aClass98_11;
		synchronized (this.aClass98_11) {
			this.aClass98_11.method2623();
		}
	}
}
