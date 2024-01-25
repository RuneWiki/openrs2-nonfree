import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "Lclient!uq;")
	public static Class362 aClass362_46;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!fq;)V")
	public static void method3187(@OriginalArg(0) Class34_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class34_Sub1 local7 = null;
			for (@Pc(11) Class34_Sub1 local11 = Static368.aClass34_Sub1Array3[local4]; local11 != null; local11 = local11.aClass34_Sub1_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static368.aClass34_Sub1Array3[local4] = local11.aClass34_Sub1_23;
					} else {
						local7.aClass34_Sub1_23 = local11.aClass34_Sub1_23;
					}
					Static182.aBoolean246 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class34_Sub1 local43 = Static218.aClass34_Sub1Array2[local4]; local43 != null; local43 = local43.aClass34_Sub1_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static218.aClass34_Sub1Array2[local4] = local43.aClass34_Sub1_23;
					} else {
						local7.aClass34_Sub1_23 = local43.aClass34_Sub1_23;
					}
					Static182.aBoolean246 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class34_Sub1 local75 = Static392.aClass34_Sub1Array4[local4]; local75 != null; local75 = local75.aClass34_Sub1_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static392.aClass34_Sub1Array4[local4] = local75.aClass34_Sub1_23;
					} else {
						local7.aClass34_Sub1_23 = local75.aClass34_Sub1_23;
					}
					Static182.aBoolean246 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[BII)Ljava/lang/String;")
	public static String method3190(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			@Pc(23) int local23 = arg0[local10 + arg2] & 0xFF;
			if (local23 != 0) {
				if (local23 >= 128 && local23 < 160) {
					@Pc(42) char local42 = Static439.aCharArray7[local23 - 128];
					if (local42 == '\u0000') {
						local42 = '?';
					}
					local23 = local42;
				}
				local6[local8++] = (char) local23;
			}
		}
		return new String(local6, 0, local8);
	}
}
