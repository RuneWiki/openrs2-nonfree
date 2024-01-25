import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public abstract class Class60_Sub1_Sub2 extends Class60_Sub1 {

	@OriginalMember(owner = "client!vea", name = "G", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!vea", name = "E", descriptor = "S")
	public final short aShort45;

	static {
		for (@Pc(61) int local61 = 0; local61 < 26; local61++) {
			aCharArray6[local61] = (char) (local61 + 65);
		}
		for (@Pc(77) int local77 = 26; local77 < 52; local77++) {
			aCharArray6[local77] = (char) (local77 + 71);
		}
		for (@Pc(91) int local91 = 52; local91 < 62; local91++) {
			aCharArray6[local91] = (char) (local91 + 48 - 52);
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
	}

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIIIII)V")
	protected Class60_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9048 = arg0;
		super.aByte134 = (byte) arg4;
		super.aByte135 = (byte) arg3;
		super.anInt9051 = arg1;
		this.aShort45 = (short) arg5;
		super.anInt9057 = arg2;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7912() {
		return Static488.aBooleanArrayArray4[(super.anInt9048 >> Static594.anInt9440) + Static382.anInt6636 - Static506.anInt8446][Static382.anInt6636 + (super.anInt9057 >> Static594.anInt9440) - Static676.anInt10368];
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method7925(@OriginalArg(0) Class75 arg0) {
		return Static240.method4227(super.aByte134, super.anInt9057 >> Static594.anInt9440, super.anInt9048 >> Static594.anInt9440);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B[Lclient!ta;)I")
	@Override
	public final int method7923(@OriginalArg(1) Class6_Sub10[] arg0) {
		return this.method7910(super.anInt9048 >> Static594.anInt9440, super.anInt9057 >> Static594.anInt9440, arg0);
	}
}
