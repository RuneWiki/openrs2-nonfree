import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "J")
	public static long aLong214;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "[I")
	public static final int[] anIntArray458 = new int[50];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method6387() {
		@Pc(7) Class105[] local7 = Class328.aClass105Array1;
		synchronized (Class328.aClass105Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class328.aClass105Array1.length; local11++) {
				Class328.aClass105Array1[local11] = new Class105();
				Static176.anIntArray230[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!iv;")
	public static Class160 method6389(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class160_Sub1(arg0, 7500);
	}
}
