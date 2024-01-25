import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class11_Sub30 extends Class11 {

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub30(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return super.aClass2_Sub30_32.method2981().method7166() ? 3 : 2;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)I")
	public int method9623() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.anInt11012 < 1 || super.anInt11012 > 3) {
			super.anInt11012 = this.method9617();
		}
	}
}
