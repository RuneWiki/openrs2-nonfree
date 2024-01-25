import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public static int anInt9318;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_117 = new Class186(30, -1);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(JJ)J")
	public static long method7854(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!kda;B)I")
	public static int method7856(@OriginalArg(0) Class160 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4213(Static355.anInt1773)) {
			local5++;
		}
		if (arg0.method4213(Static389.anInt6795)) {
			local5++;
		}
		return local5;
	}
}
