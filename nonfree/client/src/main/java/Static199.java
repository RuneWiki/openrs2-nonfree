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

public final class Static199 {

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_27 = new Class211();

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "[Lclient!gi;")
	public static Class116_Sub1[] aClass116_Sub1Array1 = new Class116_Sub1[0];

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!lt;I)V")
	public static void method3757(@OriginalArg(1) Class6_Sub26_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) Class6_Sub8 local17 = (Class6_Sub8) Static405.aClass211_61.method5183();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt1405; local24++) {
				if (local17.aClass280Array2[local24] != null) {
					if (local17.aClass280Array2[local24].anInt8467 == 2) {
						local17.anIntArray91[local24] = -5;
					}
					if (local17.aClass280Array2[local24].anInt8467 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass280Array1[local24] != null) {
					if (local17.aClass280Array1[local24].anInt8467 == 2) {
						local17.anIntArray91[local24] = -6;
					}
					if (local17.aClass280Array1[local24].anInt8467 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method5010(arg1);
			arg0.method4950(0, -81849);
			@Pc(107) int local107 = arg0.anInt5769;
			arg0.method4979(local17.anInt1407);
			for (@Pc(114) int local114 = 0; local114 < local17.anInt1405; local114++) {
				if (local17.anIntArray91[local114] == 0) {
					try {
						@Pc(138) int local138 = local17.anIntArray93[local114];
						@Pc(153) Field local153;
						@Pc(179) int local179;
						if (local138 == 0) {
							local153 = (Field) local17.aClass280Array2[local114].anObject16;
							local179 = local153.getInt(null);
							arg0.method4950(0, -81849);
							arg0.method4979(local179);
						} else if (local138 == 1) {
							local153 = (Field) local17.aClass280Array2[local114].anObject16;
							local153.setInt(null, local17.anIntArray92[local114]);
							arg0.method4950(0, -81849);
						} else if (local138 == 2) {
							local153 = (Field) local17.aClass280Array2[local114].anObject16;
							local179 = local153.getModifiers();
							arg0.method4950(0, -81849);
							arg0.method4979(local179);
						}
						@Pc(218) Method local218;
						if (local138 == 3) {
							local218 = (Method) local17.aClass280Array1[local114].anObject16;
							@Pc(223) byte[][] local223 = local17.aByteArrayArrayArray3[local114];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(260) Object local260 = local218.invoke(null, local227);
							if (local260 == null) {
								arg0.method4950(0, -81849);
							} else if (local260 instanceof Number) {
								arg0.method4950(1, -81849);
								arg0.method4943(((Number) local260).longValue());
							} else if (local260 instanceof String) {
								arg0.method4950(2, -81849);
								arg0.method4998((String) local260);
							} else {
								arg0.method4950(4, -81849);
							}
						} else if (local138 == 4) {
							local218 = (Method) local17.aClass280Array1[local114].anObject16;
							local179 = local218.getModifiers();
							arg0.method4950(0, -81849);
							arg0.method4979(local179);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method4950(-10, -81849);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method4950(-11, -81849);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method4950(-12, -81849);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method4950(-13, -81849);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method4950(-14, -81849);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method4950(-15, -81849);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method4950(-16, -81849);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method4950(-17, -81849);
					} catch (@Pc(374) IOException local374) {
						arg0.method4950(-18, -81849);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method4950(-19, -81849);
					} catch (@Pc(386) Exception local386) {
						arg0.method4950(-20, -81849);
					} catch (@Pc(392) Throwable local392) {
						arg0.method4950(-21, -81849);
					}
				} else {
					arg0.method4950(local17.anIntArray91[local114], -81849);
				}
			}
			arg0.method4996(local107);
			arg0.method4976(arg0.anInt5769 - local107);
			local17.method8151();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
	public static void method3762() {
		Static25.method966(Static192.anInt4157);
	}
}
