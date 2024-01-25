import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "Lclient!ha;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "Lclient!db;")
	public static final Class64 aClass64_229 = new Class64(74, 11);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIII)I")
	public static int method4301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg0 : arg2;
		@Pc(36) int local36 = local12 < 4 ? arg0 : local12 == 12 || local12 == 14 ? arg2 : arg1;
		return ((local12 & 0x2) == 0 ? local36 : -local36) + ((local12 & 0x1) == 0 ? local21 : -local21);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/io/File;I[B)V")
	public static void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local19.readFully(arg2, 0, arg0);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}
}
