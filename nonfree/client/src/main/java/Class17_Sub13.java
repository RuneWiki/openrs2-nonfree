import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class17_Sub13 extends Class17 {

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub13(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)I")
	public int method4987() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}
}
