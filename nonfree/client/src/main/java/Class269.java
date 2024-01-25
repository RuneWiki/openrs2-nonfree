import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class269 {

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!sw;")
	private final Class277 aClass277_61 = new Class277(64);

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!dn;")
	private final Class69 aClass69_85;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public final int anInt7889;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class269(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_85 = arg2;
		this.anInt7889 = this.aClass69_85.method1884(19);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(IB)Lclient!rh;")
	public Class253 method6972(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_61;
		@Pc(16) Class253 local16;
		synchronized (this.aClass277_61) {
			local16 = (Class253) this.aClass277_61.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_85;
		@Pc(38) byte[] local38;
		synchronized (this.aClass69_85) {
			local38 = this.aClass69_85.method1888(arg0, 19);
		}
		local16 = new Class253();
		if (local38 != null) {
			local16.method6578(new Class1_Sub17(local38));
		}
		@Pc(60) Class277 local60 = this.aClass277_61;
		synchronized (this.aClass277_61) {
			this.aClass277_61.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
