import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Lclient!o;")
	public static final Class246 aClass246_32 = new Class246(8, 0, 4, 1);

	@OriginalMember(owner = "client!oq", name = "A", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_353 = new Class179(107, 4);

	@OriginalMember(owner = "client!oq", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray64 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method8453(@OriginalArg(1) Class8 arg0) {
		Static304.anInt5175 = 0;
		Static69.anInt1273 = 0;
		Static100.aClass43_4 = new Class43();
		Static143.aClass2_Sub6_Sub1_Sub1Array1 = new Class2_Sub6_Sub1_Sub1[1024];
		Static591.aClass2_Sub8Array1 = new Class2_Sub8[Static376.anIntArray372[Static27.anInt7651] + 1];
		Static597.anInt9777 = 0;
		Static136.anInt2379 = 0;
		Static56.method1076(arg0);
		Static112.method1778(arg0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!gga;I)Lclient!gha;")
	public static Class24_Sub2 method8455(@OriginalArg(0) Class6_Sub23 arg0) {
		return new Class24_Sub2(arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8344(), arg0.method8344(), arg0.method8374());
	}

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)Lclient!fs;")
	public static Class6_Sub22 method8456() {
		@Pc(7) Class114 local7 = null;
		@Pc(13) Class6_Sub22 local13 = new Class6_Sub22(Static457.aClass176_6, 0);
		try {
			@Pc(19) Class103 local19 = Static569.aClass380_6.method8822("");
			while (local19.anInt2541 == 0) {
				Static520.method7923(1L);
			}
			if (local19.anInt2541 == 1) {
				local7 = (Class114) local19.anObject9;
				@Pc(51) byte[] local51 = new byte[(int) local7.method2455()];
				@Pc(66) int local66;
				for (@Pc(53) int local53 = 0; local53 < local51.length; local53 += local66) {
					local66 = local7.method2456(local53, local51.length - local53, local51);
					if (local66 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class6_Sub22(new Class6_Sub23(local51), Static457.aClass176_6, 0);
			}
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (local7 != null) {
				local7.method2462();
			}
		} catch (@Pc(106) Exception local106) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V")
	public static void method8457(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub4_Sub18 local14 = Static565.method7924((long) arg0, 14);
		local14.method7979();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIII)I")
	public static int method8460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(14) int local14 = arg1;
			arg1 = arg2;
			arg2 = local14;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return 7 + 1 - arg4 - arg2;
		}
	}
}
