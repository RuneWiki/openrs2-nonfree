import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	public static int anInt6616;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_46 = new Class269(12, 6);

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	public static int anInt6617 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!ug;I)Ljava/lang/String;")
	public static String method5182(@OriginalArg(1) Class1_Sub28 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5392();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt6812 += Static453.aClass239_1.method5181(local19, arg0.anInt6812, local7, 0, arg0.aByteArray86);
			return Static312.method4243(local7, 0, local19);
		} catch (@Pc(52) Exception local52) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5183(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
