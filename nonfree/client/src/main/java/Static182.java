import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_17;

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
	public static int anInt3710;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1063 = Static181.method2795("skill)2");

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1064 = Static181.method2795("(Y<)4col>");

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!s;")
	public static final Class86 aClass86_48 = new Class86(20);

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1065 = aClass83_1063;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1066 = Static181.method2795("<col=ff9040>");

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1067 = Static181.method2795("");

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1068 = Static181.method2795("overlay)3dat");

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "J")
	public static volatile long aLong126 = 0L;

	@OriginalMember(owner = "client!tc", name = "fb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1069 = Static181.method2795("blinken3:");

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1070 = Static181.method2795("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I")
	public static int method2816(@OriginalArg(0) int arg0) {
		if (Static98.anInt2134 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIB)I")
	public static int method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static135.aClass63_10.method2110((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 >= 0 && local12.anIntArray306.length > arg0) {
			return local12.anIntArray306[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)[B")
	public static byte[] method2818(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub26 local12 = (Class2_Sub2_Sub26) Static115.aClass86_37.method2643((long) arg0);
		if (local12 == null) {
			@Pc(28) Random local28 = new Random((long) arg0);
			@Pc(31) byte[] local31 = new byte[512];
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local31[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(54) int local54 = 255 - local48;
				@Pc(59) int local59 = Static4.method87(local28, local54);
				@Pc(63) byte local63 = local31[local59];
				local31[local59] = local31[local54];
				local31[local54] = local31[511 - local48] = local63;
			}
			local12 = new Class2_Sub2_Sub26(local31);
			Static115.aClass86_37.method2647(local12, (long) arg0);
		}
		return local12.aByteArray56;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!ra;)Lclient!gi;")
	public static Class35_Sub1 method2819(@OriginalArg(1) Class2_Sub3 arg0) {
		return new Class35_Sub1(arg0.method242(), arg0.method242(), arg0.method242(), arg0.method242(), arg0.method242(), arg0.method242(), arg0.method242(), arg0.method242(), arg0.method261(), arg0.method260());
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZIIILclient!ee;I)V")
	public static void method2820(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class28_Sub1 arg5) {
		@Pc(10) long local10 = (long) (arg2 + (arg3 << 16));
		@Pc(16) Class2_Sub2_Sub15 local16 = (Class2_Sub2_Sub15) Static90.aClass63_8.method2110(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub15) Static170.aClass63_14.method2110(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub15) Static152.aClass63_13.method2110(local10);
		if (local16 == null) {
			if (!arg1) {
				local16 = (Class2_Sub2_Sub15) Static96.aClass63_9.method2110(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub2_Sub15();
			local16.aByte7 = arg0;
			local16.anInt2319 = arg4;
			local16.aClass28_Sub1_15 = arg5;
			if (arg1) {
				Static90.aClass63_8.method2115(local10, local16);
				Static41.anInt1039++;
			} else {
				Static50.aClass71_1.method2231(local16);
				Static152.aClass63_13.method2115(local10, local16);
				Static167.anInt3454++;
			}
		} else if (arg1) {
			local16.method3026();
			Static90.aClass63_8.method2115(local10, local16);
			Static167.anInt3454--;
			Static41.anInt1039++;
		}
	}
}
