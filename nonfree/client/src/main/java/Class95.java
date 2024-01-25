import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class95 {

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	private volatile int anInt1904;

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "Lclient!tq;")
	private Class334 aClass334_1;

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "Lclient!eba;")
	private final Class98 aClass98_3 = new Class98();

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString34;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class95(@OriginalArg(0) String arg0) {
		this.aString34 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z")
	public boolean method1676() {
		return this.anInt1904 == 0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!df;)V")
	public void method1678(@OriginalArg(1) Class8_Sub1 arg0) {
		arg0.aBoolean770 = false;
		@Pc(18) Class98 local18 = this.aClass98_3;
		synchronized (this.aClass98_3) {
			this.aClass98_3.method1780(arg0);
			this.anInt1904++;
		}
		if (this.aClass334_1 != null) {
			@Pc(43) Class334 local43 = this.aClass334_1;
			synchronized (this.aClass334_1) {
				this.aClass334_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!hm;)V")
	public void method1680(@OriginalArg(1) Class8_Sub4 arg0) {
		@Pc(6) Class98 local6 = this.aClass98_3;
		synchronized (this.aClass98_3) {
			this.aClass98_3.method1780(arg0);
			this.anInt1904++;
		}
		if (this.aClass334_1 != null) {
			@Pc(31) Class334 local31 = this.aClass334_1;
			synchronized (this.aClass334_1) {
				this.aClass334_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!tq;B)V")
	public void method1681(@OriginalArg(0) Class334 arg0) {
		this.aClass334_1 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Lclient!te;")
	public Class8 method1684() {
		@Pc(8) Class98 local8 = this.aClass98_3;
		synchronized (this.aClass98_3) {
			@Pc(15) Class8 local15 = this.aClass98_3.method1777();
			local15.method8893();
			this.anInt1904--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!df;B)V")
	public void method1685(@OriginalArg(0) Class8_Sub1 arg0) {
		arg0.aBoolean770 = true;
		@Pc(16) Class98 local16 = this.aClass98_3;
		synchronized (this.aClass98_3) {
			this.aClass98_3.method1780(arg0);
			this.anInt1904++;
		}
		if (this.aClass334_1 != null) {
			@Pc(41) Class334 local41 = this.aClass334_1;
			synchronized (this.aClass334_1) {
				this.aClass334_1.notify();
			}
		}
	}
}
