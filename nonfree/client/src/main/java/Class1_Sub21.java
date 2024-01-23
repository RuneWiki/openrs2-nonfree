import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "Z")
	public boolean aBoolean249;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z")
	public final boolean method2723() {
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)Z")
	public final boolean method2725() {
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V")
	public abstract void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
	public abstract void method2728(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "()V")
	public abstract void method2729();

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "()Z")
	public abstract boolean method2730();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public abstract void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)Z")
	public final boolean method2733() {
		return this.aBoolean249;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "()I")
	public int method2734() {
		return 0;
	}

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)I")
	public final int method2735() {
		return 1;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "()Z")
	public abstract boolean method2736();
}
