import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "J")
	public static long aLong137;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "Lclient!du;")
	public static final Class62 aClass62_28 = new Class62(13, -1);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method3333(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static427.method5426(arg1, 2);
		local12.method384();
		local12.aString4 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!sq;IIIII)V")
	public static void method3334(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4999 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub29Array3[local4] != null) {
				arg0.anInt4999++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt4999; local22++) {
			@Pc(31) long local31 = Static404.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class93 local41;
			while (local31 != 0L) {
				local41 = Static203.aClass93Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub29_2 == arg0.aClass1_Sub29Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static404.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static203.aClass93Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub29_2 == arg0.aClass1_Sub29Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt4999 - 1; local93++) {
				arg0.aClass1_Sub29Array3[local93] = arg0.aClass1_Sub29Array3[local93 + 1];
			}
			arg0.anInt4999--;
		}
	}
}
