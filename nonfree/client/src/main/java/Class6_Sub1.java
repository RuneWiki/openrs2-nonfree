import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
	public static final int[] anIntArray10 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray10[local4] = Static179.method3213(local4);
		}
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub1(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 3;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (super.anInt10233 < 0 || super.anInt10233 > 4) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
	public int method146() {
		return super.anInt10233;
	}
}
