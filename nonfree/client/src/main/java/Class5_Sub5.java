import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Z")
	public boolean aBoolean587 = false;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
	public boolean aBoolean586 = false;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	protected int anInt6517;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	protected final int anInt6522;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	protected int anInt6520;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6517 = arg2;
		this.aBoolean586 = arg4;
		this.anInt6522 = arg1;
		this.aBoolean587 = arg3;
		this.anInt6520 = arg0;
	}
}
