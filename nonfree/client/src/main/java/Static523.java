import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!rja", name = "I", descriptor = "[I")
	public static final int[] anIntArray477 = new int[3];

	@OriginalMember(owner = "client!rja", name = "N", descriptor = "S")
	public static short aShort98 = 320;

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(B)Z")
	public static boolean method7136() {
		try {
			if (Static310.anInt5335 == 2) {
				if (Static27.aClass5_Sub28_1 == null) {
					Static27.aClass5_Sub28_1 = Static689.method4522(Static342.aClass126_159, Static680.anInt10888, Static180.anInt3389);
					if (Static27.aClass5_Sub28_1 == null) {
						return false;
					}
				}
				if (Static451.aClass199_1 == null) {
					Static451.aClass199_1 = new Class199(Static176.aClass126_95, Static267.aClass126_130);
				}
				@Pc(46) Class5_Sub4_Sub2 local46 = Static445.aClass5_Sub4_Sub2_6;
				if (Static27.aClass5_Sub4_Sub2_1 != null) {
					local46 = Static27.aClass5_Sub4_Sub2_1;
				}
				if (local46.method1818(Static451.aClass199_1, Static361.aClass126_167, Static27.aClass5_Sub28_1)) {
					Static445.aClass5_Sub4_Sub2_6 = local46;
					Static445.aClass5_Sub4_Sub2_6.method1795();
					@Pc(90) int local90;
					if (Static12.anInt158 > 0) {
						Static310.anInt5335 = 3;
						Static445.aClass5_Sub4_Sub2_6.method1808(Static12.anInt158 > Static524.anInt8330 ? Static524.anInt8330 : Static12.anInt158);
						for (local90 = 0; local90 < Static507.anIntArray604.length; local90++) {
							Static445.aClass5_Sub4_Sub2_6.method1825(Static507.anIntArray604[local90], local90);
							Static507.anIntArray604[local90] = 255;
						}
					} else {
						Static310.anInt5335 = 0;
						Static445.aClass5_Sub4_Sub2_6.method1808(Static524.anInt8330);
						for (local90 = 0; local90 < Static507.anIntArray604.length; local90++) {
							Static445.aClass5_Sub4_Sub2_6.method1825(Static507.anIntArray604[local90], local90);
							Static507.anIntArray604[local90] = 255;
						}
					}
					if (Static27.aClass5_Sub4_Sub2_1 == null) {
						if (Static133.aLong77 > 0L) {
							Static445.aClass5_Sub4_Sub2_6.method1807(Static133.aLong77, Static168.aBoolean240, Static27.aClass5_Sub28_1);
						} else {
							Static445.aClass5_Sub4_Sub2_6.method1816(Static27.aClass5_Sub28_1, Static168.aBoolean240);
						}
					}
					if (Static610.aClass45_3 != null) {
						Static610.aClass45_3.method7457(Static445.aClass5_Sub4_Sub2_6);
					}
					Static27.aClass5_Sub28_1 = null;
					Static133.aLong77 = 0L;
					Static27.aClass5_Sub4_Sub2_1 = null;
					Static342.aClass126_159 = null;
					Static451.aClass199_1 = null;
					return true;
				}
			}
		} catch (@Pc(205) Exception local205) {
			local205.printStackTrace();
			Static445.aClass5_Sub4_Sub2_6.method1799();
			Static451.aClass199_1 = null;
			Static310.anInt5335 = 0;
			Static342.aClass126_159 = null;
			Static27.aClass5_Sub4_Sub2_1 = null;
			Static27.aClass5_Sub28_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIB)I")
	public static int method7137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "(I)V")
	public static void method7138() {
		@Pc(12) Class5_Sub50 local12;
		for (local12 = (Class5_Sub50) Static631.aClass20_71.method378(); local12 != null; local12 = (Class5_Sub50) Static631.aClass20_71.method366()) {
			Static171.method4818(false, local12);
		}
		for (local12 = (Class5_Sub50) Static227.aClass20_61.method378(); local12 != null; local12 = (Class5_Sub50) Static227.aClass20_61.method366()) {
			Static171.method4818(true, local12);
		}
	}
}
