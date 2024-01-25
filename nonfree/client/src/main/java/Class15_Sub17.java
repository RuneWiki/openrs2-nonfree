import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class15_Sub17 extends Class15 {

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub17(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		super.anInt11276 = this.method9419();
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)I")
	public int method6666() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return super.aClass3_Sub55_32.method8892() ? 1 : 0;
	}
}
