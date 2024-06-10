import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!passwordapp", name = "PROTOCOL_VERSION", descriptor = "I")
	private static final int anInt3 = 2;

	@OriginalMember(owner = "client!passwordapp", name = "TYPE_CHANGEQUESTIONS", descriptor = "I")
	private static final int anInt4 = 2;

	@OriginalMember(owner = "client!passwordapp", name = "tidyrecoveryanswer", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 337)
	public static String method44(@OriginalArg(0) String arg0) {
		@Pc(2) String local2 = arg0.toLowerCase();
		@Pc(6) StringBuffer local6 = new StringBuffer();
		for (@Pc(8) int local8 = 0; local8 < local2.length() && local8 < 50; local8++) {
			@Pc(13) char local13 = local2.charAt(local8);
			if (local13 >= 'a' && local13 <= 'z') {
				local6.append(local13);
			}
			if (local13 >= '0' && local13 <= '9') {
				local6.append(local13);
			}
		}
		return local6.toString();
	}

	@OriginalMember(owner = "client!passwordapp", name = "urlencode", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 352)
	public static String method45(@OriginalArg(0) String arg0) {
		@Pc(5) StringBuffer local5 = new StringBuffer(arg0.length());
		for (@Pc(7) int local7 = 0; local7 < arg0.length(); local7++) {
			@Pc(12) char local12 = arg0.charAt(local7);
			if ((local12 < '0' || local12 > '9') && (local12 < 'a' || local12 > 'z') && (local12 < 'A' || local12 > 'Z')) {
				local5.append("%");
				@Pc(45) int local45 = local12 >> 4 & 0xF;
				if (local45 >= 0 && local45 <= 9) {
					local5.append((char) (local45 + 48));
				} else if (local45 >= 10 && local45 <= 15) {
					local5.append((char) (local45 + 65 - 10));
				}
				local45 = local12 & 0xF;
				if (local45 >= 0 && local45 <= 9) {
					local5.append((char) (local45 + 48));
				} else if (local45 >= 10 && local45 <= 15) {
					local5.append((char) (local45 + 65 - 10));
				}
			} else {
				local5.append(local12);
			}
		}
		return local5.toString();
	}

	@OriginalMember(owner = "client!passwordapp", name = "findcachedir", descriptor = "()Ljava/lang/String;", line = 670)
	public static String method46() {
		@Pc(50) String[] local50 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		@Pc(52) String local52 = ".file_store_32";
		for (@Pc(54) int local54 = 0; local54 < local50.length; local54++) {
			try {
				@Pc(59) String local59 = local50[local54];
				@Pc(67) File local67;
				if (local59.length() > 0) {
					local67 = new File(local59);
					if (!local67.exists()) {
						continue;
					}
				}
				local67 = new File(local59 + local52);
				if (local67.exists() || local67.mkdir()) {
					return local59 + local52 + "/";
				}
			} catch (@Pc(102) Exception local102) {
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!passwordapp", name = "getuid", descriptor = "(Ljava/lang/String;)I", line = 690)
	public static int method47(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) File local11 = new File(arg0 + "uid.dat");
			if (!local11.exists() || local11.length() < 4L) {
				@Pc(34) DataOutputStream local34 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
				local34.writeInt((int) (Math.random() * 9.9999999E7D));
				local34.close();
			}
		} catch (@Pc(44) Exception local44) {
		}
		try {
			@Pc(59) DataInputStream local59 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
			@Pc(62) int local62 = local59.readInt();
			local59.close();
			return local62 + 1;
		} catch (@Pc(69) Exception local69) {
			return 0;
		}
	}
}
