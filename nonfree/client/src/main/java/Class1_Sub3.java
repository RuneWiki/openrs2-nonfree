import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!ug;")
	public final Interface24 anInterface24_6;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray8[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray8[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray8[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray8[62] = '+';
		aCharArray8[63] = '/';
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ch;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface24_6 = arg0.method5662(arg1, arg3, false, arg2, Static355.aClass182_12);
		this.anInterface24_6.method7475(false, false);
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ch;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface24_6 = arg0.method5633(false, arg2, arg1, arg3);
		this.anInterface24_6.method7475(false, false);
	}
}
