import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	public static int anInt3623;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Lclient!ql;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
	public static int anInt3630;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[200];

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "[S")
	public static final short[] aShortArray61 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_6 = new Class106(11, 0, 1, 2);

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z")
	public static boolean method3243() {
		@Pc(8) Class6_Sub33 local8 = (Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251;
		if (local8 == null || local8 == Static307.aClass88_23.aClass6_73) {
			return false;
		} else {
			if (local8.anInt5954 >= 2000) {
				local8.anInt5954 -= 2000;
			}
			return local8.anInt5954 == 1007;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)[Lclient!nd;")
	public static Class175[] method3244() {
		return new Class175[] { Static56.aClass175_3, Static373.aClass175_7, Static178.aClass175_2, Static158.aClass175_11, Static61.aClass175_4, Static188.aClass175_12, Static135.aClass175_8, Static269.aClass175_14, Static322.aClass175_16, Static258.aClass175_13, Static78.aClass175_5, Static302.aClass175_15, Static361.aClass175_17, Static449.aClass175_19, Static442.aClass175_18 };
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI)I")
	public static int method3247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}
}
