import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class Class7 {

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!qea;")
	protected final Class3_Sub41 aClass3_Sub41_31;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	protected int anInt10115;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass3_Sub41_31 = arg0;
		this.anInt10115 = this.method8572();
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		this.anInt10115 = arg0;
		this.aClass3_Sub41_31 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
	protected abstract int method8572();

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I")
	public abstract int method8573(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public final void method8574(@OriginalArg(0) int arg0) {
		if (this.method8573(arg0) != 3) {
			this.method8576(arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public abstract void method8575();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V")
	protected abstract void method8576(@OriginalArg(1) int arg0);
}
