import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class Class47 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	protected final int anInt10093;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
	public final int anInt10096;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	public final int anInt10094;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V")
	protected Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10093 = arg2;
		this.anInt10096 = arg1;
		this.anInt10094 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public abstract void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)V")
	public abstract void method8414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)V")
	public abstract void method8416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
