import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
	public int anInt6890;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "Z")
	public final boolean aBoolean612;

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
	public int anInt6893;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
	public int anInt6886;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
	public int anInt6888;

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort87 = (short) arg7;
		this.aBoolean612 = arg8;
		this.anInt6893 = (short) arg1;
		this.aShort90 = (short) arg6;
		this.aByte77 = (byte) arg0;
		this.aShort89 = (short) arg4;
		this.aShort88 = (short) arg5;
		this.anInt6886 = (short) arg2;
		this.anInt6888 = (short) arg3;
		this.aByte76 = arg9;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(Z)I")
	public abstract int method5766();

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
	public void method5767() {
	}
}
