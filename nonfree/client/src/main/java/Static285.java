import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!op", name = "K", descriptor = "Lclient!pc;")
	public static Class188 aClass188_77;

	@OriginalMember(owner = "client!op", name = "O", descriptor = "[I")
	public static int[] anIntArray345 = new int[1];

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(Z)V")
	public static void method4199() {
		@Pc(13) Class2_Sub6 local13 = (Class2_Sub6) Static36.aClass265_2.method6005();
		@Pc(21) boolean local21 = Static191.aClass41_7 != null || Static93.anInt2136 > 0;
		if (local21) {
			Static419.anInt7351 = 1;
		}
		if (Static243.aBoolean380 && Static428.aClass52_1.method1347(81) && Static168.anInt3255 > 2) {
			if (local21) {
				Static76.aClass2_Sub26_1 = (Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262.aClass2_262;
			} else {
				Static139.method2010(local13.method772(), local13.method771(), (Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262.aClass2_262);
			}
		} else if (local21) {
			Static76.aClass2_Sub26_1 = (Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262;
		} else {
			Static139.method2010(local13.method772(), local13.method771(), (Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
	public static void method4200(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static110.method1691(arg1, arg0, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II[FIIII)V")
	public static void method4201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 > 0 && !Static74.method1330(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static74.method1330(arg3)) {
			@Pc(31) int local31 = Static346.method4858(6408);
			@Pc(33) int local33 = 0;
			@Pc(49) int local49 = arg3 <= arg1 ? arg3 : arg1;
			@Pc(53) int local53 = arg1 >> 1;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(59) float[] local59 = arg2;
			@Pc(66) float[] local66 = new float[local57 * local53 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg1, arg3, 0, 6408, 5126, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local31;
				@Pc(87) float[] local87 = local66;
				for (@Pc(89) int local89 = 0; local89 < local31; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local85 + local89;
					for (@Pc(101) int local101 = 0; local101 < local57; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local53; local105++) {
							@Pc(111) float local111 = local59[local95];
							local95 += local31;
							@Pc(121) float local121 = local111 + local59[local95];
							@Pc(127) float local127 = local121 + local59[local99];
							local95 += local31;
							local99 += local31;
							@Pc(141) float local141 = local127 + local59[local99];
							local99 += local31;
							local66[local93] = local141 * 0.25F;
							local93 += local31;
						}
						local95 += local85;
						local99 += local85;
					}
				}
				local66 = local59;
				local59 = local87;
				arg3 = local57;
				arg1 = local53;
				local53 >>= 0x1;
				local49 >>= 0x1;
				local57 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!op", name = "g", descriptor = "(I)Lclient!of;")
	public static Class38_Sub7 method4203() {
		@Pc(13) Class38_Sub7 local13 = (Class38_Sub7) Static61.aClass184_1.method4208();
		if (local13 == null) {
			return new Class38_Sub7();
		} else {
			Static279.anInt5101--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!op", name = "h", descriptor = "(I)V")
	public static void method4204() {
		if (Static140.aFrame12 != null) {
			return;
		}
		@Pc(8) int local8 = Static128.anInt2522;
		@Pc(10) int local10 = Static442.anInt7733;
		@Pc(16) int local16 = Static203.anInt3944 - Static96.anInt2175 - local8;
		@Pc(29) int local29 = Static13.anInt316 - Static216.anInt4171 - local10;
		if (local8 <= 0 && local16 <= 0 && local10 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (Static373.aFrame2 == null) {
				local50 = Static303.aClass131_4.anApplet1;
			} else {
				local50 = Static373.aFrame2;
			}
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			if (local50 == Static373.aFrame2) {
				@Pc(65) Insets local65 = Static373.aFrame2.getInsets();
				local59 = local65.top;
				local57 = local65.left;
			}
			@Pc(74) Graphics local74 = local50.getGraphics();
			local74.setColor(Color.black);
			if (local8 > 0) {
				local74.fillRect(local57, local59, local8, Static13.anInt316);
			}
			if (local10 > 0) {
				local74.fillRect(local57, local59, Static203.anInt3944, local10);
			}
			if (local16 > 0) {
				local74.fillRect(local57 + Static203.anInt3944 - local16, local59, local16, Static13.anInt316);
			}
			if (local29 > 0) {
				local74.fillRect(local57, local59 + Static13.anInt316 - local29, Static203.anInt3944, local29);
				return;
			}
		} catch (@Pc(124) Exception local124) {
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vp;")
	public static RuntimeException_Sub1 method4205(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString67 = local9.aString67 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
