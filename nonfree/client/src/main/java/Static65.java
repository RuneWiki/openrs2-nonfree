import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!ct;")
	public static Class30 aClass30_86;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_195 = new Class18(48, 2);

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "[I")
	public static final int[] anIntArray454 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "[S")
	public static short[] aShortArray99 = new short[256];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Lclient!mj;")
	public static Class135_Sub1 method5277() {
		return Static164.aClass135_Sub1Array2.length > Static86.anInt1918 ? Static164.aClass135_Sub1Array2[Static86.anInt1918++] : null;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZZ)Lclient!kj;")
	public static Class1_Sub26 method5281(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class1_Sub26) Static143.aClass38_12.method1475(local17);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBIZ)V")
	public static void method5283(@OriginalArg(3) boolean arg0) {
		Static237.anInt2675 = 2;
		Static100.aBoolean156 = arg0;
		Static14.anInt4962 = 22050;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!gt;)V")
	public static void method5285(@OriginalArg(1) Class75 arg0) {
		Static140.anInt3021 = 3;
		method5286(true);
		Static239.aBoolean363 = true;
		Static289.anInt5617 = 0;
		Static318.aBoolean455 = true;
		Static30.aBoolean49 = true;
		Static69.aBoolean112 = true;
		Static218.anInt4352 = 2;
		Static61.aBoolean108 = true;
		Static299.aBoolean302 = true;
		Static43.aBoolean407 = true;
		Static209.anInt4164 = 0;
		Static42.anInt1013 = 0;
		Static105.anInt2415 = 127;
		Static170.anInt3543 = 0;
		Static291.aBoolean430 = true;
		Static80.aBoolean128 = true;
		Static24.aBoolean34 = true;
		Static124.anInt2721 = 127;
		Static257.anInt1060 = 1;
		Static219.anInt4418 = 255;
		if (Static268.anInt5269 < 96) {
			Static5.method272(0);
		} else {
			Static5.method272(2);
		}
		Static298.aBoolean483 = true;
		Static41.aBoolean62 = false;
		Static300.anInt5779 = Static196.anInt3975 == 1 ? 2 : 4;
		Static164.anInt3449 = 2;
		Static271.aBoolean33 = false;
		Static359.anInt6875 = 2;
		Static209.aBoolean308 = true;
		Static72.anInt1645 = 0;
		Static277.anInt5395 = 0;
		Static367.aBoolean512 = false;
		@Pc(93) Class183 local93 = null;
		try {
			@Pc(97) Class121 local97 = arg0.method2370();
			while (local97.anInt3693 == 0) {
				Static135.method2737(1L);
			}
			if (local97.anInt3693 == 1) {
				local93 = (Class183) local97.anObject2;
				@Pc(119) byte[] local119 = new byte[(int) local93.method4932()];
				@Pc(134) int local134;
				for (@Pc(121) int local121 = 0; local121 < local119.length; local121 += local134) {
					local134 = local93.method4936(local121, local119, local119.length - local121);
					if (local134 == -1) {
						throw new IOException("EOF");
					}
				}
				Static159.method2991(new Class1_Sub7(local119));
			}
		} catch (@Pc(159) Exception local159) {
		}
		try {
			if (local93 != null) {
				local93.method4934();
			}
		} catch (@Pc(166) Exception local166) {
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V")
	public static void method5286(@OriginalArg(0) boolean arg0) {
		Static103.aBoolean159 = arg0;
		Static260.aBoolean386 = !Static150.method4956();
	}
}
