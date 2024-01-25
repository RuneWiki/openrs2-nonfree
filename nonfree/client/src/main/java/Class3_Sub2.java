import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	public int anInt6123;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	public int anInt6121;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "B")
	public byte aByte89;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	public int anInt6119;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	public int anInt6120;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Z")
	public final boolean aBoolean425;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort87 = (short) arg5;
		this.aShort88 = (short) arg7;
		this.aShort86 = (short) arg6;
		this.aByte88 = arg9;
		this.anInt6121 = arg3;
		this.aByte89 = (byte) arg0;
		this.anInt6119 = arg1;
		this.aShort85 = (short) arg4;
		this.anInt6120 = arg2;
		this.aBoolean425 = arg8;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I")
	public abstract int method4916();

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
	public void method4918() {
	}
}
