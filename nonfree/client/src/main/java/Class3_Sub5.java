import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Z")
	public boolean aBoolean466 = false;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Z")
	public boolean aBoolean467 = false;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "S")
	public final short aShort82;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	protected int anInt6616;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	protected int anInt6620;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	protected final int anInt6617;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aShort82 = (short) arg3;
		this.aBoolean466 = arg4;
		this.anInt6616 = arg0;
		this.aBoolean467 = arg5;
		this.anInt6620 = arg2;
		this.anInt6617 = arg1;
	}
}
