import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!pb;")
	public static Class71 aClass71_12;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	public static int anInt1153;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!jh;")
	public static final Class2_Sub11_Sub1 aClass2_Sub11_Sub1_2 = new Class2_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public static int anInt1149 = 0;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_394 = Static151.method2243("(U(Y");

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_395 = Static151.method2243("");

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
	public static int anInt1151 = 0;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public static int anInt1152 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
	public static int method795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) Static204.aClass58_14.method1704((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local8.anIntArray367.length; local25++) {
				if (arg1 == local8.anIntArray366[local25]) {
					local23 += local8.anIntArray367[local25];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method796(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static7.anInt2452 > 0) {
			local18 = Static17.aByteArrayArray2[--Static7.anInt2452];
			Static17.aByteArrayArray2[Static7.anInt2452] = null;
			return local18;
		} else if (arg0 == 5000 && Static130.anInt2825 > 0) {
			local18 = Static96.aByteArrayArray6[--Static130.anInt2825];
			Static96.aByteArrayArray6[Static130.anInt2825] = null;
			return local18;
		} else if (arg0 == 30000 && Static30.anInt734 > 0) {
			local18 = Static167.aByteArrayArray8[--Static30.anInt734];
			Static167.aByteArrayArray8[Static30.anInt734] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILjava/awt/Component;Z)Lclient!ig;")
	public static Class46 method798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class46_Sub1");
			@Pc(15) Class46 local15 = (Class46) local11.getDeclaredConstructor().newInstance();
			local15.method2382(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class46_Sub2 local28 = new Class46_Sub2();
			local28.method2382(arg1, arg0, arg2);
			return local28;
		}
	}
}
