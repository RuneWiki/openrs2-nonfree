import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!o", name = "H", descriptor = "Lclient!vf;")
	public static final Class348 aClass348_6 = new Class348();

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_11 = new Class262(5, 8);

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
	public static final int[] anIntArray407 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	public static int anInt6214 = -1;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "I")
	public static int anInt6215 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z")
	public static boolean method5201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II[BLjava/io/File;)V")
	public static void method5204(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lclient!po;")
	public static Class12_Sub2_Sub5 method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_Sub5_2;
	}
}
