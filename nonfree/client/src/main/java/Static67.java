import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "Lclient!ra;")
	public static Class170 aClass170_23;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
	public static final int anInt1688 = -14475237;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	public static final int anInt1689 = 12;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
	public static int anInt1692 = 0;

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString96 = "Loaded input handler";

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Z")
	public static boolean aBoolean110 = true;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)Lclient!pm;")
	public static Class5_Sub9_Sub16 method1486() {
		@Pc(12) Class5_Sub9_Sub16 local12 = (Class5_Sub9_Sub16) Static54.aClass176_5.method4768();
		if (local12 != null) {
			local12.method5803();
			local12.method5494();
			return local12;
		}
		do {
			local12 = (Class5_Sub9_Sub16) Static187.aClass176_10.method4768();
			if (local12 == null) {
				return null;
			}
			if (local12.method4144() > Static284.method4783()) {
				return null;
			}
			local12.method5803();
			local12.method5494();
		} while ((local12.aLong208 & Long.MIN_VALUE) == 0L);
		return local12;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(CI)C")
	public static char method1487(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V")
	public static void method1489(@OriginalArg(0) int arg0) {
		if (Static152.anIntArray214 == null || arg0 > Static152.anIntArray214.length) {
			Static152.anIntArray214 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[B)Z")
	public static boolean method1490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class5_Sub1 local12 = new Class5_Sub1(arg2);
		@Pc(14) int local14 = -1;
		label54: while (true) {
			@Pc(24) int local24 = local12.method1837();
			if (local24 == 0) {
				return local7;
			}
			local14 += local24;
			@Pc(32) int local32 = 0;
			@Pc(34) boolean local34 = false;
			while (true) {
				@Pc(40) int local40;
				while (!local34) {
					local40 = local12.method1866();
					if (local40 == 0) {
						continue label54;
					}
					local32 += local40 - 1;
					@Pc(64) int local64 = local32 & 0x3F;
					@Pc(70) int local70 = local32 >> 6 & 0x3F;
					@Pc(76) int local76 = local12.method1832() >> 2;
					@Pc(81) int local81 = local70 + arg0;
					@Pc(85) int local85 = local64 + arg1;
					if (local81 > 0 && local85 > 0 && Static266.anInt5101 - 1 > local81 && local85 < Static339.anInt6352 - 1) {
						@Pc(114) Class137 local114 = Static228.method3923(local14);
						if (local76 != 22 || Static22.aBoolean43 || local114.anInt4164 != 0 || local114.anInt4128 == 1 || local114.aBoolean303) {
							local34 = true;
							if (!local114.method3716()) {
								Static345.anInt6412++;
								local7 = false;
							}
						}
					}
				}
				local40 = local12.method1866();
				if (local40 == 0) {
					break;
				}
				local12.method1832();
			}
		}
	}
}
