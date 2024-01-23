import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "[Lclient!k;")
	public static Class85[] aClass85Array2 = new Class85[50];

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	public static int anInt5382 = 0;

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString190 = "Ok";

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
	public static void method4266() {
		aString190 = null;
		aClass85Array2 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILclient!en;JZ)V")
	public static void method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class135 local6 = new Class135();
		local6.aClass12_8 = arg4;
		local6.anInt4100 = arg1 * 128 + 64;
		local6.anInt4098 = arg2 * 128 + 64;
		local6.anInt4101 = arg3;
		local6.aLong147 = arg5;
		local6.aBoolean271 = arg6;
		if (Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub11(arg0, arg1, arg2);
		}
		Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass135_1 = local6;
	}
}
