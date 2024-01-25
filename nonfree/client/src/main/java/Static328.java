import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public static int anInt5379;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray136;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_169 = new Class151("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_194 = new Class214(85, -1);

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
	public static int anInt5387 = -1;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray135 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method4200(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg1); local14 != -1; local14 = arg0.indexOf(arg1, arg2.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg2 + arg0.substring(arg1.length() + local14);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
	public static void method4202(@OriginalArg(0) int arg0) {
		Static127.anIntArray104 = new int[arg0];
		Static425.anIntArray461 = new int[arg0];
		Static331.anIntArray328 = new int[arg0];
		Static367.anIntArray377 = new int[arg0];
		Static355.anIntArray347 = new int[arg0];
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)Z")
	public static boolean method4203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
