import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "Lclient!db;")
	public static Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!kh;")
	private static Class60 aClass60_117 = Static200.method3116("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_118 = aClass60_117;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_119 = Static200.method3116(")3runescape)3com");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method238(@OriginalArg(1) Class9_Sub4 arg0) {
		if (arg0.anInt3933 == Static42.anInt910 || arg0.anInt3896 == -1 || arg0.anInt3906 != 0 || arg0.anInt3899 + 1 > Static74.method1343(arg0.anInt3896).anIntArray450[arg0.anInt3948]) {
			@Pc(40) int local40 = Static42.anInt910 - arg0.anInt3951;
			@Pc(50) int local50 = arg0.anInt3920 * 128 + arg0.anInt3937 * 64;
			@Pc(61) int local61 = arg0.anInt3935 * 128 + arg0.anInt3937 * 64;
			@Pc(71) int local71 = arg0.anInt3937 * 64 + arg0.anInt3908 * 128;
			@Pc(81) int local81 = arg0.anInt3945 * 128 + arg0.anInt3937 * 64;
			@Pc(88) int local88 = arg0.anInt3933 - arg0.anInt3951;
			arg0.anInt3903 = (local40 * local61 + local71 * (local88 - local40)) / local88;
			arg0.anInt3925 = ((local88 - local40) * local50 + local40 * local81) / local88;
		}
		arg0.anInt3939 = 0;
		if (arg0.anInt3941 == 0) {
			arg0.anInt3930 = 1024;
		}
		if (arg0.anInt3941 == 1) {
			arg0.anInt3930 = 1536;
		}
		if (arg0.anInt3941 == 2) {
			arg0.anInt3930 = 0;
		}
		if (arg0.anInt3941 == 3) {
			arg0.anInt3930 = 512;
		}
		arg0.anInt3913 = arg0.anInt3930;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!kh;Lclient!kh;II)V")
	public static void method239(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) int arg2) {
		Static135.method2255(-1, arg2, arg0, null, arg1);
	}
}
