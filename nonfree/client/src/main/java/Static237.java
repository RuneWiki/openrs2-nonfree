import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_39 = new Class240(48, 5);

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
	public static int anInt4212 = -1;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_50 = new Class171(84, -1);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3582(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!dt;ILclient!ak;)Lclient!eg;")
	public static Class99 method3583(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(10) Class99 local10 = new Class99(arg1);
		@Pc(14) int local14 = arg0.method7954();
		@Pc(25) boolean local25 = (local14 & 0x1) != 0;
		@Pc(36) boolean local36 = (local14 & 0x2) != 0;
		@Pc(47) boolean local47 = (local14 & 0x4) != 0;
		@Pc(56) boolean local56 = (local14 & 0x8) != 0;
		if (local25) {
			local10.anIntArray139[0] = arg0.method7951();
			local10.anIntArray142[0] = arg0.method7951();
			if (arg1.anInt418 != -1 || arg1.anInt435 != -1) {
				local10.anIntArray139[1] = arg0.method7951();
				local10.anIntArray142[1] = arg0.method7951();
			}
			if (arg1.anInt425 != -1 || arg1.anInt466 != -1) {
				local10.anIntArray139[2] = arg0.method7951();
				local10.anIntArray142[2] = arg0.method7951();
			}
		}
		if (local36) {
			local10.anIntArray141[0] = arg0.method7951();
			local10.anIntArray140[0] = arg0.method7951();
			if (arg1.anInt433 != -1 || arg1.anInt475 != -1) {
				local10.anIntArray141[1] = arg0.method7951();
				local10.anIntArray140[1] = arg0.method7951();
			}
		}
		@Pc(164) int local164;
		@Pc(167) int[] local167;
		@Pc(199) int local199;
		if (local47) {
			local164 = arg0.method7951();
			local167 = new int[] { local164 & 0xF, local164 >> 4 & 0xF, local164 >> 8 & 0xF, local164 >> 12 & 0xF };
			for (local199 = 0; local199 < 4; local199++) {
				if (local167[local199] != 15) {
					local10.aShortArray29[local167[local199]] = (short) arg0.method7951();
				}
			}
		}
		if (local56) {
			local164 = arg0.method7954();
			local167 = new int[] { local164 & 0xF, local164 >> 4 & 0xF };
			for (local199 = 0; local199 < 2; local199++) {
				if (local167[local199] != 15) {
					local10.aShortArray30[local167[local199]] = (short) arg0.method7951();
				}
			}
		}
		return local10;
	}
}
