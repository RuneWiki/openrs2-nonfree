import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Class33 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "I")
	public final int anInt3058;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	protected final int anInt3060;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public final int anInt3057;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V")
	protected Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3058 = arg0;
		this.anInt3060 = arg2;
		this.anInt3057 = arg1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	public abstract void method2267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
	public abstract void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
	public abstract void method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
