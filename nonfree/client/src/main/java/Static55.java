import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
	public static int anInt1481;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!cm;")
	public static final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public static void method1130() {
		Static160.anInt3271 = 0;
		for (@Pc(7) int local7 = 0; local7 < 2048; local7++) {
			Static13.aClass3_Sub7Array1[local7] = null;
			Static329.aByteArray76[local7] = 1;
			Static365.aClass64Array1[local7] = null;
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)Z")
	public static boolean method1137(@OriginalArg(0) int arg0) {
		if (Static414.aBooleanArray22[arg0]) {
			return true;
		} else if (Static369.aClass32_79.method795(arg0)) {
			@Pc(21) int local21 = Static369.aClass32_79.method790(arg0);
			if (local21 == 0) {
				Static414.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static178.aClass156ArrayArray2[arg0] == null) {
				Static178.aClass156ArrayArray2[arg0] = new Class156[local21];
			}
			for (@Pc(45) int local45 = 0; local45 < local21; local45++) {
				if (Static178.aClass156ArrayArray2[arg0][local45] == null) {
					@Pc(58) byte[] local58 = Static369.aClass32_79.method785(local45, arg0);
					if (local58 != null) {
						@Pc(70) Class156 local70 = Static178.aClass156ArrayArray2[arg0][local45] = new Class156();
						local70.anInt4850 = (arg0 << 16) + local45;
						if (local58[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local70.method3771(new Class3_Sub7(local58));
					}
				}
			}
			Static414.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public static void method1138() {
		Static176.aClass126_21.method3135();
	}
}
