import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class6_Sub27 extends Class6 {

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub27(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (super.aClass5_Sub25_32.method3685()) {
			super.anInt9925 = 2;
		}
		if (super.anInt9925 < 0 || super.anInt9925 > 2) {
			super.anInt9925 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		if (super.aClass5_Sub25_32.method3685()) {
			return 2;
		} else if (super.aClass5_Sub25_32.aClass6_Sub11_1.method3984() && Static102.method1642(super.aClass5_Sub25_32.aClass6_Sub11_1.method3988())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)Z")
	public boolean method8026() {
		return !super.aClass5_Sub25_32.method3685();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		return super.aClass5_Sub25_32.method3685() ? 3 : 1;
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)I")
	public int method8027() {
		return super.anInt9925;
	}
}
