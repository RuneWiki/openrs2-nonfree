import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "Lclient!dw;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_66 = new Class67("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([BLjava/io/File;II)V")
	public static void method3928(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local19.readFully(arg0, 0, arg2);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static62.method7109(arg2)) {
			if (Static107.aClass245ArrayArray1[arg2] == null) {
				Static461.method6875(arg5, arg7, -1, arg1, arg6, arg4, arg0, arg3, Static459.aClass245ArrayArray2[arg2]);
			} else {
				Static461.method6875(arg5, arg7, -1, arg1, arg6, arg4, arg0, arg3, Static107.aClass245ArrayArray1[arg2]);
			}
		} else if (arg5 == -1) {
			for (@Pc(33) int local33 = 0; local33 < 100; local33++) {
				Static125.aBooleanArray12[local33] = true;
			}
		} else {
			Static125.aBooleanArray12[arg5] = true;
		}
	}
}
