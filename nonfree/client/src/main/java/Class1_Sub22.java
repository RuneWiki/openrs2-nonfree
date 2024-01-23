import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Z")
	public boolean aBoolean250;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()Z")
	public abstract boolean method3720();

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Z")
	public final boolean method3721() {
		return false;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "()I")
	public int method3722() {
		return 0;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
	public abstract void method3723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
	public abstract void method3725();

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
	public abstract void method3727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z")
	public final boolean method3728() {
		return false;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	public abstract void method3729(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z")
	public final boolean method3730() {
		return this.aBoolean250;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "()Z")
	public abstract boolean method3731();

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)I")
	public final int method3733() {
		return 1;
	}
}
