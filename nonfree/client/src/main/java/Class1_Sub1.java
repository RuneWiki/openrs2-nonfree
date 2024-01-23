import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Z")
	public boolean aBoolean329;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public abstract void method3377(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()Z")
	public abstract boolean method3378();

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Z")
	public final boolean method3379() {
		return this.aBoolean329;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public abstract void method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)I")
	public final int method3384() {
		return 1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()I")
	public int method3385() {
		return 0;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Z")
	public final boolean method3386() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public abstract void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "()Z")
	public abstract boolean method3389();

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)Z")
	public final boolean method3390() {
		return false;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
	public abstract void method3392();
}
