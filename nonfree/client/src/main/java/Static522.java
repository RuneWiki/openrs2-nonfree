import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!oh;II)V")
	public static void method7374(@OriginalArg(0) int arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) int arg2) {
		if (Static581.aBoolean787) {
			@Pc(20) Class22 local20 = Static27.anInt377 == -1 ? null : Static97.aClass328_2.method7810(Static27.anInt377);
			if (Static91.method1412(arg1).method3015() && (Static523.anInt6605 & 0x20) != 0 && (local20 == null || arg1.method6604(local20.anInt376, Static27.anInt377) != local20.anInt376)) {
				Static27.method371(Static96.anInt1729, (long) (arg1.anInt7410 << 0 | arg1.anInt7350), true, arg1.anInt7415, Static175.aString127, false, 9, false, Static701.aString94 + " -> " + arg1.aString82, 0L, arg1.anInt7350, arg1.anInt7410);
			}
		}
		@Pc(109) String local109;
		for (@Pc(102) int local102 = 9; local102 >= 5; local102--) {
			local109 = Static425.method6176(local102, arg1);
			if (local109 != null) {
				Static27.method371(Static334.method4627(arg1, local102), (long) (arg1.anInt7410 << 0 | arg1.anInt7350), true, arg1.anInt7415, local109, false, 1001, false, arg1.aString82, (long) (local102 + 1), arg1.anInt7350, arg1.anInt7410);
			}
		}
		local109 = Static83.method1240(arg1);
		if (local109 != null) {
			Static27.method371(arg1.anInt7375, (long) (arg1.anInt7350 | arg1.anInt7410 << 0), true, arg1.anInt7415, local109, false, 52, false, arg1.aString82, 0L, arg1.anInt7350, arg1.anInt7410);
		}
		for (@Pc(194) int local194 = 4; local194 >= 0; local194--) {
			@Pc(203) String local203 = Static425.method6176(local194, arg1);
			if (local203 != null) {
				Static27.method371(Static334.method4627(arg1, local194), (long) (arg1.anInt7410 << 0 | arg1.anInt7350), true, arg1.anInt7415, local203, false, 47, false, arg1.aString82, (long) (local194 + 1), arg1.anInt7350, arg1.anInt7410);
			}
		}
		if (!Static91.method1412(arg1).method3014()) {
			return;
		}
		if (arg1.aString85 == null) {
			Static27.method371(-1, (long) (arg1.anInt7350 | arg1.anInt7410 << 0), true, arg1.anInt7415, Static289.aClass191_10.method4067(Static414.anInt9485), false, 58, false, "", 0L, arg1.anInt7350, arg1.anInt7410);
		} else {
			Static27.method371(-1, (long) (arg1.anInt7410 << 0 | arg1.anInt7350), true, arg1.anInt7415, arg1.aString85, false, 58, false, "", 0L, arg1.anInt7350, arg1.anInt7410);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!et;I)Lclient!cr;")
	public static Class71 method7381(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(16) int local16 = arg0.method8555(-9372);
		return new Class71(local16);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lclient!jga;")
	public static Class2_Sub33 method7382() {
		@Pc(6) Class2_Sub33 local6 = Static541.method7568();
		local6.aClass349_74 = null;
		local6.anInt4582 = 0;
		local6.aClass2_Sub20_Sub2_1 = new Class2_Sub20_Sub2(5000);
		return local6;
	}
}
