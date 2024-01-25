import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub9(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
		Static149.method2211(super.anInt9925);
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
		Static149.method2211(super.anInt9925);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
		Static149.method2211(super.anInt9925);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		return super.aClass5_Sub25_32.method3681().method7222() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)I")
	public int method2341() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (super.aClass5_Sub25_32.method3681().method7222() < 96) {
			super.anInt9925 = 0;
		}
		if (super.anInt9925 < 0 || super.anInt9925 > 2) {
			super.anInt9925 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return super.aClass5_Sub25_32.method3681().method7222() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)Z")
	public boolean method2344() {
		return super.aClass5_Sub25_32.method3681().method7222() >= 96;
	}
}
