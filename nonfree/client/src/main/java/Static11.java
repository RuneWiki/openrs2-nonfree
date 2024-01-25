import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!jc;I)V")
	public static void method170(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static370.aClass130_4 != null) {
			@Pc(27) int local27;
			try {
				Static370.aClass130_4.method3465(0L);
				Static370.aClass130_4.method3457(local13);
				for (local27 = 0; local27 < 24 && local13[local27] == 0; local27++) {
				}
				if (local27 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(59) Exception local59) {
				for (local27 = 0; local27 < 24; local27++) {
					local13[local27] = -1;
				}
			}
		}
		arg0.method2988(0, local13, 24);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!qo;Z)I")
	public static int method171(@OriginalArg(0) Class60_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt4865 == 0) {
			return 0;
		}
		@Pc(72) int local72;
		@Pc(65) int local65;
		if (arg0.anInt4858 != -1) {
			@Pc(27) Class60_Sub1_Sub1_Sub3 local27 = null;
			if (arg0.anInt4858 < 32768) {
				@Pc(39) Class6_Sub11 local39 = (Class6_Sub11) Static419.aClass74_45.method1401((long) arg0.anInt4858);
				if (local39 != null) {
					local27 = local39.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				}
			} else if (arg0.anInt4858 >= 32768) {
				local27 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt4858 - 32768];
			}
			if (local27 != null) {
				local65 = arg0.anInt9048 - local27.anInt9048;
				local72 = arg0.anInt9057 - local27.anInt9057;
				if (local65 != 0 || local72 != 0) {
					arg0.method4419((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class60_Sub1_Sub1_Sub3_Sub1) {
			@Pc(102) Class60_Sub1_Sub1_Sub3_Sub1 local102 = (Class60_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local102.anInt2853 != -1 && (local102.anInt4879 == 0 || local102.anInt4881 > 0)) {
				local102.method4419(local102.anInt2853);
				local102.anInt2853 = -1;
			}
		} else if (arg0 instanceof Class60_Sub1_Sub1_Sub3_Sub2) {
			@Pc(140) Class60_Sub1_Sub1_Sub3_Sub2 local140 = (Class60_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local140.anInt4883 != -1 && (local140.anInt4879 == 0 || local140.anInt4881 > 0)) {
				local65 = local140.anInt9048 - (local140.anInt4883 - Static50.anInt606 - Static50.anInt606) * 256;
				local72 = local140.anInt9057 - (local140.anInt4885 - Static404.anInt7039 - Static404.anInt7039) * 256;
				if (local65 != 0 || local72 != 0) {
					local140.method4419((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
				local140.anInt4883 = -1;
			}
		}
		return arg0.method4427();
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(II)Z")
	public static boolean method172(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
