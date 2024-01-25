import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!is", name = "n", descriptor = "Z")
	public boolean aBoolean495;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "Lclient!vj;")
	protected final Class172_Sub2 aClass172_Sub2_28;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class3_Sub21(@OriginalArg(0) Class172_Sub2 arg0) {
		this.aClass172_Sub2_28 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)Z")
	public abstract boolean method4520();

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I")
	public int method4521() {
		return 0;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(B)Z")
	public final boolean method4522() {
		return false;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)Z")
	public abstract boolean method4523();

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V")
	public abstract void method4524(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(B)Z")
	public final boolean method4525() {
		return this.aBoolean495;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public abstract void method4527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
	public abstract void method4528();

	@OriginalMember(owner = "client!is", name = "g", descriptor = "(I)I")
	public final int method4529() {
		return 1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!mf;Lclient!mf;I)V")
	public abstract void method4530(@OriginalArg(1) Class112_Sub2 arg0, @OriginalArg(2) Class112_Sub2 arg1, @OriginalArg(3) int arg2);
}
