import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Z")
	public boolean aBoolean500 = false;

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "Z")
	public boolean aBoolean501 = false;

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
	protected int anInt7423;

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
	protected final int anInt7422;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
	protected int anInt7415;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class26_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean501 = arg5;
		this.aBoolean500 = arg4;
		this.anInt7423 = arg0;
		this.anInt7422 = arg1;
		this.aShort107 = (short) arg3;
		this.anInt7415 = arg2;
	}
}
