import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
	public int anInt8495;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
	public int anInt8493;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
	public int anInt8494;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "Z")
	public final boolean aBoolean613;

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "S")
	public short aShort111;

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
	public int anInt8492;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "B")
	public byte aByte91;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt8493 = arg3;
		this.anInt8494 = arg2;
		this.aShort108 = (short) arg7;
		this.aBoolean613 = arg8;
		this.aShort111 = (short) arg5;
		this.anInt8492 = arg1;
		this.aByte91 = (byte) arg0;
		this.aShort110 = (short) arg4;
		this.aShort109 = (short) arg6;
		this.aByte90 = arg9;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)I")
	public abstract int method6864();

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)V")
	public void method6865() {
	}
}
