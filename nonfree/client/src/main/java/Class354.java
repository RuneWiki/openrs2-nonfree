import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class354 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
	public final int anInt9405;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	public final int anInt9407;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "S")
	public final short aShort121;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "B")
	public final byte aByte123;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "B")
	public final byte aByte122;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Z")
	public final boolean aBoolean691;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt9405 = arg10;
		this.aShort122 = (short) arg5;
		this.anInt9407 = arg0;
		this.aShort121 = (short) arg4;
		this.aByte123 = (byte) arg7;
		this.aByte122 = (byte) arg8;
		this.aBoolean691 = arg9;
		this.aShort123 = (short) arg6;
	}
}
