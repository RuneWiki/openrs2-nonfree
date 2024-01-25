import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Lclient!wo;")
	public static Class216 aClass216_34;

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[128][128];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([I[ILclient!pi;Z[I)V")
	public static void method2352(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class17_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) int local18 = arg1[local12];
			@Pc(22) int local22 = arg0[local12];
			@Pc(26) int local26 = arg3[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && arg2.aClass184Array3.length > local28) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg2.aClass184Array3[local28] = null;
					} else {
						@Pc(52) Class24 local52 = Static110.method5411(local18);
						@Pc(55) int local55 = local52.anInt1037;
						@Pc(60) Class184 local60 = arg2.aClass184Array3[local28];
						if (local60 != null) {
							if (local60.anInt5656 == local18) {
								if (local55 == 0) {
									local60 = arg2.aClass184Array3[local28] = null;
								} else if (local55 == 1) {
									local60.anInt5658 = 0;
									local60.anInt5659 = 0;
									local60.anInt5657 = 1;
									local60.anInt5662 = local26;
									local60.anInt5660 = 0;
									Static318.method5216(arg2.anInt5109, arg2.anInt5108, false, local52, 0);
								} else if (local55 == 2) {
									local60.anInt5660 = 0;
								}
							} else if (local52.anInt1051 >= Static110.method5411(local60.anInt5656).anInt1051) {
								local60 = arg2.aClass184Array3[local28] = null;
							}
						}
						if (local60 == null) {
							local60 = arg2.aClass184Array3[local28] = new Class184();
							local60.anInt5659 = 0;
							local60.anInt5662 = local26;
							local60.anInt5660 = 0;
							local60.anInt5657 = 1;
							local60.anInt5656 = local18;
							local60.anInt5658 = 0;
							Static318.method5216(arg2.anInt5109, arg2.anInt5108, false, local52, 0);
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method2355(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static37.method904(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static144.method2871(local7);
			local7 = Static85.method4681(local7, "%3a", ":");
			local7 = Static85.method4681(local7, "%40", "@");
			local7 = Static85.method4681(local7, "%26", "&");
			local7 = Static85.method4681(local7, "%23", "#");
			if (Static263.aClass143_5.anApplet1 != null) {
				@Pc(104) Class162 local104 = Static263.aClass143_5.method3894(new URL(Static263.aClass143_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static35.anInt1167 + "&u=" + Static234.aLong143 + "&v1=" + Static207.aString39 + "&v2=" + Static207.aString40 + "&e=" + local7));
				while (local104.anInt4801 == 0) {
					Static190.method3690(1L);
				}
				if (local104.anInt4801 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local104.anObject5;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBILclient!pi;)V")
	public static void method2357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class17_Sub1_Sub1_Sub2 arg2) {
		if (arg2.anInt4830 == arg0 && arg0 != -1) {
			@Pc(19) Class24 local19 = Static110.method5411(arg0);
			@Pc(22) int local22 = local19.anInt1037;
			if (local22 == 1) {
				arg2.anInt4863 = 0;
				arg2.anInt4828 = 0;
				arg2.anInt4840 = 0;
				arg2.anInt4854 = 1;
				arg2.anInt4856 = arg1;
				Static318.method5216(arg2.anInt5109, arg2.anInt5108, false, local19, arg2.anInt4863);
			}
			if (local22 == 2) {
				arg2.anInt4828 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.anInt4830 == -1 || Static110.method5411(arg0).anInt1051 >= Static110.method5411(arg2.anInt4830).anInt1051) {
			arg2.anInt4863 = 0;
			arg2.anInt4828 = 0;
			arg2.anInt4830 = arg0;
			arg2.anInt4854 = 1;
			arg2.anInt4840 = 0;
			arg2.anInt4856 = arg1;
			arg2.anInt4897 = arg2.anInt4893;
			if (arg2.anInt4830 == -1) {
				return;
			}
			Static318.method5216(arg2.anInt5109, arg2.anInt5108, false, Static110.method5411(arg2.anInt4830), arg2.anInt4863);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
	public static void method2359(@OriginalArg(1) int arg0) {
		if (Static102.anIntArray228 == null || arg0 > Static102.anIntArray228.length) {
			Static102.anIntArray228 = new int[arg0];
		}
	}
}
