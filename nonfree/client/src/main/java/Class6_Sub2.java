import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub2(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		return arg0 == 0 || super.aClass5_Sub25_32.aClass6_Sub10_1.method2365() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)Z")
	public boolean method113() {
		return true;
	}

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "(I)I")
	public int method114() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (super.anInt9925 != 0 && super.aClass5_Sub25_32.aClass6_Sub10_1.method2365() != 1) {
			super.anInt9925 = 0;
		}
		if (super.anInt9925 < 0 || super.anInt9925 > 1) {
			super.anInt9925 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 1;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}
}
