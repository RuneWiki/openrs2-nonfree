import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!pl", name = "M", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_113 = new Class289(27, 3);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!sh;Lclient!ae;Lclient!ae;Lclient!lp;Lclient!ae;B)Z")
	public static boolean method6612(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class6_Sub8_Sub4 arg3, @OriginalArg(4) Class8 arg4) {
		Static544.aClass6_Sub8_Sub4_10 = arg3;
		Static162.aClass8_50 = arg2;
		Static269.aClass8_71 = arg1;
		Static560.aClass8_18 = arg4;
		Static490.anIntArray539 = new int[16];
		Static292.aClass64_3 = arg0;
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			Static490.anIntArray539[local31] = 255;
		}
		return true;
	}
}
