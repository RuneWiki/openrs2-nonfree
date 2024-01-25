import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject22;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_100 = new Class286(65, 8);

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	public static final int anInt9527 = 1339;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
	public static final int[] anIntArray527 = new int[3];

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "Lclient!ela;")
	public static final Class96 aClass96_6 = new Class96();

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt9536 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method8028(@OriginalArg(0) int arg0) {
		@Pc(7) Class66[] local7 = Class3_Sub18.aClass66Array1;
		synchronized (Class3_Sub18.aClass66Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class3_Sub18.aClass66Array1.length; local11++) {
				Class3_Sub18.aClass66Array1[local11] = new Class66();
				Static335.anIntArray330[local11] = 0;
			}
			if (arg0 != -28905) {
				method8028(-71);
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!bg;Z)V")
	public static void method8032(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1) {
		if (Static581.anInt9508 >= 50 || (arg1 == null || arg1.anIntArrayArray4 == null || arg1.anIntArrayArray4.length <= arg0 || arg1.anIntArrayArray4[arg0] == null)) {
			return;
		}
		@Pc(40) int local40 = arg1.anIntArrayArray4[arg0][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(74) int local74;
		if (arg1.anIntArrayArray4[arg0].length > 1) {
			local74 = (int) ((double) arg1.anIntArrayArray4[arg0].length * Math.random());
			if (local74 > 0) {
				local44 = arg1.anIntArrayArray4[arg0][local74];
			}
		}
		local74 = 256;
		if (arg1.anIntArray49 != null && arg1.anIntArray47 != null) {
			local74 = Static699.method9151(arg1.anIntArray49[arg0], arg1.anIntArray47[arg0]);
		}
		if (arg1.aBoolean59) {
			Static146.method2412(local74, 255, 0, false, local50, local44);
		} else {
			Static700.method9158(local50, local44, 0, local74, 255);
		}
	}
}
