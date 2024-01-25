import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!mw", name = "E", descriptor = "[B")
	public static byte[] aByteArray82;

	@OriginalMember(owner = "client!mw", name = "M", descriptor = "I")
	public static int anInt6971;

	@OriginalMember(owner = "client!mw", name = "K", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
	public static void method5639(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static32.aHashtable6.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!je;IIIII)V")
	public static void method5641(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static613.anInt10338) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static28.anInt704) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static55.anInt1384 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class58 local62 = Static486.aClass58ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static576.aClass51Array3[local17].method7857(local32, local23) + Static576.aClass51Array3[local17].method7857(local32, local23 + 1) + Static576.aClass51Array3[local17].method7857(local32 + 1, local23) + Static576.aClass51Array3[local17].method7857(local32 + 1, local23 + 1)) / 4 - (Static576.aClass51Array3[arg1].method7857(arg3, arg2) + Static576.aClass51Array3[arg1].method7857(arg3, arg2 + 1) + Static576.aClass51Array3[arg1].method7857(arg3 + 1, arg2) + Static576.aClass51Array3[arg1].method7857(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class12_Sub2_Sub1 local151 = local62.aClass12_Sub2_Sub1_1;
									@Pc(154) Class12_Sub2_Sub1 local154 = local62.aClass12_Sub2_Sub1_2;
									if (local151 != null && local151.method9160()) {
										arg0.method9166(local1, local151, (local32 - arg3) * Static222.anInt4166 + (1 - arg5) * Static96.anInt2065, (local23 - arg2) * Static222.anInt4166 + (1 - arg4) * Static96.anInt2065, Static533.aClass137_41, local148);
									}
									if (local154 != null && local154.method9160()) {
										arg0.method9166(local1, local154, (local32 - arg3) * Static222.anInt4166 + (1 - arg5) * Static96.anInt2065, (local23 - arg2) * Static222.anInt4166 + (1 - arg4) * Static96.anInt2065, Static533.aClass137_41, local148);
									}
									for (@Pc(227) Class43 local227 = local62.aClass43_4; local227 != null; local227 = local227.aClass43_3) {
										@Pc(231) Class12_Sub2_Sub2 local231 = local227.aClass12_Sub2_Sub2_1;
										if (local231 != null && local231.method9160() && (local23 == local231.aShort111 || local23 == local3) && (local32 == local231.aShort110 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort112 + 1 - local231.aShort111;
											@Pc(268) int local268 = local231.aShort109 + 1 - local231.aShort110;
											arg0.method9166(local1, local231, (local231.aShort110 - arg3) * Static222.anInt4166 + (local268 - arg5) * Static96.anInt2065, (local231.aShort111 - arg2) * Static222.anInt4166 + (local260 - arg4) * Static96.anInt2065, Static533.aClass137_41, local148);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
