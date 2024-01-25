import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class Class29 {

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public final int anInt5716;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	protected final int anInt5710;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public final int anInt5715;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
	protected Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5716 = arg1;
		this.anInt5710 = arg2;
		this.anInt5715 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)V")
	public abstract void method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIB)V")
	public abstract void method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public abstract void method5055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
