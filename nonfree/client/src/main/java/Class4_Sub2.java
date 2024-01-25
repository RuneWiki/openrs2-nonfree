import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public int anInt7112;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
	public int anInt7117;

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Z")
	public final boolean aBoolean603;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	public int anInt7109;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "B")
	public byte aByte92;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public int anInt7111;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt7117 = arg1;
		this.aShort88 = (short) arg4;
		this.aBoolean603 = arg8;
		this.anInt7109 = arg2;
		this.aShort89 = (short) arg6;
		this.aShort86 = (short) arg7;
		this.aByte91 = arg9;
		this.aByte92 = (byte) arg0;
		this.anInt7111 = arg3;
		this.aShort87 = (short) arg5;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I")
	public abstract int method5562();

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
	public void method5564() {
	}
}
