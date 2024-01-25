import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "J")
	public static final long aLong362 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
	public static int anInt8209 = 0;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
	public static int anInt8210 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZII)Z")
	public static boolean method6811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static67.method1441(arg0, arg1) | (arg0 & 0x800) != 0 || Static515.method7050(arg0, arg1);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)Z")
	public static boolean method6814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method6815() {
		@Pc(7) Class283 local7 = null;
		try {
			@Pc(13) Class23 local13 = Static246.aClass114_10.method2514("2", true);
			while (local13.anInt875 == 0) {
				Static423.method5918(1L);
			}
			if (local13.anInt875 == 1) {
				local7 = (Class283) local13.anObject1;
				@Pc(40) byte[] local40 = new byte[(int) local7.method6491()];
				@Pc(57) int local57;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local57) {
					local57 = local7.method6490(local40.length - local42, local42, local40);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static526.method7173(new Class1_Sub20(local40));
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local7 != null) {
				local7.method6494();
			}
		} catch (@Pc(97) Exception local97) {
		}
	}
}
