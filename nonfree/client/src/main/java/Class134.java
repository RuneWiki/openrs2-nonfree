import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public abstract class Class134 {

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
	public final int anInt9223;

	@OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
	protected final int anInt9224;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
	public final int anInt9222;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(III)V")
	protected Class134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9223 = arg0;
		this.anInt9224 = arg2;
		this.anInt9222 = arg1;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIB)V")
	public abstract void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V")
	public abstract void method8051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(III)V")
	public abstract void method8052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
