import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!js", name = "i", descriptor = "Z")
	public boolean aBoolean382 = false;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Z")
	public boolean aBoolean383 = false;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	protected int anInt4795;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "I")
	protected int anInt4794;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "I")
	protected final int anInt4799;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class10_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4795 = arg0;
		this.aBoolean382 = arg4;
		this.anInt4794 = arg2;
		this.aBoolean383 = arg3;
		this.anInt4799 = arg1;
	}
}
