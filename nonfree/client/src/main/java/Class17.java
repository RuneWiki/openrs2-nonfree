import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public abstract class Class17 {

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "Lclient!es;")
	protected final Class5_Sub19 aClass5_Sub19_31;

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
	protected int anInt10866;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17(@OriginalArg(0) Class5_Sub19 arg0) {
		this.aClass5_Sub19_31 = arg0;
		this.anInt10866 = this.method9173();
	}

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		this.aClass5_Sub19_31 = arg1;
		this.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V")
	public abstract void method9168();

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(II)I")
	public abstract int method9169(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(BI)V")
	public final void method9170(@OriginalArg(1) int arg0) {
		if (this.method9169(arg0) != 3) {
			this.method9172(arg0);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZ)V")
	protected abstract void method9172(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)I")
	protected abstract int method9173();
}
