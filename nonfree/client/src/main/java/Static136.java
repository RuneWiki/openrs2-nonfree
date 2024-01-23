import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!fh;")
	public static Class58 aClass58_61;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public static int anInt2587;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
	public static void method2022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static43.method2329(13, arg1);
		local8.method1520();
		local8.anInt1993 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(CLjava/lang/StringBuffer;IZ)Ljava/lang/StringBuffer;")
	public static StringBuffer method2025(@OriginalArg(1) StringBuffer arg0) {
		@Pc(14) int local14 = arg0.length();
		arg0.setLength(0);
		for (@Pc(19) int local19 = local14; local19 < 0; local19++) {
			arg0.setCharAt(local19, ' ');
		}
		return arg0;
	}
}
