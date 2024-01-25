import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class64 {

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
	public int anInt1927 = 0;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
	public int anInt1928 = 0;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!qc;")
	private final Class231 aClass231_22 = new Class231(64);

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "Lclient!rl;")
	private Interface17 anInterface17_1 = null;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_30;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "Lclient!dda;")
	private final Class53 aClass53_31;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(ILclient!dda;Lclient!dda;Lclient!rl;)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Interface17 arg3) {
		this.anInterface17_1 = arg3;
		this.aClass53_30 = arg2;
		this.aClass53_31 = arg1;
		if (this.aClass53_31 != null) {
			this.anInt1928 = this.aClass53_31.method1592(1);
		}
		if (this.aClass53_30 != null) {
			this.anInt1927 = this.aClass53_30.method1592(1);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([ILclient!rb;JB)Ljava/lang/String;")
	public String method1876(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface17_1 != null) {
			@Pc(14) String local14 = this.anInterface17_1.method7272(arg1, arg0, arg2);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Lclient!tt;")
	public Class2_Sub13_Sub17 method1878(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub13_Sub17 local16 = (Class2_Sub13_Sub17) this.aClass231_22.method6228((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = this.aClass53_30.method1616(arg0 & 0x7FFF, 1);
		} else {
			local34 = this.aClass53_31.method1616(arg0, 1);
		}
		local16 = new Class2_Sub13_Sub17();
		local16.aClass64_2 = this;
		if (local34 != null) {
			local16.method7044(new Class2_Sub29(local34));
		}
		if (arg0 >= 32768) {
			local16.method7046();
		}
		this.aClass231_22.method6232(local16, (long) arg0);
		return local16;
	}
}
