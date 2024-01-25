import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "[I")
	public static final int[] anIntArray587 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	public static final int anInt8853 = 1406;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Lclient!dm;")
	public static Class6_Sub13 method7739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class6_Sub13 local5 = null;
		if (arg2 == 0) {
			local5 = Static30.method353(Static170.aClass241_44, Static525.aClass260_4.aClass270_2);
		}
		if (arg2 == 1) {
			local5 = Static30.method353(Static57.aClass241_14, Static525.aClass260_4.aClass270_2);
		}
		local5.aClass6_Sub15_Sub1_1.method2984(arg1 + Static50.anInt606);
		local5.aClass6_Sub15_Sub1_1.method3037(Static435.aClass148_1.method3952(82) ? 1 : 0);
		local5.aClass6_Sub15_Sub1_1.method3045(arg0 + Static404.anInt7039);
		Static208.anInt4167 = arg0;
		Static566.aBoolean645 = false;
		Static97.anInt1434 = arg1;
		Static202.method3751();
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[BLjava/io/File;Z)V")
	public static void method7740(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(28) EOFException local28) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
	public static void method7743(@OriginalArg(1) int arg0) {
		Static39.anIntArray39 = new int[arg0];
		Static451.anIntArray492 = new int[arg0];
		Static236.anIntArray235 = new int[arg0];
		Static568.anIntArray660 = new int[arg0];
		Static224.anIntArray222 = new int[arg0];
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)V")
	public static void method7746(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static272.aByteArrayArrayArray2 = new byte[4][arg0][arg1];
	}
}
