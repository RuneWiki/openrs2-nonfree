import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "Lclient!gj;")
	public static Class143 aClass143_39;

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "Lclient!jia;")
	public static Class193 aClass193_18 = new Class193();

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/io/File;[BB)V")
	public static void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIII)V")
	public static void method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1011) {
			Static543.method7514(Static346.aClass239_9, arg1, arg0);
		} else if (arg2 == 1012) {
			Static543.method7514(Static143.aClass239_3, arg1, arg0);
		} else if (arg2 == 1003) {
			Static543.method7514(Static76.aClass239_2, arg1, arg0);
		} else if (arg2 == 1006) {
			Static543.method7514(Static219.aClass239_11, arg1, arg0);
		} else if (arg2 == 1008) {
			Static543.method7514(Static168.aClass239_4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)Z")
	public static boolean method2734() {
		return Static54.anInt1418 == 0 ? Static402.aClass3_Sub9_Sub5_2.method6711() : true;
	}
}
