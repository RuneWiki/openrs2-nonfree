import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "[Lclient!on;")
	public static Class120_Sub1[] aClass120_Sub1Array6 = new Class120_Sub1[0];

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
	public static int anInt6621 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!fh;IZ)V")
	public static void method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg1.anInt1874;
		if (arg1.aByte16 == 0) {
			arg1.anInt1874 = arg1.anInt1840;
		} else if (arg1.aByte16 == 1) {
			arg1.anInt1874 = arg0 - arg1.anInt1840;
		} else if (arg1.aByte16 == 2) {
			arg1.anInt1874 = arg1.anInt1840 * arg0 >> 14;
		}
		@Pc(48) int local48 = arg1.anInt1845;
		if (arg1.aByte18 == 0) {
			arg1.anInt1845 = arg1.anInt1867;
		} else if (arg1.aByte18 == 1) {
			arg1.anInt1845 = arg2 - arg1.anInt1867;
		} else if (arg1.aByte18 == 2) {
			arg1.anInt1845 = arg2 * arg1.anInt1867 >> 14;
		}
		if (arg1.aByte16 == 4) {
			arg1.anInt1874 = arg1.anInt1859 * arg1.anInt1845 / arg1.anInt1860;
		}
		if (arg1.aByte18 == 4) {
			arg1.anInt1845 = arg1.anInt1860 * arg1.anInt1874 / arg1.anInt1859;
		}
		if (Static334.aBoolean581 && (Static46.method890(arg1).anInt6736 != 0 || arg1.anInt1871 == 0)) {
			if (arg1.anInt1845 < 5 && arg1.anInt1874 < 5) {
				arg1.anInt1845 = 5;
				arg1.anInt1874 = 5;
			} else {
				if (arg1.anInt1874 <= 0) {
					arg1.anInt1874 = 5;
				}
				if (arg1.anInt1845 <= 0) {
					arg1.anInt1845 = 5;
				}
			}
		}
		if (Static126.anInt2714 == arg1.anInt1829) {
			Static46.aClass68_4 = arg1;
		}
		if (arg3 && arg1.anObjectArray10 != null && (arg1.anInt1874 != local8 || local48 != arg1.anInt1845)) {
			@Pc(192) Class2_Sub41 local192 = new Class2_Sub41();
			local192.anObjectArray35 = arg1.anObjectArray10;
			local192.aClass68_35 = arg1;
			Static245.aClass180_36.method4909(local192);
		}
	}
}
