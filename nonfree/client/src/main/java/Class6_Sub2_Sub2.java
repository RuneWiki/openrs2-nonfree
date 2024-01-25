import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "Lclient!wj;")
	public final Class4_Sub1_Sub6 aClass4_Sub1_Sub6_1;

	static {
		for (@Pc(15) int local15 = 0; local15 < 26; local15++) {
			aCharArray1[local15] = (char) (local15 + 65);
		}
		for (@Pc(29) int local29 = 26; local29 < 52; local29++) {
			aCharArray1[local29] = (char) (local29 + 71);
		}
		for (@Pc(43) int local43 = 52; local43 < 62; local43++) {
			aCharArray1[local43] = (char) (local43 + 48 - 52);
		}
		aCharArray1[62] = '*';
		aCharArray1[63] = '-';
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!wj;)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) Class4_Sub1_Sub6 arg0) {
		this.aClass4_Sub1_Sub6_1 = arg0;
	}
}
