import java.io.File;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public abstract class Class33 {

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString36;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString37;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
	public int anInt4735;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljava/lang/String;")
	public String aString35;

	static {
		@Pc(8) String local8 = "Unknown";
		try {
			local8 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(14) Exception local14) {
		}
		local8.toLowerCase();
		local8 = "Unknown";
		try {
			local8 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(25) Exception local25) {
		}
		local8.toLowerCase();
		local8 = "Unknown";
		try {
			local8 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(36) Exception local36) {
		}
		aString36 = local8.toLowerCase();
		local8 = "Unknown";
		try {
			local8 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(47) Exception local47) {
		}
		aString37 = local8.toLowerCase();
		local8 = "Unknown";
		try {
			local8 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(58) Exception local58) {
		}
		local8.toLowerCase();
		local8 = "~/";
		try {
			local8 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(69) Exception local69) {
		}
		new File(local8);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Ljava/net/Socket;")
	protected final Socket method4071() throws IOException {
		return new Socket(this.aString35, this.anInt4735);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method4072() throws IOException;
}
