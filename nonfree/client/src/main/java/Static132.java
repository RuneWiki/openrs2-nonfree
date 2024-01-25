import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public static int anInt2759;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
	public static int anInt2760;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!l;")
	public static Class57 aClass57_9;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!m;")
	public static final Class127 aClass127_14 = new Class127();

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString104 = "flash3:";

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString105 = null;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public static int anInt2758 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!lo;ILclient!lo;)V")
	public static void method2233(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_61 != null) {
			arg1.method5385();
		}
		arg1.aClass3_Sub7_62 = arg0.aClass3_Sub7_62;
		arg1.aClass3_Sub7_61 = arg0;
		arg1.aClass3_Sub7_61.aClass3_Sub7_62 = arg1;
		arg1.aClass3_Sub7_62.aClass3_Sub7_61 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Lclient!ua;")
	public static Class5_Sub5 method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass5_Sub5_1;
	}
}
