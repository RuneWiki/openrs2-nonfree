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

public final class Static158 {

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1110 = Static8.method128("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1117 = Static8.method128("Login server offline)3");

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1111 = aClass18_1117;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1112 = aClass18_1110;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1114 = Static8.method128("red:");

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1113 = aClass18_1114;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1115 = Static8.method128("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1116 = aClass18_1114;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method2948(@OriginalArg(0) Class1_Sub6_Sub1 arg0) {
		while (true) {
			@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) Static47.aClass59_56.method2417();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt4108; local22++) {
				if (local15.aClass26Array2[local22] != null) {
					if (local15.aClass26Array2[local22].anInt1788 == 2) {
						local15.anIntArray380[local22] = -5;
					}
					if (local15.aClass26Array2[local22].anInt1788 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass26Array1[local22] != null) {
					if (local15.aClass26Array1[local22].anInt1788 == 2) {
						local15.anIntArray380[local22] = -6;
					}
					if (local15.aClass26Array1[local22].anInt1788 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method555(149);
			arg0.method530(0);
			@Pc(100) int local100 = arg0.anInt839;
			arg0.method513(local15.anInt4109);
			for (@Pc(107) int local107 = 0; local107 < local15.anInt4108; local107++) {
				if (local15.anIntArray380[local107] == 0) {
					try {
						@Pc(128) int local128 = local15.anIntArray381[local107];
						@Pc(142) Field local142;
						@Pc(172) int local172;
						if (local128 == 0) {
							local142 = (Field) local15.aClass26Array2[local107].anObject2;
							local172 = local142.getInt(null);
							arg0.method530(0);
							arg0.method513(local172);
						} else if (local128 == 1) {
							local142 = (Field) local15.aClass26Array2[local107].anObject2;
							local142.setInt(null, local15.anIntArray379[local107]);
							arg0.method530(0);
						} else if (local128 == 2) {
							local142 = (Field) local15.aClass26Array2[local107].anObject2;
							local172 = local142.getModifiers();
							arg0.method530(0);
							arg0.method513(local172);
						}
						@Pc(218) Method local218;
						if (local128 == 3) {
							local218 = (Method) local15.aClass26Array1[local107].anObject2;
							@Pc(243) byte[][] local243 = local15.aByteArrayArrayArray7[local107];
							@Pc(247) Object[] local247 = new Object[local243.length];
							for (@Pc(249) int local249 = 0; local249 < local243.length; local249++) {
								@Pc(261) ObjectInputStream local261 = new ObjectInputStream(new ByteArrayInputStream(local243[local249]));
								local247[local249] = local261.readObject();
							}
							@Pc(276) Object local276 = local218.invoke(null, local247);
							if (local276 == null) {
								arg0.method530(0);
							} else if (local276 instanceof Number) {
								arg0.method530(1);
								arg0.method515(((Number) local276).longValue());
							} else if (local276 instanceof Class18) {
								arg0.method530(2);
								arg0.method543((Class18) local276);
							} else {
								arg0.method530(4);
							}
						} else if (local128 == 4) {
							local218 = (Method) local15.aClass26Array1[local107].anObject2;
							local172 = local218.getModifiers();
							arg0.method530(0);
							arg0.method513(local172);
						}
					} catch (@Pc(325) ClassNotFoundException local325) {
						arg0.method530(-10);
					} catch (@Pc(331) InvalidClassException local331) {
						arg0.method530(-11);
					} catch (@Pc(337) StreamCorruptedException local337) {
						arg0.method530(-12);
					} catch (@Pc(343) OptionalDataException local343) {
						arg0.method530(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method530(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method530(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method530(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method530(-17);
					} catch (@Pc(377) IOException local377) {
						arg0.method530(-18);
					} catch (@Pc(383) NullPointerException local383) {
						arg0.method530(-19);
					} catch (@Pc(389) Exception local389) {
						arg0.method530(-20);
					} catch (@Pc(395) Throwable local395) {
						arg0.method530(-21);
					}
				} else {
					arg0.method530(local15.anIntArray380[local107]);
				}
			}
			arg0.method503(local100);
			arg0.method514(arg0.anInt839 - local100);
			local15.method3198();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method2951() {
		aClass18_1110 = null;
		aClass18_1112 = null;
		aClass18_1113 = null;
		aClass18_1114 = null;
		aClass18_1117 = null;
		anIntArray397 = null;
		aClass18_1116 = null;
		aClass18_1111 = null;
		aClass18_1115 = null;
	}
}
