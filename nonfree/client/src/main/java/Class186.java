import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class186 implements Interface27 {

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString53;

	@OriginalMember(owner = "client!jha", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString54;

	@OriginalMember(owner = "client!jha", name = "e", descriptor = "Lclient!gda;")
	private final Class126 aClass126_134;

	static {
		new Class208("", 73);
		@Pc(54) String local54 = "Unknown";
		try {
			local54 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		local54.toLowerCase();
		local54 = "Unknown";
		try {
			local54 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(77) Exception local77) {
		}
		local54.toLowerCase();
		local54 = "Unknown";
		try {
			local54 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(92) Exception local92) {
		}
		aString53 = local54.toLowerCase();
		local54 = "Unknown";
		try {
			local54 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(107) Exception local107) {
		}
		aString54 = local54.toLowerCase();
		local54 = "Unknown";
		try {
			local54 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(122) Exception local122) {
		}
		local54.toLowerCase();
		local54 = "~/";
		try {
			local54 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(137) Exception local137) {
		}
		new File(local54);
	}

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!gda;)V")
	public Class186(@OriginalArg(0) Class126 arg0) {
		this.aClass126_134 = arg0;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)I")
	@Override
	public int method4358() {
		return this.aClass126_134.method3063() ? 100 : this.aClass126_134.method3066();
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)Lclient!il;")
	@Override
	public Class171 method4357() {
		return Static246.aClass171_1;
	}
}
