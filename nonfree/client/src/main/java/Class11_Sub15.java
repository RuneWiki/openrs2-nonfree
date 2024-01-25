import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class11_Sub15 extends Class11 {

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "Z")
	private boolean aBoolean384 = true;

	@OriginalMember(owner = "client!kfa", name = "r", descriptor = "Z")
	public boolean aBoolean385 = false;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub15(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)Z")
	public boolean method4284() {
		return this.aBoolean384;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub46_30.method8195().method2904()) {
			return arg0 == 3 && !Static98.method3779("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		if (!super.aClass5_Sub46_30.method8195().method2904()) {
			super.anInt10053 = 0;
		}
		if (super.anInt10053 < 0 || super.anInt10053 > 5) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)Z")
	public boolean method4287() {
		return super.aClass5_Sub46_30.method8195().method2904();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Z)I")
	public int method4289() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		this.aBoolean385 = false;
		super.anInt10053 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZI)V")
	public void method4291(@OriginalArg(0) boolean arg0) {
		this.aBoolean384 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		this.aBoolean385 = true;
		return super.aClass5_Sub46_30.method8195().method2904() ? 2 : 0;
	}
}
