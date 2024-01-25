import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "Lclient!ao;")
	protected final Class4_Sub1 aClass4_Sub1_28;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class2_Sub34(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass4_Sub1_28 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)I")
	public final int method4351() {
		return 1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
	public abstract void method4352();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!rj;Lclient!rj;)V")
	public abstract void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) Class124_Sub2 arg1, @OriginalArg(2) Class124_Sub2 arg2);

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Z")
	public final boolean method4354() {
		return this.aBoolean438;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()I")
	public int method4355() {
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	public abstract void method4356(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public abstract void method4357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Z")
	public final boolean method4358() {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()Z")
	public abstract boolean method4359();

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()Z")
	public abstract boolean method4360();
}
