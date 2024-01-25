import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
	public static int anInt4869;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!vc;")
	public static final Class301 aClass301_4 = new Class301();

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!lm;II)Lclient!pl;")
	public static Class243 method4116(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class243 local7;
		if (Static391.aClass243_10 == null) {
			local7 = new Class243();
		} else {
			local7 = Static391.aClass243_10;
			Static391.aClass243_10 = Static391.aClass243_10.aClass243_11;
			local7.aClass243_11 = null;
			Static144.anInt5610--;
		}
		local7.aClass30_Sub1_2 = arg0;
		local7.anInt7259 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method4118(@OriginalArg(1) Class42 arg0) {
		if (Static389.aBoolean533) {
			Static276.method4608(arg0);
		} else {
			Static543.method5917(arg0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4119(@OriginalArg(1) String arg0) {
		if (Static92.anInt2161 == 3) {
			return -1;
		} else if (Static158.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(29) String local29 = Static287.method4699(arg0);
			@Pc(38) String local38 = Static315.aString72 + local29;
			if (!Static453.aClass16_105.method384("", local38)) {
				return -1;
			} else if (Static453.aClass16_105.method419(local38)) {
				@Pc(62) byte[] local62 = Static453.aClass16_105.method396("", local38);
				@Pc(67) File local67 = Static454.aClass71_5.method1977(local29);
				if (local62 == null || local67 == null) {
					return -1;
				}
				@Pc(73) boolean local73 = true;
				@Pc(79) byte[] local79 = Static219.method4025(local67);
				if (local79 != null && local62.length == local79.length) {
					for (@Pc(96) int local96 = 0; local96 < local79.length; local96++) {
						if (local62[local96] != local79[local96]) {
							local73 = false;
							break;
						}
					}
				} else {
					local73 = false;
				}
				try {
					if (!local73) {
						Static454.aClass71_5.method1975(local62, local67);
					}
				} catch (@Pc(128) Throwable local128) {
					return -1;
				}
				Static390.method6181(local67, arg0);
				return 100;
			} else {
				return Static453.aClass16_105.method382(local38);
			}
		}
	}
}
