import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class Class8_Sub10 extends Class8 {

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()I")
	public int method1321() {
		return 0;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
	public abstract void method1322();

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Z")
	public final boolean method1323() {
		return this.aBoolean128;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public abstract void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(Z)Z")
	public final boolean method1327() {
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
	public abstract void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z")
	public final boolean method1332() {
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "()Z")
	public abstract boolean method1333();

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "()Z")
	public abstract boolean method1336();

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)I")
	public final int method1337() {
		return 1;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	public abstract void method1338(@OriginalArg(0) int arg0);
}
