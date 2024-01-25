import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Ljava/lang/String;")
	public static final String aString21;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Ljava/lang/String;")
	public static final String aString20;

	static {
		@Pc(6) String local6 = "Unknown";
		try {
			local6 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(12) Exception local12) {
		}
		local6.toLowerCase();
		local6 = "Unknown";
		try {
			local6 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(23) Exception local23) {
		}
		local6.toLowerCase();
		local6 = "Unknown";
		try {
			local6 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(34) Exception local34) {
		}
		aString21 = local6.toLowerCase();
		local6 = "Unknown";
		try {
			local6 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(45) Exception local45) {
		}
		aString20 = local6.toLowerCase();
		local6 = "Unknown";
		try {
			local6 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(56) Exception local56) {
		}
		local6.toLowerCase();
		local6 = "~/";
		try {
			local6 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(67) Exception local67) {
		}
		new File(local6);
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		return Static546.anIntArray582;
	}
}
