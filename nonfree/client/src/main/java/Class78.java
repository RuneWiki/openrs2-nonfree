import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class78 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!pja;")
	private final Class279 aClass279_11 = new Class279(64);

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!gj;")
	private final Class143 aClass143_23;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!gj;")
	private final Class143 aClass143_22;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(ILclient!gj;Lclient!gj;)V")
	public Class78(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_23 = arg1;
		this.aClass143_22 = arg2;
		if (this.aClass143_23 != null) {
			this.aClass143_23.method3123(0);
		}
		if (this.aClass143_22 != null) {
			this.aClass143_22.method3123(0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lclient!tj;")
	public Class3_Sub6_Sub19 method2042(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub6_Sub19 local11 = (Class3_Sub6_Sub19) this.aClass279_11.method6631((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass143_23.method3125(arg0, 0);
		} else {
			local33 = this.aClass143_22.method3125(arg0 & 0x7FFF, 0);
		}
		local11 = new Class3_Sub6_Sub19();
		if (local33 != null) {
			local11.method7772(new Class3_Sub17(local33));
		}
		if (arg0 >= 32768) {
			local11.method7764();
		}
		this.aClass279_11.method6635(local11, (long) arg0);
		return local11;
	}
}
