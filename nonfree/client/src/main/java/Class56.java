import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class56 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Lclient!fr;")
	private final Class91 aClass91_21 = new Class91(64);

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Lclient!qs;")
	private final Class211 aClass211_22;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public final int anInt1921;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class56(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_22 = arg2;
		this.anInt1921 = this.aClass211_22.method4772(19);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lclient!lk;")
	public Class156 method1400(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_21;
		@Pc(16) Class156 local16;
		synchronized (this.aClass91_21) {
			local16 = (Class156) this.aClass91_21.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_22;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_22) {
			local38 = this.aClass211_22.method4758(arg0, 19);
		}
		local16 = new Class156();
		if (local38 != null) {
			local16.method3564(new Class1_Sub3(local38));
		}
		@Pc(65) Class91 local65 = this.aClass91_21;
		synchronized (this.aClass91_21) {
			this.aClass91_21.method1990(local16, (long) arg0);
			return local16;
		}
	}
}
