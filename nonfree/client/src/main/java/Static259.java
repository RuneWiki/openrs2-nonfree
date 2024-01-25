import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ol", name = "bb", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!ol", name = "db", descriptor = "I")
	public static int anInt4616;

	@OriginalMember(owner = "client!ol", name = "eb", descriptor = "I")
	public static int anInt4617;

	@OriginalMember(owner = "client!ol", name = "ab", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_138 = new Class41(62, 6);

	@OriginalMember(owner = "client!ol", name = "cb", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_139 = new Class41(63, 11);

	@OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
	public static int anInt4618 = -1;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)Z")
	public static boolean method4040(@OriginalArg(1) int arg0) {
		Static88.aBoolean145 = true;
		Static45.anInt2591 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!ms;Lclient!ms;)V")
	public static void method4041(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Class155 arg1) {
		Static19.method552(Static245.aClass41_131);
		Static39.aClass2_Sub13_Sub2_4.method4218(arg1.anInt4166);
		Static39.aClass2_Sub13_Sub2_4.method4190(arg1.anInt4212);
		Static39.aClass2_Sub13_Sub2_4.method4238(arg1.anInt4135);
		Static39.aClass2_Sub13_Sub2_4.method4199(arg0.anInt4135);
		Static39.aClass2_Sub13_Sub2_4.method4224(arg0.anInt4166);
		Static39.aClass2_Sub13_Sub2_4.method4212(arg0.anInt4212);
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
	public static void method4042() {
		for (@Pc(10) Class2_Sub42 local10 = (Class2_Sub42) Static181.aClass210_23.method5035(); local10 != null; local10 = (Class2_Sub42) Static181.aClass210_23.method5037()) {
			if (local10.aBoolean488) {
				local10.method5598();
			}
		}
		for (@Pc(35) Class2_Sub42 local35 = (Class2_Sub42) Static39.aClass210_7.method5035(); local35 != null; local35 = (Class2_Sub42) Static39.aClass210_7.method5037()) {
			if (local35.aBoolean488) {
				local35.method5598();
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!lk;B)Lclient!ip;")
	public static Class104_Sub1 method4046(@OriginalArg(0) Class2_Sub13 arg0) {
		return new Class104_Sub1(arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4235(), arg0.method4235(), arg0.method4240());
	}
}
