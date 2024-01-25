import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public abstract class Class6 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Lclient!fca;")
	protected final Class3_Sub22 aClass3_Sub22_31;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
	protected int anInt10233;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aClass3_Sub22_31 = arg0;
		this.anInt10233 = this.method8962();
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		this.anInt10233 = arg0;
		this.aClass3_Sub22_31 = arg1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IB)I")
	public abstract int method8960(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(IB)V")
	protected abstract void method8961(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I")
	protected abstract int method8962();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V")
	public abstract void method8964();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)V")
	public final void method8965(@OriginalArg(1) int arg0) {
		if (this.method8960(arg0) != 3) {
			this.method8961(arg0);
		}
	}
}
