import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!uk", name = "bb", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_139 = new Class71(50, 11);

	@OriginalMember(owner = "client!uk", name = "ib", descriptor = "Z")
	public static boolean aBoolean710 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIILclient!bda;ILclient!bda;II)V")
	public static void method8049(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class15_Sub1_Sub2_Sub2 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class15_Sub1_Sub2_Sub2 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg5.method6685();
		if (local7 == -1) {
			return;
		}
		@Pc(23) Class21 local23 = (Class21) Static231.aClass236_41.method6242((long) local7);
		if (local23 == null) {
			@Pc(30) Class111[] local30 = Static647.method3297(Static630.aClass237_149, local7);
			if (local30 == null) {
				return;
			}
			local23 = Static171.aClass16_5.method6135(local30[0], true);
			Static231.aClass236_41.method6241((long) local7, local23);
		}
		Static531.method7498(arg0 >> 1, arg3.anInt10301, 0, arg3.aByte124, arg3.anInt10298, arg3.method6692() * 256, arg4 >> 1);
		@Pc(76) int local76 = arg1 + Static390.anIntArray410[0] - 18;
		@Pc(86) int local86 = Static390.anIntArray410[1] + arg2 - 16 - 54;
		@Pc(94) int local94 = local76 + arg6 / 4 * 18;
		@Pc(102) int local102 = local86 + arg6 % 4 * 18;
		local23.method5796(local94, local102);
		if (arg5 == arg3) {
			Static171.aClass16_5.method6086(local94 - 1, local102 + -1, -256, 18, 18);
		}
		Static460.method6945(local102 - 1, local102 + 18, local94 - 1, local94 + 18);
		@Pc(138) Class15_Sub3 local138 = Static497.method8318();
		local138.anInt3365 = local94 + 16;
		local138.aClass15_Sub1_Sub2_Sub2_1 = arg5;
		local138.anInt3362 = local102;
		local138.anInt3363 = local102 + 16;
		local138.anInt3364 = local94;
		Static627.aClass123_11.method3539(local138);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Lclient!gn;")
	public static Class8_Sub25 method8053() {
		@Pc(15) Class379 local15 = null;
		@Pc(21) Class8_Sub25 local21 = new Class8_Sub25(Static18.aClass217_1, 0);
		try {
			@Pc(27) Class301 local27 = Static51.aClass118_1.method3396("");
			while (local27.anInt8915 == 0) {
				Static214.method4061(1L);
			}
			if (local27.anInt8915 == 1) {
				local15 = (Class379) local27.anObject18;
				@Pc(54) byte[] local54 = new byte[(int) local15.method8627()];
				@Pc(68) int local68;
				for (@Pc(56) int local56 = 0; local56 < local54.length; local56 += local68) {
					local68 = local15.method8634(local54, local56, local54.length - local56);
					if (local68 == -1) {
						throw new IOException("EOF");
					}
				}
				local21 = new Class8_Sub25(new Class8_Sub8(local54), Static18.aClass217_1, 0);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (local15 != null) {
				local15.method8628();
			}
		} catch (@Pc(104) Exception local104) {
		}
		return local21;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)Z")
	public static boolean method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static430.method6706(arg0, arg1) || Static287.method4823(arg1, arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method8063(@OriginalArg(1) Class8_Sub5_Sub7 arg0) {
		if (arg0 == null) {
			return;
		}
		Static72.aClass43_17.method1424(arg0);
		Static548.anInt9471++;
		@Pc(39) Class8_Sub5_Sub6 local39;
		if (arg0.aBoolean278 || "".equals(arg0.aString42)) {
			local39 = new Class8_Sub5_Sub6(arg0.aString42);
			Static156.anInt3931++;
		} else {
			@Pc(33) long local33 = arg0.aLong92;
			for (local39 = (Class8_Sub5_Sub6) Static555.aClass253_37.method6594(local33); local39 != null && !local39.aString37.equals(arg0.aString42); local39 = (Class8_Sub5_Sub6) Static555.aClass253_37.method6599()) {
			}
			if (local39 == null) {
				local39 = (Class8_Sub5_Sub6) Static565.aClass236_33.method6242(local33);
				if (local39 != null && !local39.aString37.equals(arg0.aString42)) {
					local39 = null;
				}
				if (local39 == null) {
					local39 = new Class8_Sub5_Sub6(arg0.aString42);
				}
				Static555.aClass253_37.method6591(local39, local33);
				Static156.anInt3931++;
			}
		}
		if (local39.method2815(arg0)) {
			Static193.method3637(local39);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method8064(@OriginalArg(1) String arg0) {
		return Static566.method7877(arg0);
	}
}
