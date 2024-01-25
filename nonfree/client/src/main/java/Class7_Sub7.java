import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub7(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Z")
	public boolean method3294() {
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)I")
	public int method3298() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return arg0 == 0 || super.aClass3_Sub41_31.aClass7_Sub1_1.method189() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.anInt10115 != 0 && super.aClass3_Sub41_31.aClass7_Sub1_1.method189() != 1) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 1) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}
}
