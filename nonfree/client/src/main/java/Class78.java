import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class78 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	public int anInt3807;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public int anInt3809;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	public int anInt3813;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	public int anInt3814;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public int anInt3817;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	protected Class78() {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public abstract void method3014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public abstract void method3017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
