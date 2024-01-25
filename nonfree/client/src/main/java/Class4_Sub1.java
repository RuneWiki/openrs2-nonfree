import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	public int anInt9539;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
	public int anInt9540;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "B")
	public final byte aByte107;

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
	public int anInt9541;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "B")
	public byte aByte108;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
	public int anInt9542;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "Z")
	public final boolean aBoolean731;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt9540 = arg3;
		this.aByte107 = arg9;
		this.aShort125 = (short) arg6;
		this.aShort126 = (short) arg4;
		this.anInt9541 = arg2;
		this.aByte108 = (byte) arg0;
		this.aShort123 = (short) arg5;
		this.anInt9542 = arg1;
		this.aShort124 = (short) arg7;
		this.aBoolean731 = arg8;
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)I")
	public abstract int method7790();

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)V")
	public void method7792() {
	}
}
