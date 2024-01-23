import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class Class45 {

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	protected int anInt3465;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public int anInt3466;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	public int anInt3461;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V")
	protected Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3465 = arg2;
		this.anInt3466 = arg1;
		this.anInt3461 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
	public abstract void method2628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(BII)V")
	public abstract void method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	public abstract void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
