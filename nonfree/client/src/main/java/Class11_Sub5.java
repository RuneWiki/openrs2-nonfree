import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	public int anInt7513;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "Z")
	public final boolean aBoolean553;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public int anInt7515;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public int anInt7511;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
	public int anInt7514;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class11_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean553 = arg8;
		this.anInt7515 = arg3;
		this.aShort95 = (short) arg4;
		this.aByte100 = (byte) arg0;
		this.aByte101 = arg9;
		this.anInt7511 = arg2;
		this.aShort94 = (short) arg5;
		this.aShort92 = (short) arg7;
		this.aShort93 = (short) arg6;
		this.anInt7514 = arg1;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V")
	public void method6040() {
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)I")
	public abstract int method6044();
}
