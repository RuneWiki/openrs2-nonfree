import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public static int anInt7176;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void method6323() {
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub13_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub13_2);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub8_1);
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub8_2);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub29_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub1_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub18_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub16_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub10_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub28_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub2_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub6_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub27_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub7_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_2);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub3_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub11_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub25_1);
		Static578.method8094();
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub20_1);
		Static32.aClass3_Sub41_3.method6773(3, Static32.aClass3_Sub41_3.aClass7_Sub14_1);
		Static408.method6354();
		Static183.method2986();
		Static264.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIFIIFFILclient!kt;FFI[BI)V")
	public static void method6325(@OriginalArg(2) float arg0, @OriginalArg(3) int arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) Class80 arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) byte[] arg7, @OriginalArg(13) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg4.method1832(arg6 / (float) 16, arg2 / (float) 128, arg0 * 127.0F, arg1, 0, local12, arg5 / (float) 128);
			local42 = arg8;
			arg5 *= 2.0F;
			for (local48 = 0; local48 < 16384; local48++) {
				arg7[local42] = (byte) (int) ((float) arg7[local42] + local12[local48]);
				local42++;
			}
			arg0 *= arg3;
			arg2 *= 2.0F;
			arg6 *= 2.0F;
		}
		local42 = arg8;
		for (local48 = 0; local48 < 16384; local48++) {
			arg7[local42] = (byte) (arg7[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public static void method6327() {
		if (Static85.aBoolean122) {
			return;
		}
		Static53.method973(Static303.aClass351ArrayArrayArray3);
		if (Static126.aClass351ArrayArrayArray1 != null) {
			Static53.method973(Static126.aClass351ArrayArrayArray1);
		}
		Static85.aBoolean122 = true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/io/File;BI)[B")
	public static byte[] method6329(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static129.method2275(local6, arg0, arg1);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
