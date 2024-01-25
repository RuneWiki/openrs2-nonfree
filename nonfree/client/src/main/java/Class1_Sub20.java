import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "Z")
	public boolean aBoolean655;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "Lclient!h;")
	protected final Class32_Sub2 aClass32_Sub2_42;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class1_Sub20(@OriginalArg(0) Class32_Sub2 arg0) {
		this.aClass32_Sub2_42 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "()I")
	public int method5565() {
		return 0;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)I")
	public final int method5566() {
		return 1;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "()V")
	public abstract void method5567();

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "()Z")
	public abstract boolean method5568();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	public abstract void method5569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z")
	public final boolean method5570() {
		return this.aBoolean655;
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "()Z")
	public abstract boolean method5571();

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	public abstract void method5572(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)Z")
	public final boolean method5573() {
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!bj;Lclient!bj;)V")
	public abstract void method5574(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(2) Class20_Sub1 arg2);
}
