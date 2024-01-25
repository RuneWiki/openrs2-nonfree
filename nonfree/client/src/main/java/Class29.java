import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class Class29 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!fs;")
	protected final Class6_Sub22 aClass6_Sub22_31;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	protected int anInt10604;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29(@OriginalArg(0) Class6_Sub22 arg0) {
		this.aClass6_Sub22_31 = arg0;
		this.anInt10604 = this.method8997();
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		this.aClass6_Sub22_31 = arg1;
		this.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
	public abstract int method8994(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public abstract void method8995();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
	protected abstract int method8997();

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(II)V")
	public final void method8999(@OriginalArg(1) int arg0) {
		if (this.method8994(arg0) != 3) {
			this.method9000(arg0);
		}
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(II)V")
	protected abstract void method9000(@OriginalArg(0) int arg0);
}
