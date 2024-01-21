import java.awt.Canvas;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public static int anInt1216;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_458 = Static34.method846(" x ");

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_459 = Static34.method846("::");

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!rc;")
	private static Class55 aClass55_464 = Static34.method846("To create a new account you need to");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_460 = aClass55_464;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public static int anInt1220 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_461 = Static34.method846("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_462 = Static34.method846(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!rc;")
	public static Class55 aClass55_463 = Static34.method846("headicons_prayer");

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!rc;")
	public static Class55 aClass55_465 = Static34.method846("gr-Un:");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method800() {
		Static50.method2079(null, false, 0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public static void method801(@OriginalArg(1) boolean arg0) {
		if (Static57.aClass65_3 == null) {
			return;
		}
		try {
			@Pc(16) Class6_Sub1 local16 = new Class6_Sub1(4);
			local16.method1501(arg0 ? 2 : 3);
			local16.method1490(0);
			Static57.aClass65_3.method2009(local16.aByteArray11, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static57.aClass65_3.method2012();
			} catch (@Pc(42) Exception local42) {
			}
			Static57.aClass65_3 = null;
			Static24.anInt1088++;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method802() {
		aClass55_461 = null;
		aClass55_465 = null;
		aClass55_463 = null;
		anIntArray79 = null;
		aClass55_459 = null;
		aCanvas1 = null;
		aClass55_458 = null;
		aClass55_464 = null;
		aClass55_460 = null;
		aClass55_462 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)I")
	public static int method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg2;
			arg2 = local14;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 + 1 - arg3 - arg4;
		} else {
			return 7 + 1 - arg0 - arg2;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B[B)[B")
	public static byte[] method804(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class6_Sub1 local4 = new Class6_Sub1(arg0);
		@Pc(17) int local17 = local4.method1495();
		@Pc(21) int local21 = local4.method1503();
		if (local21 < 0 || Static92.anInt2559 != 0 && Static92.anInt2559 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(40) byte[] local40 = new byte[local21];
			local4.method1508(local40, local21);
			return local40;
		} else {
			@Pc(52) int local52 = local4.method1503();
			if (local52 < 0 || Static92.anInt2559 != 0 && Static92.anInt2559 < local52) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local52];
			if (local17 == 1) {
				Static40.method920(local69, local52, arg0, local21);
			} else {
				try {
					@Pc(87) DataInputStream local87 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local87.readFully(local69);
					local87.close();
				} catch (@Pc(94) IOException local94) {
				}
			}
			return local69;
		}
	}
}
