import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_135 = new Class362(51, 5);

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_90 = new Class173(77, -1);

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method5297(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			for (@Pc(38) long local38 = arg0; local38 != 0L; local38 /= 37L) {
				local36++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local36);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static572.aCharArray9[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!un;B)Lclient!dga;")
	public static Class63 method5299(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(12) Class63 local12 = new Class63();
		local12.anInt2196 = arg0.method4936();
		local12.aClass4_Sub5_Sub9_1 = Static190.aClass295_1.method7021(local12.anInt2196);
		return local12;
	}
}
