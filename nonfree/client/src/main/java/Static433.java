import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "Lclient!uw;")
	public static Class359 aClass359_154;

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_153 = new Class359(122, -2);

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
	public static int anInt7533 = -1;

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "[F")
	public static final float[] aFloatArray75 = new float[2];

	@OriginalMember(owner = "client!ow", name = "j", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_155 = new Class359(30, -1);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "([IIBLclient!jha;)V")
	public static void method6363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1_Sub4_Sub2_Sub2 arg2) {
		@Pc(8) boolean local8;
		@Pc(10) int local10;
		if (arg2.anIntArray305 != null) {
			local8 = true;
			for (local10 = 0; local10 < arg2.anIntArray305.length; local10++) {
				if (arg2.anIntArray305[local10] != arg0[local10]) {
					local8 = false;
					break;
				}
			}
			if (local8 && arg2.anInt5482 != -1) {
				@Pc(41) Class175 local41 = Static591.aClass66_2.method1768(arg2.anInt5482);
				@Pc(44) int local44 = local41.anInt5022;
				if (local44 == 1) {
					arg2.anInt5453 = 0;
					arg2.anInt5475 = arg1;
					arg2.anInt5498 = 0;
					arg2.anInt5504 = 0;
					arg2.anInt5456 = 1;
					if (!arg2.aBoolean468) {
						Static146.method2653(arg2.anInt5498, local41, arg2);
					}
				}
				if (local44 == 2) {
					arg2.anInt5453 = 0;
				}
			}
		}
		local8 = true;
		for (local10 = 0; local10 < arg0.length; local10++) {
			if (arg0[local10] != -1) {
				local8 = false;
			}
			if (arg2.anIntArray305 == null || arg2.anIntArray305[local10] == -1 || Static591.aClass66_2.method1768(arg0[local10]).anInt5018 >= Static591.aClass66_2.method1768(arg2.anIntArray305[local10]).anInt5018) {
				arg2.anIntArray305 = arg0;
				arg2.anInt5475 = arg1;
				break;
			}
		}
		if (local8) {
			arg2.anInt5475 = arg1;
			arg2.anIntArray305 = arg0;
		}
	}
}
