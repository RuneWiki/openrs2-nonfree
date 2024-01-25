import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!sm;")
	public static Class210 aClass210_16;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public static int anInt1966 = 0;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	public static void method1789() {
		@Pc(12) Class202 local12 = null;
		try {
			@Pc(16) Class1 local16 = Static92.aClass53_2.method1177();
			while (local16.anInt2 == 0) {
				Static185.method3004(1L);
			}
			if (local16.anInt2 == 1) {
				local12 = (Class202) local16.anObject1;
				@Pc(41) byte[] local41 = new byte[(int) local12.method4941()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local12.method4942(local41.length - local43, local43, local41);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static359.method5429(new Class2_Sub13(local41));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local12 != null) {
				local12.method4940();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Z")
	public static boolean method1790(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!vd;IIIII)V")
	public static void method1791(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5141 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub14_Sub1Array4[local4] != null) {
				arg0.anInt5141++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5141; local22++) {
			@Pc(31) long local31 = Static259.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class2_Sub14_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static305.aClass2_Sub14_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub14_Sub1Array4[local22]) {
					continue label51;
				}
			}
			local31 = Static259.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static305.aClass2_Sub14_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub14_Sub1Array4[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt5141 - 1; local91++) {
				arg0.aClass2_Sub14_Sub1Array4[local91] = arg0.aClass2_Sub14_Sub1Array4[local91 + 1];
			}
			arg0.anInt5141--;
		}
	}
}
