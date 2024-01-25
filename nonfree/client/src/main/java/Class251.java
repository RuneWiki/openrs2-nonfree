import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class251 {

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "[C")
	private static final char[] aCharArray12 = new char[64];

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
	public int anInt6962 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray12[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray12[local18] = (char) (local18 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray12[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray12[62] = '*';
		aCharArray12[63] = '-';
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BILclient!np;)V")
	private void method5817(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt6962 = arg1.method5198();
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!np;)V")
	public void method5818(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method5817(local9, arg0);
		}
	}
}
