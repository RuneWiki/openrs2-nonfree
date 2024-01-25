import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
	public static int anInt5382;

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "[I")
	public static final int[] anIntArray289 = new int[5];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjava/io/File;B)[B")
	public static byte[] method4193(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg0];
			Static82.method1762(arg0, local14, arg1);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Lclient!qba;")
	public static Class4_Sub6_Sub16 method4195() {
		return Static572.aClass4_Sub6_Sub16_3;
	}
}
