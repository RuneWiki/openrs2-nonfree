import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class333 {

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!ew;")
	private final Class89 aClass89_20;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	private final int anInt9675;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public final int anInt9674;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public final int anInt9673;

	static {
		for (@Pc(297) int local297 = 0; local297 < 26; local297++) {
			aCharArray8[local297] = (char) (local297 + 65);
		}
		for (@Pc(311) int local311 = 26; local311 < 52; local311++) {
			aCharArray8[local311] = (char) (local311 + 71);
		}
		for (@Pc(325) int local325 = 52; local325 < 62; local325++) {
			aCharArray8[local325] = (char) (local325 + 48 - 52);
		}
		aCharArray8[62] = '+';
		aCharArray8[63] = '/';
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IILclient!ew;)V")
	public Class333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		this.aClass89_20 = arg2;
		this.anInt9675 = arg1;
		this.anInt9674 = arg0;
		this.anInt9673 = this.aClass89_20.anInt3518 * this.anInt9675;
		if (this.anInt9674 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ug", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
