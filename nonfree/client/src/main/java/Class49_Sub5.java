import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class Class49_Sub5 extends Class49 {

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
	public boolean aBoolean536 = false;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	protected final int anInt7470;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	protected int anInt7464;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	protected int anInt7467;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class49_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean536 = arg5;
		this.aShort126 = (short) arg3;
		this.anInt7470 = arg1;
		this.anInt7464 = arg2;
		this.anInt7467 = arg0;
	}
}
