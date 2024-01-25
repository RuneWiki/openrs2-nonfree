import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public static int anInt2774 = 0;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	public static int anInt2776 = -1;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!us;")
	public static final Class234 aClass234_61 = new Class234(101, 15);

	@OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
	public static final int[] anIntArray299 = new int[25];

	@OriginalMember(owner = "client!il", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static void method2386() {
		Static198.anIntArray385 = null;
		Static17.anIntArray23 = null;
		Static345.anIntArray636 = null;
		Static349.aBoolean450 = false;
		Static28.aClipboard1 = null;
		Static242.anIntArray485 = null;
		Static71.method1197();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!ut;II)V")
	public static void method2388(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) long local21 = (long) (arg3 << 14 | arg2 << 28 | arg0);
		@Pc(27) Class3_Sub16 local27 = (Class3_Sub16) Static384.aClass44_39.method942(local21);
		if (local27 == null) {
			local27 = new Class3_Sub16();
			Static384.aClass44_39.method948(local21, local27);
			local27.aClass138_15.method3053(arg1);
			return;
		}
		@Pc(52) Class51 local52 = Static176.aClass78_3.method1641(arg1.anInt6017);
		@Pc(55) int local55 = local52.anInt1148;
		if (local52.anInt1175 == 1) {
			local55 *= arg1.anInt6018 + 1;
		}
		for (@Pc(74) Class3_Sub40 local74 = (Class3_Sub40) local27.aClass138_15.method3051(); local74 != null; local74 = (Class3_Sub40) local27.aClass138_15.method3050()) {
			local52 = Static176.aClass78_3.method1641(local74.anInt6017);
			@Pc(85) int local85 = local52.anInt1148;
			if (local52.anInt1175 == 1) {
				local85 *= local74.anInt6018 + 1;
			}
			if (local85 < local55) {
				Static191.method3041(arg1, local74);
				return;
			}
		}
		local27.aClass138_15.method3053(arg1);
	}
}
