import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class12_Sub13 extends Class12 {

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub13(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)I")
	public int method3075() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return 2;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (super.aClass5_Sub50_31.aClass12_Sub24_1.method6853() && super.anInt10229 == 2) {
			super.anInt10229 = 1;
		}
		if (super.anInt10229 < 0 || super.anInt10229 > 2) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		return 1;
	}
}
