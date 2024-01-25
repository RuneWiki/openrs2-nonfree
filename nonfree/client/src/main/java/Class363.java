import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class363 {

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString107;

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString108;

	static {
		@Pc(4) String local4 = "Unknown";
		try {
			local4 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(10) Exception local10) {
		}
		local4.toLowerCase();
		local4 = "Unknown";
		try {
			local4 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(21) Exception local21) {
		}
		local4.toLowerCase();
		local4 = "Unknown";
		try {
			local4 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(32) Exception local32) {
		}
		aString107 = local4.toLowerCase();
		local4 = "Unknown";
		try {
			local4 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
		}
		aString108 = local4.toLowerCase();
		local4 = "Unknown";
		try {
			local4 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(54) Exception local54) {
		}
		local4.toLowerCase();
		local4 = "~/";
		try {
			local4 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(65) Exception local65) {
		}
		new File(local4);
	}
}
