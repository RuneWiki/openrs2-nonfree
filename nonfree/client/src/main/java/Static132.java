import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!im", name = "V", descriptor = "Lclient!am;")
	public static Class11 aClass11_58;

	@OriginalMember(owner = "client!im", name = "J", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_43 = new Class154(20);

	@OriginalMember(owner = "client!im", name = "N", descriptor = "Ljava/lang/String;")
	public static final String aString99 = "green:";

	@OriginalMember(owner = "client!im", name = "db", descriptor = "[I")
	public static final int[] anIntArray276 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!im", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString100 = " more options";

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V")
	public static void method2674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 12);
		local8.method2031();
		local8.anInt2410 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!lh;)V")
	public static void method2675(@OriginalArg(1) Class120 arg0) {
		Static293.anInt5927 = 3;
		Static339.method5546(true);
		Static128.aBoolean242 = true;
		Static240.aBoolean423 = true;
		Static235.anInt6709 = 127;
		Static147.anInt3292 = 255;
		Static229.anInt4770 = 0;
		Static131.aBoolean249 = true;
		Static221.aBoolean389 = true;
		Static58.aBoolean95 = true;
		Static86.aBoolean166 = true;
		Static351.anInt6806 = 0;
		Static144.anInt3226 = 127;
		Static318.aBoolean552 = true;
		Static235.anInt6712 = 1;
		Static143.anInt3193 = 0;
		Static339.anInt6679 = 0;
		Static200.aBoolean353 = true;
		Static192.anInt4154 = 2;
		Static336.aBoolean579 = true;
		Static135.aBoolean261 = true;
		if (Static161.anInt3644 >= 96) {
			Static239.method5168(2);
		} else {
			Static239.method5168(0);
		}
		Static64.aBoolean107 = false;
		Static273.anInt5611 = 2;
		Static152.anInt3390 = 0;
		Static2.aBoolean425 = true;
		Static166.aBoolean307 = false;
		Static115.anInt2476 = 0;
		Static332.aBoolean571 = false;
		Static56.anInt1228 = 2;
		Static68.aBoolean122 = true;
		@Pc(85) Class212 local85 = null;
		try {
			@Pc(91) Class51 local91 = arg0.method3231();
			while (local91.anInt1229 == 0) {
				Static270.method5481(1L);
			}
			if (local91.anInt1229 == 1) {
				local85 = (Class212) local91.anObject1;
				@Pc(115) byte[] local115 = new byte[(int) local85.method5531()];
				@Pc(130) int local130;
				for (@Pc(117) int local117 = 0; local117 < local115.length; local117 += local130) {
					local130 = local85.method5532(local115, local117, local115.length - local117);
					if (local130 == -1) {
						throw new IOException("EOF");
					}
				}
				Static330.method5402(new Class4_Sub7(local115));
			}
		} catch (@Pc(157) Exception local157) {
		}
		try {
			if (local85 != null) {
				local85.method5533();
			}
		} catch (@Pc(166) Exception local166) {
		}
	}
}
