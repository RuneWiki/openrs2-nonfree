import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public static int anInt7074;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public static int anInt7075;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!nba;")
	public static final Class231 aClass231_4 = new Class231();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/io/File;I[B)V")
	public static void method5618(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(25) EOFException local25) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public static void method5619(@OriginalArg(0) int arg0) {
		if (Static532.anInt8934 == arg0) {
			return;
		}
		Static71.anInt1410 = Static471.anInt8012 = Static109.anIntArray266[arg0];
		Static402.method5596();
		Static64.anIntArrayArray33 = new int[Static71.anInt1410][Static471.anInt8012];
		Static197.anIntArrayArray146 = new int[Static71.anInt1410][Static471.anInt8012];
		Static192.anIntArrayArrayArray5 = new int[4][Static71.anInt1410 >> 3][Static471.anInt8012 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static478.aClass59Array2[local36] = Static533.method7308(Static471.anInt8012, Static71.anInt1410);
		}
		Static165.aByteArrayArrayArray13 = new byte[4][Static71.anInt1410][Static471.anInt8012];
		Static151.method2193(Static471.anInt8012, Static71.anInt1410);
		Static382.method5232(Static471.anInt8012 >> 3, Static71.anInt1410 >> 3, Static16.aClass134_1);
		Static532.anInt8934 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!pu;ZBII)V")
	public static void method5621(@OriginalArg(1) int arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(6) int arg2) {
		Static403.anInt7063 = arg2;
		Static24.anInt314 = 0;
		Static243.aBoolean335 = false;
		Static500.aClass270_114 = arg1;
		Static61.anInt1177 = arg0;
		Static290.anInt5018 = 2;
		Static11.anInt142 = 1;
	}
}
