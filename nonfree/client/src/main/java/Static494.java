import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public static int anInt8778 = -1;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(CB)I")
	public static int method7241(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class3_Sub8.anIntArray42.length > arg0 ? Class3_Sub8.anIntArray42[arg0] : -1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIZ)V")
	public static void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static424.method8061();
		Static594.aLong259 = 0L;
		@Pc(10) int local10 = Static626.method8490();
		if (arg1 == 3 || local10 == 3) {
			arg3 = true;
		}
		if (!Static47.aClass33_3.method6166()) {
			arg3 = true;
		}
		Static82.method2190(arg3, arg1, local10, arg2, arg0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)I")
	public static int method7245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static226.anIntArrayArray49 == null ? 0 : Static226.anIntArrayArray49[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method7246(@OriginalArg(0) String arg0) {
		if (!Static164.aClass228_8.aBoolean614) {
			return -1;
		} else if (Static173.aHashtable13.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static613.method8343(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static496.aString98 + local25;
			if (!Static628.aClass181_131.method5056(local38, "")) {
				return -1;
			} else if (Static628.aClass181_131.method5038(local38)) {
				@Pc(62) byte[] local62 = Static628.aClass181_131.method5026(local38, "");
				@Pc(68) File local68;
				try {
					local68 = Static129.method2912(local25);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static553.method7811(local68);
				if (local82 != null && local82.length == local62.length) {
					for (@Pc(95) int local95 = 0; local95 < local82.length; local95++) {
						if (local82[local95] != local62[local95]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static164.aClass228_8.method5932(local62, local68);
					}
				} catch (@Pc(127) Throwable local127) {
					return -1;
				}
				Static646.method8662(arg0, local68);
				return 100;
			} else {
				return Static628.aClass181_131.method5036(local38);
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!kha;BI)Lclient!tba;")
	public static Class315 method7247(@OriginalArg(0) Class181 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5049(arg1);
		return local13 == null ? null : new Class315(local13);
	}
}
