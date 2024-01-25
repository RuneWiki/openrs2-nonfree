import java.io.File;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class278 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString85;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString86;

	static {
		new BitSet(65536);
		@Pc(51) String local51 = "Unknown";
		try {
			local51 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(59) Exception local59) {
		}
		local51.toLowerCase();
		local51 = "Unknown";
		try {
			local51 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(74) Exception local74) {
		}
		local51.toLowerCase();
		local51 = "Unknown";
		try {
			local51 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(89) Exception local89) {
		}
		aString85 = local51.toLowerCase();
		local51 = "Unknown";
		try {
			local51 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(104) Exception local104) {
		}
		aString86 = local51.toLowerCase();
		local51 = "Unknown";
		try {
			local51 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(119) Exception local119) {
		}
		local51.toLowerCase();
		local51 = "~/";
		try {
			local51 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(134) Exception local134) {
		}
		new File(local51);
	}
}
