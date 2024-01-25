import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_60 = new Class100(3, 4);

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_5 = new Class395(12, 5);

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
	public static int anInt3954 = 0;

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[2];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/io/File;II[B)V")
	public static void method3278(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg2, 0, arg1);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!td;ZLjava/lang/String;Ljava/lang/String;I)Lclient!hu;")
	public static Class150 method3279(@OriginalArg(0) Class333 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return arg0.method8138(arg2);
		}
		@Pc(60) Class150 local60;
		if (arg3 == 1) {
			try {
				@Pc(40) Object local40 = Static682.method5125(arg1, Static645.anApplet2, new Object[] { (new URL(Static645.anApplet2.getCodeBase(), arg2)).toString() });
				if (local40 == null) {
					throw new RuntimeException();
				}
				@Pc(50) Class150 local50 = new Class150();
				local50.anInt4247 = 1;
				return local50;
			} catch (@Pc(56) Throwable local56) {
				local60 = new Class150();
				local60.anInt4247 = 2;
				return local60;
			}
		} else if (arg3 == 2) {
			try {
				Static645.anApplet2.getAppletContext().showDocument(new URL(Static645.anApplet2.getCodeBase(), arg2), "_blank");
				local60 = new Class150();
				local60.anInt4247 = 1;
				return local60;
			} catch (@Pc(88) Exception local88) {
				local60 = new Class150();
				local60.anInt4247 = 2;
				return local60;
			}
		} else if (arg3 == 3) {
			try {
				Static682.method5126("loggedout", Static645.anApplet2);
			} catch (@Pc(109) Throwable local109) {
			}
			try {
				Static645.anApplet2.getAppletContext().showDocument(new URL(Static645.anApplet2.getCodeBase(), arg2), "_top");
				local60 = new Class150();
				local60.anInt4247 = 1;
				return local60;
			} catch (@Pc(129) Exception local129) {
				local60 = new Class150();
				local60.anInt4247 = 2;
				return local60;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V")
	public static void method3281() {
		Static204.aClass185Array7 = null;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[F)[F")
	public static float[] method3282(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static681.method2477(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
