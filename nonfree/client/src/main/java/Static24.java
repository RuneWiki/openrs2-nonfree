import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
	public static int anInt452;

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
	public static int anInt455;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "Lclient!nj;")
	public static final Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
	public static int anInt453 = 0;

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
	public static int anInt454 = 104;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	public static void method349() {
		@Pc(23) int local23;
		for (@Pc(15) int local15 = -1; local15 < Static331.anInt6366; local15++) {
			if (local15 == -1) {
				local23 = 2047;
			} else {
				local23 = Static87.anIntArray104[local15];
			}
			@Pc(33) Class67_Sub3_Sub3_Sub2 local33 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local23];
			if (local33 != null && local33.anInt4995 > 0) {
				local33.anInt4995--;
				if (local33.anInt4995 == 0) {
					local33.aString49 = null;
				}
			}
		}
		for (local23 = 0; local23 < Static141.anInt2601; local23++) {
			@Pc(66) int local66 = Static4.anIntArray4[local23];
			@Pc(70) Class67_Sub3_Sub3_Sub1 local70 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local66];
			if (local70 != null && local70.anInt4995 > 0) {
				local70.anInt4995--;
				if (local70.anInt4995 == 0) {
					local70.aString49 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)I")
	public static int method351() {
		return ((Static326.anInt5865 == 0 ? 0 : 1) << 22) + ((Static249.anInt4975 == 0 ? 0 : 1) << 21) + (Static344.anInt6591 << 17) + ((Static36.aBoolean36 ? 1 : 0) << 15) + ((Static52.aBoolean313 ? 1 : 0) << 13) + ((Static103.anInt1883 & 0x3) << 11) + ((Static190.aBoolean248 ? 1 : 0) << 10) + ((Static107.aBoolean127 ? 1 : 0) << 9) + ((Static347.aBoolean422 ? 1 : 0) << 8) + ((Static147.aBoolean182 ? 1 : 0) << 4) + (Static37.anInt693 & 0x7) + ((Static193.aBoolean249 ? 1 : 0) << 3) - (-((Static280.aBoolean11 ? 1 : 0) << 5) - (((Static39.aBoolean43 ? 1 : 0) << 6) - -((Static117.aBoolean145 ? 1 : 0) << 16) + ((Static210.aBoolean289 ? 1 : 0) << 19))) + ((Static289.anInt5719 == 0 ? 0 : 1) << 20) - (-(Static59.method895() << 23) + -(Static54.anInt1026 << 25) + -((Static55.aBoolean65 ? 1 : 0) << 27) + -(Static276.anInt5525 << 28));
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
	public static void method354(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static10.aString2 = arg1;
		Static142.aString23 = arg0;
		Static282.anInt5588 = arg2;
		if (Static10.aString2.equals("") || Static142.aString23.equals("")) {
			Static243.anInt6755 = 3;
		} else if (Static155.anInt2961 == -1) {
			Static107.anInt2025 = 1;
			Static243.anInt6755 = -3;
			anInt453 = 0;
			Static221.anInt4500 = 0;
			@Pc(45) Class11_Sub25 local45 = new Class11_Sub25(128);
			local45.method5186(10);
			local45.method5168((int) (Math.random() * 9.9999999E7D));
			local45.method5178(Static114.method1765(Static10.aString2));
			local45.method5168((int) (Math.random() * 9.9999999E7D));
			local45.method5173(Static142.aString23);
			local45.method5168((int) (Math.random() * 9.9999999E7D));
			local45.method5181(Static108.aBigInteger2, Static57.aBigInteger1);
			Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
			Static313.aClass11_Sub25_Sub1_5.method5186(24);
			Static313.aClass11_Sub25_Sub1_5.method5186(local45.anInt6076 + 2);
			Static313.aClass11_Sub25_Sub1_5.method5204(567);
			Static313.aClass11_Sub25_Sub1_5.method5226(local45.aByteArray93, local45.anInt6076);
		} else {
			Static1.method3();
		}
	}
}
