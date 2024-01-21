import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	public static int anInt1271 = -1;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public static int anInt1272 = 0;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
	public static final int anInt1274 = 3353893;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "Lclient!lc;")
	public static Class31 aClass31_439 = Static56.method1206(" with @yel@");

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_440 = Static56.method1206("@yel@Classic");

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
	public static int anInt1279 = 3;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "Lclient!lc;")
	public static Class31 aClass31_441 = Static56.method1206("p11_full");

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method850() {
		for (@Pc(6) Class2_Sub1_Sub4_Sub1 local6 = (Class2_Sub1_Sub4_Sub1) Static55.aClass36_4.method1365(); local6 != null; local6 = (Class2_Sub1_Sub4_Sub1) Static55.aClass36_4.method1361()) {
			if (local6.anInt764 != Static58.anInt1945 || local6.aBoolean50) {
				local6.method1695();
			} else if (Static49.anInt2694 >= local6.anInt758) {
				local6.method511(Static56.anInt1911);
				if (local6.aBoolean50) {
					local6.method1695();
				} else {
					Static99.aClass64_1.method1791(local6.anInt764, local6.anInt765, local6.anInt756, local6.anInt766, 60, local6, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public static void method851() {
		aClass31_439 = null;
		aClass31_440 = null;
		aClass31_441 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)[B")
	public static byte[] method852(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub6 local4 = new Class2_Sub6(arg0);
		@Pc(8) int local8 = local4.method665();
		@Pc(12) int local12 = local4.method629();
		if (local12 < 0 || Static67.anInt2203 != 0 && Static67.anInt2203 < local12) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(44) byte[] local44 = new byte[local12];
			local4.method635(local44, local12);
			return local44;
		} else {
			@Pc(56) int local56 = local4.method629();
			if (local56 < 0 || Static67.anInt2203 != 0 && local56 > Static67.anInt2203) {
				throw new RuntimeException();
			}
			@Pc(80) byte[] local80 = new byte[local56];
			if (local8 == 1) {
				Static73.method1390(local80, local56, arg0, local12);
			} else {
				try {
					@Pc(96) DataInputStream local96 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local12)));
					local96.readFully(local80);
					local96.close();
				} catch (@Pc(103) IOException local103) {
				}
			}
			return local80;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z[BII)V")
	public static void method853(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		if (Static83.anInt2318 >= 0) {
			Static87.aClass1_1.method1050();
			Static83.anInt2318 = -1;
			Static3.anInt126 = 0;
			Static57.anInt2684 = 20;
			Static83.aByteArray21 = null;
		}
		if (arg1 == null) {
			return;
		}
		if (Static57.anInt2684 > 0) {
			Static87.aClass1_1.method1041();
			Static57.anInt2684 = 0;
		}
		Static83.anInt2318 = arg2;
		Static87.aClass1_1.method1048(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)I")
	public static int method854() {
		return Static39.anInt1458++;
	}
}
