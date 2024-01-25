import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class17_Sub1_Sub1 extends Class17_Sub1 {

	@OriginalMember(owner = "client!th", name = "M", descriptor = "Ljava/lang/String;")
	public static final String aString105;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "Ljava/lang/String;")
	public static final String aString104;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "[B")
	private byte[] aByteArray120;

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
		aString105 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString104 = local1.toLowerCase();
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

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class17_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(IIII)[B")
	public byte[] method8217() {
		this.aByteArray120 = new byte[524288];
		this.method8415();
		return this.aByteArray120;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method8423(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray120[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray120[local15] = (byte) (local11 * 3 >> 5);
	}
}
