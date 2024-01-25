import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array14;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
	public static int[] anIntArray502;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_191 = new Class129(50, -2);

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	public static int anInt7429 = -1;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
	public static void method5952() {
		Static240.aBoolean467 = true;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([ILclient!sj;[I[II)V")
	public static void method5953(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) int local17 = arg2[local11];
			@Pc(21) int local21 = arg0[local11];
			@Pc(25) int local25 = arg3[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && arg1.aClass185Array3.length > local27; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg1.aClass185Array3[local27] = null;
					} else {
						@Pc(52) Class143 local52 = Static271.aClass219_4.method4752(local17);
						@Pc(55) int local55 = local52.anInt3772;
						@Pc(60) Class185 local60 = arg1.aClass185Array3[local27];
						if (local60 != null) {
							if (local17 == local60.anInt4811) {
								if (local55 == 0) {
									local60 = arg1.aClass185Array3[local27] = null;
								} else if (local55 == 1) {
									local60.anInt4807 = 0;
									local60.anInt4809 = 0;
									local60.anInt4808 = 0;
									local60.anInt4806 = 1;
									local60.anInt4804 = local25;
									Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == arg1, local52, arg1.anInt7500, 0, arg1.anInt7502, arg1.aByte105);
								} else if (local55 == 2) {
									local60.anInt4807 = 0;
								}
							} else if (local52.anInt3783 >= Static271.aClass219_4.method4752(local60.anInt4811).anInt3783) {
								local60 = arg1.aClass185Array3[local27] = null;
							}
						}
						if (local60 == null) {
							local60 = arg1.aClass185Array3[local27] = new Class185();
							local60.anInt4811 = local17;
							local60.anInt4809 = 0;
							local60.anInt4807 = 0;
							local60.anInt4806 = 1;
							local60.anInt4804 = local25;
							local60.anInt4808 = 0;
							Static340.method4406(arg1 == Static220.aClass2_Sub1_Sub3_Sub2_1, local52, arg1.anInt7500, 0, arg1.anInt7502, arg1.aByte105);
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(BI)Z")
	public static boolean method5954(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IC)Z")
	public static boolean method5955(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
