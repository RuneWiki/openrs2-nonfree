import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!or", name = "b", descriptor = "[Lclient!rb;")
	public static Class41_Sub2[] aClass41_Sub2Array1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!mba;")
	public static final Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_130 = new Class56(14, 5);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public static void method5744(@OriginalArg(0) int arg0) {
		if (Static565.anInt9228 == 0) {
			Static323.aClass3_Sub4_Sub3_2.method6354(arg0);
		} else {
			Static225.anInt3978 = arg0;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/io/File;ZI[B)V")
	public static void method5746(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg2, 0, arg1);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}
}
