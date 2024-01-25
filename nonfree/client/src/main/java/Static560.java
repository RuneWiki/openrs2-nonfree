import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
	public static int anInt9129;

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "Lclient!eaa;")
	public static final Class80 aClass80_7 = new Class80("WTRC", 1);

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "[I")
	public static int[] anIntArray627 = new int[2];

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IILclient!ka;II)Lclient!gp;")
	public static Class128 method7661(@OriginalArg(1) int arg0, @OriginalArg(2) Class182 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg1 == null ? null : new Class128(arg3, arg2, arg0, arg1.na(), arg1.V(), arg1.RA(), arg1.fa(), arg1.EA(), arg1.HA(), arg1.G());
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!sb;B[BI)Lclient!oha;")
	public static Class249 method7662(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static30.anIntArray66, 0);
		if (Static30.anIntArray66[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class249(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public static void method7663() {
		Static566.aClass95_14.xa(((float) Static234.aClass2_Sub5_48.aClass6_Sub3_1.method753() * 0.1F + 0.7F) * Static332.aFloat97);
		Static566.aClass95_14.ZA(Class13_Sub1_Sub1_Sub4.lb, Static258.aFloat70, Static410.aFloat117, (float) (Static67.anInt1218 << 2), (float) (Static332.anInt5258 << 2), (float) (Static207.anInt3511 << 2));
		Static566.aClass95_14.method6939(Static386.aClass12_2);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)I")
	public static int method7665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static410.anInt6377 == -1) {
			return 1;
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != arg1) {
			Static41.method665(arg1, true, Static434.aClass271_13.method5972(Static483.anInt7694));
			if (arg1 != Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280()) {
				return -1;
			}
		}
		try {
			@Pc(35) Dimension local35 = Static504.aCanvas11.getSize();
			Static445.method6068(Static389.aClass256_13, Static434.aClass271_13.method5972(Static483.anInt7694), Static505.aClass62_21, true, Static192.aClass95_4);
			@Pc(53) Class186 local53 = Static439.method6023(Static519.aClass380_116, Static410.anInt6377);
			@Pc(56) long local56 = Static476.method6413();
			Static192.aClass95_4.la();
			Static185.aClass177_4.method7869(0, Static427.anInt6729, 0);
			Static192.aClass95_4.method6941(Static185.aClass177_4);
			Static192.aClass95_4.DA(local35.width / 2, local35.height / 2, 512, 512);
			Static192.aClass95_4.xa(1.0F);
			Static192.aClass95_4.ZA(16777215, 0.5F, 0.5F, 20.0F, (float) -50, 30.0F);
			@Pc(98) Class182 local98 = Static192.aClass95_4.method6938(local53, 2048, 64, 64, 768);
			@Pc(100) int local100 = 0;
			label41: for (@Pc(102) int local102 = 0; local102 < 500; local102++) {
				Static192.aClass95_4.GA(0);
				Static192.aClass95_4.ya();
				for (@Pc(111) int local111 = 15; local111 >= 0; local111--) {
					for (@Pc(115) int local115 = 0; local115 <= local111; local115++) {
						Static458.aClass177_9.method7869((int) ((float) Static192.anInt3298 * (-((float) local111 / 2.0F) + (float) local115)), 0, (local111 + 1) * Static192.anInt3298);
						local98.method6206(Static458.aClass177_9, null, 0);
						local100++;
						if (Static476.method6413() - local56 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static192.aClass95_4.method6976();
			@Pc(179) long local179 = (long) (local100 * 1000) / (Static476.method6413() - local56);
			Static192.aClass95_4.GA(0);
			Static192.aClass95_4.ya();
			return (int) local179;
		} catch (@Pc(188) Throwable local188) {
			local188.printStackTrace();
			return -1;
		}
	}
}
