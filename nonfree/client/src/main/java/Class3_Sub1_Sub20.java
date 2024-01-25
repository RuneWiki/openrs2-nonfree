import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "[B")
	public final byte[] aByteArray91;

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray6[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray6[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray6[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray91 = arg0;
	}
}
