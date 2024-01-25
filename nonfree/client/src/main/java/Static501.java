import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_59 = new Class341();

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_201 = new Class215(106, 8);

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
	public static final int anInt9260 = 1401;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg5 < 1 || arg0 > Static47.anInt1794 - 2 || arg5 > Static209.anInt4742 - 2) {
			return;
		}
		@Pc(29) int local29 = arg7;
		if (arg7 < 3 && Static30.method735(arg5, arg0)) {
			local29 = arg7 + 1;
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 0 && !Static267.method4913(arg5, arg0, Static425.anInt8001, local29)) {
			return;
		}
		if (Static395.aClass100ArrayArrayArray3 == null) {
			return;
		}
		Static113.aClass322_Sub1_1.method8711(Static55.aClass104Array3[arg7], arg1, arg7, Static186.aClass20_4, arg0, arg5);
		if (arg3 >= 0) {
			@Pc(77) int local77 = Static74.aClass2_Sub13_5.aClass14_Sub12_1.method5129();
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub12_1, 1);
			Static113.aClass322_Sub1_1.method8706(arg0, arg7, arg3, Static186.aClass20_4, local29, arg4, arg5, arg2, arg6, Static55.aClass104Array3[arg7]);
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub12_1, local77);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BIIILclient!ke;)V")
	public static void method7741(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class3_Sub1_Sub3_Sub3_Sub2 arg2) {
		@Pc(10) int local10 = arg2.anIntArray358[0];
		@Pc(15) int local15 = arg2.anIntArray357[0];
		if (local10 < 0 || Static47.anInt1794 <= local10 || local15 < 0 || Static209.anInt4742 <= local15 || (arg1 < 0 || Static47.anInt1794 <= arg1 || arg0 < 0 || arg0 >= Static209.anInt4742)) {
			return;
		}
		@Pc(77) int local77 = Static621.method9058(arg1, arg2.method5214(), 0, Static391.anIntArray480, true, -4, local10, local15, Static96.anIntArray133, arg0, Static55.aClass104Array3[arg2.aByte132], 0, 0, 0);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(94) int local94 = 0; local94 < local77 - 1; local94++) {
				arg2.method5221((byte) 2, Static96.anIntArray133[local94], Static391.anIntArray480[local94]);
			}
		}
	}
}
