import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
	public int anInt6430;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "Z")
	public final boolean aBoolean563;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
	public int anInt6428;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "B")
	public byte aByte90;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	public int anInt6437;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "B")
	public final byte aByte89;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt6430 = arg3;
		this.aBoolean563 = arg8;
		this.anInt6428 = arg1;
		this.aShort103 = (short) arg4;
		this.aShort101 = (short) arg6;
		this.aShort100 = (short) arg5;
		this.aByte90 = (byte) arg0;
		this.aShort102 = (short) arg7;
		this.anInt6437 = arg2;
		this.aByte89 = arg9;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)I")
	public abstract int method5184();

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
	public void method5185() {
	}
}
