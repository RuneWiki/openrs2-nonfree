import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_150 = new Class289(7, 3);

	@OriginalMember(owner = "client!vw", name = "I", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_366 = new Class179(69, -1);

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(BI)V")
	public static void method8851(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static528.aFloat40 = 3.0F;
		} else if (arg0 == 50) {
			Static528.aFloat40 = 4.0F;
		} else if (arg0 == 75) {
			Static528.aFloat40 = 6.0F;
		} else if (arg0 == 100) {
			Static528.aFloat40 = 8.0F;
		} else if (arg0 == 200) {
			Static528.aFloat40 = 16.0F;
		}
		Static360.anInt9757 = -1;
		Static360.anInt9757 = -1;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II[BLjava/io/File;)V")
	public static void method8854(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(25) EOFException local25) {
		}
		local14.close();
	}
}
