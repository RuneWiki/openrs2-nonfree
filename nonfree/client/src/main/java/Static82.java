import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
	public static int anInt2105;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ea;)Lclient!c;")
	public static Class2_Sub1 method1492(@OriginalArg(1) Class2_Sub3 arg0) {
		arg0.method209();
		@Pc(15) int local15 = arg0.method209();
		@Pc(19) Class2_Sub1 local19 = Static207.method3194(local15);
		local19.anInt4630 = arg0.method209();
		@Pc(28) int local28 = arg0.method209();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(38) int local38 = arg0.method209();
			local19.method3204(arg0, local38);
		}
		local19.method3207();
		return local19;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIILclient!nc;JLclient!nc;Lclient!nc;)V")
	public static void method1493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class12 arg6, @OriginalArg(7) Class12 arg7) {
		@Pc(3) Class103 local3 = new Class103();
		local3.aClass12_9 = arg4;
		local3.anInt4712 = arg1 * 128 + 64;
		local3.anInt4707 = arg2 * 128 + 64;
		local3.anInt4709 = arg3;
		local3.aLong147 = arg5;
		local3.aClass12_10 = arg6;
		local3.aClass12_11 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class2_Sub7 local42 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1382; local46++) {
				@Pc(52) Class51 local52 = local42.aClass51Array1[local46];
				if ((local52.aLong69 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass12_4.method2718();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt4703 = -local34;
		if (Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2] = new Class2_Sub7(arg0, arg1, arg2);
		}
		Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2].aClass103_1 = local3;
	}
}
