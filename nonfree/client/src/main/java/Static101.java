import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt7613;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public static int anInt7625;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	public static int anInt7631;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[5];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!jj;I)V")
	public static void method6347(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method3972();
		@Pc(20) int local20;
		@Pc(45) int local45;
		for (@Pc(14) int local14 = 0; local14 < Static190.anInt3385; local14++) {
			local20 = Static502.anIntArray771[local14];
			if ((Static228.aByteArray67[local20] & 0x1) == 0) {
				if (local7 > 0) {
					Static228.aByteArray67[local20] = (byte) (Static228.aByteArray67[local20] | 0x2);
					local7--;
				} else {
					local45 = arg0.method3976(1);
					if (local45 == 0) {
						local7 = Static356.method5334(arg0);
						Static228.aByteArray67[local20] = (byte) (Static228.aByteArray67[local20] | 0x2);
					} else {
						Static10.method370(arg0, local20);
					}
				}
			}
		}
		arg0.method3977();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3972();
		@Pc(122) int local122;
		for (local20 = 0; local20 < Static190.anInt3385; local20++) {
			local45 = Static502.anIntArray771[local20];
			if ((Static228.aByteArray67[local45] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static228.aByteArray67[local45] = (byte) (Static228.aByteArray67[local45] | 0x2);
				} else {
					local122 = arg0.method3976(1);
					if (local122 == 0) {
						local7 = Static356.method5334(arg0);
						Static228.aByteArray67[local45] = (byte) (Static228.aByteArray67[local45] | 0x2);
					} else {
						Static10.method370(arg0, local45);
					}
				}
			}
		}
		arg0.method3977();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3972();
		@Pc(196) int local196;
		for (local45 = 0; local45 < Static415.anInt7309; local45++) {
			local122 = Static362.anIntArray649[local45];
			if ((Static228.aByteArray67[local122] & 0x1) != 0) {
				if (local7 > 0) {
					Static228.aByteArray67[local122] = (byte) (Static228.aByteArray67[local122] | 0x2);
					local7--;
				} else {
					local196 = arg0.method3976(1);
					if (local196 == 0) {
						local7 = Static356.method5334(arg0);
						Static228.aByteArray67[local122] = (byte) (Static228.aByteArray67[local122] | 0x2);
					} else if (Static156.method2466(arg0, local122)) {
						Static228.aByteArray67[local122] = (byte) (Static228.aByteArray67[local122] | 0x2);
					}
				}
			}
		}
		arg0.method3977();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3972();
		for (local122 = 0; local122 < Static415.anInt7309; local122++) {
			local196 = Static362.anIntArray649[local122];
			if ((Static228.aByteArray67[local196] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static228.aByteArray67[local196] = (byte) (Static228.aByteArray67[local196] | 0x2);
				} else {
					@Pc(280) int local280 = arg0.method3976(1);
					if (local280 == 0) {
						local7 = Static356.method5334(arg0);
						Static228.aByteArray67[local196] = (byte) (Static228.aByteArray67[local196] | 0x2);
					} else if (Static156.method2466(arg0, local196)) {
						Static228.aByteArray67[local196] = (byte) (Static228.aByteArray67[local196] | 0x2);
					}
				}
			}
		}
		arg0.method3977();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static415.anInt7309 = 0;
		Static190.anInt3385 = 0;
		for (local196 = 1; local196 < 2048; local196++) {
			Static228.aByteArray67[local196] = (byte) (Static228.aByteArray67[local196] >> 1);
			@Pc(345) Class49_Sub2_Sub2_Sub1 local345 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local196];
			if (local345 == null) {
				Static362.anIntArray649[Static415.anInt7309++] = local196;
			} else {
				Static502.anIntArray771[Static190.anInt3385++] = local196;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ld;Lclient!ld;B)V")
	public static void method6349(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg1.aClass1_Sub1_60 != null) {
			arg1.method7528();
		}
		arg1.aClass1_Sub1_59 = arg0.aClass1_Sub1_59;
		arg1.aClass1_Sub1_60 = arg0;
		arg1.aClass1_Sub1_60.aClass1_Sub1_59 = arg1;
		arg1.aClass1_Sub1_59.aClass1_Sub1_60 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method6350(@OriginalArg(0) Class122 arg0) {
		for (@Pc(8) Class72_Sub4 local8 = (Class72_Sub4) Static214.aClass299_2.method7030(); local8 != null; local8 = (Class72_Sub4) Static214.aClass299_2.method7031()) {
			local8.method4530(arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ge;Z)Lclient!tp;")
	public static Class10_Sub4 method6351(@OriginalArg(0) Class1_Sub6 arg0) {
		return new Class10_Sub4(arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3920(), arg0.method3920(), arg0.method3922());
	}
}
