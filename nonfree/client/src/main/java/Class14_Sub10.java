import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class14_Sub10 extends Class14 {

	@OriginalMember(owner = "client!gja", name = "p", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray3[local6] = (char) (local6 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray3[local22] = (char) (local22 + 97 - 26);
		}
		for (@Pc(40) int local40 = 52; local40 < 62; local40++) {
			aCharArray3[local40] = (char) (local40 - 4);
		}
		aCharArray3[63] = '/';
		aCharArray3[62] = '+';
	}

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub10(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)Z")
	public boolean method3044() {
		return Static376.method4978(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899());
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return Static376.method4978(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.aClass14_Sub7_2.method2902() && !Static376.method4978(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899())) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 2) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 0;
	}

	@OriginalMember(owner = "client!gja", name = "d", descriptor = "(I)I")
	public int method3046() {
		return super.anInt10805;
	}
}
