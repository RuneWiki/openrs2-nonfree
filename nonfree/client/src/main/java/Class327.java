import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class327 {

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "Lclient!vg;")
	private final Class342 aClass342_180 = new Class342(64);

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "Lclient!ri;")
	private final Class284 aClass284_151;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class327(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_151 = arg2;
		this.aClass284_151.method6354(5);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BI)Lclient!kk;")
	public Class3_Sub7_Sub13 method7298(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_180;
		@Pc(16) Class3_Sub7_Sub13 local16;
		synchronized (this.aClass342_180) {
			local16 = (Class3_Sub7_Sub13) this.aClass342_180.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_151;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_151) {
			local38 = this.aClass284_151.method6331(5, arg0);
		}
		local16 = new Class3_Sub7_Sub13();
		if (local38 != null) {
			local16.method4299(new Class3_Sub26(local38));
		}
		@Pc(60) Class342 local60 = this.aClass342_180;
		synchronized (this.aClass342_180) {
			this.aClass342_180.method7683(local16, (long) arg0);
			return local16;
		}
	}
}
