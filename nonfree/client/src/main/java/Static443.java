import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!rb", name = "xb", descriptor = "I")
	public static int anInt8270;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!pe;")
	public static final Class258 aClass258_8 = new Class258();

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	public static int anInt8248 = -2;

	@OriginalMember(owner = "client!rb", name = "Bb", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_103 = new Class173(29, 15);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lclient!mp;")
	public static Class222 method6828(@OriginalArg(0) int arg0) {
		@Pc(10) Class222 local10 = (Class222) Static334.aClass223_43.method5388((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static421.aClass176_105.method3994(arg0, 1);
		local10 = new Class222();
		local10.anInt6336 = arg0;
		if (local25 != null) {
			local10.method5384(new Class4_Sub11(local25));
		}
		local10.method5386();
		if (local10.anInt6340 == 2 && Static24.aClass350_1.method8207((long) arg0) == null) {
			Static24.aClass350_1.method8199((long) arg0, new Class4_Sub38(Static214.anInt3964));
			Static450.aClass222Array1[Static214.anInt3964++] = local10;
		}
		Static334.aClass223_43.method5394(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/io/File;[B)V")
	public static void method6829(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method6833(@OriginalArg(0) Class1_Sub4_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt8426 - Static106.anInt2418;
		@Pc(21) int local21 = arg0.anInt8382 * 512 + arg0.method6925() * 256;
		@Pc(32) int local32 = arg0.anInt8423 * 512 + arg0.method6925() * 256;
		arg0.anInt9935 += (local32 - arg0.anInt9935) / local9;
		arg0.anInt8448 = 0;
		arg0.anInt9934 += (local21 - arg0.anInt9934) / local9;
		if (arg0.anInt8400 == 0) {
			arg0.method6936(8192);
		}
		if (arg0.anInt8400 == 1) {
			arg0.method6936(12288);
		}
		if (arg0.anInt8400 == 2) {
			arg0.method6936(0);
		}
		if (arg0.anInt8400 == 3) {
			arg0.method6936(4096);
		}
	}
}
