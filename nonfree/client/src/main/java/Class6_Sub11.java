import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "Z")
	public boolean aBoolean320 = false;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "Z")
	private boolean aBoolean321 = true;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub11(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IZ)V")
	public void method3982(@OriginalArg(1) boolean arg0) {
		this.aBoolean321 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Z")
	public boolean method3983() {
		return super.aClass5_Sub25_32.method3681().method7220();
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Z")
	public boolean method3984() {
		return this.aBoolean321;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (!super.aClass5_Sub25_32.method3681().method7220()) {
			super.anInt9925 = 0;
		}
		if (super.anInt9925 < 0 || super.anInt9925 > 5) {
			super.anInt9925 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		this.aBoolean320 = false;
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)I")
	public int method3988() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub25_32.method3681().method7220()) {
			return arg0 == 3 && !Static146.method2170("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		this.aBoolean320 = true;
		return super.aClass5_Sub25_32.method3681().method7220() ? 2 : 0;
	}
}
