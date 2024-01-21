import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public static int anInt894;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	public static int anInt897;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public static int anInt890 = 0;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!va;")
	private static Class61 aClass61_345 = Static88.method1421("Please reload this page)3");

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!va;")
	public static Class61 aClass61_342 = aClass61_345;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
	public static int[] anIntArray95 = new int[128];

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!va;")
	private static Class61 aClass61_343 = Static88.method1421("Welcome to RuneScape");

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_344 = aClass61_343;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[Lclient!r;")
	public static Class53[] aClass53Array1 = new Class53[12];

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
	public static int[] anIntArray96 = new int[500];

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	public static int anInt896 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIII)I")
	public static int method528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lclient!va;")
	public static Class61 method529(@OriginalArg(0) int arg0) {
		return Static55.method817(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B[B)[B")
	public static byte[] method530(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class10_Sub10 local4 = new Class10_Sub10(arg0);
		@Pc(13) int local13 = local4.method1111();
		@Pc(17) int local17 = local4.method1112();
		if (local17 < 0 || Static36.anInt1029 != 0 && Static36.anInt1029 < local17) {
			throw new RuntimeException();
		} else if (local13 == 0) {
			@Pc(43) byte[] local43 = new byte[local17];
			local4.method1118(local17, local43);
			return local43;
		} else {
			@Pc(55) int local55 = local4.method1112();
			if (local55 < 0 || Static36.anInt1029 != 0 && Static36.anInt1029 < local55) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local55];
			if (local13 == 1) {
				Static87.method1413(local75, local55, arg0, local17);
			} else {
				try {
					@Pc(91) DataInputStream local91 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local17)));
					local91.readFully(local75);
					local91.close();
				} catch (@Pc(98) IOException local98) {
				}
			}
			return local75;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method531() {
		anIntArray95 = null;
		aClass61_342 = null;
		aClass61_345 = null;
		aClass61_344 = null;
		aClass53Array1 = null;
		anIntArray96 = null;
		aClass61_343 = null;
	}
}
