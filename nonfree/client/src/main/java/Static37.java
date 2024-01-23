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

public final class Static37 {

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "Lclient!mk;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString46 = "Loading wordpack - ";

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Lclient!fa;")
	public static Class53 aClass53_1 = new Class53(64);

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString47 = "glow3:";

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	public static int anInt906 = 0;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!tk;BI)V")
	public static void method723(@OriginalArg(0) Class2_Sub26_Sub1 arg0) {
		while (true) {
			@Pc(18) Class2_Sub29 local18 = (Class2_Sub29) Static221.aClass1_18.method13();
			if (local18 == null) {
				return;
			}
			@Pc(24) boolean local24 = false;
			@Pc(26) int local26;
			for (local26 = 0; local26 < local18.anInt5546; local26++) {
				if (local18.aClass28Array1[local26] != null) {
					if (local18.aClass28Array1[local26].anInt726 == 2) {
						local18.anIntArray491[local26] = -5;
					}
					if (local18.aClass28Array1[local26].anInt726 == 0) {
						local24 = true;
					}
				}
				if (local18.aClass28Array2[local26] != null) {
					if (local18.aClass28Array2[local26].anInt726 == 2) {
						local18.anIntArray491[local26] = -6;
					}
					if (local18.aClass28Array2[local26].anInt726 == 0) {
						local24 = true;
					}
				}
			}
			if (local24) {
				return;
			}
			arg0.method4287(60);
			arg0.method4239(0);
			local26 = arg0.anInt5328;
			arg0.method4260(local18.anInt5551);
			for (@Pc(118) int local118 = 0; local118 < local18.anInt5546; local118++) {
				if (local18.anIntArray491[local118] == 0) {
					try {
						@Pc(149) int local149 = local18.anIntArray490[local118];
						@Pc(168) Field local168;
						@Pc(171) int local171;
						if (local149 == 0) {
							local168 = (Field) local18.aClass28Array1[local118].anObject2;
							local171 = local168.getInt(null);
							arg0.method4239(0);
							arg0.method4260(local171);
						} else if (local149 == 1) {
							local168 = (Field) local18.aClass28Array1[local118].anObject2;
							local168.setInt(null, local18.anIntArray489[local118]);
							arg0.method4239(0);
						} else if (local149 == 2) {
							local168 = (Field) local18.aClass28Array1[local118].anObject2;
							local171 = local168.getModifiers();
							arg0.method4239(0);
							arg0.method4260(local171);
						}
						@Pc(237) Method local237;
						if (local149 == 3) {
							local237 = (Method) local18.aClass28Array2[local118].anObject2;
							@Pc(262) byte[][] local262 = local18.aByteArrayArrayArray13[local118];
							@Pc(266) Object[] local266 = new Object[local262.length];
							for (@Pc(268) int local268 = 0; local268 < local262.length; local268++) {
								@Pc(286) ObjectInputStream local286 = new ObjectInputStream(new ByteArrayInputStream(local262[local268]));
								local266[local268] = local286.readObject();
							}
							@Pc(299) Object local299 = local237.invoke(null, local266);
							if (local299 == null) {
								arg0.method4239(0);
							} else if (local299 instanceof Number) {
								arg0.method4239(1);
								arg0.method4225(((Number) local299).longValue());
							} else if (local299 instanceof String) {
								arg0.method4239(2);
								arg0.method4253((String) local299);
							} else {
								arg0.method4239(4);
							}
						} else if (local149 == 4) {
							local237 = (Method) local18.aClass28Array2[local118].anObject2;
							local171 = local237.getModifiers();
							arg0.method4239(0);
							arg0.method4260(local171);
						}
					} catch (@Pc(343) ClassNotFoundException local343) {
						arg0.method4239(-10);
					} catch (@Pc(349) InvalidClassException local349) {
						arg0.method4239(-11);
					} catch (@Pc(355) StreamCorruptedException local355) {
						arg0.method4239(-12);
					} catch (@Pc(361) OptionalDataException local361) {
						arg0.method4239(-13);
					} catch (@Pc(367) IllegalAccessException local367) {
						arg0.method4239(-14);
					} catch (@Pc(373) IllegalArgumentException local373) {
						arg0.method4239(-15);
					} catch (@Pc(379) InvocationTargetException local379) {
						arg0.method4239(-16);
					} catch (@Pc(385) SecurityException local385) {
						arg0.method4239(-17);
					} catch (@Pc(391) IOException local391) {
						arg0.method4239(-18);
					} catch (@Pc(397) NullPointerException local397) {
						arg0.method4239(-19);
					} catch (@Pc(403) Exception local403) {
						arg0.method4239(-20);
					} catch (@Pc(409) Throwable local409) {
						arg0.method4239(-21);
					}
				} else {
					arg0.method4239(local18.anIntArray491[local118]);
				}
			}
			arg0.method4224(local26);
			arg0.method4254(arg0.anInt5328 - local26);
			local18.method4926();
		}
	}
}
