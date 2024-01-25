import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
	public static int anInt6303;

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_142 = new Class253(13, 0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZ)V")
	public static void method5008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17 = arg0 * Static130.aClass153_Sub1_1.anInt5240 >> 8;
		if (arg2 == -1 && !Static226.aBoolean244) {
			Static16.method5101();
		} else if (arg2 != -1 && (Static128.anInt2476 != arg2 || !Static422.method5396()) && local17 != 0 && !Static226.aBoolean244) {
			Static21.method227(arg2, Static122.aClass178_39, local17, arg1);
		}
		Static128.anInt2476 = arg2;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIZ)V")
	public static void method5010(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static50.anInt781++;
			Static301.method4016();
		}
		if (arg0) {
			Static34.anInt597++;
			Static268.method3601();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBI)I")
	public static int method5011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static441.anIntArray618[arg0 & 0x3] : 256;
	}
}
