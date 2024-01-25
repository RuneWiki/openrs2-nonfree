import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Lclient!jn;")
	public static final Class155 aClass155_2 = new Class155();

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method2262() {
		Static144.method2331(Static390.aClass296_251);
		Static455.aClass1_Sub6_Sub2_2.method3919(Static475.anInt6155);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!jq;II)I")
	public static int method2264(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1) {
		if (!Static67.method1228(arg0).method2106(arg1) && arg0.anObjectArray26 == null) {
			return -1;
		} else if (arg0.anIntArray457 == null || arg0.anIntArray457.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray457[arg1];
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!hda;B)I")
	public static int method2265(@OriginalArg(0) Class1_Sub24 arg0) {
		@Pc(7) String local7 = Static224.method3889(arg0);
		@Pc(9) int[] local9 = null;
		if (Static268.method4415(arg0.anInt3161)) {
			local9 = Static342.aClass250_2.method5980((int) arg0.aLong150).anIntArray335;
		} else if (arg0.anInt3166 != -1) {
			local9 = Static342.aClass250_2.method5980(arg0.anInt3166).anIntArray335;
		} else if (Static295.method4713(arg0.anInt3161)) {
			@Pc(49) Class1_Sub17 local49 = (Class1_Sub17) Static380.aClass17_29.method738((long) arg0.aLong150);
			if (local49 != null) {
				@Pc(54) Class49_Sub2_Sub2_Sub2 local54 = local49.aClass49_Sub2_Sub2_Sub2_2;
				@Pc(57) Class196 local57 = local54.aClass196_1;
				if (local57.anIntArray570 != null) {
					local57 = local57.method4855(Static251.aClass119_1);
				}
				if (local57 != null) {
					local9 = local57.anIntArray571;
				}
			}
		} else if (Static174.method2615(arg0.anInt3161)) {
			@Pc(95) Class36 local95;
			if (arg0.anInt3161 == 1012) {
				local95 = Static308.aClass96_4.method2274((int) arg0.aLong150);
			} else {
				local95 = Static308.aClass96_4.method2274((int) (arg0.aLong150 >>> 32 & 0x7FFFFFFFL));
			}
			if (local95.anIntArray127 != null) {
				local95 = local95.method954(Static251.aClass119_1);
			}
			if (local95 != null) {
				local9 = local95.anIntArray126;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static228.method3983(local9);
		}
		@Pc(140) int local140 = Static381.aClass232_6.method5429(local7, Static72.aClass2Array2);
		if (arg0.aBoolean217) {
			local140 += Static475.aClass2_35.c() + 4;
		}
		return local140;
	}
}
