import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public static void method4293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static654.anInt8148 / (float) Static654.anInt8155;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg3 * local9);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(39) int local39 = arg1 - (arg3 - local11) / 2;
		@Pc(48) int local48 = arg0 - (arg2 - local13) / 2;
		Static481.anInt8380 = local39 * Static654.anInt8155 / local11;
		Static332.anInt5824 = -1;
		Static407.anInt7261 = -1;
		Static442.anInt10084 = Static654.anInt8148 - Static654.anInt8148 * local48 / local13;
		Static276.method4222(0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([BZILjava/io/File;)V")
	public static void method4296(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg0, 0, arg1);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}
}
