import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class Class15 {

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "Lclient!hb;")
	protected final Class6_Sub22 aClass6_Sub22_31;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
	protected int anInt10701;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15(@OriginalArg(0) Class6_Sub22 arg0) {
		this.aClass6_Sub22_31 = arg0;
		this.anInt10701 = this.method8986();
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		this.anInt10701 = arg0;
		this.aClass6_Sub22_31 = arg1;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
	public final void method8984(@OriginalArg(1) int arg0) {
		if (this.method8990(arg0) != 3) {
			this.method8985(arg0);
		}
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(II)V")
	protected abstract void method8985(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)I")
	protected abstract int method8986();

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V")
	public abstract void method8989();

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(II)I")
	public abstract int method8990(@OriginalArg(1) int arg0);
}
