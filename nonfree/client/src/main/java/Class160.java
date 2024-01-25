import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public abstract class Class160 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
	public final int anInt9562;

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
	public final int anInt9565;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
	protected final int anInt9564;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(III)V")
	protected Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9562 = arg1;
		this.anInt9565 = arg0;
		this.anInt9564 = arg2;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIB)V")
	public abstract void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZI)V")
	public abstract void method8041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)V")
	public abstract void method8042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
