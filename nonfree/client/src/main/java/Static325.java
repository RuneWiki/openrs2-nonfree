import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_36 = new Class91();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!bt;Z[Lclient!bn;)Lclient!ej;")
	public static Class63 method4858(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(2) Class27[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong18 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg1.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg1[local42].aLong18);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static422.anIntArray592, 0);
		if (Static422.anIntArray592[0] == 0) {
			if (Static422.anIntArray592[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static422.anIntArray592, 1);
			if (Static422.anIntArray592[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static422.anIntArray592[1]];
				OpenGL.glGetInfoLogARB(local40, Static422.anIntArray592[1], Static422.anIntArray592, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static422.anIntArray592[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg1.length; local109++) {
					OpenGL.glDetachObjectARB(local40, arg1[local109].aLong18);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class63(arg0, local40, arg1);
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
	public static void method4859() {
		for (@Pc(15) int local15 = 0; local15 < Static222.anInt4450; local15++) {
			@Pc(21) int local21 = Static206.anIntArray321[local15];
			@Pc(29) Class11_Sub5_Sub2_Sub2 local29 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) local21)).aClass11_Sub5_Sub2_Sub2_2;
			@Pc(33) int local33 = Static196.aClass4_Sub20_Sub1_4.method4614();
			if ((local33 & 0x20) != 0) {
				local33 += Static196.aClass4_Sub20_Sub1_4.method4614() << 8;
			}
			@Pc(56) int local56;
			if ((local33 & 0x200) != 0) {
				local56 = Static196.aClass4_Sub20_Sub1_4.method4617();
				@Pc(59) int[] local59 = new int[local56];
				@Pc(62) int[] local62 = new int[local56];
				@Pc(65) int[] local65 = new int[local56];
				for (@Pc(67) int local67 = 0; local67 < local56; local67++) {
					@Pc(73) int local73 = Static196.aClass4_Sub20_Sub1_4.method4560();
					if (local73 == 65535) {
						local73 = -1;
					}
					local59[local67] = local73;
					local62[local67] = Static196.aClass4_Sub20_Sub1_4.method4617();
					local65[local67] = Static196.aClass4_Sub20_Sub1_4.method4623();
				}
				Static466.method6322(local62, local59, local65, local29);
			}
			if ((local33 & 0x400) != 0) {
				local29.anInt6474 = Static196.aClass4_Sub20_Sub1_4.method4576();
				local29.anInt6509 = Static196.aClass4_Sub20_Sub1_4.method4568();
				local29.anInt6547 = Static196.aClass4_Sub20_Sub1_4.method4568();
				local29.anInt6508 = Static196.aClass4_Sub20_Sub1_4.method4568();
				local29.anInt6533 = Static196.aClass4_Sub20_Sub1_4.method4607() + Static277.anInt2834;
				local29.anInt6538 = Static196.aClass4_Sub20_Sub1_4.method4560() + Static277.anInt2834;
				local29.anInt6500 = Static196.aClass4_Sub20_Sub1_4.method4602();
				local29.anInt6547 += local29.anIntArray523[0];
				local29.anInt6549 = 1;
				local29.anInt6550 = 0;
				local29.anInt6474 += local29.anIntArray523[0];
				local29.anInt6508 += local29.anIntArray524[0];
				local29.anInt6509 += local29.anIntArray524[0];
			}
			@Pc(209) int local209;
			@Pc(220) int local220;
			if ((local33 & 0x10) != 0) {
				local56 = Static196.aClass4_Sub20_Sub1_4.method4560();
				local209 = Static196.aClass4_Sub20_Sub1_4.method4595();
				if (local56 == 65535) {
					local56 = -1;
				}
				local220 = Static196.aClass4_Sub20_Sub1_4.method4617();
				local29.method5299(false, local220, local56, local209);
			}
			if ((local33 & 0x1) != 0) {
				if (local29.aClass241_1.method5597()) {
					Static371.method5250(local29);
				}
				local29.method5311(Static220.aClass247_1.method5660(Static196.aClass4_Sub20_Sub1_4.method4623()));
				local29.method5304(local29.aClass241_1.anInt7007);
				local29.anInt6530 = local29.aClass241_1.anInt6998 << 3;
				if (local29.aClass241_1.method5597()) {
					Static456.method6201(local29.anIntArray523[0], local29.aByte100, local29, 0, local29.anIntArray524[0], null, null);
				}
			}
			if ((local33 & 0x100) != 0) {
				local29.anInt6566 = Static196.aClass4_Sub20_Sub1_4.method4607();
				local29.anInt6572 = Static196.aClass4_Sub20_Sub1_4.method4560();
			}
			if ((local33 & 0x1000) != 0) {
				local29.aByte80 = Static196.aClass4_Sub20_Sub1_4.method4578();
				local29.aByte79 = Static196.aClass4_Sub20_Sub1_4.method4576();
				local29.aByte77 = Static196.aClass4_Sub20_Sub1_4.method4568();
				local29.aByte78 = (byte) Static196.aClass4_Sub20_Sub1_4.method4618();
				local29.anInt6492 = Static277.anInt2834 + Static196.aClass4_Sub20_Sub1_4.method4607();
				local29.anInt6524 = Static277.anInt2834 + Static196.aClass4_Sub20_Sub1_4.method4607();
			}
			if ((local33 & 0x2) != 0) {
				local29.aString56 = Static196.aClass4_Sub20_Sub1_4.method4624();
				local29.anInt6531 = 100;
			}
			if ((local33 & 0x40) != 0) {
				local29.anInt6495 = Static196.aClass4_Sub20_Sub1_4.method4623();
				if (local29.anInt6495 == 65535) {
					local29.anInt6495 = -1;
				}
			}
			if ((local33 & 0x80) != 0) {
				local56 = Static196.aClass4_Sub20_Sub1_4.method4606();
				if (local56 == 65535) {
					local56 = -1;
				}
				local209 = Static196.aClass4_Sub20_Sub1_4.method4618();
				Static204.method3630(local56, local29, local209);
			}
			if ((local33 & 0x8) != 0) {
				local56 = Static196.aClass4_Sub20_Sub1_4.method4575();
				local209 = Static196.aClass4_Sub20_Sub1_4.method4602();
				local29.method5292(local56, Static277.anInt2834, local209);
			}
			if ((local33 & 0x2000) != 0) {
				local56 = Static196.aClass4_Sub20_Sub1_4.method4560();
				local29.anInt6519 = Static196.aClass4_Sub20_Sub1_4.method4614();
				local29.anInt6498 = Static196.aClass4_Sub20_Sub1_4.method4618();
				local29.aBoolean476 = (local56 & 0x8000) != 0;
				local29.anInt6529 = local56 & 0x7FFF;
				local29.anInt6535 = local29.anInt6519 + Static277.anInt2834 + local29.anInt6529;
			}
			if ((local33 & 0x4) != 0) {
				local56 = Static196.aClass4_Sub20_Sub1_4.method4575();
				local209 = Static196.aClass4_Sub20_Sub1_4.method4614();
				local29.method5292(local56, Static277.anInt2834, local209);
				local29.anInt6542 = Static277.anInt2834 + 300;
				local29.anInt6477 = Static196.aClass4_Sub20_Sub1_4.method4614();
			}
			if ((local33 & 0x800) != 0) {
				local56 = Static196.aClass4_Sub20_Sub1_4.method4623();
				local209 = Static196.aClass4_Sub20_Sub1_4.method4570();
				if (local56 == 65535) {
					local56 = -1;
				}
				local220 = Static196.aClass4_Sub20_Sub1_4.method4614();
				local29.method5299(true, local220, local56, local209);
			}
		}
	}
}
