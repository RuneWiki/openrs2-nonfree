import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class15_Sub5 extends Class15 {

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
	public boolean aBoolean609 = false;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	protected final int anInt8442;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	protected int anInt8441;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	protected int anInt8440;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class15_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aShort107 = (short) arg3;
		this.anInt8442 = arg1;
		this.aBoolean609 = arg5;
		this.anInt8441 = arg2;
		this.anInt8440 = arg0;
		this.aBoolean608 = arg4;
	}
}
