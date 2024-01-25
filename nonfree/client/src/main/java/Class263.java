import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class263 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public int anInt7601 = 0;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public int anInt7600 = 0;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!pja;")
	private final Class279 aClass279_40 = new Class279(64);

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Lclient!pu;")
	private Interface21 anInterface21_1 = null;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_107;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!gj;")
	private final Class143 aClass143_106;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILclient!gj;Lclient!gj;Lclient!pu;)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Interface21 arg3) {
		this.anInterface21_1 = arg3;
		this.aClass143_107 = arg1;
		this.aClass143_106 = arg2;
		if (this.aClass143_107 != null) {
			this.anInt7601 = this.aClass143_107.method3123(1);
		}
		if (this.aClass143_106 != null) {
			this.anInt7600 = this.aClass143_106.method3123(1);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!bda;")
	public Class3_Sub6_Sub1 method6363(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub6_Sub1 local11 = (Class3_Sub6_Sub1) this.aClass279_40.method6631((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(36) byte[] local36;
		if (arg0 >= 32768) {
			local36 = this.aClass143_106.method3125(arg0 & 0x7FFF, 1);
		} else {
			local36 = this.aClass143_107.method3125(arg0, 1);
		}
		local11 = new Class3_Sub6_Sub1();
		local11.aClass263_1 = this;
		if (local36 != null) {
			local11.method1167(new Class3_Sub17(local36));
		}
		if (arg0 >= 32768) {
			local11.method1168();
		}
		this.aClass279_40.method6635(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(JBLclient!wg;[I)Ljava/lang/String;")
	public String method6367(@OriginalArg(0) long arg0, @OriginalArg(2) Class387 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface21_1 != null) {
			@Pc(14) String local14 = this.anInterface21_1.method2094(arg0, arg2, arg1);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}
}
