import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class Class4 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	protected final int anInt3067;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public final int anInt3069;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public final int anInt3072;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	protected Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3067 = arg2;
		this.anInt3069 = arg1;
		this.anInt3072 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)V")
	public abstract void method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)V")
	public abstract void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)V")
	public abstract void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
