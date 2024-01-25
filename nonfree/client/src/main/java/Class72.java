import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class72 {

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Lclient!fa;")
	private final Class68 aClass68_10 = new Class68(256);

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_26;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class72(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_26 = arg2;
		this.aClass76_26.method2108(26);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	public void method1984() {
		@Pc(6) Class68 local6 = this.aClass68_10;
		synchronized (this.aClass68_10) {
			this.aClass68_10.method1777();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
	public void method1985() {
		@Pc(10) Class68 local10 = this.aClass68_10;
		synchronized (this.aClass68_10) {
			this.aClass68_10.method1788(5);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public void method1987() {
		@Pc(10) Class68 local10 = this.aClass68_10;
		synchronized (this.aClass68_10) {
			this.aClass68_10.method1791();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lclient!rk;")
	public Class4_Sub1_Sub18 method1988(@OriginalArg(0) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_10;
		@Pc(16) Class4_Sub1_Sub18 local16;
		synchronized (this.aClass68_10) {
			local16 = (Class4_Sub1_Sub18) this.aClass68_10.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) byte[] local35 = this.aClass76_26.method2104(arg0, 26);
		local16 = new Class4_Sub1_Sub18();
		if (local35 != null) {
			local16.method4668(new Class4_Sub12(local35));
		}
		@Pc(51) Class68 local51 = this.aClass68_10;
		synchronized (this.aClass68_10) {
			this.aClass68_10.method1779((long) arg0, local16);
			return local16;
		}
	}
}
