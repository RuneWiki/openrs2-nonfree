import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lclient!jn;")
	public static Class9_Sub4_Sub5 method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub4_Sub5_2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!hl;I[Lclient!on;)Lclient!fg;")
	public static Class98 method5922(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(2) Class246[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong203 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg1.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg1[local33].aLong203);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static422.anIntArray409, 0);
		if (Static422.anIntArray409[0] == 0) {
			if (Static422.anIntArray409[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static422.anIntArray409, 1);
			if (Static422.anIntArray409[1] > 1) {
				@Pc(86) byte[] local86 = new byte[Static422.anIntArray409[1]];
				OpenGL.glGetInfoLogARB(local31, Static422.anIntArray409[1], Static422.anIntArray409, 0, local86, 0);
				System.out.println(new String(local86));
			}
			if (Static422.anIntArray409[0] == 0) {
				for (@Pc(110) int local110 = 0; local110 < arg1.length; local110++) {
					OpenGL.glDetachObjectARB(local31, arg1[local110].aLong203);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class98(arg0, local31, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method5925() {
		for (@Pc(10) Class6_Sub5_Sub6 local10 = (Class6_Sub5_Sub6) Static493.aClass163_51.method4966(); local10 != null; local10 = (Class6_Sub5_Sub6) Static493.aClass163_51.method4965()) {
			@Pc(15) Class9_Sub4_Sub2_Sub4 local15 = local10.aClass9_Sub4_Sub2_Sub4_1;
			if (Static384.anInt7234 > local15.anInt8676) {
				local10.method8792();
				local15.method7228();
			} else if (Static384.anInt7234 >= local15.anInt8693) {
				local15.method7230();
				if (local15.anInt8694 > 0) {
					@Pc(49) Class6_Sub42 local49 = (Class6_Sub42) Static461.aClass380_35.method8747((long) (local15.anInt8694 - 1));
					if (local49 != null) {
						@Pc(54) Class9_Sub4_Sub2_Sub1_Sub1 local54 = local49.aClass9_Sub4_Sub2_Sub1_Sub1_1;
						if (local54.anInt10360 >= 0 && local54.anInt10360 < Static306.anInt6176 * 512 && local54.anInt10357 >= 0 && local54.anInt10357 < Static108.anInt2930 * 512) {
							local15.method7224(local54.anInt10360, Static150.method2982(local15.aByte135, local54.anInt10357, local54.anInt10360) - local15.anInt8672, Static384.anInt7234, local54.anInt10357);
						}
					}
				}
				if (local15.anInt8694 < 0) {
					@Pc(112) int local112 = -local15.anInt8694 - 1;
					@Pc(123) Class9_Sub4_Sub2_Sub1_Sub2 local123;
					if (local112 == Static238.anInt5268) {
						local123 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1;
					} else {
						local123 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local112];
					}
					if (local123 != null && local123.anInt10360 >= 0 && local123.anInt10360 < Static306.anInt6176 * 512 && local123.anInt10357 >= 0 && local123.anInt10357 < Static108.anInt2930 * 512) {
						local15.method7224(local123.anInt10360, Static150.method2982(local15.aByte135, local123.anInt10357, local123.anInt10360) - local15.anInt8672, Static384.anInt7234, local123.anInt10357);
					}
				}
				local15.method7225(Static492.anInt8597);
				Static397.method6261(local15, true);
			}
		}
	}
}
