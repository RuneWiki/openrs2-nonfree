import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Z")
	public boolean aBoolean433;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
	public abstract void method4321();

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z")
	public final boolean method4322() {
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z")
	public final boolean method4323() {
		return this.aBoolean433;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()Z")
	public abstract boolean method4324();

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()I")
	public int method4325() {
		return 0;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()Z")
	public abstract boolean method4326();

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
	public abstract void method4327(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Z")
	public final boolean method4328() {
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public abstract void method4329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
	public abstract void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)I")
	public final int method4331() {
		return 1;
	}
}
