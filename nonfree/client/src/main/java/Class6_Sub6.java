import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!fv", name = "q", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	static {
		for (@Pc(10) int local10 = 0; local10 < 26; local10++) {
			aCharArray6[local10] = (char) (local10 + 65);
		}
		for (@Pc(24) int local24 = 26; local24 < 52; local24++) {
			aCharArray6[local24] = (char) (local24 + 71);
		}
		for (@Pc(40) int local40 = 52; local40 < 62; local40++) {
			aCharArray6[local40] = (char) (local40 - 4);
		}
		aCharArray6[63] = '/';
		aCharArray6[62] = '+';
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub6(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		super.anInt10233 = this.method8962();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
	public int method3210() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return super.aClass3_Sub22_31.method2845() ? 1 : 0;
	}
}
