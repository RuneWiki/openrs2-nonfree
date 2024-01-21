import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "ob", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "Lclient!jb;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_62 = Static59.method1195("Please try using a different world)3");

	@OriginalMember(owner = "client!ab", name = "nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_49 = aClass60_62;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_64 = Static59.method1195("Location");

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_50 = aClass60_64;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_51 = aClass60_62;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_52 = aClass60_62;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Lclient!qf;")
	private static Class60 aClass60_53 = Static59.method1195("Please enter your password)3");

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "[Lclient!la;")
	public static Class3_Sub12[] aClass3_Sub12Array1 = new Class3_Sub12[2048];

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_55 = Static59.method1195("Private chat");

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_54 = aClass60_55;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "Lclient!qf;")
	private static Class60 aClass60_59 = Static59.method1195("Please wait)3)3)3");

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_56 = aClass60_59;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "Lclient!qf;")
	public static Class60 aClass60_57 = aClass60_62;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_58 = aClass60_62;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_60 = Static59.method1195("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_61 = aClass60_62;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "[I")
	public static int[] anIntArray22 = new int[500];

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_63 = aClass60_53;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_67 = Static59.method1195("Enter name of player to add to list");

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_65 = aClass60_67;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_66 = aClass60_59;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public static void method72(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class3_Sub6 local14 = (Class3_Sub6) Static53.aClass5_14.method92(); local14 != null; local14 = (Class3_Sub6) Static53.aClass5_14.method90()) {
			if (local14.anInt767 != -1 || local14.anIntArray76 != null) {
				@Pc(25) int local25 = 0;
				if (arg1 > local14.anInt756) {
					local25 = arg1 - local14.anInt756;
				} else if (arg1 < local14.anInt759) {
					local25 = local14.anInt759 - arg1;
				}
				if (local14.anInt766 < arg0) {
					local25 += arg0 - local14.anInt766;
				} else if (arg0 < local14.anInt757) {
					local25 += local14.anInt757 - arg0;
				}
				if (local25 - 64 > local14.anInt763 || Static22.anInt870 == 0 || arg3 != local14.anInt762) {
					if (local14.aClass3_Sub2_Sub1_2 != null) {
						Static125.aClass3_Sub2_Sub2_2.method712(local14.aClass3_Sub2_Sub1_2);
						local14.aClass3_Sub2_Sub1_2 = null;
					}
					if (local14.aClass3_Sub2_Sub1_1 != null) {
						Static125.aClass3_Sub2_Sub2_2.method712(local14.aClass3_Sub2_Sub1_1);
						local14.aClass3_Sub2_Sub1_1 = null;
					}
				} else {
					local25 -= 64;
					if (local25 < 0) {
						local25 = 0;
					}
					@Pc(140) int local140 = Static22.anInt870 * (local14.anInt763 - local25) / local14.anInt763;
					if (local14.aClass3_Sub2_Sub1_2 != null) {
						local14.aClass3_Sub2_Sub1_2.method172(local140);
					} else if (local14.anInt767 >= 0) {
						@Pc(161) Class63 local161 = Static137.method2000(Static26.aClass25_Sub1_4, local14.anInt767, 0);
						if (local161 != null) {
							@Pc(168) Class3_Sub9_Sub1 local168 = local161.method1998().method728(Static99.aClass56_1);
							@Pc(173) Class3_Sub2_Sub1 local173 = Static131.method170(local168, local140);
							local173.method163(-1);
							Static125.aClass3_Sub2_Sub2_2.method716(local173);
							local14.aClass3_Sub2_Sub1_2 = local173;
						}
					}
					if (local14.aClass3_Sub2_Sub1_1 != null) {
						local14.aClass3_Sub2_Sub1_1.method172(local140);
						if (!local14.aClass3_Sub2_Sub1_1.method2259()) {
							local14.aClass3_Sub2_Sub1_1 = null;
						}
					} else if (local14.anIntArray76 != null && (local14.anInt769 -= arg2) <= 0) {
						@Pc(207) int local207 = (int) ((double) local14.anIntArray76.length * Math.random());
						@Pc(215) Class63 local215 = Static137.method2000(Static26.aClass25_Sub1_4, local14.anIntArray76[local207], 0);
						if (local215 != null) {
							@Pc(222) Class3_Sub9_Sub1 local222 = local215.method1998().method728(Static99.aClass56_1);
							@Pc(227) Class3_Sub2_Sub1 local227 = Static131.method170(local222, local140);
							local227.method163(0);
							Static125.aClass3_Sub2_Sub2_2.method716(local227);
							local14.aClass3_Sub2_Sub1_1 = local227;
							local14.anInt769 = (int) (Math.random() * (double) (local14.anInt761 - local14.anInt770)) + local14.anInt770;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "(I)V")
	public static void method73() {
		aClass60_57 = null;
		aClass60_63 = null;
		anIntArray22 = null;
		aClass60_67 = null;
		aClass60_52 = null;
		aClass60_66 = null;
		aCanvas1 = null;
		aByteArrayArray3 = null;
		aClass60_62 = null;
		aClass60_49 = null;
		aClass60_55 = null;
		aClass3_Sub12Array1 = null;
		aClass60_56 = null;
		aClass60_64 = null;
		aClass60_60 = null;
		aClass60_61 = null;
		aClass60_51 = null;
		aClass60_65 = null;
		aClass60_50 = null;
		aClass60_53 = null;
		aClass60_59 = null;
		aClass25_1 = null;
		aClass60_58 = null;
		aClass60_54 = null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
	public static void method74() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}
}
