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

public final class Static382 {

	@OriginalMember(owner = "client!ow", name = "N", descriptor = "J")
	public static long aLong183 = 0L;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method5653(@OriginalArg(1) Class6_Sub21_Sub2 arg0) {
		@Pc(10) Class6_Sub12 local10 = (Class6_Sub12) Static541.aClass361_51.method7838();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt1290; local17++) {
			if (local10.aClass331Array1[local17] != null) {
				if (local10.aClass331Array1[local17].anInt8818 == 2) {
					local10.anIntArray112[local17] = -5;
				}
				if (local10.aClass331Array1[local17].anInt8818 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass331Array2[local17] != null) {
				if (local10.aClass331Array2[local17].anInt8818 == 2) {
					local10.anIntArray112[local17] = -6;
				}
				if (local10.aClass331Array2[local17].anInt8818 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(90) int local90 = arg0.anInt7338;
		arg0.method6033(local10.anInt1289);
		for (@Pc(97) int local97 = 0; local97 < local10.anInt1290; local97++) {
			if (local10.anIntArray112[local97] == 0) {
				try {
					@Pc(123) int local123 = local10.anIntArray114[local97];
					@Pc(132) Field local132;
					@Pc(136) int local136;
					if (local123 == 0) {
						local132 = (Field) local10.aClass331Array1[local97].anObject18;
						local136 = local132.getInt(null);
						arg0.method6062(0);
						arg0.method6033(local136);
					} else if (local123 == 1) {
						local132 = (Field) local10.aClass331Array1[local97].anObject18;
						local132.setInt(null, local10.anIntArray113[local97]);
						arg0.method6062(0);
					} else if (local123 == 2) {
						local132 = (Field) local10.aClass331Array1[local97].anObject18;
						local136 = local132.getModifiers();
						arg0.method6062(0);
						arg0.method6033(local136);
					}
					@Pc(203) Method local203;
					if (local123 == 3) {
						local203 = (Method) local10.aClass331Array2[local97].anObject18;
						@Pc(228) byte[][] local228 = local10.aByteArrayArrayArray1[local97];
						@Pc(232) Object[] local232 = new Object[local228.length];
						for (@Pc(234) int local234 = 0; local234 < local228.length; local234++) {
							@Pc(246) ObjectInputStream local246 = new ObjectInputStream(new ByteArrayInputStream(local228[local234]));
							local232[local234] = local246.readObject();
						}
						@Pc(265) Object local265 = local203.invoke(null, local232);
						if (local265 == null) {
							arg0.method6062(0);
						} else if (local265 instanceof Number) {
							arg0.method6062(1);
							arg0.method6019(((Number) local265).longValue());
						} else if (local265 instanceof String) {
							arg0.method6062(2);
							arg0.method6022((String) local265);
						} else {
							arg0.method6062(4);
						}
					} else if (local123 == 4) {
						local203 = (Method) local10.aClass331Array2[local97].anObject18;
						local136 = local203.getModifiers();
						arg0.method6062(0);
						arg0.method6033(local136);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method6062(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method6062(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method6062(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method6062(-13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method6062(-14);
				} catch (@Pc(342) IllegalArgumentException local342) {
					arg0.method6062(-15);
				} catch (@Pc(348) InvocationTargetException local348) {
					arg0.method6062(-16);
				} catch (@Pc(354) SecurityException local354) {
					arg0.method6062(-17);
				} catch (@Pc(360) IOException local360) {
					arg0.method6062(-18);
				} catch (@Pc(366) NullPointerException local366) {
					arg0.method6062(-19);
				} catch (@Pc(372) Exception local372) {
					arg0.method6062(-20);
				} catch (@Pc(378) Throwable local378) {
					arg0.method6062(-21);
				}
			} else {
				arg0.method6062(local10.anIntArray112[local97]);
			}
		}
		arg0.method6060(local90);
		local10.method7804();
	}
}
