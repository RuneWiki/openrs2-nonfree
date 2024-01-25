import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_86 = new Class133(8, 6);

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public static int anInt5108 = -1;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public static void method4286() {
		@Pc(9) int local9 = (int) ((double) Static118.anInt2527 * 34.46D);
		local9 <<= 0x2;
		if (Static121.aClass5_7.method7426()) {
			local9 += 512;
		}
		Static121.aClass5_7.sa(200, local9);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)I")
	public static int method4288(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIIII)V")
	public static void method4289(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg2, 10);
		local8.method6211();
		local8.anInt7561 = arg1;
		local8.anInt7556 = arg3;
		local8.anInt7557 = arg0;
	}
}
