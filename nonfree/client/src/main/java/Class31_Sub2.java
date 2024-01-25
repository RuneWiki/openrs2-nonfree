import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	public int anInt7295;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	public int anInt7296;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	public int anInt7298;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Z")
	public final boolean aBoolean503;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	public int anInt7300;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class31_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort100 = (short) arg5;
		this.aByte101 = arg9;
		this.anInt7296 = arg2;
		this.anInt7298 = arg3;
		this.aShort102 = (short) arg6;
		this.aByte100 = (byte) arg0;
		this.aShort103 = (short) arg4;
		this.aBoolean503 = arg8;
		this.anInt7300 = arg1;
		this.aShort101 = (short) arg7;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V")
	public void method5975() {
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)I")
	public abstract int method5976();
}
