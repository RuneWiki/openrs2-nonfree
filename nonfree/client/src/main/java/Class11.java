import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class Class11 {

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "Lclient!up;")
	protected final Class5_Sub46 aClass5_Sub46_30;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	protected int anInt10053;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11(@OriginalArg(0) Class5_Sub46 arg0) {
		this.aClass5_Sub46_30 = arg0;
		this.anInt10053 = this.method8535();
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		this.anInt10053 = arg0;
		this.aClass5_Sub46_30 = arg1;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)I")
	public abstract int method8533(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	public abstract void method8534();

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)I")
	protected abstract int method8535();

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)V")
	public final void method8537(@OriginalArg(0) int arg0) {
		if (this.method8533(arg0) != 3) {
			this.method8538(arg0);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)V")
	protected abstract void method8538(@OriginalArg(1) int arg0);
}
