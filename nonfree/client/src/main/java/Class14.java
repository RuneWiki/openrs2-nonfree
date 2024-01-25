import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class Class14 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!rd;")
	protected final Class3_Sub41 aClass3_Sub41_31;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	protected int anInt10805;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass3_Sub41_31 = arg0;
		this.anInt10805 = this.method8910();
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		this.anInt10805 = arg0;
		this.aClass3_Sub41_31 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public abstract void method8906();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public final void method8907(@OriginalArg(1) int arg0) {
		if (this.method8912(arg0) != 3) {
			this.method8909(arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	protected abstract void method8909(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
	protected abstract int method8910();

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)I")
	public abstract int method8912(@OriginalArg(0) int arg0);
}
