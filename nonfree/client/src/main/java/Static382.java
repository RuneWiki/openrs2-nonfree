import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ofa", name = "I", descriptor = "Lclient!rn;")
	public static Class288 aClass288_3;

	@OriginalMember(owner = "client!ofa", name = "O", descriptor = "I")
	public static int anInt6767 = -1;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)Lclient!qba;")
	public static Class2_Sub3_Sub13 method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) Class2_Sub3_Sub13 local23 = (Class2_Sub3_Sub13) Static427.aClass162_31.method3519((long) arg1 | (long) arg0 << 32);
		if (local23 == null) {
			local23 = new Class2_Sub3_Sub13(arg0, arg1);
			Static427.aClass162_31.method3522(local23, local23.aLong268);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method5651(@OriginalArg(1) File arg0) {
		return Static557.method7607(arg0, (int) arg0.length());
	}
}
