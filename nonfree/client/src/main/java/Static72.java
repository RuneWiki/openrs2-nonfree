import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
	public static boolean aBoolean101;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1185 = Static15.method178("To play on this world move to a free area first");

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1186 = Static15.method178(":  ");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public static int anInt2012 = 0;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!ee;")
	public static Class1_Sub1_Sub7 aClass1_Sub1_Sub7_5 = null;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1187 = Static15.method178("Friends");

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1188 = aClass23_1187;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][105][105];

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1189 = Static15.method178("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1190 = aClass23_1185;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)I")
	public static int method1287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(24) int local24 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local24;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!rb;)I")
	public static int method1289(@OriginalArg(1) Class55 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1862(Static18.aClass23_288, Static19.aClass23_309)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static74.aClass23_979)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static27.aClass23_470)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static108.aClass23_1619)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static111.aClass23_1705)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static63.aClass23_1090)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static60.aClass23_992)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static71.aClass23_1176)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static57.aClass23_969)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static95.aClass23_1401)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static115.aClass23_1733)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static108.aClass23_1653)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static58.aClass23_1673)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static10.aClass23_166)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static102.aClass23_1492)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static40.aClass23_725)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static50.aClass23_862)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static73.aClass23_1202)) {
			local5++;
		}
		if (arg0.method1862(Static18.aClass23_288, Static43.aClass23_772)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1290() {
		aClass23_1188 = null;
		aClass23_1190 = null;
		aClass23_1185 = null;
		aClass23_1187 = null;
		anIntArrayArrayArray5 = null;
		aClass1_Sub1_Sub7_5 = null;
		aClass23_1186 = null;
		aClass23_1189 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1292(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub5 local15 = new Class1_Sub5(arg0);
		@Pc(19) int local19 = local15.method716();
		@Pc(23) int local23 = local15.method692();
		if (local23 < 0 || Static75.anInt2068 != 0 && local23 > Static75.anInt2068) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(48) byte[] local48 = new byte[local23];
			local15.method709(local48, local23);
			return local48;
		} else {
			@Pc(60) int local60 = local15.method692();
			if (local60 < 0 || Static75.anInt2068 != 0 && local60 > Static75.anInt2068) {
				throw new RuntimeException();
			}
			@Pc(84) byte[] local84 = new byte[local60];
			if (local19 == 1) {
				Static85.method1481(local84, local60, arg0, local23);
			} else {
				try {
					@Pc(100) DataInputStream local100 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local23)));
					local100.readFully(local84);
					local100.close();
				} catch (@Pc(107) IOException local107) {
				}
			}
			return local84;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1293() {
		Static98.aClass5_55.method99();
		Static58.aClass5_62.method99();
	}
}
