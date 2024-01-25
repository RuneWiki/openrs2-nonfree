import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
	public static int anInt4860;

	@OriginalMember(owner = "client!pr", name = "C", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[100];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Lclient!da;")
	public static Class39 method4480(@OriginalArg(1) int arg0) {
		@Pc(10) Class39 local10 = (Class39) Static209.aClass119_147.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static79.aClass191_52.method5459(1, arg0);
		local10 = new Class39();
		if (local25 != null) {
			local10.method1193(new Class2_Sub10(local25), arg0);
		}
		Static209.aClass119_147.method3308(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V")
	public static void method4481() {
		Static47.aClass119_29.method3304();
		Static301.aClass119_156.method3304();
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)Z")
	public static boolean method4483(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static71.anInt1580; local1 < Static37.anInt696; local1++) {
			@Pc(6) Class8[][] local6 = Static275.aClass8ArrayArrayArray4[local1];
			for (@Pc(9) int local9 = -Static206.anInt4000; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static250.anInt4943 + local9;
				@Pc(18) int local18 = Static250.anInt4943 - local9;
				if (local14 >= Static30.anInt551 || local18 < Static282.anInt5713) {
					for (@Pc(27) int local27 = -Static206.anInt4000; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static230.anInt4394 + local27;
						@Pc(36) int local36 = Static230.anInt4394 - local27;
						@Pc(48) Class8 local48;
						if (local14 >= Static30.anInt551) {
							if (local32 >= Static156.anInt3176) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean22) {
									Static240.aBoolean420 = arg0;
									Static42.aClass101_1.method3250(local48);
									Static42.aClass101_1.method3248();
								}
							}
							if (local36 < Static301.anInt5009) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean22) {
									Static240.aBoolean420 = arg0;
									Static42.aClass101_1.method3250(local48);
									Static42.aClass101_1.method3248();
								}
							}
						}
						if (local18 < Static282.anInt5713) {
							if (local32 >= Static156.anInt3176) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean22) {
									Static240.aBoolean420 = arg0;
									Static42.aClass101_1.method3250(local48);
									Static42.aClass101_1.method3248();
								}
							}
							if (local36 < Static301.anInt5009) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean22) {
									Static240.aBoolean420 = arg0;
									Static42.aClass101_1.method3250(local48);
									Static42.aClass101_1.method3248();
								}
							}
						}
						if (Static143.anInt2959 == 0) {
							if (Static299.aBoolean459) {
								Static42.aClass101_1.method3255(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!mm;III[Z)Z")
	public static boolean method4484(@OriginalArg(0) Class2_Sub11_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static301.aClass73Array31 != Static313.aClass73Array39) {
			@Pc(11) int local11 = Static265.aClass73Array44[arg1].method4932(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class73 local18 = Static265.aClass73Array44[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4932(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4935(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4937(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	public static void method4485() {
		@Pc(1) Class119 local1 = Static139.aClass119_90;
		synchronized (Static139.aClass119_90) {
			Static139.aClass119_90.method3312();
		}
	}
}
