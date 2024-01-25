import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class Class12 {

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "Lclient!sf;")
	protected final Class5_Sub50 aClass5_Sub50_31;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
	protected int anInt10229;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12(@OriginalArg(0) Class5_Sub50 arg0) {
		this.aClass5_Sub50_31 = arg0;
		this.anInt10229 = this.method8468();
	}

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		this.aClass5_Sub50_31 = arg1;
		this.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	public final void method8467(@OriginalArg(0) int arg0) {
		if (this.method8473(arg0) != 3) {
			this.method8470(arg0);
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)I")
	protected abstract int method8468();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V")
	protected abstract void method8470(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
	public abstract void method8472();

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(II)I")
	public abstract int method8473(@OriginalArg(0) int arg0);
}
