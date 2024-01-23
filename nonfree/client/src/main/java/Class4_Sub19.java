import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "Z")
	public boolean aBoolean166;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	public abstract void method2125(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
	public abstract void method2127();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	public abstract void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "()Z")
	public abstract boolean method2130();

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "()I")
	public int method2132() {
		return 0;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIIII)V")
	public abstract void method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)I")
	public final int method2135() {
		return 1;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)Z")
	public final boolean method2136() {
		return this.aBoolean166;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)Z")
	public final boolean method2137() {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Z")
	public final boolean method2139() {
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "()Z")
	public abstract boolean method2140();
}
