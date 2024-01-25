import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "Lclient!j;")
	public static final Class113 aClass113_3 = new Class113(11, 15);

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[1000][];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
	public static void method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class5 local3 = new Class5();
		local3.anInt88 = arg1 >> Static365.anInt5876;
		local3.anInt89 = arg2 >> Static365.anInt5876;
		local3.anInt80 = arg3 >> Static365.anInt5876;
		local3.anInt76 = arg4 >> Static365.anInt5876;
		local3.anInt82 = arg0;
		local3.anInt73 = arg1;
		local3.anInt78 = arg2;
		local3.anInt83 = arg3;
		local3.anInt70 = arg4;
		local3.anInt84 = arg5;
		local3.anInt92 = arg6;
		Static120.aClass5Array1[Static287.anInt4942++] = local3;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ak;IIIII)V")
	public static void method2080(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3592 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub27_Sub1Array2[local4] != null) {
				arg0.anInt3592++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt3592; local22++) {
			@Pc(31) long local31 = Static295.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class1_Sub27_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static300.aClass1_Sub27_Sub1Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass1_Sub27_Sub1Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static295.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static300.aClass1_Sub27_Sub1Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass1_Sub27_Sub1Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt3592 - 1; local91++) {
				arg0.aClass1_Sub27_Sub1Array2[local91] = arg0.aClass1_Sub27_Sub1Array2[local91 + 1];
			}
			arg0.anInt3592--;
		}
	}
}
