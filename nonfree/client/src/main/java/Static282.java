import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "Lclient!mg;")
	public static Class159 aClass159_8;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_243 = new Class12(57, 8);

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
	public static int anInt4732 = 0;

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
	public static int anInt4734 = 0;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[2048];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([SB)[S")
	public static short[] method3878(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static459.method1549(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZ)V")
	public static void method3881(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) Class1_Sub13 local12 = Static379.method5347(arg0, arg1);
		if (local12 != null) {
			for (@Pc(26) int local26 = 0; local26 < local12.anIntArray82.length; local26++) {
				local12.anIntArray82[local26] = -1;
				local12.anIntArray80[local26] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[I[I[ILclient!kh;)V")
	public static void method3883(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class47_Sub1_Sub5_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(17) int local17 = arg0[local3];
			@Pc(21) int local21 = arg2[local3];
			@Pc(25) int local25 = arg1[local3];
			@Pc(27) int local27 = 0;
			while (local21 != 0 && local27 < arg3.aClass226Array3.length) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg3.aClass226Array3[local27] = null;
					} else {
						@Pc(51) Class58 local51 = Static322.aClass45_5.method690(local17);
						@Pc(54) int local54 = local51.anInt1436;
						@Pc(59) Class226 local59 = arg3.aClass226Array3[local27];
						if (local59 != null) {
							if (local17 == local59.anInt6841) {
								if (local54 == 0) {
									local59 = arg3.aClass226Array3[local27] = null;
								} else if (local54 == 1) {
									local59.anInt6844 = 0;
									local59.anInt6842 = 0;
									local59.anInt6845 = local25;
									local59.anInt6846 = 1;
									local59.anInt6840 = 0;
									Static385.method5367(arg3.aByte97, arg3.anInt7066, 0, local51, false, arg3.anInt7060);
								} else if (local54 == 2) {
									local59.anInt6844 = 0;
								}
							} else if (local51.anInt1426 >= Static322.aClass45_5.method690(local59.anInt6841).anInt1426) {
								local59 = arg3.aClass226Array3[local27] = null;
							}
						}
						if (local59 == null) {
							local59 = arg3.aClass226Array3[local27] = new Class226();
							local59.anInt6844 = 0;
							local59.anInt6840 = 0;
							local59.anInt6841 = local17;
							local59.anInt6845 = local25;
							local59.anInt6846 = 1;
							local59.anInt6842 = 0;
							Static385.method5367(arg3.aByte97, arg3.anInt7066, 0, local51, false, arg3.anInt7060);
						}
					}
				}
				local27++;
				local21 >>>= 0x1;
			}
		}
	}
}
