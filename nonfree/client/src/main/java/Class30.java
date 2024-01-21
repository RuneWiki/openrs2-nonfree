import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class Class30 {

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
	public final int anInt3269;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
	public final int anInt3273;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
	protected final int anInt3274;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(III)V")
	protected Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3269 = arg0;
		this.anInt3273 = arg1;
		this.anInt3274 = arg2;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)V")
	public abstract void method2384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)V")
	public abstract void method2390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)V")
	public abstract void method2391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
