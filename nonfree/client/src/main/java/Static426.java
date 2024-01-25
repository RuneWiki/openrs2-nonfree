import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
	public static int anInt7281;

	@OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
	public static int anInt7278 = 0;

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "Lclient!ki;")
	public static final Class190 aClass190_6 = new Class190();

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!of;")
	public static Class149 method6106(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class149_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class149) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class149_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	public static void method6110() {
		@Pc(7) Class63 local7 = null;
		try {
			@Pc(13) Class347 local13 = Static356.aClass287_5.method6548("3", false);
			while (local13.anInt9172 == 0) {
				Static459.method6498(1L);
			}
			if (local13.anInt9172 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class63) local13.anObject49;
			@Pc(51) byte[] local51 = new byte[(int) local7.method1175()];
			if (local51.length == 0) {
				Static371.aString57 = "";
				Static127.aString20 = "";
			} else {
				@Pc(75) int local75;
				for (@Pc(62) int local62 = 0; local62 < local51.length; local62 += local75) {
					local75 = local7.method1178(local62, local51, local51.length - local62);
					if (local75 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(100) Class2_Sub15 local100 = new Class2_Sub15(local51);
				@Pc(104) int local104 = local100.method4325();
				if (local104 > 120) {
					throw new RuntimeException("Bad length");
				}
				local100.anInt5241 = local104 + 1;
				if (!local100.method4345()) {
					throw new RuntimeException("Invalid CRC");
				}
				local100.anInt5241 = 1;
				@Pc(133) int local133 = local100.method4325();
				if (local133 > 3) {
					throw new RuntimeException("Invalid version " + local133);
				}
				Static371.aString57 = local100.method4331();
				Static127.aString20 = local100.method4331();
				if (local133 >= 1) {
					Static357.anInt6389 = local100.method4294();
				} else {
					Static357.anInt6389 = Static200.anInt3958;
				}
				if (local133 >= 2) {
					Static121.aLong76 = local100.method4351();
				} else {
					Static121.aLong76 = Static15.aLong12;
				}
				if (local133 < 3) {
					Static336.aString54 = Static46.aString8;
				} else if (local100.method4325() == 1) {
					Static336.aString54 = local100.method4331();
				} else {
					Static336.aString54 = null;
				}
			}
		} catch (@Pc(201) Exception local201) {
			Static127.aString20 = "";
			Static371.aString57 = "";
		}
		try {
			if (local7 != null) {
				local7.method1174();
			}
		} catch (@Pc(212) Exception local212) {
		}
	}
}
