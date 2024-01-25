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

public final class Static201 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt3738;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt3739;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static int anInt3740;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!fo;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!mfa;I)V")
	public static void method3194(@OriginalArg(0) Class3_Sub9_Sub2 arg0) {
		@Pc(10) Class3_Sub19 local10 = (Class3_Sub19) Static541.aClass216_65.method5457();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt3284; local17++) {
			if (local10.aClass174Array2[local17] != null) {
				if (local10.aClass174Array2[local17].anInt5121 == 2) {
					local10.anIntArray204[local17] = -5;
				}
				if (local10.aClass174Array2[local17].anInt5121 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass174Array1[local17] != null) {
				if (local10.aClass174Array1[local17].anInt5121 == 2) {
					local10.anIntArray204[local17] = -6;
				}
				if (local10.aClass174Array1[local17].anInt5121 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(94) int local94 = arg0.anInt6453;
		arg0.method5601(local10.anInt3283);
		for (@Pc(101) int local101 = 0; local101 < local10.anInt3284; local101++) {
			if (local10.anIntArray204[local101] == 0) {
				try {
					@Pc(124) int local124 = local10.anIntArray205[local101];
					@Pc(139) Field local139;
					@Pc(165) int local165;
					if (local124 == 0) {
						local139 = (Field) local10.aClass174Array2[local101].anObject12;
						local165 = local139.getInt((Object) null);
						arg0.method5572(0);
						arg0.method5601(local165);
					} else if (local124 == 1) {
						local139 = (Field) local10.aClass174Array2[local101].anObject12;
						local139.setInt((Object) null, local10.anIntArray206[local101]);
						arg0.method5572(0);
					} else if (local124 == 2) {
						local139 = (Field) local10.aClass174Array2[local101].anObject12;
						local165 = local139.getModifiers();
						arg0.method5572(0);
						arg0.method5601(local165);
					}
					@Pc(206) Method local206;
					if (local124 == 3) {
						local206 = (Method) local10.aClass174Array1[local101].anObject12;
						@Pc(211) byte[][] local211 = local10.aByteArrayArrayArray9[local101];
						@Pc(215) Object[] local215 = new Object[local211.length];
						for (@Pc(217) int local217 = 0; local217 < local211.length; local217++) {
							@Pc(229) ObjectInputStream local229 = new ObjectInputStream(new ByteArrayInputStream(local211[local217]));
							local215[local217] = local229.readObject();
						}
						@Pc(248) Object local248 = local206.invoke((Object) null, local215);
						if (local248 == null) {
							arg0.method5572(0);
						} else if (local248 instanceof Number) {
							arg0.method5572(1);
							arg0.method5579(((Number) local248).longValue());
						} else if (local248 instanceof String) {
							arg0.method5572(2);
							arg0.method5638((String) local248);
						} else {
							arg0.method5572(4);
						}
					} else if (local124 == 4) {
						local206 = (Method) local10.aClass174Array1[local101].anObject12;
						local165 = local206.getModifiers();
						arg0.method5572(0);
						arg0.method5601(local165);
					}
				} catch (@Pc(318) ClassNotFoundException local318) {
					arg0.method5572(-10);
				} catch (@Pc(324) InvalidClassException local324) {
					arg0.method5572(-11);
				} catch (@Pc(330) StreamCorruptedException local330) {
					arg0.method5572(-12);
				} catch (@Pc(338) OptionalDataException local338) {
					arg0.method5572(-13);
				} catch (@Pc(344) IllegalAccessException local344) {
					arg0.method5572(-14);
				} catch (@Pc(350) IllegalArgumentException local350) {
					arg0.method5572(-15);
				} catch (@Pc(356) InvocationTargetException local356) {
					arg0.method5572(-16);
				} catch (@Pc(362) SecurityException local362) {
					arg0.method5572(-17);
				} catch (@Pc(368) IOException local368) {
					arg0.method5572(-18);
				} catch (@Pc(374) NullPointerException local374) {
					arg0.method5572(-19);
				} catch (@Pc(380) Exception local380) {
					arg0.method5572(-20);
				} catch (@Pc(386) Throwable local386) {
					arg0.method5572(-21);
				}
			} else {
				arg0.method5572(local10.anIntArray204[local101]);
			}
		}
		arg0.method5639(local94);
		local10.method8682();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(JI)I")
	public static int method3195(@OriginalArg(0) long arg0) {
		Static334.method5409(arg0);
		return Static116.aCalendar1.get(1);
	}
}
