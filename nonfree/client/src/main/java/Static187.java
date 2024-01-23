import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "B")
	public static byte aByte14;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1346 = Static200.method3116("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1347 = Static200.method3116("<col=ffffff>");

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1348 = Static200.method3116("mapdots");

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "S")
	public static short aShort30 = 32767;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1349 = Static200.method3116("<)4col> x");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;)Lclient!kh;")
	public static Class60 method2924(@OriginalArg(1) String arg0) {
		@Pc(5) byte[] local5;
		try {
			local5 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(7) UnsupportedEncodingException local7) {
			local5 = arg0.getBytes();
		}
		@Pc(14) Class60 local14 = new Class60();
		local14.aByteArray34 = local5;
		local14.anInt2439 = 0;
		for (@Pc(26) int local26 = 0; local26 < local5.length; local26++) {
			if (local5[local26] != 0) {
				local5[local14.anInt2439++] = local5[local26];
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
	public static int method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub27 local12 = (Class1_Sub27) Static121.aClass33_7.method1071((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(33) int local33 = 0; local33 < local12.anIntArray657.length; local33++) {
				if (arg0 == local12.anIntArray656[local33]) {
					local23 += local12.anIntArray657[local33];
				}
			}
			return local23;
		}
	}
}
