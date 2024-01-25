import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Lclient!kda;")
	public static Class160 aClass160_69;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_45 = new Class316(4);

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
	public static int anInt5935 = 2;

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
	public static int anInt5936 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)Z")
	public static boolean method5130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static19.method826(arg1, arg0) | Static306.method5089(arg1, arg0) | Static339.method5498(arg1, arg0)) & Static328.method5369(arg0, arg1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	public static void method5131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class1_Sub1_Sub13 local17 = Static476.method6225(14, arg0);
		local17.method4919();
		local17.anInt5686 = arg1;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([BIII)I")
	public static int method5132(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = -1;
		for (@Pc(15) int local15 = arg1; local15 < arg2; local15++) {
			local13 = local13 >>> 8 ^ Class1_Sub1_Sub14.anIntArray414[(arg0[local15] ^ local13) & 0xFF];
		}
		return ~local13;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)I")
	public static int method5133(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
