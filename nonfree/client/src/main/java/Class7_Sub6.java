import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub6(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)I")
	public int method3237() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.anInt10115 != 1 && super.anInt10115 != 0) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 1;
	}
}
