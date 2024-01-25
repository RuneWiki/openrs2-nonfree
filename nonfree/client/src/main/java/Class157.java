import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class157 {

	@OriginalMember(owner = "client!ija", name = "g", descriptor = "Lclient!jda;")
	private final Class165 aClass165_32 = new Class165(64);

	@OriginalMember(owner = "client!ija", name = "e", descriptor = "Lclient!aj;")
	private final Class15 aClass15_71;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class157(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_71 = arg2;
		this.aClass15_71.method512(5);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(BI)Lclient!ep;")
	public Class3_Sub11_Sub5 method4136(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_32;
		@Pc(16) Class3_Sub11_Sub5 local16;
		synchronized (this.aClass165_32) {
			local16 = (Class3_Sub11_Sub5) this.aClass165_32.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass15_71) {
			local38 = this.aClass15_71.method517(arg0, 5);
		}
		local16 = new Class3_Sub11_Sub5();
		if (local38 != null) {
			local16.method2621(new Class3_Sub25(local38));
		}
		@Pc(65) Class165 local65 = this.aClass165_32;
		synchronized (this.aClass165_32) {
			this.aClass165_32.method4392(local16, (long) arg0);
			return local16;
		}
	}
}
