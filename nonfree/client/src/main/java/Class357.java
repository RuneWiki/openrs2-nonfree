import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class357 {

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "Lclient!mf;")
	private final Class222 aClass222_63 = new Class222(64);

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "Lclient!pu;")
	private final Class270 aClass270_120;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class357(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_120 = arg2;
		this.aClass270_120.method5685(5);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Lclient!ts;")
	public Class1_Sub6_Sub17 method7738(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_63;
		@Pc(16) Class1_Sub6_Sub17 local16;
		synchronized (this.aClass222_63) {
			local16 = (Class1_Sub6_Sub17) this.aClass222_63.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_120;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_120) {
			local38 = this.aClass270_120.method5704(5, arg0);
		}
		local16 = new Class1_Sub6_Sub17();
		if (local38 != null) {
			local16.method7106(new Class1_Sub35(local38));
		}
		@Pc(65) Class222 local65 = this.aClass222_63;
		synchronized (this.aClass222_63) {
			this.aClass222_63.method4434(local16, (long) arg0);
			return local16;
		}
	}
}
