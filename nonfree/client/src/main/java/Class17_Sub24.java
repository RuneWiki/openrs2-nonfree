import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class17_Sub24 extends Class17 {

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
	public boolean aBoolean663 = false;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "Z")
	private boolean aBoolean664 = true;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub24(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)I")
	public int method8102() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)Z")
	public boolean method8103() {
		return this.aBoolean664;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		this.aBoolean663 = false;
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub19_31.method2556().method1520()) {
			return arg0 == 3 && !Static304.method4757("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		this.aBoolean663 = true;
		return super.aClass5_Sub19_31.method2556().method1520() ? 2 : 0;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(IZ)V")
	public void method8106(@OriginalArg(1) boolean arg0) {
		this.aBoolean664 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)Z")
	public boolean method8107() {
		return super.aClass5_Sub19_31.method2556().method1520();
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (!super.aClass5_Sub19_31.method2556().method1520()) {
			super.anInt10866 = 0;
		}
		if (super.anInt10866 < 0 || super.anInt10866 > 5) {
			super.anInt10866 = this.method9173();
		}
	}
}
