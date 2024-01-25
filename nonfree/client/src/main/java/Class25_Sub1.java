import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	public int anInt6082;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public int anInt6077;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public int anInt6085;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "Z")
	public final boolean aBoolean557;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public int anInt6080;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt6077 = (short) arg3;
		this.aShort89 = (short) arg6;
		this.aShort90 = (short) arg7;
		this.anInt6085 = (short) arg2;
		this.aBoolean557 = arg8;
		this.aByte69 = arg9;
		this.aByte70 = (byte) arg0;
		this.anInt6080 = (short) arg1;
		this.aShort87 = (short) arg5;
		this.aShort88 = (short) arg4;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)I")
	public abstract int method5239();

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
	public void method5241() {
	}
}
