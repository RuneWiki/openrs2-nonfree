import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class42 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public int anInt3589;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public int anInt3591;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	public int anInt3592;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public int anInt3593;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	public int anInt3597;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	protected Class42() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public abstract void method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public abstract void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
