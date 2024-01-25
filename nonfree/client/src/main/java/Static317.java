import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lfa", name = "s", descriptor = "I")
	public static int anInt5971;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
	public static int anInt5959 = 0;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
	public static final int anInt5960 = 1407;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)Z")
	public static boolean method5191(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
	public static void method5192() {
		@Pc(11) int local11;
		if (Static513.aClass309Array4 != null) {
			for (local11 = 0; local11 < Static402.anInt7434; local11++) {
				Static513.aClass309Array4[local11] = null;
			}
			Static513.aClass309Array4 = null;
		}
		if (Static342.aClass309Array2 != null) {
			for (local11 = 0; local11 < Static199.anInt3923; local11++) {
				Static342.aClass309Array2[local11] = null;
			}
			Static342.aClass309Array2 = null;
		}
		if (Static361.aClass309Array3 != null) {
			for (local11 = 0; local11 < Static346.anInt6729; local11++) {
				Static361.aClass309Array3[local11] = null;
			}
			Static361.aClass309Array3 = null;
		}
		Static101.anIntArray89 = null;
		Static403.anIntArrayArrayArray21 = null;
		Static287.aClass309Array1 = null;
		Static93.anInt2201 = -1;
		Static305.anInt5423 = -1;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILjava/io/File;I[B)V")
	public static void method5193(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(22) DataInputStream local22 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local22.readFully(arg2, 0, arg1);
		} catch (@Pc(29) EOFException local29) {
		}
		local22.close();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)I")
	public static int method5195() {
		return Static234.anInt4427 == 1 ? Static430.anInt7728 : Static107.anInt2317;
	}
}
