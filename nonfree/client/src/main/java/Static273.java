import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!hc;IIIII)V", line = 6)
	public static void method5104(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7100 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub26_Sub1Array3[local4] != null) {
				arg0.anInt7100++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt7100; local22++) {
			@Pc(31) long local31 = Static48.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class2_Sub26_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static283.aClass2_Sub26_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub26_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static48.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static283.aClass2_Sub26_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub26_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt7100 - 1; local91++) {
				arg0.aClass2_Sub26_Sub1Array3[local91] = arg0.aClass2_Sub26_Sub1Array3[local91 + 1];
			}
			arg0.anInt7100--;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 61)
	public static void method5105() {
		Static163.aClass123_2.method3339();
		Static210.aClass119_1.method3313();
		if (Static314.aClass131_1 != null) {
			Static314.aClass131_1.method3692(Static21.aCanvas1);
		}
		Static135.aClient1.method1381();
		Static21.aCanvas1.setBackground(Color.black);
		Class11_Sub2_Sub1.anInt721 = -1;
		Static163.aClass123_2 = Static18.method556(Static21.aCanvas1);
		Static210.aClass119_1 = Static30.method948(Static21.aCanvas1);
		if (Static314.aClass131_1 != null) {
			Static314.aClass131_1.method3693(Static21.aCanvas1);
		}
	}
}
