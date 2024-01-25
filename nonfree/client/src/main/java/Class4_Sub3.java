import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Z")
	public boolean aBoolean428 = false;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	protected int anInt6071;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	protected final int anInt6066;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	protected int anInt6067;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6071 = arg0;
		this.aShort76 = (short) arg3;
		this.anInt6066 = arg1;
		this.aBoolean428 = arg5;
		this.anInt6067 = arg2;
	}
}
