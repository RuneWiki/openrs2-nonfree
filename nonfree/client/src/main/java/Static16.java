import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_7;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	public static int anInt527;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!fa;")
	public static Class19 aClass19_2;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array3;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static int anInt524 = 0;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!va;")
	public static Class61 aClass61_178 = Static88.method1421("@lre@");

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	public static int[] anIntArray60 = new int[25];

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method380() {
		anIntArray60 = null;
		aClass10_Sub1_Sub1_Sub1_7 = null;
		aClass19_2 = null;
		aByteArrayArray5 = null;
		aClass10_Sub1_Sub1_Sub1Array3 = null;
		aClass61_178 = null;
		anIntArray59 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!va;)V")
	public static void method382(@OriginalArg(1) Class61 arg0) {
		if (arg0 == null || arg0.method1596() == 0) {
			Static56.anInt1501 = 0;
			return;
		}
		@Pc(16) Class61 local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(21) Class61[] local21 = new Class61[100];
		while (true) {
			@Pc(26) int local26 = local16.method1597();
			if (local26 == -1) {
				local16 = local16.method1609();
				if (local16.method1596() > 0) {
					local21[local18++] = local16.method1613();
				}
				Static56.anInt1501 = 0;
				label46: for (local26 = 0; local26 < Static43.anInt1206; local26++) {
					@Pc(89) Class10_Sub1_Sub15 local89 = Static94.method1491(local26);
					if (local89.anInt2518 == -1 && local89.aClass61_1029 != null) {
						@Pc(102) Class61 local102 = local89.aClass61_1029.method1613();
						for (@Pc(104) int local104 = 0; local104 < local18; local104++) {
							if (local102.method1604(local21[local104]) == -1) {
								continue label46;
							}
						}
						Static79.aClass61Array11[Static56.anInt1501] = local102;
						Static28.anIntArray93[Static56.anInt1501] = local26;
						Static56.anInt1501++;
						if (Static79.aClass61Array11.length <= Static56.anInt1501) {
							return;
						}
					}
				}
				return;
			}
			@Pc(54) Class61 local54 = local16.method1611(local26, 0).method1609();
			if (local54.method1596() > 0) {
				local21[local18++] = local54.method1613();
			}
			local16 = local16.method1619(local26 + 1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIBLclient!le;)V")
	public static void method384(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class38 arg2) {
		@Pc(12) Class10_Sub11 local12 = new Class10_Sub11();
		local12.aLong81 = arg1;
		local12.aByteArray12 = arg0;
		local12.anInt2223 = 0;
		local12.aClass38_3 = arg2;
		@Pc(27) Class9 local27 = Static12.aClass9_2;
		synchronized (Static12.aClass9_2) {
			Static12.aClass9_2.method79(local12);
		}
		Static39.method205();
	}
}
