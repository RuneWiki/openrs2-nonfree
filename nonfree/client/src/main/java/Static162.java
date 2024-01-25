import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "Lclient!ui;")
	public static Class230 aClass230_45;

	@OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
	public static int anInt2950;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
	public static int anInt2945 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lclient!rt;")
	public static Class205 method2404(@OriginalArg(1) int arg0) {
		@Pc(8) Class205[] local8 = Static112.method1633();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class205 local16 = local8[local10];
			if (local16.anInt5344 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIZ)I")
	public static int method2407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub37 local8 = Static367.method5078(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray591.length > arg1) {
			return local8.anIntArray591[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)V")
	public static void method2409() {
		if (Static25.aBoolean36) {
			return;
		}
		Static25.aBoolean36 = true;
		if (Static188.aClass135_Sub1_1.aBoolean329) {
			Static386.aFloat82 = (int) Static386.aFloat82 - 65 & 0xFFFFFF80;
		} else {
			Static356.aFloat22 += (-Static356.aFloat22 - 24.0F) / 2.0F;
		}
		Static187.aBoolean292 = true;
	}
}
