import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class Class4 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!w;")
	protected final Class2_Sub54 aClass2_Sub54_31;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	protected int anInt10787;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4(@OriginalArg(0) Class2_Sub54 arg0) {
		this.aClass2_Sub54_31 = arg0;
		this.anInt10787 = this.method9221();
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		this.anInt10787 = arg0;
		this.aClass2_Sub54_31 = arg1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)I")
	protected abstract int method9221();

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I")
	public abstract int method9223(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public abstract void method9225();

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V")
	protected abstract void method9227(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)V")
	public final void method9228(@OriginalArg(1) int arg0) {
		if (this.method9223(arg0) != 3) {
			this.method9227(arg0);
		}
	}
}
