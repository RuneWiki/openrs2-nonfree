import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	public static int anInt8772 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B[BLjava/io/File;I)V")
	public static void method7527(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(22) DataInputStream local22 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local22.readFully(arg0, 0, arg2);
		} catch (@Pc(29) EOFException local29) {
		}
		local22.close();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lclient!kq;")
	public static Class199 method7534(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static392.aClass199ArrayArray2[local15] == null || Static392.aClass199ArrayArray2[local15][local19] == null) {
			@Pc(33) boolean local33 = Static583.method7687(local15);
			if (!local33) {
				return null;
			}
		}
		return Static392.aClass199ArrayArray2[local15][local19];
	}
}
