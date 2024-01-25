import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class55 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Lclient!fa;")
	private final Class68 aClass68_5 = new Class68(64);

	@OriginalMember(owner = "client!du", name = "l", descriptor = "Lclient!fa;")
	private final Class68 aClass68_6 = new Class68(100);

	@OriginalMember(owner = "client!du", name = "g", descriptor = "Lclient!fs;")
	private final Class76 aClass76_21;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;Lclient!fs;Lclient!fs;)V")
	public Class55(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) Class76 arg4) {
		this.aClass76_21 = arg2;
		if (this.aClass76_21 != null) {
			@Pc(26) int local26 = this.aClass76_21.method2100() - 1;
			this.aClass76_21.method2108(local26);
		}
		Static317.method4234(arg3, arg4);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Lclient!pt;")
	public Class4_Sub1_Sub17 method1391(@OriginalArg(0) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_6;
		@Pc(22) Class4_Sub1_Sub17 local22;
		synchronized (this.aClass68_6) {
			local22 = (Class4_Sub1_Sub17) this.aClass68_6.method1787((long) arg0);
			if (local22 == null) {
				local22 = new Class4_Sub1_Sub17(arg0);
				this.aClass68_6.method1779((long) arg0, local22);
			}
		}
		synchronized (local22) {
			return local22.method4211() ? local22 : null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public void method1392() {
		@Pc(2) Class68 local2 = this.aClass68_5;
		synchronized (this.aClass68_5) {
			this.aClass68_5.method1791();
		}
		local2 = this.aClass68_6;
		synchronized (this.aClass68_6) {
			this.aClass68_6.method1791();
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(II)V")
	public void method1394() {
		@Pc(10) Class68 local10 = this.aClass68_5;
		synchronized (this.aClass68_5) {
			this.aClass68_5.method1788(5);
		}
		local10 = this.aClass68_6;
		synchronized (this.aClass68_6) {
			this.aClass68_6.method1788(5);
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public void method1396() {
		@Pc(6) Class68 local6 = this.aClass68_5;
		synchronized (this.aClass68_5) {
			this.aClass68_5.method1777();
		}
		local6 = this.aClass68_6;
		synchronized (this.aClass68_6) {
			this.aClass68_6.method1777();
		}
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(II)Lclient!lp;")
	public Class138 method1397(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_5;
		@Pc(16) Class138 local16;
		synchronized (this.aClass68_5) {
			local16 = (Class138) this.aClass68_5.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass76_21.method2104(Static127.method2266(arg0), Static132.method2318(arg0));
		local16 = new Class138();
		local16.anInt4411 = arg0;
		local16.aClass55_2 = this;
		if (local37 != null) {
			local16.method3455(new Class4_Sub12(local37));
		}
		local16.method3460();
		@Pc(68) Class68 local68 = this.aClass68_5;
		synchronized (this.aClass68_5) {
			this.aClass68_5.method1779((long) arg0, local16);
			return local16;
		}
	}
}
