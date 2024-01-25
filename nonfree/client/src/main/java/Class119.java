import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class119 {

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString61;

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString62;

	static {
		@Pc(3) String local3 = "Unknown";
		try {
			local3 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(9) Exception local9) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(20) Exception local20) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(31) Exception local31) {
		}
		aString61 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(42) Exception local42) {
		}
		aString62 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(53) Exception local53) {
		}
		local3.toLowerCase();
		local3 = "~/";
		try {
			local3 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(64) Exception local64) {
		}
		new File(local3);
	}

	@OriginalMember(owner = "client!gca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
