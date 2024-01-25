import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class12_Sub15 extends Class12 {

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub15(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		return Static350.method5316(super.aClass5_Sub50_31.aClass12_Sub16_2.method3616()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I")
	public int method3450() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (super.aClass5_Sub50_31.aClass12_Sub16_2.method3614() && !Static350.method5316(super.aClass5_Sub50_31.aClass12_Sub16_2.method3616())) {
			super.anInt10229 = 0;
		}
		if (super.anInt10229 < 0 || super.anInt10229 > 1) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)Z")
	public boolean method3452() {
		return Static350.method5316(super.aClass5_Sub50_31.aClass12_Sub16_2.method3616());
	}
}
