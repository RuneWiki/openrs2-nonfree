import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class12_Sub28 extends Class12 {

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub28(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
		Static450.method6499(super.anInt10229);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
		Static450.method6499(super.anInt10229);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
		Static450.method6499(super.anInt10229);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (super.aClass5_Sub50_31.method7528().method5982() < 96) {
			super.anInt10229 = 0;
		}
		if (super.anInt10229 < 0 || super.anInt10229 > 2) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)Z")
	public boolean method8316() {
		return super.aClass5_Sub50_31.method7528().method5982() >= 96;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		return super.aClass5_Sub50_31.method7528().method5982() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)I")
	public int method8317() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return super.aClass5_Sub50_31.method7528().method5982() < 96 ? 0 : 2;
	}
}
