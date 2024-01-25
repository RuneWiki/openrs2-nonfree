import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class2_Sub14_Sub2 extends Class2_Sub14 {

	@OriginalMember(owner = "client!oba", name = "F", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray6[local4] = (char) (local4 + 65);
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

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub14_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IF)V")
	@Override
	public void method7688(@OriginalArg(1) float arg0) {
		super.aFloat262 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIBI)V")
	@Override
	public void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9273 = arg0;
		super.anInt9263 = arg1;
		super.anInt9262 = arg2;
	}
}
