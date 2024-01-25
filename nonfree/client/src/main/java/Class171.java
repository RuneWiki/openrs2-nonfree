import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class171 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Ljava/lang/String;")
	public static final String aString60;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString59;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public final int anInt4655;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	private final int anInt4656;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString60 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString59 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4655 = arg1;
		this.anInt4656 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
	public int method3996() {
		return this.anInt4656;
	}
}
