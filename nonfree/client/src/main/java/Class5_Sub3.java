import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
	public boolean aBoolean341 = false;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Z")
	public boolean aBoolean340 = false;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "I")
	protected final int anInt5464;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	protected int anInt5466;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "I")
	protected int anInt5460;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5464 = arg1;
		this.aBoolean341 = arg4;
		this.anInt5466 = arg2;
		this.aBoolean340 = arg3;
		this.anInt5460 = arg0;
	}
}
