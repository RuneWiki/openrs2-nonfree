import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class12_Sub14 extends Class12 {

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub14(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		return super.aClass5_Sub50_31.method7526() ? 3 : 1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (super.aClass5_Sub50_31.method7526()) {
			super.anInt10229 = 2;
		}
		if (super.anInt10229 < 0 || super.anInt10229 > 2) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)Z")
	public boolean method3088() {
		return !super.aClass5_Sub50_31.method7526();
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		if (super.aClass5_Sub50_31.method7526()) {
			return 2;
		} else if (super.aClass5_Sub50_31.aClass12_Sub16_2.method3614() && Static490.method7028(super.aClass5_Sub50_31.aClass12_Sub16_2.method3616())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)I")
	public int method3089() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}
}
