import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public int anInt5768;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Z")
	public final boolean aBoolean440;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	public int anInt5769;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	public int anInt5766;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
	public int anInt5774;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean440 = arg8;
		this.anInt5769 = (short) arg2;
		this.aByte73 = (byte) arg0;
		this.anInt5766 = (short) arg3;
		this.aByte74 = arg9;
		this.aShort88 = (short) arg5;
		this.anInt5774 = (short) arg1;
		this.aShort89 = (short) arg4;
		this.aShort87 = (short) arg6;
		this.aShort90 = (short) arg7;
	}

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)V")
	public void method5188() {
	}

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "(I)I")
	public abstract int method5191();
}
