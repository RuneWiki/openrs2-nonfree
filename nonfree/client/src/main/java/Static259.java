import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "J")
	public static long aLong142;

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
	public static int anInt5574 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B[Ljava/lang/String;)V")
	public static void method4571(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static378.aString72 = Static378.aString72 + arg0[0];
			Static419.anInt7930 += arg0[0].length();
			return;
		}
		for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
			if (arg0[local38].startsWith("pause")) {
				@Pc(48) int local48 = 5;
				try {
					local48 = Integer.parseInt(arg0[local38].substring(6));
				} catch (@Pc(57) Exception local57) {
				}
				Static481.method7139("Pausing for " + local48 + " seconds...");
				Static74.anInt2290 = local38 + 1;
				Static442.aStringArray24 = arg0;
				Static13.aLong235 = Static342.method5463() + (long) (local48 * 1000);
				return;
			}
			Static378.aString72 = arg0[local38];
			Static238.method4376(false);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBII)V")
	public static void method4572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static118.aByteArrayArrayArray20 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method4573(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(22) DataInputStream local22 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local22.readFully(arg0, 0, arg2);
		} catch (@Pc(29) EOFException local29) {
		}
		local22.close();
	}
}
