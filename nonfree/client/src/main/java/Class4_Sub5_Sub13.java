import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class4_Sub5_Sub13 extends Class4_Sub5 {

	@OriginalMember(owner = "client!kka", name = "y", descriptor = "Ljava/lang/String;")
	public static final String aString48;

	@OriginalMember(owner = "client!kka", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString47;

	@OriginalMember(owner = "client!kka", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray11;

	@OriginalMember(owner = "client!kka", name = "C", descriptor = "D")
	public double aDouble22;

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
		aString48 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString47 = local1.toLowerCase();
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

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "([[SD)V")
	public Class4_Sub5_Sub13(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray11 = arg0;
		this.aDouble22 = arg1;
	}

	@OriginalMember(owner = "client!kka", name = "d", descriptor = "(I)J")
	public long method4372() {
		return (long) (this.aShortArrayArray11.length << 0 | this.aShortArrayArray11[0].length);
	}
}
