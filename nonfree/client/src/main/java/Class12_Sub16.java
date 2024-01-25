import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class12_Sub16 extends Class12 {

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Z")
	public boolean aBoolean350 = false;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "Z")
	private boolean aBoolean351 = true;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub16(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z")
	public boolean method3614() {
		return this.aBoolean351;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (!super.aClass5_Sub50_31.method7528().method5984()) {
			super.anInt10229 = 0;
		}
		if (super.anInt10229 < 0 || super.anInt10229 > 5) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
	public int method3616() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		this.aBoolean350 = false;
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IZ)V")
	public void method3617(@OriginalArg(1) boolean arg0) {
		this.aBoolean351 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)Z")
	public boolean method3620() {
		return super.aClass5_Sub50_31.method7528().method5984();
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		this.aBoolean350 = true;
		return super.aClass5_Sub50_31.method7528().method5984() ? 2 : 0;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		if (super.aClass5_Sub50_31.method7528().method5984()) {
			return arg0 == 3 && !Static540.method7552("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}
}
