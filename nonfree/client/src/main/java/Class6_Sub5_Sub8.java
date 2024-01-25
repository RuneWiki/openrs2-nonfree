import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class6_Sub5_Sub8 extends Class6_Sub5 {

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "[B")
	public final byte[] aByteArray15;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray6[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray6[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray6[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray6[62] = '*';
		aCharArray6[63] = '-';
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "([B)V")
	public Class6_Sub5_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = arg0;
	}
}
