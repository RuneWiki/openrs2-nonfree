import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
	public static int anInt1228;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
	public static int anInt1226 = -1;

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "Lclient!au;")
	public static final Class22 aClass22_13 = new Class22();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!at;")
	public static Class21_Sub1_Sub1 method1049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class192 local14 = local7.aClass192_2; local14 != null; local14 = local14.aClass192_3) {
			@Pc(18) Class21_Sub1_Sub1 local18 = local14.aClass21_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort119 == arg1 && local18.aShort121 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)V")
	public static void method1051() {
		@Pc(14) Class4_Sub39 local14 = Static32.method999(Static402.aClass356_1, Static480.aClass344_99);
		Static50.method1166(local14);
		for (@Pc(27) Class4_Sub45 local27 = (Class4_Sub45) Static569.aClass221_27.method5072(); local27 != null; local27 = (Class4_Sub45) Static569.aClass221_27.method5071()) {
			if (!local27.method8199()) {
				local27 = (Class4_Sub45) Static569.aClass221_27.method5072();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt9095 == 0) {
				Static205.method3352(true, local27, true);
			}
		}
		if (Static238.aClass155_6 != null) {
			Static368.method5060(Static238.aClass155_6);
			Static238.aClass155_6 = null;
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
	public static void method1052() {
		Static5.aClass167_1.method3961();
	}
}
