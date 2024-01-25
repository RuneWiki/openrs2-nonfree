import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
	public static int anInt3611;

	@OriginalMember(owner = "client!tj", name = "bb", descriptor = "Lclient!dh;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "Lclient!la;")
	public static final Class120 aClass120_2 = new Class120(100);

	@OriginalMember(owner = "client!tj", name = "cb", descriptor = "S")
	public static short aShort38 = 32767;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
	public static void method3255() {
		if (Static210.anInt4168 == 2) {
			Static345.anInt6645 = 96;
			return;
		}
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("maxMemory");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local17.invoke(local21, (Object[]) null);
					Static345.anInt6645 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([BZ)Lclient!mc;")
	public static Class5_Sub1_Sub13 method3257(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class5_Sub1_Sub13 local7 = new Class5_Sub1_Sub13();
		@Pc(12) Class5_Sub12 local12 = new Class5_Sub12(arg0);
		local12.anInt5731 = local12.aByteArray90.length - 2;
		@Pc(30) int local30 = local12.method5106();
		@Pc(41) int local41 = local12.aByteArray90.length - local30 - 12 - 2;
		local12.anInt5731 = local41;
		@Pc(48) int local48 = local12.method5067();
		local7.anInt3780 = local12.method5106();
		local7.anInt3779 = local12.method5106();
		local7.anInt3782 = local12.method5106();
		local7.anInt3778 = local12.method5106();
		@Pc(72) int local72 = local12.method5115();
		@Pc(80) int local80;
		@Pc(85) int local85;
		if (local72 > 0) {
			local7.aClass190Array1 = new Class190[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local85 = local12.method5106();
				@Pc(92) Class190 local92 = new Class190(Static109.method1929(local85));
				local7.aClass190Array1[local80] = local92;
				while (local85-- > 0) {
					@Pc(102) int local102 = local12.method5067();
					@Pc(106) int local106 = local12.method5067();
					local92.method5464(new Class5_Sub15(local106), (long) local102);
				}
			}
		}
		local12.anInt5731 = 0;
		local7.aString25 = local12.method5114();
		local7.anIntArray373 = new int[local48];
		local7.anIntArray374 = new int[local48];
		local7.aStringArray44 = new String[local48];
		local80 = 0;
		while (local41 > local12.anInt5731) {
			local85 = local12.method5106();
			if (local85 == 3) {
				local7.aStringArray44[local80] = local12.method5064().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local7.anIntArray374[local80] = local12.method5115();
			} else {
				local7.anIntArray374[local80] = local12.method5067();
			}
			local7.anIntArray373[local80++] = local85;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!i;IIZII)V")
	public static void method3258(@OriginalArg(0) Class89 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static139.anInt2692 >= 50 || (arg0 == null || arg0.anIntArrayArray47 == null || arg3 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg3] == null)) {
			return;
		}
		@Pc(38) int local38 = arg0.anIntArrayArray47[arg3][0];
		@Pc(42) int local42 = local38 >> 8;
		@Pc(48) int local48 = local38 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg3].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg3].length);
			if (local65 > 0) {
				local42 = arg0.anIntArrayArray47[arg3][local65];
			}
		}
		@Pc(78) int local78 = local38 & 0x1F;
		if (local78 == 0) {
			if (arg2) {
				Static115.method2017(0, local48, local42, 255);
			}
		} else if (Static263.anInt5208 != 0) {
			Static9.anIntArray41[Static139.anInt2692] = local42;
			Static350.anIntArray636[Static139.anInt2692] = local48;
			Static190.anIntArray57[Static139.anInt2692] = 0;
			Static270.aClass50Array1[Static139.anInt2692] = null;
			Static316.anIntArray443[Static139.anInt2692] = 255;
			local65 = (arg1 - 64) / 128;
			@Pc(130) int local130 = (arg4 - 64) / 128;
			Static127.anIntArray243[Static139.anInt2692] = (local65 << 16) + (local130 << 8) + local78;
			Static139.anInt2692++;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)I")
	public static int method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static127.anIntArrayArray45 == null ? 0 : Static127.anIntArrayArray45[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)I")
	public static int method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static310.anIntArray626[arg1 & 0x3] : Static184.anIntArray551[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)I")
	public static int method3262(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
