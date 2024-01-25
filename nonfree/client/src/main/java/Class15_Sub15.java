import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nla")
public final class Class15_Sub15 extends Class15 {

	@OriginalMember(owner = "client!nla", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!nla", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub15(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nla", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 1;
	}

	@OriginalMember(owner = "client!nla", name = "c", descriptor = "(B)I")
	public int method6340() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.anInt11276 != 1 && super.anInt11276 != 0) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}
}
