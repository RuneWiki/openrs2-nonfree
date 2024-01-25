import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
	public int anInt6334;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	public int anInt6339;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "Z")
	public final boolean aBoolean423;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int anInt6335;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "B")
	public byte aByte90;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class44_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt6339 = (short) arg3;
		this.aShort89 = (short) arg6;
		this.aByte91 = arg9;
		this.aBoolean423 = arg8;
		this.anInt6340 = (short) arg1;
		this.anInt6335 = (short) arg2;
		this.aShort87 = (short) arg5;
		this.aShort90 = (short) arg4;
		this.aByte90 = (byte) arg0;
		this.aShort88 = (short) arg7;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I")
	public abstract int method5784();

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
	public void method5789() {
	}
}
