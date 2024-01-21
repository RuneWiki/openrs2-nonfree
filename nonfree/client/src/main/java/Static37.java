import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_39;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_659 = Static118.method2249("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
	public static final int[] anIntArray97 = new int[25];

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	public static int anInt1034 = 0;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!df", name = "x", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!df", name = "J", descriptor = "I")
	public static int anInt1043 = 0;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_661 = Static118.method2249("Connecting to update server");

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "Lclient!oc;")
	public static Class65 aClass65_660 = aClass65_661;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "I")
	public static volatile int anInt1046 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/awt/Component;Lclient!da;B)Lclient!pg;")
	public static Class4 method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Class14 arg3) {
		if (Static178.anInt4019 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class4 local30 = (Class4) Class.forName("Class4_Sub2").getDeclaredConstructor().newInstance();
			local30.anIntArray429 = new int[(Static128.aBoolean131 ? 2 : 1) * 256];
			local30.anInt3661 = arg0;
			local30.method2774(arg2);
			local30.anInt3670 = (arg0 & 0xFFFFFC00) + 1024;
			if (local30.anInt3670 > 16384) {
				local30.anInt3670 = 16384;
			}
			local30.method2783(local30.anInt3670);
			if (Static195.anInt4216 > 0 && Static27.aClass28_1 == null) {
				Static27.aClass28_1 = new Class28();
				Static27.aClass28_1.aClass14_2 = arg3;
				arg3.method625(Static27.aClass28_1, Static195.anInt4216);
			}
			if (Static27.aClass28_1 != null) {
				if (Static27.aClass28_1.aClass4Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static27.aClass28_1.aClass4Array1[arg1] = local30;
			}
			return local30;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(116) Class4_Sub1 local116 = new Class4_Sub1(arg3, arg1);
				local116.anIntArray429 = new int[(Static128.aBoolean131 ? 2 : 1) * 256];
				local116.anInt3661 = arg0;
				local116.method2774(arg2);
				local116.anInt3670 = 16384;
				local116.method2783(local116.anInt3670);
				if (Static195.anInt4216 > 0 && Static27.aClass28_1 == null) {
					Static27.aClass28_1 = new Class28();
					Static27.aClass28_1.aClass14_2 = arg3;
					arg3.method625(Static27.aClass28_1, Static195.anInt4216);
				}
				if (Static27.aClass28_1 != null) {
					if (Static27.aClass28_1.aClass4Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static27.aClass28_1.aClass4Array1[arg1] = local116;
				}
				return local116;
			} catch (@Pc(175) Throwable local175) {
				return new Class4();
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)V")
	public static void method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) long local12 = Static198.method3219(arg1, arg2, arg0);
		@Pc(40) int local40;
		@Pc(27) int local27;
		@Pc(20) int local20;
		@Pc(65) int local65;
		@Pc(50) int local50;
		if (local12 != 0L) {
			local20 = arg3;
			local27 = (int) local12 >> 14 & 0x1F;
			if (local12 > 0L) {
				local20 = arg4;
			}
			local40 = (int) local12 >> 20 & 0x3;
			@Pc(43) int[] local43 = Static189.aClass1_Sub2_Sub5_Sub3_8.anIntArray204;
			local50 = Integer.MAX_VALUE & (int) (local12 >>> 32);
			local65 = arg2 * 4 + (52736 - arg0 * 512) * 4 + 24624;
			@Pc(69) Class1_Sub2_Sub13 local69 = Static5.method65(local50);
			if (local69.anInt2009 == -1) {
				if (local27 == 0 || local27 == 2) {
					if (local40 == 0) {
						local43[local65] = local20;
						local43[local65 + 512] = local20;
						local43[local65 + 1024] = local20;
						local43[local65 + 1536] = local20;
					} else if (local40 == 1) {
						local43[local65] = local20;
						local43[local65 + 1] = local20;
						local43[local65 + 2] = local20;
						local43[local65 + 3] = local20;
					} else if (local40 == 2) {
						local43[local65 + 3] = local20;
						local43[local65 + 3 + 512] = local20;
						local43[local65 + 1024 + 3] = local20;
						local43[local65 + 1539] = local20;
					} else if (local40 == 3) {
						local43[local65 + 1536] = local20;
						local43[local65 + 1536 + 1] = local20;
						local43[local65 + 1536 + 2] = local20;
						local43[local65 + 1539] = local20;
					}
				}
				if (local27 == 3) {
					if (local40 == 0) {
						local43[local65] = local20;
					} else if (local40 == 1) {
						local43[local65 + 3] = local20;
					} else if (local40 == 2) {
						local43[local65 + 3 + 1536] = local20;
					} else if (local40 == 3) {
						local43[local65 + 1536] = local20;
					}
				}
				if (local27 == 2) {
					if (local40 == 3) {
						local43[local65] = local20;
						local43[local65 + 512] = local20;
						local43[local65 + 1024] = local20;
						local43[local65 + 1536] = local20;
					} else if (local40 == 0) {
						local43[local65] = local20;
						local43[local65 + 1] = local20;
						local43[local65 + 2] = local20;
						local43[local65 + 3] = local20;
					} else if (local40 == 1) {
						local43[local65 + 3] = local20;
						local43[local65 + 512 + 3] = local20;
						local43[local65 + 1024 + 3] = local20;
						local43[local65 + 3 + 1536] = local20;
					} else if (local40 == 2) {
						local43[local65 + 1536] = local20;
						local43[local65 + 1 + 1536] = local20;
						local43[local65 + 1538] = local20;
						local43[local65 + 3 + 1536] = local20;
					}
				}
			} else {
				@Pc(79) Class1_Sub2_Sub5_Sub1 local79 = Static107.aClass1_Sub2_Sub5_Sub1Array9[local69.anInt2009];
				if (local79 != null) {
					@Pc(92) int local92 = (local69.anInt2001 * 4 - local79.anInt849) / 2;
					@Pc(102) int local102 = (local69.anInt1988 * 4 - local79.anInt848) / 2;
					local79.method558(arg2 * 4 + local102 + 48, (-local69.anInt2001 + 104 + -arg0) * 4 + 48 + local92);
				}
			}
		}
		local12 = Static202.method1711(arg1, arg2, arg0);
		if (local12 != 0L) {
			local40 = (int) local12 >> 20 & 0x3;
			local27 = (int) local12 >> 14 & 0x1F;
			local20 = (int) (local12 >>> 32) & Integer.MAX_VALUE;
			@Pc(471) Class1_Sub2_Sub13 local471 = Static5.method65(local20);
			@Pc(506) int local506;
			if (local471.anInt2009 != -1) {
				@Pc(577) Class1_Sub2_Sub5_Sub1 local577 = Static107.aClass1_Sub2_Sub5_Sub1Array9[local471.anInt2009];
				if (local577 != null) {
					local50 = (local471.anInt1988 * 4 - local577.anInt848) / 2;
					local506 = (local471.anInt2001 * 4 - local577.anInt849) / 2;
					local577.method558(local50 + arg2 * 4 + 48, local506 + (-arg0 + 104 - local471.anInt2001) * 4 + 48);
				}
			} else if (local27 == 9) {
				local65 = 15658734;
				if (local12 > 0L) {
					local65 = 15597568;
				}
				local506 = (52736 - arg0 * 512) * 4 + arg2 * 4 + 24624;
				@Pc(509) int[] local509 = Static189.aClass1_Sub2_Sub5_Sub3_8.anIntArray204;
				if (local40 == 0 || local40 == 2) {
					local509[local506 + 1536] = local65;
					local509[local506 + 1024 + 1] = local65;
					local509[local506 + 512 + 2] = local65;
					local509[local506 + 3] = local65;
				} else {
					local509[local506] = local65;
					local509[local506 + 512 + 1] = local65;
					local509[local506 + 1026] = local65;
					local509[local506 + 3 + 1536] = local65;
				}
			}
		}
		local12 = Static26.method479(arg1, arg2, arg0);
		if (local12 == 0L) {
			return;
		}
		local40 = (int) (local12 >>> 32) & Integer.MAX_VALUE;
		@Pc(645) Class1_Sub2_Sub13 local645 = Static5.method65(local40);
		if (local645.anInt2009 == -1) {
			return;
		}
		@Pc(655) Class1_Sub2_Sub5_Sub1 local655 = Static107.aClass1_Sub2_Sub5_Sub1Array9[local645.anInt2009];
		if (local655 != null) {
			local65 = (local645.anInt2001 * 4 - local655.anInt849) / 2;
			@Pc(678) int local678 = (local645.anInt1988 * 4 - local655.anInt848) / 2;
			local655.method558(arg2 * 4 + local678 + 48, local65 + 48 - -((-arg0 + 104 + -local645.anInt2001) * 4));
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIIIII)V")
	public static void method677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg0; local11 <= arg2; local11++) {
			Static51.method893(arg4, Static40.anIntArrayArray11[local11], arg3, arg1);
		}
	}
}
