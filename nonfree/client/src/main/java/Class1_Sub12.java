import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
	public boolean aBoolean150;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
	public abstract void method1360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public abstract void method1361(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()Z")
	public abstract boolean method1362();

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Z")
	public final boolean method1363() {
		return this.aBoolean150;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()I")
	public int method1365() {
		return 0;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()Z")
	public abstract boolean method1368();

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	public abstract void method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Z")
	public final boolean method1370() {
		return false;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I")
	public final int method1371() {
		return 1;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
	public abstract void method1372();

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Z")
	public final boolean method1373() {
		return false;
	}
}
