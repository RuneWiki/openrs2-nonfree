import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class Class43 {

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public int anInt5708;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public int anInt5709;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public int anInt5710;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public int anInt5711;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	public int anInt5712;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "I")
	public int anInt5713;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	protected Class43() {
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	public abstract void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public abstract void method4300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
