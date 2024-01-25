import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class15_Sub5 extends Class15 {

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub5(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
		Static678.method9266(super.anInt11276);
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
		Static678.method9266(super.anInt11276);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z")
	public boolean method2134() {
		return super.aClass3_Sub55_32.method8888().method4081() >= 96;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub55_32.method8888().method4081() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.aClass3_Sub55_32.method8888().method4081() < 96) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 2) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
		Static678.method9266(super.anInt11276);
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)I")
	public int method2135() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return super.aClass3_Sub55_32.method8888().method4081() < 96 ? 0 : 2;
	}
}
