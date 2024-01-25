import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public static int anInt6819;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_244 = new Class214(65, 3);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method5240(@OriginalArg(1) int arg0) {
		Static180.anInt2931 = arg0;
		@Pc(7) Class167 local7 = Static250.aClass167_9;
		synchronized (Static250.aClass167_9) {
			Static250.aClass167_9.method3390();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIIB)V")
	public static void method5241(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static409.aLong207 = 0L;
		@Pc(12) int local12 = Static330.method4209();
		if (arg2 == 3 || local12 == 3) {
			arg1 = true;
		}
		if (!Static213.aClass128_22.method3589()) {
			arg1 = true;
		}
		Static131.method1783(arg3, arg1, arg2, arg0, local12);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method5243() {
		Static214.aBoolean611 = true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!vg;Lclient!qa;I)V")
	public static void method5244(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class128 arg1) {
		@Pc(36) boolean local36 = Static227.aClass65_2.method1333(arg0.anInt7030, arg0.anInt6996, arg0.aBoolean582 ? Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1 : null, arg0.anInt6987 | 0xFF000000, arg1, arg0.anInt7046, arg0.anInt7019) == null;
		if (local36) {
			Static166.aClass254_17.method5430(new Class1_Sub33(arg0.anInt7030, arg0.anInt7046, arg0.anInt6996, arg0.anInt6987 | 0xFF000000, arg0.anInt7019, arg0.aBoolean582));
			Static94.method1357(arg0);
		}
	}
}
