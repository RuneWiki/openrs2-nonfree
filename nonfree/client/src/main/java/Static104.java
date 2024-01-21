import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
	public static int anInt2340;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public static int anInt2343;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt2337 = 0;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array73 = new Class62[100];

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static void method1631() {
		@Pc(9) int local9 = Static47.aClass2_Sub1_Sub12_3.method1384(Static140.aClass62_1055);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static51.anInt1111; local11++) {
			local19 = Static47.aClass2_Sub1_Sub12_3.method1384(Static114.method1772(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		Static157.anInt3335 = local9;
		local19 = Static51.anInt1111 * 15 + 21;
		@Pc(48) int local48 = Static43.anInt985 - local9 / 2;
		Static180.aBoolean167 = true;
		Static145.anInt3129 = Static51.anInt1111 * 15 + 22;
		@Pc(58) int local58 = Static170.anInt3634;
		if (local58 + local19 > Static42.anInt4285) {
			local58 = Static42.anInt4285 - local19;
		}
		if (Static169.anInt3579 < local48 + local9) {
			local48 = Static169.anInt3579 - local9;
		}
		if (local48 < 0) {
			local48 = 0;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		Static21.anInt505 = local58;
		Static46.anInt1034 = local48;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
	public static void method1632(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub24 local12 = (Class2_Sub24) Static204.aClass58_14.method1704((long) arg0);
		if (local12 != null) {
			for (@Pc(23) int local23 = 0; local23 < local12.anIntArray366.length; local23++) {
				local12.anIntArray366[local23] = -1;
				local12.anIntArray367[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public static void method1633(@OriginalArg(0) int arg0) {
		Static148.anInt3160 = arg0;
		Static167.anInt3570 = 50;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)J")
	public static synchronized long method1634() {
		@Pc(11) long local11 = System.currentTimeMillis();
		if (Static168.aLong115 > local11) {
			Static178.aLong122 += Static168.aLong115 - local11;
		}
		Static168.aLong115 = local11;
		return local11 + Static178.aLong122;
	}
}
