import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class219 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_127 = new Class4(512);

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_222 = new Class145(77, -1);

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int anInt6097 = 0;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	public int anInt6096;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!hu;")
	private final Class98 aClass98_53 = new Class98(64);

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!hu;")
	public final Class98 aClass98_54 = new Class98(50);

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!hu;")
	public final Class98 aClass98_55 = new Class98(5);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!r;")
	private final Class197 aClass197_87;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!r;")
	public final Class197 aClass197_88;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!dn;IZLclient!r;Lclient!r;)V", line = 767)
	public Class219(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class197 arg3, @OriginalArg(4) Class197 arg4) {
		this.aClass197_87 = arg3;
		this.aClass197_88 = arg4;
		this.aBoolean410 = arg2;
		if (this.aClass197_87 != null) {
			@Pc(38) int local38 = this.aClass197_87.method5093() - 1;
			this.aClass197_87.method5082(local38);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!fk;", line = 5)
	public Class71 method5571(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_53;
		@Pc(16) Class71 local16;
		synchronized (this.aClass98_53) {
			local16 = (Class71) this.aClass98_53.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass197_87.method5090(Static324.method5832(arg0), Static61.method1734(arg0));
		local16 = new Class71();
		local16.aClass219_2 = this;
		local16.anInt2045 = arg0;
		if (local37 != null) {
			local16.method2099(new Class2_Sub4(local37));
		}
		local16.method2091();
		@Pc(67) Class98 local67 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.method2626((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 38)
	public void method5572() {
		@Pc(2) Class98 local2 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.method2616();
		}
		local2 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2616();
		}
		local2 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2616();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 60)
	public void method5573() {
		@Pc(6) Class98 local6 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2616();
		}
		local6 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2616();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V", line = 76)
	public void method5574(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean410) {
			this.aBoolean410 = arg0;
			this.method5572();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V", line = 550)
	public void method5576() {
		@Pc(2) Class98 local2 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.method2617(5);
		}
		local2 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2617(5);
		}
		local2 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2617(5);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V", line = 717)
	public void method5579(@OriginalArg(1) int arg0) {
		this.anInt6096 = arg0;
		@Pc(9) Class98 local9 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2616();
		}
		local9 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2616();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 736)
	public void method5580() {
		@Pc(2) Class98 local2 = this.aClass98_53;
		synchronized (this.aClass98_53) {
			this.aClass98_53.method2623();
		}
		local2 = this.aClass98_54;
		synchronized (this.aClass98_54) {
			this.aClass98_54.method2623();
		}
		local2 = this.aClass98_55;
		synchronized (this.aClass98_55) {
			this.aClass98_55.method2623();
		}
	}
}
