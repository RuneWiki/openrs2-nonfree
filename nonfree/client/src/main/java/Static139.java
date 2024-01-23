import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt2614;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	public static int anInt2621;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt2613 = -1;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString89 = "glow3:";

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt2618 = 0;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString90 = "Prepared sound engine";

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method2191() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static136.aBooleanArray10[local3] = false;
		}
		Static146.anInt2693 = -1;
		Static109.anInt2057 = 1;
		Static156.anInt1710 = 0;
		Static293.anInt5837 = -1;
		Static174.anInt3201 = 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)V")
	public static void method2192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class140 local3 = Static246.method2732(arg0);
		@Pc(10) int local10 = local3.anInt4481;
		@Pc(13) int local13 = local3.anInt4486;
		@Pc(20) int local20 = local3.anInt4489;
		@Pc(26) int local26 = Class1_Sub27.anIntArray582[local20 - local13];
		if (arg1 < 0 || local26 < arg1) {
			arg1 = 0;
		}
		local26 <<= local13;
		Static109.method1719(local10, Static236.anIntArray578[local10] & ~local26 | local26 & arg1 << local13);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ak;IBI)Z")
	public static boolean method2193(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method253(arg2, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static249.method3882(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static void method2194() {
		Static180.aClass31_26.method855();
		Static274.aClass31_40.method855();
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)[Lclient!bf;")
	public static Class1_Sub2_Sub2[] method2196() {
		@Pc(13) Class1_Sub2_Sub2[] local13 = new Class1_Sub2_Sub2[Static105.anInt1963];
		for (@Pc(15) int local15 = 0; local15 < Static105.anInt1963; local15++) {
			@Pc(30) int local30 = Static113.anIntArray273[local15] * Static49.anIntArray135[local15];
			@Pc(34) byte[] local34 = Static299.aByteArrayArray15[local15];
			@Pc(37) int[] local37 = new int[local30];
			for (@Pc(39) int local39 = 0; local39 < local30; local39++) {
				local37[local39] = Static158.anIntArray366[local34[local39] & 0xFF];
			}
			if (Static240.aBoolean369) {
				local13[local15] = new Class1_Sub2_Sub2_Sub2(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local15], Static134.anIntArray306[local15], Static49.anIntArray135[local15], Static113.anIntArray273[local15], local37);
			} else {
				local13[local15] = new Class1_Sub2_Sub2_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local15], Static134.anIntArray306[local15], Static49.anIntArray135[local15], Static113.anIntArray273[local15], local37);
			}
		}
		Static247.method3867();
		return local13;
	}
}
