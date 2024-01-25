import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class127 {

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public int anInt3986 = 0;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public int anInt3987 = 0;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!fr;")
	private final Class91 aClass91_54 = new Class91(64);

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!su;")
	private Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!qs;")
	private final Class211 aClass211_47;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!qs;")
	private final Class211 aClass211_48;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(ILclient!qs;Lclient!qs;Lclient!su;)V")
	public Class127(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Interface11 arg3) {
		this.anInterface11_1 = arg3;
		this.aClass211_47 = arg1;
		this.aClass211_48 = arg2;
		if (this.aClass211_47 != null) {
			this.anInt3986 = this.aClass211_47.method4772(1);
		}
		if (this.aClass211_48 != null) {
			this.anInt3987 = this.aClass211_48.method4772(1);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Lclient!r;")
	public Class1_Sub1_Sub13 method3086(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub13 local11 = (Class1_Sub1_Sub13) this.aClass91_54.method1988((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass211_48.method4758(arg0 & 0x7FFF, 1);
		} else {
			local29 = this.aClass211_47.method4758(arg0, 1);
		}
		local11 = new Class1_Sub1_Sub13();
		local11.aClass127_1 = this;
		if (local29 != null) {
			local11.method4834(new Class1_Sub3(local29));
		}
		if (arg0 >= 32768) {
			local11.method4832();
		}
		this.aClass91_54.method1990(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(J[IBLclient!rr;)Ljava/lang/String;")
	public String method3087(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class220 arg2) {
		if (this.anInterface11_1 != null) {
			@Pc(14) String local14 = this.anInterface11_1.method4408(arg1, arg2, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}
}
