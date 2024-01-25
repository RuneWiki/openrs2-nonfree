import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!lia", name = "ic", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_114 = new Class186(103, 9);

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(B)V")
	public static void method5242() {
		@Pc(8) Class3_Sub14 local8 = (Class3_Sub14) Static641.aClass357_61.method8391();
		@Pc(19) boolean local19 = Static509.aClass20_16 != null || Static618.anInt6009 > 0;
		@Pc(23) int local23 = local8.method4292();
		@Pc(27) int local27 = local8.method4294();
		if (local19) {
			Static470.anInt8264 = 1;
		}
		if (local19) {
			Static356.aClass3_Sub4_Sub5_1 = Static693.aClass3_Sub4_Sub5_4;
		} else {
			Static2.method9131(Static693.aClass3_Sub4_Sub5_4, local23, local27);
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method5247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class83 local9 = Static591.aClass83Array1[99];
		for (@Pc(18) int local18 = 99; local18 > 0; local18--) {
			Static591.aClass83Array1[local18] = Static591.aClass83Array1[local18 - 1];
		}
		if (local9 == null) {
			local9 = new Class83(arg5, arg1, arg3, arg2, arg6, arg7, arg0, arg4);
		} else {
			local9.method2163(arg5, arg0, arg6, arg2, arg3, arg1, arg4, arg7);
		}
		Static221.anInt4262 = Static210.anInt3647;
		Static111.anInt2225++;
		Static591.aClass83Array1[0] = local9;
	}
}
