import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public static int anInt308;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt299 = -1;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[Lclient!vr;")
	public static final Class2_Sub50[] aClass2_Sub50Array1 = new Class2_Sub50[300];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method325(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static333.method5167(arg0, arg1, local11);
			return local11;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public static void method327(@OriginalArg(0) int arg0) {
		Static287.anInt5401 = arg0;
		@Pc(7) Class233 local7 = Static522.aClass233_51;
		synchronized (Static522.aClass233_51) {
			Static522.aClass233_51.method5663();
		}
	}
}
