import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class3_Sub6_Sub27 extends Class3_Sub6 {

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "[B")
	public static final byte[] aByteArray75;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "Ljava/lang/String;")
	public static final String aString65;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Ljava/lang/String;")
	public static final String aString66;

	static {
		@Pc(5) int local5 = 0;
		aByteArray75 = new byte[32896];
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			for (@Pc(13) int local13 = 0; local13 <= local10; local13++) {
				aByteArray75[local5++] = (byte) (255.0D / Math.sqrt((double) ((float) (local10 * local10 + local13 * local13 + 65535) / 65535.0F)));
			}
		}
		@Pc(46) String local46 = "Unknown";
		try {
			local46 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(52) Exception local52) {
		}
		local46.toLowerCase();
		local46 = "Unknown";
		try {
			local46 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(63) Exception local63) {
		}
		local46.toLowerCase();
		local46 = "Unknown";
		try {
			local46 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(74) Exception local74) {
		}
		aString65 = local46.toLowerCase();
		local46 = "Unknown";
		try {
			local46 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(85) Exception local85) {
		}
		aString66 = local46.toLowerCase();
		local46 = "Unknown";
		try {
			local46 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(96) Exception local96) {
		}
		local46.toLowerCase();
		local46 = "~/";
		try {
			local46 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(107) Exception local107) {
		}
		new File(local46);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		return Static73.anIntArray76;
	}
}
