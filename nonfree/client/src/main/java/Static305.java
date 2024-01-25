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

public final class Static305 {

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
	public static int anInt5422;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_5 = new Class146(0, 1);

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_5 = new Class222("game3", 2);

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
	public static int anInt5423 = -1;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!jc;B)V")
	public static void method4857(@OriginalArg(0) Class3_Sub3_Sub2 arg0) {
		@Pc(10) Class3_Sub34 local10 = (Class3_Sub34) Static161.aClass223_16.method5874();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt5182; local17++) {
			if (local10.aClass304Array2[local17] != null) {
				if (local10.aClass304Array2[local17].anInt8838 == 2) {
					local10.anIntArray282[local17] = -5;
				}
				if (local10.aClass304Array2[local17].anInt8838 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass304Array1[local17] != null) {
				if (local10.aClass304Array1[local17].anInt8838 == 2) {
					local10.anIntArray282[local17] = -6;
				}
				if (local10.aClass304Array1[local17].anInt8838 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(86) int local86 = arg0.anInt4736;
		arg0.method4265(local10.anInt5185);
		for (@Pc(97) int local97 = 0; local97 < local10.anInt5182; local97++) {
			if (local10.anIntArray282[local97] == 0) {
				try {
					@Pc(121) int local121 = local10.anIntArray281[local97];
					@Pc(130) Field local130;
					@Pc(134) int local134;
					if (local121 == 0) {
						local130 = (Field) local10.aClass304Array2[local97].anObject16;
						local134 = local130.getInt(null);
						arg0.method4220(0);
						arg0.method4265(local134);
					} else if (local121 == 1) {
						local130 = (Field) local10.aClass304Array2[local97].anObject16;
						local130.setInt(null, local10.anIntArray279[local97]);
						arg0.method4220(0);
					} else if (local121 == 2) {
						local130 = (Field) local10.aClass304Array2[local97].anObject16;
						local134 = local130.getModifiers();
						arg0.method4220(0);
						arg0.method4265(local134);
					}
					@Pc(200) Method local200;
					if (local121 == 3) {
						local200 = (Method) local10.aClass304Array1[local97].anObject16;
						@Pc(205) byte[][] local205 = local10.aByteArrayArrayArray16[local97];
						@Pc(209) Object[] local209 = new Object[local205.length];
						for (@Pc(211) int local211 = 0; local211 < local205.length; local211++) {
							@Pc(223) ObjectInputStream local223 = new ObjectInputStream(new ByteArrayInputStream(local205[local211]));
							local209[local211] = local223.readObject();
						}
						@Pc(242) Object local242 = local200.invoke(null, local209);
						if (local242 == null) {
							arg0.method4220(0);
						} else if (local242 instanceof Number) {
							arg0.method4220(1);
							arg0.method4251(((Number) local242).longValue());
						} else if (local242 instanceof String) {
							arg0.method4220(2);
							arg0.method4241((String) local242);
						} else {
							arg0.method4220(4);
						}
					} else if (local121 == 4) {
						local200 = (Method) local10.aClass304Array1[local97].anObject16;
						local134 = local200.getModifiers();
						arg0.method4220(0);
						arg0.method4265(local134);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method4220(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method4220(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method4220(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method4220(-13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method4220(-14);
				} catch (@Pc(340) IllegalArgumentException local340) {
					arg0.method4220(-15);
				} catch (@Pc(346) InvocationTargetException local346) {
					arg0.method4220(-16);
				} catch (@Pc(352) SecurityException local352) {
					arg0.method4220(-17);
				} catch (@Pc(358) IOException local358) {
					arg0.method4220(-18);
				} catch (@Pc(364) NullPointerException local364) {
					arg0.method4220(-19);
				} catch (@Pc(370) Exception local370) {
					arg0.method4220(-20);
				} catch (@Pc(376) Throwable local376) {
					arg0.method4220(-21);
				}
			} else {
				arg0.method4220(local10.anIntArray282[local97]);
			}
		}
		arg0.method4258(local86);
		local10.method8769();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4859(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local10 + local8);
		for (@Pc(40) int local40 = 0; local40 < local8; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local46 == '<') {
				local38.append("<lt>");
			} else if (local46 == '>') {
				local38.append("<gt>");
			} else {
				local38.append(local46);
			}
		}
		return local38.toString();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)I")
	public static int method4860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}
}
