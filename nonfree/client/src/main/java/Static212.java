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

public final class Static212 {

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "Lclient!bh;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method3634(@OriginalArg(1) Class6_Sub40 arg0) {
		if (arg0.aByteArray113.length - arg0.anInt10169 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method8604();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray113.length - arg0.anInt10169 < 2) {
			return;
		}
		@Pc(41) int local41 = arg0.method8571();
		if (arg0.aByteArray113.length - arg0.anInt10169 < local41 * 6) {
			return;
		}
		for (@Pc(64) int local64 = 0; local64 < local41; local64++) {
			@Pc(70) int local70 = arg0.method8571();
			@Pc(74) int local74 = arg0.method8579();
			if (Static522.anIntArray557.length > local70 && Static211.aBooleanArray25[local70] && (Static457.aClass116_1.method3353(local70).aChar1 != '1' || local74 >= -1 && local74 <= 1)) {
				Static522.anIntArray557[local70] = local74;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!vt;I)V")
	public static void method3636(@OriginalArg(0) Class6_Sub40_Sub2 arg0) {
		@Pc(10) Class6_Sub52 local10 = (Class6_Sub52) Static340.aClass8_37.method149();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt10276; local17++) {
			if (local10.aClass328Array1[local17] != null) {
				if (local10.aClass328Array1[local17].anInt9389 == 2) {
					local10.anIntArray624[local17] = -5;
				}
				if (local10.aClass328Array1[local17].anInt9389 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass328Array2[local17] != null) {
				if (local10.aClass328Array2[local17].anInt9389 == 2) {
					local10.anIntArray624[local17] = -6;
				}
				if (local10.aClass328Array2[local17].anInt9389 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(86) int local86 = arg0.anInt10169;
		arg0.method8554(local10.anInt10275);
		for (@Pc(95) int local95 = 0; local95 < local10.anInt10276; local95++) {
			if (local10.anIntArray624[local95] == 0) {
				try {
					@Pc(121) int local121 = local10.anIntArray625[local95];
					@Pc(140) Field local140;
					@Pc(143) int local143;
					if (local121 == 0) {
						local140 = (Field) local10.aClass328Array1[local95].anObject21;
						local143 = local140.getInt((Object) null);
						arg0.method8589(0);
						arg0.method8554(local143);
					} else if (local121 == 1) {
						local140 = (Field) local10.aClass328Array1[local95].anObject21;
						local140.setInt((Object) null, local10.anIntArray627[local95]);
						arg0.method8589(0);
					} else if (local121 == 2) {
						local140 = (Field) local10.aClass328Array1[local95].anObject21;
						local143 = local140.getModifiers();
						arg0.method8589(0);
						arg0.method8554(local143);
					}
					@Pc(208) Method local208;
					if (local121 == 3) {
						local208 = (Method) local10.aClass328Array2[local95].anObject21;
						@Pc(213) byte[][] local213 = local10.aByteArrayArrayArray23[local95];
						@Pc(217) Object[] local217 = new Object[local213.length];
						for (@Pc(219) int local219 = 0; local219 < local213.length; local219++) {
							@Pc(231) ObjectInputStream local231 = new ObjectInputStream(new ByteArrayInputStream(local213[local219]));
							local217[local219] = local231.readObject();
						}
						@Pc(250) Object local250 = local208.invoke((Object) null, local217);
						if (local250 == null) {
							arg0.method8589(0);
						} else if (local250 instanceof Number) {
							arg0.method8589(1);
							arg0.method8594(((Number) local250).longValue());
						} else if (local250 instanceof String) {
							arg0.method8589(2);
							arg0.method8551((String) local250);
						} else {
							arg0.method8589(4);
						}
					} else if (local121 == 4) {
						local208 = (Method) local10.aClass328Array2[local95].anObject21;
						local143 = local208.getModifiers();
						arg0.method8589(0);
						arg0.method8554(local143);
					}
				} catch (@Pc(324) ClassNotFoundException local324) {
					arg0.method8589(-10);
				} catch (@Pc(330) InvalidClassException local330) {
					arg0.method8589(-11);
				} catch (@Pc(338) StreamCorruptedException local338) {
					arg0.method8589(-12);
				} catch (@Pc(344) OptionalDataException local344) {
					arg0.method8589(-13);
				} catch (@Pc(350) IllegalAccessException local350) {
					arg0.method8589(-14);
				} catch (@Pc(356) IllegalArgumentException local356) {
					arg0.method8589(-15);
				} catch (@Pc(364) InvocationTargetException local364) {
					arg0.method8589(-16);
				} catch (@Pc(370) SecurityException local370) {
					arg0.method8589(-17);
				} catch (@Pc(376) IOException local376) {
					arg0.method8589(-18);
				} catch (@Pc(384) NullPointerException local384) {
					arg0.method8589(-19);
				} catch (@Pc(390) Exception local390) {
					arg0.method8589(-20);
				} catch (@Pc(396) Throwable local396) {
					arg0.method8589(-21);
				}
			} else {
				arg0.method8589(local10.anIntArray624[local95]);
			}
		}
		arg0.method8616(local86);
		local10.method9043();
	}
}
