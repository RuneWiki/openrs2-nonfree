import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class18_Sub7 extends Class18 {

	@OriginalMember(owner = "client!mo", name = "w", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	static {
		for (@Pc(13) int local13 = 0; local13 < 26; local13++) {
			aCharArray6[local13] = (char) (local13 + 65);
		}
		for (@Pc(27) int local27 = 26; local27 < 52; local27++) {
			aCharArray6[local27] = (char) (local27 + 97 - 26);
		}
		for (@Pc(43) int local43 = 52; local43 < 62; local43++) {
			aCharArray6[local43] = (char) (local43 + 48 - 52);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class18_Sub7(@OriginalArg(0) Class13_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		super.aClass13_Sub3_23.method8281(false);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		super.aClass13_Sub3_23.method8234(arg1);
		super.aClass13_Sub3_23.method8204(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub3_23.method8281(true);
	}
}
