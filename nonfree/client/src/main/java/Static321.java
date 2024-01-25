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

public final class Static321 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString54;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_117 = new Class83("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "[I")
	public static int[] anIntArray387 = new int[1];

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([Ljava/lang/Object;[JB)V")
	public static void method4335(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static195.method3075(0, arg1, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!cw;I)V")
	public static void method4336(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12_Sub1 arg1) {
		while (true) {
			@Pc(15) Class4_Sub36 local15 = (Class4_Sub36) Static421.aClass183_48.method4140();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt5309; local22++) {
				if (local15.aClass199Array1[local22] != null) {
					if (local15.aClass199Array1[local22].anInt5760 == 2) {
						local15.anIntArray351[local22] = -5;
					}
					if (local15.aClass199Array1[local22].anInt5760 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass199Array2[local22] != null) {
					if (local15.aClass199Array2[local22].anInt5760 == 2) {
						local15.anIntArray351[local22] = -6;
					}
					if (local15.aClass199Array2[local22].anInt5760 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method1133(arg0);
			arg1.method2551(0);
			@Pc(99) int local99 = arg1.anInt2997;
			arg1.method2531(local15.anInt5310);
			for (@Pc(106) int local106 = 0; local106 < local15.anInt5309; local106++) {
				if (local15.anIntArray351[local106] == 0) {
					try {
						@Pc(127) int local127 = local15.anIntArray349[local106];
						@Pc(139) Field local139;
						@Pc(143) int local143;
						if (local127 == 0) {
							local139 = (Field) local15.aClass199Array1[local106].anObject29;
							local143 = local139.getInt(null);
							arg1.method2551(0);
							arg1.method2531(local143);
						} else if (local127 == 1) {
							local139 = (Field) local15.aClass199Array1[local106].anObject29;
							local139.setInt(null, local15.anIntArray350[local106]);
							arg1.method2551(0);
						} else if (local127 == 2) {
							local139 = (Field) local15.aClass199Array1[local106].anObject29;
							local143 = local139.getModifiers();
							arg1.method2551(0);
							arg1.method2531(local143);
						}
						@Pc(207) Method local207;
						if (local127 == 3) {
							local207 = (Method) local15.aClass199Array2[local106].anObject29;
							@Pc(212) byte[][] local212 = local15.aByteArrayArrayArray4[local106];
							@Pc(216) Object[] local216 = new Object[local212.length];
							for (@Pc(218) int local218 = 0; local218 < local212.length; local218++) {
								@Pc(230) ObjectInputStream local230 = new ObjectInputStream(new ByteArrayInputStream(local212[local218]));
								local216[local218] = local230.readObject();
							}
							@Pc(245) Object local245 = local207.invoke(null, local216);
							if (local245 == null) {
								arg1.method2551(0);
							} else if (local245 instanceof Number) {
								arg1.method2551(1);
								arg1.method2504(((Number) local245).longValue());
							} else if (local245 instanceof String) {
								arg1.method2551(2);
								arg1.method2518((String) local245);
							} else {
								arg1.method2551(4);
							}
						} else if (local127 == 4) {
							local207 = (Method) local15.aClass199Array2[local106].anObject29;
							local143 = local207.getModifiers();
							arg1.method2551(0);
							arg1.method2531(local143);
						}
					} catch (@Pc(313) ClassNotFoundException local313) {
						arg1.method2551(-10);
					} catch (@Pc(319) InvalidClassException local319) {
						arg1.method2551(-11);
					} catch (@Pc(325) StreamCorruptedException local325) {
						arg1.method2551(-12);
					} catch (@Pc(331) OptionalDataException local331) {
						arg1.method2551(-13);
					} catch (@Pc(337) IllegalAccessException local337) {
						arg1.method2551(-14);
					} catch (@Pc(343) IllegalArgumentException local343) {
						arg1.method2551(-15);
					} catch (@Pc(349) InvocationTargetException local349) {
						arg1.method2551(-16);
					} catch (@Pc(355) SecurityException local355) {
						arg1.method2551(-17);
					} catch (@Pc(361) IOException local361) {
						arg1.method2551(-18);
					} catch (@Pc(367) NullPointerException local367) {
						arg1.method2551(-19);
					} catch (@Pc(373) Exception local373) {
						arg1.method2551(-20);
					} catch (@Pc(379) Throwable local379) {
						arg1.method2551(-21);
					}
				} else {
					arg1.method2551(local15.anIntArray351[local106]);
				}
			}
			arg1.method2525(local99);
			arg1.method2545(arg1.anInt2997 - local99);
			local15.method5684();
		}
	}
}
