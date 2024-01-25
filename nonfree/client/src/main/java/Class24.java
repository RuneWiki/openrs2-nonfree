import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public abstract class Class24 {

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "Lclient!hia;")
	protected final Class5_Sub20 aClass5_Sub20_30;

	@OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
	protected int anInt10335;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24(@OriginalArg(0) Class5_Sub20 arg0) {
		this.aClass5_Sub20_30 = arg0;
		this.anInt10335 = this.method8881();
	}

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		this.anInt10335 = arg0;
		this.aClass5_Sub20_30 = arg1;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)V")
	public abstract void method8874();

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)V")
	public final void method8877(@OriginalArg(0) int arg0) {
		if (this.method8884(arg0) != 3) {
			this.method8880(arg0);
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(II)V")
	protected abstract void method8880(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(Z)I")
	protected abstract int method8881();

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(IB)I")
	public abstract int method8884(@OriginalArg(0) int arg0);
}
