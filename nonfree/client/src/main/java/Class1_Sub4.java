import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Z")
	public boolean aBoolean667 = false;

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "Z")
	public boolean aBoolean668 = false;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	protected final int anInt9270;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
	protected int anInt9271;

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "S")
	public final short aShort154;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
	protected int anInt9269;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9270 = arg1;
		this.anInt9271 = arg2;
		this.aBoolean668 = arg4;
		this.aShort154 = (short) arg3;
		this.anInt9269 = arg0;
		this.aBoolean667 = arg5;
	}
}
