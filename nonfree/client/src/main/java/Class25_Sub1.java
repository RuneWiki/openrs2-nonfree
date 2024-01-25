import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
	public int anInt5776;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "S")
	public short aShort74;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
	public int anInt5772;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public int anInt5769;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
	public int anInt5773;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "Z")
	public final boolean aBoolean428;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "S")
	public short aShort73;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "B")
	public byte aByte62;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort74 = (short) arg7;
		this.aByte61 = arg9;
		this.anInt5772 = (short) arg2;
		this.aShort76 = (short) arg4;
		this.anInt5769 = (short) arg1;
		this.anInt5773 = (short) arg3;
		this.aBoolean428 = arg8;
		this.aShort73 = (short) arg5;
		this.aShort75 = (short) arg6;
		this.aByte62 = (byte) arg0;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public void method5095() {
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)I")
	public abstract int method5096();
}
