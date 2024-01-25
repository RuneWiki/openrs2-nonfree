import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class93 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!fa;")
	private final Class68 aClass68_13 = new Class68(64);

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_36;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public final int anInt2890;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class93(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_36 = arg2;
		this.anInt2890 = this.aClass76_36.method2108(19);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!uh;")
	public Class237 method2430(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_13;
		@Pc(16) Class237 local16;
		synchronized (this.aClass68_13) {
			local16 = (Class237) this.aClass68_13.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass76_36.method2104(arg0, 19);
		local16 = new Class237();
		if (local33 != null) {
			local16.method5214(new Class4_Sub12(local33));
		}
		@Pc(54) Class68 local54 = this.aClass68_13;
		synchronized (this.aClass68_13) {
			this.aClass68_13.method1779((long) arg0, local16);
			return local16;
		}
	}
}
