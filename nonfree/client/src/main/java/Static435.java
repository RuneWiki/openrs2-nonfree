import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	public static int anInt7099;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "[B")
	public static final byte[] aByteArray103 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_328 = new Class22(4, -1);

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_17 = new Class21(13, 3);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZI)Lclient!jg;")
	public static Class118 method5501(@OriginalArg(1) int arg0) {
		@Pc(17) Class118 local17 = (Class118) Static436.aClass68_53.method1787((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static306.aClass76_65.method2104(arg0, 0);
		local17 = new Class118();
		if (local27 != null) {
			local17.method2922(arg0, new Class4_Sub12(local27));
		}
		Static436.aClass68_53.method1779((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(JI)V")
	public static void method5503(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static389.method5115(arg0 - 1L);
			Static389.method5115(1L);
		} else {
			Static389.method5115(arg0);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method5504(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static277.anInt5150;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class101 local27 = Static426.aClass208_1.method4725(arg0[local18]);
			if (local27.anInt3153 != -1) {
				@Pc(39) Class57 local39 = (Class57) Static105.aClass68_9.method1787((long) local27.anInt3153);
				if (local39 == null) {
					@Pc(47) Class18 local47 = Static456.method318(Static293.aClass76_60, local27.anInt3153, 0);
					if (local47 != null) {
						local39 = Static122.aClass19_16.method4308(local47);
						Static105.aClass68_9.method1779((long) local27.anInt3153, local39);
					}
				}
				if (local39 != null) {
					Static385.aClass57Array16[local16] = local39;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
