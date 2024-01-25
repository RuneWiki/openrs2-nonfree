import java.lang.reflect.Field;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "Lclient!ow;")
	public static Class271 aClass271_58 = new Class271();

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IB)Z")
	public static boolean method8347(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)I")
	public static int method8349() {
		@Pc(12) int local12 = 0;
		@Pc(22) Field[] local22 = w.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local22.length; local26++) {
			@Pc(32) Field local32 = local22[local26];
			if (wc.class.isAssignableFrom(local32.getType())) {
				local12++;
			}
		}
		return local12 + 1;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)[B")
	public static byte[] method8350(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub1_Sub1 local17 = (Class2_Sub1_Sub1) Static91.aClass42_1.method1177((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(57) int local57 = Static17.method7641(local50, local28);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local50];
				local22[local50] = local22[511 - local43] = local61;
			}
			local17 = new Class2_Sub1_Sub1(local22);
			Static91.aClass42_1.method1175(local17, (long) arg0);
		}
		return local17.aByteArray1;
	}
}
