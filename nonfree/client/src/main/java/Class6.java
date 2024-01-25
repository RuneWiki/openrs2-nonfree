import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public abstract class Class6 {

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "Lclient!hs;")
	protected final Class5_Sub25 aClass5_Sub25_32;

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
	protected int anInt9925;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6(@OriginalArg(0) Class5_Sub25 arg0) {
		this.aClass5_Sub25_32 = arg0;
		this.anInt9925 = this.method8535();
	}

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		this.anInt9925 = arg0;
		this.aClass5_Sub25_32 = arg1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
	protected abstract int method8535();

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)I")
	public abstract int method8536(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
	public abstract void method8537();

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IB)V")
	protected abstract void method8538(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)V")
	public final void method8539(@OriginalArg(0) int arg0) {
		if (this.method8536(arg0) != 3) {
			this.method8538(arg0);
		}
	}
}
