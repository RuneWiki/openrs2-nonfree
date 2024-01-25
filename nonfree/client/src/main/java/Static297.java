import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!li", name = "j", descriptor = "Lclient!sea;")
	public static Class308 aClass308_105;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_25 = new Class111();

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!em;")
	public static final Class83 aClass83_107 = new Class83(105, 5);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!lj;Ljava/lang/String;I)Lclient!nj;")
	public static Class236 method4407(@OriginalArg(1) Class78_Sub3 arg0, @OriginalArg(2) String arg1) {
		@Pc(13) int local13 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local13);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static429.anIntArray462, 0);
		if (Static429.anIntArray462[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class236(arg0, 34336, local13);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!in;ZI)V")
	public static void method4409(@OriginalArg(0) int arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt4182;
		@Pc(11) int local11 = arg1.anInt4156;
		if (arg1.aByte57 == 0) {
			arg1.anInt4182 = arg1.anInt4173;
		} else if (arg1.aByte57 == 1) {
			arg1.anInt4182 = arg3 - arg1.anInt4173;
		} else if (arg1.aByte57 == 2) {
			arg1.anInt4182 = arg1.anInt4173 * arg3 >> 14;
		}
		if (arg1.aByte55 == 0) {
			arg1.anInt4156 = arg1.anInt4176;
		} else if (arg1.aByte55 == 1) {
			arg1.anInt4156 = arg0 - arg1.anInt4176;
		} else if (arg1.aByte55 == 2) {
			arg1.anInt4156 = arg1.anInt4176 * arg0 >> 14;
		}
		if (arg1.aByte57 == 4) {
			arg1.anInt4182 = arg1.anInt4141 * arg1.anInt4156 / arg1.anInt4221;
		}
		if (arg1.aByte55 == 4) {
			arg1.anInt4156 = arg1.anInt4182 * arg1.anInt4221 / arg1.anInt4141;
		}
		if (Static506.aBoolean659 && (Static67.method1098(arg1).anInt658 != 0 || arg1.anInt4166 == 0)) {
			if (arg1.anInt4156 < 5 && arg1.anInt4182 < 5) {
				arg1.anInt4182 = 5;
				arg1.anInt4156 = 5;
			} else {
				if (arg1.anInt4182 <= 0) {
					arg1.anInt4182 = 5;
				}
				if (arg1.anInt4156 <= 0) {
					arg1.anInt4156 = 5;
				}
			}
		}
		if (Static471.anInt8086 == arg1.anInt4186) {
			Static428.aClass160_30 = arg1;
		}
		if (arg2 && arg1.anObjectArray13 != null && (local8 != arg1.anInt4182 || local11 != arg1.anInt4156)) {
			@Pc(194) Class1_Sub22 local194 = new Class1_Sub22();
			local194.anObjectArray1 = arg1.anObjectArray13;
			local194.aClass160_10 = arg1;
			Static438.aClass111_48.method2552(local194);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIZII)I")
	public static int method4410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class85_Sub8.anIntArray427[arg3 * 8192 / arg0] >> 1;
		return (arg1 * (65536 - local21) >> 16) + (local21 * arg2 >> 16);
	}
}
