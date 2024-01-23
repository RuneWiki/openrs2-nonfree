import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!om", name = "A", descriptor = "Z")
	public boolean aBoolean359;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	public abstract void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Z")
	public final boolean method4321() {
		return this.aBoolean359;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public abstract void method4322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)Z")
	public final boolean method4323() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)I")
	public final int method4324() {
		return 1;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)Z")
	public final boolean method4325() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()I")
	public int method4328() {
		return 0;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
	public abstract void method4329();

	@OriginalMember(owner = "client!om", name = "c", descriptor = "()Z")
	public abstract boolean method4330();

	@OriginalMember(owner = "client!om", name = "d", descriptor = "()Z")
	public abstract boolean method4331();

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
	public abstract void method4332(@OriginalArg(0) int arg0);
}
