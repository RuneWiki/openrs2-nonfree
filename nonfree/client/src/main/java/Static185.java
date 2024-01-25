import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gha", name = "K", descriptor = "Lclient!mca;")
	public static Class221 aClass221_1;

	@OriginalMember(owner = "client!gha", name = "P", descriptor = "I")
	public static int anInt3702;

	@OriginalMember(owner = "client!gha", name = "F", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_5 = new Class55(8, 7);

	@OriginalMember(owner = "client!gha", name = "N", descriptor = "[I")
	public static final int[] anIntArray239 = new int[8];

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLclient!vea;)I")
	public static int method3166(@OriginalArg(1) Class2_Sub7_Sub21 arg0) {
		@Pc(7) String local7 = Static519.method7225(arg0);
		@Pc(9) int[] local9 = null;
		if (Static572.method7950(arg0.anInt10014)) {
			local9 = Static470.aClass250_1.method5960((int) arg0.aLong262).anIntArray650;
		} else if (arg0.anInt10012 != -1) {
			local9 = Static470.aClass250_1.method5960(arg0.anInt10012).anIntArray650;
		} else if (Static303.method4765(arg0.anInt10014)) {
			@Pc(49) Class2_Sub32 local49 = (Class2_Sub32) Static514.aClass323_32.method7484((long) (int) arg0.aLong262);
			if (local49 != null) {
				@Pc(54) Class16_Sub1_Sub1_Sub3_Sub1 local54 = local49.aClass16_Sub1_Sub1_Sub3_Sub1_2;
				@Pc(57) Class113 local57 = local54.aClass113_1;
				if (local57.anIntArray213 != null) {
					local57 = local57.method2752(Static382.aClass282_1);
				}
				if (local57 != null) {
					local9 = local57.anIntArray211;
				}
			}
		} else if (Static342.method5178(arg0.anInt10014)) {
			@Pc(93) Class5 local93;
			if (arg0.anInt10014 == 1003) {
				local93 = Static79.aClass304_2.method6956((int) arg0.aLong262);
			} else {
				local93 = Static79.aClass304_2.method6956((int) (arg0.aLong262 >>> 32 & 0x7FFFFFFFL));
			}
			if (local93.anIntArray9 != null) {
				local93 = local93.method77(Static382.aClass282_1);
			}
			if (local93 != null) {
				local9 = local93.anIntArray10;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static416.method6094(local9);
		}
		@Pc(139) int local139 = Static551.aClass183_13.method4454(local7, Static402.aClass31Array11);
		if (arg0.aBoolean723) {
			local139 += Static457.aClass31_35.method8801() + 4;
		}
		return local139;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILclient!ei;)V")
	public static void method3168(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) Static116.aClass114_12.method2772();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt141; local17++) {
			if (local10.aClass319Array1[local17] != null) {
				if (local10.aClass319Array1[local17].anInt8562 == 2) {
					local10.anIntArray16[local17] = -5;
				}
				if (local10.aClass319Array1[local17].anInt8562 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass319Array2[local17] != null) {
				if (local10.aClass319Array2[local17].anInt8562 == 2) {
					local10.anIntArray16[local17] = -6;
				}
				if (local10.aClass319Array2[local17].anInt8562 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(95) int local95 = arg0.anInt3378;
		arg0.method2827(local10.anInt140);
		for (@Pc(102) int local102 = 0; local102 < local10.anInt141; local102++) {
			if (local10.anIntArray16[local102] == 0) {
				try {
					@Pc(123) int local123 = local10.anIntArray15[local102];
					@Pc(137) Field local137;
					@Pc(165) int local165;
					if (local123 == 0) {
						local137 = (Field) local10.aClass319Array1[local102].anObject19;
						local165 = local137.getInt((Object) null);
						arg0.method2837(0);
						arg0.method2827(local165);
					} else if (local123 == 1) {
						local137 = (Field) local10.aClass319Array1[local102].anObject19;
						local137.setInt((Object) null, local10.anIntArray17[local102]);
						arg0.method2837(0);
					} else if (local123 == 2) {
						local137 = (Field) local10.aClass319Array1[local102].anObject19;
						local165 = local137.getModifiers();
						arg0.method2837(0);
						arg0.method2827(local165);
					}
					@Pc(210) Method local210;
					if (local123 == 3) {
						local210 = (Method) local10.aClass319Array2[local102].anObject19;
						@Pc(215) byte[][] local215 = local10.aByteArrayArrayArray1[local102];
						@Pc(219) Object[] local219 = new Object[local215.length];
						for (@Pc(221) int local221 = 0; local221 < local215.length; local221++) {
							@Pc(233) ObjectInputStream local233 = new ObjectInputStream(new ByteArrayInputStream(local215[local221]));
							local219[local221] = local233.readObject();
						}
						@Pc(248) Object local248 = local210.invoke((Object) null, local219);
						if (local248 == null) {
							arg0.method2837(0);
						} else if (local248 instanceof Number) {
							arg0.method2837(1);
							arg0.method2845(((Number) local248).longValue());
						} else if (local248 instanceof String) {
							arg0.method2837(2);
							arg0.method2856((String) local248);
						} else {
							arg0.method2837(4);
						}
					} else if (local123 == 4) {
						local210 = (Method) local10.aClass319Array2[local102].anObject19;
						local165 = local210.getModifiers();
						arg0.method2837(0);
						arg0.method2827(local165);
					}
				} catch (@Pc(316) ClassNotFoundException local316) {
					arg0.method2837(-10);
				} catch (@Pc(324) InvalidClassException local324) {
					arg0.method2837(-11);
				} catch (@Pc(330) StreamCorruptedException local330) {
					arg0.method2837(-12);
				} catch (@Pc(336) OptionalDataException local336) {
					arg0.method2837(-13);
				} catch (@Pc(342) IllegalAccessException local342) {
					arg0.method2837(-14);
				} catch (@Pc(348) IllegalArgumentException local348) {
					arg0.method2837(-15);
				} catch (@Pc(354) InvocationTargetException local354) {
					arg0.method2837(-16);
				} catch (@Pc(360) SecurityException local360) {
					arg0.method2837(-17);
				} catch (@Pc(368) IOException local368) {
					arg0.method2837(-18);
				} catch (@Pc(374) NullPointerException local374) {
					arg0.method2837(-19);
				} catch (@Pc(380) Exception local380) {
					arg0.method2837(-20);
				} catch (@Pc(388) Throwable local388) {
					arg0.method2837(-21);
				}
			} else {
				arg0.method2837(local10.anIntArray16[local102]);
			}
		}
		arg0.method2864(local95);
		local10.method8920();
	}
}
