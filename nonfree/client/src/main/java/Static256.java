import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "Lclient!mt;")
	public static final Class220 aClass220_11 = new Class220();

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "[I")
	public static final int[] anIntArray289 = new int[1];

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_83 = new Class319(76, -1);

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
	public static int anInt4739 = -1;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!kba;[IZ)V")
	public static void method4041(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2_Sub4_Sub1_Sub1 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray429 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray429.length; local12++) {
				if (arg1.anIntArray429[local12] != arg2[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt6438 != -1) {
				@Pc(48) Class131 local48 = Static594.aClass311_2.method7009(arg1.anInt6438);
				@Pc(51) int local51 = local48.anInt3742;
				if (local51 == 1) {
					arg1.anInt6392 = 0;
					arg1.anInt6455 = arg0;
					arg1.anInt6420 = 1;
					arg1.anInt6441 = 0;
					arg1.anInt6447 = 0;
					Static171.method2603(arg1.anInt6392, arg1.anInt8796, local48, arg1.anInt8795, arg1.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg1);
				}
				if (local51 == 2) {
					arg1.anInt6441 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray429 == null || arg1.anIntArray429[local12] == -1 || Static594.aClass311_2.method7009(arg2[local12]).anInt3734 >= Static594.aClass311_2.method7009(arg1.anIntArray429[local12]).anInt3734) {
				arg1.anIntArray429 = arg2;
				arg1.anInt6455 = arg0;
				break;
			}
		}
		if (local10) {
			arg1.anIntArray429 = arg2;
			arg1.anInt6455 = arg0;
		}
	}
}
