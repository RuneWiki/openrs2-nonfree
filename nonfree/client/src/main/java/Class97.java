import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class97 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!jk;")
	private final Class137 aClass137_21 = new Class137(64);

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!qn;")
	private final Class211 aClass211_36;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!qn;")
	private final Class211 aClass211_35;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILclient!qn;Lclient!qn;)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_36 = arg1;
		this.aClass211_35 = arg2;
		if (this.aClass211_36 != null) {
			this.aClass211_36.method4365(0);
		}
		if (this.aClass211_35 != null) {
			this.aClass211_35.method4365(0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)Lclient!ol;")
	public Class4_Sub2_Sub13 method1854(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub2_Sub13 local11 = (Class4_Sub2_Sub13) this.aClass137_21.method2744((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass211_35.method4377(0, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass211_36.method4377(0, arg0);
		}
		local11 = new Class4_Sub2_Sub13();
		if (local29 != null) {
			local11.method3760(new Class4_Sub9(local29));
		}
		if (arg0 >= 32768) {
			local11.method3762();
		}
		this.aClass137_21.method2732((long) arg0, local11);
		return local11;
	}
}
