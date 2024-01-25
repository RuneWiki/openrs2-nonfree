import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class332 {

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString91;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "Ljava/lang/String;")
	public static final String aString90;

	static {
		@Pc(291) String local291 = "Unknown";
		try {
			local291 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(297) Exception local297) {
		}
		local291.toLowerCase();
		local291 = "Unknown";
		try {
			local291 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(308) Exception local308) {
		}
		local291.toLowerCase();
		local291 = "Unknown";
		try {
			local291 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(319) Exception local319) {
		}
		aString91 = local291.toLowerCase();
		local291 = "Unknown";
		try {
			local291 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(330) Exception local330) {
		}
		aString90 = local291.toLowerCase();
		local291 = "Unknown";
		try {
			local291 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(341) Exception local341) {
		}
		local291.toLowerCase();
		local291 = "~/";
		try {
			local291 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(352) Exception local352) {
		}
		new File(local291);
	}
}
