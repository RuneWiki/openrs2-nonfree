import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!es", name = "j", descriptor = "I")
	protected final int anInt7818;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "I")
	protected int anInt7821;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "I")
	protected int anInt7817;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "S")
	public final short aShort99;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class15_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean514 = arg5;
		this.anInt7818 = arg1;
		this.anInt7821 = arg0;
		this.anInt7817 = arg2;
		this.aShort99 = (short) arg3;
	}
}
