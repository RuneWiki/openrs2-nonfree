import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!taa", name = "j", descriptor = "J")
	public long aLong200;

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray6[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray6[local20] = (char) (local20 + 71);
		}
		for (@Pc(34) int local34 = 52; local34 < 62; local34++) {
			aCharArray6[local34] = (char) (local34 - 4);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
	private Class1_Sub45() {
	}

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(J)V")
	public Class1_Sub45(@OriginalArg(0) long arg0) {
		this.aLong200 = arg0;
	}
}
