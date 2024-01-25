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

public final class Static24 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Lclient!ct;")
	public static Class67_Sub1 aClass67_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "J")
	public static long aLong8 = -1L;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "S")
	public static short aShort4 = 32767;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!kka;I)V")
	public static void method774(@OriginalArg(0) Class3_Sub17_Sub2 arg0) {
		@Pc(10) Class3_Sub36 local10 = (Class3_Sub36) Static160.aClass193_18.method4457();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt6623; local17++) {
			if (local10.aClass129Array1[local17] != null) {
				if (local10.aClass129Array1[local17].anInt3299 == 2) {
					local10.anIntArray407[local17] = -5;
				}
				if (local10.aClass129Array1[local17].anInt3299 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass129Array2[local17] != null) {
				if (local10.aClass129Array2[local17].anInt3299 == 2) {
					local10.anIntArray407[local17] = -6;
				}
				if (local10.aClass129Array2[local17].anInt3299 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(97) int local97 = arg0.lb;
		arg0.method4854(local10.anInt6621);
		for (@Pc(104) int local104 = 0; local104 < local10.anInt6623; local104++) {
			if (local10.anIntArray407[local104] == 0) {
				try {
					@Pc(125) int local125 = local10.anIntArray409[local104];
					@Pc(137) Field local137;
					@Pc(165) int local165;
					if (local125 == 0) {
						local137 = (Field) local10.aClass129Array1[local104].anObject7;
						local165 = local137.getInt((Object) null);
						arg0.method4849(0);
						arg0.method4854(local165);
					} else if (local125 == 1) {
						local137 = (Field) local10.aClass129Array1[local104].anObject7;
						local137.setInt((Object) null, local10.anIntArray408[local104]);
						arg0.method4849(0);
					} else if (local125 == 2) {
						local137 = (Field) local10.aClass129Array1[local104].anObject7;
						local165 = local137.getModifiers();
						arg0.method4849(0);
						arg0.method4854(local165);
					}
					@Pc(206) Method local206;
					if (local125 == 3) {
						local206 = (Method) local10.aClass129Array2[local104].anObject7;
						@Pc(211) byte[][] local211 = local10.aByteArrayArrayArray14[local104];
						@Pc(215) Object[] local215 = new Object[local211.length];
						for (@Pc(217) int local217 = 0; local217 < local211.length; local217++) {
							@Pc(229) ObjectInputStream local229 = new ObjectInputStream(new ByteArrayInputStream(local211[local217]));
							local215[local217] = local229.readObject();
						}
						@Pc(244) Object local244 = local206.invoke((Object) null, local215);
						if (local244 == null) {
							arg0.method4849(0);
						} else if (local244 instanceof Number) {
							arg0.method4849(1);
							arg0.method4889(((Number) local244).longValue());
						} else if (local244 instanceof String) {
							arg0.method4849(2);
							arg0.method4878((String) local244);
						} else {
							arg0.method4849(4);
						}
					} else if (local125 == 4) {
						local206 = (Method) local10.aClass129Array2[local104].anObject7;
						local165 = local206.getModifiers();
						arg0.method4849(0);
						arg0.method4854(local165);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method4849(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method4849(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method4849(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method4849(-13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method4849(-14);
				} catch (@Pc(340) IllegalArgumentException local340) {
					arg0.method4849(-15);
				} catch (@Pc(346) InvocationTargetException local346) {
					arg0.method4849(-16);
				} catch (@Pc(352) SecurityException local352) {
					arg0.method4849(-17);
				} catch (@Pc(358) IOException local358) {
					arg0.method4849(-18);
				} catch (@Pc(364) NullPointerException local364) {
					arg0.method4849(-19);
				} catch (@Pc(370) Exception local370) {
					arg0.method4849(-20);
				} catch (@Pc(376) Throwable local376) {
					arg0.method4849(-21);
				}
			} else {
				arg0.method4849(local10.anIntArray407[local104]);
			}
		}
		arg0.method4894(local97);
		local10.method8770();
	}
}
