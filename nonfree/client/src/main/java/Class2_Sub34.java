import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "Ljava/lang/String;")
	public static final String aString72;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "Ljava/lang/String;")
	public static final String aString71;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	public final int anInt6727;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public final int anInt6730;

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
		aString72 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString71 = local1.toLowerCase();
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

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(II)V")
	public Class2_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6727 = arg0;
		this.anInt6730 = arg1;
	}
}
