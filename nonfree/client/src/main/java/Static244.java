import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	public static int anInt5027;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_84 = new Class133(65, 1);

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt5026 = 0;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
	public static final int[] anIntArray449 = new int[1];

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/String;ZIBZLjava/lang/String;)V")
	public static void method4213(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5) {
		Static350.aClass161_75.anInt5061 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(28) Class244 local28 = Static37.aClass121_1.method3431(arg3);
			if (local28 == null || local28.method5998() != arg2) {
				return;
			}
			if (local28.method5998()) {
				local18 = local28.aString53;
			} else {
				local16 = local28.anInt7213;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static99.aClass96_7.anInt2928; local55++) {
			@Pc(62) Class27 local62 = Static99.aClass96_7.method2508(local55);
			if ((!arg4 || local62.aBoolean68) && local62.anInt847 == -1 && local62.anInt868 == -1 && local62.anInt823 == 0 && local62.aString8.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg2) {
						if (!arg5.equals(local62.method820(local18, arg3))) {
							continue;
						}
					} else if (arg0 != local62.method830(local16, arg3)) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static70.anInt570 = -1;
					Static363.aShortArray161 = null;
					return;
				}
				if (local14.length <= local53) {
					@Pc(138) short[] local138 = new short[local14.length * 2];
					for (@Pc(140) int local140 = 0; local140 < local53; local140++) {
						local138[local140] = local14[local140];
					}
					local14 = local138;
				}
				local14[local53++] = (short) local55;
			}
		}
		Static70.anInt570 = local53;
		Static527.anInt9214 = 0;
		Static363.aShortArray161 = local14;
		@Pc(178) String[] local178 = new String[Static70.anInt570];
		for (@Pc(185) int local185 = 0; local185 < Static70.anInt570; local185++) {
			local178[local185] = Static99.aClass96_7.method2508(local14[local185]).aString8;
		}
		Static41.method951(local178, Static363.aShortArray161);
		Static350.aClass161_75.method4250();
		Static350.aClass161_75.anInt5061 = 2;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!pk;)V")
	public static void method4214(@OriginalArg(1) Class4_Sub5 arg0) {
		arg0.aClass6_Sub1_Sub2_1 = null;
		if (Static429.anInt7897 < 20) {
			Static502.aClass90_17.method2322(arg0);
			Static429.anInt7897++;
		}
	}
}
