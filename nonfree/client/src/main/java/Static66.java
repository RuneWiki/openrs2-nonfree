import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
	public static int anInt1082;

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "J")
	public static long aLong32;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "Lclient!el;")
	public static final Class109 aClass109_30 = new Class109(84, 1);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method1087(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg0, 2);
		local16.method2687();
		local16.aString48 = arg1;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method1088(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) File arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
		try {
			local14.readFully(arg1, 0, arg0);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method1090() {
		@Pc(18) String local18 = "www";
		if (Static161.aClass201_3 == Static570.aClass201_10) {
			local18 = "www-wtrc";
		} else if (Static570.aClass201_10 == Static375.aClass201_7) {
			local18 = "www-wtqa";
		} else if (Static47.aClass201_1 == Static570.aClass201_10) {
			local18 = "www-wtwip";
		}
		@Pc(49) String local49 = "";
		if (Static625.aString132 != null) {
			local49 = "/p=" + Static625.aString132;
		}
		return "http://" + local18 + "." + Static256.aClass333_3.aString123 + ".com/l=" + Static323.anInt5795 + "/a=" + Static456.anInt7813 + local49 + "/";
	}
}
