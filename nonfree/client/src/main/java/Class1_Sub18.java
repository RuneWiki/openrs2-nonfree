import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Z")
	public boolean aBoolean253;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()Z")
	public abstract boolean method2870();

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I")
	public final int method2871() {
		return 1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
	public abstract void method2872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	public abstract void method2873(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Z")
	public final boolean method2874() {
		return false;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z")
	public final boolean method2875() {
		return false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()Z")
	public abstract boolean method2876();

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()I")
	public int method2877() {
		return 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public abstract void method2878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	public abstract void method2879();

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Z")
	public final boolean method2880() {
		return this.aBoolean253;
	}
}
