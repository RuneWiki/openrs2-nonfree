import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
	public static int anInt8280;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_32 = new Class222(16);

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
	public static int anInt8281 = 1;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLjava/io/File;Z)V")
	public static void method6950(@OriginalArg(1) File arg0) {
		if (Static558.anObject16 == null) {
			Static41.method841();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local14.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static558.anObject16, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)Z")
	public static boolean method6951(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(JZ)V")
	public static void method6956(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static215.anInt4487;
		@Pc(13) int local13 = Static61.anInt1274;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (Static85.anInt1773 != local11) {
			local25 = local11 - Static85.anInt1773;
			local33 = (int) ((long) local25 * arg0 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local33 < local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local25 < local33) {
				local33 = local25;
			}
			Static85.anInt1773 += local33;
		}
		Static189.aFloat109 += (float) arg0 * Static293.aFloat128 / 40.0F * 8.0F;
		Static378.aFloat160 += Static440.aFloat192 * (float) arg0 / 40.0F * 8.0F;
		if (Static57.anInt1181 != local13) {
			local25 = local13 - Static57.anInt1181;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local33 < local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local25 < local33) {
				local33 = local25;
			}
			Static57.anInt1181 += local33;
		}
		Static475.method7381();
	}
}
