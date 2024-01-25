import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!ng;")
	public static Class163 aClass163_2;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Lclient!os;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!d;")
	public static Class46 aClass46_2;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_68 = new Class217(44, 0);

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "[S")
	public static short[] aShortArray63 = new short[256];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!ck;)V")
	public static void method3260(@OriginalArg(1) Class3_Sub7_Sub1 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static27.anInt2361; local13++) {
			@Pc(18) int local18 = Static260.anIntArray400[local13];
			@Pc(22) Class7_Sub2_Sub3_Sub2 local22 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local18];
			@Pc(26) int local26 = arg0.method2582();
			if ((local26 & 0x2) != 0) {
				local26 += arg0.method2582() << 8;
			}
			if ((local26 & 0x200) != 0) {
				local26 += arg0.method2582() << 16;
			}
			Static390.method5067(local22, arg0, local18, local26);
		}
	}
}
