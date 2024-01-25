import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class6_Sub40_Sub1 extends Class6_Sub40 {

	@OriginalMember(owner = "client!sea", name = "Jb", descriptor = "[C")
	private static final char[] aCharArray14 = new char[64];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray14[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray14[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray14[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray14[63] = '-';
		aCharArray14[62] = '*';
	}

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(I)V")
	public Class6_Sub40_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BF)V")
	public void method7691(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray113[super.anInt10169++] = (byte) local6;
		super.aByteArray113[super.anInt10169++] = (byte) (local6 >> 8);
		super.aByteArray113[super.anInt10169++] = (byte) (local6 >> 16);
		super.aByteArray113[super.anInt10169++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IF)V")
	public void method7692(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray113[super.anInt10169++] = (byte) (local11 >> 24);
		super.aByteArray113[super.anInt10169++] = (byte) (local11 >> 16);
		super.aByteArray113[super.anInt10169++] = (byte) (local11 >> 8);
		super.aByteArray113[super.anInt10169++] = (byte) local11;
	}
}
