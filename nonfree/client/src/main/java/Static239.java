import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
	public static int anInt4239;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "Lclient!os;")
	public static final Class182 aClass182_145 = new Class182("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
	public static int anInt4238 = 0;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZBI)V")
	public static void method3392(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class10_Sub44 local10 = Static40.method555(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray704.length; local15++) {
				local10.anIntArray704[local15] = -1;
				local10.anIntArray703[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZI)V")
	public static void method3396(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static109.anInt2181 = arg0;
		Static156.anInt3163 = 3;
		Static456.method6048(Static78.aClass21_1.aString5, Static78.aClass21_1.anInt407);
		if (arg1) {
			Static161.method2702("", "");
		} else {
			Static386.method5170();
			Static161.method2702(Static410.aString69, Static384.aString62);
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)V")
	public static void method3397() {
		Static81.aClass167_10.method3701();
	}
}
