import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!we;")
	public static Class5_Sub1_Sub10_Sub4 aClass5_Sub1_Sub10_Sub4_1;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lclient!oa;")
	public static Class7 aClass7_14;

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "Lclient!l;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	public static int anInt262 = -1;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Lclient!vc;")
	private static Class71 aClass71_198 = Static38.method736("level)2");

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_196 = aClass71_198;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "Lclient!vc;")
	public static Class71 aClass71_197 = Static38.method736("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "Lclient!vc;")
	private static Class71 aClass71_200 = Static38.method736("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "Lclient!vc;")
	public static Class71 aClass71_199 = aClass71_200;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
	public static int anInt269 = 0;

	@OriginalMember(owner = "client!bb", name = "gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_201 = Static38.method736("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
	public static int anInt273 = 255;

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "I")
	public static int anInt275 = -1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!me;I)Z")
	public static boolean method187(@OriginalArg(0) Class5_Sub1_Sub11 arg0) {
		if (arg0.anIntArray221 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray221.length; local12++) {
			@Pc(19) int local19 = Static114.method1774(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray220[local12];
			if (arg0.anIntArray221[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray221[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray221[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
	public static void method188() {
		aClass5_Sub1_Sub10_Sub4_1 = null;
		aClass71_197 = null;
		aClass43_1 = null;
		aClass71_196 = null;
		Class5_Sub1_Sub3.anIntArray16 = null;
		aClass71_201 = null;
		aClass7_14 = null;
		aClass71_199 = null;
		aClass71_198 = null;
		aClass71_200 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B)[B")
	public static byte[] method189(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class5_Sub11 local13 = new Class5_Sub11(arg0);
		@Pc(19) int local19 = local13.method1546();
		@Pc(25) int local25 = local13.method1540();
		if (local25 < 0 || Static99.anInt2341 != 0 && Static99.anInt2341 < local25) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(51) byte[] local51 = new byte[local25];
			local13.method1515(local51, local25);
			return local51;
		} else {
			@Pc(65) int local65 = local13.method1540();
			if (local65 < 0 || Static99.anInt2341 != 0 && Static99.anInt2341 < local65) {
				throw new RuntimeException();
			}
			@Pc(82) byte[] local82 = new byte[local65];
			if (local19 == 1) {
				Static96.method1587(local82, local65, arg0, local25);
			} else {
				try {
					@Pc(100) DataInputStream local100 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local25)));
					local100.readFully(local82);
					local100.close();
				} catch (@Pc(107) IOException local107) {
				}
			}
			return local82;
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lclient!aa;")
	public static Class2 method190() {
		try {
			return (Class2) Class.forName("Class2_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
