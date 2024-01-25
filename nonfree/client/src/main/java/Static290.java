import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "Lclient!rn;")
	public static Class18 aClass18_22;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray131 = new String[100];

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
	public static int anInt5046 = 0;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	public static void method4402(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class2 local9 = Static154.aClass246_8.method5606(); local9 != null; local9 = Static154.aClass246_8.method5614()) {
			if ((local9.aLong209 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I")
	public static int method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static324.aByteArrayArray17 == null ? 0 : Static324.aByteArrayArray17[arg0][arg1] & 0xFF;
	}
}
