import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_125;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "Lclient!uf;")
	public static Class2_Sub6_Sub4 aClass2_Sub6_Sub4_2;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!uh", name = "M", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
	public static int anInt4494 = 0;

	@OriginalMember(owner = "client!uh", name = "R", descriptor = "Lclient!i;")
	private static Class41 aClass41_1196 = Static184.method2923(" from your ignore list first)3");

	@OriginalMember(owner = "client!uh", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_1195 = aClass41_1196;

	@OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
	public static int anInt4495 = -1;

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_1197 = Static184.method2923("::fps ");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIILclient!dj;)V")
	public static void method3113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub3_Sub1 arg2) {
		if (arg0 == arg2.anInt3910 && arg0 != -1) {
			@Pc(24) Class2_Sub2_Sub9 local24 = Static14.method299(arg0);
			@Pc(27) int local27 = local24.anInt2338;
			if (local27 == 1) {
				arg2.anInt3927 = 0;
				arg2.anInt3958 = 0;
				arg2.anInt3930 = 0;
				arg2.anInt3965 = arg1;
				Static55.method1083(arg2 == Static213.aClass12_Sub3_Sub1_1, arg2.anInt3949, arg2.anInt3930, arg2.anInt3961, local24);
			}
			if (local27 == 2) {
				arg2.anInt3958 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.anInt3910 == -1 || Static14.method299(arg0).anInt2360 >= Static14.method299(arg2.anInt3910).anInt2360) {
			arg2.anInt3930 = 0;
			arg2.anInt3965 = arg1;
			arg2.anInt3962 = arg2.anInt3960;
			arg2.anInt3910 = arg0;
			arg2.anInt3958 = 0;
			arg2.anInt3927 = 0;
			if (arg2.anInt3910 == -1) {
				return;
			}
			Static55.method1083(Static213.aClass12_Sub3_Sub1_1 == arg2, arg2.anInt3949, arg2.anInt3930, arg2.anInt3961, Static14.method299(arg2.anInt3910));
		}
	}
}
