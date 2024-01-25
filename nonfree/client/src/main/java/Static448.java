import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt7362;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!um;")
	public static Class243 aClass243_248;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public static int anInt7370;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean495 = true;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5905(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) long local32 = arg0; local32 != 0L; local32 /= 37L) {
				local30++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static63.aCharArray1[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!aa;II)Lclient!jf;")
	public static Class122 method5906(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class122 local9;
		if (Static262.aClass122_2 == null) {
			local9 = new Class122();
		} else {
			local9 = Static262.aClass122_2;
			Static262.aClass122_2 = Static262.aClass122_2.aClass122_1;
			Static306.anInt2308--;
			local9.aClass122_1 = null;
		}
		local9.aClass2_Sub1_1 = arg0;
		local9.anInt3227 = arg1;
		return local9;
	}
}
