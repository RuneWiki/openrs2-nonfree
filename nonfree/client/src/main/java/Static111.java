import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "Lclient!c;")
	public static Class10 aClass10_87;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "Lclient!ai;")
	public static Class6 aClass6_764 = Static38.method685("::qa_op_test");

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "B")
	public static byte aByte5 = 0;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	public static int anInt2636 = 0;

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_765 = Static38.method685("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "Lclient!ke;")
	public static Class2_Sub13_Sub1 aClass2_Sub13_Sub1_3 = new Class2_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_766 = aClass6_765;

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
	public static int anInt2637 = 0;

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_767 = Static38.method685("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lclient!ai;")
	public static Class6 aClass6_768 = aClass6_767;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
	public static void method1783() {
		Static133.aClass17_20.method509();
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
	public static void method1784() {
		aClass6_765 = null;
		aClass6_764 = null;
		aClass6_768 = null;
		aBigInteger1 = null;
		aClass10_87 = null;
		aClass2_Sub13_Sub1_3 = null;
		aClass6_766 = null;
		aClass6_767 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([Lclient!wa;II)V")
	public static void method1785(@OriginalArg(0) Class87[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class87 local17 = arg0[local11];
			if (local17 != null) {
				if (local17.anInt4116 == 0) {
					if (local17.aClass87Array2 != null) {
						method1785(local17.aClass87Array2, arg1);
					}
					@Pc(38) Class2_Sub16 local38 = (Class2_Sub16) Static148.aClass16_10.method479((long) local17.anInt4085);
					if (local38 != null) {
						Static63.method1013(arg1, local38.anInt2551);
					}
				}
				@Pc(57) Class2_Sub2 local57;
				if (arg1 == 0 && local17.anObjectArray9 != null) {
					local57 = new Class2_Sub2();
					local57.aClass87_1 = local17;
					local57.anObjectArray1 = local17.anObjectArray9;
					Static92.method1505(local57);
				}
				if (arg1 == 1 && local17.anObjectArray24 != null) {
					if (local17.anInt4105 >= 0) {
						@Pc(86) Class87 local86 = Static57.method940(local17.anInt4085);
						if (local86 == null || local86.aClass87Array2 == null || local86.aClass87Array2.length <= local17.anInt4105 || local17 != local86.aClass87Array2[local17.anInt4105]) {
							continue;
						}
					}
					local57 = new Class2_Sub2();
					local57.anObjectArray1 = local17.anObjectArray24;
					local57.aClass87_1 = local17;
					Static92.method1505(local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLclient!c;Lclient!c;I)V")
	public static void method1786(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2) {
		Static15.aClass10_16 = arg1;
		Static109.aClass10_120 = arg2;
		Static88.aBoolean85 = arg0;
	}
}
