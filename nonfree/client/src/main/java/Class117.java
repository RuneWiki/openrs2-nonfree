import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class117 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
	public final int anInt3084;

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "J")
	public final long aLong91;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString29;

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
	public final int anInt3083;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray3[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray3[local18] = (char) (local18 + 71);
		}
		for (@Pc(32) int local32 = 52; local32 < 62; local32++) {
			aCharArray3[local32] = (char) (local32 + 48 - 52);
		}
		aCharArray3[63] = '/';
		aCharArray3[62] = '+';
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt3084 = arg2;
		this.aLong91 = arg4;
		this.aString28 = arg3;
		this.aString29 = arg1;
		this.anInt3083 = arg0;
	}
}
