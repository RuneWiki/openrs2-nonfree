import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class262 {

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public int anInt7191;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Z")
	public boolean aBoolean678 = false;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!fa;")
	private Class68 aClass68_54 = new Class68(64);

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Lclient!fa;")
	public final Class68 aClass68_55 = new Class68(500);

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!fa;")
	public final Class68 aClass68_56 = new Class68(30);

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "Lclient!fa;")
	public final Class68 aClass68_57 = new Class68(50);

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Lclient!fs;")
	private final Class76 aClass76_101;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Z")
	public boolean aBoolean677;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!fs;")
	public final Class76 aClass76_100;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!jk;IZLclient!fs;Lclient!fs;)V")
	public Class262(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) Class76 arg4) {
		this.aClass76_101 = arg3;
		this.aBoolean677 = arg2;
		this.aClass76_100 = arg4;
		if (this.aClass76_101 != null) {
			@Pc(47) int local47 = this.aClass76_101.method2100() - 1;
			this.aClass76_101.method2108(local47);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public void method5555() {
		@Pc(6) Class68 local6 = this.aClass68_54;
		synchronized (this.aClass68_54) {
			this.aClass68_54.method1777();
		}
		local6 = this.aClass68_55;
		synchronized (this.aClass68_55) {
			this.aClass68_55.method1777();
		}
		local6 = this.aClass68_56;
		synchronized (this.aClass68_56) {
			this.aClass68_56.method1777();
		}
		local6 = this.aClass68_57;
		synchronized (this.aClass68_57) {
			this.aClass68_57.method1777();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public void method5556() {
		@Pc(2) Class68 local2 = this.aClass68_54;
		synchronized (this.aClass68_54) {
			this.aClass68_54.method1788(5);
		}
		local2 = this.aClass68_55;
		synchronized (this.aClass68_55) {
			this.aClass68_55.method1788(5);
		}
		local2 = this.aClass68_56;
		synchronized (this.aClass68_56) {
			this.aClass68_56.method1788(5);
		}
		local2 = this.aClass68_57;
		synchronized (this.aClass68_57) {
			this.aClass68_57.method1788(5);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	public void method5557() {
		@Pc(6) Class68 local6 = this.aClass68_54;
		synchronized (this.aClass68_54) {
			this.aClass68_54.method1791();
		}
		local6 = this.aClass68_55;
		synchronized (this.aClass68_55) {
			this.aClass68_55.method1791();
		}
		local6 = this.aClass68_56;
		synchronized (this.aClass68_56) {
			this.aClass68_56.method1791();
		}
		local6 = this.aClass68_57;
		synchronized (this.aClass68_57) {
			this.aClass68_57.method1791();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
	public void method5558(@OriginalArg(0) int arg0) {
		this.anInt7191 = arg0;
		@Pc(9) Class68 local9 = this.aClass68_55;
		synchronized (this.aClass68_55) {
			this.aClass68_55.method1777();
		}
		local9 = this.aClass68_56;
		synchronized (this.aClass68_56) {
			this.aClass68_56.method1777();
		}
		local9 = this.aClass68_57;
		synchronized (this.aClass68_57) {
			this.aClass68_57.method1777();
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Lclient!rd;")
	public Class202 method5560(@OriginalArg(0) int arg0) {
		@Pc(10) Class68 local10 = this.aClass68_54;
		@Pc(20) Class202 local20;
		synchronized (this.aClass68_54) {
			local20 = (Class202) this.aClass68_54.method1787((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(41) byte[] local41 = this.aClass76_101.method2104(Static27.method523(arg0), Static306.method4142(arg0));
		local20 = new Class202();
		local20.aClass262_4 = this;
		local20.anInt5823 = arg0;
		if (local41 != null) {
			local20.method4596(new Class4_Sub12(local41));
		}
		local20.method4581();
		if (!this.aBoolean677 && local20.aBoolean532) {
			local20.aStringArray28 = null;
			local20.anIntArray408 = null;
		}
		if (local20.aBoolean525) {
			local20.anInt5851 = 0;
			local20.aBoolean534 = false;
		}
		@Pc(87) Class68 local87 = this.aClass68_54;
		synchronized (this.aClass68_54) {
			this.aClass68_54.method1779((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BZ)V")
	public void method5562(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean678) {
			this.aBoolean678 = arg0;
			this.method5555();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZB)V")
	public void method5564(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean677) {
			this.aBoolean677 = arg0;
			this.method5555();
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)V")
	public void method5565(@OriginalArg(1) int arg0) {
		this.aClass68_54 = new Class68(arg0);
	}
}
