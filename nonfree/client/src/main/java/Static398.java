import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!ke;")
	public static Class196 aClass196_212 = null;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public static int anInt6905 = 0;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_213 = new Class196(127, 4);

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_214 = new Class196(62, -2);

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "J")
	public static long aLong207 = 0L;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIILclient!bq;)V")
	public static void method5868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class41_Sub1_Sub2 arg4) {
		@Pc(4) Class313 local4 = Static40.method503(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10366 = (arg1 << Static138.anInt2287) + Static143.anInt2383;
		arg4.anInt10370 = arg3;
		arg4.anInt10367 = (arg2 << Static138.anInt2287) + Static143.anInt2383;
		local4.aClass41_Sub1_Sub2_1 = arg4;
		@Pc(33) int local33 = Static298.aClass88Array3 == Static176.aClass88Array1 ? 1 : 0;
		if (arg4.method8650()) {
			if (arg4.method8647()) {
				arg4.aClass41_Sub1_23 = Static227.aClass41_Sub1Array3[local33];
				Static227.aClass41_Sub1Array3[local33] = arg4;
				return;
			}
			arg4.aClass41_Sub1_23 = Static271.aClass41_Sub1Array4[local33];
			Static271.aClass41_Sub1Array4[local33] = arg4;
			Static677.aBoolean794 = true;
			return;
		}
		arg4.aClass41_Sub1_23 = Static126.aClass41_Sub1Array2[local33];
		Static126.aClass41_Sub1Array2[local33] = arg4;
	}
}
