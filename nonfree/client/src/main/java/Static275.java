import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public static int anInt4346;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "Lclient!oa;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	public static int anInt4348 = 0;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_27 = new Class254();

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "Z")
	public static boolean aBoolean345 = true;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I[[[BIIIIIIIILclient!qa;II)V")
	public static void method3496(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class128 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg8 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg6 = 1;
			arg7 = arg7 + 1 & 0x3;
		}
		if (arg6 == 10) {
			arg6 = 1;
			arg7 = arg7 + 3 & 0x3;
		}
		if (arg6 == 11) {
			arg7 = arg7 + 3 & 0x3;
			arg6 = 8;
		}
		arg9.aa(arg3, arg11, arg2, arg0, arg10, arg4, arg1[arg6 - 1][arg7], arg8, arg5);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public static void method3497() {
		@Pc(8) Class1_Sub29 local8 = (Class1_Sub29) Static416.aClass254_44.method5437();
		@Pc(21) boolean local21 = Static68.aClass250_2 != null || Static316.anInt5247 > 0;
		if (local21) {
			Static220.anInt3559 = 1;
		}
		if (Static314.aBoolean419 && Static321.aClass31_4.method3798(81) && Static19.anInt396 > 2) {
			if (local21) {
				Static261.aClass1_Sub45_2 = (Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261.aClass1_261;
			} else {
				Static74.method1179((Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261.aClass1_261, local8.method3484(), local8.method3481());
			}
		} else if (local21) {
			Static261.aClass1_Sub45_2 = (Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261;
		} else {
			Static74.method1179((Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261, local8.method3484(), local8.method3481());
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public static void method3498() {
		@Pc(10) int local10 = Static336.aClass106_Sub1_1.method4430(Static410.anInt6680);
		if (local10 == 0) {
			Static417.aByteArrayArrayArray3 = null;
			Static328.method4202(0);
		} else if (local10 == 1) {
			Static447.method5584((byte) 0);
			Static328.method4202(512);
			if (Static357.aByteArrayArrayArray11 != null) {
				Static97.method1390();
			}
		} else {
			Static447.method5584((byte) (Static116.anInt5420 - 4 & 0xFF));
			Static328.method4202(2);
		}
		Static329.anInt5391 = Static138.anInt3548;
	}
}
