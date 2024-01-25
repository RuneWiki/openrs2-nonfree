import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class108 {

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public final int anInt3578;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Z")
	public final boolean aBoolean276;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public final int anInt3577;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public final int anInt3575;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public final int anInt3579;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	public final int anInt3576;

	static {
		new Class175(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3578 = arg3;
		this.aBoolean276 = arg10;
		this.aByte46 = (byte) arg8;
		this.aShort104 = (short) arg6;
		this.anInt3577 = arg2;
		this.anInt3575 = arg0;
		this.aByte47 = (byte) arg7;
		this.aShort106 = (short) arg5;
		this.aShort105 = (short) arg4;
		this.anInt3579 = arg1;
		this.anInt3576 = arg11;
	}
}
