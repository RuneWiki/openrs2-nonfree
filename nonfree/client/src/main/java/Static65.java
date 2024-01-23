import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_38;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	public static int anInt1532 = 0;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public static int anInt1533 = 0;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	public static int anInt1536 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method1208(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub20 local12 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray264.length; local17++) {
				local12.anIntArray264[local17] = -1;
				local12.anIntArray263[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public static void method1209() {
		Static193.aClass1_Sub26_Sub1_2.method3000(63);
		Static193.aClass1_Sub26_Sub1_2.method2940(0L);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)I")
	public static int method1211(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([Lclient!o;II)V")
	public static void method1212(@OriginalArg(0) Class86[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class86 local17 = arg0[local11];
			if (local17 != null) {
				if (local17.anInt3286 == 0) {
					if (local17.aClass86Array1 != null) {
						method1212(local17.aClass86Array1, arg1);
					}
					@Pc(38) Class1_Sub11 local38 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local17.anInt3239);
					if (local38 != null) {
						Static31.method2199(arg1, local38.anInt1575);
					}
				}
				@Pc(54) Class1_Sub22 local54;
				if (arg1 == 0 && local17.anObjectArray18 != null) {
					local54 = new Class1_Sub22();
					local54.aClass86_10 = local17;
					local54.anObjectArray33 = local17.anObjectArray18;
					Static60.method1156(local54);
				}
				if (arg1 == 1 && local17.anObjectArray17 != null) {
					if (local17.anInt3219 >= 0) {
						@Pc(81) Class86 local81 = Static13.method333(local17.anInt3239);
						if (local81 == null || local81.aClass86Array1 == null || local81.aClass86Array1.length <= local17.anInt3219 || local17 != local81.aClass86Array1[local17.anInt3219]) {
							continue;
						}
					}
					local54 = new Class1_Sub22();
					local54.anObjectArray33 = local17.anObjectArray17;
					local54.aClass86_10 = local17;
					Static60.method1156(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lclient!wh;")
	public static Class114 method1213() {
		try {
			return (Class114) Class.forName("Class114_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
