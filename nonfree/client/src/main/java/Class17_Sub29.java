import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class17_Sub29 extends Class17 {

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub29(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 0;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)I")
	public int method9175() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (super.aClass5_Sub19_31.aClass17_Sub24_2.method8103() && !Static277.method4476(125, super.aClass5_Sub19_31.aClass17_Sub24_2.method8102())) {
			super.anInt10866 = 0;
		}
		if (super.anInt10866 < 0 || super.anInt10866 > 2) {
			super.anInt10866 = this.method9173();
		}
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)Z")
	public boolean method9176() {
		return Static277.method4476(126, super.aClass5_Sub19_31.aClass17_Sub24_2.method8102());
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		return Static277.method4476(126, super.aClass5_Sub19_31.aClass17_Sub24_2.method8102()) ? 1 : 3;
	}
}
