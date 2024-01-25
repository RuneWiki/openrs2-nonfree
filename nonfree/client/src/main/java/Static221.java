import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt4092;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "Lclient!ov;")
	public static Class261 aClass261_3;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
	public static int anInt4095 = 64;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "Z")
	public static final boolean aBoolean288 = false;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "[Lclient!nba;")
	public static final Class231[] aClass231Array1 = new Class231[4];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[IILclient!hb;)V")
	public static void method3323(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub1_Sub1_Sub3_Sub1 arg2) {
		@Pc(14) boolean local14;
		@Pc(16) int local16;
		if (arg2.anIntArray448 != null) {
			local14 = true;
			for (local16 = 0; local16 < arg2.anIntArray448.length; local16++) {
				if (arg0[local16] != arg2.anIntArray448[local16]) {
					local14 = false;
					break;
				}
			}
			if (local14 && arg2.anInt7591 != -1) {
				@Pc(56) Class197 local56 = Static223.aClass245_1.method5312(arg2.anInt7591);
				@Pc(59) int local59 = local56.anInt5072;
				if (local59 == 1) {
					arg2.anInt7545 = 0;
					arg2.anInt7595 = 1;
					arg2.anInt7558 = 0;
					arg2.anInt7532 = arg1;
					arg2.anInt7580 = 0;
					if (!arg2.aBoolean577) {
						Static473.method6515(arg2, local56, arg2.anInt7558);
					}
				}
				if (local59 == 2) {
					arg2.anInt7545 = 0;
				}
			}
		}
		local14 = true;
		for (local16 = 0; local16 < arg0.length; local16++) {
			if (arg0[local16] != -1) {
				local14 = false;
			}
			if (arg2.anIntArray448 == null || arg2.anIntArray448[local16] == -1 || Static223.aClass245_1.method5312(arg0[local16]).anInt5076 >= Static223.aClass245_1.method5312(arg2.anIntArray448[local16]).anInt5076) {
				arg2.anInt7532 = arg1;
				arg2.anIntArray448 = arg0;
				break;
			}
		}
		if (local14) {
			arg2.anIntArray448 = arg0;
			arg2.anInt7532 = arg1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	public static void method3324() {
		if (!Static444.method6994()) {
			return;
		}
		if (Static425.aStringArray26 == null) {
			Static48.method6686();
		}
		Static266.aBoolean369 = true;
		Static166.anInt7795 = 0;
	}
}
