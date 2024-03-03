import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class104 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static final int anInt2705 = 1403;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "[S")
	public static short[] aShortArray53 = new short[256];

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public static int anInt2714 = -1;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_103 = new Class145(73, 7);

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "Lclient!hu;")
	private Class98 aClass98_19 = new Class98(64);

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!hu;")
	public Class98 aClass98_20 = new Class98(64);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!r;")
	public final Class197 aClass197_39;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!r;")
	private final Class197 aClass197_40;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V", line = 194)
	public Class104(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class197 arg3) {
		this.aClass197_39 = arg3;
		this.aClass197_40 = arg2;
		this.aClass197_40.method5082(34);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)V", line = 22)
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass98_19 = new Class98(arg0);
		this.aClass98_20 = new Class98(arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 52)
	public void method2706() {
		@Pc(6) Class98 local6 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2617(5);
		}
		local6 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2617(5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 69)
	public void method2707() {
		@Pc(2) Class98 local2 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2623();
		}
		local2 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2623();
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V", line = 122)
	public void method2709() {
		@Pc(8) Class98 local8 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2616();
		}
		local8 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2616();
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!md;", line = 144)
	public Class146 method2710(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_19;
		@Pc(16) Class146 local16;
		synchronized (this.aClass98_19) {
			local16 = (Class146) this.aClass98_19.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_40.method5090(arg0, 34);
		local16 = new Class146();
		local16.aClass104_1 = this;
		if (local33 != null) {
			local16.method3707(new Class2_Sub4(local33));
		}
		@Pc(52) Class98 local52 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2626((long) arg0, local16);
			return local16;
		}
	}
}
