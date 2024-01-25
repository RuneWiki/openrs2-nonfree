import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt2355;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	public static int anInt2354 = 0;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public static int anInt2362 = 0;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
	public static int anInt2365 = 0;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method2291() {
		@Pc(3) Class126[] local3 = Class14_Sub25.aClass126Array1;
		synchronized (Class14_Sub25.aClass126Array1) {
			for (@Pc(13) int local13 = 0; local13 < Class14_Sub25.aClass126Array1.length; local13++) {
				Class14_Sub25.aClass126Array1[local13] = new Class126();
				Static256.anIntArray443[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!mo;I)V")
	public static void method2292(@OriginalArg(0) Class143 arg0) {
		Static20.aClass143_15 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)I")
	public static int method2296() {
		if (Static302.aBoolean409 || Static41.anInt980 <= 0) {
			@Pc(41) int local41 = Static63.anInt1529;
			@Pc(43) int local43 = Static328.anInt6333;
			@Pc(45) int local45 = Static349.anInt6632;
			@Pc(47) int local47 = Static127.anInt2787;
			@Pc(49) int local49 = Static124.anInt2716;
			if (local45 < local41 && local45 + local49 > local41) {
				@Pc(68) int local68 = -1;
				@Pc(87) int local87;
				for (@Pc(70) int local70 = 0; local70 < Static41.anInt980; local70++) {
					if (Static45.aBoolean80) {
						local87 = (Static41.anInt980 - local70 - 1) * 16 + local47 + 33;
						if (local43 > local87 - 13 && local87 + 3 >= local43) {
							local68 = local70;
						}
					} else {
						local87 = (Static41.anInt980 - local70 - 1) * 16 + local47 + 31;
						if (local43 > local87 - 13 && local43 <= local87 + 3) {
							local68 = local70;
						}
					}
				}
				if (local68 != -1) {
					local87 = 0;
					@Pc(160) Class165 local160 = new Class165(Static95.aClass18_9);
					for (@Pc(165) Class14_Sub23 local165 = (Class14_Sub23) local160.method4354(); local165 != null; local165 = (Class14_Sub23) local160.method4355()) {
						if (local87++ == local68) {
							return local165.anInt4357;
						}
					}
				}
			}
			return -1;
		} else if (Static153.aBoolean211 && Static345.aBooleanArray30[81] && Static41.anInt980 > 2) {
			return ((Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247.aClass14_247).anInt4357;
		} else {
			return ((Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247).anInt4357;
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
	public static void method2300() {
		if (Static28.aClass82_1 != null) {
			@Pc(12) Class82 local12 = Static28.aClass82_1;
			synchronized (Static28.aClass82_1) {
				Static28.aClass82_1 = null;
			}
		}
	}
}
