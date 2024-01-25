import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!uga", name = "K", descriptor = "Lclient!rp;")
	public static Class298 aClass298_13;

	@OriginalMember(owner = "client!uga", name = "N", descriptor = "Ljava/lang/Object;")
	public static Object anObject22;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBI)Z")
	public static boolean method8059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BIIZ)V")
	public static void method8061(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static580.aClass25_45.method426((long) arg0) != null) {
			return;
		}
		if (Static306.aBoolean440) {
			@Pc(24) Class3_Sub40 local24 = new Class3_Sub40(arg0, new Class172_Sub1(4096, Static487.aClass343_231, arg0), arg1, arg2);
			local24.aClass172_Sub1_1.method7041(Static495.aStringArray71[Static455.anInt7738]);
			Static580.aClass25_45.method434((long) arg0, local24);
		} else {
			Static56.method1019(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "(Z)V")
	public static void method8062() {
		@Pc(7) Class4 local7 = null;
		try {
			@Pc(17) Class174 local17 = Static48.aClass298_12.method7290("2");
			while (local17.anInt5121 == 0) {
				Static143.method2414(1L);
			}
			if (local17.anInt5121 == 1) {
				local7 = (Class4) local17.anObject12;
				@Pc(42) byte[] local42 = new byte[(int) local7.method85()];
				@Pc(57) int local57;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local57) {
					local57 = local7.method79(local42, local42.length - local44, local44);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static636.method8570(new Class3_Sub9(local42));
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local7 != null) {
				local7.method84();
			}
		} catch (@Pc(92) Exception local92) {
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(II[BI)I")
	public static int method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(11) int local11 = -1;
		for (@Pc(13) int local13 = arg1; local13 < arg0; local13++) {
			local11 = local11 >>> 8 ^ Class46.anIntArray69[(local11 ^ arg2[local13]) & 0xFF];
		}
		return ~local11;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIII)V")
	public static void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static474.anInt8118 <= arg3 && arg3 <= Static576.anInt9425) {
			@Pc(19) int local19 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg1);
			@Pc(25) int local25 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg2);
			Static368.method5889(arg0, local25, local19, arg3);
		}
	}
}
