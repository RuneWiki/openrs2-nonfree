import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_23 = new Class111();

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "J")
	public static long aLong122 = -1L;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!em;")
	public static final Class83 aClass83_100 = new Class83(83, 6);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ia;Lclient!ia;B)V")
	public static void method3799(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		if (arg1.aClass11_68 != null) {
			arg1.method7200();
		}
		arg1.aClass11_68 = arg0.aClass11_68;
		arg1.aClass11_67 = arg0;
		arg1.aClass11_68.aClass11_67 = arg1;
		arg1.aClass11_67.aClass11_68 = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!in;IZI)V")
	public static void method3800(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static563.aBoolean697) {
			@Pc(14) Class94 local14 = Static306.anInt4907 == -1 ? null : Static256.aClass263_1.method5592(Static306.anInt4907);
			if (Static67.method1098(arg0).method575() && (Static420.anInt7401 & 0x20) != 0 && (local14 == null || arg0.method3363(Static306.anInt4907, local14.anInt2658) != local14.anInt2658)) {
				Static385.method5573(45, arg0.anInt4199, Static318.aString69, Static385.anInt6906, false, true, Static146.aString26 + " -> " + arg0.aString45, 0L, arg0.anInt4146, arg0.anInt4205);
			}
		}
		@Pc(81) String local81;
		for (@Pc(74) int local74 = 9; local74 >= 5; local74--) {
			local81 = Static122.method2192(arg0, local74);
			if (local81 != null) {
				Static385.method5573(1011, arg0.anInt4199, local81, Static16.method391(local74, arg0), false, true, arg0.aString45, (long) (local74 + 1), arg0.anInt4146, arg0.anInt4205);
			}
		}
		local81 = Static573.method7727(arg0);
		if (local81 != null) {
			Static385.method5573(2, arg0.anInt4199, local81, arg0.anInt4151, false, true, arg0.aString45, 0L, arg0.anInt4146, arg0.anInt4205);
		}
		for (@Pc(142) int local142 = 4; local142 >= 0; local142--) {
			@Pc(149) String local149 = Static122.method2192(arg0, local142);
			if (local149 != null) {
				Static385.method5573(5, arg0.anInt4199, local149, Static16.method391(local142, arg0), false, true, arg0.aString45, (long) (local142 + 1), arg0.anInt4146, arg0.anInt4205);
			}
		}
		if (!Static67.method1098(arg0).method568()) {
			return;
		}
		if (arg0.aString47 == null) {
			Static385.method5573(20, arg0.anInt4199, Static375.aClass253_13.method5453(Static161.anInt3095), -1, false, true, "", 0L, arg0.anInt4146, arg0.anInt4205);
		} else {
			Static385.method5573(20, arg0.anInt4199, arg0.aString47, -1, false, true, "", 0L, arg0.anInt4146, arg0.anInt4205);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
	public static int method3802(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(32) int local32 = (local14 & 0x33333333) + (local14 >>> 2 & 0xB3333333);
		@Pc(40) int local40 = (local32 >>> 4) + local32 & 0xF0F0F0F;
		@Pc(46) int local46 = local40 + (local40 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method3803() {
		if (Static482.anIntArray516 != null && Static133.anIntArray110 != null) {
			return;
		}
		Static482.anIntArray516 = new int[256];
		Static133.anIntArray110 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static482.anIntArray516[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static133.anIntArray110[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}
}
