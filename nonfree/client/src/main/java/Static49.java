import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!eh", name = "ob", descriptor = "[[Lclient!b;")
	public static Class6[][] aClass6ArrayArray1;

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
	public static int anInt997 = 0;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
	public static int anInt1001 = 0;

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array21 = new Class70[500];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[BI)Z")
	public static boolean method764(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg1);
		@Pc(16) boolean local16 = true;
		@Pc(18) int local18 = -1;
		label54: while (true) {
			@Pc(22) int local22 = local14.method1253();
			if (local22 == 0) {
				return local16;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(41) int local41;
				while (!local35) {
					local41 = local14.method1266();
					if (local41 == 0) {
						continue label54;
					}
					local33 += local41 - 1;
					@Pc(68) int local68 = local33 >> 6 & 0x3F;
					@Pc(72) int local72 = local33 & 0x3F;
					@Pc(76) int local76 = arg0 + local68;
					@Pc(80) int local80 = arg2 + local72;
					@Pc(86) int local86 = local14.method1278() >> 2;
					if (local76 > 0 && local80 > 0 && local76 < 103 && local80 < 103) {
						@Pc(108) Class3_Sub3_Sub9 local108 = Static161.method2421(local18);
						if (local86 != 22 || !Static50.aBoolean66 || local108.anInt989 != 0 || local108.anInt1014 == 1 || local108.aBoolean60) {
							local35 = true;
							if (!local108.method766()) {
								Static58.anInt1270++;
								local16 = false;
							}
						}
					}
				}
				local41 = local14.method1266();
				if (local41 == 0) {
					break;
				}
				local14.method1278();
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method767(@OriginalArg(0) Class52 arg0) {
		Static109.aClass52_25 = arg0;
	}
}
