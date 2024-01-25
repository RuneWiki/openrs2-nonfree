import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "Lclient!bi;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "Lclient!kr;")
	public static Class171 aClass171_59;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "S")
	public static short aShort45 = 1;

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	public static void method2421() {
		@Pc(7) Class177 local7 = null;
		try {
			@Pc(13) Class157 local13 = Static466.aClass102_4.method2388(false, "3");
			while (local13.anInt4742 == 0) {
				Static209.method3565(1L);
			}
			if (local13.anInt4742 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class177) local13.anObject12;
			@Pc(50) byte[] local50 = new byte[(int) local7.method4410()];
			if (local50.length == 0) {
				Static58.aString7 = "";
				Static6.aString3 = "";
			} else {
				@Pc(74) int local74;
				for (@Pc(61) int local61 = 0; local61 < local50.length; local61 += local74) {
					local74 = local7.method4406(local50.length - local61, local50, local61);
					if (local74 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(95) Class1_Sub6 local95 = new Class1_Sub6(local50);
				@Pc(99) int local99 = local95.method3922();
				if (local99 > 50) {
					throw new RuntimeException("Bad length");
				}
				local95.anInt4555 = local99 + 1;
				if (!local95.method3947()) {
					throw new RuntimeException("Invalid CRC");
				}
				local95.anInt4555 = 1;
				@Pc(130) int local130 = local95.method3922();
				if (local130 > 1) {
					throw new RuntimeException("Invalid version " + local130);
				}
				Static6.aString3 = local95.method3915();
				Static58.aString7 = local95.method3915();
				if (local130 >= 1) {
					Static534.anInt9008 = local95.method3967();
				} else {
					Static534.anInt9008 = Static543.anInt9158;
				}
			}
		} catch (@Pc(169) Exception local169) {
			Static58.aString7 = "";
			Static6.aString3 = "";
		}
		try {
			if (local7 != null) {
				local7.method4411();
			}
		} catch (@Pc(180) Exception local180) {
		}
	}
}
