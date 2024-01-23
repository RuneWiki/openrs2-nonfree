import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "Lclient!mb;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
	public static int anInt2856;

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "Lclient!mi;")
	public static Class75 aClass75_14 = new Class75();

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
	public static int[] anIntArray300 = new int[25];

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lclient!hh;")
	private static Class50 aClass50_966 = Static186.method3527("white:");

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lclient!hh;")
	public static Class50 aClass50_967 = aClass50_966;

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_968 = aClass50_966;

	@OriginalMember(owner = "client!nd", name = "hb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_969 = Static186.method3527("mapscene");

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
	public static int anInt2857 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;BLclient!pc;I)Lclient!id;")
	public static Class48 method2328(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class87 arg2, @OriginalArg(4) int arg3) {
		if (Static50.anInt1044 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class48 local33 = (Class48) Class.forName("Class48_Sub2").getDeclaredConstructor().newInstance();
			local33.anInt4094 = arg3;
			local33.anIntArray464 = new int[(Static130.aBoolean114 ? 2 : 1) * 256];
			local33.method3229(arg1);
			local33.anInt4093 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt4093 > 16384) {
				local33.anInt4093 = 16384;
			}
			local33.method3218(local33.anInt4093);
			if (Static190.anInt3922 > 0 && Static148.aClass28_1 == null) {
				Static148.aClass28_1 = new Class28();
				Static148.aClass28_1.aClass87_5 = arg2;
				arg2.method2694(Static148.aClass28_1, Static190.anInt3922);
			}
			if (Static148.aClass28_1 != null) {
				if (Static148.aClass28_1.aClass48Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static148.aClass28_1.aClass48Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class48_Sub1 local122 = new Class48_Sub1(arg2, arg0);
				local122.anIntArray464 = new int[(Static130.aBoolean114 ? 2 : 1) * 256];
				local122.anInt4094 = arg3;
				local122.method3229(arg1);
				local122.anInt4093 = 16384;
				local122.method3218(local122.anInt4093);
				if (Static190.anInt3922 > 0 && Static148.aClass28_1 == null) {
					Static148.aClass28_1 = new Class28();
					Static148.aClass28_1.aClass87_5 = arg2;
					arg2.method2694(Static148.aClass28_1, Static190.anInt3922);
				}
				if (Static148.aClass28_1 != null) {
					if (Static148.aClass28_1.aClass48Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static148.aClass28_1.aClass48Array1[arg0] = local122;
				}
				return local122;
			} catch (@Pc(184) Throwable local184) {
				return new Class48();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public static void method2329() {
		while (true) {
			if (Static97.aClass1_Sub17_Sub1_2.method2186(Static217.anInt4289) >= 27) {
				@Pc(21) int local21 = Static97.aClass1_Sub17_Sub1_2.method2181(15);
				if (local21 != 32767) {
					@Pc(26) boolean local26 = false;
					if (Static78.aClass20_Sub3_Sub2Array1[local21] == null) {
						local26 = true;
						Static78.aClass20_Sub3_Sub2Array1[local21] = new Class20_Sub3_Sub2();
					}
					@Pc(42) Class20_Sub3_Sub2 local42 = Static78.aClass20_Sub3_Sub2Array1[local21];
					Static21.anIntArray44[Static103.anInt2065++] = local21;
					local42.anInt3018 = Static107.anInt2132;
					local42.aClass105_1 = Static162.method2710(Static97.aClass1_Sub17_Sub1_2.method2181(14));
					@Pc(66) int local66 = Static97.aClass1_Sub17_Sub1_2.method2181(5);
					if (local66 > 15) {
						local66 -= 32;
					}
					@Pc(75) int local75 = Static97.aClass1_Sub17_Sub1_2.method2181(5);
					if (local75 > 15) {
						local75 -= 32;
					}
					@Pc(86) int local86 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
					if (local86 == 1) {
						Static164.anIntArray360[Static80.anInt1584++] = local21;
					}
					@Pc(104) int local104 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
					@Pc(111) int local111 = Static133.anIntArray291[Static97.aClass1_Sub17_Sub1_2.method2181(3)];
					local42.anInt3050 = local42.aClass105_1.anInt3925;
					local42.anInt3036 = local42.aClass105_1.anInt3894;
					local42.anInt3034 = local42.aClass105_1.anInt3889;
					local42.anInt3040 = local42.aClass105_1.anInt3890;
					local42.anInt3044 = local42.aClass105_1.anInt3904;
					if (local26) {
						local42.anInt3042 = local42.anInt3054 = local111;
					}
					local42.anInt3064 = local42.aClass105_1.anInt3923;
					local42.anInt3057 = local42.aClass105_1.anInt3911;
					local42.anInt3024 = local42.aClass105_1.anInt3908;
					local42.anInt3039 = local42.aClass105_1.anInt3895;
					if (local42.anInt3036 == 0) {
						local42.anInt3054 = 0;
					}
					local42.method2470(Static230.aClass20_Sub3_Sub1_3.anIntArray311[0] + local75, Static230.aClass20_Sub3_Sub1_3.anIntArray313[0] - -local66, local104 == 1);
					if (local42.aClass105_1.method3121()) {
						Static95.method1496(Static212.anInt4195, null, local42.anIntArray313[0], local42, 0, null, local42.anIntArray311[0]);
					}
					continue;
				}
			}
			Static97.aClass1_Sub17_Sub1_2.method2188();
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!hh;B)V")
	public static void method2331(@OriginalArg(0) Class50 arg0) {
		for (@Pc(10) Class1_Sub1_Sub6 local10 = (Class1_Sub1_Sub6) Static56.aClass75_5.method2239(); local10 != null; local10 = (Class1_Sub1_Sub6) Static56.aClass75_5.method2238()) {
			if (local10.aClass50_396.method1236(arg0)) {
				Static132.aClass1_Sub1_Sub6_1 = local10;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
	public static void method2332() {
		@Pc(1) Object local1 = Static4.anObject1;
		synchronized (Static4.anObject1) {
			if (Static195.anInt3974 != 0) {
				Static195.anInt3974 = 1;
				try {
					Static4.anObject1.wait();
				} catch (@Pc(16) InterruptedException local16) {
				}
			}
		}
	}
}
