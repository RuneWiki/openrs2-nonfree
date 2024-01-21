import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt782 = 99;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!th;")
	public static Class82 aClass82_3 = new Class82();

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt784 = 0;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	public static int anInt786 = 127;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public static int anInt787 = 0;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_286 = Static161.method2971("(U0a )2 in: ");

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_287 = Static161.method2971("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array4 = new Class13[8];

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_288 = Static161.method2971("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method686() {
		aClass82_3 = null;
		aClass13_288 = null;
		aClass13_286 = null;
		aClass13_287 = null;
		aClass13Array4 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method687() {
		Static10.aClass47_1.method1995();
		Static52.aClass47_12.method1995();
		Static26.aClass47_5.method1995();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)I")
	public static int method688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public static void method689() {
		for (@Pc(8) Class1_Sub5 local8 = (Class1_Sub5) Static149.aClass82_14.method2849(); local8 != null; local8 = (Class1_Sub5) Static149.aClass82_14.method2855()) {
			if (local8.aClass1_Sub2_Sub14_1 != null) {
				local8.method451();
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZ)V")
	public static void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub24 local12 = (Class1_Sub24) Static30.aClass45_6.method1988((long) arg3);
		if (local12 == null) {
			local12 = new Class1_Sub24();
			Static30.aClass45_6.method1981(local12, (long) arg3);
		}
		if (arg2 >= local12.anIntArray453.length) {
			@Pc(38) int[] local38 = new int[arg2 + 1];
			@Pc(43) int[] local43 = new int[arg2 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray453.length; local45++) {
				local38[local45] = local12.anIntArray453[local45];
				local43[local45] = local12.anIntArray452[local45];
			}
			for (@Pc(75) int local75 = local12.anIntArray453.length; local75 < arg2; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local12.anIntArray453 = local38;
			local12.anIntArray452 = local43;
		}
		local12.anIntArray453[arg2] = arg0;
		local12.anIntArray452[arg2] = arg1;
	}
}
