import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class17_Sub11 extends Class17 {

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub11(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return super.aClass5_Sub19_31.method2556().method1523() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (super.anInt10866 < 0 && super.anInt10866 > 4) {
			super.anInt10866 = this.method9173();
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)I")
	public int method4285() {
		return super.anInt10866;
	}
}
