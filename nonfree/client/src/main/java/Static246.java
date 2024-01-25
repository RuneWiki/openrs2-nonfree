import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_14 = new Class152(4);

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_10 = new Class152(1);

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_7 = new Class152(1);

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_8 = new Class152(2);

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_9 = new Class152(4);

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_11 = new Class152(2);

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_12 = new Class152(4);

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!ig;")
	public static final Class152 aClass152_13 = new Class152(2);

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_96 = new Class180(10, 0);

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
	public static int anInt4481 = -1;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public static int anInt4482 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method4104(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub11_Sub3 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class21 local8 = Static582.aClass21Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static602.anInt9668; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static146.anInt2951; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static391.anInt10262;
							@Pc(32) int local32 = local12 << Static391.anInt10262;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class21 local41 = Static582.aClass21Array3[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7973(local15, local12) - local41.method7973(local15, local12);
									@Pc(71) int local71 = local8.method7973(local15 + 1, local12) - local41.method7973(local15 + 1, local12);
									@Pc(91) int local91 = local8.method7973(local15 + 1, local12 + 1) - local41.method7973(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method7973(local15, local12 + 1) - local41.method7973(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
	public static void method4105() {
		if (Static66.anInt1306 <= 0) {
			Static153.aString28 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static605.aStringArray33.length; local19++) {
			if (Static605.aStringArray33[local19].indexOf("--> ") != -1) {
				local17++;
				if (local17 == Static66.anInt1306) {
					Static153.aString28 = Static605.aStringArray33[local19].substring(Static605.aStringArray33[local19].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method4106() {
		Static606.method8564();
	}
}
