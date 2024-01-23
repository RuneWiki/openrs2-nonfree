import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Lclient!fh;")
	public static Class58 aClass58_35;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!mc;")
	public static Class4_Sub16 aClass4_Sub16_2 = new Class4_Sub16(0, 0);

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	public static int anInt1121 = 1;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public static void method933() {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			Static85.aBooleanArray8[local15] = true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Lclient!hi;")
	public static Class80 method935(@OriginalArg(1) int arg0) {
		@Pc(17) Class80 local17 = (Class80) Static133.aClass26_26.method518((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(29) byte[] local29 = Static265.aClass58_94.method1372(16, arg0);
		local17 = new Class80();
		if (local29 != null) {
			local17.method1748(new Class4_Sub10(local29));
		}
		Static133.aClass26_26.method510(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBIII)Lclient!eh;")
	public static Class47 method936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(39) long local39 = (long) arg2 & 0xFFFFL | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16;
		@Pc(45) Class47 local45 = (Class47) Static66.aClass26_11.method518(local39);
		if (local45 != null) {
			return local45;
		}
		@Pc(52) Class107[] local52 = null;
		@Pc(56) Class148 local56 = Static287.method4401(arg2);
		if (local56.anIntArray466 != null) {
			local52 = new Class107[local56.anIntArray466.length];
			for (@Pc(68) int local68 = 0; local68 < local52.length; local68++) {
				@Pc(83) Class156 local83 = Static308.method4768(local56.anIntArray466[local68]);
				local52[local68] = new Class107(local83.anInt4707, local83.anInt4699, local83.anInt4697, local83.anInt4698, local83.anInt4701, local83.anInt4708, local83.anInt4704, local83.aBoolean328);
			}
		}
		local45 = new Class47(local56.anInt4406, local52, local56.anInt4400, arg0, arg1, arg3);
		Static66.aClass26_11.method510(local45, local39);
		return local45;
	}
}
